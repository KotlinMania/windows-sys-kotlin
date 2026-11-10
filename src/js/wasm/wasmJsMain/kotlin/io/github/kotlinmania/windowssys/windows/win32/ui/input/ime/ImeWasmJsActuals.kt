@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.COpaquePointer
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
private external fun _initWindowsWin32UiInputImeNapiAddon(): Boolean

private val _windowsWin32UiInputImeNapiAvailable: Boolean = _initWindowsWin32UiInputImeNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immAssociateContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immAssociateContext(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immAssociateContextEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immAssociateContextEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immConfigureIMEA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immConfigureIMEA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immConfigureIMEW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immConfigureIMEW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immCreateContext()")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immCreateContext(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immCreateIMCC(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immCreateIMCC(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immDestroyContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immDestroyContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immDestroyIMCC(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immDestroyIMCC(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immDisableIME(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immDisableIME(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immDisableLegacyIME()")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immDisableLegacyIME(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immEnumInputContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immEnumInputContext(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immEscapeA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immEscapeA(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immEscapeW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immEscapeW(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGenerateMessage(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGenerateMessage(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCandidateListA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCandidateListW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCandidateWindow(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateWindow(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCompositionFontA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionFontA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCompositionFontW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionFontW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCompositionStringA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionStringA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCompositionStringW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionStringW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetCompositionWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetContext(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetConversionListA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetConversionListA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetConversionListW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetConversionListW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetConversionStatus(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetConversionStatus(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetDescriptionA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetDescriptionA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetDescriptionW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetDescriptionW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetGuideLineA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetGuideLineA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetGuideLineW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetGuideLineW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetHotKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetHotKey(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetIMCCSize(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetIMCCSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetIMCLockCount(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetIMCLockCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetOpenStatus(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetOpenStatus(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetProperty(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetProperty(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immGetVirtualKey(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immGetVirtualKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immInstallIMEA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immInstallIMEA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immInstallIMEW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immInstallIMEW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immIsIME(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immIsIME(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immIsUIMessageA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immIsUIMessageA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immIsUIMessageW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immIsUIMessageW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immLockIMC(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immLockIMC(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immLockIMCC(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immLockIMCC(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immNotifyIME(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immNotifyIME(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immReSizeIMCC(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immReSizeIMCC(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immRegisterWordA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immRegisterWordA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immRegisterWordW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immRegisterWordW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immReleaseContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immReleaseContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immRequestMessageA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immRequestMessageA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immRequestMessageW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immRequestMessageW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetCandidateWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetCandidateWindow(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetCompositionFontA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionFontA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetCompositionFontW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionFontW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetCompositionStringA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionStringA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetCompositionStringW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionStringW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetCompositionWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionWindow(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetConversionStatus(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetConversionStatus(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetHotKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetHotKey(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetOpenStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetOpenStatus(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immSimulateHotKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immSimulateHotKey(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immUnlockIMC(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immUnlockIMC(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immUnlockIMCC(p0)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immUnlockIMCC(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immUnregisterWordA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immUnregisterWordA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_input_ime_immUnregisterWordW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_input_ime_immUnregisterWordW(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immAssociateContext((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immAssociateContextEx((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immConfigureIMEA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immConfigureIMEW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateContext(): Himc =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immCreateContext().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateIMCC(param0: UInt): Himcc =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immCreateIMCC(param0.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immCreateSoftKeyboard(param0.toInt(), (param1?.value ?: 0L).toString(), param2, param3).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroyContext(param0: Himc): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immDestroyContext((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immDestroyIMCC((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immDestroySoftKeyboard((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableIME(param0: UInt): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immDisableIME(param0.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableLegacyIME(): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immDisableLegacyIME() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immDisableTextFrameService(idthread.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immEnumInputContext(idthread.toInt(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: COpaquePointer?): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immEnumRegisterWordA((param0?.value ?: 0L).toString(), 0L.toString(), (lpszreading?.value ?: 0L).toString(), param3.toInt(), (lpszregister?.value ?: 0L).toString(), (param5?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: COpaquePointer?): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immEnumRegisterWordW((param0?.value ?: 0L).toString(), 0L.toString(), (lpszreading?.value ?: 0L).toString(), param3.toInt(), (lpszregister?.value ?: 0L).toString(), (param5?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immEscapeA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immEscapeW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGenerateMessage(param0: Himc): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGenerateMessage((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListA((param0?.value ?: 0L).toString(), deindex.toInt(), (lpcandlist?.value ?: 0L).toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListCountA((param0?.value ?: 0L).toString(), (lpdwlistcount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListCountW((param0?.value ?: 0L).toString(), (lpdwlistcount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateListW((param0?.value ?: 0L).toString(), deindex.toInt(), (lpcandlist?.value ?: 0L).toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCandidateWindow((param0?.value ?: 0L).toString(), param1.toInt(), (lpcandidate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionFontA((param0?.value ?: 0L).toString(), (lplf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionFontW((param0?.value ?: 0L).toString(), (lplf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionStringA((param0?.value ?: 0L).toString(), param1.toInt(), (lpbuf?.value ?: 0L).toString(), dwbuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionStringW((param0?.value ?: 0L).toString(), param1.toInt(), (lpbuf?.value ?: 0L).toString(), dwbuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetCompositionWindow((param0?.value ?: 0L).toString(), (lpcompform?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetContext(param0: Hwnd): Himc =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetContext((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetConversionListA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (lpsrc?.value ?: 0L).toString(), (lpdst?.value ?: 0L).toString(), dwbuflen.toInt(), uflag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetConversionListW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (lpsrc?.value ?: 0L).toString(), (lpdst?.value ?: 0L).toString(), dwbuflen.toInt(), uflag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: COpaquePointer?, lpfdwsentence: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetConversionStatus((param0?.value ?: 0L).toString(), (lpfdwconversion?.value ?: 0L).toString(), (lpfdwsentence?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetDefaultIMEWnd((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetDescriptionA((param0?.value ?: 0L).toString(), (lpszdescription?.value ?: 0L).toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetDescriptionW((param0?.value ?: 0L).toString(), (lpszdescription?.value ?: 0L).toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetGuideLineA((param0?.value ?: 0L).toString(), dwindex.toInt(), (lpbuf?.value ?: 0L).toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetGuideLineW((param0?.value ?: 0L).toString(), dwindex.toInt(), (lpbuf?.value ?: 0L).toString(), dwbuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetHotKey(param0: UInt, lpumodifiers: COpaquePointer?, lpuvkey: COpaquePointer?, phkl: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetHotKey(param0.toInt(), (lpumodifiers?.value ?: 0L).toString(), (lpuvkey?.value ?: 0L).toString(), (phkl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetIMCCLockCount((param0?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetIMCCSize((param0?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetIMCLockCount((param0?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetIMEFileNameA((param0?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetIMEFileNameW((param0?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), ubuflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsA((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt(), (lpimeparentmenu?.value ?: 0L).toString(), (lpimemenu?.value ?: 0L).toString(), dwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetImeMenuItemsW((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt(), (lpimeparentmenu?.value ?: 0L).toString(), (lpimemenu?.value ?: 0L).toString(), dwsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetOpenStatus(param0: Himc): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetOpenStatus((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetProperty((param0?.value ?: 0L).toString(), param1.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleA((param0?.value ?: 0L).toString(), nitem.toInt(), (lpstylebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetRegisterWordStyleW((param0?.value ?: 0L).toString(), nitem.toInt(), (lpstylebuf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetStatusWindowPos((param0?.value ?: 0L).toString(), (lpptpos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immGetVirtualKey((param0?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immInstallIMEA((lpszimefilename?.value ?: 0L).toString(), (lpszlayouttext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immInstallIMEW((lpszimefilename?.value ?: 0L).toString(), (lpszlayouttext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsIME(param0: Hkl): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immIsIME((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immIsUIMessageA((param0?.value ?: 0L).toString(), param1.toInt(), param2.toString(), param3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immIsUIMessageW((param0?.value ?: 0L).toString(), param1.toInt(), param2.toString(), param3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immLockIMC(param0: Himc): COpaquePointer? =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immLockIMC((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immLockIMCC(param0: Himcc): COpaquePointer? =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immLockIMCC((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immNotifyIME((param0?.value ?: 0L).toString(), dwaction.toInt(), dwindex.toInt(), dwvalue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immReSizeIMCC((param0?.value ?: 0L).toString(), param1.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immRegisterWordA((param0?.value ?: 0L).toString(), (lpszreading?.value ?: 0L).toString(), param2.toInt(), (lpszregister?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immRegisterWordW((param0?.value ?: 0L).toString(), (lpszreading?.value ?: 0L).toString(), param2.toInt(), (lpszregister?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immReleaseContext((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immRequestMessageA((param0?.value ?: 0L).toString(), param1.toString(), param2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immRequestMessageW((param0?.value ?: 0L).toString(), param1.toString(), param2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetCandidateWindow((param0?.value ?: 0L).toString(), (lpcandidate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionFontA((param0?.value ?: 0L).toString(), (lplf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionFontW((param0?.value ?: 0L).toString(), (lplf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionStringA((param0?.value ?: 0L).toString(), dwindex.toInt(), (lpcomp?.value ?: 0L).toString(), dwcomplen.toInt(), (lpread?.value ?: 0L).toString(), dwreadlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionStringW((param0?.value ?: 0L).toString(), dwindex.toInt(), (lpcomp?.value ?: 0L).toString(), dwcomplen.toInt(), (lpread?.value ?: 0L).toString(), dwreadlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetCompositionWindow((param0?.value ?: 0L).toString(), (lpcompform?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetConversionStatus((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetOpenStatus((param0?.value ?: 0L).toString(), param1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSetStatusWindowPos((param0?.value ?: 0L).toString(), (lpptpos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immShowSoftKeyboard((param0?.value ?: 0L).toString(), param1) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immSimulateHotKey((param0?.value ?: 0L).toString(), param1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnlockIMC(param0: Himc): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immUnlockIMC((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immUnlockIMCC((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immUnregisterWordA((param0?.value ?: 0L).toString(), (lpszreading?.value ?: 0L).toString(), param2.toInt(), (lpszunregister?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    if (_windowsWin32UiInputImeNapiAvailable) _wasm_windowssys_windows_win32_ui_input_ime_immUnregisterWordW((param0?.value ?: 0L).toString(), (lpszreading?.value ?: 0L).toString(), param2.toInt(), (lpszunregister?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
