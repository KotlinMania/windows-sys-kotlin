@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, panimationparams: ConstPtr, phdcfrom: MutPtr, phdcto: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBeginBufferedAnimation")

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, phdc: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBeginBufferedPaint")

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBeginPanningFeedback")

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBufferedPaintClear")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsBufferedPaintInit")
private external fun wasiWindowssysWindowsWin32UiControlsBufferedPaintInit(): Int

public actual fun bufferedPaintInit(): Hresult =
    wasiWindowssysWindowsWin32UiControlsBufferedPaintInit()

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation")

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: ConstPtr, alpha: UByte): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBufferedPaintSetAlpha")

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsBufferedPaintUnInit")
private external fun wasiWindowssysWindowsWin32UiControlsBufferedPaintUnInit(): Int

public actual fun bufferedPaintUnInit(): Hresult =
    wasiWindowssysWindowsWin32UiControlsBufferedPaintUnInit()

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCheckDlgButton")

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCheckRadioButton")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsCloseThemeData")
private external fun wasiWindowssysWindowsWin32UiControlsCloseThemeData(htheme: Long): Int

public actual fun closeThemeData(htheme: Htheme): Hresult =
    wasiWindowssysWindowsWin32UiControlsCloseThemeData(htheme)

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: ConstPtr, inummaps: Int): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreateMappedBitmap")

public actual fun createPropertySheetPageA(constpropsheetpagepointer: MutPtr): Hpropsheetpage =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreatePropertySheetPageA")

public actual fun createPropertySheetPageW(constpropsheetpagepointer: MutPtr): Hpropsheetpage =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreatePropertySheetPageW")

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreateStatusWindowA")

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreateStatusWindowW")

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice")

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: MutPtr, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreateToolbarEx")

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsCreateUpDownControl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDpaClone")
private external fun wasiWindowssysWindowsWin32UiControlsDpaClone(hdpa: Long, hdpanew: Long): Long

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    wasiWindowssysWindowsWin32UiControlsDpaClone(hdpa, hdpanew)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDpaCreate")
private external fun wasiWindowssysWindowsWin32UiControlsDpaCreate(citemgrow: Int): Long

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    wasiWindowssysWindowsWin32UiControlsDpaCreate(citemgrow)

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaCreateEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDpaDeleteAllPtrs")
private external fun wasiWindowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa: Long): Int

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    wasiWindowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa)

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaDeletePtr")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDpaDestroy")
private external fun wasiWindowssysWindowsWin32UiControlsDpaDestroy(hdpa: Long): Int

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    wasiWindowssysWindowsWin32UiControlsDpaDestroy(hdpa)

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaDestroyCallback")

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaEnumCallback")

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaGetPtr")

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaGetPtrIndex")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDpaGetSize")
private external fun wasiWindowssysWindowsWin32UiControlsDpaGetSize(hdpa: Long): Long

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    wasiWindowssysWindowsWin32UiControlsDpaGetSize(hdpa).toULong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDpaGrow")
private external fun wasiWindowssysWindowsWin32UiControlsDpaGrow(pdpa: Long, cp: Int): Int

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsDpaGrow(pdpa, cp)

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaInsertPtr")

public actual fun dpaLoadStream(phdpa: MutPtr, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaLoadStream")

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaMerge")

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaSaveStream")

public actual fun dpaSearch(hdpa: Hdpa, pfind: ConstPtr, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaSearch")

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaSetPtr")

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDpaSort")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDsaClone")
private external fun wasiWindowssysWindowsWin32UiControlsDsaClone(hdsa: Long): Long

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    wasiWindowssysWindowsWin32UiControlsDsaClone(hdsa)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDsaCreate")
private external fun wasiWindowssysWindowsWin32UiControlsDsaCreate(cbitem: Int, citemgrow: Int): Long

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    wasiWindowssysWindowsWin32UiControlsDsaCreate(cbitem, citemgrow)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDsaDeleteAllItems")
private external fun wasiWindowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa: Long): Int

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    wasiWindowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDsaDeleteItem")
private external fun wasiWindowssysWindowsWin32UiControlsDsaDeleteItem(hdsa: Long, i: Int): Int

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsDsaDeleteItem(hdsa, i)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDsaDestroy")
private external fun wasiWindowssysWindowsWin32UiControlsDsaDestroy(hdsa: Long): Int

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    wasiWindowssysWindowsWin32UiControlsDsaDestroy(hdsa)

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaDestroyCallback")

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaEnumCallback")

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaGetItem")

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaGetItemPtr")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsDsaGetSize")
private external fun wasiWindowssysWindowsWin32UiControlsDsaGetSize(hdsa: Long): Long

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    wasiWindowssysWindowsWin32UiControlsDsaGetSize(hdsa).toULong()

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaInsertItem")

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaSetItem")

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDsaSort")

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDestroyPropertySheetPage")

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice")

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirListA")

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirListComboBoxA")

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirListComboBoxW")

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirListW")

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA")

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW")

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirSelectExA")

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDlgDirSelectExW")

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawInsert")

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: ConstPtr, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawShadowText")

public actual fun drawStatusTextA(hdc: Hdc, lprc: MutPtr, psztext: Pcstr, uflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawStatusTextA")

public actual fun drawStatusTextW(hdc: Hdc, lprc: MutPtr, psztext: Pcwstr, uflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawStatusTextW")

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pcliprect: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeBackground")

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, poptions: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeBackgroundEx")

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: ConstPtr, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeEdge")

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, himl: Himagelist, iimageindex: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeIcon")

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeParentBackground")

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx")

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeText")

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: MutPtr, poptions: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsDrawThemeTextEx")

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsEnableScrollBar")

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsEnableThemeDialogTexture")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsEnableTheming")
private external fun wasiWindowssysWindowsWin32UiControlsEnableTheming(fenable: Int): Int

public actual fun enableTheming(fenable: Bool): Hresult =
    wasiWindowssysWindowsWin32UiControlsEnableTheming(fenable)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsEndBufferedAnimation")
private external fun wasiWindowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation: Long, fupdatetarget: Int): Int

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    wasiWindowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation, fupdatetarget)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsEndBufferedPaint")
private external fun wasiWindowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint: Long, fupdatetarget: Int): Int

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    wasiWindowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsEndPanningFeedback")

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsEvaluateProximityToPolygon")

public actual fun evaluateProximityToRect(controlboundingbox: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsEvaluateProximityToRect")

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbEnableScrollBar")

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbGetScrollInfo")

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbGetScrollPos")

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbGetScrollProp")

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr, param3: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbGetScrollRange")

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: MutPtr, fredraw: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbSetScrollInfo")

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbSetScrollPos")

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbSetScrollProp")

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbSetScrollRange")

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsFlatSbShowScrollBar")

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: MutPtr, pcxrow: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetBufferedPaintBits")

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetBufferedPaintDC")

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC")

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect")

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetComboBoxInfo")

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetCurrentThemeName")

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: MutPtr, lpinfo: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetEffectiveClientRect")

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetListBoxInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsGetMUILanguage")
private external fun wasiWindowssysWindowsWin32UiControlsGetMUILanguage(): Int

public actual fun getMUILanguage(): UShort =
    wasiWindowssysWindowsWin32UiControlsGetMUILanguage().toUShort()

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeAnimationProperty")

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeAnimationTransform")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsGetThemeAppProperties")
private external fun wasiWindowssysWindowsWin32UiControlsGetThemeAppProperties(): Int

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    wasiWindowssysWindowsWin32UiControlsGetThemeAppProperties().toUInt()

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: ConstPtr, pcontentrect: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect")

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: ConstPtr, pextentrect: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeBackgroundExtent")

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pregion: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeBackgroundRegion")

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeBitmap")

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeBool")

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeColor")

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeDocumentationProperty")

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeEnumValue")

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeFilename")

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeFont")

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeInt")

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeIntList")

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: ConstPtr, pmargins: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeMargins")

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeMetric")

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: ConstPtr, esize: Themesize, psz: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemePartSize")

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemePosition")

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemePropertyOrigin")

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeRect")

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: MutPtr, pcbstream: MutPtr, hinst: Hinstance): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeStream")

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsGetThemeSysBool")
private external fun wasiWindowssysWindowsWin32UiControlsGetThemeSysBool(htheme: Long, iboolid: Int): Int

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsGetThemeSysBool(htheme, iboolid)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsGetThemeSysColor")
private external fun wasiWindowssysWindowsWin32UiControlsGetThemeSysColor(htheme: Long, icolorid: Int): Int

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    wasiWindowssysWindowsWin32UiControlsGetThemeSysColor(htheme, icolorid).toUInt()

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeSysColorBrush")

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeSysFont")

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeSysInt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsGetThemeSysSize")
private external fun wasiWindowssysWindowsWin32UiControlsGetThemeSysSize(htheme: Long, isizeid: Int): Int

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    wasiWindowssysWindowsWin32UiControlsGetThemeSysSize(htheme, isizeid)

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeSysString")

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: ConstPtr, pextentrect: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeTextExtent")

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeTextMetrics")

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeTimingFunction")

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetThemeTransitionDuration")

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: MutPtr, config: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetWindowFeedbackSetting")

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsGetWindowTheme")

public actual fun himagelistQueryInterface(himl: Himagelist, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsHimagelistQueryInterface")

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: ConstPtr, hrgn: Hrgn, pttest: Point, pwhittestcode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsHitTestThemeBackground")

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListAdd")

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListAddMasked")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListBeginDrag")
private external fun wasiWindowssysWindowsWin32UiControlsImageListBeginDrag(himltrack: Long, itrack: Int, dxhotspot: Int, dyhotspot: Int): Int

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListBeginDrag(himltrack, itrack, dxhotspot, dyhotspot)

public actual fun imageListCoCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListCoCreateInstance")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListCopy")
private external fun wasiWindowssysWindowsWin32UiControlsImageListCopy(himldst: Long, idst: Int, himlsrc: Long, isrc: Int, uflags: Int): Int

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListCopy(himldst, idst, himlsrc, isrc, uflags.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListCreate")
private external fun wasiWindowssysWindowsWin32UiControlsImageListCreate(cx: Int, cy: Int, flags: Int, cinitial: Int, cgrow: Int): Long

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    wasiWindowssysWindowsWin32UiControlsImageListCreate(cx, cy, flags.toInt(), cinitial, cgrow)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListDestroy")
private external fun wasiWindowssysWindowsWin32UiControlsImageListDestroy(himl: Long): Int

public actual fun imageListDestroy(himl: Himagelist): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListDestroy(himl)

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListDragEnter")

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListDragLeave")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListDragMove")
private external fun wasiWindowssysWindowsWin32UiControlsImageListDragMove(x: Int, y: Int): Int

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListDragMove(x, y)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListDragShowNolock")
private external fun wasiWindowssysWindowsWin32UiControlsImageListDragShowNolock(fshow: Int): Int

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListDragShowNolock(fshow)

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListDraw")

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListDrawEx")

public actual fun imageListDrawIndirect(pimldp: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListDrawIndirect")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListDuplicate")
private external fun wasiWindowssysWindowsWin32UiControlsImageListDuplicate(himl: Long): Long

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    wasiWindowssysWindowsWin32UiControlsImageListDuplicate(himl)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListEndDrag")
private external fun wasiWindowssysWindowsWin32UiControlsImageListEndDrag(): Unit

public actual fun imageListEndDrag(): Unit =
    wasiWindowssysWindowsWin32UiControlsImageListEndDrag()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListGetBkColor")
private external fun wasiWindowssysWindowsWin32UiControlsImageListGetBkColor(himl: Long): Int

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    wasiWindowssysWindowsWin32UiControlsImageListGetBkColor(himl).toUInt()

public actual fun imageListGetDragImage(ppt: MutPtr, ppthotspot: MutPtr): Himagelist =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListGetDragImage")

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListGetIcon")

public actual fun imageListGetIconSize(himl: Himagelist, cx: MutPtr, cy: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListGetIconSize")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListGetImageCount")
private external fun wasiWindowssysWindowsWin32UiControlsImageListGetImageCount(himl: Long): Int

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    wasiWindowssysWindowsWin32UiControlsImageListGetImageCount(himl)

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListGetImageInfo")

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListLoadImageA")

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListLoadImageW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListMerge")
private external fun wasiWindowssysWindowsWin32UiControlsImageListMerge(himl1: Long, i1: Int, himl2: Long, i2: Int, dx: Int, dy: Int): Long

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    wasiWindowssysWindowsWin32UiControlsImageListMerge(himl1, i1, himl2, i2, dx, dy)

public actual fun imageListRead(pstm: MutPtr): Himagelist =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListRead")

public actual fun imageListReadEx(dwflags: UInt, pstm: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListReadEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListRemove")
private external fun wasiWindowssysWindowsWin32UiControlsImageListRemove(himl: Long, i: Int): Int

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListRemove(himl, i)

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListReplace")

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListReplaceIcon")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListSetBkColor")
private external fun wasiWindowssysWindowsWin32UiControlsImageListSetBkColor(himl: Long, clrbk: Int): Int

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    wasiWindowssysWindowsWin32UiControlsImageListSetBkColor(himl, clrbk.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListSetDragCursorImage")
private external fun wasiWindowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag: Long, idrag: Int, dxhotspot: Int, dyhotspot: Int): Int

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag, idrag, dxhotspot, dyhotspot)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListSetIconSize")
private external fun wasiWindowssysWindowsWin32UiControlsImageListSetIconSize(himl: Long, cx: Int, cy: Int): Int

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListSetIconSize(himl, cx, cy)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListSetImageCount")
private external fun wasiWindowssysWindowsWin32UiControlsImageListSetImageCount(himl: Long, unewcount: Int): Int

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListSetImageCount(himl, unewcount.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsImageListSetOverlayImage")
private external fun wasiWindowssysWindowsWin32UiControlsImageListSetOverlayImage(himl: Long, iimage: Int, ioverlay: Int): Int

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsImageListSetOverlayImage(himl, iimage, ioverlay)

public actual fun imageListWrite(himl: Himagelist, pstm: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListWrite")

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsImageListWriteEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsInitCommonControls")
private external fun wasiWindowssysWindowsWin32UiControlsInitCommonControls(): Unit

public actual fun initCommonControls(): Unit =
    wasiWindowssysWindowsWin32UiControlsInitCommonControls()

public actual fun initCommonControlsEx(picce: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsInitCommonControlsEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsInitMUILanguage")
private external fun wasiWindowssysWindowsWin32UiControlsInitMUILanguage(uilang: Int): Unit

public actual fun initMUILanguage(uilang: UShort): Unit =
    wasiWindowssysWindowsWin32UiControlsInitMUILanguage(uilang.toInt())

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsInitializeFlatSB")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsIsAppThemed")
private external fun wasiWindowssysWindowsWin32UiControlsIsAppThemed(): Int

public actual fun isAppThemed(): Bool =
    wasiWindowssysWindowsWin32UiControlsIsAppThemed()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsIsCharLowerW")
private external fun wasiWindowssysWindowsWin32UiControlsIsCharLowerW(ch: Int): Int

public actual fun isCharLowerW(ch: UShort): Bool =
    wasiWindowssysWindowsWin32UiControlsIsCharLowerW(ch.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsIsCompositionActive")
private external fun wasiWindowssysWindowsWin32UiControlsIsCompositionActive(): Int

public actual fun isCompositionActive(): Bool =
    wasiWindowssysWindowsWin32UiControlsIsCompositionActive()

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsIsDlgButtonChecked")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsIsThemeActive")
private external fun wasiWindowssysWindowsWin32UiControlsIsThemeActive(): Int

public actual fun isThemeActive(): Bool =
    wasiWindowssysWindowsWin32UiControlsIsThemeActive()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent")
private external fun wasiWindowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme: Long, ipartid: Int, istateid: Int): Int

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme, ipartid, istateid)

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsIsThemePartDefined")
private external fun wasiWindowssysWindowsWin32UiControlsIsThemePartDefined(htheme: Long, ipartid: Int, istateid: Int): Int

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    wasiWindowssysWindowsWin32UiControlsIsThemePartDefined(htheme, ipartid, istateid)

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsLBItemFromPt")

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsLoadIconMetric")

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsLoadIconWithScaleDown")

public actual fun makeDragList(hlb: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsMakeDragList")

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsMenuHelp")

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsOpenThemeData")

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsOpenThemeDataEx")

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: ConstPtr, pproximityeval: ConstPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation")

public actual fun propertySheetA(param0: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsPropertySheetA")

public actual fun propertySheetW(param0: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsPropertySheetW")

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications")

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow")

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: ConstPtr, redraw: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsSetScrollInfo")

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsSetScrollPos")

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsSetScrollRange")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiControlsSetThemeAppProperties")
private external fun wasiWindowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags: Int): Unit

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags): Unit =
    wasiWindowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags.toInt())

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsSetWindowFeedbackSetting")

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsSetWindowTheme")

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: ConstPtr, cbattribute: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsSetWindowThemeAttribute")

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsShowHideMenuCtl")

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsShowScrollBar")

public actual fun strSetPtrW(ppsz: MutPtr, psz: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsStrSetPtrW")

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsTaskDialog")

public actual fun taskDialogIndirect(ptaskconfig: ConstPtr, pnbutton: MutPtr, pnradiobutton: MutPtr, pfverificationflagchecked: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsTaskDialogIndirect")

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsUninitializeFlatSB")

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiControlsUpdatePanningFeedback")
