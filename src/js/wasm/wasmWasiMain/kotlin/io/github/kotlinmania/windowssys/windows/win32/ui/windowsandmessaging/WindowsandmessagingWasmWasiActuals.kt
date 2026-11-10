@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun adjustWindowRect(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun adjustWindowRectEx(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun anyPopup(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun calculatePopupWindowPosition(anchorpoint: COpaquePointer?, windowsize: COpaquePointer?, flags: UInt, excluderect: COpaquePointer?, popupwindowposition: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callMsgFilterA(lpmsg: COpaquePointer?, ncode: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callMsgFilterW(lpmsg: COpaquePointer?, ncode: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cancelShutdown(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charLowerA(lpsz: Pstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charNextA(lpsz: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charUpperA(lpsz: Pstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clipCursor(lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyIcon(hicon: Hicon): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createAcceleratorTableA(paccel: COpaquePointer?, caccel: Int): Haccel =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createAcceleratorTableW(paccel: COpaquePointer?, caccel: Int): Haccel =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: COpaquePointer?, pvxorplane: COpaquePointer?): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: COpaquePointer?, lpbxorbits: COpaquePointer?): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createIconFromResource(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createIconFromResourceEx(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createIconIndirect(piconinfo: COpaquePointer?): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMenu(): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPopupMenu(): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyCaret(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyIcon(hicon: Hicon): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyResourceIndexer(resourceindexer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun disableProcessWindowsGhosting() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dispatchMessageA(lpmsg: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dispatchMessageW(lpmsg: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endMenu(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flashWindowEx(pfwi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCaretBlinkTime(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCaretPos(lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClientRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipCursor(lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCursor(): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCursorInfo(pci: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCursorPos(lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDesktopWindow(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDialogBaseUnits(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: COpaquePointer?, bsigned: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getForegroundWindow(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGUIThreadInfo(idthread: UInt, pgui: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIconInfo(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getInputState(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: COpaquePointer?, pbalpha: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuCheckMarkDimensions(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMessageExtraInfo(): Lparam =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMessagePos(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMessageTime(): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getParent(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPhysicalCursorPos(lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessDefaultLayout(pdwdefaultlayout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: COpaquePointer?, lpmaxpos: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getShellWindow(): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowInfo(hwnd: Hwnd, pwi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hideCaret(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inSendMessage(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inSendMessageEx(lpreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun indexFilePath(resourceindexer: COpaquePointer?, filepath: Pcwstr, ppresourceuri: COpaquePointer?, pqualifiercount: COpaquePointer?, ppqualifiers: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharAlphaA(ch: Byte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharAlphaW(ch: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharLowerA(ch: Byte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharUpperA(ch: Byte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharUpperW(ch: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isGUIThread(bconvert: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isIconic(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isMenu(hmenu: Hmenu): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isProcessDPIAware(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWow64Message(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isZoomed(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadMenuIndirectA(lpmenutemplate: COpaquePointer?): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadMenuIndirectW(lpmenutemplate: COpaquePointer?): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lookupIconIdFromDirectory(presbits: COpaquePointer?, ficon: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lookupIconIdFromDirectoryEx(presbits: COpaquePointer?, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapDialogRect(hdlg: Hwnd, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBoxIndirectA(lpmbp: COpaquePointer?): MessageboxResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBoxIndirectW(lpmbp: COpaquePointer?): MessageboxResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: COpaquePointer?, outputprisize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: COpaquePointer?, prisize: UInt, indexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: COpaquePointer?, schemaxmlsize: UInt, indexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmDumpPriDataInMemory(inputpridata: COpaquePointer?, inputprisize: UInt, schemapridata: COpaquePointer?, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmFreeMemory(data: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: COpaquePointer?, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: COpaquePointer?, nummsgs: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgWaitForMultipleObjects(ncount: UInt, phandles: COpaquePointer?, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: COpaquePointer?, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openIcon(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peekMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun peekMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun postQuitMessage(nexitcode: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerClassA(lpwndclass: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerClassExA(param0: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerClassExW(param0: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerClassW(lpwndclass: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun replyMessage(lresult: Lresult): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: COpaquePointer?, lprcclip: COpaquePointer?, hrgnupdate: Hrgn, lprcupdate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: COpaquePointer?, lpcliprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: COpaquePointer?, prcclip: COpaquePointer?, hrgnupdate: Hrgn, prcupdate: COpaquePointer?, flags: ScrollWindowFlags): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCaretPos(x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCursorPos(x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessDPIAware(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showCaret(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showCursor(bshow: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun soundSentry(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun translateMessage(lpmsg: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: COpaquePointer?, psize: COpaquePointer?, hdcsrc: Hdc, pptsrc: COpaquePointer?, crkey: Colorref, pblend: COpaquePointer?, dwflags: UpdateLayeredWindowFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun waitMessage(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowFromPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
