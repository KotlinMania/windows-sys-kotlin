package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public typealias AEROWIZARDPARTS = Int

public typealias ARROWBTNSTATES = Int

public typealias BACKGROUNDSTATES = Int

public typealias BACKGROUNDWITHBORDERSTATES = Int

public typealias BALLOONSTATES = Int

public typealias BALLOONSTEMSTATES = Int

public typealias BARBACKGROUNDSTATES = Int

public typealias BARITEMSTATES = Int

public typealias BGTYPE = Int

public typealias BODYSTATES = Int

public typealias BORDERSTATES = Int

public typealias BORDERTYPE = Int

public typealias BORDER_HSCROLLSTATES = Int

public typealias BORDER_HVSCROLLSTATES = Int

public typealias BORDER_NOSCROLLSTATES = Int

public typealias BORDER_VSCROLLSTATES = Int

public typealias BP_ANIMATIONSTYLE = Int

public typealias BP_BUFFERFORMAT = Int

public typealias BP_PAINTPARAMS_FLAGS = UInt

public typealias BUTTONPARTS = Int

public typealias BUTTON_IMAGELIST_ALIGN = UInt

public typealias CAPTIONSTATES = Int

public typealias CHECKBOXSTATES = Int

public typealias CHEVRONSTATES = Int

public typealias CHEVRONVERTSTATES = Int

public typealias CLOCKPARTS = Int

public typealias CLOCKSTATES = Int

public typealias CLOSEBUTTONSTATES = Int

public typealias CLOSESTATES = Int

public typealias COLLAPSEBUTTONSTATES = Int

public typealias COMBOBOXINFO_BUTTON_STATE = UInt

public typealias COMBOBOXPARTS = Int

public typealias COMBOBOXSTYLESTATES = Int

public typealias COMBOBOX_EX_ITEM_FLAGS = UInt

public typealias COMMANDLINKGLYPHSTATES = Int

public typealias COMMANDLINKSTATES = Int

public typealias COMMUNICATIONSPARTS = Int

public typealias CONTENTALIGNMENT = Int

public typealias CONTENTAREASTATES = Int

public typealias CONTENTLINKSTATES = Int

public typealias CONTENTPANESTATES = Int

public typealias CONTROLLABELSTATES = Int

public typealias CONTROLPANELPARTS = Int

public typealias COPYSTATES = Int

public typealias CREATELINKSTATES = Int

public typealias CUEBANNERSTATES = Int

public typealias DATEBORDERSTATES = Int

public typealias DATEPICKERPARTS = Int

public typealias DATETEXTSTATES = Int

public typealias DLG_BUTTON_CHECK_STATE = UInt

public typealias DLG_DIR_LIST_FILE_TYPE = UInt

public typealias DOWNHORZSTATES = Int

public typealias DOWNSTATES = Int

public typealias DPAMM_MESSAGE = UInt

public typealias DRAGDROPPARTS = Int

public typealias DRAGLISTINFO_NOTIFICATION_FLAGS = UInt

public typealias DRAWITEMSTRUCT_CTL_TYPE = UInt

public typealias DRAW_THEME_PARENT_BACKGROUND_FLAGS = UInt

public typealias DROPDOWNBUTTONLEFTSTATES = Int

public typealias DROPDOWNBUTTONRIGHTSTATES = Int

public typealias DROPDOWNITEMSTATES = Int

public typealias DTTOPTS_FLAGS = UInt

public fun interface DTT_CALLBACK_PROCFn {
    public operator fun invoke(hdc: Graphics.Gdi.HDC, psztext: PWSTR, cchtext: Int, prc: Long, dwflags: UInt, lparam: Foundation.LPARAM): Int
}

public typealias DTT_CALLBACK_PROC = DTT_CALLBACK_PROCFn?

public typealias EC_ENDOFLINE = Int

public typealias EC_SEARCHWEB_ENTRYPOINT = Int

public typealias EDITBALLOONTIP_ICON = Int

public typealias EDITBORDER_HSCROLLSTATES = Int

public typealias EDITBORDER_HVSCROLLSTATES = Int

public typealias EDITBORDER_NOSCROLLSTATES = Int

public typealias EDITBORDER_VSCROLLSTATES = Int

public typealias EDITPARTS = Int

public typealias EDITTEXTSTATES = Int

public fun interface EDITWORDBREAKPROCAFn {
    public operator fun invoke(lpch: PCSTR, ichcurrent: Int, cch: Int, code: WORD_BREAK_ACTION): Int
}

public typealias EDITWORDBREAKPROCA = EDITWORDBREAKPROCAFn?

public fun interface EDITWORDBREAKPROCWFn {
    public operator fun invoke(lpch: PCWSTR, ichcurrent: Int, cch: Int, code: WORD_BREAK_ACTION): Int
}

public typealias EDITWORDBREAKPROCW = EDITWORDBREAKPROCWFn?

public typealias EMPTYMARKUPPARTS = Int

public typealias ENABLE_SCROLL_BAR_ARROWS = UInt

public typealias EXPANDBUTTONSTATES = Int

public typealias EXPANDOBUTTONSTATES = Int

public typealias EXPLORERBARPARTS = Int

public typealias FEEDBACK_TYPE = Int

public typealias FILLSTATES = Int

public typealias FILLTYPE = Int

public typealias FILLVERTSTATES = Int

public typealias FLYOUTPARTS = Int

public typealias FRAMEBOTTOMSTATES = Int

public typealias FRAMELEFTSTATES = Int

public typealias FRAMERIGHTSTATES = Int

public typealias FRAMESTATES = Int

public typealias GET_THEME_BITMAP_FLAGS = UInt

public typealias GLYPHFONTSIZINGTYPE = Int

public typealias GLYPHSTATES = Int

public typealias GLYPHTYPE = Int

public typealias GRIDCELLBACKGROUNDSTATES = Int

public typealias GRIDCELLSTATES = Int

public typealias GRIDCELLUPPERSTATES = Int

public typealias GRIPPERSTATES = Int

public typealias GROUPBOXSTATES = Int

public typealias GROUPHEADERLINESTATES = Int

public typealias GROUPHEADERSTATES = Int

public typealias HALIGN = Int

public typealias HDI_MASK = UInt

public typealias HDPA = Long

public typealias HDSA = Long

public typealias HEADERAREASTATES = Int

public typealias HEADERCLOSESTATES = Int

public typealias HEADERDROPDOWNFILTERSTATES = Int

public typealias HEADERDROPDOWNSTATES = Int

public typealias HEADERITEMLEFTSTATES = Int

public typealias HEADERITEMRIGHTSTATES = Int

public typealias HEADERITEMSTATES = Int

public typealias HEADEROVERFLOWSTATES = Int

public typealias HEADERPARTS = Int

public typealias HEADERPINSTATES = Int

public typealias HEADERSORTARROWSTATES = Int

public typealias HEADERSTYLESTATES = Int

public typealias HEADER_CONTROL_FORMAT_FLAGS = Int

public typealias HEADER_CONTROL_FORMAT_STATE = UInt

public typealias HEADER_CONTROL_FORMAT_TYPE = UInt

public typealias HEADER_CONTROL_NOTIFICATION_BUTTON = Int

public typealias HEADER_HITTEST_INFO_FLAGS = UInt

public typealias HELPBUTTONSTATES = Int

public typealias HELPLINKSTATES = Int

public typealias HIMAGELIST = Long

public typealias HIT_TEST_BACKGROUND_OPTIONS = UInt

public typealias HORZSCROLLSTATES = Int

public typealias HORZTHUMBSTATES = Int

public typealias HOTGLYPHSTATES = Int

public typealias HOVERBACKGROUNDSTATES = Int

public typealias HPROPSHEETPAGE = Long

public typealias HSYNTHETICPOINTERDEVICE = Long

public typealias HTHEME = Long

public typealias HTREEITEM = Long

public typealias HYPERLINKSTATES = Int

public typealias HYPERLINKTEXTSTATES = Int

public typealias ICONEFFECT = Int

public typealias IEBARMENUSTATES = Int

public typealias IMAGELAYOUT = Int

public typealias IMAGELIST_CREATION_FLAGS = UInt

public typealias IMAGESELECTTYPE = Int

public typealias IMAGE_LIST_COPY_FLAGS = UInt

public typealias IMAGE_LIST_DRAW_STYLE = UInt

public typealias IMAGE_LIST_ITEM_FLAGS = UInt

public typealias IMAGE_LIST_WRITE_STREAM_FLAGS = UInt

public typealias INITCOMMONCONTROLSEX_ICC = UInt

public typealias ITEMSTATES = Int

public typealias LABELSTATES = Int

public typealias LINKHEADERSTATES = Int

public typealias LINKPARTS = Int

public typealias LINKSTATES = Int

public typealias LISTBOXPARTS = Int

public typealias LISTITEMSTATES = Int

public typealias LISTVIEWPARTS = Int

public typealias LIST_ITEM_FLAGS = UInt

public typealias LIST_ITEM_STATE_FLAGS = UInt

public typealias LIST_VIEW_BACKGROUND_IMAGE_FLAGS = UInt

public typealias LIST_VIEW_GROUP_ALIGN_FLAGS = UInt

public typealias LIST_VIEW_GROUP_STATE_FLAGS = UInt

public typealias LIST_VIEW_ITEM_COLUMN_FORMAT_FLAGS = Int

public typealias LIST_VIEW_ITEM_FLAGS = UInt

public typealias LIST_VIEW_ITEM_STATE_FLAGS = UInt

public typealias LOGOFFBUTTONSSTATES = Int

public fun interface LPFNADDPROPSHEETPAGESFn {
    public operator fun invoke(param0: Long, param1: LPFNSVADDPROPSHEETPAGE, param2: Foundation.LPARAM): BOOL
}

public typealias LPFNADDPROPSHEETPAGES = LPFNADDPROPSHEETPAGESFn?

public fun interface LPFNCCINFOAFn {
    public operator fun invoke(acci: Long): UInt
}

public typealias LPFNCCINFOA = LPFNCCINFOAFn?

public fun interface LPFNCCINFOWFn {
    public operator fun invoke(acci: Long): UInt
}

public typealias LPFNCCINFOW = LPFNCCINFOWFn?

public fun interface LPFNCCSIZETOTEXTAFn {
    public operator fun invoke(flstyle: UInt, flextstyle: UInt, hfont: Graphics.Gdi.HFONT, psztext: PCSTR): Int
}

public typealias LPFNCCSIZETOTEXTA = LPFNCCSIZETOTEXTAFn?

public fun interface LPFNCCSIZETOTEXTWFn {
    public operator fun invoke(flstyle: UInt, flextstyle: UInt, hfont: Graphics.Gdi.HFONT, psztext: PCWSTR): Int
}

public typealias LPFNCCSIZETOTEXTW = LPFNCCSIZETOTEXTWFn?

public fun interface LPFNCCSTYLEAFn {
    public operator fun invoke(hwndparent: Foundation.HWND, pccs: Long): BOOL
}

public typealias LPFNCCSTYLEA = LPFNCCSTYLEAFn?

public fun interface LPFNCCSTYLEWFn {
    public operator fun invoke(hwndparent: Foundation.HWND, pccs: Long): BOOL
}

public typealias LPFNCCSTYLEW = LPFNCCSTYLEWFn?

public fun interface LPFNPSPCALLBACKAFn {
    public operator fun invoke(hwnd: Foundation.HWND, umsg: PSPCB_MESSAGE, ppsp: Long): UInt
}

public typealias LPFNPSPCALLBACKA = LPFNPSPCALLBACKAFn?

public fun interface LPFNPSPCALLBACKWFn {
    public operator fun invoke(hwnd: Foundation.HWND, umsg: PSPCB_MESSAGE, ppsp: Long): UInt
}

public typealias LPFNPSPCALLBACKW = LPFNPSPCALLBACKWFn?

public fun interface LPFNSVADDPROPSHEETPAGEFn {
    public operator fun invoke(param0: HPROPSHEETPAGE, param1: Foundation.LPARAM): BOOL
}

public typealias LPFNSVADDPROPSHEETPAGE = LPFNSVADDPROPSHEETPAGEFn?

public typealias LVCOLUMNW_FORMAT = Int

public typealias LVCOLUMNW_MASK = UInt

public typealias LVFINDINFOW_FLAGS = UInt

public typealias LVFOOTERITEM_MASK = UInt

public typealias LVGROUP_MASK = UInt

public typealias LVHITTESTINFO_FLAGS = UInt

public typealias LVITEMA_GROUP_ID = Int

public typealias LVTILEVIEWINFO_FLAGS = UInt

public typealias LVTILEVIEWINFO_MASK = UInt

public typealias MARKUPTEXTSTATES = Int

public typealias MAXBUTTONSTATES = Int

public typealias MAXCAPTIONSTATES = Int

public typealias MCGRIDINFO_FLAGS = UInt

public typealias MCGRIDINFO_PART = UInt

public typealias MCHITTESTINFO_HIT_FLAGS = UInt

public typealias MDICLOSEBUTTONSTATES = Int

public typealias MDIMINBUTTONSTATES = Int

public typealias MDIRESTOREBUTTONSTATES = Int

public typealias MENUBANDPARTS = Int

public typealias MENUBANDSTATES = Int

public typealias MENUPARTS = Int

public typealias MINBUTTONSTATES = Int

public typealias MINCAPTIONSTATES = Int

public typealias MONTHCALPARTS = Int

public typealias MONTH_CALDENDAR_MESSAGES_VIEW = UInt

public typealias MOREPROGRAMSARROWBACKSTATES = Int

public typealias MOREPROGRAMSARROWSTATES = Int

public typealias MOREPROGRAMSTABSTATES = Int

public typealias MOVESTATES = Int

public typealias NAVIGATIONPARTS = Int

public typealias NAVNEXTSTATES = Int

public typealias NAVPREVSTATES = Int

public typealias NAV_BACKBUTTONSTATES = Int

public typealias NAV_FORWARDBUTTONSTATES = Int

public typealias NAV_MENUBUTTONSTATES = Int

public typealias NMCUSTOMDRAW_DRAW_STAGE = UInt

public typealias NMCUSTOMDRAW_DRAW_STATE_FLAGS = UInt

public typealias NMDATETIMECHANGE_FLAGS = UInt

public typealias NMLVCUSTOMDRAW_ITEM_TYPE = UInt

public typealias NMLVEMPTYMARKUP_FLAGS = UInt

public typealias NMLVGETINFOTIP_FLAGS = UInt

public typealias NMPGCALCSIZE_FLAGS = UInt

public typealias NMPGSCROLL_DIR = Int

public typealias NMPGSCROLL_KEYS = UShort

public typealias NMREBAR_MASK_FLAGS = UInt

public typealias NMTBDISPINFOW_MASK = UInt

public typealias NMTBHOTITEM_FLAGS = UInt

public typealias NM_TREEVIEW_ACTION = UInt

public typealias NONESTATES = Int

public typealias NORMALGROUPCOLLAPSESTATES = Int

public typealias NORMALGROUPEXPANDSTATES = Int

public typealias ODA_FLAGS = UInt

public typealias ODS_FLAGS = UInt

public typealias OFFSETTYPE = Int

public typealias OPENBOXSTATES = Int

public typealias OPEN_THEME_DATA_FLAGS = UInt

public typealias PAGEPARTS = Int

public fun interface PFNDACOMPAREFn {
    public operator fun invoke(p1: Long, p2: Long, lparam: Foundation.LPARAM): Int
}

public typealias PFNDACOMPARE = PFNDACOMPAREFn?

public fun interface PFNDACOMPARECONSTFn {
    public operator fun invoke(p1: Long, p2: Long, lparam: Foundation.LPARAM): Int
}

public typealias PFNDACOMPARECONST = PFNDACOMPARECONSTFn?

public fun interface PFNDAENUMCALLBACKFn {
    public operator fun invoke(p: Long, pdata: Long): Int
}

public typealias PFNDAENUMCALLBACK = PFNDAENUMCALLBACKFn?

public fun interface PFNDAENUMCALLBACKCONSTFn {
    public operator fun invoke(p: Long, pdata: Long): Int
}

public typealias PFNDAENUMCALLBACKCONST = PFNDAENUMCALLBACKCONSTFn?

public fun interface PFNDPAMERGEFn {
    public operator fun invoke(umsg: DPAMM_MESSAGE, pvdest: Long, pvsrc: Long, lparam: Foundation.LPARAM): Long
}

public typealias PFNDPAMERGE = PFNDPAMERGEFn?

public fun interface PFNDPAMERGECONSTFn {
    public operator fun invoke(umsg: DPAMM_MESSAGE, pvdest: Long, pvsrc: Long, lparam: Foundation.LPARAM): Long
}

public typealias PFNDPAMERGECONST = PFNDPAMERGECONSTFn?

public fun interface PFNDPASTREAMFn {
    public operator fun invoke(pinfo: Long, pstream: Long, pvinstdata: Long): HRESULT
}

public typealias PFNDPASTREAM = PFNDPASTREAMFn?

public fun interface PFNLVCOMPAREFn {
    public operator fun invoke(param0: Foundation.LPARAM, param1: Foundation.LPARAM, param2: Foundation.LPARAM): Int
}

public typealias PFNLVCOMPARE = PFNLVCOMPAREFn?

public fun interface PFNLVGROUPCOMPAREFn {
    public operator fun invoke(param0: Int, param1: Int, param2: Long): Int
}

public typealias PFNLVGROUPCOMPARE = PFNLVGROUPCOMPAREFn?

public fun interface PFNPROPSHEETCALLBACKFn {
    public operator fun invoke(param0: Foundation.HWND, param1: UInt, param2: Foundation.LPARAM): Int
}

public typealias PFNPROPSHEETCALLBACK = PFNPROPSHEETCALLBACKFn?

public fun interface PFNTVCOMPAREFn {
    public operator fun invoke(lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM, lparamsort: Foundation.LPARAM): Int
}

public typealias PFNTVCOMPARE = PFNTVCOMPAREFn?

public fun interface PFTASKDIALOGCALLBACKFn {
    public operator fun invoke(hwnd: Foundation.HWND, msg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, lprefdata: Long): HRESULT
}

public typealias PFTASKDIALOGCALLBACK = PFTASKDIALOGCALLBACKFn?

public typealias POINTER_DEVICE_CURSOR_TYPE = Int

public typealias POINTER_DEVICE_TYPE = Int

public typealias POINTER_FEEDBACK_MODE = Int

public typealias POPUPCHECKBACKGROUNDSTATES = Int

public typealias POPUPCHECKSTATES = Int

public typealias POPUPITEMFOCUSABLESTATES = Int

public typealias POPUPITEMKBFOCUSSTATES = Int

public typealias POPUPITEMSTATES = Int

public typealias POPUPSUBMENUHCHOTSTATES = Int

public typealias POPUPSUBMENUSTATES = Int

public typealias PROGRESSPARTS = Int

public typealias PROPERTYORIGIN = Int

public typealias PSPCB_MESSAGE = UInt

public typealias PUSHBUTTONDROPDOWNSTATES = Int

public typealias PUSHBUTTONSTATES = Int

public typealias RADIOBUTTONSTATES = Int

public typealias READONLYSTATES = Int

public typealias REBARPARTS = Int

public typealias RESTOREBUTTONSTATES = Int

public typealias SCROLLBARPARTS = Int

public typealias SCROLLBARSTYLESTATES = Int

public typealias SECTIONTITLELINKSTATES = Int

public typealias SET_THEME_APP_PROPERTIES_FLAGS = UInt

public typealias SHOWCALENDARBUTTONRIGHTSTATES = Int

public typealias SIZEBOXSTATES = Int

public typealias SIZINGTYPE = Int

public typealias SMALLCAPTIONSTATES = Int

public typealias SMALLCLOSEBUTTONSTATES = Int

public typealias SMALLFRAMEBOTTOMSTATES = Int

public typealias SMALLFRAMELEFTSTATES = Int

public typealias SMALLFRAMERIGHTSTATES = Int

public typealias SOFTWAREEXPLORERSTATES = Int

public typealias SPECIALGROUPCOLLAPSESTATES = Int

public typealias SPECIALGROUPEXPANDSTATES = Int

public typealias SPINPARTS = Int

public typealias SPLITTERSTATES = Int

public typealias SPLITTERVERTSTATES = Int

public typealias STANDARDSTATES = Int

public typealias STARTPANELPARTS = Int

public typealias STATICPARTS = Int

public typealias STATUSPARTS = Int

public typealias SYSBUTTONSTATES = Int

public typealias SYSTEMCLOSEHCHOTSTATES = Int

public typealias SYSTEMCLOSESTATES = Int

public typealias SYSTEMMAXIMIZEHCHOTSTATES = Int

public typealias SYSTEMMAXIMIZESTATES = Int

public typealias SYSTEMMINIMIZEHCHOTSTATES = Int

public typealias SYSTEMMINIMIZESTATES = Int

public typealias SYSTEMRESTOREHCHOTSTATES = Int

public typealias SYSTEMRESTORESTATES = Int

public typealias TABITEMBOTHEDGESTATES = Int

public typealias TABITEMLEFTEDGESTATES = Int

public typealias TABITEMRIGHTEDGESTATES = Int

public typealias TABITEMSTATES = Int

public typealias TABPARTS = Int

public typealias TABSTATES = Int

public typealias TAB_CONTROL_ITEM_STATE = UInt

public typealias TASKBANDPARTS = Int

public typealias TASKBARPARTS = Int

public typealias TASKDIALOGPARTS = Int

public typealias TASKDIALOG_COMMON_BUTTON_FLAGS = Int

public typealias TASKDIALOG_ELEMENTS = Int

public typealias TASKDIALOG_FLAGS = Int

public typealias TASKDIALOG_ICON_ELEMENTS = Int

public typealias TASKDIALOG_MESSAGES = Int

public typealias TASKDIALOG_NOTIFICATIONS = Int

public typealias TASKLINKSTATES = Int

public typealias TA_PROPERTY = Int

public typealias TA_PROPERTY_FLAG = Int

public typealias TA_TIMINGFUNCTION_TYPE = Int

public typealias TA_TRANSFORM_FLAG = Int

public typealias TA_TRANSFORM_TYPE = Int

public typealias TBBUTTONINFOW_MASK = UInt

public typealias TBINSERTMARK_FLAGS = UInt

public typealias TCHITTESTINFO_FLAGS = UInt

public typealias TCITEMHEADERA_MASK = UInt

public typealias TEXTSELECTIONGRIPPERPARTS = Int

public typealias TEXTSHADOWTYPE = Int

public typealias TEXTSTYLEPARTS = Int

public typealias THEMESIZE = Int

public typealias THEME_PROPERTY_SYMBOL_ID = UInt

public typealias THUMBBOTTOMSTATES = Int

public typealias THUMBLEFTSTATES = Int

public typealias THUMBRIGHTSTATES = Int

public typealias THUMBSTATES = Int

public typealias THUMBTOPSTATES = Int

public typealias THUMBVERTSTATES = Int

public typealias TICSSTATES = Int

public typealias TICSVERTSTATES = Int

public typealias TITLEBARSTATES = Int

public typealias TOOLBARPARTS = Int

public typealias TOOLBARSTYLESTATES = Int

public typealias TOOLTIPPARTS = Int

public typealias TOOLTIP_FLAGS = UInt

public typealias TOPTABITEMBOTHEDGESTATES = Int

public typealias TOPTABITEMLEFTEDGESTATES = Int

public typealias TOPTABITEMRIGHTEDGESTATES = Int

public typealias TOPTABITEMSTATES = Int

public typealias TRACKBARPARTS = Int

public typealias TRACKBARSTYLESTATES = Int

public typealias TRACKSTATES = Int

public typealias TRACKVERTSTATES = Int

public typealias TRAILINGGRIDCELLSTATES = Int

public typealias TRAILINGGRIDCELLUPPERSTATES = Int

public typealias TRANSPARENTBACKGROUNDSTATES = Int

public typealias TRANSPARENTBARSTATES = Int

public typealias TRANSPARENTBARVERTSTATES = Int

public typealias TRAYNOTIFYPARTS = Int

public typealias TREEITEMSTATES = Int

public typealias TREEVIEWPARTS = Int

public typealias TREE_VIEW_ITEM_STATE_FLAGS = UInt

public typealias TRUESIZESCALINGTYPE = Int

public typealias TVHITTESTINFO_FLAGS = UInt

public typealias TVITEMEXW_CHILDREN = Int

public typealias TVITEMPART = Int

public typealias TVITEM_MASK = UInt

public typealias UPDATEMETADATASTATES = Int

public typealias UPHORZSTATES = Int

public typealias UPSTATES = Int

public typealias USERTILEPARTS = Int

public typealias VALIGN = Int

public typealias VERTSCROLLSTATES = Int

public typealias VERTTHUMBSTATES = Int

public typealias WARNINGSTATES = Int

public typealias WINDOWPARTS = Int

public typealias WINDOWTHEMEATTRIBUTETYPE = Int

public typealias WORD_BREAK_ACTION = Int

public typealias WRENCHSTATES = Int

public typealias WSB_PROP = Int

public typealias _LI_METRIC = Int
