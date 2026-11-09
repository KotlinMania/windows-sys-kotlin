@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AssocCreate(clsid: GUID, riid: Long, ppv: Long): HRESULT =
    0

public actual fun AssocCreateForClasses(rgclasses: Long, cclasses: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocCreateForClasses(rgclasses.toCPointer<ByteVar>(), cclasses, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocGetDetailsOfPropKey(psf.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), pkey.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), pffoundpropkey.toCPointer<ByteVar>())

public actual fun AssocGetPerceivedType(pszext: PCWSTR, ptype: Long, pflag: Long, ppsztype: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocGetPerceivedType(pszext.toCPointer<ByteVar>(), ptype.toCPointer<ByteVar>(), pflag.toCPointer<ByteVar>(), ppsztype.toCPointer<ByteVar>())

public actual fun AssocIsDangerous(pszassoc: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocIsDangerous(pszassoc.toCPointer<ByteVar>())

public actual fun AssocQueryKeyA(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCSTR, pszextra: PCSTR, phkeyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocQueryKeyA(flags, key, pszassoc.toCPointer<ByteVar>(), pszextra.toCPointer<ByteVar>(), phkeyout.toCPointer<ByteVar>())

public actual fun AssocQueryKeyW(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCWSTR, pszextra: PCWSTR, phkeyout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocQueryKeyW(flags, key, pszassoc.toCPointer<ByteVar>(), pszextra.toCPointer<ByteVar>(), phkeyout.toCPointer<ByteVar>())

public actual fun AssocQueryStringA(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCSTR, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocQueryStringA(flags, str, pszassoc.toCPointer<ByteVar>(), pszextra.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>())

public actual fun AssocQueryStringByKeyA(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocQueryStringByKeyA(flags, str, hkassoc.toCPointer<ByteVar>(), pszextra.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>())

public actual fun AssocQueryStringByKeyW(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocQueryStringByKeyW(flags, str, hkassoc.toCPointer<ByteVar>(), pszextra.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>())

public actual fun AssocQueryStringW(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCWSTR, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_AssocQueryStringW(flags, str, pszassoc.toCPointer<ByteVar>(), pszextra.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>())

public actual fun CDefFolderMenu_Create2(pidlfolder: Long, hwnd: HWND, cidl: UInt, apidl: Long, psf: Long, pfn: LPFNDFMCALLBACK, nkeys: UInt, ahkeys: Long, ppcm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_CDefFolderMenu_Create2(pidlfolder.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), cidl, apidl.toCPointer<ByteVar>(), psf.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>(), nkeys, ahkeys.toCPointer<ByteVar>(), ppcm.toCPointer<ByteVar>())

public actual fun CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: UInt, apidl: Long, ppdtobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_CIDLData_CreateFromIDArray(pidlfolder.toCPointer<ByteVar>(), cidl, apidl.toCPointer<ByteVar>(), ppdtobj.toCPointer<ByteVar>())

public actual fun ChrCmpIA(w1: UShort, w2: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ChrCmpIA(w1, w2)

public actual fun ChrCmpIW(w1: UShort, w2: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ChrCmpIW(w1, w2)

public actual fun ColorAdjustLuma(clrrgb: COLORREF, n: Int, fscale: BOOL): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ColorAdjustLuma(clrrgb, n, fscale)

public actual fun ColorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ColorHLSToRGB(whue, wluminance, wsaturation)

public actual fun ColorRGBToHLS(clrrgb: COLORREF, pwhue: Long, pwluminance: Long, pwsaturation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ColorRGBToHLS(clrrgb, pwhue.toCPointer<ByteVar>(), pwluminance.toCPointer<ByteVar>(), pwsaturation.toCPointer<ByteVar>())
}

public actual fun CommandLineToArgvW(lpcmdline: PCWSTR, pnumargs: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_CommandLineToArgvW(lpcmdline.toCPointer<ByteVar>(), pnumargs.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: BOOL, punktarget: Long, pdwcookie: Long, ppcpout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ConnectToConnectionPoint(punk.toCPointer<ByteVar>(), riidevent.toCPointer<ByteVar>(), fconnect, punktarget.toCPointer<ByteVar>(), pdwcookie.toCPointer<ByteVar>(), ppcpout.toCPointer<ByteVar>())

public actual fun CreateProfile(pszusersid: PCWSTR, pszusername: PCWSTR, pszprofilepath: PWSTR, cchprofilepath: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_CreateProfile(pszusersid.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pszprofilepath.toCPointer<ByteVar>(), cchprofilepath)

public actual fun DAD_AutoScroll(hwnd: HWND, pad: Long, pptnow: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DAD_AutoScroll(hwnd.toCPointer<ByteVar>(), pad.toCPointer<ByteVar>(), pptnow.toCPointer<ByteVar>())

public actual fun DAD_DragEnterEx(hwndtarget: HWND, ptstart: POINT): BOOL =
    0

public actual fun DAD_DragEnterEx2(hwndtarget: HWND, ptstart: POINT, pdtobject: Long): BOOL =
    0

public actual fun DAD_DragLeave(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DAD_DragLeave()

public actual fun DAD_DragMove(pt: POINT): BOOL =
    0

public actual fun DAD_SetDragImage(him: HIMAGELIST, pptoffset: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DAD_SetDragImage(him, pptoffset.toCPointer<ByteVar>())

public actual fun DAD_ShowDragImage(fshow: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DAD_ShowDragImage(fshow)

public actual fun DefSubclassProc(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DefSubclassProc(hwnd.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun DeleteProfileA(lpsidstring: PCSTR, lpprofilepath: PCSTR, lpcomputername: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DeleteProfileA(lpsidstring.toCPointer<ByteVar>(), lpprofilepath.toCPointer<ByteVar>(), lpcomputername.toCPointer<ByteVar>())

public actual fun DeleteProfileW(lpsidstring: PCWSTR, lpprofilepath: PCWSTR, lpcomputername: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DeleteProfileW(lpsidstring.toCPointer<ByteVar>(), lpprofilepath.toCPointer<ByteVar>(), lpcomputername.toCPointer<ByteVar>())

public actual fun DoEnvironmentSubstA(pszsrc: PSTR, cchsrc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DoEnvironmentSubstA(pszsrc.toCPointer<ByteVar>(), cchsrc)

public actual fun DoEnvironmentSubstW(pszsrc: PWSTR, cchsrc: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DoEnvironmentSubstW(pszsrc.toCPointer<ByteVar>(), cchsrc)

public actual fun DragAcceptFiles(hwnd: HWND, faccept: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DragAcceptFiles(hwnd.toCPointer<ByteVar>(), faccept)
}

public actual fun DragFinish(hdrop: HDROP) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DragFinish(hdrop.toCPointer<ByteVar>())
}

public actual fun DragQueryFileA(hdrop: HDROP, ifile: UInt, lpszfile: PSTR, cch: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DragQueryFileA(hdrop.toCPointer<ByteVar>(), ifile, lpszfile.toCPointer<ByteVar>(), cch)

public actual fun DragQueryFileW(hdrop: HDROP, ifile: UInt, lpszfile: PWSTR, cch: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DragQueryFileW(hdrop.toCPointer<ByteVar>(), ifile, lpszfile.toCPointer<ByteVar>(), cch)

public actual fun DragQueryPoint(hdrop: HDROP, ppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DragQueryPoint(hdrop.toCPointer<ByteVar>(), ppt.toCPointer<ByteVar>())

public actual fun DriveType(idrive: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DriveType(idrive)

public actual fun DuplicateIcon(hinst: HINSTANCE, hicon: HICON): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_DuplicateIcon(hinst.toCPointer<ByteVar>(), hicon.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtractAssociatedIconA(hinst: HINSTANCE, psziconpath: PSTR, piicon: Long): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractAssociatedIconA(hinst.toCPointer<ByteVar>(), psziconpath.toCPointer<ByteVar>(), piicon.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtractAssociatedIconExA(hinst: HINSTANCE, psziconpath: PSTR, piiconindex: Long, piiconid: Long): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractAssociatedIconExA(hinst.toCPointer<ByteVar>(), psziconpath.toCPointer<ByteVar>(), piiconindex.toCPointer<ByteVar>(), piiconid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtractAssociatedIconExW(hinst: HINSTANCE, psziconpath: PWSTR, piiconindex: Long, piiconid: Long): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractAssociatedIconExW(hinst.toCPointer<ByteVar>(), psziconpath.toCPointer<ByteVar>(), piiconindex.toCPointer<ByteVar>(), piiconid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtractAssociatedIconW(hinst: HINSTANCE, psziconpath: PWSTR, piicon: Long): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractAssociatedIconW(hinst.toCPointer<ByteVar>(), psziconpath.toCPointer<ByteVar>(), piicon.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtractIconA(hinst: HINSTANCE, pszexefilename: PCSTR, niconindex: UInt): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractIconA(hinst.toCPointer<ByteVar>(), pszexefilename.toCPointer<ByteVar>(), niconindex)?.toLong() ?: 0L

public actual fun ExtractIconExA(lpszfile: PCSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractIconExA(lpszfile.toCPointer<ByteVar>(), niconindex, phiconlarge.toCPointer<ByteVar>(), phiconsmall.toCPointer<ByteVar>(), nicons)

public actual fun ExtractIconExW(lpszfile: PCWSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractIconExW(lpszfile.toCPointer<ByteVar>(), niconindex, phiconlarge.toCPointer<ByteVar>(), phiconsmall.toCPointer<ByteVar>(), nicons)

public actual fun ExtractIconW(hinst: HINSTANCE, pszexefilename: PCWSTR, niconindex: UInt): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ExtractIconW(hinst.toCPointer<ByteVar>(), pszexefilename.toCPointer<ByteVar>(), niconindex)?.toLong() ?: 0L

public actual fun FindExecutableA(lpfile: PCSTR, lpdirectory: PCSTR, lpresult: PSTR): HINSTANCE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_FindExecutableA(lpfile.toCPointer<ByteVar>(), lpdirectory.toCPointer<ByteVar>(), lpresult.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindExecutableW(lpfile: PCWSTR, lpdirectory: PCWSTR, lpresult: PWSTR): HINSTANCE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_FindExecutableW(lpfile.toCPointer<ByteVar>(), lpdirectory.toCPointer<ByteVar>(), lpresult.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetAcceptLanguagesA(pszlanguages: PSTR, pcchlanguages: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetAcceptLanguagesA(pszlanguages.toCPointer<ByteVar>(), pcchlanguages.toCPointer<ByteVar>())

public actual fun GetAcceptLanguagesW(pszlanguages: PWSTR, pcchlanguages: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetAcceptLanguagesW(pszlanguages.toCPointer<ByteVar>(), pcchlanguages.toCPointer<ByteVar>())

public actual fun GetAllUsersProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryA(lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetAllUsersProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryW(lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetCurrentProcessExplicitAppUserModelID(appid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetCurrentProcessExplicitAppUserModelID(appid.toCPointer<ByteVar>())

public actual fun GetDefaultUserProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryA(lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetDefaultUserProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryW(lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetDpiForShellUIComponent(param0: SHELL_UI_COMPONENT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetDpiForShellUIComponent(param0)

public actual fun GetFileNameFromBrowse(hwnd: HWND, pszfilepath: PWSTR, cchfilepath: UInt, pszworkingdir: PCWSTR, pszdefext: PCWSTR, pszfilters: PCWSTR, psztitle: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetFileNameFromBrowse(hwnd.toCPointer<ByteVar>(), pszfilepath.toCPointer<ByteVar>(), cchfilepath, pszworkingdir.toCPointer<ByteVar>(), pszdefext.toCPointer<ByteVar>(), pszfilters.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>())

public actual fun GetMenuContextHelpId(param0: HMENU): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetMenuContextHelpId(param0.toCPointer<ByteVar>())

public actual fun GetMenuPosFromID(hmenu: HMENU, id: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetMenuPosFromID(hmenu.toCPointer<ByteVar>(), id)

public actual fun GetProfileType(dwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetProfileType(dwflags.toCPointer<ByteVar>())

public actual fun GetProfilesDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetProfilesDirectoryA(lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetProfilesDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetProfilesDirectoryW(lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetScaleFactorForDevice(devicetype: DISPLAY_DEVICE_TYPE): DEVICE_SCALE_FACTOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetScaleFactorForDevice(devicetype)

public actual fun GetScaleFactorForMonitor(hmon: HMONITOR, pscale: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetScaleFactorForMonitor(hmon.toCPointer<ByteVar>(), pscale.toCPointer<ByteVar>())

public actual fun GetUserProfileDirectoryA(htoken: HANDLE, lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetUserProfileDirectoryA(htoken.toCPointer<ByteVar>(), lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetUserProfileDirectoryW(htoken: HANDLE, lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetUserProfileDirectoryW(htoken.toCPointer<ByteVar>(), lpprofiledir.toCPointer<ByteVar>(), lpcchsize.toCPointer<ByteVar>())

public actual fun GetWindowContextHelpId(param0: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetWindowContextHelpId(param0.toCPointer<ByteVar>())

public actual fun GetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, pdwrefdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_GetWindowSubclass(hwnd.toCPointer<ByteVar>(), pfnsubclass.toLong().toCPointer<ByteVar>(), uidsubclass, pdwrefdata.toCPointer<ByteVar>())

public actual fun HMONITOR_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HMONITOR_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMONITOR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HMONITOR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HashData(pbdata: Long, cbdata: UInt, pbhash: Long, cbhash: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HashData(pbdata.toCPointer<ByteVar>(), cbdata, pbhash.toCPointer<ByteVar>(), cbhash)

public actual fun HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: UInt, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkClone(pihl.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), pihlsiteforclone.toCPointer<ByteVar>(), dwsitedata, ppvobj.toCPointer<ByteVar>())

public actual fun HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateBrowseContext(piunkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun HlinkCreateExtensionServices(pwzadditionalheaders: PCWSTR, phwnd: HWND, pszusername: PCWSTR, pszpassword: PCWSTR, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateExtensionServices(pwzadditionalheaders.toCPointer<ByteVar>(), phwnd.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pszpassword.toCPointer<ByteVar>(), piunkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateFromData(pidataobj.toCPointer<ByteVar>(), pihlsite.toCPointer<ByteVar>(), dwsitedata, piunkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateFromMoniker(pimktrgt.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pwzfriendlyname.toCPointer<ByteVar>(), pihlsite.toCPointer<ByteVar>(), dwsitedata, piunkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun HlinkCreateFromString(pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateFromString(pwztarget.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pwzfriendlyname.toCPointer<ByteVar>(), pihlsite.toCPointer<ByteVar>(), dwsitedata, piunkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun HlinkCreateShortcut(grfhlshortcutf: UInt, pihl: Long, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateShortcut(grfhlshortcutf, pihl.toCPointer<ByteVar>(), pwzdir.toCPointer<ByteVar>(), pwzfilename.toCPointer<ByteVar>(), ppwzshortcutfile.toCPointer<ByteVar>(), dwreserved)

public actual fun HlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromMoniker(grfhlshortcutf, pimktarget.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pwzdir.toCPointer<ByteVar>(), pwzfilename.toCPointer<ByteVar>(), ppwzshortcutfile.toCPointer<ByteVar>(), dwreserved)

public actual fun HlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromString(grfhlshortcutf, pwztarget.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pwzdir.toCPointer<ByteVar>(), pwzfilename.toCPointer<ByteVar>(), ppwzshortcutfile.toCPointer<ByteVar>(), dwreserved)

public actual fun HlinkGetSpecialReference(ureference: UInt, ppwzreference: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkGetSpecialReference(ureference, ppwzreference.toCPointer<ByteVar>())

public actual fun HlinkGetValueFromParams(pwzparams: PCWSTR, pwzname: PCWSTR, ppwzvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkGetValueFromParams(pwzparams.toCPointer<ByteVar>(), pwzname.toCPointer<ByteVar>(), ppwzvalue.toCPointer<ByteVar>())

public actual fun HlinkIsShortcut(pwzfilename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkIsShortcut(pwzfilename.toCPointer<ByteVar>())

public actual fun HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: UInt, pbc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkNavigate(pihl.toCPointer<ByteVar>(), pihlframe.toCPointer<ByteVar>(), grfhlnf, pbc.toCPointer<ByteVar>(), pibsc.toCPointer<ByteVar>(), pihlbc.toCPointer<ByteVar>())

public actual fun HlinkNavigateToStringReference(pwztarget: PCWSTR, pwzlocation: PCWSTR, pihlsite: Long, dwsitedata: UInt, pihlframe: Long, grfhlnf: UInt, pibc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkNavigateToStringReference(pwztarget.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pihlsite.toCPointer<ByteVar>(), dwsitedata, pihlframe.toCPointer<ByteVar>(), grfhlnf, pibc.toCPointer<ByteVar>(), pibsc.toCPointer<ByteVar>(), pihlbc.toCPointer<ByteVar>())

public actual fun HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, puhlid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkOnNavigate(pihlframe.toCPointer<ByteVar>(), pihlbc.toCPointer<ByteVar>(), grfhlnf, pimktarget.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pwzfriendlyname.toCPointer<ByteVar>(), puhlid.toCPointer<ByteVar>())

public actual fun HlinkOnRenameDocument(dwreserved: UInt, pihlbc: Long, pimkold: Long, pimknew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkOnRenameDocument(dwreserved, pihlbc.toCPointer<ByteVar>(), pimkold.toCPointer<ByteVar>(), pimknew.toCPointer<ByteVar>())

public actual fun HlinkParseDisplayName(pibc: Long, pwzdisplayname: PCWSTR, fnoforceabs: BOOL, pccheaten: Long, ppimk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkParseDisplayName(pibc.toCPointer<ByteVar>(), pwzdisplayname.toCPointer<ByteVar>(), fnoforceabs, pccheaten.toCPointer<ByteVar>(), ppimk.toCPointer<ByteVar>())

public actual fun HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkPreprocessMoniker(pibc.toCPointer<ByteVar>(), pimkin.toCPointer<ByteVar>(), ppimkout.toCPointer<ByteVar>())

public actual fun HlinkQueryCreateFromData(pidataobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkQueryCreateFromData(pidataobj.toCPointer<ByteVar>())

public actual fun HlinkResolveMonikerForData(pimkreference: Long, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkResolveMonikerForData(pimkreference.toCPointer<ByteVar>(), reserved, pibc.toCPointer<ByteVar>(), cfmtetc, rgfmtetc.toCPointer<ByteVar>(), pibsc.toCPointer<ByteVar>(), pimkbase.toCPointer<ByteVar>())

public actual fun HlinkResolveShortcut(pwzshortcutfilename: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkResolveShortcut(pwzshortcutfilename.toCPointer<ByteVar>(), pihlsite.toCPointer<ByteVar>(), dwsitedata, piunkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun HlinkResolveShortcutToMoniker(pwzshortcutfilename: PCWSTR, ppimktarget: Long, ppwzlocation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkResolveShortcutToMoniker(pwzshortcutfilename.toCPointer<ByteVar>(), ppimktarget.toCPointer<ByteVar>(), ppwzlocation.toCPointer<ByteVar>())

public actual fun HlinkResolveShortcutToString(pwzshortcutfilename: PCWSTR, ppwztarget: Long, ppwzlocation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkResolveShortcutToString(pwzshortcutfilename.toCPointer<ByteVar>(), ppwztarget.toCPointer<ByteVar>(), ppwzlocation.toCPointer<ByteVar>())

public actual fun HlinkResolveStringForData(pwzreference: PCWSTR, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkResolveStringForData(pwzreference.toCPointer<ByteVar>(), reserved, pibc.toCPointer<ByteVar>(), cfmtetc, rgfmtetc.toCPointer<ByteVar>(), pibsc.toCPointer<ByteVar>(), pimkbase.toCPointer<ByteVar>())

public actual fun HlinkSetSpecialReference(ureference: UInt, pwzreference: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkSetSpecialReference(ureference, pwzreference.toCPointer<ByteVar>())

public actual fun HlinkTranslateURL(pwzurl: PCWSTR, grfflags: UInt, ppwztranslatedurl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkTranslateURL(pwzurl.toCPointer<ByteVar>(), grfflags, ppwztranslatedurl.toCPointer<ByteVar>())

public actual fun HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: UInt, pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_HlinkUpdateStackItem(pihlframe.toCPointer<ByteVar>(), pihlbc.toCPointer<ByteVar>(), uhlid, pimktrgt.toCPointer<ByteVar>(), pwzlocation.toCPointer<ByteVar>(), pwzfriendlyname.toCPointer<ByteVar>())

public actual fun ILAppendID(pidl: Long, pmkid: Long, fappend: BOOL): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILAppendID(pidl.toCPointer<ByteVar>(), pmkid.toCPointer<ByteVar>(), fappend)?.toLong() ?: 0L

public actual fun ILClone(pidl: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILClone(pidl.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILCloneFirst(pidl: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILCloneFirst(pidl.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILCombine(pidl1: Long, pidl2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILCombine(pidl1.toCPointer<ByteVar>(), pidl2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILCreateFromPathA(pszpath: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILCreateFromPathA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILCreateFromPathW(pszpath: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILCreateFromPathW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILFindChild(pidlparent: Long, pidlchild: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILFindChild(pidlparent.toCPointer<ByteVar>(), pidlchild.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILFindLastID(pidl: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILFindLastID(pidl.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILFree(pidl: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILFree(pidl.toCPointer<ByteVar>())
}

public actual fun ILGetNext(pidl: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILGetNext(pidl.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ILGetSize(pidl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILGetSize(pidl.toCPointer<ByteVar>())

public actual fun ILIsEqual(pidl1: Long, pidl2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILIsEqual(pidl1.toCPointer<ByteVar>(), pidl2.toCPointer<ByteVar>())

public actual fun ILIsParent(pidl1: Long, pidl2: Long, fimmediate: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILIsParent(pidl1.toCPointer<ByteVar>(), pidl2.toCPointer<ByteVar>(), fimmediate)

public actual fun ILLoadFromStreamEx(pstm: Long, pidl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILLoadFromStreamEx(pstm.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>())

public actual fun ILRemoveLastID(pidl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILRemoveLastID(pidl.toCPointer<ByteVar>())

public actual fun ILSaveToStream(pstm: Long, pidl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ILSaveToStream(pstm.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>())

public actual fun IStream_Copy(pstmfrom: Long, pstmto: Long, cb: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_Copy(pstmfrom.toCPointer<ByteVar>(), pstmto.toCPointer<ByteVar>(), cb)

public actual fun IStream_Read(pstm: Long, pv: Long, cb: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_Read(pstm.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun IStream_ReadPidl(pstm: Long, ppidlout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_ReadPidl(pstm.toCPointer<ByteVar>(), ppidlout.toCPointer<ByteVar>())

public actual fun IStream_ReadStr(pstm: Long, ppsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_ReadStr(pstm.toCPointer<ByteVar>(), ppsz.toCPointer<ByteVar>())

public actual fun IStream_Reset(pstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_Reset(pstm.toCPointer<ByteVar>())

public actual fun IStream_Size(pstm: Long, pui: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_Size(pstm.toCPointer<ByteVar>(), pui.toCPointer<ByteVar>())

public actual fun IStream_Write(pstm: Long, pv: Long, cb: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_Write(pstm.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun IStream_WritePidl(pstm: Long, pidlwrite: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_WritePidl(pstm.toCPointer<ByteVar>(), pidlwrite.toCPointer<ByteVar>())

public actual fun IStream_WriteStr(pstm: Long, psz: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IStream_WriteStr(pstm.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>())

public actual fun IUnknown_AtomicRelease(ppunk: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IUnknown_AtomicRelease(ppunk.toCPointer<ByteVar>())
}

public actual fun IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IUnknown_GetSite(punk.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun IUnknown_GetWindow(punk: Long, phwnd: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IUnknown_GetWindow(punk.toCPointer<ByteVar>(), phwnd.toCPointer<ByteVar>())

public actual fun IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IUnknown_QueryService(punk.toCPointer<ByteVar>(), guidservice.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvout.toCPointer<ByteVar>())

public actual fun IUnknown_Set(ppunk: Long, punk: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IUnknown_Set(ppunk.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>())
}

public actual fun IUnknown_SetSite(punk: Long, punksite: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IUnknown_SetSite(punk.toCPointer<ByteVar>(), punksite.toCPointer<ByteVar>())

public actual fun ImportPrivacySettings(pszfilename: PCWSTR, pfparseprivacypreferences: Long, pfparsepersiterules: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ImportPrivacySettings(pszfilename.toCPointer<ByteVar>(), pfparseprivacypreferences.toCPointer<ByteVar>(), pfparsepersiterules.toCPointer<ByteVar>())

public actual fun InitNetworkAddressControl(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_InitNetworkAddressControl()

public actual fun InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_InitPropVariantFromStrRet(pstrret.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_InitVariantFromStrRet(pstrret.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), pvar.toCPointer<ByteVar>())

public actual fun IntlStrEqWorkerA(fcasesens: BOOL, lpstring1: PCSTR, lpstring2: PCSTR, nchar: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IntlStrEqWorkerA(fcasesens, lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>(), nchar)

public actual fun IntlStrEqWorkerW(fcasesens: BOOL, lpstring1: PCWSTR, lpstring2: PCWSTR, nchar: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IntlStrEqWorkerW(fcasesens, lpstring1.toCPointer<ByteVar>(), lpstring2.toCPointer<ByteVar>(), nchar)

public actual fun IsCharSpaceA(wch: Byte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsCharSpaceA(wch)

public actual fun IsCharSpaceW(wch: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsCharSpaceW(wch)

public actual fun IsInternetESCEnabled(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsInternetESCEnabled()

public actual fun IsLFNDriveA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsLFNDriveA(pszpath.toCPointer<ByteVar>())

public actual fun IsLFNDriveW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsLFNDriveW(pszpath.toCPointer<ByteVar>())

public actual fun IsNetDrive(idrive: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsNetDrive(idrive)

public actual fun IsOS(dwos: OS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsOS(dwos)

public actual fun IsUserAnAdmin(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_IsUserAnAdmin()

public actual fun LoadUserProfileA(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_LoadUserProfileA(htoken.toCPointer<ByteVar>(), lpprofileinfo.toCPointer<ByteVar>())

public actual fun LoadUserProfileW(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_LoadUserProfileW(htoken.toCPointer<ByteVar>(), lpprofileinfo.toCPointer<ByteVar>())

public actual fun OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_OleSaveToStreamEx(piunk.toCPointer<ByteVar>(), pistm.toCPointer<ByteVar>(), fcleardirty)

public actual fun OpenRegStream(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_OpenRegStream(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), grfmode)?.toLong() ?: 0L

public actual fun ParseURLA(pcszurl: PCSTR, ppu: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ParseURLA(pcszurl.toCPointer<ByteVar>(), ppu.toCPointer<ByteVar>())

public actual fun ParseURLW(pcszurl: PCWSTR, ppu: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ParseURLW(pcszurl.toCPointer<ByteVar>(), ppu.toCPointer<ByteVar>())

public actual fun PathAddBackslashA(pszpath: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAddBackslashA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathAddBackslashW(pszpath: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAddBackslashW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathAddExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAddExtensionA(pszpath.toCPointer<ByteVar>(), pszext.toCPointer<ByteVar>())

public actual fun PathAddExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAddExtensionW(pszpath.toCPointer<ByteVar>(), pszext.toCPointer<ByteVar>())

public actual fun PathAllocCanonicalize(pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAllocCanonicalize(pszpathin.toCPointer<ByteVar>(), dwflags, ppszpathout.toCPointer<ByteVar>())

public actual fun PathAllocCombine(pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAllocCombine(pszpathin.toCPointer<ByteVar>(), pszmore.toCPointer<ByteVar>(), dwflags, ppszpathout.toCPointer<ByteVar>())

public actual fun PathAppendA(pszpath: PSTR, pszmore: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAppendA(pszpath.toCPointer<ByteVar>(), pszmore.toCPointer<ByteVar>())

public actual fun PathAppendW(pszpath: PWSTR, pszmore: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathAppendW(pszpath.toCPointer<ByteVar>(), pszmore.toCPointer<ByteVar>())

public actual fun PathBuildRootA(pszroot: PSTR, idrive: Int): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathBuildRootA(pszroot.toCPointer<ByteVar>(), idrive)?.toLong() ?: 0L

public actual fun PathBuildRootW(pszroot: PWSTR, idrive: Int): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathBuildRootW(pszroot.toCPointer<ByteVar>(), idrive)?.toLong() ?: 0L

public actual fun PathCanonicalizeA(pszbuf: PSTR, pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCanonicalizeA(pszbuf.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun PathCanonicalizeW(pszbuf: PWSTR, pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCanonicalizeW(pszbuf.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun PathCchAddBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchAddBackslash(pszpath.toCPointer<ByteVar>(), cchpath)

public actual fun PathCchAddBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchAddBackslashEx(pszpath.toCPointer<ByteVar>(), cchpath, ppszend.toCPointer<ByteVar>(), pcchremaining.toCPointer<ByteVar>())

public actual fun PathCchAddExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchAddExtension(pszpath.toCPointer<ByteVar>(), cchpath, pszext.toCPointer<ByteVar>())

public actual fun PathCchAppend(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchAppend(pszpath.toCPointer<ByteVar>(), cchpath, pszmore.toCPointer<ByteVar>())

public actual fun PathCchAppendEx(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchAppendEx(pszpath.toCPointer<ByteVar>(), cchpath, pszmore.toCPointer<ByteVar>(), dwflags)

public actual fun PathCchCanonicalize(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchCanonicalize(pszpathout.toCPointer<ByteVar>(), cchpathout, pszpathin.toCPointer<ByteVar>())

public actual fun PathCchCanonicalizeEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchCanonicalizeEx(pszpathout.toCPointer<ByteVar>(), cchpathout, pszpathin.toCPointer<ByteVar>(), dwflags)

public actual fun PathCchCombine(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchCombine(pszpathout.toCPointer<ByteVar>(), cchpathout, pszpathin.toCPointer<ByteVar>(), pszmore.toCPointer<ByteVar>())

public actual fun PathCchCombineEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchCombineEx(pszpathout.toCPointer<ByteVar>(), cchpathout, pszpathin.toCPointer<ByteVar>(), pszmore.toCPointer<ByteVar>(), dwflags)

public actual fun PathCchFindExtension(pszpath: PCWSTR, cchpath: ULong, ppszext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchFindExtension(pszpath.toCPointer<ByteVar>(), cchpath, ppszext.toCPointer<ByteVar>())

public actual fun PathCchIsRoot(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchIsRoot(pszpath.toCPointer<ByteVar>())

public actual fun PathCchRemoveBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchRemoveBackslash(pszpath.toCPointer<ByteVar>(), cchpath)

public actual fun PathCchRemoveBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchRemoveBackslashEx(pszpath.toCPointer<ByteVar>(), cchpath, ppszend.toCPointer<ByteVar>(), pcchremaining.toCPointer<ByteVar>())

public actual fun PathCchRemoveExtension(pszpath: PWSTR, cchpath: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchRemoveExtension(pszpath.toCPointer<ByteVar>(), cchpath)

public actual fun PathCchRemoveFileSpec(pszpath: PWSTR, cchpath: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchRemoveFileSpec(pszpath.toCPointer<ByteVar>(), cchpath)

public actual fun PathCchRenameExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchRenameExtension(pszpath.toCPointer<ByteVar>(), cchpath, pszext.toCPointer<ByteVar>())

public actual fun PathCchSkipRoot(pszpath: PCWSTR, ppszrootend: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchSkipRoot(pszpath.toCPointer<ByteVar>(), ppszrootend.toCPointer<ByteVar>())

public actual fun PathCchStripPrefix(pszpath: PWSTR, cchpath: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchStripPrefix(pszpath.toCPointer<ByteVar>(), cchpath)

public actual fun PathCchStripToRoot(pszpath: PWSTR, cchpath: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCchStripToRoot(pszpath.toCPointer<ByteVar>(), cchpath)

public actual fun PathCleanupSpec(pszdir: PCWSTR, pszspec: PWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCleanupSpec(pszdir.toCPointer<ByteVar>(), pszspec.toCPointer<ByteVar>())

public actual fun PathCombineA(pszdest: PSTR, pszdir: PCSTR, pszfile: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCombineA(pszdest.toCPointer<ByteVar>(), pszdir.toCPointer<ByteVar>(), pszfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathCombineW(pszdest: PWSTR, pszdir: PCWSTR, pszfile: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCombineW(pszdest.toCPointer<ByteVar>(), pszdir.toCPointer<ByteVar>(), pszfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathCommonPrefixA(pszfile1: PCSTR, pszfile2: PCSTR, achpath: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCommonPrefixA(pszfile1.toCPointer<ByteVar>(), pszfile2.toCPointer<ByteVar>(), achpath.toCPointer<ByteVar>())

public actual fun PathCommonPrefixW(pszfile1: PCWSTR, pszfile2: PCWSTR, achpath: PWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCommonPrefixW(pszfile1.toCPointer<ByteVar>(), pszfile2.toCPointer<ByteVar>(), achpath.toCPointer<ByteVar>())

public actual fun PathCompactPathA(hdc: HDC, pszpath: PSTR, dx: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCompactPathA(hdc.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dx)

public actual fun PathCompactPathExA(pszout: PSTR, pszsrc: PCSTR, cchmax: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCompactPathExA(pszout.toCPointer<ByteVar>(), pszsrc.toCPointer<ByteVar>(), cchmax, dwflags)

public actual fun PathCompactPathExW(pszout: PWSTR, pszsrc: PCWSTR, cchmax: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCompactPathExW(pszout.toCPointer<ByteVar>(), pszsrc.toCPointer<ByteVar>(), cchmax, dwflags)

public actual fun PathCompactPathW(hdc: HDC, pszpath: PWSTR, dx: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCompactPathW(hdc.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dx)

public actual fun PathCreateFromUrlA(pszurl: PCSTR, pszpath: PSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCreateFromUrlA(pszurl.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), pcchpath.toCPointer<ByteVar>(), dwflags)

public actual fun PathCreateFromUrlAlloc(pszin: PCWSTR, ppszout: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCreateFromUrlAlloc(pszin.toCPointer<ByteVar>(), ppszout.toCPointer<ByteVar>(), dwflags)

public actual fun PathCreateFromUrlW(pszurl: PCWSTR, pszpath: PWSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathCreateFromUrlW(pszurl.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), pcchpath.toCPointer<ByteVar>(), dwflags)

public actual fun PathFileExistsA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFileExistsA(pszpath.toCPointer<ByteVar>())

public actual fun PathFileExistsW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFileExistsW(pszpath.toCPointer<ByteVar>())

public actual fun PathFindExtensionA(pszpath: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindExtensionA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathFindExtensionW(pszpath: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindExtensionW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathFindFileNameA(pszpath: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindFileNameA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathFindFileNameW(pszpath: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindFileNameW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathFindNextComponentA(pszpath: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindNextComponentA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathFindNextComponentW(pszpath: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindNextComponentW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathFindOnPathA(pszpath: PSTR, ppszotherdirs: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindOnPathA(pszpath.toCPointer<ByteVar>(), ppszotherdirs.toCPointer<ByteVar>())

public actual fun PathFindOnPathW(pszpath: PWSTR, ppszotherdirs: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindOnPathW(pszpath.toCPointer<ByteVar>(), ppszotherdirs.toCPointer<ByteVar>())

public actual fun PathFindSuffixArrayA(pszpath: PCSTR, apszsuffix: Long, iarraysize: Int): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindSuffixArrayA(pszpath.toCPointer<ByteVar>(), apszsuffix.toCPointer<ByteVar>(), iarraysize)?.toLong() ?: 0L

public actual fun PathFindSuffixArrayW(pszpath: PCWSTR, apszsuffix: Long, iarraysize: Int): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathFindSuffixArrayW(pszpath.toCPointer<ByteVar>(), apszsuffix.toCPointer<ByteVar>(), iarraysize)?.toLong() ?: 0L

public actual fun PathGetArgsA(pszpath: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetArgsA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathGetArgsW(pszpath: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetArgsW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathGetCharTypeA(ch: UByte): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetCharTypeA(ch)

public actual fun PathGetCharTypeW(ch: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetCharTypeW(ch)

public actual fun PathGetDriveNumberA(pszpath: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetDriveNumberA(pszpath.toCPointer<ByteVar>())

public actual fun PathGetDriveNumberW(pszpath: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetDriveNumberW(pszpath.toCPointer<ByteVar>())

public actual fun PathGetShortPath(pszlongpath: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathGetShortPath(pszlongpath.toCPointer<ByteVar>())
}

public actual fun PathIsContentTypeA(pszpath: PCSTR, pszcontenttype: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsContentTypeA(pszpath.toCPointer<ByteVar>(), pszcontenttype.toCPointer<ByteVar>())

public actual fun PathIsContentTypeW(pszpath: PCWSTR, pszcontenttype: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsContentTypeW(pszpath.toCPointer<ByteVar>(), pszcontenttype.toCPointer<ByteVar>())

public actual fun PathIsDirectoryA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsDirectoryA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsDirectoryEmptyA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsDirectoryEmptyW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsDirectoryW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsDirectoryW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsExe(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsExe(pszpath.toCPointer<ByteVar>())

public actual fun PathIsFileSpecA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsFileSpecA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsFileSpecW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsFileSpecW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsLFNFileSpecA(pszname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsLFNFileSpecA(pszname.toCPointer<ByteVar>())

public actual fun PathIsLFNFileSpecW(pszname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsLFNFileSpecW(pszname.toCPointer<ByteVar>())

public actual fun PathIsNetworkPathA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsNetworkPathA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsNetworkPathW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsNetworkPathW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsPrefixA(pszprefix: PCSTR, pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsPrefixA(pszprefix.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun PathIsPrefixW(pszprefix: PCWSTR, pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsPrefixW(pszprefix.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun PathIsRelativeA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsRelativeA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsRelativeW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsRelativeW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsRootA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsRootA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsRootW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsRootW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsSameRootA(pszpath1: PCSTR, pszpath2: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsSameRootA(pszpath1.toCPointer<ByteVar>(), pszpath2.toCPointer<ByteVar>())

public actual fun PathIsSameRootW(pszpath1: PCWSTR, pszpath2: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsSameRootW(pszpath1.toCPointer<ByteVar>(), pszpath2.toCPointer<ByteVar>())

public actual fun PathIsSlowA(pszfile: PCSTR, dwattr: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsSlowA(pszfile.toCPointer<ByteVar>(), dwattr)

public actual fun PathIsSlowW(pszfile: PCWSTR, dwattr: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsSlowW(pszfile.toCPointer<ByteVar>(), dwattr)

public actual fun PathIsSystemFolderA(pszpath: PCSTR, dwattrb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsSystemFolderA(pszpath.toCPointer<ByteVar>(), dwattrb)

public actual fun PathIsSystemFolderW(pszpath: PCWSTR, dwattrb: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsSystemFolderW(pszpath.toCPointer<ByteVar>(), dwattrb)

public actual fun PathIsUNCA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsUNCEx(pszpath: PCWSTR, ppszserver: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCEx(pszpath.toCPointer<ByteVar>(), ppszserver.toCPointer<ByteVar>())

public actual fun PathIsUNCServerA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCServerA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsUNCServerShareA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCServerShareA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsUNCServerShareW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCServerShareW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsUNCServerW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCServerW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsUNCW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsUNCW(pszpath.toCPointer<ByteVar>())

public actual fun PathIsURLA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsURLA(pszpath.toCPointer<ByteVar>())

public actual fun PathIsURLW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathIsURLW(pszpath.toCPointer<ByteVar>())

public actual fun PathMakePrettyA(pszpath: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMakePrettyA(pszpath.toCPointer<ByteVar>())

public actual fun PathMakePrettyW(pszpath: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMakePrettyW(pszpath.toCPointer<ByteVar>())

public actual fun PathMakeSystemFolderA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMakeSystemFolderA(pszpath.toCPointer<ByteVar>())

public actual fun PathMakeSystemFolderW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMakeSystemFolderW(pszpath.toCPointer<ByteVar>())

public actual fun PathMakeUniqueName(pszuniquename: PWSTR, cchmax: UInt, psztemplate: PCWSTR, pszlongplate: PCWSTR, pszdir: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMakeUniqueName(pszuniquename.toCPointer<ByteVar>(), cchmax, psztemplate.toCPointer<ByteVar>(), pszlongplate.toCPointer<ByteVar>(), pszdir.toCPointer<ByteVar>())

public actual fun PathMatchSpecA(pszfile: PCSTR, pszspec: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMatchSpecA(pszfile.toCPointer<ByteVar>(), pszspec.toCPointer<ByteVar>())

public actual fun PathMatchSpecExA(pszfile: PCSTR, pszspec: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMatchSpecExA(pszfile.toCPointer<ByteVar>(), pszspec.toCPointer<ByteVar>(), dwflags)

public actual fun PathMatchSpecExW(pszfile: PCWSTR, pszspec: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMatchSpecExW(pszfile.toCPointer<ByteVar>(), pszspec.toCPointer<ByteVar>(), dwflags)

public actual fun PathMatchSpecW(pszfile: PCWSTR, pszspec: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathMatchSpecW(pszfile.toCPointer<ByteVar>(), pszspec.toCPointer<ByteVar>())

public actual fun PathParseIconLocationA(psziconfile: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathParseIconLocationA(psziconfile.toCPointer<ByteVar>())

public actual fun PathParseIconLocationW(psziconfile: PWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathParseIconLocationW(psziconfile.toCPointer<ByteVar>())

public actual fun PathQualify(psz: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathQualify(psz.toCPointer<ByteVar>())
}

public actual fun PathQuoteSpacesA(lpsz: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathQuoteSpacesA(lpsz.toCPointer<ByteVar>())

public actual fun PathQuoteSpacesW(lpsz: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathQuoteSpacesW(lpsz.toCPointer<ByteVar>())

public actual fun PathRelativePathToA(pszpath: PSTR, pszfrom: PCSTR, dwattrfrom: UInt, pszto: PCSTR, dwattrto: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRelativePathToA(pszpath.toCPointer<ByteVar>(), pszfrom.toCPointer<ByteVar>(), dwattrfrom, pszto.toCPointer<ByteVar>(), dwattrto)

public actual fun PathRelativePathToW(pszpath: PWSTR, pszfrom: PCWSTR, dwattrfrom: UInt, pszto: PCWSTR, dwattrto: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRelativePathToW(pszpath.toCPointer<ByteVar>(), pszfrom.toCPointer<ByteVar>(), dwattrfrom, pszto.toCPointer<ByteVar>(), dwattrto)

public actual fun PathRemoveArgsA(pszpath: PSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveArgsA(pszpath.toCPointer<ByteVar>())
}

public actual fun PathRemoveArgsW(pszpath: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveArgsW(pszpath.toCPointer<ByteVar>())
}

public actual fun PathRemoveBackslashA(pszpath: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveBackslashA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathRemoveBackslashW(pszpath: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveBackslashW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathRemoveBlanksA(pszpath: PSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveBlanksA(pszpath.toCPointer<ByteVar>())
}

public actual fun PathRemoveBlanksW(pszpath: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveBlanksW(pszpath.toCPointer<ByteVar>())
}

public actual fun PathRemoveExtensionA(pszpath: PSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveExtensionA(pszpath.toCPointer<ByteVar>())
}

public actual fun PathRemoveExtensionW(pszpath: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveExtensionW(pszpath.toCPointer<ByteVar>())
}

public actual fun PathRemoveFileSpecA(pszpath: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveFileSpecA(pszpath.toCPointer<ByteVar>())

public actual fun PathRemoveFileSpecW(pszpath: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRemoveFileSpecW(pszpath.toCPointer<ByteVar>())

public actual fun PathRenameExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRenameExtensionA(pszpath.toCPointer<ByteVar>(), pszext.toCPointer<ByteVar>())

public actual fun PathRenameExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathRenameExtensionW(pszpath.toCPointer<ByteVar>(), pszext.toCPointer<ByteVar>())

public actual fun PathResolve(pszpath: PWSTR, dirs: Long, fflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathResolve(pszpath.toCPointer<ByteVar>(), dirs.toCPointer<ByteVar>(), fflags)

public actual fun PathSearchAndQualifyA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathSearchAndQualifyA(pszpath.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun PathSearchAndQualifyW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathSearchAndQualifyW(pszpath.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun PathSetDlgItemPathA(hdlg: HWND, id: Int, pszpath: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathSetDlgItemPathA(hdlg.toCPointer<ByteVar>(), id, pszpath.toCPointer<ByteVar>())
}

public actual fun PathSetDlgItemPathW(hdlg: HWND, id: Int, pszpath: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathSetDlgItemPathW(hdlg.toCPointer<ByteVar>(), id, pszpath.toCPointer<ByteVar>())
}

public actual fun PathSkipRootA(pszpath: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathSkipRootA(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathSkipRootW(pszpath: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathSkipRootW(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PathStripPathA(pszpath: PSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathStripPathA(pszpath.toCPointer<ByteVar>())
}

public actual fun PathStripPathW(pszpath: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathStripPathW(pszpath.toCPointer<ByteVar>())
}

public actual fun PathStripToRootA(pszpath: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathStripToRootA(pszpath.toCPointer<ByteVar>())

public actual fun PathStripToRootW(pszpath: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathStripToRootW(pszpath.toCPointer<ByteVar>())

public actual fun PathUnExpandEnvStringsA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsA(pszpath.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun PathUnExpandEnvStringsW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsW(pszpath.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun PathUndecorateA(pszpath: PSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUndecorateA(pszpath.toCPointer<ByteVar>())
}

public actual fun PathUndecorateW(pszpath: PWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUndecorateW(pszpath.toCPointer<ByteVar>())
}

public actual fun PathUnmakeSystemFolderA(pszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderA(pszpath.toCPointer<ByteVar>())

public actual fun PathUnmakeSystemFolderW(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderW(pszpath.toCPointer<ByteVar>())

public actual fun PathUnquoteSpacesA(lpsz: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUnquoteSpacesA(lpsz.toCPointer<ByteVar>())

public actual fun PathUnquoteSpacesW(lpsz: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathUnquoteSpacesW(lpsz.toCPointer<ByteVar>())

public actual fun PathYetAnotherMakeUniqueName(pszuniquename: PWSTR, pszpath: PCWSTR, pszshort: PCWSTR, pszfilespec: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PathYetAnotherMakeUniqueName(pszuniquename.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), pszshort.toCPointer<ByteVar>(), pszfilespec.toCPointer<ByteVar>())

public actual fun PickIconDlg(hwnd: HWND, psziconpath: PWSTR, cchiconpath: UInt, piiconindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PickIconDlg(hwnd.toCPointer<ByteVar>(), psziconpath.toCPointer<ByteVar>(), cchiconpath, piiconindex.toCPointer<ByteVar>())

public actual fun PropVariantToStrRet(propvar: Long, pstrret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_PropVariantToStrRet(propvar.toCPointer<ByteVar>(), pstrret.toCPointer<ByteVar>())

public actual fun QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_QISearch(that.toCPointer<ByteVar>(), pqit.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun ReadCabinetState(pcs: Long, clength: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ReadCabinetState(pcs.toCPointer<ByteVar>(), clength)

public actual fun RealDriveType(idrive: Int, foktohitnet: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RealDriveType(idrive, foktohitnet)

public actual fun RegisterAppConstrainedChangeNotification(routine: PAPPCONSTRAIN_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RegisterAppConstrainedChangeNotification(routine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), registration.toCPointer<ByteVar>())

public actual fun RegisterAppStateChangeNotification(routine: PAPPSTATE_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RegisterAppStateChangeNotification(routine.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), registration.toCPointer<ByteVar>())

public actual fun RegisterScaleChangeEvent(hevent: HANDLE, pdwcookie: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RegisterScaleChangeEvent(hevent.toCPointer<ByteVar>(), pdwcookie.toCPointer<ByteVar>())

public actual fun RegisterScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, hwndnotify: HWND, umsgnotify: UInt, pdwcookie: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RegisterScaleChangeNotifications(displaydevice, hwndnotify.toCPointer<ByteVar>(), umsgnotify, pdwcookie.toCPointer<ByteVar>())

public actual fun RemoveWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RemoveWindowSubclass(hwnd.toCPointer<ByteVar>(), pfnsubclass.toLong().toCPointer<ByteVar>(), uidsubclass)

public actual fun RestartDialog(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RestartDialog(hwnd.toCPointer<ByteVar>(), pszprompt.toCPointer<ByteVar>(), dwreturn)

public actual fun RestartDialogEx(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt, dwreasoncode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RestartDialogEx(hwnd.toCPointer<ByteVar>(), pszprompt.toCPointer<ByteVar>(), dwreturn, dwreasoncode)

public actual fun RevokeScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, dwcookie: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_RevokeScaleChangeNotifications(displaydevice, dwcookie)

public actual fun SHAddFromPropSheetExtArray(hpsxa: HPSXA, lpfnaddpage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHAddToRecentDocs(uflags: UInt, pv: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAddToRecentDocs(uflags, pv.toCPointer<ByteVar>())
}

public actual fun SHAlloc(cb: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAlloc(cb)?.toLong() ?: 0L

public actual fun SHAllocShared(pvdata: Long, dwsize: UInt, dwprocessid: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAllocShared(pvdata.toCPointer<ByteVar>(), dwsize, dwprocessid)?.toLong() ?: 0L

public actual fun SHAnsiToAnsi(pszsrc: PCSTR, pszdst: PSTR, cchbuf: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAnsiToAnsi(pszsrc.toCPointer<ByteVar>(), pszdst.toCPointer<ByteVar>(), cchbuf)

public actual fun SHAnsiToUnicode(pszsrc: PCSTR, pwszdst: PWSTR, cwchbuf: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAnsiToUnicode(pszsrc.toCPointer<ByteVar>(), pwszdst.toCPointer<ByteVar>(), cwchbuf)

public actual fun SHAppBarMessage(dwmessage: UInt, pdata: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAppBarMessage(dwmessage, pdata.toCPointer<ByteVar>())

public actual fun SHAssocEnumHandlers(pszextra: PCWSTR, affilter: ASSOC_FILTER, ppenumhandler: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAssocEnumHandlers(pszextra.toCPointer<ByteVar>(), affilter, ppenumhandler.toCPointer<ByteVar>())

public actual fun SHAssocEnumHandlersForProtocolByApplication(protocol: PCWSTR, riid: Long, enumhandlers: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAssocEnumHandlersForProtocolByApplication(protocol.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), enumhandlers.toCPointer<ByteVar>())

public actual fun SHAutoComplete(hwndedit: HWND, dwflags: SHELL_AUTOCOMPLETE_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHAutoComplete(hwndedit.toCPointer<ByteVar>(), dwflags)

public actual fun SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHBindToFolderIDListParent(psfroot.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>(), ppidllast.toCPointer<ByteVar>())

public actual fun SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHBindToFolderIDListParentEx(psfroot.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), ppbc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>(), ppidllast.toCPointer<ByteVar>())

public actual fun SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHBindToObject(psf.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHBindToParent(pidl.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>(), ppidllast.toCPointer<ByteVar>())

public actual fun SHBrowseForFolderA(lpbi: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHBrowseForFolderA(lpbi.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SHBrowseForFolderW(lpbi: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHBrowseForFolderW(lpbi.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SHCLSIDFromString(psz: PCWSTR, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCLSIDFromString(psz.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun SHChangeNotification_Lock(hchange: HANDLE, dwprocid: UInt, pppidl: Long, plevent: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHChangeNotification_Lock(hchange.toCPointer<ByteVar>(), dwprocid, pppidl.toCPointer<ByteVar>(), plevent.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SHChangeNotification_Unlock(hlock: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHChangeNotification_Unlock(hlock.toCPointer<ByteVar>())

public actual fun SHChangeNotify(weventid: Int, uflags: SHCNF_FLAGS, dwitem1: Long, dwitem2: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHChangeNotify(weventid, uflags, dwitem1.toCPointer<ByteVar>(), dwitem2.toCPointer<ByteVar>())
}

public actual fun SHChangeNotifyDeregister(ulid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHChangeNotifyDeregister(ulid)

public actual fun SHChangeNotifyRegister(hwnd: HWND, fsources: SHCNRF_SOURCE, fevents: Int, wmsg: UInt, centries: Int, pshcne: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHChangeNotifyRegister(hwnd.toCPointer<ByteVar>(), fsources, fevents, wmsg, centries, pshcne.toCPointer<ByteVar>())

public actual fun SHChangeNotifyRegisterThread(status: SCNRT_STATUS) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHChangeNotifyRegisterThread(status)
}

public actual fun SHCloneSpecialIDList(hwnd: HWND, csidl: Int, fcreate: BOOL): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCloneSpecialIDList(hwnd.toCPointer<ByteVar>(), csidl, fcreate)?.toLong() ?: 0L

public actual fun SHCoCreateInstance(pszclsid: PCWSTR, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCoCreateInstance(pszclsid.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCopyKeyA(hkeysrc: HKEY, pszsrcsubkey: PCSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCopyKeyA(hkeysrc.toCPointer<ByteVar>(), pszsrcsubkey.toCPointer<ByteVar>(), hkeydest.toCPointer<ByteVar>(), freserved)

public actual fun SHCopyKeyW(hkeysrc: HKEY, pszsrcsubkey: PCWSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCopyKeyW(hkeysrc.toCPointer<ByteVar>(), pszsrcsubkey.toCPointer<ByteVar>(), hkeydest.toCPointer<ByteVar>(), freserved)

public actual fun SHCreateAssociationRegistration(riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateAssociationRegistration(riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateDataObject(pidlfolder: Long, cidl: UInt, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDataObject(pidlfolder.toCPointer<ByteVar>(), cidl, apidl.toCPointer<ByteVar>(), pdtinner.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDefaultContextMenu(pdcm.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateDefaultExtractIcon(riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDefaultExtractIcon(riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDefaultPropertiesOp(psi.toCPointer<ByteVar>(), ppfileop.toCPointer<ByteVar>())

public actual fun SHCreateDirectory(hwnd: HWND, pszpath: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDirectory(hwnd.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun SHCreateDirectoryExA(hwnd: HWND, pszpath: PCSTR, psa: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDirectoryExA(hwnd.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>())

public actual fun SHCreateDirectoryExW(hwnd: HWND, pszpath: PCWSTR, psa: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateDirectoryExW(hwnd.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), psa.toCPointer<ByteVar>())

public actual fun SHCreateFileExtractIconW(pszfile: PCWSTR, dwfileattributes: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateFileExtractIconW(pszfile.toCPointer<ByteVar>(), dwfileattributes, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateItemFromIDList(pidl.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateItemFromParsingName(pszpath: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateItemFromParsingName(pszpath.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateItemFromRelativeName(psiparent: Long, pszname: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateItemFromRelativeName(psiparent.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateItemInKnownFolder(kfid: Long, dwkfflags: UInt, pszitem: PCWSTR, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateItemInKnownFolder(kfid.toCPointer<ByteVar>(), dwkfflags, pszitem.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateItemWithParent(pidlparent.toCPointer<ByteVar>(), psfparent.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvitem.toCPointer<ByteVar>())

public actual fun SHCreateMemStream(pinit: Long, cbinit: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateMemStream(pinit.toCPointer<ByteVar>(), cbinit)?.toLong() ?: 0L

public actual fun SHCreateProcessAsUserW(pscpi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateProcessAsUserW(pscpi.toCPointer<ByteVar>())

public actual fun SHCreatePropSheetExtArray(hkey: HKEY, pszsubkey: PCWSTR, max_iface: UInt): HPSXA =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreatePropSheetExtArray(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), max_iface)?.toLong() ?: 0L

public actual fun SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateQueryCancelAutoPlayMoniker(ppmoniker.toCPointer<ByteVar>())

public actual fun SHCreateShellFolderView(pcsfv: Long, ppsv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellFolderView(pcsfv.toCPointer<ByteVar>(), ppsv.toCPointer<ByteVar>())

public actual fun SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellFolderViewEx(pcsfv.toCPointer<ByteVar>(), ppsv.toCPointer<ByteVar>())

public actual fun SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellItem(pidlparent.toCPointer<ByteVar>(), psfparent.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), ppsi.toCPointer<ByteVar>())

public actual fun SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: UInt, ppidl: Long, ppsiitemarray: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellItemArray(pidlparent.toCPointer<ByteVar>(), psf.toCPointer<ByteVar>(), cidl, ppidl.toCPointer<ByteVar>(), ppsiitemarray.toCPointer<ByteVar>())

public actual fun SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromDataObject(pdo.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: Long, ppsiitemarray: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromIDLists(cidl, rgpidl.toCPointer<ByteVar>(), ppsiitemarray.toCPointer<ByteVar>())

public actual fun SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromShellItem(psi.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHCreateShellPalette(hdc: HDC): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateShellPalette(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SHCreateStdEnumFmtEtc(cfmt: UInt, afmt: Long, ppenumformatetc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateStdEnumFmtEtc(cfmt, afmt.toCPointer<ByteVar>(), ppenumformatetc.toCPointer<ByteVar>())

public actual fun SHCreateStreamOnFileA(pszfile: PCSTR, grfmode: UInt, ppstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileA(pszfile.toCPointer<ByteVar>(), grfmode, ppstm.toCPointer<ByteVar>())

public actual fun SHCreateStreamOnFileEx(pszfile: PCWSTR, grfmode: UInt, dwattributes: UInt, fcreate: BOOL, pstmtemplate: Long, ppstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileEx(pszfile.toCPointer<ByteVar>(), grfmode, dwattributes, fcreate, pstmtemplate.toCPointer<ByteVar>(), ppstm.toCPointer<ByteVar>())

public actual fun SHCreateStreamOnFileW(pszfile: PCWSTR, grfmode: UInt, ppstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileW(pszfile.toCPointer<ByteVar>(), grfmode, ppstm.toCPointer<ByteVar>())

public actual fun SHCreateThread(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE): BOOL =
    0

public actual fun SHCreateThreadRef(pcref: Long, ppunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHCreateThreadRef(pcref.toCPointer<ByteVar>(), ppunk.toCPointer<ByteVar>())

public actual fun SHCreateThreadWithHandle(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE, phandle: Long): BOOL =
    0

public actual fun SHDefExtractIconA(psziconfile: PCSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDefExtractIconA(psziconfile.toCPointer<ByteVar>(), iindex, uflags, phiconlarge.toCPointer<ByteVar>(), phiconsmall.toCPointer<ByteVar>(), niconsize)

public actual fun SHDefExtractIconW(psziconfile: PCWSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDefExtractIconW(psziconfile.toCPointer<ByteVar>(), iindex, uflags, phiconlarge.toCPointer<ByteVar>(), phiconsmall.toCPointer<ByteVar>(), niconsize)

public actual fun SHDeleteEmptyKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>())

public actual fun SHDeleteEmptyKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>())

public actual fun SHDeleteKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDeleteKeyA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>())

public actual fun SHDeleteKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDeleteKeyW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>())

public actual fun SHDeleteValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDeleteValueA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>())

public actual fun SHDeleteValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDeleteValueW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>())

public actual fun SHDestroyPropSheetExtArray(hpsxa: HPSXA) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDestroyPropSheetExtArray(hpsxa.toCPointer<ByteVar>())
}

public actual fun SHDoDragDrop(hwnd: HWND, pdata: Long, pdsrc: Long, dweffect: DROPEFFECT, pdweffect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHDoDragDrop(hwnd.toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>(), pdsrc.toCPointer<ByteVar>(), dweffect, pdweffect.toCPointer<ByteVar>())

public actual fun SHEmptyRecycleBinA(hwnd: HWND, pszrootpath: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEmptyRecycleBinA(hwnd.toCPointer<ByteVar>(), pszrootpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHEmptyRecycleBinW(hwnd: HWND, pszrootpath: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEmptyRecycleBinW(hwnd.toCPointer<ByteVar>(), pszrootpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHEnumKeyExA(hkey: HKEY, dwindex: UInt, pszname: PSTR, pcchname: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEnumKeyExA(hkey.toCPointer<ByteVar>(), dwindex, pszname.toCPointer<ByteVar>(), pcchname.toCPointer<ByteVar>())

public actual fun SHEnumKeyExW(hkey: HKEY, dwindex: UInt, pszname: PWSTR, pcchname: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEnumKeyExW(hkey.toCPointer<ByteVar>(), dwindex, pszname.toCPointer<ByteVar>(), pcchname.toCPointer<ByteVar>())

public actual fun SHEnumValueA(hkey: HKEY, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEnumValueA(hkey.toCPointer<ByteVar>(), dwindex, pszvaluename.toCPointer<ByteVar>(), pcchvaluename.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHEnumValueW(hkey: HKEY, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEnumValueW(hkey.toCPointer<ByteVar>(), dwindex, pszvaluename.toCPointer<ByteVar>(), pcchvaluename.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHEnumerateUnreadMailAccountsW(hkeyuser: HKEY, dwindex: UInt, pszmailaddress: PWSTR, cchmailaddress: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEnumerateUnreadMailAccountsW(hkeyuser.toCPointer<ByteVar>(), dwindex, pszmailaddress.toCPointer<ByteVar>(), cchmailaddress)

public actual fun SHEvaluateSystemCommandTemplate(pszcmdtemplate: PCWSTR, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHEvaluateSystemCommandTemplate(pszcmdtemplate.toCPointer<ByteVar>(), ppszapplication.toCPointer<ByteVar>(), ppszcommandline.toCPointer<ByteVar>(), ppszparameters.toCPointer<ByteVar>())

public actual fun SHFileOperationA(lpfileop: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFileOperationA(lpfileop.toCPointer<ByteVar>())

public actual fun SHFileOperationW(lpfileop: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFileOperationW(lpfileop.toCPointer<ByteVar>())

public actual fun SHFindFiles(pidlfolder: Long, pidlsavefile: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFindFiles(pidlfolder.toCPointer<ByteVar>(), pidlsavefile.toCPointer<ByteVar>())

public actual fun SHFind_InitMenuPopup(hmenu: HMENU, hwndowner: HWND, idcmdfirst: UInt, idcmdlast: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFind_InitMenuPopup(hmenu.toCPointer<ByteVar>(), hwndowner.toCPointer<ByteVar>(), idcmdfirst, idcmdlast)?.toLong() ?: 0L

public actual fun SHFlushSFCache() {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFlushSFCache()
}

public actual fun SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: PSTR, cchbuf: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFormatDateTimeA(pft.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: PWSTR, cchbuf: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFormatDateTimeW(pft.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun SHFormatDrive(hwnd: HWND, drive: UInt, fmtid: SHFMT_ID, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFormatDrive(hwnd.toCPointer<ByteVar>(), drive, fmtid, options)

public actual fun SHFree(pv: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFree(pv.toCPointer<ByteVar>())
}

public actual fun SHFreeNameMappings(hnamemappings: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFreeNameMappings(hnamemappings.toCPointer<ByteVar>())
}

public actual fun SHFreeShared(hdata: HANDLE, dwprocessid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHFreeShared(hdata.toCPointer<ByteVar>(), dwprocessid)

public actual fun SHGetAttributesFromDataObject(pdo: Long, dwattributemask: UInt, pdwattributes: Long, pcitems: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetAttributesFromDataObject(pdo.toCPointer<ByteVar>(), dwattributemask, pdwattributes.toCPointer<ByteVar>(), pcitems.toCPointer<ByteVar>())

public actual fun SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetDataFromIDListA(psf.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), nformat, pv.toCPointer<ByteVar>(), cb)

public actual fun SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetDataFromIDListW(psf.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), nformat, pv.toCPointer<ByteVar>(), cb)

public actual fun SHGetDesktopFolder(ppshf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetDesktopFolder(ppshf.toCPointer<ByteVar>())

public actual fun SHGetDiskFreeSpaceExA(pszdirectoryname: PCSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExA(pszdirectoryname.toCPointer<ByteVar>(), pulfreebytesavailabletocaller.toCPointer<ByteVar>(), pultotalnumberofbytes.toCPointer<ByteVar>(), pultotalnumberoffreebytes.toCPointer<ByteVar>())

public actual fun SHGetDiskFreeSpaceExW(pszdirectoryname: PCWSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExW(pszdirectoryname.toCPointer<ByteVar>(), pulfreebytesavailabletocaller.toCPointer<ByteVar>(), pultotalnumberofbytes.toCPointer<ByteVar>(), pultotalnumberoffreebytes.toCPointer<ByteVar>())

public actual fun SHGetDriveMedia(pszdrive: PCWSTR, pdwmediacontent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetDriveMedia(pszdrive.toCPointer<ByteVar>(), pdwmediacontent.toCPointer<ByteVar>())

public actual fun SHGetFileInfoA(pszpath: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFileInfoA(pszpath.toCPointer<ByteVar>(), dwfileattributes, psfi.toCPointer<ByteVar>(), cbfileinfo, uflags)

public actual fun SHGetFileInfoW(pszpath: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFileInfoW(pszpath.toCPointer<ByteVar>(), dwfileattributes, psfi.toCPointer<ByteVar>(), cbfileinfo, uflags)

public actual fun SHGetFolderLocation(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, ppidl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFolderLocation(hwnd.toCPointer<ByteVar>(), csidl, htoken.toCPointer<ByteVar>(), dwflags, ppidl.toCPointer<ByteVar>())

public actual fun SHGetFolderPathA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFolderPathA(hwnd.toCPointer<ByteVar>(), csidl, htoken.toCPointer<ByteVar>(), dwflags, pszpath.toCPointer<ByteVar>())

public actual fun SHGetFolderPathAndSubDirA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCSTR, pszpath: PSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirA(hwnd.toCPointer<ByteVar>(), csidl, htoken.toCPointer<ByteVar>(), dwflags, pszsubdir.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun SHGetFolderPathAndSubDirW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCWSTR, pszpath: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirW(hwnd.toCPointer<ByteVar>(), csidl, htoken.toCPointer<ByteVar>(), dwflags, pszsubdir.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun SHGetFolderPathW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetFolderPathW(hwnd.toCPointer<ByteVar>(), csidl, htoken.toCPointer<ByteVar>(), dwflags, pszpath.toCPointer<ByteVar>())

public actual fun SHGetIDListFromObject(punk: Long, ppidl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetIDListFromObject(punk.toCPointer<ByteVar>(), ppidl.toCPointer<ByteVar>())

public actual fun SHGetIconOverlayIndexA(psziconpath: PCSTR, iiconindex: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexA(psziconpath.toCPointer<ByteVar>(), iiconindex)

public actual fun SHGetIconOverlayIndexW(psziconpath: PCWSTR, iiconindex: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexW(psziconpath.toCPointer<ByteVar>(), iiconindex)

public actual fun SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetImageList(iimagelist, riid.toCPointer<ByteVar>(), ppvobj.toCPointer<ByteVar>())

public actual fun SHGetInstanceExplorer(ppunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetInstanceExplorer(ppunk.toCPointer<ByteVar>())

public actual fun SHGetInverseCMAP(pbmap: Long, cbmap: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetInverseCMAP(pbmap.toCPointer<ByteVar>(), cbmap)

public actual fun SHGetItemFromDataObject(pdtobj: Long, dwflags: DATAOBJ_GET_ITEM_FLAGS, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetItemFromDataObject(pdtobj.toCPointer<ByteVar>(), dwflags, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetItemFromObject(punk.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHGetKnownFolderIDList(rfid: Long, dwflags: UInt, htoken: HANDLE, ppidl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetKnownFolderIDList(rfid.toCPointer<ByteVar>(), dwflags, htoken.toCPointer<ByteVar>(), ppidl.toCPointer<ByteVar>())

public actual fun SHGetKnownFolderItem(rfid: Long, flags: KNOWN_FOLDER_FLAG, htoken: HANDLE, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetKnownFolderItem(rfid.toCPointer<ByteVar>(), flags, htoken.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHGetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, ppszpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetKnownFolderPath(rfid.toCPointer<ByteVar>(), dwflags, htoken.toCPointer<ByteVar>(), ppszpath.toCPointer<ByteVar>())

public actual fun SHGetLocalizedName(pszpath: PCWSTR, pszresmodule: PWSTR, cch: UInt, pidsres: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetLocalizedName(pszpath.toCPointer<ByteVar>(), pszresmodule.toCPointer<ByteVar>(), cch, pidsres.toCPointer<ByteVar>())

public actual fun SHGetMalloc(ppmalloc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetMalloc(ppmalloc.toCPointer<ByteVar>())

public actual fun SHGetNameFromIDList(pidl: Long, sigdnname: SIGDN, ppszname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetNameFromIDList(pidl.toCPointer<ByteVar>(), sigdnname, ppszname.toCPointer<ByteVar>())

public actual fun SHGetNewLinkInfoA(pszlinkto: PCSTR, pszdir: PCSTR, pszname: PSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetNewLinkInfoA(pszlinkto.toCPointer<ByteVar>(), pszdir.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), pfmustcopy.toCPointer<ByteVar>(), uflags)

public actual fun SHGetNewLinkInfoW(pszlinkto: PCWSTR, pszdir: PCWSTR, pszname: PWSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetNewLinkInfoW(pszlinkto.toCPointer<ByteVar>(), pszdir.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), pfmustcopy.toCPointer<ByteVar>(), uflags)

public actual fun SHGetPathFromIDListA(pidl: Long, pszpath: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetPathFromIDListA(pidl.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun SHGetPathFromIDListEx(pidl: Long, pszpath: PWSTR, cchpath: UInt, uopts: GPFIDL_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetPathFromIDListEx(pidl.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), cchpath, uopts)

public actual fun SHGetPathFromIDListW(pidl: Long, pszpath: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetPathFromIDListW(pidl.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetRealIDL(psf.toCPointer<ByteVar>(), pidlsimple.toCPointer<ByteVar>(), ppidlreal.toCPointer<ByteVar>())

public actual fun SHGetSetFolderCustomSettings(pfcs: Long, pszpath: PCWSTR, dwreadwrite: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetSetFolderCustomSettings(pfcs.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dwreadwrite)

public actual fun SHGetSetSettings(lpss: Long, dwmask: SSF_MASK, bset: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetSetSettings(lpss.toCPointer<ByteVar>(), dwmask, bset)
}

public actual fun SHGetSettings(psfs: Long, dwmask: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetSettings(psfs.toCPointer<ByteVar>(), dwmask)
}

public actual fun SHGetSpecialFolderLocation(hwnd: HWND, csidl: Int, ppidl: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetSpecialFolderLocation(hwnd.toCPointer<ByteVar>(), csidl, ppidl.toCPointer<ByteVar>())

public actual fun SHGetSpecialFolderPathA(hwnd: HWND, pszpath: PSTR, csidl: Int, fcreate: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathA(hwnd.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), csidl, fcreate)

public actual fun SHGetSpecialFolderPathW(hwnd: HWND, pszpath: PWSTR, csidl: Int, fcreate: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathW(hwnd.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), csidl, fcreate)

public actual fun SHGetStockIconInfo(siid: SHSTOCKICONID, uflags: SHGSI_FLAGS, psii: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetStockIconInfo(siid, uflags, psii.toCPointer<ByteVar>())

public actual fun SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetTemporaryPropertyForItem(psi.toCPointer<ByteVar>(), propkey.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun SHGetThreadRef(ppunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetThreadRef(ppunk.toCPointer<ByteVar>())

public actual fun SHGetUnreadMailCountW(hkeyuser: HKEY, pszmailaddress: PCWSTR, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: PWSTR, cchshellexecutecommand: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetUnreadMailCountW(hkeyuser.toCPointer<ByteVar>(), pszmailaddress.toCPointer<ByteVar>(), pdwcount.toCPointer<ByteVar>(), pfiletime.toCPointer<ByteVar>(), pszshellexecutecommand.toCPointer<ByteVar>(), cchshellexecutecommand)

public actual fun SHGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetValueA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetValueW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHGetViewStatePropertyBag(pidl: Long, pszbagname: PCWSTR, dwflags: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGetViewStatePropertyBag(pidl.toCPointer<ByteVar>(), pszbagname.toCPointer<ByteVar>(), dwflags, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun SHGlobalCounterDecrement(id: SHGLOBALCOUNTER): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGlobalCounterDecrement(id)

public actual fun SHGlobalCounterGetValue(id: SHGLOBALCOUNTER): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGlobalCounterGetValue(id)

public actual fun SHGlobalCounterIncrement(id: SHGLOBALCOUNTER): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHGlobalCounterIncrement(id)

public actual fun SHHandleUpdateImage(pidlextra: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHHandleUpdateImage(pidlextra.toCPointer<ByteVar>())

public actual fun SHILCreateFromPath(pszpath: PCWSTR, ppidl: Long, rgfinout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHILCreateFromPath(pszpath.toCPointer<ByteVar>(), ppidl.toCPointer<ByteVar>(), rgfinout.toCPointer<ByteVar>())

public actual fun SHInvokePrinterCommandA(hwnd: HWND, uaction: UInt, lpbuf1: PCSTR, lpbuf2: PCSTR, fmodal: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHInvokePrinterCommandA(hwnd.toCPointer<ByteVar>(), uaction, lpbuf1.toCPointer<ByteVar>(), lpbuf2.toCPointer<ByteVar>(), fmodal)

public actual fun SHInvokePrinterCommandW(hwnd: HWND, uaction: UInt, lpbuf1: PCWSTR, lpbuf2: PCWSTR, fmodal: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHInvokePrinterCommandW(hwnd.toCPointer<ByteVar>(), uaction, lpbuf1.toCPointer<ByteVar>(), lpbuf2.toCPointer<ByteVar>(), fmodal)

public actual fun SHIsFileAvailableOffline(pwszpath: PCWSTR, pdwstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHIsFileAvailableOffline(pwszpath.toCPointer<ByteVar>(), pdwstatus.toCPointer<ByteVar>())

public actual fun SHIsLowMemoryMachine(dwtype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHIsLowMemoryMachine(dwtype)

public actual fun SHLimitInputEdit(hwndedit: HWND, psf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHLimitInputEdit(hwndedit.toCPointer<ByteVar>(), psf.toCPointer<ByteVar>())

public actual fun SHLoadInProc(rclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHLoadInProc(rclsid.toCPointer<ByteVar>())

public actual fun SHLoadIndirectString(pszsource: PCWSTR, pszoutbuf: PWSTR, cchoutbuf: UInt, ppvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHLoadIndirectString(pszsource.toCPointer<ByteVar>(), pszoutbuf.toCPointer<ByteVar>(), cchoutbuf, ppvreserved.toCPointer<ByteVar>())

public actual fun SHLoadNonloadedIconOverlayIdentifiers(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHLoadNonloadedIconOverlayIdentifiers()

public actual fun SHLockShared(hdata: HANDLE, dwprocessid: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHLockShared(hdata.toCPointer<ByteVar>(), dwprocessid)?.toLong() ?: 0L

public actual fun SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHMapPIDLToSystemImageListIndex(pshf.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), piindexsel.toCPointer<ByteVar>())

public actual fun SHMessageBoxCheckA(hwnd: HWND, psztext: PCSTR, pszcaption: PCSTR, utype: UInt, idefault: Int, pszregval: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHMessageBoxCheckA(hwnd.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), pszcaption.toCPointer<ByteVar>(), utype, idefault, pszregval.toCPointer<ByteVar>())

public actual fun SHMessageBoxCheckW(hwnd: HWND, psztext: PCWSTR, pszcaption: PCWSTR, utype: UInt, idefault: Int, pszregval: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHMessageBoxCheckW(hwnd.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), pszcaption.toCPointer<ByteVar>(), utype, idefault, pszregval.toCPointer<ByteVar>())

public actual fun SHMultiFileProperties(pdtobj: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHMultiFileProperties(pdtobj.toCPointer<ByteVar>(), dwflags)

public actual fun SHObjectProperties(hwnd: HWND, shopobjecttype: UInt, pszobjectname: PCWSTR, pszpropertypage: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHObjectProperties(hwnd.toCPointer<ByteVar>(), shopobjecttype, pszobjectname.toCPointer<ByteVar>(), pszpropertypage.toCPointer<ByteVar>())

public actual fun SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: UInt, apidl: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenFolderAndSelectItems(pidlfolder.toCPointer<ByteVar>(), cidl, apidl.toCPointer<ByteVar>(), dwflags)

public actual fun SHOpenPropSheetW(pszcaption: PCWSTR, ahkeys: Long, ckeys: UInt, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenPropSheetW(pszcaption.toCPointer<ByteVar>(), ahkeys.toCPointer<ByteVar>(), ckeys, pclsiddefault.toCPointer<ByteVar>(), pdtobj.toCPointer<ByteVar>(), psb.toCPointer<ByteVar>(), pstartpage.toCPointer<ByteVar>())

public actual fun SHOpenRegStream2A(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenRegStream2A(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), grfmode)?.toLong() ?: 0L

public actual fun SHOpenRegStream2W(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenRegStream2W(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), grfmode)?.toLong() ?: 0L

public actual fun SHOpenRegStreamA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenRegStreamA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), grfmode)?.toLong() ?: 0L

public actual fun SHOpenRegStreamW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenRegStreamW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), grfmode)?.toLong() ?: 0L

public actual fun SHOpenWithDialog(hwndparent: HWND, poainfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHOpenWithDialog(hwndparent.toCPointer<ByteVar>(), poainfo.toCPointer<ByteVar>())

public actual fun SHParseDisplayName(pszname: PCWSTR, pbc: Long, ppidl: Long, sfgaoin: UInt, psfgaoout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHParseDisplayName(pszname.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), ppidl.toCPointer<ByteVar>(), sfgaoin, psfgaoout.toCPointer<ByteVar>())

public actual fun SHPathPrepareForWriteA(hwnd: HWND, punkenablemodless: Long, pszpath: PCSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHPathPrepareForWriteA(hwnd.toCPointer<ByteVar>(), punkenablemodless.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHPathPrepareForWriteW(hwnd: HWND, punkenablemodless: Long, pszpath: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHPathPrepareForWriteW(hwnd.toCPointer<ByteVar>(), punkenablemodless.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHQueryInfoKeyA(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryInfoKeyA(hkey.toCPointer<ByteVar>(), pcsubkeys.toCPointer<ByteVar>(), pcchmaxsubkeylen.toCPointer<ByteVar>(), pcvalues.toCPointer<ByteVar>(), pcchmaxvaluenamelen.toCPointer<ByteVar>())

public actual fun SHQueryInfoKeyW(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryInfoKeyW(hkey.toCPointer<ByteVar>(), pcsubkeys.toCPointer<ByteVar>(), pcchmaxsubkeylen.toCPointer<ByteVar>(), pcvalues.toCPointer<ByteVar>(), pcchmaxvaluenamelen.toCPointer<ByteVar>())

public actual fun SHQueryRecycleBinA(pszrootpath: PCSTR, pshqueryrbinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryRecycleBinA(pszrootpath.toCPointer<ByteVar>(), pshqueryrbinfo.toCPointer<ByteVar>())

public actual fun SHQueryRecycleBinW(pszrootpath: PCWSTR, pshqueryrbinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryRecycleBinW(pszrootpath.toCPointer<ByteVar>(), pshqueryrbinfo.toCPointer<ByteVar>())

public actual fun SHQueryUserNotificationState(pquns: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryUserNotificationState(pquns.toCPointer<ByteVar>())

public actual fun SHQueryValueExA(hkey: HKEY, pszvalue: PCSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryValueExA(hkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pdwreserved.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHQueryValueExW(hkey: HKEY, pszvalue: PCWSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHQueryValueExW(hkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pdwreserved.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHRegCloseUSKey(huskey: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegCloseUSKey(huskey)

public actual fun SHRegCreateUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegCreateUSKeyA(pszpath.toCPointer<ByteVar>(), samdesired, hrelativeuskey, phnewuskey.toCPointer<ByteVar>(), dwflags)

public actual fun SHRegCreateUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegCreateUSKeyW(pwzpath.toCPointer<ByteVar>(), samdesired, hrelativeuskey, phnewuskey.toCPointer<ByteVar>(), dwflags)

public actual fun SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyA(huskey, pszsubkey.toCPointer<ByteVar>(), delregflags)

public actual fun SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyW(huskey, pwzsubkey.toCPointer<ByteVar>(), delregflags)

public actual fun SHRegDeleteUSValueA(huskey: Long, pszvalue: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegDeleteUSValueA(huskey, pszvalue.toCPointer<ByteVar>(), delregflags)

public actual fun SHRegDeleteUSValueW(huskey: Long, pwzvalue: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegDeleteUSValueW(huskey, pwzvalue.toCPointer<ByteVar>(), delregflags)

public actual fun SHRegDuplicateHKey(hkey: HKEY): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegDuplicateHKey(hkey.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: PSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegEnumUSKeyA(huskey, dwindex, pszname.toCPointer<ByteVar>(), pcchname.toCPointer<ByteVar>(), enumregflags)

public actual fun SHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: PWSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegEnumUSKeyW(huskey, dwindex, pwzname.toCPointer<ByteVar>(), pcchname.toCPointer<ByteVar>(), enumregflags)

public actual fun SHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegEnumUSValueA(huskey, dwindex, pszvaluename.toCPointer<ByteVar>(), pcchvaluename.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), enumregflags)

public actual fun SHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegEnumUSValueW(huskey, dwindex, pszvaluename.toCPointer<ByteVar>(), pcchvaluename.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), enumregflags)

public actual fun SHRegGetBoolUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueA(pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), fignorehkcu, fdefault)

public actual fun SHRegGetBoolUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueW(pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), fignorehkcu, fdefault)

public actual fun SHRegGetIntW(hk: HKEY, pwzkey: PCWSTR, idefault: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetIntW(hk.toCPointer<ByteVar>(), pwzkey.toCPointer<ByteVar>(), idefault)

public actual fun SHRegGetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pszpath: PSTR, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetPathA(hkey.toCPointer<ByteVar>(), pcszsubkey.toCPointer<ByteVar>(), pcszvalue.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHRegGetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pszpath: PWSTR, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetPathW(hkey.toCPointer<ByteVar>(), pcszsubkey.toCPointer<ByteVar>(), pcszvalue.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHRegGetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetUSValueA(pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), fignorehkcu, pvdefaultdata.toCPointer<ByteVar>(), dwdefaultdatasize)

public actual fun SHRegGetUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetUSValueW(pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), fignorehkcu, pvdefaultdata.toCPointer<ByteVar>(), dwdefaultdatasize)

public actual fun SHRegGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetValueA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), srrfflags, pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHRegGetValueFromHKCUHKLM(pwszkey: PCWSTR, pwszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetValueFromHKCUHKLM(pwszkey.toCPointer<ByteVar>(), pwszvalue.toCPointer<ByteVar>(), srrfflags, pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHRegGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegGetValueW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), srrfflags, pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun SHRegOpenUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegOpenUSKeyA(pszpath.toCPointer<ByteVar>(), samdesired, hrelativeuskey, phnewuskey.toCPointer<ByteVar>(), fignorehkcu)

public actual fun SHRegOpenUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegOpenUSKeyW(pwzpath.toCPointer<ByteVar>(), samdesired, hrelativeuskey, phnewuskey.toCPointer<ByteVar>(), fignorehkcu)

public actual fun SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyA(huskey, pcsubkeys.toCPointer<ByteVar>(), pcchmaxsubkeylen.toCPointer<ByteVar>(), pcvalues.toCPointer<ByteVar>(), pcchmaxvaluenamelen.toCPointer<ByteVar>(), enumregflags)

public actual fun SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyW(huskey, pcsubkeys.toCPointer<ByteVar>(), pcchmaxsubkeylen.toCPointer<ByteVar>(), pcvalues.toCPointer<ByteVar>(), pcchmaxvaluenamelen.toCPointer<ByteVar>(), enumregflags)

public actual fun SHRegQueryUSValueA(huskey: Long, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegQueryUSValueA(huskey, pszvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), fignorehkcu, pvdefaultdata.toCPointer<ByteVar>(), dwdefaultdatasize)

public actual fun SHRegQueryUSValueW(huskey: Long, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegQueryUSValueW(huskey, pszvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>(), fignorehkcu, pvdefaultdata.toCPointer<ByteVar>(), dwdefaultdatasize)

public actual fun SHRegSetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pcszpath: PCSTR, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegSetPathA(hkey.toCPointer<ByteVar>(), pcszsubkey.toCPointer<ByteVar>(), pcszvalue.toCPointer<ByteVar>(), pcszpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHRegSetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pcszpath: PCWSTR, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegSetPathW(hkey.toCPointer<ByteVar>(), pcszsubkey.toCPointer<ByteVar>(), pcszvalue.toCPointer<ByteVar>(), pcszpath.toCPointer<ByteVar>(), dwflags)

public actual fun SHRegSetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegSetUSValueA(pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), dwtype, pvdata.toCPointer<ByteVar>(), cbdata, dwflags)

public actual fun SHRegSetUSValueW(pwzsubkey: PCWSTR, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegSetUSValueW(pwzsubkey.toCPointer<ByteVar>(), pwzvalue.toCPointer<ByteVar>(), dwtype, pvdata.toCPointer<ByteVar>(), cbdata, dwflags)

public actual fun SHRegWriteUSValueA(huskey: Long, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegWriteUSValueA(huskey, pszvalue.toCPointer<ByteVar>(), dwtype, pvdata.toCPointer<ByteVar>(), cbdata, dwflags)

public actual fun SHRegWriteUSValueW(huskey: Long, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRegWriteUSValueW(huskey, pwzvalue.toCPointer<ByteVar>(), dwtype, pvdata.toCPointer<ByteVar>(), cbdata, dwflags)

public actual fun SHReleaseThreadRef(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHReleaseThreadRef()

public actual fun SHRemoveLocalizedName(pszpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRemoveLocalizedName(pszpath.toCPointer<ByteVar>())

public actual fun SHReplaceFromPropSheetExtArray(hpsxa: HPSXA, upageid: UInt, lpfnreplacewith: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHResolveLibrary(psilibrary: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHResolveLibrary(psilibrary.toCPointer<ByteVar>())

public actual fun SHRestricted(rest: RESTRICTIONS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHRestricted(rest)

public actual fun SHSendMessageBroadcastA(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSendMessageBroadcastA(umsg, wparam, lparam)

public actual fun SHSendMessageBroadcastW(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSendMessageBroadcastW(umsg, wparam, lparam)

public actual fun SHSetDefaultProperties(hwnd: HWND, psi: Long, dwfileopflags: UInt, pfops: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetDefaultProperties(hwnd.toCPointer<ByteVar>(), psi.toCPointer<ByteVar>(), dwfileopflags, pfops.toCPointer<ByteVar>())

public actual fun SHSetFolderPathA(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetFolderPathA(csidl, htoken.toCPointer<ByteVar>(), dwflags, pszpath.toCPointer<ByteVar>())

public actual fun SHSetFolderPathW(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetFolderPathW(csidl, htoken.toCPointer<ByteVar>(), dwflags, pszpath.toCPointer<ByteVar>())

public actual fun SHSetInstanceExplorer(punk: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetInstanceExplorer(punk.toCPointer<ByteVar>())
}

public actual fun SHSetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, pszpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetKnownFolderPath(rfid.toCPointer<ByteVar>(), dwflags, htoken.toCPointer<ByteVar>(), pszpath.toCPointer<ByteVar>())

public actual fun SHSetLocalizedName(pszpath: PCWSTR, pszresmodule: PCWSTR, idsres: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetLocalizedName(pszpath.toCPointer<ByteVar>(), pszresmodule.toCPointer<ByteVar>(), idsres)

public actual fun SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetTemporaryPropertyForItem(psi.toCPointer<ByteVar>(), propkey.toCPointer<ByteVar>(), propvar.toCPointer<ByteVar>())

public actual fun SHSetThreadRef(punk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetThreadRef(punk.toCPointer<ByteVar>())

public actual fun SHSetUnreadMailCountW(pszmailaddress: PCWSTR, dwcount: UInt, pszshellexecutecommand: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetUnreadMailCountW(pszmailaddress.toCPointer<ByteVar>(), dwcount, pszshellexecutecommand.toCPointer<ByteVar>())

public actual fun SHSetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetValueA(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), dwtype, pvdata.toCPointer<ByteVar>(), cbdata)

public actual fun SHSetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSetValueW(hkey.toCPointer<ByteVar>(), pszsubkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), dwtype, pvdata.toCPointer<ByteVar>(), cbdata)

public actual fun SHShellFolderView_Message(hwndmain: HWND, umsg: UInt, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHShellFolderView_Message(hwndmain.toCPointer<ByteVar>(), umsg, lparam)

public actual fun SHShowManageLibraryUI(psilibrary: Long, hwndowner: HWND, psztitle: PCWSTR, pszinstruction: PCWSTR, lmdoptions: LIBRARYMANAGEDIALOGOPTIONS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHShowManageLibraryUI(psilibrary.toCPointer<ByteVar>(), hwndowner.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>(), pszinstruction.toCPointer<ByteVar>(), lmdoptions)

public actual fun SHSimpleIDListFromPath(pszpath: PCWSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSimpleIDListFromPath(pszpath.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SHSkipJunction(pbc: Long, pclsid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHSkipJunction(pbc.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun SHStartNetConnectionDialogW(hwnd: HWND, pszremotename: PCWSTR, dwtype: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHStartNetConnectionDialogW(hwnd.toCPointer<ByteVar>(), pszremotename.toCPointer<ByteVar>(), dwtype)

public actual fun SHStrDupA(psz: PCSTR, ppwsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHStrDupA(psz.toCPointer<ByteVar>(), ppwsz.toCPointer<ByteVar>())

public actual fun SHStrDupW(psz: PCWSTR, ppwsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHStrDupW(psz.toCPointer<ByteVar>(), ppwsz.toCPointer<ByteVar>())

public actual fun SHStripMneumonicA(pszmenu: PSTR): Byte =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHStripMneumonicA(pszmenu.toCPointer<ByteVar>())

public actual fun SHStripMneumonicW(pszmenu: PWSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHStripMneumonicW(pszmenu.toCPointer<ByteVar>())

public actual fun SHTestTokenMembership(htoken: HANDLE, ulrid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHTestTokenMembership(htoken.toCPointer<ByteVar>(), ulrid)

public actual fun SHUnicodeToAnsi(pwszsrc: PCWSTR, pszdst: PSTR, cchbuf: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHUnicodeToAnsi(pwszsrc.toCPointer<ByteVar>(), pszdst.toCPointer<ByteVar>(), cchbuf)

public actual fun SHUnicodeToUnicode(pwzsrc: PCWSTR, pwzdst: PWSTR, cwchbuf: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHUnicodeToUnicode(pwzsrc.toCPointer<ByteVar>(), pwzdst.toCPointer<ByteVar>(), cwchbuf)

public actual fun SHUnlockShared(pvdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHUnlockShared(pvdata.toCPointer<ByteVar>())

public actual fun SHUpdateImageA(pszhashitem: PCSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHUpdateImageA(pszhashitem.toCPointer<ByteVar>(), iindex, uflags, iimageindex)
}

public actual fun SHUpdateImageW(pszhashitem: PCWSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHUpdateImageW(pszhashitem.toCPointer<ByteVar>(), iindex, uflags, iimageindex)
}

public actual fun SHValidateUNC(hwndowner: HWND, pszfile: PWSTR, fconnect: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SHValidateUNC(hwndowner.toCPointer<ByteVar>(), pszfile.toCPointer<ByteVar>(), fconnect)

public actual fun SetCurrentProcessExplicitAppUserModelID(appid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SetCurrentProcessExplicitAppUserModelID(appid.toCPointer<ByteVar>())

public actual fun SetMenuContextHelpId(param0: HMENU, param1: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SetMenuContextHelpId(param0.toCPointer<ByteVar>(), param1)

public actual fun SetWindowContextHelpId(param0: HWND, param1: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SetWindowContextHelpId(param0.toCPointer<ByteVar>(), param1)

public actual fun SetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, dwrefdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SetWindowSubclass(hwnd.toCPointer<ByteVar>(), pfnsubclass.toLong().toCPointer<ByteVar>(), uidsubclass, dwrefdata)

public actual fun ShellAboutA(hwnd: HWND, szapp: PCSTR, szotherstuff: PCSTR, hicon: HICON): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ShellAboutA(hwnd.toCPointer<ByteVar>(), szapp.toCPointer<ByteVar>(), szotherstuff.toCPointer<ByteVar>(), hicon.toCPointer<ByteVar>())

public actual fun ShellAboutW(hwnd: HWND, szapp: PCWSTR, szotherstuff: PCWSTR, hicon: HICON): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ShellAboutW(hwnd.toCPointer<ByteVar>(), szapp.toCPointer<ByteVar>(), szotherstuff.toCPointer<ByteVar>(), hicon.toCPointer<ByteVar>())

public actual fun ShellExecuteA(hwnd: HWND, lpoperation: PCSTR, lpfile: PCSTR, lpparameters: PCSTR, lpdirectory: PCSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ShellExecuteA(hwnd.toCPointer<ByteVar>(), lpoperation.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), lpparameters.toCPointer<ByteVar>(), lpdirectory.toCPointer<ByteVar>(), nshowcmd)?.toLong() ?: 0L

public actual fun ShellExecuteExA(pexecinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ShellExecuteExA(pexecinfo.toCPointer<ByteVar>())

public actual fun ShellExecuteExW(pexecinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ShellExecuteExW(pexecinfo.toCPointer<ByteVar>())

public actual fun ShellExecuteW(hwnd: HWND, lpoperation: PCWSTR, lpfile: PCWSTR, lpparameters: PCWSTR, lpdirectory: PCWSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_ShellExecuteW(hwnd.toCPointer<ByteVar>(), lpoperation.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), lpparameters.toCPointer<ByteVar>(), lpdirectory.toCPointer<ByteVar>(), nshowcmd)?.toLong() ?: 0L

public actual fun ShellMessageBoxA(happinst: HINSTANCE, hwnd: HWND, lpctext: PCSTR, lpctitle: PCSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun ShellMessageBoxW(happinst: HINSTANCE, hwnd: HWND, lpctext: PCWSTR, lpctitle: PCWSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun Shell_GetCachedImageIndex(pwsziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndex(pwsziconpath.toCPointer<ByteVar>(), iiconindex, uiconflags)

public actual fun Shell_GetCachedImageIndexA(psziconpath: PCSTR, iiconindex: Int, uiconflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexA(psziconpath.toCPointer<ByteVar>(), iiconindex, uiconflags)

public actual fun Shell_GetCachedImageIndexW(psziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexW(psziconpath.toCPointer<ByteVar>(), iiconindex, uiconflags)

public actual fun Shell_GetImageLists(phiml: Long, phimlsmall: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_GetImageLists(phiml.toCPointer<ByteVar>(), phimlsmall.toCPointer<ByteVar>())

public actual fun Shell_MergeMenus(hmdst: HMENU, hmsrc: HMENU, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MM_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_MergeMenus(hmdst.toCPointer<ByteVar>(), hmsrc.toCPointer<ByteVar>(), uinsert, uidadjust, uidadjustmax, uflags)

public actual fun Shell_NotifyIconA(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_NotifyIconA(dwmessage, lpdata.toCPointer<ByteVar>())

public actual fun Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_NotifyIconGetRect(identifier.toCPointer<ByteVar>(), iconlocation.toCPointer<ByteVar>())

public actual fun Shell_NotifyIconW(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Shell_NotifyIconW(dwmessage, lpdata.toCPointer<ByteVar>())

public actual fun SignalFileOpen(pidl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SignalFileOpen(pidl.toCPointer<ByteVar>())

public actual fun SoftwareUpdateMessageBox(hwnd: HWND, pszdistunit: PCWSTR, dwflags: UInt, psdi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_SoftwareUpdateMessageBox(hwnd.toCPointer<ByteVar>(), pszdistunit.toCPointer<ByteVar>(), dwflags, psdi.toCPointer<ByteVar>())

public actual fun StgMakeUniqueName(pstgparent: Long, pszfilespec: PCWSTR, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StgMakeUniqueName(pstgparent.toCPointer<ByteVar>(), pszfilespec.toCPointer<ByteVar>(), grfmode, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun StrCSpnA(pszstr: PCSTR, pszset: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCSpnA(pszstr.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())

public actual fun StrCSpnIA(pszstr: PCSTR, pszset: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCSpnIA(pszstr.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())

public actual fun StrCSpnIW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCSpnIW(pszstr.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())

public actual fun StrCSpnW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCSpnW(pszstr.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())

public actual fun StrCatBuffA(pszdest: PSTR, pszsrc: PCSTR, cchdestbuffsize: Int): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCatBuffA(pszdest.toCPointer<ByteVar>(), pszsrc.toCPointer<ByteVar>(), cchdestbuffsize)?.toLong() ?: 0L

public actual fun StrCatBuffW(pszdest: PWSTR, pszsrc: PCWSTR, cchdestbuffsize: Int): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCatBuffW(pszdest.toCPointer<ByteVar>(), pszsrc.toCPointer<ByteVar>(), cchdestbuffsize)?.toLong() ?: 0L

public actual fun StrCatChainW(pszdst: PWSTR, cchdst: UInt, ichat: UInt, pszsrc: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCatChainW(pszdst.toCPointer<ByteVar>(), cchdst, ichat, pszsrc.toCPointer<ByteVar>())

public actual fun StrCatW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCatW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrChrA(pszstart: PCSTR, wmatch: UShort): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrChrA(pszstart.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrChrIA(pszstart: PCSTR, wmatch: UShort): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrChrIA(pszstart.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrChrIW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrChrIW(pszstart.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrChrNIW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrChrNIW(pszstart.toCPointer<ByteVar>(), wmatch, cchmax)?.toLong() ?: 0L

public actual fun StrChrNW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrChrNW(pszstart.toCPointer<ByteVar>(), wmatch, cchmax)?.toLong() ?: 0L

public actual fun StrChrW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrChrW(pszstart.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrCmpCA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpCA(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>())

public actual fun StrCmpCW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpCW(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>())

public actual fun StrCmpICA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpICA(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>())

public actual fun StrCmpICW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpICW(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>())

public actual fun StrCmpIW(psz1: PCWSTR, psz2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpIW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>())

public actual fun StrCmpLogicalW(psz1: PCWSTR, psz2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpLogicalW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>())

public actual fun StrCmpNA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNA(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNCA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNCA(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNCW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNCW(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNIA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNIA(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNICA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNICA(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNICW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNICW(pszstr1.toCPointer<ByteVar>(), pszstr2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNIW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNIW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpNW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpNW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), nchar)

public actual fun StrCmpW(psz1: PCWSTR, psz2: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCmpW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>())

public actual fun StrCpyNW(pszdst: PWSTR, pszsrc: PCWSTR, cchmax: Int): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCpyNW(pszdst.toCPointer<ByteVar>(), pszsrc.toCPointer<ByteVar>(), cchmax)?.toLong() ?: 0L

public actual fun StrCpyW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrCpyW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrDupA(pszsrch: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrDupA(pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrDupW(pszsrch: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrDupW(pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrFormatByteSize64A(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFormatByteSize64A(qdw, pszbuf.toCPointer<ByteVar>(), cchbuf)?.toLong() ?: 0L

public actual fun StrFormatByteSizeA(dw: UInt, pszbuf: PSTR, cchbuf: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFormatByteSizeA(dw, pszbuf.toCPointer<ByteVar>(), cchbuf)?.toLong() ?: 0L

public actual fun StrFormatByteSizeEx(ull: ULong, flags: SFBS_FLAGS, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFormatByteSizeEx(ull, flags, pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun StrFormatByteSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFormatByteSizeW(qdw, pszbuf.toCPointer<ByteVar>(), cchbuf)?.toLong() ?: 0L

public actual fun StrFormatKBSizeA(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFormatKBSizeA(qdw, pszbuf.toCPointer<ByteVar>(), cchbuf)?.toLong() ?: 0L

public actual fun StrFormatKBSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFormatKBSizeW(qdw, pszbuf.toCPointer<ByteVar>(), cchbuf)?.toLong() ?: 0L

public actual fun StrFromTimeIntervalA(pszout: PSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFromTimeIntervalA(pszout.toCPointer<ByteVar>(), cchmax, dwtimems, digits)

public actual fun StrFromTimeIntervalW(pszout: PWSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrFromTimeIntervalW(pszout.toCPointer<ByteVar>(), cchmax, dwtimems, digits)

public actual fun StrIsIntlEqualA(fcasesens: BOOL, pszstring1: PCSTR, pszstring2: PCSTR, nchar: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrIsIntlEqualA(fcasesens, pszstring1.toCPointer<ByteVar>(), pszstring2.toCPointer<ByteVar>(), nchar)

public actual fun StrIsIntlEqualW(fcasesens: BOOL, pszstring1: PCWSTR, pszstring2: PCWSTR, nchar: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrIsIntlEqualW(fcasesens, pszstring1.toCPointer<ByteVar>(), pszstring2.toCPointer<ByteVar>(), nchar)

public actual fun StrNCatA(psz1: PSTR, psz2: PCSTR, cchmax: Int): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrNCatA(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), cchmax)?.toLong() ?: 0L

public actual fun StrNCatW(psz1: PWSTR, psz2: PCWSTR, cchmax: Int): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrNCatW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), cchmax)?.toLong() ?: 0L

public actual fun StrPBrkA(psz: PCSTR, pszset: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrPBrkA(psz.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrPBrkW(psz: PCWSTR, pszset: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrPBrkW(psz.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrRChrA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRChrA(pszstart.toCPointer<ByteVar>(), pszend.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrRChrIA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRChrIA(pszstart.toCPointer<ByteVar>(), pszend.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrRChrIW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRChrIW(pszstart.toCPointer<ByteVar>(), pszend.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrRChrW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRChrW(pszstart.toCPointer<ByteVar>(), pszend.toCPointer<ByteVar>(), wmatch)?.toLong() ?: 0L

public actual fun StrRStrIA(pszsource: PCSTR, pszlast: PCSTR, pszsrch: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRStrIA(pszsource.toCPointer<ByteVar>(), pszlast.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrRStrIW(pszsource: PCWSTR, pszlast: PCWSTR, pszsrch: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRStrIW(pszsource.toCPointer<ByteVar>(), pszlast.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRetToBSTR(pstr.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), pbstr.toCPointer<ByteVar>())

public actual fun StrRetToBufA(pstr: Long, pidl: Long, pszbuf: PSTR, cchbuf: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRetToBufA(pstr.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun StrRetToBufW(pstr: Long, pidl: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRetToBufW(pstr.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRetToStrA(pstr.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), ppsz.toCPointer<ByteVar>())

public actual fun StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrRetToStrW(pstr.toCPointer<ByteVar>(), pidl.toCPointer<ByteVar>(), ppsz.toCPointer<ByteVar>())

public actual fun StrSpnA(psz: PCSTR, pszset: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrSpnA(psz.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())

public actual fun StrSpnW(psz: PCWSTR, pszset: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrSpnW(psz.toCPointer<ByteVar>(), pszset.toCPointer<ByteVar>())

public actual fun StrStrA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrStrA(pszfirst.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrStrIA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrStrIA(pszfirst.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrStrIW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrStrIW(pszfirst.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrStrNIW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrStrNIW(pszfirst.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>(), cchmax)?.toLong() ?: 0L

public actual fun StrStrNW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrStrNW(pszfirst.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>(), cchmax)?.toLong() ?: 0L

public actual fun StrStrW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrStrW(pszfirst.toCPointer<ByteVar>(), pszsrch.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StrToInt64ExA(pszstring: PCSTR, dwflags: Int, pllret: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrToInt64ExA(pszstring.toCPointer<ByteVar>(), dwflags, pllret.toCPointer<ByteVar>())

public actual fun StrToInt64ExW(pszstring: PCWSTR, dwflags: Int, pllret: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrToInt64ExW(pszstring.toCPointer<ByteVar>(), dwflags, pllret.toCPointer<ByteVar>())

public actual fun StrToIntA(pszsrc: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrToIntA(pszsrc.toCPointer<ByteVar>())

public actual fun StrToIntExA(pszstring: PCSTR, dwflags: Int, piret: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrToIntExA(pszstring.toCPointer<ByteVar>(), dwflags, piret.toCPointer<ByteVar>())

public actual fun StrToIntExW(pszstring: PCWSTR, dwflags: Int, piret: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrToIntExW(pszstring.toCPointer<ByteVar>(), dwflags, piret.toCPointer<ByteVar>())

public actual fun StrToIntW(pszsrc: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrToIntW(pszsrc.toCPointer<ByteVar>())

public actual fun StrTrimA(psz: PSTR, psztrimchars: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrTrimA(psz.toCPointer<ByteVar>(), psztrimchars.toCPointer<ByteVar>())

public actual fun StrTrimW(psz: PWSTR, psztrimchars: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_StrTrimW(psz.toCPointer<ByteVar>(), psztrimchars.toCPointer<ByteVar>())

public actual fun UnloadUserProfile(htoken: HANDLE, hprofile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UnloadUserProfile(htoken.toCPointer<ByteVar>(), hprofile.toCPointer<ByteVar>())

public actual fun UnregisterAppConstrainedChangeNotification(registration: PAPPCONSTRAIN_REGISTRATION) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UnregisterAppConstrainedChangeNotification(registration)
}

public actual fun UnregisterAppStateChangeNotification(registration: PAPPSTATE_REGISTRATION) {
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UnregisterAppStateChangeNotification(registration)
}

public actual fun UnregisterScaleChangeEvent(dwcookie: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UnregisterScaleChangeEvent(dwcookie)

public actual fun UrlApplySchemeA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlApplySchemeA(pszin.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>(), dwflags)

public actual fun UrlApplySchemeW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlApplySchemeW(pszin.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>(), dwflags)

public actual fun UrlCanonicalizeA(pszurl: PCSTR, pszcanonicalized: PSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCanonicalizeA(pszurl.toCPointer<ByteVar>(), pszcanonicalized.toCPointer<ByteVar>(), pcchcanonicalized.toCPointer<ByteVar>(), dwflags)

public actual fun UrlCanonicalizeW(pszurl: PCWSTR, pszcanonicalized: PWSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCanonicalizeW(pszurl.toCPointer<ByteVar>(), pszcanonicalized.toCPointer<ByteVar>(), pcchcanonicalized.toCPointer<ByteVar>(), dwflags)

public actual fun UrlCombineA(pszbase: PCSTR, pszrelative: PCSTR, pszcombined: PSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCombineA(pszbase.toCPointer<ByteVar>(), pszrelative.toCPointer<ByteVar>(), pszcombined.toCPointer<ByteVar>(), pcchcombined.toCPointer<ByteVar>(), dwflags)

public actual fun UrlCombineW(pszbase: PCWSTR, pszrelative: PCWSTR, pszcombined: PWSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCombineW(pszbase.toCPointer<ByteVar>(), pszrelative.toCPointer<ByteVar>(), pszcombined.toCPointer<ByteVar>(), pcchcombined.toCPointer<ByteVar>(), dwflags)

public actual fun UrlCompareA(psz1: PCSTR, psz2: PCSTR, fignoreslash: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCompareA(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), fignoreslash)

public actual fun UrlCompareW(psz1: PCWSTR, psz2: PCWSTR, fignoreslash: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCompareW(psz1.toCPointer<ByteVar>(), psz2.toCPointer<ByteVar>(), fignoreslash)

public actual fun UrlCreateFromPathA(pszpath: PCSTR, pszurl: PSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCreateFromPathA(pszpath.toCPointer<ByteVar>(), pszurl.toCPointer<ByteVar>(), pcchurl.toCPointer<ByteVar>(), dwflags)

public actual fun UrlCreateFromPathW(pszpath: PCWSTR, pszurl: PWSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlCreateFromPathW(pszpath.toCPointer<ByteVar>(), pszurl.toCPointer<ByteVar>(), pcchurl.toCPointer<ByteVar>(), dwflags)

public actual fun UrlEscapeA(pszurl: PCSTR, pszescaped: PSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlEscapeA(pszurl.toCPointer<ByteVar>(), pszescaped.toCPointer<ByteVar>(), pcchescaped.toCPointer<ByteVar>(), dwflags)

public actual fun UrlEscapeW(pszurl: PCWSTR, pszescaped: PWSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlEscapeW(pszurl.toCPointer<ByteVar>(), pszescaped.toCPointer<ByteVar>(), pcchescaped.toCPointer<ByteVar>(), dwflags)

public actual fun UrlFixupW(pcszurl: PCWSTR, psztranslatedurl: PWSTR, cchmax: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlFixupW(pcszurl.toCPointer<ByteVar>(), psztranslatedurl.toCPointer<ByteVar>(), cchmax)

public actual fun UrlGetLocationA(pszurl: PCSTR): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlGetLocationA(pszurl.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun UrlGetLocationW(pszurl: PCWSTR): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlGetLocationW(pszurl.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun UrlGetPartA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlGetPartA(pszin.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>(), dwpart, dwflags)

public actual fun UrlGetPartW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlGetPartW(pszin.toCPointer<ByteVar>(), pszout.toCPointer<ByteVar>(), pcchout.toCPointer<ByteVar>(), dwpart, dwflags)

public actual fun UrlHashA(pszurl: PCSTR, pbhash: Long, cbhash: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlHashA(pszurl.toCPointer<ByteVar>(), pbhash.toCPointer<ByteVar>(), cbhash)

public actual fun UrlHashW(pszurl: PCWSTR, pbhash: Long, cbhash: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlHashW(pszurl.toCPointer<ByteVar>(), pbhash.toCPointer<ByteVar>(), cbhash)

public actual fun UrlIsA(pszurl: PCSTR, urlis: URLIS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlIsA(pszurl.toCPointer<ByteVar>(), urlis)

public actual fun UrlIsNoHistoryA(pszurl: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlIsNoHistoryA(pszurl.toCPointer<ByteVar>())

public actual fun UrlIsNoHistoryW(pszurl: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlIsNoHistoryW(pszurl.toCPointer<ByteVar>())

public actual fun UrlIsOpaqueA(pszurl: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlIsOpaqueA(pszurl.toCPointer<ByteVar>())

public actual fun UrlIsOpaqueW(pszurl: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlIsOpaqueW(pszurl.toCPointer<ByteVar>())

public actual fun UrlIsW(pszurl: PCWSTR, urlis: URLIS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlIsW(pszurl.toCPointer<ByteVar>(), urlis)

public actual fun UrlUnescapeA(pszurl: PSTR, pszunescaped: PSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlUnescapeA(pszurl.toCPointer<ByteVar>(), pszunescaped.toCPointer<ByteVar>(), pcchunescaped.toCPointer<ByteVar>(), dwflags)

public actual fun UrlUnescapeW(pszurl: PWSTR, pszunescaped: PWSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_UrlUnescapeW(pszurl.toCPointer<ByteVar>(), pszunescaped.toCPointer<ByteVar>(), pcchunescaped.toCPointer<ByteVar>(), dwflags)

public actual fun VariantToStrRet(varin: Long, pstrret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_VariantToStrRet(varin.toCPointer<ByteVar>(), pstrret.toCPointer<ByteVar>())

public actual fun WhichPlatform(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_WhichPlatform()

public actual fun Win32DeleteFile(pszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_Win32DeleteFile(pszpath.toCPointer<ByteVar>())

public actual fun WinHelpA(hwndmain: HWND, lpszhelp: PCSTR, ucommand: UInt, dwdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_WinHelpA(hwndmain.toCPointer<ByteVar>(), lpszhelp.toCPointer<ByteVar>(), ucommand, dwdata)

public actual fun WinHelpW(hwndmain: HWND, lpszhelp: PCWSTR, ucommand: UInt, dwdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_WinHelpW(hwndmain.toCPointer<ByteVar>(), lpszhelp.toCPointer<ByteVar>(), ucommand, dwdata)

public actual fun WriteCabinetState(pcs: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_WriteCabinetState(pcs.toCPointer<ByteVar>())

public actual fun wnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR): Int =
    0

public actual fun wnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR): Int =
    0

public actual fun wvnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, arglist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_wvnsprintfA(pszdest.toCPointer<ByteVar>(), cchdest, pszfmt.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())

public actual fun wvnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, arglist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.shell.cinterop.windowssys_windows_win32_ui_shell_wvnsprintfW(pszdest.toCPointer<ByteVar>(), cchdest, pszfmt.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())
