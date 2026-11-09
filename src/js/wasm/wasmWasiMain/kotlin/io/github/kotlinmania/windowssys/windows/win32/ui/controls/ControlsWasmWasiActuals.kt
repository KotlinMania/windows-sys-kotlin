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

public actual fun BeginBufferedAnimation(hwnd: HWND, hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long =
    0L

public actual fun BeginBufferedPaint(hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long =
    0L

public actual fun BeginPanningFeedback(hwnd: HWND): BOOL =
    0

public actual fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT =
    0

public actual fun BufferedPaintInit(): HRESULT =
    0

public actual fun BufferedPaintRenderAnimation(hwnd: HWND, hdctarget: HDC): BOOL =
    0

public actual fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT =
    0

public actual fun BufferedPaintStopAllAnimations(hwnd: HWND): HRESULT =
    0

public actual fun BufferedPaintUnInit(): HRESULT =
    0

public actual fun CheckDlgButton(hdlg: HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL =
    0

public actual fun CheckRadioButton(hdlg: HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL =
    0

public actual fun CloseThemeData(htheme: HTHEME): HRESULT =
    0

public actual fun CreateMappedBitmap(hinstance: HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): HBITMAP =
    0L

public actual fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    0L

public actual fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    0L

public actual fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: HWND, wid: UInt): HWND =
    0L

public actual fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: HWND, wid: UInt): HWND =
    0L

public actual fun CreateSyntheticPointerDevice(pointertype: POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE =
    0L

public actual fun CreateToolbarEx(hwnd: HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): HWND =
    0L

public actual fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: HWND, nid: Int, hinst: HINSTANCE, hbuddy: HWND, nupper: Int, nlower: Int, npos: Int): HWND =
    0L

public actual fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA =
    0L

public actual fun DPA_Create(citemgrow: Int): HDPA =
    0L

public actual fun DPA_CreateEx(cpgrow: Int, hheap: HANDLE): HDPA =
    0L

public actual fun DPA_DeleteAllPtrs(hdpa: HDPA): BOOL =
    0

public actual fun DPA_DeletePtr(hdpa: HDPA, i: Int): Long =
    0L

public actual fun DPA_Destroy(hdpa: HDPA): BOOL =
    0

public actual fun DPA_DestroyCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
}

public actual fun DPA_EnumCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
}

public actual fun DPA_GetPtr(hdpa: HDPA, i: Long): Long =
    0L

public actual fun DPA_GetPtrIndex(hdpa: HDPA, p: Long): Int =
    0

public actual fun DPA_GetSize(hdpa: HDPA): ULong =
    0uL

public actual fun DPA_Grow(pdpa: HDPA, cp: Int): BOOL =
    0

public actual fun DPA_InsertPtr(hdpa: HDPA, i: Int, p: Long): Int =
    0

public actual fun DPA_LoadStream(phdpa: Long, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    0

public actual fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: LPARAM): BOOL =
    0

public actual fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    0

public actual fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: LPARAM, options: UInt): Int =
    0

public actual fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL =
    0

public actual fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    0

public actual fun DSA_Clone(hdsa: HDSA): HDSA =
    0L

public actual fun DSA_Create(cbitem: Int, citemgrow: Int): HDSA =
    0L

public actual fun DSA_DeleteAllItems(hdsa: HDSA): BOOL =
    0

public actual fun DSA_DeleteItem(hdsa: HDSA, i: Int): BOOL =
    0

public actual fun DSA_Destroy(hdsa: HDSA): BOOL =
    0

public actual fun DSA_DestroyCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
}

public actual fun DSA_EnumCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
}

public actual fun DSA_GetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    0

public actual fun DSA_GetItemPtr(hdsa: HDSA, i: Int): Long =
    0L

public actual fun DSA_GetSize(hdsa: HDSA): ULong =
    0uL

public actual fun DSA_InsertItem(hdsa: HDSA, i: Int, pitem: Long): Int =
    0

public actual fun DSA_SetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    0

public actual fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    0

public actual fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL =
    0

public actual fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE) {
}

public actual fun DlgDirListA(hdlg: HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    0

public actual fun DlgDirListComboBoxA(hdlg: HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    0

public actual fun DlgDirListComboBoxW(hdlg: HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    0

public actual fun DlgDirListW(hdlg: HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    0

public actual fun DlgDirSelectComboBoxExA(hwnddlg: HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL =
    0

public actual fun DlgDirSelectComboBoxExW(hwnddlg: HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL =
    0

public actual fun DlgDirSelectExA(hwnddlg: HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL =
    0

public actual fun DlgDirSelectExW(hwnddlg: HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL =
    0

public actual fun DrawInsert(handparent: HWND, hlb: HWND, nitem: Int) {
}

public actual fun DrawShadowText(hdc: HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: COLORREF, crshadow: COLORREF, ixoffset: Int, iyoffset: Int): Int =
    0

public actual fun DrawStatusTextA(hdc: HDC, lprc: Long, psztext: PCSTR, uflags: UInt) {
}

public actual fun DrawStatusTextW(hdc: HDC, lprc: Long, psztext: PCWSTR, uflags: UInt) {
}

public actual fun DrawThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT =
    0

public actual fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT =
    0

public actual fun DrawThemeEdge(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: DRAWEDGE_FLAGS, uflags: DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT =
    0

public actual fun DrawThemeIcon(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT =
    0

public actual fun DrawThemeParentBackground(hwnd: HWND, hdc: HDC, prc: Long): HRESULT =
    0

public actual fun DrawThemeParentBackgroundEx(hwnd: HWND, hdc: HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT =
    0

public actual fun DrawThemeText(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT =
    0

public actual fun DrawThemeTextEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT =
    0

public actual fun EnableScrollBar(hwnd: HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL =
    0

public actual fun EnableThemeDialogTexture(hwnd: HWND, dwflags: UInt): HRESULT =
    0

public actual fun EnableTheming(fenable: BOOL): HRESULT =
    0

public actual fun EndBufferedAnimation(hbpanimation: Long, fupdatetarget: BOOL): HRESULT =
    0

public actual fun EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: BOOL): HRESULT =
    0

public actual fun EndPanningFeedback(hwnd: HWND, fanimateback: BOOL): BOOL =
    0

public actual fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    0

public actual fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    0

public actual fun FlatSB_EnableScrollBar(param0: HWND, param1: Int, param2: UInt): BOOL =
    0

public actual fun FlatSB_GetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long): BOOL =
    0

public actual fun FlatSB_GetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS): Int =
    0

public actual fun FlatSB_GetScrollProp(param0: HWND, propindex: WSB_PROP, param2: Long): BOOL =
    0

public actual fun FlatSB_GetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL =
    0

public actual fun FlatSB_SetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int =
    0

public actual fun FlatSB_SetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int =
    0

public actual fun FlatSB_SetScrollProp(param0: HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL =
    0

public actual fun FlatSB_SetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int =
    0

public actual fun FlatSB_ShowScrollBar(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: BOOL): BOOL =
    0

public actual fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT =
    0

public actual fun GetBufferedPaintDC(hbufferedpaint: Long): HDC =
    0L

public actual fun GetBufferedPaintTargetDC(hbufferedpaint: Long): HDC =
    0L

public actual fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT =
    0

public actual fun GetComboBoxInfo(hwndcombo: HWND, pcbi: Long): BOOL =
    0

public actual fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT =
    0

public actual fun GetEffectiveClientRect(hwnd: HWND, lprc: Long, lpinfo: Long) {
}

public actual fun GetListBoxInfo(hwnd: HWND): UInt =
    0u

public actual fun GetMUILanguage(): UShort =
    0u

public actual fun GetThemeAnimationProperty(htheme: HTHEME, istoryboardid: Int, itargetid: Int, eproperty: TA_PROPERTY, pvproperty: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    0

public actual fun GetThemeAnimationTransform(htheme: HTHEME, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    0

public actual fun GetThemeAppProperties(): SET_THEME_APP_PROPERTIES_FLAGS =
    0u

public actual fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT =
    0

public actual fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT =
    0

public actual fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT =
    0

public actual fun GetThemeBitmap(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GET_THEME_BITMAP_FLAGS, phbitmap: Long): HRESULT =
    0

public actual fun GetThemeBool(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): HRESULT =
    0

public actual fun GetThemeColor(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): HRESULT =
    0

public actual fun GetThemeDocumentationProperty(pszthemename: PCWSTR, pszpropertyname: PCWSTR, pszvaluebuff: PWSTR, cchmaxvalchars: Int): HRESULT =
    0

public actual fun GetThemeEnumValue(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    0

public actual fun GetThemeFilename(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: PWSTR, cchmaxbuffchars: Int): HRESULT =
    0

public actual fun GetThemeFont(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT =
    0

public actual fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    0

public actual fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT =
    0

public actual fun GetThemeMargins(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT =
    0

public actual fun GetThemeMetric(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    0

public actual fun GetThemePartSize(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT =
    0

public actual fun GetThemePosition(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): HRESULT =
    0

public actual fun GetThemePropertyOrigin(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): HRESULT =
    0

public actual fun GetThemeRect(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): HRESULT =
    0

public actual fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: HINSTANCE): HRESULT =
    0

public actual fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT =
    0

public actual fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL =
    0

public actual fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): COLORREF =
    0u

public actual fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): HBRUSH =
    0L

public actual fun GetThemeSysFont(htheme: HTHEME, ifontid: Int, plf: Long): HRESULT =
    0

public actual fun GetThemeSysInt(htheme: HTHEME, iintid: Int, pivalue: Long): HRESULT =
    0

public actual fun GetThemeSysSize(htheme: HTHEME, isizeid: Int): Int =
    0

public actual fun GetThemeSysString(htheme: HTHEME, istringid: Int, pszstringbuff: PWSTR, cchmaxstringchars: Int): HRESULT =
    0

public actual fun GetThemeTextExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT =
    0

public actual fun GetThemeTextMetrics(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT =
    0

public actual fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    0

public actual fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT =
    0

public actual fun GetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL =
    0

public actual fun GetWindowTheme(hwnd: HWND): HTHEME =
    0L

public actual fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT =
    0

public actual fun HitTestThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: HRGN, pttest: POINT, pwhittestcode: Long): HRESULT =
    0

public actual fun ImageList_Add(himl: HIMAGELIST, hbmimage: HBITMAP, hbmmask: HBITMAP): Int =
    0

public actual fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: HBITMAP, crmask: COLORREF): Int =
    0

public actual fun ImageList_BeginDrag(himltrack: HIMAGELIST, itrack: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    0

public actual fun ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun ImageList_Copy(himldst: HIMAGELIST, idst: Int, himlsrc: HIMAGELIST, isrc: Int, uflags: IMAGE_LIST_COPY_FLAGS): BOOL =
    0

public actual fun ImageList_Create(cx: Int, cy: Int, flags: IMAGELIST_CREATION_FLAGS, cinitial: Int, cgrow: Int): HIMAGELIST =
    0L

public actual fun ImageList_Destroy(himl: HIMAGELIST): BOOL =
    0

public actual fun ImageList_DragEnter(hwndlock: HWND, x: Int, y: Int): BOOL =
    0

public actual fun ImageList_DragLeave(hwndlock: HWND): BOOL =
    0

public actual fun ImageList_DragMove(x: Int, y: Int): BOOL =
    0

public actual fun ImageList_DragShowNolock(fshow: BOOL): BOOL =
    0

public actual fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    0

public actual fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: COLORREF, rgbfg: COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    0

public actual fun ImageList_DrawIndirect(pimldp: Long): BOOL =
    0

public actual fun ImageList_Duplicate(himl: HIMAGELIST): HIMAGELIST =
    0L

public actual fun ImageList_EndDrag() {
}

public actual fun ImageList_GetBkColor(himl: HIMAGELIST): COLORREF =
    0u

public actual fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST =
    0L

public actual fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): HICON =
    0L

public actual fun ImageList_GetIconSize(himl: HIMAGELIST, cx: Long, cy: Long): BOOL =
    0

public actual fun ImageList_GetImageCount(himl: HIMAGELIST): Int =
    0

public actual fun ImageList_GetImageInfo(himl: HIMAGELIST, i: Int, pimageinfo: Long): BOOL =
    0

public actual fun ImageList_LoadImageA(hi: HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    0L

public actual fun ImageList_LoadImageW(hi: HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    0L

public actual fun ImageList_Merge(himl1: HIMAGELIST, i1: Int, himl2: HIMAGELIST, i2: Int, dx: Int, dy: Int): HIMAGELIST =
    0L

public actual fun ImageList_Read(pstm: Long): HIMAGELIST =
    0L

public actual fun ImageList_ReadEx(dwflags: UInt, pstm: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun ImageList_Remove(himl: HIMAGELIST, i: Int): BOOL =
    0

public actual fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: HBITMAP, hbmmask: HBITMAP): BOOL =
    0

public actual fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: HICON): Int =
    0

public actual fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: COLORREF): COLORREF =
    0u

public actual fun ImageList_SetDragCursorImage(himldrag: HIMAGELIST, idrag: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    0

public actual fun ImageList_SetIconSize(himl: HIMAGELIST, cx: Int, cy: Int): BOOL =
    0

public actual fun ImageList_SetImageCount(himl: HIMAGELIST, unewcount: UInt): BOOL =
    0

public actual fun ImageList_SetOverlayImage(himl: HIMAGELIST, iimage: Int, ioverlay: Int): BOOL =
    0

public actual fun ImageList_Write(himl: HIMAGELIST, pstm: Long): BOOL =
    0

public actual fun ImageList_WriteEx(himl: HIMAGELIST, dwflags: IMAGE_LIST_WRITE_STREAM_FLAGS, pstm: Long): HRESULT =
    0

public actual fun InitCommonControls() {
}

public actual fun InitCommonControlsEx(picce: Long): BOOL =
    0

public actual fun InitMUILanguage(uilang: UShort) {
}

public actual fun InitializeFlatSB(param0: HWND): BOOL =
    0

public actual fun IsAppThemed(): BOOL =
    0

public actual fun IsCharLowerW(ch: UShort): BOOL =
    0

public actual fun IsCompositionActive(): BOOL =
    0

public actual fun IsDlgButtonChecked(hdlg: HWND, nidbutton: Int): UInt =
    0u

public actual fun IsThemeActive(): BOOL =
    0

public actual fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    0

public actual fun IsThemeDialogTextureEnabled(hwnd: HWND): BOOL =
    0

public actual fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    0

public actual fun LBItemFromPt(hlb: HWND, pt: POINT, bautoscroll: BOOL): Int =
    0

public actual fun LoadIconMetric(hinst: HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT =
    0

public actual fun LoadIconWithScaleDown(hinst: HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT =
    0

public actual fun MakeDragList(hlb: HWND): BOOL =
    0

public actual fun MenuHelp(umsg: UInt, wparam: WPARAM, lparam: LPARAM, hmainmenu: HMENU, hinst: HINSTANCE, hwndstatus: HWND, lpwids: Long) {
}

public actual fun OpenThemeData(hwnd: HWND, pszclasslist: PCWSTR): HTHEME =
    0L

public actual fun OpenThemeDataEx(hwnd: HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME =
    0L

public actual fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): LRESULT =
    0L

public actual fun PropertySheetA(param0: Long): Long =
    0L

public actual fun PropertySheetW(param0: Long): Long =
    0L

public actual fun RegisterPointerDeviceNotifications(window: HWND, notifyrange: BOOL): BOOL =
    0

public actual fun RegisterTouchHitTestingWindow(hwnd: HWND, value: UInt): BOOL =
    0

public actual fun SetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int =
    0

public actual fun SetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int =
    0

public actual fun SetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL =
    0

public actual fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS) {
}

public actual fun SetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL =
    0

public actual fun SetWindowTheme(hwnd: HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT =
    0

public actual fun SetWindowThemeAttribute(hwnd: HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT =
    0

public actual fun ShowHideMenuCtl(hwnd: HWND, uflags: ULong, lpinfo: Long): BOOL =
    0

public actual fun ShowScrollBar(hwnd: HWND, wbar: SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL =
    0

public actual fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL =
    0

public actual fun TaskDialog(hwndowner: HWND, hinstance: HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT =
    0

public actual fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT =
    0

public actual fun UninitializeFlatSB(param0: HWND): HRESULT =
    0

public actual fun UpdatePanningFeedback(hwnd: HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL =
    0
