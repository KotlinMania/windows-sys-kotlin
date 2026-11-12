package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Blendfunction
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public expect fun adjustWindowRect(lprect: MutPtr<Rect>, dwstyle: WindowStyle, bmenu: Bool): Bool

public expect fun adjustWindowRectEx(lprect: MutPtr<Rect>, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool

public expect fun allowSetForegroundWindow(dwprocessid: UInt): Bool

public expect fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool

public expect fun anyPopup(): Bool

public expect fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool

public expect fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool

public expect fun arrangeIconicWindows(hwnd: Hwnd): UInt

public expect fun beginDeferWindowPos(nnumwindows: Int): Hdwp

public expect fun bringWindowToTop(hwnd: Hwnd): Bool

public expect fun calculatePopupWindowPosition(anchorpoint: ConstPtr<Point>, windowsize: ConstPtr<Size>, flags: UInt, excluderect: ConstPtr<Rect>, popupwindowposition: MutPtr<Rect>): Bool

public expect fun callMsgFilterA(lpmsg: ConstPtr<Msg>, ncode: Int): Bool

public expect fun callMsgFilterW(lpmsg: ConstPtr<Msg>, ncode: Int): Bool

public expect fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult

public expect fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun cancelShutdown(): Bool

public expect fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: ConstPtr<Rect>, ckids: UInt, lpkids: ConstPtr<Hwnd>): UShort

public expect fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool

public expect fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool

public expect fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool

public expect fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: MutPtr<Changefilterstruct>): Bool

public expect fun charLowerA(lpsz: Pstr): Pstr

public expect fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt

public expect fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt

public expect fun charLowerW(lpsz: Pwstr): Pwstr

public expect fun charNextA(lpsz: Pcstr): Pstr

public expect fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr

public expect fun charNextW(lpsz: Pcwstr): Pwstr

public expect fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr

public expect fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr

public expect fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr

public expect fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool

public expect fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool

public expect fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool

public expect fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool

public expect fun charUpperA(lpsz: Pstr): Pstr

public expect fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt

public expect fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt

public expect fun charUpperW(lpsz: Pwstr): Pwstr

public expect fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt

public expect fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool

public expect fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd

public expect fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd

public expect fun clipCursor(lprect: ConstPtr<Rect>): Bool

public expect fun closeWindow(hwnd: Hwnd): Bool

public expect fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: MutPtr<Accel>, caccelentries: Int): Int

public expect fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: MutPtr<Accel>, caccelentries: Int): Int

public expect fun copyIcon(hicon: Hicon): Hicon

public expect fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle

public expect fun createAcceleratorTableA(paccel: ConstPtr<Accel>, caccel: Int): Haccel

public expect fun createAcceleratorTableW(paccel: ConstPtr<Accel>, caccel: Int): Haccel

public expect fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool

public expect fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: ConstPtr<CVoid>, pvxorplane: ConstPtr<CVoid>): Hcursor

public expect fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: ConstPtr<Dlgtemplate>, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd

public expect fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: ConstPtr<Dlgtemplate>, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd

public expect fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd

public expect fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd

public expect fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: ConstPtr<UByte>, lpbxorbits: ConstPtr<UByte>): Hicon

public expect fun createIconFromResource(presbits: ConstPtr<UByte>, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon

public expect fun createIconFromResourceEx(presbits: ConstPtr<UByte>, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon

public expect fun createIconIndirect(piconinfo: ConstPtr<Iconinfo>): Hicon

public expect fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd

public expect fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd

public expect fun createMenu(): Hmenu

public expect fun createPopupMenu(): Hmenu

public expect fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr<CVoid>): Hwnd

public expect fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr<CVoid>): Hwnd

public expect fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp

public expect fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool

public expect fun deregisterShellHookWindow(hwnd: Hwnd): Bool

public expect fun destroyAcceleratorTable(haccel: Haccel): Bool

public expect fun destroyCaret(): Bool

public expect fun destroyCursor(hcursor: Hcursor): Bool

public expect fun destroyIcon(hicon: Hicon): Bool

public expect fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: ConstPtr<IndexedResourceQualifier>)

public expect fun destroyMenu(hmenu: Hmenu): Bool

public expect fun destroyResourceIndexer(resourceindexer: ConstPtr<CVoid>)

public expect fun destroyWindow(hwnd: Hwnd): Bool

public expect fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: ConstPtr<Dlgtemplate>, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long

public expect fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: ConstPtr<Dlgtemplate>, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long

public expect fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long

public expect fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long

public expect fun disableProcessWindowsGhosting()

public expect fun dispatchMessageA(lpmsg: ConstPtr<Msg>): Lresult

public expect fun dispatchMessageW(lpmsg: ConstPtr<Msg>): Lresult

public expect fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt

public expect fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool

public expect fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool

public expect fun drawMenuBar(hwnd: Hwnd): Bool

public expect fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool

public expect fun endDeferWindowPos(hwinposinfo: Hdwp): Bool

public expect fun endDialog(hdlg: Hwnd, nresult: Long): Bool

public expect fun endMenu(): Bool

public expect fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool

public expect fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int

public expect fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int

public expect fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int

public expect fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int

public expect fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool

public expect fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool

public expect fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd

public expect fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd

public expect fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd

public expect fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd

public expect fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool

public expect fun flashWindowEx(pfwi: ConstPtr<Flashwinfo>): Bool

public expect fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: MutPtr<Alttabinfo>, pszitemtext: Pstr, cchitemtext: UInt): Bool

public expect fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: MutPtr<Alttabinfo>, pszitemtext: Pwstr, cchitemtext: UInt): Bool

public expect fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd

public expect fun getCaretBlinkTime(): UInt

public expect fun getCaretPos(lppoint: MutPtr<Point>): Bool

public expect fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: MutPtr<Wndclassa>): Bool

public expect fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: MutPtr<Wndclassexa>): Bool

public expect fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: MutPtr<Wndclassexw>): Bool

public expect fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: MutPtr<Wndclassw>): Bool

public expect fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt

public expect fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong

public expect fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong

public expect fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt

public expect fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int

public expect fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int

public expect fun getClassWord(hwnd: Hwnd, nindex: Int): UShort

public expect fun getClientRect(hwnd: Hwnd, lprect: MutPtr<Rect>): Bool

public expect fun getClipCursor(lprect: MutPtr<Rect>): Bool

public expect fun getCursor(): Hcursor

public expect fun getCursorInfo(pci: MutPtr<Cursorinfo>): Bool

public expect fun getCursorPos(lppoint: MutPtr<Point>): Bool

public expect fun getDesktopWindow(): Hwnd

public expect fun getDialogBaseUnits(): Int

public expect fun getDlgCtrlID(hwnd: Hwnd): Int

public expect fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd

public expect fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: MutPtr<Bool>, bsigned: Bool): UInt

public expect fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt

public expect fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt

public expect fun getForegroundWindow(): Hwnd

public expect fun getGUIThreadInfo(idthread: UInt, pgui: MutPtr<Guithreadinfo>): Bool

public expect fun getIconInfo(hicon: Hicon, piconinfo: MutPtr<Iconinfo>): Bool

public expect fun getIconInfoExA(hicon: Hicon, piconinfo: MutPtr<Iconinfoexa>): Bool

public expect fun getIconInfoExW(hicon: Hicon, piconinfo: MutPtr<Iconinfoexw>): Bool

public expect fun getInputState(): Bool

public expect fun getLastActivePopup(hwnd: Hwnd): Hwnd

public expect fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: MutPtr<Colorref>, pbalpha: MutPtr<UByte>, pdwflags: MutPtr<LayeredWindowAttributesFlags>): Bool

public expect fun getMenu(hwnd: Hwnd): Hmenu

public expect fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: MutPtr<Menubarinfo>): Bool

public expect fun getMenuCheckMarkDimensions(): Int

public expect fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt

public expect fun getMenuInfo(param0: Hmenu, param1: MutPtr<Menuinfo>): Bool

public expect fun getMenuItemCount(hmenu: Hmenu): Int

public expect fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt

public expect fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr<Menuiteminfoa>): Bool

public expect fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr<Menuiteminfow>): Bool

public expect fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: MutPtr<Rect>): Bool

public expect fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt

public expect fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int

public expect fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int

public expect fun getMessageA(lpmsg: MutPtr<Msg>, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool

public expect fun getMessageExtraInfo(): Lparam

public expect fun getMessagePos(): UInt

public expect fun getMessageTime(): Int

public expect fun getMessageW(lpmsg: MutPtr<Msg>, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool

public expect fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd

public expect fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd

public expect fun getParent(hwnd: Hwnd): Hwnd

public expect fun getPhysicalCursorPos(lppoint: MutPtr<Point>): Bool

public expect fun getProcessDefaultLayout(pdwdefaultlayout: MutPtr<UInt>): Bool

public expect fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle

public expect fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle

public expect fun getQueueStatus(flags: QueueStatusFlags): UInt

public expect fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: MutPtr<Scrollbarinfo>): Bool

public expect fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: MutPtr<Scrollinfo>): Bool

public expect fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int

public expect fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: MutPtr<Int>, lpmaxpos: MutPtr<Int>): Bool

public expect fun getShellWindow(): Hwnd

public expect fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu

public expect fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu

public expect fun getSystemMetrics(nindex: SystemMetricsIndex): Int

public expect fun getTitleBarInfo(hwnd: Hwnd, pti: MutPtr<Titlebarinfo>): Bool

public expect fun getTopWindow(hwnd: Hwnd): Hwnd

public expect fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd

public expect fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: MutPtr<UInt>): Bool

public expect fun getWindowInfo(hwnd: Hwnd, pwi: MutPtr<Windowinfo>): Bool

public expect fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int

public expect fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long

public expect fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long

public expect fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int

public expect fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt

public expect fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt

public expect fun getWindowPlacement(hwnd: Hwnd, lpwndpl: MutPtr<Windowplacement>): Bool

public expect fun getWindowRect(hwnd: Hwnd, lprect: MutPtr<Rect>): Bool

public expect fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int

public expect fun getWindowTextLengthA(hwnd: Hwnd): Int

public expect fun getWindowTextLengthW(hwnd: Hwnd): Int

public expect fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int

public expect fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: MutPtr<UInt>): UInt

public expect fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort

public expect fun hideCaret(hwnd: Hwnd): Bool

public expect fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool

public expect fun inSendMessage(): Bool

public expect fun inSendMessageEx(lpreserved: ConstPtr<CVoid>): UInt

public expect fun indexFilePath(resourceindexer: ConstPtr<CVoid>, filepath: Pcwstr, ppresourceuri: MutPtr<Pwstr>, pqualifiercount: MutPtr<UInt>, ppqualifiers: MutPtr<MutPtr<IndexedResourceQualifier>>): Hresult

public expect fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool

public expect fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool

public expect fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr<Menuiteminfoa>): Bool

public expect fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr<Menuiteminfow>): Bool

public expect fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool

public expect fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int

public expect fun isCharAlphaA(ch: Byte): Bool

public expect fun isCharAlphaNumericA(ch: Byte): Bool

public expect fun isCharAlphaNumericW(ch: UShort): Bool

public expect fun isCharAlphaW(ch: UShort): Bool

public expect fun isCharLowerA(ch: Byte): Bool

public expect fun isCharUpperA(ch: Byte): Bool

public expect fun isCharUpperW(ch: UShort): Bool

public expect fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool

public expect fun isDialogMessageA(hdlg: Hwnd, lpmsg: ConstPtr<Msg>): Bool

public expect fun isDialogMessageW(hdlg: Hwnd, lpmsg: ConstPtr<Msg>): Bool

public expect fun isGUIThread(bconvert: Bool): Bool

public expect fun isHungAppWindow(hwnd: Hwnd): Bool

public expect fun isIconic(hwnd: Hwnd): Bool

public expect fun isMenu(hmenu: Hmenu): Bool

public expect fun isProcessDPIAware(): Bool

public expect fun isWindow(hwnd: Hwnd): Bool

public expect fun isWindowArranged(hwnd: Hwnd): Bool

public expect fun isWindowUnicode(hwnd: Hwnd): Bool

public expect fun isWindowVisible(hwnd: Hwnd): Bool

public expect fun isWow64Message(): Bool

public expect fun isZoomed(hwnd: Hwnd): Bool

public expect fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool

public expect fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel

public expect fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel

public expect fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor

public expect fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor

public expect fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor

public expect fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor

public expect fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon

public expect fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon

public expect fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle

public expect fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle

public expect fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu

public expect fun loadMenuIndirectA(lpmenutemplate: ConstPtr<CVoid>): Hmenu

public expect fun loadMenuIndirectW(lpmenutemplate: ConstPtr<CVoid>): Hmenu

public expect fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu

public expect fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int

public expect fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int

public expect fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool

public expect fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool

public expect fun lookupIconIdFromDirectory(presbits: ConstPtr<UByte>, ficon: Bool): Int

public expect fun lookupIconIdFromDirectoryEx(presbits: ConstPtr<UByte>, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int

public expect fun mapDialogRect(hdlg: Hwnd, lprect: MutPtr<Rect>): Bool

public expect fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int

public expect fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult

public expect fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult

public expect fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult

public expect fun messageBoxIndirectA(lpmbp: ConstPtr<Msgboxparamsa>): MessageboxResult

public expect fun messageBoxIndirectW(lpmbp: ConstPtr<Msgboxparamsw>): MessageboxResult

public expect fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult

public expect fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool

public expect fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool

public expect fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool

public expect fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult

public expect fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: MutPtr<MutPtr<UByte>>, outputxmlsize: MutPtr<UInt>): Hresult

public expect fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult

public expect fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: MutPtr<MutPtr<UByte>>, outputprisize: MutPtr<UInt>): Hresult

public expect fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult

public expect fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: MutPtr<MrmResourceIndexerHandle>): Hresult

public expect fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: ConstPtr<UByte>, prisize: UInt, indexer: MutPtr<MrmResourceIndexerHandle>): Hresult

public expect fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: MutPtr<MrmResourceIndexerHandle>): Hresult

public expect fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: ConstPtr<UByte>, schemaxmlsize: UInt, indexer: MutPtr<MrmResourceIndexerHandle>): Hresult

public expect fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: MutPtr<MrmResourceIndexerHandle>): Hresult

public expect fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: MutPtr<MrmResourceIndexerHandle>): Hresult

public expect fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult

public expect fun mrmDumpPriDataInMemory(inputpridata: ConstPtr<UByte>, inputprisize: UInt, schemapridata: ConstPtr<UByte>, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: MutPtr<MutPtr<UByte>>, outputxmlsize: MutPtr<UInt>): Hresult

public expect fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult

public expect fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: MutPtr<MutPtr<UByte>>, outputxmlsize: MutPtr<UInt>): Hresult

public expect fun mrmFreeMemory(data: ConstPtr<UByte>): Hresult

public expect fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: MutPtr<UInt>): Hresult

public expect fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: ConstPtr<UByte>, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult

public expect fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult

public expect fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult

public expect fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult

public expect fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult

public expect fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: MutPtr<MutPtr<MrmResourceIndexerMessage>>, nummsgs: MutPtr<UInt>): Hresult

public expect fun msgWaitForMultipleObjects(ncount: UInt, phandles: ConstPtr<Handle>, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent

public expect fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: ConstPtr<Handle>, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent

public expect fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool

public expect fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool

public expect fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool

public expect fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool

public expect fun openIcon(hwnd: Hwnd): Bool

public expect fun peekMessageA(lpmsg: MutPtr<Msg>, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool

public expect fun peekMessageW(lpmsg: MutPtr<Msg>, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool

public expect fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool

public expect fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool

public expect fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool

public expect fun postQuitMessage(nexitcode: Int)

public expect fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool

public expect fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool

public expect fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr<Hicon>, piconid: MutPtr<UInt>, nicons: UInt, flags: UInt): UInt

public expect fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr<Hicon>, piconid: MutPtr<UInt>, nicons: UInt, flags: UInt): UInt

public expect fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd

public expect fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt

public expect fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt

public expect fun registerClassA(lpwndclass: ConstPtr<Wndclassa>): UShort

public expect fun registerClassExA(param0: ConstPtr<Wndclassexa>): UShort

public expect fun registerClassExW(param0: ConstPtr<Wndclassexw>): UShort

public expect fun registerClassW(lpwndclass: ConstPtr<Wndclassw>): UShort

public expect fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: ConstPtr<CVoid>, flags: RegisterNotificationFlags): Hdevnotify

public expect fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: ConstPtr<CVoid>, flags: RegisterNotificationFlags): Hdevnotify

public expect fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool

public expect fun registerShellHookWindow(hwnd: Hwnd): Bool

public expect fun registerWindowMessageA(lpstring: Pcstr): UInt

public expect fun registerWindowMessageW(lpstring: Pcwstr): UInt

public expect fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool

public expect fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle

public expect fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle

public expect fun replyMessage(lresult: Lresult): Bool

public expect fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: ConstPtr<Rect>, lprcclip: ConstPtr<Rect>, hrgnupdate: Hrgn, lprcupdate: MutPtr<Rect>): Bool

public expect fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: ConstPtr<Rect>, lpcliprect: ConstPtr<Rect>): Bool

public expect fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: ConstPtr<Rect>, prcclip: ConstPtr<Rect>, hrgnupdate: Hrgn, prcupdate: MutPtr<Rect>, flags: ScrollWindowFlags): Int

public expect fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool

public expect fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool

public expect fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr<ULong>): Lresult

public expect fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr<ULong>): Lresult

public expect fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool

public expect fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool

public expect fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: ConstPtr<Handle>): Bool

public expect fun setCaretBlinkTime(umseconds: UInt): Bool

public expect fun setCaretPos(x: Int, y: Int): Bool

public expect fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt

public expect fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong

public expect fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong

public expect fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt

public expect fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort

public expect fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong

public expect fun setCursor(hcursor: Hcursor): Hcursor

public expect fun setCursorPos(x: Int, y: Int): Bool

public expect fun setDebugErrorLevel(dwlevel: UInt)

public expect fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool

public expect fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool

public expect fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool

public expect fun setForegroundWindow(hwnd: Hwnd): Bool

public expect fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool

public expect fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool

public expect fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool

public expect fun setMenuInfo(param0: Hmenu, param1: ConstPtr<Menuinfo>): Bool

public expect fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool

public expect fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr<Menuiteminfoa>): Bool

public expect fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr<Menuiteminfow>): Bool

public expect fun setMessageExtraInfo(lparam: Lparam): Lparam

public expect fun setMessageQueue(cmessagesmax: Int): Bool

public expect fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd

public expect fun setPhysicalCursorPos(x: Int, y: Int): Bool

public expect fun setProcessDPIAware(): Bool

public expect fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool

public expect fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool

public expect fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool

public expect fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool

public expect fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong

public expect fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool

public expect fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int

public expect fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long

public expect fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long

public expect fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int

public expect fun setWindowPlacement(hwnd: Hwnd, lpwndpl: ConstPtr<Windowplacement>): Bool

public expect fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool

public expect fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool

public expect fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool

public expect fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort

public expect fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook

public expect fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook

public expect fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook

public expect fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook

public expect fun showCaret(hwnd: Hwnd): Bool

public expect fun showCursor(bshow: Bool): Int

public expect fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool

public expect fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool

public expect fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool

public expect fun soundSentry(): Bool

public expect fun switchToThisWindow(hwnd: Hwnd, funknown: Bool)

public expect fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr<CVoid>, fwinini: SystemParametersInfoUpdateFlags): Bool

public expect fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr<CVoid>, fwinini: SystemParametersInfoUpdateFlags): Bool

public expect fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: ConstPtr<Rect>, ckids: UInt, lpkids: ConstPtr<Hwnd>): UShort

public expect fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: ConstPtr<Rect>): Bool

public expect fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: ConstPtr<Tpmparams>): Bool

public expect fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr<Msg>): Int

public expect fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr<Msg>): Int

public expect fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: ConstPtr<Msg>): Bool

public expect fun translateMessage(lpmsg: ConstPtr<Msg>): Bool

public expect fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool

public expect fun unhookWindowsHookEx(hhk: Hhook): Bool

public expect fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool

public expect fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool

public expect fun unregisterDeviceNotification(handle: Hdevnotify): Bool

public expect fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: ConstPtr<Point>, psize: ConstPtr<Size>, hdcsrc: Hdc, pptsrc: ConstPtr<Point>, crkey: Colorref, pblend: ConstPtr<Blendfunction>, dwflags: UpdateLayeredWindowFlags): Bool

public expect fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: ConstPtr<Updatelayeredwindowinfo>): Bool

public expect fun waitMessage(): Bool

public expect fun windowFromPhysicalPoint(point: Point): Hwnd

public expect fun windowFromPoint(point: Point): Hwnd

public expect fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int

public expect fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int

public expect fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: ConstPtr<Byte>): Int

public expect fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: ConstPtr<Byte>): Int
