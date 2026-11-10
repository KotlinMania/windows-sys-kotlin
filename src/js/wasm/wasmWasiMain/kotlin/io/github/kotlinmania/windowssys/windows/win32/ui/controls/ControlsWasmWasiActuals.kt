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

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, panimationparams: COpaquePointer?, phdcfrom: COpaquePointer?, phdcto: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, phdc: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferedPaintInit(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: COpaquePointer?, alpha: UByte): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bufferedPaintUnInit(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeThemeData(htheme: Htheme): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: COpaquePointer?, inummaps: Int): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPropertySheetPageA(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPropertySheetPageW(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: COpaquePointer?, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaLoadStream(phdpa: COpaquePointer?, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaSearch(hdpa: Hdpa, pfind: COpaquePointer?, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: COpaquePointer?, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawStatusTextA(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcstr, uflags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawStatusTextW(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcwstr, uflags: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pcliprect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: COpaquePointer?, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, himl: Himagelist, iimageindex: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableTheming(fenable: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evaluateProximityToRect(controlboundingbox: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?, param3: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: COpaquePointer?, fredraw: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: COpaquePointer?, pcxrow: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: COpaquePointer?, lpinfo: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMUILanguage(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: COpaquePointer?, pcontentrect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pregion: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: COpaquePointer?, pmargins: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: COpaquePointer?, esize: Themesize, psz: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: COpaquePointer?, pcbstream: COpaquePointer?, hinst: Hinstance): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: COpaquePointer?, config: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun himagelistQueryInterface(himl: Himagelist, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: COpaquePointer?, hrgn: Hrgn, pttest: Point, pwhittestcode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListCoCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDestroy(himl: Himagelist): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDrawIndirect(pimldp: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListEndDrag(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListGetDragImage(ppt: COpaquePointer?, ppthotspot: COpaquePointer?): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListGetIconSize(himl: Himagelist, cx: COpaquePointer?, cy: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListRead(pstm: COpaquePointer?): Himagelist =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListReadEx(dwflags: UInt, pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListWrite(himl: Himagelist, pstm: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initCommonControls(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initCommonControlsEx(picce: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initMUILanguage(uilang: UShort): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isAppThemed(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharLowerW(ch: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCompositionActive(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isThemeActive(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun makeDragList(hlb: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun propertySheetA(param0: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun propertySheetW(param0: COpaquePointer?): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?, redraw: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strSetPtrW(ppsz: COpaquePointer?, psz: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun taskDialogIndirect(ptaskconfig: COpaquePointer?, pnbutton: COpaquePointer?, pnradiobutton: COpaquePointer?, pfverificationflagchecked: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
