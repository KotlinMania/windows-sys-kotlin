package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val E_ALL_WILD: Hresult = 0x80001055u.toInt()

public val E_ALREADYINIT: Hresult = 0x80001083u.toInt()

public val E_ALREADYOPEN: Hresult = 0x80001013u.toInt()

public val E_ASSERT: Hresult = 0x80001006u.toInt()

public val E_BADBREAKER: Hresult = 0x80001053u.toInt()

public val E_BADFILE: Hresult = 0x80001003u.toInt()

public val E_BADFILTERSIZE: Hresult = 0x80001018u.toInt()

public val E_BADFORMAT: Hresult = 0x80001004u.toInt()

public val E_BADINDEXFLAGS: Hresult = 0x80001060u.toInt()

public val E_BADPARAM: Hresult = 0x80001011u.toInt()

public val E_BADRANGEOP: Hresult = 0x8000105Du.toInt()

public val E_BADVALUE: Hresult = 0x80001054u.toInt()

public val E_BADVERSION: Hresult = 0x80001002u.toInt()

public val E_CANTFINDDLL: Hresult = 0x8000100Eu.toInt()

public val E_DISKFULL: Hresult = 0x80001038u.toInt()

public val E_DUPLICATE: Hresult = 0x80001001u.toInt()

public val E_EXPECTEDTERM: Hresult = 0x80001057u.toInt()

public val E_FILECLOSE: Hresult = 0x80001031u.toInt()

public val E_FILECREATE: Hresult = 0x80001030u.toInt()

public val E_FILEDELETE: Hresult = 0x80001035u.toInt()

public val E_FILEINVALID: Hresult = 0x80001036u.toInt()

public val E_FILENOTFOUND: Hresult = 0x80001037u.toInt()

public val E_FILEREAD: Hresult = 0x80001032u.toInt()

public val E_FILESEEK: Hresult = 0x80001033u.toInt()

public val E_FILEWRITE: Hresult = 0x80001034u.toInt()

public val E_GETLASTERROR: Hresult = 0x80001010u.toInt()

public val E_GROUPIDTOOBIG: Hresult = 0x8000100Au.toInt()

public val E_INTERRUPT: Hresult = 0x80001007u.toInt()

public val E_INVALIDSTATE: Hresult = 0x80001012u.toInt()

public val E_MISSINGPROP: Hresult = 0x80001080u.toInt()

public val E_MISSLPAREN: Hresult = 0x80001058u.toInt()

public val E_MISSQUOTE: Hresult = 0x8000105Au.toInt()

public val E_MISSRPAREN: Hresult = 0x80001059u.toInt()

public val E_NAMETOOLONG: Hresult = 0x80001020u.toInt()

public val E_NOHANDLE: Hresult = 0x8000100Fu.toInt()

public val E_NOKEYPROP: Hresult = 0x80001087u.toInt()

public val E_NOMERGEDDATA: Hresult = 0x8000100Cu.toInt()

public val E_NOPERMISSION: Hresult = 0x80001005u.toInt()

public val E_NOSTEMMER: Hresult = 0x80001062u.toInt()

public val E_NOTEXIST: Hresult = 0x80001000u.toInt()

public val E_NOTFOUND: Hresult = 0x8000100Du.toInt()

public val E_NOTINIT: Hresult = 0x80001084u.toInt()

public val E_NOTOPEN: Hresult = 0x80001013u.toInt()

public val E_NOTSUPPORTED: Hresult = 0x80001008u.toInt()

public val E_NULLQUERY: Hresult = 0x8000105Bu.toInt()

public val E_OUTOFRANGE: Hresult = 0x80001009u.toInt()

public val E_PROPLISTEMPTY: Hresult = 0x80001082u.toInt()

public val E_PROPLISTNOTEMPTY: Hresult = 0x80001081u.toInt()

public val E_RESULTSETEMPTY: Hresult = 0x80001085u.toInt()

public val E_STOPWORD: Hresult = 0x8000105Cu.toInt()

public val E_TOODEEP: Hresult = 0x80001056u.toInt()

public val E_TOOMANYCOLUMNS: Hresult = 0x80001086u.toInt()

public val E_TOOMANYDUPS: Hresult = 0x80001051u.toInt()

public val E_TOOMANYOBJECTS: Hresult = 0x80001019u.toInt()

public val E_TOOMANYTITLES: Hresult = 0x8000100Bu.toInt()

public val E_TOOMANYTOPICS: Hresult = 0x80001050u.toInt()

public val E_TREETOOBIG: Hresult = 0x80001052u.toInt()

public val E_UNKNOWN_TRANSPORT: Hresult = 0x80001016u.toInt()

public val E_UNMATCHEDTYPE: Hresult = 0x8000105Eu.toInt()

public val E_UNSUPPORTED_TRANSPORT: Hresult = 0x80001017u.toInt()

public val E_WILD_IN_DTYPE: Hresult = 0x80001061u.toInt()

public val E_WORDTOOLONG: Hresult = 0x8000105Fu.toInt()

public val HHACT_BACK: Int = 7

public val HHACT_CONTRACT: Int = 6

public val HHACT_CUSTOMIZE: Int = 16

public val HHACT_EXPAND: Int = 5

public val HHACT_FORWARD: Int = 8

public val HHACT_HIGHLIGHT: Int = 15

public val HHACT_HOME: Int = 11

public val HHACT_JUMP1: Int = 17

public val HHACT_JUMP2: Int = 18

public val HHACT_LAST_ENUM: Int = 23

public val HHACT_NOTES: Int = 22

public val HHACT_OPTIONS: Int = 13

public val HHACT_PRINT: Int = 14

public val HHACT_REFRESH: Int = 10

public val HHACT_STOP: Int = 9

public val HHACT_SYNC: Int = 12

public val HHACT_TAB_CONTENTS: Int = 0

public val HHACT_TAB_FAVORITES: Int = 4

public val HHACT_TAB_HISTORY: Int = 3

public val HHACT_TAB_INDEX: Int = 1

public val HHACT_TAB_SEARCH: Int = 2

public val HHACT_TOC_NEXT: Int = 20

public val HHACT_TOC_PREV: Int = 21

public val HHACT_ZOOM: Int = 19

public val HHN_FIRST: UInt = 4294966436u

public val HHN_LAST: UInt = 4294966417u

public val HHN_NAVCOMPLETE: UInt = 4294966436u

public val HHN_TRACK: UInt = 4294966435u

public val HHN_WINDOW_CREATE: UInt = 4294966434u

public val HHWIN_BUTTON_BACK: UInt = 4u

public val HHWIN_BUTTON_BROWSE_BCK: UInt = 256u

public val HHWIN_BUTTON_BROWSE_FWD: UInt = 128u

public val HHWIN_BUTTON_CONTENTS: UInt = 1024u

public val HHWIN_BUTTON_EXPAND: UInt = 2u

public val HHWIN_BUTTON_FAVORITES: UInt = 131072u

public val HHWIN_BUTTON_FORWARD: UInt = 8u

public val HHWIN_BUTTON_HISTORY: UInt = 65536u

public val HHWIN_BUTTON_HOME: UInt = 64u

public val HHWIN_BUTTON_INDEX: UInt = 16384u

public val HHWIN_BUTTON_JUMP1: UInt = 262144u

public val HHWIN_BUTTON_JUMP2: UInt = 524288u

public val HHWIN_BUTTON_NOTES: UInt = 512u

public val HHWIN_BUTTON_OPTIONS: UInt = 4096u

public val HHWIN_BUTTON_PRINT: UInt = 8192u

public val HHWIN_BUTTON_REFRESH: UInt = 32u

public val HHWIN_BUTTON_SEARCH: UInt = 32768u

public val HHWIN_BUTTON_STOP: UInt = 16u

public val HHWIN_BUTTON_SYNC: UInt = 2048u

public val HHWIN_BUTTON_TOC_NEXT: UInt = 2097152u

public val HHWIN_BUTTON_TOC_PREV: UInt = 4194304u

public val HHWIN_BUTTON_ZOOM: UInt = 1048576u

public val HHWIN_NAVTAB_BOTTOM: Int = 2

public val HHWIN_NAVTAB_LEFT: Int = 1

public val HHWIN_NAVTAB_TOP: Int = 0

public val HHWIN_NAVTYPE_AUTHOR: Int = 5

public val HHWIN_NAVTYPE_CUSTOM_FIRST: Int = 11

public val HHWIN_NAVTYPE_FAVORITES: Int = 3

public val HHWIN_NAVTYPE_HISTORY: Int = 4

public val HHWIN_NAVTYPE_INDEX: Int = 1

public val HHWIN_NAVTYPE_SEARCH: Int = 2

public val HHWIN_NAVTYPE_TOC: Int = 0

public val HHWIN_PARAM_CUR_TAB: UInt = 8192u

public val HHWIN_PARAM_EXPANSION: UInt = 512u

public val HHWIN_PARAM_EXSTYLES: UInt = 8u

public val HHWIN_PARAM_HISTORY_COUNT: UInt = 4096u

public val HHWIN_PARAM_INFOTYPES: UInt = 128u

public val HHWIN_PARAM_NAV_WIDTH: UInt = 32u

public val HHWIN_PARAM_PROPERTIES: UInt = 2u

public val HHWIN_PARAM_RECT: UInt = 16u

public val HHWIN_PARAM_SHOWSTATE: UInt = 64u

public val HHWIN_PARAM_STYLES: UInt = 4u

public val HHWIN_PARAM_TABORDER: UInt = 2048u

public val HHWIN_PARAM_TABPOS: UInt = 1024u

public val HHWIN_PARAM_TB_FLAGS: UInt = 256u

public val HHWIN_PROP_AUTO_SYNC: UInt = 256u

public val HHWIN_PROP_CHANGE_TITLE: UInt = 8192u

public val HHWIN_PROP_MENU: UInt = 65536u

public val HHWIN_PROP_NAV_ONLY_WIN: UInt = 16384u

public val HHWIN_PROP_NODEF_EXSTYLES: UInt = 16u

public val HHWIN_PROP_NODEF_STYLES: UInt = 8u

public val HHWIN_PROP_NOTB_TEXT: UInt = 64u

public val HHWIN_PROP_NOTITLEBAR: UInt = 4u

public val HHWIN_PROP_NO_TOOLBAR: UInt = 32768u

public val HHWIN_PROP_ONTOP: UInt = 2u

public val HHWIN_PROP_POST_QUIT: UInt = 128u

public val HHWIN_PROP_TAB_ADVSEARCH: UInt = 131072u

public val HHWIN_PROP_TAB_AUTOHIDESHOW: UInt = 1u

public val HHWIN_PROP_TAB_CUSTOM1: UInt = 524288u

public val HHWIN_PROP_TAB_CUSTOM2: UInt = 1048576u

public val HHWIN_PROP_TAB_CUSTOM3: UInt = 2097152u

public val HHWIN_PROP_TAB_CUSTOM4: UInt = 4194304u

public val HHWIN_PROP_TAB_CUSTOM5: UInt = 8388608u

public val HHWIN_PROP_TAB_CUSTOM6: UInt = 16777216u

public val HHWIN_PROP_TAB_CUSTOM7: UInt = 33554432u

public val HHWIN_PROP_TAB_CUSTOM8: UInt = 67108864u

public val HHWIN_PROP_TAB_CUSTOM9: UInt = 134217728u

public val HHWIN_PROP_TAB_FAVORITES: UInt = 4096u

public val HHWIN_PROP_TAB_HISTORY: UInt = 2048u

public val HHWIN_PROP_TAB_SEARCH: UInt = 1024u

public val HHWIN_PROP_TRACKING: UInt = 512u

public val HHWIN_PROP_TRI_PANE: UInt = 32u

public val HHWIN_PROP_USER_POS: UInt = 262144u

public val HHWIN_TB_MARGIN: UInt = 268435456u

public val HH_ALINK_LOOKUP: HtmlHelpCommand = 19

public val HH_CLOSE_ALL: HtmlHelpCommand = 18

public val HH_DISPLAY_INDEX: HtmlHelpCommand = 2

public val HH_DISPLAY_SEARCH: HtmlHelpCommand = 3

public val HH_DISPLAY_TEXT_POPUP: HtmlHelpCommand = 14

public val HH_DISPLAY_TOC: HtmlHelpCommand = 1

public val HH_DISPLAY_TOPIC: HtmlHelpCommand = 0

public val HH_ENUM_CATEGORY: HtmlHelpCommand = 21

public val HH_ENUM_CATEGORY_IT: HtmlHelpCommand = 22

public val HH_ENUM_INFO_TYPE: HtmlHelpCommand = 7

public val HH_FTS_DEFAULT_PROXIMITY: HtmlHelpCommand = -1

public val HH_GET_LAST_ERROR: HtmlHelpCommand = 20

public val HH_GET_WIN_HANDLE: HtmlHelpCommand = 6

public val HH_GET_WIN_TYPE: HtmlHelpCommand = 5

public val HH_GPROPID_CONTENT_LANGUAGE: HhGpropid = 5

public val HH_GPROPID_CURRENT_SUBSET: HhGpropid = 4

public val HH_GPROPID_SINGLETHREAD: HhGpropid = 1

public val HH_GPROPID_TOOLBAR_MARGIN: HhGpropid = 2

public val HH_GPROPID_UI_LANGUAGE: HhGpropid = 3

public val HH_HELP_CONTEXT: HtmlHelpCommand = 15

public val HH_HELP_FINDER: HtmlHelpCommand = 0

public val HH_INITIALIZE: HtmlHelpCommand = 28

public val HH_KEYWORD_LOOKUP: HtmlHelpCommand = 13

public val HH_MAX_TABS: HtmlHelpCommand = 19

public val HH_MAX_TABS_CUSTOM: HtmlHelpCommand = 9

public val HH_PRETRANSLATEMESSAGE: HtmlHelpCommand = 253

public val HH_RESERVED1: HtmlHelpCommand = 10

public val HH_RESERVED2: HtmlHelpCommand = 11

public val HH_RESERVED3: HtmlHelpCommand = 12

public val HH_RESET_IT_FILTER: HtmlHelpCommand = 23

public val HH_SAFE_DISPLAY_TOPIC: HtmlHelpCommand = 32

public val HH_SET_EXCLUSIVE_FILTER: HtmlHelpCommand = 25

public val HH_SET_GLOBAL_PROPERTY: HtmlHelpCommand = 252

public val HH_SET_INCLUSIVE_FILTER: HtmlHelpCommand = 24

public val HH_SET_INFO_TYPE: HtmlHelpCommand = 8

public val HH_SET_QUERYSERVICE: HtmlHelpCommand = 30

public val HH_SET_WIN_TYPE: HtmlHelpCommand = 4

public val HH_SYNC: HtmlHelpCommand = 9

public val HH_TAB_AUTHOR: Int = 5

public val HH_TAB_CONTENTS: Int = 0

public val HH_TAB_CUSTOM_FIRST: Int = 11

public val HH_TAB_CUSTOM_LAST: Int = 19

public val HH_TAB_FAVORITES: Int = 3

public val HH_TAB_HISTORY: Int = 4

public val HH_TAB_INDEX: Int = 1

public val HH_TAB_SEARCH: Int = 2

public val HH_TP_HELP_CONTEXTMENU: HtmlHelpCommand = 16

public val HH_TP_HELP_WM_HELP: HtmlHelpCommand = 17

public val HH_UNINITIALIZE: HtmlHelpCommand = 29

public val IDTB_BACK: UInt = 204u

public val IDTB_BROWSE_BACK: UInt = 212u

public val IDTB_BROWSE_FWD: UInt = 211u

public val IDTB_CONTENTS: UInt = 213u

public val IDTB_CONTRACT: UInt = 201u

public val IDTB_CUSTOMIZE: UInt = 221u

public val IDTB_EXPAND: UInt = 200u

public val IDTB_FAVORITES: UInt = 217u

public val IDTB_FORWARD: UInt = 209u

public val IDTB_HISTORY: UInt = 216u

public val IDTB_HOME: UInt = 205u

public val IDTB_INDEX: UInt = 214u

public val IDTB_JUMP1: UInt = 218u

public val IDTB_JUMP2: UInt = 219u

public val IDTB_NOTES: UInt = 210u

public val IDTB_OPTIONS: UInt = 208u

public val IDTB_PRINT: UInt = 207u

public val IDTB_REFRESH: UInt = 203u

public val IDTB_SEARCH: UInt = 215u

public val IDTB_STOP: UInt = 202u

public val IDTB_SYNC: UInt = 206u

public val IDTB_TOC_NEXT: UInt = 223u

public val IDTB_TOC_PREV: UInt = 224u

public val IDTB_ZOOM: UInt = 222u

public val IITWBC_BREAK_ACCEPT_WILDCARDS: UInt = 1u

public val IITWBC_BREAK_AND_STEM: UInt = 2u

public val ITWW_CBKEY_MAX: UInt = 1024u

public val ITWW_OPEN_NOCONNECT: UInt = 1u

public val IT_EXCLUSIVE: Int = 1

public val IT_HIDDEN: Int = 2

public val IT_INCLUSIVE: Int = 0

public val MAX_COLUMNS: UInt = 256u

public val PRIORITY_HIGH: Priority = 2

public val PRIORITY_LOW: Priority = 0

public val PRIORITY_NORMAL: Priority = 1

public val PROP_ADD: UInt = 0u

public val PROP_DELETE: UInt = 1u

public val PROP_UPDATE: UInt = 2u

public val STDPROP_DISPLAYKEY: UInt = 101u

public val STDPROP_INDEX_BREAK: UInt = 204u

public val STDPROP_INDEX_DTYPE: UInt = 202u

public val STDPROP_INDEX_LENGTH: UInt = 203u

public val STDPROP_INDEX_TERM: UInt = 210u

public val STDPROP_INDEX_TERM_RAW_LENGTH: UInt = 211u

public val STDPROP_INDEX_TEXT: UInt = 200u

public val STDPROP_INDEX_VFLD: UInt = 201u

public val STDPROP_KEY: UInt = 4u

public val STDPROP_SORTKEY: UInt = 100u

public val STDPROP_SORTORDINAL: UInt = 102u

public val STDPROP_TITLE: UInt = 2u

public val STDPROP_UID: UInt = 1u

public val STDPROP_USERDATA: UInt = 3u

public val STDPROP_USERPROP_BASE: UInt = 65536u

public val STDPROP_USERPROP_MAX: UInt = 2147483647u

public val SZ_WWDEST_GLOBAL: Pcwstr = w("GLOBAL")

public val SZ_WWDEST_KEY: Pcwstr = w("KEY")

public val SZ_WWDEST_OCC: Pcwstr = w("OCC")

public val TYPE_POINTER: UInt = 1u

public val TYPE_STRING: UInt = 2u

public val TYPE_VALUE: UInt = 0u

public val CLSID_IIT_CMD_INT: Guid = Guid.fromU128(U128(0x4662daa2d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IIT_DATABASE: Guid = Guid.fromU128(U128(0x666734528c2311d0uL, 0xa84e00aa006c7d01uL))

public val CLSID_IIT_DATABASE_LOCAL: Guid = Guid.fromU128(U128(0x4662daa9d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IIT_GROUP_UPDATE: Guid = Guid.fromU128(U128(0x4662daa4d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IIT_INDEX_BUILD: Guid = Guid.fromU128(U128(0x8fa0d5aadedf11d0uL, 0x9a6100c04fb68bf7uL))

public val CLSID_IIT_PROP_LIST: Guid = Guid.fromU128(U128(0x4662daaed39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IIT_RESULT_SET: Guid = Guid.fromU128(U128(0x4662daa7d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IIT_SV_MGR: Guid = Guid.fromU128(U128(0x4662daa3d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IITWW_FILTER_BUILD: Guid = Guid.fromU128(U128(0x8fa0d5abdedf11d0uL, 0x9a6100c04fb68bf7uL))

public val CLSID_IIT_WORD_WHEEL: Guid = Guid.fromU128(U128(0xd73725c28c1211d0uL, 0xa84e00aa006c7d01uL))

public val CLSID_IIT_WORD_WHEEL_LOCAL: Guid = Guid.fromU128(U128(0x4662daa8d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IIT_WORD_WHEEL_UPDATE: Guid = Guid.fromU128(U128(0x4662daa5d39311d0uL, 0x9a5600c04fb68bf7uL))

public val CLSID_IT_ENG_STEMMER: Guid = Guid.fromU128(U128(0x8fa0d5a8dedf11d0uL, 0x9a6100c04fb68bf7uL))

public val CLSID_IT_STD_BREAKER: Guid = Guid.fromU128(U128(0x4662daafd39311d0uL, 0x9a5600c04fb68bf7uL))
