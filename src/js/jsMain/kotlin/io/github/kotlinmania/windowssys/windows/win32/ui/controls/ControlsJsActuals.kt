@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.COpaquePointer
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawEdgeFlags
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawTextFormat
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawedgeFlags
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ImageFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ScrollbarConstants

private val _windowsWin32UiControlsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, panimationparams: COpaquePointer?, phdcfrom: COpaquePointer?, phdcto: COpaquePointer?): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_beginBufferedAnimation((hwnd?.value ?: 0L).toString(), (hdctarget?.value ?: 0L).toString(), (prctarget?.value ?: 0L).toString(), dwformat, (ppaintparams?.value ?: 0L).toString(), (panimationparams?.value ?: 0L).toString(), (phdcfrom?.value ?: 0L).toString(), (phdcto?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, phdc: COpaquePointer?): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_beginBufferedPaint((hdctarget?.value ?: 0L).toString(), (prctarget?.value ?: 0L).toString(), dwformat, (ppaintparams?.value ?: 0L).toString(), (phdc?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_beginPanningFeedback((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_bufferedPaintClear(hbufferedpaint.toString(), (prc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintInit(): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_bufferedPaintInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation((hwnd?.value ?: 0L).toString(), (hdctarget?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: COpaquePointer?, alpha: UByte): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha(hbufferedpaint.toString(), (prc?.value ?: 0L).toString(), alpha.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintUnInit(): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_bufferedPaintUnInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_checkDlgButton((hdlg?.value ?: 0L).toString(), nidbutton, ucheck.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_checkRadioButton((hdlg?.value ?: 0L).toString(), nidfirstbutton, nidlastbutton, nidcheckbutton) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThemeData(htheme: Htheme): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_closeThemeData(htheme.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: COpaquePointer?, inummaps: Int): Hbitmap =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createMappedBitmap((hinstance?.value ?: 0L).toString(), idbitmap.toString(), wflags.toInt(), (lpcolormap?.value ?: 0L).toString(), inummaps) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPropertySheetPageA(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createPropertySheetPageA((constpropsheetpagepointer?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPropertySheetPageW(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createPropertySheetPageW((constpropsheetpagepointer?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createStatusWindowA(style, (lpsztext?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), wid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createStatusWindowW(style, (lpsztext?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), wid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createSyntheticPointerDevice(pointertype, maxcount.toInt(), mode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: COpaquePointer?, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createToolbarEx((hwnd?.value ?: 0L).toString(), ws.toInt(), wid.toInt(), nbitmaps, (hbminst?.value ?: 0L).toString(), wbmid.toString(), (lpbuttons?.value ?: 0L).toString(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_createUpDownControl(dwstyle.toInt(), x, y, cx, cy, (hparent?.value ?: 0L).toString(), nid, (hinst?.value ?: 0L).toString(), (hbuddy?.value ?: 0L).toString(), nupper, nlower, npos) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaClone(hdpa.toString(), hdpanew.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaCreate(citemgrow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaCreateEx(cpgrow, (hheap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs(hdpa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): COpaquePointer? =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaDeletePtr(hdpa.toString(), i) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaDestroy(hdpa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaDestroyCallback(hdpa.toString(), 0L.toString(), (pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaEnumCallback(hdpa.toString(), 0L.toString(), (pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): COpaquePointer? =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaGetPtr(hdpa.toString(), i.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: COpaquePointer?): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaGetPtrIndex(hdpa.toString(), (p?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaGetSize(hdpa.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaGrow(pdpa.toString(), cp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaInsertPtr(hdpa.toString(), i, (p?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaLoadStream(phdpa: COpaquePointer?, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaLoadStream((phdpa?.value ?: 0L).toString(), 0L.toString(), (pstream?.value ?: 0L).toString(), (pvinstdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaMerge(hdpadest.toString(), hdpasrc.toString(), dwflags.toInt(), 0L.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaSaveStream(hdpa.toString(), 0L.toString(), (pstream?.value ?: 0L).toString(), (pvinstdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSearch(hdpa: Hdpa, pfind: COpaquePointer?, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaSearch(hdpa.toString(), (pfind?.value ?: 0L).toString(), istart, 0L.toString(), lparam.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaSetPtr(hdpa.toString(), i, (p?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dpaSort(hdpa.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaClone(hdsa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaCreate(cbitem, citemgrow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaDeleteAllItems(hdsa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaDeleteItem(hdsa.toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaDestroy(hdsa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaDestroyCallback(hdsa.toString(), 0L.toString(), (pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaEnumCallback(hdsa.toString(), 0L.toString(), (pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaGetItem(hdsa.toString(), i, (pitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): COpaquePointer? =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaGetItemPtr(hdsa.toString(), i) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaGetSize(hdsa.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaInsertItem(hdsa.toString(), i, (pitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaSetItem(hdsa.toString(), i, (pitem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dsaSort(pdsa.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_destroyPropertySheetPage((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice((device?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirListA((hdlg?.value ?: 0L).toString(), (lppathspec?.value ?: 0L).toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirListComboBoxA((hdlg?.value ?: 0L).toString(), (lppathspec?.value ?: 0L).toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirListComboBoxW((hdlg?.value ?: 0L).toString(), (lppathspec?.value ?: 0L).toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirListW((hdlg?.value ?: 0L).toString(), (lppathspec?.value ?: 0L).toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA((hwnddlg?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), cchout, idcombobox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW((hwnddlg?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), cchout, idcombobox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirSelectExA((hwnddlg?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), chcount, idlistbox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_dlgDirSelectExW((hwnddlg?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), chcount, idlistbox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawInsert((handparent?.value ?: 0L).toString(), (hlb?.value ?: 0L).toString(), nitem)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: COpaquePointer?, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawShadowText((hdc?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), cch.toInt(), (prc?.value ?: 0L).toString(), dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStatusTextA(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcstr, uflags: UInt) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawStatusTextA((hdc?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), uflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcwstr, uflags: UInt) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawStatusTextW((hdc?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (psztext?.value ?: 0L).toString(), uflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pcliprect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeBackground(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (prect?.value ?: 0L).toString(), (pcliprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeBackgroundEx(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (prect?.value ?: 0L).toString(), (poptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: COpaquePointer?, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeEdge(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (pdestrect?.value ?: 0L).toString(), uedge.toInt(), uflags.toInt(), (pcontentrect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, himl: Himagelist, iimageindex: Int): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeIcon(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (prect?.value ?: 0L).toString(), himl.toString(), iimageindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeParentBackground((hwnd?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString(), (prc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx((hwnd?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString(), dwflags.toInt(), (prc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeText(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (psztext?.value ?: 0L).toString(), cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), (prect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_drawThemeTextEx(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (psztext?.value ?: 0L).toString(), cchtext, dwtextflags.toInt(), (prect?.value ?: 0L).toString(), (poptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_enableScrollBar((hwnd?.value ?: 0L).toString(), wsbflags.toInt(), warrows.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_enableThemeDialogTexture((hwnd?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTheming(fenable: Bool): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_enableTheming(fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_endBufferedAnimation(hbpanimation.toString(), fupdatetarget) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_endBufferedPaint(hbufferedpaint.toString(), fupdatetarget) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_endPanningFeedback((hwnd?.value ?: 0L).toString(), fanimateback) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_evaluateProximityToPolygon(numvertices.toInt(), (controlpolygon?.value ?: 0L).toString(), (phittestinginput?.value ?: 0L).toString(), (pproximityeval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateProximityToRect(controlboundingbox: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_evaluateProximityToRect((controlboundingbox?.value ?: 0L).toString(), (phittestinginput?.value ?: 0L).toString(), (pproximityeval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbEnableScrollBar((param0?.value ?: 0L).toString(), param1, param2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbGetScrollInfo((param0?.value ?: 0L).toString(), code, (param2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbGetScrollPos((param0?.value ?: 0L).toString(), code) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbGetScrollProp((param0?.value ?: 0L).toString(), propindex, (param2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?, param3: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbGetScrollRange((param0?.value ?: 0L).toString(), code, (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: COpaquePointer?, fredraw: Bool): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbSetScrollInfo((param0?.value ?: 0L).toString(), code, (psi?.value ?: 0L).toString(), fredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbSetScrollPos((param0?.value ?: 0L).toString(), code, pos, fredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbSetScrollProp((param0?.value ?: 0L).toString(), index.toInt(), newvalue.toString(), param3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbSetScrollRange((param0?.value ?: 0L).toString(), code, min, max, fredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_flatSbShowScrollBar((param0?.value ?: 0L).toString(), code, param2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: COpaquePointer?, pcxrow: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getBufferedPaintBits(hbufferedpaint.toString(), (ppbbuffer?.value ?: 0L).toString(), (pcxrow?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getBufferedPaintDC(hbufferedpaint.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC(hbufferedpaint.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect(hbufferedpaint.toString(), (prc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getComboBoxInfo((hwndcombo?.value ?: 0L).toString(), (pcbi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getCurrentThemeName((pszthemefilename?.value ?: 0L).toString(), cchmaxnamechars, (pszcolorbuff?.value ?: 0L).toString(), cchmaxcolorchars, (pszsizebuff?.value ?: 0L).toString(), cchmaxsizechars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: COpaquePointer?, lpinfo: COpaquePointer?) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getEffectiveClientRect((hwnd?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getListBoxInfo((hwnd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMUILanguage(): UShort =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getMUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeAnimationProperty(htheme.toString(), istoryboardid, itargetid, eproperty, (pvproperty?.value ?: 0L).toString(), cbsize.toInt(), (pcbsizeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeAnimationTransform(htheme.toString(), istoryboardid, itargetid, dwtransformindex.toInt(), (ptransform?.value ?: 0L).toString(), cbsize.toInt(), (pcbsizeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeAppProperties() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: COpaquePointer?, pcontentrect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (pboundingrect?.value ?: 0L).toString(), (pcontentrect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeBackgroundExtent(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (pcontentrect?.value ?: 0L).toString(), (pextentrect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pregion: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeBackgroundRegion(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (prect?.value ?: 0L).toString(), (pregion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeBitmap(htheme.toString(), ipartid, istateid, ipropid, dwflags.toInt(), (phbitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeBool(htheme.toString(), ipartid, istateid, ipropid, (pfval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeColor(htheme.toString(), ipartid, istateid, ipropid, (pcolor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeDocumentationProperty((pszthemename?.value ?: 0L).toString(), (pszpropertyname?.value ?: 0L).toString(), (pszvaluebuff?.value ?: 0L).toString(), cchmaxvalchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeEnumValue(htheme.toString(), ipartid, istateid, ipropid, (pival?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeFilename(htheme.toString(), ipartid, istateid, ipropid, (pszthemefilename?.value ?: 0L).toString(), cchmaxbuffchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeFont(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, ipropid, (pfont?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeInt(htheme.toString(), ipartid, istateid, ipropid, (pival?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeIntList(htheme.toString(), ipartid, istateid, ipropid, (pintlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: COpaquePointer?, pmargins: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeMargins(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, ipropid, (prc?.value ?: 0L).toString(), (pmargins?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeMetric(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, ipropid, (pival?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: COpaquePointer?, esize: Themesize, psz: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemePartSize(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (prc?.value ?: 0L).toString(), esize, (psz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemePosition(htheme.toString(), ipartid, istateid, ipropid, (ppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemePropertyOrigin(htheme.toString(), ipartid, istateid, ipropid, (porigin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeRect(htheme.toString(), ipartid, istateid, ipropid, (prect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: COpaquePointer?, pcbstream: COpaquePointer?, hinst: Hinstance): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeStream(htheme.toString(), ipartid, istateid, ipropid, (ppvstream?.value ?: 0L).toString(), (pcbstream?.value ?: 0L).toString(), (hinst?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeString(htheme.toString(), ipartid, istateid, ipropid, (pszbuff?.value ?: 0L).toString(), cchmaxbuffchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysBool(htheme.toString(), iboolid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysColor(htheme.toString(), icolorid) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysColorBrush(htheme.toString(), icolorid) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysFont(htheme.toString(), ifontid, (plf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysInt(htheme.toString(), iintid, (pivalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysSize(htheme.toString(), isizeid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeSysString(htheme.toString(), istringid, (pszstringbuff?.value ?: 0L).toString(), cchmaxstringchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeTextExtent(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (psztext?.value ?: 0L).toString(), cchcharcount, dwtextflags.toInt(), (pboundingrect?.value ?: 0L).toString(), (pextentrect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeTextMetrics(htheme.toString(), (hdc?.value ?: 0L).toString(), ipartid, istateid, (ptm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeTimingFunction(htheme.toString(), itimingfunctionid, (ptimingfunction?.value ?: 0L).toString(), cbsize.toInt(), (pcbsizeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getThemeTransitionDuration(htheme.toString(), ipartid, istateidfrom, istateidto, ipropid, (pdwduration?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: COpaquePointer?, config: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getWindowFeedbackSetting((hwnd?.value ?: 0L).toString(), feedback, dwflags.toInt(), (psize?.value ?: 0L).toString(), (config?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_getWindowTheme((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun himagelistQueryInterface(himl: Himagelist, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_himagelistQueryInterface(himl.toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: COpaquePointer?, hrgn: Hrgn, pttest: Point, pwhittestcode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListAdd(himl.toString(), (hbmimage?.value ?: 0L).toString(), (hbmmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListAddMasked(himl.toString(), (hbmimage?.value ?: 0L).toString(), crmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListBeginDrag(himltrack.toString(), itrack, dxhotspot, dyhotspot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCoCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListCoCreateInstance((rclsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListCopy(himldst.toString(), idst, himlsrc.toString(), isrc, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListCreate(cx, cy, flags.toInt(), cinitial, cgrow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDestroy(himl: Himagelist): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDestroy(himl.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDragEnter((hwndlock?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDragLeave((hwndlock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDragMove(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDragShowNolock(fshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDraw(himl.toString(), i, (hdcdst?.value ?: 0L).toString(), x, y, fstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDrawEx(himl.toString(), i, (hdcdst?.value ?: 0L).toString(), x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDrawIndirect(pimldp: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDrawIndirect((pimldp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListDuplicate(himl.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListEndDrag() {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListEndDrag()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListGetBkColor(himl.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetDragImage(ppt: COpaquePointer?, ppthotspot: COpaquePointer?): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListGetDragImage((ppt?.value ?: 0L).toString(), (ppthotspot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListGetIcon(himl.toString(), i, flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetIconSize(himl: Himagelist, cx: COpaquePointer?, cy: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListGetIconSize(himl.toString(), (cx?.value ?: 0L).toString(), (cy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListGetImageCount(himl.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListGetImageInfo(himl.toString(), i, (pimageinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListLoadImageA((hi?.value ?: 0L).toString(), (lpbmp?.value ?: 0L).toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListLoadImageW((hi?.value ?: 0L).toString(), (lpbmp?.value ?: 0L).toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListMerge(himl1.toString(), i1, himl2.toString(), i2, dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListRead(pstm: COpaquePointer?): Himagelist =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListRead((pstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReadEx(dwflags: UInt, pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListReadEx(dwflags.toInt(), (pstm?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListRemove(himl.toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListReplace(himl.toString(), i, (hbmimage?.value ?: 0L).toString(), (hbmmask?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListReplaceIcon(himl.toString(), i, (hicon?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListSetBkColor(himl.toString(), clrbk.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListSetDragCursorImage(himldrag.toString(), idrag, dxhotspot, dyhotspot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListSetIconSize(himl.toString(), cx, cy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListSetImageCount(himl.toString(), unewcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListSetOverlayImage(himl.toString(), iimage, ioverlay) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListWrite(himl: Himagelist, pstm: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListWrite(himl.toString(), (pstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_imageListWriteEx(himl.toString(), dwflags.toInt(), (pstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initCommonControls() {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_initCommonControls()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initCommonControlsEx(picce: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_initCommonControlsEx((picce?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initMUILanguage(uilang: UShort) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_initMUILanguage(uilang.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_initializeFlatSB((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAppThemed(): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isAppThemed() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharLowerW(ch: UShort): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isCharLowerW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCompositionActive(): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isCompositionActive() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isDlgButtonChecked((hdlg?.value ?: 0L).toString(), nidbutton) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeActive(): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isThemeActive() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent(htheme.toString(), ipartid, istateid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_isThemePartDefined(htheme.toString(), ipartid, istateid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_loadIconMetric((hinst?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), lims, (phico?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_loadIconWithScaleDown((hinst?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), cx, cy, (phico?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeDragList(hlb: Hwnd): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_makeDragList((hlb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: COpaquePointer?) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_menuHelp(umsg.toInt(), wparam.toString(), lparam.toString(), (hmainmenu?.value ?: 0L).toString(), (hinst?.value ?: 0L).toString(), (hwndstatus?.value ?: 0L).toString(), (lpwids?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_openThemeData((hwnd?.value ?: 0L).toString(), (pszclasslist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_openThemeDataEx((hwnd?.value ?: 0L).toString(), (pszclasslist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Lresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation((phittestinginput?.value ?: 0L).toString(), (pproximityeval?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertySheetA(param0: COpaquePointer?): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_propertySheetA((param0?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertySheetW(param0: COpaquePointer?): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_propertySheetW((param0?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications((window?.value ?: 0L).toString(), notifyrange) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow((hwnd?.value ?: 0L).toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?, redraw: Bool): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setScrollInfo((hwnd?.value ?: 0L).toString(), nbar, (lpsi?.value ?: 0L).toString(), redraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setScrollPos((hwnd?.value ?: 0L).toString(), nbar, npos, bredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setScrollRange((hwnd?.value ?: 0L).toString(), nbar, nminpos, nmaxpos, bredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setThemeAppProperties(dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setWindowFeedbackSetting((hwnd?.value ?: 0L).toString(), feedback, dwflags.toInt(), size.toInt(), (configuration?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setWindowTheme((hwnd?.value ?: 0L).toString(), (pszsubappname?.value ?: 0L).toString(), (pszsubidlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_setWindowThemeAttribute((hwnd?.value ?: 0L).toString(), eattribute, (pvattribute?.value ?: 0L).toString(), cbattribute.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_showHideMenuCtl((hwnd?.value ?: 0L).toString(), uflags.toString(), (lpinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_showScrollBar((hwnd?.value ?: 0L).toString(), wbar, bshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSetPtrW(ppsz: COpaquePointer?, psz: Pcwstr): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_strSetPtrW((ppsz?.value ?: 0L).toString(), (psz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_taskDialog((hwndowner?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), (pszwindowtitle?.value ?: 0L).toString(), (pszmaininstruction?.value ?: 0L).toString(), (pszcontent?.value ?: 0L).toString(), dwcommonbuttons, (pszicon?.value ?: 0L).toString(), (pnbutton?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDialogIndirect(ptaskconfig: COpaquePointer?, pnbutton: COpaquePointer?, pnradiobutton: COpaquePointer?, pfverificationflagchecked: COpaquePointer?): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_taskDialogIndirect((ptaskconfig?.value ?: 0L).toString(), (pnbutton?.value ?: 0L).toString(), (pnradiobutton?.value ?: 0L).toString(), (pfverificationflagchecked?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_uninitializeFlatSB((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_updatePanningFeedback((hwnd?.value ?: 0L).toString(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
