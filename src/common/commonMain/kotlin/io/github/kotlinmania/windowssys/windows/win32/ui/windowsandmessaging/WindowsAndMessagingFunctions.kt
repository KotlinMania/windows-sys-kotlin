package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: Foundation.HWND, param1: UInt, param2: Foundation.WPARAM, param3: Foundation.LPARAM): Foundation.LRESULT
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: Foundation.HWND, param1: UInt, param2: Foundation.WPARAM, param3: Foundation.LPARAM): Long
}

public fun interface FnCallback2 {
    public operator fun invoke(param0: Foundation.HWND, param1: Foundation.LPARAM): BOOL
}

public fun interface FnCallback3 {
    public operator fun invoke(param0: Foundation.HWND, param1: PCSTR, param2: Foundation.HANDLE): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(param0: Foundation.HWND, param1: PCSTR, param2: Foundation.HANDLE, param3: ULong): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(param0: Foundation.HWND, param1: PCWSTR, param2: Foundation.HANDLE, param3: ULong): BOOL
}

public fun interface FnCallback6 {
    public operator fun invoke(param0: Foundation.HWND, param1: PCWSTR, param2: Foundation.HANDLE): BOOL
}

public fun interface FnCallback7 {
    public operator fun invoke(param0: Foundation.HWND, param1: UInt, param2: ULong, param3: Foundation.LRESULT)
}

public fun interface FnCallback8 {
    public operator fun invoke(param0: Foundation.HWND, param1: UInt, param2: ULong, param3: UInt)
}

public fun interface FnCallback9 {
    public operator fun invoke(code: Int, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT
}

public fun AdjustWindowRect(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AdjustWindowRect", longArrayOf(lprect, dwstyle.toLong(), bmenu.toLong())).toInt()
}

public fun AdjustWindowRectEx(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AdjustWindowRectEx", longArrayOf(lprect, dwstyle.toLong(), bmenu.toLong(), dwexstyle.toLong())).toInt()
}

public fun AllowSetForegroundWindow(dwprocessid: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AllowSetForegroundWindow", longArrayOf(dwprocessid.toLong())).toInt()
}

public fun AnimateWindow(hwnd: Foundation.HWND, dwtime: UInt, dwflags: ANIMATE_WINDOW_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AnimateWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwtime.toLong(), dwflags.toLong())).toInt()
}

public fun AnyPopup(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AnyPopup", longArrayOf()).toInt()
}

public fun AppendMenuA(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AppendMenuA", longArrayOf(hmenu, uflags.toLong(), uidnewitem.toLong(), lpnewitem)).toInt()
}

public fun AppendMenuW(hmenu: HMENU, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AppendMenuW", longArrayOf(hmenu, uflags.toLong(), uidnewitem.toLong(), lpnewitem)).toInt()
}

public fun ArrangeIconicWindows(hwnd: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "ArrangeIconicWindows", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toUInt()
}

public fun BeginDeferWindowPos(nnumwindows: Int): HDWP {
    return Win32DynamicFfi.invoke("user32.dll", "BeginDeferWindowPos", longArrayOf(nnumwindows.toLong()))
}

public fun BringWindowToTop(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "BringWindowToTop", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun CalculatePopupWindowPosition(anchorpoint: Long, windowsize: Long, flags: UInt, excluderect: Long, popupwindowposition: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CalculatePopupWindowPosition", longArrayOf(anchorpoint, windowsize, flags.toLong(), excluderect, popupwindowposition)).toInt()
}

public fun CallMsgFilterA(lpmsg: Long, ncode: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CallMsgFilterA", longArrayOf(lpmsg, ncode.toLong())).toInt()
}

public fun CallMsgFilterW(lpmsg: Long, ncode: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CallMsgFilterW", longArrayOf(lpmsg, ncode.toLong())).toInt()
}

public fun CallNextHookEx(hhk: HHOOK, ncode: Int, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "CallNextHookEx", longArrayOf(hhk, ncode.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun CallWindowProcA(lpprevwndfunc: WNDPROC, hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "CallWindowProcA", longArrayOf(Win32DynamicFfi.objectSlot(lpprevwndfunc), Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun CallWindowProcW(lpprevwndfunc: WNDPROC, hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "CallWindowProcW", longArrayOf(Win32DynamicFfi.objectSlot(lpprevwndfunc), Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun CancelShutdown(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CancelShutdown", longArrayOf()).toInt()
}

public fun CascadeWindows(hwndparent: Foundation.HWND, whow: CASCADE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "CascadeWindows", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), whow.toLong(), lprect, ckids.toLong(), lpkids)).toUShort()
}

public fun ChangeMenuA(hmenu: HMENU, cmd: UInt, lpsznewitem: PCSTR, cmdinsert: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeMenuA", longArrayOf(hmenu, cmd.toLong(), lpsznewitem, cmdinsert.toLong(), flags.toLong())).toInt()
}

public fun ChangeMenuW(hmenu: HMENU, cmd: UInt, lpsznewitem: PCWSTR, cmdinsert: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeMenuW", longArrayOf(hmenu, cmd.toLong(), lpsznewitem, cmdinsert.toLong(), flags.toLong())).toInt()
}

public fun ChangeWindowMessageFilter(message: UInt, dwflag: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeWindowMessageFilter", longArrayOf(message.toLong(), dwflag.toLong())).toInt()
}

public fun ChangeWindowMessageFilterEx(hwnd: Foundation.HWND, message: UInt, action: WINDOW_MESSAGE_FILTER_ACTION, pchangefilterstruct: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeWindowMessageFilterEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), message.toLong(), action.toLong(), pchangefilterstruct)).toInt()
}

public fun CharLowerA(lpsz: PSTR): PSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharLowerA", longArrayOf(lpsz))
}

public fun CharLowerBuffA(lpsz: PSTR, cchlength: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "CharLowerBuffA", longArrayOf(lpsz, cchlength.toLong())).toUInt()
}

public fun CharLowerBuffW(lpsz: PWSTR, cchlength: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "CharLowerBuffW", longArrayOf(lpsz, cchlength.toLong())).toUInt()
}

public fun CharLowerW(lpsz: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharLowerW", longArrayOf(lpsz))
}

public fun CharNextA(lpsz: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharNextA", longArrayOf(lpsz))
}

public fun CharNextExA(codepage: UShort, lpcurrentchar: PCSTR, dwflags: UInt): PSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharNextExA", longArrayOf(codepage.toLong(), lpcurrentchar, dwflags.toLong()))
}

public fun CharNextW(lpsz: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharNextW", longArrayOf(lpsz))
}

public fun CharPrevA(lpszstart: PCSTR, lpszcurrent: PCSTR): PSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharPrevA", longArrayOf(lpszstart, lpszcurrent))
}

public fun CharPrevExA(codepage: UShort, lpstart: PCSTR, lpcurrentchar: PCSTR, dwflags: UInt): PSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharPrevExA", longArrayOf(codepage.toLong(), lpstart, lpcurrentchar, dwflags.toLong()))
}

public fun CharPrevW(lpszstart: PCWSTR, lpszcurrent: PCWSTR): PWSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharPrevW", longArrayOf(lpszstart, lpszcurrent))
}

public fun CharToOemA(psrc: PCSTR, pdst: PSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CharToOemA", longArrayOf(psrc, pdst)).toInt()
}

public fun CharToOemBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CharToOemBuffA", longArrayOf(lpszsrc, lpszdst, cchdstlength.toLong())).toInt()
}

public fun CharToOemBuffW(lpszsrc: PCWSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CharToOemBuffW", longArrayOf(lpszsrc, lpszdst, cchdstlength.toLong())).toInt()
}

public fun CharToOemW(psrc: PCWSTR, pdst: PSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CharToOemW", longArrayOf(psrc, pdst)).toInt()
}

public fun CharUpperA(lpsz: PSTR): PSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharUpperA", longArrayOf(lpsz))
}

public fun CharUpperBuffA(lpsz: PSTR, cchlength: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "CharUpperBuffA", longArrayOf(lpsz, cchlength.toLong())).toUInt()
}

public fun CharUpperBuffW(lpsz: PWSTR, cchlength: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "CharUpperBuffW", longArrayOf(lpsz, cchlength.toLong())).toUInt()
}

public fun CharUpperW(lpsz: PWSTR): PWSTR {
    return Win32DynamicFfi.invoke("user32.dll", "CharUpperW", longArrayOf(lpsz))
}

public fun CheckMenuItem(hmenu: HMENU, uidcheckitem: UInt, ucheck: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "CheckMenuItem", longArrayOf(hmenu, uidcheckitem.toLong(), ucheck.toLong())).toUInt()
}

public fun CheckMenuRadioItem(hmenu: HMENU, first: UInt, last: UInt, check: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CheckMenuRadioItem", longArrayOf(hmenu, first.toLong(), last.toLong(), check.toLong(), flags.toLong())).toInt()
}

public fun ChildWindowFromPoint(hwndparent: Foundation.HWND, point: Foundation.POINT): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "ChildWindowFromPoint", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(point)))
    return Foundation.HWND()
}

public fun ChildWindowFromPointEx(hwnd: Foundation.HWND, pt: Foundation.POINT, flags: CWP_FLAGS): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "ChildWindowFromPointEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(pt), flags.toLong()))
    return Foundation.HWND()
}

public fun ClipCursor(lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ClipCursor", longArrayOf(lprect)).toInt()
}

public fun CloseWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CloseWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun CopyAcceleratorTableA(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "CopyAcceleratorTableA", longArrayOf(haccelsrc, lpacceldst, caccelentries.toLong())).toInt()
}

public fun CopyAcceleratorTableW(haccelsrc: HACCEL, lpacceldst: Long, caccelentries: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "CopyAcceleratorTableW", longArrayOf(haccelsrc, lpacceldst, caccelentries.toLong())).toInt()
}

public fun CopyIcon(hicon: HICON): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "CopyIcon", longArrayOf(hicon))
}

public fun CopyImage(h: Foundation.HANDLE, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, flags: IMAGE_FLAGS): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "CopyImage", longArrayOf(Win32DynamicFfi.objectSlot(h), type.toLong(), cx.toLong(), cy.toLong(), flags.toLong()))
    return Foundation.HANDLE()
}

public fun CreateAcceleratorTableA(paccel: Long, caccel: Int): HACCEL {
    return Win32DynamicFfi.invoke("user32.dll", "CreateAcceleratorTableA", longArrayOf(paccel, caccel.toLong()))
}

public fun CreateAcceleratorTableW(paccel: Long, caccel: Int): HACCEL {
    return Win32DynamicFfi.invoke("user32.dll", "CreateAcceleratorTableW", longArrayOf(paccel, caccel.toLong()))
}

public fun CreateCaret(hwnd: Foundation.HWND, hbitmap: Graphics.Gdi.HBITMAP, nwidth: Int, nheight: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CreateCaret", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hbitmap), nwidth.toLong(), nheight.toLong())).toInt()
}

public fun CreateCursor(hinst: Foundation.HINSTANCE, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: Long, pvxorplane: Long): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "CreateCursor", longArrayOf(Win32DynamicFfi.objectSlot(hinst), xhotspot.toLong(), yhotspot.toLong(), nwidth.toLong(), nheight.toLong(), pvandplane, pvxorplane))
}

public fun CreateDialogIndirectParamA(hinstance: Foundation.HINSTANCE, lptemplate: Long, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateDialogIndirectParamA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptemplate, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
    return Foundation.HWND()
}

public fun CreateDialogIndirectParamW(hinstance: Foundation.HINSTANCE, lptemplate: Long, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateDialogIndirectParamW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptemplate, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
    return Foundation.HWND()
}

public fun CreateDialogParamA(hinstance: Foundation.HINSTANCE, lptemplatename: PCSTR, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateDialogParamA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptemplatename, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
    return Foundation.HWND()
}

public fun CreateDialogParamW(hinstance: Foundation.HINSTANCE, lptemplatename: PCWSTR, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateDialogParamW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptemplatename, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
    return Foundation.HWND()
}

public fun CreateIcon(hinstance: Foundation.HINSTANCE, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: Long, lpbxorbits: Long): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "CreateIcon", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), nwidth.toLong(), nheight.toLong(), cplanes.toLong(), cbitspixel.toLong(), lpbandbits, lpbxorbits))
}

public fun CreateIconFromResource(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "CreateIconFromResource", longArrayOf(presbits, dwressize.toLong(), ficon.toLong(), dwver.toLong()))
}

public fun CreateIconFromResourceEx(presbits: Long, dwressize: UInt, ficon: BOOL, dwver: UInt, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "CreateIconFromResourceEx", longArrayOf(presbits, dwressize.toLong(), ficon.toLong(), dwver.toLong(), cxdesired.toLong(), cydesired.toLong(), flags.toLong()))
}

public fun CreateIconIndirect(piconinfo: Long): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "CreateIconIndirect", longArrayOf(piconinfo))
}

public fun CreateMDIWindowA(lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Foundation.HWND, hinstance: Foundation.HINSTANCE, lparam: Foundation.LPARAM): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateMDIWindowA", longArrayOf(lpclassname, lpwindowname, dwstyle.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hinstance), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.HWND()
}

public fun CreateMDIWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Foundation.HWND, hinstance: Foundation.HINSTANCE, lparam: Foundation.LPARAM): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateMDIWindowW", longArrayOf(lpclassname, lpwindowname, dwstyle.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hinstance), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.HWND()
}

public fun CreateMenu(): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "CreateMenu", longArrayOf())
}

public fun CreatePopupMenu(): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "CreatePopupMenu", longArrayOf())
}

public fun CreateResourceIndexer(projectroot: PCWSTR, extensiondllpath: PCWSTR, ppresourceindexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "CreateResourceIndexer", longArrayOf(projectroot, extensiondllpath, ppresourceindexer)).toInt()
}

public fun CreateWindowExA(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCSTR, lpwindowname: PCSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Foundation.HWND, hmenu: HMENU, hinstance: Foundation.HINSTANCE, lpparam: Long): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateWindowExA", longArrayOf(dwexstyle.toLong(), lpclassname, lpwindowname, dwstyle.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), Win32DynamicFfi.objectSlot(hwndparent), hmenu, Win32DynamicFfi.objectSlot(hinstance), lpparam))
    return Foundation.HWND()
}

public fun CreateWindowExW(dwexstyle: WINDOW_EX_STYLE, lpclassname: PCWSTR, lpwindowname: PCWSTR, dwstyle: WINDOW_STYLE, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Foundation.HWND, hmenu: HMENU, hinstance: Foundation.HINSTANCE, lpparam: Long): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "CreateWindowExW", longArrayOf(dwexstyle.toLong(), lpclassname, lpwindowname, dwstyle.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), Win32DynamicFfi.objectSlot(hwndparent), hmenu, Win32DynamicFfi.objectSlot(hinstance), lpparam))
    return Foundation.HWND()
}

public fun DefDlgProcA(hdlg: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefDlgProcA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefDlgProcW(hdlg: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefDlgProcW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefFrameProcA(hwnd: Foundation.HWND, hwndmdiclient: Foundation.HWND, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefFrameProcA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hwndmdiclient), umsg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefFrameProcW(hwnd: Foundation.HWND, hwndmdiclient: Foundation.HWND, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefFrameProcW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hwndmdiclient), umsg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefMDIChildProcA(hwnd: Foundation.HWND, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefMDIChildProcA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), umsg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefMDIChildProcW(hwnd: Foundation.HWND, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefMDIChildProcW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), umsg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefWindowProcA(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefWindowProcA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DefWindowProcW(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DefWindowProcW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun DeferWindowPos(hwinposinfo: HDWP, hwnd: Foundation.HWND, hwndinsertafter: Foundation.HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): HDWP {
    return Win32DynamicFfi.invoke("user32.dll", "DeferWindowPos", longArrayOf(hwinposinfo, Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hwndinsertafter), x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), uflags.toLong()))
}

public fun DeleteMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DeleteMenu", longArrayOf(hmenu, uposition.toLong(), uflags.toLong())).toInt()
}

public fun DeregisterShellHookWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DeregisterShellHookWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun DestroyAcceleratorTable(haccel: HACCEL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DestroyAcceleratorTable", longArrayOf(haccel)).toInt()
}

public fun DestroyCaret(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DestroyCaret", longArrayOf()).toInt()
}

public fun DestroyCursor(hcursor: HCURSOR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DestroyCursor", longArrayOf(hcursor)).toInt()
}

public fun DestroyIcon(hicon: HICON): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DestroyIcon", longArrayOf(hicon)).toInt()
}

public fun DestroyIndexedResults(resourceuri: PCWSTR, qualifiercount: UInt, qualifiers: Long) {
    Win32DynamicFfi.invoke("mrmsupport.dll", "DestroyIndexedResults", longArrayOf(resourceuri, qualifiercount.toLong(), qualifiers))
}

public fun DestroyMenu(hmenu: HMENU): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DestroyMenu", longArrayOf(hmenu)).toInt()
}

public fun DestroyResourceIndexer(resourceindexer: Long) {
    Win32DynamicFfi.invoke("mrmsupport.dll", "DestroyResourceIndexer", longArrayOf(resourceindexer))
}

public fun DestroyWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DestroyWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun DialogBoxIndirectParamA(hinstance: Foundation.HINSTANCE, hdialogtemplate: Long, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Long {
    return Win32DynamicFfi.invoke("user32.dll", "DialogBoxIndirectParamA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), hdialogtemplate, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
}

public fun DialogBoxIndirectParamW(hinstance: Foundation.HINSTANCE, hdialogtemplate: Long, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Long {
    return Win32DynamicFfi.invoke("user32.dll", "DialogBoxIndirectParamW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), hdialogtemplate, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
}

public fun DialogBoxParamA(hinstance: Foundation.HINSTANCE, lptemplatename: PCSTR, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Long {
    return Win32DynamicFfi.invoke("user32.dll", "DialogBoxParamA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptemplatename, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
}

public fun DialogBoxParamW(hinstance: Foundation.HINSTANCE, lptemplatename: PCWSTR, hwndparent: Foundation.HWND, lpdialogfunc: DLGPROC, dwinitparam: Foundation.LPARAM): Long {
    return Win32DynamicFfi.invoke("user32.dll", "DialogBoxParamW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptemplatename, Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpdialogfunc), Win32DynamicFfi.objectSlot(dwinitparam)))
}

public fun DisableProcessWindowsGhosting() {
    Win32DynamicFfi.invoke("user32.dll", "DisableProcessWindowsGhosting", longArrayOf())
}

public fun DispatchMessageA(lpmsg: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DispatchMessageA", longArrayOf(lpmsg))
    return Foundation.LRESULT()
}

public fun DispatchMessageW(lpmsg: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "DispatchMessageW", longArrayOf(lpmsg))
    return Foundation.LRESULT()
}

public fun DragObject(hwndparent: Foundation.HWND, hwndfrom: Foundation.HWND, fmt: UInt, data: ULong, hcur: HCURSOR): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "DragObject", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hwndfrom), fmt.toLong(), data.toLong(), hcur)).toUInt()
}

public fun DrawIcon(hdc: Graphics.Gdi.HDC, x: Int, y: Int, hicon: HICON): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawIcon", longArrayOf(Win32DynamicFfi.objectSlot(hdc), x.toLong(), y.toLong(), hicon)).toInt()
}

public fun DrawIconEx(hdc: Graphics.Gdi.HDC, xleft: Int, ytop: Int, hicon: HICON, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Graphics.Gdi.HBRUSH, diflags: DI_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawIconEx", longArrayOf(Win32DynamicFfi.objectSlot(hdc), xleft.toLong(), ytop.toLong(), hicon, cxwidth.toLong(), cywidth.toLong(), istepifanicur.toLong(), Win32DynamicFfi.objectSlot(hbrflickerfreedraw), diflags.toLong())).toInt()
}

public fun DrawMenuBar(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawMenuBar", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun EnableMenuItem(hmenu: HMENU, uidenableitem: UInt, uenable: MENU_ITEM_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableMenuItem", longArrayOf(hmenu, uidenableitem.toLong(), uenable.toLong())).toInt()
}

public fun EndDeferWindowPos(hwinposinfo: HDWP): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EndDeferWindowPos", longArrayOf(hwinposinfo)).toInt()
}

public fun EndDialog(hdlg: Foundation.HWND, nresult: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EndDialog", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), nresult)).toInt()
}

public fun EndMenu(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EndMenu", longArrayOf()).toInt()
}

public fun EnumChildWindows(hwndparent: Foundation.HWND, lpenumfunc: WNDENUMPROC, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumChildWindows", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumPropsA(hwnd: Foundation.HWND, lpenumfunc: PROPENUMPROCA): Int {
    return Win32DynamicFfi.invoke("user32.dll", "EnumPropsA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(lpenumfunc))).toInt()
}

public fun EnumPropsExA(hwnd: Foundation.HWND, lpenumfunc: PROPENUMPROCEXA, lparam: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("user32.dll", "EnumPropsExA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumPropsExW(hwnd: Foundation.HWND, lpenumfunc: PROPENUMPROCEXW, lparam: Foundation.LPARAM): Int {
    return Win32DynamicFfi.invoke("user32.dll", "EnumPropsExW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumPropsW(hwnd: Foundation.HWND, lpenumfunc: PROPENUMPROCW): Int {
    return Win32DynamicFfi.invoke("user32.dll", "EnumPropsW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(lpenumfunc))).toInt()
}

public fun EnumThreadWindows(dwthreadid: UInt, lpfn: WNDENUMPROC, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumThreadWindows", longArrayOf(dwthreadid.toLong(), Win32DynamicFfi.objectSlot(lpfn), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun EnumWindows(lpenumfunc: WNDENUMPROC, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumWindows", longArrayOf(Win32DynamicFfi.objectSlot(lpenumfunc), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun FindWindowA(lpclassname: PCSTR, lpwindowname: PCSTR): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "FindWindowA", longArrayOf(lpclassname, lpwindowname))
    return Foundation.HWND()
}

public fun FindWindowExA(hwndparent: Foundation.HWND, hwndchildafter: Foundation.HWND, lpszclass: PCSTR, lpszwindow: PCSTR): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "FindWindowExA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hwndchildafter), lpszclass, lpszwindow))
    return Foundation.HWND()
}

public fun FindWindowExW(hwndparent: Foundation.HWND, hwndchildafter: Foundation.HWND, lpszclass: PCWSTR, lpszwindow: PCWSTR): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "FindWindowExW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hwndchildafter), lpszclass, lpszwindow))
    return Foundation.HWND()
}

public fun FindWindowW(lpclassname: PCWSTR, lpwindowname: PCWSTR): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "FindWindowW", longArrayOf(lpclassname, lpwindowname))
    return Foundation.HWND()
}

public fun FlashWindow(hwnd: Foundation.HWND, binvert: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "FlashWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), binvert.toLong())).toInt()
}

public fun FlashWindowEx(pfwi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "FlashWindowEx", longArrayOf(pfwi)).toInt()
}

public fun GetAltTabInfoA(hwnd: Foundation.HWND, iitem: Int, pati: Long, pszitemtext: PSTR, cchitemtext: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetAltTabInfoA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), iitem.toLong(), pati, pszitemtext, cchitemtext.toLong())).toInt()
}

public fun GetAltTabInfoW(hwnd: Foundation.HWND, iitem: Int, pati: Long, pszitemtext: PWSTR, cchitemtext: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetAltTabInfoW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), iitem.toLong(), pati, pszitemtext, cchitemtext.toLong())).toInt()
}

public fun GetAncestor(hwnd: Foundation.HWND, gaflags: GET_ANCESTOR_FLAGS): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetAncestor", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), gaflags.toLong()))
    return Foundation.HWND()
}

public fun GetCaretBlinkTime(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetCaretBlinkTime", longArrayOf()).toUInt()
}

public fun GetCaretPos(lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetCaretPos", longArrayOf(lppoint)).toInt()
}

public fun GetClassInfoA(hinstance: Foundation.HINSTANCE, lpclassname: PCSTR, lpwndclass: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassInfoA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpclassname, lpwndclass)).toInt()
}

public fun GetClassInfoExA(hinstance: Foundation.HINSTANCE, lpszclass: PCSTR, lpwcx: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassInfoExA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpszclass, lpwcx)).toInt()
}

public fun GetClassInfoExW(hinstance: Foundation.HINSTANCE, lpszclass: PCWSTR, lpwcx: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassInfoExW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpszclass, lpwcx)).toInt()
}

public fun GetClassInfoW(hinstance: Foundation.HINSTANCE, lpclassname: PCWSTR, lpwndclass: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassInfoW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpclassname, lpwndclass)).toInt()
}

public fun GetClassLongA(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassLongA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toUInt()
}

public fun GetClassLongPtrA(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX): ULong {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassLongPtrA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toULong()
}

public fun GetClassLongPtrW(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX): ULong {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassLongPtrW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toULong()
}

public fun GetClassLongW(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassLongW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toUInt()
}

public fun GetClassNameA(hwnd: Foundation.HWND, lpclassname: PSTR, nmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassNameA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpclassname, nmaxcount.toLong())).toInt()
}

public fun GetClassNameW(hwnd: Foundation.HWND, lpclassname: PWSTR, nmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassNameW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpclassname, nmaxcount.toLong())).toInt()
}

public fun GetClassWord(hwnd: Foundation.HWND, nindex: Int): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "GetClassWord", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toUShort()
}

public fun GetClientRect(hwnd: Foundation.HWND, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetClientRect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lprect)).toInt()
}

public fun GetClipCursor(lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetClipCursor", longArrayOf(lprect)).toInt()
}

public fun GetCursor(): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "GetCursor", longArrayOf())
}

public fun GetCursorInfo(pci: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetCursorInfo", longArrayOf(pci)).toInt()
}

public fun GetCursorPos(lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetCursorPos", longArrayOf(lppoint)).toInt()
}

public fun GetDesktopWindow(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetDesktopWindow", longArrayOf())
    return Foundation.HWND()
}

public fun GetDialogBaseUnits(): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetDialogBaseUnits", longArrayOf()).toInt()
}

public fun GetDlgCtrlID(hwnd: Foundation.HWND): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetDlgCtrlID", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun GetDlgItem(hdlg: Foundation.HWND, niddlgitem: Int): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetDlgItem", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong()))
    return Foundation.HWND()
}

public fun GetDlgItemInt(hdlg: Foundation.HWND, niddlgitem: Int, lptranslated: Long, bsigned: BOOL): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDlgItemInt", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), lptranslated, bsigned.toLong())).toUInt()
}

public fun GetDlgItemTextA(hdlg: Foundation.HWND, niddlgitem: Int, lpstring: PSTR, cchmax: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDlgItemTextA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), lpstring, cchmax.toLong())).toUInt()
}

public fun GetDlgItemTextW(hdlg: Foundation.HWND, niddlgitem: Int, lpstring: PWSTR, cchmax: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDlgItemTextW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), lpstring, cchmax.toLong())).toUInt()
}

public fun GetForegroundWindow(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetForegroundWindow", longArrayOf())
    return Foundation.HWND()
}

public fun GetGUIThreadInfo(idthread: UInt, pgui: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetGUIThreadInfo", longArrayOf(idthread.toLong(), pgui)).toInt()
}

public fun GetIconInfo(hicon: HICON, piconinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetIconInfo", longArrayOf(hicon, piconinfo)).toInt()
}

public fun GetIconInfoExA(hicon: HICON, piconinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetIconInfoExA", longArrayOf(hicon, piconinfo)).toInt()
}

public fun GetIconInfoExW(hicon: HICON, piconinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetIconInfoExW", longArrayOf(hicon, piconinfo)).toInt()
}

public fun GetInputState(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetInputState", longArrayOf()).toInt()
}

public fun GetLastActivePopup(hwnd: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetLastActivePopup", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HWND()
}

public fun GetLayeredWindowAttributes(hwnd: Foundation.HWND, pcrkey: Long, pbalpha: Long, pdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetLayeredWindowAttributes", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pcrkey, pbalpha, pdwflags)).toInt()
}

public fun GetMenu(hwnd: Foundation.HWND): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenu", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
}

public fun GetMenuBarInfo(hwnd: Foundation.HWND, idobject: OBJECT_IDENTIFIER, iditem: Int, pmbi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuBarInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), idobject.toLong(), iditem.toLong(), pmbi)).toInt()
}

public fun GetMenuCheckMarkDimensions(): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuCheckMarkDimensions", longArrayOf()).toInt()
}

public fun GetMenuDefaultItem(hmenu: HMENU, fbypos: UInt, gmdiflags: GET_MENU_DEFAULT_ITEM_FLAGS): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuDefaultItem", longArrayOf(hmenu, fbypos.toLong(), gmdiflags.toLong())).toUInt()
}

public fun GetMenuInfo(param0: HMENU, param1: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuInfo", longArrayOf(param0, param1)).toInt()
}

public fun GetMenuItemCount(hmenu: HMENU): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuItemCount", longArrayOf(hmenu)).toInt()
}

public fun GetMenuItemID(hmenu: HMENU, npos: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuItemID", longArrayOf(hmenu, npos.toLong())).toUInt()
}

public fun GetMenuItemInfoA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuItemInfoA", longArrayOf(hmenu, item.toLong(), fbyposition.toLong(), lpmii)).toInt()
}

public fun GetMenuItemInfoW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmii: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuItemInfoW", longArrayOf(hmenu, item.toLong(), fbyposition.toLong(), lpmii)).toInt()
}

public fun GetMenuItemRect(hwnd: Foundation.HWND, hmenu: HMENU, uitem: UInt, lprcitem: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuItemRect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), hmenu, uitem.toLong(), lprcitem)).toInt()
}

public fun GetMenuState(hmenu: HMENU, uid: UInt, uflags: MENU_ITEM_FLAGS): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuState", longArrayOf(hmenu, uid.toLong(), uflags.toLong())).toUInt()
}

public fun GetMenuStringA(hmenu: HMENU, uiditem: UInt, lpstring: PSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuStringA", longArrayOf(hmenu, uiditem.toLong(), lpstring, cchmax.toLong(), flags.toLong())).toInt()
}

public fun GetMenuStringW(hmenu: HMENU, uiditem: UInt, lpstring: PWSTR, cchmax: Int, flags: MENU_ITEM_FLAGS): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetMenuStringW", longArrayOf(hmenu, uiditem.toLong(), lpstring, cchmax.toLong(), flags.toLong())).toInt()
}

public fun GetMessageA(lpmsg: Long, hwnd: Foundation.HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMessageA", longArrayOf(lpmsg, Win32DynamicFfi.objectSlot(hwnd), wmsgfiltermin.toLong(), wmsgfiltermax.toLong())).toInt()
}

public fun GetMessageExtraInfo(): Foundation.LPARAM {
    Win32DynamicFfi.invoke("user32.dll", "GetMessageExtraInfo", longArrayOf())
    return Foundation.LPARAM()
}

public fun GetMessagePos(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetMessagePos", longArrayOf()).toUInt()
}

public fun GetMessageTime(): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetMessageTime", longArrayOf()).toInt()
}

public fun GetMessageW(lpmsg: Long, hwnd: Foundation.HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMessageW", longArrayOf(lpmsg, Win32DynamicFfi.objectSlot(hwnd), wmsgfiltermin.toLong(), wmsgfiltermax.toLong())).toInt()
}

public fun GetNextDlgGroupItem(hdlg: Foundation.HWND, hctl: Foundation.HWND, bprevious: BOOL): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetNextDlgGroupItem", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), Win32DynamicFfi.objectSlot(hctl), bprevious.toLong()))
    return Foundation.HWND()
}

public fun GetNextDlgTabItem(hdlg: Foundation.HWND, hctl: Foundation.HWND, bprevious: BOOL): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetNextDlgTabItem", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), Win32DynamicFfi.objectSlot(hctl), bprevious.toLong()))
    return Foundation.HWND()
}

public fun GetParent(hwnd: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetParent", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HWND()
}

public fun GetPhysicalCursorPos(lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetPhysicalCursorPos", longArrayOf(lppoint)).toInt()
}

public fun GetProcessDefaultLayout(pdwdefaultlayout: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetProcessDefaultLayout", longArrayOf(pdwdefaultlayout)).toInt()
}

public fun GetPropA(hwnd: Foundation.HWND, lpstring: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "GetPropA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring))
    return Foundation.HANDLE()
}

public fun GetPropW(hwnd: Foundation.HWND, lpstring: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "GetPropW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring))
    return Foundation.HANDLE()
}

public fun GetQueueStatus(flags: QUEUE_STATUS_FLAGS): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetQueueStatus", longArrayOf(flags.toLong())).toUInt()
}

public fun GetScrollBarInfo(hwnd: Foundation.HWND, idobject: OBJECT_IDENTIFIER, psbi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetScrollBarInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), idobject.toLong(), psbi)).toInt()
}

public fun GetScrollInfo(hwnd: Foundation.HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetScrollInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nbar.toLong(), lpsi)).toInt()
}

public fun GetScrollPos(hwnd: Foundation.HWND, nbar: SCROLLBAR_CONSTANTS): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetScrollPos", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nbar.toLong())).toInt()
}

public fun GetScrollRange(hwnd: Foundation.HWND, nbar: SCROLLBAR_CONSTANTS, lpminpos: Long, lpmaxpos: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetScrollRange", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nbar.toLong(), lpminpos, lpmaxpos)).toInt()
}

public fun GetShellWindow(): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetShellWindow", longArrayOf())
    return Foundation.HWND()
}

public fun GetSubMenu(hmenu: HMENU, npos: Int): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "GetSubMenu", longArrayOf(hmenu, npos.toLong()))
}

public fun GetSystemMenu(hwnd: Foundation.HWND, brevert: BOOL): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "GetSystemMenu", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), brevert.toLong()))
}

public fun GetSystemMetrics(nindex: SYSTEM_METRICS_INDEX): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetSystemMetrics", longArrayOf(nindex.toLong())).toInt()
}

public fun GetTitleBarInfo(hwnd: Foundation.HWND, pti: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetTitleBarInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pti)).toInt()
}

public fun GetTopWindow(hwnd: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetTopWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
    return Foundation.HWND()
}

public fun GetWindow(hwnd: Foundation.HWND, ucmd: GET_WINDOW_CMD): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "GetWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ucmd.toLong()))
    return Foundation.HWND()
}

public fun GetWindowDisplayAffinity(hwnd: Foundation.HWND, pdwaffinity: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowDisplayAffinity", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pdwaffinity)).toInt()
}

public fun GetWindowInfo(hwnd: Foundation.HWND, pwi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pwi)).toInt()
}

public fun GetWindowLongA(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowLongA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toInt()
}

public fun GetWindowLongPtrA(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX): Long {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowLongPtrA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong()))
}

public fun GetWindowLongPtrW(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX): Long {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowLongPtrW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong()))
}

public fun GetWindowLongW(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowLongW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toInt()
}

public fun GetWindowModuleFileNameA(hwnd: Foundation.HWND, pszfilename: PSTR, cchfilenamemax: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowModuleFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszfilename, cchfilenamemax.toLong())).toUInt()
}

public fun GetWindowModuleFileNameW(hwnd: Foundation.HWND, pszfilename: PWSTR, cchfilenamemax: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowModuleFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszfilename, cchfilenamemax.toLong())).toUInt()
}

public fun GetWindowPlacement(hwnd: Foundation.HWND, lpwndpl: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowPlacement", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpwndpl)).toInt()
}

public fun GetWindowRect(hwnd: Foundation.HWND, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowRect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lprect)).toInt()
}

public fun GetWindowTextA(hwnd: Foundation.HWND, lpstring: PSTR, nmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowTextA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring, nmaxcount.toLong())).toInt()
}

public fun GetWindowTextLengthA(hwnd: Foundation.HWND): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowTextLengthA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun GetWindowTextLengthW(hwnd: Foundation.HWND): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowTextLengthW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun GetWindowTextW(hwnd: Foundation.HWND, lpstring: PWSTR, nmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowTextW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring, nmaxcount.toLong())).toInt()
}

public fun GetWindowThreadProcessId(hwnd: Foundation.HWND, lpdwprocessid: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowThreadProcessId", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpdwprocessid)).toUInt()
}

public fun GetWindowWord(hwnd: Foundation.HWND, nindex: Int): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowWord", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong())).toUShort()
}

public fun HideCaret(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "HideCaret", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun HiliteMenuItem(hwnd: Foundation.HWND, hmenu: HMENU, uidhiliteitem: UInt, uhilite: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "HiliteMenuItem", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), hmenu, uidhiliteitem.toLong(), uhilite.toLong())).toInt()
}

public fun InSendMessage(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InSendMessage", longArrayOf()).toInt()
}

public fun InSendMessageEx(lpreserved: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "InSendMessageEx", longArrayOf(lpreserved)).toUInt()
}

public fun IndexFilePath(resourceindexer: Long, filepath: PCWSTR, ppresourceuri: Long, pqualifiercount: Long, ppqualifiers: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "IndexFilePath", longArrayOf(resourceindexer, filepath, ppresourceuri, pqualifiercount, ppqualifiers)).toInt()
}

public fun InheritWindowMonitor(hwnd: Foundation.HWND, hwndinherit: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InheritWindowMonitor", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hwndinherit))).toInt()
}

public fun InsertMenuA(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InsertMenuA", longArrayOf(hmenu, uposition.toLong(), uflags.toLong(), uidnewitem.toLong(), lpnewitem)).toInt()
}

public fun InsertMenuItemA(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InsertMenuItemA", longArrayOf(hmenu, item.toLong(), fbyposition.toLong(), lpmi)).toInt()
}

public fun InsertMenuItemW(hmenu: HMENU, item: UInt, fbyposition: BOOL, lpmi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InsertMenuItemW", longArrayOf(hmenu, item.toLong(), fbyposition.toLong(), lpmi)).toInt()
}

public fun InsertMenuW(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InsertMenuW", longArrayOf(hmenu, uposition.toLong(), uflags.toLong(), uidnewitem.toLong(), lpnewitem)).toInt()
}

public fun InternalGetWindowText(hwnd: Foundation.HWND, pstring: PWSTR, cchmaxcount: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "InternalGetWindowText", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pstring, cchmaxcount.toLong())).toInt()
}

public fun IsCharAlphaA(ch: Byte): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharAlphaA", longArrayOf(ch.toLong())).toInt()
}

public fun IsCharAlphaNumericA(ch: Byte): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharAlphaNumericA", longArrayOf(ch.toLong())).toInt()
}

public fun IsCharAlphaNumericW(ch: UShort): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharAlphaNumericW", longArrayOf(ch.toLong())).toInt()
}

public fun IsCharAlphaW(ch: UShort): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharAlphaW", longArrayOf(ch.toLong())).toInt()
}

public fun IsCharLowerA(ch: Byte): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharLowerA", longArrayOf(ch.toLong())).toInt()
}

public fun IsCharUpperA(ch: Byte): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharUpperA", longArrayOf(ch.toLong())).toInt()
}

public fun IsCharUpperW(ch: UShort): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharUpperW", longArrayOf(ch.toLong())).toInt()
}

public fun IsChild(hwndparent: Foundation.HWND, hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsChild", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsDialogMessageA(hdlg: Foundation.HWND, lpmsg: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsDialogMessageA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lpmsg)).toInt()
}

public fun IsDialogMessageW(hdlg: Foundation.HWND, lpmsg: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsDialogMessageW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lpmsg)).toInt()
}

public fun IsGUIThread(bconvert: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsGUIThread", longArrayOf(bconvert.toLong())).toInt()
}

public fun IsHungAppWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsHungAppWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsIconic(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsIconic", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsMenu(hmenu: HMENU): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsMenu", longArrayOf(hmenu)).toInt()
}

public fun IsProcessDPIAware(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsProcessDPIAware", longArrayOf()).toInt()
}

public fun IsWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsWindowArranged(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWindowArranged", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsWindowUnicode(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWindowUnicode", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsWindowVisible(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWindowVisible", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsWow64Message(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWow64Message", longArrayOf()).toInt()
}

public fun IsZoomed(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsZoomed", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun KillTimer(hwnd: Foundation.HWND, uidevent: ULong): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "KillTimer", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), uidevent.toLong())).toInt()
}

public fun LoadAcceleratorsA(hinstance: Foundation.HINSTANCE, lptablename: PCSTR): HACCEL {
    return Win32DynamicFfi.invoke("user32.dll", "LoadAcceleratorsA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptablename))
}

public fun LoadAcceleratorsW(hinstance: Foundation.HINSTANCE, lptablename: PCWSTR): HACCEL {
    return Win32DynamicFfi.invoke("user32.dll", "LoadAcceleratorsW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lptablename))
}

public fun LoadCursorA(hinstance: Foundation.HINSTANCE, lpcursorname: PCSTR): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "LoadCursorA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpcursorname))
}

public fun LoadCursorFromFileA(lpfilename: PCSTR): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "LoadCursorFromFileA", longArrayOf(lpfilename))
}

public fun LoadCursorFromFileW(lpfilename: PCWSTR): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "LoadCursorFromFileW", longArrayOf(lpfilename))
}

public fun LoadCursorW(hinstance: Foundation.HINSTANCE, lpcursorname: PCWSTR): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "LoadCursorW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpcursorname))
}

public fun LoadIconA(hinstance: Foundation.HINSTANCE, lpiconname: PCSTR): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "LoadIconA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpiconname))
}

public fun LoadIconW(hinstance: Foundation.HINSTANCE, lpiconname: PCWSTR): HICON {
    return Win32DynamicFfi.invoke("user32.dll", "LoadIconW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpiconname))
}

public fun LoadImageA(hinst: Foundation.HINSTANCE, name: PCSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "LoadImageA", longArrayOf(Win32DynamicFfi.objectSlot(hinst), name, type.toLong(), cx.toLong(), cy.toLong(), fuload.toLong()))
    return Foundation.HANDLE()
}

public fun LoadImageW(hinst: Foundation.HINSTANCE, name: PCWSTR, type: GDI_IMAGE_TYPE, cx: Int, cy: Int, fuload: IMAGE_FLAGS): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "LoadImageW", longArrayOf(Win32DynamicFfi.objectSlot(hinst), name, type.toLong(), cx.toLong(), cy.toLong(), fuload.toLong()))
    return Foundation.HANDLE()
}

public fun LoadMenuA(hinstance: Foundation.HINSTANCE, lpmenuname: PCSTR): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "LoadMenuA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpmenuname))
}

public fun LoadMenuIndirectA(lpmenutemplate: Long): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "LoadMenuIndirectA", longArrayOf(lpmenutemplate))
}

public fun LoadMenuIndirectW(lpmenutemplate: Long): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "LoadMenuIndirectW", longArrayOf(lpmenutemplate))
}

public fun LoadMenuW(hinstance: Foundation.HINSTANCE, lpmenuname: PCWSTR): HMENU {
    return Win32DynamicFfi.invoke("user32.dll", "LoadMenuW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), lpmenuname))
}

public fun LoadStringA(hinstance: Foundation.HINSTANCE, uid: UInt, lpbuffer: PSTR, cchbuffermax: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "LoadStringA", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), uid.toLong(), lpbuffer, cchbuffermax.toLong())).toInt()
}

public fun LoadStringW(hinstance: Foundation.HINSTANCE, uid: UInt, lpbuffer: PWSTR, cchbuffermax: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "LoadStringW", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), uid.toLong(), lpbuffer, cchbuffermax.toLong())).toInt()
}

public fun LockSetForegroundWindow(ulockcode: FOREGROUND_WINDOW_LOCK_CODE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "LockSetForegroundWindow", longArrayOf(ulockcode.toLong())).toInt()
}

public fun LogicalToPhysicalPoint(hwnd: Foundation.HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "LogicalToPhysicalPoint", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lppoint)).toInt()
}

public fun LookupIconIdFromDirectory(presbits: Long, ficon: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "LookupIconIdFromDirectory", longArrayOf(presbits, ficon.toLong())).toInt()
}

public fun LookupIconIdFromDirectoryEx(presbits: Long, ficon: BOOL, cxdesired: Int, cydesired: Int, flags: IMAGE_FLAGS): Int {
    return Win32DynamicFfi.invoke("user32.dll", "LookupIconIdFromDirectoryEx", longArrayOf(presbits, ficon.toLong(), cxdesired.toLong(), cydesired.toLong(), flags.toLong())).toInt()
}

public fun MapDialogRect(hdlg: Foundation.HWND, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "MapDialogRect", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lprect)).toInt()
}

public fun MenuItemFromPoint(hwnd: Foundation.HWND, hmenu: HMENU, ptscreen: Foundation.POINT): Int {
    return Win32DynamicFfi.invoke("user32.dll", "MenuItemFromPoint", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), hmenu, Win32DynamicFfi.objectSlot(ptscreen))).toInt()
}

public fun MessageBoxA(hwnd: Foundation.HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBoxA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lptext, lpcaption, utype.toLong())).toInt()
}

public fun MessageBoxExA(hwnd: Foundation.HWND, lptext: PCSTR, lpcaption: PCSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBoxExA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lptext, lpcaption, utype.toLong(), wlanguageid.toLong())).toInt()
}

public fun MessageBoxExW(hwnd: Foundation.HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE, wlanguageid: UShort): MESSAGEBOX_RESULT {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBoxExW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lptext, lpcaption, utype.toLong(), wlanguageid.toLong())).toInt()
}

public fun MessageBoxIndirectA(lpmbp: Long): MESSAGEBOX_RESULT {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBoxIndirectA", longArrayOf(lpmbp)).toInt()
}

public fun MessageBoxIndirectW(lpmbp: Long): MESSAGEBOX_RESULT {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBoxIndirectW", longArrayOf(lpmbp)).toInt()
}

public fun MessageBoxW(hwnd: Foundation.HWND, lptext: PCWSTR, lpcaption: PCWSTR, utype: MESSAGEBOX_STYLE): MESSAGEBOX_RESULT {
    return Win32DynamicFfi.invoke("user32.dll", "MessageBoxW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lptext, lpcaption, utype.toLong())).toInt()
}

public fun ModifyMenuA(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ModifyMenuA", longArrayOf(hmnu, uposition.toLong(), uflags.toLong(), uidnewitem.toLong(), lpnewitem)).toInt()
}

public fun ModifyMenuW(hmnu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, uidnewitem: ULong, lpnewitem: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ModifyMenuW", longArrayOf(hmnu, uposition.toLong(), uflags.toLong(), uidnewitem.toLong(), lpnewitem)).toInt()
}

public fun MoveWindow(hwnd: Foundation.HWND, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "MoveWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong(), brepaint.toLong())).toInt()
}

public fun MrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmlfile: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateConfig", longArrayOf(platformversion.toLong(), defaultqualifiers, outputxmlfile)).toInt()
}

public fun MrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, outputxmldata: Long, outputxmlsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateConfigInMemory", longArrayOf(platformversion.toLong(), defaultqualifiers, outputxmldata, outputxmlsize)).toInt()
}

public fun MrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceFile", longArrayOf(Win32DynamicFfi.objectSlot(indexer), packagingmode.toLong(), packagingoptions.toLong(), outputdirectory)).toInt()
}

public fun MrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: Long, outputprisize: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceFileInMemory", longArrayOf(Win32DynamicFfi.objectSlot(indexer), packagingmode.toLong(), packagingoptions.toLong(), outputpridata, outputprisize)).toInt()
}

public fun MrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceFileWithChecksum", longArrayOf(Win32DynamicFfi.objectSlot(indexer), packagingmode.toLong(), packagingoptions.toLong(), checksum.toLong(), outputdirectory)).toInt()
}

public fun MrmCreateResourceIndexer(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, indexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceIndexer", longArrayOf(packagefamilyname, projectroot, platformversion.toLong(), defaultqualifiers, indexer)).toInt()
}

public fun MrmCreateResourceIndexerFromPreviousPriData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, pridata: Long, prisize: UInt, indexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceIndexerFromPreviousPriData", longArrayOf(projectroot, platformversion.toLong(), defaultqualifiers, pridata, prisize.toLong(), indexer)).toInt()
}

public fun MrmCreateResourceIndexerFromPreviousPriFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, prifile: PCWSTR, indexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceIndexerFromPreviousPriFile", longArrayOf(projectroot, platformversion.toLong(), defaultqualifiers, prifile, indexer)).toInt()
}

public fun MrmCreateResourceIndexerFromPreviousSchemaData(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemaxmldata: Long, schemaxmlsize: UInt, indexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceIndexerFromPreviousSchemaData", longArrayOf(projectroot, platformversion.toLong(), defaultqualifiers, schemaxmldata, schemaxmlsize.toLong(), indexer)).toInt()
}

public fun MrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, schemafile: PCWSTR, indexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceIndexerFromPreviousSchemaFile", longArrayOf(projectroot, platformversion.toLong(), defaultqualifiers, schemafile, indexer)).toInt()
}

public fun MrmCreateResourceIndexerWithFlags(packagefamilyname: PCWSTR, projectroot: PCWSTR, platformversion: MrmPlatformVersion, defaultqualifiers: PCWSTR, flags: MrmIndexerFlags, indexer: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmCreateResourceIndexerWithFlags", longArrayOf(packagefamilyname, projectroot, platformversion.toLong(), defaultqualifiers, flags.toLong(), indexer)).toInt()
}

public fun MrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmDestroyIndexerAndMessages", longArrayOf(Win32DynamicFfi.objectSlot(indexer))).toInt()
}

public fun MrmDumpPriDataInMemory(inputpridata: Long, inputprisize: UInt, schemapridata: Long, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmDumpPriDataInMemory", longArrayOf(inputpridata, inputprisize.toLong(), schemapridata, schemaprisize.toLong(), dumptype.toLong(), outputxmldata, outputxmlsize)).toInt()
}

public fun MrmDumpPriFile(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmlfile: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmDumpPriFile", longArrayOf(indexfilename, schemaprifile, dumptype.toLong(), outputxmlfile)).toInt()
}

public fun MrmDumpPriFileInMemory(indexfilename: PCWSTR, schemaprifile: PCWSTR, dumptype: MrmDumpType, outputxmldata: Long, outputxmlsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmDumpPriFileInMemory", longArrayOf(indexfilename, schemaprifile, dumptype.toLong(), outputxmldata, outputxmlsize)).toInt()
}

public fun MrmFreeMemory(data: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmFreeMemory", longArrayOf(data)).toInt()
}

public fun MrmGetPriFileContentChecksum(prifile: PCWSTR, checksum: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmGetPriFileContentChecksum", longArrayOf(prifile, checksum)).toInt()
}

public fun MrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, embeddeddata: Long, embeddeddatasize: UInt, qualifiers: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmIndexEmbeddedData", longArrayOf(Win32DynamicFfi.objectSlot(indexer), resourceuri, embeddeddata, embeddeddatasize.toLong(), qualifiers)).toInt()
}

public fun MrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, filepath: PCWSTR, qualifiers: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmIndexFile", longArrayOf(Win32DynamicFfi.objectSlot(indexer), resourceuri, filepath, qualifiers)).toInt()
}

public fun MrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmIndexFileAutoQualifiers", longArrayOf(Win32DynamicFfi.objectSlot(indexer), filepath)).toInt()
}

public fun MrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmIndexResourceContainerAutoQualifiers", longArrayOf(Win32DynamicFfi.objectSlot(indexer), containerpath)).toInt()
}

public fun MrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: PCWSTR, resourcestring: PCWSTR, qualifiers: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmIndexString", longArrayOf(Win32DynamicFfi.objectSlot(indexer), resourceuri, resourcestring, qualifiers)).toInt()
}

public fun MrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: Long, nummsgs: Long): HRESULT {
    return Win32DynamicFfi.invoke("mrmsupport.dll", "MrmPeekResourceIndexerMessages", longArrayOf(Win32DynamicFfi.objectSlot(handle), messages, nummsgs)).toInt()
}

public fun MsgWaitForMultipleObjects(ncount: UInt, phandles: Long, fwaitall: BOOL, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("user32.dll", "MsgWaitForMultipleObjects", longArrayOf(ncount.toLong(), phandles, fwaitall.toLong(), dwmilliseconds.toLong(), dwwakemask.toLong()))
    return Foundation.WAIT_EVENT()
}

public fun MsgWaitForMultipleObjectsEx(ncount: UInt, phandles: Long, dwmilliseconds: UInt, dwwakemask: QUEUE_STATUS_FLAGS, dwflags: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS): Foundation.WAIT_EVENT {
    Win32DynamicFfi.invoke("user32.dll", "MsgWaitForMultipleObjectsEx", longArrayOf(ncount.toLong(), phandles, dwmilliseconds.toLong(), dwwakemask.toLong(), dwflags.toLong()))
    return Foundation.WAIT_EVENT()
}

public fun OemToCharA(psrc: PCSTR, pdst: PSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OemToCharA", longArrayOf(psrc, pdst)).toInt()
}

public fun OemToCharBuffA(lpszsrc: PCSTR, lpszdst: PSTR, cchdstlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OemToCharBuffA", longArrayOf(lpszsrc, lpszdst, cchdstlength.toLong())).toInt()
}

public fun OemToCharBuffW(lpszsrc: PCSTR, lpszdst: PWSTR, cchdstlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OemToCharBuffW", longArrayOf(lpszsrc, lpszdst, cchdstlength.toLong())).toInt()
}

public fun OemToCharW(psrc: PCSTR, pdst: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OemToCharW", longArrayOf(psrc, pdst)).toInt()
}

public fun OpenIcon(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OpenIcon", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun PeekMessageA(lpmsg: Long, hwnd: Foundation.HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PeekMessageA", longArrayOf(lpmsg, Win32DynamicFfi.objectSlot(hwnd), wmsgfiltermin.toLong(), wmsgfiltermax.toLong(), wremovemsg.toLong())).toInt()
}

public fun PeekMessageW(lpmsg: Long, hwnd: Foundation.HWND, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PEEK_MESSAGE_REMOVE_TYPE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PeekMessageW", longArrayOf(lpmsg, Win32DynamicFfi.objectSlot(hwnd), wmsgfiltermin.toLong(), wmsgfiltermax.toLong(), wremovemsg.toLong())).toInt()
}

public fun PhysicalToLogicalPoint(hwnd: Foundation.HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PhysicalToLogicalPoint", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lppoint)).toInt()
}

public fun PostMessageA(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PostMessageA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun PostMessageW(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PostMessageW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun PostQuitMessage(nexitcode: Int) {
    Win32DynamicFfi.invoke("user32.dll", "PostQuitMessage", longArrayOf(nexitcode.toLong()))
}

public fun PostThreadMessageA(idthread: UInt, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PostThreadMessageA", longArrayOf(idthread.toLong(), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun PostThreadMessageW(idthread: UInt, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PostThreadMessageW", longArrayOf(idthread.toLong(), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun PrivateExtractIconsA(szfilename: PCSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "PrivateExtractIconsA", longArrayOf(szfilename, niconindex.toLong(), cxicon.toLong(), cyicon.toLong(), phicon, piconid, nicons.toLong(), flags.toLong())).toUInt()
}

public fun PrivateExtractIconsW(szfilename: PCWSTR, niconindex: Int, cxicon: Int, cyicon: Int, phicon: Long, piconid: Long, nicons: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "PrivateExtractIconsW", longArrayOf(szfilename, niconindex.toLong(), cxicon.toLong(), cyicon.toLong(), phicon, piconid, nicons.toLong(), flags.toLong())).toUInt()
}

public fun RealChildWindowFromPoint(hwndparent: Foundation.HWND, ptparentclientcoords: Foundation.POINT): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "RealChildWindowFromPoint", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(ptparentclientcoords)))
    return Foundation.HWND()
}

public fun RealGetWindowClassA(hwnd: Foundation.HWND, ptszclassname: PSTR, cchclassnamemax: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "RealGetWindowClassA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ptszclassname, cchclassnamemax.toLong())).toUInt()
}

public fun RealGetWindowClassW(hwnd: Foundation.HWND, ptszclassname: PWSTR, cchclassnamemax: UInt): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "RealGetWindowClassW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ptszclassname, cchclassnamemax.toLong())).toUInt()
}

public fun RegisterClassA(lpwndclass: Long): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterClassA", longArrayOf(lpwndclass)).toUShort()
}

public fun RegisterClassExA(param0: Long): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterClassExA", longArrayOf(param0)).toUShort()
}

public fun RegisterClassExW(param0: Long): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterClassExW", longArrayOf(param0)).toUShort()
}

public fun RegisterClassW(lpwndclass: Long): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterClassW", longArrayOf(lpwndclass)).toUShort()
}

public fun RegisterDeviceNotificationA(hrecipient: Foundation.HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterDeviceNotificationA", longArrayOf(Win32DynamicFfi.objectSlot(hrecipient), notificationfilter, flags.toLong()))
}

public fun RegisterDeviceNotificationW(hrecipient: Foundation.HANDLE, notificationfilter: Long, flags: REGISTER_NOTIFICATION_FLAGS): HDEVNOTIFY {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterDeviceNotificationW", longArrayOf(Win32DynamicFfi.objectSlot(hrecipient), notificationfilter, flags.toLong()))
}

public fun RegisterForTooltipDismissNotification(hwnd: Foundation.HWND, tdflags: TOOLTIP_DISMISS_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterForTooltipDismissNotification", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), tdflags.toLong())).toInt()
}

public fun RegisterShellHookWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterShellHookWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun RegisterWindowMessageA(lpstring: PCSTR): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterWindowMessageA", longArrayOf(lpstring)).toUInt()
}

public fun RegisterWindowMessageW(lpstring: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterWindowMessageW", longArrayOf(lpstring)).toUInt()
}

public fun RemoveMenu(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RemoveMenu", longArrayOf(hmenu, uposition.toLong(), uflags.toLong())).toInt()
}

public fun RemovePropA(hwnd: Foundation.HWND, lpstring: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "RemovePropA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring))
    return Foundation.HANDLE()
}

public fun RemovePropW(hwnd: Foundation.HWND, lpstring: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("user32.dll", "RemovePropW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring))
    return Foundation.HANDLE()
}

public fun ReplyMessage(lresult: Foundation.LRESULT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ReplyMessage", longArrayOf(Win32DynamicFfi.objectSlot(lresult))).toInt()
}

public fun ScrollDC(hdc: Graphics.Gdi.HDC, dx: Int, dy: Int, lprcscroll: Long, lprcclip: Long, hrgnupdate: Graphics.Gdi.HRGN, lprcupdate: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ScrollDC", longArrayOf(Win32DynamicFfi.objectSlot(hdc), dx.toLong(), dy.toLong(), lprcscroll, lprcclip, Win32DynamicFfi.objectSlot(hrgnupdate), lprcupdate)).toInt()
}

public fun ScrollWindow(hwnd: Foundation.HWND, xamount: Int, yamount: Int, lprect: Long, lpcliprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ScrollWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), xamount.toLong(), yamount.toLong(), lprect, lpcliprect)).toInt()
}

public fun ScrollWindowEx(hwnd: Foundation.HWND, dx: Int, dy: Int, prcscroll: Long, prcclip: Long, hrgnupdate: Graphics.Gdi.HRGN, prcupdate: Long, flags: SCROLL_WINDOW_FLAGS): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ScrollWindowEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dx.toLong(), dy.toLong(), prcscroll, prcclip, Win32DynamicFfi.objectSlot(hrgnupdate), prcupdate, flags.toLong())).toInt()
}

public fun SendDlgItemMessageA(hdlg: Foundation.HWND, niddlgitem: Int, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendDlgItemMessageA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun SendDlgItemMessageW(hdlg: Foundation.HWND, niddlgitem: Int, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendDlgItemMessageW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun SendMessageA(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendMessageA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun SendMessageCallbackA(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SendMessageCallbackA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), Win32DynamicFfi.objectSlot(lpresultcallback), dwdata.toLong())).toInt()
}

public fun SendMessageCallbackW(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, lpresultcallback: SENDASYNCPROC, dwdata: ULong): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SendMessageCallbackW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), Win32DynamicFfi.objectSlot(lpresultcallback), dwdata.toLong())).toInt()
}

public fun SendMessageTimeoutA(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendMessageTimeoutA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), fuflags.toLong(), utimeout.toLong(), lpdwresult))
    return Foundation.LRESULT()
}

public fun SendMessageTimeoutW(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, fuflags: SEND_MESSAGE_TIMEOUT_FLAGS, utimeout: UInt, lpdwresult: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendMessageTimeoutW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), fuflags.toLong(), utimeout.toLong(), lpdwresult))
    return Foundation.LRESULT()
}

public fun SendMessageW(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "SendMessageW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LRESULT()
}

public fun SendNotifyMessageA(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SendNotifyMessageA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun SendNotifyMessageW(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SendNotifyMessageW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), msg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun SetAdditionalForegroundBoostProcesses(toplevelwindow: Foundation.HWND, processhandlecount: UInt, processhandlearray: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetAdditionalForegroundBoostProcesses", longArrayOf(Win32DynamicFfi.objectSlot(toplevelwindow), processhandlecount.toLong(), processhandlearray)).toInt()
}

public fun SetCaretBlinkTime(umseconds: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetCaretBlinkTime", longArrayOf(umseconds.toLong())).toInt()
}

public fun SetCaretPos(x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetCaretPos", longArrayOf(x.toLong(), y.toLong())).toInt()
}

public fun SetClassLongA(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "SetClassLongA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong.toLong())).toUInt()
}

public fun SetClassLongPtrA(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong {
    return Win32DynamicFfi.invoke("user32.dll", "SetClassLongPtrA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong)).toULong()
}

public fun SetClassLongPtrW(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Long): ULong {
    return Win32DynamicFfi.invoke("user32.dll", "SetClassLongPtrW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong)).toULong()
}

public fun SetClassLongW(hwnd: Foundation.HWND, nindex: GET_CLASS_LONG_INDEX, dwnewlong: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "SetClassLongW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong.toLong())).toUInt()
}

public fun SetClassWord(hwnd: Foundation.HWND, nindex: Int, wnewword: UShort): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "SetClassWord", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), wnewword.toLong())).toUShort()
}

public fun SetCoalescableTimer(hwnd: Foundation.HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC, utolerancedelay: UInt): ULong {
    return Win32DynamicFfi.invoke("user32.dll", "SetCoalescableTimer", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nidevent.toLong(), uelapse.toLong(), Win32DynamicFfi.objectSlot(lptimerfunc), utolerancedelay.toLong())).toULong()
}

public fun SetCursor(hcursor: HCURSOR): HCURSOR {
    return Win32DynamicFfi.invoke("user32.dll", "SetCursor", longArrayOf(hcursor))
}

public fun SetCursorPos(x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetCursorPos", longArrayOf(x.toLong(), y.toLong())).toInt()
}

public fun SetDebugErrorLevel(dwlevel: UInt) {
    Win32DynamicFfi.invoke("user32.dll", "SetDebugErrorLevel", longArrayOf(dwlevel.toLong()))
}

public fun SetDlgItemInt(hdlg: Foundation.HWND, niddlgitem: Int, uvalue: UInt, bsigned: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDlgItemInt", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), uvalue.toLong(), bsigned.toLong())).toInt()
}

public fun SetDlgItemTextA(hdlg: Foundation.HWND, niddlgitem: Int, lpstring: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDlgItemTextA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), lpstring)).toInt()
}

public fun SetDlgItemTextW(hdlg: Foundation.HWND, niddlgitem: Int, lpstring: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDlgItemTextW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), niddlgitem.toLong(), lpstring)).toInt()
}

public fun SetForegroundWindow(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetForegroundWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun SetLayeredWindowAttributes(hwnd: Foundation.HWND, crkey: Foundation.COLORREF, balpha: UByte, dwflags: LAYERED_WINDOW_ATTRIBUTES_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetLayeredWindowAttributes", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(crkey), balpha.toLong(), dwflags.toLong())).toInt()
}

public fun SetMenu(hwnd: Foundation.HWND, hmenu: HMENU): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenu", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), hmenu)).toInt()
}

public fun SetMenuDefaultItem(hmenu: HMENU, uitem: UInt, fbypos: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenuDefaultItem", longArrayOf(hmenu, uitem.toLong(), fbypos.toLong())).toInt()
}

public fun SetMenuInfo(param0: HMENU, param1: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenuInfo", longArrayOf(param0, param1)).toInt()
}

public fun SetMenuItemBitmaps(hmenu: HMENU, uposition: UInt, uflags: MENU_ITEM_FLAGS, hbitmapunchecked: Graphics.Gdi.HBITMAP, hbitmapchecked: Graphics.Gdi.HBITMAP): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenuItemBitmaps", longArrayOf(hmenu, uposition.toLong(), uflags.toLong(), Win32DynamicFfi.objectSlot(hbitmapunchecked), Win32DynamicFfi.objectSlot(hbitmapchecked))).toInt()
}

public fun SetMenuItemInfoA(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenuItemInfoA", longArrayOf(hmenu, item.toLong(), fbypositon.toLong(), lpmii)).toInt()
}

public fun SetMenuItemInfoW(hmenu: HMENU, item: UInt, fbypositon: BOOL, lpmii: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMenuItemInfoW", longArrayOf(hmenu, item.toLong(), fbypositon.toLong(), lpmii)).toInt()
}

public fun SetMessageExtraInfo(lparam: Foundation.LPARAM): Foundation.LPARAM {
    Win32DynamicFfi.invoke("user32.dll", "SetMessageExtraInfo", longArrayOf(Win32DynamicFfi.objectSlot(lparam)))
    return Foundation.LPARAM()
}

public fun SetMessageQueue(cmessagesmax: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetMessageQueue", longArrayOf(cmessagesmax.toLong())).toInt()
}

public fun SetParent(hwndchild: Foundation.HWND, hwndnewparent: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "SetParent", longArrayOf(Win32DynamicFfi.objectSlot(hwndchild), Win32DynamicFfi.objectSlot(hwndnewparent)))
    return Foundation.HWND()
}

public fun SetPhysicalCursorPos(x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetPhysicalCursorPos", longArrayOf(x.toLong(), y.toLong())).toInt()
}

public fun SetProcessDPIAware(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetProcessDPIAware", longArrayOf()).toInt()
}

public fun SetProcessDefaultLayout(dwdefaultlayout: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetProcessDefaultLayout", longArrayOf(dwdefaultlayout.toLong())).toInt()
}

public fun SetPropA(hwnd: Foundation.HWND, lpstring: PCSTR, hdata: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetPropA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring, Win32DynamicFfi.objectSlot(hdata))).toInt()
}

public fun SetPropW(hwnd: Foundation.HWND, lpstring: PCWSTR, hdata: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetPropW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring, Win32DynamicFfi.objectSlot(hdata))).toInt()
}

public fun SetSystemCursor(hcur: HCURSOR, id: SYSTEM_CURSOR_ID): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetSystemCursor", longArrayOf(hcur, id.toLong())).toInt()
}

public fun SetTimer(hwnd: Foundation.HWND, nidevent: ULong, uelapse: UInt, lptimerfunc: TIMERPROC): ULong {
    return Win32DynamicFfi.invoke("user32.dll", "SetTimer", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nidevent.toLong(), uelapse.toLong(), Win32DynamicFfi.objectSlot(lptimerfunc))).toULong()
}

public fun SetWindowDisplayAffinity(hwnd: Foundation.HWND, dwaffinity: WINDOW_DISPLAY_AFFINITY): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowDisplayAffinity", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwaffinity.toLong())).toInt()
}

public fun SetWindowLongA(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowLongA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong.toLong())).toInt()
}

public fun SetWindowLongPtrA(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowLongPtrA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong))
}

public fun SetWindowLongPtrW(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Long): Long {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowLongPtrW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong))
}

public fun SetWindowLongW(hwnd: Foundation.HWND, nindex: WINDOW_LONG_PTR_INDEX, dwnewlong: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowLongW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), dwnewlong.toLong())).toInt()
}

public fun SetWindowPlacement(hwnd: Foundation.HWND, lpwndpl: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowPlacement", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpwndpl)).toInt()
}

public fun SetWindowPos(hwnd: Foundation.HWND, hwndinsertafter: Foundation.HWND, x: Int, y: Int, cx: Int, cy: Int, uflags: SET_WINDOW_POS_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowPos", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hwndinsertafter), x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), uflags.toLong())).toInt()
}

public fun SetWindowTextA(hwnd: Foundation.HWND, lpstring: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowTextA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring)).toInt()
}

public fun SetWindowTextW(hwnd: Foundation.HWND, lpstring: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowTextW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lpstring)).toInt()
}

public fun SetWindowWord(hwnd: Foundation.HWND, nindex: Int, wnewword: UShort): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowWord", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), nindex.toLong(), wnewword.toLong())).toUShort()
}

public fun SetWindowsHookA(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowsHookA", longArrayOf(nfiltertype.toLong(), Win32DynamicFfi.objectSlot(pfnfilterproc)))
}

public fun SetWindowsHookExA(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: Foundation.HINSTANCE, dwthreadid: UInt): HHOOK {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowsHookExA", longArrayOf(idhook.toLong(), Win32DynamicFfi.objectSlot(lpfn), Win32DynamicFfi.objectSlot(hmod), dwthreadid.toLong()))
}

public fun SetWindowsHookExW(idhook: WINDOWS_HOOK_ID, lpfn: HOOKPROC, hmod: Foundation.HINSTANCE, dwthreadid: UInt): HHOOK {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowsHookExW", longArrayOf(idhook.toLong(), Win32DynamicFfi.objectSlot(lpfn), Win32DynamicFfi.objectSlot(hmod), dwthreadid.toLong()))
}

public fun SetWindowsHookW(nfiltertype: Int, pfnfilterproc: HOOKPROC): HHOOK {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowsHookW", longArrayOf(nfiltertype.toLong(), Win32DynamicFfi.objectSlot(pfnfilterproc)))
}

public fun ShowCaret(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShowCaret", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun ShowCursor(bshow: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ShowCursor", longArrayOf(bshow.toLong())).toInt()
}

public fun ShowOwnedPopups(hwnd: Foundation.HWND, fshow: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShowOwnedPopups", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), fshow.toLong())).toInt()
}

public fun ShowWindow(hwnd: Foundation.HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShowWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ncmdshow.toLong())).toInt()
}

public fun ShowWindowAsync(hwnd: Foundation.HWND, ncmdshow: SHOW_WINDOW_CMD): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShowWindowAsync", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ncmdshow.toLong())).toInt()
}

public fun SoundSentry(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SoundSentry", longArrayOf()).toInt()
}

public fun SwitchToThisWindow(hwnd: Foundation.HWND, funknown: BOOL) {
    Win32DynamicFfi.invoke("user32.dll", "SwitchToThisWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), funknown.toLong()))
}

public fun SystemParametersInfoA(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SystemParametersInfoA", longArrayOf(uiaction.toLong(), uiparam.toLong(), pvparam, fwinini.toLong())).toInt()
}

public fun SystemParametersInfoW(uiaction: SYSTEM_PARAMETERS_INFO_ACTION, uiparam: UInt, pvparam: Long, fwinini: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SystemParametersInfoW", longArrayOf(uiaction.toLong(), uiparam.toLong(), pvparam, fwinini.toLong())).toInt()
}

public fun TileWindows(hwndparent: Foundation.HWND, whow: TILE_WINDOWS_HOW, lprect: Long, ckids: UInt, lpkids: Long): UShort {
    return Win32DynamicFfi.invoke("user32.dll", "TileWindows", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), whow.toLong(), lprect, ckids.toLong(), lpkids)).toUShort()
}

public fun TrackPopupMenu(hmenu: HMENU, uflags: TRACK_POPUP_MENU_FLAGS, x: Int, y: Int, nreserved: Int, hwnd: Foundation.HWND, prcrect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "TrackPopupMenu", longArrayOf(hmenu, uflags.toLong(), x.toLong(), y.toLong(), nreserved.toLong(), Win32DynamicFfi.objectSlot(hwnd), prcrect)).toInt()
}

public fun TrackPopupMenuEx(hmenu: HMENU, uflags: UInt, x: Int, y: Int, hwnd: Foundation.HWND, lptpm: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "TrackPopupMenuEx", longArrayOf(hmenu, uflags.toLong(), x.toLong(), y.toLong(), Win32DynamicFfi.objectSlot(hwnd), lptpm)).toInt()
}

public fun TranslateAcceleratorA(hwnd: Foundation.HWND, hacctable: HACCEL, lpmsg: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "TranslateAcceleratorA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), hacctable, lpmsg)).toInt()
}

public fun TranslateAcceleratorW(hwnd: Foundation.HWND, hacctable: HACCEL, lpmsg: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "TranslateAcceleratorW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), hacctable, lpmsg)).toInt()
}

public fun TranslateMDISysAccel(hwndclient: Foundation.HWND, lpmsg: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "TranslateMDISysAccel", longArrayOf(Win32DynamicFfi.objectSlot(hwndclient), lpmsg)).toInt()
}

public fun TranslateMessage(lpmsg: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "TranslateMessage", longArrayOf(lpmsg)).toInt()
}

public fun UnhookWindowsHook(ncode: Int, pfnfilterproc: HOOKPROC): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnhookWindowsHook", longArrayOf(ncode.toLong(), Win32DynamicFfi.objectSlot(pfnfilterproc))).toInt()
}

public fun UnhookWindowsHookEx(hhk: HHOOK): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnhookWindowsHookEx", longArrayOf(hhk)).toInt()
}

public fun UnregisterClassA(lpclassname: PCSTR, hinstance: Foundation.HINSTANCE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterClassA", longArrayOf(lpclassname, Win32DynamicFfi.objectSlot(hinstance))).toInt()
}

public fun UnregisterClassW(lpclassname: PCWSTR, hinstance: Foundation.HINSTANCE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterClassW", longArrayOf(lpclassname, Win32DynamicFfi.objectSlot(hinstance))).toInt()
}

public fun UnregisterDeviceNotification(handle: HDEVNOTIFY): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterDeviceNotification", longArrayOf(handle)).toInt()
}

public fun UpdateLayeredWindow(hwnd: Foundation.HWND, hdcdst: Graphics.Gdi.HDC, pptdst: Long, psize: Long, hdcsrc: Graphics.Gdi.HDC, pptsrc: Long, crkey: Foundation.COLORREF, pblend: Long, dwflags: UPDATE_LAYERED_WINDOW_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UpdateLayeredWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdcdst), pptdst, psize, Win32DynamicFfi.objectSlot(hdcsrc), pptsrc, Win32DynamicFfi.objectSlot(crkey), pblend, dwflags.toLong())).toInt()
}

public fun UpdateLayeredWindowIndirect(hwnd: Foundation.HWND, pulwinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UpdateLayeredWindowIndirect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pulwinfo)).toInt()
}

public fun WaitMessage(): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "WaitMessage", longArrayOf()).toInt()
}

public fun WindowFromPhysicalPoint(point: Foundation.POINT): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "WindowFromPhysicalPoint", longArrayOf(Win32DynamicFfi.objectSlot(point)))
    return Foundation.HWND()
}

public fun WindowFromPoint(point: Foundation.POINT): Foundation.HWND {
    Win32DynamicFfi.invoke("user32.dll", "WindowFromPoint", longArrayOf(Win32DynamicFfi.objectSlot(point)))
    return Foundation.HWND()
}

public fun wsprintfA(param0: PSTR, param1: PCSTR, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "wsprintfA", longArrayOf(param0, param1) + variadicArgs).toInt()
}

public fun wsprintfW(param0: PWSTR, param1: PCWSTR, vararg variadicArgs: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "wsprintfW", longArrayOf(param0, param1) + variadicArgs).toInt()
}

public fun wvsprintfA(param0: PSTR, param1: PCSTR, arglist: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "wvsprintfA", longArrayOf(param0, param1, arglist)).toInt()
}

public fun wvsprintfW(param0: PWSTR, param1: PCWSTR, arglist: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "wvsprintfW", longArrayOf(param0, param1, arglist)).toInt()
}
