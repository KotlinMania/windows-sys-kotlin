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

private object WindowsWin32UiWindowsandmessagingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRect(lprect: Long, dwstyle: Int, bmenu: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRectEx(lprect: Long, dwstyle: Int, bmenu: Int, dwexstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AllowSetForegroundWindow(dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AnimateWindow(hwnd: Long, dwtime: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AnyPopup(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AppendMenuA(hmenu: Long, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_AppendMenuW(hmenu: Long, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ArrangeIconicWindows(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_BeginDeferWindowPos(nnumwindows: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_BringWindowToTop(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: Int, excluderect: Long, popupwindowposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterA(lpmsg: Long, ncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterW(lpmsg: Long, ncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CallNextHookEx(hhk: Long, ncode: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcA(lpprevwndfunc: Long, hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcW(lpprevwndfunc: Long, hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CancelShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CascadeWindows(hwndparent: Long, whow: Int, lprect: Long, ckids: Int, lpkids: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuA(hmenu: Long, cmd: Int, lpsznewitem: Long, cmdinsert: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuW(hmenu: Long, cmd: Int, lpsznewitem: Long, cmdinsert: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilter(message: Int, dwflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilterEx(hwnd: Long, message: Int, action: Int, pchangefilterstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharLowerA(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffA(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffW(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharLowerW(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharNextA(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharNextExA(codepage: Short, lpcurrentchar: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharNextW(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharPrevA(lpszstart: Long, lpszcurrent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharPrevExA(codepage: Short, lpstart: Long, lpcurrentchar: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharPrevW(lpszstart: Long, lpszcurrent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharToOemA(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffA(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffW(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharToOemW(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharUpperA(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffA(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffW(lpsz: Long, cchlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CharUpperW(lpsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CheckMenuItem(hmenu: Long, uidcheckitem: Int, ucheck: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CheckMenuRadioItem(hmenu: Long, first: Int, last: Int, check: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ClipCursor(lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CloseWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableA(haccelsrc: Long, lpacceldst: Long, caccelentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableW(haccelsrc: Long, lpacceldst: Long, caccelentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CopyIcon(hicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CopyImage(h: Long, type: Int, cx: Int, cy: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableA(paccel: Long, caccel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableW(paccel: Long, caccel: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateCaret(hwnd: Long, hbitmap: Long, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateCursor(hinst: Long, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamA(hinstance: Long, lptemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamW(hinstance: Long, lptemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamA(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamW(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateIcon(hinstance: Long, nwidth: Int, nheight: Int, cplanes: Byte, cbitspixel: Byte, lpbandbits: Long, lpbxorbits: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResource(presbits: Long, dwressize: Int, ficon: Int, dwver: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResourceEx(presbits: Long, dwressize: Int, ficon: Int, dwver: Int, cxdesired: Int, cydesired: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateIconIndirect(piconinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowA(lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hinstance: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowW(lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hinstance: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateMenu(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreatePopupMenu(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateResourceIndexer(projectroot: Long, extensiondllpath: Long, ppresourceindexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExA(dwexstyle: Int, lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hmenu: Long, hinstance: Long, lpparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExW(dwexstyle: Int, lpclassname: Long, lpwindowname: Long, dwstyle: Int, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Long, hmenu: Long, hinstance: Long, lpparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcA(hdlg: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcW(hdlg: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcA(hwnd: Long, hwndmdiclient: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcW(hwnd: Long, hwndmdiclient: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcA(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcW(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DeferWindowPos(hwinposinfo: Long, hwnd: Long, hwndinsertafter: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DeleteMenu(hmenu: Long, uposition: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DeregisterShellHookWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyAcceleratorTable(haccel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyCaret(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyCursor(hcursor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyIcon(hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyIndexedResults(resourceuri: Long, qualifiercount: Int, qualifiers: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyMenu(hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyResourceIndexer(resourceindexer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DestroyWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamA(hinstance: Long, hdialogtemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamW(hinstance: Long, hdialogtemplate: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamA(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamW(hinstance: Long, lptemplatename: Long, hwndparent: Long, lpdialogfunc: Long, dwinitparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DisableProcessWindowsGhosting()

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageA(lpmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageW(lpmsg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DragObject(hwndparent: Long, hwndfrom: Long, fmt: Int, data: Long, hcur: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DrawIcon(hdc: Long, x: Int, y: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DrawIconEx(hdc: Long, xleft: Int, ytop: Int, hicon: Long, cxwidth: Int, cywidth: Int, istepifanicur: Int, hbrflickerfreedraw: Long, diflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_DrawMenuBar(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnableMenuItem(hmenu: Long, uidenableitem: Int, uenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EndDeferWindowPos(hwinposinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EndDialog(hdlg: Long, nresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EndMenu(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumChildWindows(hwndparent: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumPropsA(hwnd: Long, lpenumfunc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExA(hwnd: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExW(hwnd: Long, lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumPropsW(hwnd: Long, lpenumfunc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumThreadWindows(dwthreadid: Int, lpfn: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_EnumWindows(lpenumfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_FindWindowA(lpclassname: Long, lpwindowname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_FindWindowExA(hwndparent: Long, hwndchildafter: Long, lpszclass: Long, lpszwindow: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_FindWindowExW(hwndparent: Long, hwndchildafter: Long, lpszclass: Long, lpszwindow: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_FindWindowW(lpclassname: Long, lpwindowname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_FlashWindow(hwnd: Long, binvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_FlashWindowEx(pfwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoA(hwnd: Long, iitem: Int, pati: Long, pszitemtext: Long, cchitemtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoW(hwnd: Long, iitem: Int, pati: Long, pszitemtext: Long, cchitemtext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetAncestor(hwnd: Long, gaflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetCaretBlinkTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetCaretPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoA(hinstance: Long, lpclassname: Long, lpwndclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExA(hinstance: Long, lpszclass: Long, lpwcx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExW(hinstance: Long, lpszclass: Long, lpwcx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoW(hinstance: Long, lpclassname: Long, lpwndclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassLongA(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrA(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrW(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassLongW(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassNameA(hwnd: Long, lpclassname: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassNameW(hwnd: Long, lpclassname: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClassWord(hwnd: Long, nindex: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClientRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetClipCursor(lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetCursor(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetCursorInfo(pci: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetCursorPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDesktopWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDialogBaseUnits(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDlgCtrlID(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDlgItem(hdlg: Long, niddlgitem: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemInt(hdlg: Long, niddlgitem: Int, lptranslated: Long, bsigned: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextA(hdlg: Long, niddlgitem: Int, lpstring: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextW(hdlg: Long, niddlgitem: Int, lpstring: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetForegroundWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetGUIThreadInfo(idthread: Int, pgui: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetIconInfo(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExA(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExW(hicon: Long, piconinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetInputState(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetLastActivePopup(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetLayeredWindowAttributes(hwnd: Long, pcrkey: Long, pbalpha: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenu(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuBarInfo(hwnd: Long, idobject: Int, iditem: Int, pmbi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuCheckMarkDimensions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuDefaultItem(hmenu: Long, fbypos: Int, gmdiflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuInfo(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemCount(hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemID(hmenu: Long, npos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoA(hmenu: Long, item: Int, fbyposition: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoW(hmenu: Long, item: Int, fbyposition: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemRect(hwnd: Long, hmenu: Long, uitem: Int, lprcitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuState(hmenu: Long, uid: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringA(hmenu: Long, uiditem: Int, lpstring: Long, cchmax: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringW(hmenu: Long, uiditem: Int, lpstring: Long, cchmax: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMessageA(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMessageExtraInfo(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMessagePos(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMessageTime(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetMessageW(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgGroupItem(hdlg: Long, hctl: Long, bprevious: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgTabItem(hdlg: Long, hctl: Long, bprevious: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetParent(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetPhysicalCursorPos(lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetProcessDefaultLayout(pdwdefaultlayout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetPropA(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetPropW(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetQueueStatus(flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetScrollBarInfo(hwnd: Long, idobject: Int, psbi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetScrollInfo(hwnd: Long, nbar: Int, lpsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetScrollPos(hwnd: Long, nbar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetScrollRange(hwnd: Long, nbar: Int, lpminpos: Long, lpmaxpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetShellWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetSubMenu(hmenu: Long, npos: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetSystemMenu(hwnd: Long, brevert: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetSystemMetrics(nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetTitleBarInfo(hwnd: Long, pti: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetTopWindow(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindow(hwnd: Long, ucmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowDisplayAffinity(hwnd: Long, pdwaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowInfo(hwnd: Long, pwi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongA(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrA(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrW(hwnd: Long, nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongW(hwnd: Long, nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameA(hwnd: Long, pszfilename: Long, cchfilenamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameW(hwnd: Long, pszfilename: Long, cchfilenamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowPlacement(hwnd: Long, lpwndpl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextA(hwnd: Long, lpstring: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthA(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthW(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextW(hwnd: Long, lpstring: Long, nmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowThreadProcessId(hwnd: Long, lpdwprocessid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_GetWindowWord(hwnd: Long, nindex: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_HideCaret(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_HiliteMenuItem(hwnd: Long, hmenu: Long, uidhiliteitem: Int, uhilite: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InSendMessage(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InSendMessageEx(lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IndexFilePath(resourceindexer: Long, filepath: Long, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InheritWindowMonitor(hwnd: Long, hwndinherit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InsertMenuA(hmenu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemA(hmenu: Long, item: Int, fbyposition: Int, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemW(hmenu: Long, item: Int, fbyposition: Int, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InsertMenuW(hmenu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_InternalGetWindowText(hwnd: Long, pstring: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharLowerA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsChild(hwndparent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageA(hdlg: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageW(hdlg: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsGUIThread(bconvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsHungAppWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsIconic(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsMenu(hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsProcessDPIAware(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsWindowArranged(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsWindowUnicode(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsWindowVisible(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsWow64Message(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_IsZoomed(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_KillTimer(hwnd: Long, uidevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsA(hinstance: Long, lptablename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsW(hinstance: Long, lptablename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadCursorA(hinstance: Long, lpcursorname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileA(lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileW(lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadCursorW(hinstance: Long, lpcursorname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadIconA(hinstance: Long, lpiconname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadIconW(hinstance: Long, lpiconname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadImageA(hinst: Long, name: Long, type: Int, cx: Int, cy: Int, fuload: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadImageW(hinst: Long, name: Long, type: Int, cx: Int, cy: Int, fuload: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadMenuA(hinstance: Long, lpmenuname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectA(lpmenutemplate: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectW(lpmenutemplate: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadMenuW(hinstance: Long, lpmenuname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadStringA(hinstance: Long, uid: Int, lpbuffer: Long, cchbuffermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LoadStringW(hinstance: Long, uid: Int, lpbuffer: Long, cchbuffermax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LockSetForegroundWindow(ulockcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LogicalToPhysicalPoint(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectory(presbits: Long, ficon: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectoryEx(presbits: Long, ficon: Int, cxdesired: Int, cydesired: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MapDialogRect(hdlg: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MessageBoxA(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExA(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int, wlanguageid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExW(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int, wlanguageid: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectA(lpmbp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectW(lpmbp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MessageBoxW(hwnd: Long, lptext: Long, lpcaption: Long, utype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuA(hmnu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuW(hmnu: Long, uposition: Int, uflags: Int, uidnewitem: Long, lpnewitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MoveWindow(hwnd: Long, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfig(platformversion: Int, defaultqualifiers: Long, outputxmlfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfigInMemory(platformversion: Int, defaultqualifiers: Long, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexer(packagefamilyname: Long, projectroot: Long, platformversion: Int, defaultqualifiers: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriData(projectroot: Long, platformversion: Int, defaultqualifiers: Long, pridata: Long, prisize: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriFile(projectroot: Long, platformversion: Int, defaultqualifiers: Long, prifile: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Long, platformversion: Int, defaultqualifiers: Long, schemaxmldata: Long, schemaxmlsize: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Long, platformversion: Int, defaultqualifiers: Long, schemafile: Long, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerWithFlags(packagefamilyname: Long, projectroot: Long, platformversion: Int, defaultqualifiers: Long, flags: Int, indexer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: Int, schemapridata: Long, schemaprisize: Int, dumptype: Int, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFile(indexfilename: Long, schemaprifile: Long, dumptype: Int, outputxmlfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFileInMemory(indexfilename: Long, schemaprifile: Long, dumptype: Int, outputxmldata: Long, outputxmlsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmFreeMemory(data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MrmGetPriFileContentChecksum(prifile: Long, checksum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjects(ncount: Int, phandles: Long, fwaitall: Int, dwmilliseconds: Int, dwwakemask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjectsEx(ncount: Int, phandles: Long, dwmilliseconds: Int, dwwakemask: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_OemToCharA(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffA(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffW(lpszsrc: Long, lpszdst: Long, cchdstlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_OemToCharW(psrc: Long, pdst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_OpenIcon(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PeekMessageA(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int, wremovemsg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PeekMessageW(lpmsg: Long, hwnd: Long, wmsgfiltermin: Int, wmsgfiltermax: Int, wremovemsg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PhysicalToLogicalPoint(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PostMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PostMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PostQuitMessage(nexitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageA(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageW(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsA(szfilename: Long, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsW(szfilename: Long, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassA(hwnd: Long, ptszclassname: Long, cchclassnamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassW(hwnd: Long, ptszclassname: Long, cchclassnamemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterClassA(lpwndclass: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExA(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExW(param0: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterClassW(lpwndclass: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationA(hrecipient: Long, notificationfilter: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationW(hrecipient: Long, notificationfilter: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterForTooltipDismissNotification(hwnd: Long, tdflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterShellHookWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageA(lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageW(lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RemoveMenu(hmenu: Long, uposition: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RemovePropA(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_RemovePropW(hwnd: Long, lpstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ReplyMessage(lresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ScrollDC(hdc: Long, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: Long, lprcupdate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ScrollWindow(hwnd: Long, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ScrollWindowEx(hwnd: Long, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: Long, prcupdate: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageA(hdlg: Long, niddlgitem: Int, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageW(hdlg: Long, niddlgitem: Int, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackA(hwnd: Long, msg: Int, wparam: Long, lparam: Long, lpresultcallback: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackW(hwnd: Long, msg: Int, wparam: Long, lparam: Long, lpresultcallback: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutA(hwnd: Long, msg: Int, wparam: Long, lparam: Long, fuflags: Int, utimeout: Int, lpdwresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutW(hwnd: Long, msg: Int, wparam: Long, lparam: Long, fuflags: Int, utimeout: Int, lpdwresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageA(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageW(hwnd: Long, msg: Int, wparam: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetAdditionalForegroundBoostProcesses(toplevelwindow: Long, processhandlecount: Int, processhandlearray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetCaretBlinkTime(umseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetCaretPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetClassLongA(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrA(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrW(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetClassLongW(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetClassWord(hwnd: Long, nindex: Int, wnewword: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetCoalescableTimer(hwnd: Long, nidevent: Long, uelapse: Int, lptimerfunc: Long, utolerancedelay: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetCursor(hcursor: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetCursorPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetDebugErrorLevel(dwlevel: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemInt(hdlg: Long, niddlgitem: Int, uvalue: Int, bsigned: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextA(hdlg: Long, niddlgitem: Int, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextW(hdlg: Long, niddlgitem: Int, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetForegroundWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetLayeredWindowAttributes(hwnd: Long, crkey: Int, balpha: Byte, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMenu(hwnd: Long, hmenu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMenuDefaultItem(hmenu: Long, uitem: Int, fbypos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMenuInfo(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemBitmaps(hmenu: Long, uposition: Int, uflags: Int, hbitmapunchecked: Long, hbitmapchecked: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoA(hmenu: Long, item: Int, fbypositon: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoW(hmenu: Long, item: Int, fbypositon: Int, lpmii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMessageExtraInfo(lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetMessageQueue(cmessagesmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetParent(hwndchild: Long, hwndnewparent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetPhysicalCursorPos(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetProcessDPIAware(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetProcessDefaultLayout(dwdefaultlayout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetPropA(hwnd: Long, lpstring: Long, hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetPropW(hwnd: Long, lpstring: Long, hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetSystemCursor(hcur: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetTimer(hwnd: Long, nidevent: Long, uelapse: Int, lptimerfunc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowDisplayAffinity(hwnd: Long, dwaffinity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongA(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrA(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrW(hwnd: Long, nindex: Int, dwnewlong: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongW(hwnd: Long, nindex: Int, dwnewlong: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowPlacement(hwnd: Long, lpwndpl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowPos(hwnd: Long, hwndinsertafter: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextA(hwnd: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextW(hwnd: Long, lpstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowWord(hwnd: Long, nindex: Int, wnewword: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookA(nfiltertype: Int, pfnfilterproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExA(idhook: Int, lpfn: Long, hmod: Long, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExW(idhook: Int, lpfn: Long, hmod: Long, dwthreadid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookW(nfiltertype: Int, pfnfilterproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ShowCaret(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ShowCursor(bshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ShowOwnedPopups(hwnd: Long, fshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ShowWindow(hwnd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_ShowWindowAsync(hwnd: Long, ncmdshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SoundSentry(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SwitchToThisWindow(hwnd: Long, funknown: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoA(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoW(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TileWindows(hwndparent: Long, whow: Int, lprect: Long, ckids: Int, lpkids: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenu(hmenu: Long, uflags: Int, x: Int, y: Int, nreserved: Int, hwnd: Long, prcrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenuEx(hmenu: Long, uflags: Int, x: Int, y: Int, hwnd: Long, lptpm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorA(hwnd: Long, hacctable: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorW(hwnd: Long, hacctable: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TranslateMDISysAccel(hwndclient: Long, lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_TranslateMessage(lpmsg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHook(ncode: Int, pfnfilterproc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHookEx(hhk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassA(lpclassname: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassW(lpclassname: Long, hinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UnregisterDeviceNotification(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindow(hwnd: Long, hdcdst: Long, pptdst: Long, psize: Long, hdcsrc: Long, pptsrc: Long, crkey: Int, pblend: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindowIndirect(hwnd: Long, pulwinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_WaitMessage(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(param0: Long, param1: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(param0: Long, param1: Long, arglist: Long): Int
}

public actual fun AdjustWindowRect(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRect(lprect, dwstyle.toInt(), bmenu)

public actual fun AdjustWindowRectEx(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRectEx(lprect, dwstyle.toInt(), bmenu, dwexstyle.toInt())

public actual fun AllowSetForegroundWindow(dwprocessid: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AllowSetForegroundWindow(dwprocessid.toInt())

public actual fun AnimateWindow(hwnd: HWND, dwtime: UInt, dwflags: ANIMATE_WINDOW_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AnimateWindow(hwnd, dwtime.toInt(), dwflags.toInt())

public actual fun AnyPopup(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AnyPopup()

public actual fun AppendMenuA(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AppendMenuA(hmenu, uflags.toInt(), uidnewitem.toLong(), lpnewitem)

public actual fun AppendMenuW(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_AppendMenuW(hmenu, uflags.toInt(), uidnewitem.toLong(), lpnewitem)

public actual fun ArrangeIconicWindows(hwnd: HWND): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ArrangeIconicWindows(hwnd).toUInt()

public actual fun BeginDeferWindowPos(nnumwindows: Int): HDWP =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_BeginDeferWindowPos(nnumwindows)

public actual fun BringWindowToTop(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_BringWindowToTop(hwnd)

public actual fun CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: UInt, excluderect: Long, popupwindowposition: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CalculatePopupWindowPosition(anchorpoint, windowsize, flags.toInt(), excluderect, popupwindowposition)

public actual fun CallMsgFilterA(lpmsg: Long, ncode: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterA(lpmsg, ncode)

public actual fun CallMsgFilterW(lpmsg: Long, ncode: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterW(lpmsg, ncode)

public actual fun CallNextHookEx(hhk: HHOOK, ncode: Int, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CallNextHookEx(hhk, ncode, wparam.toLong(), lparam)

public actual fun CallWindowProcA(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcA(lpprevwndfunc.toLong(), hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun CallWindowProcW(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcW(lpprevwndfunc.toLong(), hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun CancelShutdown(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CancelShutdown()

public actual fun CascadeWindows(hwndparent: HWND, whow: CASCADE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CascadeWindows(hwndparent, whow.toInt(), lprect, ckids.toInt(), lpkids).toUShort()

public actual fun ChangeMenuA(hmenu: HMENU, cmd: UInt, lpsznewitem: PCSTR, cmdinsert: UInt, flags: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuA(hmenu, cmd.toInt(), lpsznewitem, cmdinsert.toInt(), flags.toInt())

public actual fun ChangeMenuW(hmenu: HMENU, cmd: UInt, lpsznewitem: PCWSTR, cmdinsert: UInt, flags: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuW(hmenu, cmd.toInt(), lpsznewitem, cmdinsert.toInt(), flags.toInt())

public actual fun ChangeWindowMessageFilter(message: UInt, dwflag: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilter(message.toInt(), dwflag.toInt())

public actual fun ChangeWindowMessageFilterEx(hwnd: HWND, message: UInt, action: WINDOW_MESSAGE_FILTER_ACTION, pchangefilterstruct: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilterEx(hwnd, message.toInt(), action.toInt(), pchangefilterstruct)

public actual fun CharLowerA(lpsz: PSTR): PSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharLowerA(lpsz)

public actual fun CharLowerBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffA(lpsz, cchlength.toInt()).toUInt()

public actual fun CharLowerBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffW(lpsz, cchlength.toInt()).toUInt()

public actual fun CharLowerW(lpsz: PWSTR): PWSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharLowerW(lpsz)

public actual fun CharNextA(lpsz: PCSTR): PSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharNextA(lpsz)

public actual fun CharNextExA(codepage: UShort, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharNextExA(codepage.toShort(), lpcurrentchar, dwflags.toInt())

public actual fun CharNextW(lpsz: PCWSTR): PWSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharNextW(lpsz)

public actual fun CharPrevA(lpszstart: PCSTR, lpszcurrent: PCSTR): PSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharPrevA(lpszstart, lpszcurrent)

public actual fun CharPrevExA(codepage: UShort, lpstart: PCSTR, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharPrevExA(codepage.toShort(), lpstart, lpcurrentchar, dwflags.toInt())

public actual fun CharPrevW(lpszstart: PCWSTR, lpszcurrent: PCWSTR): PWSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharPrevW(lpszstart, lpszcurrent)

public actual fun CharToOemA(psrc: PCSTR, pdst: PSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharToOemA(psrc, pdst)

public actual fun CharToOemBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffA(lpszsrc, lpszdst, cchdstlength.toInt())

public actual fun CharToOemBuffW(lpszsrc: PCWSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffW(lpszsrc, lpszdst, cchdstlength.toInt())

public actual fun CharToOemW(psrc: PCWSTR, pdst: PSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharToOemW(psrc, pdst)

public actual fun CharUpperA(lpsz: PSTR): PSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharUpperA(lpsz)

public actual fun CharUpperBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffA(lpsz, cchlength.toInt()).toUInt()

public actual fun CharUpperBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffW(lpsz, cchlength.toInt()).toUInt()

public actual fun CharUpperW(lpsz: PWSTR): PWSTR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CharUpperW(lpsz)

public actual fun CheckMenuItem(hmenu: HMENU, uidcheckitem: UInt, ucheck: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CheckMenuItem(hmenu, uidcheckitem.toInt(), ucheck.toInt()).toUInt()

public actual fun CheckMenuRadioItem(hmenu: HMENU, first: UInt, last: UInt, check: UInt, flags: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CheckMenuRadioItem(hmenu, first.toInt(), last.toInt(), check.toInt(), flags.toInt())

public actual fun ChildWindowFromPoint(hwndparent: HWND, point: POINT): HWND =
    0L

public actual fun ChildWindowFromPointEx(hwnd: HWND, pt: POINT, flags: CWP_FLAGS): HWND =
    0L

public actual fun ClipCursor(lprect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ClipCursor(lprect)

public actual fun CloseWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CloseWindow(hwnd)

public actual fun CopyAcceleratorTableA(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableA(haccelsrc, lpacceldst, caccelentries)

public actual fun CopyAcceleratorTableW(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableW(haccelsrc, lpacceldst, caccelentries)

public actual fun CopyIcon(hicon: HICON): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CopyIcon(hicon)

public actual fun CopyImage(h: HANDLE, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, flags: IMAGE_FLAGS): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CopyImage(h, type.toInt(), cx, cy, flags.toInt())

public actual fun CreateAcceleratorTableA(paccel: Long, caccel: Int): HACCEL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableA(paccel, caccel)

public actual fun CreateAcceleratorTableW(paccel: Long, caccel: Int): HACCEL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableW(paccel, caccel)

public actual fun CreateCaret(hwnd: HWND, hbitmap: HBITMAP, nwidth: Int, nheight: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateCaret(hwnd, hbitmap, nwidth, nheight)

public actual fun CreateCursor(hinst: HINSTANCE, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateCursor(hinst, xhotspot, yhotspot, nwidth, nheight, pvandplane, pvxorplane)

public actual fun CreateDialogIndirectParamA(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamA(hinstance, lptemplate, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun CreateDialogIndirectParamW(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamW(hinstance, lptemplate, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun CreateDialogParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamA(hinstance, lptemplatename, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun CreateDialogParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamW(hinstance, lptemplatename, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun CreateIcon(hinstance: HINSTANCE, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: Long, lpbxorbits: Long): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateIcon(hinstance, nwidth, nheight, cplanes.toByte(), cbitspixel.toByte(), lpbandbits, lpbxorbits)

public actual fun CreateIconFromResource(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResource(presbits, dwressize.toInt(), ficon, dwver.toInt())

public actual fun CreateIconFromResourceEx(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResourceEx(presbits, dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt())

public actual fun CreateIconIndirect(piconinfo: Long): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateIconIndirect(piconinfo)

public actual fun CreateMDIWindowA(lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowA(lpclassname, lpwindowname, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent, hinstance, lparam)

public actual fun CreateMDIWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowW(lpclassname, lpwindowname, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent, hinstance, lparam)

public actual fun CreateMenu(): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateMenu()

public actual fun CreatePopupMenu(): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreatePopupMenu()

public actual fun CreateResourceIndexer(projectroot: PCWSTR, extensiondllpath: PCWSTR, ppresourceindexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateResourceIndexer(projectroot, extensiondllpath, ppresourceindexer)

public actual fun CreateWindowExA(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExA(dwexstyle.toInt(), lpclassname, lpwindowname, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent, hmenu, hinstance, lpparam)

public actual fun CreateWindowExW(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExW(dwexstyle.toInt(), lpclassname, lpwindowname, dwstyle.toInt(), x, y, nwidth, nheight, hwndparent, hmenu, hinstance, lpparam)

public actual fun DefDlgProcA(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcA(hdlg, msg.toInt(), wparam.toLong(), lparam)

public actual fun DefDlgProcW(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcW(hdlg, msg.toInt(), wparam.toLong(), lparam)

public actual fun DefFrameProcA(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcA(hwnd, hwndmdiclient, umsg.toInt(), wparam.toLong(), lparam)

public actual fun DefFrameProcW(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcW(hwnd, hwndmdiclient, umsg.toInt(), wparam.toLong(), lparam)

public actual fun DefMDIChildProcA(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcA(hwnd, umsg.toInt(), wparam.toLong(), lparam)

public actual fun DefMDIChildProcW(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcW(hwnd, umsg.toInt(), wparam.toLong(), lparam)

public actual fun DefWindowProcA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcA(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun DefWindowProcW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcW(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun DeferWindowPos(hwinposinfo: HDWP, hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): HDWP =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DeferWindowPos(hwinposinfo, hwnd, hwndinsertafter, x, y, cx, cy, uflags.toInt())

public actual fun DeleteMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DeleteMenu(hmenu, uposition.toInt(), uflags.toInt())

public actual fun DeregisterShellHookWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DeregisterShellHookWindow(hwnd)

public actual fun DestroyAcceleratorTable(haccel: HACCEL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyAcceleratorTable(haccel)

public actual fun DestroyCaret(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyCaret()

public actual fun DestroyCursor(hcursor: HCURSOR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyCursor(hcursor)

public actual fun DestroyIcon(hicon: HICON): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyIcon(hicon)

public actual fun DestroyIndexedResults(resourceuri: PCWSTR, qualifiercount: UInt, qualifiers: Long) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyIndexedResults(resourceuri, qualifiercount.toInt(), qualifiers)
}

public actual fun DestroyMenu(hmenu: HMENU): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyMenu(hmenu)

public actual fun DestroyResourceIndexer(resourceindexer: Long) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyResourceIndexer(resourceindexer)
}

public actual fun DestroyWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DestroyWindow(hwnd)

public actual fun DialogBoxIndirectParamA(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamA(hinstance, hdialogtemplate, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun DialogBoxIndirectParamW(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamW(hinstance, hdialogtemplate, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun DialogBoxParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamA(hinstance, lptemplatename, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun DialogBoxParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamW(hinstance, lptemplatename, hwndparent, lpdialogfunc.toLong(), dwinitparam)

public actual fun DisableProcessWindowsGhosting() {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DisableProcessWindowsGhosting()
}

public actual fun DispatchMessageA(lpmsg: Long): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageA(lpmsg)

public actual fun DispatchMessageW(lpmsg: Long): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageW(lpmsg)

public actual fun DragObject(hwndparent: HWND, hwndfrom: HWND, fmt: UInt, data: ULong, hcur: HCURSOR): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DragObject(hwndparent, hwndfrom, fmt.toInt(), data.toLong(), hcur).toUInt()

public actual fun DrawIcon(hdc: HDC, x: Int, y: Int, hicon: HICON): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DrawIcon(hdc, x, y, hicon)

public actual fun DrawIconEx(hdc: HDC, xleft: Int, ytop: Int, hicon: HICON, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: HBRUSH, diflags: DI_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DrawIconEx(hdc, xleft, ytop, hicon, cxwidth, cywidth, istepifanicur.toInt(), hbrflickerfreedraw, diflags.toInt())

public actual fun DrawMenuBar(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_DrawMenuBar(hwnd)

public actual fun EnableMenuItem(hmenu: HMENU, uidenableitem: UInt, uenable: MENU_ITEM_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnableMenuItem(hmenu, uidenableitem.toInt(), uenable.toInt())

public actual fun EndDeferWindowPos(hwinposinfo: HDWP): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EndDeferWindowPos(hwinposinfo)

public actual fun EndDialog(hdlg: HWND, nresult: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EndDialog(hdlg, nresult)

public actual fun EndMenu(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EndMenu()

public actual fun EnumChildWindows(hwndparent: HWND, lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumChildWindows(hwndparent, lpenumfunc.toLong(), lparam)

public actual fun EnumPropsA(hwnd: HWND, lpenumfunc: PROPENUMPROCA): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsA(hwnd, lpenumfunc.toLong())

public actual fun EnumPropsExA(hwnd: HWND, lpenumfunc: PROPENUMPROCEXA, lparam: LPARAM): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExA(hwnd, lpenumfunc.toLong(), lparam)

public actual fun EnumPropsExW(hwnd: HWND, lpenumfunc: PROPENUMPROCEXW, lparam: LPARAM): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExW(hwnd, lpenumfunc.toLong(), lparam)

public actual fun EnumPropsW(hwnd: HWND, lpenumfunc: PROPENUMPROCW): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumPropsW(hwnd, lpenumfunc.toLong())

public actual fun EnumThreadWindows(dwthreadid: UInt, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumThreadWindows(dwthreadid.toInt(), lpfn.toLong(), lparam)

public actual fun EnumWindows(lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_EnumWindows(lpenumfunc.toLong(), lparam)

public actual fun FindWindowA(lpclassname: PCSTR, lpwindowname: PCSTR): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_FindWindowA(lpclassname, lpwindowname)

public actual fun FindWindowExA(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCSTR, lpszwindow: PCSTR): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_FindWindowExA(hwndparent, hwndchildafter, lpszclass, lpszwindow)

public actual fun FindWindowExW(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCWSTR, lpszwindow: PCWSTR): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_FindWindowExW(hwndparent, hwndchildafter, lpszclass, lpszwindow)

public actual fun FindWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_FindWindowW(lpclassname, lpwindowname)

public actual fun FlashWindow(hwnd: HWND, binvert: BOOL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_FlashWindow(hwnd, binvert)

public actual fun FlashWindowEx(pfwi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_FlashWindowEx(pfwi)

public actual fun GetAltTabInfoA(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PSTR, cchitemtext: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoA(hwnd, iitem, pati, pszitemtext, cchitemtext.toInt())

public actual fun GetAltTabInfoW(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PWSTR, cchitemtext: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoW(hwnd, iitem, pati, pszitemtext, cchitemtext.toInt())

public actual fun GetAncestor(hwnd: HWND, gaflags: GET_ANCESTOR_FLAGS): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetAncestor(hwnd, gaflags.toInt())

public actual fun GetCaretBlinkTime(): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetCaretBlinkTime().toUInt()

public actual fun GetCaretPos(lppoint: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetCaretPos(lppoint)

public actual fun GetClassInfoA(hinstance: HINSTANCE, lpclassname: PCSTR, lpwndclass: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoA(hinstance, lpclassname, lpwndclass)

public actual fun GetClassInfoExA(hinstance: HINSTANCE, lpszclass: PCSTR, lpwcx: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExA(hinstance, lpszclass, lpwcx)

public actual fun GetClassInfoExW(hinstance: HINSTANCE, lpszclass: PCWSTR, lpwcx: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExW(hinstance, lpszclass, lpwcx)

public actual fun GetClassInfoW(hinstance: HINSTANCE, lpclassname: PCWSTR, lpwndclass: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoW(hinstance, lpclassname, lpwndclass)

public actual fun GetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongA(hwnd, nindex).toUInt()

public actual fun GetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrA(hwnd, nindex).toULong()

public actual fun GetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrW(hwnd, nindex).toULong()

public actual fun GetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassLongW(hwnd, nindex).toUInt()

public actual fun GetClassNameA(hwnd: HWND, lpclassname: PSTR, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassNameA(hwnd, lpclassname, nmaxcount)

public actual fun GetClassNameW(hwnd: HWND, lpclassname: PWSTR, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassNameW(hwnd, lpclassname, nmaxcount)

public actual fun GetClassWord(hwnd: HWND, nindex: Int): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClassWord(hwnd, nindex).toUShort()

public actual fun GetClientRect(hwnd: HWND, lprect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClientRect(hwnd, lprect)

public actual fun GetClipCursor(lprect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetClipCursor(lprect)

public actual fun GetCursor(): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetCursor()

public actual fun GetCursorInfo(pci: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetCursorInfo(pci)

public actual fun GetCursorPos(lppoint: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetCursorPos(lppoint)

public actual fun GetDesktopWindow(): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDesktopWindow()

public actual fun GetDialogBaseUnits(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDialogBaseUnits()

public actual fun GetDlgCtrlID(hwnd: HWND): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDlgCtrlID(hwnd)

public actual fun GetDlgItem(hdlg: HWND, niddlgitem: Int): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItem(hdlg, niddlgitem)

public actual fun GetDlgItemInt(hdlg: HWND, niddlgitem: Int, lptranslated: Long, bsigned: BOOL): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemInt(hdlg, niddlgitem, lptranslated, bsigned).toUInt()

public actual fun GetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PSTR, cchmax: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextA(hdlg, niddlgitem, lpstring, cchmax).toUInt()

public actual fun GetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PWSTR, cchmax: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextW(hdlg, niddlgitem, lpstring, cchmax).toUInt()

public actual fun GetForegroundWindow(): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetForegroundWindow()

public actual fun GetGUIThreadInfo(idthread: UInt, pgui: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetGUIThreadInfo(idthread.toInt(), pgui)

public actual fun GetIconInfo(hicon: HICON, piconinfo: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfo(hicon, piconinfo)

public actual fun GetIconInfoExA(hicon: HICON, piconinfo: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExA(hicon, piconinfo)

public actual fun GetIconInfoExW(hicon: HICON, piconinfo: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExW(hicon, piconinfo)

public actual fun GetInputState(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetInputState()

public actual fun GetLastActivePopup(hwnd: HWND): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetLastActivePopup(hwnd)

public actual fun GetLayeredWindowAttributes(hwnd: HWND, pcrkey: Long, pbalpha: Long, pdwflags: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetLayeredWindowAttributes(hwnd, pcrkey, pbalpha, pdwflags)

public actual fun GetMenu(hwnd: HWND): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenu(hwnd)

public actual fun GetMenuBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, iditem: Int, pmbi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuBarInfo(hwnd, idobject, iditem, pmbi)

public actual fun GetMenuCheckMarkDimensions(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuCheckMarkDimensions()

public actual fun GetMenuDefaultItem(hmenu: HMENU, fbypos: UInt, gmdiflags: GET_MENU_DEFAULT_ITEM_FLAGS): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuDefaultItem(hmenu, fbypos.toInt(), gmdiflags.toInt()).toUInt()

public actual fun GetMenuInfo(param0: HMENU, param1: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuInfo(param0, param1)

public actual fun GetMenuItemCount(hmenu: HMENU): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemCount(hmenu)

public actual fun GetMenuItemID(hmenu: HMENU, npos: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemID(hmenu, npos).toUInt()

public actual fun GetMenuItemInfoA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoA(hmenu, item.toInt(), fbyposition, lpmii)

public actual fun GetMenuItemInfoW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoW(hmenu, item.toInt(), fbyposition, lpmii)

public actual fun GetMenuItemRect(hwnd: HWND, hmenu: HMENU, uitem: UInt, lprcitem: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemRect(hwnd, hmenu, uitem.toInt(), lprcitem)

public actual fun GetMenuState(hmenu: HMENU, uid: UInt, uflags: MENU_ITEM_FLAGS): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuState(hmenu, uid.toInt(), uflags.toInt()).toUInt()

public actual fun GetMenuStringA(hmenu: HMENU, uiditem: UInt, lpstring: PSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringA(hmenu, uiditem.toInt(), lpstring, cchmax, flags.toInt())

public actual fun GetMenuStringW(hmenu: HMENU, uiditem: UInt, lpstring: PWSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringW(hmenu, uiditem.toInt(), lpstring, cchmax, flags.toInt())

public actual fun GetMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMessageA(lpmsg, hwnd, wmsgfiltermin.toInt(), wmsgfiltermax.toInt())

public actual fun GetMessageExtraInfo(): LPARAM =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMessageExtraInfo()

public actual fun GetMessagePos(): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMessagePos().toUInt()

public actual fun GetMessageTime(): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMessageTime()

public actual fun GetMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetMessageW(lpmsg, hwnd, wmsgfiltermin.toInt(), wmsgfiltermax.toInt())

public actual fun GetNextDlgGroupItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgGroupItem(hdlg, hctl, bprevious)

public actual fun GetNextDlgTabItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgTabItem(hdlg, hctl, bprevious)

public actual fun GetParent(hwnd: HWND): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetParent(hwnd)

public actual fun GetPhysicalCursorPos(lppoint: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetPhysicalCursorPos(lppoint)

public actual fun GetProcessDefaultLayout(pdwdefaultlayout: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetProcessDefaultLayout(pdwdefaultlayout)

public actual fun GetPropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetPropA(hwnd, lpstring)

public actual fun GetPropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetPropW(hwnd, lpstring)

public actual fun GetQueueStatus(flags: QUEUE_STATUS_FLAGS): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetQueueStatus(flags.toInt()).toUInt()

public actual fun GetScrollBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, psbi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetScrollBarInfo(hwnd, idobject, psbi)

public actual fun GetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetScrollInfo(hwnd, nbar, lpsi)

public actual fun GetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetScrollPos(hwnd, nbar)

public actual fun GetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpminpos: Long, lpmaxpos: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetScrollRange(hwnd, nbar, lpminpos, lpmaxpos)

public actual fun GetShellWindow(): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetShellWindow()

public actual fun GetSubMenu(hmenu: HMENU, npos: Int): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetSubMenu(hmenu, npos)

public actual fun GetSystemMenu(hwnd: HWND, brevert: BOOL): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetSystemMenu(hwnd, brevert)

public actual fun GetSystemMetrics(nindex: SYSTEM_METRICS_INDEX): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetSystemMetrics(nindex)

public actual fun GetTitleBarInfo(hwnd: HWND, pti: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetTitleBarInfo(hwnd, pti)

public actual fun GetTopWindow(hwnd: HWND): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetTopWindow(hwnd)

public actual fun GetWindow(hwnd: HWND, ucmd: GET_WINDOW_CMD): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindow(hwnd, ucmd.toInt())

public actual fun GetWindowDisplayAffinity(hwnd: HWND, pdwaffinity: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowDisplayAffinity(hwnd, pdwaffinity)

public actual fun GetWindowInfo(hwnd: HWND, pwi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowInfo(hwnd, pwi)

public actual fun GetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongA(hwnd, nindex)

public actual fun GetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrA(hwnd, nindex)

public actual fun GetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrW(hwnd, nindex)

public actual fun GetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongW(hwnd, nindex)

public actual fun GetWindowModuleFileNameA(hwnd: HWND, pszfilename: PSTR, cchfilenamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameA(hwnd, pszfilename, cchfilenamemax.toInt()).toUInt()

public actual fun GetWindowModuleFileNameW(hwnd: HWND, pszfilename: PWSTR, cchfilenamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameW(hwnd, pszfilename, cchfilenamemax.toInt()).toUInt()

public actual fun GetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowPlacement(hwnd, lpwndpl)

public actual fun GetWindowRect(hwnd: HWND, lprect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowRect(hwnd, lprect)

public actual fun GetWindowTextA(hwnd: HWND, lpstring: PSTR, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextA(hwnd, lpstring, nmaxcount)

public actual fun GetWindowTextLengthA(hwnd: HWND): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthA(hwnd)

public actual fun GetWindowTextLengthW(hwnd: HWND): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthW(hwnd)

public actual fun GetWindowTextW(hwnd: HWND, lpstring: PWSTR, nmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextW(hwnd, lpstring, nmaxcount)

public actual fun GetWindowThreadProcessId(hwnd: HWND, lpdwprocessid: Long): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowThreadProcessId(hwnd, lpdwprocessid).toUInt()

public actual fun GetWindowWord(hwnd: HWND, nindex: Int): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_GetWindowWord(hwnd, nindex).toUShort()

public actual fun HideCaret(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_HideCaret(hwnd)

public actual fun HiliteMenuItem(hwnd: HWND, hmenu: HMENU, uidhiliteitem: UInt, uhilite: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_HiliteMenuItem(hwnd, hmenu, uidhiliteitem.toInt(), uhilite.toInt())

public actual fun InSendMessage(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InSendMessage()

public actual fun InSendMessageEx(lpreserved: Long): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InSendMessageEx(lpreserved).toUInt()

public actual fun IndexFilePath(resourceindexer: Long, filepath: PCWSTR, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IndexFilePath(resourceindexer, filepath, ppresourceuri, pqualifiercount, ppqualifiers)

public actual fun InheritWindowMonitor(hwnd: HWND, hwndinherit: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InheritWindowMonitor(hwnd, hwndinherit)

public actual fun InsertMenuA(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuA(hmenu, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem)

public actual fun InsertMenuItemA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemA(hmenu, item.toInt(), fbyposition, lpmi)

public actual fun InsertMenuItemW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemW(hmenu, item.toInt(), fbyposition, lpmi)

public actual fun InsertMenuW(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InsertMenuW(hmenu, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem)

public actual fun InternalGetWindowText(hwnd: HWND, pstring: PWSTR, cchmaxcount: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_InternalGetWindowText(hwnd, pstring, cchmaxcount)

public actual fun IsCharAlphaA(ch: Byte): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaA(ch)

public actual fun IsCharAlphaNumericA(ch: Byte): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericA(ch)

public actual fun IsCharAlphaNumericW(ch: UShort): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericW(ch.toShort())

public actual fun IsCharAlphaW(ch: UShort): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaW(ch.toShort())

public actual fun IsCharLowerA(ch: Byte): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharLowerA(ch)

public actual fun IsCharUpperA(ch: Byte): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperA(ch)

public actual fun IsCharUpperW(ch: UShort): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperW(ch.toShort())

public actual fun IsChild(hwndparent: HWND, hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsChild(hwndparent, hwnd)

public actual fun IsDialogMessageA(hdlg: HWND, lpmsg: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageA(hdlg, lpmsg)

public actual fun IsDialogMessageW(hdlg: HWND, lpmsg: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageW(hdlg, lpmsg)

public actual fun IsGUIThread(bconvert: BOOL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsGUIThread(bconvert)

public actual fun IsHungAppWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsHungAppWindow(hwnd)

public actual fun IsIconic(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsIconic(hwnd)

public actual fun IsMenu(hmenu: HMENU): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsMenu(hmenu)

public actual fun IsProcessDPIAware(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsProcessDPIAware()

public actual fun IsWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsWindow(hwnd)

public actual fun IsWindowArranged(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsWindowArranged(hwnd)

public actual fun IsWindowUnicode(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsWindowUnicode(hwnd)

public actual fun IsWindowVisible(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsWindowVisible(hwnd)

public actual fun IsWow64Message(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsWow64Message()

public actual fun IsZoomed(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_IsZoomed(hwnd)

public actual fun KillTimer(hwnd: HWND, uidevent: ULong): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_KillTimer(hwnd, uidevent.toLong())

public actual fun LoadAcceleratorsA(hinstance: HINSTANCE, lptablename: PCSTR): HACCEL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsA(hinstance, lptablename)

public actual fun LoadAcceleratorsW(hinstance: HINSTANCE, lptablename: PCWSTR): HACCEL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsW(hinstance, lptablename)

public actual fun LoadCursorA(hinstance: HINSTANCE, lpcursorname: PCSTR): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorA(hinstance, lpcursorname)

public actual fun LoadCursorFromFileA(lpfilename: PCSTR): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileA(lpfilename)

public actual fun LoadCursorFromFileW(lpfilename: PCWSTR): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileW(lpfilename)

public actual fun LoadCursorW(hinstance: HINSTANCE, lpcursorname: PCWSTR): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadCursorW(hinstance, lpcursorname)

public actual fun LoadIconA(hinstance: HINSTANCE, lpiconname: PCSTR): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadIconA(hinstance, lpiconname)

public actual fun LoadIconW(hinstance: HINSTANCE, lpiconname: PCWSTR): HICON =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadIconW(hinstance, lpiconname)

public actual fun LoadImageA(hinst: HINSTANCE, name: PCSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadImageA(hinst, name, type.toInt(), cx, cy, fuload.toInt())

public actual fun LoadImageW(hinst: HINSTANCE, name: PCWSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadImageW(hinst, name, type.toInt(), cx, cy, fuload.toInt())

public actual fun LoadMenuA(hinstance: HINSTANCE, lpmenuname: PCSTR): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuA(hinstance, lpmenuname)

public actual fun LoadMenuIndirectA(lpmenutemplate: Long): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectA(lpmenutemplate)

public actual fun LoadMenuIndirectW(lpmenutemplate: Long): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectW(lpmenutemplate)

public actual fun LoadMenuW(hinstance: HINSTANCE, lpmenuname: PCWSTR): HMENU =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadMenuW(hinstance, lpmenuname)

public actual fun LoadStringA(hinstance: HINSTANCE, uid: UInt, lpbuffer: PSTR, cchbuffermax: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadStringA(hinstance, uid.toInt(), lpbuffer, cchbuffermax)

public actual fun LoadStringW(hinstance: HINSTANCE, uid: UInt, lpbuffer: PWSTR, cchbuffermax: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LoadStringW(hinstance, uid.toInt(), lpbuffer, cchbuffermax)

public actual fun LockSetForegroundWindow(ulockcode: FOREGROUND_WINDOW_LOCK_CODE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LockSetForegroundWindow(ulockcode.toInt())

public actual fun LogicalToPhysicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LogicalToPhysicalPoint(hwnd, lppoint)

public actual fun LookupIconIdFromDirectory(presbits: Long, ficon: BOOL): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectory(presbits, ficon)

public actual fun LookupIconIdFromDirectoryEx(presbits: Long, ficon: BOOL, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectoryEx(presbits, ficon, cxdesired, cydesired, flags.toInt())

public actual fun MapDialogRect(hdlg: HWND, lprect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MapDialogRect(hdlg, lprect)

public actual fun MenuItemFromPoint(hwnd: HWND, hmenu: HMENU, ptscreen: POINT): Int =
    0

public actual fun MessageBoxA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxA(hwnd, lptext, lpcaption, utype.toInt())

public actual fun MessageBoxExA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExA(hwnd, lptext, lpcaption, utype.toInt(), wlanguageid.toShort())

public actual fun MessageBoxExW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExW(hwnd, lptext, lpcaption, utype.toInt(), wlanguageid.toShort())

public actual fun MessageBoxIndirectA(lpmbp: Long): MESSAGEBOX_RESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectA(lpmbp)

public actual fun MessageBoxIndirectW(lpmbp: Long): MESSAGEBOX_RESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectW(lpmbp)

public actual fun MessageBoxW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MessageBoxW(hwnd, lptext, lpcaption, utype.toInt())

public actual fun ModifyMenuA(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuA(hmnu, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem)

public actual fun ModifyMenuW(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuW(hmnu, uposition.toInt(), uflags.toInt(), uidnewitem.toLong(), lpnewitem)

public actual fun MoveWindow(hwnd: HWND, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: BOOL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MoveWindow(hwnd, x, y, nwidth, nheight, brepaint)

public actual fun MrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmlfile: PCWSTR): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfig(platformversion, defaultqualifiers, outputxmlfile)

public actual fun MrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfigInMemory(platformversion, defaultqualifiers, outputxmldata, outputxmlsize)

public actual fun MrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: Long, outputprisize: Long): HRESULT =
    0

public actual fun MrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceIndexer(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, indexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexer(packagefamilyname, projectroot, platformversion, defaultqualifiers, indexer)

public actual fun MrmCreateResourceIndexerFromPreviousPriData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, pridata: Long, prisize: UInt, indexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriData(projectroot, platformversion, defaultqualifiers, pridata, prisize.toInt(), indexer)

public actual fun MrmCreateResourceIndexerFromPreviousPriFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, prifile: PCWSTR, indexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriFile(projectroot, platformversion, defaultqualifiers, prifile, indexer)

public actual fun MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemaxmldata: Long, schemaxmlsize: UInt, indexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaData(projectroot, platformversion, defaultqualifiers, schemaxmldata, schemaxmlsize.toInt(), indexer)

public actual fun MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemafile: PCWSTR, indexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot, platformversion, defaultqualifiers, schemafile, indexer)

public actual fun MrmCreateResourceIndexerWithFlags(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, flags: MrmIndexerFlags, indexer: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerWithFlags(packagefamilyname, projectroot, platformversion, defaultqualifiers, flags, indexer)

public actual fun MrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): HRESULT =
    0

public actual fun MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: UInt, schemapridata: Long, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriDataInMemory(inputpridata, inputprisize.toInt(), schemapridata, schemaprisize.toInt(), dumptype, outputxmldata, outputxmlsize)

public actual fun MrmDumpPriFile(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmlfile: PCWSTR): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFile(indexfilename, schemaprifile, dumptype, outputxmlfile)

public actual fun MrmDumpPriFileInMemory(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFileInMemory(indexfilename, schemaprifile, dumptype, outputxmldata, outputxmlsize)

public actual fun MrmFreeMemory(data: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmFreeMemory(data)

public actual fun MrmGetPriFileContentChecksum(prifile: PCWSTR, checksum: Long): HRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MrmGetPriFileContentChecksum(prifile, checksum)

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
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjects(ncount.toInt(), phandles, fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()).toUInt()

public actual fun MsgWaitForMultipleObjectsEx(ncount: UInt, phandles: Long, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS, dwflags: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS): WAIT_EVENT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjectsEx(ncount.toInt(), phandles, dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()).toUInt()

public actual fun OemToCharA(psrc: PCSTR, pdst: PSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_OemToCharA(psrc, pdst)

public actual fun OemToCharBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffA(lpszsrc, lpszdst, cchdstlength.toInt())

public actual fun OemToCharBuffW(lpszsrc: PCSTR, lpszdst: PWSTR, cchdstlength: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffW(lpszsrc, lpszdst, cchdstlength.toInt())

public actual fun OemToCharW(psrc: PCSTR, pdst: PWSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_OemToCharW(psrc, pdst)

public actual fun OpenIcon(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_OpenIcon(hwnd)

public actual fun PeekMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PeekMessageA(lpmsg, hwnd, wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt())

public actual fun PeekMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PeekMessageW(lpmsg, hwnd, wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt())

public actual fun PhysicalToLogicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PhysicalToLogicalPoint(hwnd, lppoint)

public actual fun PostMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PostMessageA(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun PostMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PostMessageW(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun PostQuitMessage(nexitcode: Int) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PostQuitMessage(nexitcode)
}

public actual fun PostThreadMessageA(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun PostThreadMessageW(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun PrivateExtractIconsA(szfilename: PCSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsA(szfilename, niconindex, cxicon, cyicon, phicon, piconid, nicons.toInt(), flags.toInt()).toUInt()

public actual fun PrivateExtractIconsW(szfilename: PCWSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsW(szfilename, niconindex, cxicon, cyicon, phicon, piconid, nicons.toInt(), flags.toInt()).toUInt()

public actual fun RealChildWindowFromPoint(hwndparent: HWND, ptparentclientcoords: POINT): HWND =
    0L

public actual fun RealGetWindowClassA(hwnd: HWND, ptszclassname: PSTR, cchclassnamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassA(hwnd, ptszclassname, cchclassnamemax.toInt()).toUInt()

public actual fun RealGetWindowClassW(hwnd: HWND, ptszclassname: PWSTR, cchclassnamemax: UInt): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassW(hwnd, ptszclassname, cchclassnamemax.toInt()).toUInt()

public actual fun RegisterClassA(lpwndclass: Long): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassA(lpwndclass).toUShort()

public actual fun RegisterClassExA(param0: Long): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExA(param0).toUShort()

public actual fun RegisterClassExW(param0: Long): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExW(param0).toUShort()

public actual fun RegisterClassW(lpwndclass: Long): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterClassW(lpwndclass).toUShort()

public actual fun RegisterDeviceNotificationA(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationA(hrecipient, notificationfilter, flags.toInt())

public actual fun RegisterDeviceNotificationW(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationW(hrecipient, notificationfilter, flags.toInt())

public actual fun RegisterForTooltipDismissNotification(hwnd: HWND, tdflags: TOOLTIP_DISMISS_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterForTooltipDismissNotification(hwnd, tdflags)

public actual fun RegisterShellHookWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterShellHookWindow(hwnd)

public actual fun RegisterWindowMessageA(lpstring: PCSTR): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageA(lpstring).toUInt()

public actual fun RegisterWindowMessageW(lpstring: PCWSTR): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageW(lpstring).toUInt()

public actual fun RemoveMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RemoveMenu(hmenu, uposition.toInt(), uflags.toInt())

public actual fun RemovePropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RemovePropA(hwnd, lpstring)

public actual fun RemovePropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_RemovePropW(hwnd, lpstring)

public actual fun ReplyMessage(lresult: LRESULT): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ReplyMessage(lresult)

public actual fun ScrollDC(hdc: HDC, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: HRGN, lprcupdate: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ScrollDC(hdc, dx, dy, lprcscroll, lprcclip, hrgnupdate, lprcupdate)

public actual fun ScrollWindow(hwnd: HWND, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ScrollWindow(hwnd, xamount, yamount, lprect, lpcliprect)

public actual fun ScrollWindowEx(hwnd: HWND, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: HRGN, prcupdate: Long, flags: SCROLL_WINDOW_FLAGS): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ScrollWindowEx(hwnd, dx, dy, prcscroll, prcclip, hrgnupdate, prcupdate, flags.toInt())

public actual fun SendDlgItemMessageA(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageA(hdlg, niddlgitem, msg.toInt(), wparam.toLong(), lparam)

public actual fun SendDlgItemMessageW(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageW(hdlg, niddlgitem, msg.toInt(), wparam.toLong(), lparam)

public actual fun SendMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendMessageA(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun SendMessageCallbackA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackA(hwnd, msg.toInt(), wparam.toLong(), lparam, lpresultcallback.toLong(), dwdata.toLong())

public actual fun SendMessageCallbackW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackW(hwnd, msg.toInt(), wparam.toLong(), lparam, lpresultcallback.toLong(), dwdata.toLong())

public actual fun SendMessageTimeoutA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutA(hwnd, msg.toInt(), wparam.toLong(), lparam, fuflags.toInt(), utimeout.toInt(), lpdwresult)

public actual fun SendMessageTimeoutW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutW(hwnd, msg.toInt(), wparam.toLong(), lparam, fuflags.toInt(), utimeout.toInt(), lpdwresult)

public actual fun SendMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendMessageW(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun SendNotifyMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageA(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun SendNotifyMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageW(hwnd, msg.toInt(), wparam.toLong(), lparam)

public actual fun SetAdditionalForegroundBoostProcesses(toplevelwindow: HWND, processhandlecount: UInt, processhandlearray: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetAdditionalForegroundBoostProcesses(toplevelwindow, processhandlecount.toInt(), processhandlearray)

public actual fun SetCaretBlinkTime(umseconds: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetCaretBlinkTime(umseconds.toInt())

public actual fun SetCaretPos(x: Int, y: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetCaretPos(x, y)

public actual fun SetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongA(hwnd, nindex, dwnewlong).toUInt()

public actual fun SetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrA(hwnd, nindex, dwnewlong).toULong()

public actual fun SetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrW(hwnd, nindex, dwnewlong).toULong()

public actual fun SetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetClassLongW(hwnd, nindex, dwnewlong).toUInt()

public actual fun SetClassWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetClassWord(hwnd, nindex, wnewword.toShort()).toUShort()

public actual fun SetCoalescableTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC, utolerancedelay: UInt): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetCoalescableTimer(hwnd, nidevent.toLong(), uelapse.toInt(), lptimerfunc.toLong(), utolerancedelay.toInt()).toULong()

public actual fun SetCursor(hcursor: HCURSOR): HCURSOR =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetCursor(hcursor)

public actual fun SetCursorPos(x: Int, y: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetCursorPos(x, y)

public actual fun SetDebugErrorLevel(dwlevel: UInt) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetDebugErrorLevel(dwlevel.toInt())
}

public actual fun SetDlgItemInt(hdlg: HWND, niddlgitem: Int, uvalue: UInt, bsigned: BOOL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemInt(hdlg, niddlgitem, uvalue.toInt(), bsigned)

public actual fun SetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PCSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextA(hdlg, niddlgitem, lpstring)

public actual fun SetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PCWSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextW(hdlg, niddlgitem, lpstring)

public actual fun SetForegroundWindow(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetForegroundWindow(hwnd)

public actual fun SetLayeredWindowAttributes(hwnd: HWND, crkey: COLORREF, balpha: UByte, dwflags: LAYERED_WINDOW_ATTRIBUTES_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetLayeredWindowAttributes(hwnd, crkey.toInt(), balpha.toByte(), dwflags.toInt())

public actual fun SetMenu(hwnd: HWND, hmenu: HMENU): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMenu(hwnd, hmenu)

public actual fun SetMenuDefaultItem(hmenu: HMENU, uitem: UInt, fbypos: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMenuDefaultItem(hmenu, uitem.toInt(), fbypos.toInt())

public actual fun SetMenuInfo(param0: HMENU, param1: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMenuInfo(param0, param1)

public actual fun SetMenuItemBitmaps(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, hbitmapunchecked: HBITMAP, hbitmapchecked: HBITMAP): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemBitmaps(hmenu, uposition.toInt(), uflags.toInt(), hbitmapunchecked, hbitmapchecked)

public actual fun SetMenuItemInfoA(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoA(hmenu, item.toInt(), fbypositon, lpmii)

public actual fun SetMenuItemInfoW(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoW(hmenu, item.toInt(), fbypositon, lpmii)

public actual fun SetMessageExtraInfo(lparam: LPARAM): LPARAM =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMessageExtraInfo(lparam)

public actual fun SetMessageQueue(cmessagesmax: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetMessageQueue(cmessagesmax)

public actual fun SetParent(hwndchild: HWND, hwndnewparent: HWND): HWND =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetParent(hwndchild, hwndnewparent)

public actual fun SetPhysicalCursorPos(x: Int, y: Int): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetPhysicalCursorPos(x, y)

public actual fun SetProcessDPIAware(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetProcessDPIAware()

public actual fun SetProcessDefaultLayout(dwdefaultlayout: UInt): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetProcessDefaultLayout(dwdefaultlayout.toInt())

public actual fun SetPropA(hwnd: HWND, lpstring: PCSTR, hdata: HANDLE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetPropA(hwnd, lpstring, hdata)

public actual fun SetPropW(hwnd: HWND, lpstring: PCWSTR, hdata: HANDLE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetPropW(hwnd, lpstring, hdata)

public actual fun SetSystemCursor(hcur: HCURSOR, id: SYSTEM_CURSOR_ID): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetSystemCursor(hcur, id.toInt())

public actual fun SetTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC): ULong =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetTimer(hwnd, nidevent.toLong(), uelapse.toInt(), lptimerfunc.toLong()).toULong()

public actual fun SetWindowDisplayAffinity(hwnd: HWND, dwaffinity: WINDOW_DISPLAY_AFFINITY): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowDisplayAffinity(hwnd, dwaffinity.toInt())

public actual fun SetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongA(hwnd, nindex, dwnewlong)

public actual fun SetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrA(hwnd, nindex, dwnewlong)

public actual fun SetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrW(hwnd, nindex, dwnewlong)

public actual fun SetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongW(hwnd, nindex, dwnewlong)

public actual fun SetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowPlacement(hwnd, lpwndpl)

public actual fun SetWindowPos(hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowPos(hwnd, hwndinsertafter, x, y, cx, cy, uflags.toInt())

public actual fun SetWindowTextA(hwnd: HWND, lpstring: PCSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextA(hwnd, lpstring)

public actual fun SetWindowTextW(hwnd: HWND, lpstring: PCWSTR): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextW(hwnd, lpstring)

public actual fun SetWindowWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowWord(hwnd, nindex, wnewword.toShort()).toUShort()

public actual fun SetWindowsHookA(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookA(nfiltertype, pfnfilterproc.toLong())

public actual fun SetWindowsHookExA(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExA(idhook, lpfn.toLong(), hmod, dwthreadid.toInt())

public actual fun SetWindowsHookExW(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExW(idhook, lpfn.toLong(), hmod, dwthreadid.toInt())

public actual fun SetWindowsHookW(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookW(nfiltertype, pfnfilterproc.toLong())

public actual fun ShowCaret(hwnd: HWND): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ShowCaret(hwnd)

public actual fun ShowCursor(bshow: BOOL): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ShowCursor(bshow)

public actual fun ShowOwnedPopups(hwnd: HWND, fshow: BOOL): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ShowOwnedPopups(hwnd, fshow)

public actual fun ShowWindow(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ShowWindow(hwnd, ncmdshow)

public actual fun ShowWindowAsync(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_ShowWindowAsync(hwnd, ncmdshow)

public actual fun SoundSentry(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SoundSentry()

public actual fun SwitchToThisWindow(hwnd: HWND, funknown: BOOL) {
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SwitchToThisWindow(hwnd, funknown)
}

public actual fun SystemParametersInfoA(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoA(uiaction.toInt(), uiparam.toInt(), pvparam, fwinini.toInt())

public actual fun SystemParametersInfoW(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoW(uiaction.toInt(), uiparam.toInt(), pvparam, fwinini.toInt())

public actual fun TileWindows(hwndparent: HWND, whow: TILE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TileWindows(hwndparent, whow.toInt(), lprect, ckids.toInt(), lpkids).toUShort()

public actual fun TrackPopupMenu(hmenu: HMENU, uflags: TRACK_POPUP_MENU_FLAGS, x: Int, y: Int, nreserved: Int, hwnd: HWND, prcrect: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenu(hmenu, uflags.toInt(), x, y, nreserved, hwnd, prcrect)

public actual fun TrackPopupMenuEx(hmenu: HMENU, uflags: UInt, x: Int, y: Int, hwnd: HWND, lptpm: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenuEx(hmenu, uflags.toInt(), x, y, hwnd, lptpm)

public actual fun TranslateAcceleratorA(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorA(hwnd, hacctable, lpmsg)

public actual fun TranslateAcceleratorW(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorW(hwnd, hacctable, lpmsg)

public actual fun TranslateMDISysAccel(hwndclient: HWND, lpmsg: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TranslateMDISysAccel(hwndclient, lpmsg)

public actual fun TranslateMessage(lpmsg: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_TranslateMessage(lpmsg)

public actual fun UnhookWindowsHook(ncode: Int, pfnfilterproc: HOOKPROC): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHook(ncode, pfnfilterproc.toLong())

public actual fun UnhookWindowsHookEx(hhk: HHOOK): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHookEx(hhk)

public actual fun UnregisterClassA(lpclassname: PCSTR, hinstance: HINSTANCE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassA(lpclassname, hinstance)

public actual fun UnregisterClassW(lpclassname: PCWSTR, hinstance: HINSTANCE): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassW(lpclassname, hinstance)

public actual fun UnregisterDeviceNotification(handle: HDEVNOTIFY): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UnregisterDeviceNotification(handle)

public actual fun UpdateLayeredWindow(hwnd: HWND, hdcdst: HDC, pptdst: Long, psize: Long, hdcsrc: HDC, pptsrc: Long, crkey: COLORREF, pblend: Long, dwflags: UPDATE_LAYERED_WINDOW_FLAGS): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindow(hwnd, hdcdst, pptdst, psize, hdcsrc, pptsrc, crkey.toInt(), pblend, dwflags.toInt())

public actual fun UpdateLayeredWindowIndirect(hwnd: HWND, pulwinfo: Long): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindowIndirect(hwnd, pulwinfo)

public actual fun WaitMessage(): BOOL =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_WaitMessage()

public actual fun WindowFromPhysicalPoint(point: POINT): HWND =
    0L

public actual fun WindowFromPoint(point: POINT): HWND =
    0L

public actual fun wsprintfA(param0: PSTR, param1: PCSTR): Int =
    0

public actual fun wsprintfW(param0: PWSTR, param1: PCWSTR): Int =
    0

public actual fun wvsprintfA(param0: PSTR, param1: PCSTR, arglist: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(param0, param1, arglist)

public actual fun wvsprintfW(param0: PWSTR, param1: PCWSTR, arglist: Long): Int =
    WindowsWin32UiWindowsandmessagingJniBridge.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(param0, param1, arglist)
