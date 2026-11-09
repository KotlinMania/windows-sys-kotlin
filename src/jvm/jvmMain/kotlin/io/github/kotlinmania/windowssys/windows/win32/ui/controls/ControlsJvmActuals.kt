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

private object WindowsWin32UiControlsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BeginBufferedAnimation(hwnd: Long, hdctarget: Long, prctarget: Long, dwformat: Int, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BeginBufferedPaint(hdctarget: Long, prctarget: Long, dwformat: Int, ppaintparams: Long, phdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BeginPanningFeedback(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BufferedPaintClear(hbufferedpaint: Long, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BufferedPaintInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation(hwnd: Long, hdctarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_BufferedPaintUnInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CheckDlgButton(hdlg: Long, nidbutton: Int, ucheck: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CheckRadioButton(hdlg: Long, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CloseThemeData(htheme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreateMappedBitmap(hinstance: Long, idbitmap: Long, wflags: Int, lpcolormap: Long, inummaps: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreatePropertySheetPageA(constpropsheetpagepointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreatePropertySheetPageW(constpropsheetpagepointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreateStatusWindowA(style: Int, lpsztext: Long, hwndparent: Long, wid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreateStatusWindowW(style: Int, lpsztext: Long, hwndparent: Long, wid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice(pointertype: Int, maxcount: Int, mode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreateToolbarEx(hwnd: Long, ws: Int, wid: Int, nbitmaps: Int, hbminst: Long, wbmid: Long, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_CreateUpDownControl(dwstyle: Int, x: Int, y: Int, cx: Int, cy: Int, hparent: Long, nid: Int, hinst: Long, hbuddy: Long, nupper: Int, nlower: Int, npos: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Clone(hdpa: Long, hdpanew: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Create(citemgrow: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_CreateEx(cpgrow: Int, hheap: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs(hdpa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_DeletePtr(hdpa: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Destroy(hdpa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_DestroyCallback(hdpa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_EnumCallback(hdpa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_GetPtr(hdpa: Long, i: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_GetPtrIndex(hdpa: Long, p: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_GetSize(hdpa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Grow(pdpa: Long, cp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_InsertPtr(hdpa: Long, i: Int, p: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_LoadStream(phdpa: Long, pfn: Long, pstream: Long, pvinstdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Merge(hdpadest: Long, hdpasrc: Long, dwflags: Int, pfncompare: Long, pfnmerge: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_SaveStream(hdpa: Long, pfn: Long, pstream: Long, pvinstdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Search(hdpa: Long, pfind: Long, istart: Int, pfncompare: Long, lparam: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_SetPtr(hdpa: Long, i: Int, p: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DPA_Sort(hdpa: Long, pfncompare: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_Clone(hdsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_Create(cbitem: Int, citemgrow: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_DeleteAllItems(hdsa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_DeleteItem(hdsa: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_Destroy(hdsa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_DestroyCallback(hdsa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_EnumCallback(hdsa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_GetItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_GetItemPtr(hdsa: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_GetSize(hdsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_InsertItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_SetItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DSA_Sort(pdsa: Long, pfncompare: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DestroyPropertySheetPage(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice(device: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirListA(hdlg: Long, lppathspec: Long, nidlistbox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirListComboBoxA(hdlg: Long, lppathspec: Long, nidcombobox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirListComboBoxW(hdlg: Long, lppathspec: Long, nidcombobox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirListW(hdlg: Long, lppathspec: Long, nidlistbox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA(hwnddlg: Long, lpstring: Long, cchout: Int, idcombobox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW(hwnddlg: Long, lpstring: Long, cchout: Int, idcombobox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirSelectExA(hwnddlg: Long, lpstring: Long, chcount: Int, idlistbox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DlgDirSelectExW(hwnddlg: Long, lpstring: Long, chcount: Int, idlistbox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawInsert(handparent: Long, hlb: Long, nitem: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawShadowText(hdc: Long, psztext: Long, cch: Int, prc: Long, dwflags: Int, crtext: Int, crshadow: Int, ixoffset: Int, iyoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawStatusTextA(hdc: Long, lprc: Long, psztext: Long, uflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawStatusTextW(hdc: Long, lprc: Long, psztext: Long, uflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeBackground(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeEdge(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pdestrect: Long, uedge: Int, uflags: Int, pcontentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeIcon(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, himl: Long, iimageindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeParentBackground(hwnd: Long, hdc: Long, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx(hwnd: Long, hdc: Long, dwflags: Int, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeText(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchtext: Int, dwtextflags: Int, dwtextflags2: Int, prect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_DrawThemeTextEx(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchtext: Int, dwtextflags: Int, prect: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EnableScrollBar(hwnd: Long, wsbflags: Int, warrows: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EnableThemeDialogTexture(hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EnableTheming(fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EndBufferedAnimation(hbpanimation: Long, fupdatetarget: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EndPanningFeedback(hwnd: Long, fanimateback: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon(numvertices: Int, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo(param0: Long, code: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos(param0: Long, code: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp(param0: Long, propindex: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange(param0: Long, code: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo(param0: Long, code: Int, psi: Long, fredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos(param0: Long, code: Int, pos: Int, fredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp(param0: Long, index: Int, newvalue: Long, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange(param0: Long, code: Int, min: Int, max: Int, fredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar(param0: Long, code: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetBufferedPaintDC(hbufferedpaint: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC(hbufferedpaint: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetComboBoxInfo(hwndcombo: Long, pcbi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetCurrentThemeName(pszthemefilename: Long, cchmaxnamechars: Int, pszcolorbuff: Long, cchmaxcolorchars: Int, pszsizebuff: Long, cchmaxsizechars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetEffectiveClientRect(hwnd: Long, lprc: Long, lpinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetListBoxInfo(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetMUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeAnimationProperty(htheme: Long, istoryboardid: Int, itargetid: Int, eproperty: Int, pvproperty: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeAnimationTransform(htheme: Long, istoryboardid: Int, itargetid: Int, dwtransformindex: Int, ptransform: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeAppProperties(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, pregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeBitmap(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, dwflags: Int, phbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeBool(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeColor(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty(pszthemename: Long, pszpropertyname: Long, pszvaluebuff: Long, cchmaxvalchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeEnumValue(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeFilename(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Long, cchmaxbuffchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeFont(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeInt(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeIntList(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeMargins(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeMetric(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemePartSize(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prc: Long, esize: Int, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemePosition(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemePropertyOrigin(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeRect(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeStream(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeString(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Long, cchmaxbuffchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysBool(htheme: Long, iboolid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysColor(htheme: Long, icolorid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysColorBrush(htheme: Long, icolorid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysFont(htheme: Long, ifontid: Int, plf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysInt(htheme: Long, iintid: Int, pivalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysSize(htheme: Long, isizeid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeSysString(htheme: Long, istringid: Int, pszstringbuff: Long, cchmaxstringchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeTextExtent(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchcharcount: Int, dwtextflags: Int, pboundingrect: Long, pextentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeTextMetrics(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ptm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeTimingFunction(htheme: Long, itimingfunctionid: Int, ptimingfunction: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetThemeTransitionDuration(htheme: Long, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting(hwnd: Long, feedback: Int, dwflags: Int, psize: Long, config: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_GetWindowTheme(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface(himl: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Add(himl: Long, hbmimage: Long, hbmmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_AddMasked(himl: Long, hbmimage: Long, crmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_BeginDrag(himltrack: Long, itrack: Int, dxhotspot: Int, dyhotspot: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Copy(himldst: Long, idst: Int, himlsrc: Long, isrc: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Create(cx: Int, cy: Int, flags: Int, cinitial: Int, cgrow: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Destroy(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_DragEnter(hwndlock: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_DragLeave(hwndlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_DragMove(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_DragShowNolock(fshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Draw(himl: Long, i: Int, hdcdst: Long, x: Int, y: Int, fstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_DrawEx(himl: Long, i: Int, hdcdst: Long, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Int, rgbfg: Int, fstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_DrawIndirect(pimldp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Duplicate(himl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_EndDrag()

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_GetBkColor(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_GetDragImage(ppt: Long, ppthotspot: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_GetIcon(himl: Long, i: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_GetIconSize(himl: Long, cx: Long, cy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_GetImageCount(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_GetImageInfo(himl: Long, i: Int, pimageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_LoadImageA(hi: Long, lpbmp: Long, cx: Int, cgrow: Int, crmask: Int, utype: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_LoadImageW(hi: Long, lpbmp: Long, cx: Int, cgrow: Int, crmask: Int, utype: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Merge(himl1: Long, i1: Int, himl2: Long, i2: Int, dx: Int, dy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Read(pstm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_ReadEx(dwflags: Int, pstm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Remove(himl: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Replace(himl: Long, i: Int, hbmimage: Long, hbmmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon(himl: Long, i: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_SetBkColor(himl: Long, clrbk: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage(himldrag: Long, idrag: Int, dxhotspot: Int, dyhotspot: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_SetIconSize(himl: Long, cx: Int, cy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_SetImageCount(himl: Long, unewcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage(himl: Long, iimage: Int, ioverlay: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_Write(himl: Long, pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ImageList_WriteEx(himl: Long, dwflags: Int, pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_InitCommonControls()

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_InitCommonControlsEx(picce: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_InitMUILanguage(uilang: Short)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_InitializeFlatSB(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsAppThemed(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsCharLowerW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsCompositionActive(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsDlgButtonChecked(hdlg: Long, nidbutton: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsThemeActive(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent(htheme: Long, ipartid: Int, istateid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_IsThemePartDefined(htheme: Long, ipartid: Int, istateid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_LoadIconMetric(hinst: Long, pszname: Long, lims: Int, phico: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_LoadIconWithScaleDown(hinst: Long, pszname: Long, cx: Int, cy: Int, phico: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_MakeDragList(hlb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_MenuHelp(umsg: Int, wparam: Long, lparam: Long, hmainmenu: Long, hinst: Long, hwndstatus: Long, lpwids: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_OpenThemeData(hwnd: Long, pszclasslist: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_OpenThemeDataEx(hwnd: Long, pszclasslist: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_PropertySheetA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_PropertySheetW(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications(window: Long, notifyrange: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow(hwnd: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetScrollInfo(hwnd: Long, nbar: Int, lpsi: Long, redraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetScrollPos(hwnd: Long, nbar: Int, npos: Int, bredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetScrollRange(hwnd: Long, nbar: Int, nminpos: Int, nmaxpos: Int, bredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetThemeAppProperties(dwflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting(hwnd: Long, feedback: Int, dwflags: Int, size: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetWindowTheme(hwnd: Long, pszsubappname: Long, pszsubidlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_SetWindowThemeAttribute(hwnd: Long, eattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ShowHideMenuCtl(hwnd: Long, uflags: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_ShowScrollBar(hwnd: Long, wbar: Int, bshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_Str_SetPtrW(ppsz: Long, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_TaskDialog(hwndowner: Long, hinstance: Long, pszwindowtitle: Long, pszmaininstruction: Long, pszcontent: Long, dwcommonbuttons: Int, pszicon: Long, pnbutton: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_UninitializeFlatSB(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_UpdatePanningFeedback(hwnd: Long, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Int): Int
}

public actual fun BeginBufferedAnimation(hwnd: HWND, hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BeginBufferedAnimation(hwnd, hdctarget, prctarget, dwformat, ppaintparams, panimationparams, phdcfrom, phdcto)

public actual fun BeginBufferedPaint(hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BeginBufferedPaint(hdctarget, prctarget, dwformat, ppaintparams, phdc)

public actual fun BeginPanningFeedback(hwnd: HWND): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BeginPanningFeedback(hwnd)

public actual fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BufferedPaintClear(hbufferedpaint, prc)

public actual fun BufferedPaintInit(): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BufferedPaintInit()

public actual fun BufferedPaintRenderAnimation(hwnd: HWND, hdctarget: HDC): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BufferedPaintRenderAnimation(hwnd, hdctarget)

public actual fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BufferedPaintSetAlpha(hbufferedpaint, prc, alpha.toByte())

public actual fun BufferedPaintStopAllAnimations(hwnd: HWND): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BufferedPaintStopAllAnimations(hwnd)

public actual fun BufferedPaintUnInit(): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_BufferedPaintUnInit()

public actual fun CheckDlgButton(hdlg: HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CheckDlgButton(hdlg, nidbutton, ucheck.toInt())

public actual fun CheckRadioButton(hdlg: HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CheckRadioButton(hdlg, nidfirstbutton, nidlastbutton, nidcheckbutton)

public actual fun CloseThemeData(htheme: HTHEME): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CloseThemeData(htheme)

public actual fun CreateMappedBitmap(hinstance: HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): HBITMAP =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreateMappedBitmap(hinstance, idbitmap, wflags.toInt(), lpcolormap, inummaps)

public actual fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreatePropertySheetPageA(constpropsheetpagepointer)

public actual fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreatePropertySheetPageW(constpropsheetpagepointer)

public actual fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: HWND, wid: UInt): HWND =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreateStatusWindowA(style, lpsztext, hwndparent, wid.toInt())

public actual fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: HWND, wid: UInt): HWND =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreateStatusWindowW(style, lpsztext, hwndparent, wid.toInt())

public actual fun CreateSyntheticPointerDevice(pointertype: POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreateSyntheticPointerDevice(pointertype, maxcount.toInt(), mode)

public actual fun CreateToolbarEx(hwnd: HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): HWND =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreateToolbarEx(hwnd, ws.toInt(), wid.toInt(), nbitmaps, hbminst, wbmid.toLong(), lpbuttons, inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt())

public actual fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: HWND, nid: Int, hinst: HINSTANCE, hbuddy: HWND, nupper: Int, nlower: Int, npos: Int): HWND =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_CreateUpDownControl(dwstyle.toInt(), x, y, cx, cy, hparent, nid, hinst, hbuddy, nupper, nlower, npos)

public actual fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Clone(hdpa, hdpanew)

public actual fun DPA_Create(citemgrow: Int): HDPA =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Create(citemgrow)

public actual fun DPA_CreateEx(cpgrow: Int, hheap: HANDLE): HDPA =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_CreateEx(cpgrow, hheap)

public actual fun DPA_DeleteAllPtrs(hdpa: HDPA): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_DeleteAllPtrs(hdpa)

public actual fun DPA_DeletePtr(hdpa: HDPA, i: Int): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_DeletePtr(hdpa, i)

public actual fun DPA_Destroy(hdpa: HDPA): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Destroy(hdpa)

public actual fun DPA_DestroyCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_DestroyCallback(hdpa, pfncb.toLong(), pdata)
}

public actual fun DPA_EnumCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_EnumCallback(hdpa, pfncb.toLong(), pdata)
}

public actual fun DPA_GetPtr(hdpa: HDPA, i: Long): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_GetPtr(hdpa, i)

public actual fun DPA_GetPtrIndex(hdpa: HDPA, p: Long): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_GetPtrIndex(hdpa, p)

public actual fun DPA_GetSize(hdpa: HDPA): ULong =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_GetSize(hdpa).toULong()

public actual fun DPA_Grow(pdpa: HDPA, cp: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Grow(pdpa, cp)

public actual fun DPA_InsertPtr(hdpa: HDPA, i: Int, p: Long): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_InsertPtr(hdpa, i, p)

public actual fun DPA_LoadStream(phdpa: Long, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_LoadStream(phdpa, pfn.toLong(), pstream, pvinstdata)

public actual fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: LPARAM): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Merge(hdpadest, hdpasrc, dwflags.toInt(), pfncompare.toLong(), pfnmerge.toLong(), lparam)

public actual fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_SaveStream(hdpa, pfn.toLong(), pstream, pvinstdata)

public actual fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: LPARAM, options: UInt): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Search(hdpa, pfind, istart, pfncompare.toLong(), lparam, options.toInt())

public actual fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_SetPtr(hdpa, i, p)

public actual fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DPA_Sort(hdpa, pfncompare.toLong(), lparam)

public actual fun DSA_Clone(hdsa: HDSA): HDSA =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_Clone(hdsa)

public actual fun DSA_Create(cbitem: Int, citemgrow: Int): HDSA =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_Create(cbitem, citemgrow)

public actual fun DSA_DeleteAllItems(hdsa: HDSA): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_DeleteAllItems(hdsa)

public actual fun DSA_DeleteItem(hdsa: HDSA, i: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_DeleteItem(hdsa, i)

public actual fun DSA_Destroy(hdsa: HDSA): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_Destroy(hdsa)

public actual fun DSA_DestroyCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_DestroyCallback(hdsa, pfncb.toLong(), pdata)
}

public actual fun DSA_EnumCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_EnumCallback(hdsa, pfncb.toLong(), pdata)
}

public actual fun DSA_GetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_GetItem(hdsa, i, pitem)

public actual fun DSA_GetItemPtr(hdsa: HDSA, i: Int): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_GetItemPtr(hdsa, i)

public actual fun DSA_GetSize(hdsa: HDSA): ULong =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_GetSize(hdsa).toULong()

public actual fun DSA_InsertItem(hdsa: HDSA, i: Int, pitem: Long): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_InsertItem(hdsa, i, pitem)

public actual fun DSA_SetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_SetItem(hdsa, i, pitem)

public actual fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DSA_Sort(pdsa, pfncompare.toLong(), lparam)

public actual fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DestroyPropertySheetPage(param0)

public actual fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DestroySyntheticPointerDevice(device)
}

public actual fun DlgDirListA(hdlg: HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirListA(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype.toInt())

public actual fun DlgDirListComboBoxA(hdlg: HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirListComboBoxA(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype.toInt())

public actual fun DlgDirListComboBoxW(hdlg: HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirListComboBoxW(hdlg, lppathspec, nidcombobox, nidstaticpath, ufiletype.toInt())

public actual fun DlgDirListW(hdlg: HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirListW(hdlg, lppathspec, nidlistbox, nidstaticpath, ufiletype.toInt())

public actual fun DlgDirSelectComboBoxExA(hwnddlg: HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExA(hwnddlg, lpstring, cchout, idcombobox)

public actual fun DlgDirSelectComboBoxExW(hwnddlg: HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirSelectComboBoxExW(hwnddlg, lpstring, cchout, idcombobox)

public actual fun DlgDirSelectExA(hwnddlg: HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirSelectExA(hwnddlg, lpstring, chcount, idlistbox)

public actual fun DlgDirSelectExW(hwnddlg: HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DlgDirSelectExW(hwnddlg, lpstring, chcount, idlistbox)

public actual fun DrawInsert(handparent: HWND, hlb: HWND, nitem: Int) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawInsert(handparent, hlb, nitem)
}

public actual fun DrawShadowText(hdc: HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: COLORREF, crshadow: COLORREF, ixoffset: Int, iyoffset: Int): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawShadowText(hdc, psztext, cch.toInt(), prc, dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset)

public actual fun DrawStatusTextA(hdc: HDC, lprc: Long, psztext: PCSTR, uflags: UInt) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawStatusTextA(hdc, lprc, psztext, uflags.toInt())
}

public actual fun DrawStatusTextW(hdc: HDC, lprc: Long, psztext: PCWSTR, uflags: UInt) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawStatusTextW(hdc, lprc, psztext, uflags.toInt())
}

public actual fun DrawThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeBackground(htheme, hdc, ipartid, istateid, prect, pcliprect)

public actual fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeBackgroundEx(htheme, hdc, ipartid, istateid, prect, poptions)

public actual fun DrawThemeEdge(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: DRAWEDGE_FLAGS, uflags: DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeEdge(htheme, hdc, ipartid, istateid, pdestrect, uedge.toInt(), uflags.toInt(), pcontentrect)

public actual fun DrawThemeIcon(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeIcon(htheme, hdc, ipartid, istateid, prect, himl, iimageindex)

public actual fun DrawThemeParentBackground(hwnd: HWND, hdc: HDC, prc: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeParentBackground(hwnd, hdc, prc)

public actual fun DrawThemeParentBackgroundEx(hwnd: HWND, hdc: HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeParentBackgroundEx(hwnd, hdc, dwflags.toInt(), prc)

public actual fun DrawThemeText(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeText(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), prect)

public actual fun DrawThemeTextEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_DrawThemeTextEx(htheme, hdc, ipartid, istateid, psztext, cchtext, dwtextflags.toInt(), prect, poptions)

public actual fun EnableScrollBar(hwnd: HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EnableScrollBar(hwnd, wsbflags.toInt(), warrows.toInt())

public actual fun EnableThemeDialogTexture(hwnd: HWND, dwflags: UInt): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EnableThemeDialogTexture(hwnd, dwflags.toInt())

public actual fun EnableTheming(fenable: BOOL): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EnableTheming(fenable)

public actual fun EndBufferedAnimation(hbpanimation: Long, fupdatetarget: BOOL): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EndBufferedAnimation(hbpanimation, fupdatetarget)

public actual fun EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: BOOL): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EndBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun EndPanningFeedback(hwnd: HWND, fanimateback: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EndPanningFeedback(hwnd, fanimateback)

public actual fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EvaluateProximityToPolygon(numvertices.toInt(), controlpolygon, phittestinginput, pproximityeval)

public actual fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_EvaluateProximityToRect(controlboundingbox, phittestinginput, pproximityeval)

public actual fun FlatSB_EnableScrollBar(param0: HWND, param1: Int, param2: UInt): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_EnableScrollBar(param0, param1, param2.toInt())

public actual fun FlatSB_GetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_GetScrollInfo(param0, code, param2)

public actual fun FlatSB_GetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_GetScrollPos(param0, code)

public actual fun FlatSB_GetScrollProp(param0: HWND, propindex: WSB_PROP, param2: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_GetScrollProp(param0, propindex, param2)

public actual fun FlatSB_GetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_GetScrollRange(param0, code, param2, param3)

public actual fun FlatSB_SetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_SetScrollInfo(param0, code, psi, fredraw)

public actual fun FlatSB_SetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_SetScrollPos(param0, code, pos, fredraw)

public actual fun FlatSB_SetScrollProp(param0: HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_SetScrollProp(param0, index.toInt(), newvalue, param3)

public actual fun FlatSB_SetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_SetScrollRange(param0, code, min, max, fredraw)

public actual fun FlatSB_ShowScrollBar(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_FlatSB_ShowScrollBar(param0, code, param2)

public actual fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetBufferedPaintBits(hbufferedpaint, ppbbuffer, pcxrow)

public actual fun GetBufferedPaintDC(hbufferedpaint: Long): HDC =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetBufferedPaintDC(hbufferedpaint)

public actual fun GetBufferedPaintTargetDC(hbufferedpaint: Long): HDC =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetBufferedPaintTargetDC(hbufferedpaint)

public actual fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetBufferedPaintTargetRect(hbufferedpaint, prc)

public actual fun GetComboBoxInfo(hwndcombo: HWND, pcbi: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetComboBoxInfo(hwndcombo, pcbi)

public actual fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetCurrentThemeName(pszthemefilename, cchmaxnamechars, pszcolorbuff, cchmaxcolorchars, pszsizebuff, cchmaxsizechars)

public actual fun GetEffectiveClientRect(hwnd: HWND, lprc: Long, lpinfo: Long) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetEffectiveClientRect(hwnd, lprc, lpinfo)
}

public actual fun GetListBoxInfo(hwnd: HWND): UInt =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetListBoxInfo(hwnd).toUInt()

public actual fun GetMUILanguage(): UShort =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetMUILanguage().toUShort()

public actual fun GetThemeAnimationProperty(htheme: HTHEME, istoryboardid: Int, itargetid: Int, eproperty: TA_PROPERTY, pvproperty: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeAnimationProperty(htheme, istoryboardid, itargetid, eproperty, pvproperty, cbsize.toInt(), pcbsizeout)

public actual fun GetThemeAnimationTransform(htheme: HTHEME, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeAnimationTransform(htheme, istoryboardid, itargetid, dwtransformindex.toInt(), ptransform, cbsize.toInt(), pcbsizeout)

public actual fun GetThemeAppProperties(): SET_THEME_APP_PROPERTIES_FLAGS =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeAppProperties().toUInt()

public actual fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeBackgroundContentRect(htheme, hdc, ipartid, istateid, pboundingrect, pcontentrect)

public actual fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeBackgroundExtent(htheme, hdc, ipartid, istateid, pcontentrect, pextentrect)

public actual fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeBackgroundRegion(htheme, hdc, ipartid, istateid, prect, pregion)

public actual fun GetThemeBitmap(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GET_THEME_BITMAP_FLAGS, phbitmap: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeBitmap(htheme, ipartid, istateid, ipropid, dwflags.toInt(), phbitmap)

public actual fun GetThemeBool(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeBool(htheme, ipartid, istateid, ipropid, pfval)

public actual fun GetThemeColor(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeColor(htheme, ipartid, istateid, ipropid, pcolor)

public actual fun GetThemeDocumentationProperty(pszthemename: PCWSTR, pszpropertyname: PCWSTR, pszvaluebuff: PWSTR, cchmaxvalchars: Int): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeDocumentationProperty(pszthemename, pszpropertyname, pszvaluebuff, cchmaxvalchars)

public actual fun GetThemeEnumValue(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeEnumValue(htheme, ipartid, istateid, ipropid, pival)

public actual fun GetThemeFilename(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: PWSTR, cchmaxbuffchars: Int): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeFilename(htheme, ipartid, istateid, ipropid, pszthemefilename, cchmaxbuffchars)

public actual fun GetThemeFont(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeFont(htheme, hdc, ipartid, istateid, ipropid, pfont)

public actual fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeInt(htheme, ipartid, istateid, ipropid, pival)

public actual fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeIntList(htheme, ipartid, istateid, ipropid, pintlist)

public actual fun GetThemeMargins(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeMargins(htheme, hdc, ipartid, istateid, ipropid, prc, pmargins)

public actual fun GetThemeMetric(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeMetric(htheme, hdc, ipartid, istateid, ipropid, pival)

public actual fun GetThemePartSize(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemePartSize(htheme, hdc, ipartid, istateid, prc, esize, psz)

public actual fun GetThemePosition(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemePosition(htheme, ipartid, istateid, ipropid, ppoint)

public actual fun GetThemePropertyOrigin(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemePropertyOrigin(htheme, ipartid, istateid, ipropid, porigin)

public actual fun GetThemeRect(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeRect(htheme, ipartid, istateid, ipropid, prect)

public actual fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: HINSTANCE): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeStream(htheme, ipartid, istateid, ipropid, ppvstream, pcbstream, hinst)

public actual fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeString(htheme, ipartid, istateid, ipropid, pszbuff, cchmaxbuffchars)

public actual fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysBool(htheme, iboolid)

public actual fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): COLORREF =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysColor(htheme, icolorid).toUInt()

public actual fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): HBRUSH =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysColorBrush(htheme, icolorid)

public actual fun GetThemeSysFont(htheme: HTHEME, ifontid: Int, plf: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysFont(htheme, ifontid, plf)

public actual fun GetThemeSysInt(htheme: HTHEME, iintid: Int, pivalue: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysInt(htheme, iintid, pivalue)

public actual fun GetThemeSysSize(htheme: HTHEME, isizeid: Int): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysSize(htheme, isizeid)

public actual fun GetThemeSysString(htheme: HTHEME, istringid: Int, pszstringbuff: PWSTR, cchmaxstringchars: Int): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeSysString(htheme, istringid, pszstringbuff, cchmaxstringchars)

public actual fun GetThemeTextExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeTextExtent(htheme, hdc, ipartid, istateid, psztext, cchcharcount, dwtextflags.toInt(), pboundingrect, pextentrect)

public actual fun GetThemeTextMetrics(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeTextMetrics(htheme, hdc, ipartid, istateid, ptm)

public actual fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeTimingFunction(htheme, itimingfunctionid, ptimingfunction, cbsize.toInt(), pcbsizeout)

public actual fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetThemeTransitionDuration(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration)

public actual fun GetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetWindowFeedbackSetting(hwnd, feedback, dwflags.toInt(), psize, config)

public actual fun GetWindowTheme(hwnd: HWND): HTHEME =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_GetWindowTheme(hwnd)

public actual fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_HIMAGELIST_QueryInterface(himl, riid, ppv)

public actual fun HitTestThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: HRGN, pttest: POINT, pwhittestcode: Long): HRESULT =
    0

public actual fun ImageList_Add(himl: HIMAGELIST, hbmimage: HBITMAP, hbmmask: HBITMAP): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Add(himl, hbmimage, hbmmask)

public actual fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: HBITMAP, crmask: COLORREF): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_AddMasked(himl, hbmimage, crmask.toInt())

public actual fun ImageList_BeginDrag(himltrack: HIMAGELIST, itrack: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_BeginDrag(himltrack, itrack, dxhotspot, dyhotspot)

public actual fun ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_CoCreateInstance(rclsid, punkouter, riid, ppv)

public actual fun ImageList_Copy(himldst: HIMAGELIST, idst: Int, himlsrc: HIMAGELIST, isrc: Int, uflags: IMAGE_LIST_COPY_FLAGS): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Copy(himldst, idst, himlsrc, isrc, uflags.toInt())

public actual fun ImageList_Create(cx: Int, cy: Int, flags: IMAGELIST_CREATION_FLAGS, cinitial: Int, cgrow: Int): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Create(cx, cy, flags.toInt(), cinitial, cgrow)

public actual fun ImageList_Destroy(himl: HIMAGELIST): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Destroy(himl)

public actual fun ImageList_DragEnter(hwndlock: HWND, x: Int, y: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_DragEnter(hwndlock, x, y)

public actual fun ImageList_DragLeave(hwndlock: HWND): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_DragLeave(hwndlock)

public actual fun ImageList_DragMove(x: Int, y: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_DragMove(x, y)

public actual fun ImageList_DragShowNolock(fshow: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_DragShowNolock(fshow)

public actual fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Draw(himl, i, hdcdst, x, y, fstyle.toInt())

public actual fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: COLORREF, rgbfg: COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_DrawEx(himl, i, hdcdst, x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt())

public actual fun ImageList_DrawIndirect(pimldp: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_DrawIndirect(pimldp)

public actual fun ImageList_Duplicate(himl: HIMAGELIST): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Duplicate(himl)

public actual fun ImageList_EndDrag() {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_EndDrag()
}

public actual fun ImageList_GetBkColor(himl: HIMAGELIST): COLORREF =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_GetBkColor(himl).toUInt()

public actual fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_GetDragImage(ppt, ppthotspot)

public actual fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): HICON =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_GetIcon(himl, i, flags.toInt())

public actual fun ImageList_GetIconSize(himl: HIMAGELIST, cx: Long, cy: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_GetIconSize(himl, cx, cy)

public actual fun ImageList_GetImageCount(himl: HIMAGELIST): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_GetImageCount(himl)

public actual fun ImageList_GetImageInfo(himl: HIMAGELIST, i: Int, pimageinfo: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_GetImageInfo(himl, i, pimageinfo)

public actual fun ImageList_LoadImageA(hi: HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_LoadImageA(hi, lpbmp, cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt())

public actual fun ImageList_LoadImageW(hi: HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_LoadImageW(hi, lpbmp, cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt())

public actual fun ImageList_Merge(himl1: HIMAGELIST, i1: Int, himl2: HIMAGELIST, i2: Int, dx: Int, dy: Int): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Merge(himl1, i1, himl2, i2, dx, dy)

public actual fun ImageList_Read(pstm: Long): HIMAGELIST =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Read(pstm)

public actual fun ImageList_ReadEx(dwflags: UInt, pstm: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_ReadEx(dwflags.toInt(), pstm, riid, ppv)

public actual fun ImageList_Remove(himl: HIMAGELIST, i: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Remove(himl, i)

public actual fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: HBITMAP, hbmmask: HBITMAP): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Replace(himl, i, hbmimage, hbmmask)

public actual fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: HICON): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_ReplaceIcon(himl, i, hicon)

public actual fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: COLORREF): COLORREF =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_SetBkColor(himl, clrbk.toInt()).toUInt()

public actual fun ImageList_SetDragCursorImage(himldrag: HIMAGELIST, idrag: Int, dxhotspot: Int, dyhotspot: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_SetDragCursorImage(himldrag, idrag, dxhotspot, dyhotspot)

public actual fun ImageList_SetIconSize(himl: HIMAGELIST, cx: Int, cy: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_SetIconSize(himl, cx, cy)

public actual fun ImageList_SetImageCount(himl: HIMAGELIST, unewcount: UInt): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_SetImageCount(himl, unewcount.toInt())

public actual fun ImageList_SetOverlayImage(himl: HIMAGELIST, iimage: Int, ioverlay: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_SetOverlayImage(himl, iimage, ioverlay)

public actual fun ImageList_Write(himl: HIMAGELIST, pstm: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_Write(himl, pstm)

public actual fun ImageList_WriteEx(himl: HIMAGELIST, dwflags: IMAGE_LIST_WRITE_STREAM_FLAGS, pstm: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ImageList_WriteEx(himl, dwflags.toInt(), pstm)

public actual fun InitCommonControls() {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_InitCommonControls()
}

public actual fun InitCommonControlsEx(picce: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_InitCommonControlsEx(picce)

public actual fun InitMUILanguage(uilang: UShort) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_InitMUILanguage(uilang.toShort())
}

public actual fun InitializeFlatSB(param0: HWND): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_InitializeFlatSB(param0)

public actual fun IsAppThemed(): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsAppThemed()

public actual fun IsCharLowerW(ch: UShort): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsCharLowerW(ch.toShort())

public actual fun IsCompositionActive(): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsCompositionActive()

public actual fun IsDlgButtonChecked(hdlg: HWND, nidbutton: Int): UInt =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsDlgButtonChecked(hdlg, nidbutton).toUInt()

public actual fun IsThemeActive(): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsThemeActive()

public actual fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsThemeBackgroundPartiallyTransparent(htheme, ipartid, istateid)

public actual fun IsThemeDialogTextureEnabled(hwnd: HWND): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsThemeDialogTextureEnabled(hwnd)

public actual fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_IsThemePartDefined(htheme, ipartid, istateid)

public actual fun LBItemFromPt(hlb: HWND, pt: POINT, bautoscroll: BOOL): Int =
    0

public actual fun LoadIconMetric(hinst: HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_LoadIconMetric(hinst, pszname, lims, phico)

public actual fun LoadIconWithScaleDown(hinst: HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_LoadIconWithScaleDown(hinst, pszname, cx, cy, phico)

public actual fun MakeDragList(hlb: HWND): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_MakeDragList(hlb)

public actual fun MenuHelp(umsg: UInt, wparam: WPARAM, lparam: LPARAM, hmainmenu: HMENU, hinst: HINSTANCE, hwndstatus: HWND, lpwids: Long) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_MenuHelp(umsg.toInt(), wparam.toLong(), lparam, hmainmenu, hinst, hwndstatus, lpwids)
}

public actual fun OpenThemeData(hwnd: HWND, pszclasslist: PCWSTR): HTHEME =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_OpenThemeData(hwnd, pszclasslist)

public actual fun OpenThemeDataEx(hwnd: HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_OpenThemeDataEx(hwnd, pszclasslist, dwflags.toInt())

public actual fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): LRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_PackTouchHitTestingProximityEvaluation(phittestinginput, pproximityeval)

public actual fun PropertySheetA(param0: Long): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_PropertySheetA(param0)

public actual fun PropertySheetW(param0: Long): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_PropertySheetW(param0)

public actual fun RegisterPointerDeviceNotifications(window: HWND, notifyrange: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_RegisterPointerDeviceNotifications(window, notifyrange)

public actual fun RegisterTouchHitTestingWindow(hwnd: HWND, value: UInt): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_RegisterTouchHitTestingWindow(hwnd, value.toInt())

public actual fun SetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetScrollInfo(hwnd, nbar, lpsi, redraw)

public actual fun SetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetScrollPos(hwnd, nbar, npos, bredraw)

public actual fun SetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetScrollRange(hwnd, nbar, nminpos, nmaxpos, bredraw)

public actual fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetThemeAppProperties(dwflags.toInt())
}

public actual fun SetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetWindowFeedbackSetting(hwnd, feedback, dwflags.toInt(), size.toInt(), configuration)

public actual fun SetWindowTheme(hwnd: HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetWindowTheme(hwnd, pszsubappname, pszsubidlist)

public actual fun SetWindowThemeAttribute(hwnd: HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_SetWindowThemeAttribute(hwnd, eattribute, pvattribute, cbattribute.toInt())

public actual fun ShowHideMenuCtl(hwnd: HWND, uflags: ULong, lpinfo: Long): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ShowHideMenuCtl(hwnd, uflags.toLong(), lpinfo)

public actual fun ShowScrollBar(hwnd: HWND, wbar: SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_ShowScrollBar(hwnd, wbar, bshow)

public actual fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_Str_SetPtrW(ppsz, psz)

public actual fun TaskDialog(hwndowner: HWND, hinstance: HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_TaskDialog(hwndowner, hinstance, pszwindowtitle, pszmaininstruction, pszcontent, dwcommonbuttons, pszicon, pnbutton)

public actual fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_TaskDialogIndirect(ptaskconfig, pnbutton, pnradiobutton, pfverificationflagchecked)

public actual fun UninitializeFlatSB(param0: HWND): HRESULT =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_UninitializeFlatSB(param0)

public actual fun UpdatePanningFeedback(hwnd: HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_UpdatePanningFeedback(hwnd, ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia)
