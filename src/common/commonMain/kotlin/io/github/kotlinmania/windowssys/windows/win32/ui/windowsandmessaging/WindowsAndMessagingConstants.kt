package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP

public val ARW_BOTTOMLEFT: MINIMIZEDMETRICS_ARRANGE = 0

public val ARW_BOTTOMRIGHT: MINIMIZEDMETRICS_ARRANGE = 1

public val ARW_DOWN: Int = 4

public val ARW_HIDE: Int = 8

public val ARW_LEFT: Int = 0

public val ARW_RIGHT: Int = 0

public val ARW_STARTMASK: Int = 3

public val ARW_STARTRIGHT: Int = 1

public val ARW_STARTTOP: Int = 2

public val ARW_TOPLEFT: MINIMIZEDMETRICS_ARRANGE = 2

public val ARW_TOPRIGHT: MINIMIZEDMETRICS_ARRANGE = 3

public val ARW_UP: Int = 4

public val ASFW_ANY: UInt = 4294967295u

public val AW_ACTIVATE: ANIMATE_WINDOW_FLAGS = 131072u

public val AW_BLEND: ANIMATE_WINDOW_FLAGS = 524288u

public val AW_CENTER: ANIMATE_WINDOW_FLAGS = 16u

public val AW_HIDE: ANIMATE_WINDOW_FLAGS = 65536u

public val AW_HOR_NEGATIVE: ANIMATE_WINDOW_FLAGS = 2u

public val AW_HOR_POSITIVE: ANIMATE_WINDOW_FLAGS = 1u

public val AW_SLIDE: ANIMATE_WINDOW_FLAGS = 262144u

public val AW_VER_NEGATIVE: ANIMATE_WINDOW_FLAGS = 8u

public val AW_VER_POSITIVE: ANIMATE_WINDOW_FLAGS = 4u

public val BM_CLICK: UInt = 245u

public val BM_GETCHECK: UInt = 240u

public val BM_GETIMAGE: UInt = 246u

public val BM_GETSTATE: UInt = 242u

public val BM_SETCHECK: UInt = 241u

public val BM_SETDONTCLICK: UInt = 248u

public val BM_SETIMAGE: UInt = 247u

public val BM_SETSTATE: UInt = 243u

public val BM_SETSTYLE: UInt = 244u

public val BN_CLICKED: UInt = 0u

public val BN_DBLCLK: UInt = 5u

public val BN_DISABLE: UInt = 4u

public val BN_DOUBLECLICKED: UInt = 5u

public val BN_HILITE: UInt = 2u

public val BN_KILLFOCUS: UInt = 7u

public val BN_PAINT: UInt = 1u

public val BN_PUSHED: UInt = 2u

public val BN_SETFOCUS: UInt = 6u

public val BN_UNHILITE: UInt = 3u

public val BN_UNPUSHED: UInt = 3u

public val BROADCAST_QUERY_DENY: UInt = 1112363332u

public val BSF_MSGSRV32ISOK: UInt = 2147483648u

public val BSF_MSGSRV32ISOK_BIT: UInt = 31u

public val BSM_INSTALLABLEDRIVERS: UInt = 4u

public val BSM_NETDRIVER: UInt = 2u

public val BSM_VXDS: UInt = 1u

public val BST_FOCUS: UInt = 8u

public val BST_PUSHED: UInt = 4u

public val BS_3STATE: Int = 5

public val BS_AUTO3STATE: Int = 6

public val BS_AUTOCHECKBOX: Int = 3

public val BS_AUTORADIOBUTTON: Int = 9

public val BS_BITMAP: Int = 128

public val BS_BOTTOM: Int = 2048

public val BS_CENTER: Int = 768

public val BS_CHECKBOX: Int = 2

public val BS_DEFPUSHBUTTON: Int = 1

public val BS_FLAT: Int = 32768

public val BS_GROUPBOX: Int = 7

public val BS_ICON: Int = 64

public val BS_LEFT: Int = 256

public val BS_LEFTTEXT: Int = 32

public val BS_MULTILINE: Int = 8192

public val BS_NOTIFY: Int = 16384

public val BS_OWNERDRAW: Int = 11

public val BS_PUSHBOX: Int = 10

public val BS_PUSHBUTTON: Int = 0

public val BS_PUSHLIKE: Int = 4096

public val BS_RADIOBUTTON: Int = 4

public val BS_RIGHT: Int = 512

public val BS_RIGHTBUTTON: Int = 32

public val BS_TEXT: Int = 0

public val BS_TOP: Int = 1024

public val BS_TYPEMASK: Int = 15

public val BS_USERBUTTON: Int = 8

public val BS_VCENTER: Int = 3072

public val CALERT_SYSTEM: UInt = 6u

public val CBN_CLOSEUP: UInt = 8u

public val CBN_DBLCLK: UInt = 2u

public val CBN_DROPDOWN: UInt = 7u

public val CBN_EDITCHANGE: UInt = 5u

public val CBN_EDITUPDATE: UInt = 6u

public val CBN_ERRSPACE: Int = -1

public val CBN_KILLFOCUS: UInt = 4u

public val CBN_SELCHANGE: UInt = 1u

public val CBN_SELENDCANCEL: UInt = 10u

public val CBN_SELENDOK: UInt = 9u

public val CBN_SETFOCUS: UInt = 3u

public val CBS_AUTOHSCROLL: Int = 64

public val CBS_DISABLENOSCROLL: Int = 2048

public val CBS_DROPDOWN: Int = 2

public val CBS_DROPDOWNLIST: Int = 3

public val CBS_HASSTRINGS: Int = 512

public val CBS_LOWERCASE: Int = 16384

public val CBS_NOINTEGRALHEIGHT: Int = 1024

public val CBS_OEMCONVERT: Int = 128

public val CBS_OWNERDRAWFIXED: Int = 16

public val CBS_OWNERDRAWVARIABLE: Int = 32

public val CBS_SIMPLE: Int = 1

public val CBS_SORT: Int = 256

public val CBS_UPPERCASE: Int = 8192

public val CB_ADDSTRING: UInt = 323u

public val CB_DELETESTRING: UInt = 324u

public val CB_DIR: UInt = 325u

public val CB_ERR: Int = -1

public val CB_ERRSPACE: Int = -2

public val CB_FINDSTRING: UInt = 332u

public val CB_FINDSTRINGEXACT: UInt = 344u

public val CB_GETCOMBOBOXINFO: UInt = 356u

public val CB_GETCOUNT: UInt = 326u

public val CB_GETCURSEL: UInt = 327u

public val CB_GETDROPPEDCONTROLRECT: UInt = 338u

public val CB_GETDROPPEDSTATE: UInt = 343u

public val CB_GETDROPPEDWIDTH: UInt = 351u

public val CB_GETEDITSEL: UInt = 320u

public val CB_GETEXTENDEDUI: UInt = 342u

public val CB_GETHORIZONTALEXTENT: UInt = 349u

public val CB_GETITEMDATA: UInt = 336u

public val CB_GETITEMHEIGHT: UInt = 340u

public val CB_GETLBTEXT: UInt = 328u

public val CB_GETLBTEXTLEN: UInt = 329u

public val CB_GETLOCALE: UInt = 346u

public val CB_GETTOPINDEX: UInt = 347u

public val CB_INITSTORAGE: UInt = 353u

public val CB_INSERTSTRING: UInt = 330u

public val CB_LIMITTEXT: UInt = 321u

public val CB_MSGMAX: UInt = 357u

public val CB_MULTIPLEADDSTRING: UInt = 355u

public val CB_OKAY: UInt = 0u

public val CB_RESETCONTENT: UInt = 331u

public val CB_SELECTSTRING: UInt = 333u

public val CB_SETCURSEL: UInt = 334u

public val CB_SETDROPPEDWIDTH: UInt = 352u

public val CB_SETEDITSEL: UInt = 322u

public val CB_SETEXTENDEDUI: UInt = 341u

public val CB_SETHORIZONTALEXTENT: UInt = 350u

public val CB_SETITEMDATA: UInt = 337u

public val CB_SETITEMHEIGHT: UInt = 339u

public val CB_SETLOCALE: UInt = 345u

public val CB_SETTOPINDEX: UInt = 348u

public val CB_SHOWDROPDOWN: UInt = 335u

public val CCHILDREN_SCROLLBAR: UInt = 5u

public val CCHILDREN_TITLEBAR: UInt = 5u

public val CHILDID_SELF: UInt = 0u

public val CONSOLE_APPLICATION_16BIT: UInt = 0u

public val CONSOLE_CARET_SELECTION: UInt = 1u

public val CONSOLE_CARET_VISIBLE: UInt = 2u

public val CONTACTVISUALIZATION_OFF: UInt = 0u

public val CONTACTVISUALIZATION_ON: UInt = 1u

public val CONTACTVISUALIZATION_PRESENTATIONMODE: UInt = 2u

public val CREATEPROCESS_MANIFEST_RESOURCE_ID: UInt = 1u

public val CSOUND_SYSTEM: UInt = 16u

public val CS_BYTEALIGNCLIENT: WNDCLASS_STYLES = 4096u

public val CS_BYTEALIGNWINDOW: WNDCLASS_STYLES = 8192u

public val CS_CLASSDC: WNDCLASS_STYLES = 64u

public val CS_DBLCLKS: WNDCLASS_STYLES = 8u

public val CS_DROPSHADOW: WNDCLASS_STYLES = 131072u

public val CS_GLOBALCLASS: WNDCLASS_STYLES = 16384u

public val CS_HREDRAW: WNDCLASS_STYLES = 2u

public val CS_IME: WNDCLASS_STYLES = 65536u

public val CS_NOCLOSE: WNDCLASS_STYLES = 512u

public val CS_OWNDC: WNDCLASS_STYLES = 32u

public val CS_PARENTDC: WNDCLASS_STYLES = 128u

public val CS_SAVEBITS: WNDCLASS_STYLES = 2048u

public val CS_VREDRAW: WNDCLASS_STYLES = 1u

public val CTLCOLOR_BTN: UInt = 3u

public val CTLCOLOR_DLG: UInt = 4u

public val CTLCOLOR_EDIT: UInt = 1u

public val CTLCOLOR_LISTBOX: UInt = 2u

public val CTLCOLOR_MAX: UInt = 7u

public val CTLCOLOR_MSGBOX: UInt = 0u

public val CTLCOLOR_SCROLLBAR: UInt = 5u

public val CTLCOLOR_STATIC: UInt = 6u

public val CURSOR_CREATION_SCALING_DEFAULT: UInt = 2u

public val CURSOR_CREATION_SCALING_NONE: UInt = 1u

public val CURSOR_SHOWING: CURSORINFO_FLAGS = 1u

public val CURSOR_SUPPRESSED: CURSORINFO_FLAGS = 2u

public val CWF_CREATE_ONLY: UInt = 1u

public val CWP_ALL: CWP_FLAGS = 0u

public val CWP_SKIPDISABLED: CWP_FLAGS = 2u

public val CWP_SKIPINVISIBLE: CWP_FLAGS = 1u

public val CWP_SKIPTRANSPARENT: CWP_FLAGS = 4u

public val CW_USEDEFAULT: Int = -2147483648

public val DBTF_MEDIA: DEV_BROADCAST_VOLUME_FLAGS = 1u

public val DBTF_NET: DEV_BROADCAST_VOLUME_FLAGS = 2u

public val DBTF_RESOURCE: UInt = 1u

public val DBTF_SLOWNET: UInt = 4u

public val DBTF_XPORT: UInt = 2u

public val DBT_APPYBEGIN: UInt = 0u

public val DBT_APPYEND: UInt = 1u

public val DBT_CONFIGCHANGECANCELED: UInt = 25u

public val DBT_CONFIGCHANGED: UInt = 24u

public val DBT_CONFIGMGAPI32: UInt = 34u

public val DBT_CONFIGMGPRIVATE: UInt = 32767u

public val DBT_CUSTOMEVENT: UInt = 32774u

public val DBT_DEVICEARRIVAL: UInt = 32768u

public val DBT_DEVICEQUERYREMOVE: UInt = 32769u

public val DBT_DEVICEQUERYREMOVEFAILED: UInt = 32770u

public val DBT_DEVICEREMOVECOMPLETE: UInt = 32772u

public val DBT_DEVICEREMOVEPENDING: UInt = 32771u

public val DBT_DEVICETYPESPECIFIC: UInt = 32773u

public val DBT_DEVNODES_CHANGED: UInt = 7u

public val DBT_DEVTYP_DEVICEINTERFACE: DEV_BROADCAST_HDR_DEVICE_TYPE = 5u

public val DBT_DEVTYP_DEVNODE: UInt = 1u

public val DBT_DEVTYP_HANDLE: DEV_BROADCAST_HDR_DEVICE_TYPE = 6u

public val DBT_DEVTYP_NET: UInt = 4u

public val DBT_DEVTYP_OEM: DEV_BROADCAST_HDR_DEVICE_TYPE = 0u

public val DBT_DEVTYP_PORT: DEV_BROADCAST_HDR_DEVICE_TYPE = 3u

public val DBT_DEVTYP_VOLUME: DEV_BROADCAST_HDR_DEVICE_TYPE = 2u

public val DBT_LOW_DISK_SPACE: UInt = 72u

public val DBT_MONITORCHANGE: UInt = 27u

public val DBT_NO_DISK_SPACE: UInt = 71u

public val DBT_QUERYCHANGECONFIG: UInt = 23u

public val DBT_SHELLLOGGEDON: UInt = 32u

public val DBT_USERDEFINED: UInt = 65535u

public val DBT_VOLLOCKLOCKFAILED: UInt = 32835u

public val DBT_VOLLOCKLOCKRELEASED: UInt = 32837u

public val DBT_VOLLOCKLOCKTAKEN: UInt = 32834u

public val DBT_VOLLOCKQUERYLOCK: UInt = 32833u

public val DBT_VOLLOCKQUERYUNLOCK: UInt = 32836u

public val DBT_VOLLOCKUNLOCKFAILED: UInt = 32838u

public val DBT_VPOWERDAPI: UInt = 33024u

public val DBT_VXDINITCOMPLETE: UInt = 35u

public val DCX_EXCLUDEUPDATE: Int = 256

public val DC_HASDEFID: UInt = 21323u

public val DEVICE_NOTIFY_ALL_INTERFACE_CLASSES: REGISTER_NOTIFICATION_FLAGS = 4u

public val DEVICE_NOTIFY_CALLBACK: REGISTER_NOTIFICATION_FLAGS = 2u

public val DEVICE_NOTIFY_SERVICE_HANDLE: REGISTER_NOTIFICATION_FLAGS = 1u

public val DEVICE_NOTIFY_WINDOW_HANDLE: REGISTER_NOTIFICATION_FLAGS = 0u

public val DIFFERENCE: UInt = 11u

public val DI_COMPAT: DI_FLAGS = 4u

public val DI_DEFAULTSIZE: DI_FLAGS = 8u

public val DI_IMAGE: DI_FLAGS = 2u

public val DI_MASK: DI_FLAGS = 1u

public val DI_NOMIRROR: DI_FLAGS = 16u

public val DI_NORMAL: DI_FLAGS = 3u

public val DLGC_BUTTON: UInt = 8192u

public val DLGC_DEFPUSHBUTTON: UInt = 16u

public val DLGC_HASSETSEL: UInt = 8u

public val DLGC_RADIOBUTTON: UInt = 64u

public val DLGC_STATIC: UInt = 256u

public val DLGC_UNDEFPUSHBUTTON: UInt = 32u

public val DLGC_WANTALLKEYS: UInt = 4u

public val DLGC_WANTARROWS: UInt = 1u

public val DLGC_WANTCHARS: UInt = 128u

public val DLGC_WANTMESSAGE: UInt = 4u

public val DLGC_WANTTAB: UInt = 2u

public val DLGWINDOWEXTRA: UInt = 30u

public val DM_GETDEFID: UInt = 1024u

public val DM_POINTERHITTEST: UInt = 592u

public val DM_REPOSITION: UInt = 1026u

public val DM_SETDEFID: UInt = 1025u

public val DOF_DIRECTORY: UInt = 32771u

public val DOF_DOCUMENT: UInt = 32770u

public val DOF_EXECUTABLE: UInt = 32769u

public val DOF_MULTIPLE: UInt = 32772u

public val DOF_PROGMAN: UInt = 1u

public val DOF_SHELLDATA: UInt = 2u

public val DO_DROPFILE: Int = 1162627398

public val DO_PRINTFILE: Int = 1414419024

public val DS_3DLOOK: Int = 4

public val DS_ABSALIGN: Int = 1

public val DS_CENTER: Int = 2048

public val DS_CENTERMOUSE: Int = 4096

public val DS_CONTEXTHELP: Int = 8192

public val DS_CONTROL: Int = 1024

public val DS_FIXEDSYS: Int = 8

public val DS_LOCALEDIT: Int = 32

public val DS_MODALFRAME: Int = 128

public val DS_NOFAILCREATE: Int = 16

public val DS_NOIDLEMSG: Int = 256

public val DS_SETFONT: Int = 64

public val DS_SETFOREGROUND: Int = 512

public val DS_SYSMODAL: Int = 2

public val DS_USEPIXELS: Int = 32768

public val DWLP_MSGRESULT: UInt = 0u

public val DWL_DLGPROC: UInt = 4u

public val DWL_MSGRESULT: UInt = 0u

public val DWL_USER: UInt = 8u

public val EC_LEFTMARGIN: UInt = 1u

public val EC_RIGHTMARGIN: UInt = 2u

public val EC_USEFONTINFO: UInt = 65535u

public val EDD_GET_DEVICE_INTERFACE_NAME: UInt = 1u

public val EDIT_CONTROL_FEATURE_ENTERPRISE_DATA_PROTECTION_PASTE_SUPPORT: EDIT_CONTROL_FEATURE = 0

public val EDIT_CONTROL_FEATURE_PASTE_NOTIFICATIONS: EDIT_CONTROL_FEATURE = 1

public val EIMES_CANCELCOMPSTRINFOCUS: UInt = 2u

public val EIMES_COMPLETECOMPSTRKILLFOCUS: UInt = 4u

public val EIMES_GETCOMPSTRATONCE: UInt = 1u

public val EMSIS_COMPOSITIONSTRING: UInt = 1u

public val ENDSESSION_CLOSEAPP: UInt = 1u

public val ENDSESSION_CRITICAL: UInt = 1073741824u

public val ENDSESSION_LOGOFF: UInt = 2147483648u

public val EN_AFTER_PASTE: UInt = 2049u

public val EN_ALIGN_LTR_EC: UInt = 1792u

public val EN_ALIGN_RTL_EC: UInt = 1793u

public val EN_BEFORE_PASTE: UInt = 2048u

public val EN_CHANGE: UInt = 768u

public val EN_ERRSPACE: UInt = 1280u

public val EN_HSCROLL: UInt = 1537u

public val EN_KILLFOCUS: UInt = 512u

public val EN_MAXTEXT: UInt = 1281u

public val EN_SETFOCUS: UInt = 256u

public val EN_UPDATE: UInt = 1024u

public val EN_VSCROLL: UInt = 1538u

public val ES_AUTOHSCROLL: Int = 128

public val ES_AUTOVSCROLL: Int = 64

public val ES_CENTER: Int = 1

public val ES_LEFT: Int = 0

public val ES_LOWERCASE: Int = 16

public val ES_MULTILINE: Int = 4

public val ES_NOHIDESEL: Int = 256

public val ES_NUMBER: Int = 8192

public val ES_OEMCONVERT: Int = 1024

public val ES_PASSWORD: Int = 32

public val ES_READONLY: Int = 2048

public val ES_RIGHT: Int = 2

public val ES_UPPERCASE: Int = 8

public val ES_WANTRETURN: Int = 4096

public val EVENT_AIA_END: UInt = 45055u

public val EVENT_AIA_START: UInt = 40960u

public val EVENT_CONSOLE_CARET: UInt = 16385u

public val EVENT_CONSOLE_END: UInt = 16639u

public val EVENT_CONSOLE_END_APPLICATION: UInt = 16391u

public val EVENT_CONSOLE_LAYOUT: UInt = 16389u

public val EVENT_CONSOLE_START_APPLICATION: UInt = 16390u

public val EVENT_CONSOLE_UPDATE_REGION: UInt = 16386u

public val EVENT_CONSOLE_UPDATE_SCROLL: UInt = 16388u

public val EVENT_CONSOLE_UPDATE_SIMPLE: UInt = 16387u

public val EVENT_MAX: UInt = 2147483647u

public val EVENT_MIN: UInt = 1u

public val EVENT_OBJECT_ACCELERATORCHANGE: UInt = 32786u

public val EVENT_OBJECT_CLOAKED: UInt = 32791u

public val EVENT_OBJECT_CONTENTSCROLLED: UInt = 32789u

public val EVENT_OBJECT_CREATE: UInt = 32768u

public val EVENT_OBJECT_DEFACTIONCHANGE: UInt = 32785u

public val EVENT_OBJECT_DESCRIPTIONCHANGE: UInt = 32781u

public val EVENT_OBJECT_DESTROY: UInt = 32769u

public val EVENT_OBJECT_DRAGCANCEL: UInt = 32802u

public val EVENT_OBJECT_DRAGCOMPLETE: UInt = 32803u

public val EVENT_OBJECT_DRAGDROPPED: UInt = 32806u

public val EVENT_OBJECT_DRAGENTER: UInt = 32804u

public val EVENT_OBJECT_DRAGLEAVE: UInt = 32805u

public val EVENT_OBJECT_DRAGSTART: UInt = 32801u

public val EVENT_OBJECT_END: UInt = 33023u

public val EVENT_OBJECT_FOCUS: UInt = 32773u

public val EVENT_OBJECT_HELPCHANGE: UInt = 32784u

public val EVENT_OBJECT_HIDE: UInt = 32771u

public val EVENT_OBJECT_HOSTEDOBJECTSINVALIDATED: UInt = 32800u

public val EVENT_OBJECT_IME_CHANGE: UInt = 32809u

public val EVENT_OBJECT_IME_HIDE: UInt = 32808u

public val EVENT_OBJECT_IME_SHOW: UInt = 32807u

public val EVENT_OBJECT_INVOKED: UInt = 32787u

public val EVENT_OBJECT_LIVEREGIONCHANGED: UInt = 32793u

public val EVENT_OBJECT_LOCATIONCHANGE: UInt = 32779u

public val EVENT_OBJECT_NAMECHANGE: UInt = 32780u

public val EVENT_OBJECT_PARENTCHANGE: UInt = 32783u

public val EVENT_OBJECT_REORDER: UInt = 32772u

public val EVENT_OBJECT_SELECTION: UInt = 32774u

public val EVENT_OBJECT_SELECTIONADD: UInt = 32775u

public val EVENT_OBJECT_SELECTIONREMOVE: UInt = 32776u

public val EVENT_OBJECT_SELECTIONWITHIN: UInt = 32777u

public val EVENT_OBJECT_SHOW: UInt = 32770u

public val EVENT_OBJECT_STATECHANGE: UInt = 32778u

public val EVENT_OBJECT_TEXTEDIT_CONVERSIONTARGETCHANGED: UInt = 32816u

public val EVENT_OBJECT_TEXTSELECTIONCHANGED: UInt = 32788u

public val EVENT_OBJECT_UNCLOAKED: UInt = 32792u

public val EVENT_OBJECT_VALUECHANGE: UInt = 32782u

public val EVENT_OEM_DEFINED_END: UInt = 511u

public val EVENT_OEM_DEFINED_START: UInt = 257u

public val EVENT_SYSTEM_ALERT: UInt = 2u

public val EVENT_SYSTEM_ARRANGMENTPREVIEW: UInt = 32790u

public val EVENT_SYSTEM_CAPTUREEND: UInt = 9u

public val EVENT_SYSTEM_CAPTURESTART: UInt = 8u

public val EVENT_SYSTEM_CONTEXTHELPEND: UInt = 13u

public val EVENT_SYSTEM_CONTEXTHELPSTART: UInt = 12u

public val EVENT_SYSTEM_DESKTOPSWITCH: UInt = 32u

public val EVENT_SYSTEM_DIALOGEND: UInt = 17u

public val EVENT_SYSTEM_DIALOGSTART: UInt = 16u

public val EVENT_SYSTEM_DRAGDROPEND: UInt = 15u

public val EVENT_SYSTEM_DRAGDROPSTART: UInt = 14u

public val EVENT_SYSTEM_END: UInt = 255u

public val EVENT_SYSTEM_FOREGROUND: UInt = 3u

public val EVENT_SYSTEM_IME_KEY_NOTIFICATION: UInt = 41u

public val EVENT_SYSTEM_MENUEND: UInt = 5u

public val EVENT_SYSTEM_MENUPOPUPEND: UInt = 7u

public val EVENT_SYSTEM_MENUPOPUPSTART: UInt = 6u

public val EVENT_SYSTEM_MENUSTART: UInt = 4u

public val EVENT_SYSTEM_MINIMIZEEND: UInt = 23u

public val EVENT_SYSTEM_MINIMIZESTART: UInt = 22u

public val EVENT_SYSTEM_MOVESIZEEND: UInt = 11u

public val EVENT_SYSTEM_MOVESIZESTART: UInt = 10u

public val EVENT_SYSTEM_SCROLLINGEND: UInt = 19u

public val EVENT_SYSTEM_SCROLLINGSTART: UInt = 18u

public val EVENT_SYSTEM_SOUND: UInt = 1u

public val EVENT_SYSTEM_SWITCHEND: UInt = 21u

public val EVENT_SYSTEM_SWITCHER_APPDROPPED: UInt = 38u

public val EVENT_SYSTEM_SWITCHER_APPGRABBED: UInt = 36u

public val EVENT_SYSTEM_SWITCHER_APPOVERTARGET: UInt = 37u

public val EVENT_SYSTEM_SWITCHER_CANCELLED: UInt = 39u

public val EVENT_SYSTEM_SWITCHSTART: UInt = 20u

public val EVENT_UIA_EVENTID_END: UInt = 20223u

public val EVENT_UIA_EVENTID_START: UInt = 19968u

public val EVENT_UIA_PROPID_END: UInt = 30207u

public val EVENT_UIA_PROPID_START: UInt = 29952u

public val FALT: ACCEL_VIRT_FLAGS = 16u

public val FAPPCOMMAND_KEY: UInt = 0u

public val FAPPCOMMAND_MASK: UInt = 61440u

public val FAPPCOMMAND_MOUSE: UInt = 32768u

public val FAPPCOMMAND_OEM: UInt = 4096u

public val FCONTROL: ACCEL_VIRT_FLAGS = 8u

public val FE_FONTSMOOTHINGCLEARTYPE: UInt = 2u

public val FE_FONTSMOOTHINGORIENTATIONBGR: UInt = 0u

public val FE_FONTSMOOTHINGORIENTATIONRGB: UInt = 1u

public val FE_FONTSMOOTHINGSTANDARD: UInt = 1u

public val FKF_AVAILABLE: UInt = 2u

public val FKF_CLICKON: UInt = 64u

public val FKF_CONFIRMHOTKEY: UInt = 8u

public val FKF_FILTERKEYSON: UInt = 1u

public val FKF_HOTKEYACTIVE: UInt = 4u

public val FKF_HOTKEYSOUND: UInt = 16u

public val FKF_INDICATOR: UInt = 32u

public val FLASHW_ALL: FLASHWINFO_FLAGS = 3u

public val FLASHW_CAPTION: FLASHWINFO_FLAGS = 1u

public val FLASHW_STOP: FLASHWINFO_FLAGS = 0u

public val FLASHW_TIMER: FLASHWINFO_FLAGS = 4u

public val FLASHW_TIMERNOFG: FLASHWINFO_FLAGS = 12u

public val FLASHW_TRAY: FLASHWINFO_FLAGS = 2u

public val FNOINVERT: ACCEL_VIRT_FLAGS = 2u

public val FSHIFT: ACCEL_VIRT_FLAGS = 4u

public val FVIRTKEY: ACCEL_VIRT_FLAGS = 1u

public val GA_PARENT: GET_ANCESTOR_FLAGS = 1u

public val GA_ROOT: GET_ANCESTOR_FLAGS = 2u

public val GA_ROOTOWNER: GET_ANCESTOR_FLAGS = 3u

public val GCF_INCLUDE_ANCESTORS: UInt = 1u

public val GCLP_HBRBACKGROUND: GET_CLASS_LONG_INDEX = -10

public val GCLP_HCURSOR: GET_CLASS_LONG_INDEX = -12

public val GCLP_HICON: GET_CLASS_LONG_INDEX = -14

public val GCLP_HICONSM: GET_CLASS_LONG_INDEX = -34

public val GCLP_HMODULE: GET_CLASS_LONG_INDEX = -16

public val GCLP_MENUNAME: GET_CLASS_LONG_INDEX = -8

public val GCLP_WNDPROC: GET_CLASS_LONG_INDEX = -24

public val GCL_CBCLSEXTRA: GET_CLASS_LONG_INDEX = -20

public val GCL_CBWNDEXTRA: GET_CLASS_LONG_INDEX = -18

public val GCL_HBRBACKGROUND: GET_CLASS_LONG_INDEX = -10

public val GCL_HCURSOR: GET_CLASS_LONG_INDEX = -12

public val GCL_HICON: GET_CLASS_LONG_INDEX = -14

public val GCL_HICONSM: GET_CLASS_LONG_INDEX = -34

public val GCL_HMODULE: GET_CLASS_LONG_INDEX = -16

public val GCL_MENUNAME: GET_CLASS_LONG_INDEX = -8

public val GCL_STYLE: GET_CLASS_LONG_INDEX = -26

public val GCL_WNDPROC: GET_CLASS_LONG_INDEX = -24

public val GCW_ATOM: GET_CLASS_LONG_INDEX = -32

public val GESTURECONFIGMAXCOUNT: UInt = 256u

public val GESTUREVISUALIZATION_DOUBLETAP: UInt = 2u

public val GESTUREVISUALIZATION_OFF: UInt = 0u

public val GESTUREVISUALIZATION_ON: UInt = 31u

public val GESTUREVISUALIZATION_PRESSANDHOLD: UInt = 8u

public val GESTUREVISUALIZATION_PRESSANDTAP: UInt = 4u

public val GESTUREVISUALIZATION_RIGHTTAP: UInt = 16u

public val GESTUREVISUALIZATION_TAP: UInt = 1u

public val GF_BEGIN: UInt = 1u

public val GF_END: UInt = 4u

public val GF_INERTIA: UInt = 2u

public val GIDC_ARRIVAL: UInt = 1u

public val GIDC_REMOVAL: UInt = 2u

public val GMDI_GOINTOPOPUPS: GET_MENU_DEFAULT_ITEM_FLAGS = 2u

public val GMDI_USEDISABLED: GET_MENU_DEFAULT_ITEM_FLAGS = 1u

public val GUID_DEVICE_EVENT_RBC: GUID = GUID.from_u128(U128(0xd0744792a98e11d2uL, 0x917a00a0c9068ff3uL))

public val GUID_IO_CDROM_EXCLUSIVE_LOCK: GUID = GUID.from_u128(U128(0xbc56c1397a1047eeuL, 0xa2944c6a38f0149auL))

public val GUID_IO_CDROM_EXCLUSIVE_UNLOCK: GUID = GUID.from_u128(U128(0xa3b6d27d5e354885uL, 0x81e5ee18c00ed779uL))

public val GUID_IO_DEVICE_BECOMING_READY: GUID = GUID.from_u128(U128(0xd07433f0a98e11d2uL, 0x917a00a0c9068ff3uL))

public val GUID_IO_DEVICE_EXTERNAL_REQUEST: GUID = GUID.from_u128(U128(0xd07433d0a98e11d2uL, 0x917a00a0c9068ff3uL))

public val GUID_IO_DISK_CLONE_ARRIVAL: GUID = GUID.from_u128(U128(0x6a61885b7c3943dduL, 0x9b56b8ac22a549aauL))

public val GUID_IO_DISK_HEALTH_NOTIFICATION: GUID = GUID.from_u128(U128(0xf1bd644391649c5uL, 0xb063991940118fb2uL))

public val GUID_IO_DISK_LAYOUT_CHANGE: GUID = GUID.from_u128(U128(0x11dff54c846941f9uL, 0xb3deef836487c54auL))

public val GUID_IO_DRIVE_REQUIRES_CLEANING: GUID = GUID.from_u128(U128(0x7207877c90ed44e5uL, 0xa00081428d4c79bbuL))

public val GUID_IO_MEDIA_ARRIVAL: GUID = GUID.from_u128(U128(0xd07433c0a98e11d2uL, 0x917a00a0c9068ff3uL))

public val GUID_IO_MEDIA_EJECT_REQUEST: GUID = GUID.from_u128(U128(0xd07433d1a98e11d2uL, 0x917a00a0c9068ff3uL))

public val GUID_IO_MEDIA_REMOVAL: GUID = GUID.from_u128(U128(0xd07433c1a98e11d2uL, 0x917a00a0c9068ff3uL))

public val GUID_IO_TAPE_ERASE: GUID = GUID.from_u128(U128(0x852d11eb4bb84507uL, 0x9d9b417cc2b1b438uL))

public val GUID_IO_VOLUME_BACKGROUND_FORMAT: GUID = GUID.from_u128(U128(0xa2e5fc86d5cd4038uL, 0xb2e34445065c2377uL))

public val GUID_IO_VOLUME_CHANGE: GUID = GUID.from_u128(U128(0x7373654a812a11d0uL, 0xbec708002be2092fuL))

public val GUID_IO_VOLUME_CHANGE_SIZE: GUID = GUID.from_u128(U128(0x3a1625bead0349f1uL, 0x8ef86bbac182d1fduL))

public val GUID_IO_VOLUME_DEVICE_INTERFACE: GUID = GUID.from_u128(U128(0x53f5630db6bf11d0uL, 0x94f200a0c91efb8buL))

public val GUID_IO_VOLUME_DISMOUNT: GUID = GUID.from_u128(U128(0xd16a55e8105911d2uL, 0x8ffd00a0c9a06d32uL))

public val GUID_IO_VOLUME_DISMOUNT_FAILED: GUID = GUID.from_u128(U128(0xe3c5b178105d11d2uL, 0x8ffd00a0c9a06d32uL))

public val GUID_IO_VOLUME_FORCE_CLOSED: GUID = GUID.from_u128(U128(0x411ad84f433e4dc2uL, 0xa5ae4a2d1a2de654uL))

public val GUID_IO_VOLUME_FVE_STATUS_CHANGE: GUID = GUID.from_u128(U128(0x62998b2ee1f4b6auL, 0xb857e76cbbe9a6dauL))

public val GUID_IO_VOLUME_INFO_MAKE_COMPAT: GUID = GUID.from_u128(U128(0x3ab9a0d2ef8045cfuL, 0x8cdccbe02a212906uL))

public val GUID_IO_VOLUME_LOCK: GUID = GUID.from_u128(U128(0x50708874c9af11d1uL, 0x8fef00a0c9a06d32uL))

public val GUID_IO_VOLUME_LOCK_FAILED: GUID = GUID.from_u128(U128(0xae2eed100ba811d2uL, 0x8ffb00a0c9a06d32uL))

public val GUID_IO_VOLUME_MOUNT: GUID = GUID.from_u128(U128(0xb58048781a9611d2uL, 0x8ffd00a0c9a06d32uL))

public val GUID_IO_VOLUME_NAME_CHANGE: GUID = GUID.from_u128(U128(0x2de97f834c0611d2uL, 0xa53200609713055auL))

public val GUID_IO_VOLUME_NEED_CHKDSK: GUID = GUID.from_u128(U128(0x799a09600a0b4e03uL, 0xad882fa7c6ce748auL))

public val GUID_IO_VOLUME_PHYSICAL_CONFIGURATION_CHANGE: GUID = GUID.from_u128(U128(0x2de97f844c0611d2uL, 0xa53200609713055auL))

public val GUID_IO_VOLUME_PREPARING_EJECT: GUID = GUID.from_u128(U128(0xc79eb16e0dac4e7auL, 0xa86cb25ceeaa88f6uL))

public val GUID_IO_VOLUME_UNIQUE_ID_CHANGE: GUID = GUID.from_u128(U128(0xaf39da42662241f5uL, 0x970b139d092fa3d9uL))

public val GUID_IO_VOLUME_UNLOCK: GUID = GUID.from_u128(U128(0x9a8c3d68d0cb11d1uL, 0x8fef00a0c9a06d32uL))

public val GUID_IO_VOLUME_WEARING_OUT: GUID = GUID.from_u128(U128(0x873113ca14864508uL, 0x82acc3b2e5297aaauL))

public val GUID_IO_VOLUME_WORM_NEAR_FULL: GUID = GUID.from_u128(U128(0xf3bfff82f3de48d2uL, 0xaf95457f80b763f2uL))

public val GUI_16BITTASK: UInt = 0u

public val GUI_CARETBLINKING: GUITHREADINFO_FLAGS = 1u

public val GUI_INMENUMODE: GUITHREADINFO_FLAGS = 4u

public val GUI_INMOVESIZE: GUITHREADINFO_FLAGS = 2u

public val GUI_POPUPMENUMODE: GUITHREADINFO_FLAGS = 16u

public val GUI_SYSTEMMENUMODE: GUITHREADINFO_FLAGS = 8u

public val GWFS_INCLUDE_ANCESTORS: UInt = 1u

public val GWLP_HINSTANCE: WINDOW_LONG_PTR_INDEX = -6

public val GWLP_HWNDPARENT: WINDOW_LONG_PTR_INDEX = -8

public val GWLP_ID: WINDOW_LONG_PTR_INDEX = -12

public val GWLP_USERDATA: WINDOW_LONG_PTR_INDEX = -21

public val GWLP_WNDPROC: WINDOW_LONG_PTR_INDEX = -4

public val GWL_EXSTYLE: WINDOW_LONG_PTR_INDEX = -20

public val GWL_HINSTANCE: WINDOW_LONG_PTR_INDEX = -6

public val GWL_HWNDPARENT: WINDOW_LONG_PTR_INDEX = -8

public val GWL_ID: WINDOW_LONG_PTR_INDEX = -12

public val GWL_STYLE: WINDOW_LONG_PTR_INDEX = -16

public val GWL_USERDATA: WINDOW_LONG_PTR_INDEX = -21

public val GWL_WNDPROC: WINDOW_LONG_PTR_INDEX = -4

public val GW_CHILD: GET_WINDOW_CMD = 5u

public val GW_ENABLEDPOPUP: GET_WINDOW_CMD = 6u

public val GW_HWNDFIRST: GET_WINDOW_CMD = 0u

public val GW_HWNDLAST: GET_WINDOW_CMD = 1u

public val GW_HWNDNEXT: GET_WINDOW_CMD = 2u

public val GW_HWNDPREV: GET_WINDOW_CMD = 3u

public val GW_MAX: UInt = 5u

public val GW_OWNER: GET_WINDOW_CMD = 4u

public val HANDEDNESS_LEFT: HANDEDNESS = 0

public val HANDEDNESS_RIGHT: HANDEDNESS = 1

public val HBMMENU_CALLBACK: HBITMAP = (-1).toLong()

public val HBMMENU_MBAR_CLOSE: HBITMAP = 5.toLong()

public val HBMMENU_MBAR_CLOSE_D: HBITMAP = 6.toLong()

public val HBMMENU_MBAR_MINIMIZE: HBITMAP = 3.toLong()

public val HBMMENU_MBAR_MINIMIZE_D: HBITMAP = 7.toLong()

public val HBMMENU_MBAR_RESTORE: HBITMAP = 2.toLong()

public val HBMMENU_POPUP_CLOSE: HBITMAP = 8.toLong()

public val HBMMENU_POPUP_MAXIMIZE: HBITMAP = 10.toLong()

public val HBMMENU_POPUP_MINIMIZE: HBITMAP = 11.toLong()

public val HBMMENU_POPUP_RESTORE: HBITMAP = 9.toLong()

public val HBMMENU_SYSTEM: HBITMAP = 1.toLong()

public val HCBT_ACTIVATE: UInt = 5u

public val HCBT_CLICKSKIPPED: UInt = 6u

public val HCBT_CREATEWND: UInt = 3u

public val HCBT_DESTROYWND: UInt = 4u

public val HCBT_KEYSKIPPED: UInt = 7u

public val HCBT_MINMAX: UInt = 1u

public val HCBT_MOVESIZE: UInt = 0u

public val HCBT_QS: UInt = 2u

public val HCBT_SETFOCUS: UInt = 9u

public val HCBT_SYSCOMMAND: UInt = 8u

public val HCF_DEFAULTDESKTOP: UInt = 512u

public val HCF_LOGONDESKTOP: UInt = 256u

public val HC_ACTION: UInt = 0u

public val HC_GETNEXT: UInt = 1u

public val HC_NOREM: UInt = 3u

public val HC_NOREMOVE: UInt = 3u

public val HC_SKIP: UInt = 2u

public val HC_SYSMODALOFF: UInt = 5u

public val HC_SYSMODALON: UInt = 4u

public val HELP_COMMAND: Int = 258

public val HELP_CONTENTS: Int = 3

public val HELP_CONTEXT: Int = 1

public val HELP_CONTEXTMENU: UInt = 10u

public val HELP_CONTEXTPOPUP: Int = 8

public val HELP_FINDER: UInt = 11u

public val HELP_FORCEFILE: Int = 9

public val HELP_HELPONHELP: Int = 4

public val HELP_INDEX: Int = 3

public val HELP_KEY: Int = 257

public val HELP_MULTIKEY: Int = 513

public val HELP_PARTIALKEY: Int = 261

public val HELP_QUIT: Int = 2

public val HELP_SETCONTENTS: Int = 5

public val HELP_SETINDEX: Int = 5

public val HELP_SETPOPUP_POS: UInt = 13u

public val HELP_SETWINPOS: Int = 515

public val HELP_TCARD: UInt = 32768u

public val HELP_TCARD_DATA: UInt = 16u

public val HELP_TCARD_OTHER_CALLER: UInt = 17u

public val HELP_WM_HELP: UInt = 12u

public val HIDE_WINDOW: UInt = 0u

public val HKL_NEXT: UInt = 1u

public val HKL_PREV: UInt = 0u

public val HSHELL_ACCESSIBILITYSTATE: UInt = 11u

public val HSHELL_ACTIVATESHELLWINDOW: UInt = 3u

public val HSHELL_APPCOMMAND: UInt = 12u

public val HSHELL_ENDTASK: UInt = 10u

public val HSHELL_GETMINRECT: UInt = 5u

public val HSHELL_HIGHBIT: UInt = 32768u

public val HSHELL_LANGUAGE: UInt = 8u

public val HSHELL_MONITORCHANGED: UInt = 16u

public val HSHELL_REDRAW: UInt = 6u

public val HSHELL_SYSMENU: UInt = 9u

public val HSHELL_TASKMAN: UInt = 7u

public val HSHELL_WINDOWACTIVATED: UInt = 4u

public val HSHELL_WINDOWCREATED: UInt = 1u

public val HSHELL_WINDOWDESTROYED: UInt = 2u

public val HSHELL_WINDOWREPLACED: UInt = 13u

public val HSHELL_WINDOWREPLACING: UInt = 14u

public val HTBORDER: UInt = 18u

public val HTBOTTOM: UInt = 15u

public val HTBOTTOMLEFT: UInt = 16u

public val HTBOTTOMRIGHT: UInt = 17u

public val HTCAPTION: UInt = 2u

public val HTCLIENT: UInt = 1u

public val HTCLOSE: UInt = 20u

public val HTERROR: Int = -2

public val HTGROWBOX: UInt = 4u

public val HTHELP: UInt = 21u

public val HTHSCROLL: UInt = 6u

public val HTLEFT: UInt = 10u

public val HTMAXBUTTON: UInt = 9u

public val HTMENU: UInt = 5u

public val HTMINBUTTON: UInt = 8u

public val HTNOWHERE: UInt = 0u

public val HTOBJECT: UInt = 19u

public val HTREDUCE: UInt = 8u

public val HTRIGHT: UInt = 11u

public val HTSIZE: UInt = 4u

public val HTSIZEFIRST: UInt = 10u

public val HTSIZELAST: UInt = 17u

public val HTSYSMENU: UInt = 3u

public val HTTOP: UInt = 12u

public val HTTOPLEFT: UInt = 13u

public val HTTOPRIGHT: UInt = 14u

public val HTTRANSPARENT: Int = -1

public val HTVSCROLL: UInt = 7u

public val HTZOOM: UInt = 9u

public val HWND_BOTTOM: HWND = 1.toLong()

public val HWND_BROADCAST: HWND = 65535.toLong()

public val HWND_DESKTOP: HWND = 0.toLong()

public val HWND_MESSAGE: HWND = (-3).toLong()

public val HWND_NOTOPMOST: HWND = (-2).toLong()

public val HWND_TOP: HWND = 0.toLong()

public val HWND_TOPMOST: HWND = (-1).toLong()

public val ICON_BIG: UInt = 1u

public val ICON_SMALL: UInt = 0u

public val ICON_SMALL2: UInt = 2u

public val IDABORT: MESSAGEBOX_RESULT = 3

public val IDANI_CAPTION: UInt = 3u

public val IDANI_OPEN: UInt = 1u

public val IDASYNC: MESSAGEBOX_RESULT = 32001

public val IDCANCEL: MESSAGEBOX_RESULT = 2

public val IDCLOSE: MESSAGEBOX_RESULT = 8

public val IDCONTINUE: MESSAGEBOX_RESULT = 11

public val IDC_APPSTARTING: PCWSTR = 32650u.toLong()

public val IDC_ARROW: PCWSTR = 32512u.toLong()

public val IDC_CROSS: PCWSTR = 32515u.toLong()

public val IDC_HAND: PCWSTR = 32649u.toLong()

public val IDC_HELP: PCWSTR = 32651u.toLong()

public val IDC_IBEAM: PCWSTR = 32513u.toLong()

public val IDC_ICON: PCWSTR = 32641u.toLong()

public val IDC_NO: PCWSTR = 32648u.toLong()

public val IDC_PERSON: PCWSTR = 32672u.toLong()

public val IDC_PIN: PCWSTR = 32671u.toLong()

public val IDC_SIZE: PCWSTR = 32640u.toLong()

public val IDC_SIZEALL: PCWSTR = 32646u.toLong()

public val IDC_SIZENESW: PCWSTR = 32643u.toLong()

public val IDC_SIZENS: PCWSTR = 32645u.toLong()

public val IDC_SIZENWSE: PCWSTR = 32642u.toLong()

public val IDC_SIZEWE: PCWSTR = 32644u.toLong()

public val IDC_STATIC: Int = -1

public val IDC_UPARROW: PCWSTR = 32516u.toLong()

public val IDC_WAIT: PCWSTR = 32514u.toLong()

public val IDHELP: MESSAGEBOX_RESULT = 9

public val IDHOT_SNAPDESKTOP: Int = -2

public val IDHOT_SNAPWINDOW: Int = -1

public val IDH_CANCEL: UInt = 28444u

public val IDH_GENERIC_HELP_BUTTON: UInt = 28442u

public val IDH_HELP: UInt = 28445u

public val IDH_MISSING_CONTEXT: UInt = 28441u

public val IDH_NO_HELP: UInt = 28440u

public val IDH_OK: UInt = 28443u

public val IDIGNORE: MESSAGEBOX_RESULT = 5

public val IDI_APPLICATION: PCWSTR = 32512u.toLong()

public val IDI_ASTERISK: PCWSTR = 32516u.toLong()

public val IDI_ERROR: PCWSTR = 32513u.toLong()

public val IDI_EXCLAMATION: PCWSTR = 32515u.toLong()

public val IDI_HAND: PCWSTR = 32513u.toLong()

public val IDI_INFORMATION: PCWSTR = 32516u.toLong()

public val IDI_QUESTION: PCWSTR = 32514u.toLong()

public val IDI_SHIELD: PCWSTR = 32518u.toLong()

public val IDI_WARNING: PCWSTR = 32515u.toLong()

public val IDI_WINLOGO: PCWSTR = 32517u.toLong()

public val IDNO: MESSAGEBOX_RESULT = 7

public val IDOK: MESSAGEBOX_RESULT = 1

public val IDRETRY: MESSAGEBOX_RESULT = 4

public val IDTIMEOUT: MESSAGEBOX_RESULT = 32000

public val IDTRYAGAIN: MESSAGEBOX_RESULT = 10

public val IDYES: MESSAGEBOX_RESULT = 6

public val IMAGE_BITMAP: GDI_IMAGE_TYPE = 0u

public val IMAGE_CURSOR: GDI_IMAGE_TYPE = 2u

public val IMAGE_ENHMETAFILE: UInt = 3u

public val IMAGE_ICON: GDI_IMAGE_TYPE = 1u

public val INDEXID_CONTAINER: UInt = 0u

public val INDEXID_OBJECT: UInt = 0u

public val INPUTLANGCHANGE_BACKWARD: UInt = 4u

public val INPUTLANGCHANGE_FORWARD: UInt = 2u

public val INPUTLANGCHANGE_SYSCHARSET: UInt = 1u

public val ISMEX_CALLBACK: UInt = 4u

public val ISMEX_NOSEND: UInt = 0u

public val ISMEX_NOTIFY: UInt = 2u

public val ISMEX_REPLIED: UInt = 8u

public val ISMEX_SEND: UInt = 1u

public val ISOLATIONAWARE_MANIFEST_RESOURCE_ID: UInt = 2u

public val ISOLATIONAWARE_NOSTATICIMPORT_MANIFEST_RESOURCE_ID: UInt = 3u

public val ISOLATIONPOLICY_BROWSER_MANIFEST_RESOURCE_ID: UInt = 5u

public val ISOLATIONPOLICY_MANIFEST_RESOURCE_ID: UInt = 4u

public val KF_ALTDOWN: UInt = 8192u

public val KF_DLGMODE: UInt = 2048u

public val KF_EXTENDED: UInt = 256u

public val KF_MENUMODE: UInt = 4096u

public val KF_REPEAT: UInt = 16384u

public val KF_UP: UInt = 32768u

public val KL_NAMELENGTH: UInt = 9u

public val LBN_DBLCLK: UInt = 2u

public val LBN_ERRSPACE: Int = -2

public val LBN_KILLFOCUS: UInt = 5u

public val LBN_SELCANCEL: UInt = 3u

public val LBN_SELCHANGE: UInt = 1u

public val LBN_SETFOCUS: UInt = 4u

public val LBS_COMBOBOX: Int = 32768

public val LBS_DISABLENOSCROLL: Int = 4096

public val LBS_EXTENDEDSEL: Int = 2048

public val LBS_HASSTRINGS: Int = 64

public val LBS_MULTICOLUMN: Int = 512

public val LBS_MULTIPLESEL: Int = 8

public val LBS_NODATA: Int = 8192

public val LBS_NOINTEGRALHEIGHT: Int = 256

public val LBS_NOREDRAW: Int = 4

public val LBS_NOSEL: Int = 16384

public val LBS_NOTIFY: Int = 1

public val LBS_OWNERDRAWFIXED: Int = 16

public val LBS_OWNERDRAWVARIABLE: Int = 32

public val LBS_SORT: Int = 2

public val LBS_STANDARD: Int = 10485763

public val LBS_USETABSTOPS: Int = 128

public val LBS_WANTKEYBOARDINPUT: Int = 1024

public val LB_ADDFILE: UInt = 406u

public val LB_ADDSTRING: UInt = 384u

public val LB_CTLCODE: Int = 0

public val LB_DELETESTRING: UInt = 386u

public val LB_DIR: UInt = 397u

public val LB_ERR: Int = -1

public val LB_ERRSPACE: Int = -2

public val LB_FINDSTRING: UInt = 399u

public val LB_FINDSTRINGEXACT: UInt = 418u

public val LB_GETANCHORINDEX: UInt = 413u

public val LB_GETCARETINDEX: UInt = 415u

public val LB_GETCOUNT: UInt = 395u

public val LB_GETCURSEL: UInt = 392u

public val LB_GETHORIZONTALEXTENT: UInt = 403u

public val LB_GETITEMDATA: UInt = 409u

public val LB_GETITEMHEIGHT: UInt = 417u

public val LB_GETITEMRECT: UInt = 408u

public val LB_GETLISTBOXINFO: UInt = 434u

public val LB_GETLOCALE: UInt = 422u

public val LB_GETSEL: UInt = 391u

public val LB_GETSELCOUNT: UInt = 400u

public val LB_GETSELITEMS: UInt = 401u

public val LB_GETTEXT: UInt = 393u

public val LB_GETTEXTLEN: UInt = 394u

public val LB_GETTOPINDEX: UInt = 398u

public val LB_INITSTORAGE: UInt = 424u

public val LB_INSERTSTRING: UInt = 385u

public val LB_ITEMFROMPOINT: UInt = 425u

public val LB_MSGMAX: UInt = 435u

public val LB_MULTIPLEADDSTRING: UInt = 433u

public val LB_OKAY: UInt = 0u

public val LB_RESETCONTENT: UInt = 388u

public val LB_SELECTSTRING: UInt = 396u

public val LB_SELITEMRANGE: UInt = 411u

public val LB_SELITEMRANGEEX: UInt = 387u

public val LB_SETANCHORINDEX: UInt = 412u

public val LB_SETCARETINDEX: UInt = 414u

public val LB_SETCOLUMNWIDTH: UInt = 405u

public val LB_SETCOUNT: UInt = 423u

public val LB_SETCURSEL: UInt = 390u

public val LB_SETHORIZONTALEXTENT: UInt = 404u

public val LB_SETITEMDATA: UInt = 410u

public val LB_SETITEMHEIGHT: UInt = 416u

public val LB_SETLOCALE: UInt = 421u

public val LB_SETSEL: UInt = 389u

public val LB_SETTABSTOPS: UInt = 402u

public val LB_SETTOPINDEX: UInt = 407u

public val LLKHF_ALTDOWN: KBDLLHOOKSTRUCT_FLAGS = 32u

public val LLKHF_EXTENDED: KBDLLHOOKSTRUCT_FLAGS = 1u

public val LLKHF_INJECTED: KBDLLHOOKSTRUCT_FLAGS = 16u

public val LLKHF_LOWER_IL_INJECTED: KBDLLHOOKSTRUCT_FLAGS = 2u

public val LLKHF_UP: KBDLLHOOKSTRUCT_FLAGS = 128u

public val LLMHF_INJECTED: UInt = 1u

public val LLMHF_LOWER_IL_INJECTED: UInt = 2u

public val LOCKF_LOGICAL_LOCK: UInt = 0u

public val LOCKF_PHYSICAL_LOCK: UInt = 1u

public val LOCKP_ALLOW_MEM_MAPPING: UInt = 0u

public val LOCKP_ALLOW_WRITES: UInt = 1u

public val LOCKP_FAIL_MEM_MAPPING: UInt = 2u

public val LOCKP_FAIL_WRITES: UInt = 0u

public val LOCKP_LOCK_FOR_FORMAT: UInt = 4u

public val LOCKP_USER_MASK: UInt = 3u

public val LR_COLOR: UInt = 2u

public val LR_COPYDELETEORG: IMAGE_FLAGS = 8u

public val LR_COPYFROMRESOURCE: IMAGE_FLAGS = 16384u

public val LR_COPYRETURNORG: IMAGE_FLAGS = 4u

public val LR_CREATEDIBSECTION: IMAGE_FLAGS = 8192u

public val LR_DEFAULTCOLOR: IMAGE_FLAGS = 0u

public val LR_DEFAULTSIZE: IMAGE_FLAGS = 64u

public val LR_LOADFROMFILE: IMAGE_FLAGS = 16u

public val LR_LOADMAP3DCOLORS: IMAGE_FLAGS = 4096u

public val LR_LOADTRANSPARENT: IMAGE_FLAGS = 32u

public val LR_MONOCHROME: IMAGE_FLAGS = 1u

public val LR_SHARED: IMAGE_FLAGS = 32768u

public val LR_VGACOLOR: IMAGE_FLAGS = 128u

public val LSFW_LOCK: FOREGROUND_WINDOW_LOCK_CODE = 1u

public val LSFW_UNLOCK: FOREGROUND_WINDOW_LOCK_CODE = 2u

public val LWA_ALPHA: LAYERED_WINDOW_ATTRIBUTES_FLAGS = 2u

public val LWA_COLORKEY: LAYERED_WINDOW_ATTRIBUTES_FLAGS = 1u

public val MAXIMUM_RESERVED_MANIFEST_RESOURCE_ID: UInt = 16u

public val MAX_LOGICALDPIOVERRIDE: UInt = 2u

public val MAX_STR_BLOCKREASON: UInt = 256u

public val MAX_TOUCH_COUNT: UInt = 256u

public val MAX_TOUCH_PREDICTION_FILTER_TAPS: UInt = 3u

public val MA_ACTIVATE: UInt = 1u

public val MA_ACTIVATEANDEAT: UInt = 2u

public val MA_NOACTIVATE: UInt = 3u

public val MA_NOACTIVATEANDEAT: UInt = 4u

public val MB_ABORTRETRYIGNORE: MESSAGEBOX_STYLE = 2u

public val MB_APPLMODAL: MESSAGEBOX_STYLE = 0u

public val MB_CANCELTRYCONTINUE: MESSAGEBOX_STYLE = 6u

public val MB_DEFAULT_DESKTOP_ONLY: MESSAGEBOX_STYLE = 131072u

public val MB_DEFBUTTON1: MESSAGEBOX_STYLE = 0u

public val MB_DEFBUTTON2: MESSAGEBOX_STYLE = 256u

public val MB_DEFBUTTON3: MESSAGEBOX_STYLE = 512u

public val MB_DEFBUTTON4: MESSAGEBOX_STYLE = 768u

public val MB_DEFMASK: MESSAGEBOX_STYLE = 3840u

public val MB_HELP: MESSAGEBOX_STYLE = 16384u

public val MB_ICONASTERISK: MESSAGEBOX_STYLE = 64u

public val MB_ICONERROR: MESSAGEBOX_STYLE = 16u

public val MB_ICONEXCLAMATION: MESSAGEBOX_STYLE = 48u

public val MB_ICONHAND: MESSAGEBOX_STYLE = 16u

public val MB_ICONINFORMATION: MESSAGEBOX_STYLE = 64u

public val MB_ICONMASK: MESSAGEBOX_STYLE = 240u

public val MB_ICONQUESTION: MESSAGEBOX_STYLE = 32u

public val MB_ICONSTOP: MESSAGEBOX_STYLE = 16u

public val MB_ICONWARNING: MESSAGEBOX_STYLE = 48u

public val MB_MISCMASK: MESSAGEBOX_STYLE = 49152u

public val MB_MODEMASK: MESSAGEBOX_STYLE = 12288u

public val MB_NOFOCUS: MESSAGEBOX_STYLE = 32768u

public val MB_OK: MESSAGEBOX_STYLE = 0u

public val MB_OKCANCEL: MESSAGEBOX_STYLE = 1u

public val MB_RETRYCANCEL: MESSAGEBOX_STYLE = 5u

public val MB_RIGHT: MESSAGEBOX_STYLE = 524288u

public val MB_RTLREADING: MESSAGEBOX_STYLE = 1048576u

public val MB_SERVICE_NOTIFICATION: MESSAGEBOX_STYLE = 2097152u

public val MB_SERVICE_NOTIFICATION_NT3X: MESSAGEBOX_STYLE = 262144u

public val MB_SETFOREGROUND: MESSAGEBOX_STYLE = 65536u

public val MB_SYSTEMMODAL: MESSAGEBOX_STYLE = 4096u

public val MB_TASKMODAL: MESSAGEBOX_STYLE = 8192u

public val MB_TOPMOST: MESSAGEBOX_STYLE = 262144u

public val MB_TYPEMASK: MESSAGEBOX_STYLE = 15u

public val MB_USERICON: MESSAGEBOX_STYLE = 128u

public val MB_YESNO: MESSAGEBOX_STYLE = 4u

public val MB_YESNOCANCEL: MESSAGEBOX_STYLE = 3u

public val MDIS_ALLCHILDSTYLES: UInt = 1u

public val MDITILE_HORIZONTAL: TILE_WINDOWS_HOW = 1u

public val MDITILE_SKIPDISABLED: CASCADE_WINDOWS_HOW = 2u

public val MDITILE_VERTICAL: TILE_WINDOWS_HOW = 0u

public val MDITILE_ZORDER: CASCADE_WINDOWS_HOW = 4u

public val METRICS_USEDEFAULT: Int = -1

public val MFS_CHECKED: MENU_ITEM_STATE = 8u

public val MFS_DEFAULT: MENU_ITEM_STATE = 4096u

public val MFS_DISABLED: MENU_ITEM_STATE = 3u

public val MFS_ENABLED: MENU_ITEM_STATE = 0u

public val MFS_GRAYED: MENU_ITEM_STATE = 3u

public val MFS_HILITE: MENU_ITEM_STATE = 128u

public val MFS_UNCHECKED: MENU_ITEM_STATE = 0u

public val MFS_UNHILITE: MENU_ITEM_STATE = 0u

public val MFT_BITMAP: MENU_ITEM_TYPE = 4u

public val MFT_MENUBARBREAK: MENU_ITEM_TYPE = 32u

public val MFT_MENUBREAK: MENU_ITEM_TYPE = 64u

public val MFT_OWNERDRAW: MENU_ITEM_TYPE = 256u

public val MFT_RADIOCHECK: MENU_ITEM_TYPE = 512u

public val MFT_RIGHTJUSTIFY: MENU_ITEM_TYPE = 16384u

public val MFT_RIGHTORDER: MENU_ITEM_TYPE = 8192u

public val MFT_SEPARATOR: MENU_ITEM_TYPE = 2048u

public val MFT_STRING: MENU_ITEM_TYPE = 0u

public val MF_APPEND: MENU_ITEM_FLAGS = 256u

public val MF_BITMAP: MENU_ITEM_FLAGS = 4u

public val MF_BYCOMMAND: MENU_ITEM_FLAGS = 0u

public val MF_BYPOSITION: MENU_ITEM_FLAGS = 1024u

public val MF_CHANGE: MENU_ITEM_FLAGS = 128u

public val MF_CHECKED: MENU_ITEM_FLAGS = 8u

public val MF_DEFAULT: MENU_ITEM_FLAGS = 4096u

public val MF_DELETE: MENU_ITEM_FLAGS = 512u

public val MF_DISABLED: MENU_ITEM_FLAGS = 2u

public val MF_ENABLED: MENU_ITEM_FLAGS = 0u

public val MF_END: MENU_ITEM_FLAGS = 128u

public val MF_GRAYED: MENU_ITEM_FLAGS = 1u

public val MF_HELP: MENU_ITEM_FLAGS = 16384u

public val MF_HILITE: MENU_ITEM_FLAGS = 128u

public val MF_INSERT: MENU_ITEM_FLAGS = 0u

public val MF_MENUBARBREAK: MENU_ITEM_FLAGS = 32u

public val MF_MENUBREAK: MENU_ITEM_FLAGS = 64u

public val MF_MOUSESELECT: MENU_ITEM_FLAGS = 32768u

public val MF_OWNERDRAW: MENU_ITEM_FLAGS = 256u

public val MF_POPUP: MENU_ITEM_FLAGS = 16u

public val MF_REMOVE: MENU_ITEM_FLAGS = 4096u

public val MF_RIGHTJUSTIFY: MENU_ITEM_FLAGS = 16384u

public val MF_SEPARATOR: MENU_ITEM_FLAGS = 2048u

public val MF_STRING: MENU_ITEM_FLAGS = 0u

public val MF_SYSMENU: MENU_ITEM_FLAGS = 8192u

public val MF_UNCHECKED: MENU_ITEM_FLAGS = 0u

public val MF_UNHILITE: MENU_ITEM_FLAGS = 0u

public val MF_USECHECKBITMAPS: MENU_ITEM_FLAGS = 512u

public val MIIM_BITMAP: MENU_ITEM_MASK = 128u

public val MIIM_CHECKMARKS: MENU_ITEM_MASK = 8u

public val MIIM_DATA: MENU_ITEM_MASK = 32u

public val MIIM_FTYPE: MENU_ITEM_MASK = 256u

public val MIIM_ID: MENU_ITEM_MASK = 2u

public val MIIM_STATE: MENU_ITEM_MASK = 1u

public val MIIM_STRING: MENU_ITEM_MASK = 64u

public val MIIM_SUBMENU: MENU_ITEM_MASK = 4u

public val MIIM_TYPE: MENU_ITEM_MASK = 16u

public val MIM_APPLYTOSUBMENUS: MENUINFO_MASK = 2147483648u

public val MIM_BACKGROUND: MENUINFO_MASK = 2u

public val MIM_HELPID: MENUINFO_MASK = 4u

public val MIM_MAXHEIGHT: MENUINFO_MASK = 1u

public val MIM_MENUDATA: MENUINFO_MASK = 8u

public val MIM_STYLE: MENUINFO_MASK = 16u

public val MINIMUM_RESERVED_MANIFEST_RESOURCE_ID: UInt = 1u

public val MIN_LOGICALDPIOVERRIDE: Int = -2

public val MKF_AVAILABLE: UInt = 2u

public val MKF_CONFIRMHOTKEY: UInt = 8u

public val MKF_HOTKEYACTIVE: UInt = 4u

public val MKF_HOTKEYSOUND: UInt = 16u

public val MKF_INDICATOR: UInt = 32u

public val MKF_LEFTBUTTONDOWN: UInt = 16777216u

public val MKF_LEFTBUTTONSEL: UInt = 268435456u

public val MKF_MODIFIERS: UInt = 64u

public val MKF_MOUSEKEYSON: UInt = 1u

public val MKF_MOUSEMODE: UInt = 2147483648u

public val MKF_REPLACENUMBERS: UInt = 128u

public val MKF_RIGHTBUTTONDOWN: UInt = 33554432u

public val MKF_RIGHTBUTTONSEL: UInt = 536870912u

public val MNC_CLOSE: UInt = 1u

public val MNC_EXECUTE: UInt = 2u

public val MNC_IGNORE: UInt = 0u

public val MNC_SELECT: UInt = 3u

public val MND_CONTINUE: UInt = 0u

public val MND_ENDMENU: UInt = 1u

public val MNGOF_BOTTOMGAP: MENUGETOBJECTINFO_FLAGS = 2u

public val MNGOF_TOPGAP: MENUGETOBJECTINFO_FLAGS = 1u

public val MNGO_NOERROR: UInt = 1u

public val MNGO_NOINTERFACE: UInt = 0u

public val MNS_AUTODISMISS: MENUINFO_STYLE = 268435456u

public val MNS_CHECKORBMP: MENUINFO_STYLE = 67108864u

public val MNS_DRAGDROP: MENUINFO_STYLE = 536870912u

public val MNS_MODELESS: MENUINFO_STYLE = 1073741824u

public val MNS_NOCHECK: MENUINFO_STYLE = 2147483648u

public val MNS_NOTIFYBYPOS: MENUINFO_STYLE = 134217728u

public val MN_GETHMENU: UInt = 481u

public val MONITORINFOF_PRIMARY: UInt = 1u

public val MOUSEWHEEL_ROUTING_FOCUS: UInt = 0u

public val MOUSEWHEEL_ROUTING_HYBRID: UInt = 1u

public val MOUSEWHEEL_ROUTING_MOUSE_POS: UInt = 2u

public val MSGFLTINFO_ALLOWED_HIGHER: MSGFLTINFO_STATUS = 3u

public val MSGFLTINFO_ALREADYALLOWED_FORWND: MSGFLTINFO_STATUS = 1u

public val MSGFLTINFO_ALREADYDISALLOWED_FORWND: MSGFLTINFO_STATUS = 2u

public val MSGFLTINFO_NONE: MSGFLTINFO_STATUS = 0u

public val MSGFLT_ADD: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS = 1u

public val MSGFLT_ALLOW: WINDOW_MESSAGE_FILTER_ACTION = 1u

public val MSGFLT_DISALLOW: WINDOW_MESSAGE_FILTER_ACTION = 2u

public val MSGFLT_REMOVE: CHANGE_WINDOW_MESSAGE_FILTER_FLAGS = 2u

public val MSGFLT_RESET: WINDOW_MESSAGE_FILTER_ACTION = 0u

public val MSGF_DIALOGBOX: UInt = 0u

public val MSGF_MAX: UInt = 8u

public val MSGF_MENU: UInt = 2u

public val MSGF_MESSAGEBOX: UInt = 1u

public val MSGF_NEXTWINDOW: UInt = 6u

public val MSGF_SCROLLBAR: UInt = 5u

public val MSGF_USER: UInt = 4096u

public val MWMO_ALERTABLE: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS = 2u

public val MWMO_INPUTAVAILABLE: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS = 4u

public val MWMO_NONE: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS = 0u

public val MWMO_WAITALL: MSG_WAIT_FOR_MULTIPLE_OBJECTS_EX_FLAGS = 1u

public val MrmDumpType_Basic: MrmDumpType = 0

public val MrmDumpType_Detailed: MrmDumpType = 1

public val MrmDumpType_Schema: MrmDumpType = 2

public val MrmIndexerFlagsAutoMerge: MrmIndexerFlags = 1

public val MrmIndexerFlagsCreateContentChecksum: MrmIndexerFlags = 2

public val MrmIndexerFlagsNone: MrmIndexerFlags = 0

public val MrmPackagingModeAutoSplit: MrmPackagingMode = 1

public val MrmPackagingModeResourcePack: MrmPackagingMode = 2

public val MrmPackagingModeStandaloneFile: MrmPackagingMode = 0

public val MrmPackagingOptionsNone: MrmPackagingOptions = 0

public val MrmPackagingOptionsOmitSchemaFromResourcePacks: MrmPackagingOptions = 1

public val MrmPackagingOptionsSplitLanguageVariants: MrmPackagingOptions = 2

public val MrmPlatformVersion_Default: MrmPlatformVersion = 0

public val MrmPlatformVersion_Windows10_0_0_0: MrmPlatformVersion = 17432576

public val MrmPlatformVersion_Windows10_0_0_5: MrmPlatformVersion = 17432581

public val MrmResourceIndexerMessageSeverityError: MrmResourceIndexerMessageSeverity = 3

public val MrmResourceIndexerMessageSeverityInfo: MrmResourceIndexerMessageSeverity = 1

public val MrmResourceIndexerMessageSeverityVerbose: MrmResourceIndexerMessageSeverity = 0

public val MrmResourceIndexerMessageSeverityWarning: MrmResourceIndexerMessageSeverity = 2

public val NFR_ANSI: UInt = 1u

public val NFR_UNICODE: UInt = 2u

public val NF_QUERY: UInt = 3u

public val NF_REQUERY: UInt = 4u

public val NID_EXTERNAL_PEN: UInt = 8u

public val NID_EXTERNAL_TOUCH: UInt = 2u

public val NID_INTEGRATED_PEN: UInt = 4u

public val NID_INTEGRATED_TOUCH: UInt = 1u

public val NID_MULTI_INPUT: UInt = 64u

public val NID_READY: UInt = 128u

public val OBJID_ALERT: OBJECT_IDENTIFIER = -10

public val OBJID_CARET: OBJECT_IDENTIFIER = -8

public val OBJID_CLIENT: OBJECT_IDENTIFIER = -4

public val OBJID_CURSOR: OBJECT_IDENTIFIER = -9

public val OBJID_HSCROLL: OBJECT_IDENTIFIER = -6

public val OBJID_MENU: OBJECT_IDENTIFIER = -3

public val OBJID_NATIVEOM: OBJECT_IDENTIFIER = -16

public val OBJID_QUERYCLASSNAMEIDX: OBJECT_IDENTIFIER = -12

public val OBJID_SIZEGRIP: OBJECT_IDENTIFIER = -7

public val OBJID_SOUND: OBJECT_IDENTIFIER = -11

public val OBJID_SYSMENU: OBJECT_IDENTIFIER = -1

public val OBJID_TITLEBAR: OBJECT_IDENTIFIER = -2

public val OBJID_VSCROLL: OBJECT_IDENTIFIER = -5

public val OBJID_WINDOW: OBJECT_IDENTIFIER = 0

public val OBM_BTNCORNERS: UInt = 32758u

public val OBM_BTSIZE: UInt = 32761u

public val OBM_CHECK: UInt = 32760u

public val OBM_CHECKBOXES: UInt = 32759u

public val OBM_CLOSE: UInt = 32754u

public val OBM_COMBO: UInt = 32738u

public val OBM_DNARROW: UInt = 32752u

public val OBM_DNARROWD: UInt = 32742u

public val OBM_DNARROWI: UInt = 32736u

public val OBM_LFARROW: UInt = 32750u

public val OBM_LFARROWD: UInt = 32740u

public val OBM_LFARROWI: UInt = 32734u

public val OBM_MNARROW: UInt = 32739u

public val OBM_OLD_CLOSE: UInt = 32767u

public val OBM_OLD_DNARROW: UInt = 32764u

public val OBM_OLD_LFARROW: UInt = 32762u

public val OBM_OLD_REDUCE: UInt = 32757u

public val OBM_OLD_RESTORE: UInt = 32755u

public val OBM_OLD_RGARROW: UInt = 32763u

public val OBM_OLD_UPARROW: UInt = 32765u

public val OBM_OLD_ZOOM: UInt = 32756u

public val OBM_REDUCE: UInt = 32749u

public val OBM_REDUCED: UInt = 32746u

public val OBM_RESTORE: UInt = 32747u

public val OBM_RESTORED: UInt = 32744u

public val OBM_RGARROW: UInt = 32751u

public val OBM_RGARROWD: UInt = 32741u

public val OBM_RGARROWI: UInt = 32735u

public val OBM_SIZE: UInt = 32766u

public val OBM_UPARROW: UInt = 32753u

public val OBM_UPARROWD: UInt = 32743u

public val OBM_UPARROWI: UInt = 32737u

public val OBM_ZOOM: UInt = 32748u

public val OBM_ZOOMD: UInt = 32745u

public val OCR_APPSTARTING: SYSTEM_CURSOR_ID = 32650u

public val OCR_CROSS: SYSTEM_CURSOR_ID = 32515u

public val OCR_HAND: SYSTEM_CURSOR_ID = 32649u

public val OCR_HELP: SYSTEM_CURSOR_ID = 32651u

public val OCR_IBEAM: SYSTEM_CURSOR_ID = 32513u

public val OCR_ICOCUR: UInt = 32647u

public val OCR_ICON: UInt = 32641u

public val OCR_NO: SYSTEM_CURSOR_ID = 32648u

public val OCR_NORMAL: SYSTEM_CURSOR_ID = 32512u

public val OCR_SIZE: UInt = 32640u

public val OCR_SIZEALL: SYSTEM_CURSOR_ID = 32646u

public val OCR_SIZENESW: SYSTEM_CURSOR_ID = 32643u

public val OCR_SIZENS: SYSTEM_CURSOR_ID = 32645u

public val OCR_SIZENWSE: SYSTEM_CURSOR_ID = 32642u

public val OCR_SIZEWE: SYSTEM_CURSOR_ID = 32644u

public val OCR_UP: SYSTEM_CURSOR_ID = 32516u

public val OCR_WAIT: SYSTEM_CURSOR_ID = 32514u

public val OIC_BANG: UInt = 32515u

public val OIC_ERROR: UInt = 32513u

public val OIC_HAND: UInt = 32513u

public val OIC_INFORMATION: UInt = 32516u

public val OIC_NOTE: UInt = 32516u

public val OIC_QUES: UInt = 32514u

public val OIC_SAMPLE: UInt = 32512u

public val OIC_SHIELD: UInt = 32518u

public val OIC_WARNING: UInt = 32515u

public val OIC_WINLOGO: UInt = 32517u

public val ORD_LANGDRIVER: UInt = 1u

public val PA_ACTIVATE: UInt = 1u

public val PA_NOACTIVATE: UInt = 3u

public val PBTF_APMRESUMEFROMFAILURE: UInt = 1u

public val PBT_APMBATTERYLOW: UInt = 9u

public val PBT_APMOEMEVENT: UInt = 11u

public val PBT_APMPOWERSTATUSCHANGE: UInt = 10u

public val PBT_APMQUERYSTANDBY: UInt = 1u

public val PBT_APMQUERYSTANDBYFAILED: UInt = 3u

public val PBT_APMQUERYSUSPEND: UInt = 0u

public val PBT_APMQUERYSUSPENDFAILED: UInt = 2u

public val PBT_APMRESUMEAUTOMATIC: UInt = 18u

public val PBT_APMRESUMECRITICAL: UInt = 6u

public val PBT_APMRESUMESTANDBY: UInt = 8u

public val PBT_APMRESUMESUSPEND: UInt = 7u

public val PBT_APMSTANDBY: UInt = 5u

public val PBT_APMSUSPEND: UInt = 4u

public val PBT_POWERSETTINGCHANGE: UInt = 32787u

public val PDC_ARRIVAL: UInt = 1u

public val PDC_MAPPING_CHANGE: UInt = 256u

public val PDC_MODE_ASPECTRATIOPRESERVED: UInt = 2048u

public val PDC_MODE_CENTERED: UInt = 128u

public val PDC_MODE_DEFAULT: UInt = 64u

public val PDC_ORIENTATION_0: UInt = 4u

public val PDC_ORIENTATION_180: UInt = 16u

public val PDC_ORIENTATION_270: UInt = 32u

public val PDC_ORIENTATION_90: UInt = 8u

public val PDC_ORIGIN: UInt = 1024u

public val PDC_REMOVAL: UInt = 2u

public val PDC_RESOLUTION: UInt = 512u

public val PENARBITRATIONTYPE_FIS: UInt = 2u

public val PENARBITRATIONTYPE_MAX: UInt = 4u

public val PENARBITRATIONTYPE_NONE: UInt = 0u

public val PENARBITRATIONTYPE_SPT: UInt = 3u

public val PENARBITRATIONTYPE_WIN8: UInt = 1u

public val PENVISUALIZATION_CURSOR: UInt = 32u

public val PENVISUALIZATION_DOUBLETAP: UInt = 2u

public val PENVISUALIZATION_OFF: UInt = 0u

public val PENVISUALIZATION_ON: UInt = 35u

public val PENVISUALIZATION_TAP: UInt = 1u

public val PEN_FLAG_BARREL: UInt = 1u

public val PEN_FLAG_ERASER: UInt = 4u

public val PEN_FLAG_INVERTED: UInt = 2u

public val PEN_FLAG_NONE: UInt = 0u

public val PEN_MASK_NONE: UInt = 0u

public val PEN_MASK_PRESSURE: UInt = 1u

public val PEN_MASK_ROTATION: UInt = 2u

public val PEN_MASK_TILT_X: UInt = 4u

public val PEN_MASK_TILT_Y: UInt = 8u

public val PMB_ACTIVE: UInt = 1u

public val PM_NOREMOVE: PEEK_MESSAGE_REMOVE_TYPE = 0u

public val PM_NOYIELD: PEEK_MESSAGE_REMOVE_TYPE = 2u

public val PM_QS_INPUT: PEEK_MESSAGE_REMOVE_TYPE = 67567616u

public val PM_QS_PAINT: PEEK_MESSAGE_REMOVE_TYPE = 2097152u

public val PM_QS_POSTMESSAGE: PEEK_MESSAGE_REMOVE_TYPE = 9961472u

public val PM_QS_SENDMESSAGE: PEEK_MESSAGE_REMOVE_TYPE = 4194304u

public val PM_REMOVE: PEEK_MESSAGE_REMOVE_TYPE = 1u

public val POINTER_DEVICE_PRODUCT_STRING_MAX: UInt = 520u

public val POINTER_MESSAGE_FLAG_CANCELED: UInt = 32768u

public val POINTER_MESSAGE_FLAG_CONFIDENCE: UInt = 16384u

public val POINTER_MESSAGE_FLAG_FIFTHBUTTON: UInt = 256u

public val POINTER_MESSAGE_FLAG_FIRSTBUTTON: UInt = 16u

public val POINTER_MESSAGE_FLAG_FOURTHBUTTON: UInt = 128u

public val POINTER_MESSAGE_FLAG_INCONTACT: UInt = 4u

public val POINTER_MESSAGE_FLAG_INRANGE: UInt = 2u

public val POINTER_MESSAGE_FLAG_NEW: UInt = 1u

public val POINTER_MESSAGE_FLAG_PRIMARY: UInt = 8192u

public val POINTER_MESSAGE_FLAG_SECONDBUTTON: UInt = 32u

public val POINTER_MESSAGE_FLAG_THIRDBUTTON: UInt = 64u

public val POINTER_MOD_CTRL: UInt = 8u

public val POINTER_MOD_SHIFT: UInt = 4u

public val PRF_CHECKVISIBLE: Int = 1

public val PRF_CHILDREN: Int = 16

public val PRF_CLIENT: Int = 4

public val PRF_ERASEBKGND: Int = 8

public val PRF_NONCLIENT: Int = 2

public val PRF_OWNED: Int = 32

public val PT_MOUSE: POINTER_INPUT_TYPE = 4

public val PT_PEN: POINTER_INPUT_TYPE = 3

public val PT_POINTER: POINTER_INPUT_TYPE = 1

public val PT_TOUCH: POINTER_INPUT_TYPE = 2

public val PT_TOUCHPAD: POINTER_INPUT_TYPE = 5

public val PWR_CRITICALRESUME: UInt = 3u

public val PWR_FAIL: Int = -1

public val PWR_OK: UInt = 1u

public val PWR_SUSPENDREQUEST: UInt = 1u

public val PWR_SUSPENDRESUME: UInt = 2u

public val PW_RENDERFULLCONTENT: UInt = 2u

public val QS_ALLEVENTS: QUEUE_STATUS_FLAGS = 1215u

public val QS_ALLINPUT: QUEUE_STATUS_FLAGS = 1279u

public val QS_ALLPOSTMESSAGE: QUEUE_STATUS_FLAGS = 256u

public val QS_HOTKEY: QUEUE_STATUS_FLAGS = 128u

public val QS_INPUT: QUEUE_STATUS_FLAGS = 1031u

public val QS_KEY: QUEUE_STATUS_FLAGS = 1u

public val QS_MOUSE: QUEUE_STATUS_FLAGS = 6u

public val QS_MOUSEBUTTON: QUEUE_STATUS_FLAGS = 4u

public val QS_MOUSEMOVE: QUEUE_STATUS_FLAGS = 2u

public val QS_PAINT: QUEUE_STATUS_FLAGS = 32u

public val QS_POINTER: UInt = 4096u

public val QS_POSTMESSAGE: QUEUE_STATUS_FLAGS = 8u

public val QS_RAWINPUT: QUEUE_STATUS_FLAGS = 1024u

public val QS_SENDMESSAGE: QUEUE_STATUS_FLAGS = 64u

public val QS_TIMER: QUEUE_STATUS_FLAGS = 16u

public val QS_TOUCH: UInt = 2048u

public val RES_CURSOR: UInt = 2u

public val RES_ICON: UInt = 1u

public val RIDEV_EXMODEMASK: UInt = 240u

public val RIM_INPUT: UInt = 0u

public val RIM_INPUTSINK: UInt = 1u

public val RIM_TYPEMAX: UInt = 2u

public val RI_KEY_BREAK: UInt = 1u

public val RI_KEY_E0: UInt = 2u

public val RI_KEY_E1: UInt = 4u

public val RI_KEY_MAKE: UInt = 0u

public val RI_KEY_TERMSRV_SET_LED: UInt = 8u

public val RI_KEY_TERMSRV_SHADOW: UInt = 16u

public val RI_MOUSE_BUTTON_1_DOWN: UInt = 1u

public val RI_MOUSE_BUTTON_1_UP: UInt = 2u

public val RI_MOUSE_BUTTON_2_DOWN: UInt = 4u

public val RI_MOUSE_BUTTON_2_UP: UInt = 8u

public val RI_MOUSE_BUTTON_3_DOWN: UInt = 16u

public val RI_MOUSE_BUTTON_3_UP: UInt = 32u

public val RI_MOUSE_BUTTON_4_DOWN: UInt = 64u

public val RI_MOUSE_BUTTON_4_UP: UInt = 128u

public val RI_MOUSE_BUTTON_5_DOWN: UInt = 256u

public val RI_MOUSE_BUTTON_5_UP: UInt = 512u

public val RI_MOUSE_HWHEEL: UInt = 2048u

public val RI_MOUSE_LEFT_BUTTON_DOWN: UInt = 1u

public val RI_MOUSE_LEFT_BUTTON_UP: UInt = 2u

public val RI_MOUSE_MIDDLE_BUTTON_DOWN: UInt = 16u

public val RI_MOUSE_MIDDLE_BUTTON_UP: UInt = 32u

public val RI_MOUSE_RIGHT_BUTTON_DOWN: UInt = 4u

public val RI_MOUSE_RIGHT_BUTTON_UP: UInt = 8u

public val RI_MOUSE_WHEEL: UInt = 1024u

public val RT_ACCELERATOR: PCWSTR = 9u.toLong()

public val RT_ANICURSOR: PCWSTR = 21u.toLong()

public val RT_ANIICON: PCWSTR = 22u.toLong()

public val RT_BITMAP: PCWSTR = 2u.toLong()

public val RT_CURSOR: PCWSTR = 1u.toLong()

public val RT_DIALOG: PCWSTR = 5u.toLong()

public val RT_DLGINCLUDE: PCWSTR = 17u.toLong()

public val RT_FONT: PCWSTR = 8u.toLong()

public val RT_FONTDIR: PCWSTR = 7u.toLong()

public val RT_GROUP_CURSOR: PCWSTR = 12u.toLong()

public val RT_GROUP_ICON: PCWSTR = 14u.toLong()

public val RT_HTML: PCWSTR = 23u.toLong()

public val RT_ICON: PCWSTR = 3u.toLong()

public val RT_MANIFEST: PCWSTR = 24u.toLong()

public val RT_MENU: PCWSTR = 4u.toLong()

public val RT_MESSAGETABLE: PCWSTR = 11u.toLong()

public val RT_PLUGPLAY: PCWSTR = 19u.toLong()

public val RT_VERSION: PCWSTR = 16u.toLong()

public val RT_VXD: PCWSTR = 20u.toLong()

public val SBM_ENABLE_ARROWS: UInt = 228u

public val SBM_GETPOS: UInt = 225u

public val SBM_GETRANGE: UInt = 227u

public val SBM_GETSCROLLBARINFO: UInt = 235u

public val SBM_GETSCROLLINFO: UInt = 234u

public val SBM_SETPOS: UInt = 224u

public val SBM_SETRANGE: UInt = 226u

public val SBM_SETRANGEREDRAW: UInt = 230u

public val SBM_SETSCROLLINFO: UInt = 233u

public val SBS_BOTTOMALIGN: Int = 4

public val SBS_HORZ: Int = 0

public val SBS_LEFTALIGN: Int = 2

public val SBS_RIGHTALIGN: Int = 4

public val SBS_SIZEBOX: Int = 8

public val SBS_SIZEBOXBOTTOMRIGHTALIGN: Int = 4

public val SBS_SIZEBOXTOPLEFTALIGN: Int = 2

public val SBS_SIZEGRIP: Int = 16

public val SBS_TOPALIGN: Int = 2

public val SBS_VERT: Int = 1

public val SB_BOTH: SCROLLBAR_CONSTANTS = 3

public val SB_BOTTOM: SCROLLBAR_COMMAND = 7

public val SB_CTL: SCROLLBAR_CONSTANTS = 2

public val SB_ENDSCROLL: SCROLLBAR_COMMAND = 8

public val SB_HORZ: SCROLLBAR_CONSTANTS = 0

public val SB_LEFT: SCROLLBAR_COMMAND = 6

public val SB_LINEDOWN: SCROLLBAR_COMMAND = 1

public val SB_LINELEFT: SCROLLBAR_COMMAND = 0

public val SB_LINERIGHT: SCROLLBAR_COMMAND = 1

public val SB_LINEUP: SCROLLBAR_COMMAND = 0

public val SB_PAGEDOWN: SCROLLBAR_COMMAND = 3

public val SB_PAGELEFT: SCROLLBAR_COMMAND = 2

public val SB_PAGERIGHT: SCROLLBAR_COMMAND = 3

public val SB_PAGEUP: SCROLLBAR_COMMAND = 2

public val SB_RIGHT: SCROLLBAR_COMMAND = 7

public val SB_THUMBPOSITION: SCROLLBAR_COMMAND = 4

public val SB_THUMBTRACK: SCROLLBAR_COMMAND = 5

public val SB_TOP: SCROLLBAR_COMMAND = 6

public val SB_VERT: SCROLLBAR_CONSTANTS = 1

public val SCF_ISSECURE: UInt = 1u

public val SC_ARRANGE: UInt = 61712u

public val SC_CLOSE: UInt = 61536u

public val SC_CONTEXTHELP: UInt = 61824u

public val SC_DEFAULT: UInt = 61792u

public val SC_HOTKEY: UInt = 61776u

public val SC_HSCROLL: UInt = 61568u

public val SC_ICON: UInt = 61472u

public val SC_KEYMENU: UInt = 61696u

public val SC_MAXIMIZE: UInt = 61488u

public val SC_MINIMIZE: UInt = 61472u

public val SC_MONITORPOWER: UInt = 61808u

public val SC_MOUSEMENU: UInt = 61584u

public val SC_MOVE: UInt = 61456u

public val SC_NEXTWINDOW: UInt = 61504u

public val SC_PREVWINDOW: UInt = 61520u

public val SC_RESTORE: UInt = 61728u

public val SC_SEPARATOR: UInt = 61455u

public val SC_SIZE: UInt = 61440u

public val SC_TASKLIST: UInt = 61744u

public val SC_VSCROLL: UInt = 61552u

public val SC_ZOOM: UInt = 61488u

public val SHOW_FULLSCREEN: UInt = 3u

public val SHOW_ICONWINDOW: UInt = 2u

public val SHOW_OPENNOACTIVATE: UInt = 4u

public val SHOW_OPENWINDOW: UInt = 1u

public val SIF_ALL: SCROLLINFO_MASK = 23u

public val SIF_DISABLENOSCROLL: SCROLLINFO_MASK = 8u

public val SIF_PAGE: SCROLLINFO_MASK = 2u

public val SIF_POS: SCROLLINFO_MASK = 4u

public val SIF_RANGE: SCROLLINFO_MASK = 1u

public val SIF_TRACKPOS: SCROLLINFO_MASK = 16u

public val SIZEFULLSCREEN: UInt = 2u

public val SIZEICONIC: UInt = 1u

public val SIZENORMAL: UInt = 0u

public val SIZEZOOMHIDE: UInt = 4u

public val SIZEZOOMSHOW: UInt = 3u

public val SIZE_MAXHIDE: UInt = 4u

public val SIZE_MAXIMIZED: UInt = 2u

public val SIZE_MAXSHOW: UInt = 3u

public val SIZE_MINIMIZED: UInt = 1u

public val SIZE_RESTORED: UInt = 0u

public val SMTO_ABORTIFHUNG: SEND_MESSAGE_TIMEOUT_FLAGS = 2u

public val SMTO_BLOCK: SEND_MESSAGE_TIMEOUT_FLAGS = 1u

public val SMTO_ERRORONEXIT: SEND_MESSAGE_TIMEOUT_FLAGS = 32u

public val SMTO_NORMAL: SEND_MESSAGE_TIMEOUT_FLAGS = 0u

public val SMTO_NOTIMEOUTIFNOTHUNG: SEND_MESSAGE_TIMEOUT_FLAGS = 8u

public val SM_ARRANGE: SYSTEM_METRICS_INDEX = 56

public val SM_CARETBLINKINGENABLED: UInt = 8194u

public val SM_CLEANBOOT: SYSTEM_METRICS_INDEX = 67

public val SM_CMETRICS: UInt = 76u

public val SM_CMONITORS: SYSTEM_METRICS_INDEX = 80

public val SM_CMOUSEBUTTONS: SYSTEM_METRICS_INDEX = 43

public val SM_CONVERTIBLESLATEMODE: SYSTEM_METRICS_INDEX = 8195

public val SM_CXBORDER: SYSTEM_METRICS_INDEX = 5

public val SM_CXCURSOR: SYSTEM_METRICS_INDEX = 13

public val SM_CXDLGFRAME: SYSTEM_METRICS_INDEX = 7

public val SM_CXDOUBLECLK: SYSTEM_METRICS_INDEX = 36

public val SM_CXDRAG: SYSTEM_METRICS_INDEX = 68

public val SM_CXEDGE: SYSTEM_METRICS_INDEX = 45

public val SM_CXFIXEDFRAME: SYSTEM_METRICS_INDEX = 7

public val SM_CXFOCUSBORDER: SYSTEM_METRICS_INDEX = 83

public val SM_CXFRAME: SYSTEM_METRICS_INDEX = 32

public val SM_CXFULLSCREEN: SYSTEM_METRICS_INDEX = 16

public val SM_CXHSCROLL: SYSTEM_METRICS_INDEX = 21

public val SM_CXHTHUMB: SYSTEM_METRICS_INDEX = 10

public val SM_CXICON: SYSTEM_METRICS_INDEX = 11

public val SM_CXICONSPACING: SYSTEM_METRICS_INDEX = 38

public val SM_CXMAXIMIZED: SYSTEM_METRICS_INDEX = 61

public val SM_CXMAXTRACK: SYSTEM_METRICS_INDEX = 59

public val SM_CXMENUCHECK: SYSTEM_METRICS_INDEX = 71

public val SM_CXMENUSIZE: SYSTEM_METRICS_INDEX = 54

public val SM_CXMIN: SYSTEM_METRICS_INDEX = 28

public val SM_CXMINIMIZED: SYSTEM_METRICS_INDEX = 57

public val SM_CXMINSPACING: SYSTEM_METRICS_INDEX = 47

public val SM_CXMINTRACK: SYSTEM_METRICS_INDEX = 34

public val SM_CXPADDEDBORDER: SYSTEM_METRICS_INDEX = 92

public val SM_CXSCREEN: SYSTEM_METRICS_INDEX = 0

public val SM_CXSIZE: SYSTEM_METRICS_INDEX = 30

public val SM_CXSIZEFRAME: SYSTEM_METRICS_INDEX = 32

public val SM_CXSMICON: SYSTEM_METRICS_INDEX = 49

public val SM_CXSMSIZE: SYSTEM_METRICS_INDEX = 52

public val SM_CXVIRTUALSCREEN: SYSTEM_METRICS_INDEX = 78

public val SM_CXVSCROLL: SYSTEM_METRICS_INDEX = 2

public val SM_CYBORDER: SYSTEM_METRICS_INDEX = 6

public val SM_CYCAPTION: SYSTEM_METRICS_INDEX = 4

public val SM_CYCURSOR: SYSTEM_METRICS_INDEX = 14

public val SM_CYDLGFRAME: SYSTEM_METRICS_INDEX = 8

public val SM_CYDOUBLECLK: SYSTEM_METRICS_INDEX = 37

public val SM_CYDRAG: SYSTEM_METRICS_INDEX = 69

public val SM_CYEDGE: SYSTEM_METRICS_INDEX = 46

public val SM_CYFIXEDFRAME: SYSTEM_METRICS_INDEX = 8

public val SM_CYFOCUSBORDER: SYSTEM_METRICS_INDEX = 84

public val SM_CYFRAME: SYSTEM_METRICS_INDEX = 33

public val SM_CYFULLSCREEN: SYSTEM_METRICS_INDEX = 17

public val SM_CYHSCROLL: SYSTEM_METRICS_INDEX = 3

public val SM_CYICON: SYSTEM_METRICS_INDEX = 12

public val SM_CYICONSPACING: SYSTEM_METRICS_INDEX = 39

public val SM_CYKANJIWINDOW: SYSTEM_METRICS_INDEX = 18

public val SM_CYMAXIMIZED: SYSTEM_METRICS_INDEX = 62

public val SM_CYMAXTRACK: SYSTEM_METRICS_INDEX = 60

public val SM_CYMENU: SYSTEM_METRICS_INDEX = 15

public val SM_CYMENUCHECK: SYSTEM_METRICS_INDEX = 72

public val SM_CYMENUSIZE: SYSTEM_METRICS_INDEX = 55

public val SM_CYMIN: SYSTEM_METRICS_INDEX = 29

public val SM_CYMINIMIZED: SYSTEM_METRICS_INDEX = 58

public val SM_CYMINSPACING: SYSTEM_METRICS_INDEX = 48

public val SM_CYMINTRACK: SYSTEM_METRICS_INDEX = 35

public val SM_CYSCREEN: SYSTEM_METRICS_INDEX = 1

public val SM_CYSIZE: SYSTEM_METRICS_INDEX = 31

public val SM_CYSIZEFRAME: SYSTEM_METRICS_INDEX = 33

public val SM_CYSMCAPTION: SYSTEM_METRICS_INDEX = 51

public val SM_CYSMICON: SYSTEM_METRICS_INDEX = 50

public val SM_CYSMSIZE: SYSTEM_METRICS_INDEX = 53

public val SM_CYVIRTUALSCREEN: SYSTEM_METRICS_INDEX = 79

public val SM_CYVSCROLL: SYSTEM_METRICS_INDEX = 20

public val SM_CYVTHUMB: SYSTEM_METRICS_INDEX = 9

public val SM_DBCSENABLED: SYSTEM_METRICS_INDEX = 42

public val SM_DEBUG: SYSTEM_METRICS_INDEX = 22

public val SM_DIGITIZER: SYSTEM_METRICS_INDEX = 94

public val SM_IMMENABLED: SYSTEM_METRICS_INDEX = 82

public val SM_MAXIMUMTOUCHES: SYSTEM_METRICS_INDEX = 95

public val SM_MEDIACENTER: SYSTEM_METRICS_INDEX = 87

public val SM_MENUDROPALIGNMENT: SYSTEM_METRICS_INDEX = 40

public val SM_MIDEASTENABLED: SYSTEM_METRICS_INDEX = 74

public val SM_MOUSEHORIZONTALWHEELPRESENT: SYSTEM_METRICS_INDEX = 91

public val SM_MOUSEPRESENT: SYSTEM_METRICS_INDEX = 19

public val SM_MOUSEWHEELPRESENT: SYSTEM_METRICS_INDEX = 75

public val SM_NETWORK: SYSTEM_METRICS_INDEX = 63

public val SM_PENWINDOWS: SYSTEM_METRICS_INDEX = 41

public val SM_REMOTECONTROL: SYSTEM_METRICS_INDEX = 8193

public val SM_REMOTESESSION: SYSTEM_METRICS_INDEX = 4096

public val SM_RESERVED1: UInt = 24u

public val SM_RESERVED2: UInt = 25u

public val SM_RESERVED3: UInt = 26u

public val SM_RESERVED4: UInt = 27u

public val SM_SAMEDISPLAYFORMAT: SYSTEM_METRICS_INDEX = 81

public val SM_SECURE: SYSTEM_METRICS_INDEX = 44

public val SM_SERVERR2: SYSTEM_METRICS_INDEX = 89

public val SM_SHOWSOUNDS: SYSTEM_METRICS_INDEX = 70

public val SM_SHUTTINGDOWN: SYSTEM_METRICS_INDEX = 8192

public val SM_SLOWMACHINE: SYSTEM_METRICS_INDEX = 73

public val SM_STARTER: SYSTEM_METRICS_INDEX = 88

public val SM_SWAPBUTTON: SYSTEM_METRICS_INDEX = 23

public val SM_SYSTEMDOCKED: SYSTEM_METRICS_INDEX = 8196

public val SM_TABLETPC: SYSTEM_METRICS_INDEX = 86

public val SM_XVIRTUALSCREEN: SYSTEM_METRICS_INDEX = 76

public val SM_YVIRTUALSCREEN: SYSTEM_METRICS_INDEX = 77

public val SOUND_SYSTEM_APPEND: UInt = 14u

public val SOUND_SYSTEM_APPSTART: UInt = 12u

public val SOUND_SYSTEM_BEEP: UInt = 3u

public val SOUND_SYSTEM_ERROR: UInt = 4u

public val SOUND_SYSTEM_FAULT: UInt = 13u

public val SOUND_SYSTEM_INFORMATION: UInt = 7u

public val SOUND_SYSTEM_MAXIMIZE: UInt = 8u

public val SOUND_SYSTEM_MENUCOMMAND: UInt = 15u

public val SOUND_SYSTEM_MENUPOPUP: UInt = 16u

public val SOUND_SYSTEM_MINIMIZE: UInt = 9u

public val SOUND_SYSTEM_QUESTION: UInt = 5u

public val SOUND_SYSTEM_RESTOREDOWN: UInt = 11u

public val SOUND_SYSTEM_RESTOREUP: UInt = 10u

public val SOUND_SYSTEM_SHUTDOWN: UInt = 2u

public val SOUND_SYSTEM_STARTUP: UInt = 1u

public val SOUND_SYSTEM_WARNING: UInt = 6u

public val SPIF_SENDCHANGE: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS = 2u

public val SPIF_SENDWININICHANGE: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS = 2u

public val SPIF_UPDATEINIFILE: SYSTEM_PARAMETERS_INFO_UPDATE_FLAGS = 1u

public val SPI_GETACCESSTIMEOUT: SYSTEM_PARAMETERS_INFO_ACTION = 60u

public val SPI_GETACTIVEWINDOWTRACKING: SYSTEM_PARAMETERS_INFO_ACTION = 4096u

public val SPI_GETACTIVEWNDTRKTIMEOUT: SYSTEM_PARAMETERS_INFO_ACTION = 8194u

public val SPI_GETACTIVEWNDTRKZORDER: SYSTEM_PARAMETERS_INFO_ACTION = 4108u

public val SPI_GETANIMATION: SYSTEM_PARAMETERS_INFO_ACTION = 72u

public val SPI_GETAUDIODESCRIPTION: SYSTEM_PARAMETERS_INFO_ACTION = 116u

public val SPI_GETBEEP: SYSTEM_PARAMETERS_INFO_ACTION = 1u

public val SPI_GETBLOCKSENDINPUTRESETS: SYSTEM_PARAMETERS_INFO_ACTION = 4134u

public val SPI_GETBORDER: SYSTEM_PARAMETERS_INFO_ACTION = 5u

public val SPI_GETCARETBROWSING: SYSTEM_PARAMETERS_INFO_ACTION = 4172u

public val SPI_GETCARETTIMEOUT: SYSTEM_PARAMETERS_INFO_ACTION = 8226u

public val SPI_GETCARETWIDTH: SYSTEM_PARAMETERS_INFO_ACTION = 8198u

public val SPI_GETCLEARTYPE: SYSTEM_PARAMETERS_INFO_ACTION = 4168u

public val SPI_GETCLIENTAREAANIMATION: SYSTEM_PARAMETERS_INFO_ACTION = 4162u

public val SPI_GETCOMBOBOXANIMATION: SYSTEM_PARAMETERS_INFO_ACTION = 4100u

public val SPI_GETCONTACTVISUALIZATION: SYSTEM_PARAMETERS_INFO_ACTION = 8216u

public val SPI_GETCURSORSHADOW: SYSTEM_PARAMETERS_INFO_ACTION = 4122u

public val SPI_GETDEFAULTINPUTLANG: SYSTEM_PARAMETERS_INFO_ACTION = 89u

public val SPI_GETDESKWALLPAPER: SYSTEM_PARAMETERS_INFO_ACTION = 115u

public val SPI_GETDISABLEOVERLAPPEDCONTENT: SYSTEM_PARAMETERS_INFO_ACTION = 4160u

public val SPI_GETDOCKMOVING: SYSTEM_PARAMETERS_INFO_ACTION = 144u

public val SPI_GETDRAGFROMMAXIMIZE: SYSTEM_PARAMETERS_INFO_ACTION = 140u

public val SPI_GETDRAGFULLWINDOWS: SYSTEM_PARAMETERS_INFO_ACTION = 38u

public val SPI_GETDROPSHADOW: SYSTEM_PARAMETERS_INFO_ACTION = 4132u

public val SPI_GETFASTTASKSWITCH: SYSTEM_PARAMETERS_INFO_ACTION = 35u

public val SPI_GETFILTERKEYS: SYSTEM_PARAMETERS_INFO_ACTION = 50u

public val SPI_GETFLATMENU: SYSTEM_PARAMETERS_INFO_ACTION = 4130u

public val SPI_GETFOCUSBORDERHEIGHT: SYSTEM_PARAMETERS_INFO_ACTION = 8208u

public val SPI_GETFOCUSBORDERWIDTH: SYSTEM_PARAMETERS_INFO_ACTION = 8206u

public val SPI_GETFONTSMOOTHING: SYSTEM_PARAMETERS_INFO_ACTION = 74u

public val SPI_GETFONTSMOOTHINGCONTRAST: SYSTEM_PARAMETERS_INFO_ACTION = 8204u

public val SPI_GETFONTSMOOTHINGORIENTATION: SYSTEM_PARAMETERS_INFO_ACTION = 8210u

public val SPI_GETFONTSMOOTHINGTYPE: SYSTEM_PARAMETERS_INFO_ACTION = 8202u

public val SPI_GETFOREGROUNDFLASHCOUNT: SYSTEM_PARAMETERS_INFO_ACTION = 8196u

public val SPI_GETFOREGROUNDLOCKTIMEOUT: SYSTEM_PARAMETERS_INFO_ACTION = 8192u

public val SPI_GETGESTUREVISUALIZATION: SYSTEM_PARAMETERS_INFO_ACTION = 8218u

public val SPI_GETGRADIENTCAPTIONS: SYSTEM_PARAMETERS_INFO_ACTION = 4104u

public val SPI_GETGRIDGRANULARITY: SYSTEM_PARAMETERS_INFO_ACTION = 18u

public val SPI_GETHANDEDNESS: SYSTEM_PARAMETERS_INFO_ACTION = 8228u

public val SPI_GETHIGHCONTRAST: SYSTEM_PARAMETERS_INFO_ACTION = 66u

public val SPI_GETHOTTRACKING: SYSTEM_PARAMETERS_INFO_ACTION = 4110u

public val SPI_GETHUNGAPPTIMEOUT: SYSTEM_PARAMETERS_INFO_ACTION = 120u

public val SPI_GETICONMETRICS: SYSTEM_PARAMETERS_INFO_ACTION = 45u

public val SPI_GETICONTITLELOGFONT: SYSTEM_PARAMETERS_INFO_ACTION = 31u

public val SPI_GETICONTITLEWRAP: SYSTEM_PARAMETERS_INFO_ACTION = 25u

public val SPI_GETKEYBOARDCUES: SYSTEM_PARAMETERS_INFO_ACTION = 4106u

public val SPI_GETKEYBOARDDELAY: SYSTEM_PARAMETERS_INFO_ACTION = 22u

public val SPI_GETKEYBOARDPREF: SYSTEM_PARAMETERS_INFO_ACTION = 68u

public val SPI_GETKEYBOARDSPEED: SYSTEM_PARAMETERS_INFO_ACTION = 10u

public val SPI_GETLISTBOXSMOOTHSCROLLING: SYSTEM_PARAMETERS_INFO_ACTION = 4102u

public val SPI_GETLOGICALDPIOVERRIDE: SYSTEM_PARAMETERS_INFO_ACTION = 158u
