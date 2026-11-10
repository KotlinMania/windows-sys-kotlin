@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32UiControlsDialogsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun chooseColorA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_chooseColorA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseColorW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_chooseColorW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_chooseFontA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_chooseFontW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commDlgExtendedError(): CommonDlgErrors =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextA(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_findTextA((param0?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextW(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_findTextW((param0?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_getFileTitleA((param0?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), cchsize.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_getFileTitleW((param0?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), cchsize.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgA(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgW(param0: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgA(ppd: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_printDlgA((ppd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExA(ppd: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_printDlgExA((ppd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExW(ppd: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_printDlgExW((ppd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgW(ppd: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_printDlgW((ppd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextA(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_replaceTextA((param0?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextW(param0: COpaquePointer?): Hwnd =
    if (_windowsWin32UiControlsDialogsNapiAddon != null) (_windowsWin32UiControlsDialogsNapiAddon.windowssys_windows_win32_ui_controls_dialogs_replaceTextW((param0?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
