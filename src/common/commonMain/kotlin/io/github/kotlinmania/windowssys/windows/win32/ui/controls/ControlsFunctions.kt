package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(p: Long, pdata: Long): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(pinfo: Long, pstream: Long, pvinstdata: Long): HRESULT
}

public fun interface FnCallback2 {
    public operator fun invoke(p1: Long, p2: Long, lparam: LPARAM): Int
}

public fun interface FnCallback3 {
    public operator fun invoke(umsg: DPAMM_MESSAGE, pvdest: Long, pvsrc: Long, lparam: LPARAM): Long
}

public fun BeginBufferedAnimation(hwnd: HWND, hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BeginBufferedAnimation", longArrayOf(hwnd, hdctarget, prctarget, dwformat.toLong(), ppaintparams, panimationparams, phdcfrom, phdcto))
}

public fun BeginBufferedPaint(hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BeginBufferedPaint", longArrayOf(hdctarget, prctarget, dwformat.toLong(), ppaintparams, phdc))
}

public fun BeginPanningFeedback(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BeginPanningFeedback", longArrayOf(hwnd)).toInt()
}

public fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintClear", longArrayOf(hbufferedpaint, prc)).toInt()
}

public fun BufferedPaintInit(): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintInit", longArrayOf()).toInt()
}

public fun BufferedPaintRenderAnimation(hwnd: HWND, hdctarget: HDC): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintRenderAnimation", longArrayOf(hwnd, hdctarget)).toInt()
}

public fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintSetAlpha", longArrayOf(hbufferedpaint, prc, alpha.toLong())).toInt()
}

public fun BufferedPaintStopAllAnimations(hwnd: HWND): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintStopAllAnimations", longArrayOf(hwnd)).toInt()
}

public fun BufferedPaintUnInit(): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintUnInit", longArrayOf()).toInt()
}

public fun CheckDlgButton(hdlg: HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CheckDlgButton", longArrayOf(hdlg, nidbutton.toLong(), ucheck.toLong())).toInt()
}

public fun CheckRadioButton(hdlg: HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CheckRadioButton", longArrayOf(hdlg, nidfirstbutton.toLong(), nidlastbutton.toLong(), nidcheckbutton.toLong())).toInt()
}

public fun CloseThemeData(htheme: HTHEME): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "CloseThemeData", longArrayOf(htheme)).toInt()
}

public fun CreateMappedBitmap(hinstance: HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): HBITMAP {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreateMappedBitmap", longArrayOf(hinstance, idbitmap, wflags.toLong(), lpcolormap, inummaps.toLong()))
}

public fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreatePropertySheetPageA", longArrayOf(constpropsheetpagepointer))
}

public fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreatePropertySheetPageW", longArrayOf(constpropsheetpagepointer))
}

public fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: HWND, wid: UInt): HWND {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreateStatusWindowA", longArrayOf(style.toLong(), lpsztext, hwndparent, wid.toLong()))
}

public fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: HWND, wid: UInt): HWND {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreateStatusWindowW", longArrayOf(style.toLong(), lpsztext, hwndparent, wid.toLong()))
}

public fun CreateSyntheticPointerDevice(pointertype: POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE {
    return Win32DynamicFfi.invoke("user32.dll", "CreateSyntheticPointerDevice", longArrayOf(pointertype.toLong(), maxcount.toLong(), mode.toLong()))
}

public fun CreateToolbarEx(hwnd: HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): HWND {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreateToolbarEx", longArrayOf(hwnd, ws.toLong(), wid.toLong(), nbitmaps.toLong(), hbminst, wbmid.toLong(), lpbuttons, inumbuttons.toLong(), dxbutton.toLong(), dybutton.toLong(), dxbitmap.toLong(), dybitmap.toLong(), ustructsize.toLong()))
}

public fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: HWND, nid: Int, hinst: HINSTANCE, hbuddy: HWND, nupper: Int, nlower: Int, npos: Int): HWND {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreateUpDownControl", longArrayOf(dwstyle.toLong(), x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), hparent, nid.toLong(), hinst, hbuddy, nupper.toLong(), nlower.toLong(), npos.toLong()))
}

public fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Clone", longArrayOf(hdpa, hdpanew))
}

public fun DPA_Create(citemgrow: Int): HDPA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Create", longArrayOf(citemgrow.toLong()))
}

public fun DPA_CreateEx(cpgrow: Int, hheap: HANDLE): HDPA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_CreateEx", longArrayOf(cpgrow.toLong(), hheap))
}

public fun DPA_DeleteAllPtrs(hdpa: HDPA): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_DeleteAllPtrs", longArrayOf(hdpa)).toInt()
}

public fun DPA_DeletePtr(hdpa: HDPA, i: Int): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_DeletePtr", longArrayOf(hdpa, i.toLong()))
}

public fun DPA_Destroy(hdpa: HDPA): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Destroy", longArrayOf(hdpa)).toInt()
}

public fun DPA_DestroyCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "DPA_DestroyCallback", longArrayOf(hdpa, Win32DynamicFfi.objectSlot(pfncb), pdata))
}

public fun DPA_EnumCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "DPA_EnumCallback", longArrayOf(hdpa, Win32DynamicFfi.objectSlot(pfncb), pdata))
}

public fun DPA_GetPtr(hdpa: HDPA, i: Long): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_GetPtr", longArrayOf(hdpa, i))
}

public fun DPA_GetPtrIndex(hdpa: HDPA, p: Long): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_GetPtrIndex", longArrayOf(hdpa, p)).toInt()
}

public fun DPA_GetSize(hdpa: HDPA): ULong {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_GetSize", longArrayOf(hdpa)).toULong()
}

public fun DPA_Grow(pdpa: HDPA, cp: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Grow", longArrayOf(pdpa, cp.toLong())).toInt()
}

public fun DPA_InsertPtr(hdpa: HDPA, i: Int, p: Long): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_InsertPtr", longArrayOf(hdpa, i.toLong(), p)).toInt()
}

public fun DPA_LoadStream(phdpa: Long, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_LoadStream", longArrayOf(phdpa, Win32DynamicFfi.objectSlot(pfn), pstream, pvinstdata)).toInt()
}

public fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: LPARAM): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Merge", longArrayOf(hdpadest, hdpasrc, dwflags.toLong(), Win32DynamicFfi.objectSlot(pfncompare), Win32DynamicFfi.objectSlot(pfnmerge), lparam)).toInt()
}

public fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_SaveStream", longArrayOf(hdpa, Win32DynamicFfi.objectSlot(pfn), pstream, pvinstdata)).toInt()
}

public fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: LPARAM, options: UInt): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Search", longArrayOf(hdpa, pfind, istart.toLong(), Win32DynamicFfi.objectSlot(pfncompare), lparam, options.toLong())).toInt()
}

public fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_SetPtr", longArrayOf(hdpa, i.toLong(), p)).toInt()
}

public fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Sort", longArrayOf(hdpa, Win32DynamicFfi.objectSlot(pfncompare), lparam)).toInt()
}

public fun DSA_Clone(hdsa: HDSA): HDSA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_Clone", longArrayOf(hdsa))
}

public fun DSA_Create(cbitem: Int, citemgrow: Int): HDSA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_Create", longArrayOf(cbitem.toLong(), citemgrow.toLong()))
}

public fun DSA_DeleteAllItems(hdsa: HDSA): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_DeleteAllItems", longArrayOf(hdsa)).toInt()
}

public fun DSA_DeleteItem(hdsa: HDSA, i: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_DeleteItem", longArrayOf(hdsa, i.toLong())).toInt()
}

public fun DSA_Destroy(hdsa: HDSA): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_Destroy", longArrayOf(hdsa)).toInt()
}

public fun DSA_DestroyCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "DSA_DestroyCallback", longArrayOf(hdsa, Win32DynamicFfi.objectSlot(pfncb), pdata))
}

public fun DSA_EnumCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "DSA_EnumCallback", longArrayOf(hdsa, Win32DynamicFfi.objectSlot(pfncb), pdata))
}

public fun DSA_GetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_GetItem", longArrayOf(hdsa, i.toLong(), pitem)).toInt()
}

public fun DSA_GetItemPtr(hdsa: HDSA, i: Int): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_GetItemPtr", longArrayOf(hdsa, i.toLong()))
}

public fun DSA_GetSize(hdsa: HDSA): ULong {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_GetSize", longArrayOf(hdsa)).toULong()
}

public fun DSA_InsertItem(hdsa: HDSA, i: Int, pitem: Long): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_InsertItem", longArrayOf(hdsa, i.toLong(), pitem)).toInt()
}

public fun DSA_SetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_SetItem", longArrayOf(hdsa, i.toLong(), pitem)).toInt()
}

public fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_Sort", longArrayOf(pdsa, Win32DynamicFfi.objectSlot(pfncompare), lparam)).toInt()
}

public fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DestroyPropertySheetPage", longArrayOf(param0)).toInt()
}

public fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE) {
    Win32DynamicFfi.invoke("user32.dll", "DestroySyntheticPointerDevice", longArrayOf(device))
}

public fun DlgDirListA(hdlg: HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListA", longArrayOf(hdlg, lppathspec, nidlistbox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirListComboBoxA(hdlg: HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListComboBoxA", longArrayOf(hdlg, lppathspec, nidcombobox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirListComboBoxW(hdlg: HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListComboBoxW", longArrayOf(hdlg, lppathspec, nidcombobox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirListW(hdlg: HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListW", longArrayOf(hdlg, lppathspec, nidlistbox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirSelectComboBoxExA(hwnddlg: HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectComboBoxExA", longArrayOf(hwnddlg, lpstring, cchout.toLong(), idcombobox.toLong())).toInt()
}

public fun DlgDirSelectComboBoxExW(hwnddlg: HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectComboBoxExW", longArrayOf(hwnddlg, lpstring, cchout.toLong(), idcombobox.toLong())).toInt()
}

public fun DlgDirSelectExA(hwnddlg: HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectExA", longArrayOf(hwnddlg, lpstring, chcount.toLong(), idlistbox.toLong())).toInt()
}

public fun DlgDirSelectExW(hwnddlg: HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectExW", longArrayOf(hwnddlg, lpstring, chcount.toLong(), idlistbox.toLong())).toInt()
}

public fun DrawInsert(handparent: HWND, hlb: HWND, nitem: Int) {
    Win32DynamicFfi.invoke("comctl32.dll", "DrawInsert", longArrayOf(handparent, hlb, nitem.toLong()))
}

public fun DrawShadowText(hdc: HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: COLORREF, crshadow: COLORREF, ixoffset: Int, iyoffset: Int): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DrawShadowText", longArrayOf(hdc, psztext, cch.toLong(), prc, dwflags.toLong(), crtext.toLong(), crshadow.toLong(), ixoffset.toLong(), iyoffset.toLong())).toInt()
}

public fun DrawStatusTextA(hdc: HDC, lprc: Long, psztext: PCSTR, uflags: UInt) {
    Win32DynamicFfi.invoke("comctl32.dll", "DrawStatusTextA", longArrayOf(hdc, lprc, psztext, uflags.toLong()))
}

public fun DrawStatusTextW(hdc: HDC, lprc: Long, psztext: PCWSTR, uflags: UInt) {
    Win32DynamicFfi.invoke("comctl32.dll", "DrawStatusTextW", longArrayOf(hdc, lprc, psztext, uflags.toLong()))
}

public fun DrawThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeBackground", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), prect, pcliprect)).toInt()
}

public fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeBackgroundEx", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), prect, poptions)).toInt()
}

public fun DrawThemeEdge(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: DRAWEDGE_FLAGS, uflags: DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeEdge", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), pdestrect, uedge.toLong(), uflags.toLong(), pcontentrect)).toInt()
}

public fun DrawThemeIcon(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeIcon", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), prect, himl, iimageindex.toLong())).toInt()
}

public fun DrawThemeParentBackground(hwnd: HWND, hdc: HDC, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeParentBackground", longArrayOf(hwnd, hdc, prc)).toInt()
}

public fun DrawThemeParentBackgroundEx(hwnd: HWND, hdc: HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeParentBackgroundEx", longArrayOf(hwnd, hdc, dwflags.toLong(), prc)).toInt()
}

public fun DrawThemeText(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeText", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), psztext, cchtext.toLong(), dwtextflags.toLong(), dwtextflags2.toLong(), prect)).toInt()
}

public fun DrawThemeTextEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeTextEx", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), psztext, cchtext.toLong(), dwtextflags.toLong(), prect, poptions)).toInt()
}

public fun EnableScrollBar(hwnd: HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableScrollBar", longArrayOf(hwnd, wsbflags.toLong(), warrows.toLong())).toInt()
}

public fun EnableThemeDialogTexture(hwnd: HWND, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EnableThemeDialogTexture", longArrayOf(hwnd, dwflags.toLong())).toInt()
}

public fun EnableTheming(fenable: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EnableTheming", longArrayOf(fenable.toLong())).toInt()
}

public fun EndBufferedAnimation(hbpanimation: Long, fupdatetarget: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EndBufferedAnimation", longArrayOf(hbpanimation, fupdatetarget.toLong())).toInt()
}

public fun EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EndBufferedPaint", longArrayOf(hbufferedpaint, fupdatetarget.toLong())).toInt()
}

public fun EndPanningFeedback(hwnd: HWND, fanimateback: BOOL): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EndPanningFeedback", longArrayOf(hwnd, fanimateback.toLong())).toInt()
}

public fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EvaluateProximityToPolygon", longArrayOf(numvertices.toLong(), controlpolygon, phittestinginput, pproximityeval)).toInt()
}

public fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EvaluateProximityToRect", longArrayOf(controlboundingbox, phittestinginput, pproximityeval)).toInt()
}

public fun FlatSB_EnableScrollBar(param0: HWND, param1: Int, param2: UInt): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_EnableScrollBar", longArrayOf(param0, param1.toLong(), param2.toLong())).toInt()
}

public fun FlatSB_GetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollInfo", longArrayOf(param0, code.toLong(), param2)).toInt()
}

public fun FlatSB_GetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollPos", longArrayOf(param0, code.toLong())).toInt()
}

public fun FlatSB_GetScrollProp(param0: HWND, propindex: WSB_PROP, param2: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollProp", longArrayOf(param0, propindex.toLong(), param2)).toInt()
}

public fun FlatSB_GetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollRange", longArrayOf(param0, code.toLong(), param2, param3)).toInt()
}

public fun FlatSB_SetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollInfo", longArrayOf(param0, code.toLong(), psi, fredraw.toLong())).toInt()
}

public fun FlatSB_SetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollPos", longArrayOf(param0, code.toLong(), pos.toLong(), fredraw.toLong())).toInt()
}

public fun FlatSB_SetScrollProp(param0: HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollProp", longArrayOf(param0, index.toLong(), newvalue, param3.toLong())).toInt()
}

public fun FlatSB_SetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollRange", longArrayOf(param0, code.toLong(), min.toLong(), max.toLong(), fredraw.toLong())).toInt()
}

public fun FlatSB_ShowScrollBar(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: BOOL): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_ShowScrollBar", longArrayOf(param0, code.toLong(), param2.toLong())).toInt()
}

public fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintBits", longArrayOf(hbufferedpaint, ppbbuffer, pcxrow)).toInt()
}

public fun GetBufferedPaintDC(hbufferedpaint: Long): HDC {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintDC", longArrayOf(hbufferedpaint))
}

public fun GetBufferedPaintTargetDC(hbufferedpaint: Long): HDC {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintTargetDC", longArrayOf(hbufferedpaint))
}

public fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintTargetRect", longArrayOf(hbufferedpaint, prc)).toInt()
}

public fun GetComboBoxInfo(hwndcombo: HWND, pcbi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetComboBoxInfo", longArrayOf(hwndcombo, pcbi)).toInt()
}

public fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetCurrentThemeName", longArrayOf(pszthemefilename, cchmaxnamechars.toLong(), pszcolorbuff, cchmaxcolorchars.toLong(), pszsizebuff, cchmaxsizechars.toLong())).toInt()
}

public fun GetEffectiveClientRect(hwnd: HWND, lprc: Long, lpinfo: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "GetEffectiveClientRect", longArrayOf(hwnd, lprc, lpinfo))
}

public fun GetListBoxInfo(hwnd: HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetListBoxInfo", longArrayOf(hwnd)).toUInt()
}

public fun GetMUILanguage(): UShort {
    return Win32DynamicFfi.invoke("comctl32.dll", "GetMUILanguage", longArrayOf()).toUShort()
}

public fun GetThemeAnimationProperty(htheme: HTHEME, istoryboardid: Int, itargetid: Int, eproperty: TA_PROPERTY, pvproperty: Long, cbsize: UInt, pcbsizeout: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeAnimationProperty", longArrayOf(htheme, istoryboardid.toLong(), itargetid.toLong(), eproperty.toLong(), pvproperty, cbsize.toLong(), pcbsizeout)).toInt()
}

public fun GetThemeAnimationTransform(htheme: HTHEME, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: Long, cbsize: UInt, pcbsizeout: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeAnimationTransform", longArrayOf(htheme, istoryboardid.toLong(), itargetid.toLong(), dwtransformindex.toLong(), ptransform, cbsize.toLong(), pcbsizeout)).toInt()
}

public fun GetThemeAppProperties(): SET_THEME_APP_PROPERTIES_FLAGS {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeAppProperties", longArrayOf()).toUInt()
}

public fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBackgroundContentRect", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), pboundingrect, pcontentrect)).toInt()
}

public fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBackgroundExtent", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), pcontentrect, pextentrect)).toInt()
}

public fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBackgroundRegion", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), prect, pregion)).toInt()
}

public fun GetThemeBitmap(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GET_THEME_BITMAP_FLAGS, phbitmap: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBitmap", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), dwflags.toLong(), phbitmap)).toInt()
}

public fun GetThemeBool(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBool", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pfval)).toInt()
}

public fun GetThemeColor(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeColor", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pcolor)).toInt()
}

public fun GetThemeDocumentationProperty(pszthemename: PCWSTR, pszpropertyname: PCWSTR, pszvaluebuff: PWSTR, cchmaxvalchars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeDocumentationProperty", longArrayOf(pszthemename, pszpropertyname, pszvaluebuff, cchmaxvalchars.toLong())).toInt()
}

public fun GetThemeEnumValue(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeEnumValue", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pival)).toInt()
}

public fun GetThemeFilename(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: PWSTR, cchmaxbuffchars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeFilename", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pszthemefilename, cchmaxbuffchars.toLong())).toInt()
}

public fun GetThemeFont(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeFont", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pfont)).toInt()
}

public fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeInt", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pival)).toInt()
}

public fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeIntList", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pintlist)).toInt()
}

public fun GetThemeMargins(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeMargins", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), prc, pmargins)).toInt()
}

public fun GetThemeMetric(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeMetric", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pival)).toInt()
}

public fun GetThemePartSize(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemePartSize", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), prc, esize.toLong(), psz)).toInt()
}

public fun GetThemePosition(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemePosition", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), ppoint)).toInt()
}

public fun GetThemePropertyOrigin(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemePropertyOrigin", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), porigin)).toInt()
}

public fun GetThemeRect(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeRect", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), prect)).toInt()
}

public fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: HINSTANCE): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeStream", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), ppvstream, pcbstream, hinst)).toInt()
}

public fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeString", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pszbuff, cchmaxbuffchars.toLong())).toInt()
}

public fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysBool", longArrayOf(htheme, iboolid.toLong())).toInt()
}

public fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): COLORREF {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysColor", longArrayOf(htheme, icolorid.toLong())).toUInt()
}

public fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): HBRUSH {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysColorBrush", longArrayOf(htheme, icolorid.toLong()))
}

public fun GetThemeSysFont(htheme: HTHEME, ifontid: Int, plf: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysFont", longArrayOf(htheme, ifontid.toLong(), plf)).toInt()
}

public fun GetThemeSysInt(htheme: HTHEME, iintid: Int, pivalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysInt", longArrayOf(htheme, iintid.toLong(), pivalue)).toInt()
}

public fun GetThemeSysSize(htheme: HTHEME, isizeid: Int): Int {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysSize", longArrayOf(htheme, isizeid.toLong())).toInt()
}

public fun GetThemeSysString(htheme: HTHEME, istringid: Int, pszstringbuff: PWSTR, cchmaxstringchars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysString", longArrayOf(htheme, istringid.toLong(), pszstringbuff, cchmaxstringchars.toLong())).toInt()
}

public fun GetThemeTextExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTextExtent", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), psztext, cchcharcount.toLong(), dwtextflags.toLong(), pboundingrect, pextentrect)).toInt()
}

public fun GetThemeTextMetrics(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTextMetrics", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), ptm)).toInt()
}

public fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTimingFunction", longArrayOf(htheme, itimingfunctionid.toLong(), ptimingfunction, cbsize.toLong(), pcbsizeout)).toInt()
}

public fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTransitionDuration", longArrayOf(htheme, ipartid.toLong(), istateidfrom.toLong(), istateidto.toLong(), ipropid.toLong(), pdwduration)).toInt()
}

public fun GetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowFeedbackSetting", longArrayOf(hwnd, feedback.toLong(), dwflags.toLong(), psize, config)).toInt()
}

public fun GetWindowTheme(hwnd: HWND): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetWindowTheme", longArrayOf(hwnd))
}

public fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "HIMAGELIST_QueryInterface", longArrayOf(himl, riid, ppv)).toInt()
}

public fun HitTestThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: HRGN, pttest: POINT, pwhittestcode: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "HitTestThemeBackground", longArrayOf(htheme, hdc, ipartid.toLong(), istateid.toLong(), dwoptions.toLong(), prect, hrgn, ((pttest.x.toLong() and 0xFFFF_FFFFL) or ((pttest.y.toLong() and 0xFFFF_FFFFL) shl 32)), pwhittestcode)).toInt()
}

public fun ImageList_Add(himl: HIMAGELIST, hbmimage: HBITMAP, hbmmask: HBITMAP): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Add", longArrayOf(himl, hbmimage, hbmmask)).toInt()
}

public fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: HBITMAP, crmask: COLORREF): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_AddMasked", longArrayOf(himl, hbmimage, crmask.toLong())).toInt()
}

public fun ImageList_BeginDrag(himltrack: HIMAGELIST, itrack: Int, dxhotspot: Int, dyhotspot: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_BeginDrag", longArrayOf(himltrack, itrack.toLong(), dxhotspot.toLong(), dyhotspot.toLong())).toInt()
}

public fun ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_CoCreateInstance", longArrayOf(rclsid, punkouter, riid, ppv)).toInt()
}

public fun ImageList_Copy(himldst: HIMAGELIST, idst: Int, himlsrc: HIMAGELIST, isrc: Int, uflags: IMAGE_LIST_COPY_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Copy", longArrayOf(himldst, idst.toLong(), himlsrc, isrc.toLong(), uflags.toLong())).toInt()
}

public fun ImageList_Create(cx: Int, cy: Int, flags: IMAGELIST_CREATION_FLAGS, cinitial: Int, cgrow: Int): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Create", longArrayOf(cx.toLong(), cy.toLong(), flags.toLong(), cinitial.toLong(), cgrow.toLong()))
}

public fun ImageList_Destroy(himl: HIMAGELIST): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Destroy", longArrayOf(himl)).toInt()
}

public fun ImageList_DragEnter(hwndlock: HWND, x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragEnter", longArrayOf(hwndlock, x.toLong(), y.toLong())).toInt()
}

public fun ImageList_DragLeave(hwndlock: HWND): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragLeave", longArrayOf(hwndlock)).toInt()
}

public fun ImageList_DragMove(x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragMove", longArrayOf(x.toLong(), y.toLong())).toInt()
}

public fun ImageList_DragShowNolock(fshow: BOOL): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragShowNolock", longArrayOf(fshow.toLong())).toInt()
}

public fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Draw", longArrayOf(himl, i.toLong(), hdcdst, x.toLong(), y.toLong(), fstyle.toLong())).toInt()
}

public fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: COLORREF, rgbfg: COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DrawEx", longArrayOf(himl, i.toLong(), hdcdst, x.toLong(), y.toLong(), dx.toLong(), dy.toLong(), rgbbk.toLong(), rgbfg.toLong(), fstyle.toLong())).toInt()
}

public fun ImageList_DrawIndirect(pimldp: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DrawIndirect", longArrayOf(pimldp)).toInt()
}

public fun ImageList_Duplicate(himl: HIMAGELIST): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Duplicate", longArrayOf(himl))
}

public fun ImageList_EndDrag() {
    Win32DynamicFfi.invoke("comctl32.dll", "ImageList_EndDrag", longArrayOf())
}

public fun ImageList_GetBkColor(himl: HIMAGELIST): COLORREF {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetBkColor", longArrayOf(himl)).toUInt()
}

public fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetDragImage", longArrayOf(ppt, ppthotspot))
}

public fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): HICON {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetIcon", longArrayOf(himl, i.toLong(), flags.toLong()))
}

public fun ImageList_GetIconSize(himl: HIMAGELIST, cx: Long, cy: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetIconSize", longArrayOf(himl, cx, cy)).toInt()
}

public fun ImageList_GetImageCount(himl: HIMAGELIST): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetImageCount", longArrayOf(himl)).toInt()
}

public fun ImageList_GetImageInfo(himl: HIMAGELIST, i: Int, pimageinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetImageInfo", longArrayOf(himl, i.toLong(), pimageinfo)).toInt()
}

public fun ImageList_LoadImageA(hi: HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_LoadImageA", longArrayOf(hi, lpbmp, cx.toLong(), cgrow.toLong(), crmask.toLong(), utype.toLong(), uflags.toLong()))
}

public fun ImageList_LoadImageW(hi: HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_LoadImageW", longArrayOf(hi, lpbmp, cx.toLong(), cgrow.toLong(), crmask.toLong(), utype.toLong(), uflags.toLong()))
}

public fun ImageList_Merge(himl1: HIMAGELIST, i1: Int, himl2: HIMAGELIST, i2: Int, dx: Int, dy: Int): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Merge", longArrayOf(himl1, i1.toLong(), himl2, i2.toLong(), dx.toLong(), dy.toLong()))
}

public fun ImageList_Read(pstm: Long): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Read", longArrayOf(pstm))
}

public fun ImageList_ReadEx(dwflags: UInt, pstm: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_ReadEx", longArrayOf(dwflags.toLong(), pstm, riid, ppv)).toInt()
}

public fun ImageList_Remove(himl: HIMAGELIST, i: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Remove", longArrayOf(himl, i.toLong())).toInt()
}

public fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: HBITMAP, hbmmask: HBITMAP): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Replace", longArrayOf(himl, i.toLong(), hbmimage, hbmmask)).toInt()
}

public fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: HICON): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_ReplaceIcon", longArrayOf(himl, i.toLong(), hicon)).toInt()
}

public fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_SetBkColor", longArrayOf(himl, clrbk.toLong())).toUInt()
}

public fun ImageList_SetDragCursorImage(himldrag: HIMAGELIST, idrag: Int, dxhotspot: Int, dyhotspot: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_SetDragCursorImage", longArrayOf(himldrag, idrag.toLong(), dxhotspot.toLong(), dyhotspot.toLong())).toInt()
}

public fun ImageList_SetIconSize(himl: HIMAGELIST, cx: Int, cy: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_SetIconSize", longArrayOf(himl, cx.toLong(), cy.toLong())).toInt()
}

public fun ImageList_SetImageCount(himl: HIMAGELIST, unewcount: UInt): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_SetImageCount", longArrayOf(himl, unewcount.toLong())).toInt()
}

public fun ImageList_SetOverlayImage(himl: HIMAGELIST, iimage: Int, ioverlay: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_SetOverlayImage", longArrayOf(himl, iimage.toLong(), ioverlay.toLong())).toInt()
}

public fun ImageList_Write(himl: HIMAGELIST, pstm: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Write", longArrayOf(himl, pstm)).toInt()
}

public fun ImageList_WriteEx(himl: HIMAGELIST, dwflags: IMAGE_LIST_WRITE_STREAM_FLAGS, pstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_WriteEx", longArrayOf(himl, dwflags.toLong(), pstm)).toInt()
}

public fun InitCommonControls() {
    Win32DynamicFfi.invoke("comctl32.dll", "InitCommonControls", longArrayOf())
}

public fun InitCommonControlsEx(picce: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "InitCommonControlsEx", longArrayOf(picce)).toInt()
}

public fun InitMUILanguage(uilang: UShort) {
    Win32DynamicFfi.invoke("comctl32.dll", "InitMUILanguage", longArrayOf(uilang.toLong()))
}

public fun InitializeFlatSB(param0: HWND): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "InitializeFlatSB", longArrayOf(param0)).toInt()
}

public fun IsAppThemed(): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsAppThemed", longArrayOf()).toInt()
}

public fun IsCharLowerW(ch: UShort): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsCharLowerW", longArrayOf(ch.toLong())).toInt()
}

public fun IsCompositionActive(): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsCompositionActive", longArrayOf()).toInt()
}

public fun IsDlgButtonChecked(hdlg: HWND, nidbutton: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "IsDlgButtonChecked", longArrayOf(hdlg, nidbutton.toLong())).toUInt()
}

public fun IsThemeActive(): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemeActive", longArrayOf()).toInt()
}

public fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemeBackgroundPartiallyTransparent", longArrayOf(htheme, ipartid.toLong(), istateid.toLong())).toInt()
}

public fun IsThemeDialogTextureEnabled(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemeDialogTextureEnabled", longArrayOf(hwnd)).toInt()
}

public fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemePartDefined", longArrayOf(htheme, ipartid.toLong(), istateid.toLong())).toInt()
}

public fun LBItemFromPt(hlb: HWND, pt: POINT, bautoscroll: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "LBItemFromPt", longArrayOf(hlb, ((pt.x.toLong() and 0xFFFF_FFFFL) or ((pt.y.toLong() and 0xFFFF_FFFFL) shl 32)), bautoscroll.toLong())).toInt()
}

public fun LoadIconMetric(hinst: HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "LoadIconMetric", longArrayOf(hinst, pszname, lims.toLong(), phico)).toInt()
}

public fun LoadIconWithScaleDown(hinst: HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "LoadIconWithScaleDown", longArrayOf(hinst, pszname, cx.toLong(), cy.toLong(), phico)).toInt()
}

public fun MakeDragList(hlb: HWND): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "MakeDragList", longArrayOf(hlb)).toInt()
}

public fun MenuHelp(umsg: UInt, wparam: WPARAM, lparam: LPARAM, hmainmenu: HMENU, hinst: HINSTANCE, hwndstatus: HWND, lpwids: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "MenuHelp", longArrayOf(umsg.toLong(), wparam.toLong(), lparam, hmainmenu, hinst, hwndstatus, lpwids))
}

public fun OpenThemeData(hwnd: HWND, pszclasslist: PCWSTR): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "OpenThemeData", longArrayOf(hwnd, pszclasslist))
}

public fun OpenThemeDataEx(hwnd: HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "OpenThemeDataEx", longArrayOf(hwnd, pszclasslist, dwflags.toLong()))
}

public fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): LRESULT {
    return Win32DynamicFfi.invoke("user32.dll", "PackTouchHitTestingProximityEvaluation", longArrayOf(phittestinginput, pproximityeval))
}

public fun PropertySheetA(param0: Long): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "PropertySheetA", longArrayOf(param0))
}

public fun PropertySheetW(param0: Long): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "PropertySheetW", longArrayOf(param0))
}

public fun RegisterPointerDeviceNotifications(window: HWND, notifyrange: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterPointerDeviceNotifications", longArrayOf(window, notifyrange.toLong())).toInt()
}

public fun RegisterTouchHitTestingWindow(hwnd: HWND, value: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterTouchHitTestingWindow", longArrayOf(hwnd, value.toLong())).toInt()
}

public fun SetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetScrollInfo", longArrayOf(hwnd, nbar.toLong(), lpsi, redraw.toLong())).toInt()
}

public fun SetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetScrollPos", longArrayOf(hwnd, nbar.toLong(), npos.toLong(), bredraw.toLong())).toInt()
}

public fun SetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetScrollRange", longArrayOf(hwnd, nbar.toLong(), nminpos.toLong(), nmaxpos.toLong(), bredraw.toLong())).toInt()
}

public fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS) {
    Win32DynamicFfi.invoke("uxtheme.dll", "SetThemeAppProperties", longArrayOf(dwflags.toLong()))
}

public fun SetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowFeedbackSetting", longArrayOf(hwnd, feedback.toLong(), dwflags.toLong(), size.toLong(), configuration)).toInt()
}

public fun SetWindowTheme(hwnd: HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "SetWindowTheme", longArrayOf(hwnd, pszsubappname, pszsubidlist)).toInt()
}

public fun SetWindowThemeAttribute(hwnd: HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "SetWindowThemeAttribute", longArrayOf(hwnd, eattribute.toLong(), pvattribute, cbattribute.toLong())).toInt()
}

public fun ShowHideMenuCtl(hwnd: HWND, uflags: ULong, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ShowHideMenuCtl", longArrayOf(hwnd, uflags.toLong(), lpinfo)).toInt()
}

public fun ShowScrollBar(hwnd: HWND, wbar: SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShowScrollBar", longArrayOf(hwnd, wbar.toLong(), bshow.toLong())).toInt()
}

public fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "Str_SetPtrW", longArrayOf(ppsz, psz)).toInt()
}

public fun TaskDialog(hwndowner: HWND, hinstance: HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "TaskDialog", longArrayOf(hwndowner, hinstance, pszwindowtitle, pszmaininstruction, pszcontent, dwcommonbuttons.toLong(), pszicon, pnbutton)).toInt()
}

public fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "TaskDialogIndirect", longArrayOf(ptaskconfig, pnbutton, pnradiobutton, pfverificationflagchecked)).toInt()
}

public fun UninitializeFlatSB(param0: HWND): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "UninitializeFlatSB", longArrayOf(param0)).toInt()
}

public fun UpdatePanningFeedback(hwnd: HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "UpdatePanningFeedback", longArrayOf(hwnd, ltotaloverpanoffsetx.toLong(), ltotaloverpanoffsety.toLong(), fininertia.toLong())).toInt()
}
