@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DRAWEDGE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DRAW_EDGE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DRAW_TEXT_FORMAT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBRUSH
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HMENU
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.IMAGE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.POINTER_INPUT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SCROLLBAR_CONSTANTS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BeginBufferedAnimation(hwnd: HWND, hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BeginBufferedAnimation(hwnd.toCPointer<ByteVar>(), hdctarget.toCPointer<ByteVar>(), prctarget.toCPointer<ByteVar>(), dwformat, ppaintparams.toCPointer<ByteVar>(), panimationparams.toCPointer<ByteVar>(), phdcfrom.toCPointer<ByteVar>(), phdcto.toCPointer<ByteVar>())

public actual fun BeginBufferedPaint(hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BeginBufferedPaint(hdctarget.toCPointer<ByteVar>(), prctarget.toCPointer<ByteVar>(), dwformat, ppaintparams.toCPointer<ByteVar>(), phdc.toCPointer<ByteVar>())

public actual fun BeginPanningFeedback(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BeginPanningFeedback(hwnd.toCPointer<ByteVar>())

public actual fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BufferedPaintClear(hbufferedpaint, prc.toCPointer<ByteVar>())

public actual fun BufferedPaintInit(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BufferedPaintInit()

public actual fun BufferedPaintRenderAnimation(hwnd: HWND, hdctarget: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation(hwnd.toCPointer<ByteVar>(), hdctarget.toCPointer<ByteVar>())

public actual fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha(hbufferedpaint, prc.toCPointer<ByteVar>(), alpha)

public actual fun BufferedPaintStopAllAnimations(hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations(hwnd.toCPointer<ByteVar>())

public actual fun BufferedPaintUnInit(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_BufferedPaintUnInit()

public actual fun CheckDlgButton(hdlg: HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CheckDlgButton(hdlg.toCPointer<ByteVar>(), nidbutton, ucheck)

public actual fun CheckRadioButton(hdlg: HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CheckRadioButton(hdlg.toCPointer<ByteVar>(), nidfirstbutton, nidlastbutton, nidcheckbutton)

public actual fun CloseThemeData(htheme: HTHEME): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CloseThemeData(htheme)

public actual fun CreateMappedBitmap(hinstance: HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreateMappedBitmap(hinstance.toCPointer<ByteVar>(), idbitmap, wflags, lpcolormap.toCPointer<ByteVar>(), inummaps)?.toLong() ?: 0L

public actual fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreatePropertySheetPageA(constpropsheetpagepointer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreatePropertySheetPageW(constpropsheetpagepointer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: HWND, wid: UInt): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreateStatusWindowA(style, lpsztext.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), wid)?.toLong() ?: 0L

public actual fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: HWND, wid: UInt): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreateStatusWindowW(style, lpsztext.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), wid)?.toLong() ?: 0L

public actual fun CreateSyntheticPointerDevice(pointertype: POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice(pointertype, maxcount, mode)?.toLong() ?: 0L

public actual fun CreateToolbarEx(hwnd: HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreateToolbarEx(hwnd.toCPointer<ByteVar>(), ws, wid, nbitmaps, hbminst.toCPointer<ByteVar>(), wbmid, lpbuttons.toCPointer<ByteVar>(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize)?.toLong() ?: 0L

public actual fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: HWND, nid: Int, hinst: HINSTANCE, hbuddy: HWND, nupper: Int, nlower: Int, npos: Int): HWND =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_CreateUpDownControl(dwstyle, x, y, cx, cy, hparent.toCPointer<ByteVar>(), nid, hinst.toCPointer<ByteVar>(), hbuddy.toCPointer<ByteVar>(), nupper, nlower, npos)?.toLong() ?: 0L

public actual fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Clone(hdpa, hdpanew)

public actual fun DPA_Create(citemgrow: Int): HDPA =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Create(citemgrow)

public actual fun DPA_CreateEx(cpgrow: Int, hheap: HANDLE): HDPA =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_CreateEx(cpgrow, hheap.toCPointer<ByteVar>())

public actual fun DPA_DeleteAllPtrs(hdpa: HDPA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs(hdpa)

public actual fun DPA_DeletePtr(hdpa: HDPA, i: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_DeletePtr(hdpa, i)?.toLong() ?: 0L

public actual fun DPA_Destroy(hdpa: HDPA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Destroy(hdpa)

public actual fun DPA_DestroyCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_DestroyCallback(hdpa, pfncb.toLong().toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>())
}

public actual fun DPA_EnumCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_EnumCallback(hdpa, pfncb.toLong().toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>())
}

public actual fun DPA_GetPtr(hdpa: HDPA, i: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_GetPtr(hdpa, i)?.toLong() ?: 0L

public actual fun DPA_GetPtrIndex(hdpa: HDPA, p: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_GetPtrIndex(hdpa, p.toCPointer<ByteVar>())

public actual fun DPA_GetSize(hdpa: HDPA): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_GetSize(hdpa)

public actual fun DPA_Grow(pdpa: HDPA, cp: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Grow(pdpa, cp)

public actual fun DPA_InsertPtr(hdpa: HDPA, i: Int, p: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_InsertPtr(hdpa, i, p.toCPointer<ByteVar>())

public actual fun DPA_LoadStream(phdpa: Long, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_LoadStream(phdpa.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>(), pstream.toCPointer<ByteVar>(), pvinstdata.toCPointer<ByteVar>())

public actual fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Merge(hdpadest, hdpasrc, dwflags, pfncompare.toLong().toCPointer<ByteVar>(), pfnmerge.toLong().toCPointer<ByteVar>(), lparam)

public actual fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_SaveStream(hdpa, pfn.toLong().toCPointer<ByteVar>(), pstream.toCPointer<ByteVar>(), pvinstdata.toCPointer<ByteVar>())

public actual fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: LPARAM, options: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Search(hdpa, pfind.toCPointer<ByteVar>(), istart, pfncompare.toLong().toCPointer<ByteVar>(), lparam, options)

public actual fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_SetPtr(hdpa, i, p.toCPointer<ByteVar>())

public actual fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DPA_Sort(hdpa, pfncompare.toLong().toCPointer<ByteVar>(), lparam)

public actual fun DSA_Clone(hdsa: HDSA): HDSA =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_Clone(hdsa)

public actual fun DSA_Create(cbitem: Int, citemgrow: Int): HDSA =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_Create(cbitem, citemgrow)

public actual fun DSA_DeleteAllItems(hdsa: HDSA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_DeleteAllItems(hdsa)

public actual fun DSA_DeleteItem(hdsa: HDSA, i: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_DeleteItem(hdsa, i)

public actual fun DSA_Destroy(hdsa: HDSA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_Destroy(hdsa)

public actual fun DSA_DestroyCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_DestroyCallback(hdsa, pfncb.toLong().toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>())
}

public actual fun DSA_EnumCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_EnumCallback(hdsa, pfncb.toLong().toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>())
}

public actual fun DSA_GetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_GetItem(hdsa, i, pitem.toCPointer<ByteVar>())

public actual fun DSA_GetItemPtr(hdsa: HDSA, i: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_GetItemPtr(hdsa, i)?.toLong() ?: 0L

public actual fun DSA_GetSize(hdsa: HDSA): ULong =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_GetSize(hdsa)

public actual fun DSA_InsertItem(hdsa: HDSA, i: Int, pitem: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_InsertItem(hdsa, i, pitem.toCPointer<ByteVar>())

public actual fun DSA_SetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_SetItem(hdsa, i, pitem.toCPointer<ByteVar>())

public actual fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DSA_Sort(pdsa, pfncompare.toLong().toCPointer<ByteVar>(), lparam)

public actual fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DestroyPropertySheetPage(param0.toCPointer<ByteVar>())

public actual fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice(device.toCPointer<ByteVar>())
}

public actual fun DlgDirListA(hdlg: HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirListA(hdlg.toCPointer<ByteVar>(), lppathspec.toCPointer<ByteVar>(), nidlistbox, nidstaticpath, ufiletype)

public actual fun DlgDirListComboBoxA(hdlg: HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirListComboBoxA(hdlg.toCPointer<ByteVar>(), lppathspec.toCPointer<ByteVar>(), nidcombobox, nidstaticpath, ufiletype)

public actual fun DlgDirListComboBoxW(hdlg: HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirListComboBoxW(hdlg.toCPointer<ByteVar>(), lppathspec.toCPointer<ByteVar>(), nidcombobox, nidstaticpath, ufiletype)

public actual fun DlgDirListW(hdlg: HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirListW(hdlg.toCPointer<ByteVar>(), lppathspec.toCPointer<ByteVar>(), nidlistbox, nidstaticpath, ufiletype)

public actual fun DlgDirSelectComboBoxExA(hwnddlg: HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA(hwnddlg.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), cchout, idcombobox)

public actual fun DlgDirSelectComboBoxExW(hwnddlg: HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW(hwnddlg.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), cchout, idcombobox)

public actual fun DlgDirSelectExA(hwnddlg: HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirSelectExA(hwnddlg.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), chcount, idlistbox)

public actual fun DlgDirSelectExW(hwnddlg: HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DlgDirSelectExW(hwnddlg.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), chcount, idlistbox)

public actual fun DrawInsert(handparent: HWND, hlb: HWND, nitem: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawInsert(handparent.toCPointer<ByteVar>(), hlb.toCPointer<ByteVar>(), nitem)
}

public actual fun DrawShadowText(hdc: HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: COLORREF, crshadow: COLORREF, ixoffset: Int, iyoffset: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawShadowText(hdc.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), cch, prc.toCPointer<ByteVar>(), dwflags, crtext, crshadow, ixoffset, iyoffset)

public actual fun DrawStatusTextA(hdc: HDC, lprc: Long, psztext: PCSTR, uflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawStatusTextA(hdc.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), uflags)
}

public actual fun DrawStatusTextW(hdc: HDC, lprc: Long, psztext: PCWSTR, uflags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawStatusTextW(hdc.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), psztext.toCPointer<ByteVar>(), uflags)
}

public actual fun DrawThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeBackground(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, prect.toCPointer<ByteVar>(), pcliprect.toCPointer<ByteVar>())

public actual fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, prect.toCPointer<ByteVar>(), poptions.toCPointer<ByteVar>())

public actual fun DrawThemeEdge(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: DRAWEDGE_FLAGS, uflags: DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeEdge(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, pdestrect.toCPointer<ByteVar>(), uedge, uflags, pcontentrect.toCPointer<ByteVar>())

public actual fun DrawThemeIcon(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeIcon(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, prect.toCPointer<ByteVar>(), himl, iimageindex)

public actual fun DrawThemeParentBackground(hwnd: HWND, hdc: HDC, prc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeParentBackground(hwnd.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>(), prc.toCPointer<ByteVar>())

public actual fun DrawThemeParentBackgroundEx(hwnd: HWND, hdc: HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx(hwnd.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>(), dwflags, prc.toCPointer<ByteVar>())

public actual fun DrawThemeText(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeText(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, psztext.toCPointer<ByteVar>(), cchtext, dwtextflags, dwtextflags2, prect.toCPointer<ByteVar>())

public actual fun DrawThemeTextEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_DrawThemeTextEx(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, psztext.toCPointer<ByteVar>(), cchtext, dwtextflags, prect.toCPointer<ByteVar>(), poptions.toCPointer<ByteVar>())

public actual fun EnableScrollBar(hwnd: HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EnableScrollBar(hwnd.toCPointer<ByteVar>(), wsbflags, warrows)

public actual fun EnableThemeDialogTexture(hwnd: HWND, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EnableThemeDialogTexture(hwnd.toCPointer<ByteVar>(), dwflags)

public actual fun EnableTheming(fenable: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EnableTheming(fenable)

public actual fun EndBufferedAnimation(hbpanimation: Long, fupdatetarget: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EndBufferedAnimation(hbpanimation, fupdatetarget)

public actual fun EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EndBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun EndPanningFeedback(hwnd: HWND, fanimateback: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EndPanningFeedback(hwnd.toCPointer<ByteVar>(), fanimateback)

public actual fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon(numvertices, controlpolygon.toCPointer<ByteVar>(), phittestinginput.toCPointer<ByteVar>(), pproximityeval.toCPointer<ByteVar>())

public actual fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_EvaluateProximityToRect(controlboundingbox.toCPointer<ByteVar>(), phittestinginput.toCPointer<ByteVar>(), pproximityeval.toCPointer<ByteVar>())

public actual fun FlatSB_EnableScrollBar(param0: HWND, param1: Int, param2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar(param0.toCPointer<ByteVar>(), param1, param2)

public actual fun FlatSB_GetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo(param0.toCPointer<ByteVar>(), code, param2.toCPointer<ByteVar>())

public actual fun FlatSB_GetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos(param0.toCPointer<ByteVar>(), code)

public actual fun FlatSB_GetScrollProp(param0: HWND, propindex: WSB_PROP, param2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp(param0.toCPointer<ByteVar>(), propindex, param2.toCPointer<ByteVar>())

public actual fun FlatSB_GetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange(param0.toCPointer<ByteVar>(), code, param2.toCPointer<ByteVar>(), param3.toCPointer<ByteVar>())

public actual fun FlatSB_SetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo(param0.toCPointer<ByteVar>(), code, psi.toCPointer<ByteVar>(), fredraw)

public actual fun FlatSB_SetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos(param0.toCPointer<ByteVar>(), code, pos, fredraw)

public actual fun FlatSB_SetScrollProp(param0: HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp(param0.toCPointer<ByteVar>(), index, newvalue, param3)

public actual fun FlatSB_SetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange(param0.toCPointer<ByteVar>(), code, min, max, fredraw)

public actual fun FlatSB_ShowScrollBar(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar(param0.toCPointer<ByteVar>(), code, param2)

public actual fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetBufferedPaintBits(hbufferedpaint, ppbbuffer.toCPointer<ByteVar>(), pcxrow.toCPointer<ByteVar>())

public actual fun GetBufferedPaintDC(hbufferedpaint: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetBufferedPaintDC(hbufferedpaint)?.toLong() ?: 0L

public actual fun GetBufferedPaintTargetDC(hbufferedpaint: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC(hbufferedpaint)?.toLong() ?: 0L

public actual fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect(hbufferedpaint, prc.toCPointer<ByteVar>())

public actual fun GetComboBoxInfo(hwndcombo: HWND, pcbi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetComboBoxInfo(hwndcombo.toCPointer<ByteVar>(), pcbi.toCPointer<ByteVar>())

public actual fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetCurrentThemeName(pszthemefilename.toCPointer<ByteVar>(), cchmaxnamechars, pszcolorbuff.toCPointer<ByteVar>(), cchmaxcolorchars, pszsizebuff.toCPointer<ByteVar>(), cchmaxsizechars)

public actual fun GetEffectiveClientRect(hwnd: HWND, lprc: Long, lpinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetEffectiveClientRect(hwnd.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())
}

public actual fun GetListBoxInfo(hwnd: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetListBoxInfo(hwnd.toCPointer<ByteVar>())

public actual fun GetMUILanguage(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetMUILanguage()

public actual fun GetThemeAnimationProperty(htheme: HTHEME, istoryboardid: Int, itargetid: Int, eproperty: TA_PROPERTY, pvproperty: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeAnimationProperty(htheme, istoryboardid, itargetid, eproperty, pvproperty.toCPointer<ByteVar>(), cbsize, pcbsizeout.toCPointer<ByteVar>())

public actual fun GetThemeAnimationTransform(htheme: HTHEME, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeAnimationTransform(htheme, istoryboardid, itargetid, dwtransformindex, ptransform.toCPointer<ByteVar>(), cbsize, pcbsizeout.toCPointer<ByteVar>())

public actual fun GetThemeAppProperties(): SET_THEME_APP_PROPERTIES_FLAGS =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeAppProperties()

public actual fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, pboundingrect.toCPointer<ByteVar>(), pcontentrect.toCPointer<ByteVar>())

public actual fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, pcontentrect.toCPointer<ByteVar>(), pextentrect.toCPointer<ByteVar>())

public actual fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, prect.toCPointer<ByteVar>(), pregion.toCPointer<ByteVar>())

public actual fun GetThemeBitmap(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GET_THEME_BITMAP_FLAGS, phbitmap: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeBitmap(htheme, ipartid, istateid, ipropid, dwflags, phbitmap.toCPointer<ByteVar>())

public actual fun GetThemeBool(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeBool(htheme, ipartid, istateid, ipropid, pfval.toCPointer<ByteVar>())

public actual fun GetThemeColor(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeColor(htheme, ipartid, istateid, ipropid, pcolor.toCPointer<ByteVar>())

public actual fun GetThemeDocumentationProperty(pszthemename: PCWSTR, pszpropertyname: PCWSTR, pszvaluebuff: PWSTR, cchmaxvalchars: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty(pszthemename.toCPointer<ByteVar>(), pszpropertyname.toCPointer<ByteVar>(), pszvaluebuff.toCPointer<ByteVar>(), cchmaxvalchars)

public actual fun GetThemeEnumValue(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeEnumValue(htheme, ipartid, istateid, ipropid, pival.toCPointer<ByteVar>())

public actual fun GetThemeFilename(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: PWSTR, cchmaxbuffchars: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeFilename(htheme, ipartid, istateid, ipropid, pszthemefilename.toCPointer<ByteVar>(), cchmaxbuffchars)

public actual fun GetThemeFont(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeFont(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, ipropid, pfont.toCPointer<ByteVar>())

public actual fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeInt(htheme, ipartid, istateid, ipropid, pival.toCPointer<ByteVar>())

public actual fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeIntList(htheme, ipartid, istateid, ipropid, pintlist.toCPointer<ByteVar>())

public actual fun GetThemeMargins(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeMargins(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, ipropid, prc.toCPointer<ByteVar>(), pmargins.toCPointer<ByteVar>())

public actual fun GetThemeMetric(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeMetric(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, ipropid, pival.toCPointer<ByteVar>())

public actual fun GetThemePartSize(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemePartSize(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, prc.toCPointer<ByteVar>(), esize, psz.toCPointer<ByteVar>())

public actual fun GetThemePosition(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemePosition(htheme, ipartid, istateid, ipropid, ppoint.toCPointer<ByteVar>())

public actual fun GetThemePropertyOrigin(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemePropertyOrigin(htheme, ipartid, istateid, ipropid, porigin.toCPointer<ByteVar>())

public actual fun GetThemeRect(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeRect(htheme, ipartid, istateid, ipropid, prect.toCPointer<ByteVar>())

public actual fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: HINSTANCE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeStream(htheme, ipartid, istateid, ipropid, ppvstream.toCPointer<ByteVar>(), pcbstream.toCPointer<ByteVar>(), hinst.toCPointer<ByteVar>())

public actual fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeString(htheme, ipartid, istateid, ipropid, pszbuff.toCPointer<ByteVar>(), cchmaxbuffchars)

public actual fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysBool(htheme, iboolid)

public actual fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysColor(htheme, icolorid)

public actual fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysColorBrush(htheme, icolorid)?.toLong() ?: 0L

public actual fun GetThemeSysFont(htheme: HTHEME, ifontid: Int, plf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysFont(htheme, ifontid, plf.toCPointer<ByteVar>())

public actual fun GetThemeSysInt(htheme: HTHEME, iintid: Int, pivalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysInt(htheme, iintid, pivalue.toCPointer<ByteVar>())

public actual fun GetThemeSysSize(htheme: HTHEME, isizeid: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysSize(htheme, isizeid)

public actual fun GetThemeSysString(htheme: HTHEME, istringid: Int, pszstringbuff: PWSTR, cchmaxstringchars: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeSysString(htheme, istringid, pszstringbuff.toCPointer<ByteVar>(), cchmaxstringchars)

public actual fun GetThemeTextExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeTextExtent(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, psztext.toCPointer<ByteVar>(), cchcharcount, dwtextflags, pboundingrect.toCPointer<ByteVar>(), pextentrect.toCPointer<ByteVar>())

public actual fun GetThemeTextMetrics(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeTextMetrics(htheme, hdc.toCPointer<ByteVar>(), ipartid, istateid, ptm.toCPointer<ByteVar>())

public actual fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeTimingFunction(htheme, itimingfunctionid, ptimingfunction.toCPointer<ByteVar>(), cbsize, pcbsizeout.toCPointer<ByteVar>())

public actual fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetThemeTransitionDuration(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration.toCPointer<ByteVar>())

public actual fun GetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting(hwnd.toCPointer<ByteVar>(), feedback, dwflags, psize.toCPointer<ByteVar>(), config.toCPointer<ByteVar>())

public actual fun GetWindowTheme(hwnd: HWND): HTHEME =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_GetWindowTheme(hwnd.toCPointer<ByteVar>())

public actual fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface(himl, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun HitTestThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: HRGN, pttest: POINT, pwhittestcode: Long): HRESULT =
    0

public actual fun ImageList_Add(himl: HIMAGELIST, hbmimage: HBITMAP, hbmmask: HBITMAP): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Add(himl, hbmimage.toCPointer<ByteVar>(), hbmmask.toCPointer<ByteVar>())

public actual fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: HBITMAP, crmask: COLORREF): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_AddMasked(himl, hbmimage.toCPointer<ByteVar>(), crmask)

public actual fun ImageList_BeginDrag(himltrack: HIMAGELIST, itrack: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_BeginDrag(himltrack, itrack, dxhotspot, dyhotspot)

public actual fun ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance(rclsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun ImageList_Copy(himldst: HIMAGELIST, idst: Int, himlsrc: HIMAGELIST, isrc: Int, uflags: IMAGE_LIST_COPY_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Copy(himldst, idst, himlsrc, isrc, uflags)

public actual fun ImageList_Create(cx: Int, cy: Int, flags: IMAGELIST_CREATION_FLAGS, cinitial: Int, cgrow: Int): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Create(cx, cy, flags, cinitial, cgrow)

public actual fun ImageList_Destroy(himl: HIMAGELIST): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Destroy(himl)

public actual fun ImageList_DragEnter(hwndlock: HWND, x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_DragEnter(hwndlock.toCPointer<ByteVar>(), x, y)

public actual fun ImageList_DragLeave(hwndlock: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_DragLeave(hwndlock.toCPointer<ByteVar>())

public actual fun ImageList_DragMove(x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_DragMove(x, y)

public actual fun ImageList_DragShowNolock(fshow: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_DragShowNolock(fshow)

public actual fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Draw(himl, i, hdcdst.toCPointer<ByteVar>(), x, y, fstyle)

public actual fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: COLORREF, rgbfg: COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_DrawEx(himl, i, hdcdst.toCPointer<ByteVar>(), x, y, dx, dy, rgbbk, rgbfg, fstyle)

public actual fun ImageList_DrawIndirect(pimldp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_DrawIndirect(pimldp.toCPointer<ByteVar>())

public actual fun ImageList_Duplicate(himl: HIMAGELIST): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Duplicate(himl)

public actual fun ImageList_EndDrag() {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_EndDrag()
}

public actual fun ImageList_GetBkColor(himl: HIMAGELIST): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_GetBkColor(himl)

public actual fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_GetDragImage(ppt.toCPointer<ByteVar>(), ppthotspot.toCPointer<ByteVar>())

public actual fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): HICON =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_GetIcon(himl, i, flags)?.toLong() ?: 0L

public actual fun ImageList_GetIconSize(himl: HIMAGELIST, cx: Long, cy: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_GetIconSize(himl, cx.toCPointer<ByteVar>(), cy.toCPointer<ByteVar>())

public actual fun ImageList_GetImageCount(himl: HIMAGELIST): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_GetImageCount(himl)

public actual fun ImageList_GetImageInfo(himl: HIMAGELIST, i: Int, pimageinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_GetImageInfo(himl, i, pimageinfo.toCPointer<ByteVar>())

public actual fun ImageList_LoadImageA(hi: HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_LoadImageA(hi.toCPointer<ByteVar>(), lpbmp.toCPointer<ByteVar>(), cx, cgrow, crmask, utype, uflags)

public actual fun ImageList_LoadImageW(hi: HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_LoadImageW(hi.toCPointer<ByteVar>(), lpbmp.toCPointer<ByteVar>(), cx, cgrow, crmask, utype, uflags)

public actual fun ImageList_Merge(himl1: HIMAGELIST, i1: Int, himl2: HIMAGELIST, i2: Int, dx: Int, dy: Int): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Merge(himl1, i1, himl2, i2, dx, dy)

public actual fun ImageList_Read(pstm: Long): HIMAGELIST =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Read(pstm.toCPointer<ByteVar>())

public actual fun ImageList_ReadEx(dwflags: UInt, pstm: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_ReadEx(dwflags, pstm.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun ImageList_Remove(himl: HIMAGELIST, i: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Remove(himl, i)

public actual fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: HBITMAP, hbmmask: HBITMAP): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Replace(himl, i, hbmimage.toCPointer<ByteVar>(), hbmmask.toCPointer<ByteVar>())

public actual fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: HICON): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon(himl, i, hicon.toCPointer<ByteVar>())

public actual fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_SetBkColor(himl, clrbk)

public actual fun ImageList_SetDragCursorImage(himldrag: HIMAGELIST, idrag: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage(himldrag, idrag, dxhotspot, dyhotspot)

public actual fun ImageList_SetIconSize(himl: HIMAGELIST, cx: Int, cy: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_SetIconSize(himl, cx, cy)

public actual fun ImageList_SetImageCount(himl: HIMAGELIST, unewcount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_SetImageCount(himl, unewcount)

public actual fun ImageList_SetOverlayImage(himl: HIMAGELIST, iimage: Int, ioverlay: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage(himl, iimage, ioverlay)

public actual fun ImageList_Write(himl: HIMAGELIST, pstm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_Write(himl, pstm.toCPointer<ByteVar>())

public actual fun ImageList_WriteEx(himl: HIMAGELIST, dwflags: IMAGE_LIST_WRITE_STREAM_FLAGS, pstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ImageList_WriteEx(himl, dwflags, pstm.toCPointer<ByteVar>())

public actual fun InitCommonControls() {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_InitCommonControls()
}

public actual fun InitCommonControlsEx(picce: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_InitCommonControlsEx(picce.toCPointer<ByteVar>())

public actual fun InitMUILanguage(uilang: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_InitMUILanguage(uilang)
}

public actual fun InitializeFlatSB(param0: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_InitializeFlatSB(param0.toCPointer<ByteVar>())

public actual fun IsAppThemed(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsAppThemed()

public actual fun IsCharLowerW(ch: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsCharLowerW(ch)

public actual fun IsCompositionActive(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsCompositionActive()

public actual fun IsDlgButtonChecked(hdlg: HWND, nidbutton: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsDlgButtonChecked(hdlg.toCPointer<ByteVar>(), nidbutton)

public actual fun IsThemeActive(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsThemeActive()

public actual fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent(htheme, ipartid, istateid)

public actual fun IsThemeDialogTextureEnabled(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled(hwnd.toCPointer<ByteVar>())

public actual fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_IsThemePartDefined(htheme, ipartid, istateid)

public actual fun LBItemFromPt(hlb: HWND, pt: POINT, bautoscroll: BOOL): Int =
    0

public actual fun LoadIconMetric(hinst: HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_LoadIconMetric(hinst.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), lims, phico.toCPointer<ByteVar>())

public actual fun LoadIconWithScaleDown(hinst: HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_LoadIconWithScaleDown(hinst.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), cx, cy, phico.toCPointer<ByteVar>())

public actual fun MakeDragList(hlb: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_MakeDragList(hlb.toCPointer<ByteVar>())

public actual fun MenuHelp(umsg: UInt, wparam: WPARAM, lparam: LPARAM, hmainmenu: HMENU, hinst: HINSTANCE, hwndstatus: HWND, lpwids: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_MenuHelp(umsg, wparam, lparam, hmainmenu.toCPointer<ByteVar>(), hinst.toCPointer<ByteVar>(), hwndstatus.toCPointer<ByteVar>(), lpwids.toCPointer<ByteVar>())
}

public actual fun OpenThemeData(hwnd: HWND, pszclasslist: PCWSTR): HTHEME =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_OpenThemeData(hwnd.toCPointer<ByteVar>(), pszclasslist.toCPointer<ByteVar>())

public actual fun OpenThemeDataEx(hwnd: HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_OpenThemeDataEx(hwnd.toCPointer<ByteVar>(), pszclasslist.toCPointer<ByteVar>(), dwflags)

public actual fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation(phittestinginput.toCPointer<ByteVar>(), pproximityeval.toCPointer<ByteVar>())

public actual fun PropertySheetA(param0: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_PropertySheetA(param0.toCPointer<ByteVar>())

public actual fun PropertySheetW(param0: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_PropertySheetW(param0.toCPointer<ByteVar>())

public actual fun RegisterPointerDeviceNotifications(window: HWND, notifyrange: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications(window.toCPointer<ByteVar>(), notifyrange)

public actual fun RegisterTouchHitTestingWindow(hwnd: HWND, value: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow(hwnd.toCPointer<ByteVar>(), value)

public actual fun SetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetScrollInfo(hwnd.toCPointer<ByteVar>(), nbar, lpsi.toCPointer<ByteVar>(), redraw)

public actual fun SetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetScrollPos(hwnd.toCPointer<ByteVar>(), nbar, npos, bredraw)

public actual fun SetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetScrollRange(hwnd.toCPointer<ByteVar>(), nbar, nminpos, nmaxpos, bredraw)

public actual fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS) {
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetThemeAppProperties(dwflags)
}

public actual fun SetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting(hwnd.toCPointer<ByteVar>(), feedback, dwflags, size, configuration.toCPointer<ByteVar>())

public actual fun SetWindowTheme(hwnd: HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetWindowTheme(hwnd.toCPointer<ByteVar>(), pszsubappname.toCPointer<ByteVar>(), pszsubidlist.toCPointer<ByteVar>())

public actual fun SetWindowThemeAttribute(hwnd: HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_SetWindowThemeAttribute(hwnd.toCPointer<ByteVar>(), eattribute, pvattribute.toCPointer<ByteVar>(), cbattribute)

public actual fun ShowHideMenuCtl(hwnd: HWND, uflags: ULong, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ShowHideMenuCtl(hwnd.toCPointer<ByteVar>(), uflags, lpinfo.toCPointer<ByteVar>())

public actual fun ShowScrollBar(hwnd: HWND, wbar: SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_ShowScrollBar(hwnd.toCPointer<ByteVar>(), wbar, bshow)

public actual fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_Str_SetPtrW(ppsz.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>())

public actual fun TaskDialog(hwndowner: HWND, hinstance: HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_TaskDialog(hwndowner.toCPointer<ByteVar>(), hinstance.toCPointer<ByteVar>(), pszwindowtitle.toCPointer<ByteVar>(), pszmaininstruction.toCPointer<ByteVar>(), pszcontent.toCPointer<ByteVar>(), dwcommonbuttons, pszicon.toCPointer<ByteVar>(), pnbutton.toCPointer<ByteVar>())

public actual fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_TaskDialogIndirect(ptaskconfig.toCPointer<ByteVar>(), pnbutton.toCPointer<ByteVar>(), pnradiobutton.toCPointer<ByteVar>(), pfverificationflagchecked.toCPointer<ByteVar>())

public actual fun UninitializeFlatSB(param0: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_UninitializeFlatSB(param0.toCPointer<ByteVar>())

public actual fun UpdatePanningFeedback(hwnd: HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssys_windows_win32_ui_controls_UpdatePanningFeedback(hwnd.toCPointer<ByteVar>(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia)
