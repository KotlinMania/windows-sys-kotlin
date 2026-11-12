@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32UiWindowsandmessagingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun adjustWindowRect(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect(lprect.rawAddress.toString(), dwstyle.toInt(), bmenu) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustWindowRectEx(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx(lprect.rawAddress.toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAnimateWindow(hwnd.rawAddress.toString(), dwtime.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun anyPopup(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAnyPopup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAppendMenuA(hmenu.rawAddress.toString(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingAppendMenuW(hmenu.rawAddress.toString(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows(hwnd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos(nnumwindows) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingBringWindowToTop(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calculatePopupWindowPosition(anchorpoint: ConstPtr, windowsize: ConstPtr, flags: UInt, excluderect: ConstPtr, popupwindowposition: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition(anchorpoint.rawAddress.toString(), windowsize.rawAddress.toString(), flags.toInt(), excluderect.rawAddress.toString(), popupwindowposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callMsgFilterA(lpmsg: ConstPtr, ncode: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA(lpmsg.rawAddress.toString(), ncode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callMsgFilterW(lpmsg: ConstPtr, ncode: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW(lpmsg.rawAddress.toString(), ncode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCallNextHookEx(hhk.rawAddress.toString(), ncode, wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCallWindowProcA(0L.toString(), hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCallWindowProcW(0L.toString(), hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelShutdown(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCancelShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCascadeWindows(hwndparent.rawAddress.toString(), whow.toInt(), lprect.rawAddress.toString(), ckids.toInt(), lpkids.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingChangeMenuA(hmenu.rawAddress.toString(), cmd.toInt(), lpsznewitem.rawAddress.toString(), cmdinsert.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingChangeMenuW(hmenu.rawAddress.toString(), cmd.toInt(), lpsznewitem.rawAddress.toString(), cmdinsert.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(message.toInt(), dwflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx(hwnd.rawAddress.toString(), message.toInt(), action.toInt(), pchangefilterstruct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerA(lpsz: Pstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharLowerA(lpsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA(lpsz.rawAddress.toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW(lpsz.rawAddress.toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharLowerW(lpsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextA(lpsz: Pcstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharNextA(lpsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharNextExA(codepage.toInt(), lpcurrentchar.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharNextW(lpsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharPrevA(lpszstart.rawAddress.toString(), lpszcurrent.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharPrevExA(codepage.toInt(), lpstart.rawAddress.toString(), lpcurrentchar.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharPrevW(lpszstart.rawAddress.toString(), lpszcurrent.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharToOemA(psrc.rawAddress.toString(), pdst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharToOemW(psrc.rawAddress.toString(), pdst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperA(lpsz: Pstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharUpperA(lpsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA(lpsz.rawAddress.toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW(lpsz.rawAddress.toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCharUpperW(lpsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCheckMenuItem(hmenu.rawAddress.toString(), uidcheckitem.toInt(), ucheck.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem(hmenu.rawAddress.toString(), first.toInt(), last.toInt(), check.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipCursor(lprect: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingClipCursor(lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCloseWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA(haccelsrc.rawAddress.toString(), lpacceldst.rawAddress.toString(), caccelentries) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW(haccelsrc.rawAddress.toString(), lpacceldst.rawAddress.toString(), caccelentries) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyIcon(hicon: Hicon): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCopyIcon(hicon.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCopyImage(h.rawAddress.toString(), type.toInt(), cx, cy, flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAcceleratorTableA(paccel: ConstPtr, caccel: Int): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA(paccel.rawAddress.toString(), caccel) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAcceleratorTableW(paccel: ConstPtr, caccel: Int): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW(paccel.rawAddress.toString(), caccel) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateCaret(hwnd.rawAddress.toString(), hbitmap.rawAddress.toString(), nwidth, nheight) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: ConstPtr, pvxorplane: ConstPtr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateCursor(hinst.rawAddress.toString(), xhotspot, yhotspot, nwidth, nheight, pvandplane.rawAddress.toString(), pvxorplane.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA(hinstance.rawAddress.toString(), lptemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW(hinstance.rawAddress.toString(), lptemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: ConstPtr, lpbxorbits: ConstPtr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateIcon(hinstance.rawAddress.toString(), nwidth, nheight, cplanes.toInt(), cbitspixel.toInt(), lpbandbits.rawAddress.toString(), lpbxorbits.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconFromResource(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource(presbits.rawAddress.toString(), dwressize.toInt(), ficon, dwver.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconFromResourceEx(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx(presbits.rawAddress.toString(), dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconIndirect(piconinfo: ConstPtr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect(piconinfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), lparam.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), lparam.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMenu(): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateMenu() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPopupMenu(): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer(projectroot.rawAddress.toString(), extensiondllpath.rawAddress.toString(), ppresourceindexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateWindowExA(dwexstyle.toInt(), lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hmenu.rawAddress.toString(), hinstance.rawAddress.toString(), lpparam.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingCreateWindowExW(dwexstyle.toInt(), lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hmenu.rawAddress.toString(), hinstance.rawAddress.toString(), lpparam.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefDlgProcA(hdlg.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefDlgProcW(hdlg.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefFrameProcA(hwnd.rawAddress.toString(), hwndmdiclient.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefFrameProcW(hwnd.rawAddress.toString(), hwndmdiclient.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA(hwnd.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW(hwnd.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefWindowProcA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDefWindowProcW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDeferWindowPos(hwinposinfo.rawAddress.toString(), hwnd.rawAddress.toString(), hwndinsertafter.rawAddress.toString(), x, y, cx, cy, uflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDeleteMenu(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable(haccel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCaret(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyCaret() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyCursor(hcursor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyIcon(hicon: Hicon): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyIcon(hicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: ConstPtr) {
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) {
        windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults(resourceuri.rawAddress.toString(), qualifiercount.toInt(), qualifiers.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyMenu(hmenu.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyResourceIndexer(resourceindexer: ConstPtr) {
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) {
        windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer(resourceindexer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDestroyWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA(hinstance.rawAddress.toString(), hdialogtemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW(hinstance.rawAddress.toString(), hdialogtemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableProcessWindowsGhosting() {
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) {
        windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dispatchMessageA(lpmsg: ConstPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDispatchMessageA(lpmsg.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispatchMessageW(lpmsg: ConstPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDispatchMessageW(lpmsg.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDragObject(hwndparent.rawAddress.toString(), hwndfrom.rawAddress.toString(), fmt.toInt(), data.toString(), hcur.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDrawIcon(hdc.rawAddress.toString(), x, y, hicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDrawIconEx(hdc.rawAddress.toString(), xleft, ytop, hicon.rawAddress.toString(), cxwidth, cywidth, istepifanicur.toInt(), hbrflickerfreedraw.rawAddress.toString(), diflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingDrawMenuBar(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnableMenuItem(hmenu.rawAddress.toString(), uidenableitem.toInt(), uenable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos(hwinposinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEndDialog(hdlg.rawAddress.toString(), nresult.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endMenu(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEndMenu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumChildWindows(hwndparent.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumPropsA(hwnd.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumPropsExA(hwnd.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumPropsExW(hwnd.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumPropsW(hwnd.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows(dwthreadid.toInt(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingEnumWindows(0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingFindWindowA(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingFindWindowExA(hwndparent.rawAddress.toString(), hwndchildafter.rawAddress.toString(), lpszclass.rawAddress.toString(), lpszwindow.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingFindWindowExW(hwndparent.rawAddress.toString(), hwndchildafter.rawAddress.toString(), lpszclass.rawAddress.toString(), lpszwindow.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingFindWindowW(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingFlashWindow(hwnd.rawAddress.toString(), binvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flashWindowEx(pfwi: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingFlashWindowEx(pfwi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA(hwnd.rawAddress.toString(), iitem, pati.rawAddress.toString(), pszitemtext.rawAddress.toString(), cchitemtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW(hwnd.rawAddress.toString(), iitem, pati.rawAddress.toString(), pszitemtext.rawAddress.toString(), cchitemtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetAncestor(hwnd.rawAddress.toString(), gaflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCaretBlinkTime(): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCaretPos(lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetCaretPos(lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoA(hinstance.rawAddress.toString(), lpclassname.rawAddress.toString(), lpwndclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA(hinstance.rawAddress.toString(), lpszclass.rawAddress.toString(), lpwcx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW(hinstance.rawAddress.toString(), lpszclass.rawAddress.toString(), lpwcx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoW(hinstance.rawAddress.toString(), lpclassname.rawAddress.toString(), lpwndclass.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassLongA(hwnd.rawAddress.toString(), nindex) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA(hwnd.rawAddress.toString(), nindex) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW(hwnd.rawAddress.toString(), nindex) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassLongW(hwnd.rawAddress.toString(), nindex) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassNameA(hwnd.rawAddress.toString(), lpclassname.rawAddress.toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassNameW(hwnd.rawAddress.toString(), lpclassname.rawAddress.toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClassWord(hwnd.rawAddress.toString(), nindex) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClientRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClientRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipCursor(lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetClipCursor(lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursor(): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetCursor() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursorInfo(pci: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetCursorInfo(pci.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursorPos(lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetCursorPos(lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDesktopWindow(): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogBaseUnits(): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDlgItem(hdlg.rawAddress.toString(), niddlgitem) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: MutPtr, bsigned: Bool): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt(hdlg.rawAddress.toString(), niddlgitem, lptranslated.rawAddress.toString(), bsigned) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString(), cchmax) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString(), cchmax) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getForegroundWindow(): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGUIThreadInfo(idthread: UInt, pgui: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo(idthread.toInt(), pgui.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfo(hicon: Hicon, piconinfo: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetIconInfo(hicon.rawAddress.toString(), piconinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA(hicon.rawAddress.toString(), piconinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW(hicon.rawAddress.toString(), piconinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInputState(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetInputState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: MutPtr, pbalpha: MutPtr, pdwflags: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes(hwnd.rawAddress.toString(), pcrkey.rawAddress.toString(), pbalpha.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenu(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo(hwnd.rawAddress.toString(), idobject, iditem, pmbi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuCheckMarkDimensions(): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem(hmenu.rawAddress.toString(), fbypos.toInt(), gmdiflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuInfo(param0: Hmenu, param1: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuInfo(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount(hmenu.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemID(hmenu.rawAddress.toString(), npos) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmii.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmii.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect(hwnd.rawAddress.toString(), hmenu.rawAddress.toString(), uitem.toInt(), lprcitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuState(hmenu.rawAddress.toString(), uid.toInt(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuStringA(hmenu.rawAddress.toString(), uiditem.toInt(), lpstring.rawAddress.toString(), cchmax, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMenuStringW(hmenu.rawAddress.toString(), uiditem.toInt(), lpstring.rawAddress.toString(), cchmax, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMessageA(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageExtraInfo(): Lparam =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessagePos(): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMessagePos() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageTime(): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMessageTime() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetMessageW(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem(hdlg.rawAddress.toString(), hctl.rawAddress.toString(), bprevious) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem(hdlg.rawAddress.toString(), hctl.rawAddress.toString(), bprevious) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getParent(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetParent(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicalCursorPos(lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos(lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultLayout(pdwdefaultlayout: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout(pdwdefaultlayout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetPropA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetPropW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo(hwnd.rawAddress.toString(), idobject, psbi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetScrollInfo(hwnd.rawAddress.toString(), nbar, lpsi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetScrollPos(hwnd.rawAddress.toString(), nbar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: MutPtr, lpmaxpos: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetScrollRange(hwnd.rawAddress.toString(), nbar, lpminpos.rawAddress.toString(), lpmaxpos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShellWindow(): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetShellWindow() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetSubMenu(hmenu.rawAddress.toString(), npos) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetSystemMenu(hwnd.rawAddress.toString(), brevert) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(nindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo(hwnd.rawAddress.toString(), pti.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetTopWindow(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindow(hwnd.rawAddress.toString(), ucmd.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity(hwnd.rawAddress.toString(), pdwaffinity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowInfo(hwnd: Hwnd, pwi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowInfo(hwnd.rawAddress.toString(), pwi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongA(hwnd.rawAddress.toString(), nindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA(hwnd.rawAddress.toString(), nindex) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW(hwnd.rawAddress.toString(), nindex) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongW(hwnd.rawAddress.toString(), nindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA(hwnd.rawAddress.toString(), pszfilename.rawAddress.toString(), cchfilenamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW(hwnd.rawAddress.toString(), pszfilename.rawAddress.toString(), cchfilenamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement(hwnd.rawAddress.toString(), lpwndpl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: MutPtr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId(hwnd.rawAddress.toString(), lpdwprocessid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingGetWindowWord(hwnd.rawAddress.toString(), nindex) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hideCaret(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingHideCaret(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem(hwnd.rawAddress.toString(), hmenu.rawAddress.toString(), uidhiliteitem.toInt(), uhilite.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inSendMessage(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInSendMessage() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inSendMessageEx(lpreserved: ConstPtr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInSendMessageEx(lpreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun indexFilePath(resourceindexer: ConstPtr, filepath: Pcwstr, ppresourceuri: MutPtr, pqualifiercount: MutPtr, ppqualifiers: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIndexFilePath(resourceindexer.rawAddress.toString(), filepath.rawAddress.toString(), ppresourceuri.rawAddress.toString(), pqualifiercount.rawAddress.toString(), ppqualifiers.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor(hwnd.rawAddress.toString(), hwndinherit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInsertMenuA(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInsertMenuW(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText(hwnd.rawAddress.toString(), pstring.rawAddress.toString(), cchmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaW(ch: UShort): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharLowerA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharUpperA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharUpperW(ch: UShort): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsChild(hwndparent.rawAddress.toString(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA(hdlg.rawAddress.toString(), lpmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW(hdlg.rawAddress.toString(), lpmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIThread(bconvert: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsGUIThread(bconvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isIconic(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsIconic(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMenu(hmenu: Hmenu): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsMenu(hmenu.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessDPIAware(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsWindowArranged(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsWindowVisible(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Message(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsWow64Message() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isZoomed(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingIsZoomed(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingKillTimer(hwnd.rawAddress.toString(), uidevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA(hinstance.rawAddress.toString(), lptablename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW(hinstance.rawAddress.toString(), lptablename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadCursorA(hinstance.rawAddress.toString(), lpcursorname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA(lpfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW(lpfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadCursorW(hinstance.rawAddress.toString(), lpcursorname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadIconA(hinstance.rawAddress.toString(), lpiconname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadIconW(hinstance.rawAddress.toString(), lpiconname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadImageA(hinst.rawAddress.toString(), name.rawAddress.toString(), type.toInt(), cx, cy, fuload.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadImageW(hinst.rawAddress.toString(), name.rawAddress.toString(), type.toInt(), cx, cy, fuload.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadMenuA(hinstance.rawAddress.toString(), lpmenuname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuIndirectA(lpmenutemplate: ConstPtr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA(lpmenutemplate.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuIndirectW(lpmenutemplate: ConstPtr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW(lpmenutemplate.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadMenuW(hinstance.rawAddress.toString(), lpmenuname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadStringA(hinstance.rawAddress.toString(), uid.toInt(), lpbuffer.rawAddress.toString(), cchbuffermax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLoadStringW(hinstance.rawAddress.toString(), uid.toInt(), lpbuffer.rawAddress.toString(), cchbuffermax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(ulockcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupIconIdFromDirectory(presbits: ConstPtr, ficon: Bool): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory(presbits.rawAddress.toString(), ficon) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupIconIdFromDirectoryEx(presbits: ConstPtr, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx(presbits.rawAddress.toString(), ficon, cxdesired, cydesired, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapDialogRect(hdlg: Hwnd, lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMapDialogRect(hdlg.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMessageBoxA(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMessageBoxExA(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt(), wlanguageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMessageBoxExW(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt(), wlanguageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxIndirectA(lpmbp: ConstPtr): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA(lpmbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxIndirectW(lpmbp: ConstPtr): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW(lpmbp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMessageBoxW(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingModifyMenuA(hmnu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingModifyMenuW(hmnu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMoveWindow(hwnd.rawAddress.toString(), x, y, nwidth, nheight, brepaint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig(platformversion, defaultqualifiers.rawAddress.toString(), outputxmlfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory(platformversion, defaultqualifiers.rawAddress.toString(), outputxmldata.rawAddress.toString(), outputxmlsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: MutPtr, outputprisize: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer(packagefamilyname.rawAddress.toString(), projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), indexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: ConstPtr, prisize: UInt, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), pridata.rawAddress.toString(), prisize.toInt(), indexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), prifile.rawAddress.toString(), indexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: ConstPtr, schemaxmlsize: UInt, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), schemaxmldata.rawAddress.toString(), schemaxmlsize.toInt(), indexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), schemafile.rawAddress.toString(), indexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags(packagefamilyname.rawAddress.toString(), projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), flags, indexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriDataInMemory(inputpridata: ConstPtr, inputprisize: UInt, schemapridata: ConstPtr, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory(inputpridata.rawAddress.toString(), inputprisize.toInt(), schemapridata.rawAddress.toString(), schemaprisize.toInt(), dumptype, outputxmldata.rawAddress.toString(), outputxmlsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile(indexfilename.rawAddress.toString(), schemaprifile.rawAddress.toString(), dumptype, outputxmlfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory(indexfilename.rawAddress.toString(), schemaprifile.rawAddress.toString(), dumptype, outputxmldata.rawAddress.toString(), outputxmlsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmFreeMemory(data: ConstPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory(data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum(prifile.rawAddress.toString(), checksum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: ConstPtr, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: MutPtr, nummsgs: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWaitForMultipleObjects(ncount: UInt, phandles: ConstPtr, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects(ncount.toInt(), phandles.rawAddress.toString(), fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: ConstPtr, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx(ncount.toInt(), phandles.rawAddress.toString(), dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingOemToCharA(psrc.rawAddress.toString(), pdst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingOemToCharW(psrc.rawAddress.toString(), pdst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIcon(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingOpenIcon(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPeekMessageA(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPeekMessageW(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPostMessageA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPostMessageW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQuitMessage(nexitcode: Int) {
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) {
        windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(nexitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA(szfilename.rawAddress.toString(), niconindex, cxicon, cyicon, phicon.rawAddress.toString(), piconid.rawAddress.toString(), nicons.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW(szfilename.rawAddress.toString(), niconindex, cxicon, cyicon, phicon.rawAddress.toString(), piconid.rawAddress.toString(), nicons.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA(hwnd.rawAddress.toString(), ptszclassname.rawAddress.toString(), cchclassnamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW(hwnd.rawAddress.toString(), ptszclassname.rawAddress.toString(), cchclassnamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassA(lpwndclass: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterClassA(lpwndclass.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassExA(param0: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterClassExA(param0.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassExW(param0: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterClassExW(param0.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassW(lpwndclass: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterClassW(lpwndclass.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA(hrecipient.rawAddress.toString(), notificationfilter.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW(hrecipient.rawAddress.toString(), notificationfilter.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification(hwnd.rawAddress.toString(), tdflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA(lpstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW(lpstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRemoveMenu(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRemovePropA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingRemovePropW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyMessage(lresult: Lresult): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingReplyMessage(lresult.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: ConstPtr, lprcclip: ConstPtr, hrgnupdate: Hrgn, lprcupdate: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingScrollDC(hdc.rawAddress.toString(), dx, dy, lprcscroll.rawAddress.toString(), lprcclip.rawAddress.toString(), hrgnupdate.rawAddress.toString(), lprcupdate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: ConstPtr, lpcliprect: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingScrollWindow(hwnd.rawAddress.toString(), xamount, yamount, lprect.rawAddress.toString(), lpcliprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: ConstPtr, prcclip: ConstPtr, hrgnupdate: Hrgn, prcupdate: MutPtr, flags: ScrollWindowFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingScrollWindowEx(hwnd.rawAddress.toString(), dx, dy, prcscroll.rawAddress.toString(), prcclip.rawAddress.toString(), hrgnupdate.rawAddress.toString(), prcupdate.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA(hdlg.rawAddress.toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW(hdlg.rawAddress.toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendMessageA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), 0L.toString(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), 0L.toString(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), lpdwresult.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), lpdwresult.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendMessageW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses(toplevelwindow.rawAddress.toString(), processhandlecount.toInt(), processhandlearray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(umseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCaretPos(x: Int, y: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetCaretPos(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetClassLongA(hwnd.rawAddress.toString(), nindex, dwnewlong) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetClassLongW(hwnd.rawAddress.toString(), nindex, dwnewlong) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetClassWord(hwnd.rawAddress.toString(), nindex, wnewword.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer(hwnd.rawAddress.toString(), nidevent.toString(), uelapse.toInt(), 0L.toString(), utolerancedelay.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetCursor(hcursor.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCursorPos(x: Int, y: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetCursorPos(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) {
        windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(dwlevel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt(hdlg.rawAddress.toString(), niddlgitem, uvalue.toInt(), bsigned) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes(hwnd.rawAddress.toString(), crkey.toInt(), balpha.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMenu(hwnd.rawAddress.toString(), hmenu.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem(hmenu.rawAddress.toString(), uitem.toInt(), fbypos.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuInfo(param0: Hmenu, param1: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMenuInfo(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), hbitmapunchecked.rawAddress.toString(), hbitmapchecked.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA(hmenu.rawAddress.toString(), item.toInt(), fbypositon, lpmii.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW(hmenu.rawAddress.toString(), item.toInt(), fbypositon, lpmii.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(cmessagesmax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetParent(hwndchild.rawAddress.toString(), hwndnewparent.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDPIAware(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(dwdefaultlayout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetPropA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), hdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetPropW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), hdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetSystemCursor(hcur.rawAddress.toString(), id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetTimer(hwnd.rawAddress.toString(), nidevent.toString(), uelapse.toInt(), 0L.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity(hwnd.rawAddress.toString(), dwaffinity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongA(hwnd.rawAddress.toString(), nindex, dwnewlong) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongW(hwnd.rawAddress.toString(), nindex, dwnewlong) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement(hwnd.rawAddress.toString(), lpwndpl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowPos(hwnd.rawAddress.toString(), hwndinsertafter.rawAddress.toString(), x, y, cx, cy, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowTextA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowTextW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowWord(hwnd.rawAddress.toString(), nindex, wnewword.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA(nfiltertype, 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA(idhook, 0L.toString(), hmod.rawAddress.toString(), dwthreadid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW(idhook, 0L.toString(), hmod.rawAddress.toString(), dwthreadid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) MutPtr((windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW(nfiltertype, 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCaret(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingShowCaret(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCursor(bshow: Bool): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingShowCursor(bshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups(hwnd.rawAddress.toString(), fshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingShowWindow(hwnd.rawAddress.toString(), ncmdshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingShowWindowAsync(hwnd.rawAddress.toString(), ncmdshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun soundSentry(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSoundSentry() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) {
        windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow(hwnd.rawAddress.toString(), funknown)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress.toString(), fwinini.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress.toString(), fwinini.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTileWindows(hwndparent.rawAddress.toString(), whow.toInt(), lprect.rawAddress.toString(), ckids.toInt(), lpkids.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu(hmenu.rawAddress.toString(), uflags.toInt(), x, y, nreserved, hwnd.rawAddress.toString(), prcrect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx(hmenu.rawAddress.toString(), uflags.toInt(), x, y, hwnd.rawAddress.toString(), lptpm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA(hwnd.rawAddress.toString(), hacctable.rawAddress.toString(), lpmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW(hwnd.rawAddress.toString(), hacctable.rawAddress.toString(), lpmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel(hwndclient.rawAddress.toString(), lpmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateMessage(lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingTranslateMessage(lpmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook(ncode, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx(hhk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUnregisterClassA(lpclassname.rawAddress.toString(), hinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUnregisterClassW(lpclassname.rawAddress.toString(), hinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: ConstPtr, psize: ConstPtr, hdcsrc: Hdc, pptsrc: ConstPtr, crkey: Colorref, pblend: ConstPtr, dwflags: UpdateLayeredWindowFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow(hwnd.rawAddress.toString(), hdcdst.rawAddress.toString(), pptdst.rawAddress.toString(), psize.rawAddress.toString(), hdcsrc.rawAddress.toString(), pptsrc.rawAddress.toString(), crkey.toInt(), pblend.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect(hwnd.rawAddress.toString(), pulwinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitMessage(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingWaitMessage() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingWsprintfA(param0.rawAddress.toString(), param1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingWsprintfW(param0.rawAddress.toString(), param1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingWvsprintfA(param0.rawAddress.toString(), param1.rawAddress.toString(), arglist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAddon != null) (windowsWin32UiWindowsandmessagingNapiAddon.windowssysWindowsWin32UiWindowsandmessagingWvsprintfW(param0.rawAddress.toString(), param1.rawAddress.toString(), arglist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
