@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32UiControlsDialogsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun chooseColorA(param0: MutPtr<Choosecolora>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsChooseColorA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseColorW(param0: MutPtr<Choosecolorw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsChooseColorW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontA(param0: MutPtr<Choosefonta>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsChooseFontA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontW(param0: MutPtr<Choosefontw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsChooseFontW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commDlgExtendedError(): CommonDlgErrors =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextA(param0: MutPtr<Findreplacea>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAddon != null) MutPtr((windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsFindTextA(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextW(param0: MutPtr<Findreplacew>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAddon != null) MutPtr((windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsFindTextW(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsGetFileTitleA(param0.rawAddress.toString(), buf.rawAddress.toString(), cchsize.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsGetFileTitleW(param0.rawAddress.toString(), buf.rawAddress.toString(), cchsize.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameA(param0: MutPtr<Openfilenamea>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameW(param0: MutPtr<Openfilenamew>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameA(param0: MutPtr<Openfilenamea>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameW(param0: MutPtr<Openfilenamew>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgA(param0: MutPtr<Pagesetupdlga>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgW(param0: MutPtr<Pagesetupdlgw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgA(ppd: MutPtr<Printdlga>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsPrintDlgA(ppd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExA(ppd: MutPtr<Printdlgexa>): Hresult =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsPrintDlgExA(ppd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExW(ppd: MutPtr<Printdlgexw>): Hresult =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsPrintDlgExW(ppd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgW(ppd: MutPtr<Printdlgw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAddon != null) (windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsPrintDlgW(ppd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextA(param0: MutPtr<Findreplacea>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAddon != null) MutPtr((windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsReplaceTextA(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextW(param0: MutPtr<Findreplacew>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAddon != null) MutPtr((windowsWin32UiControlsDialogsNapiAddon.windowssysWindowsWin32UiControlsDialogsReplaceTextW(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
