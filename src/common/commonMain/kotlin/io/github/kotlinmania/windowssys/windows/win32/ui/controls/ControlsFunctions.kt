package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(p: Long, pdata: Long): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(pinfo: Long, pstream: Long, pvinstdata: Long): HRESULT
}

public fun interface FnCallback2 {
    public operator fun invoke(p1: Long, p2: Long, lparam: Foundation.LPARAM): Int
}

public fun interface FnCallback3 {
    public operator fun invoke(umsg: DPAMM_MESSAGE, pvdest: Long, pvsrc: Long, lparam: Foundation.LPARAM): Long
}

public fun BeginBufferedAnimation(hwnd: Foundation.HWND, hdctarget: Graphics.Gdi.HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BeginBufferedAnimation", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdctarget), prctarget, dwformat.toLong(), ppaintparams, panimationparams, phdcfrom, phdcto))
}

public fun BeginBufferedPaint(hdctarget: Graphics.Gdi.HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BeginBufferedPaint", longArrayOf(Win32DynamicFfi.objectSlot(hdctarget), prctarget, dwformat.toLong(), ppaintparams, phdc))
}

public fun BeginPanningFeedback(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BeginPanningFeedback", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintClear", longArrayOf(hbufferedpaint, prc)).toInt()
}

public fun BufferedPaintInit(): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintInit", longArrayOf()).toInt()
}

public fun BufferedPaintRenderAnimation(hwnd: Foundation.HWND, hdctarget: Graphics.Gdi.HDC): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintRenderAnimation", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdctarget))).toInt()
}

public fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintSetAlpha", longArrayOf(hbufferedpaint, prc, alpha.toLong())).toInt()
}

public fun BufferedPaintStopAllAnimations(hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintStopAllAnimations", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun BufferedPaintUnInit(): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "BufferedPaintUnInit", longArrayOf()).toInt()
}

public fun CheckDlgButton(hdlg: Foundation.HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CheckDlgButton", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), nidbutton.toLong(), ucheck.toLong())).toInt()
}

public fun CheckRadioButton(hdlg: Foundation.HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CheckRadioButton", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), nidfirstbutton.toLong(), nidlastbutton.toLong(), nidcheckbutton.toLong())).toInt()
}

public fun CloseThemeData(htheme: HTHEME): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "CloseThemeData", longArrayOf(htheme)).toInt()
}

public fun CreateMappedBitmap(hinstance: Foundation.HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): Graphics.Gdi.HBITMAP {
    Win32DynamicFfi.invoke("comctl32.dll", "CreateMappedBitmap", longArrayOf(Win32DynamicFfi.objectSlot(hinstance), idbitmap, wflags.toLong(), lpcolormap, inummaps.toLong()))
    return Graphics.Gdi.HBITMAP()
}

public fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreatePropertySheetPageA", longArrayOf(constpropsheetpagepointer))
}

public fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE {
    return Win32DynamicFfi.invoke("comctl32.dll", "CreatePropertySheetPageW", longArrayOf(constpropsheetpagepointer))
}

public fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: Foundation.HWND, wid: UInt): Foundation.HWND {
    Win32DynamicFfi.invoke("comctl32.dll", "CreateStatusWindowA", longArrayOf(style.toLong(), lpsztext, Win32DynamicFfi.objectSlot(hwndparent), wid.toLong()))
    return Foundation.HWND()
}

public fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: Foundation.HWND, wid: UInt): Foundation.HWND {
    Win32DynamicFfi.invoke("comctl32.dll", "CreateStatusWindowW", longArrayOf(style.toLong(), lpsztext, Win32DynamicFfi.objectSlot(hwndparent), wid.toLong()))
    return Foundation.HWND()
}

public fun CreateSyntheticPointerDevice(pointertype: WindowsAndMessaging.POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE {
    return Win32DynamicFfi.invoke("user32.dll", "CreateSyntheticPointerDevice", longArrayOf(Win32DynamicFfi.objectSlot(pointertype), maxcount.toLong(), mode.toLong()))
}

public fun CreateToolbarEx(hwnd: Foundation.HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Foundation.HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Foundation.HWND {
    Win32DynamicFfi.invoke("comctl32.dll", "CreateToolbarEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ws.toLong(), wid.toLong(), nbitmaps.toLong(), Win32DynamicFfi.objectSlot(hbminst), wbmid.toLong(), lpbuttons, inumbuttons.toLong(), dxbutton.toLong(), dybutton.toLong(), dxbitmap.toLong(), dybitmap.toLong(), ustructsize.toLong()))
    return Foundation.HWND()
}

public fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Foundation.HWND, nid: Int, hinst: Foundation.HINSTANCE, hbuddy: Foundation.HWND, nupper: Int, nlower: Int, npos: Int): Foundation.HWND {
    Win32DynamicFfi.invoke("comctl32.dll", "CreateUpDownControl", longArrayOf(dwstyle.toLong(), x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), Win32DynamicFfi.objectSlot(hparent), nid.toLong(), Win32DynamicFfi.objectSlot(hinst), Win32DynamicFfi.objectSlot(hbuddy), nupper.toLong(), nlower.toLong(), npos.toLong()))
    return Foundation.HWND()
}

public fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Clone", longArrayOf(hdpa, hdpanew))
}

public fun DPA_Create(citemgrow: Int): HDPA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Create", longArrayOf(citemgrow.toLong()))
}

public fun DPA_CreateEx(cpgrow: Int, hheap: Foundation.HANDLE): HDPA {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_CreateEx", longArrayOf(cpgrow.toLong(), Win32DynamicFfi.objectSlot(hheap)))
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

public fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Merge", longArrayOf(hdpadest, hdpasrc, dwflags.toLong(), Win32DynamicFfi.objectSlot(pfncompare), Win32DynamicFfi.objectSlot(pfnmerge), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_SaveStream", longArrayOf(hdpa, Win32DynamicFfi.objectSlot(pfn), pstream, pvinstdata)).toInt()
}

public fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: Foundation.LPARAM, options: UInt): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Search", longArrayOf(hdpa, pfind, istart.toLong(), Win32DynamicFfi.objectSlot(pfncompare), Win32DynamicFfi.objectSlot(lparam), options.toLong())).toInt()
}

public fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_SetPtr", longArrayOf(hdpa, i.toLong(), p)).toInt()
}

public fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DPA_Sort", longArrayOf(hdpa, Win32DynamicFfi.objectSlot(pfncompare), Win32DynamicFfi.objectSlot(lparam))).toInt()
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

public fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DSA_Sort", longArrayOf(pdsa, Win32DynamicFfi.objectSlot(pfncompare), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "DestroyPropertySheetPage", longArrayOf(param0)).toInt()
}

public fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE) {
    Win32DynamicFfi.invoke("user32.dll", "DestroySyntheticPointerDevice", longArrayOf(device))
}

public fun DlgDirListA(hdlg: Foundation.HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lppathspec, nidlistbox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirListComboBoxA(hdlg: Foundation.HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListComboBoxA", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lppathspec, nidcombobox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirListComboBoxW(hdlg: Foundation.HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListComboBoxW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lppathspec, nidcombobox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirListW(hdlg: Foundation.HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirListW", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), lppathspec, nidlistbox.toLong(), nidstaticpath.toLong(), ufiletype.toLong())).toInt()
}

public fun DlgDirSelectComboBoxExA(hwnddlg: Foundation.HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectComboBoxExA", longArrayOf(Win32DynamicFfi.objectSlot(hwnddlg), lpstring, cchout.toLong(), idcombobox.toLong())).toInt()
}

public fun DlgDirSelectComboBoxExW(hwnddlg: Foundation.HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectComboBoxExW", longArrayOf(Win32DynamicFfi.objectSlot(hwnddlg), lpstring, cchout.toLong(), idcombobox.toLong())).toInt()
}

public fun DlgDirSelectExA(hwnddlg: Foundation.HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectExA", longArrayOf(Win32DynamicFfi.objectSlot(hwnddlg), lpstring, chcount.toLong(), idlistbox.toLong())).toInt()
}

public fun DlgDirSelectExW(hwnddlg: Foundation.HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DlgDirSelectExW", longArrayOf(Win32DynamicFfi.objectSlot(hwnddlg), lpstring, chcount.toLong(), idlistbox.toLong())).toInt()
}

public fun DrawInsert(handparent: Foundation.HWND, hlb: Foundation.HWND, nitem: Int) {
    Win32DynamicFfi.invoke("comctl32.dll", "DrawInsert", longArrayOf(Win32DynamicFfi.objectSlot(handparent), Win32DynamicFfi.objectSlot(hlb), nitem.toLong()))
}

public fun DrawShadowText(hdc: Graphics.Gdi.HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: Foundation.COLORREF, crshadow: Foundation.COLORREF, ixoffset: Int, iyoffset: Int): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "DrawShadowText", longArrayOf(Win32DynamicFfi.objectSlot(hdc), psztext, cch.toLong(), prc, dwflags.toLong(), Win32DynamicFfi.objectSlot(crtext), Win32DynamicFfi.objectSlot(crshadow), ixoffset.toLong(), iyoffset.toLong())).toInt()
}

public fun DrawStatusTextA(hdc: Graphics.Gdi.HDC, lprc: Long, psztext: PCSTR, uflags: UInt) {
    Win32DynamicFfi.invoke("comctl32.dll", "DrawStatusTextA", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lprc, psztext, uflags.toLong()))
}

public fun DrawStatusTextW(hdc: Graphics.Gdi.HDC, lprc: Long, psztext: PCWSTR, uflags: UInt) {
    Win32DynamicFfi.invoke("comctl32.dll", "DrawStatusTextW", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lprc, psztext, uflags.toLong()))
}

public fun DrawThemeBackground(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeBackground", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), prect, pcliprect)).toInt()
}

public fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeBackgroundEx", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), prect, poptions)).toInt()
}

public fun DrawThemeEdge(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: Graphics.Gdi.DRAWEDGE_FLAGS, uflags: Graphics.Gdi.DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeEdge", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), pdestrect, Win32DynamicFfi.objectSlot(uedge), Win32DynamicFfi.objectSlot(uflags), pcontentrect)).toInt()
}

public fun DrawThemeIcon(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeIcon", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), prect, himl, iimageindex.toLong())).toInt()
}

public fun DrawThemeParentBackground(hwnd: Foundation.HWND, hdc: Graphics.Gdi.HDC, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeParentBackground", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdc), prc)).toInt()
}

public fun DrawThemeParentBackgroundEx(hwnd: Foundation.HWND, hdc: Graphics.Gdi.HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeParentBackgroundEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdc), dwflags.toLong(), prc)).toInt()
}

public fun DrawThemeText(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: Graphics.Gdi.DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeText", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), psztext, cchtext.toLong(), Win32DynamicFfi.objectSlot(dwtextflags), dwtextflags2.toLong(), prect)).toInt()
}

public fun DrawThemeTextEx(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: Graphics.Gdi.DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "DrawThemeTextEx", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), psztext, cchtext.toLong(), Win32DynamicFfi.objectSlot(dwtextflags), prect, poptions)).toInt()
}

public fun EnableScrollBar(hwnd: Foundation.HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableScrollBar", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), wsbflags.toLong(), warrows.toLong())).toInt()
}

public fun EnableThemeDialogTexture(hwnd: Foundation.HWND, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EnableThemeDialogTexture", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwflags.toLong())).toInt()
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

public fun EndPanningFeedback(hwnd: Foundation.HWND, fanimateback: BOOL): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "EndPanningFeedback", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), fanimateback.toLong())).toInt()
}

public fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EvaluateProximityToPolygon", longArrayOf(numvertices.toLong(), controlpolygon, phittestinginput, pproximityeval)).toInt()
}

public fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EvaluateProximityToRect", longArrayOf(controlboundingbox, phittestinginput, pproximityeval)).toInt()
}

public fun FlatSB_EnableScrollBar(param0: Foundation.HWND, param1: Int, param2: UInt): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_EnableScrollBar", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong(), param2.toLong())).toInt()
}

public fun FlatSB_GetScrollInfo(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS, param2: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollInfo", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code), param2)).toInt()
}

public fun FlatSB_GetScrollPos(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollPos", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code))).toInt()
}

public fun FlatSB_GetScrollProp(param0: Foundation.HWND, propindex: WSB_PROP, param2: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollProp", longArrayOf(Win32DynamicFfi.objectSlot(param0), propindex.toLong(), param2)).toInt()
}

public fun FlatSB_GetScrollRange(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_GetScrollRange", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code), param2, param3)).toInt()
}

public fun FlatSB_SetScrollInfo(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollInfo", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code), psi, fredraw.toLong())).toInt()
}

public fun FlatSB_SetScrollPos(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollPos", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code), pos.toLong(), fredraw.toLong())).toInt()
}

public fun FlatSB_SetScrollProp(param0: Foundation.HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollProp", longArrayOf(Win32DynamicFfi.objectSlot(param0), index.toLong(), newvalue, param3.toLong())).toInt()
}

public fun FlatSB_SetScrollRange(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_SetScrollRange", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code), min.toLong(), max.toLong(), fredraw.toLong())).toInt()
}

public fun FlatSB_ShowScrollBar(param0: Foundation.HWND, code: WindowsAndMessaging.SCROLLBAR_CONSTANTS, param2: BOOL): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "FlatSB_ShowScrollBar", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(code), param2.toLong())).toInt()
}

public fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintBits", longArrayOf(hbufferedpaint, ppbbuffer, pcxrow)).toInt()
}

public fun GetBufferedPaintDC(hbufferedpaint: Long): Graphics.Gdi.HDC {
    Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintDC", longArrayOf(hbufferedpaint))
    return Graphics.Gdi.HDC()
}

public fun GetBufferedPaintTargetDC(hbufferedpaint: Long): Graphics.Gdi.HDC {
    Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintTargetDC", longArrayOf(hbufferedpaint))
    return Graphics.Gdi.HDC()
}

public fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetBufferedPaintTargetRect", longArrayOf(hbufferedpaint, prc)).toInt()
}

public fun GetComboBoxInfo(hwndcombo: Foundation.HWND, pcbi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetComboBoxInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwndcombo), pcbi)).toInt()
}

public fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetCurrentThemeName", longArrayOf(pszthemefilename, cchmaxnamechars.toLong(), pszcolorbuff, cchmaxcolorchars.toLong(), pszsizebuff, cchmaxsizechars.toLong())).toInt()
}

public fun GetEffectiveClientRect(hwnd: Foundation.HWND, lprc: Long, lpinfo: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "GetEffectiveClientRect", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lprc, lpinfo))
}

public fun GetListBoxInfo(hwnd: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetListBoxInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toUInt()
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

public fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBackgroundContentRect", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), pboundingrect, pcontentrect)).toInt()
}

public fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBackgroundExtent", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), pcontentrect, pextentrect)).toInt()
}

public fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeBackgroundRegion", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), prect, pregion)).toInt()
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

public fun GetThemeFont(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeFont", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pfont)).toInt()
}

public fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeInt", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pival)).toInt()
}

public fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeIntList", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pintlist)).toInt()
}

public fun GetThemeMargins(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeMargins", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), ipropid.toLong(), prc, pmargins)).toInt()
}

public fun GetThemeMetric(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeMetric", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pival)).toInt()
}

public fun GetThemePartSize(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemePartSize", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), prc, esize.toLong(), psz)).toInt()
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

public fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: Foundation.HINSTANCE): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeStream", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), ppvstream, pcbstream, Win32DynamicFfi.objectSlot(hinst))).toInt()
}

public fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeString", longArrayOf(htheme, ipartid.toLong(), istateid.toLong(), ipropid.toLong(), pszbuff, cchmaxbuffchars.toLong())).toInt()
}

public fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysBool", longArrayOf(htheme, iboolid.toLong())).toInt()
}

public fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): Foundation.COLORREF {
    Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysColor", longArrayOf(htheme, icolorid.toLong()))
    return Foundation.COLORREF()
}

public fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): Graphics.Gdi.HBRUSH {
    Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeSysColorBrush", longArrayOf(htheme, icolorid.toLong()))
    return Graphics.Gdi.HBRUSH()
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

public fun GetThemeTextExtent(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: Graphics.Gdi.DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTextExtent", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), psztext, cchcharcount.toLong(), Win32DynamicFfi.objectSlot(dwtextflags), pboundingrect, pextentrect)).toInt()
}

public fun GetThemeTextMetrics(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTextMetrics", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), ptm)).toInt()
}

public fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTimingFunction", longArrayOf(htheme, itimingfunctionid.toLong(), ptimingfunction, cbsize.toLong(), pcbsizeout)).toInt()
}

public fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetThemeTransitionDuration", longArrayOf(htheme, ipartid.toLong(), istateidfrom.toLong(), istateidto.toLong(), ipropid.toLong(), pdwduration)).toInt()
}

public fun GetWindowFeedbackSetting(hwnd: Foundation.HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowFeedbackSetting", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), feedback.toLong(), dwflags.toLong(), psize, config)).toInt()
}

public fun GetWindowTheme(hwnd: Foundation.HWND): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "GetWindowTheme", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
}

public fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "HIMAGELIST_QueryInterface", longArrayOf(himl, riid, ppv)).toInt()
}

public fun HitTestThemeBackground(htheme: HTHEME, hdc: Graphics.Gdi.HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: Graphics.Gdi.HRGN, pttest: Foundation.POINT, pwhittestcode: Long): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "HitTestThemeBackground", longArrayOf(htheme, Win32DynamicFfi.objectSlot(hdc), ipartid.toLong(), istateid.toLong(), dwoptions.toLong(), prect, Win32DynamicFfi.objectSlot(hrgn), Win32DynamicFfi.objectSlot(pttest), pwhittestcode)).toInt()
}

public fun ImageList_Add(himl: HIMAGELIST, hbmimage: Graphics.Gdi.HBITMAP, hbmmask: Graphics.Gdi.HBITMAP): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Add", longArrayOf(himl, Win32DynamicFfi.objectSlot(hbmimage), Win32DynamicFfi.objectSlot(hbmmask))).toInt()
}

public fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: Graphics.Gdi.HBITMAP, crmask: Foundation.COLORREF): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_AddMasked", longArrayOf(himl, Win32DynamicFfi.objectSlot(hbmimage), Win32DynamicFfi.objectSlot(crmask))).toInt()
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

public fun ImageList_DragEnter(hwndlock: Foundation.HWND, x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragEnter", longArrayOf(Win32DynamicFfi.objectSlot(hwndlock), x.toLong(), y.toLong())).toInt()
}

public fun ImageList_DragLeave(hwndlock: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragLeave", longArrayOf(Win32DynamicFfi.objectSlot(hwndlock))).toInt()
}

public fun ImageList_DragMove(x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragMove", longArrayOf(x.toLong(), y.toLong())).toInt()
}

public fun ImageList_DragShowNolock(fshow: BOOL): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DragShowNolock", longArrayOf(fshow.toLong())).toInt()
}

public fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: Graphics.Gdi.HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Draw", longArrayOf(himl, i.toLong(), Win32DynamicFfi.objectSlot(hdcdst), x.toLong(), y.toLong(), fstyle.toLong())).toInt()
}

public fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: Graphics.Gdi.HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Foundation.COLORREF, rgbfg: Foundation.COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_DrawEx", longArrayOf(himl, i.toLong(), Win32DynamicFfi.objectSlot(hdcdst), x.toLong(), y.toLong(), dx.toLong(), dy.toLong(), Win32DynamicFfi.objectSlot(rgbbk), Win32DynamicFfi.objectSlot(rgbfg), fstyle.toLong())).toInt()
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

public fun ImageList_GetBkColor(himl: HIMAGELIST): Foundation.COLORREF {
    Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetBkColor", longArrayOf(himl))
    return Foundation.COLORREF()
}

public fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetDragImage", longArrayOf(ppt, ppthotspot))
}

public fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): WindowsAndMessaging.HICON {
    Win32DynamicFfi.invoke("comctl32.dll", "ImageList_GetIcon", longArrayOf(himl, i.toLong(), flags.toLong()))
    return WindowsAndMessaging.HICON()
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

public fun ImageList_LoadImageA(hi: Foundation.HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: Foundation.COLORREF, utype: UInt, uflags: WindowsAndMessaging.IMAGE_FLAGS): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_LoadImageA", longArrayOf(Win32DynamicFfi.objectSlot(hi), lpbmp, cx.toLong(), cgrow.toLong(), Win32DynamicFfi.objectSlot(crmask), utype.toLong(), Win32DynamicFfi.objectSlot(uflags)))
}

public fun ImageList_LoadImageW(hi: Foundation.HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: Foundation.COLORREF, utype: UInt, uflags: WindowsAndMessaging.IMAGE_FLAGS): HIMAGELIST {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_LoadImageW", longArrayOf(Win32DynamicFfi.objectSlot(hi), lpbmp, cx.toLong(), cgrow.toLong(), Win32DynamicFfi.objectSlot(crmask), utype.toLong(), Win32DynamicFfi.objectSlot(uflags)))
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

public fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: Graphics.Gdi.HBITMAP, hbmmask: Graphics.Gdi.HBITMAP): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_Replace", longArrayOf(himl, i.toLong(), Win32DynamicFfi.objectSlot(hbmimage), Win32DynamicFfi.objectSlot(hbmmask))).toInt()
}

public fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: WindowsAndMessaging.HICON): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "ImageList_ReplaceIcon", longArrayOf(himl, i.toLong(), Win32DynamicFfi.objectSlot(hicon))).toInt()
}

public fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: Foundation.COLORREF): Foundation.COLORREF {
    Win32DynamicFfi.invoke("comctl32.dll", "ImageList_SetBkColor", longArrayOf(himl, Win32DynamicFfi.objectSlot(clrbk)))
    return Foundation.COLORREF()
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

public fun InitializeFlatSB(param0: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "InitializeFlatSB", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toInt()
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

public fun IsDlgButtonChecked(hdlg: Foundation.HWND, nidbutton: Int): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "IsDlgButtonChecked", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), nidbutton.toLong())).toUInt()
}

public fun IsThemeActive(): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemeActive", longArrayOf()).toInt()
}

public fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemeBackgroundPartiallyTransparent", longArrayOf(htheme, ipartid.toLong(), istateid.toLong())).toInt()
}

public fun IsThemeDialogTextureEnabled(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemeDialogTextureEnabled", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "IsThemePartDefined", longArrayOf(htheme, ipartid.toLong(), istateid.toLong())).toInt()
}

public fun LBItemFromPt(hlb: Foundation.HWND, pt: Foundation.POINT, bautoscroll: BOOL): Int {
    return Win32DynamicFfi.invoke("comctl32.dll", "LBItemFromPt", longArrayOf(Win32DynamicFfi.objectSlot(hlb), Win32DynamicFfi.objectSlot(pt), bautoscroll.toLong())).toInt()
}

public fun LoadIconMetric(hinst: Foundation.HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "LoadIconMetric", longArrayOf(Win32DynamicFfi.objectSlot(hinst), pszname, lims.toLong(), phico)).toInt()
}

public fun LoadIconWithScaleDown(hinst: Foundation.HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "LoadIconWithScaleDown", longArrayOf(Win32DynamicFfi.objectSlot(hinst), pszname, cx.toLong(), cy.toLong(), phico)).toInt()
}

public fun MakeDragList(hlb: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "MakeDragList", longArrayOf(Win32DynamicFfi.objectSlot(hlb))).toInt()
}

public fun MenuHelp(umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, hmainmenu: WindowsAndMessaging.HMENU, hinst: Foundation.HINSTANCE, hwndstatus: Foundation.HWND, lpwids: Long) {
    Win32DynamicFfi.invoke("comctl32.dll", "MenuHelp", longArrayOf(umsg.toLong(), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), Win32DynamicFfi.objectSlot(hmainmenu), Win32DynamicFfi.objectSlot(hinst), Win32DynamicFfi.objectSlot(hwndstatus), lpwids))
}

public fun OpenThemeData(hwnd: Foundation.HWND, pszclasslist: PCWSTR): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "OpenThemeData", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszclasslist))
}

public fun OpenThemeDataEx(hwnd: Foundation.HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "OpenThemeDataEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszclasslist, dwflags.toLong()))
}

public fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("user32.dll", "PackTouchHitTestingProximityEvaluation", longArrayOf(phittestinginput, pproximityeval))
    return Foundation.LRESULT()
}

public fun PropertySheetA(param0: Long): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "PropertySheetA", longArrayOf(param0))
}

public fun PropertySheetW(param0: Long): Long {
    return Win32DynamicFfi.invoke("comctl32.dll", "PropertySheetW", longArrayOf(param0))
}

public fun RegisterPointerDeviceNotifications(window: Foundation.HWND, notifyrange: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterPointerDeviceNotifications", longArrayOf(Win32DynamicFfi.objectSlot(window), notifyrange.toLong())).toInt()
}

public fun RegisterTouchHitTestingWindow(hwnd: Foundation.HWND, value: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterTouchHitTestingWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), value.toLong())).toInt()
}

public fun SetScrollInfo(hwnd: Foundation.HWND, nbar: WindowsAndMessaging.SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetScrollInfo", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(nbar), lpsi, redraw.toLong())).toInt()
}

public fun SetScrollPos(hwnd: Foundation.HWND, nbar: WindowsAndMessaging.SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetScrollPos", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(nbar), npos.toLong(), bredraw.toLong())).toInt()
}

public fun SetScrollRange(hwnd: Foundation.HWND, nbar: WindowsAndMessaging.SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetScrollRange", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(nbar), nminpos.toLong(), nmaxpos.toLong(), bredraw.toLong())).toInt()
}

public fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS) {
    Win32DynamicFfi.invoke("uxtheme.dll", "SetThemeAppProperties", longArrayOf(dwflags.toLong()))
}

public fun SetWindowFeedbackSetting(hwnd: Foundation.HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowFeedbackSetting", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), feedback.toLong(), dwflags.toLong(), size.toLong(), configuration)).toInt()
}

public fun SetWindowTheme(hwnd: Foundation.HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "SetWindowTheme", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszsubappname, pszsubidlist)).toInt()
}

public fun SetWindowThemeAttribute(hwnd: Foundation.HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT {
    return Win32DynamicFfi.invoke("uxtheme.dll", "SetWindowThemeAttribute", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), eattribute.toLong(), pvattribute, cbattribute.toLong())).toInt()
}

public fun ShowHideMenuCtl(hwnd: Foundation.HWND, uflags: ULong, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "ShowHideMenuCtl", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), uflags.toLong(), lpinfo)).toInt()
}

public fun ShowScrollBar(hwnd: Foundation.HWND, wbar: WindowsAndMessaging.SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ShowScrollBar", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(wbar), bshow.toLong())).toInt()
}

public fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("comctl32.dll", "Str_SetPtrW", longArrayOf(ppsz, psz)).toInt()
}

public fun TaskDialog(hwndowner: Foundation.HWND, hinstance: Foundation.HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "TaskDialog", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), Win32DynamicFfi.objectSlot(hinstance), pszwindowtitle, pszmaininstruction, pszcontent, dwcommonbuttons.toLong(), pszicon, pnbutton)).toInt()
}

public fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "TaskDialogIndirect", longArrayOf(ptaskconfig, pnbutton, pnradiobutton, pfverificationflagchecked)).toInt()
}

public fun UninitializeFlatSB(param0: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("comctl32.dll", "UninitializeFlatSB", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toInt()
}

public fun UpdatePanningFeedback(hwnd: Foundation.HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL {
    return Win32DynamicFfi.invoke("uxtheme.dll", "UpdatePanningFeedback", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ltotaloverpanoffsetx.toLong(), ltotaloverpanoffsety.toLong(), fininertia.toLong())).toInt()
}
