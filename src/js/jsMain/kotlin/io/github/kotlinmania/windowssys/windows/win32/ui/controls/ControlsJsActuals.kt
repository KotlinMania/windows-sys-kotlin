@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32UiControlsNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BeginBufferedAnimation(hwnd: HWND, hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BeginBufferedAnimation(hwnd.toString(), hdctarget.toString(), prctarget.toString(), dwformat, ppaintparams.toString(), panimationparams.toString(), phdcfrom.toString(), phdcto.toString()) as String).toLong() else 0L

public actual fun BeginBufferedPaint(hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BeginBufferedPaint(hdctarget.toString(), prctarget.toString(), dwformat, ppaintparams.toString(), phdc.toString()) as String).toLong() else 0L

public actual fun BeginPanningFeedback(hwnd: HWND): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BeginPanningFeedback(hwnd.toString()) as Int) else 0

public actual fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BufferedPaintClear(hbufferedpaint.toString(), prc.toString()) as Int) else 0

public actual fun BufferedPaintInit(): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BufferedPaintInit() as Int) else 0

public actual fun BufferedPaintRenderAnimation(hwnd: HWND, hdctarget: HDC): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation(hwnd.toString(), hdctarget.toString()) as Int) else 0

public actual fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha(hbufferedpaint.toString(), prc.toString(), alpha.toInt()) as Int) else 0

public actual fun BufferedPaintStopAllAnimations(hwnd: HWND): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations(hwnd.toString()) as Int) else 0

public actual fun BufferedPaintUnInit(): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_BufferedPaintUnInit() as Int) else 0

public actual fun CheckDlgButton(hdlg: HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CheckDlgButton(hdlg.toString(), nidbutton, ucheck.toInt()) as Int) else 0

public actual fun CheckRadioButton(hdlg: HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CheckRadioButton(hdlg.toString(), nidfirstbutton, nidlastbutton, nidcheckbutton) as Int) else 0

public actual fun CloseThemeData(htheme: HTHEME): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CloseThemeData(htheme.toString()) as Int) else 0

public actual fun CreateMappedBitmap(hinstance: HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): HBITMAP =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreateMappedBitmap(hinstance.toString(), idbitmap.toString(), wflags.toInt(), lpcolormap.toString(), inummaps) as String).toLong() else 0L

public actual fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreatePropertySheetPageA(constpropsheetpagepointer.toString()) as String).toLong() else 0L

public actual fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreatePropertySheetPageW(constpropsheetpagepointer.toString()) as String).toLong() else 0L

public actual fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: HWND, wid: UInt): HWND =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreateStatusWindowA(style, lpsztext.toString(), hwndparent.toString(), wid.toInt()) as String).toLong() else 0L

public actual fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: HWND, wid: UInt): HWND =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreateStatusWindowW(style, lpsztext.toString(), hwndparent.toString(), wid.toInt()) as String).toLong() else 0L

public actual fun CreateSyntheticPointerDevice(pointertype: POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice(pointertype, maxcount.toInt(), mode) as String).toLong() else 0L

public actual fun CreateToolbarEx(hwnd: HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): HWND =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreateToolbarEx(hwnd.toString(), ws.toInt(), wid.toInt(), nbitmaps, hbminst.toString(), wbmid.toString(), lpbuttons.toString(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt()) as String).toLong() else 0L

public actual fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: HWND, nid: Int, hinst: HINSTANCE, hbuddy: HWND, nupper: Int, nlower: Int, npos: Int): HWND =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_CreateUpDownControl(dwstyle.toInt(), x, y, cx, cy, hparent.toString(), nid, hinst.toString(), hbuddy.toString(), nupper, nlower, npos) as String).toLong() else 0L

public actual fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Clone(hdpa.toString(), hdpanew.toString()) as String).toLong() else 0L

public actual fun DPA_Create(citemgrow: Int): HDPA =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Create(citemgrow) as String).toLong() else 0L

public actual fun DPA_CreateEx(cpgrow: Int, hheap: HANDLE): HDPA =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_CreateEx(cpgrow, hheap.toString()) as String).toLong() else 0L

public actual fun DPA_DeleteAllPtrs(hdpa: HDPA): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs(hdpa.toString()) as Int) else 0

public actual fun DPA_DeletePtr(hdpa: HDPA, i: Int): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_DeletePtr(hdpa.toString(), i) as String).toLong() else 0L

public actual fun DPA_Destroy(hdpa: HDPA): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Destroy(hdpa.toString()) as Int) else 0

public actual fun DPA_DestroyCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_DestroyCallback(hdpa.toString(), pfncb.toLong().toString(), pdata.toString())
    }
}

public actual fun DPA_EnumCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_EnumCallback(hdpa.toString(), pfncb.toLong().toString(), pdata.toString())
    }
}

public actual fun DPA_GetPtr(hdpa: HDPA, i: Long): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_GetPtr(hdpa.toString(), i.toString()) as String).toLong() else 0L

public actual fun DPA_GetPtrIndex(hdpa: HDPA, p: Long): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_GetPtrIndex(hdpa.toString(), p.toString()) as Int) else 0

public actual fun DPA_GetSize(hdpa: HDPA): ULong =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_GetSize(hdpa.toString()) as String).toULong() else 0uL

public actual fun DPA_Grow(pdpa: HDPA, cp: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Grow(pdpa.toString(), cp) as Int) else 0

public actual fun DPA_InsertPtr(hdpa: HDPA, i: Int, p: Long): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_InsertPtr(hdpa.toString(), i, p.toString()) as Int) else 0

public actual fun DPA_LoadStream(phdpa: Long, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_LoadStream(phdpa.toString(), pfn.toLong().toString(), pstream.toString(), pvinstdata.toString()) as Int) else 0

public actual fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: LPARAM): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Merge(hdpadest.toString(), hdpasrc.toString(), dwflags.toInt(), pfncompare.toLong().toString(), pfnmerge.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_SaveStream(hdpa.toString(), pfn.toLong().toString(), pstream.toString(), pvinstdata.toString()) as Int) else 0

public actual fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: LPARAM, options: UInt): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Search(hdpa.toString(), pfind.toString(), istart, pfncompare.toLong().toString(), lparam.toString(), options.toInt()) as Int) else 0

public actual fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_SetPtr(hdpa.toString(), i, p.toString()) as Int) else 0

public actual fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DPA_Sort(hdpa.toString(), pfncompare.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun DSA_Clone(hdsa: HDSA): HDSA =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_Clone(hdsa.toString()) as String).toLong() else 0L

public actual fun DSA_Create(cbitem: Int, citemgrow: Int): HDSA =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_Create(cbitem, citemgrow) as String).toLong() else 0L

public actual fun DSA_DeleteAllItems(hdsa: HDSA): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_DeleteAllItems(hdsa.toString()) as Int) else 0

public actual fun DSA_DeleteItem(hdsa: HDSA, i: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_DeleteItem(hdsa.toString(), i) as Int) else 0

public actual fun DSA_Destroy(hdsa: HDSA): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_Destroy(hdsa.toString()) as Int) else 0

public actual fun DSA_DestroyCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_DestroyCallback(hdsa.toString(), pfncb.toLong().toString(), pdata.toString())
    }
}

public actual fun DSA_EnumCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_EnumCallback(hdsa.toString(), pfncb.toLong().toString(), pdata.toString())
    }
}

public actual fun DSA_GetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_GetItem(hdsa.toString(), i, pitem.toString()) as Int) else 0

public actual fun DSA_GetItemPtr(hdsa: HDSA, i: Int): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_GetItemPtr(hdsa.toString(), i) as String).toLong() else 0L

public actual fun DSA_GetSize(hdsa: HDSA): ULong =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_GetSize(hdsa.toString()) as String).toULong() else 0uL

public actual fun DSA_InsertItem(hdsa: HDSA, i: Int, pitem: Long): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_InsertItem(hdsa.toString(), i, pitem.toString()) as Int) else 0

public actual fun DSA_SetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_SetItem(hdsa.toString(), i, pitem.toString()) as Int) else 0

public actual fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DSA_Sort(pdsa.toString(), pfncompare.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DestroyPropertySheetPage(param0.toString()) as Int) else 0

public actual fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice(device.toString())
    }
}

public actual fun DlgDirListA(hdlg: HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirListA(hdlg.toString(), lppathspec.toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) as Int) else 0

public actual fun DlgDirListComboBoxA(hdlg: HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirListComboBoxA(hdlg.toString(), lppathspec.toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) as Int) else 0

public actual fun DlgDirListComboBoxW(hdlg: HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirListComboBoxW(hdlg.toString(), lppathspec.toString(), nidcombobox, nidstaticpath, ufiletype.toInt()) as Int) else 0

public actual fun DlgDirListW(hdlg: HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirListW(hdlg.toString(), lppathspec.toString(), nidlistbox, nidstaticpath, ufiletype.toInt()) as Int) else 0

public actual fun DlgDirSelectComboBoxExA(hwnddlg: HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA(hwnddlg.toString(), lpstring.toString(), cchout, idcombobox) as Int) else 0

public actual fun DlgDirSelectComboBoxExW(hwnddlg: HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW(hwnddlg.toString(), lpstring.toString(), cchout, idcombobox) as Int) else 0

public actual fun DlgDirSelectExA(hwnddlg: HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirSelectExA(hwnddlg.toString(), lpstring.toString(), chcount, idlistbox) as Int) else 0

public actual fun DlgDirSelectExW(hwnddlg: HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DlgDirSelectExW(hwnddlg.toString(), lpstring.toString(), chcount, idlistbox) as Int) else 0

public actual fun DrawInsert(handparent: HWND, hlb: HWND, nitem: Int) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawInsert(handparent.toString(), hlb.toString(), nitem)
    }
}

public actual fun DrawShadowText(hdc: HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: COLORREF, crshadow: COLORREF, ixoffset: Int, iyoffset: Int): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawShadowText(hdc.toString(), psztext.toString(), cch.toInt(), prc.toString(), dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset) as Int) else 0

public actual fun DrawStatusTextA(hdc: HDC, lprc: Long, psztext: PCSTR, uflags: UInt) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawStatusTextA(hdc.toString(), lprc.toString(), psztext.toString(), uflags.toInt())
    }
}

public actual fun DrawStatusTextW(hdc: HDC, lprc: Long, psztext: PCWSTR, uflags: UInt) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawStatusTextW(hdc.toString(), lprc.toString(), psztext.toString(), uflags.toInt())
    }
}

public actual fun DrawThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeBackground(htheme.toString(), hdc.toString(), ipartid, istateid, prect.toString(), pcliprect.toString()) as Int) else 0

public actual fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx(htheme.toString(), hdc.toString(), ipartid, istateid, prect.toString(), poptions.toString()) as Int) else 0

public actual fun DrawThemeEdge(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: DRAWEDGE_FLAGS, uflags: DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeEdge(htheme.toString(), hdc.toString(), ipartid, istateid, pdestrect.toString(), uedge.toInt(), uflags.toInt(), pcontentrect.toString()) as Int) else 0

public actual fun DrawThemeIcon(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeIcon(htheme.toString(), hdc.toString(), ipartid, istateid, prect.toString(), himl.toString(), iimageindex) as Int) else 0

public actual fun DrawThemeParentBackground(hwnd: HWND, hdc: HDC, prc: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeParentBackground(hwnd.toString(), hdc.toString(), prc.toString()) as Int) else 0

public actual fun DrawThemeParentBackgroundEx(hwnd: HWND, hdc: HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx(hwnd.toString(), hdc.toString(), dwflags.toInt(), prc.toString()) as Int) else 0

public actual fun DrawThemeText(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeText(htheme.toString(), hdc.toString(), ipartid, istateid, psztext.toString(), cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), prect.toString()) as Int) else 0

public actual fun DrawThemeTextEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_DrawThemeTextEx(htheme.toString(), hdc.toString(), ipartid, istateid, psztext.toString(), cchtext, dwtextflags.toInt(), prect.toString(), poptions.toString()) as Int) else 0

public actual fun EnableScrollBar(hwnd: HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EnableScrollBar(hwnd.toString(), wsbflags.toInt(), warrows.toInt()) as Int) else 0

public actual fun EnableThemeDialogTexture(hwnd: HWND, dwflags: UInt): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EnableThemeDialogTexture(hwnd.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnableTheming(fenable: BOOL): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EnableTheming(fenable) as Int) else 0

public actual fun EndBufferedAnimation(hbpanimation: Long, fupdatetarget: BOOL): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EndBufferedAnimation(hbpanimation.toString(), fupdatetarget) as Int) else 0

public actual fun EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: BOOL): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EndBufferedPaint(hbufferedpaint.toString(), fupdatetarget) as Int) else 0

public actual fun EndPanningFeedback(hwnd: HWND, fanimateback: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EndPanningFeedback(hwnd.toString(), fanimateback) as Int) else 0

public actual fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon(numvertices.toInt(), controlpolygon.toString(), phittestinginput.toString(), pproximityeval.toString()) as Int) else 0

public actual fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_EvaluateProximityToRect(controlboundingbox.toString(), phittestinginput.toString(), pproximityeval.toString()) as Int) else 0

public actual fun FlatSB_EnableScrollBar(param0: HWND, param1: Int, param2: UInt): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar(param0.toString(), param1, param2.toInt()) as Int) else 0

public actual fun FlatSB_GetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo(param0.toString(), code, param2.toString()) as Int) else 0

public actual fun FlatSB_GetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos(param0.toString(), code) as Int) else 0

public actual fun FlatSB_GetScrollProp(param0: HWND, propindex: WSB_PROP, param2: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp(param0.toString(), propindex, param2.toString()) as Int) else 0

public actual fun FlatSB_GetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange(param0.toString(), code, param2.toString(), param3.toString()) as Int) else 0

public actual fun FlatSB_SetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo(param0.toString(), code, psi.toString(), fredraw) as Int) else 0

public actual fun FlatSB_SetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos(param0.toString(), code, pos, fredraw) as Int) else 0

public actual fun FlatSB_SetScrollProp(param0: HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp(param0.toString(), index.toInt(), newvalue.toString(), param3) as Int) else 0

public actual fun FlatSB_SetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange(param0.toString(), code, min, max, fredraw) as Int) else 0

public actual fun FlatSB_ShowScrollBar(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar(param0.toString(), code, param2) as Int) else 0

public actual fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetBufferedPaintBits(hbufferedpaint.toString(), ppbbuffer.toString(), pcxrow.toString()) as Int) else 0

public actual fun GetBufferedPaintDC(hbufferedpaint: Long): HDC =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetBufferedPaintDC(hbufferedpaint.toString()) as String).toLong() else 0L

public actual fun GetBufferedPaintTargetDC(hbufferedpaint: Long): HDC =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC(hbufferedpaint.toString()) as String).toLong() else 0L

public actual fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect(hbufferedpaint.toString(), prc.toString()) as Int) else 0

public actual fun GetComboBoxInfo(hwndcombo: HWND, pcbi: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetComboBoxInfo(hwndcombo.toString(), pcbi.toString()) as Int) else 0

public actual fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetCurrentThemeName(pszthemefilename.toString(), cchmaxnamechars, pszcolorbuff.toString(), cchmaxcolorchars, pszsizebuff.toString(), cchmaxsizechars) as Int) else 0

public actual fun GetEffectiveClientRect(hwnd: HWND, lprc: Long, lpinfo: Long) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetEffectiveClientRect(hwnd.toString(), lprc.toString(), lpinfo.toString())
    }
}

public actual fun GetListBoxInfo(hwnd: HWND): UInt =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetListBoxInfo(hwnd.toString()) as Int).toUInt() else 0u

public actual fun GetMUILanguage(): UShort =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetMUILanguage() as Int).toUShort() else 0u

public actual fun GetThemeAnimationProperty(htheme: HTHEME, istoryboardid: Int, itargetid: Int, eproperty: TA_PROPERTY, pvproperty: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeAnimationProperty(htheme.toString(), istoryboardid, itargetid, eproperty, pvproperty.toString(), cbsize.toInt(), pcbsizeout.toString()) as Int) else 0

public actual fun GetThemeAnimationTransform(htheme: HTHEME, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeAnimationTransform(htheme.toString(), istoryboardid, itargetid, dwtransformindex.toInt(), ptransform.toString(), cbsize.toInt(), pcbsizeout.toString()) as Int) else 0

public actual fun GetThemeAppProperties(): SET_THEME_APP_PROPERTIES_FLAGS =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeAppProperties() as Int).toUInt() else 0u

public actual fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect(htheme.toString(), hdc.toString(), ipartid, istateid, pboundingrect.toString(), pcontentrect.toString()) as Int) else 0

public actual fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent(htheme.toString(), hdc.toString(), ipartid, istateid, pcontentrect.toString(), pextentrect.toString()) as Int) else 0

public actual fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion(htheme.toString(), hdc.toString(), ipartid, istateid, prect.toString(), pregion.toString()) as Int) else 0

public actual fun GetThemeBitmap(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GET_THEME_BITMAP_FLAGS, phbitmap: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeBitmap(htheme.toString(), ipartid, istateid, ipropid, dwflags.toInt(), phbitmap.toString()) as Int) else 0

public actual fun GetThemeBool(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeBool(htheme.toString(), ipartid, istateid, ipropid, pfval.toString()) as Int) else 0

public actual fun GetThemeColor(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeColor(htheme.toString(), ipartid, istateid, ipropid, pcolor.toString()) as Int) else 0

public actual fun GetThemeDocumentationProperty(pszthemename: PCWSTR, pszpropertyname: PCWSTR, pszvaluebuff: PWSTR, cchmaxvalchars: Int): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty(pszthemename.toString(), pszpropertyname.toString(), pszvaluebuff.toString(), cchmaxvalchars) as Int) else 0

public actual fun GetThemeEnumValue(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeEnumValue(htheme.toString(), ipartid, istateid, ipropid, pival.toString()) as Int) else 0

public actual fun GetThemeFilename(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: PWSTR, cchmaxbuffchars: Int): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeFilename(htheme.toString(), ipartid, istateid, ipropid, pszthemefilename.toString(), cchmaxbuffchars) as Int) else 0

public actual fun GetThemeFont(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeFont(htheme.toString(), hdc.toString(), ipartid, istateid, ipropid, pfont.toString()) as Int) else 0

public actual fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeInt(htheme.toString(), ipartid, istateid, ipropid, pival.toString()) as Int) else 0

public actual fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeIntList(htheme.toString(), ipartid, istateid, ipropid, pintlist.toString()) as Int) else 0

public actual fun GetThemeMargins(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeMargins(htheme.toString(), hdc.toString(), ipartid, istateid, ipropid, prc.toString(), pmargins.toString()) as Int) else 0

public actual fun GetThemeMetric(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeMetric(htheme.toString(), hdc.toString(), ipartid, istateid, ipropid, pival.toString()) as Int) else 0

public actual fun GetThemePartSize(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemePartSize(htheme.toString(), hdc.toString(), ipartid, istateid, prc.toString(), esize, psz.toString()) as Int) else 0

public actual fun GetThemePosition(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemePosition(htheme.toString(), ipartid, istateid, ipropid, ppoint.toString()) as Int) else 0

public actual fun GetThemePropertyOrigin(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemePropertyOrigin(htheme.toString(), ipartid, istateid, ipropid, porigin.toString()) as Int) else 0

public actual fun GetThemeRect(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeRect(htheme.toString(), ipartid, istateid, ipropid, prect.toString()) as Int) else 0

public actual fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: HINSTANCE): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeStream(htheme.toString(), ipartid, istateid, ipropid, ppvstream.toString(), pcbstream.toString(), hinst.toString()) as Int) else 0

public actual fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeString(htheme.toString(), ipartid, istateid, ipropid, pszbuff.toString(), cchmaxbuffchars) as Int) else 0

public actual fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysBool(htheme.toString(), iboolid) as Int) else 0

public actual fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): COLORREF =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysColor(htheme.toString(), icolorid) as Int).toUInt() else 0u

public actual fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): HBRUSH =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysColorBrush(htheme.toString(), icolorid) as String).toLong() else 0L

public actual fun GetThemeSysFont(htheme: HTHEME, ifontid: Int, plf: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysFont(htheme.toString(), ifontid, plf.toString()) as Int) else 0

public actual fun GetThemeSysInt(htheme: HTHEME, iintid: Int, pivalue: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysInt(htheme.toString(), iintid, pivalue.toString()) as Int) else 0

public actual fun GetThemeSysSize(htheme: HTHEME, isizeid: Int): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysSize(htheme.toString(), isizeid) as Int) else 0

public actual fun GetThemeSysString(htheme: HTHEME, istringid: Int, pszstringbuff: PWSTR, cchmaxstringchars: Int): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeSysString(htheme.toString(), istringid, pszstringbuff.toString(), cchmaxstringchars) as Int) else 0

public actual fun GetThemeTextExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeTextExtent(htheme.toString(), hdc.toString(), ipartid, istateid, psztext.toString(), cchcharcount, dwtextflags.toInt(), pboundingrect.toString(), pextentrect.toString()) as Int) else 0

public actual fun GetThemeTextMetrics(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeTextMetrics(htheme.toString(), hdc.toString(), ipartid, istateid, ptm.toString()) as Int) else 0

public actual fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeTimingFunction(htheme.toString(), itimingfunctionid, ptimingfunction.toString(), cbsize.toInt(), pcbsizeout.toString()) as Int) else 0

public actual fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetThemeTransitionDuration(htheme.toString(), ipartid, istateidfrom, istateidto, ipropid, pdwduration.toString()) as Int) else 0

public actual fun GetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting(hwnd.toString(), feedback, dwflags.toInt(), psize.toString(), config.toString()) as Int) else 0

public actual fun GetWindowTheme(hwnd: HWND): HTHEME =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_GetWindowTheme(hwnd.toString()) as String).toLong() else 0L

public actual fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface(himl.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun HitTestThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: HRGN, pttest: POINT, pwhittestcode: Long): HRESULT =
    0

public actual fun ImageList_Add(himl: HIMAGELIST, hbmimage: HBITMAP, hbmmask: HBITMAP): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Add(himl.toString(), hbmimage.toString(), hbmmask.toString()) as Int) else 0

public actual fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: HBITMAP, crmask: COLORREF): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_AddMasked(himl.toString(), hbmimage.toString(), crmask.toInt()) as Int) else 0

public actual fun ImageList_BeginDrag(himltrack: HIMAGELIST, itrack: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_BeginDrag(himltrack.toString(), itrack, dxhotspot, dyhotspot) as Int) else 0

public actual fun ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance(rclsid.toString(), punkouter.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun ImageList_Copy(himldst: HIMAGELIST, idst: Int, himlsrc: HIMAGELIST, isrc: Int, uflags: IMAGE_LIST_COPY_FLAGS): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Copy(himldst.toString(), idst, himlsrc.toString(), isrc, uflags.toInt()) as Int) else 0

public actual fun ImageList_Create(cx: Int, cy: Int, flags: IMAGELIST_CREATION_FLAGS, cinitial: Int, cgrow: Int): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Create(cx, cy, flags.toInt(), cinitial, cgrow) as String).toLong() else 0L

public actual fun ImageList_Destroy(himl: HIMAGELIST): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Destroy(himl.toString()) as Int) else 0

public actual fun ImageList_DragEnter(hwndlock: HWND, x: Int, y: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_DragEnter(hwndlock.toString(), x, y) as Int) else 0

public actual fun ImageList_DragLeave(hwndlock: HWND): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_DragLeave(hwndlock.toString()) as Int) else 0

public actual fun ImageList_DragMove(x: Int, y: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_DragMove(x, y) as Int) else 0

public actual fun ImageList_DragShowNolock(fshow: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_DragShowNolock(fshow) as Int) else 0

public actual fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Draw(himl.toString(), i, hdcdst.toString(), x, y, fstyle.toInt()) as Int) else 0

public actual fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: COLORREF, rgbfg: COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_DrawEx(himl.toString(), i, hdcdst.toString(), x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt()) as Int) else 0

public actual fun ImageList_DrawIndirect(pimldp: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_DrawIndirect(pimldp.toString()) as Int) else 0

public actual fun ImageList_Duplicate(himl: HIMAGELIST): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Duplicate(himl.toString()) as String).toLong() else 0L

public actual fun ImageList_EndDrag() {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_EndDrag()
    }
}

public actual fun ImageList_GetBkColor(himl: HIMAGELIST): COLORREF =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_GetBkColor(himl.toString()) as Int).toUInt() else 0u

public actual fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_GetDragImage(ppt.toString(), ppthotspot.toString()) as String).toLong() else 0L

public actual fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): HICON =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_GetIcon(himl.toString(), i, flags.toInt()) as String).toLong() else 0L

public actual fun ImageList_GetIconSize(himl: HIMAGELIST, cx: Long, cy: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_GetIconSize(himl.toString(), cx.toString(), cy.toString()) as Int) else 0

public actual fun ImageList_GetImageCount(himl: HIMAGELIST): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_GetImageCount(himl.toString()) as Int) else 0

public actual fun ImageList_GetImageInfo(himl: HIMAGELIST, i: Int, pimageinfo: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_GetImageInfo(himl.toString(), i, pimageinfo.toString()) as Int) else 0

public actual fun ImageList_LoadImageA(hi: HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_LoadImageA(hi.toString(), lpbmp.toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()) as String).toLong() else 0L

public actual fun ImageList_LoadImageW(hi: HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_LoadImageW(hi.toString(), lpbmp.toString(), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt()) as String).toLong() else 0L

public actual fun ImageList_Merge(himl1: HIMAGELIST, i1: Int, himl2: HIMAGELIST, i2: Int, dx: Int, dy: Int): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Merge(himl1.toString(), i1, himl2.toString(), i2, dx, dy) as String).toLong() else 0L

public actual fun ImageList_Read(pstm: Long): HIMAGELIST =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Read(pstm.toString()) as String).toLong() else 0L

public actual fun ImageList_ReadEx(dwflags: UInt, pstm: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_ReadEx(dwflags.toInt(), pstm.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun ImageList_Remove(himl: HIMAGELIST, i: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Remove(himl.toString(), i) as Int) else 0

public actual fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: HBITMAP, hbmmask: HBITMAP): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Replace(himl.toString(), i, hbmimage.toString(), hbmmask.toString()) as Int) else 0

public actual fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: HICON): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon(himl.toString(), i, hicon.toString()) as Int) else 0

public actual fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: COLORREF): COLORREF =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_SetBkColor(himl.toString(), clrbk.toInt()) as Int).toUInt() else 0u

public actual fun ImageList_SetDragCursorImage(himldrag: HIMAGELIST, idrag: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage(himldrag.toString(), idrag, dxhotspot, dyhotspot) as Int) else 0

public actual fun ImageList_SetIconSize(himl: HIMAGELIST, cx: Int, cy: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_SetIconSize(himl.toString(), cx, cy) as Int) else 0

public actual fun ImageList_SetImageCount(himl: HIMAGELIST, unewcount: UInt): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_SetImageCount(himl.toString(), unewcount.toInt()) as Int) else 0

public actual fun ImageList_SetOverlayImage(himl: HIMAGELIST, iimage: Int, ioverlay: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage(himl.toString(), iimage, ioverlay) as Int) else 0

public actual fun ImageList_Write(himl: HIMAGELIST, pstm: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_Write(himl.toString(), pstm.toString()) as Int) else 0

public actual fun ImageList_WriteEx(himl: HIMAGELIST, dwflags: IMAGE_LIST_WRITE_STREAM_FLAGS, pstm: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ImageList_WriteEx(himl.toString(), dwflags.toInt(), pstm.toString()) as Int) else 0

public actual fun InitCommonControls() {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_InitCommonControls()
    }
}

public actual fun InitCommonControlsEx(picce: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_InitCommonControlsEx(picce.toString()) as Int) else 0

public actual fun InitMUILanguage(uilang: UShort) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_InitMUILanguage(uilang.toInt())
    }
}

public actual fun InitializeFlatSB(param0: HWND): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_InitializeFlatSB(param0.toString()) as Int) else 0

public actual fun IsAppThemed(): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsAppThemed() as Int) else 0

public actual fun IsCharLowerW(ch: UShort): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsCharLowerW(ch.toInt()) as Int) else 0

public actual fun IsCompositionActive(): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsCompositionActive() as Int) else 0

public actual fun IsDlgButtonChecked(hdlg: HWND, nidbutton: Int): UInt =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsDlgButtonChecked(hdlg.toString(), nidbutton) as Int).toUInt() else 0u

public actual fun IsThemeActive(): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsThemeActive() as Int) else 0

public actual fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent(htheme.toString(), ipartid, istateid) as Int) else 0

public actual fun IsThemeDialogTextureEnabled(hwnd: HWND): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled(hwnd.toString()) as Int) else 0

public actual fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_IsThemePartDefined(htheme.toString(), ipartid, istateid) as Int) else 0

public actual fun LBItemFromPt(hlb: HWND, pt: POINT, bautoscroll: BOOL): Int =
    0

public actual fun LoadIconMetric(hinst: HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_LoadIconMetric(hinst.toString(), pszname.toString(), lims, phico.toString()) as Int) else 0

public actual fun LoadIconWithScaleDown(hinst: HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_LoadIconWithScaleDown(hinst.toString(), pszname.toString(), cx, cy, phico.toString()) as Int) else 0

public actual fun MakeDragList(hlb: HWND): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_MakeDragList(hlb.toString()) as Int) else 0

public actual fun MenuHelp(umsg: UInt, wparam: WPARAM, lparam: LPARAM, hmainmenu: HMENU, hinst: HINSTANCE, hwndstatus: HWND, lpwids: Long) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_MenuHelp(umsg.toInt(), wparam.toString(), lparam.toString(), hmainmenu.toString(), hinst.toString(), hwndstatus.toString(), lpwids.toString())
    }
}

public actual fun OpenThemeData(hwnd: HWND, pszclasslist: PCWSTR): HTHEME =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_OpenThemeData(hwnd.toString(), pszclasslist.toString()) as String).toLong() else 0L

public actual fun OpenThemeDataEx(hwnd: HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_OpenThemeDataEx(hwnd.toString(), pszclasslist.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): LRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation(phittestinginput.toString(), pproximityeval.toString()) as String).toLong() else 0L

public actual fun PropertySheetA(param0: Long): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_PropertySheetA(param0.toString()) as String).toLong() else 0L

public actual fun PropertySheetW(param0: Long): Long =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_PropertySheetW(param0.toString()) as String).toLong() else 0L

public actual fun RegisterPointerDeviceNotifications(window: HWND, notifyrange: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications(window.toString(), notifyrange) as Int) else 0

public actual fun RegisterTouchHitTestingWindow(hwnd: HWND, value: UInt): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow(hwnd.toString(), value.toInt()) as Int) else 0

public actual fun SetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetScrollInfo(hwnd.toString(), nbar, lpsi.toString(), redraw) as Int) else 0

public actual fun SetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetScrollPos(hwnd.toString(), nbar, npos, bredraw) as Int) else 0

public actual fun SetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetScrollRange(hwnd.toString(), nbar, nminpos, nmaxpos, bredraw) as Int) else 0

public actual fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS) {
    if (_windowsWin32UiControlsNapiAddon != null) {
        _windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetThemeAppProperties(dwflags.toInt())
    }
}

public actual fun SetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting(hwnd.toString(), feedback, dwflags.toInt(), size.toInt(), configuration.toString()) as Int) else 0

public actual fun SetWindowTheme(hwnd: HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetWindowTheme(hwnd.toString(), pszsubappname.toString(), pszsubidlist.toString()) as Int) else 0

public actual fun SetWindowThemeAttribute(hwnd: HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_SetWindowThemeAttribute(hwnd.toString(), eattribute, pvattribute.toString(), cbattribute.toInt()) as Int) else 0

public actual fun ShowHideMenuCtl(hwnd: HWND, uflags: ULong, lpinfo: Long): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ShowHideMenuCtl(hwnd.toString(), uflags.toString(), lpinfo.toString()) as Int) else 0

public actual fun ShowScrollBar(hwnd: HWND, wbar: SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_ShowScrollBar(hwnd.toString(), wbar, bshow) as Int) else 0

public actual fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_Str_SetPtrW(ppsz.toString(), psz.toString()) as Int) else 0

public actual fun TaskDialog(hwndowner: HWND, hinstance: HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_TaskDialog(hwndowner.toString(), hinstance.toString(), pszwindowtitle.toString(), pszmaininstruction.toString(), pszcontent.toString(), dwcommonbuttons, pszicon.toString(), pnbutton.toString()) as Int) else 0

public actual fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_TaskDialogIndirect(ptaskconfig.toString(), pnbutton.toString(), pnradiobutton.toString(), pfverificationflagchecked.toString()) as Int) else 0

public actual fun UninitializeFlatSB(param0: HWND): HRESULT =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_UninitializeFlatSB(param0.toString()) as Int) else 0

public actual fun UpdatePanningFeedback(hwnd: HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL =
    if (_windowsWin32UiControlsNapiAddon != null) (_windowsWin32UiControlsNapiAddon.windowssys_windows_win32_ui_controls_UpdatePanningFeedback(hwnd.toString(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia) as Int) else 0
