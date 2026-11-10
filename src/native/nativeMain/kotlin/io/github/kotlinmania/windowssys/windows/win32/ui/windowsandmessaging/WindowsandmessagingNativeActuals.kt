@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun adjustWindowRect(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRect(lprect?.value?.toCPointer<ByteVar>(), dwstyle, bmenu)

public actual fun adjustWindowRectEx(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRectEx(lprect?.value?.toCPointer<ByteVar>(), dwstyle, bmenu, dwexstyle)

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_allowSetForegroundWindow(dwprocessid)

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_animateWindow(hwnd?.value?.toCPointer<ByteVar>(), dwtime, dwflags)

public actual fun anyPopup(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_anyPopup()

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_appendMenuA(hmenu?.value?.toCPointer<ByteVar>(), uflags, uidnewitem, lpnewitem?.value?.toCPointer<ByteVar>())

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_appendMenuW(hmenu?.value?.toCPointer<ByteVar>(), uflags, uidnewitem, lpnewitem?.value?.toCPointer<ByteVar>())

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_arrangeIconicWindows(hwnd?.value?.toCPointer<ByteVar>())

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_beginDeferWindowPos(nnumwindows)?.let { COpaquePointer(it.toLong()) }

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_bringWindowToTop(hwnd?.value?.toCPointer<ByteVar>())

public actual fun calculatePopupWindowPosition(anchorpoint: COpaquePointer?, windowsize: COpaquePointer?, flags: UInt, excluderect: COpaquePointer?, popupwindowposition: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_calculatePopupWindowPosition(anchorpoint?.value?.toCPointer<ByteVar>(), windowsize?.value?.toCPointer<ByteVar>(), flags, excluderect?.value?.toCPointer<ByteVar>(), popupwindowposition?.value?.toCPointer<ByteVar>())

public actual fun callMsgFilterA(lpmsg: COpaquePointer?, ncode: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterA(lpmsg?.value?.toCPointer<ByteVar>(), ncode)

public actual fun callMsgFilterW(lpmsg: COpaquePointer?, ncode: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterW(lpmsg?.value?.toCPointer<ByteVar>(), ncode)

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_callNextHookEx(hhk?.value?.toCPointer<ByteVar>(), ncode, wparam, lparam)

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_callWindowProcA(0L.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_callWindowProcW(0L.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun cancelShutdown(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_cancelShutdown()

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_cascadeWindows(hwndparent?.value?.toCPointer<ByteVar>(), whow, lprect?.value?.toCPointer<ByteVar>(), ckids, lpkids?.value?.toCPointer<ByteVar>())

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_changeMenuA(hmenu?.value?.toCPointer<ByteVar>(), cmd, lpsznewitem?.value?.toCPointer<ByteVar>(), cmdinsert, flags)

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_changeMenuW(hmenu?.value?.toCPointer<ByteVar>(), cmd, lpsznewitem?.value?.toCPointer<ByteVar>(), cmdinsert, flags)

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilter(message, dwflag)

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilterEx(hwnd?.value?.toCPointer<ByteVar>(), message, action, pchangefilterstruct?.value?.toCPointer<ByteVar>())

public actual fun charLowerA(lpsz: Pstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charLowerA(lpsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffA(lpsz?.value?.toCPointer<ByteVar>(), cchlength)

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffW(lpsz?.value?.toCPointer<ByteVar>(), cchlength)

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charLowerW(lpsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charNextA(lpsz: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charNextA(lpsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charNextExA(codepage, lpcurrentchar?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charNextW(lpsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charPrevA(lpszstart?.value?.toCPointer<ByteVar>(), lpszcurrent?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charPrevExA(codepage, lpstart?.value?.toCPointer<ByteVar>(), lpcurrentchar?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charPrevW(lpszstart?.value?.toCPointer<ByteVar>(), lpszcurrent?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charToOemA(psrc?.value?.toCPointer<ByteVar>(), pdst?.value?.toCPointer<ByteVar>())

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffA(lpszsrc?.value?.toCPointer<ByteVar>(), lpszdst?.value?.toCPointer<ByteVar>(), cchdstlength)

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffW(lpszsrc?.value?.toCPointer<ByteVar>(), lpszdst?.value?.toCPointer<ByteVar>(), cchdstlength)

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charToOemW(psrc?.value?.toCPointer<ByteVar>(), pdst?.value?.toCPointer<ByteVar>())

public actual fun charUpperA(lpsz: Pstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charUpperA(lpsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffA(lpsz?.value?.toCPointer<ByteVar>(), cchlength)

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffW(lpsz?.value?.toCPointer<ByteVar>(), cchlength)

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_charUpperW(lpsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_checkMenuItem(hmenu?.value?.toCPointer<ByteVar>(), uidcheckitem, ucheck)

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_checkMenuRadioItem(hmenu?.value?.toCPointer<ByteVar>(), first, last, check, flags)

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    null

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    null

public actual fun clipCursor(lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_clipCursor(lprect?.value?.toCPointer<ByteVar>())

public actual fun closeWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_closeWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableA(haccelsrc?.value?.toCPointer<ByteVar>(), lpacceldst?.value?.toCPointer<ByteVar>(), caccelentries)

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableW(haccelsrc?.value?.toCPointer<ByteVar>(), lpacceldst?.value?.toCPointer<ByteVar>(), caccelentries)

public actual fun copyIcon(hicon: Hicon): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_copyIcon(hicon?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_copyImage(h?.value?.toCPointer<ByteVar>(), type, cx, cy, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun createAcceleratorTableA(paccel: COpaquePointer?, caccel: Int): Haccel =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableA(paccel?.value?.toCPointer<ByteVar>(), caccel)?.let { COpaquePointer(it.toLong()) }

public actual fun createAcceleratorTableW(paccel: COpaquePointer?, caccel: Int): Haccel =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableW(paccel?.value?.toCPointer<ByteVar>(), caccel)?.let { COpaquePointer(it.toLong()) }

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createCaret(hwnd?.value?.toCPointer<ByteVar>(), hbitmap?.value?.toCPointer<ByteVar>(), nwidth, nheight)

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: COpaquePointer?, pvxorplane: COpaquePointer?): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createCursor(hinst?.value?.toCPointer<ByteVar>(), xhotspot, yhotspot, nwidth, nheight, pvandplane?.value?.toCPointer<ByteVar>(), pvxorplane?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamA(hinstance?.value?.toCPointer<ByteVar>(), lptemplate?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)?.let { COpaquePointer(it.toLong()) }

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamW(hinstance?.value?.toCPointer<ByteVar>(), lptemplate?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)?.let { COpaquePointer(it.toLong()) }

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createDialogParamA(hinstance?.value?.toCPointer<ByteVar>(), lptemplatename?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)?.let { COpaquePointer(it.toLong()) }

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createDialogParamW(hinstance?.value?.toCPointer<ByteVar>(), lptemplatename?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)?.let { COpaquePointer(it.toLong()) }

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: COpaquePointer?, lpbxorbits: COpaquePointer?): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createIcon(hinstance?.value?.toCPointer<ByteVar>(), nwidth, nheight, cplanes, cbitspixel, lpbandbits?.value?.toCPointer<ByteVar>(), lpbxorbits?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createIconFromResource(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createIconFromResource(presbits?.value?.toCPointer<ByteVar>(), dwressize, ficon, dwver)?.let { COpaquePointer(it.toLong()) }

public actual fun createIconFromResourceEx(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createIconFromResourceEx(presbits?.value?.toCPointer<ByteVar>(), dwressize, ficon, dwver, cxdesired, cydesired, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun createIconIndirect(piconinfo: COpaquePointer?): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createIconIndirect(piconinfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowA(lpclassname?.value?.toCPointer<ByteVar>(), lpwindowname?.value?.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), lparam)?.let { COpaquePointer(it.toLong()) }

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowW(lpclassname?.value?.toCPointer<ByteVar>(), lpwindowname?.value?.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), lparam)?.let { COpaquePointer(it.toLong()) }

public actual fun createMenu(): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createMenu()?.let { COpaquePointer(it.toLong()) }

public actual fun createPopupMenu(): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createPopupMenu()?.let { COpaquePointer(it.toLong()) }

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createResourceIndexer(projectroot?.value?.toCPointer<ByteVar>(), extensiondllpath?.value?.toCPointer<ByteVar>(), ppresourceindexer?.value?.toCPointer<ByteVar>())

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createWindowExA(dwexstyle, lpclassname?.value?.toCPointer<ByteVar>(), lpwindowname?.value?.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), lpparam?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_createWindowExW(dwexstyle, lpclassname?.value?.toCPointer<ByteVar>(), lpwindowname?.value?.toCPointer<ByteVar>(), dwstyle, x, y, nwidth, nheight, hwndparent?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), lpparam?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defDlgProcA(hdlg?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defDlgProcW(hdlg?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defFrameProcA(hwnd?.value?.toCPointer<ByteVar>(), hwndmdiclient?.value?.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defFrameProcW(hwnd?.value?.toCPointer<ByteVar>(), hwndmdiclient?.value?.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcA(hwnd?.value?.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcW(hwnd?.value?.toCPointer<ByteVar>(), umsg, wparam, lparam)

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defWindowProcA(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_defWindowProcW(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_deferWindowPos(hwinposinfo?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), hwndinsertafter?.value?.toCPointer<ByteVar>(), x, y, cx, cy, uflags)?.let { COpaquePointer(it.toLong()) }

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_deleteMenu(hmenu?.value?.toCPointer<ByteVar>(), uposition, uflags)

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_deregisterShellHookWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyAcceleratorTable(haccel?.value?.toCPointer<ByteVar>())

public actual fun destroyCaret(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyCaret()

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyCursor(hcursor?.value?.toCPointer<ByteVar>())

public actual fun destroyIcon(hicon: Hicon): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyIcon(hicon?.value?.toCPointer<ByteVar>())

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyIndexedResults(resourceuri?.value?.toCPointer<ByteVar>(), qualifiercount, qualifiers?.value?.toCPointer<ByteVar>())
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyMenu(hmenu?.value?.toCPointer<ByteVar>())

public actual fun destroyResourceIndexer(resourceindexer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyResourceIndexer(resourceindexer?.value?.toCPointer<ByteVar>())
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_destroyWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamA(hinstance?.value?.toCPointer<ByteVar>(), hdialogtemplate?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamW(hinstance?.value?.toCPointer<ByteVar>(), hdialogtemplate?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamA(hinstance?.value?.toCPointer<ByteVar>(), lptemplatename?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamW(hinstance?.value?.toCPointer<ByteVar>(), lptemplatename?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwinitparam)

public actual fun disableProcessWindowsGhosting() {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_disableProcessWindowsGhosting()
}

public actual fun dispatchMessageA(lpmsg: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageA(lpmsg?.value?.toCPointer<ByteVar>())

public actual fun dispatchMessageW(lpmsg: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageW(lpmsg?.value?.toCPointer<ByteVar>())

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_dragObject(hwndparent?.value?.toCPointer<ByteVar>(), hwndfrom?.value?.toCPointer<ByteVar>(), fmt, data, hcur?.value?.toCPointer<ByteVar>())

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_drawIcon(hdc?.value?.toCPointer<ByteVar>(), x, y, hicon?.value?.toCPointer<ByteVar>())

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_drawIconEx(hdc?.value?.toCPointer<ByteVar>(), xleft, ytop, hicon?.value?.toCPointer<ByteVar>(), cxwidth, cywidth, istepifanicur, hbrflickerfreedraw?.value?.toCPointer<ByteVar>(), diflags)

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_drawMenuBar(hwnd?.value?.toCPointer<ByteVar>())

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enableMenuItem(hmenu?.value?.toCPointer<ByteVar>(), uidenableitem, uenable)

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_endDeferWindowPos(hwinposinfo?.value?.toCPointer<ByteVar>())

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_endDialog(hdlg?.value?.toCPointer<ByteVar>(), nresult)

public actual fun endMenu(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_endMenu()

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumChildWindows(hwndparent?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumPropsA(hwnd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumPropsExA(hwnd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumPropsExW(hwnd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumPropsW(hwnd?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumThreadWindows(dwthreadid, 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_enumWindows(0L.toCPointer<ByteVar>(), lparam)

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_findWindowA(lpclassname?.value?.toCPointer<ByteVar>(), lpwindowname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_findWindowExA(hwndparent?.value?.toCPointer<ByteVar>(), hwndchildafter?.value?.toCPointer<ByteVar>(), lpszclass?.value?.toCPointer<ByteVar>(), lpszwindow?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_findWindowExW(hwndparent?.value?.toCPointer<ByteVar>(), hwndchildafter?.value?.toCPointer<ByteVar>(), lpszclass?.value?.toCPointer<ByteVar>(), lpszwindow?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_findWindowW(lpclassname?.value?.toCPointer<ByteVar>(), lpwindowname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_flashWindow(hwnd?.value?.toCPointer<ByteVar>(), binvert)

public actual fun flashWindowEx(pfwi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_flashWindowEx(pfwi?.value?.toCPointer<ByteVar>())

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoA(hwnd?.value?.toCPointer<ByteVar>(), iitem, pati?.value?.toCPointer<ByteVar>(), pszitemtext?.value?.toCPointer<ByteVar>(), cchitemtext)

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoW(hwnd?.value?.toCPointer<ByteVar>(), iitem, pati?.value?.toCPointer<ByteVar>(), pszitemtext?.value?.toCPointer<ByteVar>(), cchitemtext)

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getAncestor(hwnd?.value?.toCPointer<ByteVar>(), gaflags)?.let { COpaquePointer(it.toLong()) }

public actual fun getCaretBlinkTime(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getCaretBlinkTime()

public actual fun getCaretPos(lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getCaretPos(lppoint?.value?.toCPointer<ByteVar>())

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoA(hinstance?.value?.toCPointer<ByteVar>(), lpclassname?.value?.toCPointer<ByteVar>(), lpwndclass?.value?.toCPointer<ByteVar>())

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExA(hinstance?.value?.toCPointer<ByteVar>(), lpszclass?.value?.toCPointer<ByteVar>(), lpwcx?.value?.toCPointer<ByteVar>())

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExW(hinstance?.value?.toCPointer<ByteVar>(), lpszclass?.value?.toCPointer<ByteVar>(), lpwcx?.value?.toCPointer<ByteVar>())

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoW(hinstance?.value?.toCPointer<ByteVar>(), lpclassname?.value?.toCPointer<ByteVar>(), lpwndclass?.value?.toCPointer<ByteVar>())

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassLongA(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrA(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrW(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassLongW(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassNameA(hwnd?.value?.toCPointer<ByteVar>(), lpclassname?.value?.toCPointer<ByteVar>(), nmaxcount)

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassNameW(hwnd?.value?.toCPointer<ByteVar>(), lpclassname?.value?.toCPointer<ByteVar>(), nmaxcount)

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClassWord(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getClientRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClientRect(hwnd?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun getClipCursor(lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getClipCursor(lprect?.value?.toCPointer<ByteVar>())

public actual fun getCursor(): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getCursor()?.let { COpaquePointer(it.toLong()) }

public actual fun getCursorInfo(pci: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getCursorInfo(pci?.value?.toCPointer<ByteVar>())

public actual fun getCursorPos(lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getCursorPos(lppoint?.value?.toCPointer<ByteVar>())

public actual fun getDesktopWindow(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDesktopWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getDialogBaseUnits(): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDialogBaseUnits()

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDlgCtrlID(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDlgItem(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem)?.let { COpaquePointer(it.toLong()) }

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: COpaquePointer?, bsigned: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemInt(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, lptranslated?.value?.toCPointer<ByteVar>(), bsigned)

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextA(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, lpstring?.value?.toCPointer<ByteVar>(), cchmax)

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextW(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, lpstring?.value?.toCPointer<ByteVar>(), cchmax)

public actual fun getForegroundWindow(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getForegroundWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getGUIThreadInfo(idthread: UInt, pgui: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getGUIThreadInfo(idthread, pgui?.value?.toCPointer<ByteVar>())

public actual fun getIconInfo(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getIconInfo(hicon?.value?.toCPointer<ByteVar>(), piconinfo?.value?.toCPointer<ByteVar>())

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExA(hicon?.value?.toCPointer<ByteVar>(), piconinfo?.value?.toCPointer<ByteVar>())

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExW(hicon?.value?.toCPointer<ByteVar>(), piconinfo?.value?.toCPointer<ByteVar>())

public actual fun getInputState(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getInputState()

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getLastActivePopup(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: COpaquePointer?, pbalpha: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getLayeredWindowAttributes(hwnd?.value?.toCPointer<ByteVar>(), pcrkey?.value?.toCPointer<ByteVar>(), pbalpha?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenu(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuBarInfo(hwnd?.value?.toCPointer<ByteVar>(), idobject, iditem, pmbi?.value?.toCPointer<ByteVar>())

public actual fun getMenuCheckMarkDimensions(): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuCheckMarkDimensions()

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuDefaultItem(hmenu?.value?.toCPointer<ByteVar>(), fbypos, gmdiflags)

public actual fun getMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuInfo(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemCount(hmenu?.value?.toCPointer<ByteVar>())

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemID(hmenu?.value?.toCPointer<ByteVar>(), npos)

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoA(hmenu?.value?.toCPointer<ByteVar>(), item, fbyposition, lpmii?.value?.toCPointer<ByteVar>())

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoW(hmenu?.value?.toCPointer<ByteVar>(), item, fbyposition, lpmii?.value?.toCPointer<ByteVar>())

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemRect(hwnd?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>(), uitem, lprcitem?.value?.toCPointer<ByteVar>())

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuState(hmenu?.value?.toCPointer<ByteVar>(), uid, uflags)

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuStringA(hmenu?.value?.toCPointer<ByteVar>(), uiditem, lpstring?.value?.toCPointer<ByteVar>(), cchmax, flags)

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMenuStringW(hmenu?.value?.toCPointer<ByteVar>(), uiditem, lpstring?.value?.toCPointer<ByteVar>(), cchmax, flags)

public actual fun getMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMessageA(lpmsg?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax)

public actual fun getMessageExtraInfo(): Lparam =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMessageExtraInfo()

public actual fun getMessagePos(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMessagePos()

public actual fun getMessageTime(): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMessageTime()

public actual fun getMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getMessageW(lpmsg?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax)

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getNextDlgGroupItem(hdlg?.value?.toCPointer<ByteVar>(), hctl?.value?.toCPointer<ByteVar>(), bprevious)?.let { COpaquePointer(it.toLong()) }

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getNextDlgTabItem(hdlg?.value?.toCPointer<ByteVar>(), hctl?.value?.toCPointer<ByteVar>(), bprevious)?.let { COpaquePointer(it.toLong()) }

public actual fun getParent(hwnd: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getParent(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getPhysicalCursorPos(lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getPhysicalCursorPos(lppoint?.value?.toCPointer<ByteVar>())

public actual fun getProcessDefaultLayout(pdwdefaultlayout: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getProcessDefaultLayout(pdwdefaultlayout?.value?.toCPointer<ByteVar>())

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getPropA(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getPropW(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getQueueStatus(flags)

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getScrollBarInfo(hwnd?.value?.toCPointer<ByteVar>(), idobject, psbi?.value?.toCPointer<ByteVar>())

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getScrollInfo(hwnd?.value?.toCPointer<ByteVar>(), nbar, lpsi?.value?.toCPointer<ByteVar>())

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getScrollPos(hwnd?.value?.toCPointer<ByteVar>(), nbar)

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: COpaquePointer?, lpmaxpos: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getScrollRange(hwnd?.value?.toCPointer<ByteVar>(), nbar, lpminpos?.value?.toCPointer<ByteVar>(), lpmaxpos?.value?.toCPointer<ByteVar>())

public actual fun getShellWindow(): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getShellWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getSubMenu(hmenu?.value?.toCPointer<ByteVar>(), npos)?.let { COpaquePointer(it.toLong()) }

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getSystemMenu(hwnd?.value?.toCPointer<ByteVar>(), brevert)?.let { COpaquePointer(it.toLong()) }

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getSystemMetrics(nindex)

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getTitleBarInfo(hwnd?.value?.toCPointer<ByteVar>(), pti?.value?.toCPointer<ByteVar>())

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getTopWindow(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindow(hwnd?.value?.toCPointer<ByteVar>(), ucmd)?.let { COpaquePointer(it.toLong()) }

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowDisplayAffinity(hwnd?.value?.toCPointer<ByteVar>(), pdwaffinity?.value?.toCPointer<ByteVar>())

public actual fun getWindowInfo(hwnd: Hwnd, pwi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowInfo(hwnd?.value?.toCPointer<ByteVar>(), pwi?.value?.toCPointer<ByteVar>())

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongA(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrA(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrW(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongW(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameA(hwnd?.value?.toCPointer<ByteVar>(), pszfilename?.value?.toCPointer<ByteVar>(), cchfilenamemax)

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameW(hwnd?.value?.toCPointer<ByteVar>(), pszfilename?.value?.toCPointer<ByteVar>(), cchfilenamemax)

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowPlacement(hwnd?.value?.toCPointer<ByteVar>(), lpwndpl?.value?.toCPointer<ByteVar>())

public actual fun getWindowRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowRect(hwnd?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextA(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), nmaxcount)

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthA(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthW(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextW(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), nmaxcount)

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowThreadProcessId(hwnd?.value?.toCPointer<ByteVar>(), lpdwprocessid?.value?.toCPointer<ByteVar>())

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_getWindowWord(hwnd?.value?.toCPointer<ByteVar>(), nindex)

public actual fun hideCaret(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_hideCaret(hwnd?.value?.toCPointer<ByteVar>())

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_hiliteMenuItem(hwnd?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>(), uidhiliteitem, uhilite)

public actual fun inSendMessage(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_inSendMessage()

public actual fun inSendMessageEx(lpreserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_inSendMessageEx(lpreserved?.value?.toCPointer<ByteVar>())

public actual fun indexFilePath(resourceindexer: COpaquePointer?, filepath: Pcwstr, ppresourceuri: COpaquePointer?, pqualifiercount: COpaquePointer?, ppqualifiers: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_indexFilePath(resourceindexer?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>(), ppresourceuri?.value?.toCPointer<ByteVar>(), pqualifiercount?.value?.toCPointer<ByteVar>(), ppqualifiers?.value?.toCPointer<ByteVar>())

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_inheritWindowMonitor(hwnd?.value?.toCPointer<ByteVar>(), hwndinherit?.value?.toCPointer<ByteVar>())

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_insertMenuA(hmenu?.value?.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem?.value?.toCPointer<ByteVar>())

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemA(hmenu?.value?.toCPointer<ByteVar>(), item, fbyposition, lpmi?.value?.toCPointer<ByteVar>())

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemW(hmenu?.value?.toCPointer<ByteVar>(), item, fbyposition, lpmi?.value?.toCPointer<ByteVar>())

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_insertMenuW(hmenu?.value?.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem?.value?.toCPointer<ByteVar>())

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_internalGetWindowText(hwnd?.value?.toCPointer<ByteVar>(), pstring?.value?.toCPointer<ByteVar>(), cchmaxcount)

public actual fun isCharAlphaA(ch: Byte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaA(ch)

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericA(ch)

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericW(ch)

public actual fun isCharAlphaW(ch: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaW(ch)

public actual fun isCharLowerA(ch: Byte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharLowerA(ch)

public actual fun isCharUpperA(ch: Byte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharUpperA(ch)

public actual fun isCharUpperW(ch: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isCharUpperW(ch)

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isChild(hwndparent?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>())

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageA(hdlg?.value?.toCPointer<ByteVar>(), lpmsg?.value?.toCPointer<ByteVar>())

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageW(hdlg?.value?.toCPointer<ByteVar>(), lpmsg?.value?.toCPointer<ByteVar>())

public actual fun isGUIThread(bconvert: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isGUIThread(bconvert)

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isHungAppWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isIconic(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isIconic(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isMenu(hmenu: Hmenu): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isMenu(hmenu?.value?.toCPointer<ByteVar>())

public actual fun isProcessDPIAware(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isProcessDPIAware()

public actual fun isWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isWindowArranged(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isWindowUnicode(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isWindowVisible(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isWow64Message(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isWow64Message()

public actual fun isZoomed(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_isZoomed(hwnd?.value?.toCPointer<ByteVar>())

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_killTimer(hwnd?.value?.toCPointer<ByteVar>(), uidevent)

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsA(hinstance?.value?.toCPointer<ByteVar>(), lptablename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsW(hinstance?.value?.toCPointer<ByteVar>(), lptablename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadCursorA(hinstance?.value?.toCPointer<ByteVar>(), lpcursorname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileA(lpfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileW(lpfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadCursorW(hinstance?.value?.toCPointer<ByteVar>(), lpcursorname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadIconA(hinstance?.value?.toCPointer<ByteVar>(), lpiconname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadIconW(hinstance?.value?.toCPointer<ByteVar>(), lpiconname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadImageA(hinst?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), type, cx, cy, fuload)?.let { COpaquePointer(it.toLong()) }

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadImageW(hinst?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), type, cx, cy, fuload)?.let { COpaquePointer(it.toLong()) }

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadMenuA(hinstance?.value?.toCPointer<ByteVar>(), lpmenuname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadMenuIndirectA(lpmenutemplate: COpaquePointer?): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectA(lpmenutemplate?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadMenuIndirectW(lpmenutemplate: COpaquePointer?): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectW(lpmenutemplate?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadMenuW(hinstance?.value?.toCPointer<ByteVar>(), lpmenuname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadStringA(hinstance?.value?.toCPointer<ByteVar>(), uid, lpbuffer?.value?.toCPointer<ByteVar>(), cchbuffermax)

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_loadStringW(hinstance?.value?.toCPointer<ByteVar>(), uid, lpbuffer?.value?.toCPointer<ByteVar>(), cchbuffermax)

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_lockSetForegroundWindow(ulockcode)

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_logicalToPhysicalPoint(hwnd?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun lookupIconIdFromDirectory(presbits: COpaquePointer?, ficon: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectory(presbits?.value?.toCPointer<ByteVar>(), ficon)

public actual fun lookupIconIdFromDirectoryEx(presbits: COpaquePointer?, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectoryEx(presbits?.value?.toCPointer<ByteVar>(), ficon, cxdesired, cydesired, flags)

public actual fun mapDialogRect(hdlg: Hwnd, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mapDialogRect(hdlg?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    0

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_messageBoxA(hwnd?.value?.toCPointer<ByteVar>(), lptext?.value?.toCPointer<ByteVar>(), lpcaption?.value?.toCPointer<ByteVar>(), utype)

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_messageBoxExA(hwnd?.value?.toCPointer<ByteVar>(), lptext?.value?.toCPointer<ByteVar>(), lpcaption?.value?.toCPointer<ByteVar>(), utype, wlanguageid)

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_messageBoxExW(hwnd?.value?.toCPointer<ByteVar>(), lptext?.value?.toCPointer<ByteVar>(), lpcaption?.value?.toCPointer<ByteVar>(), utype, wlanguageid)

public actual fun messageBoxIndirectA(lpmbp: COpaquePointer?): MessageboxResult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectA(lpmbp?.value?.toCPointer<ByteVar>())

public actual fun messageBoxIndirectW(lpmbp: COpaquePointer?): MessageboxResult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectW(lpmbp?.value?.toCPointer<ByteVar>())

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_messageBoxW(hwnd?.value?.toCPointer<ByteVar>(), lptext?.value?.toCPointer<ByteVar>(), lpcaption?.value?.toCPointer<ByteVar>(), utype)

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_modifyMenuA(hmnu?.value?.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem?.value?.toCPointer<ByteVar>())

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_modifyMenuW(hmnu?.value?.toCPointer<ByteVar>(), uposition, uflags, uidnewitem, lpnewitem?.value?.toCPointer<ByteVar>())

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_moveWindow(hwnd?.value?.toCPointer<ByteVar>(), x, y, nwidth, nheight, brepaint)

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfig(platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), outputxmlfile?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfigInMemory(platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), outputxmldata?.value?.toCPointer<ByteVar>(), outputxmlsize?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    0

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: COpaquePointer?, outputprisize: COpaquePointer?): Hresult =
    0

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    0

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexer(packagefamilyname?.value?.toCPointer<ByteVar>(), projectroot?.value?.toCPointer<ByteVar>(), platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), indexer?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: COpaquePointer?, prisize: UInt, indexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriData(projectroot?.value?.toCPointer<ByteVar>(), platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), pridata?.value?.toCPointer<ByteVar>(), prisize, indexer?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriFile(projectroot?.value?.toCPointer<ByteVar>(), platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), prifile?.value?.toCPointer<ByteVar>(), indexer?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: COpaquePointer?, schemaxmlsize: UInt, indexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaData(projectroot?.value?.toCPointer<ByteVar>(), platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), schemaxmldata?.value?.toCPointer<ByteVar>(), schemaxmlsize, indexer?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot?.value?.toCPointer<ByteVar>(), platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), schemafile?.value?.toCPointer<ByteVar>(), indexer?.value?.toCPointer<ByteVar>())

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerWithFlags(packagefamilyname?.value?.toCPointer<ByteVar>(), projectroot?.value?.toCPointer<ByteVar>(), platformversion, defaultqualifiers?.value?.toCPointer<ByteVar>(), flags, indexer?.value?.toCPointer<ByteVar>())

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    0

public actual fun mrmDumpPriDataInMemory(inputpridata: COpaquePointer?, inputprisize: UInt, schemapridata: COpaquePointer?, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriDataInMemory(inputpridata?.value?.toCPointer<ByteVar>(), inputprisize, schemapridata?.value?.toCPointer<ByteVar>(), schemaprisize, dumptype, outputxmldata?.value?.toCPointer<ByteVar>(), outputxmlsize?.value?.toCPointer<ByteVar>())

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFile(indexfilename?.value?.toCPointer<ByteVar>(), schemaprifile?.value?.toCPointer<ByteVar>(), dumptype, outputxmlfile?.value?.toCPointer<ByteVar>())

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFileInMemory(indexfilename?.value?.toCPointer<ByteVar>(), schemaprifile?.value?.toCPointer<ByteVar>(), dumptype, outputxmldata?.value?.toCPointer<ByteVar>(), outputxmlsize?.value?.toCPointer<ByteVar>())

public actual fun mrmFreeMemory(data: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmFreeMemory(data?.value?.toCPointer<ByteVar>())

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_mrmGetPriFileContentChecksum(prifile?.value?.toCPointer<ByteVar>(), checksum?.value?.toCPointer<ByteVar>())

public actual fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: COpaquePointer?, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult =
    0

public actual fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult =
    0

public actual fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult =
    0

public actual fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult =
    0

public actual fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult =
    0

public actual fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: COpaquePointer?, nummsgs: COpaquePointer?): Hresult =
    0

public actual fun msgWaitForMultipleObjects(ncount: UInt, phandles: COpaquePointer?, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjects(ncount, phandles?.value?.toCPointer<ByteVar>(), fwaitall, dwmilliseconds, dwwakemask)

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: COpaquePointer?, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjectsEx(ncount, phandles?.value?.toCPointer<ByteVar>(), dwmilliseconds, dwwakemask, dwflags)

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_oemToCharA(psrc?.value?.toCPointer<ByteVar>(), pdst?.value?.toCPointer<ByteVar>())

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffA(lpszsrc?.value?.toCPointer<ByteVar>(), lpszdst?.value?.toCPointer<ByteVar>(), cchdstlength)

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffW(lpszsrc?.value?.toCPointer<ByteVar>(), lpszdst?.value?.toCPointer<ByteVar>(), cchdstlength)

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_oemToCharW(psrc?.value?.toCPointer<ByteVar>(), pdst?.value?.toCPointer<ByteVar>())

public actual fun openIcon(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_openIcon(hwnd?.value?.toCPointer<ByteVar>())

public actual fun peekMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_peekMessageA(lpmsg?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax, wremovemsg)

public actual fun peekMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_peekMessageW(lpmsg?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), wmsgfiltermin, wmsgfiltermax, wremovemsg)

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_physicalToLogicalPoint(hwnd?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_postMessageA(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_postMessageW(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun postQuitMessage(nexitcode: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_postQuitMessage(nexitcode)
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageA(idthread, msg, wparam, lparam)

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageW(idthread, msg, wparam, lparam)

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsA(szfilename?.value?.toCPointer<ByteVar>(), niconindex, cxicon, cyicon, phicon?.value?.toCPointer<ByteVar>(), piconid?.value?.toCPointer<ByteVar>(), nicons, flags)

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsW(szfilename?.value?.toCPointer<ByteVar>(), niconindex, cxicon, cyicon, phicon?.value?.toCPointer<ByteVar>(), piconid?.value?.toCPointer<ByteVar>(), nicons, flags)

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    null

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassA(hwnd?.value?.toCPointer<ByteVar>(), ptszclassname?.value?.toCPointer<ByteVar>(), cchclassnamemax)

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassW(hwnd?.value?.toCPointer<ByteVar>(), ptszclassname?.value?.toCPointer<ByteVar>(), cchclassnamemax)

public actual fun registerClassA(lpwndclass: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerClassA(lpwndclass?.value?.toCPointer<ByteVar>())

public actual fun registerClassExA(param0: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerClassExA(param0?.value?.toCPointer<ByteVar>())

public actual fun registerClassExW(param0: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerClassExW(param0?.value?.toCPointer<ByteVar>())

public actual fun registerClassW(lpwndclass: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerClassW(lpwndclass?.value?.toCPointer<ByteVar>())

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationA(hrecipient?.value?.toCPointer<ByteVar>(), notificationfilter?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationW(hrecipient?.value?.toCPointer<ByteVar>(), notificationfilter?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerForTooltipDismissNotification(hwnd?.value?.toCPointer<ByteVar>(), tdflags)

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerShellHookWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_removeMenu(hmenu?.value?.toCPointer<ByteVar>(), uposition, uflags)

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_removePropA(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_removePropW(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun replyMessage(lresult: Lresult): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_replyMessage(lresult)

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: COpaquePointer?, lprcclip: COpaquePointer?, hrgnupdate: Hrgn, lprcupdate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_scrollDC(hdc?.value?.toCPointer<ByteVar>(), dx, dy, lprcscroll?.value?.toCPointer<ByteVar>(), lprcclip?.value?.toCPointer<ByteVar>(), hrgnupdate?.value?.toCPointer<ByteVar>(), lprcupdate?.value?.toCPointer<ByteVar>())

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: COpaquePointer?, lpcliprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_scrollWindow(hwnd?.value?.toCPointer<ByteVar>(), xamount, yamount, lprect?.value?.toCPointer<ByteVar>(), lpcliprect?.value?.toCPointer<ByteVar>())

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: COpaquePointer?, prcclip: COpaquePointer?, hrgnupdate: Hrgn, prcupdate: COpaquePointer?, flags: ScrollWindowFlags): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_scrollWindowEx(hwnd?.value?.toCPointer<ByteVar>(), dx, dy, prcscroll?.value?.toCPointer<ByteVar>(), prcclip?.value?.toCPointer<ByteVar>(), hrgnupdate?.value?.toCPointer<ByteVar>(), prcupdate?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageA(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, msg, wparam, lparam)

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageW(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, msg, wparam, lparam)

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendMessageA(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackA(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, 0L.toCPointer<ByteVar>(), dwdata)

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackW(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, 0L.toCPointer<ByteVar>(), dwdata)

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutA(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, fuflags, utimeout, lpdwresult?.value?.toCPointer<ByteVar>())

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutW(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam, fuflags, utimeout, lpdwresult?.value?.toCPointer<ByteVar>())

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendMessageW(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageA(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageW(hwnd?.value?.toCPointer<ByteVar>(), msg, wparam, lparam)

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setAdditionalForegroundBoostProcesses(toplevelwindow?.value?.toCPointer<ByteVar>(), processhandlecount, processhandlearray?.value?.toCPointer<ByteVar>())

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setCaretBlinkTime(umseconds)

public actual fun setCaretPos(x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setCaretPos(x, y)

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setClassLongA(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrA(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrW(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setClassLongW(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setClassWord(hwnd?.value?.toCPointer<ByteVar>(), nindex, wnewword)

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setCoalescableTimer(hwnd?.value?.toCPointer<ByteVar>(), nidevent, uelapse, 0L.toCPointer<ByteVar>(), utolerancedelay)

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setCursor(hcursor?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setCursorPos(x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setCursorPos(x, y)

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setDebugErrorLevel(dwlevel)
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemInt(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, uvalue, bsigned)

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextA(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, lpstring?.value?.toCPointer<ByteVar>())

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextW(hdlg?.value?.toCPointer<ByteVar>(), niddlgitem, lpstring?.value?.toCPointer<ByteVar>())

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setForegroundWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setLayeredWindowAttributes(hwnd?.value?.toCPointer<ByteVar>(), crkey, balpha, dwflags)

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMenu(hwnd?.value?.toCPointer<ByteVar>(), hmenu?.value?.toCPointer<ByteVar>())

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMenuDefaultItem(hmenu?.value?.toCPointer<ByteVar>(), uitem, fbypos)

public actual fun setMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMenuInfo(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemBitmaps(hmenu?.value?.toCPointer<ByteVar>(), uposition, uflags, hbitmapunchecked?.value?.toCPointer<ByteVar>(), hbitmapchecked?.value?.toCPointer<ByteVar>())

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoA(hmenu?.value?.toCPointer<ByteVar>(), item, fbypositon, lpmii?.value?.toCPointer<ByteVar>())

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoW(hmenu?.value?.toCPointer<ByteVar>(), item, fbypositon, lpmii?.value?.toCPointer<ByteVar>())

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMessageExtraInfo(lparam)

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setMessageQueue(cmessagesmax)

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setParent(hwndchild?.value?.toCPointer<ByteVar>(), hwndnewparent?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setPhysicalCursorPos(x, y)

public actual fun setProcessDPIAware(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setProcessDPIAware()

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setProcessDefaultLayout(dwdefaultlayout)

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setPropA(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), hdata?.value?.toCPointer<ByteVar>())

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setPropW(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), hdata?.value?.toCPointer<ByteVar>())

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setSystemCursor(hcur?.value?.toCPointer<ByteVar>(), id)

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setTimer(hwnd?.value?.toCPointer<ByteVar>(), nidevent, uelapse, 0L.toCPointer<ByteVar>())

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowDisplayAffinity(hwnd?.value?.toCPointer<ByteVar>(), dwaffinity)

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongA(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrA(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrW(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongW(hwnd?.value?.toCPointer<ByteVar>(), nindex, dwnewlong)

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowPlacement(hwnd?.value?.toCPointer<ByteVar>(), lpwndpl?.value?.toCPointer<ByteVar>())

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowPos(hwnd?.value?.toCPointer<ByteVar>(), hwndinsertafter?.value?.toCPointer<ByteVar>(), x, y, cx, cy, uflags)

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowTextA(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowTextW(hwnd?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>())

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowWord(hwnd?.value?.toCPointer<ByteVar>(), nindex, wnewword)

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookA(nfiltertype, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExA(idhook, 0L.toCPointer<ByteVar>(), hmod?.value?.toCPointer<ByteVar>(), dwthreadid)?.let { COpaquePointer(it.toLong()) }

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExW(idhook, 0L.toCPointer<ByteVar>(), hmod?.value?.toCPointer<ByteVar>(), dwthreadid)?.let { COpaquePointer(it.toLong()) }

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookW(nfiltertype, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun showCaret(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_showCaret(hwnd?.value?.toCPointer<ByteVar>())

public actual fun showCursor(bshow: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_showCursor(bshow)

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_showOwnedPopups(hwnd?.value?.toCPointer<ByteVar>(), fshow)

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_showWindow(hwnd?.value?.toCPointer<ByteVar>(), ncmdshow)

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_showWindowAsync(hwnd?.value?.toCPointer<ByteVar>(), ncmdshow)

public actual fun soundSentry(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_soundSentry()

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_switchToThisWindow(hwnd?.value?.toCPointer<ByteVar>(), funknown)
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoA(uiaction, uiparam, pvparam?.value?.toCPointer<ByteVar>(), fwinini)

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoW(uiaction, uiparam, pvparam?.value?.toCPointer<ByteVar>(), fwinini)

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_tileWindows(hwndparent?.value?.toCPointer<ByteVar>(), whow, lprect?.value?.toCPointer<ByteVar>(), ckids, lpkids?.value?.toCPointer<ByteVar>())

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenu(hmenu?.value?.toCPointer<ByteVar>(), uflags, x, y, nreserved, hwnd?.value?.toCPointer<ByteVar>(), prcrect?.value?.toCPointer<ByteVar>())

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenuEx(hmenu?.value?.toCPointer<ByteVar>(), uflags, x, y, hwnd?.value?.toCPointer<ByteVar>(), lptpm?.value?.toCPointer<ByteVar>())

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorA(hwnd?.value?.toCPointer<ByteVar>(), hacctable?.value?.toCPointer<ByteVar>(), lpmsg?.value?.toCPointer<ByteVar>())

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorW(hwnd?.value?.toCPointer<ByteVar>(), hacctable?.value?.toCPointer<ByteVar>(), lpmsg?.value?.toCPointer<ByteVar>())

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_translateMDISysAccel(hwndclient?.value?.toCPointer<ByteVar>(), lpmsg?.value?.toCPointer<ByteVar>())

public actual fun translateMessage(lpmsg: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_translateMessage(lpmsg?.value?.toCPointer<ByteVar>())

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHook(ncode, 0L.toCPointer<ByteVar>())

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHookEx(hhk?.value?.toCPointer<ByteVar>())

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_unregisterClassA(lpclassname?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>())

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_unregisterClassW(lpclassname?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>())

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_unregisterDeviceNotification(handle?.value?.toCPointer<ByteVar>())

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: COpaquePointer?, psize: COpaquePointer?, hdcsrc: Hdc, pptsrc: COpaquePointer?, crkey: Colorref, pblend: COpaquePointer?, dwflags: UpdateLayeredWindowFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindow(hwnd?.value?.toCPointer<ByteVar>(), hdcdst?.value?.toCPointer<ByteVar>(), pptdst?.value?.toCPointer<ByteVar>(), psize?.value?.toCPointer<ByteVar>(), hdcsrc?.value?.toCPointer<ByteVar>(), pptsrc?.value?.toCPointer<ByteVar>(), crkey, pblend?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindowIndirect(hwnd?.value?.toCPointer<ByteVar>(), pulwinfo?.value?.toCPointer<ByteVar>())

public actual fun waitMessage(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_waitMessage()

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    null

public actual fun windowFromPoint(point: Point): Hwnd =
    null

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_wsprintfA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_wsprintfW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.cinterop.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), arglist?.value?.toCPointer<ByteVar>())
