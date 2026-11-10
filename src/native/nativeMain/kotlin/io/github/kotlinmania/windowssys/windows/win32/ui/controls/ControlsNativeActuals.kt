@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, panimationparams: COpaquePointer?, phdcfrom: COpaquePointer?, phdcto: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_beginBufferedAnimation(hwnd?.value?.toCPointer<ByteVar>(), hdctarget?.value?.toCPointer<ByteVar>(), prctarget?.value?.toCPointer<ByteVar>(), dwformat, ppaintparams?.value?.toCPointer<ByteVar>(), panimationparams?.value?.toCPointer<ByteVar>(), phdcfrom?.value?.toCPointer<ByteVar>(), phdcto?.value?.toCPointer<ByteVar>())

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, phdc: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_beginBufferedPaint(hdctarget?.value?.toCPointer<ByteVar>(), prctarget?.value?.toCPointer<ByteVar>(), dwformat, ppaintparams?.value?.toCPointer<ByteVar>(), phdc?.value?.toCPointer<ByteVar>())

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_beginPanningFeedback(hwnd?.value?.toCPointer<ByteVar>())

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_bufferedPaintClear(hbufferedpaint, prc?.value?.toCPointer<ByteVar>())

public actual fun bufferedPaintInit(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_bufferedPaintInit()

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation(hwnd?.value?.toCPointer<ByteVar>(), hdctarget?.value?.toCPointer<ByteVar>())

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: COpaquePointer?, alpha: UByte): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha(hbufferedpaint, prc?.value?.toCPointer<ByteVar>(), alpha)

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations(hwnd?.value?.toCPointer<ByteVar>())

public actual fun bufferedPaintUnInit(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_bufferedPaintUnInit()

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_checkDlgButton(hdlg?.value?.toCPointer<ByteVar>(), nidbutton, ucheck)

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_checkRadioButton(hdlg?.value?.toCPointer<ByteVar>(), nidfirstbutton, nidlastbutton, nidcheckbutton)

public actual fun closeThemeData(htheme: Htheme): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_closeThemeData(htheme.toLong())

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: COpaquePointer?, inummaps: Int): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createMappedBitmap(hinstance?.value?.toCPointer<ByteVar>(), idbitmap, wflags, lpcolormap?.value?.toCPointer<ByteVar>(), inummaps)?.let { COpaquePointer(it.toLong()) }

public actual fun createPropertySheetPageA(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createPropertySheetPageA(constpropsheetpagepointer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPropertySheetPageW(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createPropertySheetPageW(constpropsheetpagepointer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createStatusWindowA(style, lpsztext?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), wid)?.let { COpaquePointer(it.toLong()) }

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createStatusWindowW(style, lpsztext?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), wid)?.let { COpaquePointer(it.toLong()) }

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createSyntheticPointerDevice(pointertype, maxcount, mode)?.let { COpaquePointer(it.toLong()) }

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: COpaquePointer?, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createToolbarEx(hwnd?.value?.toCPointer<ByteVar>(), ws, wid, nbitmaps, hbminst?.value?.toCPointer<ByteVar>(), wbmid, lpbuttons?.value?.toCPointer<ByteVar>(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize)?.let { COpaquePointer(it.toLong()) }

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_createUpDownControl(dwstyle, x, y, cx, cy, hparent?.value?.toCPointer<ByteVar>(), nid, hinst?.value?.toCPointer<ByteVar>(), hbuddy?.value?.toCPointer<ByteVar>(), nupper, nlower, npos)?.let { COpaquePointer(it.toLong()) }

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaClone(hdpa.toLong(), hdpanew.toLong())

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaCreate(citemgrow)

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaCreateEx(cpgrow, hheap?.value?.toCPointer<ByteVar>())

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs(hdpa.toLong())

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaDeletePtr(hdpa.toLong(), i)?.let { COpaquePointer(it.toLong()) }

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaDestroy(hdpa.toLong())

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaDestroyCallback(hdpa.toLong(), 0L.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>())
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaEnumCallback(hdpa.toLong(), 0L.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>())
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaGetPtr(hdpa.toLong(), i)?.let { COpaquePointer(it.toLong()) }

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaGetPtrIndex(hdpa.toLong(), p?.value?.toCPointer<ByteVar>())

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaGetSize(hdpa.toLong())

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaGrow(pdpa.toLong(), cp)

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaInsertPtr(hdpa.toLong(), i, p?.value?.toCPointer<ByteVar>())

public actual fun dpaLoadStream(phdpa: COpaquePointer?, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaLoadStream(phdpa?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pstream?.value?.toCPointer<ByteVar>(), pvinstdata?.value?.toCPointer<ByteVar>())

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaMerge(hdpadest.toLong(), hdpasrc.toLong(), dwflags, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaSaveStream(hdpa.toLong(), 0L.toCPointer<ByteVar>(), pstream?.value?.toCPointer<ByteVar>(), pvinstdata?.value?.toCPointer<ByteVar>())

public actual fun dpaSearch(hdpa: Hdpa, pfind: COpaquePointer?, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaSearch(hdpa.toLong(), pfind?.value?.toCPointer<ByteVar>(), istart, 0L.toCPointer<ByteVar>(), lparam, options)

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaSetPtr(hdpa.toLong(), i, p?.value?.toCPointer<ByteVar>())

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dpaSort(hdpa.toLong(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaClone(hdsa.toLong())

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaCreate(cbitem, citemgrow)

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaDeleteAllItems(hdsa.toLong())

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaDeleteItem(hdsa.toLong(), i)

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaDestroy(hdsa.toLong())

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaDestroyCallback(hdsa.toLong(), 0L.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>())
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaEnumCallback(hdsa.toLong(), 0L.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>())
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaGetItem(hdsa.toLong(), i, pitem?.value?.toCPointer<ByteVar>())

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaGetItemPtr(hdsa.toLong(), i)?.let { COpaquePointer(it.toLong()) }

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaGetSize(hdsa.toLong())

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaInsertItem(hdsa.toLong(), i, pitem?.value?.toCPointer<ByteVar>())

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaSetItem(hdsa.toLong(), i, pitem?.value?.toCPointer<ByteVar>())

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dsaSort(pdsa.toLong(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_destroyPropertySheetPage(param0?.value?.toCPointer<ByteVar>())

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice(device?.value?.toCPointer<ByteVar>())
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirListA(hdlg?.value?.toCPointer<ByteVar>(), lppathspec?.value?.toCPointer<ByteVar>(), nidlistbox, nidstaticpath, ufiletype)

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirListComboBoxA(hdlg?.value?.toCPointer<ByteVar>(), lppathspec?.value?.toCPointer<ByteVar>(), nidcombobox, nidstaticpath, ufiletype)

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirListComboBoxW(hdlg?.value?.toCPointer<ByteVar>(), lppathspec?.value?.toCPointer<ByteVar>(), nidcombobox, nidstaticpath, ufiletype)

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirListW(hdlg?.value?.toCPointer<ByteVar>(), lppathspec?.value?.toCPointer<ByteVar>(), nidlistbox, nidstaticpath, ufiletype)

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA(hwnddlg?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), cchout, idcombobox)

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW(hwnddlg?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), cchout, idcombobox)

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirSelectExA(hwnddlg?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), chcount, idlistbox)

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_dlgDirSelectExW(hwnddlg?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), chcount, idlistbox)

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawInsert(handparent?.value?.toCPointer<ByteVar>(), hlb?.value?.toCPointer<ByteVar>(), nitem)
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: COpaquePointer?, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawShadowText(hdc?.value?.toCPointer<ByteVar>(), psztext?.value?.toCPointer<ByteVar>(), cch, prc?.value?.toCPointer<ByteVar>(), dwflags, crtext, crshadow, ixoffset, iyoffset)

public actual fun drawStatusTextA(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcstr, uflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawStatusTextA(hdc?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), psztext?.value?.toCPointer<ByteVar>(), uflags)
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcwstr, uflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawStatusTextW(hdc?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), psztext?.value?.toCPointer<ByteVar>(), uflags)
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pcliprect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeBackground(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, prect?.value?.toCPointer<ByteVar>(), pcliprect?.value?.toCPointer<ByteVar>())

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeBackgroundEx(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, prect?.value?.toCPointer<ByteVar>(), poptions?.value?.toCPointer<ByteVar>())

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: COpaquePointer?, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeEdge(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, pdestrect?.value?.toCPointer<ByteVar>(), uedge, uflags, pcontentrect?.value?.toCPointer<ByteVar>())

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, himl: Himagelist, iimageindex: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeIcon(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, prect?.value?.toCPointer<ByteVar>(), himl.toLong(), iimageindex)

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeParentBackground(hwnd?.value?.toCPointer<ByteVar>(), hdc?.value?.toCPointer<ByteVar>(), prc?.value?.toCPointer<ByteVar>())

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx(hwnd?.value?.toCPointer<ByteVar>(), hdc?.value?.toCPointer<ByteVar>(), dwflags, prc?.value?.toCPointer<ByteVar>())

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeText(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, psztext?.value?.toCPointer<ByteVar>(), cchtext, dwtextflags, dwtextflags2, prect?.value?.toCPointer<ByteVar>())

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_drawThemeTextEx(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, psztext?.value?.toCPointer<ByteVar>(), cchtext, dwtextflags, prect?.value?.toCPointer<ByteVar>(), poptions?.value?.toCPointer<ByteVar>())

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_enableScrollBar(hwnd?.value?.toCPointer<ByteVar>(), wsbflags, warrows)

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_enableThemeDialogTexture(hwnd?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun enableTheming(fenable: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_enableTheming(fenable)

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_endBufferedAnimation(hbpanimation, fupdatetarget)

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_endBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_endPanningFeedback(hwnd?.value?.toCPointer<ByteVar>(), fanimateback)

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_evaluateProximityToPolygon(numvertices, controlpolygon?.value?.toCPointer<ByteVar>(), phittestinginput?.value?.toCPointer<ByteVar>(), pproximityeval?.value?.toCPointer<ByteVar>())

public actual fun evaluateProximityToRect(controlboundingbox: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_evaluateProximityToRect(controlboundingbox?.value?.toCPointer<ByteVar>(), phittestinginput?.value?.toCPointer<ByteVar>(), pproximityeval?.value?.toCPointer<ByteVar>())

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbEnableScrollBar(param0?.value?.toCPointer<ByteVar>(), param1, param2)

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbGetScrollInfo(param0?.value?.toCPointer<ByteVar>(), code, param2?.value?.toCPointer<ByteVar>())

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbGetScrollPos(param0?.value?.toCPointer<ByteVar>(), code)

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbGetScrollProp(param0?.value?.toCPointer<ByteVar>(), propindex, param2?.value?.toCPointer<ByteVar>())

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?, param3: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbGetScrollRange(param0?.value?.toCPointer<ByteVar>(), code, param2?.value?.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>())

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: COpaquePointer?, fredraw: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbSetScrollInfo(param0?.value?.toCPointer<ByteVar>(), code, psi?.value?.toCPointer<ByteVar>(), fredraw)

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbSetScrollPos(param0?.value?.toCPointer<ByteVar>(), code, pos, fredraw)

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbSetScrollProp(param0?.value?.toCPointer<ByteVar>(), index, newvalue, param3)

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbSetScrollRange(param0?.value?.toCPointer<ByteVar>(), code, min, max, fredraw)

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_flatSbShowScrollBar(param0?.value?.toCPointer<ByteVar>(), code, param2)

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: COpaquePointer?, pcxrow: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getBufferedPaintBits(hbufferedpaint, ppbbuffer?.value?.toCPointer<ByteVar>(), pcxrow?.value?.toCPointer<ByteVar>())

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getBufferedPaintDC(hbufferedpaint)?.let { COpaquePointer(it.toLong()) }

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC(hbufferedpaint)?.let { COpaquePointer(it.toLong()) }

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect(hbufferedpaint, prc?.value?.toCPointer<ByteVar>())

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getComboBoxInfo(hwndcombo?.value?.toCPointer<ByteVar>(), pcbi?.value?.toCPointer<ByteVar>())

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getCurrentThemeName(pszthemefilename?.value?.toCPointer<ByteVar>(), cchmaxnamechars, pszcolorbuff?.value?.toCPointer<ByteVar>(), cchmaxcolorchars, pszsizebuff?.value?.toCPointer<ByteVar>(), cchmaxsizechars)

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: COpaquePointer?, lpinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getEffectiveClientRect(hwnd?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getListBoxInfo(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getMUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getMUILanguage()

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeAnimationProperty(htheme.toLong(), istoryboardid, itargetid, eproperty, pvproperty?.value?.toCPointer<ByteVar>(), cbsize, pcbsizeout?.value?.toCPointer<ByteVar>())

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeAnimationTransform(htheme.toLong(), istoryboardid, itargetid, dwtransformindex, ptransform?.value?.toCPointer<ByteVar>(), cbsize, pcbsizeout?.value?.toCPointer<ByteVar>())

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeAppProperties()

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: COpaquePointer?, pcontentrect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, pboundingrect?.value?.toCPointer<ByteVar>(), pcontentrect?.value?.toCPointer<ByteVar>())

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeBackgroundExtent(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, pcontentrect?.value?.toCPointer<ByteVar>(), pextentrect?.value?.toCPointer<ByteVar>())

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pregion: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeBackgroundRegion(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, prect?.value?.toCPointer<ByteVar>(), pregion?.value?.toCPointer<ByteVar>())

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeBitmap(htheme.toLong(), ipartid, istateid, ipropid, dwflags, phbitmap?.value?.toCPointer<ByteVar>())

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeBool(htheme.toLong(), ipartid, istateid, ipropid, pfval?.value?.toCPointer<ByteVar>())

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeColor(htheme.toLong(), ipartid, istateid, ipropid, pcolor?.value?.toCPointer<ByteVar>())

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeDocumentationProperty(pszthemename?.value?.toCPointer<ByteVar>(), pszpropertyname?.value?.toCPointer<ByteVar>(), pszvaluebuff?.value?.toCPointer<ByteVar>(), cchmaxvalchars)

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeEnumValue(htheme.toLong(), ipartid, istateid, ipropid, pival?.value?.toCPointer<ByteVar>())

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeFilename(htheme.toLong(), ipartid, istateid, ipropid, pszthemefilename?.value?.toCPointer<ByteVar>(), cchmaxbuffchars)

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeFont(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, ipropid, pfont?.value?.toCPointer<ByteVar>())

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeInt(htheme.toLong(), ipartid, istateid, ipropid, pival?.value?.toCPointer<ByteVar>())

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeIntList(htheme.toLong(), ipartid, istateid, ipropid, pintlist?.value?.toCPointer<ByteVar>())

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: COpaquePointer?, pmargins: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeMargins(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, ipropid, prc?.value?.toCPointer<ByteVar>(), pmargins?.value?.toCPointer<ByteVar>())

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeMetric(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, ipropid, pival?.value?.toCPointer<ByteVar>())

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: COpaquePointer?, esize: Themesize, psz: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemePartSize(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, prc?.value?.toCPointer<ByteVar>(), esize, psz?.value?.toCPointer<ByteVar>())

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemePosition(htheme.toLong(), ipartid, istateid, ipropid, ppoint?.value?.toCPointer<ByteVar>())

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemePropertyOrigin(htheme.toLong(), ipartid, istateid, ipropid, porigin?.value?.toCPointer<ByteVar>())

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeRect(htheme.toLong(), ipartid, istateid, ipropid, prect?.value?.toCPointer<ByteVar>())

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: COpaquePointer?, pcbstream: COpaquePointer?, hinst: Hinstance): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeStream(htheme.toLong(), ipartid, istateid, ipropid, ppvstream?.value?.toCPointer<ByteVar>(), pcbstream?.value?.toCPointer<ByteVar>(), hinst?.value?.toCPointer<ByteVar>())

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeString(htheme.toLong(), ipartid, istateid, ipropid, pszbuff?.value?.toCPointer<ByteVar>(), cchmaxbuffchars)

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysBool(htheme.toLong(), iboolid)

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysColor(htheme.toLong(), icolorid)

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysColorBrush(htheme.toLong(), icolorid)?.let { COpaquePointer(it.toLong()) }

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysFont(htheme.toLong(), ifontid, plf?.value?.toCPointer<ByteVar>())

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysInt(htheme.toLong(), iintid, pivalue?.value?.toCPointer<ByteVar>())

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysSize(htheme.toLong(), isizeid)

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeSysString(htheme.toLong(), istringid, pszstringbuff?.value?.toCPointer<ByteVar>(), cchmaxstringchars)

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeTextExtent(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, psztext?.value?.toCPointer<ByteVar>(), cchcharcount, dwtextflags, pboundingrect?.value?.toCPointer<ByteVar>(), pextentrect?.value?.toCPointer<ByteVar>())

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeTextMetrics(htheme.toLong(), hdc?.value?.toCPointer<ByteVar>(), ipartid, istateid, ptm?.value?.toCPointer<ByteVar>())

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeTimingFunction(htheme.toLong(), itimingfunctionid, ptimingfunction?.value?.toCPointer<ByteVar>(), cbsize, pcbsizeout?.value?.toCPointer<ByteVar>())

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getThemeTransitionDuration(htheme.toLong(), ipartid, istateidfrom, istateidto, ipropid, pdwduration?.value?.toCPointer<ByteVar>())

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: COpaquePointer?, config: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getWindowFeedbackSetting(hwnd?.value?.toCPointer<ByteVar>(), feedback, dwflags, psize?.value?.toCPointer<ByteVar>(), config?.value?.toCPointer<ByteVar>())

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_getWindowTheme(hwnd?.value?.toCPointer<ByteVar>())

public actual fun himagelistQueryInterface(himl: Himagelist, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_himagelistQueryInterface(himl.toLong(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: COpaquePointer?, hrgn: Hrgn, pttest: Point, pwhittestcode: COpaquePointer?): Hresult =
    0

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListAdd(himl.toLong(), hbmimage?.value?.toCPointer<ByteVar>(), hbmmask?.value?.toCPointer<ByteVar>())

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListAddMasked(himl.toLong(), hbmimage?.value?.toCPointer<ByteVar>(), crmask)

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListBeginDrag(himltrack.toLong(), itrack, dxhotspot, dyhotspot)

public actual fun imageListCoCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListCoCreateInstance(rclsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListCopy(himldst.toLong(), idst, himlsrc.toLong(), isrc, uflags)

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListCreate(cx, cy, flags, cinitial, cgrow)

public actual fun imageListDestroy(himl: Himagelist): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDestroy(himl.toLong())

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDragEnter(hwndlock?.value?.toCPointer<ByteVar>(), x, y)

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDragLeave(hwndlock?.value?.toCPointer<ByteVar>())

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDragMove(x, y)

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDragShowNolock(fshow)

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDraw(himl.toLong(), i, hdcdst?.value?.toCPointer<ByteVar>(), x, y, fstyle)

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDrawEx(himl.toLong(), i, hdcdst?.value?.toCPointer<ByteVar>(), x, y, dx, dy, rgbbk, rgbfg, fstyle)

public actual fun imageListDrawIndirect(pimldp: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDrawIndirect(pimldp?.value?.toCPointer<ByteVar>())

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListDuplicate(himl.toLong())

public actual fun imageListEndDrag() {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListEndDrag()
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListGetBkColor(himl.toLong())

public actual fun imageListGetDragImage(ppt: COpaquePointer?, ppthotspot: COpaquePointer?): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListGetDragImage(ppt?.value?.toCPointer<ByteVar>(), ppthotspot?.value?.toCPointer<ByteVar>())

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListGetIcon(himl.toLong(), i, flags)?.let { COpaquePointer(it.toLong()) }

public actual fun imageListGetIconSize(himl: Himagelist, cx: COpaquePointer?, cy: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListGetIconSize(himl.toLong(), cx?.value?.toCPointer<ByteVar>(), cy?.value?.toCPointer<ByteVar>())

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListGetImageCount(himl.toLong())

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListGetImageInfo(himl.toLong(), i, pimageinfo?.value?.toCPointer<ByteVar>())

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListLoadImageA(hi?.value?.toCPointer<ByteVar>(), lpbmp?.value?.toCPointer<ByteVar>(), cx, cgrow, crmask, utype, uflags)

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListLoadImageW(hi?.value?.toCPointer<ByteVar>(), lpbmp?.value?.toCPointer<ByteVar>(), cx, cgrow, crmask, utype, uflags)

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListMerge(himl1.toLong(), i1, himl2.toLong(), i2, dx, dy)

public actual fun imageListRead(pstm: COpaquePointer?): Himagelist =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListRead(pstm?.value?.toCPointer<ByteVar>())

public actual fun imageListReadEx(dwflags: UInt, pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListReadEx(dwflags, pstm?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListRemove(himl.toLong(), i)

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListReplace(himl.toLong(), i, hbmimage?.value?.toCPointer<ByteVar>(), hbmmask?.value?.toCPointer<ByteVar>())

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListReplaceIcon(himl.toLong(), i, hicon?.value?.toCPointer<ByteVar>())

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListSetBkColor(himl.toLong(), clrbk)

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListSetDragCursorImage(himldrag.toLong(), idrag, dxhotspot, dyhotspot)

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListSetIconSize(himl.toLong(), cx, cy)

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListSetImageCount(himl.toLong(), unewcount)

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListSetOverlayImage(himl.toLong(), iimage, ioverlay)

public actual fun imageListWrite(himl: Himagelist, pstm: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListWrite(himl.toLong(), pstm?.value?.toCPointer<ByteVar>())

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_imageListWriteEx(himl.toLong(), dwflags, pstm?.value?.toCPointer<ByteVar>())

public actual fun initCommonControls() {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_initCommonControls()
}

public actual fun initCommonControlsEx(picce: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_initCommonControlsEx(picce?.value?.toCPointer<ByteVar>())

public actual fun initMUILanguage(uilang: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_initMUILanguage(uilang)
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_initializeFlatSB(param0?.value?.toCPointer<ByteVar>())

public actual fun isAppThemed(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isAppThemed()

public actual fun isCharLowerW(ch: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isCharLowerW(ch)

public actual fun isCompositionActive(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isCompositionActive()

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isDlgButtonChecked(hdlg?.value?.toCPointer<ByteVar>(), nidbutton)

public actual fun isThemeActive(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isThemeActive()

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent(htheme.toLong(), ipartid, istateid)

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_isThemePartDefined(htheme.toLong(), ipartid, istateid)

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    0

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_loadIconMetric(hinst?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), lims, phico?.value?.toCPointer<ByteVar>())

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_loadIconWithScaleDown(hinst?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), cx, cy, phico?.value?.toCPointer<ByteVar>())

public actual fun makeDragList(hlb: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_makeDragList(hlb?.value?.toCPointer<ByteVar>())

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_menuHelp(umsg, wparam, lparam, hmainmenu?.value?.toCPointer<ByteVar>(), hinst?.value?.toCPointer<ByteVar>(), hwndstatus?.value?.toCPointer<ByteVar>(), lpwids?.value?.toCPointer<ByteVar>())
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_openThemeData(hwnd?.value?.toCPointer<ByteVar>(), pszclasslist?.value?.toCPointer<ByteVar>())

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_openThemeDataEx(hwnd?.value?.toCPointer<ByteVar>(), pszclasslist?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Lresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation(phittestinginput?.value?.toCPointer<ByteVar>(), pproximityeval?.value?.toCPointer<ByteVar>())

public actual fun propertySheetA(param0: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_propertySheetA(param0?.value?.toCPointer<ByteVar>())

public actual fun propertySheetW(param0: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_propertySheetW(param0?.value?.toCPointer<ByteVar>())

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications(window?.value?.toCPointer<ByteVar>(), notifyrange)

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow(hwnd?.value?.toCPointer<ByteVar>(), value)

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?, redraw: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setScrollInfo(hwnd?.value?.toCPointer<ByteVar>(), nbar, lpsi?.value?.toCPointer<ByteVar>(), redraw)

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setScrollPos(hwnd?.value?.toCPointer<ByteVar>(), nbar, npos, bredraw)

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setScrollRange(hwnd?.value?.toCPointer<ByteVar>(), nbar, nminpos, nmaxpos, bredraw)

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setThemeAppProperties(dwflags)
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setWindowFeedbackSetting(hwnd?.value?.toCPointer<ByteVar>(), feedback, dwflags, size, configuration?.value?.toCPointer<ByteVar>())

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setWindowTheme(hwnd?.value?.toCPointer<ByteVar>(), pszsubappname?.value?.toCPointer<ByteVar>(), pszsubidlist?.value?.toCPointer<ByteVar>())

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_setWindowThemeAttribute(hwnd?.value?.toCPointer<ByteVar>(), eattribute, pvattribute?.value?.toCPointer<ByteVar>(), cbattribute)

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_showHideMenuCtl(hwnd?.value?.toCPointer<ByteVar>(), uflags, lpinfo?.value?.toCPointer<ByteVar>())

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_showScrollBar(hwnd?.value?.toCPointer<ByteVar>(), wbar, bshow)

public actual fun strSetPtrW(ppsz: COpaquePointer?, psz: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_strSetPtrW(ppsz?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>())

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_taskDialog(hwndowner?.value?.toCPointer<ByteVar>(), hinstance?.value?.toCPointer<ByteVar>(), pszwindowtitle?.value?.toCPointer<ByteVar>(), pszmaininstruction?.value?.toCPointer<ByteVar>(), pszcontent?.value?.toCPointer<ByteVar>(), dwcommonbuttons, pszicon?.value?.toCPointer<ByteVar>(), pnbutton?.value?.toCPointer<ByteVar>())

public actual fun taskDialogIndirect(ptaskconfig: COpaquePointer?, pnbutton: COpaquePointer?, pnradiobutton: COpaquePointer?, pfverificationflagchecked: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_taskDialogIndirect(ptaskconfig?.value?.toCPointer<ByteVar>(), pnbutton?.value?.toCPointer<ByteVar>(), pnradiobutton?.value?.toCPointer<ByteVar>(), pfverificationflagchecked?.value?.toCPointer<ByteVar>())

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_uninitializeFlatSB(param0?.value?.toCPointer<ByteVar>())

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_updatePanningFeedback(hwnd?.value?.toCPointer<ByteVar>(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia)
