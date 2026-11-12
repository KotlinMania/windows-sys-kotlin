@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiControlsDialogsNapiAddon(): Boolean

private val windowsWin32UiControlsDialogsNapiAvailable: Boolean = initWindowsWin32UiControlsDialogsNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsChooseColorA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsChooseColorA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsChooseColorW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsChooseColorW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsChooseFontA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsChooseFontA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsChooseFontW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsChooseFontW(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError()")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsCommDlgExtendedError(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsFindTextA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsFindTextA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsFindTextW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsFindTextW(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsGetFileTitleA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsGetFileTitleA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsGetFileTitleW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsGetFileTitleW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsPageSetupDlgA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsPageSetupDlgW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsPrintDlgA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsPrintDlgExA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgExA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsPrintDlgExW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgExW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsPrintDlgW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsReplaceTextA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsReplaceTextA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDialogsReplaceTextW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDialogsReplaceTextW(p0: String): String

public actual fun chooseColorA(param0: MutPtr<Choosecolora>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsChooseColorA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseColorW(param0: MutPtr<Choosecolorw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsChooseColorW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontA(param0: MutPtr<Choosefonta>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsChooseFontA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chooseFontW(param0: MutPtr<Choosefontw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsChooseFontW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commDlgExtendedError(): CommonDlgErrors =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsCommDlgExtendedError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextA(param0: MutPtr<Findreplacea>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDialogsFindTextA(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findTextW(param0: MutPtr<Findreplacew>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDialogsFindTextW(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleA(param0: Pcstr, buf: Pstr, cchsize: UShort): Short =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsGetFileTitleA(param0.rawAddress.toString(), buf.rawAddress.toString(), cchsize.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTitleW(param0: Pcwstr, buf: Pwstr, cchsize: UShort): Short =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsGetFileTitleW(param0.rawAddress.toString(), buf.rawAddress.toString(), cchsize.toInt()).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameA(param0: MutPtr<Openfilenamea>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNameW(param0: MutPtr<Openfilenamew>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameA(param0: MutPtr<Openfilenamea>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNameW(param0: MutPtr<Openfilenamew>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgA(param0: MutPtr<Pagesetupdlga>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsPageSetupDlgA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pageSetupDlgW(param0: MutPtr<Pagesetupdlgw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsPageSetupDlgW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgA(ppd: MutPtr<Printdlga>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgA(ppd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExA(ppd: MutPtr<Printdlgexa>): Hresult =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgExA(ppd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgExW(ppd: MutPtr<Printdlgexw>): Hresult =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgExW(ppd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printDlgW(ppd: MutPtr<Printdlgw>): Bool =
    if (windowsWin32UiControlsDialogsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDialogsPrintDlgW(ppd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextA(param0: MutPtr<Findreplacea>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDialogsReplaceTextA(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceTextW(param0: MutPtr<Findreplacew>): Hwnd =
    if (windowsWin32UiControlsDialogsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDialogsReplaceTextW(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
