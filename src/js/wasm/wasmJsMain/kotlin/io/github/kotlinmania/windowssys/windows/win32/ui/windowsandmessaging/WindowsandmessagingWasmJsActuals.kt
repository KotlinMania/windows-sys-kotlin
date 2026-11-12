@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiWindowsandmessagingNapiAddon(): Boolean

private val windowsWin32UiWindowsandmessagingNapiAvailable: Boolean = initWindowsWin32UiWindowsandmessagingNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAnimateWindow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAnimateWindow(p0: String, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAnyPopup()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAnyPopup(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAppendMenuA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAppendMenuA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingAppendMenuW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingAppendMenuW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingBringWindowToTop(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingBringWindowToTop(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCallNextHookEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCallNextHookEx(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCallWindowProcA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCallWindowProcA(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCallWindowProcW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCallWindowProcW(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCancelShutdown()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCancelShutdown(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCascadeWindows(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCascadeWindows(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingChangeMenuA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingChangeMenuA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingChangeMenuW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingChangeMenuW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharLowerA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerA(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharLowerW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharNextA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharNextA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharNextExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharNextExA(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharNextW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharNextW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharPrevA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharPrevA(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharPrevExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharPrevExA(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharPrevW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharPrevW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharToOemA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharToOemW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharUpperA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperA(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCharUpperW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperW(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCheckMenuItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCheckMenuItem(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingClipCursor(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingClipCursor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCloseWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCloseWindow(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCopyIcon(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCopyIcon(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCopyImage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCopyImage(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateCaret(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateCaret(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateCursor(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateCursor(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateIcon(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIcon(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateMenu()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateMenu(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu(): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateWindowExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateWindowExA(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String, p9: String, p10: String, p11: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingCreateWindowExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingCreateWindowExW(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String, p9: String, p10: String, p11: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefDlgProcA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefDlgProcA(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefDlgProcW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefDlgProcW(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefFrameProcA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefFrameProcA(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefFrameProcW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefFrameProcW(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefWindowProcA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefWindowProcA(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDefWindowProcW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDefWindowProcW(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDeferWindowPos(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDeferWindowPos(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDeleteMenu(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDeleteMenu(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyCaret()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyCaret(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyCursor(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyCursor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyIcon(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyIcon(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyMenu(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyMenu(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDestroyWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyWindow(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDispatchMessageA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDispatchMessageA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDispatchMessageW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDispatchMessageW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDragObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDragObject(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDrawIcon(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDrawIcon(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDrawIconEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDrawIconEx(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingDrawMenuBar(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingDrawMenuBar(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnableMenuItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnableMenuItem(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEndDialog(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEndDialog(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEndMenu()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEndMenu(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumChildWindows(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumChildWindows(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumPropsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumPropsExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumPropsExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumPropsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingEnumWindows(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingEnumWindows(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingFindWindowA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowA(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingFindWindowExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowExA(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingFindWindowExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowExW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingFindWindowW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingFlashWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingFlashWindow(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingFlashWindowEx(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingFlashWindowEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetAncestor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetAncestor(p0: String, p1: Int): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetCaretPos(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetCaretPos(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassLongA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassLongW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClassWord(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassWord(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClientRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClientRect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetClipCursor(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetClipCursor(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetCursor()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetCursor(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetCursorInfo(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetCursorInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetCursorPos(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetCursorPos(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDlgItem(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItem(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetIconInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetIconInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetInputState()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetInputState(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenu(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenu(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemID(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemID(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuState(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuStringA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMenuStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuStringW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMessageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMessagePos()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessagePos(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMessageTime()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageTime(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetMessageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetParent(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetParent(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetPropA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetPropA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetPropW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetPropW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetScrollInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetScrollPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollPos(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetScrollRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollRange(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetShellWindow()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetShellWindow(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetSubMenu(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetSubMenu(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetSystemMenu(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetSystemMenu(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetTopWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetTopWindow(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindow(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowLongW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowRect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingGetWindowWord(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowWord(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingHideCaret(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingHideCaret(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInSendMessage()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInSendMessage(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInSendMessageEx(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInSendMessageEx(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIndexFilePath(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIndexFilePath(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInsertMenuA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInsertMenuW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsChild(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsChild(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsGUIThread(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsGUIThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsIconic(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsIconic(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsMenu(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsMenu(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsWindowArranged(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindowArranged(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsWindowVisible(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindowVisible(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsWow64Message()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsWow64Message(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingIsZoomed(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingIsZoomed(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingKillTimer(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingKillTimer(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadCursorA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorA(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadCursorW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadIconA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadIconA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadIconW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadIconW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadImageA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadImageA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadImageW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadImageW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadMenuA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuA(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadMenuW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadStringA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLoadStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLoadStringW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMapDialogRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMapDialogRect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMessageBoxA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMessageBoxExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxExA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMessageBoxExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxExW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMessageBoxW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingModifyMenuA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingModifyMenuA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingModifyMenuW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingModifyMenuW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMoveWindow(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMoveWindow(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx(p0: Int, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingOemToCharA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingOemToCharW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingOpenIcon(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingOpenIcon(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPeekMessageA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPeekMessageA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPeekMessageW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPeekMessageW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPostMessageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPostMessageA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPostMessageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPostMessageW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterClassA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterClassExA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassExA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterClassExW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassExW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterClassW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRemoveMenu(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRemoveMenu(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRemovePropA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRemovePropA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingRemovePropW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingRemovePropW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingReplyMessage(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingReplyMessage(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingScrollDC(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingScrollDC(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingScrollWindow(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingScrollWindow(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingScrollWindowEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingScrollWindowEx(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendMessageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageA(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendMessageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageW(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetCaretPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetCaretPos(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetClassLongA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetClassLongW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetClassWord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassWord(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer(p0: String, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetCursor(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetCursor(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetCursorPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetCursorPos(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMenu(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenu(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMenuInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetParent(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetParent(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetPropA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetPropA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetPropW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetPropW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetSystemCursor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetSystemCursor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetTimer(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowLongW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowPos(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowPos(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowTextA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowTextA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowTextW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowTextW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowWord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowWord(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingShowCaret(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingShowCaret(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingShowCursor(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingShowCursor(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingShowWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingShowWindow(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingShowWindowAsync(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingShowWindowAsync(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSoundSentry()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSoundSentry(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTileWindows(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTileWindows(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingTranslateMessage(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateMessage(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUnregisterClassA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUnregisterClassA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUnregisterClassW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUnregisterClassW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification(p0)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingWaitMessage()")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingWaitMessage(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingWsprintfA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingWsprintfA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingWsprintfW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingWsprintfW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingWvsprintfA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingWvsprintfA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiWindowsandmessagingWvsprintfW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiWindowsandmessagingWvsprintfW(p0: String, p1: String, p2: String): Int

public actual fun adjustWindowRect(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAdjustWindowRect(lprect.rawAddress.toString(), dwstyle.toInt(), bmenu) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustWindowRectEx(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAdjustWindowRectEx(lprect.rawAddress.toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allowSetForegroundWindow(dwprocessid: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAllowSetForegroundWindow(dwprocessid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun animateWindow(hwnd: Hwnd, dwtime: UInt, dwflags: AnimateWindowFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAnimateWindow(hwnd.rawAddress.toString(), dwtime.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun anyPopup(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAnyPopup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendMenuA(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAppendMenuA(hmenu.rawAddress.toString(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appendMenuW(hmenu: Hmenu, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingAppendMenuW(hmenu.rawAddress.toString(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arrangeIconicWindows(hwnd: Hwnd): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingArrangeIconicWindows(hwnd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginDeferWindowPos(nnumwindows: Int): Hdwp =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingBeginDeferWindowPos(nnumwindows).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bringWindowToTop(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingBringWindowToTop(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun calculatePopupWindowPosition(anchorpoint: ConstPtr, windowsize: ConstPtr, flags: UInt, excluderect: ConstPtr, popupwindowposition: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCalculatePopupWindowPosition(anchorpoint.rawAddress.toString(), windowsize.rawAddress.toString(), flags.toInt(), excluderect.rawAddress.toString(), popupwindowposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callMsgFilterA(lpmsg: ConstPtr, ncode: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCallMsgFilterA(lpmsg.rawAddress.toString(), ncode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callMsgFilterW(lpmsg: ConstPtr, ncode: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCallMsgFilterW(lpmsg.rawAddress.toString(), ncode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callNextHookEx(hhk: Hhook, ncode: Int, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCallNextHookEx(hhk.rawAddress.toString(), ncode, wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callWindowProcA(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCallWindowProcA(0L.toString(), hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callWindowProcW(lpprevwndfunc: Wndproc, hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCallWindowProcW(0L.toString(), hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelShutdown(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCancelShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cascadeWindows(hwndparent: Hwnd, whow: CascadeWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCascadeWindows(hwndparent.rawAddress.toString(), whow.toInt(), lprect.rawAddress.toString(), ckids.toInt(), lpkids.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeMenuA(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcstr, cmdinsert: UInt, flags: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingChangeMenuA(hmenu.rawAddress.toString(), cmd.toInt(), lpsznewitem.rawAddress.toString(), cmdinsert.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeMenuW(hmenu: Hmenu, cmd: UInt, lpsznewitem: Pcwstr, cmdinsert: UInt, flags: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingChangeMenuW(hmenu.rawAddress.toString(), cmd.toInt(), lpsznewitem.rawAddress.toString(), cmdinsert.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeWindowMessageFilter(message: UInt, dwflag: ChangeWindowMessageFilterFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilter(message.toInt(), dwflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeWindowMessageFilterEx(hwnd: Hwnd, message: UInt, action: WindowMessageFilterAction, pchangefilterstruct: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingChangeWindowMessageFilterEx(hwnd.rawAddress.toString(), message.toInt(), action.toInt(), pchangefilterstruct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerA(lpsz: Pstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerA(lpsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerBuffA(lpsz.rawAddress.toString(), cchlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerBuffW(lpsz.rawAddress.toString(), cchlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charLowerW(lpsz: Pwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharLowerW(lpsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextA(lpsz: Pcstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharNextA(lpsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextExA(codepage: UShort, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharNextExA(codepage.toInt(), lpcurrentchar.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charNextW(lpsz: Pcwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharNextW(lpsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevA(lpszstart: Pcstr, lpszcurrent: Pcstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharPrevA(lpszstart.rawAddress.toString(), lpszcurrent.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevExA(codepage: UShort, lpstart: Pcstr, lpcurrentchar: Pcstr, dwflags: UInt): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharPrevExA(codepage.toInt(), lpstart.rawAddress.toString(), lpcurrentchar.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charPrevW(lpszstart: Pcwstr, lpszcurrent: Pcwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharPrevW(lpszstart.rawAddress.toString(), lpszcurrent.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemA(psrc: Pcstr, pdst: Pstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemA(psrc.rawAddress.toString(), pdst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemBuffA(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemBuffW(lpszsrc: Pcwstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemBuffW(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charToOemW(psrc: Pcwstr, pdst: Pstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharToOemW(psrc.rawAddress.toString(), pdst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperA(lpsz: Pstr): Pstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperA(lpsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperBuffA(lpsz: Pstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperBuffA(lpsz.rawAddress.toString(), cchlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperBuffW(lpsz: Pwstr, cchlength: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperBuffW(lpsz.rawAddress.toString(), cchlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun charUpperW(lpsz: Pwstr): Pwstr =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCharUpperW(lpsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkMenuItem(hmenu: Hmenu, uidcheckitem: UInt, ucheck: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCheckMenuItem(hmenu.rawAddress.toString(), uidcheckitem.toInt(), ucheck.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkMenuRadioItem(hmenu: Hmenu, first: UInt, last: UInt, check: UInt, flags: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCheckMenuRadioItem(hmenu.rawAddress.toString(), first.toInt(), last.toInt(), check.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun childWindowFromPoint(hwndparent: Hwnd, point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun childWindowFromPointEx(hwnd: Hwnd, pt: Point, flags: CwpFlags): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipCursor(lprect: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingClipCursor(lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCloseWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyAcceleratorTableA(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableA(haccelsrc.rawAddress.toString(), lpacceldst.rawAddress.toString(), caccelentries) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyAcceleratorTableW(haccelsrc: Haccel, lpacceldst: MutPtr, caccelentries: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCopyAcceleratorTableW(haccelsrc.rawAddress.toString(), lpacceldst.rawAddress.toString(), caccelentries) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyIcon(hicon: Hicon): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCopyIcon(hicon.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyImage(h: Handle, type: GdiImageType, cx: Int, cy: Int, flags: ImageFlags): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCopyImage(h.rawAddress.toString(), type.toInt(), cx, cy, flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAcceleratorTableA(paccel: ConstPtr, caccel: Int): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableA(paccel.rawAddress.toString(), caccel).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAcceleratorTableW(paccel: ConstPtr, caccel: Int): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateAcceleratorTableW(paccel.rawAddress.toString(), caccel).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCaret(hwnd: Hwnd, hbitmap: Hbitmap, nwidth: Int, nheight: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCreateCaret(hwnd.rawAddress.toString(), hbitmap.rawAddress.toString(), nwidth, nheight) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCursor(hinst: Hinstance, xhotspot: Int, yhotspot: Int, nwidth: Int, nheight: Int, pvandplane: ConstPtr, pvxorplane: ConstPtr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateCursor(hinst.rawAddress.toString(), xhotspot, yhotspot, nwidth, nheight, pvandplane.rawAddress.toString(), pvxorplane.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogIndirectParamA(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamA(hinstance.rawAddress.toString(), lptemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogIndirectParamW(hinstance: Hinstance, lptemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogIndirectParamW(hinstance.rawAddress.toString(), lptemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogParamA(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDialogParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateDialogParamW(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIcon(hinstance: Hinstance, nwidth: Int, nheight: Int, cplanes: UByte, cbitspixel: UByte, lpbandbits: ConstPtr, lpbxorbits: ConstPtr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIcon(hinstance.rawAddress.toString(), nwidth, nheight, cplanes.toInt(), cbitspixel.toInt(), lpbandbits.rawAddress.toString(), lpbxorbits.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconFromResource(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIconFromResource(presbits.rawAddress.toString(), dwressize.toInt(), ficon, dwver.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconFromResourceEx(presbits: ConstPtr, dwressize: UInt, ficon: Bool, dwver: UInt, cxdesired: Int, cydesired: Int, flags: ImageFlags): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIconFromResourceEx(presbits.rawAddress.toString(), dwressize.toInt(), ficon, dwver.toInt(), cxdesired, cydesired, flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIconIndirect(piconinfo: ConstPtr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateIconIndirect(piconinfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMDIWindowA(lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowA(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), lparam.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMDIWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hinstance: Hinstance, lparam: Lparam): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateMDIWindowW(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), lparam.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMenu(): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateMenu().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPopupMenu(): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreatePopupMenu().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createResourceIndexer(projectroot: Pcwstr, extensiondllpath: Pcwstr, ppresourceindexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingCreateResourceIndexer(projectroot.rawAddress.toString(), extensiondllpath.rawAddress.toString(), ppresourceindexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowExA(dwexstyle: WindowExStyle, lpclassname: Pcstr, lpwindowname: Pcstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateWindowExA(dwexstyle.toInt(), lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hmenu.rawAddress.toString(), hinstance.rawAddress.toString(), lpparam.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowExW(dwexstyle: WindowExStyle, lpclassname: Pcwstr, lpwindowname: Pcwstr, dwstyle: WindowStyle, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, hmenu: Hmenu, hinstance: Hinstance, lpparam: ConstPtr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingCreateWindowExW(dwexstyle.toInt(), lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), hmenu.rawAddress.toString(), hinstance.rawAddress.toString(), lpparam.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDlgProcA(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefDlgProcA(hdlg.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDlgProcW(hdlg: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefDlgProcW(hdlg.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defFrameProcA(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefFrameProcA(hwnd.rawAddress.toString(), hwndmdiclient.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defFrameProcW(hwnd: Hwnd, hwndmdiclient: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefFrameProcW(hwnd.rawAddress.toString(), hwndmdiclient.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defMDIChildProcA(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcA(hwnd.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defMDIChildProcW(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefMDIChildProcW(hwnd.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defWindowProcA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefWindowProcA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defWindowProcW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDefWindowProcW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deferWindowPos(hwinposinfo: Hdwp, hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Hdwp =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingDeferWindowPos(hwinposinfo.rawAddress.toString(), hwnd.rawAddress.toString(), hwndinsertafter.rawAddress.toString(), x, y, cx, cy, uflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDeleteMenu(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterShellHookWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDeregisterShellHookWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyAcceleratorTable(haccel: Haccel): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyAcceleratorTable(haccel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCaret(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyCaret() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyCursor(hcursor: Hcursor): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyCursor(hcursor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyIcon(hicon: Hicon): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyIcon(hicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyIndexedResults(resourceuri: Pcwstr, qualifiercount: UInt, qualifiers: ConstPtr) {
    if (windowsWin32UiWindowsandmessagingNapiAvailable) {
        wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyIndexedResults(resourceuri.rawAddress.toString(), qualifiercount.toInt(), qualifiers.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun destroyMenu(hmenu: Hmenu): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyMenu(hmenu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyResourceIndexer(resourceindexer: ConstPtr) {
    if (windowsWin32UiWindowsandmessagingNapiAvailable) {
        wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyResourceIndexer(resourceindexer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun destroyWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDestroyWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxIndirectParamA(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamA(hinstance.rawAddress.toString(), hdialogtemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxIndirectParamW(hinstance: Hinstance, hdialogtemplate: ConstPtr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxIndirectParamW(hinstance.rawAddress.toString(), hdialogtemplate.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxParamA(hinstance: Hinstance, lptemplatename: Pcstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxParamA(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dialogBoxParamW(hinstance: Hinstance, lptemplatename: Pcwstr, hwndparent: Hwnd, lpdialogfunc: Dlgproc, dwinitparam: Lparam): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDialogBoxParamW(hinstance.rawAddress.toString(), lptemplatename.rawAddress.toString(), hwndparent.rawAddress.toString(), 0L.toString(), dwinitparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableProcessWindowsGhosting() {
    if (windowsWin32UiWindowsandmessagingNapiAvailable) {
        wasmWindowssysWindowsWin32UiWindowsandmessagingDisableProcessWindowsGhosting()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dispatchMessageA(lpmsg: ConstPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDispatchMessageA(lpmsg.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dispatchMessageW(lpmsg: ConstPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDispatchMessageW(lpmsg.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragObject(hwndparent: Hwnd, hwndfrom: Hwnd, fmt: UInt, data: ULong, hcur: Hcursor): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDragObject(hwndparent.rawAddress.toString(), hwndfrom.rawAddress.toString(), fmt.toInt(), data.toString(), hcur.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawIcon(hdc: Hdc, x: Int, y: Int, hicon: Hicon): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDrawIcon(hdc.rawAddress.toString(), x, y, hicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawIconEx(hdc: Hdc, xleft: Int, ytop: Int, hicon: Hicon, cxwidth: Int, cywidth: Int, istepifanicur: UInt, hbrflickerfreedraw: Hbrush, diflags: DiFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDrawIconEx(hdc.rawAddress.toString(), xleft, ytop, hicon.rawAddress.toString(), cxwidth, cywidth, istepifanicur.toInt(), hbrflickerfreedraw.rawAddress.toString(), diflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawMenuBar(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingDrawMenuBar(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableMenuItem(hmenu: Hmenu, uidenableitem: UInt, uenable: MenuItemFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnableMenuItem(hmenu.rawAddress.toString(), uidenableitem.toInt(), uenable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDeferWindowPos(hwinposinfo: Hdwp): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEndDeferWindowPos(hwinposinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDialog(hdlg: Hwnd, nresult: Long): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEndDialog(hdlg.rawAddress.toString(), nresult.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endMenu(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEndMenu() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumChildWindows(hwndparent: Hwnd, lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumChildWindows(hwndparent.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsA(hwnd: Hwnd, lpenumfunc: Propenumproca): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsA(hwnd.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsExA(hwnd: Hwnd, lpenumfunc: Propenumprocexa, lparam: Lparam): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsExA(hwnd.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsExW(hwnd: Hwnd, lpenumfunc: Propenumprocexw, lparam: Lparam): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsExW(hwnd.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumPropsW(hwnd: Hwnd, lpenumfunc: Propenumprocw): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumPropsW(hwnd.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumThreadWindows(dwthreadid: UInt, lpfn: Wndenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumThreadWindows(dwthreadid.toInt(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindows(lpenumfunc: Wndenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingEnumWindows(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowA(lpclassname: Pcstr, lpwindowname: Pcstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowA(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowExA(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcstr, lpszwindow: Pcstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowExA(hwndparent.rawAddress.toString(), hwndchildafter.rawAddress.toString(), lpszclass.rawAddress.toString(), lpszwindow.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowExW(hwndparent: Hwnd, hwndchildafter: Hwnd, lpszclass: Pcwstr, lpszwindow: Pcwstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowExW(hwndparent.rawAddress.toString(), hwndchildafter.rawAddress.toString(), lpszclass.rawAddress.toString(), lpszwindow.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findWindowW(lpclassname: Pcwstr, lpwindowname: Pcwstr): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingFindWindowW(lpclassname.rawAddress.toString(), lpwindowname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flashWindow(hwnd: Hwnd, binvert: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingFlashWindow(hwnd.rawAddress.toString(), binvert) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flashWindowEx(pfwi: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingFlashWindowEx(pfwi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltTabInfoA(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pstr, cchitemtext: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoA(hwnd.rawAddress.toString(), iitem, pati.rawAddress.toString(), pszitemtext.rawAddress.toString(), cchitemtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAltTabInfoW(hwnd: Hwnd, iitem: Int, pati: MutPtr, pszitemtext: Pwstr, cchitemtext: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetAltTabInfoW(hwnd.rawAddress.toString(), iitem, pati.rawAddress.toString(), pszitemtext.rawAddress.toString(), cchitemtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAncestor(hwnd: Hwnd, gaflags: GetAncestorFlags): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetAncestor(hwnd.rawAddress.toString(), gaflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCaretBlinkTime(): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetCaretBlinkTime().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCaretPos(lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetCaretPos(lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoA(hinstance: Hinstance, lpclassname: Pcstr, lpwndclass: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoA(hinstance.rawAddress.toString(), lpclassname.rawAddress.toString(), lpwndclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoExA(hinstance: Hinstance, lpszclass: Pcstr, lpwcx: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoExA(hinstance.rawAddress.toString(), lpszclass.rawAddress.toString(), lpwcx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoExW(hinstance: Hinstance, lpszclass: Pcwstr, lpwcx: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoExW(hinstance.rawAddress.toString(), lpszclass.rawAddress.toString(), lpwcx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassInfoW(hinstance: Hinstance, lpclassname: Pcwstr, lpwndclass: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassInfoW(hinstance.rawAddress.toString(), lpclassname.rawAddress.toString(), lpwndclass.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongA(hwnd.rawAddress.toString(), nindex).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrA(hwnd.rawAddress.toString(), nindex).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongPtrW(hwnd.rawAddress.toString(), nindex).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassLongW(hwnd.rawAddress.toString(), nindex).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassNameA(hwnd: Hwnd, lpclassname: Pstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassNameA(hwnd.rawAddress.toString(), lpclassname.rawAddress.toString(), nmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassNameW(hwnd: Hwnd, lpclassname: Pwstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassNameW(hwnd.rawAddress.toString(), lpclassname.rawAddress.toString(), nmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassWord(hwnd: Hwnd, nindex: Int): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClassWord(hwnd.rawAddress.toString(), nindex).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClientRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClientRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipCursor(lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetClipCursor(lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursor(): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetCursor().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursorInfo(pci: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetCursorInfo(pci.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCursorPos(lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetCursorPos(lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDesktopWindow(): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetDesktopWindow().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogBaseUnits(): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetDialogBaseUnits() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgCtrlID(hwnd: Hwnd): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgCtrlID(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItem(hdlg: Hwnd, niddlgitem: Int): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItem(hdlg.rawAddress.toString(), niddlgitem).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemInt(hdlg: Hwnd, niddlgitem: Int, lptranslated: MutPtr, bsigned: Bool): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItemInt(hdlg.rawAddress.toString(), niddlgitem, lptranslated.rawAddress.toString(), bsigned).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pstr, cchmax: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextA(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString(), cchmax).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pwstr, cchmax: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetDlgItemTextW(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString(), cchmax).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getForegroundWindow(): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetForegroundWindow().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGUIThreadInfo(idthread: UInt, pgui: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetGUIThreadInfo(idthread.toInt(), pgui.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfo(hicon: Hicon, piconinfo: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetIconInfo(hicon.rawAddress.toString(), piconinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfoExA(hicon: Hicon, piconinfo: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetIconInfoExA(hicon.rawAddress.toString(), piconinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIconInfoExW(hicon: Hicon, piconinfo: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetIconInfoExW(hicon.rawAddress.toString(), piconinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInputState(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetInputState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLastActivePopup(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetLastActivePopup(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLayeredWindowAttributes(hwnd: Hwnd, pcrkey: MutPtr, pbalpha: MutPtr, pdwflags: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetLayeredWindowAttributes(hwnd.rawAddress.toString(), pcrkey.rawAddress.toString(), pbalpha.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenu(hwnd: Hwnd): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenu(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, iditem: Int, pmbi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuBarInfo(hwnd.rawAddress.toString(), idobject, iditem, pmbi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuCheckMarkDimensions(): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuCheckMarkDimensions() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuDefaultItem(hmenu: Hmenu, fbypos: UInt, gmdiflags: GetMenuDefaultItemFlags): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuDefaultItem(hmenu.rawAddress.toString(), fbypos.toInt(), gmdiflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuInfo(param0: Hmenu, param1: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuInfo(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemCount(hmenu: Hmenu): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemCount(hmenu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemID(hmenu: Hmenu, npos: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemID(hmenu.rawAddress.toString(), npos).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemInfoA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoA(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmii.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemInfoW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmii: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemInfoW(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmii.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuItemRect(hwnd: Hwnd, hmenu: Hmenu, uitem: UInt, lprcitem: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuItemRect(hwnd.rawAddress.toString(), hmenu.rawAddress.toString(), uitem.toInt(), lprcitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuState(hmenu: Hmenu, uid: UInt, uflags: MenuItemFlags): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuState(hmenu.rawAddress.toString(), uid.toInt(), uflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuStringA(hmenu: Hmenu, uiditem: UInt, lpstring: Pstr, cchmax: Int, flags: MenuItemFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuStringA(hmenu.rawAddress.toString(), uiditem.toInt(), lpstring.rawAddress.toString(), cchmax, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuStringW(hmenu: Hmenu, uiditem: UInt, lpstring: Pwstr, cchmax: Int, flags: MenuItemFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMenuStringW(hmenu.rawAddress.toString(), uiditem.toInt(), lpstring.rawAddress.toString(), cchmax, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageA(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageExtraInfo(): Lparam =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageExtraInfo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessagePos(): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessagePos().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageTime(): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageTime() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetMessageW(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextDlgGroupItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetNextDlgGroupItem(hdlg.rawAddress.toString(), hctl.rawAddress.toString(), bprevious).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextDlgTabItem(hdlg: Hwnd, hctl: Hwnd, bprevious: Bool): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetNextDlgTabItem(hdlg.rawAddress.toString(), hctl.rawAddress.toString(), bprevious).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getParent(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetParent(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicalCursorPos(lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetPhysicalCursorPos(lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDefaultLayout(pdwdefaultlayout: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetProcessDefaultLayout(pdwdefaultlayout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetPropA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetPropW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getQueueStatus(flags: QueueStatusFlags): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetQueueStatus(flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollBarInfo(hwnd: Hwnd, idobject: ObjectIdentifier, psbi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollBarInfo(hwnd.rawAddress.toString(), idobject, psbi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollInfo(hwnd.rawAddress.toString(), nbar, lpsi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollPos(hwnd.rawAddress.toString(), nbar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, lpminpos: MutPtr, lpmaxpos: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetScrollRange(hwnd.rawAddress.toString(), nbar, lpminpos.rawAddress.toString(), lpmaxpos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShellWindow(): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetShellWindow().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSubMenu(hmenu: Hmenu, npos: Int): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetSubMenu(hmenu.rawAddress.toString(), npos).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMenu(hwnd: Hwnd, brevert: Bool): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetSystemMenu(hwnd.rawAddress.toString(), brevert).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMetrics(nindex: SystemMetricsIndex): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetSystemMetrics(nindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTitleBarInfo(hwnd: Hwnd, pti: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetTitleBarInfo(hwnd.rawAddress.toString(), pti.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTopWindow(hwnd: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetTopWindow(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindow(hwnd: Hwnd, ucmd: GetWindowCmd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindow(hwnd.rawAddress.toString(), ucmd.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDisplayAffinity(hwnd: Hwnd, pdwaffinity: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowDisplayAffinity(hwnd.rawAddress.toString(), pdwaffinity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowInfo(hwnd: Hwnd, pwi: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowInfo(hwnd.rawAddress.toString(), pwi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongA(hwnd.rawAddress.toString(), nindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrA(hwnd.rawAddress.toString(), nindex).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongPtrW(hwnd.rawAddress.toString(), nindex).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowLongW(hwnd.rawAddress.toString(), nindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowModuleFileNameA(hwnd: Hwnd, pszfilename: Pstr, cchfilenamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameA(hwnd.rawAddress.toString(), pszfilename.rawAddress.toString(), cchfilenamemax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowModuleFileNameW(hwnd: Hwnd, pszfilename: Pwstr, cchfilenamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowModuleFileNameW(hwnd.rawAddress.toString(), pszfilename.rawAddress.toString(), cchfilenamemax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowPlacement(hwnd: Hwnd, lpwndpl: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowPlacement(hwnd.rawAddress.toString(), lpwndpl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRect(hwnd: Hwnd, lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextA(hwnd: Hwnd, lpstring: Pstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), nmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextLengthA(hwnd: Hwnd): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthA(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextLengthW(hwnd: Hwnd): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextLengthW(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTextW(hwnd: Hwnd, lpstring: Pwstr, nmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowTextW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), nmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowThreadProcessId(hwnd: Hwnd, lpdwprocessid: MutPtr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowThreadProcessId(hwnd.rawAddress.toString(), lpdwprocessid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowWord(hwnd: Hwnd, nindex: Int): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingGetWindowWord(hwnd.rawAddress.toString(), nindex).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hideCaret(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingHideCaret(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiliteMenuItem(hwnd: Hwnd, hmenu: Hmenu, uidhiliteitem: UInt, uhilite: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingHiliteMenuItem(hwnd.rawAddress.toString(), hmenu.rawAddress.toString(), uidhiliteitem.toInt(), uhilite.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inSendMessage(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInSendMessage() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inSendMessageEx(lpreserved: ConstPtr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInSendMessageEx(lpreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun indexFilePath(resourceindexer: ConstPtr, filepath: Pcwstr, ppresourceuri: MutPtr, pqualifiercount: MutPtr, ppqualifiers: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIndexFilePath(resourceindexer.rawAddress.toString(), filepath.rawAddress.toString(), ppresourceuri.rawAddress.toString(), pqualifiercount.rawAddress.toString(), ppqualifiers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inheritWindowMonitor(hwnd: Hwnd, hwndinherit: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInheritWindowMonitor(hwnd.rawAddress.toString(), hwndinherit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuA(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuA(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuItemA(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuItemA(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuItemW(hmenu: Hmenu, item: UInt, fbyposition: Bool, lpmi: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuItemW(hmenu.rawAddress.toString(), item.toInt(), fbyposition, lpmi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun insertMenuW(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInsertMenuW(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internalGetWindowText(hwnd: Hwnd, pstring: Pwstr, cchmaxcount: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingInternalGetWindowText(hwnd.rawAddress.toString(), pstring.rawAddress.toString(), cchmaxcount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaA(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaNumericA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericA(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaNumericW(ch: UShort): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaNumericW(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharAlphaW(ch: UShort): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharAlphaW(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharLowerA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharLowerA(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharUpperA(ch: Byte): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperA(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharUpperW(ch: UShort): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsCharUpperW(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isChild(hwndparent: Hwnd, hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsChild(hwndparent.rawAddress.toString(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDialogMessageA(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsDialogMessageA(hdlg.rawAddress.toString(), lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDialogMessageW(hdlg: Hwnd, lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsDialogMessageW(hdlg.rawAddress.toString(), lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isGUIThread(bconvert: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsGUIThread(bconvert) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isHungAppWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsHungAppWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isIconic(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsIconic(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMenu(hmenu: Hmenu): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsMenu(hmenu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessDPIAware(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsProcessDPIAware() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowArranged(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindowArranged(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowUnicode(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindowUnicode(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWindowVisible(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsWindowVisible(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWow64Message(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsWow64Message() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isZoomed(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingIsZoomed(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun killTimer(hwnd: Hwnd, uidevent: ULong): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingKillTimer(hwnd.rawAddress.toString(), uidevent.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAcceleratorsA(hinstance: Hinstance, lptablename: Pcstr): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsA(hinstance.rawAddress.toString(), lptablename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadAcceleratorsW(hinstance: Hinstance, lptablename: Pcwstr): Haccel =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadAcceleratorsW(hinstance.rawAddress.toString(), lptablename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorA(hinstance: Hinstance, lpcursorname: Pcstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorA(hinstance.rawAddress.toString(), lpcursorname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorFromFileA(lpfilename: Pcstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileA(lpfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorFromFileW(lpfilename: Pcwstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorFromFileW(lpfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadCursorW(hinstance: Hinstance, lpcursorname: Pcwstr): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadCursorW(hinstance.rawAddress.toString(), lpcursorname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconA(hinstance: Hinstance, lpiconname: Pcstr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadIconA(hinstance.rawAddress.toString(), lpiconname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconW(hinstance: Hinstance, lpiconname: Pcwstr): Hicon =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadIconW(hinstance.rawAddress.toString(), lpiconname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImageA(hinst: Hinstance, name: Pcstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadImageA(hinst.rawAddress.toString(), name.rawAddress.toString(), type.toInt(), cx, cy, fuload.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadImageW(hinst: Hinstance, name: Pcwstr, type: GdiImageType, cx: Int, cy: Int, fuload: ImageFlags): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadImageW(hinst.rawAddress.toString(), name.rawAddress.toString(), type.toInt(), cx, cy, fuload.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuA(hinstance: Hinstance, lpmenuname: Pcstr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuA(hinstance.rawAddress.toString(), lpmenuname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuIndirectA(lpmenutemplate: ConstPtr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectA(lpmenutemplate.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuIndirectW(lpmenutemplate: ConstPtr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuIndirectW(lpmenutemplate.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadMenuW(hinstance: Hinstance, lpmenuname: Pcwstr): Hmenu =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingLoadMenuW(hinstance.rawAddress.toString(), lpmenuname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringA(hinstance: Hinstance, uid: UInt, lpbuffer: Pstr, cchbuffermax: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingLoadStringA(hinstance.rawAddress.toString(), uid.toInt(), lpbuffer.rawAddress.toString(), cchbuffermax) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringW(hinstance: Hinstance, uid: UInt, lpbuffer: Pwstr, cchbuffermax: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingLoadStringW(hinstance.rawAddress.toString(), uid.toInt(), lpbuffer.rawAddress.toString(), cchbuffermax) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockSetForegroundWindow(ulockcode: ForegroundWindowLockCode): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingLockSetForegroundWindow(ulockcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logicalToPhysicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingLogicalToPhysicalPoint(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupIconIdFromDirectory(presbits: ConstPtr, ficon: Bool): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectory(presbits.rawAddress.toString(), ficon) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupIconIdFromDirectoryEx(presbits: ConstPtr, ficon: Bool, cxdesired: Int, cydesired: Int, flags: ImageFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingLookupIconIdFromDirectoryEx(presbits.rawAddress.toString(), ficon, cxdesired, cydesired, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapDialogRect(hdlg: Hwnd, lprect: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMapDialogRect(hdlg.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun menuItemFromPoint(hwnd: Hwnd, hmenu: Hmenu, ptscreen: Point): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxA(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxExA(hwnd: Hwnd, lptext: Pcstr, lpcaption: Pcstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxExA(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt(), wlanguageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxExW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle, wlanguageid: UShort): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxExW(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt(), wlanguageid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxIndirectA(lpmbp: ConstPtr): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectA(lpmbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxIndirectW(lpmbp: ConstPtr): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxIndirectW(lpmbp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun messageBoxW(hwnd: Hwnd, lptext: Pcwstr, lpcaption: Pcwstr, utype: MessageboxStyle): MessageboxResult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMessageBoxW(hwnd.rawAddress.toString(), lptext.rawAddress.toString(), lpcaption.rawAddress.toString(), utype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyMenuA(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingModifyMenuA(hmnu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyMenuW(hmnu: Hmenu, uposition: UInt, uflags: MenuItemFlags, uidnewitem: ULong, lpnewitem: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingModifyMenuW(hmnu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), uidnewitem.toString(), lpnewitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveWindow(hwnd: Hwnd, x: Int, y: Int, nwidth: Int, nheight: Int, brepaint: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMoveWindow(hwnd.rawAddress.toString(), x, y, nwidth, nheight, brepaint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateConfig(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmlfile: Pcwstr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateConfig(platformversion, defaultqualifiers.rawAddress.toString(), outputxmlfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateConfigInMemory(platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateConfigInMemory(platformversion, defaultqualifiers.rawAddress.toString(), outputxmldata.rawAddress.toString(), outputxmlsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFile(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFileInMemory(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, outputpridata: MutPtr, outputprisize: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceFileWithChecksum(indexer: MrmResourceIndexerHandle, packagingmode: MrmPackagingMode, packagingoptions: MrmPackagingOptions, checksum: UInt, outputdirectory: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexer(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexer(packagefamilyname.rawAddress.toString(), projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), indexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousPriData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, pridata: ConstPtr, prisize: UInt, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriData(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), pridata.rawAddress.toString(), prisize.toInt(), indexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousPriFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, prifile: Pcwstr, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousPriFile(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), prifile.rawAddress.toString(), indexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaData(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemaxmldata: ConstPtr, schemaxmlsize: UInt, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaData(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), schemaxmldata.rawAddress.toString(), schemaxmlsize.toInt(), indexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerFromPreviousSchemaFile(projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, schemafile: Pcwstr, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerFromPreviousSchemaFile(projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), schemafile.rawAddress.toString(), indexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmCreateResourceIndexerWithFlags(packagefamilyname: Pcwstr, projectroot: Pcwstr, platformversion: MrmPlatformVersion, defaultqualifiers: Pcwstr, flags: MrmIndexerFlags, indexer: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmCreateResourceIndexerWithFlags(packagefamilyname.rawAddress.toString(), projectroot.rawAddress.toString(), platformversion, defaultqualifiers.rawAddress.toString(), flags, indexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDestroyIndexerAndMessages(indexer: MrmResourceIndexerHandle): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriDataInMemory(inputpridata: ConstPtr, inputprisize: UInt, schemapridata: ConstPtr, schemaprisize: UInt, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmDumpPriDataInMemory(inputpridata.rawAddress.toString(), inputprisize.toInt(), schemapridata.rawAddress.toString(), schemaprisize.toInt(), dumptype, outputxmldata.rawAddress.toString(), outputxmlsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriFile(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmlfile: Pcwstr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFile(indexfilename.rawAddress.toString(), schemaprifile.rawAddress.toString(), dumptype, outputxmlfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmDumpPriFileInMemory(indexfilename: Pcwstr, schemaprifile: Pcwstr, dumptype: MrmDumpType, outputxmldata: MutPtr, outputxmlsize: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmDumpPriFileInMemory(indexfilename.rawAddress.toString(), schemaprifile.rawAddress.toString(), dumptype, outputxmldata.rawAddress.toString(), outputxmlsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmFreeMemory(data: ConstPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmFreeMemory(data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mrmGetPriFileContentChecksum(prifile: Pcwstr, checksum: MutPtr): Hresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMrmGetPriFileContentChecksum(prifile.rawAddress.toString(), checksum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

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
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjects(ncount.toInt(), phandles.rawAddress.toString(), fwaitall, dwmilliseconds.toInt(), dwwakemask.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun msgWaitForMultipleObjectsEx(ncount: UInt, phandles: ConstPtr, dwmilliseconds: UInt, dwwakemask: QueueStatusFlags, dwflags: MsgWaitForMultipleObjectsExFlags): WaitEvent =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingMsgWaitForMultipleObjectsEx(ncount.toInt(), phandles.rawAddress.toString(), dwmilliseconds.toInt(), dwwakemask.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharA(psrc: Pcstr, pdst: Pstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharA(psrc.rawAddress.toString(), pdst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharBuffA(lpszsrc: Pcstr, lpszdst: Pstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharBuffA(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharBuffW(lpszsrc: Pcstr, lpszdst: Pwstr, cchdstlength: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharBuffW(lpszsrc.rawAddress.toString(), lpszdst.rawAddress.toString(), cchdstlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oemToCharW(psrc: Pcstr, pdst: Pwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingOemToCharW(psrc.rawAddress.toString(), pdst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIcon(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingOpenIcon(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekMessageA(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPeekMessageA(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peekMessageW(lpmsg: MutPtr, hwnd: Hwnd, wmsgfiltermin: UInt, wmsgfiltermax: UInt, wremovemsg: PeekMessageRemoveType): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPeekMessageW(lpmsg.rawAddress.toString(), hwnd.rawAddress.toString(), wmsgfiltermin.toInt(), wmsgfiltermax.toInt(), wremovemsg.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun physicalToLogicalPoint(hwnd: Hwnd, lppoint: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPhysicalToLogicalPoint(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPostMessageA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPostMessageW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postQuitMessage(nexitcode: Int) {
    if (windowsWin32UiWindowsandmessagingNapiAvailable) {
        wasmWindowssysWindowsWin32UiWindowsandmessagingPostQuitMessage(nexitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun postThreadMessageA(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageA(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun postThreadMessageW(idthread: UInt, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPostThreadMessageW(idthread.toInt(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privateExtractIconsA(szfilename: Pcstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsA(szfilename.rawAddress.toString(), niconindex, cxicon, cyicon, phicon.rawAddress.toString(), piconid.rawAddress.toString(), nicons.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privateExtractIconsW(szfilename: Pcwstr, niconindex: Int, cxicon: Int, cyicon: Int, phicon: MutPtr, piconid: MutPtr, nicons: UInt, flags: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingPrivateExtractIconsW(szfilename.rawAddress.toString(), niconindex, cxicon, cyicon, phicon.rawAddress.toString(), piconid.rawAddress.toString(), nicons.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realChildWindowFromPoint(hwndparent: Hwnd, ptparentclientcoords: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realGetWindowClassA(hwnd: Hwnd, ptszclassname: Pstr, cchclassnamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassA(hwnd.rawAddress.toString(), ptszclassname.rawAddress.toString(), cchclassnamemax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realGetWindowClassW(hwnd: Hwnd, ptszclassname: Pwstr, cchclassnamemax: UInt): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRealGetWindowClassW(hwnd.rawAddress.toString(), ptszclassname.rawAddress.toString(), cchclassnamemax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassA(lpwndclass: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassA(lpwndclass.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassExA(param0: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassExA(param0.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassExW(param0: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassExW(param0.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerClassW(lpwndclass: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterClassW(lpwndclass.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceNotificationA(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationA(hrecipient.rawAddress.toString(), notificationfilter.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceNotificationW(hrecipient: Handle, notificationfilter: ConstPtr, flags: RegisterNotificationFlags): Hdevnotify =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterDeviceNotificationW(hrecipient.rawAddress.toString(), notificationfilter.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForTooltipDismissNotification(hwnd: Hwnd, tdflags: TooltipDismissFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterForTooltipDismissNotification(hwnd.rawAddress.toString(), tdflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerShellHookWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterShellHookWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWindowMessageA(lpstring: Pcstr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageA(lpstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWindowMessageW(lpstring: Pcwstr): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRegisterWindowMessageW(lpstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeMenu(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingRemoveMenu(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePropA(hwnd: Hwnd, lpstring: Pcstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingRemovePropA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removePropW(hwnd: Hwnd, lpstring: Pcwstr): Handle =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingRemovePropW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replyMessage(lresult: Lresult): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingReplyMessage(lresult.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollDC(hdc: Hdc, dx: Int, dy: Int, lprcscroll: ConstPtr, lprcclip: ConstPtr, hrgnupdate: Hrgn, lprcupdate: MutPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingScrollDC(hdc.rawAddress.toString(), dx, dy, lprcscroll.rawAddress.toString(), lprcclip.rawAddress.toString(), hrgnupdate.rawAddress.toString(), lprcupdate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollWindow(hwnd: Hwnd, xamount: Int, yamount: Int, lprect: ConstPtr, lpcliprect: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingScrollWindow(hwnd.rawAddress.toString(), xamount, yamount, lprect.rawAddress.toString(), lpcliprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollWindowEx(hwnd: Hwnd, dx: Int, dy: Int, prcscroll: ConstPtr, prcclip: ConstPtr, hrgnupdate: Hrgn, prcupdate: MutPtr, flags: ScrollWindowFlags): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingScrollWindowEx(hwnd.rawAddress.toString(), dx, dy, prcscroll.rawAddress.toString(), prcclip.rawAddress.toString(), hrgnupdate.rawAddress.toString(), prcupdate.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDlgItemMessageA(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageA(hdlg.rawAddress.toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDlgItemMessageW(hdlg: Hwnd, niddlgitem: Int, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendDlgItemMessageW(hdlg.rawAddress.toString(), niddlgitem, msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageCallbackA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), 0L.toString(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageCallbackW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lpresultcallback: Sendasyncproc, dwdata: ULong): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageCallbackW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), 0L.toString(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageTimeoutA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), lpdwresult.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageTimeoutW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, fuflags: SendMessageTimeoutFlags, utimeout: UInt, lpdwresult: MutPtr): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageTimeoutW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), fuflags.toInt(), utimeout.toInt(), lpdwresult.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendMessageW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendNotifyMessageA(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageA(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendNotifyMessageW(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSendNotifyMessageW(hwnd.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAdditionalForegroundBoostProcesses(toplevelwindow: Hwnd, processhandlecount: UInt, processhandlearray: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetAdditionalForegroundBoostProcesses(toplevelwindow.rawAddress.toString(), processhandlecount.toInt(), processhandlearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCaretBlinkTime(umseconds: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetCaretBlinkTime(umseconds.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCaretPos(x: Int, y: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetCaretPos(x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongA(hwnd.rawAddress.toString(), nindex, dwnewlong).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongPtrA(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrA(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongPtrW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Long): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongPtrW(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassLongW(hwnd: Hwnd, nindex: GetClassLongIndex, dwnewlong: Int): UInt =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassLongW(hwnd.rawAddress.toString(), nindex, dwnewlong).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setClassWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetClassWord(hwnd.rawAddress.toString(), nindex, wnewword.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCoalescableTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc, utolerancedelay: UInt): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetCoalescableTimer(hwnd.rawAddress.toString(), nidevent.toString(), uelapse.toInt(), 0L.toString(), utolerancedelay.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCursor(hcursor: Hcursor): Hcursor =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingSetCursor(hcursor.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCursorPos(x: Int, y: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetCursorPos(x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDebugErrorLevel(dwlevel: UInt) {
    if (windowsWin32UiWindowsandmessagingNapiAvailable) {
        wasmWindowssysWindowsWin32UiWindowsandmessagingSetDebugErrorLevel(dwlevel.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setDlgItemInt(hdlg: Hwnd, niddlgitem: Int, uvalue: UInt, bsigned: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetDlgItemInt(hdlg.rawAddress.toString(), niddlgitem, uvalue.toInt(), bsigned) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDlgItemTextA(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextA(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDlgItemTextW(hdlg: Hwnd, niddlgitem: Int, lpstring: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetDlgItemTextW(hdlg.rawAddress.toString(), niddlgitem, lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setForegroundWindow(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetForegroundWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLayeredWindowAttributes(hwnd: Hwnd, crkey: Colorref, balpha: UByte, dwflags: LayeredWindowAttributesFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetLayeredWindowAttributes(hwnd.rawAddress.toString(), crkey.toInt(), balpha.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenu(hwnd: Hwnd, hmenu: Hmenu): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenu(hwnd.rawAddress.toString(), hmenu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuDefaultItem(hmenu: Hmenu, uitem: UInt, fbypos: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuDefaultItem(hmenu.rawAddress.toString(), uitem.toInt(), fbypos.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuInfo(param0: Hmenu, param1: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuInfo(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemBitmaps(hmenu: Hmenu, uposition: UInt, uflags: MenuItemFlags, hbitmapunchecked: Hbitmap, hbitmapchecked: Hbitmap): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuItemBitmaps(hmenu.rawAddress.toString(), uposition.toInt(), uflags.toInt(), hbitmapunchecked.rawAddress.toString(), hbitmapchecked.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemInfoA(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoA(hmenu.rawAddress.toString(), item.toInt(), fbypositon, lpmii.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuItemInfoW(hmenu: Hmenu, item: UInt, fbypositon: Bool, lpmii: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMenuItemInfoW(hmenu.rawAddress.toString(), item.toInt(), fbypositon, lpmii.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageExtraInfo(lparam: Lparam): Lparam =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMessageExtraInfo(lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMessageQueue(cmessagesmax: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetMessageQueue(cmessagesmax) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setParent(hwndchild: Hwnd, hwndnewparent: Hwnd): Hwnd =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingSetParent(hwndchild.rawAddress.toString(), hwndnewparent.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPhysicalCursorPos(x: Int, y: Int): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetPhysicalCursorPos(x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDPIAware(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetProcessDPIAware() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDefaultLayout(dwdefaultlayout: UInt): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetProcessDefaultLayout(dwdefaultlayout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropA(hwnd: Hwnd, lpstring: Pcstr, hdata: Handle): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetPropA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), hdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPropW(hwnd: Hwnd, lpstring: Pcwstr, hdata: Handle): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetPropW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString(), hdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemCursor(hcur: Hcursor, id: SystemCursorId): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetSystemCursor(hcur.rawAddress.toString(), id.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimer(hwnd: Hwnd, nidevent: ULong, uelapse: UInt, lptimerfunc: Timerproc): ULong =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetTimer(hwnd.rawAddress.toString(), nidevent.toString(), uelapse.toInt(), 0L.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowDisplayAffinity(hwnd: Hwnd, dwaffinity: WindowDisplayAffinity): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowDisplayAffinity(hwnd.rawAddress.toString(), dwaffinity.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongA(hwnd.rawAddress.toString(), nindex, dwnewlong) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongPtrA(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrA(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongPtrW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Long): Long =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongPtrW(hwnd.rawAddress.toString(), nindex, dwnewlong.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowLongW(hwnd: Hwnd, nindex: WindowLongPtrIndex, dwnewlong: Int): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowLongW(hwnd.rawAddress.toString(), nindex, dwnewlong) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowPlacement(hwnd: Hwnd, lpwndpl: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowPlacement(hwnd.rawAddress.toString(), lpwndpl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowPos(hwnd: Hwnd, hwndinsertafter: Hwnd, x: Int, y: Int, cx: Int, cy: Int, uflags: SetWindowPosFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowPos(hwnd.rawAddress.toString(), hwndinsertafter.rawAddress.toString(), x, y, cx, cy, uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTextA(hwnd: Hwnd, lpstring: Pcstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowTextA(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTextW(hwnd: Hwnd, lpstring: Pcwstr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowTextW(hwnd.rawAddress.toString(), lpstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowWord(hwnd: Hwnd, nindex: Int, wnewword: UShort): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowWord(hwnd.rawAddress.toString(), nindex, wnewword.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookA(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookA(nfiltertype, 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookExA(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExA(idhook, 0L.toString(), hmod.rawAddress.toString(), dwthreadid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookExW(idhook: WindowsHookId, lpfn: Hookproc, hmod: Hinstance, dwthreadid: UInt): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookExW(idhook, 0L.toString(), hmod.rawAddress.toString(), dwthreadid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowsHookW(nfiltertype: Int, pfnfilterproc: Hookproc): Hhook =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiWindowsandmessagingSetWindowsHookW(nfiltertype, 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCaret(hwnd: Hwnd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingShowCaret(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showCursor(bshow: Bool): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingShowCursor(bshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showOwnedPopups(hwnd: Hwnd, fshow: Bool): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingShowOwnedPopups(hwnd.rawAddress.toString(), fshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showWindow(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingShowWindow(hwnd.rawAddress.toString(), ncmdshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showWindowAsync(hwnd: Hwnd, ncmdshow: ShowWindowCmd): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingShowWindowAsync(hwnd.rawAddress.toString(), ncmdshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun soundSentry(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSoundSentry() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchToThisWindow(hwnd: Hwnd, funknown: Bool) {
    if (windowsWin32UiWindowsandmessagingNapiAvailable) {
        wasmWindowssysWindowsWin32UiWindowsandmessagingSwitchToThisWindow(hwnd.rawAddress.toString(), funknown)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun systemParametersInfoA(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoA(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress.toString(), fwinini.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemParametersInfoW(uiaction: SystemParametersInfoAction, uiparam: UInt, pvparam: MutPtr, fwinini: SystemParametersInfoUpdateFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingSystemParametersInfoW(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress.toString(), fwinini.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tileWindows(hwndparent: Hwnd, whow: TileWindowsHow, lprect: ConstPtr, ckids: UInt, lpkids: ConstPtr): UShort =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTileWindows(hwndparent.rawAddress.toString(), whow.toInt(), lprect.rawAddress.toString(), ckids.toInt(), lpkids.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackPopupMenu(hmenu: Hmenu, uflags: TrackPopupMenuFlags, x: Int, y: Int, nreserved: Int, hwnd: Hwnd, prcrect: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTrackPopupMenu(hmenu.rawAddress.toString(), uflags.toInt(), x, y, nreserved, hwnd.rawAddress.toString(), prcrect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun trackPopupMenuEx(hmenu: Hmenu, uflags: UInt, x: Int, y: Int, hwnd: Hwnd, lptpm: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTrackPopupMenuEx(hmenu.rawAddress.toString(), uflags.toInt(), x, y, hwnd.rawAddress.toString(), lptpm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateAcceleratorA(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorA(hwnd.rawAddress.toString(), hacctable.rawAddress.toString(), lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateAcceleratorW(hwnd: Hwnd, hacctable: Haccel, lpmsg: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateAcceleratorW(hwnd.rawAddress.toString(), hacctable.rawAddress.toString(), lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateMDISysAccel(hwndclient: Hwnd, lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateMDISysAccel(hwndclient.rawAddress.toString(), lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateMessage(lpmsg: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingTranslateMessage(lpmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWindowsHook(ncode: Int, pfnfilterproc: Hookproc): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHook(ncode, 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWindowsHookEx(hhk: Hhook): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUnhookWindowsHookEx(hhk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterClassA(lpclassname: Pcstr, hinstance: Hinstance): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUnregisterClassA(lpclassname.rawAddress.toString(), hinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterClassW(lpclassname: Pcwstr, hinstance: Hinstance): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUnregisterClassW(lpclassname.rawAddress.toString(), hinstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceNotification(handle: Hdevnotify): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUnregisterDeviceNotification(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateLayeredWindow(hwnd: Hwnd, hdcdst: Hdc, pptdst: ConstPtr, psize: ConstPtr, hdcsrc: Hdc, pptsrc: ConstPtr, crkey: Colorref, pblend: ConstPtr, dwflags: UpdateLayeredWindowFlags): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindow(hwnd.rawAddress.toString(), hdcdst.rawAddress.toString(), pptdst.rawAddress.toString(), psize.rawAddress.toString(), hdcsrc.rawAddress.toString(), pptsrc.rawAddress.toString(), crkey.toInt(), pblend.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateLayeredWindowIndirect(hwnd: Hwnd, pulwinfo: ConstPtr): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingUpdateLayeredWindowIndirect(hwnd.rawAddress.toString(), pulwinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitMessage(): Bool =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingWaitMessage() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromPhysicalPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromPoint(point: Point): Hwnd =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsprintfA(param0: Pstr, param1: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingWsprintfA(param0.rawAddress.toString(), param1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsprintfW(param0: Pwstr, param1: Pcwstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingWsprintfW(param0.rawAddress.toString(), param1.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvsprintfA(param0: Pstr, param1: Pcstr, arglist: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingWvsprintfA(param0.rawAddress.toString(), param1.rawAddress.toString(), arglist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvsprintfW(param0: Pwstr, param1: Pcwstr, arglist: ConstPtr): Int =
    if (windowsWin32UiWindowsandmessagingNapiAvailable) wasmWindowssysWindowsWin32UiWindowsandmessagingWvsprintfW(param0.rawAddress.toString(), param1.rawAddress.toString(), arglist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
