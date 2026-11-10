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

private object WindowsWin32UiWindowsandmessagingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRect(lprect: Long, dwstyle: Int, bmenu: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRectEx(lprect: Long, dwstyle: Int, bmenu: Int, dwexstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_allowSetForegroundWindow(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_animateWindow(hwnd: Long, dwtime: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_anyPopup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_appendMenuA(hmenu: Long, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_appendMenuW(hmenu: Long, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_arrangeIconicWindows(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_beginDeferWindowPos(nnumwindows: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_bringWindowToTop(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_calculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: Int, excluderect: Long, popupwindowposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterA(lpmsg: Long, ncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterW(lpmsg: Long, ncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_callNextHookEx(hhk: Long, ncode: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_callWindowProcA(lpprevwndfunc: Long, hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_callWindowProcW(lpprevwndfunc: Long, hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_cancelShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_cascadeWindows(hwndparent: Long, whow: Int, lprect: Long, ckids: Int, lpkids: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_changeMenuA(hmenu: Long, cmd: Int, lpsznewitem: Long, cmdinsert: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_changeMenuW(hmenu: Long, cmd: Int, lpsznewitem: Long, cmdinsert: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilter(message: Int, dwflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilterEx(hwnd: Long, message: Int, action: Int, pchangefilterstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charLowerA(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffA(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffW(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charLowerW(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charNextA(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charNextExA(codepage: Short, lpcurrentchar: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charNextW(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charPrevA(lpszstart: Long, lpszcurrent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charPrevExA(codepage: Short, lpstart: Long, lpcurrentchar: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charPrevW(lpszstart: Long, lpszcurrent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charToOemA(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffA(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffW(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charToOemW(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charUpperA(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffA(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffW(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_charUpperW(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_checkMenuItem(hmenu: Long, uidcheckitem: Int, ucheck: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_checkMenuRadioItem(hmenu: Long, first: Int, last: Int, check: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_clipCursor(lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_closeWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableA(haccelsrc: Long, lpacceldst: Long, caccelentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableW(haccelsrc: Long, lpacceldst: Long, caccelentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_copyIcon(hicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_copyImage(h: Long, type: Int, cx: Int, cy: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableA(paccel: Long, caccel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableW(paccel: Long, caccel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createCaret(hwnd: Long, hbitmap: Long, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createCursor(hinst: Long, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamA(hinstance: Long, lptemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamW(hinstance: Long, lptemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createDialogParamA(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createDialogParamW(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createIcon(hinstance: Long, nwidth: Int, nheight: Int, cplanes: Byte, cbitspixel: Byte, lpbandbits: Long, lpbxorbits: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createIconFromResource(presbits: Long, dwressize: Int, ficon: Int, dwver: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createIconFromResourceEx(presbits: Long, dwressize: Int, ficon: Int, dwver: Int, cxdesired: Int, cydesired: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createIconIndirect(piconinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowA(lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hinstance: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowW(lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hinstance: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createMenu(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createPopupMenu(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createResourceIndexer(projectroot: Long, extensiondllpath: Long, ppresourceindexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createWindowExA(dwexstyle: Int, lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hmenu: Long, hinstance: Long, lpparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_createWindowExW(dwexstyle: Int, lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hmenu: Long, hinstance: Long, lpparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defDlgProcA(hdlg: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defDlgProcW(hdlg: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defFrameProcA(hwnd: Long, hwndmdiclient: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defFrameProcW(hwnd: Long, hwndmdiclient: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcA(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcW(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defWindowProcA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_defWindowProcW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_deferWindowPos(hwinposinfo: Long, hwnd: Long, hwndinsertafter: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_deleteMenu(hmenu: Long, uposition: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_deregisterShellHookWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyAcceleratorTable(haccel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyCaret(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyCursor(hcursor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyIcon(hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyIndexedResults(resourceuri: Long, qualifiercount: Int, qualifiers: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyMenu(hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyResourceIndexer(resourceindexer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_destroyWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamA(hinstance: Long, hdialogtemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamW(hinstance: Long, hdialogtemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamA(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamW(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_disableProcessWindowsGhosting()

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageA(lpmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageW(lpmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_dragObject(hwndparent: Long, hwndfrom: Long, fmt: Int, data: Long, hcur: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_drawIcon(hdc: Long, x: Int, y: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_drawIconEx(hdc: Long, xleft: Int, ytop: Int, hicon: Long, cxwidth: Int, cywidth: Int, istepifanicur: Int, hbrflickerfreedraw: Long, diflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_drawMenuBar(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enableMenuItem(hmenu: Long, uidenableitem: Int, uenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_endDeferWindowPos(hwinposinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_endDialog(hdlg: Long, nresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_endMenu(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumChildWindows(hwndparent: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumPropsA(hwnd: Long, lpenumfunc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumPropsExA(hwnd: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumPropsExW(hwnd: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumPropsW(hwnd: Long, lpenumfunc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumThreadWindows(dwthreadid: Int, lpfn: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_enumWindows(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_findWindowA(lpclassname: Long, lpwindowname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_findWindowExA(hwndparent: Long, hwndchildafter: Long, lpszclass: Long, lpszwindow: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_findWindowExW(hwndparent: Long, hwndchildafter: Long, lpszclass: Long, lpszwindow: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_findWindowW(lpclassname: Long, lpwindowname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_flashWindow(hwnd: Long, binvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_flashWindowEx(pfwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoA(hwnd: Long, iitem: Int, pati: Long, pszitemtext: Long, cchitemtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoW(hwnd: Long, iitem: Int, pati: Long, pszitemtext: Long, cchitemtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getAncestor(hwnd: Long, gaflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getCaretBlinkTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getCaretPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassInfoA(hinstance: Long, lpclassname: Long, lpwndclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExA(hinstance: Long, lpszclass: Long, lpwcx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExW(hinstance: Long, lpszclass: Long, lpwcx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassInfoW(hinstance: Long, lpclassname: Long, lpwndclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassLongA(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrA(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrW(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassLongW(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassNameA(hwnd: Long, lpclassname: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassNameW(hwnd: Long, lpclassname: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClassWord(hwnd: Long, nindex: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClientRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getClipCursor(lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getCursor(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getCursorInfo(pci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getCursorPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDesktopWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDialogBaseUnits(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDlgCtrlID(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDlgItem(hdlg: Long, niddlgitem: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDlgItemInt(hdlg: Long, niddlgitem: Int, lptranslated: Long, bsigned: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextA(hdlg: Long, niddlgitem: Int, lpstring: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextW(hdlg: Long, niddlgitem: Int, lpstring: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getForegroundWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getGUIThreadInfo(idthread: Int, pgui: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getIconInfo(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExA(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExW(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getInputState(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getLastActivePopup(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getLayeredWindowAttributes(hwnd: Long, pcrkey: Long, pbalpha: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenu(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuBarInfo(hwnd: Long, idobject: Int, iditem: Int, pmbi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuCheckMarkDimensions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuDefaultItem(hmenu: Long, fbypos: Int, gmdiflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuInfo(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuItemCount(hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuItemID(hmenu: Long, npos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoA(hmenu: Long, item: Int, fbyposition: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoW(hmenu: Long, item: Int, fbyposition: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuItemRect(hwnd: Long, hmenu: Long, uitem: Int, lprcitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuState(hmenu: Long, uid: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuStringA(hmenu: Long, uiditem: Int, lpstring: Long, cchmax: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMenuStringW(hmenu: Long, uiditem: Int, lpstring: Long, cchmax: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMessageA(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMessageExtraInfo(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMessagePos(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMessageTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getMessageW(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getNextDlgGroupItem(hdlg: Long, hctl: Long, bprevious: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getNextDlgTabItem(hdlg: Long, hctl: Long, bprevious: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getParent(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getPhysicalCursorPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getProcessDefaultLayout(pdwdefaultlayout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getPropA(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getPropW(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getQueueStatus(flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getScrollBarInfo(hwnd: Long, idobject: Int, psbi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getScrollInfo(hwnd: Long, nbar: Int, lpsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getScrollPos(hwnd: Long, nbar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getScrollRange(hwnd: Long, nbar: Int, lpminpos: Long, lpmaxpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getShellWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getSubMenu(hmenu: Long, npos: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getSystemMenu(hwnd: Long, brevert: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getSystemMetrics(nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getTitleBarInfo(hwnd: Long, pti: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getTopWindow(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindow(hwnd: Long, ucmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowDisplayAffinity(hwnd: Long, pdwaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowInfo(hwnd: Long, pwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowLongA(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrA(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrW(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowLongW(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameA(hwnd: Long, pszfilename: Long, cchfilenamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameW(hwnd: Long, pszfilename: Long, cchfilenamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowPlacement(hwnd: Long, lpwndpl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowTextA(hwnd: Long, lpstring: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthA(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthW(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowTextW(hwnd: Long, lpstring: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowThreadProcessId(hwnd: Long, lpdwprocessid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_getWindowWord(hwnd: Long, nindex: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_hideCaret(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_hiliteMenuItem(hwnd: Long, hmenu: Long, uidhiliteitem: Int, uhilite: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_inSendMessage(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_inSendMessageEx(lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_indexFilePath(resourceindexer: Long, filepath: Long, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_inheritWindowMonitor(hwnd: Long, hwndinherit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_insertMenuA(hmenu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemA(hmenu: Long, item: Int, fbyposition: Int, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemW(hmenu: Long, item: Int, fbyposition: Int, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_insertMenuW(hmenu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_internalGetWindowText(hwnd: Long, pstring: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharLowerA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharUpperA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isCharUpperW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isChild(hwndparent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageA(hdlg: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageW(hdlg: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isGUIThread(bconvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isHungAppWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isIconic(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isMenu(hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isProcessDPIAware(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isWindowArranged(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isWindowUnicode(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isWindowVisible(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isWow64Message(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_isZoomed(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_killTimer(hwnd: Long, uidevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsA(hinstance: Long, lptablename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsW(hinstance: Long, lptablename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadCursorA(hinstance: Long, lpcursorname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileA(lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileW(lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadCursorW(hinstance: Long, lpcursorname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadIconA(hinstance: Long, lpiconname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadIconW(hinstance: Long, lpiconname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadImageA(hinst: Long, name: Long, type: Int, cx: Int, cy: Int, fuload: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadImageW(hinst: Long, name: Long, type: Int, cx: Int, cy: Int, fuload: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadMenuA(hinstance: Long, lpmenuname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectA(lpmenutemplate: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectW(lpmenutemplate: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadMenuW(hinstance: Long, lpmenuname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadStringA(hinstance: Long, uid: Int, lpbuffer: Long, cchbuffermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_loadStringW(hinstance: Long, uid: Int, lpbuffer: Long, cchbuffermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_lockSetForegroundWindow(ulockcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_logicalToPhysicalPoint(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectory(presbits: Long, ficon: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectoryEx(presbits: Long, ficon: Int, cxdesired: Int, cydesired: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mapDialogRect(hdlg: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_messageBoxA(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_messageBoxExA(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int, wlanguageid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_messageBoxExW(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int, wlanguageid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectA(lpmbp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectW(lpmbp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_messageBoxW(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_modifyMenuA(hmnu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_modifyMenuW(hmnu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_moveWindow(hwnd: Long, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfig(platformversion: Int, defaultqualifiers: Long, outputxmlfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfigInMemory(platformversion: Int, defaultqualifiers: Long, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexer(packagefamilyname: Long, projectroot: Long, platformversion: Int, defaultqualifiers: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriData(projectroot: Long, platformversion: Int, defaultqualifiers: Long, pridata: Long, prisize: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Long, platformversion: Int, defaultqualifiers: Long, prifile: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Long, platformversion: Int, defaultqualifiers: Long, schemaxmldata: Long, schemaxmlsize: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Long, platformversion: Int, defaultqualifiers: Long, schemafile: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerWithFlags(packagefamilyname: Long, projectroot: Long, platformversion: Int, defaultqualifiers: Long, flags: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriDataInMemory(inputpridata: Long, inputprisize: Int, schemapridata: Long, schemaprisize: Int, dumptype: Int, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFile(indexfilename: Long, schemaprifile: Long, dumptype: Int, outputxmlfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFileInMemory(indexfilename: Long, schemaprifile: Long, dumptype: Int, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmFreeMemory(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_mrmGetPriFileContentChecksum(prifile: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjects(ncount: Int, phandles: Long, fwaitall: Int, dwmilliseconds: Int, dwwakemask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjectsEx(ncount: Int, phandles: Long, dwmilliseconds: Int, dwwakemask: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_oemToCharA(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffA(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffW(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_oemToCharW(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_openIcon(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_peekMessageA(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int, wremovemsg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_peekMessageW(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int, wremovemsg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_physicalToLogicalPoint(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_postMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_postMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_postQuitMessage(nexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageA(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageW(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsA(szfilename: Long, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsW(szfilename: Long, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassA(hwnd: Long, ptszclassname: Long, cchclassnamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassW(hwnd: Long, ptszclassname: Long, cchclassnamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerClassA(lpwndclass: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerClassExA(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerClassExW(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerClassW(lpwndclass: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationA(hrecipient: Long, notificationfilter: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationW(hrecipient: Long, notificationfilter: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerForTooltipDismissNotification(hwnd: Long, tdflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerShellHookWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageA(lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageW(lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_removeMenu(hmenu: Long, uposition: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_removePropA(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_removePropW(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_replyMessage(lresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_scrollDC(hdc: Long, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: Long, lprcupdate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_scrollWindow(hwnd: Long, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_scrollWindowEx(hwnd: Long, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: Long, prcupdate: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageA(hdlg: Long, niddlgitem: Int, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageW(hdlg: Long, niddlgitem: Int, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackA(hwnd: Long, msg: Int, wparam: Long, lparam: Long, lpresultcallback: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackW(hwnd: Long, msg: Int, wparam: Long, lparam: Long, lpresultcallback: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutA(hwnd: Long, msg: Int, wparam: Long, lparam: Long, fuflags: Int, utimeout: Int, lpdwresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutW(hwnd: Long, msg: Int, wparam: Long, lparam: Long, fuflags: Int, utimeout: Int, lpdwresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setAdditionalForegroundBoostProcesses(toplevelwindow: Long, processhandlecount: Int, processhandlearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setCaretBlinkTime(umseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setCaretPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setClassLongA(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrA(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrW(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setClassLongW(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setClassWord(hwnd: Long, nindex: Int, wnewword: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setCoalescableTimer(hwnd: Long, nidevent: Long, uelapse: Int, lptimerfunc: Long, utolerancedelay: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setCursor(hcursor: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setCursorPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setDebugErrorLevel(dwlevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setDlgItemInt(hdlg: Long, niddlgitem: Int, uvalue: Int, bsigned: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextA(hdlg: Long, niddlgitem: Int, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextW(hdlg: Long, niddlgitem: Int, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setForegroundWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setLayeredWindowAttributes(hwnd: Long, crkey: Int, balpha: Byte, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMenu(hwnd: Long, hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMenuDefaultItem(hmenu: Long, uitem: Int, fbypos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMenuInfo(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMenuItemBitmaps(hmenu: Long, uposition: Int, uflags: Int, hbitmapunchecked: Long, hbitmapchecked: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoA(hmenu: Long, item: Int, fbypositon: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoW(hmenu: Long, item: Int, fbypositon: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMessageExtraInfo(lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setMessageQueue(cmessagesmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setParent(hwndchild: Long, hwndnewparent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setPhysicalCursorPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setProcessDPIAware(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setProcessDefaultLayout(dwdefaultlayout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setPropA(hwnd: Long, lpstring: Long, hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setPropW(hwnd: Long, lpstring: Long, hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setSystemCursor(hcur: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setTimer(hwnd: Long, nidevent: Long, uelapse: Int, lptimerfunc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowDisplayAffinity(hwnd: Long, dwaffinity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowLongA(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrA(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrW(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowLongW(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowPlacement(hwnd: Long, lpwndpl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowPos(hwnd: Long, hwndinsertafter: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowTextA(hwnd: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowTextW(hwnd: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowWord(hwnd: Long, nindex: Int, wnewword: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookA(nfiltertype: Int, pfnfilterproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExA(idhook: Int, lpfn: Long, hmod: Long, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExW(idhook: Int, lpfn: Long, hmod: Long, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookW(nfiltertype: Int, pfnfilterproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_showCaret(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_showCursor(bshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_showOwnedPopups(hwnd: Long, fshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_showWindow(hwnd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_showWindowAsync(hwnd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_soundSentry(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_switchToThisWindow(hwnd: Long, funknown: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoA(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoW(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_tileWindows(hwndparent: Long, whow: Int, lprect: Long, ckids: Int, lpkids: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenu(hmenu: Long, uflags: Int, x: Int, y: Int, nreserved: Int, hwnd: Long, prcrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenuEx(hmenu: Long, uflags: Int, x: Int, y: Int, hwnd: Long, lptpm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorA(hwnd: Long, hacctable: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorW(hwnd: Long, hacctable: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_translateMDISysAccel(hwndclient: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_translateMessage(lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHook(ncode: Int, pfnfilterproc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHookEx(hhk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_unregisterClassA(lpclassname: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_unregisterClassW(lpclassname: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_unregisterDeviceNotification(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindow(hwnd: Long, hdcdst: Long, pptdst: Long, psize: Long, hdcsrc: Long, pptsrc: Long, crkey: Int, pblend: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindowIndirect(hwnd: Long, pulwinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_waitMessage(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_wsprintfA(param0: Long, param1: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_wsprintfW(param0: Long, param1: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(param0: Long, param1: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(param0: Long, param1: Long, arglist: Long): Int
}

public actual fun adjustWindowRect(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRect((lprect?.value ?: 0L), dwstyle.toInt(), bmenu)

public actual fun adjustWindowRectEx(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRectEx((lprect?.value ?: 0L), dwstyle.toInt(), bmenu, dwexstyle.toInt())

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_allowSetForegroundWindow(dwprocessid.toInt())

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_animateWindow((hwnd?.value ?: 0L), dwtime.toInt(), dwflags.toInt())

public actual fun anyPopup(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_anyPopup()

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_appendMenuA((hmenu?.value ?: 0L), uflags.toInt(), uidnewitem.toLong(), (lpnewitem?.value ?: 0L))

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_appendMenuW((hmenu?.value ?: 0L), uflags.toInt(), uidnewitem.toLong(), (lpnewitem?.value ?: 0L))

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_arrangeIconicWindows((hwnd?.value ?: 0L)).toUInt()

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_beginDeferWindowPos(nnumwindows).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_bringWindowToTop((hwnd?.value ?: 0L))

public actual fun calculatePopupWindowPosition(anchorpoint: COpaquePointer?, windowsize: COpaquePointer?, flags: UInt, excluderect: COpaquePointer?, popupwindowposition: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_calculatePopupWindowPosition((anchorpoint?.value ?: 0L), (windowsize?.value ?: 0L), flags.toInt(), (excluderect?.value ?: 0L), (popupwindowposition?.value ?: 0L))

public actual fun callMsgFilterA(lpmsg: COpaquePointer?, ncode: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterA((lpmsg?.value ?: 0L), ncode)

public actual fun callMsgFilterW(lpmsg: COpaquePointer?, ncode: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterW((lpmsg?.value ?: 0L), ncode)

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_callNextHookEx((hhk?.value ?: 0L), ncode, wparam.toLong(), lparam)

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_callWindowProcA(0L, (hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_callWindowProcW(0L, (hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun cancelShutdown(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_cancelShutdown()

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_cascadeWindows((hwndparent?.value ?: 0L), whow.toInt(), (lprect?.value ?: 0L), ckids.toInt(), (lpkids?.value ?: 0L)).toUShort()

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_changeMenuA((hmenu?.value ?: 0L), cmd.toInt(), (lpsznewitem?.value ?: 0L), cmdinsert.toInt(), flags.toInt())

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_changeMenuW((hmenu?.value ?: 0L), cmd.toInt(), (lpsznewitem?.value ?: 0L), cmdinsert.toInt(), flags.toInt())

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilter(message.toInt(), dwflag.toInt())

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilterEx((hwnd?.value ?: 0L), message.toInt(), action.toInt(), (pchangefilterstruct?.value ?: 0L))

public actual fun charLowerA(lpsz: Pstr): Pstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charLowerA((lpsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffA((lpsz?.value ?: 0L), cchlength.toInt()).toUInt()

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffW((lpsz?.value ?: 0L), cchlength.toInt()).toUInt()

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charLowerW((lpsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charNextA(lpsz: Pcstr): Pstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charNextA((lpsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charNextExA(codepage.toShort(), (lpcurrentchar?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charNextW((lpsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charPrevA((lpszstart?.value ?: 0L), (lpszcurrent?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charPrevExA(codepage.toShort(), (lpstart?.value ?: 0L), (lpcurrentchar?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charPrevW((lpszstart?.value ?: 0L), (lpszcurrent?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charToOemA((psrc?.value ?: 0L), (pdst?.value ?: 0L))

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffA((lpszsrc?.value ?: 0L), (lpszdst?.value ?: 0L), cchdstlength.toInt())

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffW((lpszsrc?.value ?: 0L), (lpszdst?.value ?: 0L), cchdstlength.toInt())

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charToOemW((psrc?.value ?: 0L), (pdst?.value ?: 0L))

public actual fun charUpperA(lpsz: Pstr): Pstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charUpperA((lpsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffA((lpsz?.value ?: 0L), cchlength.toInt()).toUInt()

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffW((lpsz?.value ?: 0L), cchlength.toInt()).toUInt()

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_charUpperW((lpsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_checkMenuItem((hmenu?.value ?: 0L), uidcheckitem.toInt(), ucheck.toInt()).toUInt()

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_checkMenuRadioItem((hmenu?.value ?: 0L), first.toInt(), last.toInt(), check.toInt(), flags.toInt())

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    null

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    null

public actual fun clipCursor(lprect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_clipCursor((lprect?.value ?: 0L))

public actual fun closeWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_closeWindow((hwnd?.value ?: 0L))

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableA((haccelsrc?.value ?: 0L), (lpacceldst?.value ?: 0L), caccelentries)

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableW((haccelsrc?.value ?: 0L), (lpacceldst?.value ?: 0L), caccelentries)

public actual fun copyIcon(hicon: Hicon): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_copyIcon((hicon?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_copyImage((h?.value ?: 0L), type.toInt(), cx, cy, flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createAcceleratorTableA(paccel: COpaquePointer?, caccel: Int): Haccel =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableA((paccel?.value ?: 0L), caccel).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createAcceleratorTableW(paccel: COpaquePointer?, caccel: Int): Haccel =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableW((paccel?.value ?: 0L), caccel).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createCaret((hwnd?.value ?: 0L), (hbitmap?.value ?: 0L), nwidth, nheight)

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: COpaquePointer?, pvxorplane: COpaquePointer?): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createCursor((hinst?.value ?: 0L), xhotspot, yhotspot, nwidth, nheight, (pvandplane?.value ?: 0L), (pvxorplane?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamA((hinstance?.value ?: 0L), (lptemplate?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamW((hinstance?.value ?: 0L), (lptemplate?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createDialogParamA((hinstance?.value ?: 0L), (lptemplatename?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createDialogParamW((hinstance?.value ?: 0L), (lptemplatename?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: COpaquePointer?, lpbxorbits: COpaquePointer?): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createIcon((hinstance?.value ?: 0L), nwidth, nheight, cplanes.toByte(), cbitspixel.toByte(), (lpbandbits?.value ?: 0L), (lpbxorbits?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createIconFromResource(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createIconFromResource((presbits?.value ?: 0L), dwressize.toInt(), ficon, dwver.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createIconFromResourceEx(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createIconFromResourceEx((presbits?.value ?: 0L), dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createIconIndirect(piconinfo: COpaquePointer?): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createIconIndirect((piconinfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowA((lpclassname?.value ?: 0L), (lpwindowname?.value ?: 0L), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L), (hinstance?.value ?: 0L), lparam).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowW((lpclassname?.value ?: 0L), (lpwindowname?.value ?: 0L), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L), (hinstance?.value ?: 0L), lparam).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMenu(): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createMenu().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPopupMenu(): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createPopupMenu().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createResourceIndexer((projectroot?.value ?: 0L), (extensiondllpath?.value ?: 0L), (ppresourceindexer?.value ?: 0L))

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createWindowExA(dwexstyle.toInt(), (lpclassname?.value ?: 0L), (lpwindowname?.value ?: 0L), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L), (hmenu?.value ?: 0L), (hinstance?.value ?: 0L), (lpparam?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_createWindowExW(dwexstyle.toInt(), (lpclassname?.value ?: 0L), (lpwindowname?.value ?: 0L), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L), (hmenu?.value ?: 0L), (hinstance?.value ?: 0L), (lpparam?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defDlgProcA((hdlg?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defDlgProcW((hdlg?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defFrameProcA((hwnd?.value ?: 0L), (hwndmdiclient?.value ?: 0L), umsg.toInt(), wparam.toLong(), lparam)

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defFrameProcW((hwnd?.value ?: 0L), (hwndmdiclient?.value ?: 0L), umsg.toInt(), wparam.toLong(), lparam)

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcA((hwnd?.value ?: 0L), umsg.toInt(), wparam.toLong(), lparam)

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcW((hwnd?.value ?: 0L), umsg.toInt(), wparam.toLong(), lparam)

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defWindowProcA((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_defWindowProcW((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_deferWindowPos((hwinposinfo?.value ?: 0L), (hwnd?.value ?: 0L), (hwndinsertafter?.value ?: 0L), x, y, cx, cy, uflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_deleteMenu((hmenu?.value ?: 0L), uposition.toInt(), uflags.toInt())

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_deregisterShellHookWindow((hwnd?.value ?: 0L))

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyAcceleratorTable((haccel?.value ?: 0L))

public actual fun destroyCaret(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyCaret()

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyCursor((hcursor?.value ?: 0L))

public actual fun destroyIcon(hicon: Hicon): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyIcon((hicon?.value ?: 0L))

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: COpaquePointer?) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyIndexedResults((resourceuri?.value ?: 0L), qualifiercount.toInt(), (qualifiers?.value ?: 0L))
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyMenu((hmenu?.value ?: 0L))

public actual fun destroyResourceIndexer(resourceindexer: COpaquePointer?) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyResourceIndexer((resourceindexer?.value ?: 0L))
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_destroyWindow((hwnd?.value ?: 0L))

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamA((hinstance?.value ?: 0L), (hdialogtemplate?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam)

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamW((hinstance?.value ?: 0L), (hdialogtemplate?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam)

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamA((hinstance?.value ?: 0L), (lptemplatename?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam)

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamW((hinstance?.value ?: 0L), (lptemplatename?.value ?: 0L), (hwndparent?.value ?: 0L), 0L, dwinitparam)

public actual fun disableProcessWindowsGhosting() {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_disableProcessWindowsGhosting()
}

public actual fun dispatchMessageA(lpmsg: COpaquePointer?): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageA((lpmsg?.value ?: 0L))

public actual fun dispatchMessageW(lpmsg: COpaquePointer?): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageW((lpmsg?.value ?: 0L))

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_dragObject((hwndparent?.value ?: 0L), (hwndfrom?.value ?: 0L), fmt.toInt(), data.toLong(), (hcur?.value ?: 0L)).toUInt()

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_drawIcon((hdc?.value ?: 0L), x, y, (hicon?.value ?: 0L))

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_drawIconEx((hdc?.value ?: 0L), xleft, ytop, (hicon?.value ?: 0L), cxwidth, cywidth, istepifanicur.toInt(), (hbrflickerfreedraw?.value ?: 0L), diflags.toInt())

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_drawMenuBar((hwnd?.value ?: 0L))

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enableMenuItem((hmenu?.value ?: 0L), uidenableitem.toInt(), uenable.toInt())

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_endDeferWindowPos((hwinposinfo?.value ?: 0L))

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_endDialog((hdlg?.value ?: 0L), nresult)

public actual fun endMenu(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_endMenu()

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumChildWindows((hwndparent?.value ?: 0L), 0L, lparam)

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumPropsA((hwnd?.value ?: 0L), 0L)

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumPropsExA((hwnd?.value ?: 0L), 0L, lparam)

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumPropsExW((hwnd?.value ?: 0L), 0L, lparam)

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumPropsW((hwnd?.value ?: 0L), 0L)

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumThreadWindows(dwthreadid.toInt(), 0L, lparam)

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_enumWindows(0L, lparam)

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_findWindowA((lpclassname?.value ?: 0L), (lpwindowname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_findWindowExA((hwndparent?.value ?: 0L), (hwndchildafter?.value ?: 0L), (lpszclass?.value ?: 0L), (lpszwindow?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_findWindowExW((hwndparent?.value ?: 0L), (hwndchildafter?.value ?: 0L), (lpszclass?.value ?: 0L), (lpszwindow?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_findWindowW((lpclassname?.value ?: 0L), (lpwindowname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_flashWindow((hwnd?.value ?: 0L), binvert)

public actual fun flashWindowEx(pfwi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_flashWindowEx((pfwi?.value ?: 0L))

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoA((hwnd?.value ?: 0L), iitem, (pati?.value ?: 0L), (pszitemtext?.value ?: 0L), cchitemtext.toInt())

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoW((hwnd?.value ?: 0L), iitem, (pati?.value ?: 0L), (pszitemtext?.value ?: 0L), cchitemtext.toInt())

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getAncestor((hwnd?.value ?: 0L), gaflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCaretBlinkTime(): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getCaretBlinkTime().toUInt()

public actual fun getCaretPos(lppoint: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getCaretPos((lppoint?.value ?: 0L))

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoA((hinstance?.value ?: 0L), (lpclassname?.value ?: 0L), (lpwndclass?.value ?: 0L))

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExA((hinstance?.value ?: 0L), (lpszclass?.value ?: 0L), (lpwcx?.value ?: 0L))

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExW((hinstance?.value ?: 0L), (lpszclass?.value ?: 0L), (lpwcx?.value ?: 0L))

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoW((hinstance?.value ?: 0L), (lpclassname?.value ?: 0L), (lpwndclass?.value ?: 0L))

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassLongA((hwnd?.value ?: 0L), nindex).toUInt()

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrA((hwnd?.value ?: 0L), nindex).toULong()

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrW((hwnd?.value ?: 0L), nindex).toULong()

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassLongW((hwnd?.value ?: 0L), nindex).toUInt()

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassNameA((hwnd?.value ?: 0L), (lpclassname?.value ?: 0L), nmaxcount)

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassNameW((hwnd?.value ?: 0L), (lpclassname?.value ?: 0L), nmaxcount)

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClassWord((hwnd?.value ?: 0L), nindex).toUShort()

public actual fun getClientRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClientRect((hwnd?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun getClipCursor(lprect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getClipCursor((lprect?.value ?: 0L))

public actual fun getCursor(): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getCursor().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCursorInfo(pci: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getCursorInfo((pci?.value ?: 0L))

public actual fun getCursorPos(lppoint: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getCursorPos((lppoint?.value ?: 0L))

public actual fun getDesktopWindow(): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDesktopWindow().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getDialogBaseUnits(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDialogBaseUnits()

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDlgCtrlID((hwnd?.value ?: 0L))

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDlgItem((hdlg?.value ?: 0L), niddlgitem).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: COpaquePointer?, bsigned: Bool): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemInt((hdlg?.value ?: 0L), niddlgitem, (lptranslated?.value ?: 0L), bsigned).toUInt()

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextA((hdlg?.value ?: 0L), niddlgitem, (lpstring?.value ?: 0L), cchmax).toUInt()

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextW((hdlg?.value ?: 0L), niddlgitem, (lpstring?.value ?: 0L), cchmax).toUInt()

public actual fun getForegroundWindow(): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getForegroundWindow().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getGUIThreadInfo(idthread: UInt, pgui: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getGUIThreadInfo(idthread.toInt(), (pgui?.value ?: 0L))

public actual fun getIconInfo(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getIconInfo((hicon?.value ?: 0L), (piconinfo?.value ?: 0L))

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExA((hicon?.value ?: 0L), (piconinfo?.value ?: 0L))

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExW((hicon?.value ?: 0L), (piconinfo?.value ?: 0L))

public actual fun getInputState(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getInputState()

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getLastActivePopup((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: COpaquePointer?, pbalpha: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getLayeredWindowAttributes((hwnd?.value ?: 0L), (pcrkey?.value ?: 0L), (pbalpha?.value ?: 0L), (pdwflags?.value ?: 0L))

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenu((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuBarInfo((hwnd?.value ?: 0L), idobject, iditem, (pmbi?.value ?: 0L))

public actual fun getMenuCheckMarkDimensions(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuCheckMarkDimensions()

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuDefaultItem((hmenu?.value ?: 0L), fbypos.toInt(), gmdiflags.toInt()).toUInt()

public actual fun getMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuInfo((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemCount((hmenu?.value ?: 0L))

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemID((hmenu?.value ?: 0L), npos).toUInt()

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoA((hmenu?.value ?: 0L), item.toInt(), fbyposition, (lpmii?.value ?: 0L))

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoW((hmenu?.value ?: 0L), item.toInt(), fbyposition, (lpmii?.value ?: 0L))

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemRect((hwnd?.value ?: 0L), (hmenu?.value ?: 0L), uitem.toInt(), (lprcitem?.value ?: 0L))

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuState((hmenu?.value ?: 0L), uid.toInt(), uflags.toInt()).toUInt()

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuStringA((hmenu?.value ?: 0L), uiditem.toInt(), (lpstring?.value ?: 0L), cchmax, flags.toInt())

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMenuStringW((hmenu?.value ?: 0L), uiditem.toInt(), (lpstring?.value ?: 0L), cchmax, flags.toInt())

public actual fun getMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMessageA((lpmsg?.value ?: 0L), (hwnd?.value ?: 0L), wmsgfiltermin.toInt(), wmsgfiltermax.toInt())

public actual fun getMessageExtraInfo(): Lparam =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMessageExtraInfo()

public actual fun getMessagePos(): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMessagePos().toUInt()

public actual fun getMessageTime(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMessageTime()

public actual fun getMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getMessageW((lpmsg?.value ?: 0L), (hwnd?.value ?: 0L), wmsgfiltermin.toInt(), wmsgfiltermax.toInt())

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getNextDlgGroupItem((hdlg?.value ?: 0L), (hctl?.value ?: 0L), bprevious).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getNextDlgTabItem((hdlg?.value ?: 0L), (hctl?.value ?: 0L), bprevious).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getParent(hwnd: Hwnd): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getParent((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getPhysicalCursorPos(lppoint: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getPhysicalCursorPos((lppoint?.value ?: 0L))

public actual fun getProcessDefaultLayout(pdwdefaultlayout: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getProcessDefaultLayout((pdwdefaultlayout?.value ?: 0L))

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getPropA((hwnd?.value ?: 0L), (lpstring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getPropW((hwnd?.value ?: 0L), (lpstring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getQueueStatus(flags.toInt()).toUInt()

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getScrollBarInfo((hwnd?.value ?: 0L), idobject, (psbi?.value ?: 0L))

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getScrollInfo((hwnd?.value ?: 0L), nbar, (lpsi?.value ?: 0L))

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getScrollPos((hwnd?.value ?: 0L), nbar)

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: COpaquePointer?, lpmaxpos: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getScrollRange((hwnd?.value ?: 0L), nbar, (lpminpos?.value ?: 0L), (lpmaxpos?.value ?: 0L))

public actual fun getShellWindow(): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getShellWindow().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getSubMenu((hmenu?.value ?: 0L), npos).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getSystemMenu((hwnd?.value ?: 0L), brevert).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getSystemMetrics(nindex)

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getTitleBarInfo((hwnd?.value ?: 0L), (pti?.value ?: 0L))

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getTopWindow((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindow((hwnd?.value ?: 0L), ucmd.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowDisplayAffinity((hwnd?.value ?: 0L), (pdwaffinity?.value ?: 0L))

public actual fun getWindowInfo(hwnd: Hwnd, pwi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowInfo((hwnd?.value ?: 0L), (pwi?.value ?: 0L))

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongA((hwnd?.value ?: 0L), nindex)

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrA((hwnd?.value ?: 0L), nindex)

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrW((hwnd?.value ?: 0L), nindex)

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongW((hwnd?.value ?: 0L), nindex)

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameA((hwnd?.value ?: 0L), (pszfilename?.value ?: 0L), cchfilenamemax.toInt()).toUInt()

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameW((hwnd?.value ?: 0L), (pszfilename?.value ?: 0L), cchfilenamemax.toInt()).toUInt()

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowPlacement((hwnd?.value ?: 0L), (lpwndpl?.value ?: 0L))

public actual fun getWindowRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowRect((hwnd?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextA((hwnd?.value ?: 0L), (lpstring?.value ?: 0L), nmaxcount)

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthA((hwnd?.value ?: 0L))

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthW((hwnd?.value ?: 0L))

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextW((hwnd?.value ?: 0L), (lpstring?.value ?: 0L), nmaxcount)

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: COpaquePointer?): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowThreadProcessId((hwnd?.value ?: 0L), (lpdwprocessid?.value ?: 0L)).toUInt()

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_getWindowWord((hwnd?.value ?: 0L), nindex).toUShort()

public actual fun hideCaret(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_hideCaret((hwnd?.value ?: 0L))

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_hiliteMenuItem((hwnd?.value ?: 0L), (hmenu?.value ?: 0L), uidhiliteitem.toInt(), uhilite.toInt())

public actual fun inSendMessage(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_inSendMessage()

public actual fun inSendMessageEx(lpreserved: COpaquePointer?): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_inSendMessageEx((lpreserved?.value ?: 0L)).toUInt()

public actual fun indexFilePath(resourceindexer: COpaquePointer?, filepath: Pcwstr, ppresourceuri: COpaquePointer?, pqualifiercount: COpaquePointer?, ppqualifiers: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_indexFilePath((resourceindexer?.value ?: 0L), (filepath?.value ?: 0L), (ppresourceuri?.value ?: 0L), (pqualifiercount?.value ?: 0L), (ppqualifiers?.value ?: 0L))

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_inheritWindowMonitor((hwnd?.value ?: 0L), (hwndinherit?.value ?: 0L))

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_insertMenuA((hmenu?.value ?: 0L), uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), (lpnewitem?.value ?: 0L))

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemA((hmenu?.value ?: 0L), item.toInt(), fbyposition, (lpmi?.value ?: 0L))

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemW((hmenu?.value ?: 0L), item.toInt(), fbyposition, (lpmi?.value ?: 0L))

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_insertMenuW((hmenu?.value ?: 0L), uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), (lpnewitem?.value ?: 0L))

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_internalGetWindowText((hwnd?.value ?: 0L), (pstring?.value ?: 0L), cchmaxcount)

public actual fun isCharAlphaA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaA(ch)

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericA(ch)

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericW(ch.toShort())

public actual fun isCharAlphaW(ch: UShort): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaW(ch.toShort())

public actual fun isCharLowerA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharLowerA(ch)

public actual fun isCharUpperA(ch: Byte): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharUpperA(ch)

public actual fun isCharUpperW(ch: UShort): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isCharUpperW(ch.toShort())

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isChild((hwndparent?.value ?: 0L), (hwnd?.value ?: 0L))

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageA((hdlg?.value ?: 0L), (lpmsg?.value ?: 0L))

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageW((hdlg?.value ?: 0L), (lpmsg?.value ?: 0L))

public actual fun isGUIThread(bconvert: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isGUIThread(bconvert)

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isHungAppWindow((hwnd?.value ?: 0L))

public actual fun isIconic(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isIconic((hwnd?.value ?: 0L))

public actual fun isMenu(hmenu: Hmenu): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isMenu((hmenu?.value ?: 0L))

public actual fun isProcessDPIAware(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isProcessDPIAware()

public actual fun isWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isWindow((hwnd?.value ?: 0L))

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isWindowArranged((hwnd?.value ?: 0L))

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isWindowUnicode((hwnd?.value ?: 0L))

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isWindowVisible((hwnd?.value ?: 0L))

public actual fun isWow64Message(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isWow64Message()

public actual fun isZoomed(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_isZoomed((hwnd?.value ?: 0L))

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_killTimer((hwnd?.value ?: 0L), uidevent.toLong())

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsA((hinstance?.value ?: 0L), (lptablename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsW((hinstance?.value ?: 0L), (lptablename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadCursorA((hinstance?.value ?: 0L), (lpcursorname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileA((lpfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileW((lpfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadCursorW((hinstance?.value ?: 0L), (lpcursorname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadIconA((hinstance?.value ?: 0L), (lpiconname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadIconW((hinstance?.value ?: 0L), (lpiconname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadImageA((hinst?.value ?: 0L), (name?.value ?: 0L), type.toInt(), cx, cy, fuload.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadImageW((hinst?.value ?: 0L), (name?.value ?: 0L), type.toInt(), cx, cy, fuload.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadMenuA((hinstance?.value ?: 0L), (lpmenuname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadMenuIndirectA(lpmenutemplate: COpaquePointer?): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectA((lpmenutemplate?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadMenuIndirectW(lpmenutemplate: COpaquePointer?): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectW((lpmenutemplate?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadMenuW((hinstance?.value ?: 0L), (lpmenuname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadStringA((hinstance?.value ?: 0L), uid.toInt(), (lpbuffer?.value ?: 0L), cchbuffermax)

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_loadStringW((hinstance?.value ?: 0L), uid.toInt(), (lpbuffer?.value ?: 0L), cchbuffermax)

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_lockSetForegroundWindow(ulockcode.toInt())

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_logicalToPhysicalPoint((hwnd?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun lookupIconIdFromDirectory(presbits: COpaquePointer?, ficon: Bool): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectory((presbits?.value ?: 0L), ficon)

public actual fun lookupIconIdFromDirectoryEx(presbits: COpaquePointer?, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectoryEx((presbits?.value ?: 0L), ficon, cxdesired, cydesired, flags.toInt())

public actual fun mapDialogRect(hdlg: Hwnd, lprect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mapDialogRect((hdlg?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    0

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_messageBoxA((hwnd?.value ?: 0L), (lptext?.value ?: 0L), (lpcaption?.value ?: 0L), utype.toInt())

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_messageBoxExA((hwnd?.value ?: 0L), (lptext?.value ?: 0L), (lpcaption?.value ?: 0L), utype.toInt(), wlanguageid.toShort())

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_messageBoxExW((hwnd?.value ?: 0L), (lptext?.value ?: 0L), (lpcaption?.value ?: 0L), utype.toInt(), wlanguageid.toShort())

public actual fun messageBoxIndirectA(lpmbp: COpaquePointer?): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectA((lpmbp?.value ?: 0L))

public actual fun messageBoxIndirectW(lpmbp: COpaquePointer?): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectW((lpmbp?.value ?: 0L))

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_messageBoxW((hwnd?.value ?: 0L), (lptext?.value ?: 0L), (lpcaption?.value ?: 0L), utype.toInt())

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_modifyMenuA((hmnu?.value ?: 0L), uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), (lpnewitem?.value ?: 0L))

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_modifyMenuW((hmnu?.value ?: 0L), uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), (lpnewitem?.value ?: 0L))

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_moveWindow((hwnd?.value ?: 0L), x, y, nwidth, nheight, brepaint)

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfig(platformversion, (defaultqualifiers?.value ?: 0L), (outputxmlfile?.value ?: 0L))

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfigInMemory(platformversion, (defaultqualifiers?.value ?: 0L), (outputxmldata?.value ?: 0L), (outputxmlsize?.value ?: 0L))

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    0

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: COpaquePointer?, outputprisize: COpaquePointer?): Hresult =
    0

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    0

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexer((packagefamilyname?.value ?: 0L), (projectroot?.value ?: 0L), platformversion, (defaultqualifiers?.value ?: 0L), (indexer?.value ?: 0L))

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: COpaquePointer?, prisize: UInt, indexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriData((projectroot?.value ?: 0L), platformversion, (defaultqualifiers?.value ?: 0L), (pridata?.value ?: 0L), prisize.toInt(), (indexer?.value ?: 0L))

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriFile((projectroot?.value ?: 0L), platformversion, (defaultqualifiers?.value ?: 0L), (prifile?.value ?: 0L), (indexer?.value ?: 0L))

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: COpaquePointer?, schemaxmlsize: UInt, indexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaData((projectroot?.value ?: 0L), platformversion, (defaultqualifiers?.value ?: 0L), (schemaxmldata?.value ?: 0L), schemaxmlsize.toInt(), (indexer?.value ?: 0L))

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaFile((projectroot?.value ?: 0L), platformversion, (defaultqualifiers?.value ?: 0L), (schemafile?.value ?: 0L), (indexer?.value ?: 0L))

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerWithFlags((packagefamilyname?.value ?: 0L), (projectroot?.value ?: 0L), platformversion, (defaultqualifiers?.value ?: 0L), flags, (indexer?.value ?: 0L))

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    0

public actual fun mrmDumpPriDataInMemory(inputpridata: COpaquePointer?, inputprisize: UInt, schemapridata: COpaquePointer?, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriDataInMemory((inputpridata?.value ?: 0L), inputprisize.toInt(), (schemapridata?.value ?: 0L), schemaprisize.toInt(), dumptype, (outputxmldata?.value ?: 0L), (outputxmlsize?.value ?: 0L))

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFile((indexfilename?.value ?: 0L), (schemaprifile?.value ?: 0L), dumptype, (outputxmlfile?.value ?: 0L))

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFileInMemory((indexfilename?.value ?: 0L), (schemaprifile?.value ?: 0L), dumptype, (outputxmldata?.value ?: 0L), (outputxmlsize?.value ?: 0L))

public actual fun mrmFreeMemory(data: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmFreeMemory((data?.value ?: 0L))

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: COpaquePointer?): Hresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_mrmGetPriFileContentChecksum((prifile?.value ?: 0L), (checksum?.value ?: 0L))

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
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjects(ncount.toInt(), (phandles?.value ?: 0L), fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()).toUInt()

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: COpaquePointer?, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjectsEx(ncount.toInt(), (phandles?.value ?: 0L), dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()).toUInt()

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_oemToCharA((psrc?.value ?: 0L), (pdst?.value ?: 0L))

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffA((lpszsrc?.value ?: 0L), (lpszdst?.value ?: 0L), cchdstlength.toInt())

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffW((lpszsrc?.value ?: 0L), (lpszdst?.value ?: 0L), cchdstlength.toInt())

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_oemToCharW((psrc?.value ?: 0L), (pdst?.value ?: 0L))

public actual fun openIcon(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_openIcon((hwnd?.value ?: 0L))

public actual fun peekMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_peekMessageA((lpmsg?.value ?: 0L), (hwnd?.value ?: 0L), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt())

public actual fun peekMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_peekMessageW((lpmsg?.value ?: 0L), (hwnd?.value ?: 0L), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt())

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_physicalToLogicalPoint((hwnd?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_postMessageA((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_postMessageW((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun postQuitMessage(nexitcode: Int) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_postQuitMessage(nexitcode)
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsA((szfilename?.value ?: 0L), niconindex, cxicon, cyicon, (phicon?.value ?: 0L), (piconid?.value ?: 0L), nicons.toInt(), flags.toInt()).toUInt()

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsW((szfilename?.value ?: 0L), niconindex, cxicon, cyicon, (phicon?.value ?: 0L), (piconid?.value ?: 0L), nicons.toInt(), flags.toInt()).toUInt()

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    null

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassA((hwnd?.value ?: 0L), (ptszclassname?.value ?: 0L), cchclassnamemax.toInt()).toUInt()

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassW((hwnd?.value ?: 0L), (ptszclassname?.value ?: 0L), cchclassnamemax.toInt()).toUInt()

public actual fun registerClassA(lpwndclass: COpaquePointer?): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerClassA((lpwndclass?.value ?: 0L)).toUShort()

public actual fun registerClassExA(param0: COpaquePointer?): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerClassExA((param0?.value ?: 0L)).toUShort()

public actual fun registerClassExW(param0: COpaquePointer?): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerClassExW((param0?.value ?: 0L)).toUShort()

public actual fun registerClassW(lpwndclass: COpaquePointer?): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerClassW((lpwndclass?.value ?: 0L)).toUShort()

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationA((hrecipient?.value ?: 0L), (notificationfilter?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationW((hrecipient?.value ?: 0L), (notificationfilter?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerForTooltipDismissNotification((hwnd?.value ?: 0L), tdflags)

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerShellHookWindow((hwnd?.value ?: 0L))

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageA((lpstring?.value ?: 0L)).toUInt()

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageW((lpstring?.value ?: 0L)).toUInt()

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_removeMenu((hmenu?.value ?: 0L), uposition.toInt(), uflags.toInt())

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_removePropA((hwnd?.value ?: 0L), (lpstring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_removePropW((hwnd?.value ?: 0L), (lpstring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun replyMessage(lresult: Lresult): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_replyMessage(lresult)

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: COpaquePointer?, lprcclip: COpaquePointer?, hrgnupdate: Hrgn, lprcupdate: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_scrollDC((hdc?.value ?: 0L), dx, dy, (lprcscroll?.value ?: 0L), (lprcclip?.value ?: 0L), (hrgnupdate?.value ?: 0L), (lprcupdate?.value ?: 0L))

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: COpaquePointer?, lpcliprect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_scrollWindow((hwnd?.value ?: 0L), xamount, yamount, (lprect?.value ?: 0L), (lpcliprect?.value ?: 0L))

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: COpaquePointer?, prcclip: COpaquePointer?, hrgnupdate: Hrgn, prcupdate: COpaquePointer?, flags: ScrollWindowFlags): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_scrollWindowEx((hwnd?.value ?: 0L), dx, dy, (prcscroll?.value ?: 0L), (prcclip?.value ?: 0L), (hrgnupdate?.value ?: 0L), (prcupdate?.value ?: 0L), flags.toInt())

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageA((hdlg?.value ?: 0L), niddlgitem, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageW((hdlg?.value ?: 0L), niddlgitem, msg.toInt(), wparam.toLong(), lparam)

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendMessageA((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackA((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, 0L, dwdata.toLong())

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackW((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, 0L, dwdata.toLong())

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutA((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, fuflags.toInt(), utimeout.toInt(), (lpdwresult?.value ?: 0L))

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutW((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam, fuflags.toInt(), utimeout.toInt(), (lpdwresult?.value ?: 0L))

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendMessageW((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageA((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageW((hwnd?.value ?: 0L), msg.toInt(), wparam.toLong(), lparam)

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setAdditionalForegroundBoostProcesses((toplevelwindow?.value ?: 0L), processhandlecount.toInt(), (processhandlearray?.value ?: 0L))

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setCaretBlinkTime(umseconds.toInt())

public actual fun setCaretPos(x: Int, y: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setCaretPos(x, y)

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setClassLongA((hwnd?.value ?: 0L), nindex, dwnewlong).toUInt()

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrA((hwnd?.value ?: 0L), nindex, dwnewlong).toULong()

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrW((hwnd?.value ?: 0L), nindex, dwnewlong).toULong()

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setClassLongW((hwnd?.value ?: 0L), nindex, dwnewlong).toUInt()

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setClassWord((hwnd?.value ?: 0L), nindex, wnewword.toShort()).toUShort()

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setCoalescableTimer((hwnd?.value ?: 0L), nidevent.toLong(), uelapse.toInt(), 0L, utolerancedelay.toInt()).toULong()

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setCursor((hcursor?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setCursorPos(x: Int, y: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setCursorPos(x, y)

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setDebugErrorLevel(dwlevel.toInt())
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemInt((hdlg?.value ?: 0L), niddlgitem, uvalue.toInt(), bsigned)

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextA((hdlg?.value ?: 0L), niddlgitem, (lpstring?.value ?: 0L))

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextW((hdlg?.value ?: 0L), niddlgitem, (lpstring?.value ?: 0L))

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setForegroundWindow((hwnd?.value ?: 0L))

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setLayeredWindowAttributes((hwnd?.value ?: 0L), crkey.toInt(), balpha.toByte(), dwflags.toInt())

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMenu((hwnd?.value ?: 0L), (hmenu?.value ?: 0L))

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMenuDefaultItem((hmenu?.value ?: 0L), uitem.toInt(), fbypos.toInt())

public actual fun setMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMenuInfo((param0?.value ?: 0L), (param1?.value ?: 0L))

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemBitmaps((hmenu?.value ?: 0L), uposition.toInt(), uflags.toInt(), (hbitmapunchecked?.value ?: 0L), (hbitmapchecked?.value ?: 0L))

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoA((hmenu?.value ?: 0L), item.toInt(), fbypositon, (lpmii?.value ?: 0L))

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoW((hmenu?.value ?: 0L), item.toInt(), fbypositon, (lpmii?.value ?: 0L))

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMessageExtraInfo(lparam)

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setMessageQueue(cmessagesmax)

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setParent((hwndchild?.value ?: 0L), (hwndnewparent?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setPhysicalCursorPos(x, y)

public actual fun setProcessDPIAware(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setProcessDPIAware()

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setProcessDefaultLayout(dwdefaultlayout.toInt())

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setPropA((hwnd?.value ?: 0L), (lpstring?.value ?: 0L), (hdata?.value ?: 0L))

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setPropW((hwnd?.value ?: 0L), (lpstring?.value ?: 0L), (hdata?.value ?: 0L))

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setSystemCursor((hcur?.value ?: 0L), id.toInt())

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setTimer((hwnd?.value ?: 0L), nidevent.toLong(), uelapse.toInt(), 0L).toULong()

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowDisplayAffinity((hwnd?.value ?: 0L), dwaffinity.toInt())

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongA((hwnd?.value ?: 0L), nindex, dwnewlong)

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrA((hwnd?.value ?: 0L), nindex, dwnewlong)

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrW((hwnd?.value ?: 0L), nindex, dwnewlong)

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongW((hwnd?.value ?: 0L), nindex, dwnewlong)

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowPlacement((hwnd?.value ?: 0L), (lpwndpl?.value ?: 0L))

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowPos((hwnd?.value ?: 0L), (hwndinsertafter?.value ?: 0L), x, y, cx, cy, uflags.toInt())

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowTextA((hwnd?.value ?: 0L), (lpstring?.value ?: 0L))

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowTextW((hwnd?.value ?: 0L), (lpstring?.value ?: 0L))

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowWord((hwnd?.value ?: 0L), nindex, wnewword.toShort()).toUShort()

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookA(nfiltertype, 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExA(idhook, 0L, (hmod?.value ?: 0L), dwthreadid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExW(idhook, 0L, (hmod?.value ?: 0L), dwthreadid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookW(nfiltertype, 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun showCaret(hwnd: Hwnd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_showCaret((hwnd?.value ?: 0L))

public actual fun showCursor(bshow: Bool): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_showCursor(bshow)

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_showOwnedPopups((hwnd?.value ?: 0L), fshow)

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_showWindow((hwnd?.value ?: 0L), ncmdshow)

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_showWindowAsync((hwnd?.value ?: 0L), ncmdshow)

public actual fun soundSentry(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_soundSentry()

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_switchToThisWindow((hwnd?.value ?: 0L), funknown)
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoA(uiaction.toInt(), uiparam.toInt(), (pvparam?.value ?: 0L), fwinini.toInt())

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoW(uiaction.toInt(), uiparam.toInt(), (pvparam?.value ?: 0L), fwinini.toInt())

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_tileWindows((hwndparent?.value ?: 0L), whow.toInt(), (lprect?.value ?: 0L), ckids.toInt(), (lpkids?.value ?: 0L)).toUShort()

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenu((hmenu?.value ?: 0L), uflags.toInt(), x, y, nreserved, (hwnd?.value ?: 0L), (prcrect?.value ?: 0L))

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenuEx((hmenu?.value ?: 0L), uflags.toInt(), x, y, (hwnd?.value ?: 0L), (lptpm?.value ?: 0L))

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorA((hwnd?.value ?: 0L), (hacctable?.value ?: 0L), (lpmsg?.value ?: 0L))

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorW((hwnd?.value ?: 0L), (hacctable?.value ?: 0L), (lpmsg?.value ?: 0L))

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_translateMDISysAccel((hwndclient?.value ?: 0L), (lpmsg?.value ?: 0L))

public actual fun translateMessage(lpmsg: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_translateMessage((lpmsg?.value ?: 0L))

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHook(ncode, 0L)

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHookEx((hhk?.value ?: 0L))

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_unregisterClassA((lpclassname?.value ?: 0L), (hinstance?.value ?: 0L))

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_unregisterClassW((lpclassname?.value ?: 0L), (hinstance?.value ?: 0L))

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_unregisterDeviceNotification((handle?.value ?: 0L))

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: COpaquePointer?, psize: COpaquePointer?, hdcsrc: Hdc, pptsrc: COpaquePointer?, crkey: Colorref, pblend: COpaquePointer?, dwflags: UpdateLayeredWindowFlags): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindow((hwnd?.value ?: 0L), (hdcdst?.value ?: 0L), (pptdst?.value ?: 0L), (psize?.value ?: 0L), (hdcsrc?.value ?: 0L), (pptsrc?.value ?: 0L), crkey.toInt(), (pblend?.value ?: 0L), dwflags.toInt())

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: COpaquePointer?): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindowIndirect((hwnd?.value ?: 0L), (pulwinfo?.value ?: 0L))

public actual fun waitMessage(): Bool =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_waitMessage()

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    null

public actual fun windowFromPoint(point: Point): Hwnd =
    null

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_wsprintfA((param0?.value ?: 0L), (param1?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_wsprintfW((param0?.value ?: 0L), (param1?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: COpaquePointer?): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA((param0?.value ?: 0L), (param1?.value ?: 0L), (arglist?.value ?: 0L))

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: COpaquePointer?): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW((param0?.value ?: 0L), (param1?.value ?: 0L), (arglist?.value ?: 0L))
