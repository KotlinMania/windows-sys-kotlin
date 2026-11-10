package io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap

public val ARW_BOTTOMLEFT: MinimizedmetricsArrange = 0

public val ARW_BOTTOMRIGHT: MinimizedmetricsArrange = 1

public val ARW_DOWN: Int = 4

public val ARW_HIDE: Int = 8

public val ARW_LEFT: Int = 0

public val ARW_RIGHT: Int = 0

public val ARW_STARTMASK: Int = 3

public val ARW_STARTRIGHT: Int = 1

public val ARW_STARTTOP: Int = 2

public val ARW_TOPLEFT: MinimizedmetricsArrange = 2

public val ARW_TOPRIGHT: MinimizedmetricsArrange = 3

public val ARW_UP: Int = 4

public val ASFW_ANY: UInt = 4294967295u

public val AW_ACTIVATE: AnimateWindowFlags = 131072u

public val AW_BLEND: AnimateWindowFlags = 524288u

public val AW_CENTER: AnimateWindowFlags = 16u

public val AW_HIDE: AnimateWindowFlags = 65536u

public val AW_HOR_NEGATIVE: AnimateWindowFlags = 2u

public val AW_HOR_POSITIVE: AnimateWindowFlags = 1u

public val AW_SLIDE: AnimateWindowFlags = 262144u

public val AW_VER_NEGATIVE: AnimateWindowFlags = 8u

public val AW_VER_POSITIVE: AnimateWindowFlags = 4u

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

public val CS_BYTEALIGNCLIENT: WndclassStyles = 4096u

public val CS_BYTEALIGNWINDOW: WndclassStyles = 8192u

public val CS_CLASSDC: WndclassStyles = 64u

public val CS_DBLCLKS: WndclassStyles = 8u

public val CS_DROPSHADOW: WndclassStyles = 131072u

public val CS_GLOBALCLASS: WndclassStyles = 16384u

public val CS_HREDRAW: WndclassStyles = 2u

public val CS_IME: WndclassStyles = 65536u

public val CS_NOCLOSE: WndclassStyles = 512u

public val CS_OWNDC: WndclassStyles = 32u

public val CS_PARENTDC: WndclassStyles = 128u

public val CS_SAVEBITS: WndclassStyles = 2048u

public val CS_VREDRAW: WndclassStyles = 1u

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

public val CURSOR_SHOWING: CursorinfoFlags = 1u

public val CURSOR_SUPPRESSED: CursorinfoFlags = 2u

public val CWF_CREATE_ONLY: UInt = 1u

public val CWP_ALL: CwpFlags = 0u

public val CWP_SKIPDISABLED: CwpFlags = 2u

public val CWP_SKIPINVISIBLE: CwpFlags = 1u

public val CWP_SKIPTRANSPARENT: CwpFlags = 4u

public val CW_USEDEFAULT: Int = -2147483648.toInt()

public val DBTF_MEDIA: DevBroadcastVolumeFlags = 1u.toUShort()

public val DBTF_NET: DevBroadcastVolumeFlags = 2u.toUShort()

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

public val DBT_DEVTYP_DEVICEINTERFACE: DevBroadcastHdrDeviceType = 5u

public val DBT_DEVTYP_DEVNODE: UInt = 1u

public val DBT_DEVTYP_HANDLE: DevBroadcastHdrDeviceType = 6u

public val DBT_DEVTYP_NET: UInt = 4u

public val DBT_DEVTYP_OEM: DevBroadcastHdrDeviceType = 0u

public val DBT_DEVTYP_PORT: DevBroadcastHdrDeviceType = 3u

public val DBT_DEVTYP_VOLUME: DevBroadcastHdrDeviceType = 2u

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

public val DEVICE_NOTIFY_ALL_INTERFACE_CLASSES: RegisterNotificationFlags = 4u

public val DEVICE_NOTIFY_CALLBACK: RegisterNotificationFlags = 2u

public val DEVICE_NOTIFY_SERVICE_HANDLE: RegisterNotificationFlags = 1u

public val DEVICE_NOTIFY_WINDOW_HANDLE: RegisterNotificationFlags = 0u

public val DIFFERENCE: UInt = 11u

public val DI_COMPAT: DiFlags = 4u

public val DI_DEFAULTSIZE: DiFlags = 8u

public val DI_IMAGE: DiFlags = 2u

public val DI_MASK: DiFlags = 1u

public val DI_NOMIRROR: DiFlags = 16u

public val DI_NORMAL: DiFlags = 3u

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

public val EDIT_CONTROL_FEATURE_ENTERPRISE_DATA_PROTECTION_PASTE_SUPPORT: EditControlFeature = 0

public val EDIT_CONTROL_FEATURE_PASTE_NOTIFICATIONS: EditControlFeature = 1

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

public val FALT: AccelVirtFlags = 16u.toUByte()

public val FAPPCOMMAND_KEY: UInt = 0u

public val FAPPCOMMAND_MASK: UInt = 61440u

public val FAPPCOMMAND_MOUSE: UInt = 32768u

public val FAPPCOMMAND_OEM: UInt = 4096u

public val FCONTROL: AccelVirtFlags = 8u.toUByte()

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

public val FLASHW_ALL: FlashwinfoFlags = 3u

public val FLASHW_CAPTION: FlashwinfoFlags = 1u

public val FLASHW_STOP: FlashwinfoFlags = 0u

public val FLASHW_TIMER: FlashwinfoFlags = 4u

public val FLASHW_TIMERNOFG: FlashwinfoFlags = 12u

public val FLASHW_TRAY: FlashwinfoFlags = 2u

public val FNOINVERT: AccelVirtFlags = 2u.toUByte()

public val FSHIFT: AccelVirtFlags = 4u.toUByte()

public val FVIRTKEY: AccelVirtFlags = 1u.toUByte()

public val GA_PARENT: GetAncestorFlags = 1u

public val GA_ROOT: GetAncestorFlags = 2u

public val GA_ROOTOWNER: GetAncestorFlags = 3u

public val GCF_INCLUDE_ANCESTORS: UInt = 1u

public val GCLP_HBRBACKGROUND: GetClassLongIndex = -10

public val GCLP_HCURSOR: GetClassLongIndex = -12

public val GCLP_HICON: GetClassLongIndex = -14

public val GCLP_HICONSM: GetClassLongIndex = -34

public val GCLP_HMODULE: GetClassLongIndex = -16

public val GCLP_MENUNAME: GetClassLongIndex = -8

public val GCLP_WNDPROC: GetClassLongIndex = -24

public val GCL_CBCLSEXTRA: GetClassLongIndex = -20

public val GCL_CBWNDEXTRA: GetClassLongIndex = -18

public val GCL_HBRBACKGROUND: GetClassLongIndex = -10

public val GCL_HCURSOR: GetClassLongIndex = -12

public val GCL_HICON: GetClassLongIndex = -14

public val GCL_HICONSM: GetClassLongIndex = -34

public val GCL_HMODULE: GetClassLongIndex = -16

public val GCL_MENUNAME: GetClassLongIndex = -8

public val GCL_STYLE: GetClassLongIndex = -26

public val GCL_WNDPROC: GetClassLongIndex = -24

public val GCW_ATOM: GetClassLongIndex = -32

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

public val GMDI_GOINTOPOPUPS: GetMenuDefaultItemFlags = 2u

public val GMDI_USEDISABLED: GetMenuDefaultItemFlags = 1u

public val GUI_16BITTASK: UInt = 0u

public val GUI_CARETBLINKING: GuithreadinfoFlags = 1u

public val GUI_INMENUMODE: GuithreadinfoFlags = 4u

public val GUI_INMOVESIZE: GuithreadinfoFlags = 2u

public val GUI_POPUPMENUMODE: GuithreadinfoFlags = 16u

public val GUI_SYSTEMMENUMODE: GuithreadinfoFlags = 8u

public val GWFS_INCLUDE_ANCESTORS: UInt = 1u

public val GWLP_HINSTANCE: WindowLongPtrIndex = -6

public val GWLP_HWNDPARENT: WindowLongPtrIndex = -8

public val GWLP_ID: WindowLongPtrIndex = -12

public val GWLP_USERDATA: WindowLongPtrIndex = -21

public val GWLP_WNDPROC: WindowLongPtrIndex = -4

public val GWL_EXSTYLE: WindowLongPtrIndex = -20

public val GWL_HINSTANCE: WindowLongPtrIndex = -6

public val GWL_HWNDPARENT: WindowLongPtrIndex = -8

public val GWL_ID: WindowLongPtrIndex = -12

public val GWL_STYLE: WindowLongPtrIndex = -16

public val GWL_USERDATA: WindowLongPtrIndex = -21

public val GWL_WNDPROC: WindowLongPtrIndex = -4

public val GW_CHILD: GetWindowCmd = 5u

public val GW_ENABLEDPOPUP: GetWindowCmd = 6u

public val GW_HWNDFIRST: GetWindowCmd = 0u

public val GW_HWNDLAST: GetWindowCmd = 1u

public val GW_HWNDNEXT: GetWindowCmd = 2u

public val GW_HWNDPREV: GetWindowCmd = 3u

public val GW_MAX: UInt = 5u

public val GW_OWNER: GetWindowCmd = 4u

public val HANDEDNESS_LEFT: Handedness = 0

public val HANDEDNESS_RIGHT: Handedness = 1

public val HBMMENU_CALLBACK: Hbitmap = COpaquePointer((-1).toLong())

public val HBMMENU_MBAR_CLOSE: Hbitmap = COpaquePointer(5.toLong())

public val HBMMENU_MBAR_CLOSE_D: Hbitmap = COpaquePointer(6.toLong())

public val HBMMENU_MBAR_MINIMIZE: Hbitmap = COpaquePointer(3.toLong())

public val HBMMENU_MBAR_MINIMIZE_D: Hbitmap = COpaquePointer(7.toLong())

public val HBMMENU_MBAR_RESTORE: Hbitmap = COpaquePointer(2.toLong())

public val HBMMENU_POPUP_CLOSE: Hbitmap = COpaquePointer(8.toLong())

public val HBMMENU_POPUP_MAXIMIZE: Hbitmap = COpaquePointer(10.toLong())

public val HBMMENU_POPUP_MINIMIZE: Hbitmap = COpaquePointer(11.toLong())

public val HBMMENU_POPUP_RESTORE: Hbitmap = COpaquePointer(9.toLong())

public val HBMMENU_SYSTEM: Hbitmap = COpaquePointer(1.toLong())

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

public val HWND_BOTTOM: Hwnd = COpaquePointer(1.toLong())

public val HWND_BROADCAST: Hwnd = COpaquePointer(65535.toLong())

public val HWND_DESKTOP: Hwnd = null

public val HWND_MESSAGE: Hwnd = COpaquePointer((-3).toLong())

public val HWND_NOTOPMOST: Hwnd = COpaquePointer((-2).toLong())

public val HWND_TOP: Hwnd = null

public val HWND_TOPMOST: Hwnd = COpaquePointer((-1).toLong())

public val ICON_BIG: UInt = 1u

public val ICON_SMALL: UInt = 0u

public val ICON_SMALL2: UInt = 2u

public val IDABORT: MessageboxResult = 3

public val IDANI_CAPTION: UInt = 3u

public val IDANI_OPEN: UInt = 1u

public val IDASYNC: MessageboxResult = 32001

public val IDCANCEL: MessageboxResult = 2

public val IDCLOSE: MessageboxResult = 8

public val IDCONTINUE: MessageboxResult = 11

public val IDC_APPSTARTING: Pcwstr = COpaquePointer((32650u.toUShort()).toLong())

public val IDC_ARROW: Pcwstr = COpaquePointer((32512u.toUShort()).toLong())

public val IDC_CROSS: Pcwstr = COpaquePointer((32515u.toUShort()).toLong())

public val IDC_HAND: Pcwstr = COpaquePointer((32649u.toUShort()).toLong())

public val IDC_HELP: Pcwstr = COpaquePointer((32651u.toUShort()).toLong())

public val IDC_IBEAM: Pcwstr = COpaquePointer((32513u.toUShort()).toLong())

public val IDC_ICON: Pcwstr = COpaquePointer((32641u.toUShort()).toLong())

public val IDC_NO: Pcwstr = COpaquePointer((32648u.toUShort()).toLong())

public val IDC_PERSON: Pcwstr = COpaquePointer((32672u.toUShort()).toLong())

public val IDC_PIN: Pcwstr = COpaquePointer((32671u.toUShort()).toLong())

public val IDC_SIZE: Pcwstr = COpaquePointer((32640u.toUShort()).toLong())

public val IDC_SIZEALL: Pcwstr = COpaquePointer((32646u.toUShort()).toLong())

public val IDC_SIZENESW: Pcwstr = COpaquePointer((32643u.toUShort()).toLong())

public val IDC_SIZENS: Pcwstr = COpaquePointer((32645u.toUShort()).toLong())

public val IDC_SIZENWSE: Pcwstr = COpaquePointer((32642u.toUShort()).toLong())

public val IDC_SIZEWE: Pcwstr = COpaquePointer((32644u.toUShort()).toLong())

public val IDC_STATIC: Int = -1

public val IDC_UPARROW: Pcwstr = COpaquePointer((32516u.toUShort()).toLong())

public val IDC_WAIT: Pcwstr = COpaquePointer((32514u.toUShort()).toLong())

public val IDHELP: MessageboxResult = 9

public val IDHOT_SNAPDESKTOP: Int = -2

public val IDHOT_SNAPWINDOW: Int = -1

public val IDH_CANCEL: UInt = 28444u

public val IDH_GENERIC_HELP_BUTTON: UInt = 28442u

public val IDH_HELP: UInt = 28445u

public val IDH_MISSING_CONTEXT: UInt = 28441u

public val IDH_NO_HELP: UInt = 28440u

public val IDH_OK: UInt = 28443u

public val IDIGNORE: MessageboxResult = 5

public val IDI_APPLICATION: Pcwstr = COpaquePointer(32512u.toLong())

public val IDI_ASTERISK: Pcwstr = COpaquePointer(32516u.toLong())

public val IDI_ERROR: Pcwstr = COpaquePointer(32513u.toLong())

public val IDI_EXCLAMATION: Pcwstr = COpaquePointer(32515u.toLong())

public val IDI_HAND: Pcwstr = COpaquePointer(32513u.toLong())

public val IDI_INFORMATION: Pcwstr = COpaquePointer(32516u.toLong())

public val IDI_QUESTION: Pcwstr = COpaquePointer(32514u.toLong())

public val IDI_SHIELD: Pcwstr = COpaquePointer(32518u.toLong())

public val IDI_WARNING: Pcwstr = COpaquePointer(32515u.toLong())

public val IDI_WINLOGO: Pcwstr = COpaquePointer(32517u.toLong())

public val IDNO: MessageboxResult = 7

public val IDOK: MessageboxResult = 1

public val IDRETRY: MessageboxResult = 4

public val IDTIMEOUT: MessageboxResult = 32000

public val IDTRYAGAIN: MessageboxResult = 10

public val IDYES: MessageboxResult = 6

public val IMAGE_BITMAP: GdiImageType = 0u

public val IMAGE_CURSOR: GdiImageType = 2u

public val IMAGE_ENHMETAFILE: UInt = 3u

public val IMAGE_ICON: GdiImageType = 1u

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

public val LLKHF_ALTDOWN: KbdllhookstructFlags = 32u

public val LLKHF_EXTENDED: KbdllhookstructFlags = 1u

public val LLKHF_INJECTED: KbdllhookstructFlags = 16u

public val LLKHF_LOWER_IL_INJECTED: KbdllhookstructFlags = 2u

public val LLKHF_UP: KbdllhookstructFlags = 128u

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

public val LR_COPYDELETEORG: ImageFlags = 8u

public val LR_COPYFROMRESOURCE: ImageFlags = 16384u

public val LR_COPYRETURNORG: ImageFlags = 4u

public val LR_CREATEDIBSECTION: ImageFlags = 8192u

public val LR_DEFAULTCOLOR: ImageFlags = 0u

public val LR_DEFAULTSIZE: ImageFlags = 64u

public val LR_LOADFROMFILE: ImageFlags = 16u

public val LR_LOADMAP3DCOLORS: ImageFlags = 4096u

public val LR_LOADTRANSPARENT: ImageFlags = 32u

public val LR_MONOCHROME: ImageFlags = 1u

public val LR_SHARED: ImageFlags = 32768u

public val LR_VGACOLOR: ImageFlags = 128u

public val LSFW_LOCK: ForegroundWindowLockCode = 1u

public val LSFW_UNLOCK: ForegroundWindowLockCode = 2u

public val LWA_ALPHA: LayeredWindowAttributesFlags = 2u

public val LWA_COLORKEY: LayeredWindowAttributesFlags = 1u

public val MAXIMUM_RESERVED_MANIFEST_RESOURCE_ID: UInt = 16u

public val MAX_LOGICALDPIOVERRIDE: UInt = 2u

public val MAX_STR_BLOCKREASON: UInt = 256u

public val MAX_TOUCH_COUNT: UInt = 256u

public val MAX_TOUCH_PREDICTION_FILTER_TAPS: UInt = 3u

public val MA_ACTIVATE: UInt = 1u

public val MA_ACTIVATEANDEAT: UInt = 2u

public val MA_NOACTIVATE: UInt = 3u

public val MA_NOACTIVATEANDEAT: UInt = 4u

public val MB_ABORTRETRYIGNORE: MessageboxStyle = 2u

public val MB_APPLMODAL: MessageboxStyle = 0u

public val MB_CANCELTRYCONTINUE: MessageboxStyle = 6u

public val MB_DEFAULT_DESKTOP_ONLY: MessageboxStyle = 131072u

public val MB_DEFBUTTON1: MessageboxStyle = 0u

public val MB_DEFBUTTON2: MessageboxStyle = 256u

public val MB_DEFBUTTON3: MessageboxStyle = 512u

public val MB_DEFBUTTON4: MessageboxStyle = 768u

public val MB_DEFMASK: MessageboxStyle = 3840u

public val MB_HELP: MessageboxStyle = 16384u

public val MB_ICONASTERISK: MessageboxStyle = 64u

public val MB_ICONERROR: MessageboxStyle = 16u

public val MB_ICONEXCLAMATION: MessageboxStyle = 48u

public val MB_ICONHAND: MessageboxStyle = 16u

public val MB_ICONINFORMATION: MessageboxStyle = 64u

public val MB_ICONMASK: MessageboxStyle = 240u

public val MB_ICONQUESTION: MessageboxStyle = 32u

public val MB_ICONSTOP: MessageboxStyle = 16u

public val MB_ICONWARNING: MessageboxStyle = 48u

public val MB_MISCMASK: MessageboxStyle = 49152u

public val MB_MODEMASK: MessageboxStyle = 12288u

public val MB_NOFOCUS: MessageboxStyle = 32768u

public val MB_OK: MessageboxStyle = 0u

public val MB_OKCANCEL: MessageboxStyle = 1u

public val MB_RETRYCANCEL: MessageboxStyle = 5u

public val MB_RIGHT: MessageboxStyle = 524288u

public val MB_RTLREADING: MessageboxStyle = 1048576u

public val MB_SERVICE_NOTIFICATION: MessageboxStyle = 2097152u

public val MB_SERVICE_NOTIFICATION_NT3X: MessageboxStyle = 262144u

public val MB_SETFOREGROUND: MessageboxStyle = 65536u

public val MB_SYSTEMMODAL: MessageboxStyle = 4096u

public val MB_TASKMODAL: MessageboxStyle = 8192u

public val MB_TOPMOST: MessageboxStyle = 262144u

public val MB_TYPEMASK: MessageboxStyle = 15u

public val MB_USERICON: MessageboxStyle = 128u

public val MB_YESNO: MessageboxStyle = 4u

public val MB_YESNOCANCEL: MessageboxStyle = 3u

public val MDIS_ALLCHILDSTYLES: UInt = 1u

public val MDITILE_HORIZONTAL: TileWindowsHow = 1u

public val MDITILE_SKIPDISABLED: CascadeWindowsHow = 2u

public val MDITILE_VERTICAL: TileWindowsHow = 0u

public val MDITILE_ZORDER: CascadeWindowsHow = 4u

public val METRICS_USEDEFAULT: Int = -1

public val MFS_CHECKED: MenuItemState = 8u

public val MFS_DEFAULT: MenuItemState = 4096u

public val MFS_DISABLED: MenuItemState = 3u

public val MFS_ENABLED: MenuItemState = 0u

public val MFS_GRAYED: MenuItemState = 3u

public val MFS_HILITE: MenuItemState = 128u

public val MFS_UNCHECKED: MenuItemState = 0u

public val MFS_UNHILITE: MenuItemState = 0u

public val MFT_BITMAP: MenuItemType = 4u

public val MFT_MENUBARBREAK: MenuItemType = 32u

public val MFT_MENUBREAK: MenuItemType = 64u

public val MFT_OWNERDRAW: MenuItemType = 256u

public val MFT_RADIOCHECK: MenuItemType = 512u

public val MFT_RIGHTJUSTIFY: MenuItemType = 16384u

public val MFT_RIGHTORDER: MenuItemType = 8192u

public val MFT_SEPARATOR: MenuItemType = 2048u

public val MFT_STRING: MenuItemType = 0u

public val MF_APPEND: MenuItemFlags = 256u

public val MF_BITMAP: MenuItemFlags = 4u

public val MF_BYCOMMAND: MenuItemFlags = 0u

public val MF_BYPOSITION: MenuItemFlags = 1024u

public val MF_CHANGE: MenuItemFlags = 128u

public val MF_CHECKED: MenuItemFlags = 8u

public val MF_DEFAULT: MenuItemFlags = 4096u

public val MF_DELETE: MenuItemFlags = 512u

public val MF_DISABLED: MenuItemFlags = 2u

public val MF_ENABLED: MenuItemFlags = 0u

public val MF_END: MenuItemFlags = 128u

public val MF_GRAYED: MenuItemFlags = 1u

public val MF_HELP: MenuItemFlags = 16384u

public val MF_HILITE: MenuItemFlags = 128u

public val MF_INSERT: MenuItemFlags = 0u

public val MF_MENUBARBREAK: MenuItemFlags = 32u

public val MF_MENUBREAK: MenuItemFlags = 64u

public val MF_MOUSESELECT: MenuItemFlags = 32768u

public val MF_OWNERDRAW: MenuItemFlags = 256u

public val MF_POPUP: MenuItemFlags = 16u

public val MF_REMOVE: MenuItemFlags = 4096u

public val MF_RIGHTJUSTIFY: MenuItemFlags = 16384u

public val MF_SEPARATOR: MenuItemFlags = 2048u

public val MF_STRING: MenuItemFlags = 0u

public val MF_SYSMENU: MenuItemFlags = 8192u

public val MF_UNCHECKED: MenuItemFlags = 0u

public val MF_UNHILITE: MenuItemFlags = 0u

public val MF_USECHECKBITMAPS: MenuItemFlags = 512u

public val MIIM_BITMAP: MenuItemMask = 128u

public val MIIM_CHECKMARKS: MenuItemMask = 8u

public val MIIM_DATA: MenuItemMask = 32u

public val MIIM_FTYPE: MenuItemMask = 256u

public val MIIM_ID: MenuItemMask = 2u

public val MIIM_STATE: MenuItemMask = 1u

public val MIIM_STRING: MenuItemMask = 64u

public val MIIM_SUBMENU: MenuItemMask = 4u

public val MIIM_TYPE: MenuItemMask = 16u

public val MIM_APPLYTOSUBMENUS: MenuinfoMask = 2147483648u

public val MIM_BACKGROUND: MenuinfoMask = 2u

public val MIM_HELPID: MenuinfoMask = 4u

public val MIM_MAXHEIGHT: MenuinfoMask = 1u

public val MIM_MENUDATA: MenuinfoMask = 8u

public val MIM_STYLE: MenuinfoMask = 16u

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

public val MNGOF_BOTTOMGAP: MenugetobjectinfoFlags = 2u

public val MNGOF_TOPGAP: MenugetobjectinfoFlags = 1u

public val MNGO_NOERROR: UInt = 1u

public val MNGO_NOINTERFACE: UInt = 0u

public val MNS_AUTODISMISS: MenuinfoStyle = 268435456u

public val MNS_CHECKORBMP: MenuinfoStyle = 67108864u

public val MNS_DRAGDROP: MenuinfoStyle = 536870912u

public val MNS_MODELESS: MenuinfoStyle = 1073741824u

public val MNS_NOCHECK: MenuinfoStyle = 2147483648u

public val MNS_NOTIFYBYPOS: MenuinfoStyle = 134217728u

public val MN_GETHMENU: UInt = 481u

public val MONITORINFOF_PRIMARY: UInt = 1u

public val MOUSEWHEEL_ROUTING_FOCUS: UInt = 0u

public val MOUSEWHEEL_ROUTING_HYBRID: UInt = 1u

public val MOUSEWHEEL_ROUTING_MOUSE_POS: UInt = 2u

public val MSGFLTINFO_ALLOWED_HIGHER: MsgfltinfoStatus = 3u

public val MSGFLTINFO_ALREADYALLOWED_FORWND: MsgfltinfoStatus = 1u

public val MSGFLTINFO_ALREADYDISALLOWED_FORWND: MsgfltinfoStatus = 2u

public val MSGFLTINFO_NONE: MsgfltinfoStatus = 0u

public val MSGFLT_ADD: ChangeWindowMessageFilterFlags = 1u

public val MSGFLT_ALLOW: WindowMessageFilterAction = 1u

public val MSGFLT_DISALLOW: WindowMessageFilterAction = 2u

public val MSGFLT_REMOVE: ChangeWindowMessageFilterFlags = 2u

public val MSGFLT_RESET: WindowMessageFilterAction = 0u

public val MSGF_DIALOGBOX: UInt = 0u

public val MSGF_MAX: UInt = 8u

public val MSGF_MENU: UInt = 2u

public val MSGF_MESSAGEBOX: UInt = 1u

public val MSGF_NEXTWINDOW: UInt = 6u

public val MSGF_SCROLLBAR: UInt = 5u

public val MSGF_USER: UInt = 4096u

public val MWMO_ALERTABLE: MsgWaitForMultipleObjectsExFlags = 2u

public val MWMO_INPUTAVAILABLE: MsgWaitForMultipleObjectsExFlags = 4u

public val MWMO_NONE: MsgWaitForMultipleObjectsExFlags = 0u

public val MWMO_WAITALL: MsgWaitForMultipleObjectsExFlags = 1u

public val MRM_DUMP_TYPE_BASIC: MrmDumpType = 0

public val MRM_DUMP_TYPE_DETAILED: MrmDumpType = 1

public val MRM_DUMP_TYPE_SCHEMA: MrmDumpType = 2

public val MRM_INDEXER_FLAGS_AUTO_MERGE: MrmIndexerFlags = 1

public val MRM_INDEXER_FLAGS_CREATE_CONTENT_CHECKSUM: MrmIndexerFlags = 2

public val MRM_INDEXER_FLAGS_NONE: MrmIndexerFlags = 0

public val MRM_PACKAGING_MODE_AUTO_SPLIT: MrmPackagingMode = 1

public val MRM_PACKAGING_MODE_RESOURCE_PACK: MrmPackagingMode = 2

public val MRM_PACKAGING_MODE_STANDALONE_FILE: MrmPackagingMode = 0

public val MRM_PACKAGING_OPTIONS_NONE: MrmPackagingOptions = 0

public val MRM_PACKAGING_OPTIONS_OMIT_SCHEMA_FROM_RESOURCE_PACKS: MrmPackagingOptions = 1

public val MRM_PACKAGING_OPTIONS_SPLIT_LANGUAGE_VARIANTS: MrmPackagingOptions = 2

public val MRM_PLATFORM_VERSION_DEFAULT: MrmPlatformVersion = 0

public val MRM_PLATFORM_VERSION_WINDOWS10_0_0_0: MrmPlatformVersion = 17432576

public val MRM_PLATFORM_VERSION_WINDOWS10_0_0_5: MrmPlatformVersion = 17432581

public val MRM_RESOURCE_INDEXER_MESSAGE_SEVERITY_ERROR: MrmResourceIndexerMessageSeverity = 3

public val MRM_RESOURCE_INDEXER_MESSAGE_SEVERITY_INFO: MrmResourceIndexerMessageSeverity = 1

public val MRM_RESOURCE_INDEXER_MESSAGE_SEVERITY_VERBOSE: MrmResourceIndexerMessageSeverity = 0

public val MRM_RESOURCE_INDEXER_MESSAGE_SEVERITY_WARNING: MrmResourceIndexerMessageSeverity = 2

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

public val OBJID_ALERT: ObjectIdentifier = -10

public val OBJID_CARET: ObjectIdentifier = -8

public val OBJID_CLIENT: ObjectIdentifier = -4

public val OBJID_CURSOR: ObjectIdentifier = -9

public val OBJID_HSCROLL: ObjectIdentifier = -6

public val OBJID_MENU: ObjectIdentifier = -3

public val OBJID_NATIVEOM: ObjectIdentifier = -16

public val OBJID_QUERYCLASSNAMEIDX: ObjectIdentifier = -12

public val OBJID_SIZEGRIP: ObjectIdentifier = -7

public val OBJID_SOUND: ObjectIdentifier = -11

public val OBJID_SYSMENU: ObjectIdentifier = -1

public val OBJID_TITLEBAR: ObjectIdentifier = -2

public val OBJID_VSCROLL: ObjectIdentifier = -5

public val OBJID_WINDOW: ObjectIdentifier = 0

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

public val OCR_APPSTARTING: SystemCursorId = 32650u

public val OCR_CROSS: SystemCursorId = 32515u

public val OCR_HAND: SystemCursorId = 32649u

public val OCR_HELP: SystemCursorId = 32651u

public val OCR_IBEAM: SystemCursorId = 32513u

public val OCR_ICOCUR: UInt = 32647u

public val OCR_ICON: UInt = 32641u

public val OCR_NO: SystemCursorId = 32648u

public val OCR_NORMAL: SystemCursorId = 32512u

public val OCR_SIZE: UInt = 32640u

public val OCR_SIZEALL: SystemCursorId = 32646u

public val OCR_SIZENESW: SystemCursorId = 32643u

public val OCR_SIZENS: SystemCursorId = 32645u

public val OCR_SIZENWSE: SystemCursorId = 32642u

public val OCR_SIZEWE: SystemCursorId = 32644u

public val OCR_UP: SystemCursorId = 32516u

public val OCR_WAIT: SystemCursorId = 32514u

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

public val PM_NOREMOVE: PeekMessageRemoveType = 0u

public val PM_NOYIELD: PeekMessageRemoveType = 2u

public val PM_QS_INPUT: PeekMessageRemoveType = 67567616u

public val PM_QS_PAINT: PeekMessageRemoveType = 2097152u

public val PM_QS_POSTMESSAGE: PeekMessageRemoveType = 9961472u

public val PM_QS_SENDMESSAGE: PeekMessageRemoveType = 4194304u

public val PM_REMOVE: PeekMessageRemoveType = 1u

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

public val PT_MOUSE: PointerInputType = 4

public val PT_PEN: PointerInputType = 3

public val PT_POINTER: PointerInputType = 1

public val PT_TOUCH: PointerInputType = 2

public val PT_TOUCHPAD: PointerInputType = 5

public val PWR_CRITICALRESUME: UInt = 3u

public val PWR_FAIL: Int = -1

public val PWR_OK: UInt = 1u

public val PWR_SUSPENDREQUEST: UInt = 1u

public val PWR_SUSPENDRESUME: UInt = 2u

public val PW_RENDERFULLCONTENT: UInt = 2u

public val QS_ALLEVENTS: QueueStatusFlags = 1215u

public val QS_ALLINPUT: QueueStatusFlags = 1279u

public val QS_ALLPOSTMESSAGE: QueueStatusFlags = 256u

public val QS_HOTKEY: QueueStatusFlags = 128u

public val QS_INPUT: QueueStatusFlags = 1031u

public val QS_KEY: QueueStatusFlags = 1u

public val QS_MOUSE: QueueStatusFlags = 6u

public val QS_MOUSEBUTTON: QueueStatusFlags = 4u

public val QS_MOUSEMOVE: QueueStatusFlags = 2u

public val QS_PAINT: QueueStatusFlags = 32u

public val QS_POINTER: UInt = 4096u

public val QS_POSTMESSAGE: QueueStatusFlags = 8u

public val QS_RAWINPUT: QueueStatusFlags = 1024u

public val QS_SENDMESSAGE: QueueStatusFlags = 64u

public val QS_TIMER: QueueStatusFlags = 16u

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

public val RT_ACCELERATOR: Pcwstr = COpaquePointer((9u.toUShort()).toLong())

public val RT_ANICURSOR: Pcwstr = COpaquePointer((21u.toUShort()).toLong())

public val RT_ANIICON: Pcwstr = COpaquePointer((22u.toUShort()).toLong())

public val RT_BITMAP: Pcwstr = COpaquePointer((2u.toUShort()).toLong())

public val RT_CURSOR: Pcwstr = COpaquePointer((1u.toUShort()).toLong())

public val RT_DIALOG: Pcwstr = COpaquePointer((5u.toUShort()).toLong())

public val RT_DLGINCLUDE: Pcwstr = COpaquePointer((17u.toUShort()).toLong())

public val RT_FONT: Pcwstr = COpaquePointer((8u.toUShort()).toLong())

public val RT_FONTDIR: Pcwstr = COpaquePointer((7u.toUShort()).toLong())

public val RT_GROUP_CURSOR: Pcwstr = COpaquePointer((12u.toUShort()).toLong())

public val RT_GROUP_ICON: Pcwstr = COpaquePointer((14u.toUShort()).toLong())

public val RT_HTML: Pcwstr = COpaquePointer((23u.toUShort()).toLong())

public val RT_ICON: Pcwstr = COpaquePointer((3u.toUShort()).toLong())

public val RT_MANIFEST: Pcwstr = COpaquePointer((24u.toUShort()).toLong())

public val RT_MENU: Pcwstr = COpaquePointer((4u.toUShort()).toLong())

public val RT_MESSAGETABLE: Pcwstr = COpaquePointer((11u.toUShort()).toLong())

public val RT_PLUGPLAY: Pcwstr = COpaquePointer((19u.toUShort()).toLong())

public val RT_VERSION: Pcwstr = COpaquePointer((16u.toUShort()).toLong())

public val RT_VXD: Pcwstr = COpaquePointer((20u.toUShort()).toLong())

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

public val SB_BOTH: ScrollbarConstants = 3

public val SB_BOTTOM: ScrollbarCommand = 7

public val SB_CTL: ScrollbarConstants = 2

public val SB_ENDSCROLL: ScrollbarCommand = 8

public val SB_HORZ: ScrollbarConstants = 0

public val SB_LEFT: ScrollbarCommand = 6

public val SB_LINEDOWN: ScrollbarCommand = 1

public val SB_LINELEFT: ScrollbarCommand = 0

public val SB_LINERIGHT: ScrollbarCommand = 1

public val SB_LINEUP: ScrollbarCommand = 0

public val SB_PAGEDOWN: ScrollbarCommand = 3

public val SB_PAGELEFT: ScrollbarCommand = 2

public val SB_PAGERIGHT: ScrollbarCommand = 3

public val SB_PAGEUP: ScrollbarCommand = 2

public val SB_RIGHT: ScrollbarCommand = 7

public val SB_THUMBPOSITION: ScrollbarCommand = 4

public val SB_THUMBTRACK: ScrollbarCommand = 5

public val SB_TOP: ScrollbarCommand = 6

public val SB_VERT: ScrollbarConstants = 1

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

public val SIF_ALL: ScrollinfoMask = 23u

public val SIF_DISABLENOSCROLL: ScrollinfoMask = 8u

public val SIF_PAGE: ScrollinfoMask = 2u

public val SIF_POS: ScrollinfoMask = 4u

public val SIF_RANGE: ScrollinfoMask = 1u

public val SIF_TRACKPOS: ScrollinfoMask = 16u

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

public val SMTO_ABORTIFHUNG: SendMessageTimeoutFlags = 2u

public val SMTO_BLOCK: SendMessageTimeoutFlags = 1u

public val SMTO_ERRORONEXIT: SendMessageTimeoutFlags = 32u

public val SMTO_NORMAL: SendMessageTimeoutFlags = 0u

public val SMTO_NOTIMEOUTIFNOTHUNG: SendMessageTimeoutFlags = 8u

public val SM_ARRANGE: SystemMetricsIndex = 56

public val SM_CARETBLINKINGENABLED: UInt = 8194u

public val SM_CLEANBOOT: SystemMetricsIndex = 67

public val SM_CMETRICS: UInt = 76u

public val SM_CMONITORS: SystemMetricsIndex = 80

public val SM_CMOUSEBUTTONS: SystemMetricsIndex = 43

public val SM_CONVERTIBLESLATEMODE: SystemMetricsIndex = 8195

public val SM_CXBORDER: SystemMetricsIndex = 5

public val SM_CXCURSOR: SystemMetricsIndex = 13

public val SM_CXDLGFRAME: SystemMetricsIndex = 7

public val SM_CXDOUBLECLK: SystemMetricsIndex = 36

public val SM_CXDRAG: SystemMetricsIndex = 68

public val SM_CXEDGE: SystemMetricsIndex = 45

public val SM_CXFIXEDFRAME: SystemMetricsIndex = 7

public val SM_CXFOCUSBORDER: SystemMetricsIndex = 83

public val SM_CXFRAME: SystemMetricsIndex = 32

public val SM_CXFULLSCREEN: SystemMetricsIndex = 16

public val SM_CXHSCROLL: SystemMetricsIndex = 21

public val SM_CXHTHUMB: SystemMetricsIndex = 10

public val SM_CXICON: SystemMetricsIndex = 11

public val SM_CXICONSPACING: SystemMetricsIndex = 38

public val SM_CXMAXIMIZED: SystemMetricsIndex = 61

public val SM_CXMAXTRACK: SystemMetricsIndex = 59

public val SM_CXMENUCHECK: SystemMetricsIndex = 71

public val SM_CXMENUSIZE: SystemMetricsIndex = 54

public val SM_CXMIN: SystemMetricsIndex = 28

public val SM_CXMINIMIZED: SystemMetricsIndex = 57

public val SM_CXMINSPACING: SystemMetricsIndex = 47

public val SM_CXMINTRACK: SystemMetricsIndex = 34

public val SM_CXPADDEDBORDER: SystemMetricsIndex = 92

public val SM_CXSCREEN: SystemMetricsIndex = 0

public val SM_CXSIZE: SystemMetricsIndex = 30

public val SM_CXSIZEFRAME: SystemMetricsIndex = 32

public val SM_CXSMICON: SystemMetricsIndex = 49

public val SM_CXSMSIZE: SystemMetricsIndex = 52

public val SM_CXVIRTUALSCREEN: SystemMetricsIndex = 78

public val SM_CXVSCROLL: SystemMetricsIndex = 2

public val SM_CYBORDER: SystemMetricsIndex = 6

public val SM_CYCAPTION: SystemMetricsIndex = 4

public val SM_CYCURSOR: SystemMetricsIndex = 14

public val SM_CYDLGFRAME: SystemMetricsIndex = 8

public val SM_CYDOUBLECLK: SystemMetricsIndex = 37

public val SM_CYDRAG: SystemMetricsIndex = 69

public val SM_CYEDGE: SystemMetricsIndex = 46

public val SM_CYFIXEDFRAME: SystemMetricsIndex = 8

public val SM_CYFOCUSBORDER: SystemMetricsIndex = 84

public val SM_CYFRAME: SystemMetricsIndex = 33

public val SM_CYFULLSCREEN: SystemMetricsIndex = 17

public val SM_CYHSCROLL: SystemMetricsIndex = 3

public val SM_CYICON: SystemMetricsIndex = 12

public val SM_CYICONSPACING: SystemMetricsIndex = 39

public val SM_CYKANJIWINDOW: SystemMetricsIndex = 18

public val SM_CYMAXIMIZED: SystemMetricsIndex = 62

public val SM_CYMAXTRACK: SystemMetricsIndex = 60

public val SM_CYMENU: SystemMetricsIndex = 15

public val SM_CYMENUCHECK: SystemMetricsIndex = 72

public val SM_CYMENUSIZE: SystemMetricsIndex = 55

public val SM_CYMIN: SystemMetricsIndex = 29

public val SM_CYMINIMIZED: SystemMetricsIndex = 58

public val SM_CYMINSPACING: SystemMetricsIndex = 48

public val SM_CYMINTRACK: SystemMetricsIndex = 35

public val SM_CYSCREEN: SystemMetricsIndex = 1

public val SM_CYSIZE: SystemMetricsIndex = 31

public val SM_CYSIZEFRAME: SystemMetricsIndex = 33

public val SM_CYSMCAPTION: SystemMetricsIndex = 51

public val SM_CYSMICON: SystemMetricsIndex = 50

public val SM_CYSMSIZE: SystemMetricsIndex = 53

public val SM_CYVIRTUALSCREEN: SystemMetricsIndex = 79

public val SM_CYVSCROLL: SystemMetricsIndex = 20

public val SM_CYVTHUMB: SystemMetricsIndex = 9

public val SM_DBCSENABLED: SystemMetricsIndex = 42

public val SM_DEBUG: SystemMetricsIndex = 22

public val SM_DIGITIZER: SystemMetricsIndex = 94

public val SM_IMMENABLED: SystemMetricsIndex = 82

public val SM_MAXIMUMTOUCHES: SystemMetricsIndex = 95

public val SM_MEDIACENTER: SystemMetricsIndex = 87

public val SM_MENUDROPALIGNMENT: SystemMetricsIndex = 40

public val SM_MIDEASTENABLED: SystemMetricsIndex = 74

public val SM_MOUSEHORIZONTALWHEELPRESENT: SystemMetricsIndex = 91

public val SM_MOUSEPRESENT: SystemMetricsIndex = 19

public val SM_MOUSEWHEELPRESENT: SystemMetricsIndex = 75

public val SM_NETWORK: SystemMetricsIndex = 63

public val SM_PENWINDOWS: SystemMetricsIndex = 41

public val SM_REMOTECONTROL: SystemMetricsIndex = 8193

public val SM_REMOTESESSION: SystemMetricsIndex = 4096

public val SM_RESERVED1: UInt = 24u

public val SM_RESERVED2: UInt = 25u

public val SM_RESERVED3: UInt = 26u

public val SM_RESERVED4: UInt = 27u

public val SM_SAMEDISPLAYFORMAT: SystemMetricsIndex = 81

public val SM_SECURE: SystemMetricsIndex = 44

public val SM_SERVERR2: SystemMetricsIndex = 89

public val SM_SHOWSOUNDS: SystemMetricsIndex = 70

public val SM_SHUTTINGDOWN: SystemMetricsIndex = 8192

public val SM_SLOWMACHINE: SystemMetricsIndex = 73

public val SM_STARTER: SystemMetricsIndex = 88

public val SM_SWAPBUTTON: SystemMetricsIndex = 23

public val SM_SYSTEMDOCKED: SystemMetricsIndex = 8196

public val SM_TABLETPC: SystemMetricsIndex = 86

public val SM_XVIRTUALSCREEN: SystemMetricsIndex = 76

public val SM_YVIRTUALSCREEN: SystemMetricsIndex = 77

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

public val SPIF_SENDCHANGE: SystemParametersInfoUpdateFlags = 2u

public val SPIF_SENDWININICHANGE: SystemParametersInfoUpdateFlags = 2u

public val SPIF_UPDATEINIFILE: SystemParametersInfoUpdateFlags = 1u

public val SPI_GETACCESSTIMEOUT: SystemParametersInfoAction = 60u

public val SPI_GETACTIVEWINDOWTRACKING: SystemParametersInfoAction = 4096u

public val SPI_GETACTIVEWNDTRKTIMEOUT: SystemParametersInfoAction = 8194u

public val SPI_GETACTIVEWNDTRKZORDER: SystemParametersInfoAction = 4108u

public val SPI_GETANIMATION: SystemParametersInfoAction = 72u

public val SPI_GETAUDIODESCRIPTION: SystemParametersInfoAction = 116u

public val SPI_GETBEEP: SystemParametersInfoAction = 1u

public val SPI_GETBLOCKSENDINPUTRESETS: SystemParametersInfoAction = 4134u

public val SPI_GETBORDER: SystemParametersInfoAction = 5u

public val SPI_GETCARETBROWSING: SystemParametersInfoAction = 4172u

public val SPI_GETCARETTIMEOUT: SystemParametersInfoAction = 8226u

public val SPI_GETCARETWIDTH: SystemParametersInfoAction = 8198u

public val SPI_GETCLEARTYPE: SystemParametersInfoAction = 4168u

public val SPI_GETCLIENTAREAANIMATION: SystemParametersInfoAction = 4162u

public val SPI_GETCOMBOBOXANIMATION: SystemParametersInfoAction = 4100u

public val SPI_GETCONTACTVISUALIZATION: SystemParametersInfoAction = 8216u

public val SPI_GETCURSORSHADOW: SystemParametersInfoAction = 4122u

public val SPI_GETDEFAULTINPUTLANG: SystemParametersInfoAction = 89u

public val SPI_GETDESKWALLPAPER: SystemParametersInfoAction = 115u

public val SPI_GETDISABLEOVERLAPPEDCONTENT: SystemParametersInfoAction = 4160u

public val SPI_GETDOCKMOVING: SystemParametersInfoAction = 144u

public val SPI_GETDRAGFROMMAXIMIZE: SystemParametersInfoAction = 140u

public val SPI_GETDRAGFULLWINDOWS: SystemParametersInfoAction = 38u

public val SPI_GETDROPSHADOW: SystemParametersInfoAction = 4132u

public val SPI_GETFASTTASKSWITCH: SystemParametersInfoAction = 35u

public val SPI_GETFILTERKEYS: SystemParametersInfoAction = 50u

public val SPI_GETFLATMENU: SystemParametersInfoAction = 4130u

public val SPI_GETFOCUSBORDERHEIGHT: SystemParametersInfoAction = 8208u

public val SPI_GETFOCUSBORDERWIDTH: SystemParametersInfoAction = 8206u

public val SPI_GETFONTSMOOTHING: SystemParametersInfoAction = 74u

public val SPI_GETFONTSMOOTHINGCONTRAST: SystemParametersInfoAction = 8204u

public val SPI_GETFONTSMOOTHINGORIENTATION: SystemParametersInfoAction = 8210u

public val SPI_GETFONTSMOOTHINGTYPE: SystemParametersInfoAction = 8202u

public val SPI_GETFOREGROUNDFLASHCOUNT: SystemParametersInfoAction = 8196u

public val SPI_GETFOREGROUNDLOCKTIMEOUT: SystemParametersInfoAction = 8192u

public val SPI_GETGESTUREVISUALIZATION: SystemParametersInfoAction = 8218u

public val SPI_GETGRADIENTCAPTIONS: SystemParametersInfoAction = 4104u

public val SPI_GETGRIDGRANULARITY: SystemParametersInfoAction = 18u

public val SPI_GETHANDEDNESS: SystemParametersInfoAction = 8228u

public val SPI_GETHIGHCONTRAST: SystemParametersInfoAction = 66u

public val SPI_GETHOTTRACKING: SystemParametersInfoAction = 4110u

public val SPI_GETHUNGAPPTIMEOUT: SystemParametersInfoAction = 120u

public val SPI_GETICONMETRICS: SystemParametersInfoAction = 45u

public val SPI_GETICONTITLELOGFONT: SystemParametersInfoAction = 31u

public val SPI_GETICONTITLEWRAP: SystemParametersInfoAction = 25u

public val SPI_GETKEYBOARDCUES: SystemParametersInfoAction = 4106u

public val SPI_GETKEYBOARDDELAY: SystemParametersInfoAction = 22u

public val SPI_GETKEYBOARDPREF: SystemParametersInfoAction = 68u

public val SPI_GETKEYBOARDSPEED: SystemParametersInfoAction = 10u

public val SPI_GETLISTBOXSMOOTHSCROLLING: SystemParametersInfoAction = 4102u

public val SPI_GETLOGICALDPIOVERRIDE: SystemParametersInfoAction = 158u

public val SPI_GETLOWPOWERACTIVE: SystemParametersInfoAction = 83u

public val SPI_GETLOWPOWERTIMEOUT: SystemParametersInfoAction = 79u

public val SPI_GETMENUANIMATION: SystemParametersInfoAction = 4098u

public val SPI_GETMENUDROPALIGNMENT: SystemParametersInfoAction = 27u

public val SPI_GETMENUFADE: SystemParametersInfoAction = 4114u

public val SPI_GETMENURECT: SystemParametersInfoAction = 162u

public val SPI_GETMENUSHOWDELAY: SystemParametersInfoAction = 106u

public val SPI_GETMENUUNDERLINES: SystemParametersInfoAction = 4106u

public val SPI_GETMESSAGEDURATION: SystemParametersInfoAction = 8214u

public val SPI_GETMINIMIZEDMETRICS: SystemParametersInfoAction = 43u

public val SPI_GETMINIMUMHITRADIUS: SystemParametersInfoAction = 8212u

public val SPI_GETMOUSE: SystemParametersInfoAction = 3u

public val SPI_GETMOUSECLICKLOCK: SystemParametersInfoAction = 4126u

public val SPI_GETMOUSECLICKLOCKTIME: SystemParametersInfoAction = 8200u

public val SPI_GETMOUSEDOCKTHRESHOLD: SystemParametersInfoAction = 126u

public val SPI_GETMOUSEDRAGOUTTHRESHOLD: SystemParametersInfoAction = 132u

public val SPI_GETMOUSEHOVERHEIGHT: SystemParametersInfoAction = 100u

public val SPI_GETMOUSEHOVERTIME: SystemParametersInfoAction = 102u

public val SPI_GETMOUSEHOVERWIDTH: SystemParametersInfoAction = 98u

public val SPI_GETMOUSEKEYS: SystemParametersInfoAction = 54u

public val SPI_GETMOUSESIDEMOVETHRESHOLD: SystemParametersInfoAction = 136u

public val SPI_GETMOUSESONAR: SystemParametersInfoAction = 4124u

public val SPI_GETMOUSESPEED: SystemParametersInfoAction = 112u

public val SPI_GETMOUSETRAILS: SystemParametersInfoAction = 94u

public val SPI_GETMOUSEVANISH: SystemParametersInfoAction = 4128u

public val SPI_GETMOUSEWHEELROUTING: SystemParametersInfoAction = 8220u

public val SPI_GETNONCLIENTMETRICS: SystemParametersInfoAction = 41u

public val SPI_GETPENARBITRATIONTYPE: SystemParametersInfoAction = 8224u

public val SPI_GETPENDOCKTHRESHOLD: SystemParametersInfoAction = 128u

public val SPI_GETPENDRAGOUTTHRESHOLD: SystemParametersInfoAction = 134u

public val SPI_GETPENSIDEMOVETHRESHOLD: SystemParametersInfoAction = 138u

public val SPI_GETPENVISUALIZATION: SystemParametersInfoAction = 8222u

public val SPI_GETPOWEROFFACTIVE: SystemParametersInfoAction = 84u
