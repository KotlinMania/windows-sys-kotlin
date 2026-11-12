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

private object WindowsWin32UiInputKeyboardandmouseJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32UiInputKeyboardandmouseJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(hkl: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(hwnd: Long, benable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetCapture(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetFocus(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(lparam: Int, lpstring: Long, cchsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(lparam: Int, lpstring: Long, cchsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(idthread: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(nbuff: Int, lplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(pwszklid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(pwszklid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(lpkeystate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(plii: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(cbsize: Int, lppt: Long, lpptbuf: Long, nbufpoints: Int, resolution: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(pwszklid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(pwszklid: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode: Int, umaptype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(ucode: Int, umaptype: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(ucode: Int, umaptype: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode: Int, umaptype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(hwnd: Long, id: Int, fsmodifiers: Int, vk: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSendInput(cinputs: Int, pinputs: Long, cbsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSetCapture(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSetFocus(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(lpkeystate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseToAscii(uvirtkey: Int, uscancode: Int, lpkeystate: Long, lpchar: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(uvirtkey: Int, uscancode: Int, lpkeystate: Long, lpchar: Long, uflags: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseToUnicode(wvirtkey: Int, wscancode: Int, lpkeystate: Long, pwszbuff: Long, cchbuff: Int, wflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(wvirtkey: Int, wscancode: Int, lpkeystate: Long, pwszbuff: Long, cchbuff: Int, wflags: Int, dwhkl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(lpeventtrack: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(hkl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(hwnd: Long, id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch: Byte): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(ch: Byte, dwhkl: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(ch: Short, dwhkl: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk: Byte, bscan: Byte, dwflags: Int, dwextrainfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags: Int, dx: Int, dy: Int, dwdata: Int, dwextrainfo: Long)
}

public actual fun activateKeyboardLayout(hkl: Hkl, flags: ActivateKeyboardLayoutFlags): Hkl =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(hkl.rawAddress, flags.toInt()))

public actual fun blockInput(fblockit: Bool): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseBlockInput(fblockit)

public actual fun dragDetect(hwnd: Hwnd, pt: Point): Bool =
    0

public actual fun enableWindow(hwnd: Hwnd, benable: Bool): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(hwnd.rawAddress, benable)

public actual fun getActiveWindow(): Hwnd =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow())

public actual fun getAsyncKeyState(vkey: Int): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(vkey)

public actual fun getCapture(): Hwnd =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetCapture())

public actual fun getDoubleClickTime(): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime().toUInt()

public actual fun getFocus(): Hwnd =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetFocus())

public actual fun getKBCodePage(): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage().toUInt()

public actual fun getKeyNameTextA(lparam: Int, lpstring: Pstr, cchsize: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(lparam, lpstring.rawAddress, cchsize)

public actual fun getKeyNameTextW(lparam: Int, lpstring: Pwstr, cchsize: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(lparam, lpstring.rawAddress, cchsize)

public actual fun getKeyState(nvirtkey: Int): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(nvirtkey)

public actual fun getKeyboardLayout(idthread: UInt): Hkl =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(idthread.toInt()))

public actual fun getKeyboardLayoutList(nbuff: Int, lplist: MutPtr): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(nbuff, lplist.rawAddress)

public actual fun getKeyboardLayoutNameA(pwszklid: Pstr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(pwszklid.rawAddress)

public actual fun getKeyboardLayoutNameW(pwszklid: Pwstr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(pwszklid.rawAddress)

public actual fun getKeyboardState(lpkeystate: MutPtr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(lpkeystate.rawAddress)

public actual fun getKeyboardType(ntypeflag: Int): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(ntypeflag)

public actual fun getLastInputInfo(plii: MutPtr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(plii.rawAddress)

public actual fun getMouseMovePointsEx(cbsize: UInt, lppt: ConstPtr, lpptbuf: MutPtr, nbufpoints: Int, resolution: GetMouseMovePointsExResolution): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(cbsize.toInt(), lppt.rawAddress, lpptbuf.rawAddress, nbufpoints, resolution.toInt())

public actual fun isWindowEnabled(hwnd: Hwnd): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(hwnd.rawAddress)

public actual fun loadKeyboardLayoutA(pwszklid: Pcstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(pwszklid.rawAddress, flags.toInt()))

public actual fun loadKeyboardLayoutW(pwszklid: Pcwstr, flags: ActivateKeyboardLayoutFlags): Hkl =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(pwszklid.rawAddress, flags.toInt()))

public actual fun mapVirtualKeyA(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun mapVirtualKeyExA(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(ucode.toInt(), umaptype.toInt(), dwhkl.rawAddress).toUInt()

public actual fun mapVirtualKeyExW(ucode: UInt, umaptype: MapVirtualKeyType, dwhkl: Hkl): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(ucode.toInt(), umaptype.toInt(), dwhkl.rawAddress).toUInt()

public actual fun mapVirtualKeyW(ucode: UInt, umaptype: MapVirtualKeyType): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(ucode.toInt(), umaptype.toInt()).toUInt()

public actual fun oemKeyScan(woemchar: UShort): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(woemchar.toShort()).toUInt()

public actual fun registerHotKey(hwnd: Hwnd, id: Int, fsmodifiers: HotKeyModifiers, vk: UInt): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(hwnd.rawAddress, id, fsmodifiers.toInt(), vk.toInt())

public actual fun releaseCapture(): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture()

public actual fun sendInput(cinputs: UInt, pinputs: ConstPtr, cbsize: Int): UInt =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSendInput(cinputs.toInt(), pinputs.rawAddress, cbsize).toUInt()

public actual fun setActiveWindow(hwnd: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(hwnd.rawAddress))

public actual fun setCapture(hwnd: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSetCapture(hwnd.rawAddress))

public actual fun setDoubleClickTime(param0: UInt): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(param0.toInt())

public actual fun setFocus(hwnd: Hwnd): Hwnd =
    MutPtr(WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSetFocus(hwnd.rawAddress))

public actual fun setKeyboardState(lpkeystate: ConstPtr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(lpkeystate.rawAddress)

public actual fun swapMouseButton(fswap: Bool): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(fswap)

public actual fun toAscii(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr, lpchar: MutPtr, uflags: UInt): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseToAscii(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.rawAddress, lpchar.rawAddress, uflags.toInt())

public actual fun toAsciiEx(uvirtkey: UInt, uscancode: UInt, lpkeystate: ConstPtr, lpchar: MutPtr, uflags: UInt, dwhkl: Hkl): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(uvirtkey.toInt(), uscancode.toInt(), lpkeystate.rawAddress, lpchar.rawAddress, uflags.toInt(), dwhkl.rawAddress)

public actual fun toUnicode(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseToUnicode(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.rawAddress, pwszbuff.rawAddress, cchbuff, wflags.toInt())

public actual fun toUnicodeEx(wvirtkey: UInt, wscancode: UInt, lpkeystate: ConstPtr, pwszbuff: Pwstr, cchbuff: Int, wflags: UInt, dwhkl: Hkl): Int =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(wvirtkey.toInt(), wscancode.toInt(), lpkeystate.rawAddress, pwszbuff.rawAddress, cchbuff, wflags.toInt(), dwhkl.rawAddress)

public actual fun trackMouseEvent(lpeventtrack: MutPtr): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(lpeventtrack.rawAddress)

public actual fun unloadKeyboardLayout(hkl: Hkl): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(hkl.rawAddress)

public actual fun unregisterHotKey(hwnd: Hwnd, id: Int): Bool =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(hwnd.rawAddress, id)

public actual fun vkKeyScanA(ch: Byte): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(ch)

public actual fun vkKeyScanExA(ch: Byte, dwhkl: Hkl): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(ch, dwhkl.rawAddress)

public actual fun vkKeyScanExW(ch: UShort, dwhkl: Hkl): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(ch.toShort(), dwhkl.rawAddress)

public actual fun vkKeyScanW(ch: UShort): Short =
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(ch.toShort())

public actual fun keybdEvent(bvk: UByte, bscan: UByte, dwflags: KeybdEventFlags, dwextrainfo: ULong) {
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(bvk.toByte(), bscan.toByte(), dwflags.toInt(), dwextrainfo.toLong())
}

public actual fun mouseEvent(dwflags: MouseEventFlags, dx: Int, dy: Int, dwdata: Int, dwextrainfo: ULong) {
    WindowsWin32UiInputKeyboardandmouseJniBridge.windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(dwflags.toInt(), dx, dy, dwdata, dwextrainfo.toLong())
}
