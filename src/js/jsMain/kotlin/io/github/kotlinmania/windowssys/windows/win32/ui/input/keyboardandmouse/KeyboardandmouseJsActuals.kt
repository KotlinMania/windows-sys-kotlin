@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

private val windowsWin32UiInputKeyboardandmouseNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(hkl.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun blockInput(fblockit: Bool): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(hwnd.rawAddress.toString(), benable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveWindow(): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsyncKeyState(vkey: Int): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapture(): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetCapture() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDoubleClickTime(): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFocus(): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetFocus() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKBCodePage(): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(lparam, lpstring.rawAddress.toString(), cchsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(lparam, lpstring.rawAddress.toString(), cchsize) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyState(nvirtkey: Int): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(idthread.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: MutPtr<Hkl>): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(nbuff, lplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(pwszklid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(pwszklid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardState(lpkeystate: MutPtr<UByte>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(lpkeystate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyboardType(ntypeflag: Int): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastInputInfo(plii: MutPtr<Lastinputinfo>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(plii.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: ConstPtr<Mousemovepoint>, lpptbuf: MutPtr<Mousemovepoint>, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(cbsize.toInt(), lppt.rawAddress.toString(), lpptbuf.rawAddress.toString(), nbufpoints, resolution.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(pwszklid.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(pwszklid.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode.toInt(), umaptype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), dwhkl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), dwhkl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode.toInt(), umaptype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemKeyScan(woemchar: UShort): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(hwnd.rawAddress.toString(), id, fsmodifiers.toInt(), vk.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseCapture(): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendInput(cinputs: UInt, pinputs: ConstPtr<Input>, cbsize: Int): UInt =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSendInput(cinputs.toInt(), pinputs.rawAddress.toString(), cbsize) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSetCapture(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDoubleClickTime(param0: UInt): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) MutPtr((windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSetFocus(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKeyboardState(lpkeystate: ConstPtr<UByte>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(lpkeystate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapMouseButton(fswap: Bool): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseToAscii(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.rawAddress.toString(), lpchar.rawAddress.toString(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr<UByte>, lpchar: MutPtr<UShort>, uflags: UInt, dwhkl: Hkl): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.rawAddress.toString(), lpchar.rawAddress.toString(), uflags.toInt(), dwhkl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseToUnicode(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.rawAddress.toString(), pwszbuff.rawAddress.toString(), cchbuff, wflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr<UByte>, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.rawAddress.toString(), pwszbuff.rawAddress.toString(), cchbuff, wflags.toInt(), dwhkl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackMouseEvent(lpeventtrack: MutPtr<Trackmouseevent>): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(lpeventtrack.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(hkl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(hwnd.rawAddress.toString(), id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanA(ch: Byte): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(ch.toInt(), dwhkl.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(ch.toInt(), dwhkl.rawAddress.toString()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vkKeyScanW(ch: UShort): Short =
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) (windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) {
        windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk.toInt(), bscan.toInt(), dwflags.toInt(), dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    if (windowsWin32UiInputKeyboardandmouseNapiAddon != null) {
        windowsWin32UiInputKeyboardandmouseNapiAddon.windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
