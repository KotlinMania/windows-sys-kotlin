@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

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

private val windowsWin32UiControlsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, panimationparams: ConstPtr, phdcfrom: MutPtr, phdcto: MutPtr): Long =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBeginBufferedAnimation(hwnd.rawAddress.toString(), hdctarget.rawAddress.toString(), prctarget.rawAddress.toString(), dwformat, ppaintparams.rawAddress.toString(), panimationparams.rawAddress.toString(), phdcfrom.rawAddress.toString(), phdcto.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, phdc: MutPtr): Long =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBeginBufferedPaint(hdctarget.rawAddress.toString(), prctarget.rawAddress.toString(), dwformat, ppaintparams.rawAddress.toString(), phdc.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBeginPanningFeedback(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBufferedPaintClear(hbufferedpaint.toString(), prc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintInit(): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBufferedPaintInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(hwnd.rawAddress.toString(), hdctarget.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: ConstPtr, alpha: UByte): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBufferedPaintSetAlpha(hbufferedpaint.toString(), prc.rawAddress.toString(), alpha.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bufferedPaintUnInit(): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsBufferedPaintUnInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCheckDlgButton(hdlg.rawAddress.toString(), nidbutton, ucheck.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCheckRadioButton(hdlg.rawAddress.toString(), nidfirstbutton, nidlastbutton, nidcheckbutton) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeThemeData(htheme: Htheme): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCloseThemeData(htheme.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: ConstPtr, inummaps: Int): Hbitmap =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreateMappedBitmap(hinstance.rawAddress.toString(), idbitmap.toString(), wflags.toInt(), lpcolormap.rawAddress.toString(), inummaps) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPropertySheetPageA(constpropsheetpagepointer: MutPtr): Hpropsheetpage =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreatePropertySheetPageA(constpropsheetpagepointer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPropertySheetPageW(constpropsheetpagepointer: MutPtr): Hpropsheetpage =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreatePropertySheetPageW(constpropsheetpagepointer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreateStatusWindowA(style, lpsztext.rawAddress.toString(), hwndparent.rawAddress.toString(), wid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreateStatusWindowW(style, lpsztext.rawAddress.toString(), hwndparent.rawAddress.toString(), wid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(pointertype, maxcount.toInt(), mode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: MutPtr, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreateToolbarEx(hwnd.rawAddress.toString(), ws.toInt(), wid.toInt(), nbitmaps, hbminst.rawAddress.toString(), wbmid.toString(), lpbuttons.rawAddress.toString(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsCreateUpDownControl(dwstyle.toInt(), x, y, cx, cy, hparent.rawAddress.toString(), nid, hinst.rawAddress.toString(), hbuddy.rawAddress.toString(), nupper, nlower, npos) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaClone(hdpa.toString(), hdpanew.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaCreate(citemgrow) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaCreateEx(cpgrow, hheap.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): MutPtr =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaDeletePtr(hdpa.toString(), i) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaDestroy(hdpa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaDestroyCallback(hdpa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaEnumCallback(hdpa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): MutPtr =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaGetPtr(hdpa.toString(), i.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: ConstPtr): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaGetPtrIndex(hdpa.toString(), p.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaGetSize(hdpa.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaGrow(pdpa.toString(), cp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaInsertPtr(hdpa.toString(), i, p.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaLoadStream(phdpa: MutPtr, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaLoadStream(phdpa.rawAddress.toString(), 0L.toString(), pstream.rawAddress.toString(), pvinstdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaMerge(hdpadest.toString(), hdpasrc.toString(), dwflags.toInt(), 0L.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaSaveStream(hdpa.toString(), 0L.toString(), pstream.rawAddress.toString(), pvinstdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSearch(hdpa: Hdpa, pfind: ConstPtr, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaSearch(hdpa.toString(), pfind.rawAddress.toString(), istart, 0L.toString(), lparam.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaSetPtr(hdpa.toString(), i, p.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDpaSort(hdpa.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaClone(hdsa.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaCreate(cbitem, citemgrow) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaDeleteItem(hdsa.toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaDestroy(hdsa.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaDestroyCallback(hdsa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaEnumCallback(hdsa.toString(), 0L.toString(), pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaGetItem(hdsa.toString(), i, pitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): MutPtr =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaGetItemPtr(hdsa.toString(), i) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaGetSize(hdsa.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaInsertItem(hdsa.toString(), i, pitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaSetItem(hdsa.toString(), i, pitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDsaSort(pdsa.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDestroyPropertySheetPage(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(device.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirListA(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirListComboBoxA(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirListComboBoxW(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirListW(hdlg.rawAddress.toString(), lppathspec.rawAddress.toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), cchout, idcombobox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), cchout, idcombobox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirSelectExA(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, idlistbox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDlgDirSelectExW(hwnddlg.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, idlistbox) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawInsert(handparent.rawAddress.toString(), hlb.rawAddress.toString(), nitem)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: ConstPtr, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawShadowText(hdc.rawAddress.toString(), psztext.rawAddress.toString(), cch.toInt(), prc.rawAddress.toString(), dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStatusTextA(hdc: Hdc, lprc: MutPtr, psztext: Pcstr, uflags: UInt) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawStatusTextA(hdc.rawAddress.toString(), lprc.rawAddress.toString(), psztext.rawAddress.toString(), uflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: MutPtr, psztext: Pcwstr, uflags: UInt) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawStatusTextW(hdc.rawAddress.toString(), lprc.rawAddress.toString(), psztext.rawAddress.toString(), uflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pcliprect: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeBackground(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), pcliprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, poptions: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeBackgroundEx(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: ConstPtr, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeEdge(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, pdestrect.rawAddress.toString(), uedge.toInt(), uflags.toInt(), pcontentrect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, himl: Himagelist, iimageindex: Int): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeIcon(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), himl.toString(), iimageindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeParentBackground(hwnd.rawAddress.toString(), hdc.rawAddress.toString(), prc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(hwnd.rawAddress.toString(), hdc.rawAddress.toString(), dwflags.toInt(), prc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeText(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, psztext.rawAddress.toString(), cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), prect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: MutPtr, poptions: ConstPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsDrawThemeTextEx(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, psztext.rawAddress.toString(), cchtext, dwtextflags.toInt(), prect.rawAddress.toString(), poptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEnableScrollBar(hwnd.rawAddress.toString(), wsbflags.toInt(), warrows.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEnableThemeDialogTexture(hwnd.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTheming(fenable: Bool): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEnableTheming(fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation.toString(), fupdatetarget) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint.toString(), fupdatetarget) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEndPanningFeedback(hwnd.rawAddress.toString(), fanimateback) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEvaluateProximityToPolygon(numvertices.toInt(), controlpolygon.rawAddress.toString(), phittestinginput.rawAddress.toString(), pproximityeval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evaluateProximityToRect(controlboundingbox: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsEvaluateProximityToRect(controlboundingbox.rawAddress.toString(), phittestinginput.rawAddress.toString(), pproximityeval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbEnableScrollBar(param0.rawAddress.toString(), param1, param2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbGetScrollInfo(param0.rawAddress.toString(), code, param2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbGetScrollPos(param0.rawAddress.toString(), code) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbGetScrollProp(param0.rawAddress.toString(), propindex, param2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr, param3: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbGetScrollRange(param0.rawAddress.toString(), code, param2.rawAddress.toString(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: MutPtr, fredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbSetScrollInfo(param0.rawAddress.toString(), code, psi.rawAddress.toString(), fredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbSetScrollPos(param0.rawAddress.toString(), code, pos, fredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbSetScrollProp(param0.rawAddress.toString(), index.toInt(), newvalue.toString(), param3) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbSetScrollRange(param0.rawAddress.toString(), code, min, max, fredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsFlatSbShowScrollBar(param0.rawAddress.toString(), code, param2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: MutPtr, pcxrow: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetBufferedPaintBits(hbufferedpaint.toString(), ppbbuffer.rawAddress.toString(), pcxrow.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetBufferedPaintDC(hbufferedpaint.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(hbufferedpaint.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(hbufferedpaint.toString(), prc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetComboBoxInfo(hwndcombo.rawAddress.toString(), pcbi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetCurrentThemeName(pszthemefilename.rawAddress.toString(), cchmaxnamechars, pszcolorbuff.rawAddress.toString(), cchmaxcolorchars, pszsizebuff.rawAddress.toString(), cchmaxsizechars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: MutPtr, lpinfo: ConstPtr) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetEffectiveClientRect(hwnd.rawAddress.toString(), lprc.rawAddress.toString(), lpinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetListBoxInfo(hwnd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMUILanguage(): UShort =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetMUILanguage() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeAnimationProperty(htheme.toString(), istoryboardid, itargetid, eproperty, pvproperty.rawAddress.toString(), cbsize.toInt(), pcbsizeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeAnimationTransform(htheme.toString(), istoryboardid, itargetid, dwtransformindex.toInt(), ptransform.rawAddress.toString(), cbsize.toInt(), pcbsizeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeAppProperties() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: ConstPtr, pcontentrect: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, pboundingrect.rawAddress.toString(), pcontentrect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: ConstPtr, pextentrect: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeBackgroundExtent(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, pcontentrect.rawAddress.toString(), pextentrect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pregion: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeBackgroundRegion(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prect.rawAddress.toString(), pregion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeBitmap(htheme.toString(), ipartid, istateid, ipropid, dwflags.toInt(), phbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeBool(htheme.toString(), ipartid, istateid, ipropid, pfval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeColor(htheme.toString(), ipartid, istateid, ipropid, pcolor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeDocumentationProperty(pszthemename.rawAddress.toString(), pszpropertyname.rawAddress.toString(), pszvaluebuff.rawAddress.toString(), cchmaxvalchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeEnumValue(htheme.toString(), ipartid, istateid, ipropid, pival.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeFilename(htheme.toString(), ipartid, istateid, ipropid, pszthemefilename.rawAddress.toString(), cchmaxbuffchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeFont(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ipropid, pfont.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeInt(htheme.toString(), ipartid, istateid, ipropid, pival.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeIntList(htheme.toString(), ipartid, istateid, ipropid, pintlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: ConstPtr, pmargins: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeMargins(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ipropid, prc.rawAddress.toString(), pmargins.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeMetric(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ipropid, pival.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: ConstPtr, esize: Themesize, psz: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemePartSize(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, prc.rawAddress.toString(), esize, psz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemePosition(htheme.toString(), ipartid, istateid, ipropid, ppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemePropertyOrigin(htheme.toString(), ipartid, istateid, ipropid, porigin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeRect(htheme.toString(), ipartid, istateid, ipropid, prect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: MutPtr, pcbstream: MutPtr, hinst: Hinstance): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeStream(htheme.toString(), ipartid, istateid, ipropid, ppvstream.rawAddress.toString(), pcbstream.rawAddress.toString(), hinst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeString(htheme.toString(), ipartid, istateid, ipropid, pszbuff.rawAddress.toString(), cchmaxbuffchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysBool(htheme.toString(), iboolid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysColor(htheme.toString(), icolorid) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysColorBrush(htheme.toString(), icolorid) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysFont(htheme.toString(), ifontid, plf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysInt(htheme.toString(), iintid, pivalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysSize(htheme.toString(), isizeid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeSysString(htheme.toString(), istringid, pszstringbuff.rawAddress.toString(), cchmaxstringchars) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: ConstPtr, pextentrect: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeTextExtent(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, psztext.rawAddress.toString(), cchcharcount, dwtextflags.toInt(), pboundingrect.rawAddress.toString(), pextentrect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeTextMetrics(htheme.toString(), hdc.rawAddress.toString(), ipartid, istateid, ptm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeTimingFunction(htheme.toString(), itimingfunctionid, ptimingfunction.rawAddress.toString(), cbsize.toInt(), pcbsizeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetThemeTransitionDuration(htheme.toString(), ipartid, istateidfrom, istateidto, ipropid, pdwduration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: MutPtr, config: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetWindowFeedbackSetting(hwnd.rawAddress.toString(), feedback, dwflags.toInt(), psize.rawAddress.toString(), config.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsGetWindowTheme(hwnd.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun himagelistQueryInterface(himl: Himagelist, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsHimagelistQueryInterface(himl.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: ConstPtr, hrgn: Hrgn, pttest: Point, pwhittestcode: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListAdd(himl.toString(), hbmimage.rawAddress.toString(), hbmmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListAddMasked(himl.toString(), hbmimage.rawAddress.toString(), crmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListBeginDrag(himltrack.toString(), itrack, dxhotspot, dyhotspot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCoCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListCoCreateInstance(rclsid.rawAddress.toString(), punkouter.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListCopy(himldst.toString(), idst, himlsrc.toString(), isrc, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListCreate(cx, cy, flags.toInt(), cinitial, cgrow) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDestroy(himl: Himagelist): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDestroy(himl.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDragEnter(hwndlock.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDragLeave(hwndlock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDragMove(x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDragShowNolock(fshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDraw(himl.toString(), i, hdcdst.rawAddress.toString(), x, y, fstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDrawEx(himl.toString(), i, hdcdst.rawAddress.toString(), x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDrawIndirect(pimldp: ConstPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDrawIndirect(pimldp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListDuplicate(himl.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListEndDrag() {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListEndDrag()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListGetBkColor(himl.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetDragImage(ppt: MutPtr, ppthotspot: MutPtr): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListGetDragImage(ppt.rawAddress.toString(), ppthotspot.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    if (windowsWin32UiControlsNapiAddon != null) MutPtr((windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListGetIcon(himl.toString(), i, flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetIconSize(himl: Himagelist, cx: MutPtr, cy: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListGetIconSize(himl.toString(), cx.rawAddress.toString(), cy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListGetImageCount(himl.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListGetImageInfo(himl.toString(), i, pimageinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListLoadImageA(hi.rawAddress.toString(), lpbmp.rawAddress.toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListLoadImageW(hi.rawAddress.toString(), lpbmp.rawAddress.toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListMerge(himl1.toString(), i1, himl2.toString(), i2, dx, dy) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListRead(pstm: MutPtr): Himagelist =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListRead(pstm.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReadEx(dwflags: UInt, pstm: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListReadEx(dwflags.toInt(), pstm.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListRemove(himl.toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListReplace(himl.toString(), i, hbmimage.rawAddress.toString(), hbmmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListReplaceIcon(himl.toString(), i, hicon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListSetBkColor(himl.toString(), clrbk.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag.toString(), idrag, dxhotspot, dyhotspot) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListSetIconSize(himl.toString(), cx, cy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListSetImageCount(himl.toString(), unewcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListSetOverlayImage(himl.toString(), iimage, ioverlay) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListWrite(himl: Himagelist, pstm: MutPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListWrite(himl.toString(), pstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsImageListWriteEx(himl.toString(), dwflags.toInt(), pstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initCommonControls() {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsInitCommonControls()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initCommonControlsEx(picce: ConstPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsInitCommonControlsEx(picce.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initMUILanguage(uilang: UShort) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsInitMUILanguage(uilang.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsInitializeFlatSB(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAppThemed(): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsAppThemed() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharLowerW(ch: UShort): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsCharLowerW(ch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCompositionActive(): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsCompositionActive() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsDlgButtonChecked(hdlg.rawAddress.toString(), nidbutton) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeActive(): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsThemeActive() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme.toString(), ipartid, istateid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsIsThemePartDefined(htheme.toString(), ipartid, istateid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsLoadIconMetric(hinst.rawAddress.toString(), pszname.rawAddress.toString(), lims, phico.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsLoadIconWithScaleDown(hinst.rawAddress.toString(), pszname.rawAddress.toString(), cx, cy, phico.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeDragList(hlb: Hwnd): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsMakeDragList(hlb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: ConstPtr) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsMenuHelp(umsg.toInt(), wparam.toString(), lparam.toString(), hmainmenu.rawAddress.toString(), hinst.rawAddress.toString(), hwndstatus.rawAddress.toString(), lpwids.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsOpenThemeData(hwnd.rawAddress.toString(), pszclasslist.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsOpenThemeDataEx(hwnd.rawAddress.toString(), pszclasslist.rawAddress.toString(), dwflags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: ConstPtr, pproximityeval: ConstPtr): Lresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(phittestinginput.rawAddress.toString(), pproximityeval.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertySheetA(param0: MutPtr): Long =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsPropertySheetA(param0.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propertySheetW(param0: MutPtr): Long =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsPropertySheetW(param0.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(window.rawAddress.toString(), notifyrange) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(hwnd.rawAddress.toString(), value.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: ConstPtr, redraw: Bool): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetScrollInfo(hwnd.rawAddress.toString(), nbar, lpsi.rawAddress.toString(), redraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetScrollPos(hwnd.rawAddress.toString(), nbar, npos, bredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetScrollRange(hwnd.rawAddress.toString(), nbar, nminpos, nmaxpos, bredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    if (windowsWin32UiControlsNapiAddon != null) {
        windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: ConstPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetWindowFeedbackSetting(hwnd.rawAddress.toString(), feedback, dwflags.toInt(), size.toInt(), configuration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetWindowTheme(hwnd.rawAddress.toString(), pszsubappname.rawAddress.toString(), pszsubidlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: ConstPtr, cbattribute: UInt): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsSetWindowThemeAttribute(hwnd.rawAddress.toString(), eattribute, pvattribute.rawAddress.toString(), cbattribute.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: ConstPtr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsShowHideMenuCtl(hwnd.rawAddress.toString(), uflags.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsShowScrollBar(hwnd.rawAddress.toString(), wbar, bshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSetPtrW(ppsz: MutPtr, psz: Pcwstr): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsStrSetPtrW(ppsz.rawAddress.toString(), psz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsTaskDialog(hwndowner.rawAddress.toString(), hinstance.rawAddress.toString(), pszwindowtitle.rawAddress.toString(), pszmaininstruction.rawAddress.toString(), pszcontent.rawAddress.toString(), dwcommonbuttons, pszicon.rawAddress.toString(), pnbutton.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun taskDialogIndirect(ptaskconfig: ConstPtr, pnbutton: MutPtr, pnradiobutton: MutPtr, pfverificationflagchecked: MutPtr): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsTaskDialogIndirect(ptaskconfig.rawAddress.toString(), pnbutton.rawAddress.toString(), pnradiobutton.rawAddress.toString(), pfverificationflagchecked.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsUninitializeFlatSB(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    if (windowsWin32UiControlsNapiAddon != null) (windowsWin32UiControlsNapiAddon.windowssysWindowsWin32UiControlsUpdatePanningFeedback(hwnd.rawAddress.toString(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
