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

public expect fun BeginBufferedAnimation(hwnd: HWND, hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, panimationparams: Long, phdcfrom: Long, phdcto: Long): Long

public expect fun BeginBufferedPaint(hdctarget: HDC, prctarget: Long, dwformat: BP_BUFFERFORMAT, ppaintparams: Long, phdc: Long): Long

public expect fun BeginPanningFeedback(hwnd: HWND): BOOL

public expect fun BufferedPaintClear(hbufferedpaint: Long, prc: Long): HRESULT

public expect fun BufferedPaintInit(): HRESULT

public expect fun BufferedPaintRenderAnimation(hwnd: HWND, hdctarget: HDC): BOOL

public expect fun BufferedPaintSetAlpha(hbufferedpaint: Long, prc: Long, alpha: UByte): HRESULT

public expect fun BufferedPaintStopAllAnimations(hwnd: HWND): HRESULT

public expect fun BufferedPaintUnInit(): HRESULT

public expect fun CheckDlgButton(hdlg: HWND, nidbutton: Int, ucheck: DLG_BUTTON_CHECK_STATE): BOOL

public expect fun CheckRadioButton(hdlg: HWND, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): BOOL

public expect fun CloseThemeData(htheme: HTHEME): HRESULT

public expect fun CreateMappedBitmap(hinstance: HINSTANCE, idbitmap: Long, wflags: UInt, lpcolormap: Long, inummaps: Int): HBITMAP

public expect fun CreatePropertySheetPageA(constpropsheetpagepointer: Long): HPROPSHEETPAGE

public expect fun CreatePropertySheetPageW(constpropsheetpagepointer: Long): HPROPSHEETPAGE

public expect fun CreateStatusWindowA(style: Int, lpsztext: PCSTR, hwndparent: HWND, wid: UInt): HWND

public expect fun CreateStatusWindowW(style: Int, lpsztext: PCWSTR, hwndparent: HWND, wid: UInt): HWND

public expect fun CreateSyntheticPointerDevice(pointertype: POINTER_INPUT_TYPE, maxcount: UInt, mode: POINTER_FEEDBACK_MODE): HSYNTHETICPOINTERDEVICE

public expect fun CreateToolbarEx(hwnd: HWND, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: HINSTANCE, wbmid: ULong, lpbuttons: Long, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): HWND

public expect fun CreateUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: HWND, nid: Int, hinst: HINSTANCE, hbuddy: HWND, nupper: Int, nlower: Int, npos: Int): HWND

public expect fun DPA_Clone(hdpa: HDPA, hdpanew: HDPA): HDPA

public expect fun DPA_Create(citemgrow: Int): HDPA

public expect fun DPA_CreateEx(cpgrow: Int, hheap: HANDLE): HDPA

public expect fun DPA_DeleteAllPtrs(hdpa: HDPA): BOOL

public expect fun DPA_DeletePtr(hdpa: HDPA, i: Int): Long

public expect fun DPA_Destroy(hdpa: HDPA): BOOL

public expect fun DPA_DestroyCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long)

public expect fun DPA_EnumCallback(hdpa: HDPA, pfncb: PFNDAENUMCALLBACK, pdata: Long)

public expect fun DPA_GetPtr(hdpa: HDPA, i: Long): Long

public expect fun DPA_GetPtrIndex(hdpa: HDPA, p: Long): Int

public expect fun DPA_GetSize(hdpa: HDPA): ULong

public expect fun DPA_Grow(pdpa: HDPA, cp: Int): BOOL

public expect fun DPA_InsertPtr(hdpa: HDPA, i: Int, p: Long): Int

public expect fun DPA_LoadStream(phdpa: Long, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT

public expect fun DPA_Merge(hdpadest: HDPA, hdpasrc: HDPA, dwflags: UInt, pfncompare: PFNDACOMPARE, pfnmerge: PFNDPAMERGE, lparam: LPARAM): BOOL

public expect fun DPA_SaveStream(hdpa: HDPA, pfn: PFNDPASTREAM, pstream: Long, pvinstdata: Long): HRESULT

public expect fun DPA_Search(hdpa: HDPA, pfind: Long, istart: Int, pfncompare: PFNDACOMPARE, lparam: LPARAM, options: UInt): Int

public expect fun DPA_SetPtr(hdpa: HDPA, i: Int, p: Long): BOOL

public expect fun DPA_Sort(hdpa: HDPA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL

public expect fun DSA_Clone(hdsa: HDSA): HDSA

public expect fun DSA_Create(cbitem: Int, citemgrow: Int): HDSA

public expect fun DSA_DeleteAllItems(hdsa: HDSA): BOOL

public expect fun DSA_DeleteItem(hdsa: HDSA, i: Int): BOOL

public expect fun DSA_Destroy(hdsa: HDSA): BOOL

public expect fun DSA_DestroyCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long)

public expect fun DSA_EnumCallback(hdsa: HDSA, pfncb: PFNDAENUMCALLBACK, pdata: Long)

public expect fun DSA_GetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL

public expect fun DSA_GetItemPtr(hdsa: HDSA, i: Int): Long

public expect fun DSA_GetSize(hdsa: HDSA): ULong

public expect fun DSA_InsertItem(hdsa: HDSA, i: Int, pitem: Long): Int

public expect fun DSA_SetItem(hdsa: HDSA, i: Int, pitem: Long): BOOL

public expect fun DSA_Sort(pdsa: HDSA, pfncompare: PFNDACOMPARE, lparam: LPARAM): BOOL

public expect fun DestroyPropertySheetPage(param0: HPROPSHEETPAGE): BOOL

public expect fun DestroySyntheticPointerDevice(device: HSYNTHETICPOINTERDEVICE)

public expect fun DlgDirListA(hdlg: HWND, lppathspec: PSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int

public expect fun DlgDirListComboBoxA(hdlg: HWND, lppathspec: PSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int

public expect fun DlgDirListComboBoxW(hdlg: HWND, lppathspec: PWSTR, nidcombobox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int

public expect fun DlgDirListW(hdlg: HWND, lppathspec: PWSTR, nidlistbox: Int, nidstaticpath: Int, ufiletype: DLG_DIR_LIST_FILE_TYPE): Int

public expect fun DlgDirSelectComboBoxExA(hwnddlg: HWND, lpstring: PSTR, cchout: Int, idcombobox: Int): BOOL

public expect fun DlgDirSelectComboBoxExW(hwnddlg: HWND, lpstring: PWSTR, cchout: Int, idcombobox: Int): BOOL

public expect fun DlgDirSelectExA(hwnddlg: HWND, lpstring: PSTR, chcount: Int, idlistbox: Int): BOOL

public expect fun DlgDirSelectExW(hwnddlg: HWND, lpstring: PWSTR, chcount: Int, idlistbox: Int): BOOL

public expect fun DrawInsert(handparent: HWND, hlb: HWND, nitem: Int)

public expect fun DrawShadowText(hdc: HDC, psztext: PCWSTR, cch: UInt, prc: Long, dwflags: UInt, crtext: COLORREF, crshadow: COLORREF, ixoffset: Int, iyoffset: Int): Int

public expect fun DrawStatusTextA(hdc: HDC, lprc: Long, psztext: PCSTR, uflags: UInt)

public expect fun DrawStatusTextW(hdc: HDC, lprc: Long, psztext: PCWSTR, uflags: UInt)

public expect fun DrawThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pcliprect: Long): HRESULT

public expect fun DrawThemeBackgroundEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, poptions: Long): HRESULT

public expect fun DrawThemeEdge(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pdestrect: Long, uedge: DRAWEDGE_FLAGS, uflags: DRAW_EDGE_FLAGS, pcontentrect: Long): HRESULT

public expect fun DrawThemeIcon(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, himl: HIMAGELIST, iimageindex: Int): HRESULT

public expect fun DrawThemeParentBackground(hwnd: HWND, hdc: HDC, prc: Long): HRESULT

public expect fun DrawThemeParentBackgroundEx(hwnd: HWND, hdc: HDC, dwflags: DRAW_THEME_PARENT_BACKGROUND_FLAGS, prc: Long): HRESULT

public expect fun DrawThemeText(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, dwtextflags2: UInt, prect: Long): HRESULT

public expect fun DrawThemeTextEx(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchtext: Int, dwtextflags: DRAW_TEXT_FORMAT, prect: Long, poptions: Long): HRESULT

public expect fun EnableScrollBar(hwnd: HWND, wsbflags: UInt, warrows: ENABLE_SCROLL_BAR_ARROWS): BOOL

public expect fun EnableThemeDialogTexture(hwnd: HWND, dwflags: UInt): HRESULT

public expect fun EnableTheming(fenable: BOOL): HRESULT

public expect fun EndBufferedAnimation(hbpanimation: Long, fupdatetarget: BOOL): HRESULT

public expect fun EndBufferedPaint(hbufferedpaint: Long, fupdatetarget: BOOL): HRESULT

public expect fun EndPanningFeedback(hwnd: HWND, fanimateback: BOOL): BOOL

public expect fun EvaluateProximityToPolygon(numvertices: UInt, controlpolygon: Long, phittestinginput: Long, pproximityeval: Long): BOOL

public expect fun EvaluateProximityToRect(controlboundingbox: Long, phittestinginput: Long, pproximityeval: Long): BOOL

public expect fun FlatSB_EnableScrollBar(param0: HWND, param1: Int, param2: UInt): BOOL

public expect fun FlatSB_GetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long): BOOL

public expect fun FlatSB_GetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS): Int

public expect fun FlatSB_GetScrollProp(param0: HWND, propindex: WSB_PROP, param2: Long): BOOL

public expect fun FlatSB_GetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: Long, param3: Long): BOOL

public expect fun FlatSB_SetScrollInfo(param0: HWND, code: SCROLLBAR_CONSTANTS, psi: Long, fredraw: BOOL): Int

public expect fun FlatSB_SetScrollPos(param0: HWND, code: SCROLLBAR_CONSTANTS, pos: Int, fredraw: BOOL): Int

public expect fun FlatSB_SetScrollProp(param0: HWND, index: UInt, newvalue: Long, param3: BOOL): BOOL

public expect fun FlatSB_SetScrollRange(param0: HWND, code: SCROLLBAR_CONSTANTS, min: Int, max: Int, fredraw: BOOL): Int

public expect fun FlatSB_ShowScrollBar(param0: HWND, code: SCROLLBAR_CONSTANTS, param2: BOOL): BOOL

public expect fun GetBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: Long, pcxrow: Long): HRESULT

public expect fun GetBufferedPaintDC(hbufferedpaint: Long): HDC

public expect fun GetBufferedPaintTargetDC(hbufferedpaint: Long): HDC

public expect fun GetBufferedPaintTargetRect(hbufferedpaint: Long, prc: Long): HRESULT

public expect fun GetComboBoxInfo(hwndcombo: HWND, pcbi: Long): BOOL

public expect fun GetCurrentThemeName(pszthemefilename: PWSTR, cchmaxnamechars: Int, pszcolorbuff: PWSTR, cchmaxcolorchars: Int, pszsizebuff: PWSTR, cchmaxsizechars: Int): HRESULT

public expect fun GetEffectiveClientRect(hwnd: HWND, lprc: Long, lpinfo: Long)

public expect fun GetListBoxInfo(hwnd: HWND): UInt

public expect fun GetMUILanguage(): UShort

public expect fun GetThemeAnimationProperty(htheme: HTHEME, istoryboardid: Int, itargetid: Int, eproperty: TA_PROPERTY, pvproperty: Long, cbsize: UInt, pcbsizeout: Long): HRESULT

public expect fun GetThemeAnimationTransform(htheme: HTHEME, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: Long, cbsize: UInt, pcbsizeout: Long): HRESULT

public expect fun GetThemeAppProperties(): SET_THEME_APP_PROPERTIES_FLAGS

public expect fun GetThemeBackgroundContentRect(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pboundingrect: Long, pcontentrect: Long): HRESULT

public expect fun GetThemeBackgroundExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, pcontentrect: Long, pextentrect: Long): HRESULT

public expect fun GetThemeBackgroundRegion(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prect: Long, pregion: Long): HRESULT

public expect fun GetThemeBitmap(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GET_THEME_BITMAP_FLAGS, phbitmap: Long): HRESULT

public expect fun GetThemeBool(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pfval: Long): HRESULT

public expect fun GetThemeColor(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pcolor: Long): HRESULT

public expect fun GetThemeDocumentationProperty(pszthemename: PCWSTR, pszpropertyname: PCWSTR, pszvaluebuff: PWSTR, cchmaxvalchars: Int): HRESULT

public expect fun GetThemeEnumValue(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT

public expect fun GetThemeFilename(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: PWSTR, cchmaxbuffchars: Int): HRESULT

public expect fun GetThemeFont(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pfont: Long): HRESULT

public expect fun GetThemeInt(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT

public expect fun GetThemeIntList(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pintlist: Long): HRESULT

public expect fun GetThemeMargins(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, prc: Long, pmargins: Long): HRESULT

public expect fun GetThemeMetric(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ipropid: Int, pival: Long): HRESULT

public expect fun GetThemePartSize(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, prc: Long, esize: THEMESIZE, psz: Long): HRESULT

public expect fun GetThemePosition(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppoint: Long): HRESULT

public expect fun GetThemePropertyOrigin(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, porigin: Long): HRESULT

public expect fun GetThemeRect(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, prect: Long): HRESULT

public expect fun GetThemeStream(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: Long, pcbstream: Long, hinst: HINSTANCE): HRESULT

public expect fun GetThemeString(htheme: HTHEME, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: PWSTR, cchmaxbuffchars: Int): HRESULT

public expect fun GetThemeSysBool(htheme: HTHEME, iboolid: Int): BOOL

public expect fun GetThemeSysColor(htheme: HTHEME, icolorid: Int): COLORREF

public expect fun GetThemeSysColorBrush(htheme: HTHEME, icolorid: Int): HBRUSH

public expect fun GetThemeSysFont(htheme: HTHEME, ifontid: Int, plf: Long): HRESULT

public expect fun GetThemeSysInt(htheme: HTHEME, iintid: Int, pivalue: Long): HRESULT

public expect fun GetThemeSysSize(htheme: HTHEME, isizeid: Int): Int

public expect fun GetThemeSysString(htheme: HTHEME, istringid: Int, pszstringbuff: PWSTR, cchmaxstringchars: Int): HRESULT

public expect fun GetThemeTextExtent(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, psztext: PCWSTR, cchcharcount: Int, dwtextflags: DRAW_TEXT_FORMAT, pboundingrect: Long, pextentrect: Long): HRESULT

public expect fun GetThemeTextMetrics(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, ptm: Long): HRESULT

public expect fun GetThemeTimingFunction(htheme: HTHEME, itimingfunctionid: Int, ptimingfunction: Long, cbsize: UInt, pcbsizeout: Long): HRESULT

public expect fun GetThemeTransitionDuration(htheme: HTHEME, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: Long): HRESULT

public expect fun GetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, psize: Long, config: Long): BOOL

public expect fun GetWindowTheme(hwnd: HWND): HTHEME

public expect fun HIMAGELIST_QueryInterface(himl: HIMAGELIST, riid: Long, ppv: Long): HRESULT

public expect fun HitTestThemeBackground(htheme: HTHEME, hdc: HDC, ipartid: Int, istateid: Int, dwoptions: HIT_TEST_BACKGROUND_OPTIONS, prect: Long, hrgn: HRGN, pttest: POINT, pwhittestcode: Long): HRESULT

public expect fun ImageList_Add(himl: HIMAGELIST, hbmimage: HBITMAP, hbmmask: HBITMAP): Int

public expect fun ImageList_AddMasked(himl: HIMAGELIST, hbmimage: HBITMAP, crmask: COLORREF): Int

public expect fun ImageList_BeginDrag(himltrack: HIMAGELIST, itrack: Int, dxhotspot: Int, dyhotspot: Int): BOOL

public expect fun ImageList_CoCreateInstance(rclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT

public expect fun ImageList_Copy(himldst: HIMAGELIST, idst: Int, himlsrc: HIMAGELIST, isrc: Int, uflags: IMAGE_LIST_COPY_FLAGS): BOOL

public expect fun ImageList_Create(cx: Int, cy: Int, flags: IMAGELIST_CREATION_FLAGS, cinitial: Int, cgrow: Int): HIMAGELIST

public expect fun ImageList_Destroy(himl: HIMAGELIST): BOOL

public expect fun ImageList_DragEnter(hwndlock: HWND, x: Int, y: Int): BOOL

public expect fun ImageList_DragLeave(hwndlock: HWND): BOOL

public expect fun ImageList_DragMove(x: Int, y: Int): BOOL

public expect fun ImageList_DragShowNolock(fshow: BOOL): BOOL

public expect fun ImageList_Draw(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL

public expect fun ImageList_DrawEx(himl: HIMAGELIST, i: Int, hdcdst: HDC, x: Int, y: Int, dx: Int, dy: Int, rgbbk: COLORREF, rgbfg: COLORREF, fstyle: IMAGE_LIST_DRAW_STYLE): BOOL

public expect fun ImageList_DrawIndirect(pimldp: Long): BOOL

public expect fun ImageList_Duplicate(himl: HIMAGELIST): HIMAGELIST

public expect fun ImageList_EndDrag()

public expect fun ImageList_GetBkColor(himl: HIMAGELIST): COLORREF

public expect fun ImageList_GetDragImage(ppt: Long, ppthotspot: Long): HIMAGELIST

public expect fun ImageList_GetIcon(himl: HIMAGELIST, i: Int, flags: IMAGE_LIST_DRAW_STYLE): HICON

public expect fun ImageList_GetIconSize(himl: HIMAGELIST, cx: Long, cy: Long): BOOL

public expect fun ImageList_GetImageCount(himl: HIMAGELIST): Int

public expect fun ImageList_GetImageInfo(himl: HIMAGELIST, i: Int, pimageinfo: Long): BOOL

public expect fun ImageList_LoadImageA(hi: HINSTANCE, lpbmp: PCSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST

public expect fun ImageList_LoadImageW(hi: HINSTANCE, lpbmp: PCWSTR, cx: Int, cgrow: Int, crmask: COLORREF, utype: UInt, uflags: IMAGE_FLAGS): HIMAGELIST

public expect fun ImageList_Merge(himl1: HIMAGELIST, i1: Int, himl2: HIMAGELIST, i2: Int, dx: Int, dy: Int): HIMAGELIST

public expect fun ImageList_Read(pstm: Long): HIMAGELIST

public expect fun ImageList_ReadEx(dwflags: UInt, pstm: Long, riid: Long, ppv: Long): HRESULT

public expect fun ImageList_Remove(himl: HIMAGELIST, i: Int): BOOL

public expect fun ImageList_Replace(himl: HIMAGELIST, i: Int, hbmimage: HBITMAP, hbmmask: HBITMAP): BOOL

public expect fun ImageList_ReplaceIcon(himl: HIMAGELIST, i: Int, hicon: HICON): Int

public expect fun ImageList_SetBkColor(himl: HIMAGELIST, clrbk: COLORREF): COLORREF

public expect fun ImageList_SetDragCursorImage(himldrag: HIMAGELIST, idrag: Int, dxhotspot: Int, dyhotspot: Int): BOOL

public expect fun ImageList_SetIconSize(himl: HIMAGELIST, cx: Int, cy: Int): BOOL

public expect fun ImageList_SetImageCount(himl: HIMAGELIST, unewcount: UInt): BOOL

public expect fun ImageList_SetOverlayImage(himl: HIMAGELIST, iimage: Int, ioverlay: Int): BOOL

public expect fun ImageList_Write(himl: HIMAGELIST, pstm: Long): BOOL

public expect fun ImageList_WriteEx(himl: HIMAGELIST, dwflags: IMAGE_LIST_WRITE_STREAM_FLAGS, pstm: Long): HRESULT

public expect fun InitCommonControls()

public expect fun InitCommonControlsEx(picce: Long): BOOL

public expect fun InitMUILanguage(uilang: UShort)

public expect fun InitializeFlatSB(param0: HWND): BOOL

public expect fun IsAppThemed(): BOOL

public expect fun IsCharLowerW(ch: UShort): BOOL

public expect fun IsCompositionActive(): BOOL

public expect fun IsDlgButtonChecked(hdlg: HWND, nidbutton: Int): UInt

public expect fun IsThemeActive(): BOOL

public expect fun IsThemeBackgroundPartiallyTransparent(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL

public expect fun IsThemeDialogTextureEnabled(hwnd: HWND): BOOL

public expect fun IsThemePartDefined(htheme: HTHEME, ipartid: Int, istateid: Int): BOOL

public expect fun LBItemFromPt(hlb: HWND, pt: POINT, bautoscroll: BOOL): Int

public expect fun LoadIconMetric(hinst: HINSTANCE, pszname: PCWSTR, lims: _LI_METRIC, phico: Long): HRESULT

public expect fun LoadIconWithScaleDown(hinst: HINSTANCE, pszname: PCWSTR, cx: Int, cy: Int, phico: Long): HRESULT

public expect fun MakeDragList(hlb: HWND): BOOL

public expect fun MenuHelp(umsg: UInt, wparam: WPARAM, lparam: LPARAM, hmainmenu: HMENU, hinst: HINSTANCE, hwndstatus: HWND, lpwids: Long)

public expect fun OpenThemeData(hwnd: HWND, pszclasslist: PCWSTR): HTHEME

public expect fun OpenThemeDataEx(hwnd: HWND, pszclasslist: PCWSTR, dwflags: OPEN_THEME_DATA_FLAGS): HTHEME

public expect fun PackTouchHitTestingProximityEvaluation(phittestinginput: Long, pproximityeval: Long): LRESULT

public expect fun PropertySheetA(param0: Long): Long

public expect fun PropertySheetW(param0: Long): Long

public expect fun RegisterPointerDeviceNotifications(window: HWND, notifyrange: BOOL): BOOL

public expect fun RegisterTouchHitTestingWindow(hwnd: HWND, value: UInt): BOOL

public expect fun SetScrollInfo(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, lpsi: Long, redraw: BOOL): Int

public expect fun SetScrollPos(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, npos: Int, bredraw: BOOL): Int

public expect fun SetScrollRange(hwnd: HWND, nbar: SCROLLBAR_CONSTANTS, nminpos: Int, nmaxpos: Int, bredraw: BOOL): BOOL

public expect fun SetThemeAppProperties(dwflags: SET_THEME_APP_PROPERTIES_FLAGS)

public expect fun SetWindowFeedbackSetting(hwnd: HWND, feedback: FEEDBACK_TYPE, dwflags: UInt, size: UInt, configuration: Long): BOOL

public expect fun SetWindowTheme(hwnd: HWND, pszsubappname: PCWSTR, pszsubidlist: PCWSTR): HRESULT

public expect fun SetWindowThemeAttribute(hwnd: HWND, eattribute: WINDOWTHEMEATTRIBUTETYPE, pvattribute: Long, cbattribute: UInt): HRESULT

public expect fun ShowHideMenuCtl(hwnd: HWND, uflags: ULong, lpinfo: Long): BOOL

public expect fun ShowScrollBar(hwnd: HWND, wbar: SCROLLBAR_CONSTANTS, bshow: BOOL): BOOL

public expect fun Str_SetPtrW(ppsz: Long, psz: PCWSTR): BOOL

public expect fun TaskDialog(hwndowner: HWND, hinstance: HINSTANCE, pszwindowtitle: PCWSTR, pszmaininstruction: PCWSTR, pszcontent: PCWSTR, dwcommonbuttons: TASKDIALOG_COMMON_BUTTON_FLAGS, pszicon: PCWSTR, pnbutton: Long): HRESULT

public expect fun TaskDialogIndirect(ptaskconfig: Long, pnbutton: Long, pnradiobutton: Long, pfverificationflagchecked: Long): HRESULT

public expect fun UninitializeFlatSB(param0: HWND): HRESULT

public expect fun UpdatePanningFeedback(hwnd: HWND, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: BOOL): BOOL
