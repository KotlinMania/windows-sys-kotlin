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

public actual fun AdjustWindowRect(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL): BOOL =
    0

public actual fun AdjustWindowRectEx(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE): BOOL =
    0

public actual fun AllowSetForegroundWindow(dwprocessid: UInt): BOOL =
    0

public actual fun AnimateWindow(hwnd: HWND, dwtime: UInt, dwflags: ANIMATE_WINDOW_FLAGS): BOOL =
    0

public actual fun AnyPopup(): BOOL =
    0

public actual fun AppendMenuA(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    0

public actual fun AppendMenuW(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    0

public actual fun ArrangeIconicWindows(hwnd: HWND): UInt =
    0u

public actual fun BeginDeferWindowPos(nnumwindows: Int): HDWP =
    0L

public actual fun BringWindowToTop(hwnd: HWND): BOOL =
    0

public actual fun CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: UInt, excluderect: Long, popupwindowposition: Long): BOOL =
    0

public actual fun CallMsgFilterA(lpmsg: Long, ncode: Int): BOOL =
    0

public actual fun CallMsgFilterW(lpmsg: Long, ncode: Int): BOOL =
    0

public actual fun CallNextHookEx(hhk: HHOOK, ncode: Int, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun CallWindowProcA(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun CallWindowProcW(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun CancelShutdown(): BOOL =
    0

public actual fun CascadeWindows(hwndparent: HWND, whow: CASCADE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    0u

public actual fun ChangeMenuA(hmenu: HMENU, cmd: UInt, lpsznewitem: PCSTR, cmdinsert: UInt, flags: UInt): BOOL =
    0

public actual fun ChangeMenuW(hmenu: HMENU, cmd: UInt, lpsznewitem: PCWSTR, cmdinsert: UInt, flags: UInt): BOOL =
    0

public actual fun ChangeWindowMessageFilter(message: UInt, dwflag: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS): BOOL =
    0

public actual fun ChangeWindowMessageFilterEx(hwnd: HWND, message: UInt, action: WINDOW_MESSAGE_FILTER_ACTION, pchangefilterstruct: Long): BOOL =
    0

public actual fun CharLowerA(lpsz: PSTR): PSTR =
    0L

public actual fun CharLowerBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    0u

public actual fun CharLowerBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    0u

public actual fun CharLowerW(lpsz: PWSTR): PWSTR =
    0L

public actual fun CharNextA(lpsz: PCSTR): PSTR =
    0L

public actual fun CharNextExA(codepage: UShort, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    0L

public actual fun CharNextW(lpsz: PCWSTR): PWSTR =
    0L

public actual fun CharPrevA(lpszstart: PCSTR, lpszcurrent: PCSTR): PSTR =
    0L

public actual fun CharPrevExA(codepage: UShort, lpstart: PCSTR, lpcurrentchar: PCSTR, dwflags: UInt): PSTR =
    0L

public actual fun CharPrevW(lpszstart: PCWSTR, lpszcurrent: PCWSTR): PWSTR =
    0L

public actual fun CharToOemA(psrc: PCSTR, pdst: PSTR): BOOL =
    0

public actual fun CharToOemBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    0

public actual fun CharToOemBuffW(lpszsrc: PCWSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    0

public actual fun CharToOemW(psrc: PCWSTR, pdst: PSTR): BOOL =
    0

public actual fun CharUpperA(lpsz: PSTR): PSTR =
    0L

public actual fun CharUpperBuffA(lpsz: PSTR, cchlength: UInt): UInt =
    0u

public actual fun CharUpperBuffW(lpsz: PWSTR, cchlength: UInt): UInt =
    0u

public actual fun CharUpperW(lpsz: PWSTR): PWSTR =
    0L

public actual fun CheckMenuItem(hmenu: HMENU, uidcheckitem: UInt, ucheck: UInt): UInt =
    0u

public actual fun CheckMenuRadioItem(hmenu: HMENU, first: UInt, last: UInt, check: UInt, flags: UInt): BOOL =
    0

public actual fun ChildWindowFromPoint(hwndparent: HWND, point: POINT): HWND =
    0L

public actual fun ChildWindowFromPointEx(hwnd: HWND, pt: POINT, flags: CWP_FLAGS): HWND =
    0L

public actual fun ClipCursor(lprect: Long): BOOL =
    0

public actual fun CloseWindow(hwnd: HWND): BOOL =
    0

public actual fun CopyAcceleratorTableA(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    0

public actual fun CopyAcceleratorTableW(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int =
    0

public actual fun CopyIcon(hicon: HICON): HICON =
    0L

public actual fun CopyImage(h: HANDLE, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, flags: IMAGE_FLAGS): HANDLE =
    0L

public actual fun CreateAcceleratorTableA(paccel: Long, caccel: Int): HACCEL =
    0L

public actual fun CreateAcceleratorTableW(paccel: Long, caccel: Int): HACCEL =
    0L

public actual fun CreateCaret(hwnd: HWND, hbitmap: HBITMAP, nwidth: Int, nheight: Int): BOOL =
    0

public actual fun CreateCursor(hinst: HINSTANCE, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): HCURSOR =
    0L

public actual fun CreateDialogIndirectParamA(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    0L

public actual fun CreateDialogIndirectParamW(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    0L

public actual fun CreateDialogParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    0L

public actual fun CreateDialogParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND =
    0L

public actual fun CreateIcon(hinstance: HINSTANCE, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: Long, lpbxorbits: Long): HICON =
    0L

public actual fun CreateIconFromResource(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt): HICON =
    0L

public actual fun CreateIconFromResourceEx(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): HICON =
    0L

public actual fun CreateIconIndirect(piconinfo: Long): HICON =
    0L

public actual fun CreateMDIWindowA(lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    0L

public actual fun CreateMDIWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND =
    0L

public actual fun CreateMenu(): HMENU =
    0L

public actual fun CreatePopupMenu(): HMENU =
    0L

public actual fun CreateResourceIndexer(projectroot: PCWSTR, extensiondllpath: PCWSTR, ppresourceindexer: Long): HRESULT =
    0

public actual fun CreateWindowExA(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    0L

public actual fun CreateWindowExW(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND =
    0L

public actual fun DefDlgProcA(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefDlgProcW(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefFrameProcA(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefFrameProcW(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefMDIChildProcA(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefMDIChildProcW(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefWindowProcA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DefWindowProcW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DeferWindowPos(hwinposinfo: HDWP, hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): HDWP =
    0L

public actual fun DeleteMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    0

public actual fun DeregisterShellHookWindow(hwnd: HWND): BOOL =
    0

public actual fun DestroyAcceleratorTable(haccel: HACCEL): BOOL =
    0

public actual fun DestroyCaret(): BOOL =
    0

public actual fun DestroyCursor(hcursor: HCURSOR): BOOL =
    0

public actual fun DestroyIcon(hicon: HICON): BOOL =
    0

public actual fun DestroyIndexedResults(resourceuri: PCWSTR, qualifiercount: UInt, qualifiers: Long) {
}

public actual fun DestroyMenu(hmenu: HMENU): BOOL =
    0

public actual fun DestroyResourceIndexer(resourceindexer: Long) {
}

public actual fun DestroyWindow(hwnd: HWND): BOOL =
    0

public actual fun DialogBoxIndirectParamA(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    0L

public actual fun DialogBoxIndirectParamW(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    0L

public actual fun DialogBoxParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    0L

public actual fun DialogBoxParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long =
    0L

public actual fun DisableProcessWindowsGhosting() {
}

public actual fun DispatchMessageA(lpmsg: Long): LRESULT =
    0L

public actual fun DispatchMessageW(lpmsg: Long): LRESULT =
    0L

public actual fun DragObject(hwndparent: HWND, hwndfrom: HWND, fmt: UInt, data: ULong, hcur: HCURSOR): UInt =
    0u

public actual fun DrawIcon(hdc: HDC, x: Int, y: Int, hicon: HICON): BOOL =
    0

public actual fun DrawIconEx(hdc: HDC, xleft: Int, ytop: Int, hicon: HICON, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: HBRUSH, diflags: DI_FLAGS): BOOL =
    0

public actual fun DrawMenuBar(hwnd: HWND): BOOL =
    0

public actual fun EnableMenuItem(hmenu: HMENU, uidenableitem: UInt, uenable: MENU_ITEM_FLAGS): BOOL =
    0

public actual fun EndDeferWindowPos(hwinposinfo: HDWP): BOOL =
    0

public actual fun EndDialog(hdlg: HWND, nresult: Long): BOOL =
    0

public actual fun EndMenu(): BOOL =
    0

public actual fun EnumChildWindows(hwndparent: HWND, lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun EnumPropsA(hwnd: HWND, lpenumfunc: PROPENUMPROCA): Int =
    0

public actual fun EnumPropsExA(hwnd: HWND, lpenumfunc: PROPENUMPROCEXA, lparam: LPARAM): Int =
    0

public actual fun EnumPropsExW(hwnd: HWND, lpenumfunc: PROPENUMPROCEXW, lparam: LPARAM): Int =
    0

public actual fun EnumPropsW(hwnd: HWND, lpenumfunc: PROPENUMPROCW): Int =
    0

public actual fun EnumThreadWindows(dwthreadid: UInt, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun EnumWindows(lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL =
    0

public actual fun FindWindowA(lpclassname: PCSTR, lpwindowname: PCSTR): HWND =
    0L

public actual fun FindWindowExA(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCSTR, lpszwindow: PCSTR): HWND =
    0L

public actual fun FindWindowExW(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCWSTR, lpszwindow: PCWSTR): HWND =
    0L

public actual fun FindWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR): HWND =
    0L

public actual fun FlashWindow(hwnd: HWND, binvert: BOOL): BOOL =
    0

public actual fun FlashWindowEx(pfwi: Long): BOOL =
    0

public actual fun GetAltTabInfoA(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PSTR, cchitemtext: UInt): BOOL =
    0

public actual fun GetAltTabInfoW(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PWSTR, cchitemtext: UInt): BOOL =
    0

public actual fun GetAncestor(hwnd: HWND, gaflags: GET_ANCESTOR_FLAGS): HWND =
    0L

public actual fun GetCaretBlinkTime(): UInt =
    0u

public actual fun GetCaretPos(lppoint: Long): BOOL =
    0

public actual fun GetClassInfoA(hinstance: HINSTANCE, lpclassname: PCSTR, lpwndclass: Long): BOOL =
    0

public actual fun GetClassInfoExA(hinstance: HINSTANCE, lpszclass: PCSTR, lpwcx: Long): BOOL =
    0

public actual fun GetClassInfoExW(hinstance: HINSTANCE, lpszclass: PCWSTR, lpwcx: Long): BOOL =
    0

public actual fun GetClassInfoW(hinstance: HINSTANCE, lpclassname: PCWSTR, lpwndclass: Long): BOOL =
    0

public actual fun GetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    0u

public actual fun GetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    0uL

public actual fun GetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong =
    0uL

public actual fun GetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt =
    0u

public actual fun GetClassNameA(hwnd: HWND, lpclassname: PSTR, nmaxcount: Int): Int =
    0

public actual fun GetClassNameW(hwnd: HWND, lpclassname: PWSTR, nmaxcount: Int): Int =
    0

public actual fun GetClassWord(hwnd: HWND, nindex: Int): UShort =
    0u

public actual fun GetClientRect(hwnd: HWND, lprect: Long): BOOL =
    0

public actual fun GetClipCursor(lprect: Long): BOOL =
    0

public actual fun GetCursor(): HCURSOR =
    0L

public actual fun GetCursorInfo(pci: Long): BOOL =
    0

public actual fun GetCursorPos(lppoint: Long): BOOL =
    0

public actual fun GetDesktopWindow(): HWND =
    0L

public actual fun GetDialogBaseUnits(): Int =
    0

public actual fun GetDlgCtrlID(hwnd: HWND): Int =
    0

public actual fun GetDlgItem(hdlg: HWND, niddlgitem: Int): HWND =
    0L

public actual fun GetDlgItemInt(hdlg: HWND, niddlgitem: Int, lptranslated: Long, bsigned: BOOL): UInt =
    0u

public actual fun GetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PSTR, cchmax: Int): UInt =
    0u

public actual fun GetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PWSTR, cchmax: Int): UInt =
    0u

public actual fun GetForegroundWindow(): HWND =
    0L

public actual fun GetGUIThreadInfo(idthread: UInt, pgui: Long): BOOL =
    0

public actual fun GetIconInfo(hicon: HICON, piconinfo: Long): BOOL =
    0

public actual fun GetIconInfoExA(hicon: HICON, piconinfo: Long): BOOL =
    0

public actual fun GetIconInfoExW(hicon: HICON, piconinfo: Long): BOOL =
    0

public actual fun GetInputState(): BOOL =
    0

public actual fun GetLastActivePopup(hwnd: HWND): HWND =
    0L

public actual fun GetLayeredWindowAttributes(hwnd: HWND, pcrkey: Long, pbalpha: Long, pdwflags: Long): BOOL =
    0

public actual fun GetMenu(hwnd: HWND): HMENU =
    0L

public actual fun GetMenuBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, iditem: Int, pmbi: Long): BOOL =
    0

public actual fun GetMenuCheckMarkDimensions(): Int =
    0

public actual fun GetMenuDefaultItem(hmenu: HMENU, fbypos: UInt, gmdiflags: GET_MENU_DEFAULT_ITEM_FLAGS): UInt =
    0u

public actual fun GetMenuInfo(param0: HMENU, param1: Long): BOOL =
    0

public actual fun GetMenuItemCount(hmenu: HMENU): Int =
    0

public actual fun GetMenuItemID(hmenu: HMENU, npos: Int): UInt =
    0u

public actual fun GetMenuItemInfoA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    0

public actual fun GetMenuItemInfoW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL =
    0

public actual fun GetMenuItemRect(hwnd: HWND, hmenu: HMENU, uitem: UInt, lprcitem: Long): BOOL =
    0

public actual fun GetMenuState(hmenu: HMENU, uid: UInt, uflags: MENU_ITEM_FLAGS): UInt =
    0u

public actual fun GetMenuStringA(hmenu: HMENU, uiditem: UInt, lpstring: PSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    0

public actual fun GetMenuStringW(hmenu: HMENU, uiditem: UInt, lpstring: PWSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int =
    0

public actual fun GetMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    0

public actual fun GetMessageExtraInfo(): LPARAM =
    0L

public actual fun GetMessagePos(): UInt =
    0u

public actual fun GetMessageTime(): Int =
    0

public actual fun GetMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL =
    0

public actual fun GetNextDlgGroupItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    0L

public actual fun GetNextDlgTabItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND =
    0L

public actual fun GetParent(hwnd: HWND): HWND =
    0L

public actual fun GetPhysicalCursorPos(lppoint: Long): BOOL =
    0

public actual fun GetProcessDefaultLayout(pdwdefaultlayout: Long): BOOL =
    0

public actual fun GetPropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    0L

public actual fun GetPropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    0L

public actual fun GetQueueStatus(flags: QUEUE_STATUS_FLAGS): UInt =
    0u

public actual fun GetScrollBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, psbi: Long): BOOL =
    0

public actual fun GetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long): BOOL =
    0

public actual fun GetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS): Int =
    0

public actual fun GetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpminpos: Long, lpmaxpos: Long): BOOL =
    0

public actual fun GetShellWindow(): HWND =
    0L

public actual fun GetSubMenu(hmenu: HMENU, npos: Int): HMENU =
    0L

public actual fun GetSystemMenu(hwnd: HWND, brevert: BOOL): HMENU =
    0L

public actual fun GetSystemMetrics(nindex: SYSTEM_METRICS_INDEX): Int =
    0

public actual fun GetTitleBarInfo(hwnd: HWND, pti: Long): BOOL =
    0

public actual fun GetTopWindow(hwnd: HWND): HWND =
    0L

public actual fun GetWindow(hwnd: HWND, ucmd: GET_WINDOW_CMD): HWND =
    0L

public actual fun GetWindowDisplayAffinity(hwnd: HWND, pdwaffinity: Long): BOOL =
    0

public actual fun GetWindowInfo(hwnd: HWND, pwi: Long): BOOL =
    0

public actual fun GetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    0

public actual fun GetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    0L

public actual fun GetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long =
    0L

public actual fun GetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int =
    0

public actual fun GetWindowModuleFileNameA(hwnd: HWND, pszfilename: PSTR, cchfilenamemax: UInt): UInt =
    0u

public actual fun GetWindowModuleFileNameW(hwnd: HWND, pszfilename: PWSTR, cchfilenamemax: UInt): UInt =
    0u

public actual fun GetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    0

public actual fun GetWindowRect(hwnd: HWND, lprect: Long): BOOL =
    0

public actual fun GetWindowTextA(hwnd: HWND, lpstring: PSTR, nmaxcount: Int): Int =
    0

public actual fun GetWindowTextLengthA(hwnd: HWND): Int =
    0

public actual fun GetWindowTextLengthW(hwnd: HWND): Int =
    0

public actual fun GetWindowTextW(hwnd: HWND, lpstring: PWSTR, nmaxcount: Int): Int =
    0

public actual fun GetWindowThreadProcessId(hwnd: HWND, lpdwprocessid: Long): UInt =
    0u

public actual fun GetWindowWord(hwnd: HWND, nindex: Int): UShort =
    0u

public actual fun HideCaret(hwnd: HWND): BOOL =
    0

public actual fun HiliteMenuItem(hwnd: HWND, hmenu: HMENU, uidhiliteitem: UInt, uhilite: UInt): BOOL =
    0

public actual fun InSendMessage(): BOOL =
    0

public actual fun InSendMessageEx(lpreserved: Long): UInt =
    0u

public actual fun IndexFilePath(resourceindexer: Long, filepath: PCWSTR, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): HRESULT =
    0

public actual fun InheritWindowMonitor(hwnd: HWND, hwndinherit: HWND): BOOL =
    0

public actual fun InsertMenuA(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    0

public actual fun InsertMenuItemA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    0

public actual fun InsertMenuItemW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL =
    0

public actual fun InsertMenuW(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    0

public actual fun InternalGetWindowText(hwnd: HWND, pstring: PWSTR, cchmaxcount: Int): Int =
    0

public actual fun IsCharAlphaA(ch: Byte): BOOL =
    0

public actual fun IsCharAlphaNumericA(ch: Byte): BOOL =
    0

public actual fun IsCharAlphaNumericW(ch: UShort): BOOL =
    0

public actual fun IsCharAlphaW(ch: UShort): BOOL =
    0

public actual fun IsCharLowerA(ch: Byte): BOOL =
    0

public actual fun IsCharUpperA(ch: Byte): BOOL =
    0

public actual fun IsCharUpperW(ch: UShort): BOOL =
    0

public actual fun IsChild(hwndparent: HWND, hwnd: HWND): BOOL =
    0

public actual fun IsDialogMessageA(hdlg: HWND, lpmsg: Long): BOOL =
    0

public actual fun IsDialogMessageW(hdlg: HWND, lpmsg: Long): BOOL =
    0

public actual fun IsGUIThread(bconvert: BOOL): BOOL =
    0

public actual fun IsHungAppWindow(hwnd: HWND): BOOL =
    0

public actual fun IsIconic(hwnd: HWND): BOOL =
    0

public actual fun IsMenu(hmenu: HMENU): BOOL =
    0

public actual fun IsProcessDPIAware(): BOOL =
    0

public actual fun IsWindow(hwnd: HWND): BOOL =
    0

public actual fun IsWindowArranged(hwnd: HWND): BOOL =
    0

public actual fun IsWindowUnicode(hwnd: HWND): BOOL =
    0

public actual fun IsWindowVisible(hwnd: HWND): BOOL =
    0

public actual fun IsWow64Message(): BOOL =
    0

public actual fun IsZoomed(hwnd: HWND): BOOL =
    0

public actual fun KillTimer(hwnd: HWND, uidevent: ULong): BOOL =
    0

public actual fun LoadAcceleratorsA(hinstance: HINSTANCE, lptablename: PCSTR): HACCEL =
    0L

public actual fun LoadAcceleratorsW(hinstance: HINSTANCE, lptablename: PCWSTR): HACCEL =
    0L

public actual fun LoadCursorA(hinstance: HINSTANCE, lpcursorname: PCSTR): HCURSOR =
    0L

public actual fun LoadCursorFromFileA(lpfilename: PCSTR): HCURSOR =
    0L

public actual fun LoadCursorFromFileW(lpfilename: PCWSTR): HCURSOR =
    0L

public actual fun LoadCursorW(hinstance: HINSTANCE, lpcursorname: PCWSTR): HCURSOR =
    0L

public actual fun LoadIconA(hinstance: HINSTANCE, lpiconname: PCSTR): HICON =
    0L

public actual fun LoadIconW(hinstance: HINSTANCE, lpiconname: PCWSTR): HICON =
    0L

public actual fun LoadImageA(hinst: HINSTANCE, name: PCSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    0L

public actual fun LoadImageW(hinst: HINSTANCE, name: PCWSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE =
    0L

public actual fun LoadMenuA(hinstance: HINSTANCE, lpmenuname: PCSTR): HMENU =
    0L

public actual fun LoadMenuIndirectA(lpmenutemplate: Long): HMENU =
    0L

public actual fun LoadMenuIndirectW(lpmenutemplate: Long): HMENU =
    0L

public actual fun LoadMenuW(hinstance: HINSTANCE, lpmenuname: PCWSTR): HMENU =
    0L

public actual fun LoadStringA(hinstance: HINSTANCE, uid: UInt, lpbuffer: PSTR, cchbuffermax: Int): Int =
    0

public actual fun LoadStringW(hinstance: HINSTANCE, uid: UInt, lpbuffer: PWSTR, cchbuffermax: Int): Int =
    0

public actual fun LockSetForegroundWindow(ulockcode: FOREGROUND_WINDOW_LOCK_CODE): BOOL =
    0

public actual fun LogicalToPhysicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    0

public actual fun LookupIconIdFromDirectory(presbits: Long, ficon: BOOL): Int =
    0

public actual fun LookupIconIdFromDirectoryEx(presbits: Long, ficon: BOOL, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): Int =
    0

public actual fun MapDialogRect(hdlg: HWND, lprect: Long): BOOL =
    0

public actual fun MenuItemFromPoint(hwnd: HWND, hmenu: HMENU, ptscreen: POINT): Int =
    0

public actual fun MessageBoxA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    0

public actual fun MessageBoxExA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    0

public actual fun MessageBoxExW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT =
    0

public actual fun MessageBoxIndirectA(lpmbp: Long): MESSAGEBOX_RESULT =
    0

public actual fun MessageBoxIndirectW(lpmbp: Long): MESSAGEBOX_RESULT =
    0

public actual fun MessageBoxW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT =
    0

public actual fun ModifyMenuA(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL =
    0

public actual fun ModifyMenuW(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL =
    0

public actual fun MoveWindow(hwnd: HWND, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: BOOL): BOOL =
    0

public actual fun MrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmlfile: PCWSTR): HRESULT =
    0

public actual fun MrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    0

public actual fun MrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: Long, outputprisize: Long): HRESULT =
    0

public actual fun MrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: PCWSTR): HRESULT =
    0

public actual fun MrmCreateResourceIndexer(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, indexer: Long): HRESULT =
    0

public actual fun MrmCreateResourceIndexerFromPreviousPriData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, pridata: Long, prisize: UInt, indexer: Long): HRESULT =
    0

public actual fun MrmCreateResourceIndexerFromPreviousPriFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, prifile: PCWSTR, indexer: Long): HRESULT =
    0

public actual fun MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemaxmldata: Long, schemaxmlsize: UInt, indexer: Long): HRESULT =
    0

public actual fun MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemafile: PCWSTR, indexer: Long): HRESULT =
    0

public actual fun MrmCreateResourceIndexerWithFlags(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, flags: MrmIndexerFlags, indexer: Long): HRESULT =
    0

public actual fun MrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): HRESULT =
    0

public actual fun MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: UInt, schemapridata: Long, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    0

public actual fun MrmDumpPriFile(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmlfile: PCWSTR): HRESULT =
    0

public actual fun MrmDumpPriFileInMemory(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT =
    0

public actual fun MrmFreeMemory(data: Long): HRESULT =
    0

public actual fun MrmGetPriFileContentChecksum(prifile: PCWSTR, checksum: Long): HRESULT =
    0

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
    0u

public actual fun MsgWaitForMultipleObjectsEx(ncount: UInt, phandles: Long, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS, dwflags: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS): WAIT_EVENT =
    0u

public actual fun OemToCharA(psrc: PCSTR, pdst: PSTR): BOOL =
    0

public actual fun OemToCharBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL =
    0

public actual fun OemToCharBuffW(lpszsrc: PCSTR, lpszdst: PWSTR, cchdstlength: UInt): BOOL =
    0

public actual fun OemToCharW(psrc: PCSTR, pdst: PWSTR): BOOL =
    0

public actual fun OpenIcon(hwnd: HWND): BOOL =
    0

public actual fun PeekMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    0

public actual fun PeekMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL =
    0

public actual fun PhysicalToLogicalPoint(hwnd: HWND, lppoint: Long): BOOL =
    0

public actual fun PostMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    0

public actual fun PostMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    0

public actual fun PostQuitMessage(nexitcode: Int) {
}

public actual fun PostThreadMessageA(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    0

public actual fun PostThreadMessageW(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    0

public actual fun PrivateExtractIconsA(szfilename: PCSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    0u

public actual fun PrivateExtractIconsW(szfilename: PCWSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt =
    0u

public actual fun RealChildWindowFromPoint(hwndparent: HWND, ptparentclientcoords: POINT): HWND =
    0L

public actual fun RealGetWindowClassA(hwnd: HWND, ptszclassname: PSTR, cchclassnamemax: UInt): UInt =
    0u

public actual fun RealGetWindowClassW(hwnd: HWND, ptszclassname: PWSTR, cchclassnamemax: UInt): UInt =
    0u

public actual fun RegisterClassA(lpwndclass: Long): UShort =
    0u

public actual fun RegisterClassExA(param0: Long): UShort =
    0u

public actual fun RegisterClassExW(param0: Long): UShort =
    0u

public actual fun RegisterClassW(lpwndclass: Long): UShort =
    0u

public actual fun RegisterDeviceNotificationA(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    0L

public actual fun RegisterDeviceNotificationW(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY =
    0L

public actual fun RegisterForTooltipDismissNotification(hwnd: HWND, tdflags: TOOLTIP_DISMISS_FLAGS): BOOL =
    0

public actual fun RegisterShellHookWindow(hwnd: HWND): BOOL =
    0

public actual fun RegisterWindowMessageA(lpstring: PCSTR): UInt =
    0u

public actual fun RegisterWindowMessageW(lpstring: PCWSTR): UInt =
    0u

public actual fun RemoveMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL =
    0

public actual fun RemovePropA(hwnd: HWND, lpstring: PCSTR): HANDLE =
    0L

public actual fun RemovePropW(hwnd: HWND, lpstring: PCWSTR): HANDLE =
    0L

public actual fun ReplyMessage(lresult: LRESULT): BOOL =
    0

public actual fun ScrollDC(hdc: HDC, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: HRGN, lprcupdate: Long): BOOL =
    0

public actual fun ScrollWindow(hwnd: HWND, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): BOOL =
    0

public actual fun ScrollWindowEx(hwnd: HWND, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: HRGN, prcupdate: Long, flags: SCROLL_WINDOW_FLAGS): Int =
    0

public actual fun SendDlgItemMessageA(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun SendDlgItemMessageW(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun SendMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun SendMessageCallbackA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    0

public actual fun SendMessageCallbackW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL =
    0

public actual fun SendMessageTimeoutA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    0L

public actual fun SendMessageTimeoutW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT =
    0L

public actual fun SendMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun SendNotifyMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    0

public actual fun SendNotifyMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL =
    0

public actual fun SetAdditionalForegroundBoostProcesses(toplevelwindow: HWND, processhandlecount: UInt, processhandlearray: Long): BOOL =
    0

public actual fun SetCaretBlinkTime(umseconds: UInt): BOOL =
    0

public actual fun SetCaretPos(x: Int, y: Int): BOOL =
    0

public actual fun SetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    0u

public actual fun SetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    0uL

public actual fun SetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong =
    0uL

public actual fun SetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt =
    0u

public actual fun SetClassWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    0u

public actual fun SetCoalescableTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC, utolerancedelay: UInt): ULong =
    0uL

public actual fun SetCursor(hcursor: HCURSOR): HCURSOR =
    0L

public actual fun SetCursorPos(x: Int, y: Int): BOOL =
    0

public actual fun SetDebugErrorLevel(dwlevel: UInt) {
}

public actual fun SetDlgItemInt(hdlg: HWND, niddlgitem: Int, uvalue: UInt, bsigned: BOOL): BOOL =
    0

public actual fun SetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PCSTR): BOOL =
    0

public actual fun SetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PCWSTR): BOOL =
    0

public actual fun SetForegroundWindow(hwnd: HWND): BOOL =
    0

public actual fun SetLayeredWindowAttributes(hwnd: HWND, crkey: COLORREF, balpha: UByte, dwflags: LAYERED_WINDOW_ATTRIBUTES_FLAGS): BOOL =
    0

public actual fun SetMenu(hwnd: HWND, hmenu: HMENU): BOOL =
    0

public actual fun SetMenuDefaultItem(hmenu: HMENU, uitem: UInt, fbypos: UInt): BOOL =
    0

public actual fun SetMenuInfo(param0: HMENU, param1: Long): BOOL =
    0

public actual fun SetMenuItemBitmaps(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, hbitmapunchecked: HBITMAP, hbitmapchecked: HBITMAP): BOOL =
    0

public actual fun SetMenuItemInfoA(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    0

public actual fun SetMenuItemInfoW(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL =
    0

public actual fun SetMessageExtraInfo(lparam: LPARAM): LPARAM =
    0L

public actual fun SetMessageQueue(cmessagesmax: Int): BOOL =
    0

public actual fun SetParent(hwndchild: HWND, hwndnewparent: HWND): HWND =
    0L

public actual fun SetPhysicalCursorPos(x: Int, y: Int): BOOL =
    0

public actual fun SetProcessDPIAware(): BOOL =
    0

public actual fun SetProcessDefaultLayout(dwdefaultlayout: UInt): BOOL =
    0

public actual fun SetPropA(hwnd: HWND, lpstring: PCSTR, hdata: HANDLE): BOOL =
    0

public actual fun SetPropW(hwnd: HWND, lpstring: PCWSTR, hdata: HANDLE): BOOL =
    0

public actual fun SetSystemCursor(hcur: HCURSOR, id: SYSTEM_CURSOR_ID): BOOL =
    0

public actual fun SetTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC): ULong =
    0uL

public actual fun SetWindowDisplayAffinity(hwnd: HWND, dwaffinity: WINDOW_DISPLAY_AFFINITY): BOOL =
    0

public actual fun SetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    0

public actual fun SetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    0L

public actual fun SetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long =
    0L

public actual fun SetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int =
    0

public actual fun SetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL =
    0

public actual fun SetWindowPos(hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): BOOL =
    0

public actual fun SetWindowTextA(hwnd: HWND, lpstring: PCSTR): BOOL =
    0

public actual fun SetWindowTextW(hwnd: HWND, lpstring: PCWSTR): BOOL =
    0

public actual fun SetWindowWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort =
    0u

public actual fun SetWindowsHookA(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    0L

public actual fun SetWindowsHookExA(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    0L

public actual fun SetWindowsHookExW(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK =
    0L

public actual fun SetWindowsHookW(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK =
    0L

public actual fun ShowCaret(hwnd: HWND): BOOL =
    0

public actual fun ShowCursor(bshow: BOOL): Int =
    0

public actual fun ShowOwnedPopups(hwnd: HWND, fshow: BOOL): BOOL =
    0

public actual fun ShowWindow(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    0

public actual fun ShowWindowAsync(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL =
    0

public actual fun SoundSentry(): BOOL =
    0

public actual fun SwitchToThisWindow(hwnd: HWND, funknown: BOOL) {
}

public actual fun SystemParametersInfoA(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    0

public actual fun SystemParametersInfoW(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL =
    0

public actual fun TileWindows(hwndparent: HWND, whow: TILE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort =
    0u

public actual fun TrackPopupMenu(hmenu: HMENU, uflags: TRACK_POPUP_MENU_FLAGS, x: Int, y: Int, nreserved: Int, hwnd: HWND, prcrect: Long): BOOL =
    0

public actual fun TrackPopupMenuEx(hmenu: HMENU, uflags: UInt, x: Int, y: Int, hwnd: HWND, lptpm: Long): BOOL =
    0

public actual fun TranslateAcceleratorA(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    0

public actual fun TranslateAcceleratorW(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int =
    0

public actual fun TranslateMDISysAccel(hwndclient: HWND, lpmsg: Long): BOOL =
    0

public actual fun TranslateMessage(lpmsg: Long): BOOL =
    0

public actual fun UnhookWindowsHook(ncode: Int, pfnfilterproc: HOOKPROC): BOOL =
    0

public actual fun UnhookWindowsHookEx(hhk: HHOOK): BOOL =
    0

public actual fun UnregisterClassA(lpclassname: PCSTR, hinstance: HINSTANCE): BOOL =
    0

public actual fun UnregisterClassW(lpclassname: PCWSTR, hinstance: HINSTANCE): BOOL =
    0

public actual fun UnregisterDeviceNotification(handle: HDEVNOTIFY): BOOL =
    0

public actual fun UpdateLayeredWindow(hwnd: HWND, hdcdst: HDC, pptdst: Long, psize: Long, hdcsrc: HDC, pptsrc: Long, crkey: COLORREF, pblend: Long, dwflags: UPDATE_LAYERED_WINDOW_FLAGS): BOOL =
    0

public actual fun UpdateLayeredWindowIndirect(hwnd: HWND, pulwinfo: Long): BOOL =
    0

public actual fun WaitMessage(): BOOL =
    0

public actual fun WindowFromPhysicalPoint(point: POINT): HWND =
    0L

public actual fun WindowFromPoint(point: POINT): HWND =
    0L

public actual fun wsprintfA(param0: PSTR, param1: PCSTR): Int =
    0

public actual fun wsprintfW(param0: PWSTR, param1: PCWSTR): Int =
    0

public actual fun wvsprintfA(param0: PSTR, param1: PCSTR, arglist: Long): Int =
    0

public actual fun wvsprintfW(param0: PWSTR, param1: PCWSTR, arglist: Long): Int =
    0
