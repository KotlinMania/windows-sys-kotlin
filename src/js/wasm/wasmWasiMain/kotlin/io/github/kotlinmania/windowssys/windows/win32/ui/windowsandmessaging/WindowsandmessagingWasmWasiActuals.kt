@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.WaitEvent
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun adjustWindowRect(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect")

public actual fun adjustWindowRectEx(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(dwprocessid: Int): Int

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(dwprocessid.toInt())

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingAnimateWindow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingAnyPopup")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingAnyPopup(): Int

public actual fun anyPopup(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingAnyPopup()

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingAppendMenuA")

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingAppendMenuW")

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows")

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos")

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingBringWindowToTop")

public actual fun calculatePopupWindowPosition(anchorpoint: ConstPtr, windowsize: ConstPtr, flags: UInt, excluderect: ConstPtr, popupwindowposition: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition")

public actual fun callMsgFilterA(lpmsg: ConstPtr, ncode: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA")

public actual fun callMsgFilterW(lpmsg: ConstPtr, ncode: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW")

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCallNextHookEx")

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCallWindowProcA")

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCallWindowProcW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingCancelShutdown")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingCancelShutdown(): Int

public actual fun cancelShutdown(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingCancelShutdown()

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCascadeWindows")

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingChangeMenuA")

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingChangeMenuW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(message: Int, dwflag: Int): Int

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(message.toInt(), dwflag.toInt())

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx")

public actual fun charLowerA(lpsz: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharLowerA")

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA")

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW")

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharLowerW")

public actual fun charNextA(lpsz: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharNextA")

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharNextExA")

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharNextW")

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharPrevA")

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharPrevExA")

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharPrevW")

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharToOemA")

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA")

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW")

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharToOemW")

public actual fun charUpperA(lpsz: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharUpperA")

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA")

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW")

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCharUpperW")

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCheckMenuItem")

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem")

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingChildWindowFromPoint")

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingChildWindowFromPointEx")

public actual fun clipCursor(lprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingClipCursor")

public actual fun closeWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCloseWindow")

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA")

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW")

public actual fun copyIcon(hicon: Hicon): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCopyIcon")

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCopyImage")

public actual fun createAcceleratorTableA(paccel: ConstPtr, caccel: Int): Haccel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA")

public actual fun createAcceleratorTableW(paccel: ConstPtr, caccel: Int): Haccel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW")

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateCaret")

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: ConstPtr, pvxorplane: ConstPtr): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateCursor")

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA")

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW")

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA")

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW")

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: ConstPtr, lpbxorbits: ConstPtr): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateIcon")

public actual fun createIconFromResource(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource")

public actual fun createIconFromResourceEx(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx")

public actual fun createIconIndirect(piconinfo: ConstPtr): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect")

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA")

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW")

public actual fun createMenu(): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateMenu")

public actual fun createPopupMenu(): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu")

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer")

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateWindowExA")

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingCreateWindowExW")

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefDlgProcA")

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefDlgProcW")

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefFrameProcA")

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefFrameProcW")

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA")

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW")

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefWindowProcA")

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDefWindowProcW")

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDeferWindowPos")

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDeleteMenu")

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow")

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingDestroyCaret")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingDestroyCaret(): Int

public actual fun destroyCaret(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingDestroyCaret()

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyCursor")

public actual fun destroyIcon(hicon: Hicon): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyIcon")

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults")

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyMenu")

public actual fun destroyResourceIndexer(resourceindexer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer")

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDestroyWindow")

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA")

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW")

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA")

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting(): Unit

public actual fun disableProcessWindowsGhosting(): Unit =
    wasiWindowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()

public actual fun dispatchMessageA(lpmsg: ConstPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDispatchMessageA")

public actual fun dispatchMessageW(lpmsg: ConstPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDispatchMessageW")

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDragObject")

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDrawIcon")

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDrawIconEx")

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingDrawMenuBar")

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnableMenuItem")

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos")

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEndDialog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingEndMenu")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingEndMenu(): Int

public actual fun endMenu(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingEndMenu()

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumChildWindows")

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumPropsA")

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumPropsExA")

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumPropsExW")

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumPropsW")

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows")

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingEnumWindows")

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingFindWindowA")

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingFindWindowExA")

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingFindWindowExW")

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingFindWindowW")

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingFlashWindow")

public actual fun flashWindowEx(pfwi: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingFlashWindowEx")

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA")

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW")

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetAncestor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime(): Int

public actual fun getCaretBlinkTime(): UInt =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime().toUInt()

public actual fun getCaretPos(lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetCaretPos")

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassInfoA")

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA")

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW")

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassInfoW")

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassLongA")

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA")

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW")

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassLongW")

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassNameA")

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassNameW")

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClassWord")

public actual fun getClientRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClientRect")

public actual fun getClipCursor(lprect: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetClipCursor")

public actual fun getCursor(): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetCursor")

public actual fun getCursorInfo(pci: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetCursorInfo")

public actual fun getCursorPos(lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetCursorPos")

public actual fun getDesktopWindow(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits(): Int

public actual fun getDialogBaseUnits(): Int =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits()

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID")

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetDlgItem")

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: MutPtr, bsigned: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt")

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA")

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW")

public actual fun getForegroundWindow(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow")

public actual fun getGUIThreadInfo(idthread: UInt, pgui: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo")

public actual fun getIconInfo(hicon: Hicon, piconinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetIconInfo")

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA")

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetInputState")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetInputState(): Int

public actual fun getInputState(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetInputState()

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup")

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: MutPtr, pbalpha: MutPtr, pdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes")

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenu")

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions(): Int

public actual fun getMenuCheckMarkDimensions(): Int =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions()

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem")

public actual fun getMenuInfo(param0: Hmenu, param1: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuInfo")

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount")

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuItemID")

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA")

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW")

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect")

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuState")

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuStringA")

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMenuStringW")

public actual fun getMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMessageA")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo(): Long

public actual fun getMessageExtraInfo(): Lparam =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetMessagePos")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetMessagePos(): Int

public actual fun getMessagePos(): UInt =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetMessagePos().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetMessageTime")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetMessageTime(): Int

public actual fun getMessageTime(): Int =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetMessageTime()

public actual fun getMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetMessageW")

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem")

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem")

public actual fun getParent(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetParent")

public actual fun getPhysicalCursorPos(lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos")

public actual fun getProcessDefaultLayout(pdwdefaultlayout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout")

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetPropA")

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetPropW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetQueueStatus")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(flags: Int): Int

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(flags.toInt()).toUInt()

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo")

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetScrollInfo")

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetScrollPos")

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: MutPtr, lpmaxpos: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetScrollRange")

public actual fun getShellWindow(): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetShellWindow")

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetSubMenu")

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetSystemMenu")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(nindex: Int): Int

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    wasiWindowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(nindex)

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo")

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetTopWindow")

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindow")

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity")

public actual fun getWindowInfo(hwnd: Hwnd, pwi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowInfo")

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowLongA")

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA")

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW")

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowLongW")

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA")

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW")

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement")

public actual fun getWindowRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowRect")

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowTextA")

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA")

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW")

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowTextW")

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId")

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingGetWindowWord")

public actual fun hideCaret(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingHideCaret")

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingInSendMessage")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingInSendMessage(): Int

public actual fun inSendMessage(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingInSendMessage()

public actual fun inSendMessageEx(lpreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInSendMessageEx")

public actual fun indexFilePath(resourceindexer: ConstPtr, filepath: Pcwstr, ppresourceuri: MutPtr, pqualifiercount: MutPtr, ppqualifiers: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIndexFilePath")

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor")

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInsertMenuA")

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA")

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW")

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInsertMenuW")

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(ch: Int): Int

public actual fun isCharAlphaA(ch: Byte): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(ch: Int): Int

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(ch: Int): Int

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(ch: Int): Int

public actual fun isCharAlphaW(ch: UShort): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharLowerA")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(ch: Int): Int

public actual fun isCharLowerA(ch: Byte): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharUpperA")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(ch: Int): Int

public actual fun isCharUpperA(ch: Byte): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsCharUpperW")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(ch: Int): Int

public actual fun isCharUpperW(ch: UShort): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(ch.toInt())

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsChild")

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA")

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsGUIThread")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsGUIThread(bconvert: Int): Int

public actual fun isGUIThread(bconvert: Bool): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsGUIThread(bconvert)

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow")

public actual fun isIconic(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsIconic")

public actual fun isMenu(hmenu: Hmenu): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsMenu")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware(): Int

public actual fun isProcessDPIAware(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware()

public actual fun isWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsWindow")

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsWindowArranged")

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode")

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsWindowVisible")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingIsWow64Message")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingIsWow64Message(): Int

public actual fun isWow64Message(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingIsWow64Message()

public actual fun isZoomed(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingIsZoomed")

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingKillTimer")

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA")

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW")

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadCursorA")

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA")

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW")

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadCursorW")

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadIconA")

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadIconW")

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadImageA")

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadImageW")

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadMenuA")

public actual fun loadMenuIndirectA(lpmenutemplate: ConstPtr): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA")

public actual fun loadMenuIndirectW(lpmenutemplate: ConstPtr): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW")

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadMenuW")

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadStringA")

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLoadStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(ulockcode: Int): Int

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(ulockcode.toInt())

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint")

public actual fun lookupIconIdFromDirectory(presbits: ConstPtr, ficon: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory")

public actual fun lookupIconIdFromDirectoryEx(presbits: ConstPtr, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx")

public actual fun mapDialogRect(hdlg: Hwnd, lprect: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMapDialogRect")

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMenuItemFromPoint")

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMessageBoxA")

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMessageBoxExA")

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMessageBoxExW")

public actual fun messageBoxIndirectA(lpmbp: ConstPtr): MessageboxResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA")

public actual fun messageBoxIndirectW(lpmbp: ConstPtr): MessageboxResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW")

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMessageBoxW")

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingModifyMenuA")

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingModifyMenuW")

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMoveWindow")

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig")

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory")

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceFile")

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: MutPtr, outputprisize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceFileInMemory")

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceFileWithChecksum")

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer")

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: ConstPtr, prisize: UInt, indexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData")

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: ConstPtr, schemaxmlsize: UInt, indexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile")

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags")

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmDestroyIndexerAndMessages")

public actual fun mrmDumpPriDataInMemory(inputpridata: ConstPtr, inputprisize: UInt, schemapridata: ConstPtr, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory")

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile")

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory")

public actual fun mrmFreeMemory(data: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory")

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum")

public actual fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: ConstPtr, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmIndexEmbeddedData")

public actual fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmIndexFile")

public actual fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmIndexFileAutoQualifiers")

public actual fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmIndexResourceContainerAutoQualifiers")

public actual fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmIndexString")

public actual fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: MutPtr, nummsgs: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMrmPeekResourceIndexerMessages")

public actual fun msgWaitForMultipleObjects(ncount: UInt, phandles: ConstPtr, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects")

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: ConstPtr, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx")

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingOemToCharA")

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA")

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW")

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingOemToCharW")

public actual fun openIcon(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingOpenIcon")

public actual fun peekMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPeekMessageA")

public actual fun peekMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPeekMessageW")

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint")

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPostMessageA")

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPostMessageW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingPostQuitMessage")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(nexitcode: Int): Unit

public actual fun postQuitMessage(nexitcode: Int): Unit =
    wasiWindowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(nexitcode)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(idthread: Int, msg: Int, wparam: Long, lparam: Long): Int

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toLong(), lparam)

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA")

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW")

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRealChildWindowFromPoint")

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA")

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW")

public actual fun registerClassA(lpwndclass: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterClassA")

public actual fun registerClassExA(param0: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterClassExA")

public actual fun registerClassExW(param0: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterClassExW")

public actual fun registerClassW(lpwndclass: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterClassW")

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA")

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW")

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification")

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow")

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA")

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW")

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRemoveMenu")

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRemovePropA")

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingRemovePropW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingReplyMessage")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingReplyMessage(lresult: Long): Int

public actual fun replyMessage(lresult: Lresult): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingReplyMessage(lresult)

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: ConstPtr, lprcclip: ConstPtr, hrgnupdate: Hrgn, lprcupdate: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingScrollDC")

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: ConstPtr, lpcliprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingScrollWindow")

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: ConstPtr, prcclip: ConstPtr, hrgnupdate: Hrgn, prcupdate: MutPtr, flags: ScrollWindowFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingScrollWindowEx")

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA")

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW")

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendMessageA")

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA")

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW")

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA")

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW")

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendMessageW")

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA")

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW")

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(umseconds: Int): Int

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(umseconds.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetCaretPos")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetCaretPos(x: Int, y: Int): Int

public actual fun setCaretPos(x: Int, y: Int): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetCaretPos(x, y)

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetClassLongA")

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA")

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW")

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetClassLongW")

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetClassWord")

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer")

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetCursor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetCursorPos")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetCursorPos(x: Int, y: Int): Int

public actual fun setCursorPos(x: Int, y: Int): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetCursorPos(x, y)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(dwlevel: Int): Unit

public actual fun setDebugErrorLevel(dwlevel: UInt): Unit =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(dwlevel.toInt())

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt")

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA")

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW")

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow")

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes")

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetMenu")

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem")

public actual fun setMenuInfo(param0: Hmenu, param1: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetMenuInfo")

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps")

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA")

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(lparam: Long): Long

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(lparam)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetMessageQueue")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(cmessagesmax: Int): Int

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(cmessagesmax)

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetParent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(x: Int, y: Int): Int

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(x, y)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware(): Int

public actual fun setProcessDPIAware(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(dwdefaultlayout: Int): Int

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(dwdefaultlayout.toInt())

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetPropA")

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetPropW")

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetSystemCursor")

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetTimer")

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity")

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowLongA")

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA")

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW")

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowLongW")

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement")

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowPos")

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowTextA")

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowTextW")

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowWord")

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA")

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA")

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW")

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW")

public actual fun showCaret(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingShowCaret")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingShowCursor")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingShowCursor(bshow: Int): Int

public actual fun showCursor(bshow: Bool): Int =
    wasiWindowssysWindowsWin32UiWindowsandmessagingShowCursor(bshow)

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups")

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingShowWindow")

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingShowWindowAsync")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingSoundSentry")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingSoundSentry(): Int

public actual fun soundSentry(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingSoundSentry()

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow")

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA")

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW")

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTileWindows")

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu")

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx")

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA")

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW")

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel")

public actual fun translateMessage(lpmsg: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingTranslateMessage")

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook")

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx")

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUnregisterClassA")

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUnregisterClassW")

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification")

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: ConstPtr, psize: ConstPtr, hdcsrc: Hdc, pptsrc: ConstPtr, crkey: Colorref, pblend: ConstPtr, dwflags: UpdateLayeredWindowFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow")

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiWindowsandmessagingWaitMessage")
private external fun wasiWindowssysWindowsWin32UiWindowsandmessagingWaitMessage(): Int

public actual fun waitMessage(): Bool =
    wasiWindowssysWindowsWin32UiWindowsandmessagingWaitMessage()

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingWindowFromPhysicalPoint")

public actual fun windowFromPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingWindowFromPoint")

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingWsprintfA")

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingWsprintfW")

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingWvsprintfA")

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiWindowsandmessagingWvsprintfW")
