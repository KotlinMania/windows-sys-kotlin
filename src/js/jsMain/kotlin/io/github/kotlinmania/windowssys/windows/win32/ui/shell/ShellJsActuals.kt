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

private val _windowsWin32UiShellNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AssocCreate(clsid: GUID, riid: Long, ppv: Long): HRESULT =
    0

public actual fun AssocCreateForClasses(rgclasses: Long, cclasses: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocCreateForClasses(rgclasses.toString(), cclasses.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocGetDetailsOfPropKey(psf.toString(), pidl.toString(), pkey.toString(), pv.toString(), pffoundpropkey.toString()) as Int) else 0

public actual fun AssocGetPerceivedType(pszext: PCWSTR, ptype: Long, pflag: Long, ppsztype: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocGetPerceivedType(pszext.toString(), ptype.toString(), pflag.toString(), ppsztype.toString()) as Int) else 0

public actual fun AssocIsDangerous(pszassoc: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocIsDangerous(pszassoc.toString()) as Int) else 0

public actual fun AssocQueryKeyA(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCSTR, pszextra: PCSTR, phkeyout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocQueryKeyA(flags.toInt(), key, pszassoc.toString(), pszextra.toString(), phkeyout.toString()) as Int) else 0

public actual fun AssocQueryKeyW(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCWSTR, pszextra: PCWSTR, phkeyout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocQueryKeyW(flags.toInt(), key, pszassoc.toString(), pszextra.toString(), phkeyout.toString()) as Int) else 0

public actual fun AssocQueryStringA(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCSTR, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocQueryStringA(flags.toInt(), str, pszassoc.toString(), pszextra.toString(), pszout.toString(), pcchout.toString()) as Int) else 0

public actual fun AssocQueryStringByKeyA(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocQueryStringByKeyA(flags.toInt(), str, hkassoc.toString(), pszextra.toString(), pszout.toString(), pcchout.toString()) as Int) else 0

public actual fun AssocQueryStringByKeyW(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocQueryStringByKeyW(flags.toInt(), str, hkassoc.toString(), pszextra.toString(), pszout.toString(), pcchout.toString()) as Int) else 0

public actual fun AssocQueryStringW(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCWSTR, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_AssocQueryStringW(flags.toInt(), str, pszassoc.toString(), pszextra.toString(), pszout.toString(), pcchout.toString()) as Int) else 0

public actual fun CDefFolderMenu_Create2(pidlfolder: Long, hwnd: HWND, cidl: UInt, apidl: Long, psf: Long, pfn: LPFNDFMCALLBACK, nkeys: UInt, ahkeys: Long, ppcm: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_CDefFolderMenu_Create2(pidlfolder.toString(), hwnd.toString(), cidl.toInt(), apidl.toString(), psf.toString(), pfn.toLong().toString(), nkeys.toInt(), ahkeys.toString(), ppcm.toString()) as Int) else 0

public actual fun CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: UInt, apidl: Long, ppdtobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_CIDLData_CreateFromIDArray(pidlfolder.toString(), cidl.toInt(), apidl.toString(), ppdtobj.toString()) as Int) else 0

public actual fun ChrCmpIA(w1: UShort, w2: UShort): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ChrCmpIA(w1.toInt(), w2.toInt()) as Int) else 0

public actual fun ChrCmpIW(w1: UShort, w2: UShort): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ChrCmpIW(w1.toInt(), w2.toInt()) as Int) else 0

public actual fun ColorAdjustLuma(clrrgb: COLORREF, n: Int, fscale: BOOL): COLORREF =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ColorAdjustLuma(clrrgb.toInt(), n, fscale) as Int).toUInt() else 0u

public actual fun ColorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): COLORREF =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ColorHLSToRGB(whue.toInt(), wluminance.toInt(), wsaturation.toInt()) as Int).toUInt() else 0u

public actual fun ColorRGBToHLS(clrrgb: COLORREF, pwhue: Long, pwluminance: Long, pwsaturation: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ColorRGBToHLS(clrrgb.toInt(), pwhue.toString(), pwluminance.toString(), pwsaturation.toString())
    }
}

public actual fun CommandLineToArgvW(lpcmdline: PCWSTR, pnumargs: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_CommandLineToArgvW(lpcmdline.toString(), pnumargs.toString()) as String).toLong() else 0L

public actual fun ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: BOOL, punktarget: Long, pdwcookie: Long, ppcpout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ConnectToConnectionPoint(punk.toString(), riidevent.toString(), fconnect, punktarget.toString(), pdwcookie.toString(), ppcpout.toString()) as Int) else 0

public actual fun CreateProfile(pszusersid: PCWSTR, pszusername: PCWSTR, pszprofilepath: PWSTR, cchprofilepath: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_CreateProfile(pszusersid.toString(), pszusername.toString(), pszprofilepath.toString(), cchprofilepath.toInt()) as Int) else 0

public actual fun DAD_AutoScroll(hwnd: HWND, pad: Long, pptnow: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DAD_AutoScroll(hwnd.toString(), pad.toString(), pptnow.toString()) as Int) else 0

public actual fun DAD_DragEnterEx(hwndtarget: HWND, ptstart: POINT): BOOL =
    0

public actual fun DAD_DragEnterEx2(hwndtarget: HWND, ptstart: POINT, pdtobject: Long): BOOL =
    0

public actual fun DAD_DragLeave(): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DAD_DragLeave() as Int) else 0

public actual fun DAD_DragMove(pt: POINT): BOOL =
    0

public actual fun DAD_SetDragImage(him: HIMAGELIST, pptoffset: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DAD_SetDragImage(him.toString(), pptoffset.toString()) as Int) else 0

public actual fun DAD_ShowDragImage(fshow: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DAD_ShowDragImage(fshow) as Int) else 0

public actual fun DefSubclassProc(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DefSubclassProc(hwnd.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DeleteProfileA(lpsidstring: PCSTR, lpprofilepath: PCSTR, lpcomputername: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DeleteProfileA(lpsidstring.toString(), lpprofilepath.toString(), lpcomputername.toString()) as Int) else 0

public actual fun DeleteProfileW(lpsidstring: PCWSTR, lpprofilepath: PCWSTR, lpcomputername: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DeleteProfileW(lpsidstring.toString(), lpprofilepath.toString(), lpcomputername.toString()) as Int) else 0

public actual fun DoEnvironmentSubstA(pszsrc: PSTR, cchsrc: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DoEnvironmentSubstA(pszsrc.toString(), cchsrc.toInt()) as Int).toUInt() else 0u

public actual fun DoEnvironmentSubstW(pszsrc: PWSTR, cchsrc: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DoEnvironmentSubstW(pszsrc.toString(), cchsrc.toInt()) as Int).toUInt() else 0u

public actual fun DragAcceptFiles(hwnd: HWND, faccept: BOOL) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DragAcceptFiles(hwnd.toString(), faccept)
    }
}

public actual fun DragFinish(hdrop: HDROP) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DragFinish(hdrop.toString())
    }
}

public actual fun DragQueryFileA(hdrop: HDROP, ifile: UInt, lpszfile: PSTR, cch: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DragQueryFileA(hdrop.toString(), ifile.toInt(), lpszfile.toString(), cch.toInt()) as Int).toUInt() else 0u

public actual fun DragQueryFileW(hdrop: HDROP, ifile: UInt, lpszfile: PWSTR, cch: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DragQueryFileW(hdrop.toString(), ifile.toInt(), lpszfile.toString(), cch.toInt()) as Int).toUInt() else 0u

public actual fun DragQueryPoint(hdrop: HDROP, ppt: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DragQueryPoint(hdrop.toString(), ppt.toString()) as Int) else 0

public actual fun DriveType(idrive: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DriveType(idrive) as Int) else 0

public actual fun DuplicateIcon(hinst: HINSTANCE, hicon: HICON): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_DuplicateIcon(hinst.toString(), hicon.toString()) as String).toLong() else 0L

public actual fun ExtractAssociatedIconA(hinst: HINSTANCE, psziconpath: PSTR, piicon: Long): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractAssociatedIconA(hinst.toString(), psziconpath.toString(), piicon.toString()) as String).toLong() else 0L

public actual fun ExtractAssociatedIconExA(hinst: HINSTANCE, psziconpath: PSTR, piiconindex: Long, piiconid: Long): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractAssociatedIconExA(hinst.toString(), psziconpath.toString(), piiconindex.toString(), piiconid.toString()) as String).toLong() else 0L

public actual fun ExtractAssociatedIconExW(hinst: HINSTANCE, psziconpath: PWSTR, piiconindex: Long, piiconid: Long): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractAssociatedIconExW(hinst.toString(), psziconpath.toString(), piiconindex.toString(), piiconid.toString()) as String).toLong() else 0L

public actual fun ExtractAssociatedIconW(hinst: HINSTANCE, psziconpath: PWSTR, piicon: Long): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractAssociatedIconW(hinst.toString(), psziconpath.toString(), piicon.toString()) as String).toLong() else 0L

public actual fun ExtractIconA(hinst: HINSTANCE, pszexefilename: PCSTR, niconindex: UInt): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractIconA(hinst.toString(), pszexefilename.toString(), niconindex.toInt()) as String).toLong() else 0L

public actual fun ExtractIconExA(lpszfile: PCSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractIconExA(lpszfile.toString(), niconindex, phiconlarge.toString(), phiconsmall.toString(), nicons.toInt()) as Int).toUInt() else 0u

public actual fun ExtractIconExW(lpszfile: PCWSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractIconExW(lpszfile.toString(), niconindex, phiconlarge.toString(), phiconsmall.toString(), nicons.toInt()) as Int).toUInt() else 0u

public actual fun ExtractIconW(hinst: HINSTANCE, pszexefilename: PCWSTR, niconindex: UInt): HICON =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ExtractIconW(hinst.toString(), pszexefilename.toString(), niconindex.toInt()) as String).toLong() else 0L

public actual fun FindExecutableA(lpfile: PCSTR, lpdirectory: PCSTR, lpresult: PSTR): HINSTANCE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_FindExecutableA(lpfile.toString(), lpdirectory.toString(), lpresult.toString()) as String).toLong() else 0L

public actual fun FindExecutableW(lpfile: PCWSTR, lpdirectory: PCWSTR, lpresult: PWSTR): HINSTANCE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_FindExecutableW(lpfile.toString(), lpdirectory.toString(), lpresult.toString()) as String).toLong() else 0L

public actual fun GetAcceptLanguagesA(pszlanguages: PSTR, pcchlanguages: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetAcceptLanguagesA(pszlanguages.toString(), pcchlanguages.toString()) as Int) else 0

public actual fun GetAcceptLanguagesW(pszlanguages: PWSTR, pcchlanguages: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetAcceptLanguagesW(pszlanguages.toString(), pcchlanguages.toString()) as Int) else 0

public actual fun GetAllUsersProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryA(lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetAllUsersProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryW(lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetCurrentProcessExplicitAppUserModelID(appid: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetCurrentProcessExplicitAppUserModelID(appid.toString()) as Int) else 0

public actual fun GetDefaultUserProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryA(lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetDefaultUserProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryW(lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetDpiForShellUIComponent(param0: SHELL_UI_COMPONENT): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetDpiForShellUIComponent(param0) as Int).toUInt() else 0u

public actual fun GetFileNameFromBrowse(hwnd: HWND, pszfilepath: PWSTR, cchfilepath: UInt, pszworkingdir: PCWSTR, pszdefext: PCWSTR, pszfilters: PCWSTR, psztitle: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetFileNameFromBrowse(hwnd.toString(), pszfilepath.toString(), cchfilepath.toInt(), pszworkingdir.toString(), pszdefext.toString(), pszfilters.toString(), psztitle.toString()) as Int) else 0

public actual fun GetMenuContextHelpId(param0: HMENU): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetMenuContextHelpId(param0.toString()) as Int).toUInt() else 0u

public actual fun GetMenuPosFromID(hmenu: HMENU, id: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetMenuPosFromID(hmenu.toString(), id.toInt()) as Int) else 0

public actual fun GetProfileType(dwflags: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetProfileType(dwflags.toString()) as Int) else 0

public actual fun GetProfilesDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetProfilesDirectoryA(lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetProfilesDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetProfilesDirectoryW(lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetScaleFactorForDevice(devicetype: DISPLAY_DEVICE_TYPE): DEVICE_SCALE_FACTOR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetScaleFactorForDevice(devicetype) as Int) else 0

public actual fun GetScaleFactorForMonitor(hmon: HMONITOR, pscale: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetScaleFactorForMonitor(hmon.toString(), pscale.toString()) as Int) else 0

public actual fun GetUserProfileDirectoryA(htoken: HANDLE, lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetUserProfileDirectoryA(htoken.toString(), lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetUserProfileDirectoryW(htoken: HANDLE, lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetUserProfileDirectoryW(htoken.toString(), lpprofiledir.toString(), lpcchsize.toString()) as Int) else 0

public actual fun GetWindowContextHelpId(param0: HWND): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetWindowContextHelpId(param0.toString()) as Int).toUInt() else 0u

public actual fun GetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, pdwrefdata: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_GetWindowSubclass(hwnd.toString(), pfnsubclass.toLong().toString(), uidsubclass.toString(), pdwrefdata.toString()) as Int) else 0

public actual fun HMONITOR_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HMONITOR_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMONITOR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HMONITOR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HashData(pbdata: Long, cbdata: UInt, pbhash: Long, cbhash: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HashData(pbdata.toString(), cbdata.toInt(), pbhash.toString(), cbhash.toInt()) as Int) else 0

public actual fun HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: UInt, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkClone(pihl.toString(), riid.toString(), pihlsiteforclone.toString(), dwsitedata.toInt(), ppvobj.toString()) as Int) else 0

public actual fun HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateBrowseContext(piunkouter.toString(), riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun HlinkCreateExtensionServices(pwzadditionalheaders: PCWSTR, phwnd: HWND, pszusername: PCWSTR, pszpassword: PCWSTR, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateExtensionServices(pwzadditionalheaders.toString(), phwnd.toString(), pszusername.toString(), pszpassword.toString(), piunkouter.toString(), riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateFromData(pidataobj.toString(), pihlsite.toString(), dwsitedata.toInt(), piunkouter.toString(), riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateFromMoniker(pimktrgt.toString(), pwzlocation.toString(), pwzfriendlyname.toString(), pihlsite.toString(), dwsitedata.toInt(), piunkouter.toString(), riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun HlinkCreateFromString(pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateFromString(pwztarget.toString(), pwzlocation.toString(), pwzfriendlyname.toString(), pihlsite.toString(), dwsitedata.toInt(), piunkouter.toString(), riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun HlinkCreateShortcut(grfhlshortcutf: UInt, pihl: Long, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateShortcut(grfhlshortcutf.toInt(), pihl.toString(), pwzdir.toString(), pwzfilename.toString(), ppwzshortcutfile.toString(), dwreserved.toInt()) as Int) else 0

public actual fun HlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), pimktarget.toString(), pwzlocation.toString(), pwzdir.toString(), pwzfilename.toString(), ppwzshortcutfile.toString(), dwreserved.toInt()) as Int) else 0

public actual fun HlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromString(grfhlshortcutf.toInt(), pwztarget.toString(), pwzlocation.toString(), pwzdir.toString(), pwzfilename.toString(), ppwzshortcutfile.toString(), dwreserved.toInt()) as Int) else 0

public actual fun HlinkGetSpecialReference(ureference: UInt, ppwzreference: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkGetSpecialReference(ureference.toInt(), ppwzreference.toString()) as Int) else 0

public actual fun HlinkGetValueFromParams(pwzparams: PCWSTR, pwzname: PCWSTR, ppwzvalue: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkGetValueFromParams(pwzparams.toString(), pwzname.toString(), ppwzvalue.toString()) as Int) else 0

public actual fun HlinkIsShortcut(pwzfilename: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkIsShortcut(pwzfilename.toString()) as Int) else 0

public actual fun HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: UInt, pbc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkNavigate(pihl.toString(), pihlframe.toString(), grfhlnf.toInt(), pbc.toString(), pibsc.toString(), pihlbc.toString()) as Int) else 0

public actual fun HlinkNavigateToStringReference(pwztarget: PCWSTR, pwzlocation: PCWSTR, pihlsite: Long, dwsitedata: UInt, pihlframe: Long, grfhlnf: UInt, pibc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkNavigateToStringReference(pwztarget.toString(), pwzlocation.toString(), pihlsite.toString(), dwsitedata.toInt(), pihlframe.toString(), grfhlnf.toInt(), pibc.toString(), pibsc.toString(), pihlbc.toString()) as Int) else 0

public actual fun HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, puhlid: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkOnNavigate(pihlframe.toString(), pihlbc.toString(), grfhlnf.toInt(), pimktarget.toString(), pwzlocation.toString(), pwzfriendlyname.toString(), puhlid.toString()) as Int) else 0

public actual fun HlinkOnRenameDocument(dwreserved: UInt, pihlbc: Long, pimkold: Long, pimknew: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkOnRenameDocument(dwreserved.toInt(), pihlbc.toString(), pimkold.toString(), pimknew.toString()) as Int) else 0

public actual fun HlinkParseDisplayName(pibc: Long, pwzdisplayname: PCWSTR, fnoforceabs: BOOL, pccheaten: Long, ppimk: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkParseDisplayName(pibc.toString(), pwzdisplayname.toString(), fnoforceabs, pccheaten.toString(), ppimk.toString()) as Int) else 0

public actual fun HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkPreprocessMoniker(pibc.toString(), pimkin.toString(), ppimkout.toString()) as Int) else 0

public actual fun HlinkQueryCreateFromData(pidataobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkQueryCreateFromData(pidataobj.toString()) as Int) else 0

public actual fun HlinkResolveMonikerForData(pimkreference: Long, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkResolveMonikerForData(pimkreference.toString(), reserved.toInt(), pibc.toString(), cfmtetc.toInt(), rgfmtetc.toString(), pibsc.toString(), pimkbase.toString()) as Int) else 0

public actual fun HlinkResolveShortcut(pwzshortcutfilename: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkResolveShortcut(pwzshortcutfilename.toString(), pihlsite.toString(), dwsitedata.toInt(), piunkouter.toString(), riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun HlinkResolveShortcutToMoniker(pwzshortcutfilename: PCWSTR, ppimktarget: Long, ppwzlocation: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkResolveShortcutToMoniker(pwzshortcutfilename.toString(), ppimktarget.toString(), ppwzlocation.toString()) as Int) else 0

public actual fun HlinkResolveShortcutToString(pwzshortcutfilename: PCWSTR, ppwztarget: Long, ppwzlocation: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkResolveShortcutToString(pwzshortcutfilename.toString(), ppwztarget.toString(), ppwzlocation.toString()) as Int) else 0

public actual fun HlinkResolveStringForData(pwzreference: PCWSTR, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkResolveStringForData(pwzreference.toString(), reserved.toInt(), pibc.toString(), cfmtetc.toInt(), rgfmtetc.toString(), pibsc.toString(), pimkbase.toString()) as Int) else 0

public actual fun HlinkSetSpecialReference(ureference: UInt, pwzreference: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkSetSpecialReference(ureference.toInt(), pwzreference.toString()) as Int) else 0

public actual fun HlinkTranslateURL(pwzurl: PCWSTR, grfflags: UInt, ppwztranslatedurl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkTranslateURL(pwzurl.toString(), grfflags.toInt(), ppwztranslatedurl.toString()) as Int) else 0

public actual fun HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: UInt, pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_HlinkUpdateStackItem(pihlframe.toString(), pihlbc.toString(), uhlid.toInt(), pimktrgt.toString(), pwzlocation.toString(), pwzfriendlyname.toString()) as Int) else 0

public actual fun ILAppendID(pidl: Long, pmkid: Long, fappend: BOOL): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILAppendID(pidl.toString(), pmkid.toString(), fappend) as String).toLong() else 0L

public actual fun ILClone(pidl: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILClone(pidl.toString()) as String).toLong() else 0L

public actual fun ILCloneFirst(pidl: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILCloneFirst(pidl.toString()) as String).toLong() else 0L

public actual fun ILCombine(pidl1: Long, pidl2: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILCombine(pidl1.toString(), pidl2.toString()) as String).toLong() else 0L

public actual fun ILCreateFromPathA(pszpath: PCSTR): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILCreateFromPathA(pszpath.toString()) as String).toLong() else 0L

public actual fun ILCreateFromPathW(pszpath: PCWSTR): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILCreateFromPathW(pszpath.toString()) as String).toLong() else 0L

public actual fun ILFindChild(pidlparent: Long, pidlchild: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILFindChild(pidlparent.toString(), pidlchild.toString()) as String).toLong() else 0L

public actual fun ILFindLastID(pidl: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILFindLastID(pidl.toString()) as String).toLong() else 0L

public actual fun ILFree(pidl: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILFree(pidl.toString())
    }
}

public actual fun ILGetNext(pidl: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILGetNext(pidl.toString()) as String).toLong() else 0L

public actual fun ILGetSize(pidl: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILGetSize(pidl.toString()) as Int).toUInt() else 0u

public actual fun ILIsEqual(pidl1: Long, pidl2: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILIsEqual(pidl1.toString(), pidl2.toString()) as Int) else 0

public actual fun ILIsParent(pidl1: Long, pidl2: Long, fimmediate: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILIsParent(pidl1.toString(), pidl2.toString(), fimmediate) as Int) else 0

public actual fun ILLoadFromStreamEx(pstm: Long, pidl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILLoadFromStreamEx(pstm.toString(), pidl.toString()) as Int) else 0

public actual fun ILRemoveLastID(pidl: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILRemoveLastID(pidl.toString()) as Int) else 0

public actual fun ILSaveToStream(pstm: Long, pidl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ILSaveToStream(pstm.toString(), pidl.toString()) as Int) else 0

public actual fun IStream_Copy(pstmfrom: Long, pstmto: Long, cb: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_Copy(pstmfrom.toString(), pstmto.toString(), cb.toInt()) as Int) else 0

public actual fun IStream_Read(pstm: Long, pv: Long, cb: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_Read(pstm.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun IStream_ReadPidl(pstm: Long, ppidlout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_ReadPidl(pstm.toString(), ppidlout.toString()) as Int) else 0

public actual fun IStream_ReadStr(pstm: Long, ppsz: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_ReadStr(pstm.toString(), ppsz.toString()) as Int) else 0

public actual fun IStream_Reset(pstm: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_Reset(pstm.toString()) as Int) else 0

public actual fun IStream_Size(pstm: Long, pui: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_Size(pstm.toString(), pui.toString()) as Int) else 0

public actual fun IStream_Write(pstm: Long, pv: Long, cb: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_Write(pstm.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun IStream_WritePidl(pstm: Long, pidlwrite: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_WritePidl(pstm.toString(), pidlwrite.toString()) as Int) else 0

public actual fun IStream_WriteStr(pstm: Long, psz: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IStream_WriteStr(pstm.toString(), psz.toString()) as Int) else 0

public actual fun IUnknown_AtomicRelease(ppunk: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IUnknown_AtomicRelease(ppunk.toString())
    }
}

public actual fun IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IUnknown_GetSite(punk.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun IUnknown_GetWindow(punk: Long, phwnd: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IUnknown_GetWindow(punk.toString(), phwnd.toString()) as Int) else 0

public actual fun IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IUnknown_QueryService(punk.toString(), guidservice.toString(), riid.toString(), ppvout.toString()) as Int) else 0

public actual fun IUnknown_Set(ppunk: Long, punk: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IUnknown_Set(ppunk.toString(), punk.toString())
    }
}

public actual fun IUnknown_SetSite(punk: Long, punksite: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IUnknown_SetSite(punk.toString(), punksite.toString()) as Int) else 0

public actual fun ImportPrivacySettings(pszfilename: PCWSTR, pfparseprivacypreferences: Long, pfparsepersiterules: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ImportPrivacySettings(pszfilename.toString(), pfparseprivacypreferences.toString(), pfparsepersiterules.toString()) as Int) else 0

public actual fun InitNetworkAddressControl(): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_InitNetworkAddressControl() as Int) else 0

public actual fun InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_InitPropVariantFromStrRet(pstrret.toString(), pidl.toString(), ppropvar.toString()) as Int) else 0

public actual fun InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_InitVariantFromStrRet(pstrret.toString(), pidl.toString(), pvar.toString()) as Int) else 0

public actual fun IntlStrEqWorkerA(fcasesens: BOOL, lpstring1: PCSTR, lpstring2: PCSTR, nchar: Int): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IntlStrEqWorkerA(fcasesens, lpstring1.toString(), lpstring2.toString(), nchar) as Int) else 0

public actual fun IntlStrEqWorkerW(fcasesens: BOOL, lpstring1: PCWSTR, lpstring2: PCWSTR, nchar: Int): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IntlStrEqWorkerW(fcasesens, lpstring1.toString(), lpstring2.toString(), nchar) as Int) else 0

public actual fun IsCharSpaceA(wch: Byte): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsCharSpaceA(wch.toInt()) as Int) else 0

public actual fun IsCharSpaceW(wch: UShort): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsCharSpaceW(wch.toInt()) as Int) else 0

public actual fun IsInternetESCEnabled(): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsInternetESCEnabled() as Int) else 0

public actual fun IsLFNDriveA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsLFNDriveA(pszpath.toString()) as Int) else 0

public actual fun IsLFNDriveW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsLFNDriveW(pszpath.toString()) as Int) else 0

public actual fun IsNetDrive(idrive: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsNetDrive(idrive) as Int) else 0

public actual fun IsOS(dwos: OS): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsOS(dwos.toInt()) as Int) else 0

public actual fun IsUserAnAdmin(): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_IsUserAnAdmin() as Int) else 0

public actual fun LoadUserProfileA(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_LoadUserProfileA(htoken.toString(), lpprofileinfo.toString()) as Int) else 0

public actual fun LoadUserProfileW(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_LoadUserProfileW(htoken.toString(), lpprofileinfo.toString()) as Int) else 0

public actual fun OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: BOOL): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_OleSaveToStreamEx(piunk.toString(), pistm.toString(), fcleardirty) as Int) else 0

public actual fun OpenRegStream(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_OpenRegStream(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), grfmode.toInt()) as String).toLong() else 0L

public actual fun ParseURLA(pcszurl: PCSTR, ppu: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ParseURLA(pcszurl.toString(), ppu.toString()) as Int) else 0

public actual fun ParseURLW(pcszurl: PCWSTR, ppu: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ParseURLW(pcszurl.toString(), ppu.toString()) as Int) else 0

public actual fun PathAddBackslashA(pszpath: PSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAddBackslashA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathAddBackslashW(pszpath: PWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAddBackslashW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathAddExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAddExtensionA(pszpath.toString(), pszext.toString()) as Int) else 0

public actual fun PathAddExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAddExtensionW(pszpath.toString(), pszext.toString()) as Int) else 0

public actual fun PathAllocCanonicalize(pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAllocCanonicalize(pszpathin.toString(), dwflags.toInt(), ppszpathout.toString()) as Int) else 0

public actual fun PathAllocCombine(pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAllocCombine(pszpathin.toString(), pszmore.toString(), dwflags.toInt(), ppszpathout.toString()) as Int) else 0

public actual fun PathAppendA(pszpath: PSTR, pszmore: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAppendA(pszpath.toString(), pszmore.toString()) as Int) else 0

public actual fun PathAppendW(pszpath: PWSTR, pszmore: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathAppendW(pszpath.toString(), pszmore.toString()) as Int) else 0

public actual fun PathBuildRootA(pszroot: PSTR, idrive: Int): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathBuildRootA(pszroot.toString(), idrive) as String).toLong() else 0L

public actual fun PathBuildRootW(pszroot: PWSTR, idrive: Int): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathBuildRootW(pszroot.toString(), idrive) as String).toLong() else 0L

public actual fun PathCanonicalizeA(pszbuf: PSTR, pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCanonicalizeA(pszbuf.toString(), pszpath.toString()) as Int) else 0

public actual fun PathCanonicalizeW(pszbuf: PWSTR, pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCanonicalizeW(pszbuf.toString(), pszpath.toString()) as Int) else 0

public actual fun PathCchAddBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchAddBackslash(pszpath.toString(), cchpath.toString()) as Int) else 0

public actual fun PathCchAddBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchAddBackslashEx(pszpath.toString(), cchpath.toString(), ppszend.toString(), pcchremaining.toString()) as Int) else 0

public actual fun PathCchAddExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchAddExtension(pszpath.toString(), cchpath.toString(), pszext.toString()) as Int) else 0

public actual fun PathCchAppend(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchAppend(pszpath.toString(), cchpath.toString(), pszmore.toString()) as Int) else 0

public actual fun PathCchAppendEx(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchAppendEx(pszpath.toString(), cchpath.toString(), pszmore.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathCchCanonicalize(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchCanonicalize(pszpathout.toString(), cchpathout.toString(), pszpathin.toString()) as Int) else 0

public actual fun PathCchCanonicalizeEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchCanonicalizeEx(pszpathout.toString(), cchpathout.toString(), pszpathin.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathCchCombine(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchCombine(pszpathout.toString(), cchpathout.toString(), pszpathin.toString(), pszmore.toString()) as Int) else 0

public actual fun PathCchCombineEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchCombineEx(pszpathout.toString(), cchpathout.toString(), pszpathin.toString(), pszmore.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathCchFindExtension(pszpath: PCWSTR, cchpath: ULong, ppszext: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchFindExtension(pszpath.toString(), cchpath.toString(), ppszext.toString()) as Int) else 0

public actual fun PathCchIsRoot(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchIsRoot(pszpath.toString()) as Int) else 0

public actual fun PathCchRemoveBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchRemoveBackslash(pszpath.toString(), cchpath.toString()) as Int) else 0

public actual fun PathCchRemoveBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchRemoveBackslashEx(pszpath.toString(), cchpath.toString(), ppszend.toString(), pcchremaining.toString()) as Int) else 0

public actual fun PathCchRemoveExtension(pszpath: PWSTR, cchpath: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchRemoveExtension(pszpath.toString(), cchpath.toString()) as Int) else 0

public actual fun PathCchRemoveFileSpec(pszpath: PWSTR, cchpath: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchRemoveFileSpec(pszpath.toString(), cchpath.toString()) as Int) else 0

public actual fun PathCchRenameExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchRenameExtension(pszpath.toString(), cchpath.toString(), pszext.toString()) as Int) else 0

public actual fun PathCchSkipRoot(pszpath: PCWSTR, ppszrootend: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchSkipRoot(pszpath.toString(), ppszrootend.toString()) as Int) else 0

public actual fun PathCchStripPrefix(pszpath: PWSTR, cchpath: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchStripPrefix(pszpath.toString(), cchpath.toString()) as Int) else 0

public actual fun PathCchStripToRoot(pszpath: PWSTR, cchpath: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCchStripToRoot(pszpath.toString(), cchpath.toString()) as Int) else 0

public actual fun PathCleanupSpec(pszdir: PCWSTR, pszspec: PWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCleanupSpec(pszdir.toString(), pszspec.toString()) as Int) else 0

public actual fun PathCombineA(pszdest: PSTR, pszdir: PCSTR, pszfile: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCombineA(pszdest.toString(), pszdir.toString(), pszfile.toString()) as String).toLong() else 0L

public actual fun PathCombineW(pszdest: PWSTR, pszdir: PCWSTR, pszfile: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCombineW(pszdest.toString(), pszdir.toString(), pszfile.toString()) as String).toLong() else 0L

public actual fun PathCommonPrefixA(pszfile1: PCSTR, pszfile2: PCSTR, achpath: PSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCommonPrefixA(pszfile1.toString(), pszfile2.toString(), achpath.toString()) as Int) else 0

public actual fun PathCommonPrefixW(pszfile1: PCWSTR, pszfile2: PCWSTR, achpath: PWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCommonPrefixW(pszfile1.toString(), pszfile2.toString(), achpath.toString()) as Int) else 0

public actual fun PathCompactPathA(hdc: HDC, pszpath: PSTR, dx: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCompactPathA(hdc.toString(), pszpath.toString(), dx.toInt()) as Int) else 0

public actual fun PathCompactPathExA(pszout: PSTR, pszsrc: PCSTR, cchmax: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCompactPathExA(pszout.toString(), pszsrc.toString(), cchmax.toInt(), dwflags.toInt()) as Int) else 0

public actual fun PathCompactPathExW(pszout: PWSTR, pszsrc: PCWSTR, cchmax: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCompactPathExW(pszout.toString(), pszsrc.toString(), cchmax.toInt(), dwflags.toInt()) as Int) else 0

public actual fun PathCompactPathW(hdc: HDC, pszpath: PWSTR, dx: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCompactPathW(hdc.toString(), pszpath.toString(), dx.toInt()) as Int) else 0

public actual fun PathCreateFromUrlA(pszurl: PCSTR, pszpath: PSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCreateFromUrlA(pszurl.toString(), pszpath.toString(), pcchpath.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathCreateFromUrlAlloc(pszin: PCWSTR, ppszout: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCreateFromUrlAlloc(pszin.toString(), ppszout.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathCreateFromUrlW(pszurl: PCWSTR, pszpath: PWSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathCreateFromUrlW(pszurl.toString(), pszpath.toString(), pcchpath.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathFileExistsA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFileExistsA(pszpath.toString()) as Int) else 0

public actual fun PathFileExistsW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFileExistsW(pszpath.toString()) as Int) else 0

public actual fun PathFindExtensionA(pszpath: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindExtensionA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathFindExtensionW(pszpath: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindExtensionW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathFindFileNameA(pszpath: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindFileNameA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathFindFileNameW(pszpath: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindFileNameW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathFindNextComponentA(pszpath: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindNextComponentA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathFindNextComponentW(pszpath: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindNextComponentW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathFindOnPathA(pszpath: PSTR, ppszotherdirs: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindOnPathA(pszpath.toString(), ppszotherdirs.toString()) as Int) else 0

public actual fun PathFindOnPathW(pszpath: PWSTR, ppszotherdirs: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindOnPathW(pszpath.toString(), ppszotherdirs.toString()) as Int) else 0

public actual fun PathFindSuffixArrayA(pszpath: PCSTR, apszsuffix: Long, iarraysize: Int): PCSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindSuffixArrayA(pszpath.toString(), apszsuffix.toString(), iarraysize) as String).toLong() else 0L

public actual fun PathFindSuffixArrayW(pszpath: PCWSTR, apszsuffix: Long, iarraysize: Int): PCWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathFindSuffixArrayW(pszpath.toString(), apszsuffix.toString(), iarraysize) as String).toLong() else 0L

public actual fun PathGetArgsA(pszpath: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetArgsA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathGetArgsW(pszpath: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetArgsW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathGetCharTypeA(ch: UByte): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetCharTypeA(ch.toInt()) as Int).toUInt() else 0u

public actual fun PathGetCharTypeW(ch: UShort): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetCharTypeW(ch.toInt()) as Int).toUInt() else 0u

public actual fun PathGetDriveNumberA(pszpath: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetDriveNumberA(pszpath.toString()) as Int) else 0

public actual fun PathGetDriveNumberW(pszpath: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetDriveNumberW(pszpath.toString()) as Int) else 0

public actual fun PathGetShortPath(pszlongpath: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathGetShortPath(pszlongpath.toString())
    }
}

public actual fun PathIsContentTypeA(pszpath: PCSTR, pszcontenttype: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsContentTypeA(pszpath.toString(), pszcontenttype.toString()) as Int) else 0

public actual fun PathIsContentTypeW(pszpath: PCWSTR, pszcontenttype: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsContentTypeW(pszpath.toString(), pszcontenttype.toString()) as Int) else 0

public actual fun PathIsDirectoryA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsDirectoryA(pszpath.toString()) as Int) else 0

public actual fun PathIsDirectoryEmptyA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyA(pszpath.toString()) as Int) else 0

public actual fun PathIsDirectoryEmptyW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyW(pszpath.toString()) as Int) else 0

public actual fun PathIsDirectoryW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsDirectoryW(pszpath.toString()) as Int) else 0

public actual fun PathIsExe(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsExe(pszpath.toString()) as Int) else 0

public actual fun PathIsFileSpecA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsFileSpecA(pszpath.toString()) as Int) else 0

public actual fun PathIsFileSpecW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsFileSpecW(pszpath.toString()) as Int) else 0

public actual fun PathIsLFNFileSpecA(pszname: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsLFNFileSpecA(pszname.toString()) as Int) else 0

public actual fun PathIsLFNFileSpecW(pszname: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsLFNFileSpecW(pszname.toString()) as Int) else 0

public actual fun PathIsNetworkPathA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsNetworkPathA(pszpath.toString()) as Int) else 0

public actual fun PathIsNetworkPathW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsNetworkPathW(pszpath.toString()) as Int) else 0

public actual fun PathIsPrefixA(pszprefix: PCSTR, pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsPrefixA(pszprefix.toString(), pszpath.toString()) as Int) else 0

public actual fun PathIsPrefixW(pszprefix: PCWSTR, pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsPrefixW(pszprefix.toString(), pszpath.toString()) as Int) else 0

public actual fun PathIsRelativeA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsRelativeA(pszpath.toString()) as Int) else 0

public actual fun PathIsRelativeW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsRelativeW(pszpath.toString()) as Int) else 0

public actual fun PathIsRootA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsRootA(pszpath.toString()) as Int) else 0

public actual fun PathIsRootW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsRootW(pszpath.toString()) as Int) else 0

public actual fun PathIsSameRootA(pszpath1: PCSTR, pszpath2: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsSameRootA(pszpath1.toString(), pszpath2.toString()) as Int) else 0

public actual fun PathIsSameRootW(pszpath1: PCWSTR, pszpath2: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsSameRootW(pszpath1.toString(), pszpath2.toString()) as Int) else 0

public actual fun PathIsSlowA(pszfile: PCSTR, dwattr: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsSlowA(pszfile.toString(), dwattr.toInt()) as Int) else 0

public actual fun PathIsSlowW(pszfile: PCWSTR, dwattr: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsSlowW(pszfile.toString(), dwattr.toInt()) as Int) else 0

public actual fun PathIsSystemFolderA(pszpath: PCSTR, dwattrb: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsSystemFolderA(pszpath.toString(), dwattrb.toInt()) as Int) else 0

public actual fun PathIsSystemFolderW(pszpath: PCWSTR, dwattrb: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsSystemFolderW(pszpath.toString(), dwattrb.toInt()) as Int) else 0

public actual fun PathIsUNCA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCA(pszpath.toString()) as Int) else 0

public actual fun PathIsUNCEx(pszpath: PCWSTR, ppszserver: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCEx(pszpath.toString(), ppszserver.toString()) as Int) else 0

public actual fun PathIsUNCServerA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCServerA(pszpath.toString()) as Int) else 0

public actual fun PathIsUNCServerShareA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCServerShareA(pszpath.toString()) as Int) else 0

public actual fun PathIsUNCServerShareW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCServerShareW(pszpath.toString()) as Int) else 0

public actual fun PathIsUNCServerW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCServerW(pszpath.toString()) as Int) else 0

public actual fun PathIsUNCW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsUNCW(pszpath.toString()) as Int) else 0

public actual fun PathIsURLA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsURLA(pszpath.toString()) as Int) else 0

public actual fun PathIsURLW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathIsURLW(pszpath.toString()) as Int) else 0

public actual fun PathMakePrettyA(pszpath: PSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMakePrettyA(pszpath.toString()) as Int) else 0

public actual fun PathMakePrettyW(pszpath: PWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMakePrettyW(pszpath.toString()) as Int) else 0

public actual fun PathMakeSystemFolderA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMakeSystemFolderA(pszpath.toString()) as Int) else 0

public actual fun PathMakeSystemFolderW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMakeSystemFolderW(pszpath.toString()) as Int) else 0

public actual fun PathMakeUniqueName(pszuniquename: PWSTR, cchmax: UInt, psztemplate: PCWSTR, pszlongplate: PCWSTR, pszdir: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMakeUniqueName(pszuniquename.toString(), cchmax.toInt(), psztemplate.toString(), pszlongplate.toString(), pszdir.toString()) as Int) else 0

public actual fun PathMatchSpecA(pszfile: PCSTR, pszspec: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMatchSpecA(pszfile.toString(), pszspec.toString()) as Int) else 0

public actual fun PathMatchSpecExA(pszfile: PCSTR, pszspec: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMatchSpecExA(pszfile.toString(), pszspec.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathMatchSpecExW(pszfile: PCWSTR, pszspec: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMatchSpecExW(pszfile.toString(), pszspec.toString(), dwflags.toInt()) as Int) else 0

public actual fun PathMatchSpecW(pszfile: PCWSTR, pszspec: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathMatchSpecW(pszfile.toString(), pszspec.toString()) as Int) else 0

public actual fun PathParseIconLocationA(psziconfile: PSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathParseIconLocationA(psziconfile.toString()) as Int) else 0

public actual fun PathParseIconLocationW(psziconfile: PWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathParseIconLocationW(psziconfile.toString()) as Int) else 0

public actual fun PathQualify(psz: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathQualify(psz.toString())
    }
}

public actual fun PathQuoteSpacesA(lpsz: PSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathQuoteSpacesA(lpsz.toString()) as Int) else 0

public actual fun PathQuoteSpacesW(lpsz: PWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathQuoteSpacesW(lpsz.toString()) as Int) else 0

public actual fun PathRelativePathToA(pszpath: PSTR, pszfrom: PCSTR, dwattrfrom: UInt, pszto: PCSTR, dwattrto: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRelativePathToA(pszpath.toString(), pszfrom.toString(), dwattrfrom.toInt(), pszto.toString(), dwattrto.toInt()) as Int) else 0

public actual fun PathRelativePathToW(pszpath: PWSTR, pszfrom: PCWSTR, dwattrfrom: UInt, pszto: PCWSTR, dwattrto: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRelativePathToW(pszpath.toString(), pszfrom.toString(), dwattrfrom.toInt(), pszto.toString(), dwattrto.toInt()) as Int) else 0

public actual fun PathRemoveArgsA(pszpath: PSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveArgsA(pszpath.toString())
    }
}

public actual fun PathRemoveArgsW(pszpath: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveArgsW(pszpath.toString())
    }
}

public actual fun PathRemoveBackslashA(pszpath: PSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveBackslashA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathRemoveBackslashW(pszpath: PWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveBackslashW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathRemoveBlanksA(pszpath: PSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveBlanksA(pszpath.toString())
    }
}

public actual fun PathRemoveBlanksW(pszpath: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveBlanksW(pszpath.toString())
    }
}

public actual fun PathRemoveExtensionA(pszpath: PSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveExtensionA(pszpath.toString())
    }
}

public actual fun PathRemoveExtensionW(pszpath: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveExtensionW(pszpath.toString())
    }
}

public actual fun PathRemoveFileSpecA(pszpath: PSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveFileSpecA(pszpath.toString()) as Int) else 0

public actual fun PathRemoveFileSpecW(pszpath: PWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRemoveFileSpecW(pszpath.toString()) as Int) else 0

public actual fun PathRenameExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRenameExtensionA(pszpath.toString(), pszext.toString()) as Int) else 0

public actual fun PathRenameExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathRenameExtensionW(pszpath.toString(), pszext.toString()) as Int) else 0

public actual fun PathResolve(pszpath: PWSTR, dirs: Long, fflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathResolve(pszpath.toString(), dirs.toString(), fflags.toInt()) as Int) else 0

public actual fun PathSearchAndQualifyA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathSearchAndQualifyA(pszpath.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun PathSearchAndQualifyW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathSearchAndQualifyW(pszpath.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun PathSetDlgItemPathA(hdlg: HWND, id: Int, pszpath: PCSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathSetDlgItemPathA(hdlg.toString(), id, pszpath.toString())
    }
}

public actual fun PathSetDlgItemPathW(hdlg: HWND, id: Int, pszpath: PCWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathSetDlgItemPathW(hdlg.toString(), id, pszpath.toString())
    }
}

public actual fun PathSkipRootA(pszpath: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathSkipRootA(pszpath.toString()) as String).toLong() else 0L

public actual fun PathSkipRootW(pszpath: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathSkipRootW(pszpath.toString()) as String).toLong() else 0L

public actual fun PathStripPathA(pszpath: PSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathStripPathA(pszpath.toString())
    }
}

public actual fun PathStripPathW(pszpath: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathStripPathW(pszpath.toString())
    }
}

public actual fun PathStripToRootA(pszpath: PSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathStripToRootA(pszpath.toString()) as Int) else 0

public actual fun PathStripToRootW(pszpath: PWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathStripToRootW(pszpath.toString()) as Int) else 0

public actual fun PathUnExpandEnvStringsA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsA(pszpath.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun PathUnExpandEnvStringsW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsW(pszpath.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun PathUndecorateA(pszpath: PSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUndecorateA(pszpath.toString())
    }
}

public actual fun PathUndecorateW(pszpath: PWSTR) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUndecorateW(pszpath.toString())
    }
}

public actual fun PathUnmakeSystemFolderA(pszpath: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderA(pszpath.toString()) as Int) else 0

public actual fun PathUnmakeSystemFolderW(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderW(pszpath.toString()) as Int) else 0

public actual fun PathUnquoteSpacesA(lpsz: PSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUnquoteSpacesA(lpsz.toString()) as Int) else 0

public actual fun PathUnquoteSpacesW(lpsz: PWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathUnquoteSpacesW(lpsz.toString()) as Int) else 0

public actual fun PathYetAnotherMakeUniqueName(pszuniquename: PWSTR, pszpath: PCWSTR, pszshort: PCWSTR, pszfilespec: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PathYetAnotherMakeUniqueName(pszuniquename.toString(), pszpath.toString(), pszshort.toString(), pszfilespec.toString()) as Int) else 0

public actual fun PickIconDlg(hwnd: HWND, psziconpath: PWSTR, cchiconpath: UInt, piiconindex: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PickIconDlg(hwnd.toString(), psziconpath.toString(), cchiconpath.toInt(), piiconindex.toString()) as Int) else 0

public actual fun PropVariantToStrRet(propvar: Long, pstrret: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_PropVariantToStrRet(propvar.toString(), pstrret.toString()) as Int) else 0

public actual fun QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_QISearch(that.toString(), pqit.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun ReadCabinetState(pcs: Long, clength: Int): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ReadCabinetState(pcs.toString(), clength) as Int) else 0

public actual fun RealDriveType(idrive: Int, foktohitnet: BOOL): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RealDriveType(idrive, foktohitnet) as Int) else 0

public actual fun RegisterAppConstrainedChangeNotification(routine: PAPPCONSTRAIN_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RegisterAppConstrainedChangeNotification(routine.toLong().toString(), context.toString(), registration.toString()) as Int).toUInt() else 0u

public actual fun RegisterAppStateChangeNotification(routine: PAPPSTATE_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RegisterAppStateChangeNotification(routine.toLong().toString(), context.toString(), registration.toString()) as Int).toUInt() else 0u

public actual fun RegisterScaleChangeEvent(hevent: HANDLE, pdwcookie: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RegisterScaleChangeEvent(hevent.toString(), pdwcookie.toString()) as Int) else 0

public actual fun RegisterScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, hwndnotify: HWND, umsgnotify: UInt, pdwcookie: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RegisterScaleChangeNotifications(displaydevice, hwndnotify.toString(), umsgnotify.toInt(), pdwcookie.toString()) as Int) else 0

public actual fun RemoveWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RemoveWindowSubclass(hwnd.toString(), pfnsubclass.toLong().toString(), uidsubclass.toString()) as Int) else 0

public actual fun RestartDialog(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RestartDialog(hwnd.toString(), pszprompt.toString(), dwreturn.toInt()) as Int) else 0

public actual fun RestartDialogEx(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt, dwreasoncode: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RestartDialogEx(hwnd.toString(), pszprompt.toString(), dwreturn.toInt(), dwreasoncode.toInt()) as Int) else 0

public actual fun RevokeScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, dwcookie: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_RevokeScaleChangeNotifications(displaydevice, dwcookie.toInt()) as Int) else 0

public actual fun SHAddFromPropSheetExtArray(hpsxa: HPSXA, lpfnaddpage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHAddToRecentDocs(uflags: UInt, pv: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAddToRecentDocs(uflags.toInt(), pv.toString())
    }
}

public actual fun SHAlloc(cb: ULong): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAlloc(cb.toString()) as String).toLong() else 0L

public actual fun SHAllocShared(pvdata: Long, dwsize: UInt, dwprocessid: UInt): HANDLE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAllocShared(pvdata.toString(), dwsize.toInt(), dwprocessid.toInt()) as String).toLong() else 0L

public actual fun SHAnsiToAnsi(pszsrc: PCSTR, pszdst: PSTR, cchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAnsiToAnsi(pszsrc.toString(), pszdst.toString(), cchbuf) as Int) else 0

public actual fun SHAnsiToUnicode(pszsrc: PCSTR, pwszdst: PWSTR, cwchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAnsiToUnicode(pszsrc.toString(), pwszdst.toString(), cwchbuf) as Int) else 0

public actual fun SHAppBarMessage(dwmessage: UInt, pdata: Long): ULong =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAppBarMessage(dwmessage.toInt(), pdata.toString()) as String).toULong() else 0uL

public actual fun SHAssocEnumHandlers(pszextra: PCWSTR, affilter: ASSOC_FILTER, ppenumhandler: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAssocEnumHandlers(pszextra.toString(), affilter, ppenumhandler.toString()) as Int) else 0

public actual fun SHAssocEnumHandlersForProtocolByApplication(protocol: PCWSTR, riid: Long, enumhandlers: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAssocEnumHandlersForProtocolByApplication(protocol.toString(), riid.toString(), enumhandlers.toString()) as Int) else 0

public actual fun SHAutoComplete(hwndedit: HWND, dwflags: SHELL_AUTOCOMPLETE_FLAGS): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHAutoComplete(hwndedit.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHBindToFolderIDListParent(psfroot.toString(), pidl.toString(), riid.toString(), ppv.toString(), ppidllast.toString()) as Int) else 0

public actual fun SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHBindToFolderIDListParentEx(psfroot.toString(), pidl.toString(), ppbc.toString(), riid.toString(), ppv.toString(), ppidllast.toString()) as Int) else 0

public actual fun SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHBindToObject(psf.toString(), pidl.toString(), pbc.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHBindToParent(pidl.toString(), riid.toString(), ppv.toString(), ppidllast.toString()) as Int) else 0

public actual fun SHBrowseForFolderA(lpbi: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHBrowseForFolderA(lpbi.toString()) as String).toLong() else 0L

public actual fun SHBrowseForFolderW(lpbi: Long): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHBrowseForFolderW(lpbi.toString()) as String).toLong() else 0L

public actual fun SHCLSIDFromString(psz: PCWSTR, pclsid: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCLSIDFromString(psz.toString(), pclsid.toString()) as Int) else 0

public actual fun SHChangeNotification_Lock(hchange: HANDLE, dwprocid: UInt, pppidl: Long, plevent: Long): HANDLE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHChangeNotification_Lock(hchange.toString(), dwprocid.toInt(), pppidl.toString(), plevent.toString()) as String).toLong() else 0L

public actual fun SHChangeNotification_Unlock(hlock: HANDLE): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHChangeNotification_Unlock(hlock.toString()) as Int) else 0

public actual fun SHChangeNotify(weventid: Int, uflags: SHCNF_FLAGS, dwitem1: Long, dwitem2: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHChangeNotify(weventid, uflags.toInt(), dwitem1.toString(), dwitem2.toString())
    }
}

public actual fun SHChangeNotifyDeregister(ulid: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHChangeNotifyDeregister(ulid.toInt()) as Int) else 0

public actual fun SHChangeNotifyRegister(hwnd: HWND, fsources: SHCNRF_SOURCE, fevents: Int, wmsg: UInt, centries: Int, pshcne: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHChangeNotifyRegister(hwnd.toString(), fsources, fevents, wmsg.toInt(), centries, pshcne.toString()) as Int).toUInt() else 0u

public actual fun SHChangeNotifyRegisterThread(status: SCNRT_STATUS) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHChangeNotifyRegisterThread(status)
    }
}

public actual fun SHCloneSpecialIDList(hwnd: HWND, csidl: Int, fcreate: BOOL): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCloneSpecialIDList(hwnd.toString(), csidl, fcreate) as String).toLong() else 0L

public actual fun SHCoCreateInstance(pszclsid: PCWSTR, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCoCreateInstance(pszclsid.toString(), pclsid.toString(), punkouter.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCopyKeyA(hkeysrc: HKEY, pszsrcsubkey: PCSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCopyKeyA(hkeysrc.toString(), pszsrcsubkey.toString(), hkeydest.toString(), freserved.toInt()) as Int).toUInt() else 0u

public actual fun SHCopyKeyW(hkeysrc: HKEY, pszsrcsubkey: PCWSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCopyKeyW(hkeysrc.toString(), pszsrcsubkey.toString(), hkeydest.toString(), freserved.toInt()) as Int).toUInt() else 0u

public actual fun SHCreateAssociationRegistration(riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateAssociationRegistration(riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateDataObject(pidlfolder: Long, cidl: UInt, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDataObject(pidlfolder.toString(), cidl.toInt(), apidl.toString(), pdtinner.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDefaultContextMenu(pdcm.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateDefaultExtractIcon(riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDefaultExtractIcon(riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDefaultPropertiesOp(psi.toString(), ppfileop.toString()) as Int) else 0

public actual fun SHCreateDirectory(hwnd: HWND, pszpath: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDirectory(hwnd.toString(), pszpath.toString()) as Int) else 0

public actual fun SHCreateDirectoryExA(hwnd: HWND, pszpath: PCSTR, psa: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDirectoryExA(hwnd.toString(), pszpath.toString(), psa.toString()) as Int) else 0

public actual fun SHCreateDirectoryExW(hwnd: HWND, pszpath: PCWSTR, psa: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateDirectoryExW(hwnd.toString(), pszpath.toString(), psa.toString()) as Int) else 0

public actual fun SHCreateFileExtractIconW(pszfile: PCWSTR, dwfileattributes: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateFileExtractIconW(pszfile.toString(), dwfileattributes.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateItemFromIDList(pidl.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateItemFromParsingName(pszpath: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateItemFromParsingName(pszpath.toString(), pbc.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateItemFromRelativeName(psiparent: Long, pszname: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateItemFromRelativeName(psiparent.toString(), pszname.toString(), pbc.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateItemInKnownFolder(kfid: Long, dwkfflags: UInt, pszitem: PCWSTR, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateItemInKnownFolder(kfid.toString(), dwkfflags.toInt(), pszitem.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateItemWithParent(pidlparent.toString(), psfparent.toString(), pidl.toString(), riid.toString(), ppvitem.toString()) as Int) else 0

public actual fun SHCreateMemStream(pinit: Long, cbinit: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateMemStream(pinit.toString(), cbinit.toInt()) as String).toLong() else 0L

public actual fun SHCreateProcessAsUserW(pscpi: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateProcessAsUserW(pscpi.toString()) as Int) else 0

public actual fun SHCreatePropSheetExtArray(hkey: HKEY, pszsubkey: PCWSTR, max_iface: UInt): HPSXA =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreatePropSheetExtArray(hkey.toString(), pszsubkey.toString(), max_iface.toInt()) as String).toLong() else 0L

public actual fun SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateQueryCancelAutoPlayMoniker(ppmoniker.toString()) as Int) else 0

public actual fun SHCreateShellFolderView(pcsfv: Long, ppsv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellFolderView(pcsfv.toString(), ppsv.toString()) as Int) else 0

public actual fun SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellFolderViewEx(pcsfv.toString(), ppsv.toString()) as Int) else 0

public actual fun SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellItem(pidlparent.toString(), psfparent.toString(), pidl.toString(), ppsi.toString()) as Int) else 0

public actual fun SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: UInt, ppidl: Long, ppsiitemarray: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellItemArray(pidlparent.toString(), psf.toString(), cidl.toInt(), ppidl.toString(), ppsiitemarray.toString()) as Int) else 0

public actual fun SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromDataObject(pdo.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: Long, ppsiitemarray: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromIDLists(cidl.toInt(), rgpidl.toString(), ppsiitemarray.toString()) as Int) else 0

public actual fun SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromShellItem(psi.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHCreateShellPalette(hdc: HDC): HPALETTE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateShellPalette(hdc.toString()) as String).toLong() else 0L

public actual fun SHCreateStdEnumFmtEtc(cfmt: UInt, afmt: Long, ppenumformatetc: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateStdEnumFmtEtc(cfmt.toInt(), afmt.toString(), ppenumformatetc.toString()) as Int) else 0

public actual fun SHCreateStreamOnFileA(pszfile: PCSTR, grfmode: UInt, ppstm: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileA(pszfile.toString(), grfmode.toInt(), ppstm.toString()) as Int) else 0

public actual fun SHCreateStreamOnFileEx(pszfile: PCWSTR, grfmode: UInt, dwattributes: UInt, fcreate: BOOL, pstmtemplate: Long, ppstm: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileEx(pszfile.toString(), grfmode.toInt(), dwattributes.toInt(), fcreate, pstmtemplate.toString(), ppstm.toString()) as Int) else 0

public actual fun SHCreateStreamOnFileW(pszfile: PCWSTR, grfmode: UInt, ppstm: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileW(pszfile.toString(), grfmode.toInt(), ppstm.toString()) as Int) else 0

public actual fun SHCreateThread(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE): BOOL =
    0

public actual fun SHCreateThreadRef(pcref: Long, ppunk: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHCreateThreadRef(pcref.toString(), ppunk.toString()) as Int) else 0

public actual fun SHCreateThreadWithHandle(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE, phandle: Long): BOOL =
    0

public actual fun SHDefExtractIconA(psziconfile: PCSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDefExtractIconA(psziconfile.toString(), iindex, uflags.toInt(), phiconlarge.toString(), phiconsmall.toString(), niconsize.toInt()) as Int) else 0

public actual fun SHDefExtractIconW(psziconfile: PCWSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDefExtractIconW(psziconfile.toString(), iindex, uflags.toInt(), phiconlarge.toString(), phiconsmall.toString(), niconsize.toInt()) as Int) else 0

public actual fun SHDeleteEmptyKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyA(hkey.toString(), pszsubkey.toString()) as Int).toUInt() else 0u

public actual fun SHDeleteEmptyKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyW(hkey.toString(), pszsubkey.toString()) as Int).toUInt() else 0u

public actual fun SHDeleteKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDeleteKeyA(hkey.toString(), pszsubkey.toString()) as Int).toUInt() else 0u

public actual fun SHDeleteKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDeleteKeyW(hkey.toString(), pszsubkey.toString()) as Int).toUInt() else 0u

public actual fun SHDeleteValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDeleteValueA(hkey.toString(), pszsubkey.toString(), pszvalue.toString()) as Int).toUInt() else 0u

public actual fun SHDeleteValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDeleteValueW(hkey.toString(), pszsubkey.toString(), pszvalue.toString()) as Int).toUInt() else 0u

public actual fun SHDestroyPropSheetExtArray(hpsxa: HPSXA) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDestroyPropSheetExtArray(hpsxa.toString())
    }
}

public actual fun SHDoDragDrop(hwnd: HWND, pdata: Long, pdsrc: Long, dweffect: DROPEFFECT, pdweffect: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHDoDragDrop(hwnd.toString(), pdata.toString(), pdsrc.toString(), dweffect.toInt(), pdweffect.toString()) as Int) else 0

public actual fun SHEmptyRecycleBinA(hwnd: HWND, pszrootpath: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEmptyRecycleBinA(hwnd.toString(), pszrootpath.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHEmptyRecycleBinW(hwnd: HWND, pszrootpath: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEmptyRecycleBinW(hwnd.toString(), pszrootpath.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHEnumKeyExA(hkey: HKEY, dwindex: UInt, pszname: PSTR, pcchname: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEnumKeyExA(hkey.toString(), dwindex.toInt(), pszname.toString(), pcchname.toString()) as Int).toUInt() else 0u

public actual fun SHEnumKeyExW(hkey: HKEY, dwindex: UInt, pszname: PWSTR, pcchname: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEnumKeyExW(hkey.toString(), dwindex.toInt(), pszname.toString(), pcchname.toString()) as Int).toUInt() else 0u

public actual fun SHEnumValueA(hkey: HKEY, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEnumValueA(hkey.toString(), dwindex.toInt(), pszvaluename.toString(), pcchvaluename.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHEnumValueW(hkey: HKEY, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEnumValueW(hkey.toString(), dwindex.toInt(), pszvaluename.toString(), pcchvaluename.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHEnumerateUnreadMailAccountsW(hkeyuser: HKEY, dwindex: UInt, pszmailaddress: PWSTR, cchmailaddress: Int): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEnumerateUnreadMailAccountsW(hkeyuser.toString(), dwindex.toInt(), pszmailaddress.toString(), cchmailaddress) as Int) else 0

public actual fun SHEvaluateSystemCommandTemplate(pszcmdtemplate: PCWSTR, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHEvaluateSystemCommandTemplate(pszcmdtemplate.toString(), ppszapplication.toString(), ppszcommandline.toString(), ppszparameters.toString()) as Int) else 0

public actual fun SHFileOperationA(lpfileop: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFileOperationA(lpfileop.toString()) as Int) else 0

public actual fun SHFileOperationW(lpfileop: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFileOperationW(lpfileop.toString()) as Int) else 0

public actual fun SHFindFiles(pidlfolder: Long, pidlsavefile: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFindFiles(pidlfolder.toString(), pidlsavefile.toString()) as Int) else 0

public actual fun SHFind_InitMenuPopup(hmenu: HMENU, hwndowner: HWND, idcmdfirst: UInt, idcmdlast: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFind_InitMenuPopup(hmenu.toString(), hwndowner.toString(), idcmdfirst.toInt(), idcmdlast.toInt()) as String).toLong() else 0L

public actual fun SHFlushSFCache() {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFlushSFCache()
    }
}

public actual fun SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: PSTR, cchbuf: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFormatDateTimeA(pft.toString(), pdwflags.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: PWSTR, cchbuf: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFormatDateTimeW(pft.toString(), pdwflags.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun SHFormatDrive(hwnd: HWND, drive: UInt, fmtid: SHFMT_ID, options: UInt): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFormatDrive(hwnd.toString(), drive.toInt(), fmtid.toInt(), options.toInt()) as Int).toUInt() else 0u

public actual fun SHFree(pv: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFree(pv.toString())
    }
}

public actual fun SHFreeNameMappings(hnamemappings: HANDLE) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFreeNameMappings(hnamemappings.toString())
    }
}

public actual fun SHFreeShared(hdata: HANDLE, dwprocessid: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHFreeShared(hdata.toString(), dwprocessid.toInt()) as Int) else 0

public actual fun SHGetAttributesFromDataObject(pdo: Long, dwattributemask: UInt, pdwattributes: Long, pcitems: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetAttributesFromDataObject(pdo.toString(), dwattributemask.toInt(), pdwattributes.toString(), pcitems.toString()) as Int) else 0

public actual fun SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetDataFromIDListA(psf.toString(), pidl.toString(), nformat, pv.toString(), cb) as Int) else 0

public actual fun SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetDataFromIDListW(psf.toString(), pidl.toString(), nformat, pv.toString(), cb) as Int) else 0

public actual fun SHGetDesktopFolder(ppshf: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetDesktopFolder(ppshf.toString()) as Int) else 0

public actual fun SHGetDiskFreeSpaceExA(pszdirectoryname: PCSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExA(pszdirectoryname.toString(), pulfreebytesavailabletocaller.toString(), pultotalnumberofbytes.toString(), pultotalnumberoffreebytes.toString()) as Int) else 0

public actual fun SHGetDiskFreeSpaceExW(pszdirectoryname: PCWSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExW(pszdirectoryname.toString(), pulfreebytesavailabletocaller.toString(), pultotalnumberofbytes.toString(), pultotalnumberoffreebytes.toString()) as Int) else 0

public actual fun SHGetDriveMedia(pszdrive: PCWSTR, pdwmediacontent: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetDriveMedia(pszdrive.toString(), pdwmediacontent.toString()) as Int) else 0

public actual fun SHGetFileInfoA(pszpath: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFileInfoA(pszpath.toString(), dwfileattributes.toInt(), psfi.toString(), cbfileinfo.toInt(), uflags.toInt()) as String).toULong() else 0uL

public actual fun SHGetFileInfoW(pszpath: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFileInfoW(pszpath.toString(), dwfileattributes.toInt(), psfi.toString(), cbfileinfo.toInt(), uflags.toInt()) as String).toULong() else 0uL

public actual fun SHGetFolderLocation(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, ppidl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFolderLocation(hwnd.toString(), csidl, htoken.toString(), dwflags.toInt(), ppidl.toString()) as Int) else 0

public actual fun SHGetFolderPathA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFolderPathA(hwnd.toString(), csidl, htoken.toString(), dwflags.toInt(), pszpath.toString()) as Int) else 0

public actual fun SHGetFolderPathAndSubDirA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCSTR, pszpath: PSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirA(hwnd.toString(), csidl, htoken.toString(), dwflags.toInt(), pszsubdir.toString(), pszpath.toString()) as Int) else 0

public actual fun SHGetFolderPathAndSubDirW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCWSTR, pszpath: PWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirW(hwnd.toString(), csidl, htoken.toString(), dwflags.toInt(), pszsubdir.toString(), pszpath.toString()) as Int) else 0

public actual fun SHGetFolderPathW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetFolderPathW(hwnd.toString(), csidl, htoken.toString(), dwflags.toInt(), pszpath.toString()) as Int) else 0

public actual fun SHGetIDListFromObject(punk: Long, ppidl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetIDListFromObject(punk.toString(), ppidl.toString()) as Int) else 0

public actual fun SHGetIconOverlayIndexA(psziconpath: PCSTR, iiconindex: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexA(psziconpath.toString(), iiconindex) as Int) else 0

public actual fun SHGetIconOverlayIndexW(psziconpath: PCWSTR, iiconindex: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexW(psziconpath.toString(), iiconindex) as Int) else 0

public actual fun SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetImageList(iimagelist, riid.toString(), ppvobj.toString()) as Int) else 0

public actual fun SHGetInstanceExplorer(ppunk: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetInstanceExplorer(ppunk.toString()) as Int) else 0

public actual fun SHGetInverseCMAP(pbmap: Long, cbmap: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetInverseCMAP(pbmap.toString(), cbmap.toInt()) as Int) else 0

public actual fun SHGetItemFromDataObject(pdtobj: Long, dwflags: DATAOBJ_GET_ITEM_FLAGS, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetItemFromDataObject(pdtobj.toString(), dwflags, riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetItemFromObject(punk.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHGetKnownFolderIDList(rfid: Long, dwflags: UInt, htoken: HANDLE, ppidl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetKnownFolderIDList(rfid.toString(), dwflags.toInt(), htoken.toString(), ppidl.toString()) as Int) else 0

public actual fun SHGetKnownFolderItem(rfid: Long, flags: KNOWN_FOLDER_FLAG, htoken: HANDLE, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetKnownFolderItem(rfid.toString(), flags, htoken.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHGetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, ppszpath: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetKnownFolderPath(rfid.toString(), dwflags.toInt(), htoken.toString(), ppszpath.toString()) as Int) else 0

public actual fun SHGetLocalizedName(pszpath: PCWSTR, pszresmodule: PWSTR, cch: UInt, pidsres: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetLocalizedName(pszpath.toString(), pszresmodule.toString(), cch.toInt(), pidsres.toString()) as Int) else 0

public actual fun SHGetMalloc(ppmalloc: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetMalloc(ppmalloc.toString()) as Int) else 0

public actual fun SHGetNameFromIDList(pidl: Long, sigdnname: SIGDN, ppszname: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetNameFromIDList(pidl.toString(), sigdnname, ppszname.toString()) as Int) else 0

public actual fun SHGetNewLinkInfoA(pszlinkto: PCSTR, pszdir: PCSTR, pszname: PSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetNewLinkInfoA(pszlinkto.toString(), pszdir.toString(), pszname.toString(), pfmustcopy.toString(), uflags.toInt()) as Int) else 0

public actual fun SHGetNewLinkInfoW(pszlinkto: PCWSTR, pszdir: PCWSTR, pszname: PWSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetNewLinkInfoW(pszlinkto.toString(), pszdir.toString(), pszname.toString(), pfmustcopy.toString(), uflags.toInt()) as Int) else 0

public actual fun SHGetPathFromIDListA(pidl: Long, pszpath: PSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetPathFromIDListA(pidl.toString(), pszpath.toString()) as Int) else 0

public actual fun SHGetPathFromIDListEx(pidl: Long, pszpath: PWSTR, cchpath: UInt, uopts: GPFIDL_FLAGS): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetPathFromIDListEx(pidl.toString(), pszpath.toString(), cchpath.toInt(), uopts.toInt()) as Int) else 0

public actual fun SHGetPathFromIDListW(pidl: Long, pszpath: PWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetPathFromIDListW(pidl.toString(), pszpath.toString()) as Int) else 0

public actual fun SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetRealIDL(psf.toString(), pidlsimple.toString(), ppidlreal.toString()) as Int) else 0

public actual fun SHGetSetFolderCustomSettings(pfcs: Long, pszpath: PCWSTR, dwreadwrite: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetSetFolderCustomSettings(pfcs.toString(), pszpath.toString(), dwreadwrite.toInt()) as Int) else 0

public actual fun SHGetSetSettings(lpss: Long, dwmask: SSF_MASK, bset: BOOL) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetSetSettings(lpss.toString(), dwmask.toInt(), bset)
    }
}

public actual fun SHGetSettings(psfs: Long, dwmask: UInt) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetSettings(psfs.toString(), dwmask.toInt())
    }
}

public actual fun SHGetSpecialFolderLocation(hwnd: HWND, csidl: Int, ppidl: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetSpecialFolderLocation(hwnd.toString(), csidl, ppidl.toString()) as Int) else 0

public actual fun SHGetSpecialFolderPathA(hwnd: HWND, pszpath: PSTR, csidl: Int, fcreate: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathA(hwnd.toString(), pszpath.toString(), csidl, fcreate) as Int) else 0

public actual fun SHGetSpecialFolderPathW(hwnd: HWND, pszpath: PWSTR, csidl: Int, fcreate: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathW(hwnd.toString(), pszpath.toString(), csidl, fcreate) as Int) else 0

public actual fun SHGetStockIconInfo(siid: SHSTOCKICONID, uflags: SHGSI_FLAGS, psii: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetStockIconInfo(siid, uflags.toInt(), psii.toString()) as Int) else 0

public actual fun SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetTemporaryPropertyForItem(psi.toString(), propkey.toString(), ppropvar.toString()) as Int) else 0

public actual fun SHGetThreadRef(ppunk: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetThreadRef(ppunk.toString()) as Int) else 0

public actual fun SHGetUnreadMailCountW(hkeyuser: HKEY, pszmailaddress: PCWSTR, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: PWSTR, cchshellexecutecommand: Int): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetUnreadMailCountW(hkeyuser.toString(), pszmailaddress.toString(), pdwcount.toString(), pfiletime.toString(), pszshellexecutecommand.toString(), cchshellexecutecommand) as Int) else 0

public actual fun SHGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetValueA(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetValueW(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHGetViewStatePropertyBag(pidl: Long, pszbagname: PCWSTR, dwflags: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGetViewStatePropertyBag(pidl.toString(), pszbagname.toString(), dwflags.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun SHGlobalCounterDecrement(id: SHGLOBALCOUNTER): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGlobalCounterDecrement(id) as Int) else 0

public actual fun SHGlobalCounterGetValue(id: SHGLOBALCOUNTER): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGlobalCounterGetValue(id) as Int) else 0

public actual fun SHGlobalCounterIncrement(id: SHGLOBALCOUNTER): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHGlobalCounterIncrement(id) as Int) else 0

public actual fun SHHandleUpdateImage(pidlextra: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHHandleUpdateImage(pidlextra.toString()) as Int) else 0

public actual fun SHILCreateFromPath(pszpath: PCWSTR, ppidl: Long, rgfinout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHILCreateFromPath(pszpath.toString(), ppidl.toString(), rgfinout.toString()) as Int) else 0

public actual fun SHInvokePrinterCommandA(hwnd: HWND, uaction: UInt, lpbuf1: PCSTR, lpbuf2: PCSTR, fmodal: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHInvokePrinterCommandA(hwnd.toString(), uaction.toInt(), lpbuf1.toString(), lpbuf2.toString(), fmodal) as Int) else 0

public actual fun SHInvokePrinterCommandW(hwnd: HWND, uaction: UInt, lpbuf1: PCWSTR, lpbuf2: PCWSTR, fmodal: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHInvokePrinterCommandW(hwnd.toString(), uaction.toInt(), lpbuf1.toString(), lpbuf2.toString(), fmodal) as Int) else 0

public actual fun SHIsFileAvailableOffline(pwszpath: PCWSTR, pdwstatus: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHIsFileAvailableOffline(pwszpath.toString(), pdwstatus.toString()) as Int) else 0

public actual fun SHIsLowMemoryMachine(dwtype: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHIsLowMemoryMachine(dwtype.toInt()) as Int) else 0

public actual fun SHLimitInputEdit(hwndedit: HWND, psf: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHLimitInputEdit(hwndedit.toString(), psf.toString()) as Int) else 0

public actual fun SHLoadInProc(rclsid: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHLoadInProc(rclsid.toString()) as Int) else 0

public actual fun SHLoadIndirectString(pszsource: PCWSTR, pszoutbuf: PWSTR, cchoutbuf: UInt, ppvreserved: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHLoadIndirectString(pszsource.toString(), pszoutbuf.toString(), cchoutbuf.toInt(), ppvreserved.toString()) as Int) else 0

public actual fun SHLoadNonloadedIconOverlayIdentifiers(): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHLoadNonloadedIconOverlayIdentifiers() as Int) else 0

public actual fun SHLockShared(hdata: HANDLE, dwprocessid: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHLockShared(hdata.toString(), dwprocessid.toInt()) as String).toLong() else 0L

public actual fun SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHMapPIDLToSystemImageListIndex(pshf.toString(), pidl.toString(), piindexsel.toString()) as Int) else 0

public actual fun SHMessageBoxCheckA(hwnd: HWND, psztext: PCSTR, pszcaption: PCSTR, utype: UInt, idefault: Int, pszregval: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHMessageBoxCheckA(hwnd.toString(), psztext.toString(), pszcaption.toString(), utype.toInt(), idefault, pszregval.toString()) as Int) else 0

public actual fun SHMessageBoxCheckW(hwnd: HWND, psztext: PCWSTR, pszcaption: PCWSTR, utype: UInt, idefault: Int, pszregval: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHMessageBoxCheckW(hwnd.toString(), psztext.toString(), pszcaption.toString(), utype.toInt(), idefault, pszregval.toString()) as Int) else 0

public actual fun SHMultiFileProperties(pdtobj: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHMultiFileProperties(pdtobj.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHObjectProperties(hwnd: HWND, shopobjecttype: UInt, pszobjectname: PCWSTR, pszpropertypage: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHObjectProperties(hwnd.toString(), shopobjecttype.toInt(), pszobjectname.toString(), pszpropertypage.toString()) as Int) else 0

public actual fun SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: UInt, apidl: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenFolderAndSelectItems(pidlfolder.toString(), cidl.toInt(), apidl.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHOpenPropSheetW(pszcaption: PCWSTR, ahkeys: Long, ckeys: UInt, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenPropSheetW(pszcaption.toString(), ahkeys.toString(), ckeys.toInt(), pclsiddefault.toString(), pdtobj.toString(), psb.toString(), pstartpage.toString()) as Int) else 0

public actual fun SHOpenRegStream2A(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenRegStream2A(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), grfmode.toInt()) as String).toLong() else 0L

public actual fun SHOpenRegStream2W(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenRegStream2W(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), grfmode.toInt()) as String).toLong() else 0L

public actual fun SHOpenRegStreamA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenRegStreamA(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), grfmode.toInt()) as String).toLong() else 0L

public actual fun SHOpenRegStreamW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenRegStreamW(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), grfmode.toInt()) as String).toLong() else 0L

public actual fun SHOpenWithDialog(hwndparent: HWND, poainfo: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHOpenWithDialog(hwndparent.toString(), poainfo.toString()) as Int) else 0

public actual fun SHParseDisplayName(pszname: PCWSTR, pbc: Long, ppidl: Long, sfgaoin: UInt, psfgaoout: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHParseDisplayName(pszname.toString(), pbc.toString(), ppidl.toString(), sfgaoin.toInt(), psfgaoout.toString()) as Int) else 0

public actual fun SHPathPrepareForWriteA(hwnd: HWND, punkenablemodless: Long, pszpath: PCSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHPathPrepareForWriteA(hwnd.toString(), punkenablemodless.toString(), pszpath.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHPathPrepareForWriteW(hwnd: HWND, punkenablemodless: Long, pszpath: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHPathPrepareForWriteW(hwnd.toString(), punkenablemodless.toString(), pszpath.toString(), dwflags.toInt()) as Int) else 0

public actual fun SHQueryInfoKeyA(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryInfoKeyA(hkey.toString(), pcsubkeys.toString(), pcchmaxsubkeylen.toString(), pcvalues.toString(), pcchmaxvaluenamelen.toString()) as Int).toUInt() else 0u

public actual fun SHQueryInfoKeyW(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryInfoKeyW(hkey.toString(), pcsubkeys.toString(), pcchmaxsubkeylen.toString(), pcvalues.toString(), pcchmaxvaluenamelen.toString()) as Int).toUInt() else 0u

public actual fun SHQueryRecycleBinA(pszrootpath: PCSTR, pshqueryrbinfo: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryRecycleBinA(pszrootpath.toString(), pshqueryrbinfo.toString()) as Int) else 0

public actual fun SHQueryRecycleBinW(pszrootpath: PCWSTR, pshqueryrbinfo: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryRecycleBinW(pszrootpath.toString(), pshqueryrbinfo.toString()) as Int) else 0

public actual fun SHQueryUserNotificationState(pquns: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryUserNotificationState(pquns.toString()) as Int) else 0

public actual fun SHQueryValueExA(hkey: HKEY, pszvalue: PCSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryValueExA(hkey.toString(), pszvalue.toString(), pdwreserved.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHQueryValueExW(hkey: HKEY, pszvalue: PCWSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHQueryValueExW(hkey.toString(), pszvalue.toString(), pdwreserved.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHRegCloseUSKey(huskey: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegCloseUSKey(huskey.toString()) as Int).toUInt() else 0u

public actual fun SHRegCreateUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegCreateUSKeyA(pszpath.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegCreateUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegCreateUSKeyW(pwzpath.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyA(huskey.toString(), pszsubkey.toString(), delregflags) as Int).toUInt() else 0u

public actual fun SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyW(huskey.toString(), pwzsubkey.toString(), delregflags) as Int).toUInt() else 0u

public actual fun SHRegDeleteUSValueA(huskey: Long, pszvalue: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegDeleteUSValueA(huskey.toString(), pszvalue.toString(), delregflags) as Int).toUInt() else 0u

public actual fun SHRegDeleteUSValueW(huskey: Long, pwzvalue: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegDeleteUSValueW(huskey.toString(), pwzvalue.toString(), delregflags) as Int).toUInt() else 0u

public actual fun SHRegDuplicateHKey(hkey: HKEY): HKEY =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegDuplicateHKey(hkey.toString()) as String).toLong() else 0L

public actual fun SHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: PSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegEnumUSKeyA(huskey.toString(), dwindex.toInt(), pszname.toString(), pcchname.toString(), enumregflags) as Int).toUInt() else 0u

public actual fun SHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: PWSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegEnumUSKeyW(huskey.toString(), dwindex.toInt(), pwzname.toString(), pcchname.toString(), enumregflags) as Int).toUInt() else 0u

public actual fun SHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegEnumUSValueA(huskey.toString(), dwindex.toInt(), pszvaluename.toString(), pcchvaluename.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString(), enumregflags) as Int).toUInt() else 0u

public actual fun SHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegEnumUSValueW(huskey.toString(), dwindex.toInt(), pszvaluename.toString(), pcchvaluename.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString(), enumregflags) as Int).toUInt() else 0u

public actual fun SHRegGetBoolUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueA(pszsubkey.toString(), pszvalue.toString(), fignorehkcu, fdefault) as Int) else 0

public actual fun SHRegGetBoolUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueW(pszsubkey.toString(), pszvalue.toString(), fignorehkcu, fdefault) as Int) else 0

public actual fun SHRegGetIntW(hk: HKEY, pwzkey: PCWSTR, idefault: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetIntW(hk.toString(), pwzkey.toString(), idefault) as Int) else 0

public actual fun SHRegGetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pszpath: PSTR, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetPathA(hkey.toString(), pcszsubkey.toString(), pcszvalue.toString(), pszpath.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegGetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pszpath: PWSTR, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetPathW(hkey.toString(), pcszsubkey.toString(), pcszvalue.toString(), pszpath.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegGetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetUSValueA(pszsubkey.toString(), pszvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString(), fignorehkcu, pvdefaultdata.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else 0u

public actual fun SHRegGetUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetUSValueW(pszsubkey.toString(), pszvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString(), fignorehkcu, pvdefaultdata.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else 0u

public actual fun SHRegGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetValueA(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), srrfflags, pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHRegGetValueFromHKCUHKLM(pwszkey: PCWSTR, pwszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetValueFromHKCUHKLM(pwszkey.toString(), pwszvalue.toString(), srrfflags, pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHRegGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegGetValueW(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), srrfflags, pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun SHRegOpenUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegOpenUSKeyA(pszpath.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.toString(), fignorehkcu) as Int).toUInt() else 0u

public actual fun SHRegOpenUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegOpenUSKeyW(pwzpath.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.toString(), fignorehkcu) as Int).toUInt() else 0u

public actual fun SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyA(huskey.toString(), pcsubkeys.toString(), pcchmaxsubkeylen.toString(), pcvalues.toString(), pcchmaxvaluenamelen.toString(), enumregflags) as Int).toUInt() else 0u

public actual fun SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyW(huskey.toString(), pcsubkeys.toString(), pcchmaxsubkeylen.toString(), pcvalues.toString(), pcchmaxvaluenamelen.toString(), enumregflags) as Int).toUInt() else 0u

public actual fun SHRegQueryUSValueA(huskey: Long, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegQueryUSValueA(huskey.toString(), pszvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString(), fignorehkcu, pvdefaultdata.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else 0u

public actual fun SHRegQueryUSValueW(huskey: Long, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegQueryUSValueW(huskey.toString(), pszvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString(), fignorehkcu, pvdefaultdata.toString(), dwdefaultdatasize.toInt()) as Int).toUInt() else 0u

public actual fun SHRegSetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pcszpath: PCSTR, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegSetPathA(hkey.toString(), pcszsubkey.toString(), pcszvalue.toString(), pcszpath.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegSetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pcszpath: PCWSTR, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegSetPathW(hkey.toString(), pcszsubkey.toString(), pcszvalue.toString(), pcszpath.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegSetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegSetUSValueA(pszsubkey.toString(), pszvalue.toString(), dwtype.toInt(), pvdata.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegSetUSValueW(pwzsubkey: PCWSTR, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegSetUSValueW(pwzsubkey.toString(), pwzvalue.toString(), dwtype.toInt(), pvdata.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegWriteUSValueA(huskey: Long, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegWriteUSValueA(huskey.toString(), pszvalue.toString(), dwtype.toInt(), pvdata.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHRegWriteUSValueW(huskey: Long, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRegWriteUSValueW(huskey.toString(), pwzvalue.toString(), dwtype.toInt(), pvdata.toString(), cbdata.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun SHReleaseThreadRef(): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHReleaseThreadRef() as Int) else 0

public actual fun SHRemoveLocalizedName(pszpath: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRemoveLocalizedName(pszpath.toString()) as Int) else 0

public actual fun SHReplaceFromPropSheetExtArray(hpsxa: HPSXA, upageid: UInt, lpfnreplacewith: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHResolveLibrary(psilibrary: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHResolveLibrary(psilibrary.toString()) as Int) else 0

public actual fun SHRestricted(rest: RESTRICTIONS): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHRestricted(rest) as Int).toUInt() else 0u

public actual fun SHSendMessageBroadcastA(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSendMessageBroadcastA(umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun SHSendMessageBroadcastW(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSendMessageBroadcastW(umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun SHSetDefaultProperties(hwnd: HWND, psi: Long, dwfileopflags: UInt, pfops: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetDefaultProperties(hwnd.toString(), psi.toString(), dwfileopflags.toInt(), pfops.toString()) as Int) else 0

public actual fun SHSetFolderPathA(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetFolderPathA(csidl, htoken.toString(), dwflags.toInt(), pszpath.toString()) as Int) else 0

public actual fun SHSetFolderPathW(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetFolderPathW(csidl, htoken.toString(), dwflags.toInt(), pszpath.toString()) as Int) else 0

public actual fun SHSetInstanceExplorer(punk: Long) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetInstanceExplorer(punk.toString())
    }
}

public actual fun SHSetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, pszpath: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetKnownFolderPath(rfid.toString(), dwflags.toInt(), htoken.toString(), pszpath.toString()) as Int) else 0

public actual fun SHSetLocalizedName(pszpath: PCWSTR, pszresmodule: PCWSTR, idsres: Int): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetLocalizedName(pszpath.toString(), pszresmodule.toString(), idsres) as Int) else 0

public actual fun SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetTemporaryPropertyForItem(psi.toString(), propkey.toString(), propvar.toString()) as Int) else 0

public actual fun SHSetThreadRef(punk: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetThreadRef(punk.toString()) as Int) else 0

public actual fun SHSetUnreadMailCountW(pszmailaddress: PCWSTR, dwcount: UInt, pszshellexecutecommand: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetUnreadMailCountW(pszmailaddress.toString(), dwcount.toInt(), pszshellexecutecommand.toString()) as Int) else 0

public actual fun SHSetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetValueA(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), dwtype.toInt(), pvdata.toString(), cbdata.toInt()) as Int) else 0

public actual fun SHSetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSetValueW(hkey.toString(), pszsubkey.toString(), pszvalue.toString(), dwtype.toInt(), pvdata.toString(), cbdata.toInt()) as Int) else 0

public actual fun SHShellFolderView_Message(hwndmain: HWND, umsg: UInt, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHShellFolderView_Message(hwndmain.toString(), umsg.toInt(), lparam.toString()) as String).toLong() else 0L

public actual fun SHShowManageLibraryUI(psilibrary: Long, hwndowner: HWND, psztitle: PCWSTR, pszinstruction: PCWSTR, lmdoptions: LIBRARYMANAGEDIALOGOPTIONS): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHShowManageLibraryUI(psilibrary.toString(), hwndowner.toString(), psztitle.toString(), pszinstruction.toString(), lmdoptions) as Int) else 0

public actual fun SHSimpleIDListFromPath(pszpath: PCWSTR): Long =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSimpleIDListFromPath(pszpath.toString()) as String).toLong() else 0L

public actual fun SHSkipJunction(pbc: Long, pclsid: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHSkipJunction(pbc.toString(), pclsid.toString()) as Int) else 0

public actual fun SHStartNetConnectionDialogW(hwnd: HWND, pszremotename: PCWSTR, dwtype: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHStartNetConnectionDialogW(hwnd.toString(), pszremotename.toString(), dwtype.toInt()) as Int) else 0

public actual fun SHStrDupA(psz: PCSTR, ppwsz: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHStrDupA(psz.toString(), ppwsz.toString()) as Int) else 0

public actual fun SHStrDupW(psz: PCWSTR, ppwsz: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHStrDupW(psz.toString(), ppwsz.toString()) as Int) else 0

public actual fun SHStripMneumonicA(pszmenu: PSTR): Byte =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHStripMneumonicA(pszmenu.toString()) as Int).toByte() else 0

public actual fun SHStripMneumonicW(pszmenu: PWSTR): UShort =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHStripMneumonicW(pszmenu.toString()) as Int).toUShort() else 0u

public actual fun SHTestTokenMembership(htoken: HANDLE, ulrid: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHTestTokenMembership(htoken.toString(), ulrid.toInt()) as Int) else 0

public actual fun SHUnicodeToAnsi(pwszsrc: PCWSTR, pszdst: PSTR, cchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHUnicodeToAnsi(pwszsrc.toString(), pszdst.toString(), cchbuf) as Int) else 0

public actual fun SHUnicodeToUnicode(pwzsrc: PCWSTR, pwzdst: PWSTR, cwchbuf: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHUnicodeToUnicode(pwzsrc.toString(), pwzdst.toString(), cwchbuf) as Int) else 0

public actual fun SHUnlockShared(pvdata: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHUnlockShared(pvdata.toString()) as Int) else 0

public actual fun SHUpdateImageA(pszhashitem: PCSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHUpdateImageA(pszhashitem.toString(), iindex, uflags.toInt(), iimageindex)
    }
}

public actual fun SHUpdateImageW(pszhashitem: PCWSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHUpdateImageW(pszhashitem.toString(), iindex, uflags.toInt(), iimageindex)
    }
}

public actual fun SHValidateUNC(hwndowner: HWND, pszfile: PWSTR, fconnect: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SHValidateUNC(hwndowner.toString(), pszfile.toString(), fconnect.toInt()) as Int) else 0

public actual fun SetCurrentProcessExplicitAppUserModelID(appid: PCWSTR): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SetCurrentProcessExplicitAppUserModelID(appid.toString()) as Int) else 0

public actual fun SetMenuContextHelpId(param0: HMENU, param1: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SetMenuContextHelpId(param0.toString(), param1.toInt()) as Int) else 0

public actual fun SetWindowContextHelpId(param0: HWND, param1: UInt): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SetWindowContextHelpId(param0.toString(), param1.toInt()) as Int) else 0

public actual fun SetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, dwrefdata: ULong): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SetWindowSubclass(hwnd.toString(), pfnsubclass.toLong().toString(), uidsubclass.toString(), dwrefdata.toString()) as Int) else 0

public actual fun ShellAboutA(hwnd: HWND, szapp: PCSTR, szotherstuff: PCSTR, hicon: HICON): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ShellAboutA(hwnd.toString(), szapp.toString(), szotherstuff.toString(), hicon.toString()) as Int) else 0

public actual fun ShellAboutW(hwnd: HWND, szapp: PCWSTR, szotherstuff: PCWSTR, hicon: HICON): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ShellAboutW(hwnd.toString(), szapp.toString(), szotherstuff.toString(), hicon.toString()) as Int) else 0

public actual fun ShellExecuteA(hwnd: HWND, lpoperation: PCSTR, lpfile: PCSTR, lpparameters: PCSTR, lpdirectory: PCSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ShellExecuteA(hwnd.toString(), lpoperation.toString(), lpfile.toString(), lpparameters.toString(), lpdirectory.toString(), nshowcmd) as String).toLong() else 0L

public actual fun ShellExecuteExA(pexecinfo: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ShellExecuteExA(pexecinfo.toString()) as Int) else 0

public actual fun ShellExecuteExW(pexecinfo: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ShellExecuteExW(pexecinfo.toString()) as Int) else 0

public actual fun ShellExecuteW(hwnd: HWND, lpoperation: PCWSTR, lpfile: PCWSTR, lpparameters: PCWSTR, lpdirectory: PCWSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_ShellExecuteW(hwnd.toString(), lpoperation.toString(), lpfile.toString(), lpparameters.toString(), lpdirectory.toString(), nshowcmd) as String).toLong() else 0L

public actual fun ShellMessageBoxA(happinst: HINSTANCE, hwnd: HWND, lpctext: PCSTR, lpctitle: PCSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun ShellMessageBoxW(happinst: HINSTANCE, hwnd: HWND, lpctext: PCWSTR, lpctitle: PCWSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun Shell_GetCachedImageIndex(pwsziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndex(pwsziconpath.toString(), iiconindex, uiconflags.toInt()) as Int) else 0

public actual fun Shell_GetCachedImageIndexA(psziconpath: PCSTR, iiconindex: Int, uiconflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexA(psziconpath.toString(), iiconindex, uiconflags.toInt()) as Int) else 0

public actual fun Shell_GetCachedImageIndexW(psziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexW(psziconpath.toString(), iiconindex, uiconflags.toInt()) as Int) else 0

public actual fun Shell_GetImageLists(phiml: Long, phimlsmall: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_GetImageLists(phiml.toString(), phimlsmall.toString()) as Int) else 0

public actual fun Shell_MergeMenus(hmdst: HMENU, hmsrc: HMENU, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MM_FLAGS): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_MergeMenus(hmdst.toString(), hmsrc.toString(), uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()) as Int).toUInt() else 0u

public actual fun Shell_NotifyIconA(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_NotifyIconA(dwmessage.toInt(), lpdata.toString()) as Int) else 0

public actual fun Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_NotifyIconGetRect(identifier.toString(), iconlocation.toString()) as Int) else 0

public actual fun Shell_NotifyIconW(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Shell_NotifyIconW(dwmessage.toInt(), lpdata.toString()) as Int) else 0

public actual fun SignalFileOpen(pidl: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SignalFileOpen(pidl.toString()) as Int) else 0

public actual fun SoftwareUpdateMessageBox(hwnd: HWND, pszdistunit: PCWSTR, dwflags: UInt, psdi: Long): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_SoftwareUpdateMessageBox(hwnd.toString(), pszdistunit.toString(), dwflags.toInt(), psdi.toString()) as Int).toUInt() else 0u

public actual fun StgMakeUniqueName(pstgparent: Long, pszfilespec: PCWSTR, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StgMakeUniqueName(pstgparent.toString(), pszfilespec.toString(), grfmode.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun StrCSpnA(pszstr: PCSTR, pszset: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCSpnA(pszstr.toString(), pszset.toString()) as Int) else 0

public actual fun StrCSpnIA(pszstr: PCSTR, pszset: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCSpnIA(pszstr.toString(), pszset.toString()) as Int) else 0

public actual fun StrCSpnIW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCSpnIW(pszstr.toString(), pszset.toString()) as Int) else 0

public actual fun StrCSpnW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCSpnW(pszstr.toString(), pszset.toString()) as Int) else 0

public actual fun StrCatBuffA(pszdest: PSTR, pszsrc: PCSTR, cchdestbuffsize: Int): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCatBuffA(pszdest.toString(), pszsrc.toString(), cchdestbuffsize) as String).toLong() else 0L

public actual fun StrCatBuffW(pszdest: PWSTR, pszsrc: PCWSTR, cchdestbuffsize: Int): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCatBuffW(pszdest.toString(), pszsrc.toString(), cchdestbuffsize) as String).toLong() else 0L

public actual fun StrCatChainW(pszdst: PWSTR, cchdst: UInt, ichat: UInt, pszsrc: PCWSTR): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCatChainW(pszdst.toString(), cchdst.toInt(), ichat.toInt(), pszsrc.toString()) as Int).toUInt() else 0u

public actual fun StrCatW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCatW(psz1.toString(), psz2.toString()) as String).toLong() else 0L

public actual fun StrChrA(pszstart: PCSTR, wmatch: UShort): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrChrA(pszstart.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrChrIA(pszstart: PCSTR, wmatch: UShort): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrChrIA(pszstart.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrChrIW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrChrIW(pszstart.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrChrNIW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrChrNIW(pszstart.toString(), wmatch.toInt(), cchmax.toInt()) as String).toLong() else 0L

public actual fun StrChrNW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrChrNW(pszstart.toString(), wmatch.toInt(), cchmax.toInt()) as String).toLong() else 0L

public actual fun StrChrW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrChrW(pszstart.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrCmpCA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpCA(pszstr1.toString(), pszstr2.toString()) as Int) else 0

public actual fun StrCmpCW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpCW(pszstr1.toString(), pszstr2.toString()) as Int) else 0

public actual fun StrCmpICA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpICA(pszstr1.toString(), pszstr2.toString()) as Int) else 0

public actual fun StrCmpICW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpICW(pszstr1.toString(), pszstr2.toString()) as Int) else 0

public actual fun StrCmpIW(psz1: PCWSTR, psz2: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpIW(psz1.toString(), psz2.toString()) as Int) else 0

public actual fun StrCmpLogicalW(psz1: PCWSTR, psz2: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpLogicalW(psz1.toString(), psz2.toString()) as Int) else 0

public actual fun StrCmpNA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNA(psz1.toString(), psz2.toString(), nchar) as Int) else 0

public actual fun StrCmpNCA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNCA(pszstr1.toString(), pszstr2.toString(), nchar) as Int) else 0

public actual fun StrCmpNCW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNCW(pszstr1.toString(), pszstr2.toString(), nchar) as Int) else 0

public actual fun StrCmpNIA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNIA(psz1.toString(), psz2.toString(), nchar) as Int) else 0

public actual fun StrCmpNICA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNICA(pszstr1.toString(), pszstr2.toString(), nchar) as Int) else 0

public actual fun StrCmpNICW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNICW(pszstr1.toString(), pszstr2.toString(), nchar) as Int) else 0

public actual fun StrCmpNIW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNIW(psz1.toString(), psz2.toString(), nchar) as Int) else 0

public actual fun StrCmpNW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpNW(psz1.toString(), psz2.toString(), nchar) as Int) else 0

public actual fun StrCmpW(psz1: PCWSTR, psz2: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCmpW(psz1.toString(), psz2.toString()) as Int) else 0

public actual fun StrCpyNW(pszdst: PWSTR, pszsrc: PCWSTR, cchmax: Int): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCpyNW(pszdst.toString(), pszsrc.toString(), cchmax) as String).toLong() else 0L

public actual fun StrCpyW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrCpyW(psz1.toString(), psz2.toString()) as String).toLong() else 0L

public actual fun StrDupA(pszsrch: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrDupA(pszsrch.toString()) as String).toLong() else 0L

public actual fun StrDupW(pszsrch: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrDupW(pszsrch.toString()) as String).toLong() else 0L

public actual fun StrFormatByteSize64A(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFormatByteSize64A(qdw.toString(), pszbuf.toString(), cchbuf.toInt()) as String).toLong() else 0L

public actual fun StrFormatByteSizeA(dw: UInt, pszbuf: PSTR, cchbuf: UInt): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFormatByteSizeA(dw.toInt(), pszbuf.toString(), cchbuf.toInt()) as String).toLong() else 0L

public actual fun StrFormatByteSizeEx(ull: ULong, flags: SFBS_FLAGS, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFormatByteSizeEx(ull.toString(), flags, pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun StrFormatByteSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFormatByteSizeW(qdw.toString(), pszbuf.toString(), cchbuf.toInt()) as String).toLong() else 0L

public actual fun StrFormatKBSizeA(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFormatKBSizeA(qdw.toString(), pszbuf.toString(), cchbuf.toInt()) as String).toLong() else 0L

public actual fun StrFormatKBSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFormatKBSizeW(qdw.toString(), pszbuf.toString(), cchbuf.toInt()) as String).toLong() else 0L

public actual fun StrFromTimeIntervalA(pszout: PSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFromTimeIntervalA(pszout.toString(), cchmax.toInt(), dwtimems.toInt(), digits) as Int) else 0

public actual fun StrFromTimeIntervalW(pszout: PWSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrFromTimeIntervalW(pszout.toString(), cchmax.toInt(), dwtimems.toInt(), digits) as Int) else 0

public actual fun StrIsIntlEqualA(fcasesens: BOOL, pszstring1: PCSTR, pszstring2: PCSTR, nchar: Int): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrIsIntlEqualA(fcasesens, pszstring1.toString(), pszstring2.toString(), nchar) as Int) else 0

public actual fun StrIsIntlEqualW(fcasesens: BOOL, pszstring1: PCWSTR, pszstring2: PCWSTR, nchar: Int): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrIsIntlEqualW(fcasesens, pszstring1.toString(), pszstring2.toString(), nchar) as Int) else 0

public actual fun StrNCatA(psz1: PSTR, psz2: PCSTR, cchmax: Int): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrNCatA(psz1.toString(), psz2.toString(), cchmax) as String).toLong() else 0L

public actual fun StrNCatW(psz1: PWSTR, psz2: PCWSTR, cchmax: Int): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrNCatW(psz1.toString(), psz2.toString(), cchmax) as String).toLong() else 0L

public actual fun StrPBrkA(psz: PCSTR, pszset: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrPBrkA(psz.toString(), pszset.toString()) as String).toLong() else 0L

public actual fun StrPBrkW(psz: PCWSTR, pszset: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrPBrkW(psz.toString(), pszset.toString()) as String).toLong() else 0L

public actual fun StrRChrA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRChrA(pszstart.toString(), pszend.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrRChrIA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRChrIA(pszstart.toString(), pszend.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrRChrIW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRChrIW(pszstart.toString(), pszend.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrRChrW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRChrW(pszstart.toString(), pszend.toString(), wmatch.toInt()) as String).toLong() else 0L

public actual fun StrRStrIA(pszsource: PCSTR, pszlast: PCSTR, pszsrch: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRStrIA(pszsource.toString(), pszlast.toString(), pszsrch.toString()) as String).toLong() else 0L

public actual fun StrRStrIW(pszsource: PCWSTR, pszlast: PCWSTR, pszsrch: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRStrIW(pszsource.toString(), pszlast.toString(), pszsrch.toString()) as String).toLong() else 0L

public actual fun StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRetToBSTR(pstr.toString(), pidl.toString(), pbstr.toString()) as Int) else 0

public actual fun StrRetToBufA(pstr: Long, pidl: Long, pszbuf: PSTR, cchbuf: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRetToBufA(pstr.toString(), pidl.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun StrRetToBufW(pstr: Long, pidl: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRetToBufW(pstr.toString(), pidl.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRetToStrA(pstr.toString(), pidl.toString(), ppsz.toString()) as Int) else 0

public actual fun StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrRetToStrW(pstr.toString(), pidl.toString(), ppsz.toString()) as Int) else 0

public actual fun StrSpnA(psz: PCSTR, pszset: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrSpnA(psz.toString(), pszset.toString()) as Int) else 0

public actual fun StrSpnW(psz: PCWSTR, pszset: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrSpnW(psz.toString(), pszset.toString()) as Int) else 0

public actual fun StrStrA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrStrA(pszfirst.toString(), pszsrch.toString()) as String).toLong() else 0L

public actual fun StrStrIA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrStrIA(pszfirst.toString(), pszsrch.toString()) as String).toLong() else 0L

public actual fun StrStrIW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrStrIW(pszfirst.toString(), pszsrch.toString()) as String).toLong() else 0L

public actual fun StrStrNIW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrStrNIW(pszfirst.toString(), pszsrch.toString(), cchmax.toInt()) as String).toLong() else 0L

public actual fun StrStrNW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrStrNW(pszfirst.toString(), pszsrch.toString(), cchmax.toInt()) as String).toLong() else 0L

public actual fun StrStrW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrStrW(pszfirst.toString(), pszsrch.toString()) as String).toLong() else 0L

public actual fun StrToInt64ExA(pszstring: PCSTR, dwflags: Int, pllret: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrToInt64ExA(pszstring.toString(), dwflags, pllret.toString()) as Int) else 0

public actual fun StrToInt64ExW(pszstring: PCWSTR, dwflags: Int, pllret: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrToInt64ExW(pszstring.toString(), dwflags, pllret.toString()) as Int) else 0

public actual fun StrToIntA(pszsrc: PCSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrToIntA(pszsrc.toString()) as Int) else 0

public actual fun StrToIntExA(pszstring: PCSTR, dwflags: Int, piret: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrToIntExA(pszstring.toString(), dwflags, piret.toString()) as Int) else 0

public actual fun StrToIntExW(pszstring: PCWSTR, dwflags: Int, piret: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrToIntExW(pszstring.toString(), dwflags, piret.toString()) as Int) else 0

public actual fun StrToIntW(pszsrc: PCWSTR): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrToIntW(pszsrc.toString()) as Int) else 0

public actual fun StrTrimA(psz: PSTR, psztrimchars: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrTrimA(psz.toString(), psztrimchars.toString()) as Int) else 0

public actual fun StrTrimW(psz: PWSTR, psztrimchars: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_StrTrimW(psz.toString(), psztrimchars.toString()) as Int) else 0

public actual fun UnloadUserProfile(htoken: HANDLE, hprofile: HANDLE): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UnloadUserProfile(htoken.toString(), hprofile.toString()) as Int) else 0

public actual fun UnregisterAppConstrainedChangeNotification(registration: PAPPCONSTRAIN_REGISTRATION) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UnregisterAppConstrainedChangeNotification(registration.toString())
    }
}

public actual fun UnregisterAppStateChangeNotification(registration: PAPPSTATE_REGISTRATION) {
    if (_windowsWin32UiShellNapiAddon != null) {
        _windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UnregisterAppStateChangeNotification(registration.toString())
    }
}

public actual fun UnregisterScaleChangeEvent(dwcookie: ULong): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UnregisterScaleChangeEvent(dwcookie.toString()) as Int) else 0

public actual fun UrlApplySchemeA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlApplySchemeA(pszin.toString(), pszout.toString(), pcchout.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlApplySchemeW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlApplySchemeW(pszin.toString(), pszout.toString(), pcchout.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlCanonicalizeA(pszurl: PCSTR, pszcanonicalized: PSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCanonicalizeA(pszurl.toString(), pszcanonicalized.toString(), pcchcanonicalized.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlCanonicalizeW(pszurl: PCWSTR, pszcanonicalized: PWSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCanonicalizeW(pszurl.toString(), pszcanonicalized.toString(), pcchcanonicalized.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlCombineA(pszbase: PCSTR, pszrelative: PCSTR, pszcombined: PSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCombineA(pszbase.toString(), pszrelative.toString(), pszcombined.toString(), pcchcombined.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlCombineW(pszbase: PCWSTR, pszrelative: PCWSTR, pszcombined: PWSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCombineW(pszbase.toString(), pszrelative.toString(), pszcombined.toString(), pcchcombined.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlCompareA(psz1: PCSTR, psz2: PCSTR, fignoreslash: BOOL): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCompareA(psz1.toString(), psz2.toString(), fignoreslash) as Int) else 0

public actual fun UrlCompareW(psz1: PCWSTR, psz2: PCWSTR, fignoreslash: BOOL): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCompareW(psz1.toString(), psz2.toString(), fignoreslash) as Int) else 0

public actual fun UrlCreateFromPathA(pszpath: PCSTR, pszurl: PSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCreateFromPathA(pszpath.toString(), pszurl.toString(), pcchurl.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlCreateFromPathW(pszpath: PCWSTR, pszurl: PWSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlCreateFromPathW(pszpath.toString(), pszurl.toString(), pcchurl.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlEscapeA(pszurl: PCSTR, pszescaped: PSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlEscapeA(pszurl.toString(), pszescaped.toString(), pcchescaped.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlEscapeW(pszurl: PCWSTR, pszescaped: PWSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlEscapeW(pszurl.toString(), pszescaped.toString(), pcchescaped.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlFixupW(pcszurl: PCWSTR, psztranslatedurl: PWSTR, cchmax: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlFixupW(pcszurl.toString(), psztranslatedurl.toString(), cchmax.toInt()) as Int) else 0

public actual fun UrlGetLocationA(pszurl: PCSTR): PCSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlGetLocationA(pszurl.toString()) as String).toLong() else 0L

public actual fun UrlGetLocationW(pszurl: PCWSTR): PCWSTR =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlGetLocationW(pszurl.toString()) as String).toLong() else 0L

public actual fun UrlGetPartA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlGetPartA(pszin.toString(), pszout.toString(), pcchout.toString(), dwpart.toInt(), dwflags.toInt()) as Int) else 0

public actual fun UrlGetPartW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlGetPartW(pszin.toString(), pszout.toString(), pcchout.toString(), dwpart.toInt(), dwflags.toInt()) as Int) else 0

public actual fun UrlHashA(pszurl: PCSTR, pbhash: Long, cbhash: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlHashA(pszurl.toString(), pbhash.toString(), cbhash.toInt()) as Int) else 0

public actual fun UrlHashW(pszurl: PCWSTR, pbhash: Long, cbhash: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlHashW(pszurl.toString(), pbhash.toString(), cbhash.toInt()) as Int) else 0

public actual fun UrlIsA(pszurl: PCSTR, urlis: URLIS): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlIsA(pszurl.toString(), urlis) as Int) else 0

public actual fun UrlIsNoHistoryA(pszurl: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlIsNoHistoryA(pszurl.toString()) as Int) else 0

public actual fun UrlIsNoHistoryW(pszurl: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlIsNoHistoryW(pszurl.toString()) as Int) else 0

public actual fun UrlIsOpaqueA(pszurl: PCSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlIsOpaqueA(pszurl.toString()) as Int) else 0

public actual fun UrlIsOpaqueW(pszurl: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlIsOpaqueW(pszurl.toString()) as Int) else 0

public actual fun UrlIsW(pszurl: PCWSTR, urlis: URLIS): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlIsW(pszurl.toString(), urlis) as Int) else 0

public actual fun UrlUnescapeA(pszurl: PSTR, pszunescaped: PSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlUnescapeA(pszurl.toString(), pszunescaped.toString(), pcchunescaped.toString(), dwflags.toInt()) as Int) else 0

public actual fun UrlUnescapeW(pszurl: PWSTR, pszunescaped: PWSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_UrlUnescapeW(pszurl.toString(), pszunescaped.toString(), pcchunescaped.toString(), dwflags.toInt()) as Int) else 0

public actual fun VariantToStrRet(varin: Long, pstrret: Long): HRESULT =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_VariantToStrRet(varin.toString(), pstrret.toString()) as Int) else 0

public actual fun WhichPlatform(): UInt =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_WhichPlatform() as Int).toUInt() else 0u

public actual fun Win32DeleteFile(pszpath: PCWSTR): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_Win32DeleteFile(pszpath.toString()) as Int) else 0

public actual fun WinHelpA(hwndmain: HWND, lpszhelp: PCSTR, ucommand: UInt, dwdata: ULong): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_WinHelpA(hwndmain.toString(), lpszhelp.toString(), ucommand.toInt(), dwdata.toString()) as Int) else 0

public actual fun WinHelpW(hwndmain: HWND, lpszhelp: PCWSTR, ucommand: UInt, dwdata: ULong): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_WinHelpW(hwndmain.toString(), lpszhelp.toString(), ucommand.toInt(), dwdata.toString()) as Int) else 0

public actual fun WriteCabinetState(pcs: Long): BOOL =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_WriteCabinetState(pcs.toString()) as Int) else 0

public actual fun wnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR): Int =
    0

public actual fun wnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR): Int =
    0

public actual fun wvnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, arglist: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_wvnsprintfA(pszdest.toString(), cchdest, pszfmt.toString(), arglist.toString()) as Int) else 0

public actual fun wvnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, arglist: Long): Int =
    if (_windowsWin32UiShellNapiAddon != null) (_windowsWin32UiShellNapiAddon.windowssys_windows_win32_ui_shell_wvnsprintfW(pszdest.toString(), cchdest, pszfmt.toString(), arglist.toString()) as Int) else 0
