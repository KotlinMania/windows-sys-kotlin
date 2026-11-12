package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hfont

public typealias Aerowizardparts = Int

public typealias Arrowbtnstates = Int

public typealias Backgroundstates = Int

public typealias Backgroundwithborderstates = Int

public typealias Balloonstates = Int

public typealias Balloonstemstates = Int

public typealias Barbackgroundstates = Int

public typealias Baritemstates = Int

public typealias Bgtype = Int

public typealias Bodystates = Int

public typealias Borderstates = Int

public typealias Bordertype = Int

public typealias BorderHscrollstates = Int

public typealias BorderHvscrollstates = Int

public typealias BorderNoscrollstates = Int

public typealias BorderVscrollstates = Int

public typealias BpAnimationstyle = Int

public typealias BpBufferformat = Int

public typealias BpPaintparamsFlags = UInt

public typealias Buttonparts = Int

public typealias ButtonImagelistAlign = UInt

public typealias Captionstates = Int

public typealias Checkboxstates = Int

public typealias Chevronstates = Int

public typealias Chevronvertstates = Int

public typealias Clockparts = Int

public typealias Clockstates = Int

public typealias Closebuttonstates = Int

public typealias Closestates = Int

public typealias Collapsebuttonstates = Int

public typealias ComboboxinfoButtonState = UInt

public typealias Comboboxparts = Int

public typealias Comboboxstylestates = Int

public typealias ComboboxExItemFlags = UInt

public typealias Commandlinkglyphstates = Int

public typealias Commandlinkstates = Int

public typealias Communicationsparts = Int

public typealias Contentalignment = Int

public typealias Contentareastates = Int

public typealias Contentlinkstates = Int

public typealias Contentpanestates = Int

public typealias Controllabelstates = Int

public typealias Controlpanelparts = Int

public typealias Copystates = Int

public typealias Createlinkstates = Int

public typealias Cuebannerstates = Int

public typealias Dateborderstates = Int

public typealias Datepickerparts = Int

public typealias Datetextstates = Int

public typealias DlgButtonCheckState = UInt

public typealias DlgDirListFileType = UInt

public typealias Downhorzstates = Int

public typealias Downstates = Int

public typealias DpammMessage = UInt

public typealias Dragdropparts = Int

public typealias DraglistinfoNotificationFlags = UInt

public typealias DrawitemstructCtlType = UInt

public typealias DrawThemeParentBackgroundFlags = UInt

public typealias Dropdownbuttonleftstates = Int

public typealias Dropdownbuttonrightstates = Int

public typealias Dropdownitemstates = Int

public typealias DttoptsFlags = UInt

public fun interface DttCallbackProcFn {
    public operator fun invoke(hdc: Hdc, psztext: Pwstr, cchtext: Int, prc: MutPtr<Rect>, dwflags: UInt, lparam: Lparam): Int
}

public typealias DttCallbackProc = DttCallbackProcFn?

public typealias EcEndofline = Int

public typealias EcSearchwebEntrypoint = Int

public typealias EditballoontipIcon = Int

public typealias EditborderHscrollstates = Int

public typealias EditborderHvscrollstates = Int

public typealias EditborderNoscrollstates = Int

public typealias EditborderVscrollstates = Int

public typealias Editparts = Int

public typealias Edittextstates = Int

public fun interface EditwordbreakprocaFn {
    public operator fun invoke(lpch: Pcstr, ichcurrent: Int, cch: Int, code: WordBreakAction): Int
}

public typealias Editwordbreakproca = EditwordbreakprocaFn?

public fun interface EditwordbreakprocwFn {
    public operator fun invoke(lpch: Pcwstr, ichcurrent: Int, cch: Int, code: WordBreakAction): Int
}

public typealias Editwordbreakprocw = EditwordbreakprocwFn?

public typealias Emptymarkupparts = Int

public typealias EnableScrollBarArrows = UInt

public typealias Expandbuttonstates = Int

public typealias Expandobuttonstates = Int

public typealias Explorerbarparts = Int

public typealias FeedbackType = Int

public typealias Fillstates = Int

public typealias Filltype = Int

public typealias Fillvertstates = Int

public typealias Flyoutparts = Int

public typealias Framebottomstates = Int

public typealias Frameleftstates = Int

public typealias Framerightstates = Int

public typealias Framestates = Int

public typealias GetThemeBitmapFlags = UInt

public typealias Glyphfontsizingtype = Int

public typealias Glyphstates = Int

public typealias Glyphtype = Int

public typealias Gridcellbackgroundstates = Int

public typealias Gridcellstates = Int

public typealias Gridcellupperstates = Int

public typealias Gripperstates = Int

public typealias Groupboxstates = Int

public typealias Groupheaderlinestates = Int

public typealias Groupheaderstates = Int

public typealias Halign = Int

public typealias HdiMask = UInt

public typealias Hdpa = Long

public typealias Hdsa = Long

public typealias Headerareastates = Int

public typealias Headerclosestates = Int

public typealias Headerdropdownfilterstates = Int

public typealias Headerdropdownstates = Int

public typealias Headeritemleftstates = Int

public typealias Headeritemrightstates = Int

public typealias Headeritemstates = Int

public typealias Headeroverflowstates = Int

public typealias Headerparts = Int

public typealias Headerpinstates = Int

public typealias Headersortarrowstates = Int

public typealias Headerstylestates = Int

public typealias HeaderControlFormatFlags = Int

public typealias HeaderControlFormatState = UInt

public typealias HeaderControlFormatType = UInt

public typealias HeaderControlNotificationButton = Int

public typealias HeaderHittestInfoFlags = UInt

public typealias Helpbuttonstates = Int

public typealias Helplinkstates = Int

public typealias Himagelist = Long

public typealias HitTestBackgroundOptions = UInt

public typealias Horzscrollstates = Int

public typealias Horzthumbstates = Int

public typealias Hotglyphstates = Int

public typealias Hoverbackgroundstates = Int

public typealias Hpropsheetpage = MutPtr<CVoid>

public typealias Hsyntheticpointerdevice = MutPtr<CVoid>

public typealias Htheme = Long

public typealias Htreeitem = Long

public typealias Hyperlinkstates = Int

public typealias Hyperlinktextstates = Int

public typealias Iconeffect = Int

public typealias Iebarmenustates = Int

public typealias Imagelayout = Int

public typealias ImagelistCreationFlags = UInt

public typealias Imageselecttype = Int

public typealias ImageListCopyFlags = UInt

public typealias ImageListDrawStyle = UInt

public typealias ImageListItemFlags = UInt

public typealias ImageListWriteStreamFlags = UInt

public typealias InitcommoncontrolsexIcc = UInt

public typealias Itemstates = Int

public typealias Labelstates = Int

public typealias Linkheaderstates = Int

public typealias Linkparts = Int

public typealias Linkstates = Int

public typealias Listboxparts = Int

public typealias Listitemstates = Int

public typealias Listviewparts = Int

public typealias ListItemFlags = UInt

public typealias ListItemStateFlags = UInt

public typealias ListViewBackgroundImageFlags = UInt

public typealias ListViewGroupAlignFlags = UInt

public typealias ListViewGroupStateFlags = UInt

public typealias ListViewItemColumnFormatFlags = Int

public typealias ListViewItemFlags = UInt

public typealias ListViewItemStateFlags = UInt

public typealias Logoffbuttonsstates = Int

public fun interface LpfnaddpropsheetpagesFn {
    public operator fun invoke(param0: MutPtr<CVoid>, param1: Lpfnsvaddpropsheetpage, param2: Lparam): Bool
}

public typealias Lpfnaddpropsheetpages = LpfnaddpropsheetpagesFn?

public fun interface LpfnccinfoaFn {
    public operator fun invoke(acci: MutPtr<Ccinfoa>): UInt
}

public typealias Lpfnccinfoa = LpfnccinfoaFn?

public fun interface LpfnccinfowFn {
    public operator fun invoke(acci: MutPtr<Ccinfow>): UInt
}

public typealias Lpfnccinfow = LpfnccinfowFn?

public fun interface LpfnccsizetotextaFn {
    public operator fun invoke(flstyle: UInt, flextstyle: UInt, hfont: Hfont, psztext: Pcstr): Int
}

public typealias Lpfnccsizetotexta = LpfnccsizetotextaFn?

public fun interface LpfnccsizetotextwFn {
    public operator fun invoke(flstyle: UInt, flextstyle: UInt, hfont: Hfont, psztext: Pcwstr): Int
}

public typealias Lpfnccsizetotextw = LpfnccsizetotextwFn?

public fun interface LpfnccstyleaFn {
    public operator fun invoke(hwndparent: Hwnd, pccs: MutPtr<Ccstylea>): Bool
}

public typealias Lpfnccstylea = LpfnccstyleaFn?

public fun interface LpfnccstylewFn {
    public operator fun invoke(hwndparent: Hwnd, pccs: MutPtr<Ccstylew>): Bool
}

public typealias Lpfnccstylew = LpfnccstylewFn?

public fun interface LpfnpspcallbackaFn {
    public operator fun invoke(hwnd: Hwnd, umsg: PspcbMessage, ppsp: MutPtr<Propsheetpagea>): UInt
}

public typealias Lpfnpspcallbacka = LpfnpspcallbackaFn?

public fun interface LpfnpspcallbackwFn {
    public operator fun invoke(hwnd: Hwnd, umsg: PspcbMessage, ppsp: MutPtr<Propsheetpagew>): UInt
}

public typealias Lpfnpspcallbackw = LpfnpspcallbackwFn?

public fun interface LpfnsvaddpropsheetpageFn {
    public operator fun invoke(param0: Hpropsheetpage, param1: Lparam): Bool
}

public typealias Lpfnsvaddpropsheetpage = LpfnsvaddpropsheetpageFn?

public typealias LvcolumnwFormat = Int

public typealias LvcolumnwMask = UInt

public typealias LvfindinfowFlags = UInt

public typealias LvfooteritemMask = UInt

public typealias LvgroupMask = UInt

public typealias LvhittestinfoFlags = UInt

public typealias LvitemaGroupId = Int

public typealias LvtileviewinfoFlags = UInt

public typealias LvtileviewinfoMask = UInt

public typealias Markuptextstates = Int

public typealias Maxbuttonstates = Int

public typealias Maxcaptionstates = Int

public typealias McgridinfoFlags = UInt

public typealias McgridinfoPart = UInt

public typealias MchittestinfoHitFlags = UInt

public typealias Mdiclosebuttonstates = Int

public typealias Mdiminbuttonstates = Int

public typealias Mdirestorebuttonstates = Int

public typealias Menubandparts = Int

public typealias Menubandstates = Int

public typealias Menuparts = Int

public typealias Minbuttonstates = Int

public typealias Mincaptionstates = Int

public typealias Monthcalparts = Int

public typealias MonthCaldendarMessagesView = UInt

public typealias Moreprogramsarrowbackstates = Int

public typealias Moreprogramsarrowstates = Int

public typealias Moreprogramstabstates = Int

public typealias Movestates = Int

public typealias Navigationparts = Int

public typealias Navnextstates = Int

public typealias Navprevstates = Int

public typealias NavBackbuttonstates = Int

public typealias NavForwardbuttonstates = Int

public typealias NavMenubuttonstates = Int

public typealias NmcustomdrawDrawStage = UInt

public typealias NmcustomdrawDrawStateFlags = UInt

public typealias NmdatetimechangeFlags = UInt

public typealias NmlvcustomdrawItemType = UInt

public typealias NmlvemptymarkupFlags = UInt

public typealias NmlvgetinfotipFlags = UInt

public typealias NmpgcalcsizeFlags = UInt

public typealias NmpgscrollDir = Int

public typealias NmpgscrollKeys = UShort

public typealias NmrebarMaskFlags = UInt

public typealias NmtbdispinfowMask = UInt

public typealias NmtbhotitemFlags = UInt

public typealias NmTreeviewAction = UInt

public typealias Nonestates = Int

public typealias Normalgroupcollapsestates = Int

public typealias Normalgroupexpandstates = Int

public typealias OdaFlags = UInt

public typealias OdsFlags = UInt

public typealias Offsettype = Int

public typealias Openboxstates = Int

public typealias OpenThemeDataFlags = UInt

public typealias Pageparts = Int

public fun interface PfndacompareFn {
    public operator fun invoke(p1: ConstPtr<CVoid>, p2: ConstPtr<CVoid>, lparam: Lparam): Int
}

public typealias Pfndacompare = PfndacompareFn?

public fun interface PfndacompareconstFn {
    public operator fun invoke(p1: ConstPtr<CVoid>, p2: ConstPtr<CVoid>, lparam: Lparam): Int
}

public typealias Pfndacompareconst = PfndacompareconstFn?

public fun interface PfndaenumcallbackFn {
    public operator fun invoke(p: ConstPtr<CVoid>, pdata: ConstPtr<CVoid>): Int
}

public typealias Pfndaenumcallback = PfndaenumcallbackFn?

public fun interface PfndaenumcallbackconstFn {
    public operator fun invoke(p: ConstPtr<CVoid>, pdata: ConstPtr<CVoid>): Int
}

public typealias Pfndaenumcallbackconst = PfndaenumcallbackconstFn?

public fun interface PfndpamergeFn {
    public operator fun invoke(umsg: DpammMessage, pvdest: ConstPtr<CVoid>, pvsrc: ConstPtr<CVoid>, lparam: Lparam): MutPtr<CVoid>
}

public typealias Pfndpamerge = PfndpamergeFn?

public fun interface PfndpamergeconstFn {
    public operator fun invoke(umsg: DpammMessage, pvdest: ConstPtr<CVoid>, pvsrc: ConstPtr<CVoid>, lparam: Lparam): MutPtr<CVoid>
}

public typealias Pfndpamergeconst = PfndpamergeconstFn?

public fun interface PfndpastreamFn {
    public operator fun invoke(pinfo: ConstPtr<Dpastreaminfo>, pstream: MutPtr<CVoid>, pvinstdata: ConstPtr<CVoid>): Hresult
}

public typealias Pfndpastream = PfndpastreamFn?

public fun interface PfnlvcompareFn {
    public operator fun invoke(param0: Lparam, param1: Lparam, param2: Lparam): Int
}

public typealias Pfnlvcompare = PfnlvcompareFn?

public fun interface PfnlvgroupcompareFn {
    public operator fun invoke(param0: Int, param1: Int, param2: MutPtr<CVoid>): Int
}

public typealias Pfnlvgroupcompare = PfnlvgroupcompareFn?

public fun interface PfnpropsheetcallbackFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Lparam): Int
}

public typealias Pfnpropsheetcallback = PfnpropsheetcallbackFn?

public fun interface PfntvcompareFn {
    public operator fun invoke(lparam1: Lparam, lparam2: Lparam, lparamsort: Lparam): Int
}

public typealias Pfntvcompare = PfntvcompareFn?

public fun interface PftaskdialogcallbackFn {
    public operator fun invoke(hwnd: Hwnd, msg: UInt, wparam: Wparam, lparam: Lparam, lprefdata: Long): Hresult
}

public typealias Pftaskdialogcallback = PftaskdialogcallbackFn?

public typealias PointerDeviceCursorType = Int

public typealias PointerDeviceType = Int

public typealias PointerFeedbackMode = Int

public typealias Popupcheckbackgroundstates = Int

public typealias Popupcheckstates = Int

public typealias Popupitemfocusablestates = Int

public typealias Popupitemkbfocusstates = Int

public typealias Popupitemstates = Int

public typealias Popupsubmenuhchotstates = Int

public typealias Popupsubmenustates = Int

public typealias Progressparts = Int

public typealias Propertyorigin = Int

public typealias PspcbMessage = UInt

public typealias Pushbuttondropdownstates = Int

public typealias Pushbuttonstates = Int

public typealias Radiobuttonstates = Int

public typealias Readonlystates = Int

public typealias Rebarparts = Int

public typealias Restorebuttonstates = Int

public typealias Scrollbarparts = Int

public typealias Scrollbarstylestates = Int

public typealias Sectiontitlelinkstates = Int

public typealias SetThemeAppPropertiesFlags = UInt

public typealias Showcalendarbuttonrightstates = Int

public typealias Sizeboxstates = Int

public typealias Sizingtype = Int

public typealias Smallcaptionstates = Int

public typealias Smallclosebuttonstates = Int

public typealias Smallframebottomstates = Int

public typealias Smallframeleftstates = Int

public typealias Smallframerightstates = Int

public typealias Softwareexplorerstates = Int

public typealias Specialgroupcollapsestates = Int

public typealias Specialgroupexpandstates = Int

public typealias Spinparts = Int

public typealias Splitterstates = Int

public typealias Splittervertstates = Int

public typealias Standardstates = Int

public typealias Startpanelparts = Int

public typealias Staticparts = Int

public typealias Statusparts = Int

public typealias Sysbuttonstates = Int

public typealias Systemclosehchotstates = Int

public typealias Systemclosestates = Int

public typealias Systemmaximizehchotstates = Int

public typealias Systemmaximizestates = Int

public typealias Systemminimizehchotstates = Int

public typealias Systemminimizestates = Int

public typealias Systemrestorehchotstates = Int

public typealias Systemrestorestates = Int

public typealias Tabitembothedgestates = Int

public typealias Tabitemleftedgestates = Int

public typealias Tabitemrightedgestates = Int

public typealias Tabitemstates = Int

public typealias Tabparts = Int

public typealias Tabstates = Int

public typealias TabControlItemState = UInt

public typealias Taskbandparts = Int

public typealias Taskbarparts = Int

public typealias Taskdialogparts = Int

public typealias TaskdialogCommonButtonFlags = Int

public typealias TaskdialogElements = Int

public typealias TaskdialogFlags = Int

public typealias TaskdialogIconElements = Int

public typealias TaskdialogMessages = Int

public typealias TaskdialogNotifications = Int

public typealias Tasklinkstates = Int

public typealias TaProperty = Int

public typealias TaPropertyFlag = Int

public typealias TaTimingfunctionType = Int

public typealias TaTransformFlag = Int

public typealias TaTransformType = Int

public typealias TbbuttoninfowMask = UInt

public typealias TbinsertmarkFlags = UInt

public typealias TchittestinfoFlags = UInt

public typealias TcitemheaderaMask = UInt

public typealias Textselectiongripperparts = Int

public typealias Textshadowtype = Int

public typealias Textstyleparts = Int

public typealias Themesize = Int

public typealias ThemePropertySymbolId = UInt

public typealias Thumbbottomstates = Int

public typealias Thumbleftstates = Int

public typealias Thumbrightstates = Int

public typealias Thumbstates = Int

public typealias Thumbtopstates = Int

public typealias Thumbvertstates = Int

public typealias Ticsstates = Int

public typealias Ticsvertstates = Int

public typealias Titlebarstates = Int

public typealias Toolbarparts = Int

public typealias Toolbarstylestates = Int

public typealias Tooltipparts = Int

public typealias TooltipFlags = UInt

public typealias Toptabitembothedgestates = Int

public typealias Toptabitemleftedgestates = Int

public typealias Toptabitemrightedgestates = Int

public typealias Toptabitemstates = Int

public typealias Trackbarparts = Int

public typealias Trackbarstylestates = Int

public typealias Trackstates = Int

public typealias Trackvertstates = Int

public typealias Trailinggridcellstates = Int

public typealias Trailinggridcellupperstates = Int

public typealias Transparentbackgroundstates = Int

public typealias Transparentbarstates = Int

public typealias Transparentbarvertstates = Int

public typealias Traynotifyparts = Int

public typealias Treeitemstates = Int

public typealias Treeviewparts = Int

public typealias TreeViewItemStateFlags = UInt

public typealias Truesizescalingtype = Int

public typealias TvhittestinfoFlags = UInt

public typealias TvitemexwChildren = Int

public typealias Tvitempart = Int

public typealias TvitemMask = UInt

public typealias Updatemetadatastates = Int

public typealias Uphorzstates = Int

public typealias Upstates = Int

public typealias Usertileparts = Int

public typealias Valign = Int

public typealias Vertscrollstates = Int

public typealias Vertthumbstates = Int

public typealias Warningstates = Int

public typealias Windowparts = Int

public typealias Windowthemeattributetype = Int

public typealias WordBreakAction = Int

public typealias Wrenchstates = Int

public typealias WsbProp = Int

public typealias LiMetric = Int
