@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.core.BOOL
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.WAIT_EVENT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBRUSH
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN

private val _windowsWin32UiWindowsandmessagingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AdjustWindowRect(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRect(lprect.toString(), dwstyle.toInt(), bmenu) as Int) else 0

public actual fun AdjustWindowRectEx(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRectEx(lprect.toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt()) as Int) else 0

public actual fun AllowSetForegroundWindow(dwprocessid: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AllowSetForegroundWindow(dwprocessid.toInt()) as Int) else 0

public actual fun AnimateWindow(hwnd: HWND, dwtime: UInt, dwflags: ANIMATE_WINDOW_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AnimateWindow(hwnd.toString(), dwtime.toInt(), dwflags.toInt()) as Int) else 0

public actual fun AnyPopup(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AnyPopup() as Int) else 0

public actual fun AppendMenuA(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AppendMenuA(hmenu.toString(), uflags.toInt(), uidnewitem.toString(), lpnewitem.toString()) as Int) else 0

public actual fun AppendMenuW(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_AppendMenuW(hmenu.toString(), uflags.toInt(), uidnewitem.toString(), lpnewitem.toString()) as Int) else 0

public actual fun ArrangeIconicWindows(hwnd: HWND): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ArrangeIconicWindows(hwnd.toString()) as Int).toUInt() else 0u

public actual fun BeginDeferWindowPos(nnumwindows: Int): HDWP =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_BeginDeferWindowPos(nnumwindows) as String).toLong() else 0L

public actual fun BringWindowToTop(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_BringWindowToTop(hwnd.toString()) as Int) else 0

public actual fun CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: UInt, excluderect: Long, popupwindowposition: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CalculatePopupWindowPosition(anchorpoint.toString(), windowsize.toString(), flags.toInt(), excluderect.toString(), popupwindowposition.toString()) as Int) else 0

public actual fun CallMsgFilterA(lpmsg: Long, ncode: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterA(lpmsg.toString(), ncode) as Int) else 0

public actual fun CallMsgFilterW(lpmsg: Long, ncode: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterW(lpmsg.toString(), ncode) as Int) else 0

public actual fun CallNextHookEx(hhk: HHOOK, ncode: Int, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CallNextHookEx(hhk.toString(), ncode, wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun CallWindowProcA(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcA(lpprevwndfunc.toLong().toString(), hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun CallWindowProcW(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcW(lpprevwndfunc.toLong().toString(), hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun CancelShutdown(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CancelShutdown() as Int) else 0

public actual fun CascadeWindows(hwndparent: HWND, whow: CASCADE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CascadeWindows(hwndparent.toString(), whow.toInt(), lprect.toString(), ckids.toInt(), lpkids.toString()) as Int).toUShort() else 0u

public actual fun ChangeMenuA(hmenu: HMENU, cmd: UInt, lpsznewitem: PCSTR, cmdinsert: UInt, flags: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuA(hmenu.toString(), cmd.toInt(), lpsznewitem.toString(), cmdinsert.toInt(), flags.toInt()) as Int) else 0

public actual fun ChangeMenuW(hmenu: HMENU, cmd: UInt, lpsznewitem: PCWSTR, cmdinsert: UInt, flags: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuW(hmenu.toString(), cmd.toInt(), lpsznewitem.toString(), cmdinsert.toInt(), flags.toInt()) as Int) else 0

public actual fun ChangeWindowMessageFilter(message: UInt, dwflag: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilter(message.toInt(), dwflag.toInt()) as Int) else 0

public actual fun ChangeWindowMessageFilterEx(hwnd: HWND, message: UInt, action: WINDOW_MESSAGE_FILTER_ACTION, pchangefilterstruct: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilterEx(hwnd.toString(), message.toInt(), action.toInt(), pchangefilterstruct.toString()) as Int) else 0

public actual fun CharLowerA(lpsz: PSTR): PSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharLowerA(lpsz.toString()) as String).toLong() else 0L

public actual fun CharLowerBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffA(lpsz.toString(), cchlength.toInt()) as Int).toUInt() else 0u

public actual fun CharLowerBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffW(lpsz.toString(), cchlength.toInt()) as Int).toUInt() else 0u

public actual fun CharLowerW(lpsz: PWSTR): PWSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharLowerW(lpsz.toString()) as String).toLong() else 0L

public actual fun CharNextA(lpsz: PCSTR): PSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharNextA(lpsz.toString()) as String).toLong() else 0L

public actual fun CharNextExA(codepage: UShort, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharNextExA(codepage.toInt(), lpcurrentchar.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CharNextW(lpsz: PCWSTR): PWSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharNextW(lpsz.toString()) as String).toLong() else 0L

public actual fun CharPrevA(lpszstart: PCSTR, lpszcurrent: PCSTR): PSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharPrevA(lpszstart.toString(), lpszcurrent.toString()) as String).toLong() else 0L

public actual fun CharPrevExA(codepage: UShort, lpstart: PCSTR, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharPrevExA(codepage.toInt(), lpstart.toString(), lpcurrentchar.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun CharPrevW(lpszstart: PCWSTR, lpszcurrent: PCWSTR): PWSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharPrevW(lpszstart.toString(), lpszcurrent.toString()) as String).toLong() else 0L

public actual fun CharToOemA(psrc: PCSTR, pdst: PSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharToOemA(psrc.toString(), pdst.toString()) as Int) else 0

public actual fun CharToOemBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffA(lpszsrc.toString(), lpszdst.toString(), cchdstlength.toInt()) as Int) else 0

public actual fun CharToOemBuffW(lpszsrc: PCWSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffW(lpszsrc.toString(), lpszdst.toString(), cchdstlength.toInt()) as Int) else 0

public actual fun CharToOemW(psrc: PCWSTR, pdst: PSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharToOemW(psrc.toString(), pdst.toString()) as Int) else 0

public actual fun CharUpperA(lpsz: PSTR): PSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharUpperA(lpsz.toString()) as String).toLong() else 0L

public actual fun CharUpperBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffA(lpsz.toString(), cchlength.toInt()) as Int).toUInt() else 0u

public actual fun CharUpperBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffW(lpsz.toString(), cchlength.toInt()) as Int).toUInt() else 0u

public actual fun CharUpperW(lpsz: PWSTR): PWSTR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CharUpperW(lpsz.toString()) as String).toLong() else 0L

public actual fun CheckMenuItem(hmenu: HMENU, uidcheckitem: UInt, ucheck: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CheckMenuItem(hmenu.toString(), uidcheckitem.toInt(), ucheck.toInt()) as Int).toUInt() else 0u

public actual fun CheckMenuRadioItem(hmenu: HMENU, first: UInt, last: UInt, check: UInt, flags: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CheckMenuRadioItem(hmenu.toString(), first.toInt(), last.toInt(), check.toInt(), flags.toInt()) as Int) else 0

public actual fun ChildWindowFromPoint(hwndparent: HWND, point: POINT): HWND =
    0L

public actual fun ChildWindowFromPointEx(hwnd: HWND, pt: POINT, flags: CWP_FLAGS): HWND =
    0L

public actual fun ClipCursor(lprect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ClipCursor(lprect.toString()) as Int) else 0

public actual fun CloseWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CloseWindow(hwnd.toString()) as Int) else 0

public actual fun CopyAcceleratorTableA(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableA(haccelsrc.toString(), lpacceldst.toString(), caccelentries) as Int) else 0

public actual fun CopyAcceleratorTableW(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableW(haccelsrc.toString(), lpacceldst.toString(), caccelentries) as Int) else 0

public actual fun CopyIcon(hicon: HICON): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CopyIcon(hicon.toString()) as String).toLong() else 0L

public actual fun CopyImage(h: HANDLE, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, flags: IMAGE_FLAGS): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CopyImage(h.toString(), type.toInt(), cx, cy, flags.toInt()) as String).toLong() else 0L

public actual fun CreateAcceleratorTableA(paccel: Long, caccel: Int): HACCEL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableA(paccel.toString(), caccel) as String).toLong() else 0L

public actual fun CreateAcceleratorTableW(paccel: Long, caccel: Int): HACCEL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableW(paccel.toString(), caccel) as String).toLong() else 0L

public actual fun CreateCaret(hwnd: HWND, hbitmap: HBITMAP, nwidth: Int, nheight: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateCaret(hwnd.toString(), hbitmap.toString(), nwidth, nheight) as Int) else 0

public actual fun CreateCursor(hinst: HINSTANCE, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateCursor(hinst.toString(), xhotspot, yhotspot, nwidth, nheight, pvandplane.toString(), pvxorplane.toString()) as String).toLong() else 0L

public actual fun CreateDialogIndirectParamA(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamA(hinstance.toString(), lptemplate.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun CreateDialogIndirectParamW(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamW(hinstance.toString(), lptemplate.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun CreateDialogParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamA(hinstance.toString(), lptemplatename.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun CreateDialogParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamW(hinstance.toString(), lptemplatename.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun CreateIcon(hinstance: HINSTANCE, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: Long, lpbxorbits: Long): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateIcon(hinstance.toString(), nwidth, nheight, cplanes.toInt(), cbitspixel.toInt(), lpbandbits.toString(), lpbxorbits.toString()) as String).toLong() else 0L

public actual fun CreateIconFromResource(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResource(presbits.toString(), dwressize.toInt(), ficon, dwver.toInt()) as String).toLong() else 0L

public actual fun CreateIconFromResourceEx(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResourceEx(presbits.toString(), dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt()) as String).toLong() else 0L

public actual fun CreateIconIndirect(piconinfo: Long): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateIconIndirect(piconinfo.toString()) as String).toLong() else 0L

public actual fun CreateMDIWindowA(lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowA(lpclassname.toString(), lpwindowname.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.toString(), hinstance.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun CreateMDIWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowW(lpclassname.toString(), lpwindowname.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.toString(), hinstance.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun CreateMenu(): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateMenu() as String).toLong() else 0L

public actual fun CreatePopupMenu(): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreatePopupMenu() as String).toLong() else 0L

public actual fun CreateResourceIndexer(projectroot: PCWSTR, extensiondllpath: PCWSTR, ppresourceindexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateResourceIndexer(projectroot.toString(), extensiondllpath.toString(), ppresourceindexer.toString()) as Int) else 0

public actual fun CreateWindowExA(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExA(dwexstyle.toInt(), lpclassname.toString(), lpwindowname.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.toString(), hmenu.toString(), hinstance.toString(), lpparam.toString()) as String).toLong() else 0L

public actual fun CreateWindowExW(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExW(dwexstyle.toInt(), lpclassname.toString(), lpwindowname.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.toString(), hmenu.toString(), hinstance.toString(), lpparam.toString()) as String).toLong() else 0L

public actual fun DefDlgProcA(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcA(hdlg.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefDlgProcW(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcW(hdlg.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefFrameProcA(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcA(hwnd.toString(), hwndmdiclient.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefFrameProcW(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcW(hwnd.toString(), hwndmdiclient.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefMDIChildProcA(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcA(hwnd.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefMDIChildProcW(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcW(hwnd.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefWindowProcA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcA(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DefWindowProcW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcW(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun DeferWindowPos(hwinposinfo: HDWP, hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): HDWP =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DeferWindowPos(hwinposinfo.toString(), hwnd.toString(), hwndinsertafter.toString(), x, y, cx, cy, uflags.toInt()) as String).toLong() else 0L

public actual fun DeleteMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DeleteMenu(hmenu.toString(), uposition.toInt(), uflags.toInt()) as Int) else 0

public actual fun DeregisterShellHookWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DeregisterShellHookWindow(hwnd.toString()) as Int) else 0

public actual fun DestroyAcceleratorTable(haccel: HACCEL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyAcceleratorTable(haccel.toString()) as Int) else 0

public actual fun DestroyCaret(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyCaret() as Int) else 0

public actual fun DestroyCursor(hcursor: HCURSOR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyCursor(hcursor.toString()) as Int) else 0

public actual fun DestroyIcon(hicon: HICON): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyIcon(hicon.toString()) as Int) else 0

public actual fun DestroyIndexedResults(resourceuri: PCWSTR, qualifiercount: UInt, qualifiers: Long) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyIndexedResults(resourceuri.toString(), qualifiercount.toInt(), qualifiers.toString())
    }
}

public actual fun DestroyMenu(hmenu: HMENU): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyMenu(hmenu.toString()) as Int) else 0

public actual fun DestroyResourceIndexer(resourceindexer: Long) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyResourceIndexer(resourceindexer.toString())
    }
}

public actual fun DestroyWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DestroyWindow(hwnd.toString()) as Int) else 0

public actual fun DialogBoxIndirectParamA(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamA(hinstance.toString(), hdialogtemplate.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun DialogBoxIndirectParamW(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamW(hinstance.toString(), hdialogtemplate.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun DialogBoxParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamA(hinstance.toString(), lptemplatename.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun DialogBoxParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamW(hinstance.toString(), lptemplatename.toString(), hwndparent.toString(), lpdialogfunc.toLong().toString(), dwinitparam.toString()) as String).toLong() else 0L

public actual fun DisableProcessWindowsGhosting() {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DisableProcessWindowsGhosting()
    }
}

public actual fun DispatchMessageA(lpmsg: Long): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageA(lpmsg.toString()) as String).toLong() else 0L

public actual fun DispatchMessageW(lpmsg: Long): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageW(lpmsg.toString()) as String).toLong() else 0L

public actual fun DragObject(hwndparent: HWND, hwndfrom: HWND, fmt: UInt, data: ULong, hcur: HCURSOR): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DragObject(hwndparent.toString(), hwndfrom.toString(), fmt.toInt(), data.toString(), hcur.toString()) as Int).toUInt() else 0u

public actual fun DrawIcon(hdc: HDC, x: Int, y: Int, hicon: HICON): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DrawIcon(hdc.toString(), x, y, hicon.toString()) as Int) else 0

public actual fun DrawIconEx(hdc: HDC, xleft: Int, ytop: Int, hicon: HICON, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: HBRUSH, diflags: DI_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DrawIconEx(hdc.toString(), xleft, ytop, hicon.toString(), cxwidth, cywidth, istepifanicur.toInt(), hbrflickerfreedraw.toString(), diflags.toInt()) as Int) else 0

public actual fun DrawMenuBar(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_DrawMenuBar(hwnd.toString()) as Int) else 0

public actual fun EnableMenuItem(hmenu: HMENU, uidenableitem: UInt, uenable: MENU_ITEM_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnableMenuItem(hmenu.toString(), uidenableitem.toInt(), uenable.toInt()) as Int) else 0

public actual fun EndDeferWindowPos(hwinposinfo: HDWP): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EndDeferWindowPos(hwinposinfo.toString()) as Int) else 0

public actual fun EndDialog(hdlg: HWND, nresult: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EndDialog(hdlg.toString(), nresult.toString()) as Int) else 0

public actual fun EndMenu(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EndMenu() as Int) else 0

public actual fun EnumChildWindows(hwndparent: HWND, lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumChildWindows(hwndparent.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumPropsA(hwnd: HWND, lpenumfunc: PROPENUMPROCA): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsA(hwnd.toString(), lpenumfunc.toLong().toString()) as Int) else 0

public actual fun EnumPropsExA(hwnd: HWND, lpenumfunc: PROPENUMPROCEXA, lparam: LPARAM): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExA(hwnd.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumPropsExW(hwnd: HWND, lpenumfunc: PROPENUMPROCEXW, lparam: LPARAM): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExW(hwnd.toString(), lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumPropsW(hwnd: HWND, lpenumfunc: PROPENUMPROCW): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsW(hwnd.toString(), lpenumfunc.toLong().toString()) as Int) else 0

public actual fun EnumThreadWindows(dwthreadid: UInt, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumThreadWindows(dwthreadid.toInt(), lpfn.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumWindows(lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_EnumWindows(lpenumfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun FindWindowA(lpclassname: PCSTR, lpwindowname: PCSTR): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_FindWindowA(lpclassname.toString(), lpwindowname.toString()) as String).toLong() else 0L

public actual fun FindWindowExA(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCSTR, lpszwindow: PCSTR): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_FindWindowExA(hwndparent.toString(), hwndchildafter.toString(), lpszclass.toString(), lpszwindow.toString()) as String).toLong() else 0L

public actual fun FindWindowExW(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCWSTR, lpszwindow: PCWSTR): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_FindWindowExW(hwndparent.toString(), hwndchildafter.toString(), lpszclass.toString(), lpszwindow.toString()) as String).toLong() else 0L

public actual fun FindWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_FindWindowW(lpclassname.toString(), lpwindowname.toString()) as String).toLong() else 0L

public actual fun FlashWindow(hwnd: HWND, binvert: BOOL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_FlashWindow(hwnd.toString(), binvert) as Int) else 0

public actual fun FlashWindowEx(pfwi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_FlashWindowEx(pfwi.toString()) as Int) else 0

public actual fun GetAltTabInfoA(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PSTR, cchitemtext: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoA(hwnd.toString(), iitem, pati.toString(), pszitemtext.toString(), cchitemtext.toInt()) as Int) else 0

public actual fun GetAltTabInfoW(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PWSTR, cchitemtext: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoW(hwnd.toString(), iitem, pati.toString(), pszitemtext.toString(), cchitemtext.toInt()) as Int) else 0

public actual fun GetAncestor(hwnd: HWND, gaflags: GET_ANCESTOR_FLAGS): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetAncestor(hwnd.toString(), gaflags.toInt()) as String).toLong() else 0L

public actual fun GetCaretBlinkTime(): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetCaretBlinkTime() as Int).toUInt() else 0u

public actual fun GetCaretPos(lppoint: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetCaretPos(lppoint.toString()) as Int) else 0

public actual fun GetClassInfoA(hinstance: HINSTANCE, lpclassname: PCSTR, lpwndclass: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoA(hinstance.toString(), lpclassname.toString(), lpwndclass.toString()) as Int) else 0

public actual fun GetClassInfoExA(hinstance: HINSTANCE, lpszclass: PCSTR, lpwcx: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExA(hinstance.toString(), lpszclass.toString(), lpwcx.toString()) as Int) else 0

public actual fun GetClassInfoExW(hinstance: HINSTANCE, lpszclass: PCWSTR, lpwcx: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExW(hinstance.toString(), lpszclass.toString(), lpwcx.toString()) as Int) else 0

public actual fun GetClassInfoW(hinstance: HINSTANCE, lpclassname: PCWSTR, lpwndclass: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoW(hinstance.toString(), lpclassname.toString(), lpwndclass.toString()) as Int) else 0

public actual fun GetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongA(hwnd.toString(), nindex) as Int).toUInt() else 0u

public actual fun GetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrA(hwnd.toString(), nindex) as String).toULong() else 0uL

public actual fun GetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrW(hwnd.toString(), nindex) as String).toULong() else 0uL

public actual fun GetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongW(hwnd.toString(), nindex) as Int).toUInt() else 0u

public actual fun GetClassNameA(hwnd: HWND, lpclassname: PSTR, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassNameA(hwnd.toString(), lpclassname.toString(), nmaxcount) as Int) else 0

public actual fun GetClassNameW(hwnd: HWND, lpclassname: PWSTR, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassNameW(hwnd.toString(), lpclassname.toString(), nmaxcount) as Int) else 0

public actual fun GetClassWord(hwnd: HWND, nindex: Int): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClassWord(hwnd.toString(), nindex) as Int).toUShort() else 0u

public actual fun GetClientRect(hwnd: HWND, lprect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClientRect(hwnd.toString(), lprect.toString()) as Int) else 0

public actual fun GetClipCursor(lprect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetClipCursor(lprect.toString()) as Int) else 0

public actual fun GetCursor(): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetCursor() as String).toLong() else 0L

public actual fun GetCursorInfo(pci: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetCursorInfo(pci.toString()) as Int) else 0

public actual fun GetCursorPos(lppoint: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetCursorPos(lppoint.toString()) as Int) else 0

public actual fun GetDesktopWindow(): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDesktopWindow() as String).toLong() else 0L

public actual fun GetDialogBaseUnits(): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDialogBaseUnits() as Int) else 0

public actual fun GetDlgCtrlID(hwnd: HWND): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDlgCtrlID(hwnd.toString()) as Int) else 0

public actual fun GetDlgItem(hdlg: HWND, niddlgitem: Int): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItem(hdlg.toString(), niddlgitem) as String).toLong() else 0L

public actual fun GetDlgItemInt(hdlg: HWND, niddlgitem: Int, lptranslated: Long, bsigned: BOOL): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemInt(hdlg.toString(), niddlgitem, lptranslated.toString(), bsigned) as Int).toUInt() else 0u

public actual fun GetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PSTR, cchmax: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextA(hdlg.toString(), niddlgitem, lpstring.toString(), cchmax) as Int).toUInt() else 0u

public actual fun GetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PWSTR, cchmax: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextW(hdlg.toString(), niddlgitem, lpstring.toString(), cchmax) as Int).toUInt() else 0u

public actual fun GetForegroundWindow(): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetForegroundWindow() as String).toLong() else 0L

public actual fun GetGUIThreadInfo(idthread: UInt, pgui: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetGUIThreadInfo(idthread.toInt(), pgui.toString()) as Int) else 0

public actual fun GetIconInfo(hicon: HICON, piconinfo: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfo(hicon.toString(), piconinfo.toString()) as Int) else 0

public actual fun GetIconInfoExA(hicon: HICON, piconinfo: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExA(hicon.toString(), piconinfo.toString()) as Int) else 0

public actual fun GetIconInfoExW(hicon: HICON, piconinfo: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExW(hicon.toString(), piconinfo.toString()) as Int) else 0

public actual fun GetInputState(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetInputState() as Int) else 0

public actual fun GetLastActivePopup(hwnd: HWND): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetLastActivePopup(hwnd.toString()) as String).toLong() else 0L

public actual fun GetLayeredWindowAttributes(hwnd: HWND, pcrkey: Long, pbalpha: Long, pdwflags: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetLayeredWindowAttributes(hwnd.toString(), pcrkey.toString(), pbalpha.toString(), pdwflags.toString()) as Int) else 0

public actual fun GetMenu(hwnd: HWND): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenu(hwnd.toString()) as String).toLong() else 0L

public actual fun GetMenuBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, iditem: Int, pmbi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuBarInfo(hwnd.toString(), idobject, iditem, pmbi.toString()) as Int) else 0

public actual fun GetMenuCheckMarkDimensions(): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuCheckMarkDimensions() as Int) else 0

public actual fun GetMenuDefaultItem(hmenu: HMENU, fbypos: UInt, gmdiflags: GET_MENU_DEFAULT_ITEM_FLAGS): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuDefaultItem(hmenu.toString(), fbypos.toInt(), gmdiflags.toInt()) as Int).toUInt() else 0u

public actual fun GetMenuInfo(param0: HMENU, param1: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuInfo(param0.toString(), param1.toString()) as Int) else 0

public actual fun GetMenuItemCount(hmenu: HMENU): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemCount(hmenu.toString()) as Int) else 0

public actual fun GetMenuItemID(hmenu: HMENU, npos: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemID(hmenu.toString(), npos) as Int).toUInt() else 0u

public actual fun GetMenuItemInfoA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoA(hmenu.toString(), item.toInt(), fbyposition, lpmii.toString()) as Int) else 0

public actual fun GetMenuItemInfoW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoW(hmenu.toString(), item.toInt(), fbyposition, lpmii.toString()) as Int) else 0

public actual fun GetMenuItemRect(hwnd: HWND, hmenu: HMENU, uitem: UInt, lprcitem: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemRect(hwnd.toString(), hmenu.toString(), uitem.toInt(), lprcitem.toString()) as Int) else 0

public actual fun GetMenuState(hmenu: HMENU, uid: UInt, uflags: MENU_ITEM_FLAGS): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuState(hmenu.toString(), uid.toInt(), uflags.toInt()) as Int).toUInt() else 0u

public actual fun GetMenuStringA(hmenu: HMENU, uiditem: UInt, lpstring: PSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringA(hmenu.toString(), uiditem.toInt(), lpstring.toString(), cchmax, flags.toInt()) as Int) else 0

public actual fun GetMenuStringW(hmenu: HMENU, uiditem: UInt, lpstring: PWSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringW(hmenu.toString(), uiditem.toInt(), lpstring.toString(), cchmax, flags.toInt()) as Int) else 0

public actual fun GetMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMessageA(lpmsg.toString(), hwnd.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) as Int) else 0

public actual fun GetMessageExtraInfo(): LPARAM =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMessageExtraInfo() as String).toLong() else 0L

public actual fun GetMessagePos(): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMessagePos() as Int).toUInt() else 0u

public actual fun GetMessageTime(): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMessageTime() as Int) else 0

public actual fun GetMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetMessageW(lpmsg.toString(), hwnd.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) as Int) else 0

public actual fun GetNextDlgGroupItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgGroupItem(hdlg.toString(), hctl.toString(), bprevious) as String).toLong() else 0L

public actual fun GetNextDlgTabItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgTabItem(hdlg.toString(), hctl.toString(), bprevious) as String).toLong() else 0L

public actual fun GetParent(hwnd: HWND): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetParent(hwnd.toString()) as String).toLong() else 0L

public actual fun GetPhysicalCursorPos(lppoint: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetPhysicalCursorPos(lppoint.toString()) as Int) else 0

public actual fun GetProcessDefaultLayout(pdwdefaultlayout: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetProcessDefaultLayout(pdwdefaultlayout.toString()) as Int) else 0

public actual fun GetPropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetPropA(hwnd.toString(), lpstring.toString()) as String).toLong() else 0L

public actual fun GetPropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetPropW(hwnd.toString(), lpstring.toString()) as String).toLong() else 0L

public actual fun GetQueueStatus(flags: QUEUE_STATUS_FLAGS): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetQueueStatus(flags.toInt()) as Int).toUInt() else 0u

public actual fun GetScrollBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, psbi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetScrollBarInfo(hwnd.toString(), idobject, psbi.toString()) as Int) else 0

public actual fun GetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetScrollInfo(hwnd.toString(), nbar, lpsi.toString()) as Int) else 0

public actual fun GetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetScrollPos(hwnd.toString(), nbar) as Int) else 0

public actual fun GetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpminpos: Long, lpmaxpos: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetScrollRange(hwnd.toString(), nbar, lpminpos.toString(), lpmaxpos.toString()) as Int) else 0

public actual fun GetShellWindow(): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetShellWindow() as String).toLong() else 0L

public actual fun GetSubMenu(hmenu: HMENU, npos: Int): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetSubMenu(hmenu.toString(), npos) as String).toLong() else 0L

public actual fun GetSystemMenu(hwnd: HWND, brevert: BOOL): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetSystemMenu(hwnd.toString(), brevert) as String).toLong() else 0L

public actual fun GetSystemMetrics(nindex: SYSTEM_METRICS_INDEX): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetSystemMetrics(nindex) as Int) else 0

public actual fun GetTitleBarInfo(hwnd: HWND, pti: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetTitleBarInfo(hwnd.toString(), pti.toString()) as Int) else 0

public actual fun GetTopWindow(hwnd: HWND): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetTopWindow(hwnd.toString()) as String).toLong() else 0L

public actual fun GetWindow(hwnd: HWND, ucmd: GET_WINDOW_CMD): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindow(hwnd.toString(), ucmd.toInt()) as String).toLong() else 0L

public actual fun GetWindowDisplayAffinity(hwnd: HWND, pdwaffinity: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowDisplayAffinity(hwnd.toString(), pdwaffinity.toString()) as Int) else 0

public actual fun GetWindowInfo(hwnd: HWND, pwi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowInfo(hwnd.toString(), pwi.toString()) as Int) else 0

public actual fun GetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongA(hwnd.toString(), nindex) as Int) else 0

public actual fun GetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrA(hwnd.toString(), nindex) as String).toLong() else 0L

public actual fun GetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrW(hwnd.toString(), nindex) as String).toLong() else 0L

public actual fun GetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongW(hwnd.toString(), nindex) as Int) else 0

public actual fun GetWindowModuleFileNameA(hwnd: HWND, pszfilename: PSTR, cchfilenamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameA(hwnd.toString(), pszfilename.toString(), cchfilenamemax.toInt()) as Int).toUInt() else 0u

public actual fun GetWindowModuleFileNameW(hwnd: HWND, pszfilename: PWSTR, cchfilenamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameW(hwnd.toString(), pszfilename.toString(), cchfilenamemax.toInt()) as Int).toUInt() else 0u

public actual fun GetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowPlacement(hwnd.toString(), lpwndpl.toString()) as Int) else 0

public actual fun GetWindowRect(hwnd: HWND, lprect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowRect(hwnd.toString(), lprect.toString()) as Int) else 0

public actual fun GetWindowTextA(hwnd: HWND, lpstring: PSTR, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextA(hwnd.toString(), lpstring.toString(), nmaxcount) as Int) else 0

public actual fun GetWindowTextLengthA(hwnd: HWND): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthA(hwnd.toString()) as Int) else 0

public actual fun GetWindowTextLengthW(hwnd: HWND): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthW(hwnd.toString()) as Int) else 0

public actual fun GetWindowTextW(hwnd: HWND, lpstring: PWSTR, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextW(hwnd.toString(), lpstring.toString(), nmaxcount) as Int) else 0

public actual fun GetWindowThreadProcessId(hwnd: HWND, lpdwprocessid: Long): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowThreadProcessId(hwnd.toString(), lpdwprocessid.toString()) as Int).toUInt() else 0u

public actual fun GetWindowWord(hwnd: HWND, nindex: Int): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_GetWindowWord(hwnd.toString(), nindex) as Int).toUShort() else 0u

public actual fun HideCaret(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_HideCaret(hwnd.toString()) as Int) else 0

public actual fun HiliteMenuItem(hwnd: HWND, hmenu: HMENU, uidhiliteitem: UInt, uhilite: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_HiliteMenuItem(hwnd.toString(), hmenu.toString(), uidhiliteitem.toInt(), uhilite.toInt()) as Int) else 0

public actual fun InSendMessage(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InSendMessage() as Int) else 0

public actual fun InSendMessageEx(lpreserved: Long): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InSendMessageEx(lpreserved.toString()) as Int).toUInt() else 0u

public actual fun IndexFilePath(resourceindexer: Long, filepath: PCWSTR, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IndexFilePath(resourceindexer.toString(), filepath.toString(), ppresourceuri.toString(), pqualifiercount.toString(), ppqualifiers.toString()) as Int) else 0

public actual fun InheritWindowMonitor(hwnd: HWND, hwndinherit: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InheritWindowMonitor(hwnd.toString(), hwndinherit.toString()) as Int) else 0

public actual fun InsertMenuA(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuA(hmenu.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.toString()) as Int) else 0

public actual fun InsertMenuItemA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemA(hmenu.toString(), item.toInt(), fbyposition, lpmi.toString()) as Int) else 0

public actual fun InsertMenuItemW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemW(hmenu.toString(), item.toInt(), fbyposition, lpmi.toString()) as Int) else 0

public actual fun InsertMenuW(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuW(hmenu.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.toString()) as Int) else 0

public actual fun InternalGetWindowText(hwnd: HWND, pstring: PWSTR, cchmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_InternalGetWindowText(hwnd.toString(), pstring.toString(), cchmaxcount) as Int) else 0

public actual fun IsCharAlphaA(ch: Byte): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaA(ch.toInt()) as Int) else 0

public actual fun IsCharAlphaNumericA(ch: Byte): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericA(ch.toInt()) as Int) else 0

public actual fun IsCharAlphaNumericW(ch: UShort): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericW(ch.toInt()) as Int) else 0

public actual fun IsCharAlphaW(ch: UShort): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaW(ch.toInt()) as Int) else 0

public actual fun IsCharLowerA(ch: Byte): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharLowerA(ch.toInt()) as Int) else 0

public actual fun IsCharUpperA(ch: Byte): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperA(ch.toInt()) as Int) else 0

public actual fun IsCharUpperW(ch: UShort): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperW(ch.toInt()) as Int) else 0

public actual fun IsChild(hwndparent: HWND, hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsChild(hwndparent.toString(), hwnd.toString()) as Int) else 0

public actual fun IsDialogMessageA(hdlg: HWND, lpmsg: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageA(hdlg.toString(), lpmsg.toString()) as Int) else 0

public actual fun IsDialogMessageW(hdlg: HWND, lpmsg: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageW(hdlg.toString(), lpmsg.toString()) as Int) else 0

public actual fun IsGUIThread(bconvert: BOOL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsGUIThread(bconvert) as Int) else 0

public actual fun IsHungAppWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsHungAppWindow(hwnd.toString()) as Int) else 0

public actual fun IsIconic(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsIconic(hwnd.toString()) as Int) else 0

public actual fun IsMenu(hmenu: HMENU): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsMenu(hmenu.toString()) as Int) else 0

public actual fun IsProcessDPIAware(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsProcessDPIAware() as Int) else 0

public actual fun IsWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsWindow(hwnd.toString()) as Int) else 0

public actual fun IsWindowArranged(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsWindowArranged(hwnd.toString()) as Int) else 0

public actual fun IsWindowUnicode(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsWindowUnicode(hwnd.toString()) as Int) else 0

public actual fun IsWindowVisible(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsWindowVisible(hwnd.toString()) as Int) else 0

public actual fun IsWow64Message(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsWow64Message() as Int) else 0

public actual fun IsZoomed(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_IsZoomed(hwnd.toString()) as Int) else 0

public actual fun KillTimer(hwnd: HWND, uidevent: ULong): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_KillTimer(hwnd.toString(), uidevent.toString()) as Int) else 0

public actual fun LoadAcceleratorsA(hinstance: HINSTANCE, lptablename: PCSTR): HACCEL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsA(hinstance.toString(), lptablename.toString()) as String).toLong() else 0L

public actual fun LoadAcceleratorsW(hinstance: HINSTANCE, lptablename: PCWSTR): HACCEL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsW(hinstance.toString(), lptablename.toString()) as String).toLong() else 0L

public actual fun LoadCursorA(hinstance: HINSTANCE, lpcursorname: PCSTR): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorA(hinstance.toString(), lpcursorname.toString()) as String).toLong() else 0L

public actual fun LoadCursorFromFileA(lpfilename: PCSTR): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileA(lpfilename.toString()) as String).toLong() else 0L

public actual fun LoadCursorFromFileW(lpfilename: PCWSTR): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileW(lpfilename.toString()) as String).toLong() else 0L

public actual fun LoadCursorW(hinstance: HINSTANCE, lpcursorname: PCWSTR): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorW(hinstance.toString(), lpcursorname.toString()) as String).toLong() else 0L

public actual fun LoadIconA(hinstance: HINSTANCE, lpiconname: PCSTR): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadIconA(hinstance.toString(), lpiconname.toString()) as String).toLong() else 0L

public actual fun LoadIconW(hinstance: HINSTANCE, lpiconname: PCWSTR): HICON =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadIconW(hinstance.toString(), lpiconname.toString()) as String).toLong() else 0L

public actual fun LoadImageA(hinst: HINSTANCE, name: PCSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadImageA(hinst.toString(), name.toString(), type.toInt(), cx, cy, fuload.toInt()) as String).toLong() else 0L

public actual fun LoadImageW(hinst: HINSTANCE, name: PCWSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadImageW(hinst.toString(), name.toString(), type.toInt(), cx, cy, fuload.toInt()) as String).toLong() else 0L

public actual fun LoadMenuA(hinstance: HINSTANCE, lpmenuname: PCSTR): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuA(hinstance.toString(), lpmenuname.toString()) as String).toLong() else 0L

public actual fun LoadMenuIndirectA(lpmenutemplate: Long): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectA(lpmenutemplate.toString()) as String).toLong() else 0L

public actual fun LoadMenuIndirectW(lpmenutemplate: Long): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectW(lpmenutemplate.toString()) as String).toLong() else 0L

public actual fun LoadMenuW(hinstance: HINSTANCE, lpmenuname: PCWSTR): HMENU =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuW(hinstance.toString(), lpmenuname.toString()) as String).toLong() else 0L

public actual fun LoadStringA(hinstance: HINSTANCE, uid: UInt, lpbuffer: PSTR, cchbuffermax: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadStringA(hinstance.toString(), uid.toInt(), lpbuffer.toString(), cchbuffermax) as Int) else 0

public actual fun LoadStringW(hinstance: HINSTANCE, uid: UInt, lpbuffer: PWSTR, cchbuffermax: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LoadStringW(hinstance.toString(), uid.toInt(), lpbuffer.toString(), cchbuffermax) as Int) else 0

public actual fun LockSetForegroundWindow(ulockcode: FOREGROUND_WINDOW_LOCK_CODE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LockSetForegroundWindow(ulockcode.toInt()) as Int) else 0

public actual fun LogicalToPhysicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LogicalToPhysicalPoint(hwnd.toString(), lppoint.toString()) as Int) else 0

public actual fun LookupIconIdFromDirectory(presbits: Long, ficon: BOOL): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectory(presbits.toString(), ficon) as Int) else 0

public actual fun LookupIconIdFromDirectoryEx(presbits: Long, ficon: BOOL, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectoryEx(presbits.toString(), ficon, cxdesired, cydesired, flags.toInt()) as Int) else 0

public actual fun MapDialogRect(hdlg: HWND, lprect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MapDialogRect(hdlg.toString(), lprect.toString()) as Int) else 0

public actual fun MenuItemFromPoint(hwnd: HWND, hmenu: HMENU, ptscreen: POINT): Int =
    0

public actual fun MessageBoxA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxA(hwnd.toString(), lptext.toString(), lpcaption.toString(), utype.toInt()) as Int) else 0

public actual fun MessageBoxExA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExA(hwnd.toString(), lptext.toString(), lpcaption.toString(), utype.toInt(), wlanguageid.toInt()) as Int) else 0

public actual fun MessageBoxExW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExW(hwnd.toString(), lptext.toString(), lpcaption.toString(), utype.toInt(), wlanguageid.toInt()) as Int) else 0

public actual fun MessageBoxIndirectA(lpmbp: Long): MESSAGEBOX_RESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectA(lpmbp.toString()) as Int) else 0

public actual fun MessageBoxIndirectW(lpmbp: Long): MESSAGEBOX_RESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectW(lpmbp.toString()) as Int) else 0

public actual fun MessageBoxW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxW(hwnd.toString(), lptext.toString(), lpcaption.toString(), utype.toInt()) as Int) else 0

public actual fun ModifyMenuA(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuA(hmnu.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.toString()) as Int) else 0

public actual fun ModifyMenuW(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuW(hmnu.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.toString()) as Int) else 0

public actual fun MoveWindow(hwnd: HWND, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: BOOL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MoveWindow(hwnd.toString(), x, y, nwidth, nheight, brepaint) as Int) else 0

public actual fun MrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmlfile: PCWSTR): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfig(platformversion, defaultqualifiers.toString(), outputxmlfile.toString()) as Int) else 0

public actual fun MrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfigInMemory(platformversion, defaultqualifiers.toString(), outputxmldata.toString(), outputxmlsize.toString()) as Int) else 0

public actual fun MrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: Long, outputprisize: Long): HRESULT =
    0

public actual fun MrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceIndexer(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, indexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexer(packagefamilyname.toString(), projectroot.toString(), platformversion, defaultqualifiers.toString(), indexer.toString()) as Int) else 0

public actual fun MrmCreateResourceIndexerFromPreviousPriData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, pridata: Long, prisize: UInt, indexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriData(projectroot.toString(), platformversion, defaultqualifiers.toString(), pridata.toString(), prisize.toInt(), indexer.toString()) as Int) else 0

public actual fun MrmCreateResourceIndexerFromPreviousPriFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, prifile: PCWSTR, indexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriFile(projectroot.toString(), platformversion, defaultqualifiers.toString(), prifile.toString(), indexer.toString()) as Int) else 0

public actual fun MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemaxmldata: Long, schemaxmlsize: UInt, indexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaData(projectroot.toString(), platformversion, defaultqualifiers.toString(), schemaxmldata.toString(), schemaxmlsize.toInt(), indexer.toString()) as Int) else 0

public actual fun MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemafile: PCWSTR, indexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot.toString(), platformversion, defaultqualifiers.toString(), schemafile.toString(), indexer.toString()) as Int) else 0

public actual fun MrmCreateResourceIndexerWithFlags(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, flags: MrmIndexerFlags, indexer: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerWithFlags(packagefamilyname.toString(), projectroot.toString(), platformversion, defaultqualifiers.toString(), flags, indexer.toString()) as Int) else 0

public actual fun MrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): HRESULT =
    0

public actual fun MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: UInt, schemapridata: Long, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriDataInMemory(inputpridata.toString(), inputprisize.toInt(), schemapridata.toString(), schemaprisize.toInt(), dumptype, outputxmldata.toString(), outputxmlsize.toString()) as Int) else 0

public actual fun MrmDumpPriFile(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmlfile: PCWSTR): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFile(indexfilename.toString(), schemaprifile.toString(), dumptype, outputxmlfile.toString()) as Int) else 0

public actual fun MrmDumpPriFileInMemory(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFileInMemory(indexfilename.toString(), schemaprifile.toString(), dumptype, outputxmldata.toString(), outputxmlsize.toString()) as Int) else 0

public actual fun MrmFreeMemory(data: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmFreeMemory(data.toString()) as Int) else 0

public actual fun MrmGetPriFileContentChecksum(prifile: PCWSTR, checksum: Long): HRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MrmGetPriFileContentChecksum(prifile.toString(), checksum.toString()) as Int) else 0

public actual fun MrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, embeddeddata: Long, embeddeddatasize: UInt, qualifiers: PCWSTR): HRESULT =
    0

public actual fun MrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, filepath: PCWSTR, qualifiers: PCWSTR): HRESULT =
    0

public actual fun MrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: PCWSTR): HRESULT =
    0

public actual fun MrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: PCWSTR): HRESULT =
    0

public actual fun MrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, resourcestring: PCWSTR, qualifiers: PCWSTR): HRESULT =
    0

public actual fun MrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: Long, nummsgs: Long): HRESULT =
    0

public actual fun MsgWaitForMultipleObjects(ncount: UInt, phandles: Long, fwaitall: BOOL, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS): WAIT_EVENT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjects(ncount.toInt(), phandles.toString(), fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()) as Int).toUInt() else 0u

public actual fun MsgWaitForMultipleObjectsEx(ncount: UInt, phandles: Long, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS, dwflags: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS): WAIT_EVENT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjectsEx(ncount.toInt(), phandles.toString(), dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun OemToCharA(psrc: PCSTR, pdst: PSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_OemToCharA(psrc.toString(), pdst.toString()) as Int) else 0

public actual fun OemToCharBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffA(lpszsrc.toString(), lpszdst.toString(), cchdstlength.toInt()) as Int) else 0

public actual fun OemToCharBuffW(lpszsrc: PCSTR, lpszdst: PWSTR, cchdstlength: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffW(lpszsrc.toString(), lpszdst.toString(), cchdstlength.toInt()) as Int) else 0

public actual fun OemToCharW(psrc: PCSTR, pdst: PWSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_OemToCharW(psrc.toString(), pdst.toString()) as Int) else 0

public actual fun OpenIcon(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_OpenIcon(hwnd.toString()) as Int) else 0

public actual fun PeekMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PeekMessageA(lpmsg.toString(), hwnd.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) as Int) else 0

public actual fun PeekMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PeekMessageW(lpmsg.toString(), hwnd.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) as Int) else 0

public actual fun PhysicalToLogicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PhysicalToLogicalPoint(hwnd.toString(), lppoint.toString()) as Int) else 0

public actual fun PostMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PostMessageA(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun PostMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PostMessageW(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun PostQuitMessage(nexitcode: Int) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PostQuitMessage(nexitcode)
    }
}

public actual fun PostThreadMessageA(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun PostThreadMessageW(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun PrivateExtractIconsA(szfilename: PCSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsA(szfilename.toString(), niconindex, cxicon, cyicon, phicon.toString(), piconid.toString(), nicons.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun PrivateExtractIconsW(szfilename: PCWSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsW(szfilename.toString(), niconindex, cxicon, cyicon, phicon.toString(), piconid.toString(), nicons.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RealChildWindowFromPoint(hwndparent: HWND, ptparentclientcoords: POINT): HWND =
    0L

public actual fun RealGetWindowClassA(hwnd: HWND, ptszclassname: PSTR, cchclassnamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassA(hwnd.toString(), ptszclassname.toString(), cchclassnamemax.toInt()) as Int).toUInt() else 0u

public actual fun RealGetWindowClassW(hwnd: HWND, ptszclassname: PWSTR, cchclassnamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassW(hwnd.toString(), ptszclassname.toString(), cchclassnamemax.toInt()) as Int).toUInt() else 0u

public actual fun RegisterClassA(lpwndclass: Long): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassA(lpwndclass.toString()) as Int).toUShort() else 0u

public actual fun RegisterClassExA(param0: Long): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExA(param0.toString()) as Int).toUShort() else 0u

public actual fun RegisterClassExW(param0: Long): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExW(param0.toString()) as Int).toUShort() else 0u

public actual fun RegisterClassW(lpwndclass: Long): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassW(lpwndclass.toString()) as Int).toUShort() else 0u

public actual fun RegisterDeviceNotificationA(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationA(hrecipient.toString(), notificationfilter.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun RegisterDeviceNotificationW(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationW(hrecipient.toString(), notificationfilter.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun RegisterForTooltipDismissNotification(hwnd: HWND, tdflags: TOOLTIP_DISMISS_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterForTooltipDismissNotification(hwnd.toString(), tdflags) as Int) else 0

public actual fun RegisterShellHookWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterShellHookWindow(hwnd.toString()) as Int) else 0

public actual fun RegisterWindowMessageA(lpstring: PCSTR): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageA(lpstring.toString()) as Int).toUInt() else 0u

public actual fun RegisterWindowMessageW(lpstring: PCWSTR): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageW(lpstring.toString()) as Int).toUInt() else 0u

public actual fun RemoveMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RemoveMenu(hmenu.toString(), uposition.toInt(), uflags.toInt()) as Int) else 0

public actual fun RemovePropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RemovePropA(hwnd.toString(), lpstring.toString()) as String).toLong() else 0L

public actual fun RemovePropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_RemovePropW(hwnd.toString(), lpstring.toString()) as String).toLong() else 0L

public actual fun ReplyMessage(lresult: LRESULT): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ReplyMessage(lresult.toString()) as Int) else 0

public actual fun ScrollDC(hdc: HDC, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: HRGN, lprcupdate: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ScrollDC(hdc.toString(), dx, dy, lprcscroll.toString(), lprcclip.toString(), hrgnupdate.toString(), lprcupdate.toString()) as Int) else 0

public actual fun ScrollWindow(hwnd: HWND, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ScrollWindow(hwnd.toString(), xamount, yamount, lprect.toString(), lpcliprect.toString()) as Int) else 0

public actual fun ScrollWindowEx(hwnd: HWND, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: HRGN, prcupdate: Long, flags: SCROLL_WINDOW_FLAGS): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ScrollWindowEx(hwnd.toString(), dx, dy, prcscroll.toString(), prcclip.toString(), hrgnupdate.toString(), prcupdate.toString(), flags.toInt()) as Int) else 0

public actual fun SendDlgItemMessageA(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageA(hdlg.toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun SendDlgItemMessageW(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageW(hdlg.toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun SendMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendMessageA(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun SendMessageCallbackA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackA(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString(), lpresultcallback.toLong().toString(), dwdata.toString()) as Int) else 0

public actual fun SendMessageCallbackW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackW(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString(), lpresultcallback.toLong().toString(), dwdata.toString()) as Int) else 0

public actual fun SendMessageTimeoutA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutA(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), lpdwresult.toString()) as String).toLong() else 0L

public actual fun SendMessageTimeoutW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutW(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), lpdwresult.toString()) as String).toLong() else 0L

public actual fun SendMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendMessageW(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else 0L

public actual fun SendNotifyMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageA(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun SendNotifyMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageW(hwnd.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else 0

public actual fun SetAdditionalForegroundBoostProcesses(toplevelwindow: HWND, processhandlecount: UInt, processhandlearray: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetAdditionalForegroundBoostProcesses(toplevelwindow.toString(), processhandlecount.toInt(), processhandlearray.toString()) as Int) else 0

public actual fun SetCaretBlinkTime(umseconds: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetCaretBlinkTime(umseconds.toInt()) as Int) else 0

public actual fun SetCaretPos(x: Int, y: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetCaretPos(x, y) as Int) else 0

public actual fun SetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongA(hwnd.toString(), nindex, dwnewlong) as Int).toUInt() else 0u

public actual fun SetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrA(hwnd.toString(), nindex, dwnewlong.toString()) as String).toULong() else 0uL

public actual fun SetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrW(hwnd.toString(), nindex, dwnewlong.toString()) as String).toULong() else 0uL

public actual fun SetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongW(hwnd.toString(), nindex, dwnewlong) as Int).toUInt() else 0u

public actual fun SetClassWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetClassWord(hwnd.toString(), nindex, wnewword.toInt()) as Int).toUShort() else 0u

public actual fun SetCoalescableTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC, utolerancedelay: UInt): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetCoalescableTimer(hwnd.toString(), nidevent.toString(), uelapse.toInt(), lptimerfunc.toLong().toString(), utolerancedelay.toInt()) as String).toULong() else 0uL

public actual fun SetCursor(hcursor: HCURSOR): HCURSOR =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetCursor(hcursor.toString()) as String).toLong() else 0L

public actual fun SetCursorPos(x: Int, y: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetCursorPos(x, y) as Int) else 0

public actual fun SetDebugErrorLevel(dwlevel: UInt) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetDebugErrorLevel(dwlevel.toInt())
    }
}

public actual fun SetDlgItemInt(hdlg: HWND, niddlgitem: Int, uvalue: UInt, bsigned: BOOL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemInt(hdlg.toString(), niddlgitem, uvalue.toInt(), bsigned) as Int) else 0

public actual fun SetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PCSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextA(hdlg.toString(), niddlgitem, lpstring.toString()) as Int) else 0

public actual fun SetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PCWSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextW(hdlg.toString(), niddlgitem, lpstring.toString()) as Int) else 0

public actual fun SetForegroundWindow(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetForegroundWindow(hwnd.toString()) as Int) else 0

public actual fun SetLayeredWindowAttributes(hwnd: HWND, crkey: COLORREF, balpha: UByte, dwflags: LAYERED_WINDOW_ATTRIBUTES_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetLayeredWindowAttributes(hwnd.toString(), crkey.toInt(), balpha.toInt(), dwflags.toInt()) as Int) else 0

public actual fun SetMenu(hwnd: HWND, hmenu: HMENU): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMenu(hwnd.toString(), hmenu.toString()) as Int) else 0

public actual fun SetMenuDefaultItem(hmenu: HMENU, uitem: UInt, fbypos: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMenuDefaultItem(hmenu.toString(), uitem.toInt(), fbypos.toInt()) as Int) else 0

public actual fun SetMenuInfo(param0: HMENU, param1: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMenuInfo(param0.toString(), param1.toString()) as Int) else 0

public actual fun SetMenuItemBitmaps(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, hbitmapunchecked: HBITMAP, hbitmapchecked: HBITMAP): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemBitmaps(hmenu.toString(), uposition.toInt(), uflags.toInt(), hbitmapunchecked.toString(), hbitmapchecked.toString()) as Int) else 0

public actual fun SetMenuItemInfoA(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoA(hmenu.toString(), item.toInt(), fbypositon, lpmii.toString()) as Int) else 0

public actual fun SetMenuItemInfoW(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoW(hmenu.toString(), item.toInt(), fbypositon, lpmii.toString()) as Int) else 0

public actual fun SetMessageExtraInfo(lparam: LPARAM): LPARAM =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMessageExtraInfo(lparam.toString()) as String).toLong() else 0L

public actual fun SetMessageQueue(cmessagesmax: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetMessageQueue(cmessagesmax) as Int) else 0

public actual fun SetParent(hwndchild: HWND, hwndnewparent: HWND): HWND =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetParent(hwndchild.toString(), hwndnewparent.toString()) as String).toLong() else 0L

public actual fun SetPhysicalCursorPos(x: Int, y: Int): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetPhysicalCursorPos(x, y) as Int) else 0

public actual fun SetProcessDPIAware(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetProcessDPIAware() as Int) else 0

public actual fun SetProcessDefaultLayout(dwdefaultlayout: UInt): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetProcessDefaultLayout(dwdefaultlayout.toInt()) as Int) else 0

public actual fun SetPropA(hwnd: HWND, lpstring: PCSTR, hdata: HANDLE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetPropA(hwnd.toString(), lpstring.toString(), hdata.toString()) as Int) else 0

public actual fun SetPropW(hwnd: HWND, lpstring: PCWSTR, hdata: HANDLE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetPropW(hwnd.toString(), lpstring.toString(), hdata.toString()) as Int) else 0

public actual fun SetSystemCursor(hcur: HCURSOR, id: SYSTEM_CURSOR_ID): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetSystemCursor(hcur.toString(), id.toInt()) as Int) else 0

public actual fun SetTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetTimer(hwnd.toString(), nidevent.toString(), uelapse.toInt(), lptimerfunc.toLong().toString()) as String).toULong() else 0uL

public actual fun SetWindowDisplayAffinity(hwnd: HWND, dwaffinity: WINDOW_DISPLAY_AFFINITY): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowDisplayAffinity(hwnd.toString(), dwaffinity.toInt()) as Int) else 0

public actual fun SetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongA(hwnd.toString(), nindex, dwnewlong) as Int) else 0

public actual fun SetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrA(hwnd.toString(), nindex, dwnewlong.toString()) as String).toLong() else 0L

public actual fun SetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrW(hwnd.toString(), nindex, dwnewlong.toString()) as String).toLong() else 0L

public actual fun SetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongW(hwnd.toString(), nindex, dwnewlong) as Int) else 0

public actual fun SetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowPlacement(hwnd.toString(), lpwndpl.toString()) as Int) else 0

public actual fun SetWindowPos(hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowPos(hwnd.toString(), hwndinsertafter.toString(), x, y, cx, cy, uflags.toInt()) as Int) else 0

public actual fun SetWindowTextA(hwnd: HWND, lpstring: PCSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextA(hwnd.toString(), lpstring.toString()) as Int) else 0

public actual fun SetWindowTextW(hwnd: HWND, lpstring: PCWSTR): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextW(hwnd.toString(), lpstring.toString()) as Int) else 0

public actual fun SetWindowWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowWord(hwnd.toString(), nindex, wnewword.toInt()) as Int).toUShort() else 0u

public actual fun SetWindowsHookA(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookA(nfiltertype, pfnfilterproc.toLong().toString()) as String).toLong() else 0L

public actual fun SetWindowsHookExA(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExA(idhook, lpfn.toLong().toString(), hmod.toString(), dwthreadid.toInt()) as String).toLong() else 0L

public actual fun SetWindowsHookExW(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExW(idhook, lpfn.toLong().toString(), hmod.toString(), dwthreadid.toInt()) as String).toLong() else 0L

public actual fun SetWindowsHookW(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookW(nfiltertype, pfnfilterproc.toLong().toString()) as String).toLong() else 0L

public actual fun ShowCaret(hwnd: HWND): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ShowCaret(hwnd.toString()) as Int) else 0

public actual fun ShowCursor(bshow: BOOL): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ShowCursor(bshow) as Int) else 0

public actual fun ShowOwnedPopups(hwnd: HWND, fshow: BOOL): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ShowOwnedPopups(hwnd.toString(), fshow) as Int) else 0

public actual fun ShowWindow(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ShowWindow(hwnd.toString(), ncmdshow) as Int) else 0

public actual fun ShowWindowAsync(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_ShowWindowAsync(hwnd.toString(), ncmdshow) as Int) else 0

public actual fun SoundSentry(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SoundSentry() as Int) else 0

public actual fun SwitchToThisWindow(hwnd: HWND, funknown: BOOL) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SwitchToThisWindow(hwnd.toString(), funknown)
    }
}

public actual fun SystemParametersInfoA(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoA(uiaction.toInt(), uiparam.toInt(), pvparam.toString(), fwinini.toInt()) as Int) else 0

public actual fun SystemParametersInfoW(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoW(uiaction.toInt(), uiparam.toInt(), pvparam.toString(), fwinini.toInt()) as Int) else 0

public actual fun TileWindows(hwndparent: HWND, whow: TILE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TileWindows(hwndparent.toString(), whow.toInt(), lprect.toString(), ckids.toInt(), lpkids.toString()) as Int).toUShort() else 0u

public actual fun TrackPopupMenu(hmenu: HMENU, uflags: TRACK_POPUP_MENU_FLAGS, x: Int, y: Int, nreserved: Int, hwnd: HWND, prcrect: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenu(hmenu.toString(), uflags.toInt(), x, y, nreserved, hwnd.toString(), prcrect.toString()) as Int) else 0

public actual fun TrackPopupMenuEx(hmenu: HMENU, uflags: UInt, x: Int, y: Int, hwnd: HWND, lptpm: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenuEx(hmenu.toString(), uflags.toInt(), x, y, hwnd.toString(), lptpm.toString()) as Int) else 0

public actual fun TranslateAcceleratorA(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorA(hwnd.toString(), hacctable.toString(), lpmsg.toString()) as Int) else 0

public actual fun TranslateAcceleratorW(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorW(hwnd.toString(), hacctable.toString(), lpmsg.toString()) as Int) else 0

public actual fun TranslateMDISysAccel(hwndclient: HWND, lpmsg: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TranslateMDISysAccel(hwndclient.toString(), lpmsg.toString()) as Int) else 0

public actual fun TranslateMessage(lpmsg: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_TranslateMessage(lpmsg.toString()) as Int) else 0

public actual fun UnhookWindowsHook(ncode: Int, pfnfilterproc: HOOKPROC): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHook(ncode, pfnfilterproc.toLong().toString()) as Int) else 0

public actual fun UnhookWindowsHookEx(hhk: HHOOK): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHookEx(hhk.toString()) as Int) else 0

public actual fun UnregisterClassA(lpclassname: PCSTR, hinstance: HINSTANCE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassA(lpclassname.toString(), hinstance.toString()) as Int) else 0

public actual fun UnregisterClassW(lpclassname: PCWSTR, hinstance: HINSTANCE): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassW(lpclassname.toString(), hinstance.toString()) as Int) else 0

public actual fun UnregisterDeviceNotification(handle: HDEVNOTIFY): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UnregisterDeviceNotification(handle.toString()) as Int) else 0

public actual fun UpdateLayeredWindow(hwnd: HWND, hdcdst: HDC, pptdst: Long, psize: Long, hdcsrc: HDC, pptsrc: Long, crkey: COLORREF, pblend: Long, dwflags: UPDATE_LAYERED_WINDOW_FLAGS): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindow(hwnd.toString(), hdcdst.toString(), pptdst.toString(), psize.toString(), hdcsrc.toString(), pptsrc.toString(), crkey.toInt(), pblend.toString(), dwflags.toInt()) as Int) else 0

public actual fun UpdateLayeredWindowIndirect(hwnd: HWND, pulwinfo: Long): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindowIndirect(hwnd.toString(), pulwinfo.toString()) as Int) else 0

public actual fun WaitMessage(): BOOL =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_WaitMessage() as Int) else 0

public actual fun WindowFromPhysicalPoint(point: POINT): HWND =
    0L

public actual fun WindowFromPoint(point: POINT): HWND =
    0L

public actual fun wsprintfA(param0: PSTR, param1: PCSTR): Int =
    0

public actual fun wsprintfW(param0: PWSTR, param1: PCWSTR): Int =
    0

public actual fun wvsprintfA(param0: PSTR, param1: PCSTR, arglist: Long): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(param0.toString(), param1.toString(), arglist.toString()) as Int) else 0

public actual fun wvsprintfW(param0: PWSTR, param1: PCWSTR, arglist: Long): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(param0.toString(), param1.toString(), arglist.toString()) as Int) else 0
