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

public expect fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, panimationparams: ConstPtr, phdcfrom: MutPtr, phdcto: MutPtr): Long

public expect fun beginBufferedPaint(hdctarget: Hdc, prctarget: ConstPtr, dwformat: BpBufferformat, ppaintparams: ConstPtr, phdc: MutPtr): Long

public expect fun beginPanningFeedback(hwnd: Hwnd): Bool

public expect fun bufferedPaintClear(hbufferedpaint: Long, prc: ConstPtr): Hresult

public expect fun bufferedPaintInit(): Hresult

public expect fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool

public expect fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: ConstPtr, alpha: UByte): Hresult

public expect fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult

public expect fun bufferedPaintUnInit(): Hresult

public expect fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool

public expect fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool

public expect fun closeThemeData(htheme: Htheme): Hresult

public expect fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: ConstPtr, inummaps: Int): Hbitmap

public expect fun createPropertySheetPageA(constpropsheetpagepointer: MutPtr): Hpropsheetpage

public expect fun createPropertySheetPageW(constpropsheetpagepointer: MutPtr): Hpropsheetpage

public expect fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd

public expect fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd

public expect fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice

public expect fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: MutPtr, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd

public expect fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd

public expect fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa

public expect fun dpaCreate(citemgrow: Int): Hdpa

public expect fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa

public expect fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool

public expect fun dpaDeletePtr(hdpa: Hdpa, i: Int): MutPtr

public expect fun dpaDestroy(hdpa: Hdpa): Bool

public expect fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr)

public expect fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr)

public expect fun dpaGetPtr(hdpa: Hdpa, i: Long): MutPtr

public expect fun dpaGetPtrIndex(hdpa: Hdpa, p: ConstPtr): Int

public expect fun dpaGetSize(hdpa: Hdpa): ULong

public expect fun dpaGrow(pdpa: Hdpa, cp: Int): Bool

public expect fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Int

public expect fun dpaLoadStream(phdpa: MutPtr, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult

public expect fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool

public expect fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: MutPtr, pvinstdata: ConstPtr): Hresult

public expect fun dpaSearch(hdpa: Hdpa, pfind: ConstPtr, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int

public expect fun dpaSetPtr(hdpa: Hdpa, i: Int, p: ConstPtr): Bool

public expect fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool

public expect fun dsaClone(hdsa: Hdsa): Hdsa

public expect fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa

public expect fun dsaDeleteAllItems(hdsa: Hdsa): Bool

public expect fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool

public expect fun dsaDestroy(hdsa: Hdsa): Bool

public expect fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr)

public expect fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr)

public expect fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: MutPtr): Bool

public expect fun dsaGetItemPtr(hdsa: Hdsa, i: Int): MutPtr

public expect fun dsaGetSize(hdsa: Hdsa): ULong

public expect fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Int

public expect fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: ConstPtr): Bool

public expect fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool

public expect fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool

public expect fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice)

public expect fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int

public expect fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int

public expect fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int

public expect fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int

public expect fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool

public expect fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool

public expect fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool

public expect fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool

public expect fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int)

public expect fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: ConstPtr, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int

public expect fun drawStatusTextA(hdc: Hdc, lprc: MutPtr, psztext: Pcstr, uflags: UInt)

public expect fun drawStatusTextW(hdc: Hdc, lprc: MutPtr, psztext: Pcwstr, uflags: UInt)

public expect fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pcliprect: ConstPtr): Hresult

public expect fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, poptions: ConstPtr): Hresult

public expect fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: ConstPtr, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: MutPtr): Hresult

public expect fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, himl: Himagelist, iimageindex: Int): Hresult

public expect fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: ConstPtr): Hresult

public expect fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: ConstPtr): Hresult

public expect fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: ConstPtr): Hresult

public expect fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: MutPtr, poptions: ConstPtr): Hresult

public expect fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool

public expect fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult

public expect fun enableTheming(fenable: Bool): Hresult

public expect fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult

public expect fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult

public expect fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool

public expect fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool

public expect fun evaluateProximityToRect(controlboundingbox: ConstPtr, phittestinginput: ConstPtr, pproximityeval: MutPtr): Bool

public expect fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool

public expect fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr): Bool

public expect fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int

public expect fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: MutPtr): Bool

public expect fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr, param3: MutPtr): Bool

public expect fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: MutPtr, fredraw: Bool): Int

public expect fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int

public expect fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool

public expect fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int

public expect fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool

public expect fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: MutPtr, pcxrow: MutPtr): Hresult

public expect fun getBufferedPaintDC(hbufferedpaint: Long): Hdc

public expect fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc

public expect fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: MutPtr): Hresult

public expect fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: MutPtr): Bool

public expect fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult

public expect fun getEffectiveClientRect(hwnd: Hwnd, lprc: MutPtr, lpinfo: ConstPtr)

public expect fun getListBoxInfo(hwnd: Hwnd): UInt

public expect fun getMUILanguage(): UShort

public expect fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult

public expect fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult

public expect fun getThemeAppProperties(): SetThemeAppPropertiesFlags

public expect fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: ConstPtr, pcontentrect: MutPtr): Hresult

public expect fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: ConstPtr, pextentrect: MutPtr): Hresult

public expect fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr, pregion: MutPtr): Hresult

public expect fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: MutPtr): Hresult

public expect fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: MutPtr): Hresult

public expect fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: MutPtr): Hresult

public expect fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult

public expect fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult

public expect fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult

public expect fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: MutPtr): Hresult

public expect fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult

public expect fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: MutPtr): Hresult

public expect fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: ConstPtr, pmargins: MutPtr): Hresult

public expect fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr): Hresult

public expect fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: ConstPtr, esize: Themesize, psz: MutPtr): Hresult

public expect fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: MutPtr): Hresult

public expect fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: MutPtr): Hresult

public expect fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: MutPtr): Hresult

public expect fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: MutPtr, pcbstream: MutPtr, hinst: Hinstance): Hresult

public expect fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult

public expect fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool

public expect fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref

public expect fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush

public expect fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: MutPtr): Hresult

public expect fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: MutPtr): Hresult

public expect fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int

public expect fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult

public expect fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: ConstPtr, pextentrect: MutPtr): Hresult

public expect fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: MutPtr): Hresult

public expect fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: MutPtr, cbsize: UInt, pcbsizeout: MutPtr): Hresult

public expect fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: MutPtr): Hresult

public expect fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: MutPtr, config: MutPtr): Bool

public expect fun getWindowTheme(hwnd: Hwnd): Htheme

public expect fun himagelistQueryInterface(himl: Himagelist, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: ConstPtr, hrgn: Hrgn, pttest: Point, pwhittestcode: MutPtr): Hresult

public expect fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int

public expect fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int

public expect fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool

public expect fun imageListCoCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool

public expect fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist

public expect fun imageListDestroy(himl: Himagelist): Bool

public expect fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool

public expect fun imageListDragLeave(hwndlock: Hwnd): Bool

public expect fun imageListDragMove(x: Int, y: Int): Bool

public expect fun imageListDragShowNolock(fshow: Bool): Bool

public expect fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool

public expect fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool

public expect fun imageListDrawIndirect(pimldp: ConstPtr): Bool

public expect fun imageListDuplicate(himl: Himagelist): Himagelist

public expect fun imageListEndDrag()

public expect fun imageListGetBkColor(himl: Himagelist): Colorref

public expect fun imageListGetDragImage(ppt: MutPtr, ppthotspot: MutPtr): Himagelist

public expect fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon

public expect fun imageListGetIconSize(himl: Himagelist, cx: MutPtr, cy: MutPtr): Bool

public expect fun imageListGetImageCount(himl: Himagelist): Int

public expect fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: MutPtr): Bool

public expect fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist

public expect fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist

public expect fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist

public expect fun imageListRead(pstm: MutPtr): Himagelist

public expect fun imageListReadEx(dwflags: UInt, pstm: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun imageListRemove(himl: Himagelist, i: Int): Bool

public expect fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool

public expect fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int

public expect fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref

public expect fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool

public expect fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool

public expect fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool

public expect fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool

public expect fun imageListWrite(himl: Himagelist, pstm: MutPtr): Bool

public expect fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: MutPtr): Hresult

public expect fun initCommonControls()

public expect fun initCommonControlsEx(picce: ConstPtr): Bool

public expect fun initMUILanguage(uilang: UShort)

public expect fun initializeFlatSB(param0: Hwnd): Bool

public expect fun isAppThemed(): Bool

public expect fun isCharLowerW(ch: UShort): Bool

public expect fun isCompositionActive(): Bool

public expect fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt

public expect fun isThemeActive(): Bool

public expect fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool

public expect fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool

public expect fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool

public expect fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int

public expect fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: MutPtr): Hresult

public expect fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: MutPtr): Hresult

public expect fun makeDragList(hlb: Hwnd): Bool

public expect fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: ConstPtr)

public expect fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme

public expect fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme

public expect fun packTouchHitTestingProximityEvaluation(phittestinginput: ConstPtr, pproximityeval: ConstPtr): Lresult

public expect fun propertySheetA(param0: MutPtr): Long

public expect fun propertySheetW(param0: MutPtr): Long

public expect fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool

public expect fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool

public expect fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: ConstPtr, redraw: Bool): Int

public expect fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int

public expect fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool

public expect fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags)

public expect fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: ConstPtr): Bool

public expect fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult

public expect fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: ConstPtr, cbattribute: UInt): Hresult

public expect fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: ConstPtr): Bool

public expect fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool

public expect fun strSetPtrW(ppsz: MutPtr, psz: Pcwstr): Bool

public expect fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: MutPtr): Hresult

public expect fun taskDialogIndirect(ptaskconfig: ConstPtr, pnbutton: MutPtr, pnradiobutton: MutPtr, pfverificationflagchecked: MutPtr): Hresult

public expect fun uninitializeFlatSB(param0: Hwnd): Hresult

public expect fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool
