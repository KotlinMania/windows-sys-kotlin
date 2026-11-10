@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

private val _windowsWin32UiInputKeyboardandmouseNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout((hkl?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun blockInput(fblockit: Bool): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(fblockit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow((hwnd?.value ?: 0L).toString(), benable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveWindow(): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsyncKeyState(vkey: Int): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(vkey) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapture(): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getCapture() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDoubleClickTime(): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFocus(): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getFocus() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKBCodePage(): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(lparam, (lpstring?.value ?: 0L).toString(), cchsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(lparam, (lpstring?.value ?: 0L).toString(), cchsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyState(nvirtkey: Int): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(nvirtkey) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(idthread.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: COpaquePointer?): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(nbuff, (lplist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA((pwszklid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW((pwszklid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardState(lpkeystate: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState((lpkeystate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardType(ntypeflag: Int): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(ntypeflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastInputInfo(plii: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo((plii?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: COpaquePointer?, lpptbuf: COpaquePointer?, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(cbsize.toInt(), (lppt?.value ?: 0L).toString(), (lpptbuf?.value ?: 0L).toString(), nbufpoints, resolution.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA((pwszklid?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW((pwszklid?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(ucode.toInt(), umaptype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), (dwhkl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), (dwhkl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(ucode.toInt(), umaptype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemKeyScan(woemchar: UShort): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(woemchar.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey((hwnd?.value ?: 0L).toString(), id, fsmodifiers.toInt(), vk.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseCapture(): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendInput(cinputs: UInt, pinputs: COpaquePointer?, cbsize: Int): UInt =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(cinputs.toInt(), (pinputs?.value ?: 0L).toString(), cbsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_setCapture((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDoubleClickTime(param0: UInt): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(param0.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_setFocus((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKeyboardState(lpkeystate: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState((lpkeystate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapMouseButton(fswap: Bool): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(fswap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uvirtkey.toInt(), uscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (lpchar?.value ?: 0L).toString(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: COpaquePointer?, lpchar: COpaquePointer?, uflags: UInt, dwhkl: Hkl): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uvirtkey.toInt(), uscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (lpchar?.value ?: 0L).toString(), uflags.toInt(), (dwhkl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(wvirtkey.toInt(), wscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (pwszbuff?.value ?: 0L).toString(), cchbuff, wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: COpaquePointer?, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), (lpkeystate?.value ?: 0L).toString(), (pwszbuff?.value ?: 0L).toString(), cchbuff, wflags.toInt(), (dwhkl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackMouseEvent(lpeventtrack: COpaquePointer?): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent((lpeventtrack?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout((hkl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey((hwnd?.value ?: 0L).toString(), id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanA(ch: Byte): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(ch.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(ch.toInt(), (dwhkl?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(ch.toInt(), (dwhkl?.value ?: 0L).toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanW(ch: UShort): Short =
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) (_windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(ch.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) {
        _windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(bvk.toInt(), bscan.toInt(), dwflags.toInt(), dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    if (_windowsWin32UiInputKeyboardandmouseNapiAddon != null) {
        _windowsWin32UiInputKeyboardandmouseNapiAddon.windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
