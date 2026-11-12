@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32UiControlsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBeginBufferedAnimation(hwnd: Long, hdctarget: Long, prctarget: Long, dwformat: Int, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBeginBufferedPaint(hdctarget: Long, prctarget: Long, dwformat: Int, ppaintparams: Long, phdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBeginPanningFeedback(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBufferedPaintClear(hbufferedpaint: Long, prc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBufferedPaintInit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(hwnd: Long, hdctarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsBufferedPaintUnInit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCheckDlgButton(hdlg: Long, nidbutton: Int, ucheck: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCheckRadioButton(hdlg: Long, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCloseThemeData(htheme: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreateMappedBitmap(hinstance: Long, idbitmap: Long, wflags: Int, lpcolormap: Long, inummaps: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreatePropertySheetPageA(constpropsheetpagepointer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreatePropertySheetPageW(constpropsheetpagepointer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreateStatusWindowA(style: Int, lpsztext: Long, hwndparent: Long, wid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreateStatusWindowW(style: Int, lpsztext: Long, hwndparent: Long, wid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(pointertype: Int, maxcount: Int, mode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreateToolbarEx(hwnd: Long, ws: Int, wid: Int, nbitmaps: Int, hbminst: Long, wbmid: Long, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsCreateUpDownControl(dwstyle: Int, x: Int, y: Int, cx: Int, cy: Int, hparent: Long, nid: Int, hinst: Long, hbuddy: Long, nupper: Int, nlower: Int, npos: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaClone(hdpa: Long, hdpanew: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaCreate(citemgrow: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaCreateEx(cpgrow: Int, hheap: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaDeletePtr(hdpa: Long, i: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaDestroy(hdpa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaDestroyCallback(hdpa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaEnumCallback(hdpa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaGetPtr(hdpa: Long, i: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaGetPtrIndex(hdpa: Long, p: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaGetSize(hdpa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaGrow(pdpa: Long, cp: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaInsertPtr(hdpa: Long, i: Int, p: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaLoadStream(phdpa: Long, pfn: Long, pstream: Long, pvinstdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaMerge(hdpadest: Long, hdpasrc: Long, dwflags: Int, pfncompare: Long, pfnmerge: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaSaveStream(hdpa: Long, pfn: Long, pstream: Long, pvinstdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaSearch(hdpa: Long, pfind: Long, istart: Int, pfncompare: Long, lparam: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaSetPtr(hdpa: Long, i: Int, p: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDpaSort(hdpa: Long, pfncompare: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaClone(hdsa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaCreate(cbitem: Int, citemgrow: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaDeleteItem(hdsa: Long, i: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaDestroy(hdsa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaDestroyCallback(hdsa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaEnumCallback(hdsa: Long, pfncb: Long, pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaGetItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaGetItemPtr(hdsa: Long, i: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaGetSize(hdsa: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaInsertItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaSetItem(hdsa: Long, i: Int, pitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDsaSort(pdsa: Long, pfncompare: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDestroyPropertySheetPage(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(device: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirListA(hdlg: Long, lppathspec: Long, nidlistbox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirListComboBoxA(hdlg: Long, lppathspec: Long, nidcombobox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirListComboBoxW(hdlg: Long, lppathspec: Long, nidcombobox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirListW(hdlg: Long, lppathspec: Long, nidlistbox: Int, nidstaticpath: Int, ufiletype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(hwnddlg: Long, lpstring: Long, cchout: Int, idcombobox: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(hwnddlg: Long, lpstring: Long, cchout: Int, idcombobox: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirSelectExA(hwnddlg: Long, lpstring: Long, chcount: Int, idlistbox: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDlgDirSelectExW(hwnddlg: Long, lpstring: Long, chcount: Int, idlistbox: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawInsert(handparent: Long, hlb: Long, nitem: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawShadowText(hdc: Long, psztext: Long, cch: Int, prc: Long, dwflags: Int, crtext: Int, crshadow: Int, ixoffset: Int, iyoffset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawStatusTextA(hdc: Long, lprc: Long, psztext: Long, uflags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawStatusTextW(hdc: Long, lprc: Long, psztext: Long, uflags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeBackground(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeBackgroundEx(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeEdge(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pdestrect: Long, uedge: Int, uflags: Int, pcontentrect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeIcon(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, himl: Long, iimageindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeParentBackground(hwnd: Long, hdc: Long, prc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(hwnd: Long, hdc: Long, dwflags: Int, prc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeText(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchtext: Int, dwtextflags: Int, dwtextflags2: Int, prect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsDrawThemeTextEx(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchtext: Int, dwtextflags: Int, prect: Long, poptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEnableScrollBar(hwnd: Long, wsbflags: Int, warrows: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEnableThemeDialogTexture(hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEnableTheming(fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation: Long, fupdatetarget: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint: Long, fupdatetarget: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEndPanningFeedback(hwnd: Long, fanimateback: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEvaluateProximityToPolygon(numvertices: Int, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsEvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbEnableScrollBar(param0: Long, param1: Int, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbGetScrollInfo(param0: Long, code: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbGetScrollPos(param0: Long, code: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbGetScrollProp(param0: Long, propindex: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbGetScrollRange(param0: Long, code: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbSetScrollInfo(param0: Long, code: Int, psi: Long, fredraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbSetScrollPos(param0: Long, code: Int, pos: Int, fredraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbSetScrollProp(param0: Long, index: Int, newvalue: Long, param3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbSetScrollRange(param0: Long, code: Int, min: Int, max: Int, fredraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsFlatSbShowScrollBar(param0: Long, code: Int, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetBufferedPaintDC(hbufferedpaint: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(hbufferedpaint: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetComboBoxInfo(hwndcombo: Long, pcbi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetCurrentThemeName(pszthemefilename: Long, cchmaxnamechars: Int, pszcolorbuff: Long, cchmaxcolorchars: Int, pszsizebuff: Long, cchmaxsizechars: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetEffectiveClientRect(hwnd: Long, lprc: Long, lpinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetListBoxInfo(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetMUILanguage(): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeAnimationProperty(htheme: Long, istoryboardid: Int, itargetid: Int, eproperty: Int, pvproperty: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeAnimationTransform(htheme: Long, istoryboardid: Int, itargetid: Int, dwtransformindex: Int, ptransform: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeAppProperties(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeBackgroundExtent(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeBackgroundRegion(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prect: Long, pregion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeBitmap(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, dwflags: Int, phbitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeBool(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeColor(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeDocumentationProperty(pszthemename: Long, pszpropertyname: Long, pszvaluebuff: Long, cchmaxvalchars: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeEnumValue(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeFilename(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Long, cchmaxbuffchars: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeFont(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeInt(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeIntList(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeMargins(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeMetric(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemePartSize(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, prc: Long, esize: Int, psz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemePosition(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemePropertyOrigin(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeRect(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeStream(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeString(htheme: Long, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Long, cchmaxbuffchars: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysBool(htheme: Long, iboolid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysColor(htheme: Long, icolorid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysColorBrush(htheme: Long, icolorid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysFont(htheme: Long, ifontid: Int, plf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysInt(htheme: Long, iintid: Int, pivalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysSize(htheme: Long, isizeid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeSysString(htheme: Long, istringid: Int, pszstringbuff: Long, cchmaxstringchars: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeTextExtent(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, psztext: Long, cchcharcount: Int, dwtextflags: Int, pboundingrect: Long, pextentrect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeTextMetrics(htheme: Long, hdc: Long, ipartid: Int, istateid: Int, ptm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeTimingFunction(htheme: Long, itimingfunctionid: Int, ptimingfunction: Long, cbsize: Int, pcbsizeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetThemeTransitionDuration(htheme: Long, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetWindowFeedbackSetting(hwnd: Long, feedback: Int, dwflags: Int, psize: Long, config: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsGetWindowTheme(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsHimagelistQueryInterface(himl: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListAdd(himl: Long, hbmimage: Long, hbmmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListAddMasked(himl: Long, hbmimage: Long, crmask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListBeginDrag(himltrack: Long, itrack: Int, dxhotspot: Int, dyhotspot: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListCoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListCopy(himldst: Long, idst: Int, himlsrc: Long, isrc: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListCreate(cx: Int, cy: Int, flags: Int, cinitial: Int, cgrow: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDestroy(himl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDragEnter(hwndlock: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDragLeave(hwndlock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDragMove(x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDragShowNolock(fshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDraw(himl: Long, i: Int, hdcdst: Long, x: Int, y: Int, fstyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDrawEx(himl: Long, i: Int, hdcdst: Long, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Int, rgbfg: Int, fstyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDrawIndirect(pimldp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListDuplicate(himl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListEndDrag()

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListGetBkColor(himl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListGetDragImage(ppt: Long, ppthotspot: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListGetIcon(himl: Long, i: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListGetIconSize(himl: Long, cx: Long, cy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListGetImageCount(himl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListGetImageInfo(himl: Long, i: Int, pimageinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListLoadImageA(hi: Long, lpbmp: Long, cx: Int, cgrow: Int, crmask: Int, utype: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListLoadImageW(hi: Long, lpbmp: Long, cx: Int, cgrow: Int, crmask: Int, utype: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListMerge(himl1: Long, i1: Int, himl2: Long, i2: Int, dx: Int, dy: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListRead(pstm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListReadEx(dwflags: Int, pstm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListRemove(himl: Long, i: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListReplace(himl: Long, i: Int, hbmimage: Long, hbmmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListReplaceIcon(himl: Long, i: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListSetBkColor(himl: Long, clrbk: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag: Long, idrag: Int, dxhotspot: Int, dyhotspot: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListSetIconSize(himl: Long, cx: Int, cy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListSetImageCount(himl: Long, unewcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListSetOverlayImage(himl: Long, iimage: Int, ioverlay: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListWrite(himl: Long, pstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsImageListWriteEx(himl: Long, dwflags: Int, pstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsInitCommonControls()

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsInitCommonControlsEx(picce: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsInitMUILanguage(uilang: Short)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsInitializeFlatSB(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsAppThemed(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsCharLowerW(ch: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsCompositionActive(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsDlgButtonChecked(hdlg: Long, nidbutton: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsThemeActive(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme: Long, ipartid: Int, istateid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsIsThemePartDefined(htheme: Long, ipartid: Int, istateid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsLoadIconMetric(hinst: Long, pszname: Long, lims: Int, phico: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsLoadIconWithScaleDown(hinst: Long, pszname: Long, cx: Int, cy: Int, phico: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsMakeDragList(hlb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsMenuHelp(umsg: Int, wparam: Long, lparam: Long, hmainmenu: Long, hinst: Long, hwndstatus: Long, lpwids: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsOpenThemeData(hwnd: Long, pszclasslist: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsOpenThemeDataEx(hwnd: Long, pszclasslist: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsPropertySheetA(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsPropertySheetW(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(window: Long, notifyrange: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(hwnd: Long, value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetScrollInfo(hwnd: Long, nbar: Int, lpsi: Long, redraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetScrollPos(hwnd: Long, nbar: Int, npos: Int, bredraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetScrollRange(hwnd: Long, nbar: Int, nminpos: Int, nmaxpos: Int, bredraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetWindowFeedbackSetting(hwnd: Long, feedback: Int, dwflags: Int, size: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetWindowTheme(hwnd: Long, pszsubappname: Long, pszsubidlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsSetWindowThemeAttribute(hwnd: Long, eattribute: Int, pvattribute: Long, cbattribute: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsShowHideMenuCtl(hwnd: Long, uflags: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsShowScrollBar(hwnd: Long, wbar: Int, bshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsStrSetPtrW(ppsz: Long, psz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsTaskDialog(hwndowner: Long, hinstance: Long, pszwindowtitle: Long, pszmaininstruction: Long, pszcontent: Long, dwcommonbuttons: Int, pszicon: Long, pnbutton: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsTaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsUninitializeFlatSB(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiControlsUpdatePanningFeedback(hwnd: Long, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Int): Int
}

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, panimationparams: ConstPtr, phdcfrom: MutPtr, phdcto: MutPtr): Long =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBeginBufferedAnimation(hwnd.rawAddress, hdctarget.rawAddress, prctarget.rawAddress, dwformat, ppaintparams.rawAddress, panimationparams.rawAddress, phdcfrom.rawAddress, phdcto.rawAddress)

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, phdc: MutPtr): Long =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBeginBufferedPaint(hdctarget.rawAddress, prctarget.rawAddress, dwformat, ppaintparams.rawAddress, phdc.rawAddress)

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBeginPanningFeedback(hwnd.rawAddress)

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBufferedPaintClear(hbufferedpaint, prc.rawAddress)

public actual fun bufferedPaintInit(): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBufferedPaintInit()

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(hwnd.rawAddress, hdctarget.rawAddress)

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: ConstPtr, alpha: UByte): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBufferedPaintSetAlpha(hbufferedpaint, prc.rawAddress, alpha.toByte())

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(hwnd.rawAddress)

public actual fun bufferedPaintUnInit(): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsBufferedPaintUnInit()

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCheckDlgButton(hdlg.rawAddress, nidbutton, ucheck.toInt())

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCheckRadioButton(hdlg.rawAddress, nidfirstbutton, nidlastbutton, nidcheckbutton)

public actual fun closeThemeData(htheme: Htheme): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCloseThemeData(htheme)

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: ConstPtr, inummaps: Int): Hbitmap =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreateMappedBitmap(hinstance.rawAddress, idbitmap, wflags.toInt(), lpcolormap.rawAddress, inummaps))

public actual fun createPropertySheetPageA(constpropsheetpagepointer: MutPtr): Hpropsheetpage =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreatePropertySheetPageA(constpropsheetpagepointer.rawAddress))

public actual fun createPropertySheetPageW(constpropsheetpagepointer: MutPtr): Hpropsheetpage =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreatePropertySheetPageW(constpropsheetpagepointer.rawAddress))

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreateStatusWindowA(style, lpsztext.rawAddress, hwndparent.rawAddress, wid.toInt()))

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreateStatusWindowW(style, lpsztext.rawAddress, hwndparent.rawAddress, wid.toInt()))

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(pointertype, maxcount.toInt(), mode))

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: MutPtr, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreateToolbarEx(hwnd.rawAddress, ws.toInt(), wid.toInt(), nbitmaps, hbminst.rawAddress, wbmid.toLong(), lpbuttons.rawAddress, inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize.toInt()))

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsCreateUpDownControl(dwstyle.toInt(), x, y, cx, cy, hparent.rawAddress, nid, hinst.rawAddress, hbuddy.rawAddress, nupper, nlower, npos))

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaClone(hdpa, hdpanew)

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaCreate(citemgrow)

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaCreateEx(cpgrow, hheap.rawAddress)

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa)

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): MutPtr =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaDeletePtr(hdpa, i))

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaDestroy(hdpa)

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaDestroyCallback(hdpa, 0L, pdata.rawAddress)
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaEnumCallback(hdpa, 0L, pdata.rawAddress)
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): MutPtr =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaGetPtr(hdpa, i))

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: ConstPtr): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaGetPtrIndex(hdpa, p.rawAddress)

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaGetSize(hdpa).toULong()

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaGrow(pdpa, cp)

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaInsertPtr(hdpa, i, p.rawAddress)

public actual fun dpaLoadStream(phdpa: MutPtr, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaLoadStream(phdpa.rawAddress, 0L, pstream.rawAddress, pvinstdata.rawAddress)

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaMerge(hdpadest, hdpasrc, dwflags.toInt(), 0L, 0L, lparam)

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaSaveStream(hdpa, 0L, pstream.rawAddress, pvinstdata.rawAddress)

public actual fun dpaSearch(hdpa: Hdpa, pfind: ConstPtr, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaSearch(hdpa, pfind.rawAddress, istart, 0L, lparam, options.toInt())

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaSetPtr(hdpa, i, p.rawAddress)

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDpaSort(hdpa, 0L, lparam)

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaClone(hdsa)

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaCreate(cbitem, citemgrow)

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa)

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaDeleteItem(hdsa, i)

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaDestroy(hdsa)

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaDestroyCallback(hdsa, 0L, pdata.rawAddress)
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaEnumCallback(hdsa, 0L, pdata.rawAddress)
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaGetItem(hdsa, i, pitem.rawAddress)

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): MutPtr =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaGetItemPtr(hdsa, i))

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaGetSize(hdsa).toULong()

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaInsertItem(hdsa, i, pitem.rawAddress)

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaSetItem(hdsa, i, pitem.rawAddress)

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDsaSort(pdsa, 0L, lparam)

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDestroyPropertySheetPage(param0.rawAddress)

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(device.rawAddress)
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirListA(hdlg.rawAddress, lppathspec.rawAddress, nidlistbox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirListComboBoxA(hdlg.rawAddress, lppathspec.rawAddress, nidcombobox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirListComboBoxW(hdlg.rawAddress, lppathspec.rawAddress, nidcombobox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirListW(hdlg.rawAddress, lppathspec.rawAddress, nidlistbox, nidstaticpath, ufiletype.toInt())

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(hwnddlg.rawAddress, lpstring.rawAddress, cchout, idcombobox)

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(hwnddlg.rawAddress, lpstring.rawAddress, cchout, idcombobox)

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirSelectExA(hwnddlg.rawAddress, lpstring.rawAddress, chcount, idlistbox)

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDlgDirSelectExW(hwnddlg.rawAddress, lpstring.rawAddress, chcount, idlistbox)

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawInsert(handparent.rawAddress, hlb.rawAddress, nitem)
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: ConstPtr, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawShadowText(hdc.rawAddress, psztext.rawAddress, cch.toInt(), prc.rawAddress, dwflags.toInt(), crtext.toInt(), crshadow.toInt(), ixoffset, iyoffset)

public actual fun drawStatusTextA(hdc: Hdc, lprc: MutPtr, psztext: Pcstr, uflags: UInt) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawStatusTextA(hdc.rawAddress, lprc.rawAddress, psztext.rawAddress, uflags.toInt())
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: MutPtr, psztext: Pcwstr, uflags: UInt) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawStatusTextW(hdc.rawAddress, lprc.rawAddress, psztext.rawAddress, uflags.toInt())
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pcliprect: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeBackground(htheme, hdc.rawAddress, ipartid, istateid, prect.rawAddress, pcliprect.rawAddress)

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, poptions: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeBackgroundEx(htheme, hdc.rawAddress, ipartid, istateid, prect.rawAddress, poptions.rawAddress)

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: ConstPtr, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeEdge(htheme, hdc.rawAddress, ipartid, istateid, pdestrect.rawAddress, uedge.toInt(), uflags.toInt(), pcontentrect.rawAddress)

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, himl: Himagelist, iimageindex: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeIcon(htheme, hdc.rawAddress, ipartid, istateid, prect.rawAddress, himl, iimageindex)

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeParentBackground(hwnd.rawAddress, hdc.rawAddress, prc.rawAddress)

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(hwnd.rawAddress, hdc.rawAddress, dwflags.toInt(), prc.rawAddress)

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeText(htheme, hdc.rawAddress, ipartid, istateid, psztext.rawAddress, cchtext, dwtextflags.toInt(), dwtextflags2.toInt(), prect.rawAddress)

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: MutPtr, poptions: ConstPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsDrawThemeTextEx(htheme, hdc.rawAddress, ipartid, istateid, psztext.rawAddress, cchtext, dwtextflags.toInt(), prect.rawAddress, poptions.rawAddress)

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEnableScrollBar(hwnd.rawAddress, wsbflags.toInt(), warrows.toInt())

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEnableThemeDialogTexture(hwnd.rawAddress, dwflags.toInt())

public actual fun enableTheming(fenable: Bool): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEnableTheming(fenable)

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation, fupdatetarget)

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEndPanningFeedback(hwnd.rawAddress, fanimateback)

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEvaluateProximityToPolygon(numvertices.toInt(), controlpolygon.rawAddress, phittestinginput.rawAddress, pproximityeval.rawAddress)

public actual fun evaluateProximityToRect(controlboundingbox: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsEvaluateProximityToRect(controlboundingbox.rawAddress, phittestinginput.rawAddress, pproximityeval.rawAddress)

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbEnableScrollBar(param0.rawAddress, param1, param2.toInt())

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbGetScrollInfo(param0.rawAddress, code, param2.rawAddress)

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbGetScrollPos(param0.rawAddress, code)

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbGetScrollProp(param0.rawAddress, propindex, param2.rawAddress)

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr, param3: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbGetScrollRange(param0.rawAddress, code, param2.rawAddress, param3.rawAddress)

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: MutPtr, fredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbSetScrollInfo(param0.rawAddress, code, psi.rawAddress, fredraw)

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbSetScrollPos(param0.rawAddress, code, pos, fredraw)

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbSetScrollProp(param0.rawAddress, index.toInt(), newvalue, param3)

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbSetScrollRange(param0.rawAddress, code, min, max, fredraw)

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsFlatSbShowScrollBar(param0.rawAddress, code, param2)

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: MutPtr, pcxrow: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetBufferedPaintBits(hbufferedpaint, ppbbuffer.rawAddress, pcxrow.rawAddress)

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetBufferedPaintDC(hbufferedpaint))

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(hbufferedpaint))

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(hbufferedpaint, prc.rawAddress)

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetComboBoxInfo(hwndcombo.rawAddress, pcbi.rawAddress)

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetCurrentThemeName(pszthemefilename.rawAddress, cchmaxnamechars, pszcolorbuff.rawAddress, cchmaxcolorchars, pszsizebuff.rawAddress, cchmaxsizechars)

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: MutPtr, lpinfo: ConstPtr) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetEffectiveClientRect(hwnd.rawAddress, lprc.rawAddress, lpinfo.rawAddress)
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetListBoxInfo(hwnd.rawAddress).toUInt()

public actual fun getMUILanguage(): UShort =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetMUILanguage().toUShort()

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeAnimationProperty(htheme, istoryboardid, itargetid, eproperty, pvproperty.rawAddress, cbsize.toInt(), pcbsizeout.rawAddress)

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeAnimationTransform(htheme, istoryboardid, itargetid, dwtransformindex.toInt(), ptransform.rawAddress, cbsize.toInt(), pcbsizeout.rawAddress)

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeAppProperties().toUInt()

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: ConstPtr, pcontentrect: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(htheme, hdc.rawAddress, ipartid, istateid, pboundingrect.rawAddress, pcontentrect.rawAddress)

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: ConstPtr, pextentrect: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeBackgroundExtent(htheme, hdc.rawAddress, ipartid, istateid, pcontentrect.rawAddress, pextentrect.rawAddress)

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pregion: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeBackgroundRegion(htheme, hdc.rawAddress, ipartid, istateid, prect.rawAddress, pregion.rawAddress)

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeBitmap(htheme, ipartid, istateid, ipropid, dwflags.toInt(), phbitmap.rawAddress)

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeBool(htheme, ipartid, istateid, ipropid, pfval.rawAddress)

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeColor(htheme, ipartid, istateid, ipropid, pcolor.rawAddress)

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeDocumentationProperty(pszthemename.rawAddress, pszpropertyname.rawAddress, pszvaluebuff.rawAddress, cchmaxvalchars)

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeEnumValue(htheme, ipartid, istateid, ipropid, pival.rawAddress)

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeFilename(htheme, ipartid, istateid, ipropid, pszthemefilename.rawAddress, cchmaxbuffchars)

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeFont(htheme, hdc.rawAddress, ipartid, istateid, ipropid, pfont.rawAddress)

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeInt(htheme, ipartid, istateid, ipropid, pival.rawAddress)

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeIntList(htheme, ipartid, istateid, ipropid, pintlist.rawAddress)

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: ConstPtr, pmargins: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeMargins(htheme, hdc.rawAddress, ipartid, istateid, ipropid, prc.rawAddress, pmargins.rawAddress)

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeMetric(htheme, hdc.rawAddress, ipartid, istateid, ipropid, pival.rawAddress)

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: ConstPtr, esize: Themesize, psz: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemePartSize(htheme, hdc.rawAddress, ipartid, istateid, prc.rawAddress, esize, psz.rawAddress)

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemePosition(htheme, ipartid, istateid, ipropid, ppoint.rawAddress)

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemePropertyOrigin(htheme, ipartid, istateid, ipropid, porigin.rawAddress)

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeRect(htheme, ipartid, istateid, ipropid, prect.rawAddress)

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: MutPtr, pcbstream: MutPtr, hinst: Hinstance): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeStream(htheme, ipartid, istateid, ipropid, ppvstream.rawAddress, pcbstream.rawAddress, hinst.rawAddress)

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeString(htheme, ipartid, istateid, ipropid, pszbuff.rawAddress, cchmaxbuffchars)

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysBool(htheme, iboolid)

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysColor(htheme, icolorid).toUInt()

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysColorBrush(htheme, icolorid))

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysFont(htheme, ifontid, plf.rawAddress)

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysInt(htheme, iintid, pivalue.rawAddress)

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysSize(htheme, isizeid)

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeSysString(htheme, istringid, pszstringbuff.rawAddress, cchmaxstringchars)

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: ConstPtr, pextentrect: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeTextExtent(htheme, hdc.rawAddress, ipartid, istateid, psztext.rawAddress, cchcharcount, dwtextflags.toInt(), pboundingrect.rawAddress, pextentrect.rawAddress)

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeTextMetrics(htheme, hdc.rawAddress, ipartid, istateid, ptm.rawAddress)

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeTimingFunction(htheme, itimingfunctionid, ptimingfunction.rawAddress, cbsize.toInt(), pcbsizeout.rawAddress)

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetThemeTransitionDuration(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration.rawAddress)

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: MutPtr, config: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetWindowFeedbackSetting(hwnd.rawAddress, feedback, dwflags.toInt(), psize.rawAddress, config.rawAddress)

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsGetWindowTheme(hwnd.rawAddress)

public actual fun himagelistQueryInterface(himl: Himagelist, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsHimagelistQueryInterface(himl, riid.rawAddress, ppv.rawAddress)

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: ConstPtr, hrgn: Hrgn, pttest: Point, pwhittestcode: MutPtr): Hresult =
    0

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListAdd(himl, hbmimage.rawAddress, hbmmask.rawAddress)

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListAddMasked(himl, hbmimage.rawAddress, crmask.toInt())

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListBeginDrag(himltrack, itrack, dxhotspot, dyhotspot)

public actual fun imageListCoCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListCoCreateInstance(rclsid.rawAddress, punkouter.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListCopy(himldst, idst, himlsrc, isrc, uflags.toInt())

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListCreate(cx, cy, flags.toInt(), cinitial, cgrow)

public actual fun imageListDestroy(himl: Himagelist): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDestroy(himl)

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDragEnter(hwndlock.rawAddress, x, y)

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDragLeave(hwndlock.rawAddress)

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDragMove(x, y)

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDragShowNolock(fshow)

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDraw(himl, i, hdcdst.rawAddress, x, y, fstyle.toInt())

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDrawEx(himl, i, hdcdst.rawAddress, x, y, dx, dy, rgbbk.toInt(), rgbfg.toInt(), fstyle.toInt())

public actual fun imageListDrawIndirect(pimldp: ConstPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDrawIndirect(pimldp.rawAddress)

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListDuplicate(himl)

public actual fun imageListEndDrag() {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListEndDrag()
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListGetBkColor(himl).toUInt()

public actual fun imageListGetDragImage(ppt: MutPtr, ppthotspot: MutPtr): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListGetDragImage(ppt.rawAddress, ppthotspot.rawAddress)

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    MutPtr(WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListGetIcon(himl, i, flags.toInt()))

public actual fun imageListGetIconSize(himl: Himagelist, cx: MutPtr, cy: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListGetIconSize(himl, cx.rawAddress, cy.rawAddress)

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListGetImageCount(himl)

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListGetImageInfo(himl, i, pimageinfo.rawAddress)

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListLoadImageA(hi.rawAddress, lpbmp.rawAddress, cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt())

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListLoadImageW(hi.rawAddress, lpbmp.rawAddress, cx, cgrow, crmask.toInt(), utype.toInt(), uflags.toInt())

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListMerge(himl1, i1, himl2, i2, dx, dy)

public actual fun imageListRead(pstm: MutPtr): Himagelist =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListRead(pstm.rawAddress)

public actual fun imageListReadEx(dwflags: UInt, pstm: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListReadEx(dwflags.toInt(), pstm.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListRemove(himl, i)

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListReplace(himl, i, hbmimage.rawAddress, hbmmask.rawAddress)

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListReplaceIcon(himl, i, hicon.rawAddress)

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListSetBkColor(himl, clrbk.toInt()).toUInt()

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag, idrag, dxhotspot, dyhotspot)

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListSetIconSize(himl, cx, cy)

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListSetImageCount(himl, unewcount.toInt())

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListSetOverlayImage(himl, iimage, ioverlay)

public actual fun imageListWrite(himl: Himagelist, pstm: MutPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListWrite(himl, pstm.rawAddress)

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsImageListWriteEx(himl, dwflags.toInt(), pstm.rawAddress)

public actual fun initCommonControls() {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsInitCommonControls()
}

public actual fun initCommonControlsEx(picce: ConstPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsInitCommonControlsEx(picce.rawAddress)

public actual fun initMUILanguage(uilang: UShort) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsInitMUILanguage(uilang.toShort())
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsInitializeFlatSB(param0.rawAddress)

public actual fun isAppThemed(): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsAppThemed()

public actual fun isCharLowerW(ch: UShort): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsCharLowerW(ch.toShort())

public actual fun isCompositionActive(): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsCompositionActive()

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsDlgButtonChecked(hdlg.rawAddress, nidbutton).toUInt()

public actual fun isThemeActive(): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsThemeActive()

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme, ipartid, istateid)

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(hwnd.rawAddress)

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsIsThemePartDefined(htheme, ipartid, istateid)

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    0

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsLoadIconMetric(hinst.rawAddress, pszname.rawAddress, lims, phico.rawAddress)

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsLoadIconWithScaleDown(hinst.rawAddress, pszname.rawAddress, cx, cy, phico.rawAddress)

public actual fun makeDragList(hlb: Hwnd): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsMakeDragList(hlb.rawAddress)

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: ConstPtr) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsMenuHelp(umsg.toInt(), wparam.toLong(), lparam, hmainmenu.rawAddress, hinst.rawAddress, hwndstatus.rawAddress, lpwids.rawAddress)
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsOpenThemeData(hwnd.rawAddress, pszclasslist.rawAddress)

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsOpenThemeDataEx(hwnd.rawAddress, pszclasslist.rawAddress, dwflags.toInt())

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: ConstPtr, pproximityeval: ConstPtr): Lresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(phittestinginput.rawAddress, pproximityeval.rawAddress)

public actual fun propertySheetA(param0: MutPtr): Long =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsPropertySheetA(param0.rawAddress)

public actual fun propertySheetW(param0: MutPtr): Long =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsPropertySheetW(param0.rawAddress)

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(window.rawAddress, notifyrange)

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(hwnd.rawAddress, value.toInt())

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: ConstPtr, redraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetScrollInfo(hwnd.rawAddress, nbar, lpsi.rawAddress, redraw)

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetScrollPos(hwnd.rawAddress, nbar, npos, bredraw)

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetScrollRange(hwnd.rawAddress, nbar, nminpos, nmaxpos, bredraw)

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags.toInt())
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: ConstPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetWindowFeedbackSetting(hwnd.rawAddress, feedback, dwflags.toInt(), size.toInt(), configuration.rawAddress)

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetWindowTheme(hwnd.rawAddress, pszsubappname.rawAddress, pszsubidlist.rawAddress)

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: ConstPtr, cbattribute: UInt): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsSetWindowThemeAttribute(hwnd.rawAddress, eattribute, pvattribute.rawAddress, cbattribute.toInt())

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: ConstPtr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsShowHideMenuCtl(hwnd.rawAddress, uflags.toLong(), lpinfo.rawAddress)

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsShowScrollBar(hwnd.rawAddress, wbar, bshow)

public actual fun strSetPtrW(ppsz: MutPtr, psz: Pcwstr): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsStrSetPtrW(ppsz.rawAddress, psz.rawAddress)

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsTaskDialog(hwndowner.rawAddress, hinstance.rawAddress, pszwindowtitle.rawAddress, pszmaininstruction.rawAddress, pszcontent.rawAddress, dwcommonbuttons, pszicon.rawAddress, pnbutton.rawAddress)

public actual fun taskDialogIndirect(ptaskconfig: ConstPtr, pnbutton: MutPtr, pnradiobutton: MutPtr, pfverificationflagchecked: MutPtr): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsTaskDialogIndirect(ptaskconfig.rawAddress, pnbutton.rawAddress, pnradiobutton.rawAddress, pfverificationflagchecked.rawAddress)

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsUninitializeFlatSB(param0.rawAddress)

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    WindowsWin32UiControlsJniBridge.windowssysWindowsWin32UiControlsUpdatePanningFeedback(hwnd.rawAddress, ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia)
