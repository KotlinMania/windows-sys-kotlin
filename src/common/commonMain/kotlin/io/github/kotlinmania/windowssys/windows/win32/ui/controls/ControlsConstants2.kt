package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val LVNI_FOCUSED: UInt = 1u

public val LVNI_PREVIOUS: UInt = 32u

public val LVNI_SAMEGROUPONLY: UInt = 128u

public val LVNI_SELECTED: UInt = 2u

public val LVNI_TOLEFT: UInt = 1024u

public val LVNI_TORIGHT: UInt = 2048u

public val LVNI_VISIBLEONLY: UInt = 64u

public val LVNI_VISIBLEORDER: UInt = 16u

public val LVNSCH_DEFAULT: Int = -1

public val LVNSCH_ERROR: Int = -2

public val LVNSCH_IGNORE: Int = -3

public val LVN_BEGINDRAG: UInt = 4294967187u

public val LVN_BEGINLABELEDIT: UInt = 4294967121u

public val LVN_BEGINLABELEDITA: UInt = 4294967191u

public val LVN_BEGINLABELEDITW: UInt = 4294967121u

public val LVN_BEGINRDRAG: UInt = 4294967185u

public val LVN_BEGINSCROLL: UInt = 4294967116u

public val LVN_COLUMNCLICK: UInt = 4294967188u

public val LVN_COLUMNDROPDOWN: UInt = 4294967132u

public val LVN_COLUMNOVERFLOWCLICK: UInt = 4294967130u

public val LVN_DELETEALLITEMS: UInt = 4294967192u

public val LVN_DELETEITEM: UInt = 4294967193u

public val LVN_ENDLABELEDIT: UInt = 4294967120u

public val LVN_ENDLABELEDITA: UInt = 4294967190u

public val LVN_ENDLABELEDITW: UInt = 4294967120u

public val LVN_ENDSCROLL: UInt = 4294967115u

public val LVN_FIRST: UInt = 4294967196u

public val LVN_GETDISPINFO: UInt = 4294967119u

public val LVN_GETDISPINFOA: UInt = 4294967146u

public val LVN_GETDISPINFOW: UInt = 4294967119u

public val LVN_GETEMPTYMARKUP: UInt = 4294967109u

public val LVN_GETINFOTIP: UInt = 4294967138u

public val LVN_GETINFOTIPA: UInt = 4294967139u

public val LVN_GETINFOTIPW: UInt = 4294967138u

public val LVN_HOTTRACK: UInt = 4294967175u

public val LVN_INCREMENTALSEARCH: UInt = 4294967133u

public val LVN_INCREMENTALSEARCHA: UInt = 4294967134u

public val LVN_INCREMENTALSEARCHW: UInt = 4294967133u

public val LVN_INSERTITEM: UInt = 4294967194u

public val LVN_ITEMACTIVATE: UInt = 4294967182u

public val LVN_ITEMCHANGED: UInt = 4294967195u

public val LVN_ITEMCHANGING: UInt = 4294967196u

public val LVN_KEYDOWN: UInt = 4294967141u

public val LVN_LAST: UInt = 4294967097u

public val LVN_LINKCLICK: UInt = 4294967112u

public val LVN_MARQUEEBEGIN: UInt = 4294967140u

public val LVN_ODCACHEHINT: UInt = 4294967183u

public val LVN_ODFINDITEM: UInt = 4294967117u

public val LVN_ODFINDITEMA: UInt = 4294967144u

public val LVN_ODFINDITEMW: UInt = 4294967117u

public val LVN_ODSTATECHANGED: UInt = 4294967181u

public val LVN_SETDISPINFO: UInt = 4294967118u

public val LVN_SETDISPINFOA: UInt = 4294967145u

public val LVN_SETDISPINFOW: UInt = 4294967118u

public val LVP_COLLAPSEBUTTON: Listviewparts = 9

public val LVP_COLUMNDETAIL: Listviewparts = 10

public val LVP_EMPTYTEXT: Listviewparts = 5

public val LVP_EXPANDBUTTON: Listviewparts = 8

public val LVP_GROUPHEADER: Listviewparts = 6

public val LVP_GROUPHEADERLINE: Listviewparts = 7

public val LVP_LISTDETAIL: Listviewparts = 3

public val LVP_LISTGROUP: Listviewparts = 2

public val LVP_LISTITEM: Listviewparts = 1

public val LVP_LISTSORTEDDETAIL: Listviewparts = 4

public val LVSCW_AUTOSIZE: Int = -1

public val LVSCW_AUTOSIZE_USEHEADER: Int = -2

public val LVSICF_NOINVALIDATEALL: UInt = 1u

public val LVSICF_NOSCROLL: UInt = 2u

public val LVSIL_GROUPHEADER: UInt = 3u

public val LVSIL_NORMAL: UInt = 0u

public val LVSIL_SMALL: UInt = 1u

public val LVSIL_STATE: UInt = 2u

public val LVS_ALIGNLEFT: UInt = 2048u

public val LVS_ALIGNMASK: UInt = 3072u

public val LVS_ALIGNTOP: UInt = 0u

public val LVS_AUTOARRANGE: UInt = 256u

public val LVS_EDITLABELS: UInt = 512u

public val LVS_EX_AUTOAUTOARRANGE: UInt = 16777216u

public val LVS_EX_AUTOCHECKSELECT: UInt = 134217728u

public val LVS_EX_AUTOSIZECOLUMNS: UInt = 268435456u

public val LVS_EX_BORDERSELECT: UInt = 32768u

public val LVS_EX_CHECKBOXES: UInt = 4u

public val LVS_EX_COLUMNOVERFLOW: UInt = 2147483648u

public val LVS_EX_COLUMNSNAPPOINTS: UInt = 1073741824u

public val LVS_EX_DOUBLEBUFFER: UInt = 65536u

public val LVS_EX_FLATSB: UInt = 256u

public val LVS_EX_FULLROWSELECT: UInt = 32u

public val LVS_EX_GRIDLINES: UInt = 1u

public val LVS_EX_HEADERDRAGDROP: UInt = 16u

public val LVS_EX_HEADERINALLVIEWS: UInt = 33554432u

public val LVS_EX_HIDELABELS: UInt = 131072u

public val LVS_EX_INFOTIP: UInt = 1024u

public val LVS_EX_JUSTIFYCOLUMNS: UInt = 2097152u

public val LVS_EX_LABELTIP: UInt = 16384u

public val LVS_EX_MULTIWORKAREAS: UInt = 8192u

public val LVS_EX_ONECLICKACTIVATE: UInt = 64u

public val LVS_EX_REGIONAL: UInt = 512u

public val LVS_EX_SIMPLESELECT: UInt = 1048576u

public val LVS_EX_SINGLEROW: UInt = 262144u

public val LVS_EX_SNAPTOGRID: UInt = 524288u

public val LVS_EX_SUBITEMIMAGES: UInt = 2u

public val LVS_EX_TRACKSELECT: UInt = 8u

public val LVS_EX_TRANSPARENTBKGND: UInt = 4194304u

public val LVS_EX_TRANSPARENTSHADOWTEXT: UInt = 8388608u

public val LVS_EX_TWOCLICKACTIVATE: UInt = 128u

public val LVS_EX_UNDERLINECOLD: UInt = 4096u

public val LVS_EX_UNDERLINEHOT: UInt = 2048u

public val LVS_ICON: UInt = 0u

public val LVS_LIST: UInt = 3u

public val LVS_NOCOLUMNHEADER: UInt = 16384u

public val LVS_NOLABELWRAP: UInt = 128u

public val LVS_NOSCROLL: UInt = 8192u

public val LVS_NOSORTHEADER: UInt = 32768u

public val LVS_OWNERDATA: UInt = 4096u

public val LVS_OWNERDRAWFIXED: UInt = 1024u

public val LVS_REPORT: UInt = 1u

public val LVS_SHAREIMAGELISTS: UInt = 64u

public val LVS_SHOWSELALWAYS: UInt = 8u

public val LVS_SINGLESEL: UInt = 4u

public val LVS_SMALLICON: UInt = 2u

public val LVS_SORTASCENDING: UInt = 16u

public val LVS_SORTDESCENDING: UInt = 32u

public val LVS_TYPEMASK: UInt = 3u

public val LVS_TYPESTYLEMASK: UInt = 64512u

public val LVTVIF_AUTOSIZE: LvtileviewinfoFlags = 0u

public val LVTVIF_EXTENDED: UInt = 4u

public val LVTVIF_FIXEDHEIGHT: LvtileviewinfoFlags = 2u

public val LVTVIF_FIXEDSIZE: LvtileviewinfoFlags = 3u

public val LVTVIF_FIXEDWIDTH: LvtileviewinfoFlags = 1u

public val LVTVIM_COLUMNS: LvtileviewinfoMask = 2u

public val LVTVIM_LABELMARGIN: LvtileviewinfoMask = 4u

public val LVTVIM_TILESIZE: LvtileviewinfoMask = 1u

public val LV_MAX_WORKAREAS: UInt = 16u

public val LV_VIEW_DETAILS: UInt = 1u

public val LV_VIEW_ICON: UInt = 0u

public val LV_VIEW_LIST: UInt = 3u

public val LV_VIEW_MAX: UInt = 4u

public val LV_VIEW_SMALLICON: UInt = 2u

public val LV_VIEW_TILE: UInt = 4u

public val LWS_IGNORERETURN: UInt = 2u

public val LWS_NOPREFIX: UInt = 4u

public val LWS_RIGHT: UInt = 32u

public val LWS_TRANSPARENT: UInt = 1u

public val LWS_USECUSTOMTEXT: UInt = 16u

public val LWS_USEVISUALSTYLE: UInt = 8u

public val MAXBS_DISABLED: Maxbuttonstates = 4

public val MAXBS_HOT: Maxbuttonstates = 2

public val MAXBS_NORMAL: Maxbuttonstates = 1

public val MAXBS_PUSHED: Maxbuttonstates = 3

public val MAXPROPPAGES: UInt = 100u

public val MAX_INTLIST_COUNT: UInt = 402u

public val MAX_LINKID_TEXT: UInt = 48u

public val MAX_THEMECOLOR: UInt = 64u

public val MAX_THEMESIZE: UInt = 64u

public val MBI_DISABLED: Baritemstates = 4

public val MBI_DISABLEDHOT: Baritemstates = 5

public val MBI_DISABLEDPUSHED: Baritemstates = 6

public val MBI_HOT: Baritemstates = 2

public val MBI_NORMAL: Baritemstates = 1

public val MBI_PUSHED: Baritemstates = 3

public val MB_ACTIVE: Barbackgroundstates = 1

public val MB_INACTIVE: Barbackgroundstates = 2

public val MCB_BITMAP: Popupcheckbackgroundstates = 3

public val MCB_DISABLED: Popupcheckbackgroundstates = 1

public val MCB_NORMAL: Popupcheckbackgroundstates = 2

public val MCGCB_HOT: Gridcellbackgroundstates = 2

public val MCGCB_SELECTED: Gridcellbackgroundstates = 1

public val MCGCB_SELECTEDHOT: Gridcellbackgroundstates = 3

public val MCGCB_SELECTEDNOTFOCUSED: Gridcellbackgroundstates = 4

public val MCGCB_TODAY: Gridcellbackgroundstates = 5

public val MCGCB_TODAYSELECTED: Gridcellbackgroundstates = 6

public val MCGCU_HASSTATE: Gridcellupperstates = 2

public val MCGCU_HASSTATEHOT: Gridcellupperstates = 3

public val MCGCU_HOT: Gridcellupperstates = 1

public val MCGCU_SELECTED: Gridcellupperstates = 4

public val MCGCU_SELECTEDHOT: Gridcellupperstates = 5

public val MCGC_HASSTATE: Gridcellstates = 2

public val MCGC_HASSTATEHOT: Gridcellstates = 3

public val MCGC_HOT: Gridcellstates = 1

public val MCGC_SELECTED: Gridcellstates = 6

public val MCGC_SELECTEDHOT: Gridcellstates = 7

public val MCGC_TODAY: Gridcellstates = 4

public val MCGC_TODAYSELECTED: Gridcellstates = 5

public val MCGIF_DATE: McgridinfoFlags = 1u

public val MCGIF_NAME: McgridinfoFlags = 4u

public val MCGIF_RECT: McgridinfoFlags = 2u

public val MCGIP_CALENDAR: McgridinfoPart = 4u

public val MCGIP_CALENDARBODY: McgridinfoPart = 6u

public val MCGIP_CALENDARCELL: McgridinfoPart = 8u

public val MCGIP_CALENDARCONTROL: McgridinfoPart = 0u

public val MCGIP_CALENDARHEADER: McgridinfoPart = 5u

public val MCGIP_CALENDARROW: McgridinfoPart = 7u

public val MCGIP_FOOTER: McgridinfoPart = 3u

public val MCGIP_NEXT: McgridinfoPart = 1u

public val MCGIP_PREV: McgridinfoPart = 2u

public val MCHT_CALENDAR: MchittestinfoHitFlags = 131072u

public val MCHT_CALENDARBK: MchittestinfoHitFlags = 131072u

public val MCHT_CALENDARCONTROL: MchittestinfoHitFlags = 1048576u

public val MCHT_CALENDARDATE: MchittestinfoHitFlags = 131073u

public val MCHT_CALENDARDATEMAX: MchittestinfoHitFlags = 131077u

public val MCHT_CALENDARDATEMIN: MchittestinfoHitFlags = 131076u

public val MCHT_CALENDARDATENEXT: MchittestinfoHitFlags = 16908289u

public val MCHT_CALENDARDATEPREV: MchittestinfoHitFlags = 33685505u

public val MCHT_CALENDARDAY: MchittestinfoHitFlags = 131074u

public val MCHT_CALENDARWEEKNUM: MchittestinfoHitFlags = 131075u

public val MCHT_NEXT: MchittestinfoHitFlags = 16777216u

public val MCHT_NOWHERE: MchittestinfoHitFlags = 0u

public val MCHT_PREV: MchittestinfoHitFlags = 33554432u

public val MCHT_TITLE: MchittestinfoHitFlags = 65536u

public val MCHT_TITLEBK: MchittestinfoHitFlags = 65536u

public val MCHT_TITLEBTNNEXT: MchittestinfoHitFlags = 16842755u

public val MCHT_TITLEBTNPREV: MchittestinfoHitFlags = 33619971u

public val MCHT_TITLEMONTH: MchittestinfoHitFlags = 65537u

public val MCHT_TITLEYEAR: MchittestinfoHitFlags = 65538u

public val MCHT_TODAYLINK: MchittestinfoHitFlags = 196608u

public val MCMV_CENTURY: MonthCaldendarMessagesView = 3u

public val MCMV_DECADE: MonthCaldendarMessagesView = 2u

public val MCMV_MAX: MonthCaldendarMessagesView = 3u

public val MCMV_MONTH: MonthCaldendarMessagesView = 0u

public val MCMV_YEAR: MonthCaldendarMessagesView = 1u

public val MCM_FIRST: UInt = 4096u

public val MCM_GETCALENDARBORDER: UInt = 4127u

public val MCM_GETCALENDARCOUNT: UInt = 4119u

public val MCM_GETCALENDARGRIDINFO: UInt = 4120u

public val MCM_GETCALID: UInt = 4123u

public val MCM_GETCOLOR: UInt = 4107u

public val MCM_GETCURRENTVIEW: UInt = 4118u

public val MCM_GETCURSEL: UInt = 4097u

public val MCM_GETFIRSTDAYOFWEEK: UInt = 4112u

public val MCM_GETMAXSELCOUNT: UInt = 4099u

public val MCM_GETMAXTODAYWIDTH: UInt = 4117u

public val MCM_GETMINREQRECT: UInt = 4105u

public val MCM_GETMONTHDELTA: UInt = 4115u

public val MCM_GETMONTHRANGE: UInt = 4103u

public val MCM_GETRANGE: UInt = 4113u

public val MCM_GETSELRANGE: UInt = 4101u

public val MCM_GETTODAY: UInt = 4109u

public val MCM_GETUNICODEFORMAT: UInt = 8198u

public val MCM_HITTEST: UInt = 4110u

public val MCM_SETCALENDARBORDER: UInt = 4126u

public val MCM_SETCALID: UInt = 4124u

public val MCM_SETCOLOR: UInt = 4106u

public val MCM_SETCURRENTVIEW: UInt = 4128u

public val MCM_SETCURSEL: UInt = 4098u

public val MCM_SETDAYSTATE: UInt = 4104u

public val MCM_SETFIRSTDAYOFWEEK: UInt = 4111u

public val MCM_SETMAXSELCOUNT: UInt = 4100u

public val MCM_SETMONTHDELTA: UInt = 4116u

public val MCM_SETRANGE: UInt = 4114u

public val MCM_SETSELRANGE: UInt = 4102u

public val MCM_SETTODAY: UInt = 4108u

public val MCM_SETUNICODEFORMAT: UInt = 8197u

public val MCM_SIZERECTTOMIN: UInt = 4125u

public val MCNN_DISABLED: Navnextstates = 4

public val MCNN_HOT: Navnextstates = 2

public val MCNN_NORMAL: Navnextstates = 1

public val MCNN_PRESSED: Navnextstates = 3

public val MCNP_DISABLED: Navprevstates = 4

public val MCNP_HOT: Navprevstates = 2

public val MCNP_NORMAL: Navprevstates = 1

public val MCNP_PRESSED: Navprevstates = 3

public val MCN_FIRST: UInt = 4294966550u

public val MCN_GETDAYSTATE: UInt = 4294966549u

public val MCN_LAST: UInt = 4294966544u

public val MCN_SELCHANGE: UInt = 4294966547u

public val MCN_SELECT: UInt = 4294966550u

public val MCN_VIEWCHANGE: UInt = 4294966546u

public val MCSC_BACKGROUND: UInt = 0u

public val MCSC_MONTHBK: UInt = 4u

public val MCSC_TEXT: UInt = 1u

public val MCSC_TITLEBK: UInt = 2u

public val MCSC_TITLETEXT: UInt = 3u

public val MCSC_TRAILINGTEXT: UInt = 5u

public val MCS_DAYSTATE: UInt = 1u

public val MCS_MULTISELECT: UInt = 2u

public val MCS_NOSELCHANGEONNAV: UInt = 256u

public val MCS_NOTODAY: UInt = 16u

public val MCS_NOTODAYCIRCLE: UInt = 8u

public val MCS_NOTRAILINGDATES: UInt = 64u

public val MCS_SHORTDAYSOFWEEK: UInt = 128u

public val MCS_WEEKNUMBERS: UInt = 4u

public val MCTGCU_HASSTATE: Trailinggridcellupperstates = 2

public val MCTGCU_HASSTATEHOT: Trailinggridcellupperstates = 3

public val MCTGCU_HOT: Trailinggridcellupperstates = 1

public val MCTGCU_SELECTED: Trailinggridcellupperstates = 4

public val MCTGCU_SELECTEDHOT: Trailinggridcellupperstates = 5

public val MCTGC_HASSTATE: Trailinggridcellstates = 2

public val MCTGC_HASSTATEHOT: Trailinggridcellstates = 3

public val MCTGC_HOT: Trailinggridcellstates = 1

public val MCTGC_SELECTED: Trailinggridcellstates = 6

public val MCTGC_SELECTEDHOT: Trailinggridcellstates = 7

public val MCTGC_TODAY: Trailinggridcellstates = 4

public val MCTGC_TODAYSELECTED: Trailinggridcellstates = 5

public val MC_BACKGROUND: Monthcalparts = 1

public val MC_BORDERS: Monthcalparts = 2

public val MC_BULLETDISABLED: Popupcheckstates = 4

public val MC_BULLETNORMAL: Popupcheckstates = 3

public val MC_CHECKMARKDISABLED: Popupcheckstates = 2

public val MC_CHECKMARKNORMAL: Popupcheckstates = 1

public val MC_COLHEADERSPLITTER: Monthcalparts = 4

public val MC_GRIDBACKGROUND: Monthcalparts = 3

public val MC_GRIDCELL: Monthcalparts = 6

public val MC_GRIDCELLBACKGROUND: Monthcalparts = 5

public val MC_GRIDCELLUPPER: Monthcalparts = 7

public val MC_NAVNEXT: Monthcalparts = 10

public val MC_NAVPREV: Monthcalparts = 11

public val MC_TRAILINGGRIDCELL: Monthcalparts = 8

public val MC_TRAILINGGRIDCELLUPPER: Monthcalparts = 9

public val MDCL_DISABLED: Mdiclosebuttonstates = 4

public val MDCL_HOT: Mdiclosebuttonstates = 2

public val MDCL_NORMAL: Mdiclosebuttonstates = 1

public val MDCL_PUSHED: Mdiclosebuttonstates = 3

public val MDMI_DISABLED: Mdiminbuttonstates = 4

public val MDMI_HOT: Mdiminbuttonstates = 2

public val MDMI_NORMAL: Mdiminbuttonstates = 1

public val MDMI_PUSHED: Mdiminbuttonstates = 3

public val MDP_NEWAPPBUTTON: Menubandparts = 1

public val MDP_SEPERATOR: Menubandparts = 2

public val MDRE_DISABLED: Mdirestorebuttonstates = 4

public val MDRE_HOT: Mdirestorebuttonstates = 2

public val MDRE_NORMAL: Mdirestorebuttonstates = 1

public val MDRE_PUSHED: Mdirestorebuttonstates = 3

public val MDS_CHECKED: Menubandstates = 5

public val MDS_DISABLED: Menubandstates = 4

public val MDS_HOT: Menubandstates = 2

public val MDS_HOTCHECKED: Menubandstates = 6

public val MDS_NORMAL: Menubandstates = 1

public val MDS_PRESSED: Menubandstates = 3

public val MENU_BARBACKGROUND: Menuparts = 7

public val MENU_BARITEM: Menuparts = 8

public val MENU_CHEVRON_TMSCHEMA: Menuparts = 5

public val MENU_MENUBARDROPDOWN_TMSCHEMA: Menuparts = 4

public val MENU_MENUBARITEM_TMSCHEMA: Menuparts = 3

public val MENU_MENUDROPDOWN_TMSCHEMA: Menuparts = 2

public val MENU_MENUITEM_TMSCHEMA: Menuparts = 1

public val MENU_POPUPBACKGROUND: Menuparts = 9

public val MENU_POPUPBORDERS: Menuparts = 10

public val MENU_POPUPCHECK: Menuparts = 11

public val MENU_POPUPCHECKBACKGROUND: Menuparts = 12

public val MENU_POPUPGUTTER: Menuparts = 13

public val MENU_POPUPITEM: Menuparts = 14

public val MENU_POPUPITEMKBFOCUS: Menuparts = 26

public val MENU_POPUPITEM_FOCUSABLE: Menuparts = 27

public val MENU_POPUPSEPARATOR: Menuparts = 15

public val MENU_POPUPSUBMENU: Menuparts = 16

public val MENU_POPUPSUBMENU_HCHOT: Menuparts = 21

public val MENU_SEPARATOR_TMSCHEMA: Menuparts = 6

public val MENU_SYSTEMCLOSE: Menuparts = 17

public val MENU_SYSTEMCLOSE_HCHOT: Menuparts = 22

public val MENU_SYSTEMMAXIMIZE: Menuparts = 18

public val MENU_SYSTEMMAXIMIZE_HCHOT: Menuparts = 23

public val MENU_SYSTEMMINIMIZE: Menuparts = 19

public val MENU_SYSTEMMINIMIZE_HCHOT: Menuparts = 24

public val MENU_SYSTEMRESTORE: Menuparts = 20

public val MENU_SYSTEMRESTORE_HCHOT: Menuparts = 25

public val MINBS_DISABLED: Minbuttonstates = 4

public val MINBS_HOT: Minbuttonstates = 2

public val MINBS_NORMAL: Minbuttonstates = 1

public val MINBS_PUSHED: Minbuttonstates = 3

public val MNCS_ACTIVE: Mincaptionstates = 1

public val MNCS_DISABLED: Mincaptionstates = 3

public val MNCS_INACTIVE: Mincaptionstates = 2

public val MONTHCAL_CLASS: Pcwstr = w("SysMonthCal32")

public val MONTHCAL_CLASSA: Pcstr = s("SysMonthCal32")

public val MONTHCAL_CLASSW: Pcwstr = w("SysMonthCal32")

public val MPIF_DISABLED: Popupitemfocusablestates = 3

public val MPIF_DISABLEDHOT: Popupitemfocusablestates = 4

public val MPIF_HOT: Popupitemfocusablestates = 2

public val MPIF_NORMAL: Popupitemfocusablestates = 1

public val MPIKBFOCUS_NORMAL: Popupitemkbfocusstates = 1

public val MPI_DISABLED: Popupitemstates = 3

public val MPI_DISABLEDHOT: Popupitemstates = 4

public val MPI_HOT: Popupitemstates = 2

public val MPI_NORMAL: Popupitemstates = 1

public val MSGF_COMMCTRL_BEGINDRAG: UInt = 16896u

public val MSGF_COMMCTRL_DRAGSELECT: UInt = 16898u

public val MSGF_COMMCTRL_SIZEHEADER: UInt = 16897u

public val MSGF_COMMCTRL_TOOLBARCUST: UInt = 16899u

public val MSMHC_HOT: Popupsubmenuhchotstates = 1

public val MSM_DISABLED: Popupsubmenustates = 2

public val MSM_NORMAL: Popupsubmenustates = 1

public val MSYSCHC_HOT: Systemclosehchotstates = 1

public val MSYSC_DISABLED: Systemclosestates = 2

public val MSYSC_NORMAL: Systemclosestates = 1

public val MSYSMNHC_HOT: Systemminimizehchotstates = 1

public val MSYSMN_DISABLED: Systemminimizestates = 2

public val MSYSMN_NORMAL: Systemminimizestates = 1

public val MSYSMXHC_HOT: Systemmaximizehchotstates = 1

public val MSYSMX_DISABLED: Systemmaximizestates = 2

public val MSYSMX_NORMAL: Systemmaximizestates = 1

public val MSYSRHC_HOT: Systemrestorehchotstates = 1

public val MSYSR_DISABLED: Systemrestorestates = 2

public val MSYSR_NORMAL: Systemrestorestates = 1

public val MULTIFILEOPENORD: UInt = 1537u

public val MXCS_ACTIVE: Maxcaptionstates = 1

public val MXCS_DISABLED: Maxcaptionstates = 3

public val MXCS_INACTIVE: Maxcaptionstates = 2

public val NAV_BACKBUTTON: Navigationparts = 1

public val NAV_BB_DISABLED: NavBackbuttonstates = 4

public val NAV_BB_HOT: NavBackbuttonstates = 2

public val NAV_BB_NORMAL: NavBackbuttonstates = 1

public val NAV_BB_PRESSED: NavBackbuttonstates = 3

public val NAV_FB_DISABLED: NavForwardbuttonstates = 4

public val NAV_FB_HOT: NavForwardbuttonstates = 2

public val NAV_FB_NORMAL: NavForwardbuttonstates = 1

public val NAV_FB_PRESSED: NavForwardbuttonstates = 3

public val NAV_FORWARDBUTTON: Navigationparts = 2

public val NAV_MB_DISABLED: NavMenubuttonstates = 4

public val NAV_MB_HOT: NavMenubuttonstates = 2

public val NAV_MB_NORMAL: NavMenubuttonstates = 1

public val NAV_MB_PRESSED: NavMenubuttonstates = 3

public val NAV_MENUBUTTON: Navigationparts = 3

public val NEWFILEOPENORD: UInt = 1547u

public val NEWFILEOPENV2ORD: UInt = 1552u

public val NEWFILEOPENV3ORD: UInt = 1553u

public val NEWFORMATDLGWITHLINK: UInt = 1591u

public val NFS_ALL: UInt = 16u

public val NFS_BUTTON: UInt = 8u

public val NFS_EDIT: UInt = 1u

public val NFS_LISTCOMBO: UInt = 4u

public val NFS_STATIC: UInt = 2u

public val NFS_USEFONTASSOC: UInt = 32u

public val NM_CHAR: UInt = 4294967278u

public val NM_CLICK: UInt = 4294967294u

public val NM_CUSTOMDRAW: UInt = 4294967284u

public val NM_CUSTOMTEXT: UInt = 4294967272u

public val NM_DBLCLK: UInt = 4294967293u

public val NM_FIRST: UInt = 0u

public val NM_FONTCHANGED: UInt = 4294967273u

public val NM_GETCUSTOMSPLITRECT: UInt = 4294966049u

public val NM_HOVER: UInt = 4294967283u

public val NM_KEYDOWN: UInt = 4294967281u

public val NM_KILLFOCUS: UInt = 4294967288u

public val NM_LAST: UInt = 4294967197u

public val NM_LDOWN: UInt = 4294967276u

public val NM_NCHITTEST: UInt = 4294967282u

public val NM_OUTOFMEMORY: UInt = 4294967295u

public val NM_RCLICK: UInt = 4294967291u

public val NM_RDBLCLK: UInt = 4294967290u

public val NM_RDOWN: UInt = 4294967275u

public val NM_RELEASEDCAPTURE: UInt = 4294967280u

public val NM_RETURN: UInt = 4294967292u

public val NM_SETCURSOR: UInt = 4294967279u

public val NM_SETFOCUS: UInt = 4294967289u

public val NM_THEMECHANGED: UInt = 4294967274u

public val NM_TOOLTIPSCREATED: UInt = 4294967277u

public val NM_TVSTATEIMAGECHANGING: UInt = 4294967272u

public val ODA_DRAWENTIRE: OdaFlags = 1u

public val ODA_FOCUS: OdaFlags = 4u

public val ODA_SELECT: OdaFlags = 2u

public val ODS_CHECKED: OdsFlags = 8u

public val ODS_COMBOBOXEDIT: OdsFlags = 4096u

public val ODS_DEFAULT: OdsFlags = 32u

public val ODS_DISABLED: OdsFlags = 4u

public val ODS_FOCUS: OdsFlags = 16u

public val ODS_GRAYED: OdsFlags = 2u

public val ODS_HOTLIGHT: OdsFlags = 64u

public val ODS_INACTIVE: OdsFlags = 128u

public val ODS_NOACCEL: OdsFlags = 256u

public val ODS_NOFOCUSRECT: OdsFlags = 512u

public val ODS_SELECTED: OdsFlags = 1u

public val ODT_BUTTON: DrawitemstructCtlType = 4u

public val ODT_COMBOBOX: DrawitemstructCtlType = 3u

public val ODT_HEADER: UInt = 100u

public val ODT_LISTBOX: DrawitemstructCtlType = 2u

public val ODT_LISTVIEW: DrawitemstructCtlType = 102u

public val ODT_MENU: DrawitemstructCtlType = 1u

public val ODT_STATIC: DrawitemstructCtlType = 5u

public val ODT_TAB: DrawitemstructCtlType = 101u

public val OTD_FORCE_RECT_SIZING: OpenThemeDataFlags = 1u

public val OTD_NONCLIENT: OpenThemeDataFlags = 2u

public val OT_ABOVELASTBUTTON: Offsettype = 12

public val OT_BELOWLASTBUTTON: Offsettype = 13

public val OT_BOTTOMLEFT: Offsettype = 3

public val OT_BOTTOMMIDDLE: Offsettype = 5

public val OT_BOTTOMRIGHT: Offsettype = 4

public val OT_LEFTOFCAPTION: Offsettype = 8

public val OT_LEFTOFLASTBUTTON: Offsettype = 10

public val OT_MIDDLELEFT: Offsettype = 6

public val OT_MIDDLERIGHT: Offsettype = 7

public val OT_RIGHTOFCAPTION: Offsettype = 9

public val OT_RIGHTOFLASTBUTTON: Offsettype = 11

public val OT_TOPLEFT: Offsettype = 0

public val OT_TOPMIDDLE: Offsettype = 2

public val OT_TOPRIGHT: Offsettype = 1

public val PAGESETUPDLGORD: UInt = 1546u

public val PAGESETUPDLGORDMOTIF: UInt = 1550u

public val PBBS_NORMAL: Transparentbarstates = 1

public val PBBS_PARTIAL: Transparentbarstates = 2

public val PBBVS_NORMAL: Transparentbarvertstates = 1

public val PBBVS_PARTIAL: Transparentbarvertstates = 2

public val PBDDS_DISABLED: Pushbuttondropdownstates = 2

public val PBDDS_NORMAL: Pushbuttondropdownstates = 1

public val PBFS_ERROR: Fillstates = 2

public val PBFS_NORMAL: Fillstates = 1

public val PBFS_PARTIAL: Fillstates = 4

public val PBFS_PAUSED: Fillstates = 3

public val PBFVS_ERROR: Fillvertstates = 2

public val PBFVS_NORMAL: Fillvertstates = 1

public val PBFVS_PARTIAL: Fillvertstates = 4

public val PBFVS_PAUSED: Fillvertstates = 3

public val PBM_DELTAPOS: UInt = 1027u

public val PBM_GETBARCOLOR: UInt = 1039u

public val PBM_GETBKCOLOR: UInt = 1038u

public val PBM_GETPOS: UInt = 1032u

public val PBM_GETRANGE: UInt = 1031u

public val PBM_GETSTATE: UInt = 1041u

public val PBM_GETSTEP: UInt = 1037u

public val PBM_SETBARCOLOR: UInt = 1033u

public val PBM_SETBKCOLOR: UInt = 8193u

public val PBM_SETMARQUEE: UInt = 1034u

public val PBM_SETPOS: UInt = 1026u

public val PBM_SETRANGE: UInt = 1025u

public val PBM_SETRANGE32: UInt = 1030u

public val PBM_SETSTATE: UInt = 1040u

public val PBM_SETSTEP: UInt = 1028u

public val PBM_STEPIT: UInt = 1029u

public val PBST_ERROR: UInt = 2u

public val PBST_NORMAL: UInt = 1u

public val PBST_PAUSED: UInt = 3u

public val PBS_DEFAULTED: Pushbuttonstates = 5

public val PBS_DEFAULTED_ANIMATING: Pushbuttonstates = 6

public val PBS_DISABLED: Pushbuttonstates = 4

public val PBS_HOT: Pushbuttonstates = 2

public val PBS_MARQUEE: UInt = 8u

public val PBS_NORMAL: Pushbuttonstates = 1

public val PBS_PRESSED: Pushbuttonstates = 3

public val PBS_SMOOTH: UInt = 1u

public val PBS_SMOOTHREVERSE: UInt = 16u

public val PBS_VERTICAL: UInt = 4u

public val PGB_BOTTOMORRIGHT: UInt = 1u

public val PGB_TOPORLEFT: UInt = 0u

public val PGF_CALCHEIGHT: NmpgcalcsizeFlags = 2u

public val PGF_CALCWIDTH: NmpgcalcsizeFlags = 1u

public val PGF_DEPRESSED: UInt = 4u

public val PGF_GRAYED: UInt = 2u

public val PGF_HOT: UInt = 8u

public val PGF_INVISIBLE: UInt = 0u

public val PGF_NORMAL: UInt = 1u

public val PGF_SCROLLDOWN: NmpgscrollDir = 2

public val PGF_SCROLLLEFT: NmpgscrollDir = 4

public val PGF_SCROLLRIGHT: NmpgscrollDir = 8

public val PGF_SCROLLUP: NmpgscrollDir = 1

public val PGK_CONTROL: NmpgscrollKeys = 2u.toUShort()

public val PGK_MENU: NmpgscrollKeys = 4u.toUShort()

public val PGK_NONE: NmpgscrollKeys = 0u.toUShort()

public val PGK_SHIFT: NmpgscrollKeys = 1u.toUShort()

public val PGM_FIRST: UInt = 5120u

public val PGM_FORWARDMOUSE: UInt = 5123u

public val PGM_GETBKCOLOR: UInt = 5125u

public val PGM_GETBORDER: UInt = 5127u

public val PGM_GETBUTTONSIZE: UInt = 5131u

public val PGM_GETBUTTONSTATE: UInt = 5132u

public val PGM_GETDROPTARGET: UInt = 8196u

public val PGM_GETPOS: UInt = 5129u

public val PGM_RECALCSIZE: UInt = 5122u

public val PGM_SETBKCOLOR: UInt = 5124u

public val PGM_SETBORDER: UInt = 5126u

public val PGM_SETBUTTONSIZE: UInt = 5130u

public val PGM_SETCHILD: UInt = 5121u

public val PGM_SETPOS: UInt = 5128u

public val PGM_SETSCROLLINFO: UInt = 5133u

public val PGN_CALCSIZE: UInt = 4294966394u

public val PGN_FIRST: UInt = 4294966396u

public val PGN_HOTITEMCHANGE: UInt = 4294966393u

public val PGN_LAST: UInt = 4294966346u

public val PGN_SCROLL: UInt = 4294966395u

public val PGRP_DOWN: Pageparts = 2

public val PGRP_DOWNHORZ: Pageparts = 4

public val PGRP_UP: Pageparts = 1

public val PGRP_UPHORZ: Pageparts = 3

public val PGS_AUTOSCROLL: UInt = 2u

public val PGS_DRAGNDROP: UInt = 4u

public val PGS_HORZ: UInt = 1u

public val PGS_VERT: UInt = 0u

public val POINTER_DEVICE_CURSOR_TYPE_ERASER: PointerDeviceCursorType = 2

public val POINTER_DEVICE_CURSOR_TYPE_MAX: PointerDeviceCursorType = -1

public val POINTER_DEVICE_CURSOR_TYPE_TIP: PointerDeviceCursorType = 1

public val POINTER_DEVICE_CURSOR_TYPE_UNKNOWN: PointerDeviceCursorType = 0

public val POINTER_DEVICE_TYPE_EXTERNAL_PEN: PointerDeviceType = 2

public val POINTER_DEVICE_TYPE_INTEGRATED_PEN: PointerDeviceType = 1

public val POINTER_DEVICE_TYPE_MAX: PointerDeviceType = -1

public val POINTER_DEVICE_TYPE_TOUCH: PointerDeviceType = 3

public val POINTER_DEVICE_TYPE_TOUCH_PAD: PointerDeviceType = 4

public val POINTER_FEEDBACK_DEFAULT: PointerFeedbackMode = 1

public val POINTER_FEEDBACK_INDIRECT: PointerFeedbackMode = 2

public val POINTER_FEEDBACK_NONE: PointerFeedbackMode = 3

public val PO_CLASS: Propertyorigin = 2

public val PO_GLOBAL: Propertyorigin = 3

public val PO_NOTFOUND: Propertyorigin = 4

public val PO_PART: Propertyorigin = 1

public val PO_STATE: Propertyorigin = 0

public val PP_BAR: Progressparts = 1

public val PP_BARVERT: Progressparts = 2

public val PP_CHUNK: Progressparts = 3

public val PP_CHUNKVERT: Progressparts = 4

public val PP_FILL: Progressparts = 5

public val PP_FILLVERT: Progressparts = 6

public val PP_MOVEOVERLAY: Progressparts = 8

public val PP_MOVEOVERLAYVERT: Progressparts = 10

public val PP_PULSEOVERLAY: Progressparts = 7

public val PP_PULSEOVERLAYVERT: Progressparts = 9

public val PP_TRANSPARENTBAR: Progressparts = 11

public val PP_TRANSPARENTBARVERT: Progressparts = 12

public val PRINTDLGEXORD: UInt = 1549u

public val PRINTDLGORD: UInt = 1538u

public val PRNSETUPDLGORD: UInt = 1539u

public val PROGRESS_CLASS: Pcwstr = w("msctls_progress32")

public val PROGRESS_CLASSA: Pcstr = s("msctls_progress32")

public val PROGRESS_CLASSW: Pcwstr = w("msctls_progress32")

public val PROP_LG_CXDLG: UInt = 252u

public val PROP_LG_CYDLG: UInt = 218u

public val PROP_MED_CXDLG: UInt = 227u

public val PROP_MED_CYDLG: UInt = 215u

public val PROP_SM_CXDLG: UInt = 212u

public val PROP_SM_CYDLG: UInt = 188u

public val PSBTN_APPLYNOW: UInt = 4u

public val PSBTN_BACK: UInt = 0u

public val PSBTN_CANCEL: UInt = 5u

public val PSBTN_FINISH: UInt = 2u

public val PSBTN_HELP: UInt = 6u

public val PSBTN_MAX: UInt = 6u

public val PSBTN_NEXT: UInt = 1u

public val PSBTN_OK: UInt = 3u

public val PSCB_BUTTONPRESSED: UInt = 3u

public val PSCB_INITIALIZED: UInt = 1u

public val PSCB_PRECREATE: UInt = 2u

public val PSH_AEROWIZARD: UInt = 16384u

public val PSH_DEFAULT: UInt = 0u

public val PSH_HASHELP: UInt = 512u

public val PSH_HEADER: UInt = 524288u

public val PSH_HEADERBITMAP: UInt = 134217728u

public val PSH_MODELESS: UInt = 1024u

public val PSH_NOAPPLYNOW: UInt = 128u

public val PSH_NOCONTEXTHELP: UInt = 33554432u

public val PSH_NOMARGIN: UInt = 268435456u

public val PSH_PROPSHEETPAGE: UInt = 8u

public val PSH_PROPTITLE: UInt = 1u

public val PSH_RESIZABLE: UInt = 67108864u

public val PSH_RTLREADING: UInt = 2048u

public val PSH_STRETCHWATERMARK: UInt = 262144u

public val PSH_USECALLBACK: UInt = 256u

public val PSH_USEHBMHEADER: UInt = 1048576u

public val PSH_USEHBMWATERMARK: UInt = 65536u

public val PSH_USEHICON: UInt = 2u

public val PSH_USEHPLWATERMARK: UInt = 131072u

public val PSH_USEICONID: UInt = 4u

public val PSH_USEPAGELANG: UInt = 2097152u

public val PSH_USEPSTARTPAGE: UInt = 64u

public val PSH_WATERMARK: UInt = 32768u

public val PSH_WIZARD: UInt = 32u

public val PSH_WIZARD97: UInt = 8192u

public val PSH_WIZARDCONTEXTHELP: UInt = 4096u

public val PSH_WIZARDHASFINISH: UInt = 16u

public val PSH_WIZARD_LITE: UInt = 4194304u

public val PSM_ADDPAGE: UInt = 1127u

public val PSM_APPLY: UInt = 1134u

public val PSM_CANCELTOCLOSE: UInt = 1131u

public val PSM_CHANGED: UInt = 1128u

public val PSM_ENABLEWIZBUTTONS: UInt = 1163u

public val PSM_GETCURRENTPAGEHWND: UInt = 1142u

public val PSM_GETRESULT: UInt = 1159u

public val PSM_GETTABCONTROL: UInt = 1140u

public val PSM_HWNDTOINDEX: UInt = 1153u

public val PSM_IDTOINDEX: UInt = 1157u

public val PSM_INDEXTOHWND: UInt = 1154u

public val PSM_INDEXTOID: UInt = 1158u

public val PSM_INDEXTOPAGE: UInt = 1156u

public val PSM_INSERTPAGE: UInt = 1143u

public val PSM_ISDIALOGMESSAGE: UInt = 1141u

public val PSM_PAGETOINDEX: UInt = 1155u

public val PSM_PRESSBUTTON: UInt = 1137u

public val PSM_QUERYSIBLINGS: UInt = 1132u

public val PSM_REBOOTSYSTEM: UInt = 1130u

public val PSM_RECALCPAGESIZES: UInt = 1160u

public val PSM_REMOVEPAGE: UInt = 1126u

public val PSM_RESTARTWINDOWS: UInt = 1129u

public val PSM_SETBUTTONTEXT: UInt = 1164u

public val PSM_SETBUTTONTEXTW: UInt = 1164u

public val PSM_SETCURSEL: UInt = 1125u

public val PSM_SETCURSELID: UInt = 1138u

public val PSM_SETFINISHTEXT: UInt = 1145u

public val PSM_SETFINISHTEXTA: UInt = 1139u

public val PSM_SETFINISHTEXTW: UInt = 1145u

public val PSM_SETHEADERSUBTITLE: UInt = 1152u

public val PSM_SETHEADERSUBTITLEA: UInt = 1151u

public val PSM_SETHEADERSUBTITLEW: UInt = 1152u

public val PSM_SETHEADERTITLE: UInt = 1150u

public val PSM_SETHEADERTITLEA: UInt = 1149u

public val PSM_SETHEADERTITLEW: UInt = 1150u

public val PSM_SETNEXTTEXT: UInt = 1161u

public val PSM_SETNEXTTEXTW: UInt = 1161u

public val PSM_SETTITLE: UInt = 1144u

public val PSM_SETTITLEA: UInt = 1135u

public val PSM_SETTITLEW: UInt = 1144u

public val PSM_SETWIZBUTTONS: UInt = 1136u

public val PSM_SHOWWIZBUTTONS: UInt = 1162u

public val PSM_UNCHANGED: UInt = 1133u

public val PSNRET_INVALID: UInt = 1u

public val PSNRET_INVALID_NOCHANGEPAGE: UInt = 2u

public val PSNRET_MESSAGEHANDLED: UInt = 3u

public val PSNRET_NOERROR: UInt = 0u

public val PSN_APPLY: UInt = 4294967094u

public val PSN_FIRST: UInt = 4294967096u

public val PSN_GETOBJECT: UInt = 4294967086u

public val PSN_HELP: UInt = 4294967091u

public val PSN_KILLACTIVE: UInt = 4294967095u

public val PSN_LAST: UInt = 4294966997u

public val PSN_QUERYCANCEL: UInt = 4294967087u

public val PSN_QUERYINITIALFOCUS: UInt = 4294967083u

public val PSN_RESET: UInt = 4294967093u

public val PSN_SETACTIVE: UInt = 4294967096u

public val PSN_TRANSLATEACCELERATOR: UInt = 4294967084u

public val PSN_WIZBACK: UInt = 4294967090u

public val PSN_WIZFINISH: UInt = 4294967088u

public val PSN_WIZNEXT: UInt = 4294967089u

public val PSPCB_ADDREF: PspcbMessage = 0u

public val PSPCB_CREATE: PspcbMessage = 2u

public val PSPCB_RELEASE: PspcbMessage = 1u

public val PSPCB_SI_INITDIALOG: PspcbMessage = 1025u

public val PSP_DEFAULT: UInt = 0u

public val PSP_DLGINDIRECT: UInt = 1u

public val PSP_HASHELP: UInt = 32u

public val PSP_HIDEHEADER: UInt = 2048u

public val PSP_PREMATURE: UInt = 1024u

public val PSP_RTLREADING: UInt = 16u

public val PSP_USECALLBACK: UInt = 128u

public val PSP_USEFUSIONCONTEXT: UInt = 16384u

public val PSP_USEHEADERSUBTITLE: UInt = 8192u

public val PSP_USEHEADERTITLE: UInt = 4096u

public val PSP_USEHICON: UInt = 2u

public val PSP_USEICONID: UInt = 4u

public val PSP_USEREFPARENT: UInt = 64u

public val PSP_USETITLE: UInt = 8u

public val PSWIZBF_ELEVATIONREQUIRED: UInt = 1u

public val PSWIZB_BACK: UInt = 1u

public val PSWIZB_CANCEL: UInt = 16u

public val PSWIZB_DISABLEDFINISH: UInt = 8u

public val PSWIZB_FINISH: UInt = 4u

public val PSWIZB_NEXT: UInt = 2u

public val PSWIZB_RESTORE: UInt = 1u

public val PSWIZB_SHOW: UInt = 0u

public val RBAB_ADDBAND: UInt = 2u

public val RBAB_AUTOSIZE: UInt = 1u

public val RBBIM_BACKGROUND: UInt = 128u

public val RBBIM_CHEVRONLOCATION: UInt = 4096u

public val RBBIM_CHEVRONSTATE: UInt = 8192u

public val RBBIM_CHILD: UInt = 16u

public val RBBIM_CHILDSIZE: UInt = 32u

public val RBBIM_COLORS: UInt = 2u

public val RBBIM_HEADERSIZE: UInt = 2048u

public val RBBIM_ID: UInt = 256u

public val RBBIM_IDEALSIZE: UInt = 512u

public val RBBIM_IMAGE: UInt = 8u

public val RBBIM_LPARAM: UInt = 1024u

public val RBBIM_SIZE: UInt = 64u

public val RBBIM_STYLE: UInt = 1u

public val RBBIM_TEXT: UInt = 4u

public val RBBS_BREAK: UInt = 1u

public val RBBS_CHILDEDGE: UInt = 4u

public val RBBS_FIXEDBMP: UInt = 32u

public val RBBS_FIXEDSIZE: UInt = 2u

public val RBBS_GRIPPERALWAYS: UInt = 128u

public val RBBS_HIDDEN: UInt = 8u

public val RBBS_HIDETITLE: UInt = 1024u

public val RBBS_NOGRIPPER: UInt = 256u

public val RBBS_NOVERT: UInt = 16u

public val RBBS_TOPALIGN: UInt = 2048u

public val RBBS_USECHEVRON: UInt = 512u

public val RBBS_VARIABLEHEIGHT: UInt = 64u

public val RBHT_CAPTION: UInt = 2u

public val RBHT_CHEVRON: UInt = 8u

public val RBHT_CLIENT: UInt = 3u

public val RBHT_GRABBER: UInt = 4u

public val RBHT_NOWHERE: UInt = 1u

public val RBHT_SPLITTER: UInt = 16u

public val RBIM_IMAGELIST: UInt = 1u

public val RBNM_ID: NmrebarMaskFlags = 1u

public val RBNM_LPARAM: NmrebarMaskFlags = 4u

public val RBNM_STYLE: NmrebarMaskFlags = 2u

public val RBN_AUTOBREAK: UInt = 4294966443u

public val RBN_AUTOSIZE: UInt = 4294966462u

public val RBN_BEGINDRAG: UInt = 4294966461u

public val RBN_CHEVRONPUSHED: UInt = 4294966455u

public val RBN_CHILDSIZE: UInt = 4294966457u

public val RBN_DELETEDBAND: UInt = 4294966458u

public val RBN_DELETINGBAND: UInt = 4294966459u

public val RBN_ENDDRAG: UInt = 4294966460u

public val RBN_FIRST: UInt = 4294966465u

public val RBN_GETOBJECT: UInt = 4294966464u

public val RBN_HEIGHTCHANGE: UInt = 4294966465u

public val RBN_LAST: UInt = 4294966437u

public val RBN_LAYOUTCHANGED: UInt = 4294966463u

public val RBN_MINMAX: UInt = 4294966444u

public val RBN_SPLITTERDRAG: UInt = 4294966454u

public val RBSTR_CHANGERECT: UInt = 1u

public val RBS_AUTOSIZE: UInt = 8192u

public val RBS_BANDBORDERS: UInt = 1024u

public val RBS_CHECKEDDISABLED: Radiobuttonstates = 8

public val RBS_CHECKEDHOT: Radiobuttonstates = 6

public val RBS_CHECKEDNORMAL: Radiobuttonstates = 5

public val RBS_CHECKEDPRESSED: Radiobuttonstates = 7

public val RBS_DBLCLKTOGGLE: UInt = 32768u

public val RBS_DISABLED: Restorebuttonstates = 4

public val RBS_FIXEDORDER: UInt = 2048u

public val RBS_HOT: Restorebuttonstates = 2

public val RBS_NORMAL: Restorebuttonstates = 1

public val RBS_PUSHED: Restorebuttonstates = 3

public val RBS_REGISTERDROP: UInt = 4096u

public val RBS_TOOLTIPS: UInt = 256u

public val RBS_UNCHECKEDDISABLED: Radiobuttonstates = 4

public val RBS_UNCHECKEDHOT: Radiobuttonstates = 2

public val RBS_UNCHECKEDNORMAL: Radiobuttonstates = 1

public val RBS_UNCHECKEDPRESSED: Radiobuttonstates = 3

public val RBS_VARHEIGHT: UInt = 512u

public val RBS_VERTICALGRIPPER: UInt = 16384u

public val RB_BEGINDRAG: UInt = 1048u

public val RB_DELETEBAND: UInt = 1026u

public val RB_DRAGMOVE: UInt = 1050u

public val RB_ENDDRAG: UInt = 1049u

public val RB_GETBANDBORDERS: UInt = 1058u

public val RB_GETBANDCOUNT: UInt = 1036u

public val RB_GETBANDINFO: UInt = 1052u

public val RB_GETBANDINFOA: UInt = 1053u

public val RB_GETBANDINFOW: UInt = 1052u

public val RB_GETBANDMARGINS: UInt = 1064u

public val RB_GETBARHEIGHT: UInt = 1051u

public val RB_GETBARINFO: UInt = 1027u

public val RB_GETBKCOLOR: UInt = 1044u

public val RB_GETCOLORSCHEME: UInt = 8195u

public val RB_GETDROPTARGET: UInt = 8196u

public val RB_GETEXTENDEDSTYLE: UInt = 1066u

public val RB_GETPALETTE: UInt = 1062u

public val RB_GETRECT: UInt = 1033u

public val RB_GETROWCOUNT: UInt = 1037u

public val RB_GETROWHEIGHT: UInt = 1038u

public val RB_GETTEXTCOLOR: UInt = 1046u

public val RB_GETTOOLTIPS: UInt = 1041u

public val RB_GETUNICODEFORMAT: UInt = 8198u

public val RB_HITTEST: UInt = 1032u

public val RB_IDTOINDEX: UInt = 1040u

public val RB_INSERTBAND: UInt = 1034u

public val RB_INSERTBANDA: UInt = 1025u

public val RB_INSERTBANDW: UInt = 1034u

public val RB_MAXIMIZEBAND: UInt = 1055u

public val RB_MINIMIZEBAND: UInt = 1054u

public val RB_MOVEBAND: UInt = 1063u

public val RB_PUSHCHEVRON: UInt = 1067u

public val RB_SETBANDINFO: UInt = 1035u

public val RB_SETBANDINFOA: UInt = 1030u

public val RB_SETBANDINFOW: UInt = 1035u

public val RB_SETBANDWIDTH: UInt = 1068u

public val RB_SETBARINFO: UInt = 1028u

public val RB_SETBKCOLOR: UInt = 1043u

public val RB_SETCOLORSCHEME: UInt = 8194u

public val RB_SETEXTENDEDSTYLE: UInt = 1065u

public val RB_SETPALETTE: UInt = 1061u

public val RB_SETPARENT: UInt = 1031u

public val RB_SETTEXTCOLOR: UInt = 1045u

public val RB_SETTOOLTIPS: UInt = 1042u

public val RB_SETUNICODEFORMAT: UInt = 8197u

public val RB_SETWINDOWTHEME: UInt = 8203u

public val RB_SHOWBAND: UInt = 1059u

public val RB_SIZETORECT: UInt = 1047u

public val REBARCLASSNAME: Pcwstr = w("ReBarWindow32")

public val REBARCLASSNAMEA: Pcstr = s("ReBarWindow32")

public val REBARCLASSNAMEW: Pcwstr = w("ReBarWindow32")

public val REPLACEDLGORD: UInt = 1541u

public val RP_BACKGROUND: Rebarparts = 6

public val RP_BAND: Rebarparts = 3

public val RP_CHEVRON: Rebarparts = 4

public val RP_CHEVRONVERT: Rebarparts = 5

public val RP_GRIPPER: Rebarparts = 1

public val RP_GRIPPERVERT: Rebarparts = 2

public val RP_SPLITTER: Rebarparts = 7

public val RP_SPLITTERVERT: Rebarparts = 8

public val RUNDLGORD: UInt = 1545u

public val SBARS_SIZEGRIP: UInt = 256u

public val SBARS_TOOLTIPS: UInt = 2048u

public val SBN_FIRST: UInt = 4294966416u

public val SBN_LAST: UInt = 4294966397u

public val SBN_SIMPLEMODECHANGE: UInt = 4294966416u

public val SBP_ARROWBTN: Scrollbarparts = 1

public val SBP_GRIPPERHORZ: Scrollbarparts = 8

public val SBP_GRIPPERVERT: Scrollbarparts = 9

public val SBP_LOWERTRACKHORZ: Scrollbarparts = 4

public val SBP_LOWERTRACKVERT: Scrollbarparts = 6

public val SBP_SIZEBOX: Scrollbarparts = 10

public val SBP_SIZEBOXBKGND: Scrollbarparts = 11

public val SBP_THUMBBTNHORZ: Scrollbarparts = 2

public val SBP_THUMBBTNVERT: Scrollbarparts = 3

public val SBP_UPPERTRACKHORZ: Scrollbarparts = 5

public val SBP_UPPERTRACKVERT: Scrollbarparts = 7

public val SBS_DISABLED: Sysbuttonstates = 4

public val SBS_HOT: Sysbuttonstates = 2

public val SBS_NORMAL: Sysbuttonstates = 1

public val SBS_PUSHED: Sysbuttonstates = 3

public val SBT_NOBORDERS: UInt = 256u

public val SBT_NOTABPARSING: UInt = 2048u

public val SBT_OWNERDRAW: UInt = 4096u

public val SBT_POPOUT: UInt = 512u

public val SBT_RTLREADING: UInt = 1024u

public val SBT_TOOLTIPS: UInt = 2048u

public val SB_GETBORDERS: UInt = 1031u

public val SB_GETICON: UInt = 1044u

public val SB_GETPARTS: UInt = 1030u

public val SB_GETRECT: UInt = 1034u

public val SB_GETTEXT: UInt = 1037u

public val SB_GETTEXTA: UInt = 1026u

public val SB_GETTEXTLENGTH: UInt = 1036u

public val SB_GETTEXTLENGTHA: UInt = 1027u

public val SB_GETTEXTLENGTHW: UInt = 1036u

public val SB_GETTEXTW: UInt = 1037u

public val SB_GETTIPTEXTA: UInt = 1042u

public val SB_GETTIPTEXTW: UInt = 1043u

public val SB_GETUNICODEFORMAT: UInt = 8198u

public val SB_ISSIMPLE: UInt = 1038u

public val SB_SETBKCOLOR: UInt = 8193u

public val SB_SETICON: UInt = 1039u

public val SB_SETMINHEIGHT: UInt = 1032u

public val SB_SETPARTS: UInt = 1028u

public val SB_SETTEXT: UInt = 1035u

public val SB_SETTEXTA: UInt = 1025u

public val SB_SETTEXTW: UInt = 1035u

public val SB_SETTIPTEXTA: UInt = 1040u

public val SB_SETTIPTEXTW: UInt = 1041u

public val SB_SETUNICODEFORMAT: UInt = 8197u

public val SB_SIMPLE: UInt = 1033u

public val SB_SIMPLEID: UInt = 255u

public val SCBS_DISABLED: Smallclosebuttonstates = 4

public val SCBS_HOT: Smallclosebuttonstates = 2

public val SCBS_NORMAL: Smallclosebuttonstates = 1

public val SCBS_PUSHED: Smallclosebuttonstates = 3

public val SCRBS_DISABLED: Scrollbarstylestates = 4

public val SCRBS_HOT: Scrollbarstylestates = 2

public val SCRBS_HOVER: Scrollbarstylestates = 5

public val SCRBS_NORMAL: Scrollbarstylestates = 1

public val SCRBS_PRESSED: Scrollbarstylestates = 3

public val SCS_ACTIVE: Smallcaptionstates = 1

public val SCS_DISABLED: Smallcaptionstates = 3

public val SCS_INACTIVE: Smallcaptionstates = 2

public val SFRB_ACTIVE: Smallframebottomstates = 1

public val SFRB_INACTIVE: Smallframebottomstates = 2

public val SFRL_ACTIVE: Smallframeleftstates = 1

public val SFRL_INACTIVE: Smallframeleftstates = 2

public val SFRR_ACTIVE: Smallframerightstates = 1

public val SFRR_INACTIVE: Smallframerightstates = 2

public val SPLITSV_HOT: Splittervertstates = 2

public val SPLITSV_NORMAL: Splittervertstates = 1

public val SPLITSV_PRESSED: Splittervertstates = 3

public val SPLITS_HOT: Splitterstates = 2

public val SPLITS_NORMAL: Splitterstates = 1

public val SPLITS_PRESSED: Splitterstates = 3

public val SPLS_HOT: Logoffbuttonsstates = 2

public val SPLS_NORMAL: Logoffbuttonsstates = 1

public val SPLS_PRESSED: Logoffbuttonsstates = 3

public val SPMPT_DISABLED: Moreprogramstabstates = 4

public val SPMPT_FOCUSED: Moreprogramstabstates = 5

public val SPMPT_HOT: Moreprogramstabstates = 2

public val SPMPT_NORMAL: Moreprogramstabstates = 1

public val SPMPT_SELECTED: Moreprogramstabstates = 3

public val SPNP_DOWN: Spinparts = 2

public val SPNP_DOWNHORZ: Spinparts = 4

public val SPNP_UP: Spinparts = 1

public val SPNP_UPHORZ: Spinparts = 3

public val SPOB_DISABLED: Openboxstates = 4

public val SPOB_FOCUSED: Openboxstates = 5

public val SPOB_HOT: Openboxstates = 2

public val SPOB_NORMAL: Openboxstates = 1

public val SPOB_SELECTED: Openboxstates = 3

public val SPP_LOGOFF: Startpanelparts = 8

public val SPP_LOGOFFBUTTONS: Startpanelparts = 9

public val SPP_LOGOFFSPLITBUTTONDROPDOWN: Startpanelparts = 19

public val SPP_MOREPROGRAMS: Startpanelparts = 2

public val SPP_MOREPROGRAMSARROW: Startpanelparts = 3

public val SPP_MOREPROGRAMSARROWBACK: Startpanelparts = 17

public val SPP_MOREPROGRAMSTAB: Startpanelparts = 12

public val SPP_NSCHOST: Startpanelparts = 13

public val SPP_OPENBOX: Startpanelparts = 15

public val SPP_PLACESLIST: Startpanelparts = 6

public val SPP_PLACESLISTSEPARATOR: Startpanelparts = 7

public val SPP_PREVIEW: Startpanelparts = 11

public val SPP_PROGLIST: Startpanelparts = 4

public val SPP_PROGLISTSEPARATOR: Startpanelparts = 5

public val SPP_SEARCHVIEW: Startpanelparts = 16

public val SPP_SOFTWAREEXPLORER: Startpanelparts = 14

public val SPP_TOPMATCH: Startpanelparts = 18

public val SPP_USERPANE: Startpanelparts = 1

public val SPP_USERPICTURE: Startpanelparts = 10

public val SPSB_HOT: Moreprogramsarrowbackstates = 2

public val SPSB_NORMAL: Moreprogramsarrowbackstates = 1

public val SPSB_PRESSED: Moreprogramsarrowbackstates = 3

public val SPSE_DISABLED: Softwareexplorerstates = 4

public val SPSE_FOCUSED: Softwareexplorerstates = 5

public val SPSE_HOT: Softwareexplorerstates = 2

public val SPSE_NORMAL: Softwareexplorerstates = 1

public val SPSE_SELECTED: Softwareexplorerstates = 3

public val SPS_HOT: Moreprogramsarrowstates = 2

public val SPS_NORMAL: Moreprogramsarrowstates = 1

public val SPS_PRESSED: Moreprogramsarrowstates = 3

public val SP_GRIPPER: Statusparts = 3

public val SP_GRIPPERPANE: Statusparts = 2

public val SP_PANE: Statusparts = 1

public val STATE_SYSTEM_FOCUSABLE: ComboboxinfoButtonState = 1048576u

public val STATE_SYSTEM_INVISIBLE: ComboboxinfoButtonState = 32768u

public val STATE_SYSTEM_OFFSCREEN: ComboboxinfoButtonState = 65536u

public val STATE_SYSTEM_PRESSED: ComboboxinfoButtonState = 8u

public val STATE_SYSTEM_UNAVAILABLE: ComboboxinfoButtonState = 1u

public val STATUSCLASSNAME: Pcwstr = w("msctls_statusbar32")

public val STATUSCLASSNAMEA: Pcstr = s("msctls_statusbar32")

public val STATUSCLASSNAMEW: Pcwstr = w("msctls_statusbar32")

public val STAT_TEXT: Staticparts = 1

public val STD_COPY: UInt = 1u

public val STD_CUT: UInt = 0u

public val STD_DELETE: UInt = 5u

public val STD_FILENEW: UInt = 6u

public val STD_FILEOPEN: UInt = 7u

public val STD_FILESAVE: UInt = 8u

public val STD_FIND: UInt = 12u

public val STD_HELP: UInt = 11u

public val STD_PASTE: UInt = 2u

public val STD_PRINT: UInt = 14u

public val STD_PRINTPRE: UInt = 9u

public val STD_PROPERTIES: UInt = 10u

public val STD_REDOW: UInt = 4u

public val STD_REPLACE: UInt = 13u

public val STD_UNDO: UInt = 3u

public val ST_STRETCH: Sizingtype = 1

public val ST_TILE: Sizingtype = 2

public val ST_TRUESIZE: Sizingtype = 0

public val SZB_HALFBOTTOMLEFTALIGN: Sizeboxstates = 6

public val SZB_HALFBOTTOMRIGHTALIGN: Sizeboxstates = 5

public val SZB_HALFTOPLEFTALIGN: Sizeboxstates = 8

public val SZB_HALFTOPRIGHTALIGN: Sizeboxstates = 7

public val SZB_LEFTALIGN: Sizeboxstates = 2

public val SZB_RIGHTALIGN: Sizeboxstates = 1

public val SZB_TOPLEFTALIGN: Sizeboxstates = 4

public val SZB_TOPRIGHTALIGN: Sizeboxstates = 3

public val SZ_THDOCPROP_AUTHOR: Pcwstr = w("author")

public val SZ_THDOCPROP_CANONICALNAME: Pcwstr = w("ThemeName")

public val SZ_THDOCPROP_DISPLAYNAME: Pcwstr = w("DisplayName")

public val SZ_THDOCPROP_TOOLTIP: Pcwstr = w("ToolTip")

public val TABP_AEROWIZARDBODY: Tabparts = 11

public val TABP_BODY: Tabparts = 10

public val TABP_PANE: Tabparts = 9

public val TABP_TABITEM: Tabparts = 1

public val TABP_TABITEMBOTHEDGE: Tabparts = 4

public val TABP_TABITEMLEFTEDGE: Tabparts = 2

public val TABP_TABITEMRIGHTEDGE: Tabparts = 3

public val TABP_TOPTABITEM: Tabparts = 5

public val TABP_TOPTABITEMBOTHEDGE: Tabparts = 8

public val TABP_TOPTABITEMLEFTEDGE: Tabparts = 6

public val TABP_TOPTABITEMRIGHTEDGE: Tabparts = 7

public val TAPF_ALLOWCOLLECTION: TaPropertyFlag = 4

public val TAPF_HASBACKGROUND: TaPropertyFlag = 8

public val TAPF_HASPERSPECTIVE: TaPropertyFlag = 16

public val TAPF_HASSTAGGER: TaPropertyFlag = 1

public val TAPF_ISRTLAWARE: TaPropertyFlag = 2

public val TAPF_NONE: TaPropertyFlag = 0

public val TAP_FLAGS: TaProperty = 0

public val TAP_STAGGERDELAY: TaProperty = 2

public val TAP_STAGGERDELAYCAP: TaProperty = 3

public val TAP_STAGGERDELAYFACTOR: TaProperty = 4

public val TAP_TRANSFORMCOUNT: TaProperty = 1

public val TAP_ZORDER: TaProperty = 5

public val TATF_HASINITIALVALUES: TaTransformFlag = 2

public val TATF_HASORIGINVALUES: TaTransformFlag = 4

public val TATF_NONE: TaTransformFlag = 0

public val TATF_TARGETVALUES_USER: TaTransformFlag = 1

public val TATT_CLIP: TaTransformType = 3

public val TATT_OPACITY: TaTransformType = 2

public val TATT_SCALE_2D: TaTransformType = 1

public val TATT_TRANSLATE_2D: TaTransformType = 0

public val TBBF_LARGE: UInt = 1u

public val TBCDRF_BLENDICON: UInt = 2097152u

public val TBCDRF_HILITEHOTTRACK: UInt = 131072u

public val TBCDRF_NOBACKGROUND: UInt = 4194304u

public val TBCDRF_NOEDGES: UInt = 65536u

public val TBCDRF_NOETCHEDEFFECT: UInt = 1048576u

public val TBCDRF_NOMARK: UInt = 524288u

public val TBCDRF_NOOFFSET: UInt = 262144u

public val TBCDRF_USECDCOLORS: UInt = 8388608u

public val TBCD_CHANNEL: UInt = 3u

public val TBCD_THUMB: UInt = 2u

public val TBCD_TICS: UInt = 1u

public val TBDDRET_DEFAULT: UInt = 0u

public val TBDDRET_NODEFAULT: UInt = 1u

public val TBDDRET_TREATPRESSED: UInt = 2u

public val TBIF_BYINDEX: TbbuttoninfowMask = 2147483648u

public val TBIF_COMMAND: TbbuttoninfowMask = 32u

public val TBIF_IMAGE: TbbuttoninfowMask = 1u

public val TBIF_LPARAM: TbbuttoninfowMask = 16u

public val TBIF_SIZE: TbbuttoninfowMask = 64u

public val TBIF_STATE: TbbuttoninfowMask = 4u

public val TBIF_STYLE: TbbuttoninfowMask = 8u

public val TBIF_TEXT: TbbuttoninfowMask = 2u

public val TBIMHT_AFTER: TbinsertmarkFlags = 1u

public val TBIMHT_BACKGROUND: TbinsertmarkFlags = 2u

public val TBIMHT_NONE: TbinsertmarkFlags = 0u

public val TBMF_BARPAD: UInt = 2u

public val TBMF_BUTTONSPACING: UInt = 4u

public val TBMF_PAD: UInt = 1u

public val TBM_CLEARSEL: UInt = 1043u

public val TBM_CLEARTICS: UInt = 1033u

public val TBM_GETBUDDY: UInt = 1057u

public val TBM_GETCHANNELRECT: UInt = 1050u

public val TBM_GETLINESIZE: UInt = 1048u

public val TBM_GETNUMTICS: UInt = 1040u

public val TBM_GETPAGESIZE: UInt = 1046u

public val TBM_GETPTICS: UInt = 1038u

public val TBM_GETRANGEMAX: UInt = 1026u

public val TBM_GETRANGEMIN: UInt = 1025u

public val TBM_GETSELEND: UInt = 1042u

public val TBM_GETSELSTART: UInt = 1041u

public val TBM_GETTHUMBLENGTH: UInt = 1052u

public val TBM_GETTHUMBRECT: UInt = 1049u

public val TBM_GETTIC: UInt = 1027u

public val TBM_GETTICPOS: UInt = 1039u

public val TBM_GETTOOLTIPS: UInt = 1054u

public val TBM_GETUNICODEFORMAT: UInt = 8198u

public val TBM_SETBUDDY: UInt = 1056u

public val TBM_SETLINESIZE: UInt = 1047u

public val TBM_SETPAGESIZE: UInt = 1045u

public val TBM_SETPOS: UInt = 1029u

public val TBM_SETPOSNOTIFY: UInt = 1058u

public val TBM_SETRANGE: UInt = 1030u

public val TBM_SETRANGEMAX: UInt = 1032u

public val TBM_SETRANGEMIN: UInt = 1031u

public val TBM_SETSEL: UInt = 1034u

public val TBM_SETSELEND: UInt = 1036u

public val TBM_SETSELSTART: UInt = 1035u

public val TBM_SETTHUMBLENGTH: UInt = 1051u

public val TBM_SETTIC: UInt = 1028u

public val TBM_SETTICFREQ: UInt = 1044u

public val TBM_SETTIPSIDE: UInt = 1055u

public val TBM_SETTOOLTIPS: UInt = 1053u

public val TBM_SETUNICODEFORMAT: UInt = 8197u

public val TBNF_DI_SETITEM: NmtbdispinfowMask = 268435456u

public val TBNF_IMAGE: NmtbdispinfowMask = 1u

public val TBNF_TEXT: NmtbdispinfowMask = 2u

public val TBNRF_ENDCUSTOMIZE: UInt = 2u

public val TBNRF_HIDEHELP: UInt = 1u

public val TBN_BEGINADJUST: UInt = 4294966593u

public val TBN_BEGINDRAG: UInt = 4294966595u

public val TBN_CUSTHELP: UInt = 4294966587u

public val TBN_DELETINGBUTTON: UInt = 4294966581u

public val TBN_DRAGOUT: UInt = 4294966582u

public val TBN_DRAGOVER: UInt = 4294966569u

public val TBN_DROPDOWN: UInt = 4294966586u

public val TBN_DUPACCELERATOR: UInt = 4294966571u

public val TBN_ENDADJUST: UInt = 4294966592u

public val TBN_ENDDRAG: UInt = 4294966594u

public val TBN_FIRST: UInt = 4294966596u

public val TBN_GETBUTTONINFO: UInt = 4294966576u

public val TBN_GETBUTTONINFOA: UInt = 4294966596u

public val TBN_GETBUTTONINFOW: UInt = 4294966576u

public val TBN_GETDISPINFO: UInt = 4294966579u

public val TBN_GETDISPINFOA: UInt = 4294966580u

public val TBN_GETDISPINFOW: UInt = 4294966579u

public val TBN_GETINFOTIP: UInt = 4294966577u

public val TBN_GETINFOTIPA: UInt = 4294966578u

public val TBN_GETINFOTIPW: UInt = 4294966577u

public val TBN_GETOBJECT: UInt = 4294966584u

public val TBN_HOTITEMCHANGE: UInt = 4294966583u

public val TBN_INITCUSTOMIZE: UInt = 4294966573u

public val TBN_LAST: UInt = 4294966576u

public val TBN_MAPACCELERATOR: UInt = 4294966568u

public val TBN_QUERYDELETE: UInt = 4294966589u

public val TBN_QUERYINSERT: UInt = 4294966590u

public val TBN_RESET: UInt = 4294966591u

public val TBN_RESTORE: UInt = 4294966575u

public val TBN_SAVE: UInt = 4294966574u

public val TBN_TOOLBARCHANGE: UInt = 4294966588u

public val TBN_WRAPACCELERATOR: UInt = 4294966570u

public val TBN_WRAPHOTITEM: UInt = 4294966572u

public val TBP_BACKGROUNDBOTTOM: Taskbarparts = 1

public val TBP_BACKGROUNDLEFT: Taskbarparts = 4

public val TBP_BACKGROUNDRIGHT: Taskbarparts = 2

public val TBP_BACKGROUNDTOP: Taskbarparts = 3

public val TBP_SIZINGBARBOTTOM: Taskbarparts = 5

public val TBP_SIZINGBARLEFT: Taskbarparts = 8

public val TBP_SIZINGBARRIGHT: Taskbarparts = 6

public val TBP_SIZINGBARTOP: Taskbarparts = 7

public val TBSTATE_CHECKED: UInt = 1u

public val TBSTATE_ELLIPSES: UInt = 64u

public val TBSTATE_ENABLED: UInt = 4u

public val TBSTATE_HIDDEN: UInt = 8u

public val TBSTATE_INDETERMINATE: UInt = 16u

public val TBSTATE_MARKED: UInt = 128u

public val TBSTATE_PRESSED: UInt = 2u

public val TBSTATE_WRAP: UInt = 32u

public val TBSTYLE_ALTDRAG: UInt = 1024u

public val TBSTYLE_AUTOSIZE: UInt = 16u

public val TBSTYLE_BUTTON: UInt = 0u

public val TBSTYLE_CHECK: UInt = 2u

public val TBSTYLE_CUSTOMERASE: UInt = 8192u

public val TBSTYLE_DROPDOWN: UInt = 8u

public val TBSTYLE_EX_DOUBLEBUFFER: UInt = 128u

public val TBSTYLE_EX_DRAWDDARROWS: UInt = 1u

public val TBSTYLE_EX_HIDECLIPPEDBUTTONS: UInt = 16u

public val TBSTYLE_EX_MIXEDBUTTONS: UInt = 8u

public val TBSTYLE_EX_MULTICOLUMN: UInt = 2u

public val TBSTYLE_EX_VERTICAL: UInt = 4u

public val TBSTYLE_FLAT: UInt = 2048u

public val TBSTYLE_GROUP: UInt = 4u

public val TBSTYLE_LIST: UInt = 4096u

public val TBSTYLE_NOPREFIX: UInt = 32u

public val TBSTYLE_REGISTERDROP: UInt = 16384u

public val TBSTYLE_SEP: UInt = 1u

public val TBSTYLE_TOOLTIPS: UInt = 256u

public val TBSTYLE_TRANSPARENT: UInt = 32768u

public val TBSTYLE_WRAPABLE: UInt = 512u

public val TBS_AUTOTICKS: UInt = 1u

public val TBS_BOTH: UInt = 8u

public val TBS_BOTTOM: UInt = 0u

public val TBS_DOWNISLEFT: UInt = 1024u

public val TBS_ENABLESELRANGE: UInt = 32u

public val TBS_FIXEDLENGTH: UInt = 64u

public val TBS_HORZ: UInt = 0u

public val TBS_LEFT: UInt = 4u

public val TBS_NOTHUMB: UInt = 128u

public val TBS_NOTICKS: UInt = 16u

public val TBS_NOTIFYBEFOREMOVE: UInt = 2048u

public val TBS_REVERSED: UInt = 512u

public val TBS_RIGHT: UInt = 0u

public val TBS_TOOLTIPS: UInt = 256u

public val TBS_TOP: UInt = 4u

public val TBS_TRANSPARENTBKGND: UInt = 4096u

public val TBS_VERT: UInt = 2u

public val TBTS_BOTTOM: UInt = 2u

public val TBTS_LEFT: UInt = 1u

public val TBTS_RIGHT: UInt = 3u

public val TBTS_TOP: UInt = 0u

public val TB_ADDBITMAP: UInt = 1043u

public val TB_ADDBUTTONS: UInt = 1092u

public val TB_ADDBUTTONSA: UInt = 1044u

public val TB_ADDBUTTONSW: UInt = 1092u

public val TB_ADDSTRING: UInt = 1101u

public val TB_ADDSTRINGA: UInt = 1052u

public val TB_ADDSTRINGW: UInt = 1101u

public val TB_AUTOSIZE: UInt = 1057u

public val TB_BOTTOM: UInt = 7u

public val TB_BUTTONCOUNT: UInt = 1048u

public val TB_BUTTONSTRUCTSIZE: UInt = 1054u

public val TB_CHANGEBITMAP: UInt = 1067u

public val TB_CHECKBUTTON: UInt = 1026u

public val TB_COMMANDTOINDEX: UInt = 1049u

public val TB_CUSTOMIZE: UInt = 1051u

public val TB_DELETEBUTTON: UInt = 1046u

public val TB_ENABLEBUTTON: UInt = 1025u

public val TB_ENDTRACK: UInt = 8u

public val TB_GETANCHORHIGHLIGHT: UInt = 1098u

public val TB_GETBITMAP: UInt = 1068u

public val TB_GETBITMAPFLAGS: UInt = 1065u

public val TB_GETBUTTON: UInt = 1047u

public val TB_GETBUTTONINFO: UInt = 1087u

public val TB_GETBUTTONINFOA: UInt = 1089u

public val TB_GETBUTTONINFOW: UInt = 1087u

public val TB_GETBUTTONSIZE: UInt = 1082u

public val TB_GETBUTTONTEXT: UInt = 1099u

public val TB_GETBUTTONTEXTA: UInt = 1069u

public val TB_GETBUTTONTEXTW: UInt = 1099u

public val TB_GETCOLORSCHEME: UInt = 8195u

public val TB_GETDISABLEDIMAGELIST: UInt = 1079u

public val TB_GETEXTENDEDSTYLE: UInt = 1109u

public val TB_GETHOTIMAGELIST: UInt = 1077u

public val TB_GETHOTITEM: UInt = 1095u

public val TB_GETIDEALSIZE: UInt = 1123u

public val TB_GETIMAGELIST: UInt = 1073u

public val TB_GETIMAGELISTCOUNT: UInt = 1122u

public val TB_GETINSERTMARK: UInt = 1103u

public val TB_GETINSERTMARKCOLOR: UInt = 1113u

public val TB_GETITEMDROPDOWNRECT: UInt = 1127u

public val TB_GETITEMRECT: UInt = 1053u

public val TB_GETMAXSIZE: UInt = 1107u

public val TB_GETMETRICS: UInt = 1125u

public val TB_GETOBJECT: UInt = 1086u

public val TB_GETPADDING: UInt = 1110u

public val TB_GETPRESSEDIMAGELIST: UInt = 1129u

public val TB_GETRECT: UInt = 1075u

public val TB_GETROWS: UInt = 1064u

public val TB_GETSTATE: UInt = 1042u

public val TB_GETSTRING: UInt = 1115u

public val TB_GETSTRINGA: UInt = 1116u

public val TB_GETSTRINGW: UInt = 1115u

public val TB_GETSTYLE: UInt = 1081u

public val TB_GETTEXTROWS: UInt = 1085u

public val TB_GETTOOLTIPS: UInt = 1059u

public val TB_GETUNICODEFORMAT: UInt = 8198u

public val TB_HASACCELERATOR: UInt = 1119u

public val TB_HIDEBUTTON: UInt = 1028u

public val TB_HITTEST: UInt = 1093u

public val TB_INDETERMINATE: UInt = 1029u

public val TB_INSERTBUTTON: UInt = 1091u

public val TB_INSERTBUTTONA: UInt = 1045u

public val TB_INSERTBUTTONW: UInt = 1091u

public val TB_INSERTMARKHITTEST: UInt = 1105u

public val TB_ISBUTTONCHECKED: UInt = 1034u

public val TB_ISBUTTONENABLED: UInt = 1033u

public val TB_ISBUTTONHIDDEN: UInt = 1036u

public val TB_ISBUTTONHIGHLIGHTED: UInt = 1038u

public val TB_ISBUTTONINDETERMINATE: UInt = 1037u

public val TB_ISBUTTONPRESSED: UInt = 1035u

public val TB_LINEDOWN: UInt = 1u

public val TB_LINEUP: UInt = 0u

public val TB_LOADIMAGES: UInt = 1074u

public val TB_MAPACCELERATOR: UInt = 1114u

public val TB_MAPACCELERATORA: UInt = 1102u

public val TB_MAPACCELERATORW: UInt = 1114u

public val TB_MARKBUTTON: UInt = 1030u

public val TB_MOVEBUTTON: UInt = 1106u

public val TB_PAGEDOWN: UInt = 3u

public val TB_PAGEUP: UInt = 2u

public val TB_PRESSBUTTON: UInt = 1027u

public val TB_REPLACEBITMAP: UInt = 1070u

public val TB_SAVERESTORE: UInt = 1100u

public val TB_SAVERESTOREA: UInt = 1050u

public val TB_SAVERESTOREW: UInt = 1100u

public val TB_SETANCHORHIGHLIGHT: UInt = 1097u

public val TB_SETBITMAPSIZE: UInt = 1056u

public val TB_SETBOUNDINGSIZE: UInt = 1117u

public val TB_SETBUTTONINFO: UInt = 1088u

public val TB_SETBUTTONINFOA: UInt = 1090u

public val TB_SETBUTTONINFOW: UInt = 1088u

public val TB_SETBUTTONSIZE: UInt = 1055u

public val TB_SETBUTTONWIDTH: UInt = 1083u

public val TB_SETCMDID: UInt = 1066u

public val TB_SETCOLORSCHEME: UInt = 8194u

public val TB_SETDISABLEDIMAGELIST: UInt = 1078u

public val TB_SETDRAWTEXTFLAGS: UInt = 1094u

public val TB_SETEXTENDEDSTYLE: UInt = 1108u

public val TB_SETHOTIMAGELIST: UInt = 1076u

public val TB_SETHOTITEM: UInt = 1096u

public val TB_SETHOTITEM2: UInt = 1118u

public val TB_SETIMAGELIST: UInt = 1072u

public val TB_SETINDENT: UInt = 1071u

public val TB_SETINSERTMARK: UInt = 1104u

public val TB_SETINSERTMARKCOLOR: UInt = 1112u

public val TB_SETLISTGAP: UInt = 1120u

public val TB_SETMAXTEXTROWS: UInt = 1084u

public val TB_SETMETRICS: UInt = 1126u

public val TB_SETPADDING: UInt = 1111u

public val TB_SETPARENT: UInt = 1061u

public val TB_SETPRESSEDIMAGELIST: UInt = 1128u

public val TB_SETROWS: UInt = 1063u

public val TB_SETSTATE: UInt = 1041u

public val TB_SETSTYLE: UInt = 1080u

public val TB_SETTOOLTIPS: UInt = 1060u

public val TB_SETUNICODEFORMAT: UInt = 8197u

public val TB_SETWINDOWTHEME: UInt = 8203u

public val TB_THUMBPOSITION: UInt = 4u

public val TB_THUMBTRACK: UInt = 5u

public val TB_TOP: UInt = 6u

public val TCHT_NOWHERE: TchittestinfoFlags = 1u

public val TCHT_ONITEM: TchittestinfoFlags = 6u

public val TCHT_ONITEMICON: TchittestinfoFlags = 2u

public val TCHT_ONITEMLABEL: TchittestinfoFlags = 4u

public val TCIF_IMAGE: TcitemheaderaMask = 2u

public val TCIF_PARAM: TcitemheaderaMask = 8u

public val TCIF_RTLREADING: TcitemheaderaMask = 4u

public val TCIF_STATE: TcitemheaderaMask = 16u

public val TCIF_TEXT: TcitemheaderaMask = 1u

public val TCIS_BUTTONPRESSED: TabControlItemState = 1u

public val TCIS_HIGHLIGHTED: TabControlItemState = 2u

public val TCM_ADJUSTRECT: UInt = 4904u

public val TCM_DELETEALLITEMS: UInt = 4873u

public val TCM_DELETEITEM: UInt = 4872u

public val TCM_DESELECTALL: UInt = 4914u

public val TCM_FIRST: UInt = 4864u

public val TCM_GETCURFOCUS: UInt = 4911u

public val TCM_GETCURSEL: UInt = 4875u

public val TCM_GETEXTENDEDSTYLE: UInt = 4917u

public val TCM_GETIMAGELIST: UInt = 4866u

public val TCM_GETITEM: UInt = 4924u

public val TCM_GETITEMA: UInt = 4869u

public val TCM_GETITEMCOUNT: UInt = 4868u

public val TCM_GETITEMRECT: UInt = 4874u

public val TCM_GETITEMW: UInt = 4924u

public val TCM_GETROWCOUNT: UInt = 4908u

public val TCM_GETTOOLTIPS: UInt = 4909u

public val TCM_GETUNICODEFORMAT: UInt = 8198u

public val TCM_HIGHLIGHTITEM: UInt = 4915u

public val TCM_HITTEST: UInt = 4877u

public val TCM_INSERTITEM: UInt = 4926u

public val TCM_INSERTITEMA: UInt = 4871u

public val TCM_INSERTITEMW: UInt = 4926u

public val TCM_REMOVEIMAGE: UInt = 4906u

public val TCM_SETCURFOCUS: UInt = 4912u

public val TCM_SETCURSEL: UInt = 4876u

public val TCM_SETEXTENDEDSTYLE: UInt = 4916u

public val TCM_SETIMAGELIST: UInt = 4867u

public val TCM_SETITEM: UInt = 4925u

public val TCM_SETITEMA: UInt = 4870u

public val TCM_SETITEMEXTRA: UInt = 4878u

public val TCM_SETITEMSIZE: UInt = 4905u

public val TCM_SETITEMW: UInt = 4925u

public val TCM_SETMINTABWIDTH: UInt = 4913u

public val TCM_SETPADDING: UInt = 4907u

public val TCM_SETTOOLTIPS: UInt = 4910u

public val TCM_SETUNICODEFORMAT: UInt = 8197u

public val TCN_FIRST: UInt = 4294966746u

public val TCN_FOCUSCHANGE: UInt = 4294966742u

public val TCN_GETOBJECT: UInt = 4294966743u

public val TCN_KEYDOWN: UInt = 4294966746u

public val TCN_LAST: UInt = 4294966716u

public val TCN_SELCHANGE: UInt = 4294966745u

public val TCN_SELCHANGING: UInt = 4294966744u

public val TCS_BOTTOM: UInt = 2u

public val TCS_BUTTONS: UInt = 256u

public val TCS_EX_FLATSEPARATORS: UInt = 1u

public val TCS_EX_REGISTERDROP: UInt = 2u

public val TCS_FIXEDWIDTH: UInt = 1024u

public val TCS_FLATBUTTONS: UInt = 8u

public val TCS_FOCUSNEVER: UInt = 32768u

public val TCS_FOCUSONBUTTONDOWN: UInt = 4096u

public val TCS_FORCEICONLEFT: UInt = 16u

public val TCS_FORCELABELLEFT: UInt = 32u

public val TCS_HOTTRACK: UInt = 64u

public val TCS_MULTILINE: UInt = 512u

public val TCS_MULTISELECT: UInt = 4u

public val TCS_OWNERDRAWFIXED: UInt = 8192u

public val TCS_RAGGEDRIGHT: UInt = 2048u

public val TCS_RIGHT: UInt = 2u

public val TCS_RIGHTJUSTIFY: UInt = 0u

public val TCS_SCROLLOPPOSITE: UInt = 1u

public val TCS_SINGLELINE: UInt = 0u

public val TCS_TABS: UInt = 0u

public val TCS_TOOLTIPS: UInt = 16384u

public val TCS_VERTICAL: UInt = 128u

public val TDCBF_ABORT_BUTTON: TaskdialogCommonButtonFlags = 65536

public val TDCBF_CANCEL_BUTTON: TaskdialogCommonButtonFlags = 8

public val TDCBF_CLOSE_BUTTON: TaskdialogCommonButtonFlags = 32

public val TDCBF_CONTINUE_BUTTON: TaskdialogCommonButtonFlags = 524288

public val TDCBF_HELP_BUTTON: TaskdialogCommonButtonFlags = 1048576

public val TDCBF_IGNORE_BUTTON: TaskdialogCommonButtonFlags = 131072

public val TDCBF_NO_BUTTON: TaskdialogCommonButtonFlags = 4

public val TDCBF_OK_BUTTON: TaskdialogCommonButtonFlags = 1

public val TDCBF_RETRY_BUTTON: TaskdialogCommonButtonFlags = 16

public val TDCBF_TRYAGAIN_BUTTON: TaskdialogCommonButtonFlags = 262144

public val TDCBF_YES_BUTTON: TaskdialogCommonButtonFlags = 2

public val TDE_CONTENT: TaskdialogElements = 0

public val TDE_EXPANDED_INFORMATION: TaskdialogElements = 1

public val TDE_FOOTER: TaskdialogElements = 2

public val TDE_MAIN_INSTRUCTION: TaskdialogElements = 3

public val TDF_ALLOW_DIALOG_CANCELLATION: TaskdialogFlags = 8

public val TDF_CALLBACK_TIMER: TaskdialogFlags = 2048

public val TDF_CAN_BE_MINIMIZED: TaskdialogFlags = 32768

public val TDF_ENABLE_HYPERLINKS: TaskdialogFlags = 1

public val TDF_EXPANDED_BY_DEFAULT: TaskdialogFlags = 128

public val TDF_EXPAND_FOOTER_AREA: TaskdialogFlags = 64

public val TDF_NO_DEFAULT_RADIO_BUTTON: TaskdialogFlags = 16384

public val TDF_NO_SET_FOREGROUND: TaskdialogFlags = 65536

public val TDF_POSITION_RELATIVE_TO_WINDOW: TaskdialogFlags = 4096

public val TDF_RTL_LAYOUT: TaskdialogFlags = 8192

public val TDF_SHOW_MARQUEE_PROGRESS_BAR: TaskdialogFlags = 1024

public val TDF_SHOW_PROGRESS_BAR: TaskdialogFlags = 512

public val TDF_SIZE_TO_CONTENT: TaskdialogFlags = 16777216

public val TDF_USE_COMMAND_LINKS: TaskdialogFlags = 16

public val TDF_USE_COMMAND_LINKS_NO_ICON: TaskdialogFlags = 32

public val TDF_USE_HICON_FOOTER: TaskdialogFlags = 4

public val TDF_USE_HICON_MAIN: TaskdialogFlags = 2

public val TDF_VERIFICATION_FLAG_CHECKED: TaskdialogFlags = 256

public val TDIE_ICON_FOOTER: TaskdialogIconElements = 1

public val TDIE_ICON_MAIN: TaskdialogIconElements = 0

public val TDLGCPS_STANDALONE: Contentpanestates = 1

public val TDLGEBS_EXPANDEDDISABLED: Expandobuttonstates = 8

public val TDLGEBS_EXPANDEDHOVER: Expandobuttonstates = 5

public val TDLGEBS_EXPANDEDNORMAL: Expandobuttonstates = 4

public val TDLGEBS_EXPANDEDPRESSED: Expandobuttonstates = 6

public val TDLGEBS_HOVER: Expandobuttonstates = 2

public val TDLGEBS_NORMAL: Expandobuttonstates = 1

public val TDLGEBS_NORMALDISABLED: Expandobuttonstates = 7

public val TDLGEBS_PRESSED: Expandobuttonstates = 3

public val TDLG_BUTTONSECTION: Taskdialogparts = 10

public val TDLG_BUTTONWRAPPER: Taskdialogparts = 11

public val TDLG_COMMANDLINKPANE: Taskdialogparts = 7

public val TDLG_CONTENTICON: Taskdialogparts = 5

public val TDLG_CONTENTPANE: Taskdialogparts = 4

public val TDLG_CONTROLPANE: Taskdialogparts = 9

public val TDLG_EXPANDEDCONTENT: Taskdialogparts = 6

public val TDLG_EXPANDEDFOOTERAREA: Taskdialogparts = 18

public val TDLG_EXPANDOBUTTON: Taskdialogparts = 13

public val TDLG_EXPANDOTEXT: Taskdialogparts = 12

public val TDLG_FOOTNOTEAREA: Taskdialogparts = 16

public val TDLG_FOOTNOTEPANE: Taskdialogparts = 15

public val TDLG_FOOTNOTESEPARATOR: Taskdialogparts = 17

public val TDLG_IMAGEALIGNMENT: Taskdialogparts = 20

public val TDLG_MAINICON: Taskdialogparts = 3

public val TDLG_MAININSTRUCTIONPANE: Taskdialogparts = 2

public val TDLG_PRIMARYPANEL: Taskdialogparts = 1

public val TDLG_PROGRESSBAR: Taskdialogparts = 19

public val TDLG_RADIOBUTTONPANE: Taskdialogparts = 21

public val TDLG_SECONDARYPANEL: Taskdialogparts = 8

public val TDLG_VERIFICATIONTEXT: Taskdialogparts = 14

public val TDM_CLICK_BUTTON: TaskdialogMessages = 1126

public val TDM_CLICK_RADIO_BUTTON: TaskdialogMessages = 1134

public val TDM_CLICK_VERIFICATION: TaskdialogMessages = 1137

public val TDM_ENABLE_BUTTON: TaskdialogMessages = 1135

public val TDM_ENABLE_RADIO_BUTTON: TaskdialogMessages = 1136

public val TDM_NAVIGATE_PAGE: TaskdialogMessages = 1125
