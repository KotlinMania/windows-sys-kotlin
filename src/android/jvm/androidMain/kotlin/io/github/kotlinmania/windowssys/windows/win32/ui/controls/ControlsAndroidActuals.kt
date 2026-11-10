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

private object WindowsWin32UiControlsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_beginBufferedAnimation(hwnd: Long, hdctarget: Long, prctarget: Long, dwformat: Int, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_beginBufferedPaint(hdctarget: Long, prctarget: Long, dwformat: Int, ppaintparams: Long, phdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_beginPanningFeedback(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_bufferedPaintClear(hbufferedpaint: Long, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_bufferedPaintInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation(hwnd: Long, hdctarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_bufferedPaintUnInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_checkDlgButton(hdlg: Long, nidbutton: Int, ucheck: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_checkRadioButton(hdlg: Long, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_closeThemeData(htheme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createMappedBitmap(hinstance: Long, idbitmap: Long, wflags: Int, lpcolormap: Long, inummaps: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createPropertySheetPageA(constpropsheetpagepointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createPropertySheetPageW(constpropsheetpagepointer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createStatusWindowA(style: Int, lpsztext: Long, hwndparent: Long, wid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createStatusWindowW(style: Int, lpsztext: Long, hwndparent: Long, wid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createSyntheticPointerDevice(pointertype: Int, maxcount: Int, mode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createToolbarEx(hwnd: Long, ws: Int, wid: Int, nbitmaps: Int, hbminst: Long, wbmid: Long, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_createUpDownControl(dwstyle: Int, x: Int, y: Int, cx: Int, cy: Int, hparent: Long, nid: Int, hinst: Long, hbuddy: Long, nupper: Int, nlower: Int, npos: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaClone(hdpa: Long, hdpanew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaCreate(citemgrow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaCreateEx(cpgrow: Int, hheap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs(hdpa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaDeletePtr(hdpa: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaDestroy(hdpa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaDestroyCallback(hdpa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaEnumCallback(hdpa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaGetPtr(hdpa: Long, i: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaGetPtrIndex(hdpa: Long, p: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaGetSize(hdpa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaGrow(pdpa: Long, cp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaInsertPtr(hdpa: Long, i: Int, p: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaLoadStream(phdpa: Long, pfn: Long, pstream: Long, pvinstdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaMerge(hdpadest: Long, hdpasrc: Long, dwflags: Int, pfncompare: Long, pfnmerge: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaSaveStream(hdpa: Long, pfn: Long, pstream: Long, pvinstdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaSearch(hdpa: Long, pfind: Long, istart: Int, pfncompare: Long, lparam: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaSetPtr(hdpa: Long, i: Int, p: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dpaSort(hdpa: Long, pfncompare: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaClone(hdsa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaCreate(cbitem: Int, citemgrow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaDeleteAllItems(hdsa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaDeleteItem(hdsa: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaDestroy(hdsa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaDestroyCallback(hdsa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaEnumCallback(hdsa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaGetItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaGetItemPtr(hdsa: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaGetSize(hdsa: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaInsertItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaSetItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dsaSort(pdsa: Long, pfncompare: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_destroyPropertySheetPage(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice(device: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirListA(hdlg: Long, lppathspec: Long, nidlistbox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirListComboBoxA(hdlg: Long, lppathspec: Long, nidcombobox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirListComboBoxW(hdlg: Long, lppathspec: Long, nidcombobox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirListW(hdlg: Long, lppathspec: Long, nidlistbox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA(hwnddlg: Long, lpstring: Long, cchout: Int, idcombobox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW(hwnddlg: Long, lpstring: Long, cchout: Int, idcombobox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirSelectExA(hwnddlg: Long, lpstring: Long, chcount: Int, idlistbox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_dlgDirSelectExW(hwnddlg: Long, lpstring: Long, chcount: Int, idlistbox: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawInsert(handparent: Long, hlb: Long, nitem: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawShadowText(hdc: Long, psztext: Long, cch: Int, prc: Long, dwflags: Int, crtext: Int, crshadow: Int, ixoffset: Int, iyoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawStatusTextA(hdc: Long, lprc: Long, psztext: Long, uflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawStatusTextW(hdc: Long, lprc: Long, psztext: Long, uflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeBackground(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeBackgroundEx(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeEdge(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pdestrect: Long, uedge: Int, uflags: Int, pcontentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeIcon(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, himl: Long, iimageindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeParentBackground(hwnd: Long, hdc: Long, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx(hwnd: Long, hdc: Long, dwflags: Int, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeText(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchtext: Int, dwtextflags: Int, dwtextflags2: Int, prect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_drawThemeTextEx(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchtext: Int, dwtextflags: Int, prect: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_enableScrollBar(hwnd: Long, wsbflags: Int, warrows: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_enableThemeDialogTexture(hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_enableTheming(fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_endBufferedAnimation(hbpanimation: Long, fupdatetarget: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_endPanningFeedback(hwnd: Long, fanimateback: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_evaluateProximityToPolygon(numvertices: Int, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_evaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbEnableScrollBar(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbGetScrollInfo(param0: Long, code: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbGetScrollPos(param0: Long, code: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbGetScrollProp(param0: Long, propindex: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbGetScrollRange(param0: Long, code: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbSetScrollInfo(param0: Long, code: Int, psi: Long, fredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbSetScrollPos(param0: Long, code: Int, pos: Int, fredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbSetScrollProp(param0: Long, index: Int, newvalue: Long, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbSetScrollRange(param0: Long, code: Int, min: Int, max: Int, fredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_flatSbShowScrollBar(param0: Long, code: Int, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getBufferedPaintDC(hbufferedpaint: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC(hbufferedpaint: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getComboBoxInfo(hwndcombo: Long, pcbi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getCurrentThemeName(pszthemefilename: Long, cchmaxnamechars: Int, pszcolorbuff: Long, cchmaxcolorchars: Int, pszsizebuff: Long, cchmaxsizechars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getEffectiveClientRect(hwnd: Long, lprc: Long, lpinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getListBoxInfo(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getMUILanguage(): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeAnimationProperty(htheme: Long, istoryboardid: Int, itargetid: Int, eproperty: Int, pvproperty: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeAnimationTransform(htheme: Long, istoryboardid: Int, itargetid: Int, dwtransformindex: Int, ptransform: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeAppProperties(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeBackgroundExtent(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeBackgroundRegion(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, pregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeBitmap(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, dwflags: Int, phbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeBool(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeColor(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeDocumentationProperty(pszthemename: Long, pszpropertyname: Long, pszvaluebuff: Long, cchmaxvalchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeEnumValue(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeFilename(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Long, cchmaxbuffchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeFont(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeInt(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeIntList(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeMargins(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeMetric(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemePartSize(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prc: Long, esize: Int, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemePosition(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemePropertyOrigin(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeRect(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeStream(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeString(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Long, cchmaxbuffchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysBool(htheme: Long, iboolid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysColor(htheme: Long, icolorid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysColorBrush(htheme: Long, icolorid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysFont(htheme: Long, ifontid: Int, plf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysInt(htheme: Long, iintid: Int, pivalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysSize(htheme: Long, isizeid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeSysString(htheme: Long, istringid: Int, pszstringbuff: Long, cchmaxstringchars: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeTextExtent(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchcharcount: Int, dwtextflags: Int, pboundingrect: Long, pextentrect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeTextMetrics(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ptm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeTimingFunction(htheme: Long, itimingfunctionid: Int, ptimingfunction: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getThemeTransitionDuration(htheme: Long, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getWindowFeedbackSetting(hwnd: Long, feedback: Int, dwflags: Int, psize: Long, config: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_getWindowTheme(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_himagelistQueryInterface(himl: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListAdd(himl: Long, hbmimage: Long, hbmmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListAddMasked(himl: Long, hbmimage: Long, crmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListBeginDrag(himltrack: Long, itrack: Int, dxhotspot: Int, dyhotspot: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListCoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListCopy(himldst: Long, idst: Int, himlsrc: Long, isrc: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListCreate(cx: Int, cy: Int, flags: Int, cinitial: Int, cgrow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDestroy(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDragEnter(hwndlock: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDragLeave(hwndlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDragMove(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDragShowNolock(fshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDraw(himl: Long, i: Int, hdcdst: Long, x: Int, y: Int, fstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDrawEx(himl: Long, i: Int, hdcdst: Long, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Int, rgbfg: Int, fstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDrawIndirect(pimldp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListDuplicate(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListEndDrag()

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListGetBkColor(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListGetDragImage(ppt: Long, ppthotspot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListGetIcon(himl: Long, i: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListGetIconSize(himl: Long, cx: Long, cy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListGetImageCount(himl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListGetImageInfo(himl: Long, i: Int, pimageinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListLoadImageA(hi: Long, lpbmp: Long, cx: Int, cgrow: Int, crmask: Int, utype: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListLoadImageW(hi: Long, lpbmp: Long, cx: Int, cgrow: Int, crmask: Int, utype: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListMerge(himl1: Long, i1: Int, himl2: Long, i2: Int, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListRead(pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListReadEx(dwflags: Int, pstm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListRemove(himl: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListReplace(himl: Long, i: Int, hbmimage: Long, hbmmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListReplaceIcon(himl: Long, i: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListSetBkColor(himl: Long, clrbk: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListSetDragCursorImage(himldrag: Long, idrag: Int, dxhotspot: Int, dyhotspot: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListSetIconSize(himl: Long, cx: Int, cy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListSetImageCount(himl: Long, unewcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListSetOverlayImage(himl: Long, iimage: Int, ioverlay: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListWrite(himl: Long, pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_imageListWriteEx(himl: Long, dwflags: Int, pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_initCommonControls()

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_initCommonControlsEx(picce: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_initMUILanguage(uilang: Short)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_initializeFlatSB(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isAppThemed(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isCharLowerW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isCompositionActive(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isDlgButtonChecked(hdlg: Long, nidbutton: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isThemeActive(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent(htheme: Long, ipartid: Int, istateid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_isThemePartDefined(htheme: Long, ipartid: Int, istateid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_loadIconMetric(hinst: Long, pszname: Long, lims: Int, phico: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_loadIconWithScaleDown(hinst: Long, pszname: Long, cx: Int, cy: Int, phico: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_makeDragList(hlb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_menuHelp(umsg: Int, wparam: Long, lparam: Long, hmainmenu: Long, hinst: Long, hwndstatus: Long, lpwids: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_openThemeData(hwnd: Long, pszclasslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_openThemeDataEx(hwnd: Long, pszclasslist: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_propertySheetA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_propertySheetW(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications(window: Long, notifyrange: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow(hwnd: Long, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setScrollInfo(hwnd: Long, nbar: Int, lpsi: Long, redraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setScrollPos(hwnd: Long, nbar: Int, npos: Int, bredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setScrollRange(hwnd: Long, nbar: Int, nminpos: Int, nmaxpos: Int, bredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setThemeAppProperties(dwflags: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setWindowFeedbackSetting(hwnd: Long, feedback: Int, dwflags: Int, size: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setWindowTheme(hwnd: Long, pszsubappname: Long, pszsubidlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_setWindowThemeAttribute(hwnd: Long, eattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_showHideMenuCtl(hwnd: Long, uflags: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_showScrollBar(hwnd: Long, wbar: Int, bshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_strSetPtrW(ppsz: Long, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_taskDialog(hwndowner: Long, hinstance: Long, pszwindowtitle: Long, pszmaininstruction: Long, pszcontent: Long, dwcommonbuttons: Int, pszicon: Long, pnbutton: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_taskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_uninitializeFlatSB(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_controls_updatePanningFeedback(hwnd: Long, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Int): Int
}

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, panimationparams: COpaquePointer?, phdcfrom: COpaquePointer?, phdcto: COpaquePointer?): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_beginBufferedAnimation((hwnd?.value ?: 0L), (hdctarget?.value ?: 0L), (prctarget?.value ?: 0L), dwformat, (ppaintparams?.value ?: 0L), (panimationparams?.value ?: 0L), (phdcfrom?.value ?: 0L), (phdcto?.value ?: 0L))

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: COpaquePointer?, dwformat: BpBufferformat, ppaintparams: COpaquePointer?, phdc: COpaquePointer?): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_beginBufferedPaint((hdctarget?.value ?: 0L), (prctarget?.value ?: 0L), dwformat, (ppaintparams?.value ?: 0L), (phdc?.value ?: 0L))

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_beginPanningFeedback((hwnd?.value ?: 0L))

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_bufferedPaintClear(hbufferedpaint, (prc?.value ?: 0L))

public actual fun bufferedPaintInit(): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_bufferedPaintInit()

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_bufferedPaintRenderAnimation((hwnd?.value ?: 0L), (hdctarget?.value ?: 0L))

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: COpaquePointer?, alpha: UByte): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_bufferedPaintSetAlpha(hbufferedpaint, (prc?.value ?: 0L), alpha.toByte())

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_bufferedPaintStopAllAnimations((hwnd?.value ?: 0L))

public actual fun bufferedPaintUnInit(): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_bufferedPaintUnInit()

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_checkDlgButton((hdlg?.value ?: 0L), nidbutton, ucheck.toInt())

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_checkRadioButton((hdlg?.value ?: 0L), nidfirstbutton, nidlastbutton, nidcheckbutton)

public actual fun closeThemeData(htheme: Htheme): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_closeThemeData(htheme.toLong())

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: COpaquePointer?, inummaps: Int): Hbitmap =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createMappedBitmap((hinstance?.value ?: 0L), idbitmap, wflags.toInt(), (lpcolormap?.value ?: 0L), inummaps).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPropertySheetPageA(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createPropertySheetPageA((constpropsheetpagepointer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPropertySheetPageW(constpropsheetpagepointer: COpaquePointer?): Hpropsheetpage =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createPropertySheetPageW((constpropsheetpagepointer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createStatusWindowA(style, (lpsztext?.value ?: 0L), (hwndparent?.value ?: 0L), wid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createStatusWindowW(style, (lpsztext?.value ?: 0L), (hwndparent?.value ?: 0L), wid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createSyntheticPointerDevice(pointertype, maxcount.toInt(), mode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: COpaquePointer?, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createToolbarEx((hwnd?.value ?: 0L), ws.toInt(), wid.toInt(), nbitmaps, (hbminst?.value ?: 0L), wbmid.toLong(), (lpbuttons?.value ?: 0L), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_createUpDownControl(dwstyle.toInt(), x, y, cx, cy, (hparent?.value ?: 0L), nid, (hinst?.value ?: 0L), (hbuddy?.value ?: 0L), nupper, nlower, npos).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaClone(hdpa.toLong(), hdpanew.toLong())

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaCreate(citemgrow)

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaCreateEx(cpgrow, (hheap?.value ?: 0L))

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaDeleteAllPtrs(hdpa.toLong())

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): COpaquePointer? =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaDeletePtr(hdpa.toLong(), i).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaDestroy(hdpa.toLong())

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaDestroyCallback(hdpa.toLong(), 0L, (pdata?.value ?: 0L))
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaEnumCallback(hdpa.toLong(), 0L, (pdata?.value ?: 0L))
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): COpaquePointer? =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaGetPtr(hdpa.toLong(), i).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: COpaquePointer?): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaGetPtrIndex(hdpa.toLong(), (p?.value ?: 0L))

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaGetSize(hdpa.toLong()).toULong()

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaGrow(pdpa.toLong(), cp)

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaInsertPtr(hdpa.toLong(), i, (p?.value ?: 0L))

public actual fun dpaLoadStream(phdpa: COpaquePointer?, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaLoadStream((phdpa?.value ?: 0L), 0L, (pstream?.value ?: 0L), (pvinstdata?.value ?: 0L))

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaMerge(hdpadest.toLong(), hdpasrc.toLong(), dwflags.toInt(), 0L, 0L, lparam)

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: COpaquePointer?, pvinstdata: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaSaveStream(hdpa.toLong(), 0L, (pstream?.value ?: 0L), (pvinstdata?.value ?: 0L))

public actual fun dpaSearch(hdpa: Hdpa, pfind: COpaquePointer?, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaSearch(hdpa.toLong(), (pfind?.value ?: 0L), istart, 0L, lparam, options.toInt())

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaSetPtr(hdpa.toLong(), i, (p?.value ?: 0L))

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dpaSort(hdpa.toLong(), 0L, lparam)

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaClone(hdsa.toLong())

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaCreate(cbitem, citemgrow)

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaDeleteAllItems(hdsa.toLong())

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaDeleteItem(hdsa.toLong(), i)

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaDestroy(hdsa.toLong())

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaDestroyCallback(hdsa.toLong(), 0L, (pdata?.value ?: 0L))
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: COpaquePointer?) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaEnumCallback(hdsa.toLong(), 0L, (pdata?.value ?: 0L))
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaGetItem(hdsa.toLong(), i, (pitem?.value ?: 0L))

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): COpaquePointer? =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaGetItemPtr(hdsa.toLong(), i).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaGetSize(hdsa.toLong()).toULong()

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaInsertItem(hdsa.toLong(), i, (pitem?.value ?: 0L))

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaSetItem(hdsa.toLong(), i, (pitem?.value ?: 0L))

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dsaSort(pdsa.toLong(), 0L, lparam)

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_destroyPropertySheetPage((param0?.value ?: 0L))

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_destroySyntheticPointerDevice((device?.value ?: 0L))
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirListA((hdlg?.value ?: 0L), (lppathspec?.value ?: 0L), nidlistbox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirListComboBoxA((hdlg?.value ?: 0L), (lppathspec?.value ?: 0L), nidcombobox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirListComboBoxW((hdlg?.value ?: 0L), (lppathspec?.value ?: 0L), nidcombobox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirListW((hdlg?.value ?: 0L), (lppathspec?.value ?: 0L), nidlistbox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExA((hwnddlg?.value ?: 0L), (lpstring?.value ?: 0L), cchout, idcombobox)

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirSelectComboBoxExW((hwnddlg?.value ?: 0L), (lpstring?.value ?: 0L), cchout, idcombobox)

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirSelectExA((hwnddlg?.value ?: 0L), (lpstring?.value ?: 0L), chcount, idlistbox)

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_dlgDirSelectExW((hwnddlg?.value ?: 0L), (lpstring?.value ?: 0L), chcount, idlistbox)

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawInsert((handparent?.value ?: 0L), (hlb?.value ?: 0L), nitem)
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: COpaquePointer?, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawShadowText((hdc?.value ?: 0L), (psztext?.value ?: 0L), cch.toInt(), (prc?.value ?: 0L), dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset)

public actual fun drawStatusTextA(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcstr, uflags: UInt) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawStatusTextA((hdc?.value ?: 0L), (lprc?.value ?: 0L), (psztext?.value ?: 0L), uflags.toInt())
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: COpaquePointer?, psztext: Pcwstr, uflags: UInt) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawStatusTextW((hdc?.value ?: 0L), (lprc?.value ?: 0L), (psztext?.value ?: 0L), uflags.toInt())
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pcliprect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeBackground(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (prect?.value ?: 0L), (pcliprect?.value ?: 0L))

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeBackgroundEx(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (prect?.value ?: 0L), (poptions?.value ?: 0L))

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: COpaquePointer?, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeEdge(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (pdestrect?.value ?: 0L), uedge.toInt(), uflags.toInt(), (pcontentrect?.value ?: 0L))

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, himl: Himagelist, iimageindex: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeIcon(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (prect?.value ?: 0L), himl.toLong(), iimageindex)

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeParentBackground((hwnd?.value ?: 0L), (hdc?.value ?: 0L), (prc?.value ?: 0L))

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeParentBackgroundEx((hwnd?.value ?: 0L), (hdc?.value ?: 0L), dwflags.toInt(), (prc?.value ?: 0L))

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeText(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (psztext?.value ?: 0L), cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), (prect?.value ?: 0L))

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: COpaquePointer?, poptions: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_drawThemeTextEx(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (psztext?.value ?: 0L), cchtext, dwtextflags.toInt(), (prect?.value ?: 0L), (poptions?.value ?: 0L))

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_enableScrollBar((hwnd?.value ?: 0L), wsbflags.toInt(), warrows.toInt())

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_enableThemeDialogTexture((hwnd?.value ?: 0L), dwflags.toInt())

public actual fun enableTheming(fenable: Bool): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_enableTheming(fenable)

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_endBufferedAnimation(hbpanimation, fupdatetarget)

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_endBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_endPanningFeedback((hwnd?.value ?: 0L), fanimateback)

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_evaluateProximityToPolygon(numvertices.toInt(), (controlpolygon?.value ?: 0L), (phittestinginput?.value ?: 0L), (pproximityeval?.value ?: 0L))

public actual fun evaluateProximityToRect(controlboundingbox: COpaquePointer?, phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_evaluateProximityToRect((controlboundingbox?.value ?: 0L), (phittestinginput?.value ?: 0L), (pproximityeval?.value ?: 0L))

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbEnableScrollBar((param0?.value ?: 0L), param1, param2.toInt())

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbGetScrollInfo((param0?.value ?: 0L), code, (param2?.value ?: 0L))

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbGetScrollPos((param0?.value ?: 0L), code)

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbGetScrollProp((param0?.value ?: 0L), propindex, (param2?.value ?: 0L))

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: COpaquePointer?, param3: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbGetScrollRange((param0?.value ?: 0L), code, (param2?.value ?: 0L), (param3?.value ?: 0L))

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: COpaquePointer?, fredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbSetScrollInfo((param0?.value ?: 0L), code, (psi?.value ?: 0L), fredraw)

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbSetScrollPos((param0?.value ?: 0L), code, pos, fredraw)

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbSetScrollProp((param0?.value ?: 0L), index.toInt(), newvalue, param3)

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbSetScrollRange((param0?.value ?: 0L), code, min, max, fredraw)

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_flatSbShowScrollBar((param0?.value ?: 0L), code, param2)

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: COpaquePointer?, pcxrow: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getBufferedPaintBits(hbufferedpaint, (ppbbuffer?.value ?: 0L), (pcxrow?.value ?: 0L))

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getBufferedPaintDC(hbufferedpaint).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getBufferedPaintTargetDC(hbufferedpaint).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getBufferedPaintTargetRect(hbufferedpaint, (prc?.value ?: 0L))

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getComboBoxInfo((hwndcombo?.value ?: 0L), (pcbi?.value ?: 0L))

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getCurrentThemeName((pszthemefilename?.value ?: 0L), cchmaxnamechars, (pszcolorbuff?.value ?: 0L), cchmaxcolorchars, (pszsizebuff?.value ?: 0L), cchmaxsizechars)

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: COpaquePointer?, lpinfo: COpaquePointer?) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getEffectiveClientRect((hwnd?.value ?: 0L), (lprc?.value ?: 0L), (lpinfo?.value ?: 0L))
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getListBoxInfo((hwnd?.value ?: 0L)).toUInt()

public actual fun getMUILanguage(): UShort =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getMUILanguage().toUShort()

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeAnimationProperty(htheme.toLong(), istoryboardid, itargetid, eproperty, (pvproperty?.value ?: 0L), cbsize.toInt(), (pcbsizeout?.value ?: 0L))

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeAnimationTransform(htheme.toLong(), istoryboardid, itargetid, dwtransformindex.toInt(), (ptransform?.value ?: 0L), cbsize.toInt(), (pcbsizeout?.value ?: 0L))

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeAppProperties().toUInt()

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: COpaquePointer?, pcontentrect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeBackgroundContentRect(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (pboundingrect?.value ?: 0L), (pcontentrect?.value ?: 0L))

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeBackgroundExtent(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (pcontentrect?.value ?: 0L), (pextentrect?.value ?: 0L))

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: COpaquePointer?, pregion: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeBackgroundRegion(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (prect?.value ?: 0L), (pregion?.value ?: 0L))

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeBitmap(htheme.toLong(), ipartid, istateid, ipropid, dwflags.toInt(), (phbitmap?.value ?: 0L))

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeBool(htheme.toLong(), ipartid, istateid, ipropid, (pfval?.value ?: 0L))

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeColor(htheme.toLong(), ipartid, istateid, ipropid, (pcolor?.value ?: 0L))

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeDocumentationProperty((pszthemename?.value ?: 0L), (pszpropertyname?.value ?: 0L), (pszvaluebuff?.value ?: 0L), cchmaxvalchars)

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeEnumValue(htheme.toLong(), ipartid, istateid, ipropid, (pival?.value ?: 0L))

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeFilename(htheme.toLong(), ipartid, istateid, ipropid, (pszthemefilename?.value ?: 0L), cchmaxbuffchars)

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeFont(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, ipropid, (pfont?.value ?: 0L))

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeInt(htheme.toLong(), ipartid, istateid, ipropid, (pival?.value ?: 0L))

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeIntList(htheme.toLong(), ipartid, istateid, ipropid, (pintlist?.value ?: 0L))

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: COpaquePointer?, pmargins: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeMargins(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, ipropid, (prc?.value ?: 0L), (pmargins?.value ?: 0L))

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeMetric(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, ipropid, (pival?.value ?: 0L))

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: COpaquePointer?, esize: Themesize, psz: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemePartSize(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (prc?.value ?: 0L), esize, (psz?.value ?: 0L))

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemePosition(htheme.toLong(), ipartid, istateid, ipropid, (ppoint?.value ?: 0L))

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemePropertyOrigin(htheme.toLong(), ipartid, istateid, ipropid, (porigin?.value ?: 0L))

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeRect(htheme.toLong(), ipartid, istateid, ipropid, (prect?.value ?: 0L))

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: COpaquePointer?, pcbstream: COpaquePointer?, hinst: Hinstance): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeStream(htheme.toLong(), ipartid, istateid, ipropid, (ppvstream?.value ?: 0L), (pcbstream?.value ?: 0L), (hinst?.value ?: 0L))

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeString(htheme.toLong(), ipartid, istateid, ipropid, (pszbuff?.value ?: 0L), cchmaxbuffchars)

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysBool(htheme.toLong(), iboolid)

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysColor(htheme.toLong(), icolorid).toUInt()

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysColorBrush(htheme.toLong(), icolorid).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysFont(htheme.toLong(), ifontid, (plf?.value ?: 0L))

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysInt(htheme.toLong(), iintid, (pivalue?.value ?: 0L))

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysSize(htheme.toLong(), isizeid)

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeSysString(htheme.toLong(), istringid, (pszstringbuff?.value ?: 0L), cchmaxstringchars)

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: COpaquePointer?, pextentrect: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeTextExtent(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (psztext?.value ?: 0L), cchcharcount, dwtextflags.toInt(), (pboundingrect?.value ?: 0L), (pextentrect?.value ?: 0L))

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeTextMetrics(htheme.toLong(), (hdc?.value ?: 0L), ipartid, istateid, (ptm?.value ?: 0L))

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: COpaquePointer?, cbsize: UInt, pcbsizeout: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeTimingFunction(htheme.toLong(), itimingfunctionid, (ptimingfunction?.value ?: 0L), cbsize.toInt(), (pcbsizeout?.value ?: 0L))

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getThemeTransitionDuration(htheme.toLong(), ipartid, istateidfrom, istateidto, ipropid, (pdwduration?.value ?: 0L))

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: COpaquePointer?, config: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getWindowFeedbackSetting((hwnd?.value ?: 0L), feedback, dwflags.toInt(), (psize?.value ?: 0L), (config?.value ?: 0L))

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_getWindowTheme((hwnd?.value ?: 0L))

public actual fun himagelistQueryInterface(himl: Himagelist, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_himagelistQueryInterface(himl.toLong(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: COpaquePointer?, hrgn: Hrgn, pttest: Point, pwhittestcode: COpaquePointer?): Hresult =
    0

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListAdd(himl.toLong(), (hbmimage?.value ?: 0L), (hbmmask?.value ?: 0L))

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListAddMasked(himl.toLong(), (hbmimage?.value ?: 0L), crmask.toInt())

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListBeginDrag(himltrack.toLong(), itrack, dxhotspot, dyhotspot)

public actual fun imageListCoCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListCoCreateInstance((rclsid?.value ?: 0L), (punkouter?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListCopy(himldst.toLong(), idst, himlsrc.toLong(), isrc, uflags.toInt())

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListCreate(cx, cy, flags.toInt(), cinitial, cgrow)

public actual fun imageListDestroy(himl: Himagelist): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDestroy(himl.toLong())

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDragEnter((hwndlock?.value ?: 0L), x, y)

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDragLeave((hwndlock?.value ?: 0L))

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDragMove(x, y)

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDragShowNolock(fshow)

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDraw(himl.toLong(), i, (hdcdst?.value ?: 0L), x, y, fstyle.toInt())

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDrawEx(himl.toLong(), i, (hdcdst?.value ?: 0L), x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt())

public actual fun imageListDrawIndirect(pimldp: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDrawIndirect((pimldp?.value ?: 0L))

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListDuplicate(himl.toLong())

public actual fun imageListEndDrag() {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListEndDrag()
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListGetBkColor(himl.toLong()).toUInt()

public actual fun imageListGetDragImage(ppt: COpaquePointer?, ppthotspot: COpaquePointer?): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListGetDragImage((ppt?.value ?: 0L), (ppthotspot?.value ?: 0L))

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListGetIcon(himl.toLong(), i, flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun imageListGetIconSize(himl: Himagelist, cx: COpaquePointer?, cy: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListGetIconSize(himl.toLong(), (cx?.value ?: 0L), (cy?.value ?: 0L))

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListGetImageCount(himl.toLong())

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListGetImageInfo(himl.toLong(), i, (pimageinfo?.value ?: 0L))

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListLoadImageA((hi?.value ?: 0L), (lpbmp?.value ?: 0L), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt())

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListLoadImageW((hi?.value ?: 0L), (lpbmp?.value ?: 0L), cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt())

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListMerge(himl1.toLong(), i1, himl2.toLong(), i2, dx, dy)

public actual fun imageListRead(pstm: COpaquePointer?): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListRead((pstm?.value ?: 0L))

public actual fun imageListReadEx(dwflags: UInt, pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListReadEx(dwflags.toInt(), (pstm?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListRemove(himl.toLong(), i)

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListReplace(himl.toLong(), i, (hbmimage?.value ?: 0L), (hbmmask?.value ?: 0L))

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListReplaceIcon(himl.toLong(), i, (hicon?.value ?: 0L))

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListSetBkColor(himl.toLong(), clrbk.toInt()).toUInt()

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListSetDragCursorImage(himldrag.toLong(), idrag, dxhotspot, dyhotspot)

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListSetIconSize(himl.toLong(), cx, cy)

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListSetImageCount(himl.toLong(), unewcount.toInt())

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListSetOverlayImage(himl.toLong(), iimage, ioverlay)

public actual fun imageListWrite(himl: Himagelist, pstm: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListWrite(himl.toLong(), (pstm?.value ?: 0L))

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_imageListWriteEx(himl.toLong(), dwflags.toInt(), (pstm?.value ?: 0L))

public actual fun initCommonControls() {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_initCommonControls()
}

public actual fun initCommonControlsEx(picce: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_initCommonControlsEx((picce?.value ?: 0L))

public actual fun initMUILanguage(uilang: UShort) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_initMUILanguage(uilang.toShort())
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_initializeFlatSB((param0?.value ?: 0L))

public actual fun isAppThemed(): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isAppThemed()

public actual fun isCharLowerW(ch: UShort): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isCharLowerW(ch.toShort())

public actual fun isCompositionActive(): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isCompositionActive()

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isDlgButtonChecked((hdlg?.value ?: 0L), nidbutton).toUInt()

public actual fun isThemeActive(): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isThemeActive()

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isThemeBackgroundPartiallyTransparent(htheme.toLong(), ipartid, istateid)

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isThemeDialogTextureEnabled((hwnd?.value ?: 0L))

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_isThemePartDefined(htheme.toLong(), ipartid, istateid)

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    0

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_loadIconMetric((hinst?.value ?: 0L), (pszname?.value ?: 0L), lims, (phico?.value ?: 0L))

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_loadIconWithScaleDown((hinst?.value ?: 0L), (pszname?.value ?: 0L), cx, cy, (phico?.value ?: 0L))

public actual fun makeDragList(hlb: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_makeDragList((hlb?.value ?: 0L))

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: COpaquePointer?) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_menuHelp(umsg.toInt(), wparam.toLong(), lparam, (hmainmenu?.value ?: 0L), (hinst?.value ?: 0L), (hwndstatus?.value ?: 0L), (lpwids?.value ?: 0L))
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_openThemeData((hwnd?.value ?: 0L), (pszclasslist?.value ?: 0L))

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_openThemeDataEx((hwnd?.value ?: 0L), (pszclasslist?.value ?: 0L), dwflags.toInt())

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: COpaquePointer?, pproximityeval: COpaquePointer?): Lresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_packTouchHitTestingProximityEvaluation((phittestinginput?.value ?: 0L), (pproximityeval?.value ?: 0L))

public actual fun propertySheetA(param0: COpaquePointer?): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_propertySheetA((param0?.value ?: 0L))

public actual fun propertySheetW(param0: COpaquePointer?): Long =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_propertySheetW((param0?.value ?: 0L))

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_registerPointerDeviceNotifications((window?.value ?: 0L), notifyrange)

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_registerTouchHitTestingWindow((hwnd?.value ?: 0L), value.toInt())

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: COpaquePointer?, redraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setScrollInfo((hwnd?.value ?: 0L), nbar, (lpsi?.value ?: 0L), redraw)

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setScrollPos((hwnd?.value ?: 0L), nbar, npos, bredraw)

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setScrollRange((hwnd?.value ?: 0L), nbar, nminpos, nmaxpos, bredraw)

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setThemeAppProperties(dwflags.toInt())
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setWindowFeedbackSetting((hwnd?.value ?: 0L), feedback, dwflags.toInt(), size.toInt(), (configuration?.value ?: 0L))

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setWindowTheme((hwnd?.value ?: 0L), (pszsubappname?.value ?: 0L), (pszsubidlist?.value ?: 0L))

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: COpaquePointer?, cbattribute: UInt): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_setWindowThemeAttribute((hwnd?.value ?: 0L), eattribute, (pvattribute?.value ?: 0L), cbattribute.toInt())

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: COpaquePointer?): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_showHideMenuCtl((hwnd?.value ?: 0L), uflags.toLong(), (lpinfo?.value ?: 0L))

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_showScrollBar((hwnd?.value ?: 0L), wbar, bshow)

public actual fun strSetPtrW(ppsz: COpaquePointer?, psz: Pcwstr): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_strSetPtrW((ppsz?.value ?: 0L), (psz?.value ?: 0L))

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_taskDialog((hwndowner?.value ?: 0L), (hinstance?.value ?: 0L), (pszwindowtitle?.value ?: 0L), (pszmaininstruction?.value ?: 0L), (pszcontent?.value ?: 0L), dwcommonbuttons, (pszicon?.value ?: 0L), (pnbutton?.value ?: 0L))

public actual fun taskDialogIndirect(ptaskconfig: COpaquePointer?, pnbutton: COpaquePointer?, pnradiobutton: COpaquePointer?, pfverificationflagchecked: COpaquePointer?): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_taskDialogIndirect((ptaskconfig?.value ?: 0L), (pnbutton?.value ?: 0L), (pnradiobutton?.value ?: 0L), (pfverificationflagchecked?.value ?: 0L))

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_uninitializeFlatSB((param0?.value ?: 0L))

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssys_windows_win32_ui_controls_updatePanningFeedback((hwnd?.value ?: 0L), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia)
