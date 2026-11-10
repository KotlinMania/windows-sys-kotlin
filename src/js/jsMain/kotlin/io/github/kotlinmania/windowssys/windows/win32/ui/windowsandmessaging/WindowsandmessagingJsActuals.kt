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

private val _windowsWin32UiWindowsandmessagingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun adjustWindowRect(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRect((lprect?.value ?: 0L).toString(), dwstyle.toInt(), bmenu) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustWindowRectEx(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRectEx((lprect?.value ?: 0L).toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_allowSetForegroundWindow(dwprocessid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_animateWindow((hwnd?.value ?: 0L).toString(), dwtime.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun anyPopup(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_anyPopup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_appendMenuA((hmenu?.value ?: 0L).toString(), uflags.toInt(), uidnewitem.toString(), (lpnewitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_appendMenuW((hmenu?.value ?: 0L).toString(), uflags.toInt(), uidnewitem.toString(), (lpnewitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_arrangeIconicWindows((hwnd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_beginDeferWindowPos(nnumwindows) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_bringWindowToTop((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calculatePopupWindowPosition(anchorpoint: COpaquePointer?, windowsize: COpaquePointer?, flags: UInt, excluderect: COpaquePointer?, popupwindowposition: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_calculatePopupWindowPosition((anchorpoint?.value ?: 0L).toString(), (windowsize?.value ?: 0L).toString(), flags.toInt(), (excluderect?.value ?: 0L).toString(), (popupwindowposition?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callMsgFilterA(lpmsg: COpaquePointer?, ncode: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterA((lpmsg?.value ?: 0L).toString(), ncode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callMsgFilterW(lpmsg: COpaquePointer?, ncode: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterW((lpmsg?.value ?: 0L).toString(), ncode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_callNextHookEx((hhk?.value ?: 0L).toString(), ncode, wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_callWindowProcA(0L.toString(), (hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_callWindowProcW(0L.toString(), (hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelShutdown(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_cancelShutdown() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_cascadeWindows((hwndparent?.value ?: 0L).toString(), whow.toInt(), (lprect?.value ?: 0L).toString(), ckids.toInt(), (lpkids?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_changeMenuA((hmenu?.value ?: 0L).toString(), cmd.toInt(), (lpsznewitem?.value ?: 0L).toString(), cmdinsert.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_changeMenuW((hmenu?.value ?: 0L).toString(), cmd.toInt(), (lpsznewitem?.value ?: 0L).toString(), cmdinsert.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilter(message.toInt(), dwflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilterEx((hwnd?.value ?: 0L).toString(), message.toInt(), action.toInt(), (pchangefilterstruct?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerA(lpsz: Pstr): Pstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charLowerA((lpsz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffA((lpsz?.value ?: 0L).toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffW((lpsz?.value ?: 0L).toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charLowerW((lpsz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextA(lpsz: Pcstr): Pstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charNextA((lpsz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charNextExA(codepage.toInt(), (lpcurrentchar?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charNextW((lpsz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charPrevA((lpszstart?.value ?: 0L).toString(), (lpszcurrent?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charPrevExA(codepage.toInt(), (lpstart?.value ?: 0L).toString(), (lpcurrentchar?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charPrevW((lpszstart?.value ?: 0L).toString(), (lpszcurrent?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charToOemA((psrc?.value ?: 0L).toString(), (pdst?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffA((lpszsrc?.value ?: 0L).toString(), (lpszdst?.value ?: 0L).toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffW((lpszsrc?.value ?: 0L).toString(), (lpszdst?.value ?: 0L).toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charToOemW((psrc?.value ?: 0L).toString(), (pdst?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperA(lpsz: Pstr): Pstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charUpperA((lpsz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffA((lpsz?.value ?: 0L).toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffW((lpsz?.value ?: 0L).toString(), cchlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_charUpperW((lpsz?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_checkMenuItem((hmenu?.value ?: 0L).toString(), uidcheckitem.toInt(), ucheck.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_checkMenuRadioItem((hmenu?.value ?: 0L).toString(), first.toInt(), last.toInt(), check.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipCursor(lprect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_clipCursor((lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_closeWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableA((haccelsrc?.value ?: 0L).toString(), (lpacceldst?.value ?: 0L).toString(), caccelentries) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: COpaquePointer?, caccelentries: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableW((haccelsrc?.value ?: 0L).toString(), (lpacceldst?.value ?: 0L).toString(), caccelentries) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyIcon(hicon: Hicon): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_copyIcon((hicon?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_copyImage((h?.value ?: 0L).toString(), type.toInt(), cx, cy, flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAcceleratorTableA(paccel: COpaquePointer?, caccel: Int): Haccel =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableA((paccel?.value ?: 0L).toString(), caccel) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAcceleratorTableW(paccel: COpaquePointer?, caccel: Int): Haccel =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableW((paccel?.value ?: 0L).toString(), caccel) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createCaret((hwnd?.value ?: 0L).toString(), (hbitmap?.value ?: 0L).toString(), nwidth, nheight) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: COpaquePointer?, pvxorplane: COpaquePointer?): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createCursor((hinst?.value ?: 0L).toString(), xhotspot, yhotspot, nwidth, nheight, (pvandplane?.value ?: 0L).toString(), (pvxorplane?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamA((hinstance?.value ?: 0L).toString(), (lptemplate?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamW((hinstance?.value ?: 0L).toString(), (lptemplate?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createDialogParamA((hinstance?.value ?: 0L).toString(), (lptemplatename?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createDialogParamW((hinstance?.value ?: 0L).toString(), (lptemplatename?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: COpaquePointer?, lpbxorbits: COpaquePointer?): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createIcon((hinstance?.value ?: 0L).toString(), nwidth, nheight, cplanes.toInt(), cbitspixel.toInt(), (lpbandbits?.value ?: 0L).toString(), (lpbxorbits?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconFromResource(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createIconFromResource((presbits?.value ?: 0L).toString(), dwressize.toInt(), ficon, dwver.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconFromResourceEx(presbits: COpaquePointer?, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createIconFromResourceEx((presbits?.value ?: 0L).toString(), dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconIndirect(piconinfo: COpaquePointer?): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createIconIndirect((piconinfo?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowA((lpclassname?.value ?: 0L).toString(), (lpwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), lparam.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowW((lpclassname?.value ?: 0L).toString(), (lpwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), lparam.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMenu(): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createMenu() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPopupMenu(): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createPopupMenu() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createResourceIndexer((projectroot?.value ?: 0L).toString(), (extensiondllpath?.value ?: 0L).toString(), (ppresourceindexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createWindowExA(dwexstyle.toInt(), (lpclassname?.value ?: 0L).toString(), (lpwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (lpparam?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: COpaquePointer?): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_createWindowExW(dwexstyle.toInt(), (lpclassname?.value ?: 0L).toString(), (lpwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (lpparam?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defDlgProcA((hdlg?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defDlgProcW((hdlg?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defFrameProcA((hwnd?.value ?: 0L).toString(), (hwndmdiclient?.value ?: 0L).toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defFrameProcW((hwnd?.value ?: 0L).toString(), (hwndmdiclient?.value ?: 0L).toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcA((hwnd?.value ?: 0L).toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcW((hwnd?.value ?: 0L).toString(), umsg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defWindowProcA((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_defWindowProcW((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_deferWindowPos((hwinposinfo?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (hwndinsertafter?.value ?: 0L).toString(), x, y, cx, cy, uflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_deleteMenu((hmenu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_deregisterShellHookWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyAcceleratorTable((haccel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCaret(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyCaret() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyCursor((hcursor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyIcon(hicon: Hicon): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyIcon((hicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: COpaquePointer?) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyIndexedResults((resourceuri?.value ?: 0L).toString(), qualifiercount.toInt(), (qualifiers?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyMenu((hmenu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyResourceIndexer(resourceindexer: COpaquePointer?) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyResourceIndexer((resourceindexer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_destroyWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamA((hinstance?.value ?: 0L).toString(), (hdialogtemplate?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: COpaquePointer?, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamW((hinstance?.value ?: 0L).toString(), (hdialogtemplate?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamA((hinstance?.value ?: 0L).toString(), (lptemplatename?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamW((hinstance?.value ?: 0L).toString(), (lptemplatename?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), 0L.toString(), dwinitparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableProcessWindowsGhosting() {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_disableProcessWindowsGhosting()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dispatchMessageA(lpmsg: COpaquePointer?): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageA((lpmsg?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispatchMessageW(lpmsg: COpaquePointer?): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageW((lpmsg?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_dragObject((hwndparent?.value ?: 0L).toString(), (hwndfrom?.value ?: 0L).toString(), fmt.toInt(), data.toString(), (hcur?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_drawIcon((hdc?.value ?: 0L).toString(), x, y, (hicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_drawIconEx((hdc?.value ?: 0L).toString(), xleft, ytop, (hicon?.value ?: 0L).toString(), cxwidth, cywidth, istepifanicur.toInt(), (hbrflickerfreedraw?.value ?: 0L).toString(), diflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_drawMenuBar((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enableMenuItem((hmenu?.value ?: 0L).toString(), uidenableitem.toInt(), uenable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_endDeferWindowPos((hwinposinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_endDialog((hdlg?.value ?: 0L).toString(), nresult.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endMenu(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_endMenu() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumChildWindows((hwndparent?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumPropsA((hwnd?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumPropsExA((hwnd?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumPropsExW((hwnd?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumPropsW((hwnd?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumThreadWindows(dwthreadid.toInt(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_enumWindows(0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_findWindowA((lpclassname?.value ?: 0L).toString(), (lpwindowname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_findWindowExA((hwndparent?.value ?: 0L).toString(), (hwndchildafter?.value ?: 0L).toString(), (lpszclass?.value ?: 0L).toString(), (lpszwindow?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_findWindowExW((hwndparent?.value ?: 0L).toString(), (hwndchildafter?.value ?: 0L).toString(), (lpszclass?.value ?: 0L).toString(), (lpszwindow?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_findWindowW((lpclassname?.value ?: 0L).toString(), (lpwindowname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_flashWindow((hwnd?.value ?: 0L).toString(), binvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flashWindowEx(pfwi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_flashWindowEx((pfwi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoA((hwnd?.value ?: 0L).toString(), iitem, (pati?.value ?: 0L).toString(), (pszitemtext?.value ?: 0L).toString(), cchitemtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: COpaquePointer?, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoW((hwnd?.value ?: 0L).toString(), iitem, (pati?.value ?: 0L).toString(), (pszitemtext?.value ?: 0L).toString(), cchitemtext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getAncestor((hwnd?.value ?: 0L).toString(), gaflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCaretBlinkTime(): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getCaretBlinkTime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCaretPos(lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getCaretPos((lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoA((hinstance?.value ?: 0L).toString(), (lpclassname?.value ?: 0L).toString(), (lpwndclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExA((hinstance?.value ?: 0L).toString(), (lpszclass?.value ?: 0L).toString(), (lpwcx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExW((hinstance?.value ?: 0L).toString(), (lpszclass?.value ?: 0L).toString(), (lpwcx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassInfoW((hinstance?.value ?: 0L).toString(), (lpclassname?.value ?: 0L).toString(), (lpwndclass?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassLongA((hwnd?.value ?: 0L).toString(), nindex) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrA((hwnd?.value ?: 0L).toString(), nindex) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrW((hwnd?.value ?: 0L).toString(), nindex) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassLongW((hwnd?.value ?: 0L).toString(), nindex) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassNameA((hwnd?.value ?: 0L).toString(), (lpclassname?.value ?: 0L).toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassNameW((hwnd?.value ?: 0L).toString(), (lpclassname?.value ?: 0L).toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClassWord((hwnd?.value ?: 0L).toString(), nindex) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClientRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClientRect((hwnd?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipCursor(lprect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getClipCursor((lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursor(): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getCursor() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursorInfo(pci: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getCursorInfo((pci?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursorPos(lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getCursorPos((lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDesktopWindow(): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDesktopWindow() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogBaseUnits(): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDialogBaseUnits() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDlgCtrlID((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDlgItem((hdlg?.value ?: 0L).toString(), niddlgitem) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: COpaquePointer?, bsigned: Bool): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemInt((hdlg?.value ?: 0L).toString(), niddlgitem, (lptranslated?.value ?: 0L).toString(), bsigned) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextA((hdlg?.value ?: 0L).toString(), niddlgitem, (lpstring?.value ?: 0L).toString(), cchmax) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextW((hdlg?.value ?: 0L).toString(), niddlgitem, (lpstring?.value ?: 0L).toString(), cchmax) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getForegroundWindow(): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getForegroundWindow() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGUIThreadInfo(idthread: UInt, pgui: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getGUIThreadInfo(idthread.toInt(), (pgui?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfo(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getIconInfo((hicon?.value ?: 0L).toString(), (piconinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExA((hicon?.value ?: 0L).toString(), (piconinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExW((hicon?.value ?: 0L).toString(), (piconinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInputState(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getInputState() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getLastActivePopup((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: COpaquePointer?, pbalpha: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getLayeredWindowAttributes((hwnd?.value ?: 0L).toString(), (pcrkey?.value ?: 0L).toString(), (pbalpha?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenu((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuBarInfo((hwnd?.value ?: 0L).toString(), idobject, iditem, (pmbi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuCheckMarkDimensions(): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuCheckMarkDimensions() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuDefaultItem((hmenu?.value ?: 0L).toString(), fbypos.toInt(), gmdiflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuInfo((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemCount((hmenu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemID((hmenu?.value ?: 0L).toString(), npos) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoA((hmenu?.value ?: 0L).toString(), item.toInt(), fbyposition, (lpmii?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoW((hmenu?.value ?: 0L).toString(), item.toInt(), fbyposition, (lpmii?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuItemRect((hwnd?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString(), uitem.toInt(), (lprcitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuState((hmenu?.value ?: 0L).toString(), uid.toInt(), uflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuStringA((hmenu?.value ?: 0L).toString(), uiditem.toInt(), (lpstring?.value ?: 0L).toString(), cchmax, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMenuStringW((hmenu?.value ?: 0L).toString(), uiditem.toInt(), (lpstring?.value ?: 0L).toString(), cchmax, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMessageA((lpmsg?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageExtraInfo(): Lparam =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMessageExtraInfo() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessagePos(): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMessagePos() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageTime(): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMessageTime() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getMessageW((lpmsg?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getNextDlgGroupItem((hdlg?.value ?: 0L).toString(), (hctl?.value ?: 0L).toString(), bprevious) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getNextDlgTabItem((hdlg?.value ?: 0L).toString(), (hctl?.value ?: 0L).toString(), bprevious) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getParent(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getParent((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicalCursorPos(lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getPhysicalCursorPos((lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultLayout(pdwdefaultlayout: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getProcessDefaultLayout((pdwdefaultlayout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getPropA((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getPropW((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getQueueStatus(flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getScrollBarInfo((hwnd?.value ?: 0L).toString(), idobject, (psbi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getScrollInfo((hwnd?.value ?: 0L).toString(), nbar, (lpsi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getScrollPos((hwnd?.value ?: 0L).toString(), nbar) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: COpaquePointer?, lpmaxpos: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getScrollRange((hwnd?.value ?: 0L).toString(), nbar, (lpminpos?.value ?: 0L).toString(), (lpmaxpos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShellWindow(): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getShellWindow() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getSubMenu((hmenu?.value ?: 0L).toString(), npos) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getSystemMenu((hwnd?.value ?: 0L).toString(), brevert) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getSystemMetrics(nindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getTitleBarInfo((hwnd?.value ?: 0L).toString(), (pti?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getTopWindow((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindow((hwnd?.value ?: 0L).toString(), ucmd.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowDisplayAffinity((hwnd?.value ?: 0L).toString(), (pdwaffinity?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowInfo(hwnd: Hwnd, pwi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowInfo((hwnd?.value ?: 0L).toString(), (pwi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongA((hwnd?.value ?: 0L).toString(), nindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrA((hwnd?.value ?: 0L).toString(), nindex) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrW((hwnd?.value ?: 0L).toString(), nindex) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowLongW((hwnd?.value ?: 0L).toString(), nindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameA((hwnd?.value ?: 0L).toString(), (pszfilename?.value ?: 0L).toString(), cchfilenamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameW((hwnd?.value ?: 0L).toString(), (pszfilename?.value ?: 0L).toString(), cchfilenamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowPlacement((hwnd?.value ?: 0L).toString(), (lpwndpl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowRect((hwnd?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextA((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthA((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthW((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowTextW((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), nmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: COpaquePointer?): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowThreadProcessId((hwnd?.value ?: 0L).toString(), (lpdwprocessid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_getWindowWord((hwnd?.value ?: 0L).toString(), nindex) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hideCaret(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_hideCaret((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_hiliteMenuItem((hwnd?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString(), uidhiliteitem.toInt(), uhilite.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inSendMessage(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_inSendMessage() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inSendMessageEx(lpreserved: COpaquePointer?): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_inSendMessageEx((lpreserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun indexFilePath(resourceindexer: COpaquePointer?, filepath: Pcwstr, ppresourceuri: COpaquePointer?, pqualifiercount: COpaquePointer?, ppqualifiers: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_indexFilePath((resourceindexer?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString(), (ppresourceuri?.value ?: 0L).toString(), (pqualifiercount?.value ?: 0L).toString(), (ppqualifiers?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_inheritWindowMonitor((hwnd?.value ?: 0L).toString(), (hwndinherit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_insertMenuA((hmenu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), (lpnewitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemA((hmenu?.value ?: 0L).toString(), item.toInt(), fbyposition, (lpmi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemW((hmenu?.value ?: 0L).toString(), item.toInt(), fbyposition, (lpmi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_insertMenuW((hmenu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), (lpnewitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_internalGetWindowText((hwnd?.value ?: 0L).toString(), (pstring?.value ?: 0L).toString(), cchmaxcount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaA(ch: Byte): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaW(ch: UShort): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharLowerA(ch: Byte): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharLowerA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharUpperA(ch: Byte): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharUpperA(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharUpperW(ch: UShort): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isCharUpperW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isChild((hwndparent?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageA((hdlg?.value ?: 0L).toString(), (lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageW((hdlg?.value ?: 0L).toString(), (lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIThread(bconvert: Bool): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isGUIThread(bconvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isHungAppWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isIconic(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isIconic((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMenu(hmenu: Hmenu): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isMenu((hmenu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessDPIAware(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isProcessDPIAware() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isWindowArranged((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isWindowUnicode((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isWindowVisible((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Message(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isWow64Message() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isZoomed(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_isZoomed((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_killTimer((hwnd?.value ?: 0L).toString(), uidevent.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsA((hinstance?.value ?: 0L).toString(), (lptablename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsW((hinstance?.value ?: 0L).toString(), (lptablename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadCursorA((hinstance?.value ?: 0L).toString(), (lpcursorname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileA((lpfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileW((lpfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadCursorW((hinstance?.value ?: 0L).toString(), (lpcursorname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadIconA((hinstance?.value ?: 0L).toString(), (lpiconname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadIconW((hinstance?.value ?: 0L).toString(), (lpiconname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadImageA((hinst?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), type.toInt(), cx, cy, fuload.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadImageW((hinst?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), type.toInt(), cx, cy, fuload.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadMenuA((hinstance?.value ?: 0L).toString(), (lpmenuname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuIndirectA(lpmenutemplate: COpaquePointer?): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectA((lpmenutemplate?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuIndirectW(lpmenutemplate: COpaquePointer?): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectW((lpmenutemplate?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadMenuW((hinstance?.value ?: 0L).toString(), (lpmenuname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadStringA((hinstance?.value ?: 0L).toString(), uid.toInt(), (lpbuffer?.value ?: 0L).toString(), cchbuffermax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_loadStringW((hinstance?.value ?: 0L).toString(), uid.toInt(), (lpbuffer?.value ?: 0L).toString(), cchbuffermax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_lockSetForegroundWindow(ulockcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_logicalToPhysicalPoint((hwnd?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupIconIdFromDirectory(presbits: COpaquePointer?, ficon: Bool): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectory((presbits?.value ?: 0L).toString(), ficon) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupIconIdFromDirectoryEx(presbits: COpaquePointer?, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectoryEx((presbits?.value ?: 0L).toString(), ficon, cxdesired, cydesired, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapDialogRect(hdlg: Hwnd, lprect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mapDialogRect((hdlg?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_messageBoxA((hwnd?.value ?: 0L).toString(), (lptext?.value ?: 0L).toString(), (lpcaption?.value ?: 0L).toString(), utype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_messageBoxExA((hwnd?.value ?: 0L).toString(), (lptext?.value ?: 0L).toString(), (lpcaption?.value ?: 0L).toString(), utype.toInt(), wlanguageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_messageBoxExW((hwnd?.value ?: 0L).toString(), (lptext?.value ?: 0L).toString(), (lpcaption?.value ?: 0L).toString(), utype.toInt(), wlanguageid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxIndirectA(lpmbp: COpaquePointer?): MessageboxResult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectA((lpmbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxIndirectW(lpmbp: COpaquePointer?): MessageboxResult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectW((lpmbp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_messageBoxW((hwnd?.value ?: 0L).toString(), (lptext?.value ?: 0L).toString(), (lpcaption?.value ?: 0L).toString(), utype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_modifyMenuA((hmnu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), (lpnewitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_modifyMenuW((hmnu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), (lpnewitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_moveWindow((hwnd?.value ?: 0L).toString(), x, y, nwidth, nheight, brepaint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfig(platformversion, (defaultqualifiers?.value ?: 0L).toString(), (outputxmlfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfigInMemory(platformversion, (defaultqualifiers?.value ?: 0L).toString(), (outputxmldata?.value ?: 0L).toString(), (outputxmlsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: COpaquePointer?, outputprisize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexer((packagefamilyname?.value ?: 0L).toString(), (projectroot?.value ?: 0L).toString(), platformversion, (defaultqualifiers?.value ?: 0L).toString(), (indexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: COpaquePointer?, prisize: UInt, indexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriData((projectroot?.value ?: 0L).toString(), platformversion, (defaultqualifiers?.value ?: 0L).toString(), (pridata?.value ?: 0L).toString(), prisize.toInt(), (indexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriFile((projectroot?.value ?: 0L).toString(), platformversion, (defaultqualifiers?.value ?: 0L).toString(), (prifile?.value ?: 0L).toString(), (indexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: COpaquePointer?, schemaxmlsize: UInt, indexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaData((projectroot?.value ?: 0L).toString(), platformversion, (defaultqualifiers?.value ?: 0L).toString(), (schemaxmldata?.value ?: 0L).toString(), schemaxmlsize.toInt(), (indexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaFile((projectroot?.value ?: 0L).toString(), platformversion, (defaultqualifiers?.value ?: 0L).toString(), (schemafile?.value ?: 0L).toString(), (indexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerWithFlags((packagefamilyname?.value ?: 0L).toString(), (projectroot?.value ?: 0L).toString(), platformversion, (defaultqualifiers?.value ?: 0L).toString(), flags, (indexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriDataInMemory(inputpridata: COpaquePointer?, inputprisize: UInt, schemapridata: COpaquePointer?, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriDataInMemory((inputpridata?.value ?: 0L).toString(), inputprisize.toInt(), (schemapridata?.value ?: 0L).toString(), schemaprisize.toInt(), dumptype, (outputxmldata?.value ?: 0L).toString(), (outputxmlsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFile((indexfilename?.value ?: 0L).toString(), (schemaprifile?.value ?: 0L).toString(), dumptype, (outputxmlfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: COpaquePointer?, outputxmlsize: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFileInMemory((indexfilename?.value ?: 0L).toString(), (schemaprifile?.value ?: 0L).toString(), dumptype, (outputxmldata?.value ?: 0L).toString(), (outputxmlsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmFreeMemory(data: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmFreeMemory((data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: COpaquePointer?): Hresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_mrmGetPriFileContentChecksum((prifile?.value ?: 0L).toString(), (checksum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexEmbeddedData(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, embeddeddata: COpaquePointer?, embeddeddatasize: UInt, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexFile(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, filepath: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexFileAutoQualifiers(indexer: MrmResourceIndexerHandle, filepath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexResourceContainerAutoQualifiers(indexer: MrmResourceIndexerHandle, containerpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmIndexString(indexer: MrmResourceIndexerHandle, resourceuri: Pcwstr, resourcestring: Pcwstr, qualifiers: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmPeekResourceIndexerMessages(handle: MrmResourceIndexerHandle, messages: COpaquePointer?, nummsgs: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWaitForMultipleObjects(ncount: UInt, phandles: COpaquePointer?, fwaitall: Bool, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags): WaitEvent =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjects(ncount.toInt(), (phandles?.value ?: 0L).toString(), fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: COpaquePointer?, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjectsEx(ncount.toInt(), (phandles?.value ?: 0L).toString(), dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_oemToCharA((psrc?.value ?: 0L).toString(), (pdst?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffA((lpszsrc?.value ?: 0L).toString(), (lpszdst?.value ?: 0L).toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffW((lpszsrc?.value ?: 0L).toString(), (lpszdst?.value ?: 0L).toString(), cchdstlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_oemToCharW((psrc?.value ?: 0L).toString(), (pdst?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIcon(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_openIcon((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekMessageA(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_peekMessageA((lpmsg?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekMessageW(lpmsg: COpaquePointer?, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_peekMessageW((lpmsg?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_physicalToLogicalPoint((hwnd?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_postMessageA((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_postMessageW((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQuitMessage(nexitcode: Int) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_postQuitMessage(nexitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsA((szfilename?.value ?: 0L).toString(), niconindex, cxicon, cyicon, (phicon?.value ?: 0L).toString(), (piconid?.value ?: 0L).toString(), nicons.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: COpaquePointer?, piconid: COpaquePointer?, nicons: UInt, flags: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsW((szfilename?.value ?: 0L).toString(), niconindex, cxicon, cyicon, (phicon?.value ?: 0L).toString(), (piconid?.value ?: 0L).toString(), nicons.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassA((hwnd?.value ?: 0L).toString(), (ptszclassname?.value ?: 0L).toString(), cchclassnamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassW((hwnd?.value ?: 0L).toString(), (ptszclassname?.value ?: 0L).toString(), cchclassnamemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassA(lpwndclass: COpaquePointer?): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerClassA((lpwndclass?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassExA(param0: COpaquePointer?): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerClassExA((param0?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassExW(param0: COpaquePointer?): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerClassExW((param0?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassW(lpwndclass: COpaquePointer?): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerClassW((lpwndclass?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationA((hrecipient?.value ?: 0L).toString(), (notificationfilter?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: COpaquePointer?, flags: RegisterNotificationFlags): Hdevnotify =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationW((hrecipient?.value ?: 0L).toString(), (notificationfilter?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerForTooltipDismissNotification((hwnd?.value ?: 0L).toString(), tdflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerShellHookWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageA((lpstring?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageW((lpstring?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_removeMenu((hmenu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_removePropA((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_removePropW((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyMessage(lresult: Lresult): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_replyMessage(lresult.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: COpaquePointer?, lprcclip: COpaquePointer?, hrgnupdate: Hrgn, lprcupdate: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_scrollDC((hdc?.value ?: 0L).toString(), dx, dy, (lprcscroll?.value ?: 0L).toString(), (lprcclip?.value ?: 0L).toString(), (hrgnupdate?.value ?: 0L).toString(), (lprcupdate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: COpaquePointer?, lpcliprect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_scrollWindow((hwnd?.value ?: 0L).toString(), xamount, yamount, (lprect?.value ?: 0L).toString(), (lpcliprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: COpaquePointer?, prcclip: COpaquePointer?, hrgnupdate: Hrgn, prcupdate: COpaquePointer?, flags: ScrollWindowFlags): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_scrollWindowEx((hwnd?.value ?: 0L).toString(), dx, dy, (prcscroll?.value ?: 0L).toString(), (prcclip?.value ?: 0L).toString(), (hrgnupdate?.value ?: 0L).toString(), (prcupdate?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageA((hdlg?.value ?: 0L).toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageW((hdlg?.value ?: 0L).toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendMessageA((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackA((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), 0L.toString(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackW((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), 0L.toString(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutA((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), (lpdwresult?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: COpaquePointer?): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutW((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), (lpdwresult?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendMessageW((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageA((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageW((hwnd?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setAdditionalForegroundBoostProcesses((toplevelwindow?.value ?: 0L).toString(), processhandlecount.toInt(), (processhandlearray?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setCaretBlinkTime(umseconds.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCaretPos(x: Int, y: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setCaretPos(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setClassLongA((hwnd?.value ?: 0L).toString(), nindex, dwnewlong) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrA((hwnd?.value ?: 0L).toString(), nindex, dwnewlong.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrW((hwnd?.value ?: 0L).toString(), nindex, dwnewlong.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setClassLongW((hwnd?.value ?: 0L).toString(), nindex, dwnewlong) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setClassWord((hwnd?.value ?: 0L).toString(), nindex, wnewword.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setCoalescableTimer((hwnd?.value ?: 0L).toString(), nidevent.toString(), uelapse.toInt(), 0L.toString(), utolerancedelay.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setCursor((hcursor?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCursorPos(x: Int, y: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setCursorPos(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setDebugErrorLevel(dwlevel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemInt((hdlg?.value ?: 0L).toString(), niddlgitem, uvalue.toInt(), bsigned) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextA((hdlg?.value ?: 0L).toString(), niddlgitem, (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextW((hdlg?.value ?: 0L).toString(), niddlgitem, (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setForegroundWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setLayeredWindowAttributes((hwnd?.value ?: 0L).toString(), crkey.toInt(), balpha.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMenu((hwnd?.value ?: 0L).toString(), (hmenu?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMenuDefaultItem((hmenu?.value ?: 0L).toString(), uitem.toInt(), fbypos.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuInfo(param0: Hmenu, param1: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMenuInfo((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemBitmaps((hmenu?.value ?: 0L).toString(), uposition.toInt(), uflags.toInt(), (hbitmapunchecked?.value ?: 0L).toString(), (hbitmapchecked?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoA((hmenu?.value ?: 0L).toString(), item.toInt(), fbypositon, (lpmii?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoW((hmenu?.value ?: 0L).toString(), item.toInt(), fbypositon, (lpmii?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMessageExtraInfo(lparam.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setMessageQueue(cmessagesmax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setParent((hwndchild?.value ?: 0L).toString(), (hwndnewparent?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setPhysicalCursorPos(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDPIAware(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setProcessDPIAware() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setProcessDefaultLayout(dwdefaultlayout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setPropA((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), (hdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setPropW((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), (hdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setSystemCursor((hcur?.value ?: 0L).toString(), id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setTimer((hwnd?.value ?: 0L).toString(), nidevent.toString(), uelapse.toInt(), 0L.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowDisplayAffinity((hwnd?.value ?: 0L).toString(), dwaffinity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongA((hwnd?.value ?: 0L).toString(), nindex, dwnewlong) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrA((hwnd?.value ?: 0L).toString(), nindex, dwnewlong.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrW((hwnd?.value ?: 0L).toString(), nindex, dwnewlong.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowLongW((hwnd?.value ?: 0L).toString(), nindex, dwnewlong) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowPlacement((hwnd?.value ?: 0L).toString(), (lpwndpl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowPos((hwnd?.value ?: 0L).toString(), (hwndinsertafter?.value ?: 0L).toString(), x, y, cx, cy, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowTextA((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowTextW((hwnd?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowWord((hwnd?.value ?: 0L).toString(), nindex, wnewword.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookA(nfiltertype, 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExA(idhook, 0L.toString(), (hmod?.value ?: 0L).toString(), dwthreadid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExW(idhook, 0L.toString(), (hmod?.value ?: 0L).toString(), dwthreadid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookW(nfiltertype, 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCaret(hwnd: Hwnd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_showCaret((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCursor(bshow: Bool): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_showCursor(bshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_showOwnedPopups((hwnd?.value ?: 0L).toString(), fshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_showWindow((hwnd?.value ?: 0L).toString(), ncmdshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_showWindowAsync((hwnd?.value ?: 0L).toString(), ncmdshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun soundSentry(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_soundSentry() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) {
        _windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_switchToThisWindow((hwnd?.value ?: 0L).toString(), funknown)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoA(uiaction.toInt(), uiparam.toInt(), (pvparam?.value ?: 0L).toString(), fwinini.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: COpaquePointer?, fwinini: SystemParametersInfoUpdateFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoW(uiaction.toInt(), uiparam.toInt(), (pvparam?.value ?: 0L).toString(), fwinini.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: COpaquePointer?, ckids: UInt, lpkids: COpaquePointer?): UShort =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_tileWindows((hwndparent?.value ?: 0L).toString(), whow.toInt(), (lprect?.value ?: 0L).toString(), ckids.toInt(), (lpkids?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenu((hmenu?.value ?: 0L).toString(), uflags.toInt(), x, y, nreserved, (hwnd?.value ?: 0L).toString(), (prcrect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenuEx((hmenu?.value ?: 0L).toString(), uflags.toInt(), x, y, (hwnd?.value ?: 0L).toString(), (lptpm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorA((hwnd?.value ?: 0L).toString(), (hacctable?.value ?: 0L).toString(), (lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: COpaquePointer?): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorW((hwnd?.value ?: 0L).toString(), (hacctable?.value ?: 0L).toString(), (lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_translateMDISysAccel((hwndclient?.value ?: 0L).toString(), (lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateMessage(lpmsg: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_translateMessage((lpmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHook(ncode, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHookEx((hhk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_unregisterClassA((lpclassname?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_unregisterClassW((lpclassname?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_unregisterDeviceNotification((handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: COpaquePointer?, psize: COpaquePointer?, hdcsrc: Hdc, pptsrc: COpaquePointer?, crkey: Colorref, pblend: COpaquePointer?, dwflags: UpdateLayeredWindowFlags): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindow((hwnd?.value ?: 0L).toString(), (hdcdst?.value ?: 0L).toString(), (pptdst?.value ?: 0L).toString(), (psize?.value ?: 0L).toString(), (hdcsrc?.value ?: 0L).toString(), (pptsrc?.value ?: 0L).toString(), crkey.toInt(), (pblend?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindowIndirect((hwnd?.value ?: 0L).toString(), (pulwinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitMessage(): Bool =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_waitMessage() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_wsprintfA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_wsprintfW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: COpaquePointer?): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: COpaquePointer?): Int =
    if (_windowsWin32UiWindowsandmessagingNapiAddon != null) (_windowsWin32UiWindowsandmessagingNapiAddon.windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
