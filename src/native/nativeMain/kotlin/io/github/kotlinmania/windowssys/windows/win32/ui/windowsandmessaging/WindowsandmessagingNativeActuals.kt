@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AdjustWindowRect(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRect(lprect.toCPointer<ByteVar>(), dwstyle, bmenu)

public actual fun AdjustWindowRectEx(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRectEx(lprect.toCPointer<ByteVar>(), dwstyle, bmenu, dwexstyle)

public actual fun AllowSetForegroundWindow(dwprocessid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AllowSetForegroundWindow(dwprocessid)

public actual fun AnimateWindow(hwnd: HWND, dwtime: UInt, dwflags: ANIMATE_WINDOW_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AnimateWindow(hwnd.toCPointer<ByteVar>(), dwtime, dwflags)

public actual fun AnyPopup(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AnyPopup()

public actual fun AppendMenuA(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AppendMenuA(hmenu.toCPointer<ByteVar>(), uflags, uidnewitem, lpnewitem.toCPointer<ByteVar>())

public actual fun AppendMenuW(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_AppendMenuW(hmenu.toCPointer<ByteVar>(), uflags, uidnewitem, lpnewitem.toCPointer<ByteVar>())

public actual fun ArrangeIconicWindows(hwnd: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ArrangeIconicWindows(hwnd.toCPointer<ByteVar>())

public actual fun BeginDeferWindowPos(nnumwindows: Int): HDWP =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_BeginDeferWindowPos(nnumwindows)?.toLong() ?: 0L

public actual fun BringWindowToTop(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_BringWindowToTop(hwnd.toCPointer<ByteVar>())

public actual fun CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: UInt, excluderect: Long, popupwindowposition: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CalculatePopupWindowPosition(anchorpoint.toCPointer<ByteVar>(), windowsize.toCPointer<ByteVar>(), flags, excluderect.toCPointer<ByteVar>(), popupwindowposition.toCPointer<ByteVar>())

public actual fun CallMsgFilterA(lpmsg: Long, ncode: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterA(lpmsg.toCPointer<ByteVar>(), ncode)

public actual fun CallMsgFilterW(lpmsg: Long, ncode: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterW(lpmsg.toCPointer<ByteVar>(), ncode)

public actual fun CallNextHookEx(hhk: HHOOK, ncode: Int, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CallNextHookEx(hhk.toCPointer<ByteVar>(), ncode, wparam, lparam)

public actual fun CallWindowProcA(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcA(lpprevwndfunc.toLong().toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun CallWindowProcW(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcW(lpprevwndfunc.toLong().toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun CancelShutdown(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CancelShutdown()

public actual fun CascadeWindows(hwndparent: HWND, whow: CASCADE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CascadeWindows(hwndparent.toCPointer<ByteVar>(), whow, lprect.toCPointer<ByteVar>(), ckids, lpkids.toCPointer<ByteVar>())

public actual fun ChangeMenuA(hmenu: HMENU, cmd: UInt, lpsznewitem: PCSTR, cmdinsert: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuA(hmenu.toCPointer<ByteVar>(), cmd, lpsznewitem.toCPointer<ByteVar>(), cmdinsert, flags)

public actual fun ChangeMenuW(hmenu: HMENU, cmd: UInt, lpsznewitem: PCWSTR, cmdinsert: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuW(hmenu.toCPointer<ByteVar>(), cmd, lpsznewitem.toCPointer<ByteVar>(), cmdinsert, flags)

public actual fun ChangeWindowMessageFilter(message: UInt, dwflag: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilter(message, dwflag)

public actual fun ChangeWindowMessageFilterEx(hwnd: HWND, message: UInt, action: WINDOW_MESSAGE_FILTER_ACTION, pchangefilterstruct: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilterEx(hwnd.toCPointer<ByteVar>(), message, action, pchangefilterstruct.toCPointer<ByteVar>())

public actual fun CharLowerA(lpsz: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharLowerA(lpsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharLowerBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffA(lpsz.toCPointer<ByteVar>(), cchlength)

public actual fun CharLowerBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffW(lpsz.toCPointer<ByteVar>(), cchlength)

public actual fun CharLowerW(lpsz: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharLowerW(lpsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharNextA(lpsz: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharNextA(lpsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharNextExA(codepage: UShort, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharNextExA(codepage, lpcurrentchar.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun CharNextW(lpsz: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharNextW(lpsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharPrevA(lpszstart: PCSTR, lpszcurrent: PCSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharPrevA(lpszstart.toCPointer<ByteVar>(), lpszcurrent.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharPrevExA(codepage: UShort, lpstart: PCSTR, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharPrevExA(codepage, lpstart.toCPointer<ByteVar>(), lpcurrentchar.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun CharPrevW(lpszstart: PCWSTR, lpszcurrent: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharPrevW(lpszstart.toCPointer<ByteVar>(), lpszcurrent.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharToOemA(psrc: PCSTR, pdst: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharToOemA(psrc.toCPointer<ByteVar>(), pdst.toCPointer<ByteVar>())

public actual fun CharToOemBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffA(lpszsrc.toCPointer<ByteVar>(), lpszdst.toCPointer<ByteVar>(), cchdstlength)

public actual fun CharToOemBuffW(lpszsrc: PCWSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffW(lpszsrc.toCPointer<ByteVar>(), lpszdst.toCPointer<ByteVar>(), cchdstlength)

public actual fun CharToOemW(psrc: PCWSTR, pdst: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharToOemW(psrc.toCPointer<ByteVar>(), pdst.toCPointer<ByteVar>())

public actual fun CharUpperA(lpsz: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharUpperA(lpsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CharUpperBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffA(lpsz.toCPointer<ByteVar>(), cchlength)

public actual fun CharUpperBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffW(lpsz.toCPointer<ByteVar>(), cchlength)

public actual fun CharUpperW(lpsz: PWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CharUpperW(lpsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CheckMenuItem(hmenu: HMENU, uidcheckitem: UInt, ucheck: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CheckMenuItem(hmenu.toCPointer<ByteVar>(), uidcheckitem, ucheck)

public actual fun CheckMenuRadioItem(hmenu: HMENU, first: UInt, last: UInt, check: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CheckMenuRadioItem(hmenu.toCPointer<ByteVar>(), first, last, check, flags)

public actual fun ChildWindowFromPoint(hwndparent: HWND, point: POINT): HWND =
    0L

public actual fun ChildWindowFromPointEx(hwnd: HWND, pt: POINT, flags: CWP_FLAGS): HWND =
    0L

public actual fun ClipCursor(lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ClipCursor(lprect.toCPointer<ByteVar>())

public actual fun CloseWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CloseWindow(hwnd.toCPointer<ByteVar>())

public actual fun CopyAcceleratorTableA(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableA(haccelsrc.toCPointer<ByteVar>(), lpacceldst.toCPointer<ByteVar>(), caccelentries)

public actual fun CopyAcceleratorTableW(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableW(haccelsrc.toCPointer<ByteVar>(), lpacceldst.toCPointer<ByteVar>(), caccelentries)

public actual fun CopyIcon(hicon: HICON): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CopyIcon(hicon.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CopyImage(h: HANDLE, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, flags: IMAGE_FLAGS): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CopyImage(h.toCPointer<ByteVar>(), type, cx, cy, flags)?.toLong() ?: 0L

public actual fun CreateAcceleratorTableA(paccel: Long, caccel: Int): HACCEL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableA(paccel.toCPointer<ByteVar>(), caccel)?.toLong() ?: 0L

public actual fun CreateAcceleratorTableW(paccel: Long, caccel: Int): HACCEL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableW(paccel.toCPointer<ByteVar>(), caccel)?.toLong() ?: 0L

public actual fun CreateCaret(hwnd: HWND, hbitmap: HBITMAP, nwidth: Int, nheight: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateCaret(hwnd.toCPointer<ByteVar>(), hbitmap.toCPointer<ByteVar>(), nwidth, nheight)

public actual fun CreateCursor(hinst: HINSTANCE, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateCursor(hinst.toCPointer<ByteVar>(), xhotspot, yhotspot, nwidth, nheight, pvandplane.toCPointer<ByteVar>(), pvxorplane.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDialogIndirectParamA(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamA(hinstance.toCPointer<ByteVar>(), lptemplate.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)?.toLong() ?: 0L

public actual fun CreateDialogIndirectParamW(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamW(hinstance.toCPointer<ByteVar>(), lptemplate.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)?.toLong() ?: 0L

public actual fun CreateDialogParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamA(hinstance.toCPointer<ByteVar>(), lptemplatename.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)?.toLong() ?: 0L

public actual fun CreateDialogParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamW(hinstance.toCPointer<ByteVar>(), lptemplatename.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)?.toLong() ?: 0L

public actual fun CreateIcon(hinstance: HINSTANCE, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: Long, lpbxorbits: Long): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateIcon(hinstance.toCPointer<ByteVar>(), nwidth, nheight, cplanes, cbitspixel, lpbandbits.toCPointer<ByteVar>(), lpbxorbits.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateIconFromResource(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResource(presbits.toCPointer<ByteVar>(), dwressize, ficon, dwver)?.toLong() ?: 0L

public actual fun CreateIconFromResourceEx(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResourceEx(presbits.toCPointer<ByteVar>(), dwressize, ficon, dwver, cxdesired, cydesired, flags)?.toLong() ?: 0L

public actual fun CreateIconIndirect(piconinfo: Long): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateIconIndirect(piconinfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMDIWindowA(lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowA(lpclassname.toCPointer<ByteVar>(), lpwindowname.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lparam)?.toLong() ?: 0L

public actual fun CreateMDIWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowW(lpclassname.toCPointer<ByteVar>(), lpwindowname.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lparam)?.toLong() ?: 0L

public actual fun CreateMenu(): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateMenu()?.toLong() ?: 0L

public actual fun CreatePopupMenu(): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreatePopupMenu()?.toLong() ?: 0L

public actual fun CreateResourceIndexer(projectroot: PCWSTR, extensiondllpath: PCWSTR, ppresourceindexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateResourceIndexer(projectroot.toCPointer<ByteVar>(), extensiondllpath.toCPointer<ByteVar>(), ppresourceindexer.toCPointer<ByteVar>())

public actual fun CreateWindowExA(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExA(dwexstyle, lpclassname.toCPointer<ByteVar>(), lpwindowname.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpparam.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateWindowExW(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExW(dwexstyle, lpclassname.toCPointer<ByteVar>(), lpwindowname.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), lpparam.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DefDlgProcA(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcA(hdlg.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun DefDlgProcW(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcW(hdlg.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun DefFrameProcA(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcA(hwnd.toCPointer<ByteVar>(), hwndmdiclient.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun DefFrameProcW(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcW(hwnd.toCPointer<ByteVar>(), hwndmdiclient.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun DefMDIChildProcA(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcA(hwnd.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun DefMDIChildProcW(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcW(hwnd.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun DefWindowProcA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcA(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun DefWindowProcW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcW(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun DeferWindowPos(hwinposinfo: HDWP, hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): HDWP =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DeferWindowPos(hwinposinfo.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), hwndinsertafter.toCPointer<ByteVar>(), x, y, cx, cy, uflags)?.toLong() ?: 0L

public actual fun DeleteMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DeleteMenu(hmenu.toCPointer<ByteVar>(), uposition, uflags)

public actual fun DeregisterShellHookWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DeregisterShellHookWindow(hwnd.toCPointer<ByteVar>())

public actual fun DestroyAcceleratorTable(haccel: HACCEL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyAcceleratorTable(haccel.toCPointer<ByteVar>())

public actual fun DestroyCaret(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyCaret()

public actual fun DestroyCursor(hcursor: HCURSOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyCursor(hcursor.toCPointer<ByteVar>())

public actual fun DestroyIcon(hicon: HICON): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyIcon(hicon.toCPointer<ByteVar>())

public actual fun DestroyIndexedResults(resourceuri: PCWSTR, qualifiercount: UInt, qualifiers: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyIndexedResults(resourceuri.toCPointer<ByteVar>(), qualifiercount, qualifiers.toCPointer<ByteVar>())
}

public actual fun DestroyMenu(hmenu: HMENU): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyMenu(hmenu.toCPointer<ByteVar>())

public actual fun DestroyResourceIndexer(resourceindexer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyResourceIndexer(resourceindexer.toCPointer<ByteVar>())
}

public actual fun DestroyWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DestroyWindow(hwnd.toCPointer<ByteVar>())

public actual fun DialogBoxIndirectParamA(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamA(hinstance.toCPointer<ByteVar>(), hdialogtemplate.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)

public actual fun DialogBoxIndirectParamW(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamW(hinstance.toCPointer<ByteVar>(), hdialogtemplate.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)

public actual fun DialogBoxParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamA(hinstance.toCPointer<ByteVar>(), lptemplatename.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)

public actual fun DialogBoxParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamW(hinstance.toCPointer<ByteVar>(), lptemplatename.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), lpdialogfunc.toLong().toCPointer<ByteVar>(), dwinitparam)

public actual fun DisableProcessWindowsGhosting() {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DisableProcessWindowsGhosting()
}

public actual fun DispatchMessageA(lpmsg: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageA(lpmsg.toCPointer<ByteVar>())

public actual fun DispatchMessageW(lpmsg: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageW(lpmsg.toCPointer<ByteVar>())

public actual fun DragObject(hwndparent: HWND, hwndfrom: HWND, fmt: UInt, data: ULong, hcur: HCURSOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DragObject(hwndparent.toCPointer<ByteVar>(), hwndfrom.toCPointer<ByteVar>(), fmt, data, hcur.toCPointer<ByteVar>())

public actual fun DrawIcon(hdc: HDC, x: Int, y: Int, hicon: HICON): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DrawIcon(hdc.toCPointer<ByteVar>(), x, y, hicon.toCPointer<ByteVar>())

public actual fun DrawIconEx(hdc: HDC, xleft: Int, ytop: Int, hicon: HICON, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: HBRUSH, diflags: DI_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DrawIconEx(hdc.toCPointer<ByteVar>(), xleft, ytop, hicon.toCPointer<ByteVar>(), cxwidth, cywidth, istepifanicur, hbrflickerfreedraw.toCPointer<ByteVar>(), diflags)

public actual fun DrawMenuBar(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_DrawMenuBar(hwnd.toCPointer<ByteVar>())

public actual fun EnableMenuItem(hmenu: HMENU, uidenableitem: UInt, uenable: MENU_ITEM_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnableMenuItem(hmenu.toCPointer<ByteVar>(), uidenableitem, uenable)

public actual fun EndDeferWindowPos(hwinposinfo: HDWP): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EndDeferWindowPos(hwinposinfo.toCPointer<ByteVar>())

public actual fun EndDialog(hdlg: HWND, nresult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EndDialog(hdlg.toCPointer<ByteVar>(), nresult)

public actual fun EndMenu(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EndMenu()

public actual fun EnumChildWindows(hwndparent: HWND, lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumChildWindows(hwndparent.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumPropsA(hwnd: HWND, lpenumfunc: PROPENUMPROCA): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsA(hwnd.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>())

public actual fun EnumPropsExA(hwnd: HWND, lpenumfunc: PROPENUMPROCEXA, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExA(hwnd.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumPropsExW(hwnd: HWND, lpenumfunc: PROPENUMPROCEXW, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExW(hwnd.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumPropsW(hwnd: HWND, lpenumfunc: PROPENUMPROCW): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsW(hwnd.toCPointer<ByteVar>(), lpenumfunc.toLong().toCPointer<ByteVar>())

public actual fun EnumThreadWindows(dwthreadid: UInt, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumThreadWindows(dwthreadid, lpfn.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumWindows(lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_EnumWindows(lpenumfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun FindWindowA(lpclassname: PCSTR, lpwindowname: PCSTR): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_FindWindowA(lpclassname.toCPointer<ByteVar>(), lpwindowname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindWindowExA(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCSTR, lpszwindow: PCSTR): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_FindWindowExA(hwndparent.toCPointer<ByteVar>(), hwndchildafter.toCPointer<ByteVar>(), lpszclass.toCPointer<ByteVar>(), lpszwindow.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindWindowExW(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCWSTR, lpszwindow: PCWSTR): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_FindWindowExW(hwndparent.toCPointer<ByteVar>(), hwndchildafter.toCPointer<ByteVar>(), lpszclass.toCPointer<ByteVar>(), lpszwindow.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_FindWindowW(lpclassname.toCPointer<ByteVar>(), lpwindowname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FlashWindow(hwnd: HWND, binvert: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_FlashWindow(hwnd.toCPointer<ByteVar>(), binvert)

public actual fun FlashWindowEx(pfwi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_FlashWindowEx(pfwi.toCPointer<ByteVar>())

public actual fun GetAltTabInfoA(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PSTR, cchitemtext: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoA(hwnd.toCPointer<ByteVar>(), iitem, pati.toCPointer<ByteVar>(), pszitemtext.toCPointer<ByteVar>(), cchitemtext)

public actual fun GetAltTabInfoW(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PWSTR, cchitemtext: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoW(hwnd.toCPointer<ByteVar>(), iitem, pati.toCPointer<ByteVar>(), pszitemtext.toCPointer<ByteVar>(), cchitemtext)

public actual fun GetAncestor(hwnd: HWND, gaflags: GET_ANCESTOR_FLAGS): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetAncestor(hwnd.toCPointer<ByteVar>(), gaflags)?.toLong() ?: 0L

public actual fun GetCaretBlinkTime(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetCaretBlinkTime()

public actual fun GetCaretPos(lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetCaretPos(lppoint.toCPointer<ByteVar>())

public actual fun GetClassInfoA(hinstance: HINSTANCE, lpclassname: PCSTR, lpwndclass: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoA(hinstance.toCPointer<ByteVar>(), lpclassname.toCPointer<ByteVar>(), lpwndclass.toCPointer<ByteVar>())

public actual fun GetClassInfoExA(hinstance: HINSTANCE, lpszclass: PCSTR, lpwcx: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExA(hinstance.toCPointer<ByteVar>(), lpszclass.toCPointer<ByteVar>(), lpwcx.toCPointer<ByteVar>())

public actual fun GetClassInfoExW(hinstance: HINSTANCE, lpszclass: PCWSTR, lpwcx: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExW(hinstance.toCPointer<ByteVar>(), lpszclass.toCPointer<ByteVar>(), lpwcx.toCPointer<ByteVar>())

public actual fun GetClassInfoW(hinstance: HINSTANCE, lpclassname: PCWSTR, lpwndclass: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoW(hinstance.toCPointer<ByteVar>(), lpclassname.toCPointer<ByteVar>(), lpwndclass.toCPointer<ByteVar>())

public actual fun GetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongA(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrA(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrW(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongW(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetClassNameA(hwnd: HWND, lpclassname: PSTR, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassNameA(hwnd.toCPointer<ByteVar>(), lpclassname.toCPointer<ByteVar>(), nmaxcount)

public actual fun GetClassNameW(hwnd: HWND, lpclassname: PWSTR, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassNameW(hwnd.toCPointer<ByteVar>(), lpclassname.toCPointer<ByteVar>(), nmaxcount)

public actual fun GetClassWord(hwnd: HWND, nindex: Int): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClassWord(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetClientRect(hwnd: HWND, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClientRect(hwnd.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun GetClipCursor(lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetClipCursor(lprect.toCPointer<ByteVar>())

public actual fun GetCursor(): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetCursor()?.toLong() ?: 0L

public actual fun GetCursorInfo(pci: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetCursorInfo(pci.toCPointer<ByteVar>())

public actual fun GetCursorPos(lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetCursorPos(lppoint.toCPointer<ByteVar>())

public actual fun GetDesktopWindow(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDesktopWindow()?.toLong() ?: 0L

public actual fun GetDialogBaseUnits(): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDialogBaseUnits()

public actual fun GetDlgCtrlID(hwnd: HWND): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDlgCtrlID(hwnd.toCPointer<ByteVar>())

public actual fun GetDlgItem(hdlg: HWND, niddlgitem: Int): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItem(hdlg.toCPointer<ByteVar>(), niddlgitem)?.toLong() ?: 0L

public actual fun GetDlgItemInt(hdlg: HWND, niddlgitem: Int, lptranslated: Long, bsigned: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemInt(hdlg.toCPointer<ByteVar>(), niddlgitem, lptranslated.toCPointer<ByteVar>(), bsigned)

public actual fun GetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PSTR, cchmax: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextA(hdlg.toCPointer<ByteVar>(), niddlgitem, lpstring.toCPointer<ByteVar>(), cchmax)

public actual fun GetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PWSTR, cchmax: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextW(hdlg.toCPointer<ByteVar>(), niddlgitem, lpstring.toCPointer<ByteVar>(), cchmax)

public actual fun GetForegroundWindow(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetForegroundWindow()?.toLong() ?: 0L

public actual fun GetGUIThreadInfo(idthread: UInt, pgui: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetGUIThreadInfo(idthread, pgui.toCPointer<ByteVar>())

public actual fun GetIconInfo(hicon: HICON, piconinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfo(hicon.toCPointer<ByteVar>(), piconinfo.toCPointer<ByteVar>())

public actual fun GetIconInfoExA(hicon: HICON, piconinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExA(hicon.toCPointer<ByteVar>(), piconinfo.toCPointer<ByteVar>())

public actual fun GetIconInfoExW(hicon: HICON, piconinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExW(hicon.toCPointer<ByteVar>(), piconinfo.toCPointer<ByteVar>())

public actual fun GetInputState(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetInputState()

public actual fun GetLastActivePopup(hwnd: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetLastActivePopup(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetLayeredWindowAttributes(hwnd: HWND, pcrkey: Long, pbalpha: Long, pdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetLayeredWindowAttributes(hwnd.toCPointer<ByteVar>(), pcrkey.toCPointer<ByteVar>(), pbalpha.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun GetMenu(hwnd: HWND): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenu(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetMenuBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, iditem: Int, pmbi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuBarInfo(hwnd.toCPointer<ByteVar>(), idobject, iditem, pmbi.toCPointer<ByteVar>())

public actual fun GetMenuCheckMarkDimensions(): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuCheckMarkDimensions()

public actual fun GetMenuDefaultItem(hmenu: HMENU, fbypos: UInt, gmdiflags: GET_MENU_DEFAULT_ITEM_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuDefaultItem(hmenu.toCPointer<ByteVar>(), fbypos, gmdiflags)

public actual fun GetMenuInfo(param0: HMENU, param1: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuInfo(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun GetMenuItemCount(hmenu: HMENU): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemCount(hmenu.toCPointer<ByteVar>())

public actual fun GetMenuItemID(hmenu: HMENU, npos: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemID(hmenu.toCPointer<ByteVar>(), npos)

public actual fun GetMenuItemInfoA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoA(hmenu.toCPointer<ByteVar>(), item, fbyposition, lpmii.toCPointer<ByteVar>())

public actual fun GetMenuItemInfoW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoW(hmenu.toCPointer<ByteVar>(), item, fbyposition, lpmii.toCPointer<ByteVar>())

public actual fun GetMenuItemRect(hwnd: HWND, hmenu: HMENU, uitem: UInt, lprcitem: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemRect(hwnd.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>(), uitem, lprcitem.toCPointer<ByteVar>())

public actual fun GetMenuState(hmenu: HMENU, uid: UInt, uflags: MENU_ITEM_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuState(hmenu.toCPointer<ByteVar>(), uid, uflags)

public actual fun GetMenuStringA(hmenu: HMENU, uiditem: UInt, lpstring: PSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringA(hmenu.toCPointer<ByteVar>(), uiditem, lpstring.toCPointer<ByteVar>(), cchmax, flags)

public actual fun GetMenuStringW(hmenu: HMENU, uiditem: UInt, lpstring: PWSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringW(hmenu.toCPointer<ByteVar>(), uiditem, lpstring.toCPointer<ByteVar>(), cchmax, flags)

public actual fun GetMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMessageA(lpmsg.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax)

public actual fun GetMessageExtraInfo(): LPARAM =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMessageExtraInfo()

public actual fun GetMessagePos(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMessagePos()

public actual fun GetMessageTime(): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMessageTime()

public actual fun GetMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetMessageW(lpmsg.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax)

public actual fun GetNextDlgGroupItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgGroupItem(hdlg.toCPointer<ByteVar>(), hctl.toCPointer<ByteVar>(), bprevious)?.toLong() ?: 0L

public actual fun GetNextDlgTabItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgTabItem(hdlg.toCPointer<ByteVar>(), hctl.toCPointer<ByteVar>(), bprevious)?.toLong() ?: 0L

public actual fun GetParent(hwnd: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetParent(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetPhysicalCursorPos(lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetPhysicalCursorPos(lppoint.toCPointer<ByteVar>())

public actual fun GetProcessDefaultLayout(pdwdefaultlayout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetProcessDefaultLayout(pdwdefaultlayout.toCPointer<ByteVar>())

public actual fun GetPropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetPropA(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetPropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetPropW(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetQueueStatus(flags: QUEUE_STATUS_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetQueueStatus(flags)

public actual fun GetScrollBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, psbi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetScrollBarInfo(hwnd.toCPointer<ByteVar>(), idobject, psbi.toCPointer<ByteVar>())

public actual fun GetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetScrollInfo(hwnd.toCPointer<ByteVar>(), nbar, lpsi.toCPointer<ByteVar>())

public actual fun GetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetScrollPos(hwnd.toCPointer<ByteVar>(), nbar)

public actual fun GetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpminpos: Long, lpmaxpos: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetScrollRange(hwnd.toCPointer<ByteVar>(), nbar, lpminpos.toCPointer<ByteVar>(), lpmaxpos.toCPointer<ByteVar>())

public actual fun GetShellWindow(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetShellWindow()?.toLong() ?: 0L

public actual fun GetSubMenu(hmenu: HMENU, npos: Int): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetSubMenu(hmenu.toCPointer<ByteVar>(), npos)?.toLong() ?: 0L

public actual fun GetSystemMenu(hwnd: HWND, brevert: BOOL): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetSystemMenu(hwnd.toCPointer<ByteVar>(), brevert)?.toLong() ?: 0L

public actual fun GetSystemMetrics(nindex: SYSTEM_METRICS_INDEX): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetSystemMetrics(nindex)

public actual fun GetTitleBarInfo(hwnd: HWND, pti: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetTitleBarInfo(hwnd.toCPointer<ByteVar>(), pti.toCPointer<ByteVar>())

public actual fun GetTopWindow(hwnd: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetTopWindow(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetWindow(hwnd: HWND, ucmd: GET_WINDOW_CMD): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindow(hwnd.toCPointer<ByteVar>(), ucmd)?.toLong() ?: 0L

public actual fun GetWindowDisplayAffinity(hwnd: HWND, pdwaffinity: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowDisplayAffinity(hwnd.toCPointer<ByteVar>(), pdwaffinity.toCPointer<ByteVar>())

public actual fun GetWindowInfo(hwnd: HWND, pwi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowInfo(hwnd.toCPointer<ByteVar>(), pwi.toCPointer<ByteVar>())

public actual fun GetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongA(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrA(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrW(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongW(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun GetWindowModuleFileNameA(hwnd: HWND, pszfilename: PSTR, cchfilenamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameA(hwnd.toCPointer<ByteVar>(), pszfilename.toCPointer<ByteVar>(), cchfilenamemax)

public actual fun GetWindowModuleFileNameW(hwnd: HWND, pszfilename: PWSTR, cchfilenamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameW(hwnd.toCPointer<ByteVar>(), pszfilename.toCPointer<ByteVar>(), cchfilenamemax)

public actual fun GetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowPlacement(hwnd.toCPointer<ByteVar>(), lpwndpl.toCPointer<ByteVar>())

public actual fun GetWindowRect(hwnd: HWND, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowRect(hwnd.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun GetWindowTextA(hwnd: HWND, lpstring: PSTR, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextA(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), nmaxcount)

public actual fun GetWindowTextLengthA(hwnd: HWND): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthA(hwnd.toCPointer<ByteVar>())

public actual fun GetWindowTextLengthW(hwnd: HWND): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthW(hwnd.toCPointer<ByteVar>())

public actual fun GetWindowTextW(hwnd: HWND, lpstring: PWSTR, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextW(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), nmaxcount)

public actual fun GetWindowThreadProcessId(hwnd: HWND, lpdwprocessid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowThreadProcessId(hwnd.toCPointer<ByteVar>(), lpdwprocessid.toCPointer<ByteVar>())

public actual fun GetWindowWord(hwnd: HWND, nindex: Int): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_GetWindowWord(hwnd.toCPointer<ByteVar>(), nindex)

public actual fun HideCaret(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_HideCaret(hwnd.toCPointer<ByteVar>())

public actual fun HiliteMenuItem(hwnd: HWND, hmenu: HMENU, uidhiliteitem: UInt, uhilite: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_HiliteMenuItem(hwnd.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>(), uidhiliteitem, uhilite)

public actual fun InSendMessage(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InSendMessage()

public actual fun InSendMessageEx(lpreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InSendMessageEx(lpreserved.toCPointer<ByteVar>())

public actual fun IndexFilePath(resourceindexer: Long, filepath: PCWSTR, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IndexFilePath(resourceindexer.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), ppresourceuri.toCPointer<ByteVar>(), pqualifiercount.toCPointer<ByteVar>(), ppqualifiers.toCPointer<ByteVar>())

public actual fun InheritWindowMonitor(hwnd: HWND, hwndinherit: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InheritWindowMonitor(hwnd.toCPointer<ByteVar>(), hwndinherit.toCPointer<ByteVar>())

public actual fun InsertMenuA(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuA(hmenu.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem.toCPointer<ByteVar>())

public actual fun InsertMenuItemA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemA(hmenu.toCPointer<ByteVar>(), item, fbyposition, lpmi.toCPointer<ByteVar>())

public actual fun InsertMenuItemW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemW(hmenu.toCPointer<ByteVar>(), item, fbyposition, lpmi.toCPointer<ByteVar>())

public actual fun InsertMenuW(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuW(hmenu.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem.toCPointer<ByteVar>())

public actual fun InternalGetWindowText(hwnd: HWND, pstring: PWSTR, cchmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_InternalGetWindowText(hwnd.toCPointer<ByteVar>(), pstring.toCPointer<ByteVar>(), cchmaxcount)

public actual fun IsCharAlphaA(ch: Byte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaA(ch)

public actual fun IsCharAlphaNumericA(ch: Byte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericA(ch)

public actual fun IsCharAlphaNumericW(ch: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericW(ch)

public actual fun IsCharAlphaW(ch: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaW(ch)

public actual fun IsCharLowerA(ch: Byte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharLowerA(ch)

public actual fun IsCharUpperA(ch: Byte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperA(ch)

public actual fun IsCharUpperW(ch: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperW(ch)

public actual fun IsChild(hwndparent: HWND, hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsChild(hwndparent.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>())

public actual fun IsDialogMessageA(hdlg: HWND, lpmsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageA(hdlg.toCPointer<ByteVar>(), lpmsg.toCPointer<ByteVar>())

public actual fun IsDialogMessageW(hdlg: HWND, lpmsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageW(hdlg.toCPointer<ByteVar>(), lpmsg.toCPointer<ByteVar>())

public actual fun IsGUIThread(bconvert: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsGUIThread(bconvert)

public actual fun IsHungAppWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsHungAppWindow(hwnd.toCPointer<ByteVar>())

public actual fun IsIconic(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsIconic(hwnd.toCPointer<ByteVar>())

public actual fun IsMenu(hmenu: HMENU): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsMenu(hmenu.toCPointer<ByteVar>())

public actual fun IsProcessDPIAware(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsProcessDPIAware()

public actual fun IsWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsWindow(hwnd.toCPointer<ByteVar>())

public actual fun IsWindowArranged(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsWindowArranged(hwnd.toCPointer<ByteVar>())

public actual fun IsWindowUnicode(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsWindowUnicode(hwnd.toCPointer<ByteVar>())

public actual fun IsWindowVisible(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsWindowVisible(hwnd.toCPointer<ByteVar>())

public actual fun IsWow64Message(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsWow64Message()

public actual fun IsZoomed(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_IsZoomed(hwnd.toCPointer<ByteVar>())

public actual fun KillTimer(hwnd: HWND, uidevent: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_KillTimer(hwnd.toCPointer<ByteVar>(), uidevent)

public actual fun LoadAcceleratorsA(hinstance: HINSTANCE, lptablename: PCSTR): HACCEL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsA(hinstance.toCPointer<ByteVar>(), lptablename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadAcceleratorsW(hinstance: HINSTANCE, lptablename: PCWSTR): HACCEL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsW(hinstance.toCPointer<ByteVar>(), lptablename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadCursorA(hinstance: HINSTANCE, lpcursorname: PCSTR): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorA(hinstance.toCPointer<ByteVar>(), lpcursorname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadCursorFromFileA(lpfilename: PCSTR): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileA(lpfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadCursorFromFileW(lpfilename: PCWSTR): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileW(lpfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadCursorW(hinstance: HINSTANCE, lpcursorname: PCWSTR): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorW(hinstance.toCPointer<ByteVar>(), lpcursorname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadIconA(hinstance: HINSTANCE, lpiconname: PCSTR): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadIconA(hinstance.toCPointer<ByteVar>(), lpiconname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadIconW(hinstance: HINSTANCE, lpiconname: PCWSTR): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadIconW(hinstance.toCPointer<ByteVar>(), lpiconname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadImageA(hinst: HINSTANCE, name: PCSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadImageA(hinst.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), type, cx, cy, fuload)?.toLong() ?: 0L

public actual fun LoadImageW(hinst: HINSTANCE, name: PCWSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadImageW(hinst.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), type, cx, cy, fuload)?.toLong() ?: 0L

public actual fun LoadMenuA(hinstance: HINSTANCE, lpmenuname: PCSTR): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuA(hinstance.toCPointer<ByteVar>(), lpmenuname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadMenuIndirectA(lpmenutemplate: Long): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectA(lpmenutemplate.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadMenuIndirectW(lpmenutemplate: Long): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectW(lpmenutemplate.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadMenuW(hinstance: HINSTANCE, lpmenuname: PCWSTR): HMENU =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuW(hinstance.toCPointer<ByteVar>(), lpmenuname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadStringA(hinstance: HINSTANCE, uid: UInt, lpbuffer: PSTR, cchbuffermax: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadStringA(hinstance.toCPointer<ByteVar>(), uid, lpbuffer.toCPointer<ByteVar>(), cchbuffermax)

public actual fun LoadStringW(hinstance: HINSTANCE, uid: UInt, lpbuffer: PWSTR, cchbuffermax: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LoadStringW(hinstance.toCPointer<ByteVar>(), uid, lpbuffer.toCPointer<ByteVar>(), cchbuffermax)

public actual fun LockSetForegroundWindow(ulockcode: FOREGROUND_WINDOW_LOCK_CODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LockSetForegroundWindow(ulockcode)

public actual fun LogicalToPhysicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LogicalToPhysicalPoint(hwnd.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun LookupIconIdFromDirectory(presbits: Long, ficon: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectory(presbits.toCPointer<ByteVar>(), ficon)

public actual fun LookupIconIdFromDirectoryEx(presbits: Long, ficon: BOOL, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectoryEx(presbits.toCPointer<ByteVar>(), ficon, cxdesired, cydesired, flags)

public actual fun MapDialogRect(hdlg: HWND, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MapDialogRect(hdlg.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun MenuItemFromPoint(hwnd: HWND, hmenu: HMENU, ptscreen: POINT): Int =
    0

public actual fun MessageBoxA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxA(hwnd.toCPointer<ByteVar>(), lptext.toCPointer<ByteVar>(), lpcaption.toCPointer<ByteVar>(), utype)

public actual fun MessageBoxExA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExA(hwnd.toCPointer<ByteVar>(), lptext.toCPointer<ByteVar>(), lpcaption.toCPointer<ByteVar>(), utype, wlanguageid)

public actual fun MessageBoxExW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExW(hwnd.toCPointer<ByteVar>(), lptext.toCPointer<ByteVar>(), lpcaption.toCPointer<ByteVar>(), utype, wlanguageid)

public actual fun MessageBoxIndirectA(lpmbp: Long): MESSAGEBOX_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectA(lpmbp.toCPointer<ByteVar>())

public actual fun MessageBoxIndirectW(lpmbp: Long): MESSAGEBOX_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectW(lpmbp.toCPointer<ByteVar>())

public actual fun MessageBoxW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxW(hwnd.toCPointer<ByteVar>(), lptext.toCPointer<ByteVar>(), lpcaption.toCPointer<ByteVar>(), utype)

public actual fun ModifyMenuA(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuA(hmnu.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem.toCPointer<ByteVar>())

public actual fun ModifyMenuW(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuW(hmnu.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem.toCPointer<ByteVar>())

public actual fun MoveWindow(hwnd: HWND, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MoveWindow(hwnd.toCPointer<ByteVar>(), x, y, nwidth, nheight, brepaint)

public actual fun MrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmlfile: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfig(platformversion, defaultqualifiers.toCPointer<ByteVar>(), outputxmlfile.toCPointer<ByteVar>())

public actual fun MrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfigInMemory(platformversion, defaultqualifiers.toCPointer<ByteVar>(), outputxmldata.toCPointer<ByteVar>(), outputxmlsize.toCPointer<ByteVar>())

public actual fun MrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: Long, outputprisize: Long): HRESULT =
    0

public actual fun MrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceIndexer(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, indexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexer(packagefamilyname.toCPointer<ByteVar>(), projectroot.toCPointer<ByteVar>(), platformversion, defaultqualifiers.toCPointer<ByteVar>(), indexer.toCPointer<ByteVar>())

public actual fun MrmCreateResourceIndexerFromPreviousPriData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, pridata: Long, prisize: UInt, indexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriData(projectroot.toCPointer<ByteVar>(), platformversion, defaultqualifiers.toCPointer<ByteVar>(), pridata.toCPointer<ByteVar>(), prisize, indexer.toCPointer<ByteVar>())

public actual fun MrmCreateResourceIndexerFromPreviousPriFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, prifile: PCWSTR, indexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriFile(projectroot.toCPointer<ByteVar>(), platformversion, defaultqualifiers.toCPointer<ByteVar>(), prifile.toCPointer<ByteVar>(), indexer.toCPointer<ByteVar>())

public actual fun MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemaxmldata: Long, schemaxmlsize: UInt, indexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaData(projectroot.toCPointer<ByteVar>(), platformversion, defaultqualifiers.toCPointer<ByteVar>(), schemaxmldata.toCPointer<ByteVar>(), schemaxmlsize, indexer.toCPointer<ByteVar>())

public actual fun MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemafile: PCWSTR, indexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot.toCPointer<ByteVar>(), platformversion, defaultqualifiers.toCPointer<ByteVar>(), schemafile.toCPointer<ByteVar>(), indexer.toCPointer<ByteVar>())

public actual fun MrmCreateResourceIndexerWithFlags(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, flags: MrmIndexerFlags, indexer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerWithFlags(packagefamilyname.toCPointer<ByteVar>(), projectroot.toCPointer<ByteVar>(), platformversion, defaultqualifiers.toCPointer<ByteVar>(), flags, indexer.toCPointer<ByteVar>())

public actual fun MrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): HRESULT =
    0

public actual fun MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: UInt, schemapridata: Long, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriDataInMemory(inputpridata.toCPointer<ByteVar>(), inputprisize, schemapridata.toCPointer<ByteVar>(), schemaprisize, dumptype, outputxmldata.toCPointer<ByteVar>(), outputxmlsize.toCPointer<ByteVar>())

public actual fun MrmDumpPriFile(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmlfile: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFile(indexfilename.toCPointer<ByteVar>(), schemaprifile.toCPointer<ByteVar>(), dumptype, outputxmlfile.toCPointer<ByteVar>())

public actual fun MrmDumpPriFileInMemory(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFileInMemory(indexfilename.toCPointer<ByteVar>(), schemaprifile.toCPointer<ByteVar>(), dumptype, outputxmldata.toCPointer<ByteVar>(), outputxmlsize.toCPointer<ByteVar>())

public actual fun MrmFreeMemory(data: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmFreeMemory(data.toCPointer<ByteVar>())

public actual fun MrmGetPriFileContentChecksum(prifile: PCWSTR, checksum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MrmGetPriFileContentChecksum(prifile.toCPointer<ByteVar>(), checksum.toCPointer<ByteVar>())

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
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjects(ncount, phandles.toCPointer<ByteVar>(), fwaitall, dwmilliseconds, dwwakemask)

public actual fun MsgWaitForMultipleObjectsEx(ncount: UInt, phandles: Long, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS, dwflags: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS): WAIT_EVENT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjectsEx(ncount, phandles.toCPointer<ByteVar>(), dwmilliseconds, dwwakemask, dwflags)

public actual fun OemToCharA(psrc: PCSTR, pdst: PSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_OemToCharA(psrc.toCPointer<ByteVar>(), pdst.toCPointer<ByteVar>())

public actual fun OemToCharBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffA(lpszsrc.toCPointer<ByteVar>(), lpszdst.toCPointer<ByteVar>(), cchdstlength)

public actual fun OemToCharBuffW(lpszsrc: PCSTR, lpszdst: PWSTR, cchdstlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffW(lpszsrc.toCPointer<ByteVar>(), lpszdst.toCPointer<ByteVar>(), cchdstlength)

public actual fun OemToCharW(psrc: PCSTR, pdst: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_OemToCharW(psrc.toCPointer<ByteVar>(), pdst.toCPointer<ByteVar>())

public actual fun OpenIcon(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_OpenIcon(hwnd.toCPointer<ByteVar>())

public actual fun PeekMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PeekMessageA(lpmsg.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax, wremovemsg)

public actual fun PeekMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PeekMessageW(lpmsg.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax, wremovemsg)

public actual fun PhysicalToLogicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PhysicalToLogicalPoint(hwnd.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun PostMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PostMessageA(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun PostMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PostMessageW(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun PostQuitMessage(nexitcode: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PostQuitMessage(nexitcode)
}

public actual fun PostThreadMessageA(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageA(idthread, msg, wparam, lparam)

public actual fun PostThreadMessageW(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageW(idthread, msg, wparam, lparam)

public actual fun PrivateExtractIconsA(szfilename: PCSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsA(szfilename.toCPointer<ByteVar>(), niconindex, cxicon, cyicon, phicon.toCPointer<ByteVar>(), piconid.toCPointer<ByteVar>(), nicons, flags)

public actual fun PrivateExtractIconsW(szfilename: PCWSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsW(szfilename.toCPointer<ByteVar>(), niconindex, cxicon, cyicon, phicon.toCPointer<ByteVar>(), piconid.toCPointer<ByteVar>(), nicons, flags)

public actual fun RealChildWindowFromPoint(hwndparent: HWND, ptparentclientcoords: POINT): HWND =
    0L

public actual fun RealGetWindowClassA(hwnd: HWND, ptszclassname: PSTR, cchclassnamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassA(hwnd.toCPointer<ByteVar>(), ptszclassname.toCPointer<ByteVar>(), cchclassnamemax)

public actual fun RealGetWindowClassW(hwnd: HWND, ptszclassname: PWSTR, cchclassnamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassW(hwnd.toCPointer<ByteVar>(), ptszclassname.toCPointer<ByteVar>(), cchclassnamemax)

public actual fun RegisterClassA(lpwndclass: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassA(lpwndclass.toCPointer<ByteVar>())

public actual fun RegisterClassExA(param0: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExA(param0.toCPointer<ByteVar>())

public actual fun RegisterClassExW(param0: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExW(param0.toCPointer<ByteVar>())

public actual fun RegisterClassW(lpwndclass: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassW(lpwndclass.toCPointer<ByteVar>())

public actual fun RegisterDeviceNotificationA(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationA(hrecipient.toCPointer<ByteVar>(), notificationfilter.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun RegisterDeviceNotificationW(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationW(hrecipient.toCPointer<ByteVar>(), notificationfilter.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun RegisterForTooltipDismissNotification(hwnd: HWND, tdflags: TOOLTIP_DISMISS_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterForTooltipDismissNotification(hwnd.toCPointer<ByteVar>(), tdflags)

public actual fun RegisterShellHookWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterShellHookWindow(hwnd.toCPointer<ByteVar>())

public actual fun RegisterWindowMessageA(lpstring: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageA(lpstring.toCPointer<ByteVar>())

public actual fun RegisterWindowMessageW(lpstring: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageW(lpstring.toCPointer<ByteVar>())

public actual fun RemoveMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RemoveMenu(hmenu.toCPointer<ByteVar>(), uposition, uflags)

public actual fun RemovePropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RemovePropA(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RemovePropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_RemovePropW(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ReplyMessage(lresult: LRESULT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ReplyMessage(lresult)

public actual fun ScrollDC(hdc: HDC, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: HRGN, lprcupdate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ScrollDC(hdc.toCPointer<ByteVar>(), dx, dy, lprcscroll.toCPointer<ByteVar>(), lprcclip.toCPointer<ByteVar>(), hrgnupdate.toCPointer<ByteVar>(), lprcupdate.toCPointer<ByteVar>())

public actual fun ScrollWindow(hwnd: HWND, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ScrollWindow(hwnd.toCPointer<ByteVar>(), xamount, yamount, lprect.toCPointer<ByteVar>(), lpcliprect.toCPointer<ByteVar>())

public actual fun ScrollWindowEx(hwnd: HWND, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: HRGN, prcupdate: Long, flags: SCROLL_WINDOW_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ScrollWindowEx(hwnd.toCPointer<ByteVar>(), dx, dy, prcscroll.toCPointer<ByteVar>(), prcclip.toCPointer<ByteVar>(), hrgnupdate.toCPointer<ByteVar>(), prcupdate.toCPointer<ByteVar>(), flags)

public actual fun SendDlgItemMessageA(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageA(hdlg.toCPointer<ByteVar>(), niddlgitem, msg, wparam, lparam)

public actual fun SendDlgItemMessageW(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageW(hdlg.toCPointer<ByteVar>(), niddlgitem, msg, wparam, lparam)

public actual fun SendMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendMessageA(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun SendMessageCallbackA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackA(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam, lpresultcallback.toLong().toCPointer<ByteVar>(), dwdata)

public actual fun SendMessageCallbackW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackW(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam, lpresultcallback.toLong().toCPointer<ByteVar>(), dwdata)

public actual fun SendMessageTimeoutA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutA(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam, fuflags, utimeout, lpdwresult.toCPointer<ByteVar>())

public actual fun SendMessageTimeoutW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutW(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam, fuflags, utimeout, lpdwresult.toCPointer<ByteVar>())

public actual fun SendMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendMessageW(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun SendNotifyMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageA(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun SendNotifyMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageW(hwnd.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun SetAdditionalForegroundBoostProcesses(toplevelwindow: HWND, processhandlecount: UInt, processhandlearray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetAdditionalForegroundBoostProcesses(toplevelwindow.toCPointer<ByteVar>(), processhandlecount, processhandlearray.toCPointer<ByteVar>())

public actual fun SetCaretBlinkTime(umseconds: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetCaretBlinkTime(umseconds)

public actual fun SetCaretPos(x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetCaretPos(x, y)

public actual fun SetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongA(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrA(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrW(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongW(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetClassWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetClassWord(hwnd.toCPointer<ByteVar>(), nindex, wnewword)

public actual fun SetCoalescableTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC, utolerancedelay: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetCoalescableTimer(hwnd.toCPointer<ByteVar>(), nidevent, uelapse, lptimerfunc.toLong().toCPointer<ByteVar>(), utolerancedelay)

public actual fun SetCursor(hcursor: HCURSOR): HCURSOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetCursor(hcursor.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetCursorPos(x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetCursorPos(x, y)

public actual fun SetDebugErrorLevel(dwlevel: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetDebugErrorLevel(dwlevel)
}

public actual fun SetDlgItemInt(hdlg: HWND, niddlgitem: Int, uvalue: UInt, bsigned: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemInt(hdlg.toCPointer<ByteVar>(), niddlgitem, uvalue, bsigned)

public actual fun SetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextA(hdlg.toCPointer<ByteVar>(), niddlgitem, lpstring.toCPointer<ByteVar>())

public actual fun SetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextW(hdlg.toCPointer<ByteVar>(), niddlgitem, lpstring.toCPointer<ByteVar>())

public actual fun SetForegroundWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetForegroundWindow(hwnd.toCPointer<ByteVar>())

public actual fun SetLayeredWindowAttributes(hwnd: HWND, crkey: COLORREF, balpha: UByte, dwflags: LAYERED_WINDOW_ATTRIBUTES_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetLayeredWindowAttributes(hwnd.toCPointer<ByteVar>(), crkey, balpha, dwflags)

public actual fun SetMenu(hwnd: HWND, hmenu: HMENU): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMenu(hwnd.toCPointer<ByteVar>(), hmenu.toCPointer<ByteVar>())

public actual fun SetMenuDefaultItem(hmenu: HMENU, uitem: UInt, fbypos: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMenuDefaultItem(hmenu.toCPointer<ByteVar>(), uitem, fbypos)

public actual fun SetMenuInfo(param0: HMENU, param1: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMenuInfo(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())

public actual fun SetMenuItemBitmaps(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, hbitmapunchecked: HBITMAP, hbitmapchecked: HBITMAP): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemBitmaps(hmenu.toCPointer<ByteVar>(), uposition, uflags, hbitmapunchecked.toCPointer<ByteVar>(), hbitmapchecked.toCPointer<ByteVar>())

public actual fun SetMenuItemInfoA(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoA(hmenu.toCPointer<ByteVar>(), item, fbypositon, lpmii.toCPointer<ByteVar>())

public actual fun SetMenuItemInfoW(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoW(hmenu.toCPointer<ByteVar>(), item, fbypositon, lpmii.toCPointer<ByteVar>())

public actual fun SetMessageExtraInfo(lparam: LPARAM): LPARAM =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMessageExtraInfo(lparam)

public actual fun SetMessageQueue(cmessagesmax: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetMessageQueue(cmessagesmax)

public actual fun SetParent(hwndchild: HWND, hwndnewparent: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetParent(hwndchild.toCPointer<ByteVar>(), hwndnewparent.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetPhysicalCursorPos(x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetPhysicalCursorPos(x, y)

public actual fun SetProcessDPIAware(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetProcessDPIAware()

public actual fun SetProcessDefaultLayout(dwdefaultlayout: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetProcessDefaultLayout(dwdefaultlayout)

public actual fun SetPropA(hwnd: HWND, lpstring: PCSTR, hdata: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetPropA(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), hdata.toCPointer<ByteVar>())

public actual fun SetPropW(hwnd: HWND, lpstring: PCWSTR, hdata: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetPropW(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), hdata.toCPointer<ByteVar>())

public actual fun SetSystemCursor(hcur: HCURSOR, id: SYSTEM_CURSOR_ID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetSystemCursor(hcur.toCPointer<ByteVar>(), id)

public actual fun SetTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetTimer(hwnd.toCPointer<ByteVar>(), nidevent, uelapse, lptimerfunc.toLong().toCPointer<ByteVar>())

public actual fun SetWindowDisplayAffinity(hwnd: HWND, dwaffinity: WINDOW_DISPLAY_AFFINITY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowDisplayAffinity(hwnd.toCPointer<ByteVar>(), dwaffinity)

public actual fun SetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongA(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrA(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrW(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongW(hwnd.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun SetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowPlacement(hwnd.toCPointer<ByteVar>(), lpwndpl.toCPointer<ByteVar>())

public actual fun SetWindowPos(hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowPos(hwnd.toCPointer<ByteVar>(), hwndinsertafter.toCPointer<ByteVar>(), x, y, cx, cy, uflags)

public actual fun SetWindowTextA(hwnd: HWND, lpstring: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextA(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())

public actual fun SetWindowTextW(hwnd: HWND, lpstring: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextW(hwnd.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>())

public actual fun SetWindowWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowWord(hwnd.toCPointer<ByteVar>(), nindex, wnewword)

public actual fun SetWindowsHookA(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookA(nfiltertype, pfnfilterproc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetWindowsHookExA(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExA(idhook, lpfn.toLong().toCPointer<ByteVar>(), hmod.toCPointer<ByteVar>(), dwthreadid)?.toLong() ?: 0L

public actual fun SetWindowsHookExW(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExW(idhook, lpfn.toLong().toCPointer<ByteVar>(), hmod.toCPointer<ByteVar>(), dwthreadid)?.toLong() ?: 0L

public actual fun SetWindowsHookW(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookW(nfiltertype, pfnfilterproc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ShowCaret(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ShowCaret(hwnd.toCPointer<ByteVar>())

public actual fun ShowCursor(bshow: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ShowCursor(bshow)

public actual fun ShowOwnedPopups(hwnd: HWND, fshow: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ShowOwnedPopups(hwnd.toCPointer<ByteVar>(), fshow)

public actual fun ShowWindow(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ShowWindow(hwnd.toCPointer<ByteVar>(), ncmdshow)

public actual fun ShowWindowAsync(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_ShowWindowAsync(hwnd.toCPointer<ByteVar>(), ncmdshow)

public actual fun SoundSentry(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SoundSentry()

public actual fun SwitchToThisWindow(hwnd: HWND, funknown: BOOL) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SwitchToThisWindow(hwnd.toCPointer<ByteVar>(), funknown)
}

public actual fun SystemParametersInfoA(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoA(uiaction, uiparam, pvparam.toCPointer<ByteVar>(), fwinini)

public actual fun SystemParametersInfoW(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoW(uiaction, uiparam, pvparam.toCPointer<ByteVar>(), fwinini)

public actual fun TileWindows(hwndparent: HWND, whow: TILE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TileWindows(hwndparent.toCPointer<ByteVar>(), whow, lprect.toCPointer<ByteVar>(), ckids, lpkids.toCPointer<ByteVar>())

public actual fun TrackPopupMenu(hmenu: HMENU, uflags: TRACK_POPUP_MENU_FLAGS, x: Int, y: Int, nreserved: Int, hwnd: HWND, prcrect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenu(hmenu.toCPointer<ByteVar>(), uflags, x, y, nreserved, hwnd.toCPointer<ByteVar>(), prcrect.toCPointer<ByteVar>())

public actual fun TrackPopupMenuEx(hmenu: HMENU, uflags: UInt, x: Int, y: Int, hwnd: HWND, lptpm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenuEx(hmenu.toCPointer<ByteVar>(), uflags, x, y, hwnd.toCPointer<ByteVar>(), lptpm.toCPointer<ByteVar>())

public actual fun TranslateAcceleratorA(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorA(hwnd.toCPointer<ByteVar>(), hacctable.toCPointer<ByteVar>(), lpmsg.toCPointer<ByteVar>())

public actual fun TranslateAcceleratorW(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorW(hwnd.toCPointer<ByteVar>(), hacctable.toCPointer<ByteVar>(), lpmsg.toCPointer<ByteVar>())

public actual fun TranslateMDISysAccel(hwndclient: HWND, lpmsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TranslateMDISysAccel(hwndclient.toCPointer<ByteVar>(), lpmsg.toCPointer<ByteVar>())

public actual fun TranslateMessage(lpmsg: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_TranslateMessage(lpmsg.toCPointer<ByteVar>())

public actual fun UnhookWindowsHook(ncode: Int, pfnfilterproc: HOOKPROC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHook(ncode, pfnfilterproc.toLong().toCPointer<ByteVar>())

public actual fun UnhookWindowsHookEx(hhk: HHOOK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHookEx(hhk.toCPointer<ByteVar>())

public actual fun UnregisterClassA(lpclassname: PCSTR, hinstance: HINSTANCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassA(lpclassname.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>())

public actual fun UnregisterClassW(lpclassname: PCWSTR, hinstance: HINSTANCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassW(lpclassname.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>())

public actual fun UnregisterDeviceNotification(handle: HDEVNOTIFY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UnregisterDeviceNotification(handle.toCPointer<ByteVar>())

public actual fun UpdateLayeredWindow(hwnd: HWND, hdcdst: HDC, pptdst: Long, psize: Long, hdcsrc: HDC, pptsrc: Long, crkey: COLORREF, pblend: Long, dwflags: UPDATE_LAYERED_WINDOW_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindow(hwnd.toCPointer<ByteVar>(), hdcdst.toCPointer<ByteVar>(), pptdst.toCPointer<ByteVar>(), psize.toCPointer<ByteVar>(), hdcsrc.toCPointer<ByteVar>(), pptsrc.toCPointer<ByteVar>(), crkey, pblend.toCPointer<ByteVar>(), dwflags)

public actual fun UpdateLayeredWindowIndirect(hwnd: HWND, pulwinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindowIndirect(hwnd.toCPointer<ByteVar>(), pulwinfo.toCPointer<ByteVar>())

public actual fun WaitMessage(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_WaitMessage()

public actual fun WindowFromPhysicalPoint(point: POINT): HWND =
    0L

public actual fun WindowFromPoint(point: POINT): HWND =
    0L

public actual fun wsprintfA(param0: PSTR, param1: PCSTR): Int =
    0

public actual fun wsprintfW(param0: PWSTR, param1: PCWSTR): Int =
    0

public actual fun wvsprintfA(param0: PSTR, param1: PCSTR, arglist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())

public actual fun wvsprintfW(param0: PWSTR, param1: PCWSTR, arglist: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), arglist.toCPointer<ByteVar>())
