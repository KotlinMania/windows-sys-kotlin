@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.Hkl

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiInputImeNapiAddon(): Boolean

private val windowsWin32UiInputImeNapiAvailable: Boolean = initWindowsWin32UiInputImeNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmAssociateContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmAssociateContext(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmAssociateContextEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmAssociateContextEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmConfigureIMEA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmConfigureIMEA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmConfigureIMEW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmConfigureIMEW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmCreateContext()")
private external fun wasmWindowssysWindowsWin32UiInputImeImmCreateContext(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmCreateIMCC(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmCreateIMCC(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmDestroyContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmDestroyContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmDestroyIMCC(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmDestroyIMCC(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmDisableIME(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmDisableIME(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmDisableLegacyIME()")
private external fun wasmWindowssysWindowsWin32UiInputImeImmDisableLegacyIME(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmDisableTextFrameService(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmDisableTextFrameService(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmEnumInputContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmEnumInputContext(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmEnumRegisterWordA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmEnumRegisterWordW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmEscapeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmEscapeA(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmEscapeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmEscapeW(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGenerateMessage(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGenerateMessage(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCandidateListA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListCountA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListCountW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCandidateListW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCandidateWindow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCandidateWindow(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCompositionFontA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCompositionFontA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCompositionFontW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCompositionFontW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCompositionStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCompositionStringA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCompositionStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCompositionStringW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetCompositionWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetCompositionWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetContext(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetContext(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetConversionListA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetConversionListA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetConversionListW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetConversionListW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetConversionStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetConversionStatus(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetDescriptionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetDescriptionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetDescriptionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetDescriptionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetGuideLineA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetGuideLineA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetGuideLineW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetGuideLineW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetHotKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetHotKey(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetIMCCLockCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetIMCCSize(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetIMCCSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetIMCLockCount(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetIMCLockCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetIMEFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetIMEFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetOpenStatus(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetOpenStatus(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetProperty(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetProperty(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetStatusWindowPos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmGetVirtualKey(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmGetVirtualKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmInstallIMEA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmInstallIMEA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmInstallIMEW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmInstallIMEW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmIsIME(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmIsIME(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmIsUIMessageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmIsUIMessageA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmIsUIMessageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmIsUIMessageW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmLockIMC(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmLockIMC(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmLockIMCC(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmLockIMCC(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmNotifyIME(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmNotifyIME(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmReSizeIMCC(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmReSizeIMCC(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmRegisterWordA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmRegisterWordA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmRegisterWordW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmRegisterWordW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmReleaseContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmReleaseContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmRequestMessageA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmRequestMessageA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmRequestMessageW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmRequestMessageW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetCandidateWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetCandidateWindow(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetCompositionFontA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetCompositionFontA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetCompositionFontW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetCompositionFontW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetCompositionStringA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetCompositionStringA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetCompositionStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetCompositionStringW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetCompositionWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetCompositionWindow(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetConversionStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetConversionStatus(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetHotKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetHotKey(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetOpenStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetOpenStatus(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSetStatusWindowPos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmShowSoftKeyboard(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmSimulateHotKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmSimulateHotKey(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmUnlockIMC(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmUnlockIMC(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmUnlockIMCC(p0)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmUnlockIMCC(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmUnregisterWordA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmUnregisterWordA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiInputImeImmUnregisterWordW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiInputImeImmUnregisterWordW(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmAssociateContext(param0.rawAddress.toString(), param1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmAssociateContextEx(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmConfigureIMEA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmConfigureIMEW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateContext(): Himc =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmCreateContext().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateIMCC(param0: UInt): Himcc =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmCreateIMCC(param0.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(param0.toInt(), param1.rawAddress.toString(), param2, param3).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroyContext(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmDestroyContext(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmDestroyIMCC(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableIME(param0: UInt): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmDisableIME(param0.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableLegacyIME(): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmDisableLegacyIME() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmEnumInputContext(idthread.toInt(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmEnumRegisterWordA(param0.rawAddress.toString(), 0L.toString(), lpszreading.rawAddress.toString(), param3.toInt(), lpszregister.rawAddress.toString(), param5.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmEnumRegisterWordW(param0.rawAddress.toString(), 0L.toString(), lpszreading.rawAddress.toString(), param3.toInt(), lpszregister.rawAddress.toString(), param5.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmEscapeA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmEscapeW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGenerateMessage(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGenerateMessage(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListA(param0.rawAddress.toString(), deindex.toInt(), lpcandlist.rawAddress.toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListCountA(param0.rawAddress.toString(), lpdwlistcount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListCountW(param0.rawAddress.toString(), lpdwlistcount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCandidateListW(param0.rawAddress.toString(), deindex.toInt(), lpcandlist.rawAddress.toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCandidateWindow(param0.rawAddress.toString(), param1.toInt(), lpcandidate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionFontA(param0: Himc, lplf: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCompositionFontA(param0.rawAddress.toString(), lplf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionFontW(param0: Himc, lplf: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCompositionFontW(param0.rawAddress.toString(), lplf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCompositionStringA(param0.rawAddress.toString(), param1.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCompositionStringW(param0.rawAddress.toString(), param1.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetCompositionWindow(param0.rawAddress.toString(), lpcompform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetContext(param0: Hwnd): Himc =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmGetContext(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetConversionListA(param0.rawAddress.toString(), param1.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), dwbuflen.toInt(), uflag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetConversionListW(param0.rawAddress.toString(), param1.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), dwbuflen.toInt(), uflag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: MutPtr, lpfdwsentence: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetConversionStatus(param0.rawAddress.toString(), lpfdwconversion.rawAddress.toString(), lpfdwsentence.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetDescriptionA(param0.rawAddress.toString(), lpszdescription.rawAddress.toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetDescriptionW(param0.rawAddress.toString(), lpszdescription.rawAddress.toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetGuideLineA(param0.rawAddress.toString(), dwindex.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetGuideLineW(param0.rawAddress.toString(), dwindex.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetHotKey(param0: UInt, lpumodifiers: MutPtr, lpuvkey: MutPtr, phkl: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetHotKey(param0.toInt(), lpumodifiers.rawAddress.toString(), lpuvkey.rawAddress.toString(), phkl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetIMCCLockCount(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetIMCCSize(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetIMCLockCount(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetIMEFileNameA(param0.rawAddress.toString(), lpszfilename.rawAddress.toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetIMEFileNameW(param0.rawAddress.toString(), lpszfilename.rawAddress.toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), lpimeparentmenu.rawAddress.toString(), lpimemenu.rawAddress.toString(), dwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), lpimeparentmenu.rawAddress.toString(), lpimemenu.rawAddress.toString(), dwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetOpenStatus(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetOpenStatus(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetProperty(param0.rawAddress.toString(), param1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(param0.rawAddress.toString(), nitem.toInt(), lpstylebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(param0.rawAddress.toString(), nitem.toInt(), lpstylebuf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetStatusWindowPos(param0.rawAddress.toString(), lpptpos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmGetVirtualKey(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmInstallIMEA(lpszimefilename.rawAddress.toString(), lpszlayouttext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmInstallIMEW(lpszimefilename.rawAddress.toString(), lpszlayouttext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsIME(param0: Hkl): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmIsIME(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmIsUIMessageA(param0.rawAddress.toString(), param1.toInt(), param2.toString(), param3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmIsUIMessageW(param0.rawAddress.toString(), param1.toInt(), param2.toString(), param3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immLockIMC(param0: Himc): MutPtr =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmLockIMC(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immLockIMCC(param0: Himcc): MutPtr =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmLockIMCC(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmNotifyIME(param0.rawAddress.toString(), dwaction.toInt(), dwindex.toInt(), dwvalue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    if (windowsWin32UiInputImeNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiInputImeImmReSizeIMCC(param0.rawAddress.toString(), param1.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmRegisterWordA(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszregister.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmRegisterWordW(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszregister.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmReleaseContext(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmRequestMessageA(param0.rawAddress.toString(), param1.toString(), param2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmRequestMessageW(param0.rawAddress.toString(), param1.toString(), param2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetCandidateWindow(param0.rawAddress.toString(), lpcandidate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionFontA(param0: Himc, lplf: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetCompositionFontA(param0.rawAddress.toString(), lplf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionFontW(param0: Himc, lplf: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetCompositionFontW(param0.rawAddress.toString(), lplf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetCompositionStringA(param0.rawAddress.toString(), dwindex.toInt(), lpcomp.rawAddress.toString(), dwcomplen.toInt(), lpread.rawAddress.toString(), dwreadlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetCompositionStringW(param0.rawAddress.toString(), dwindex.toInt(), lpcomp.rawAddress.toString(), dwcomplen.toInt(), lpread.rawAddress.toString(), dwreadlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetCompositionWindow(param0.rawAddress.toString(), lpcompform.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetConversionStatus(param0.rawAddress.toString(), param1.toInt(), param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetOpenStatus(param0.rawAddress.toString(), param1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSetStatusWindowPos(param0.rawAddress.toString(), lpptpos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmShowSoftKeyboard(param0.rawAddress.toString(), param1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmSimulateHotKey(param0.rawAddress.toString(), param1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnlockIMC(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmUnlockIMC(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmUnlockIMCC(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmUnregisterWordA(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszunregister.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    if (windowsWin32UiInputImeNapiAvailable) wasmWindowssysWindowsWin32UiInputImeImmUnregisterWordW(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszunregister.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
