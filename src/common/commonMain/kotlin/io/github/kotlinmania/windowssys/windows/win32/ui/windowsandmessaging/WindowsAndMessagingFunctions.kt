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

public expect fun AdjustWindowRect(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL): BOOL

public expect fun AdjustWindowRectEx(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE): BOOL

public expect fun AllowSetForegroundWindow(dwprocessid: UInt): BOOL

public expect fun AnimateWindow(hwnd: HWND, dwtime: UInt, dwflags: ANIMATE_WINDOW_FLAGS): BOOL

public expect fun AnyPopup(): BOOL

public expect fun AppendMenuA(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL

public expect fun AppendMenuW(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL

public expect fun ArrangeIconicWindows(hwnd: HWND): UInt

public expect fun BeginDeferWindowPos(nnumwindows: Int): HDWP

public expect fun BringWindowToTop(hwnd: HWND): BOOL

public expect fun CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: UInt, excluderect: Long, popupwindowposition: Long): BOOL

public expect fun CallMsgFilterA(lpmsg: Long, ncode: Int): BOOL

public expect fun CallMsgFilterW(lpmsg: Long, ncode: Int): BOOL

public expect fun CallNextHookEx(hhk: HHOOK, ncode: Int, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun CallWindowProcA(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun CallWindowProcW(lpprevwndfunc: WNDPROC, hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun CancelShutdown(): BOOL

public expect fun CascadeWindows(hwndparent: HWND, whow: CASCADE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort

public expect fun ChangeMenuA(hmenu: HMENU, cmd: UInt, lpsznewitem: PCSTR, cmdinsert: UInt, flags: UInt): BOOL

public expect fun ChangeMenuW(hmenu: HMENU, cmd: UInt, lpsznewitem: PCWSTR, cmdinsert: UInt, flags: UInt): BOOL

public expect fun ChangeWindowMessageFilter(message: UInt, dwflag: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS): BOOL

public expect fun ChangeWindowMessageFilterEx(hwnd: HWND, message: UInt, action: WINDOW_MESSAGE_FILTER_ACTION, pchangefilterstruct: Long): BOOL

public expect fun CharLowerA(lpsz: PSTR): PSTR

public expect fun CharLowerBuffA(lpsz: PSTR, cchlength: UInt): UInt

public expect fun CharLowerBuffW(lpsz: PWSTR, cchlength: UInt): UInt

public expect fun CharLowerW(lpsz: PWSTR): PWSTR

public expect fun CharNextA(lpsz: PCSTR): PSTR

public expect fun CharNextExA(codepage: UShort, lpcurrentchar: PCSTR, dwflags: UInt): PSTR

public expect fun CharNextW(lpsz: PCWSTR): PWSTR

public expect fun CharPrevA(lpszstart: PCSTR, lpszcurrent: PCSTR): PSTR

public expect fun CharPrevExA(codepage: UShort, lpstart: PCSTR, lpcurrentchar: PCSTR, dwflags: UInt): PSTR

public expect fun CharPrevW(lpszstart: PCWSTR, lpszcurrent: PCWSTR): PWSTR

public expect fun CharToOemA(psrc: PCSTR, pdst: PSTR): BOOL

public expect fun CharToOemBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL

public expect fun CharToOemBuffW(lpszsrc: PCWSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL

public expect fun CharToOemW(psrc: PCWSTR, pdst: PSTR): BOOL

public expect fun CharUpperA(lpsz: PSTR): PSTR

public expect fun CharUpperBuffA(lpsz: PSTR, cchlength: UInt): UInt

public expect fun CharUpperBuffW(lpsz: PWSTR, cchlength: UInt): UInt

public expect fun CharUpperW(lpsz: PWSTR): PWSTR

public expect fun CheckMenuItem(hmenu: HMENU, uidcheckitem: UInt, ucheck: UInt): UInt

public expect fun CheckMenuRadioItem(hmenu: HMENU, first: UInt, last: UInt, check: UInt, flags: UInt): BOOL

public expect fun ChildWindowFromPoint(hwndparent: HWND, point: POINT): HWND

public expect fun ChildWindowFromPointEx(hwnd: HWND, pt: POINT, flags: CWP_FLAGS): HWND

public expect fun ClipCursor(lprect: Long): BOOL

public expect fun CloseWindow(hwnd: HWND): BOOL

public expect fun CopyAcceleratorTableA(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int

public expect fun CopyAcceleratorTableW(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int

public expect fun CopyIcon(hicon: HICON): HICON

public expect fun CopyImage(h: HANDLE, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, flags: IMAGE_FLAGS): HANDLE

public expect fun CreateAcceleratorTableA(paccel: Long, caccel: Int): HACCEL

public expect fun CreateAcceleratorTableW(paccel: Long, caccel: Int): HACCEL

public expect fun CreateCaret(hwnd: HWND, hbitmap: HBITMAP, nwidth: Int, nheight: Int): BOOL

public expect fun CreateCursor(hinst: HINSTANCE, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): HCURSOR

public expect fun CreateDialogIndirectParamA(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND

public expect fun CreateDialogIndirectParamW(hinstance: HINSTANCE, lptemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND

public expect fun CreateDialogParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND

public expect fun CreateDialogParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): HWND

public expect fun CreateIcon(hinstance: HINSTANCE, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: Long, lpbxorbits: Long): HICON

public expect fun CreateIconFromResource(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt): HICON

public expect fun CreateIconFromResourceEx(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): HICON

public expect fun CreateIconIndirect(piconinfo: Long): HICON

public expect fun CreateMDIWindowA(lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND

public expect fun CreateMDIWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hinstance: HINSTANCE, lparam: LPARAM): HWND

public expect fun CreateMenu(): HMENU

public expect fun CreatePopupMenu(): HMENU

public expect fun CreateResourceIndexer(projectroot: PCWSTR, extensiondllpath: PCWSTR, ppresourceindexer: Long): HRESULT

public expect fun CreateWindowExA(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND

public expect fun CreateWindowExW(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: HWND, hmenu: HMENU, hinstance: HINSTANCE, lpparam: Long): HWND

public expect fun DefDlgProcA(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefDlgProcW(hdlg: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefFrameProcA(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefFrameProcW(hwnd: HWND, hwndmdiclient: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefMDIChildProcA(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefMDIChildProcW(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefWindowProcA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DefWindowProcW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DeferWindowPos(hwinposinfo: HDWP, hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): HDWP

public expect fun DeleteMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL

public expect fun DeregisterShellHookWindow(hwnd: HWND): BOOL

public expect fun DestroyAcceleratorTable(haccel: HACCEL): BOOL

public expect fun DestroyCaret(): BOOL

public expect fun DestroyCursor(hcursor: HCURSOR): BOOL

public expect fun DestroyIcon(hicon: HICON): BOOL

public expect fun DestroyIndexedResults(resourceuri: PCWSTR, qualifiercount: UInt, qualifiers: Long)

public expect fun DestroyMenu(hmenu: HMENU): BOOL

public expect fun DestroyResourceIndexer(resourceindexer: Long)

public expect fun DestroyWindow(hwnd: HWND): BOOL

public expect fun DialogBoxIndirectParamA(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long

public expect fun DialogBoxIndirectParamW(hinstance: HINSTANCE, hdialogtemplate: Long, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long

public expect fun DialogBoxParamA(hinstance: HINSTANCE, lptemplatename: PCSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long

public expect fun DialogBoxParamW(hinstance: HINSTANCE, lptemplatename: PCWSTR, hwndparent: HWND, lpdialogfunc: DLGPROC, dwinitparam: LPARAM): Long

public expect fun DisableProcessWindowsGhosting()

public expect fun DispatchMessageA(lpmsg: Long): LRESULT

public expect fun DispatchMessageW(lpmsg: Long): LRESULT

public expect fun DragObject(hwndparent: HWND, hwndfrom: HWND, fmt: UInt, data: ULong, hcur: HCURSOR): UInt

public expect fun DrawIcon(hdc: HDC, x: Int, y: Int, hicon: HICON): BOOL

public expect fun DrawIconEx(hdc: HDC, xleft: Int, ytop: Int, hicon: HICON, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: HBRUSH, diflags: DI_FLAGS): BOOL

public expect fun DrawMenuBar(hwnd: HWND): BOOL

public expect fun EnableMenuItem(hmenu: HMENU, uidenableitem: UInt, uenable: MENU_ITEM_FLAGS): BOOL

public expect fun EndDeferWindowPos(hwinposinfo: HDWP): BOOL

public expect fun EndDialog(hdlg: HWND, nresult: Long): BOOL

public expect fun EndMenu(): BOOL

public expect fun EnumChildWindows(hwndparent: HWND, lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL

public expect fun EnumPropsA(hwnd: HWND, lpenumfunc: PROPENUMPROCA): Int

public expect fun EnumPropsExA(hwnd: HWND, lpenumfunc: PROPENUMPROCEXA, lparam: LPARAM): Int

public expect fun EnumPropsExW(hwnd: HWND, lpenumfunc: PROPENUMPROCEXW, lparam: LPARAM): Int

public expect fun EnumPropsW(hwnd: HWND, lpenumfunc: PROPENUMPROCW): Int

public expect fun EnumThreadWindows(dwthreadid: UInt, lpfn: WNDENUMPROC, lparam: LPARAM): BOOL

public expect fun EnumWindows(lpenumfunc: WNDENUMPROC, lparam: LPARAM): BOOL

public expect fun FindWindowA(lpclassname: PCSTR, lpwindowname: PCSTR): HWND

public expect fun FindWindowExA(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCSTR, lpszwindow: PCSTR): HWND

public expect fun FindWindowExW(hwndparent: HWND, hwndchildafter: HWND, lpszclass: PCWSTR, lpszwindow: PCWSTR): HWND

public expect fun FindWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR): HWND

public expect fun FlashWindow(hwnd: HWND, binvert: BOOL): BOOL

public expect fun FlashWindowEx(pfwi: Long): BOOL

public expect fun GetAltTabInfoA(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PSTR, cchitemtext: UInt): BOOL

public expect fun GetAltTabInfoW(hwnd: HWND, iitem: Int, pati: Long, pszitemtext: PWSTR, cchitemtext: UInt): BOOL

public expect fun GetAncestor(hwnd: HWND, gaflags: GET_ANCESTOR_FLAGS): HWND

public expect fun GetCaretBlinkTime(): UInt

public expect fun GetCaretPos(lppoint: Long): BOOL

public expect fun GetClassInfoA(hinstance: HINSTANCE, lpclassname: PCSTR, lpwndclass: Long): BOOL

public expect fun GetClassInfoExA(hinstance: HINSTANCE, lpszclass: PCSTR, lpwcx: Long): BOOL

public expect fun GetClassInfoExW(hinstance: HINSTANCE, lpszclass: PCWSTR, lpwcx: Long): BOOL

public expect fun GetClassInfoW(hinstance: HINSTANCE, lpclassname: PCWSTR, lpwndclass: Long): BOOL

public expect fun GetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt

public expect fun GetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong

public expect fun GetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): ULong

public expect fun GetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX): UInt

public expect fun GetClassNameA(hwnd: HWND, lpclassname: PSTR, nmaxcount: Int): Int

public expect fun GetClassNameW(hwnd: HWND, lpclassname: PWSTR, nmaxcount: Int): Int

public expect fun GetClassWord(hwnd: HWND, nindex: Int): UShort

public expect fun GetClientRect(hwnd: HWND, lprect: Long): BOOL

public expect fun GetClipCursor(lprect: Long): BOOL

public expect fun GetCursor(): HCURSOR

public expect fun GetCursorInfo(pci: Long): BOOL

public expect fun GetCursorPos(lppoint: Long): BOOL

public expect fun GetDesktopWindow(): HWND

public expect fun GetDialogBaseUnits(): Int

public expect fun GetDlgCtrlID(hwnd: HWND): Int

public expect fun GetDlgItem(hdlg: HWND, niddlgitem: Int): HWND

public expect fun GetDlgItemInt(hdlg: HWND, niddlgitem: Int, lptranslated: Long, bsigned: BOOL): UInt

public expect fun GetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PSTR, cchmax: Int): UInt

public expect fun GetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PWSTR, cchmax: Int): UInt

public expect fun GetForegroundWindow(): HWND

public expect fun GetGUIThreadInfo(idthread: UInt, pgui: Long): BOOL

public expect fun GetIconInfo(hicon: HICON, piconinfo: Long): BOOL

public expect fun GetIconInfoExA(hicon: HICON, piconinfo: Long): BOOL

public expect fun GetIconInfoExW(hicon: HICON, piconinfo: Long): BOOL

public expect fun GetInputState(): BOOL

public expect fun GetLastActivePopup(hwnd: HWND): HWND

public expect fun GetLayeredWindowAttributes(hwnd: HWND, pcrkey: Long, pbalpha: Long, pdwflags: Long): BOOL

public expect fun GetMenu(hwnd: HWND): HMENU

public expect fun GetMenuBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, iditem: Int, pmbi: Long): BOOL

public expect fun GetMenuCheckMarkDimensions(): Int

public expect fun GetMenuDefaultItem(hmenu: HMENU, fbypos: UInt, gmdiflags: GET_MENU_DEFAULT_ITEM_FLAGS): UInt

public expect fun GetMenuInfo(param0: HMENU, param1: Long): BOOL

public expect fun GetMenuItemCount(hmenu: HMENU): Int

public expect fun GetMenuItemID(hmenu: HMENU, npos: Int): UInt

public expect fun GetMenuItemInfoA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL

public expect fun GetMenuItemInfoW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL

public expect fun GetMenuItemRect(hwnd: HWND, hmenu: HMENU, uitem: UInt, lprcitem: Long): BOOL

public expect fun GetMenuState(hmenu: HMENU, uid: UInt, uflags: MENU_ITEM_FLAGS): UInt

public expect fun GetMenuStringA(hmenu: HMENU, uiditem: UInt, lpstring: PSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int

public expect fun GetMenuStringW(hmenu: HMENU, uiditem: UInt, lpstring: PWSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int

public expect fun GetMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL

public expect fun GetMessageExtraInfo(): LPARAM

public expect fun GetMessagePos(): UInt

public expect fun GetMessageTime(): Int

public expect fun GetMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL

public expect fun GetNextDlgGroupItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND

public expect fun GetNextDlgTabItem(hdlg: HWND, hctl: HWND, bprevious: BOOL): HWND

public expect fun GetParent(hwnd: HWND): HWND

public expect fun GetPhysicalCursorPos(lppoint: Long): BOOL

public expect fun GetProcessDefaultLayout(pdwdefaultlayout: Long): BOOL

public expect fun GetPropA(hwnd: HWND, lpstring: PCSTR): HANDLE

public expect fun GetPropW(hwnd: HWND, lpstring: PCWSTR): HANDLE

public expect fun GetQueueStatus(flags: QUEUE_STATUS_FLAGS): UInt

public expect fun GetScrollBarInfo(hwnd: HWND, idobject: OBJECT_IDENTIFIER, psbi: Long): BOOL

public expect fun GetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long): BOOL

public expect fun GetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS): Int

public expect fun GetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpminpos: Long, lpmaxpos: Long): BOOL

public expect fun GetShellWindow(): HWND

public expect fun GetSubMenu(hmenu: HMENU, npos: Int): HMENU

public expect fun GetSystemMenu(hwnd: HWND, brevert: BOOL): HMENU

public expect fun GetSystemMetrics(nindex: SYSTEM_METRICS_INDEX): Int

public expect fun GetTitleBarInfo(hwnd: HWND, pti: Long): BOOL

public expect fun GetTopWindow(hwnd: HWND): HWND

public expect fun GetWindow(hwnd: HWND, ucmd: GET_WINDOW_CMD): HWND

public expect fun GetWindowDisplayAffinity(hwnd: HWND, pdwaffinity: Long): BOOL

public expect fun GetWindowInfo(hwnd: HWND, pwi: Long): BOOL

public expect fun GetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int

public expect fun GetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long

public expect fun GetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Long

public expect fun GetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX): Int

public expect fun GetWindowModuleFileNameA(hwnd: HWND, pszfilename: PSTR, cchfilenamemax: UInt): UInt

public expect fun GetWindowModuleFileNameW(hwnd: HWND, pszfilename: PWSTR, cchfilenamemax: UInt): UInt

public expect fun GetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL

public expect fun GetWindowRect(hwnd: HWND, lprect: Long): BOOL

public expect fun GetWindowTextA(hwnd: HWND, lpstring: PSTR, nmaxcount: Int): Int

public expect fun GetWindowTextLengthA(hwnd: HWND): Int

public expect fun GetWindowTextLengthW(hwnd: HWND): Int

public expect fun GetWindowTextW(hwnd: HWND, lpstring: PWSTR, nmaxcount: Int): Int

public expect fun GetWindowThreadProcessId(hwnd: HWND, lpdwprocessid: Long): UInt

public expect fun GetWindowWord(hwnd: HWND, nindex: Int): UShort

public expect fun HideCaret(hwnd: HWND): BOOL

public expect fun HiliteMenuItem(hwnd: HWND, hmenu: HMENU, uidhiliteitem: UInt, uhilite: UInt): BOOL

public expect fun InSendMessage(): BOOL

public expect fun InSendMessageEx(lpreserved: Long): UInt

public expect fun IndexFilePath(resourceindexer: Long, filepath: PCWSTR, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): HRESULT

public expect fun InheritWindowMonitor(hwnd: HWND, hwndinherit: HWND): BOOL

public expect fun InsertMenuA(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL

public expect fun InsertMenuItemA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL

public expect fun InsertMenuItemW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL

public expect fun InsertMenuW(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL

public expect fun InternalGetWindowText(hwnd: HWND, pstring: PWSTR, cchmaxcount: Int): Int

public expect fun IsCharAlphaA(ch: Byte): BOOL

public expect fun IsCharAlphaNumericA(ch: Byte): BOOL

public expect fun IsCharAlphaNumericW(ch: UShort): BOOL

public expect fun IsCharAlphaW(ch: UShort): BOOL

public expect fun IsCharLowerA(ch: Byte): BOOL

public expect fun IsCharUpperA(ch: Byte): BOOL

public expect fun IsCharUpperW(ch: UShort): BOOL

public expect fun IsChild(hwndparent: HWND, hwnd: HWND): BOOL

public expect fun IsDialogMessageA(hdlg: HWND, lpmsg: Long): BOOL

public expect fun IsDialogMessageW(hdlg: HWND, lpmsg: Long): BOOL

public expect fun IsGUIThread(bconvert: BOOL): BOOL

public expect fun IsHungAppWindow(hwnd: HWND): BOOL

public expect fun IsIconic(hwnd: HWND): BOOL

public expect fun IsMenu(hmenu: HMENU): BOOL

public expect fun IsProcessDPIAware(): BOOL

public expect fun IsWindow(hwnd: HWND): BOOL

public expect fun IsWindowArranged(hwnd: HWND): BOOL

public expect fun IsWindowUnicode(hwnd: HWND): BOOL

public expect fun IsWindowVisible(hwnd: HWND): BOOL

public expect fun IsWow64Message(): BOOL

public expect fun IsZoomed(hwnd: HWND): BOOL

public expect fun KillTimer(hwnd: HWND, uidevent: ULong): BOOL

public expect fun LoadAcceleratorsA(hinstance: HINSTANCE, lptablename: PCSTR): HACCEL

public expect fun LoadAcceleratorsW(hinstance: HINSTANCE, lptablename: PCWSTR): HACCEL

public expect fun LoadCursorA(hinstance: HINSTANCE, lpcursorname: PCSTR): HCURSOR

public expect fun LoadCursorFromFileA(lpfilename: PCSTR): HCURSOR

public expect fun LoadCursorFromFileW(lpfilename: PCWSTR): HCURSOR

public expect fun LoadCursorW(hinstance: HINSTANCE, lpcursorname: PCWSTR): HCURSOR

public expect fun LoadIconA(hinstance: HINSTANCE, lpiconname: PCSTR): HICON

public expect fun LoadIconW(hinstance: HINSTANCE, lpiconname: PCWSTR): HICON

public expect fun LoadImageA(hinst: HINSTANCE, name: PCSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE

public expect fun LoadImageW(hinst: HINSTANCE, name: PCWSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): HANDLE

public expect fun LoadMenuA(hinstance: HINSTANCE, lpmenuname: PCSTR): HMENU

public expect fun LoadMenuIndirectA(lpmenutemplate: Long): HMENU

public expect fun LoadMenuIndirectW(lpmenutemplate: Long): HMENU

public expect fun LoadMenuW(hinstance: HINSTANCE, lpmenuname: PCWSTR): HMENU

public expect fun LoadStringA(hinstance: HINSTANCE, uid: UInt, lpbuffer: PSTR, cchbuffermax: Int): Int

public expect fun LoadStringW(hinstance: HINSTANCE, uid: UInt, lpbuffer: PWSTR, cchbuffermax: Int): Int

public expect fun LockSetForegroundWindow(ulockcode: FOREGROUND_WINDOW_LOCK_CODE): BOOL

public expect fun LogicalToPhysicalPoint(hwnd: HWND, lppoint: Long): BOOL

public expect fun LookupIconIdFromDirectory(presbits: Long, ficon: BOOL): Int

public expect fun LookupIconIdFromDirectoryEx(presbits: Long, ficon: BOOL, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): Int

public expect fun MapDialogRect(hdlg: HWND, lprect: Long): BOOL

public expect fun MenuItemFromPoint(hwnd: HWND, hmenu: HMENU, ptscreen: POINT): Int

public expect fun MessageBoxA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT

public expect fun MessageBoxExA(hwnd: HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT

public expect fun MessageBoxExW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT

public expect fun MessageBoxIndirectA(lpmbp: Long): MESSAGEBOX_RESULT

public expect fun MessageBoxIndirectW(lpmbp: Long): MESSAGEBOX_RESULT

public expect fun MessageBoxW(hwnd: HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT

public expect fun ModifyMenuA(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL

public expect fun ModifyMenuW(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL

public expect fun MoveWindow(hwnd: HWND, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: BOOL): BOOL

public expect fun MrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmlfile: PCWSTR): HRESULT

public expect fun MrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmldata: Long, outputxmlsize: Long): HRESULT

public expect fun MrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: PCWSTR): HRESULT

public expect fun MrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: Long, outputprisize: Long): HRESULT

public expect fun MrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: PCWSTR): HRESULT

public expect fun MrmCreateResourceIndexer(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, indexer: Long): HRESULT

public expect fun MrmCreateResourceIndexerFromPreviousPriData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, pridata: Long, prisize: UInt, indexer: Long): HRESULT

public expect fun MrmCreateResourceIndexerFromPreviousPriFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, prifile: PCWSTR, indexer: Long): HRESULT

public expect fun MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemaxmldata: Long, schemaxmlsize: UInt, indexer: Long): HRESULT

public expect fun MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemafile: PCWSTR, indexer: Long): HRESULT

public expect fun MrmCreateResourceIndexerWithFlags(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, flags: MrmIndexerFlags, indexer: Long): HRESULT

public expect fun MrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): HRESULT

public expect fun MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: UInt, schemapridata: Long, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT

public expect fun MrmDumpPriFile(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmlfile: PCWSTR): HRESULT

public expect fun MrmDumpPriFileInMemory(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT

public expect fun MrmFreeMemory(data: Long): HRESULT

public expect fun MrmGetPriFileContentChecksum(prifile: PCWSTR, checksum: Long): HRESULT

public expect fun MrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, embeddeddata: Long, embeddeddatasize: UInt, qualifiers: PCWSTR): HRESULT

public expect fun MrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, filepath: PCWSTR, qualifiers: PCWSTR): HRESULT

public expect fun MrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: PCWSTR): HRESULT

public expect fun MrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: PCWSTR): HRESULT

public expect fun MrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, resourcestring: PCWSTR, qualifiers: PCWSTR): HRESULT

public expect fun MrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: Long, nummsgs: Long): HRESULT

public expect fun MsgWaitForMultipleObjects(ncount: UInt, phandles: Long, fwaitall: BOOL, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS): WAIT_EVENT

public expect fun MsgWaitForMultipleObjectsEx(ncount: UInt, phandles: Long, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS, dwflags: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS): WAIT_EVENT

public expect fun OemToCharA(psrc: PCSTR, pdst: PSTR): BOOL

public expect fun OemToCharBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL

public expect fun OemToCharBuffW(lpszsrc: PCSTR, lpszdst: PWSTR, cchdstlength: UInt): BOOL

public expect fun OemToCharW(psrc: PCSTR, pdst: PWSTR): BOOL

public expect fun OpenIcon(hwnd: HWND): BOOL

public expect fun PeekMessageA(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL

public expect fun PeekMessageW(lpmsg: Long, hwnd: HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL

public expect fun PhysicalToLogicalPoint(hwnd: HWND, lppoint: Long): BOOL

public expect fun PostMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL

public expect fun PostMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL

public expect fun PostQuitMessage(nexitcode: Int)

public expect fun PostThreadMessageA(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL

public expect fun PostThreadMessageW(idthread: UInt, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL

public expect fun PrivateExtractIconsA(szfilename: PCSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt

public expect fun PrivateExtractIconsW(szfilename: PCWSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt

public expect fun RealChildWindowFromPoint(hwndparent: HWND, ptparentclientcoords: POINT): HWND

public expect fun RealGetWindowClassA(hwnd: HWND, ptszclassname: PSTR, cchclassnamemax: UInt): UInt

public expect fun RealGetWindowClassW(hwnd: HWND, ptszclassname: PWSTR, cchclassnamemax: UInt): UInt

public expect fun RegisterClassA(lpwndclass: Long): UShort

public expect fun RegisterClassExA(param0: Long): UShort

public expect fun RegisterClassExW(param0: Long): UShort

public expect fun RegisterClassW(lpwndclass: Long): UShort

public expect fun RegisterDeviceNotificationA(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY

public expect fun RegisterDeviceNotificationW(hrecipient: HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY

public expect fun RegisterForTooltipDismissNotification(hwnd: HWND, tdflags: TOOLTIP_DISMISS_FLAGS): BOOL

public expect fun RegisterShellHookWindow(hwnd: HWND): BOOL

public expect fun RegisterWindowMessageA(lpstring: PCSTR): UInt

public expect fun RegisterWindowMessageW(lpstring: PCWSTR): UInt

public expect fun RemoveMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL

public expect fun RemovePropA(hwnd: HWND, lpstring: PCSTR): HANDLE

public expect fun RemovePropW(hwnd: HWND, lpstring: PCWSTR): HANDLE

public expect fun ReplyMessage(lresult: LRESULT): BOOL

public expect fun ScrollDC(hdc: HDC, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: HRGN, lprcupdate: Long): BOOL

public expect fun ScrollWindow(hwnd: HWND, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): BOOL

public expect fun ScrollWindowEx(hwnd: HWND, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: HRGN, prcupdate: Long, flags: SCROLL_WINDOW_FLAGS): Int

public expect fun SendDlgItemMessageA(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun SendDlgItemMessageW(hdlg: HWND, niddlgitem: Int, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun SendMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun SendMessageCallbackA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL

public expect fun SendMessageCallbackW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL

public expect fun SendMessageTimeoutA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT

public expect fun SendMessageTimeoutW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): LRESULT

public expect fun SendMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun SendNotifyMessageA(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL

public expect fun SendNotifyMessageW(hwnd: HWND, msg: UInt, wparam: WPARAM, lparam: LPARAM): BOOL

public expect fun SetAdditionalForegroundBoostProcesses(toplevelwindow: HWND, processhandlecount: UInt, processhandlearray: Long): BOOL

public expect fun SetCaretBlinkTime(umseconds: UInt): BOOL

public expect fun SetCaretPos(x: Int, y: Int): BOOL

public expect fun SetClassLongA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt

public expect fun SetClassLongPtrA(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong

public expect fun SetClassLongPtrW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong

public expect fun SetClassLongW(hwnd: HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt

public expect fun SetClassWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort

public expect fun SetCoalescableTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC, utolerancedelay: UInt): ULong

public expect fun SetCursor(hcursor: HCURSOR): HCURSOR

public expect fun SetCursorPos(x: Int, y: Int): BOOL

public expect fun SetDebugErrorLevel(dwlevel: UInt)

public expect fun SetDlgItemInt(hdlg: HWND, niddlgitem: Int, uvalue: UInt, bsigned: BOOL): BOOL

public expect fun SetDlgItemTextA(hdlg: HWND, niddlgitem: Int, lpstring: PCSTR): BOOL

public expect fun SetDlgItemTextW(hdlg: HWND, niddlgitem: Int, lpstring: PCWSTR): BOOL

public expect fun SetForegroundWindow(hwnd: HWND): BOOL

public expect fun SetLayeredWindowAttributes(hwnd: HWND, crkey: COLORREF, balpha: UByte, dwflags: LAYERED_WINDOW_ATTRIBUTES_FLAGS): BOOL

public expect fun SetMenu(hwnd: HWND, hmenu: HMENU): BOOL

public expect fun SetMenuDefaultItem(hmenu: HMENU, uitem: UInt, fbypos: UInt): BOOL

public expect fun SetMenuInfo(param0: HMENU, param1: Long): BOOL

public expect fun SetMenuItemBitmaps(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, hbitmapunchecked: HBITMAP, hbitmapchecked: HBITMAP): BOOL

public expect fun SetMenuItemInfoA(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL

public expect fun SetMenuItemInfoW(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL

public expect fun SetMessageExtraInfo(lparam: LPARAM): LPARAM

public expect fun SetMessageQueue(cmessagesmax: Int): BOOL

public expect fun SetParent(hwndchild: HWND, hwndnewparent: HWND): HWND

public expect fun SetPhysicalCursorPos(x: Int, y: Int): BOOL

public expect fun SetProcessDPIAware(): BOOL

public expect fun SetProcessDefaultLayout(dwdefaultlayout: UInt): BOOL

public expect fun SetPropA(hwnd: HWND, lpstring: PCSTR, hdata: HANDLE): BOOL

public expect fun SetPropW(hwnd: HWND, lpstring: PCWSTR, hdata: HANDLE): BOOL

public expect fun SetSystemCursor(hcur: HCURSOR, id: SYSTEM_CURSOR_ID): BOOL

public expect fun SetTimer(hwnd: HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC): ULong

public expect fun SetWindowDisplayAffinity(hwnd: HWND, dwaffinity: WINDOW_DISPLAY_AFFINITY): BOOL

public expect fun SetWindowLongA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int

public expect fun SetWindowLongPtrA(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long

public expect fun SetWindowLongPtrW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long

public expect fun SetWindowLongW(hwnd: HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int

public expect fun SetWindowPlacement(hwnd: HWND, lpwndpl: Long): BOOL

public expect fun SetWindowPos(hwnd: HWND, hwndinsertafter: HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): BOOL

public expect fun SetWindowTextA(hwnd: HWND, lpstring: PCSTR): BOOL

public expect fun SetWindowTextW(hwnd: HWND, lpstring: PCWSTR): BOOL

public expect fun SetWindowWord(hwnd: HWND, nindex: Int, wnewword: UShort): UShort

public expect fun SetWindowsHookA(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK

public expect fun SetWindowsHookExA(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK

public expect fun SetWindowsHookExW(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: HINSTANCE, dwthreadid: UInt): HHOOK

public expect fun SetWindowsHookW(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK

public expect fun ShowCaret(hwnd: HWND): BOOL

public expect fun ShowCursor(bshow: BOOL): Int

public expect fun ShowOwnedPopups(hwnd: HWND, fshow: BOOL): BOOL

public expect fun ShowWindow(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL

public expect fun ShowWindowAsync(hwnd: HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL

public expect fun SoundSentry(): BOOL

public expect fun SwitchToThisWindow(hwnd: HWND, funknown: BOOL)

public expect fun SystemParametersInfoA(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL

public expect fun SystemParametersInfoW(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL

public expect fun TileWindows(hwndparent: HWND, whow: TILE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort

public expect fun TrackPopupMenu(hmenu: HMENU, uflags: TRACK_POPUP_MENU_FLAGS, x: Int, y: Int, nreserved: Int, hwnd: HWND, prcrect: Long): BOOL

public expect fun TrackPopupMenuEx(hmenu: HMENU, uflags: UInt, x: Int, y: Int, hwnd: HWND, lptpm: Long): BOOL

public expect fun TranslateAcceleratorA(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int

public expect fun TranslateAcceleratorW(hwnd: HWND, hacctable: HACCEL, lpmsg: Long): Int

public expect fun TranslateMDISysAccel(hwndclient: HWND, lpmsg: Long): BOOL

public expect fun TranslateMessage(lpmsg: Long): BOOL

public expect fun UnhookWindowsHook(ncode: Int, pfnfilterproc: HOOKPROC): BOOL

public expect fun UnhookWindowsHookEx(hhk: HHOOK): BOOL

public expect fun UnregisterClassA(lpclassname: PCSTR, hinstance: HINSTANCE): BOOL

public expect fun UnregisterClassW(lpclassname: PCWSTR, hinstance: HINSTANCE): BOOL

public expect fun UnregisterDeviceNotification(handle: HDEVNOTIFY): BOOL

public expect fun UpdateLayeredWindow(hwnd: HWND, hdcdst: HDC, pptdst: Long, psize: Long, hdcsrc: HDC, pptsrc: Long, crkey: COLORREF, pblend: Long, dwflags: UPDATE_LAYERED_WINDOW_FLAGS): BOOL

public expect fun UpdateLayeredWindowIndirect(hwnd: HWND, pulwinfo: Long): BOOL

public expect fun WaitMessage(): BOOL

public expect fun WindowFromPhysicalPoint(point: POINT): HWND

public expect fun WindowFromPoint(point: POINT): HWND

public expect fun wsprintfA(param0: PSTR, param1: PCSTR, vararg variadicArgs: Long): Int

public expect fun wsprintfW(param0: PWSTR, param1: PCWSTR, vararg variadicArgs: Long): Int

public expect fun wvsprintfA(param0: PSTR, param1: PCSTR, arglist: Long): Int

public expect fun wvsprintfW(param0: PWSTR, param1: PCWSTR, arglist: Long): Int
