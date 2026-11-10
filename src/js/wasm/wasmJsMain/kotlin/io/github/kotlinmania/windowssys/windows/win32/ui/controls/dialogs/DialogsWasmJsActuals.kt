@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiControlsDialogsNapiAddon(): Boolean

private val _windowsWin32UiControlsDialogsNapiAvailable: Boolean = _initWindowsWin32UiControlsDialogsNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_chooseColorA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseColorA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_chooseColorW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseColorW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_chooseFontA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseFontA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_chooseFontW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseFontW(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError()")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_findTextA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_findTextA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_findTextW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_findTextW(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_getFileTitleA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_getFileTitleA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_getFileTitleW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_getFileTitleW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_printDlgA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_printDlgExA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgExA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_printDlgExW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgExW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_printDlgW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_replaceTextA(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_replaceTextA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_controls_dialogs_replaceTextW(p0)")
private external fun _wasm_windowssys_windows_win32_ui_controls_dialogs_replaceTextW(p0: String): String

public actual fun chooseColorA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseColorA((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseColorW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseColorW((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseFontA((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_chooseFontW((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commDlgExtendedError(): CommonDlgErrors =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextA(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_findTextA((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextW(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_findTextW((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_getFileTitleA((param0?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), cchsize.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_getFileTitleW((param0?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), cchsize.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgA(ppd: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgA((ppd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExA(ppd: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgExA((ppd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExW(ppd: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgExW((ppd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgW(ppd: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_printDlgW((ppd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextA(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_replaceTextA((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextW(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAvailable) _wasm_windowssys_windows_win32_ui_controls_dialogs_replaceTextW((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
