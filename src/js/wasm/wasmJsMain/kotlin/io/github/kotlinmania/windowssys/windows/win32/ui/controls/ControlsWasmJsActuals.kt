@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawEdgeFlags
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawTextFormat
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawedgeFlags
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgbquad
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Textmetricw
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ImageFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ScrollbarConstants
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Scrollinfo

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiControlsNapiAddon(): Boolean

private val windowsWin32UiControlsNapiAvailable: Boolean = initWindowsWin32UiControlsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBeginBufferedAnimation(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiControlsBeginBufferedAnimation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBeginBufferedPaint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsBeginBufferedPaint(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBeginPanningFeedback(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsBeginPanningFeedback(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBufferedPaintClear(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsBufferedPaintClear(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBufferedPaintInit()")
private external fun wasmWindowssysWindowsWin32UiControlsBufferedPaintInit(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBufferedPaintSetAlpha(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsBufferedPaintSetAlpha(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsBufferedPaintUnInit()")
private external fun wasmWindowssysWindowsWin32UiControlsBufferedPaintUnInit(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCheckDlgButton(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsCheckDlgButton(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCheckRadioButton(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsCheckRadioButton(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCloseThemeData(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsCloseThemeData(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreateMappedBitmap(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsCreateMappedBitmap(p0: String, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreatePropertySheetPageA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsCreatePropertySheetPageA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreatePropertySheetPageW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsCreatePropertySheetPageW(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreateStatusWindowA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsCreateStatusWindowA(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreateStatusWindowW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsCreateStatusWindowW(p0: Int, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreateToolbarEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32UiControlsCreateToolbarEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsCreateUpDownControl(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32UiControlsCreateUpDownControl(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: Int, p10: Int, p11: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaClone(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaCreate(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaCreate(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaCreateEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaCreateEx(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaDeleteAllPtrs(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaDeleteAllPtrs(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaDeletePtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaDeletePtr(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaDestroy(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaDestroyCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaDestroyCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaEnumCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaEnumCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaGetPtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaGetPtr(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaGetPtrIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaGetPtrIndex(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaGetSize(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaGetSize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaGrow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaGrow(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaInsertPtr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaInsertPtr(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaLoadStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaLoadStream(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaMerge(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaMerge(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaSaveStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaSaveStream(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaSearch(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaSearch(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaSetPtr(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaSetPtr(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDpaSort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDpaSort(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaClone(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaClone(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaCreate(p0: Int, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaDeleteAllItems(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaDeleteAllItems(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaDeleteItem(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaDeleteItem(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaDestroy(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaDestroyCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaDestroyCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaEnumCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaEnumCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaGetItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaGetItem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaGetItemPtr(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaGetItemPtr(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaGetSize(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaGetSize(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaInsertItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaInsertItem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaSetItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaSetItem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDsaSort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDsaSort(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDestroyPropertySheetPage(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDestroyPropertySheetPage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirListA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirListComboBoxA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirListComboBoxA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirListComboBoxW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirListComboBoxW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirListW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirSelectExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirSelectExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDlgDirSelectExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDlgDirSelectExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawInsert(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawInsert(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawShadowText(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawShadowText(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawStatusTextA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawStatusTextA(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawStatusTextW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawStatusTextW(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeBackground(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeBackground(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeBackgroundEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeBackgroundEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeEdge(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeEdge(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeIcon(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeIcon(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeParentBackground(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeParentBackground(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeText(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeText(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsDrawThemeTextEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiControlsDrawThemeTextEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEnableScrollBar(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsEnableScrollBar(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEnableThemeDialogTexture(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsEnableThemeDialogTexture(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEnableTheming(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsEnableTheming(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEndBufferedAnimation(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsEndBufferedAnimation(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEndBufferedPaint(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsEndBufferedPaint(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEndPanningFeedback(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsEndPanningFeedback(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEvaluateProximityToPolygon(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsEvaluateProximityToPolygon(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsEvaluateProximityToRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsEvaluateProximityToRect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbEnableScrollBar(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbEnableScrollBar(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbGetScrollInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbGetScrollPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollPos(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbGetScrollProp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollProp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbGetScrollRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollRange(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbSetScrollInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollInfo(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbSetScrollPos(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollPos(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbSetScrollProp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollProp(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbSetScrollRange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollRange(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsFlatSbShowScrollBar(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsFlatSbShowScrollBar(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetBufferedPaintBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsGetBufferedPaintBits(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetBufferedPaintDC(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsGetBufferedPaintDC(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetComboBoxInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsGetComboBoxInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetCurrentThemeName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetCurrentThemeName(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetEffectiveClientRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsGetEffectiveClientRect(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetListBoxInfo(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsGetListBoxInfo(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetMUILanguage()")
private external fun wasmWindowssysWindowsWin32UiControlsGetMUILanguage(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeAnimationProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeAnimationProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeAnimationTransform(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeAnimationTransform(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeAppProperties()")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeAppProperties(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeBackgroundExtent(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeBackgroundExtent(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeBackgroundRegion(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeBackgroundRegion(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeBitmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeBitmap(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeBool(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeBool(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeColor(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeColor(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeDocumentationProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeDocumentationProperty(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeEnumValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeEnumValue(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeFilename(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeFilename(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeFont(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeFont(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeInt(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeInt(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeIntList(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeIntList(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeMargins(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeMargins(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeMetric(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeMetric(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemePartSize(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemePartSize(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemePosition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemePosition(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemePropertyOrigin(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemePropertyOrigin(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeRect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeRect(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeStream(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeStream(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeString(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeString(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysBool(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysBool(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysColor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysColorBrush(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysColorBrush(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysFont(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysFont(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysInt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysInt(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysSize(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeSysString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeSysString(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeTextExtent(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeTextExtent(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeTextMetrics(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeTextMetrics(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeTimingFunction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeTimingFunction(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetThemeTransitionDuration(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsGetThemeTransitionDuration(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetWindowFeedbackSetting(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsGetWindowFeedbackSetting(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsGetWindowTheme(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsGetWindowTheme(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsHimagelistQueryInterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsHimagelistQueryInterface(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListAddMasked(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListAddMasked(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListBeginDrag(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListBeginDrag(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListCoCreateInstance(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListCoCreateInstance(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListCopy(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListCopy(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListCreate(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListCreate(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDestroy(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDragEnter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDragEnter(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDragLeave(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDragLeave(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDragMove(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDragMove(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDragShowNolock(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDragShowNolock(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDraw(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDraw(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDrawEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDrawEx(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDrawIndirect(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDrawIndirect(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListDuplicate(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListDuplicate(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListEndDrag()")
private external fun wasmWindowssysWindowsWin32UiControlsImageListEndDrag()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListGetBkColor(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListGetBkColor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListGetDragImage(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListGetDragImage(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListGetIcon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListGetIcon(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListGetIconSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListGetIconSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListGetImageCount(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListGetImageCount(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListGetImageInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListGetImageInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListLoadImageA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListLoadImageA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListLoadImageW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListLoadImageW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListMerge(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListMerge(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListRead(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListRead(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListReadEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListReadEx(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListRemove(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListRemove(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListReplace(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListReplace(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListReplaceIcon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListReplaceIcon(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListSetBkColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListSetBkColor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListSetDragCursorImage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListSetDragCursorImage(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListSetIconSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListSetIconSize(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListSetImageCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListSetImageCount(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListSetOverlayImage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListSetOverlayImage(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListWrite(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListWrite(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsImageListWriteEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsImageListWriteEx(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsInitCommonControls()")
private external fun wasmWindowssysWindowsWin32UiControlsInitCommonControls()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsInitCommonControlsEx(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsInitCommonControlsEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsInitMUILanguage(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsInitMUILanguage(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsInitializeFlatSB(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsInitializeFlatSB(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsAppThemed()")
private external fun wasmWindowssysWindowsWin32UiControlsIsAppThemed(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsCharLowerW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsIsCharLowerW(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsCompositionActive()")
private external fun wasmWindowssysWindowsWin32UiControlsIsCompositionActive(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsDlgButtonChecked(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsIsDlgButtonChecked(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsThemeActive()")
private external fun wasmWindowssysWindowsWin32UiControlsIsThemeActive(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsIsThemePartDefined(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsIsThemePartDefined(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsLoadIconMetric(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsLoadIconMetric(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsLoadIconWithScaleDown(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsLoadIconWithScaleDown(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsMakeDragList(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsMakeDragList(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsMenuHelp(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiControlsMenuHelp(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsOpenThemeData(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsOpenThemeData(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsOpenThemeDataEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsOpenThemeDataEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsPropertySheetA(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsPropertySheetA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsPropertySheetW(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsPropertySheetW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetScrollInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsSetScrollInfo(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetScrollPos(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsSetScrollPos(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetScrollRange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsSetScrollRange(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetThemeAppProperties(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsSetThemeAppProperties(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetWindowFeedbackSetting(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiControlsSetWindowFeedbackSetting(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetWindowTheme(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsSetWindowTheme(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsSetWindowThemeAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsSetWindowThemeAttribute(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsShowHideMenuCtl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsShowHideMenuCtl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsShowScrollBar(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiControlsShowScrollBar(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsStrSetPtrW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiControlsStrSetPtrW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsTaskDialog(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiControlsTaskDialog(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsTaskDialogIndirect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsTaskDialogIndirect(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsUninitializeFlatSB(p0)")
private external fun wasmWindowssysWindowsWin32UiControlsUninitializeFlatSB(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiControlsUpdatePanningFeedback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiControlsUpdatePanningFeedback(p0: String, p1: Int, p2: Int, p3: Int): Int

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: ConstPtr<Rect>, dwformat: BpBufferformat, ppaintparams: ConstPtr<BpPaintparams>, panimationparams: ConstPtr<BpAnimationparams>, phdcfrom: MutPtr<Hdc>, phdcto: MutPtr<Hdc>): Long =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBeginBufferedAnimation(hwnd.rawAddress.toString(), hdctarget.rawAddress.toString(), prctarget.rawAddress.toString(), dwformat, ppaintparams.rawAddress.toString(), panimationparams.rawAddress.toString(), phdcfrom.rawAddress.toString(), phdcto.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: ConstPtr<Rect>, dwformat: BpBufferformat, ppaintparams: ConstPtr<BpPaintparams>, phdc: MutPtr<Hdc>): Long =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBeginBufferedPaint(hdctarget.rawAddress.toString(), prctarget.rawAddress.toString(), dwformat, ppaintparams.rawAddress.toString(), phdc.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBeginPanningFeedback(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: ConstPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBufferedPaintClear(hbufferedpaint.toString(), prc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintInit(): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBufferedPaintInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(hwnd.rawAddress.toString(), hdctarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: ConstPtr<Rect>, alpha: UByte): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBufferedPaintSetAlpha(hbufferedpaint.toString(), prc.rawAddress.toString(), alpha.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintUnInit(): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsBufferedPaintUnInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsCheckDlgButton(hdlg.rawAddress.toString(), nidbutton, ucheck.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsCheckRadioButton(hdlg.rawAddress.toString(), nidfirstbutton, nidlastbutton, nidcheckbutton) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThemeData(htheme: Htheme): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsCloseThemeData(htheme.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: ConstPtr<Colormap>, inummaps: Int): Hbitmap =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreateMappedBitmap(hinstance.rawAddress.toString(), idbitmap.toString(), wflags.toInt(), lpcolormap.rawAddress.toString(), inummaps).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPropertySheetPageA(constpropsheetpagepointer: MutPtr<Propsheetpagea>): Hpropsheetpage =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreatePropertySheetPageA(constpropsheetpagepointer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPropertySheetPageW(constpropsheetpagepointer: MutPtr<Propsheetpagew>): Hpropsheetpage =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreatePropertySheetPageW(constpropsheetpagepointer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreateStatusWindowA(style, lpsztext.rawAddress.toString(), hwndparent.rawAddress.toString(), wid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreateStatusWindowW(style, lpsztext.rawAddress.toString(), hwndparent.rawAddress.toString(), wid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(pointertype, maxcount.toInt(), mode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: MutPtr<Tbbutton>, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreateToolbarEx(hwnd.rawAddress.toString(), ws.toInt(), wid.toInt(), nbitmaps, hbminst.rawAddress.toString(), wbmid.toString(), lpbuttons.rawAddress.toString(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsCreateUpDownControl(dwstyle.toInt(), x, y, cx, cy, hparent.rawAddress.toString(), nid, hinst.rawAddress.toString(), hbuddy.rawAddress.toString(), nupper, nlower, npos).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaClone(hdpa.toString(), hdpanew.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaCreate(citemgrow).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaCreateEx(cpgrow, hheap.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): MutPtr<CVoid> =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDpaDeletePtr(hdpa.toString(), i).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaDestroy(hdpa.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDpaDestroyCallback(hdpa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDpaEnumCallback(hdpa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): MutPtr<CVoid> =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDpaGetPtr(hdpa.toString(), i.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: ConstPtr<CVoid>): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaGetPtrIndex(hdpa.toString(), p.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaGetSize(hdpa.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaGrow(pdpa.toString(), cp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: ConstPtr<CVoid>): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaInsertPtr(hdpa.toString(), i, p.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaLoadStream(phdpa: MutPtr<Hdpa>, pfn: Pfndpastream, pstream: MutPtr<CVoid>, pvinstdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaLoadStream(phdpa.rawAddress.toString(), 0L.toString(), pstream.rawAddress.toString(), pvinstdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaMerge(hdpadest.toString(), hdpasrc.toString(), dwflags.toInt(), 0L.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: MutPtr<CVoid>, pvinstdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaSaveStream(hdpa.toString(), 0L.toString(), pstream.rawAddress.toString(), pvinstdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSearch(hdpa: Hdpa, pfind: ConstPtr<CVoid>, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaSearch(hdpa.toString(), pfind.rawAddress.toString(), istart, 0L.toString(), lparam.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: ConstPtr<CVoid>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaSetPtr(hdpa.toString(), i, p.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDpaSort(hdpa.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaClone(hdsa.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaCreate(cbitem, citemgrow).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaDeleteItem(hdsa.toString(), i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaDestroy(hdsa.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDsaDestroyCallback(hdsa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDsaEnumCallback(hdsa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: MutPtr<CVoid>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaGetItem(hdsa.toString(), i, pitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): MutPtr<CVoid> =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsDsaGetItemPtr(hdsa.toString(), i).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaGetSize(hdsa.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: ConstPtr<CVoid>): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaInsertItem(hdsa.toString(), i, pitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: ConstPtr<CVoid>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaSetItem(hdsa.toString(), i, pitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDsaSort(pdsa.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDestroyPropertySheetPage(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(device.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirListA(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirListComboBoxA(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirListComboBoxW(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirListW(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), cchout, idcombobox) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), cchout, idcombobox) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirSelectExA(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, idlistbox) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDlgDirSelectExW(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, idlistbox) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDrawInsert(handparent.rawAddress.toString(), hlb.rawAddress.toString(), nitem)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: ConstPtr<Rect>, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawShadowText(hdc.rawAddress.toString(), psztext.rawAddress.toString(), cch.toInt(), prc.rawAddress.toString(), dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStatusTextA(hdc: Hdc, lprc: MutPtr<Rect>, psztext: Pcstr, uflags: UInt) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDrawStatusTextA(hdc.rawAddress.toString(), lprc.rawAddress.toString(), psztext.rawAddress.toString(), uflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: MutPtr<Rect>, psztext: Pcwstr, uflags: UInt) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsDrawStatusTextW(hdc.rawAddress.toString(), lprc.rawAddress.toString(), psztext.rawAddress.toString(), uflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, pcliprect: ConstPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeBackground(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), pcliprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, poptions: ConstPtr<Dtbgopts>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeBackgroundEx(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), poptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: ConstPtr<Rect>, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: MutPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeEdge(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, pdestrect.rawAddress.toString(), uedge.toInt(), uflags.toInt(), pcontentrect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, himl: Himagelist, iimageindex: Int): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeIcon(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), himl.toString(), iimageindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: ConstPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeParentBackground(hwnd.rawAddress.toString(), hdc.rawAddress.toString(), prc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: ConstPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(hwnd.rawAddress.toString(), hdc.rawAddress.toString(), dwflags.toInt(), prc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: ConstPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeText(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, psztext.rawAddress.toString(), cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), prect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: MutPtr<Rect>, poptions: ConstPtr<Dttopts>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsDrawThemeTextEx(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, psztext.rawAddress.toString(), cchtext, dwtextflags.toInt(), prect.rawAddress.toString(), poptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEnableScrollBar(hwnd.rawAddress.toString(), wsbflags.toInt(), warrows.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEnableThemeDialogTexture(hwnd.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTheming(fenable: Bool): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEnableTheming(fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation.toString(), fupdatetarget) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint.toString(), fupdatetarget) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEndPanningFeedback(hwnd.rawAddress.toString(), fanimateback) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: ConstPtr<Point>, phittestinginput: ConstPtr<TouchHitTestingInput>, pproximityeval: MutPtr<TouchHitTestingProximityEvaluation>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEvaluateProximityToPolygon(numvertices.toInt(), controlpolygon.rawAddress.toString(), phittestinginput.rawAddress.toString(), pproximityeval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateProximityToRect(controlboundingbox: ConstPtr<Rect>, phittestinginput: ConstPtr<TouchHitTestingInput>, pproximityeval: MutPtr<TouchHitTestingProximityEvaluation>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsEvaluateProximityToRect(controlboundingbox.rawAddress.toString(), phittestinginput.rawAddress.toString(), pproximityeval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbEnableScrollBar(param0.rawAddress.toString(), param1, param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr<Scrollinfo>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollInfo(param0.rawAddress.toString(), code, param2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollPos(param0.rawAddress.toString(), code) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: MutPtr<Int>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollProp(param0.rawAddress.toString(), propindex, param2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr<Int>, param3: MutPtr<Int>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbGetScrollRange(param0.rawAddress.toString(), code, param2.rawAddress.toString(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: MutPtr<Scrollinfo>, fredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollInfo(param0.rawAddress.toString(), code, psi.rawAddress.toString(), fredraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollPos(param0.rawAddress.toString(), code, pos, fredraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollProp(param0.rawAddress.toString(), index.toInt(), newvalue.toString(), param3) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbSetScrollRange(param0.rawAddress.toString(), code, min, max, fredraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsFlatSbShowScrollBar(param0.rawAddress.toString(), code, param2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: MutPtr<MutPtr<Rgbquad>>, pcxrow: MutPtr<Int>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetBufferedPaintBits(hbufferedpaint.toString(), ppbbuffer.rawAddress.toString(), pcxrow.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsGetBufferedPaintDC(hbufferedpaint.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(hbufferedpaint.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: MutPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(hbufferedpaint.toString(), prc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: MutPtr<Comboboxinfo>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetComboBoxInfo(hwndcombo.rawAddress.toString(), pcbi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetCurrentThemeName(pszthemefilename.rawAddress.toString(), cchmaxnamechars, pszcolorbuff.rawAddress.toString(), cchmaxcolorchars, pszsizebuff.rawAddress.toString(), cchmaxsizechars) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: MutPtr<Rect>, lpinfo: ConstPtr<Int>) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsGetEffectiveClientRect(hwnd.rawAddress.toString(), lprc.rawAddress.toString(), lpinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetListBoxInfo(hwnd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMUILanguage(): UShort =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetMUILanguage().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: MutPtr<CVoid>, cbsize: UInt, pcbsizeout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeAnimationProperty(htheme.toString(), istoryboardid, itargetid, eproperty, pvproperty.rawAddress.toString(), cbsize.toInt(), pcbsizeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: MutPtr<TaTransform>, cbsize: UInt, pcbsizeout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeAnimationTransform(htheme.toString(), istoryboardid, itargetid, dwtransformindex.toInt(), ptransform.rawAddress.toString(), cbsize.toInt(), pcbsizeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeAppProperties().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: ConstPtr<Rect>, pcontentrect: MutPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, pboundingrect.rawAddress.toString(), pcontentrect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: ConstPtr<Rect>, pextentrect: MutPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeBackgroundExtent(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, pcontentrect.rawAddress.toString(), pextentrect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, pregion: MutPtr<Hrgn>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeBackgroundRegion(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), pregion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: MutPtr<Hbitmap>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeBitmap(htheme.toString(), ipartid, istateid, ipropid, dwflags.toInt(), phbitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: MutPtr<Bool>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeBool(htheme.toString(), ipartid, istateid, ipropid, pfval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: MutPtr<Colorref>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeColor(htheme.toString(), ipartid, istateid, ipropid, pcolor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeDocumentationProperty(pszthemename.rawAddress.toString(), pszpropertyname.rawAddress.toString(), pszvaluebuff.rawAddress.toString(), cchmaxvalchars) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr<Int>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeEnumValue(htheme.toString(), ipartid, istateid, ipropid, pival.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeFilename(htheme.toString(), ipartid, istateid, ipropid, pszthemefilename.rawAddress.toString(), cchmaxbuffchars) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: MutPtr<Logfontw>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeFont(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ipropid, pfont.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr<Int>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeInt(htheme.toString(), ipartid, istateid, ipropid, pival.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: MutPtr<Intlist>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeIntList(htheme.toString(), ipartid, istateid, ipropid, pintlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: ConstPtr<Rect>, pmargins: MutPtr<Margins>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeMargins(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ipropid, prc.rawAddress.toString(), pmargins.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr<Int>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeMetric(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ipropid, pival.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: ConstPtr<Rect>, esize: Themesize, psz: MutPtr<Size>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemePartSize(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prc.rawAddress.toString(), esize, psz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: MutPtr<Point>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemePosition(htheme.toString(), ipartid, istateid, ipropid, ppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: MutPtr<Propertyorigin>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemePropertyOrigin(htheme.toString(), ipartid, istateid, ipropid, porigin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: MutPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeRect(htheme.toString(), ipartid, istateid, ipropid, prect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: MutPtr<MutPtr<CVoid>>, pcbstream: MutPtr<UInt>, hinst: Hinstance): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeStream(htheme.toString(), ipartid, istateid, ipropid, ppvstream.rawAddress.toString(), pcbstream.rawAddress.toString(), hinst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeString(htheme.toString(), ipartid, istateid, ipropid, pszbuff.rawAddress.toString(), cchmaxbuffchars) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeSysBool(htheme.toString(), iboolid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeSysColor(htheme.toString(), icolorid).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsGetThemeSysColorBrush(htheme.toString(), icolorid).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: MutPtr<Logfontw>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeSysFont(htheme.toString(), ifontid, plf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: MutPtr<Int>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeSysInt(htheme.toString(), iintid, pivalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeSysSize(htheme.toString(), isizeid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeSysString(htheme.toString(), istringid, pszstringbuff.rawAddress.toString(), cchmaxstringchars) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: ConstPtr<Rect>, pextentrect: MutPtr<Rect>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeTextExtent(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, psztext.rawAddress.toString(), cchcharcount, dwtextflags.toInt(), pboundingrect.rawAddress.toString(), pextentrect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: MutPtr<Textmetricw>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeTextMetrics(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ptm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: MutPtr<TaTimingfunction>, cbsize: UInt, pcbsizeout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeTimingFunction(htheme.toString(), itimingfunctionid, ptimingfunction.rawAddress.toString(), cbsize.toInt(), pcbsizeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: MutPtr<UInt>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetThemeTransitionDuration(htheme.toString(), ipartid, istateidfrom, istateidto, ipropid, pdwduration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: MutPtr<UInt>, config: MutPtr<CVoid>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetWindowFeedbackSetting(hwnd.rawAddress.toString(), feedback, dwflags.toInt(), psize.rawAddress.toString(), config.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsGetWindowTheme(hwnd.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun himagelistQueryInterface(himl: Himagelist, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsHimagelistQueryInterface(himl.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: ConstPtr<Rect>, hrgn: Hrgn, pttest: Point, pwhittestcode: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListAdd(himl.toString(), hbmimage.rawAddress.toString(), hbmmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListAddMasked(himl.toString(), hbmimage.rawAddress.toString(), crmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListBeginDrag(himltrack.toString(), itrack, dxhotspot, dyhotspot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCoCreateInstance(rclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListCoCreateInstance(rclsid.rawAddress.toString(), punkouter.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListCopy(himldst.toString(), idst, himlsrc.toString(), isrc, uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListCreate(cx, cy, flags.toInt(), cinitial, cgrow).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDestroy(himl: Himagelist): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDestroy(himl.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDragEnter(hwndlock.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDragLeave(hwndlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDragMove(x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDragShowNolock(fshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDraw(himl.toString(), i, hdcdst.rawAddress.toString(), x, y, fstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDrawEx(himl.toString(), i, hdcdst.rawAddress.toString(), x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDrawIndirect(pimldp: ConstPtr<Imagelistdrawparams>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDrawIndirect(pimldp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListDuplicate(himl.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListEndDrag() {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsImageListEndDrag()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListGetBkColor(himl.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetDragImage(ppt: MutPtr<Point>, ppthotspot: MutPtr<Point>): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListGetDragImage(ppt.rawAddress.toString(), ppthotspot.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    if (windowsWin32UiControlsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiControlsImageListGetIcon(himl.toString(), i, flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetIconSize(himl: Himagelist, cx: MutPtr<Int>, cy: MutPtr<Int>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListGetIconSize(himl.toString(), cx.rawAddress.toString(), cy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListGetImageCount(himl.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: MutPtr<Imageinfo>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListGetImageInfo(himl.toString(), i, pimageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListLoadImageA(hi.rawAddress.toString(), lpbmp.rawAddress.toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListLoadImageW(hi.rawAddress.toString(), lpbmp.rawAddress.toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListMerge(himl1.toString(), i1, himl2.toString(), i2, dx, dy).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListRead(pstm: MutPtr<CVoid>): Himagelist =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListRead(pstm.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReadEx(dwflags: UInt, pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListReadEx(dwflags.toInt(), pstm.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListRemove(himl.toString(), i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListReplace(himl.toString(), i, hbmimage.rawAddress.toString(), hbmmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListReplaceIcon(himl.toString(), i, hicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListSetBkColor(himl.toString(), clrbk.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag.toString(), idrag, dxhotspot, dyhotspot) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListSetIconSize(himl.toString(), cx, cy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListSetImageCount(himl.toString(), unewcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListSetOverlayImage(himl.toString(), iimage, ioverlay) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListWrite(himl: Himagelist, pstm: MutPtr<CVoid>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListWrite(himl.toString(), pstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsImageListWriteEx(himl.toString(), dwflags.toInt(), pstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initCommonControls() {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsInitCommonControls()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initCommonControlsEx(picce: ConstPtr<Initcommoncontrolsex>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsInitCommonControlsEx(picce.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initMUILanguage(uilang: UShort) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsInitMUILanguage(uilang.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsInitializeFlatSB(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAppThemed(): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsAppThemed() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharLowerW(ch: UShort): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsCharLowerW(ch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCompositionActive(): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsCompositionActive() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsDlgButtonChecked(hdlg.rawAddress.toString(), nidbutton).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeActive(): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsThemeActive() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme.toString(), ipartid, istateid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsIsThemePartDefined(htheme.toString(), ipartid, istateid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: MutPtr<Hicon>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsLoadIconMetric(hinst.rawAddress.toString(), pszname.rawAddress.toString(), lims, phico.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: MutPtr<Hicon>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsLoadIconWithScaleDown(hinst.rawAddress.toString(), pszname.rawAddress.toString(), cx, cy, phico.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeDragList(hlb: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsMakeDragList(hlb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: ConstPtr<UInt>) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsMenuHelp(umsg.toInt(), wparam.toString(), lparam.toString(), hmainmenu.rawAddress.toString(), hinst.rawAddress.toString(), hwndstatus.rawAddress.toString(), lpwids.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsOpenThemeData(hwnd.rawAddress.toString(), pszclasslist.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsOpenThemeDataEx(hwnd.rawAddress.toString(), pszclasslist.rawAddress.toString(), dwflags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: ConstPtr<TouchHitTestingInput>, pproximityeval: ConstPtr<TouchHitTestingProximityEvaluation>): Lresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(phittestinginput.rawAddress.toString(), pproximityeval.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertySheetA(param0: MutPtr<PropsheetheaderaV2>): Long =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsPropertySheetA(param0.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertySheetW(param0: MutPtr<PropsheetheaderwV2>): Long =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsPropertySheetW(param0.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(window.rawAddress.toString(), notifyrange) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(hwnd.rawAddress.toString(), value.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: ConstPtr<Scrollinfo>, redraw: Bool): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsSetScrollInfo(hwnd.rawAddress.toString(), nbar, lpsi.rawAddress.toString(), redraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsSetScrollPos(hwnd.rawAddress.toString(), nbar, npos, bredraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsSetScrollRange(hwnd.rawAddress.toString(), nbar, nminpos, nmaxpos, bredraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    if (windowsWin32UiControlsNapiAvailable) {
        wasmWindowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: ConstPtr<CVoid>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsSetWindowFeedbackSetting(hwnd.rawAddress.toString(), feedback, dwflags.toInt(), size.toInt(), configuration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsSetWindowTheme(hwnd.rawAddress.toString(), pszsubappname.rawAddress.toString(), pszsubidlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsSetWindowThemeAttribute(hwnd.rawAddress.toString(), eattribute, pvattribute.rawAddress.toString(), cbattribute.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: ConstPtr<Int>): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsShowHideMenuCtl(hwnd.rawAddress.toString(), uflags.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsShowScrollBar(hwnd.rawAddress.toString(), wbar, bshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSetPtrW(ppsz: MutPtr<Pwstr>, psz: Pcwstr): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsStrSetPtrW(ppsz.rawAddress.toString(), psz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: MutPtr<Int>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsTaskDialog(hwndowner.rawAddress.toString(), hinstance.rawAddress.toString(), pszwindowtitle.rawAddress.toString(), pszmaininstruction.rawAddress.toString(), pszcontent.rawAddress.toString(), dwcommonbuttons, pszicon.rawAddress.toString(), pnbutton.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDialogIndirect(ptaskconfig: ConstPtr<Taskdialogconfig>, pnbutton: MutPtr<Int>, pnradiobutton: MutPtr<Int>, pfverificationflagchecked: MutPtr<Bool>): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsTaskDialogIndirect(ptaskconfig.rawAddress.toString(), pnbutton.rawAddress.toString(), pnradiobutton.rawAddress.toString(), pfverificationflagchecked.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsUninitializeFlatSB(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    if (windowsWin32UiControlsNapiAvailable) wasmWindowssysWindowsWin32UiControlsUpdatePanningFeedback(hwnd.rawAddress.toString(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia) else throw UnsupportedOperationException("Native FFI addon is not available")
