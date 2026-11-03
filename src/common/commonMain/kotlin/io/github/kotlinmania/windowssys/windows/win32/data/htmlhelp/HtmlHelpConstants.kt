package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val CLSID_IITCmdInt: GUID = GUID.from_u128(0x4662daa2d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITDatabase: GUID = GUID.from_u128(0x666734528c2311d0uL, 0xa84e00aa006c7d01uL)

public val CLSID_IITDatabaseLocal: GUID = GUID.from_u128(0x4662daa9d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITGroupUpdate: GUID = GUID.from_u128(0x4662daa4d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITIndexBuild: GUID = GUID.from_u128(0x8fa0d5aadedf11d0uL, 0x9a6100c04fb68bf7uL)

public val CLSID_IITPropList: GUID = GUID.from_u128(0x4662daaed39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITResultSet: GUID = GUID.from_u128(0x4662daa7d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITSvMgr: GUID = GUID.from_u128(0x4662daa3d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITWWFilterBuild: GUID = GUID.from_u128(0x8fa0d5abdedf11d0uL, 0x9a6100c04fb68bf7uL)

public val CLSID_IITWordWheel: GUID = GUID.from_u128(0xd73725c28c1211d0uL, 0xa84e00aa006c7d01uL)

public val CLSID_IITWordWheelLocal: GUID = GUID.from_u128(0x4662daa8d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_IITWordWheelUpdate: GUID = GUID.from_u128(0x4662daa5d39311d0uL, 0x9a5600c04fb68bf7uL)

public val CLSID_ITEngStemmer: GUID = GUID.from_u128(0x8fa0d5a8dedf11d0uL, 0x9a6100c04fb68bf7uL)

public val CLSID_ITStdBreaker: GUID = GUID.from_u128(0x4662daafd39311d0uL, 0x9a5600c04fb68bf7uL)

public val E_ALL_WILD: HRESULT = 0x80001055u.toInt()

public val E_ALREADYINIT: HRESULT = 0x80001083u.toInt()

public val E_ALREADYOPEN: HRESULT = 0x80001013u.toInt()

public val E_ASSERT: HRESULT = 0x80001006u.toInt()

public val E_BADBREAKER: HRESULT = 0x80001053u.toInt()

public val E_BADFILE: HRESULT = 0x80001003u.toInt()

public val E_BADFILTERSIZE: HRESULT = 0x80001018u.toInt()

public val E_BADFORMAT: HRESULT = 0x80001004u.toInt()

public val E_BADINDEXFLAGS: HRESULT = 0x80001060u.toInt()

public val E_BADPARAM: HRESULT = 0x80001011u.toInt()

public val E_BADRANGEOP: HRESULT = 0x8000105Du.toInt()

public val E_BADVALUE: HRESULT = 0x80001054u.toInt()

public val E_BADVERSION: HRESULT = 0x80001002u.toInt()

public val E_CANTFINDDLL: HRESULT = 0x8000100Eu.toInt()

public val E_DISKFULL: HRESULT = 0x80001038u.toInt()

public val E_DUPLICATE: HRESULT = 0x80001001u.toInt()

public val E_EXPECTEDTERM: HRESULT = 0x80001057u.toInt()

public val E_FILECLOSE: HRESULT = 0x80001031u.toInt()

public val E_FILECREATE: HRESULT = 0x80001030u.toInt()

public val E_FILEDELETE: HRESULT = 0x80001035u.toInt()

public val E_FILEINVALID: HRESULT = 0x80001036u.toInt()

public val E_FILENOTFOUND: HRESULT = 0x80001037u.toInt()

public val E_FILEREAD: HRESULT = 0x80001032u.toInt()

public val E_FILESEEK: HRESULT = 0x80001033u.toInt()

public val E_FILEWRITE: HRESULT = 0x80001034u.toInt()

public val E_GETLASTERROR: HRESULT = 0x80001010u.toInt()

public val E_GROUPIDTOOBIG: HRESULT = 0x8000100Au.toInt()

public val E_INTERRUPT: HRESULT = 0x80001007u.toInt()

public val E_INVALIDSTATE: HRESULT = 0x80001012u.toInt()

public val E_MISSINGPROP: HRESULT = 0x80001080u.toInt()

public val E_MISSLPAREN: HRESULT = 0x80001058u.toInt()

public val E_MISSQUOTE: HRESULT = 0x8000105Au.toInt()

public val E_MISSRPAREN: HRESULT = 0x80001059u.toInt()

public val E_NAMETOOLONG: HRESULT = 0x80001020u.toInt()

public val E_NOHANDLE: HRESULT = 0x8000100Fu.toInt()

public val E_NOKEYPROP: HRESULT = 0x80001087u.toInt()

public val E_NOMERGEDDATA: HRESULT = 0x8000100Cu.toInt()

public val E_NOPERMISSION: HRESULT = 0x80001005u.toInt()

public val E_NOSTEMMER: HRESULT = 0x80001062u.toInt()

public val E_NOTEXIST: HRESULT = 0x80001000u.toInt()

public val E_NOTFOUND: HRESULT = 0x8000100Du.toInt()

public val E_NOTINIT: HRESULT = 0x80001084u.toInt()

public val E_NOTOPEN: HRESULT = 0x80001013u.toInt()

public val E_NOTSUPPORTED: HRESULT = 0x80001008u.toInt()

public val E_NULLQUERY: HRESULT = 0x8000105Bu.toInt()

public val E_OUTOFRANGE: HRESULT = 0x80001009u.toInt()

public val E_PROPLISTEMPTY: HRESULT = 0x80001082u.toInt()

public val E_PROPLISTNOTEMPTY: HRESULT = 0x80001081u.toInt()

public val E_RESULTSETEMPTY: HRESULT = 0x80001085u.toInt()

public val E_STOPWORD: HRESULT = 0x8000105Cu.toInt()

public val E_TOODEEP: HRESULT = 0x80001056u.toInt()

public val E_TOOMANYCOLUMNS: HRESULT = 0x80001086u.toInt()

public val E_TOOMANYDUPS: HRESULT = 0x80001051u.toInt()

public val E_TOOMANYOBJECTS: HRESULT = 0x80001019u.toInt()

public val E_TOOMANYTITLES: HRESULT = 0x8000100Bu.toInt()

public val E_TOOMANYTOPICS: HRESULT = 0x80001050u.toInt()

public val E_TREETOOBIG: HRESULT = 0x80001052u.toInt()

public val E_UNKNOWN_TRANSPORT: HRESULT = 0x80001016u.toInt()

public val E_UNMATCHEDTYPE: HRESULT = 0x8000105Eu.toInt()

public val E_UNSUPPORTED_TRANSPORT: HRESULT = 0x80001017u.toInt()

public val E_WILD_IN_DTYPE: HRESULT = 0x80001061u.toInt()

public val E_WORDTOOLONG: HRESULT = 0x8000105Fu.toInt()

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

public val HH_ALINK_LOOKUP: HTML_HELP_COMMAND = 19

public val HH_CLOSE_ALL: HTML_HELP_COMMAND = 18

public val HH_DISPLAY_INDEX: HTML_HELP_COMMAND = 2

public val HH_DISPLAY_SEARCH: HTML_HELP_COMMAND = 3

public val HH_DISPLAY_TEXT_POPUP: HTML_HELP_COMMAND = 14

public val HH_DISPLAY_TOC: HTML_HELP_COMMAND = 1

public val HH_DISPLAY_TOPIC: HTML_HELP_COMMAND = 0

public val HH_ENUM_CATEGORY: HTML_HELP_COMMAND = 21

public val HH_ENUM_CATEGORY_IT: HTML_HELP_COMMAND = 22

public val HH_ENUM_INFO_TYPE: HTML_HELP_COMMAND = 7

public val HH_FTS_DEFAULT_PROXIMITY: HTML_HELP_COMMAND = -1

public val HH_GET_LAST_ERROR: HTML_HELP_COMMAND = 20

public val HH_GET_WIN_HANDLE: HTML_HELP_COMMAND = 6

public val HH_GET_WIN_TYPE: HTML_HELP_COMMAND = 5

public val HH_GPROPID_CONTENT_LANGUAGE: HH_GPROPID = 5

public val HH_GPROPID_CURRENT_SUBSET: HH_GPROPID = 4

public val HH_GPROPID_SINGLETHREAD: HH_GPROPID = 1

public val HH_GPROPID_TOOLBAR_MARGIN: HH_GPROPID = 2

public val HH_GPROPID_UI_LANGUAGE: HH_GPROPID = 3

public val HH_HELP_CONTEXT: HTML_HELP_COMMAND = 15

public val HH_HELP_FINDER: HTML_HELP_COMMAND = 0

public val HH_INITIALIZE: HTML_HELP_COMMAND = 28

public val HH_KEYWORD_LOOKUP: HTML_HELP_COMMAND = 13

public val HH_MAX_TABS: HTML_HELP_COMMAND = 19

public val HH_MAX_TABS_CUSTOM: HTML_HELP_COMMAND = 9

public val HH_PRETRANSLATEMESSAGE: HTML_HELP_COMMAND = 253

public val HH_RESERVED1: HTML_HELP_COMMAND = 10

public val HH_RESERVED2: HTML_HELP_COMMAND = 11

public val HH_RESERVED3: HTML_HELP_COMMAND = 12

public val HH_RESET_IT_FILTER: HTML_HELP_COMMAND = 23

public val HH_SAFE_DISPLAY_TOPIC: HTML_HELP_COMMAND = 32

public val HH_SET_EXCLUSIVE_FILTER: HTML_HELP_COMMAND = 25

public val HH_SET_GLOBAL_PROPERTY: HTML_HELP_COMMAND = 252

public val HH_SET_INCLUSIVE_FILTER: HTML_HELP_COMMAND = 24

public val HH_SET_INFO_TYPE: HTML_HELP_COMMAND = 8

public val HH_SET_QUERYSERVICE: HTML_HELP_COMMAND = 30

public val HH_SET_WIN_TYPE: HTML_HELP_COMMAND = 4

public val HH_SYNC: HTML_HELP_COMMAND = 9

public val HH_TAB_AUTHOR: Int = 5

public val HH_TAB_CONTENTS: Int = 0

public val HH_TAB_CUSTOM_FIRST: Int = 11

public val HH_TAB_CUSTOM_LAST: Int = 19

public val HH_TAB_FAVORITES: Int = 3

public val HH_TAB_HISTORY: Int = 4

public val HH_TAB_INDEX: Int = 1

public val HH_TAB_SEARCH: Int = 2

public val HH_TP_HELP_CONTEXTMENU: HTML_HELP_COMMAND = 16

public val HH_TP_HELP_WM_HELP: HTML_HELP_COMMAND = 17

public val HH_UNINITIALIZE: HTML_HELP_COMMAND = 29

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

public val PRIORITY_HIGH: PRIORITY = 2

public val PRIORITY_LOW: PRIORITY = 0

public val PRIORITY_NORMAL: PRIORITY = 1

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

public val SZ_WWDEST_GLOBAL: PCWSTR = w("GLOBAL")

public val SZ_WWDEST_KEY: PCWSTR = w("KEY")

public val SZ_WWDEST_OCC: PCWSTR = w("OCC")

public val TYPE_POINTER: UInt = 1u

public val TYPE_STRING: UInt = 2u

public val TYPE_VALUE: UInt = 0u
