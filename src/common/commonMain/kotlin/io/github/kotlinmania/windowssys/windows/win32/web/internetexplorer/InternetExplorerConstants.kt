package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ADDRESSBAND: UInt = 2u

public val ADDURL_ADDTOCACHE: AddurlFlag = 1

public val ADDURL_ADDTOHISTORYANDCACHE: AddurlFlag = 0

public val ADDURL_FIRST: AddurlFlag = 0

public val ADDURL_MAX: AddurlFlag = 2147483647

public val ACTIVITY_CONTENT_COUNT: OpenServiceActivityContentType = 3

public val ACTIVITY_CONTENT_DOCUMENT: OpenServiceActivityContentType = 0

public val ACTIVITY_CONTENT_LINK: OpenServiceActivityContentType = 2

public val ACTIVITY_CONTENT_NONE: OpenServiceActivityContentType = -1

public val ACTIVITY_CONTENT_SELECTION: OpenServiceActivityContentType = 1

public val ANCHOR_CLICK: Guid = Guid.fromU128(U128(0x13d5413c33b911d2uL, 0x95a700c04f8ecb02uL))

public val CATID_MS_OFFICE_ANTI_VIRUS: Guid = Guid.fromU128(U128(0x56ffcc30d39811d0uL, 0xb2ae00a0c908fa49uL))

public val C_DEVICE_RECT: Guid = Guid.fromU128(U128(0x3050f6d498b511cfuL, 0xbb8200aa00bdce0buL))

public val C_DOWNLOAD_BEHAVIOR: Guid = Guid.fromU128(U128(0x3050f5be98b511cfuL, 0xbb8200aa00bdce0buL))

public val C_HEADER_FOOTER: Guid = Guid.fromU128(U128(0x3050f6cd98b511cfuL, 0xbb8200aa00bdce0buL))

public val C_LAYOUT_RECT: Guid = Guid.fromU128(U128(0x3050f66498b511cfuL, 0xbb8200aa00bdce0buL))

public val COLOR_NO_TRANSPARENT: UInt = 4294967295u

public val C_PERSIST_DATA_PEER: Guid = Guid.fromU128(U128(0x3050f48798b511cfuL, 0xbb8200aa00bdce0buL))

public val C_PERSIST_HISTORY: Guid = Guid.fromU128(U128(0x3050f4c898b511cfuL, 0xbb8200aa00bdce0buL))

public val C_PERSIST_SHORTCUT: Guid = Guid.fromU128(U128(0x3050f4c698b511cfuL, 0xbb8200aa00bdce0buL))

public val C_PERSIST_SNAPSHOT: Guid = Guid.fromU128(U128(0x3050f4c998b511cfuL, 0xbb8200aa00bdce0buL))

public val C_PERSIST_USER_DATA: Guid = Guid.fromU128(U128(0x3050f48e98b511cfuL, 0xbb8200aa00bdce0buL))

public val CO_DITHER_TO_RGB8: Guid = Guid.fromU128(U128(0xa860ce50391011d0uL, 0x86fc00a0c913f750uL))

public val CO_MAP_MIME_TO_CLSID: Guid = Guid.fromU128(U128(0x30c3b08030fb11d0uL, 0xb72400aa006c1a01uL))

public val CO_SNIFF_STREAM: Guid = Guid.fromU128(U128(0x6a01fda030df11d0uL, 0xb72400aa006c1a01uL))

public val DISPID_ACTIVEXFILTERINGENABLED: UInt = 61u

public val DISPID_ADDCHANNEL: UInt = 5u

public val DISPID_ADDDESKTOPCOMPONENT: UInt = 6u

public val DISPID_ADDFAVORITE: UInt = 4u

public val DISPID_ADDSEARCHPROVIDER: UInt = 14u

public val DISPID_ADDSERVICE: UInt = 30u

public val DISPID_ADDSITEMODE: UInt = 49u

public val DISPID_ADDTHUMBNAILBUTTONS: UInt = 48u

public val DISPID_ADDTOFAVORITESBAR: UInt = 32u

public val DISPID_ADDTRACKINGPROTECTIONLIST: UInt = 57u

public val DISPID_ADVANCEERROR: UInt = 10u

public val DISPID_AMBIENT_OFFLINEIFNOTCONNECTED: Int = -5501

public val DISPID_AMBIENT_SILENT: Int = -5502

public val DISPID_AUTOCOMPLETEATTACH: UInt = 12u

public val DISPID_AUTOCOMPLETESAVEFORM: UInt = 10u

public val DISPID_AUTOSCAN: UInt = 11u

public val DISPID_BEFORENAVIGATE: UInt = 100u

public val DISPID_BEFORENAVIGATE2: UInt = 250u

public val DISPID_BEFORESCRIPTEXECUTE: UInt = 290u

public val DISPID_BRANDIMAGEURI: UInt = 20u

public val DISPID_BUILDNEWTABPAGE: UInt = 33u

public val DISPID_CANADVANCEERROR: UInt = 12u

public val DISPID_CANRETREATERROR: UInt = 13u

public val DISPID_CHANGEDEFAULTBROWSER: UInt = 68u

public val DISPID_CLEARNOTIFICATION: UInt = 71u

public val DISPID_CLEARSITEMODEICONOVERLAY: UInt = 45u

public val DISPID_CLIENTTOHOSTWINDOW: UInt = 268u

public val DISPID_COMMANDSTATECHANGE: UInt = 105u

public val DISPID_CONTENTDISCOVERYRESET: UInt = 36u

public val DISPID_COUNTVIEWTYPES: UInt = 22u

public val DISPID_CREATESUBSCRIPTION: UInt = 11u

public val DISPID_CUSTOMIZECLEARTYPE: UInt = 23u

public val DISPID_CUSTOMIZESETTINGS: UInt = 17u

public val DISPID_DEFAULTSEARCHPROVIDER: UInt = 26u

public val DISPID_DELETESUBSCRIPTION: UInt = 12u

public val DISPID_DEPTH: UInt = 17u

public val DISPID_DIAGNOSECONNECTION: UInt = 22u

public val DISPID_DIAGNOSECONNECTIONUILESS: UInt = 66u

public val DISPID_DOCUMENTCOMPLETE: UInt = 259u

public val DISPID_DOUBLECLICK: UInt = 3u

public val DISPID_DOWNLOADBEGIN: UInt = 106u

public val DISPID_DOWNLOADCOMPLETE: UInt = 104u

public val DISPID_ENABLENOTIFICATIONQUEUE: UInt = 72u

public val DISPID_ENABLENOTIFICATIONQUEUELARGE: UInt = 78u

public val DISPID_ENABLENOTIFICATIONQUEUESQUARE: UInt = 76u

public val DISPID_ENABLENOTIFICATIONQUEUEWIDE: UInt = 77u

public val DISPID_ENABLESUGGESTEDSITES: UInt = 39u

public val DISPID_ENUMOPTIONS: UInt = 14u

public val DISPID_EXPAND: UInt = 25u

public val DISPID_EXPORT: UInt = 7u

public val DISPID_FAVSELECTIONCHANGE: UInt = 1u

public val DISPID_FILEDOWNLOAD: UInt = 270u

public val DISPID_FLAGS: UInt = 19u

public val DISPID_FRAMEBEFORENAVIGATE: UInt = 200u

public val DISPID_FRAMENAVIGATECOMPLETE: UInt = 201u

public val DISPID_FRAMENEWWINDOW: UInt = 204u

public val DISPID_GETALWAYSSHOWLOCKSTATE: UInt = 23u

public val DISPID_GETCVLISTDATA: UInt = 93u

public val DISPID_GETCVLISTLOCALDATA: UInt = 94u

public val DISPID_GETDETAILSSTATE: UInt = 19u

public val DISPID_GETEMIELISTDATA: UInt = 95u

public val DISPID_GETEMIELISTLOCALDATA: UInt = 96u

public val DISPID_GETERRORCHAR: UInt = 15u

public val DISPID_GETERRORCODE: UInt = 16u

public val DISPID_GETERRORLINE: UInt = 14u

public val DISPID_GETERRORMSG: UInt = 17u

public val DISPID_GETERRORURL: UInt = 18u

public val DISPID_GETEXPERIMENTALFLAG: UInt = 85u

public val DISPID_GETEXPERIMENTALVALUE: UInt = 87u

public val DISPID_GETNEEDHVSIAUTOLAUNCHFLAG: UInt = 100u

public val DISPID_GETNEEDIEAUTOLAUNCHFLAG: UInt = 89u

public val DISPID_GETOSSKU: UInt = 103u

public val DISPID_GETPERERRSTATE: UInt = 21u

public val DISPID_HASNEEDHVSIAUTOLAUNCHFLAG: UInt = 102u

public val DISPID_HASNEEDIEAUTOLAUNCHFLAG: UInt = 88u

public val DISPID_IMPORT: UInt = 6u

public val DISPID_IMPORTEXPORTFAVORITES: UInt = 9u

public val DISPID_INITIALIZED: UInt = 4u

public val DISPID_INPRIVATEFILTERINGENABLED: UInt = 37u

public val DISPID_INVOKECONTEXTMENU: UInt = 8u

public val DISPID_ISMETAREFERRERAVAILABLE: UInt = 83u

public val DISPID_ISSEARCHMIGRATED: UInt = 25u

public val DISPID_ISSEARCHPROVIDERINSTALLED: UInt = 24u

public val DISPID_ISSERVICEINSTALLED: UInt = 31u

public val DISPID_ISSITEMODE: UInt = 43u

public val DISPID_ISSITEMODEFIRSTRUN: UInt = 59u

public val DISPID_ISSUBSCRIBED: UInt = 7u

public val DISPID_LAUNCHIE: UInt = 91u

public val DISPID_LAUNCHINHVSI: UInt = 99u

public val DISPID_LAUNCHINTERNETOPTIONS: UInt = 74u

public val DISPID_LAUNCHNETWORKCLIENTHELP: UInt = 67u

public val DISPID_MODE: UInt = 18u

public val DISPID_MOVESELECTIONDOWN: UInt = 2u

public val DISPID_MOVESELECTIONTO: UInt = 9u

public val DISPID_MOVESELECTIONUP: UInt = 1u

public val DISPID_NAVIGATEANDFIND: UInt = 8u

public val DISPID_NAVIGATECOMPLETE: UInt = 101u

public val DISPID_NAVIGATECOMPLETE2: UInt = 252u

public val DISPID_NAVIGATEERROR: UInt = 271u

public val DISPID_NAVIGATETOSUGGESTEDSITES: UInt = 40u

public val DISPID_NEWFOLDER: UInt = 4u

public val DISPID_NEWPROCESS: UInt = 284u

public val DISPID_NEWWINDOW: UInt = 107u

public val DISPID_NEWWINDOW2: UInt = 251u

public val DISPID_NEWWINDOW3: UInt = 273u

public val DISPID_NSCOLUMNS: UInt = 21u

public val DISPID_ONADDRESSBAR: UInt = 261u

public val DISPID_ONFULLSCREEN: UInt = 258u

public val DISPID_ONMENUBAR: UInt = 256u

public val DISPID_ONQUIT: UInt = 253u

public val DISPID_ONSTATUSBAR: UInt = 257u

public val DISPID_ONTHEATERMODE: UInt = 260u

public val DISPID_ONTOOLBAR: UInt = 255u

public val DISPID_ONVISIBLE: UInt = 254u

public val DISPID_OPENFAVORITESPANE: UInt = 97u

public val DISPID_OPENFAVORITESSETTINGS: UInt = 98u

public val DISPID_PHISHINGENABLED: UInt = 19u

public val DISPID_PINNEDSITESTATE: UInt = 73u

public val DISPID_PRINTTEMPLATEINSTANTIATION: UInt = 225u

public val DISPID_PRINTTEMPLATETEARDOWN: UInt = 226u

public val DISPID_PRIVACYIMPACTEDSTATECHANGE: UInt = 272u

public val DISPID_PROGRESSCHANGE: UInt = 108u

public val DISPID_PROPERTYCHANGE: UInt = 112u

public val DISPID_PROVISIONNETWORKS: UInt = 62u

public val DISPID_QUIT: UInt = 103u

public val DISPID_REDIRECTXDOMAINBLOCKED: UInt = 286u

public val DISPID_REFRESHOFFLINEDESKTOP: UInt = 3u

public val DISPID_REMOVESCHEDULEDTILENOTIFICATION: UInt = 80u

public val DISPID_REPORTSAFEURL: UInt = 63u

public val DISPID_RESETEXPERIMENTALFLAGS: UInt = 92u

public val DISPID_RESETFIRSTBOOTMODE: UInt = 1u

public val DISPID_RESETSAFEMODE: UInt = 2u

public val DISPID_RESETSORT: UInt = 3u

public val DISPID_RETREATERROR: UInt = 11u

public val DISPID_ROOT: UInt = 16u

public val DISPID_RUNONCEHASSHOWN: UInt = 28u

public val DISPID_RUNONCEREQUIREDSETTINGSCOMPLETE: UInt = 27u

public val DISPID_RUNONCESHOWN: UInt = 15u

public val DISPID_SCHEDULEDTILENOTIFICATION: UInt = 79u

public val DISPID_SEARCHGUIDEURL: UInt = 29u

public val DISPID_SELECTEDITEM: UInt = 15u

public val DISPID_SELECTEDITEMS: UInt = 24u

public val DISPID_SELECTIONCHANGE: UInt = 2u

public val DISPID_SETACTIVITIESVISIBLE: UInt = 35u

public val DISPID_SETDETAILSSTATE: UInt = 20u

public val DISPID_SETEXPERIMENTALFLAG: UInt = 84u

public val DISPID_SETEXPERIMENTALVALUE: UInt = 86u

public val DISPID_SETMSDEFAULTS: UInt = 104u

public val DISPID_SETNEEDHVSIAUTOLAUNCHFLAG: UInt = 101u

public val DISPID_SETNEEDIEAUTOLAUNCHFLAG: UInt = 90u

public val DISPID_SETPERERRSTATE: UInt = 22u

public val DISPID_SETPHISHINGFILTERSTATUS: UInt = 282u

public val DISPID_SETRECENTLYCLOSEDVISIBLE: UInt = 34u

public val DISPID_SETROOT: UInt = 13u

public val DISPID_SETSECURELOCKICON: UInt = 269u

public val DISPID_SETSITEMODEICONOVERLAY: UInt = 44u

public val DISPID_SETSITEMODEPROPERTIES: UInt = 50u

public val DISPID_SETTHUMBNAILBUTTONS: UInt = 47u

public val DISPID_SETVIEWTYPE: UInt = 23u

public val DISPID_SHELLUIHELPERLAST: UInt = 105u

public val DISPID_SHOWBROWSERUI: UInt = 13u

public val DISPID_SHOWINPRIVATEHELP: UInt = 42u

public val DISPID_SHOWTABSHELP: UInt = 41u

public val DISPID_SITEMODEACTIVATE: UInt = 58u

public val DISPID_SITEMODEADDBUTTONSTYLE: UInt = 54u

public val DISPID_SITEMODEADDJUMPLISTITEM: UInt = 52u

public val DISPID_SITEMODECLEARBADGE: UInt = 65u

public val DISPID_SITEMODECLEARJUMPLIST: UInt = 53u

public val DISPID_SITEMODECREATEJUMPLIST: UInt = 51u

public val DISPID_SITEMODEREFRESHBADGE: UInt = 64u

public val DISPID_SITEMODESHOWBUTTONSTYLE: UInt = 55u

public val DISPID_SITEMODESHOWJUMPLIST: UInt = 56u

public val DISPID_SKIPRUNONCE: UInt = 16u

public val DISPID_SKIPTABSWELCOME: UInt = 21u

public val DISPID_SQMENABLED: UInt = 18u

public val DISPID_STARTBADGEUPDATE: UInt = 81u

public val DISPID_STARTPERIODICUPDATE: UInt = 70u

public val DISPID_STARTPERIODICUPDATEBATCH: UInt = 75u

public val DISPID_STATUSTEXTCHANGE: UInt = 102u

public val DISPID_STOPBADGEUPDATE: UInt = 82u

public val DISPID_STOPPERIODICUPDATE: UInt = 69u

public val DISPID_SUBSCRIPTIONSENABLED: UInt = 10u

public val DISPID_SUGGESTEDSITESENABLED: UInt = 38u

public val DISPID_SYNCHRONIZE: UInt = 5u

public val DISPID_THIRDPARTYURLBLOCKED: UInt = 285u

public val DISPID_TITLECHANGE: UInt = 113u

public val DISPID_TITLEICONCHANGE: UInt = 114u

public val DISPID_TRACKINGPROTECTIONENABLED: UInt = 60u

public val DISPID_TVFLAGS: UInt = 20u

public val DISPID_UNSELECTALL: UInt = 26u

public val DISPID_UPDATEPAGESTATUS: UInt = 227u

public val DISPID_UPDATETHUMBNAILBUTTON: UInt = 46u

public val DISPID_VIEWUPDATE: UInt = 281u

public val DISPID_WEBWORKERFINISHED: UInt = 289u

public val DISPID_WEBWORKERSTARTED: UInt = 288u

public val DISPID_WINDOWACTIVATE: UInt = 111u

public val DISPID_WINDOWCLOSING: UInt = 263u

public val DISPID_WINDOWMOVE: UInt = 109u

public val DISPID_WINDOWREGISTERED: UInt = 200u

public val DISPID_WINDOWRESIZE: UInt = 110u

public val DISPID_WINDOWREVOKED: UInt = 201u

public val DISPID_WINDOWSETHEIGHT: UInt = 267u

public val DISPID_WINDOWSETLEFT: UInt = 264u

public val DISPID_WINDOWSETRESIZABLE: UInt = 262u

public val DISPID_WINDOWSETTOP: UInt = 265u

public val DISPID_WINDOWSETWIDTH: UInt = 266u

public val DISPID_WINDOWSTATECHANGED: UInt = 283u

public val E_SURFACE_DISCARDED: Int = -2147434493

public val E_SURFACE_NODC: Int = -2147434492

public val E_SURFACE_NOSURFACE: Int = -2147434496

public val E_SURFACE_NOTMYDC: Int = -2147434491

public val E_SURFACE_NOTMYPOINTER: Int = -2147434494

public val E_SURFACE_UNKNOWN_FORMAT: Int = -2147434495

public val EXTENSION_VALIDATION_CONTEXT_DYNAMIC: ExtensionValidationContexts = 1

public val EXTENSION_VALIDATION_CONTEXT_NONE: ExtensionValidationContexts = 0

public val EXTENSION_VALIDATION_CONTEXT_PARSED: ExtensionValidationContexts = 2

public val EXTENSION_VALIDATION_RESULT_ARREST_PAGE_LOAD: ExtensionValidationResults = 2

public val EXTENSION_VALIDATION_RESULT_DO_NOT_INSTANTIATE: ExtensionValidationResults = 1

public val EXTENSION_VALIDATION_RESULT_NONE: ExtensionValidationResults = 0

public val FINDFRAME_INTERNAL: FindframeFlags = -2147483648.toInt()

public val FINDFRAME_JUSTTESTEXISTENCE: FindframeFlags = 1

public val FINDFRAME_NONE: FindframeFlags = 0

public val FRAMEOPTIONS_BROWSERBAND: FrameoptionsFlags = 64

public val FRAMEOPTIONS_DESKTOP: FrameoptionsFlags = 32

public val FRAMEOPTIONS_NO3DBORDER: FrameoptionsFlags = 16

public val FRAMEOPTIONS_NORESIZE: FrameoptionsFlags = 8

public val FRAMEOPTIONS_SCROLL_AUTO: FrameoptionsFlags = 4

public val FRAMEOPTIONS_SCROLL_NO: FrameoptionsFlags = 2

public val FRAMEOPTIONS_SCROLL_YES: FrameoptionsFlags = 1

public val HOME_PAGE: Guid = Guid.fromU128(U128(0x766bf2aed65011d1uL, 0x981100c04fc31d2euL))

public val HOME_PAGE_SETTING: Guid = Guid.fromU128(U128(0x374cede0873a4c4fuL, 0xbc86bcc8cf5116a3uL))

public val IECMDID_ARG_CLEAR_FORMS_ALL: UInt = 0u

public val IECMDID_ARG_CLEAR_FORMS_ALL_BUT_PASSWORDS: UInt = 1u

public val IECMDID_ARG_CLEAR_FORMS_PASSWORDS_ONLY: UInt = 2u

public val IECMDID_BEFORENAVIGATE_DOEXTERNALBROWSE: UInt = 3u

public val IECMDID_BEFORENAVIGATE_GETIDLIST: UInt = 4u

public val IECMDID_BEFORENAVIGATE_GETSHELLBROWSE: UInt = 2u

public val IECMDID_CLEAR_AUTOCOMPLETE_FOR_FORMS: UInt = 0u

public val IECMDID_GET_INVOKE_DEFAULT_BROWSER_ON_NEW_WINDOW: UInt = 6u

public val IECMDID_SETID_AUTOCOMPLETE_FOR_FORMS: UInt = 1u

public val IECMDID_SET_INVOKE_DEFAULT_BROWSER_ON_NEW_WINDOW: UInt = 5u

public val IE_GET_PROCESS_MODULE_PROC_NAME: Pcstr = s("IEGetProcessModule")

public val IE_GET_TAB_WINDOW_EXPORTS_PROC_NAME: Pcstr = s("IEGetTabWindowExports")

public val IELAUNCHOPTION_FORCE_COMPAT: IelaunchoptionFlags = 2

public val IELAUNCHOPTION_FORCE_EDGE: IelaunchoptionFlags = 4

public val IELAUNCHOPTION_LOCK_ENGINE: IelaunchoptionFlags = 8

public val IELAUNCHOPTION_SCRIPTDEBUG: IelaunchoptionFlags = 1

public val IEPROCESS_MODULE_NAME: Pcwstr = w("IERtUtil.dll")

public val IE_WEB_DRIVER_MANAGER: Guid = Guid.fromU128(U128(0x90314af2525047b3uL, 0x89d86295fc23bc22uL))

public val IE_USE_OE_MAIL_HKEY: Int = -2147483647

public val IE_USE_OE_MAIL_KEY: Pcwstr = w("Software\\Microsoft\\Internet Explorer\\Mail")

public val IE_USE_OE_MAIL_VALUE: Pcwstr = w("Use Outlook Express")

public val IE_USE_OE_NEWS_HKEY: Int = -2147483647

public val IE_USE_OE_NEWS_KEY: Pcwstr = w("Software\\Microsoft\\Internet Explorer\\News")

public val IE_USE_OE_NEWS_VALUE: Pcwstr = w("Use Outlook Express")

public val IE_USE_OE_PRESENT_HKEY: Int = -2147483646

public val IE_USE_OE_PRESENT_KEY: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\app.paths\\msimn.exe")

public val IMGDECODE_EVENT_BEGINBITS: UInt = 4u

public val IMGDECODE_EVENT_BITSCOMPLETE: UInt = 8u

public val IMGDECODE_EVENT_PALETTE: UInt = 2u

public val IMGDECODE_EVENT_PROGRESS: UInt = 1u

public val IMGDECODE_EVENT_USEDDRAW: UInt = 16u

public val IMGDECODE_HINT_BOTTOMUP: UInt = 2u

public val IMGDECODE_HINT_FULLWIDTH: UInt = 4u

public val IMGDECODE_HINT_TOPDOWN: UInt = 1u

public val INTERNETEXPLORERCONFIGURATION_HOST: Internetexplorerconfiguration = 1

public val INTERNETEXPLORERCONFIGURATION_WEB_DRIVER: Internetexplorerconfiguration = 2

public val INTERNETEXPLORERCONFIGURATION_WEB_DRIVER_EDGE: Internetexplorerconfiguration = 4

public val INTELLI_FORMS: Guid = Guid.fromU128(U128(0x613ab92e16bf11d2uL, 0xbca500c04fd929dbuL))

public val INTERNET_EXPLORER_MANAGER: Guid = Guid.fromU128(U128(0xdf4fcc34067a4e0auL, 0x83524a1a5095346euL))

public val LINKSBAND: UInt = 4u

public val MAPMIME_CLSID: UInt = 1u

public val MAPMIME_DEFAULT: UInt = 0u

public val MAPMIME_DEFAULT_ALWAYS: UInt = 3u

public val MAPMIME_DISABLE: UInt = 2u

public val MAX_SEARCH_FORMAT_STRING: UInt = 255u

public val MEDIA_CASTING: MediaActivityNotifyType = 2

public val MEDIA_PLAYBACK: MediaActivityNotifyType = 0

public val MEDIA_RECORDING: MediaActivityNotifyType = 1

public val NAVIGATEFRAME_FL_AUTH_FAIL_CACHE_OK: NavigateframeFlags = 16

public val NAVIGATEFRAME_FL_NO_DOC_CACHE: NavigateframeFlags = 4

public val NAVIGATEFRAME_FL_NO_IMAGE_CACHE: NavigateframeFlags = 8

public val NAVIGATEFRAME_FL_POST: NavigateframeFlags = 2

public val NAVIGATEFRAME_FL_REALLY_SENDING_FROM_FORM: NavigateframeFlags = 64

public val NAVIGATEFRAME_FL_RECORD: NavigateframeFlags = 1

public val NAVIGATEFRAME_FL_SENDING_FROM_FORM: NavigateframeFlags = 32

public val OS_E_CANCELLED: OpenServiceErrors = -2147471631

public val OS_E_GPDISABLED: OpenServiceErrors = -1072886820

public val OS_E_NOTFOUND: OpenServiceErrors = -2147287038

public val OS_E_NOTSUPPORTED: OpenServiceErrors = -2147467231

public val OPEN_SERVICE_ACTIVITY_MANAGER: Guid = Guid.fromU128(U128(0xc5efd80350f843cduL, 0x9ab8aafc1394c9e0uL))

public val OPEN_SERVICE_MANAGER: Guid = Guid.fromU128(U128(0x98870b639ea480buL, 0xb8b5dd0167c4db59uL))

public val PEER_FACTORY: Guid = Guid.fromU128(U128(0x3050f4cf98b511cfuL, 0xbb8200aa00bdce0buL))

public val REGSTRA_VAL_STARTPAGE: Pcstr = s("Start Page")

public val REGSTR_PATH_CURRENT: Pcwstr = w("current")

public val REGSTR_PATH_DEFAULT: Pcwstr = w("default")

public val REGSTR_PATH_INETCPL_RESTRICTIONS: Pcwstr = w("Software\\Policies\\Microsoft\\Internet Explorer\\Control Panel")

public val REGSTR_PATH_MIME_DATABASE: Pcwstr = w("MIME\\Database")

public val REGSTR_PATH_REMOTEACCESS: Pcwstr = w("RemoteAccess")

public val REGSTR_PATH_REMOTEACESS: Pcwstr = w("RemoteAccess")

public val REGSTR_SHIFTQUICKSUFFIX: Pcwstr = w("ShiftQuickCompleteSuffix")

public val REGSTR_VAL_ACCEPT_LANGUAGE: Pcwstr = w("AcceptLanguage")

public val REGSTR_VAL_ACCESSMEDIUM: Pcwstr = w("AccessMedium")

public val REGSTR_VAL_ACCESSTYPE: Pcwstr = w("AccessType")

public val REGSTR_VAL_ALIASTO: Pcwstr = w("AliasForCharset")

public val REGSTR_VAL_ANCHORCOLOR: Pcwstr = w("Anchor Color")

public val REGSTR_VAL_ANCHORCOLORHOVER: Pcwstr = w("Anchor Color Hover")

public val REGSTR_VAL_ANCHORCOLORVISITED: Pcwstr = w("Anchor Color Visited")

public val REGSTR_VAL_ANCHORUNDERLINE: Pcwstr = w("Anchor Underline")

public val REGSTR_VAL_AUTODETECT: Pcwstr = w("AutoDetect")

public val REGSTR_VAL_AUTODIALDLLNAME: Pcwstr = w("AutodialDllName")

public val REGSTR_VAL_AUTODIALFCNNAME: Pcwstr = w("AutodialFcnName")

public val REGSTR_VAL_AUTODIAL_MONITORCLASSNAME: Pcwstr = w("MS_AutodialMonitor")

public val REGSTR_VAL_AUTODIAL_TRYONLYONCE: Pcwstr = w("TryAutodialOnce")

public val REGSTR_VAL_AUTONAVIGATE: Pcwstr = w("SearchForExtensions")

public val REGSTR_VAL_AUTOSEARCH: Pcwstr = w("Do404Search")

public val REGSTR_VAL_BACKBITMAP: Pcwstr = w("BackBitmap")

public val REGSTR_VAL_BACKGROUNDCOLOR: Pcwstr = w("Background Color")

public val REGSTR_VAL_BODYCHARSET: Pcwstr = w("BodyCharset")

public val REGSTR_VAL_BYPASSAUTOCONFIG: Pcwstr = w("BypassAutoconfig")

public val REGSTR_VAL_CACHEPREFIX: Pcwstr = w("CachePrefix")

public val REGSTR_VAL_CHECKASSOC: Pcwstr = w("Check_Associations")

public val REGSTR_VAL_CODEDOWNLOAD: Pcwstr = w("Code Download")

public val REGSTR_VAL_CODEDOWNLOAD_DEF: Pcwstr = w("yes")

public val REGSTR_VAL_CODEPAGE: Pcwstr = w("CodePage")

public val REGSTR_VAL_COVEREXCLUDE: Pcwstr = w("CoverExclude")

public val REGSTR_VAL_DAYSTOKEEP: Pcwstr = w("DaysToKeep")

public val REGSTR_VAL_DEFAULT_CODEPAGE: Pcwstr = w("Default_CodePage")

public val REGSTR_VAL_DEFAULT_SCRIPT: Pcwstr = w("Default_Script")

public val REGSTR_VAL_DEF_ENCODING: Pcwstr = w("Default_Encoding")

public val REGSTR_VAL_DEF_INETENCODING: Pcwstr = w("Default_InternetEncoding")

public val REGSTR_VAL_DESCRIPTION: Pcwstr = w("Description")

public val REGSTR_VAL_DIRECTORY: Pcwstr = w("Directory")

public val REGSTR_VAL_DISCONNECTIDLETIME: Pcwstr = w("DisconnectIdleTime")

public val REGSTR_VAL_ENABLEAUTODIAL: Pcwstr = w("EnableAutodial")

public val REGSTR_VAL_ENABLEAUTODIALDISCONNECT: Pcwstr = w("EnableAutodisconnect")

public val REGSTR_VAL_ENABLEAUTODISCONNECT: Pcwstr = w("EnableAutodisconnect")

public val REGSTR_VAL_ENABLEEXITDISCONNECT: Pcwstr = w("EnableExitDisconnect")

public val REGSTR_VAL_ENABLESECURITYCHECK: Pcwstr = w("EnableSecurityCheck")

public val REGSTR_VAL_ENABLEUNATTENDED: Pcwstr = w("EnableUnattended")

public val REGSTR_VAL_ENCODENAME: Pcwstr = w("EncodingName")

public val REGSTR_VAL_FAMILY: Pcwstr = w("Family")

public val REGSTR_VAL_FIXEDWIDTHFONT: Pcwstr = w("FixedWidthFont")

public val REGSTR_VAL_FIXED_FONT: Pcwstr = w("IEFixedFontName")

public val REGSTR_VAL_FONT_SCRIPT: Pcwstr = w("Script")

public val REGSTR_VAL_FONT_SCRIPTS: Pcwstr = w("Scripts")

public val REGSTR_VAL_FONT_SCRIPT_NAME: Pcwstr = w("Script")

public val REGSTR_VAL_FONT_SIZE: Pcwstr = w("IEFontSize")

public val REGSTR_VAL_FONT_SIZE_DEF: UInt = 2u

public val REGSTR_VAL_HEADERCHARSET: Pcwstr = w("HeaderCharset")

public val REGSTR_VAL_HTTP_ERRORS: Pcwstr = w("Friendly http errors")

public val REGSTR_VAL_IE_CUSTOMCOLORS: Pcwstr = w("Custom Colors")

public val REGSTR_VAL_INETCPL_ADVANCEDTAB: Pcwstr = w("AdvancedTab")

public val REGSTR_VAL_INETCPL_CONNECTIONSTAB: Pcwstr = w("ConnectionsTab")

public val REGSTR_VAL_INETCPL_CONTENTTAB: Pcwstr = w("ContentTab")

public val REGSTR_VAL_INETCPL_GENERALTAB: Pcwstr = w("GeneralTab")

public val REGSTR_VAL_INETCPL_IEAK: Pcwstr = w("IEAKContext")

public val REGSTR_VAL_INETCPL_PRIVACYTAB: Pcwstr = w("PrivacyTab")

public val REGSTR_VAL_INETCPL_PROGRAMSTAB: Pcwstr = w("ProgramsTab")

public val REGSTR_VAL_INETCPL_SECURITYTAB: Pcwstr = w("SecurityTab")

public val REGSTR_VAL_INETENCODING: Pcwstr = w("InternetEncoding")

public val REGSTR_VAL_INTERNETENTRY: Pcwstr = w("InternetProfile")

public val REGSTR_VAL_INTERNETENTRYBKUP: Pcwstr = w("BackupInternetProfile")

public val REGSTR_VAL_INTERNETPROFILE: Pcwstr = w("InternetProfile")

public val REGSTR_VAL_JAVAJIT: Pcwstr = w("EnableJIT")

public val REGSTR_VAL_JAVAJIT_DEF: UInt = 0u

public val REGSTR_VAL_JAVALOGGING: Pcwstr = w("EnableLogging")

public val REGSTR_VAL_JAVALOGGING_DEF: UInt = 0u

public val REGSTR_VAL_LEVEL: Pcwstr = w("Level")

public val REGSTR_VAL_LOADIMAGES: Pcwstr = w("Display Inline Images")

public val REGSTR_VAL_LOCALPAGE: Pcwstr = w("Local Page")

public val REGSTR_VAL_MOSDISCONNECT: Pcwstr = w("DisconnectTimeout")

public val REGSTR_VAL_NEWDIRECTORY: Pcwstr = w("NewDirectory")

public val REGSTR_VAL_NONETAUTODIAL: Pcwstr = w("NoNetAutodial")

public val REGSTR_VAL_PLAYSOUNDS: Pcwstr = w("Play_Background_Sounds")

public val REGSTR_VAL_PLAYVIDEOS: Pcwstr = w("Display Inline Videos")

public val REGSTR_VAL_PRIVCONVERTER: Pcwstr = w("PrivConverter")

public val REGSTR_VAL_PROPORTIONALFONT: Pcwstr = w("ProportionalFont")

public val REGSTR_VAL_PROP_FONT: Pcwstr = w("IEPropFontName")

public val REGSTR_VAL_PROXYENABLE: Pcwstr = w("ProxyEnable")

public val REGSTR_VAL_PROXYOVERRIDE: Pcwstr = w("ProxyOverride")

public val REGSTR_VAL_PROXYSERVER: Pcwstr = w("ProxyServer")

public val REGSTR_VAL_REDIALATTEMPTS: Pcwstr = w("RedialAttempts")

public val REGSTR_VAL_REDIALINTERVAL: Pcwstr = w("RedialWait")

public val REGSTR_VAL_RNAINSTALLED: Pcwstr = w("Installed")

public val REGSTR_VAL_SAFETYWARNINGLEVEL: Pcwstr = w("Safety Warning Level")

public val REGSTR_VAL_SCHANNELENABLEPROTOCOL: Pcwstr = w("Enabled")

public val REGSTR_VAL_SCHANNELENABLEPROTOCOL_DEF: UInt = 1u

public val REGSTR_VAL_SCRIPT_FIXED_FONT: Pcwstr = w("IEFixedFontName")

public val REGSTR_VAL_SCRIPT_PROP_FONT: Pcwstr = w("IEPropFontName")

public val REGSTR_VAL_SEARCHPAGE: Pcwstr = w("Search Page")

public val REGSTR_VAL_SECURITYACTICEXSCRIPTS: Pcwstr = w("Security_RunScripts")

public val REGSTR_VAL_SECURITYACTICEXSCRIPTS_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYACTIVEX: Pcwstr = w("Security_RunActiveXControls")

public val REGSTR_VAL_SECURITYACTIVEX_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYALLOWCOOKIES: Pcwstr = w("AllowCookies")

public val REGSTR_VAL_SECURITYALLOWCOOKIES_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYDISABLECACHINGOFSSLPAGES: Pcwstr = w("DisableCachingOfSSLPages")

public val REGSTR_VAL_SECURITYDISABLECACHINGOFSSLPAGES_DEF: UInt = 0u

public val REGSTR_VAL_SECURITYJAVA: Pcwstr = w("Security_RunJavaApplets")

public val REGSTR_VAL_SECURITYJAVA_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONBADCERTSENDING: Pcwstr = w("WarnOnBadCertSending")

public val REGSTR_VAL_SECURITYWARNONBADCERTSENDING_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONBADCERTVIEWING: Pcwstr = w("WarnOnBadCertRecving")

public val REGSTR_VAL_SECURITYWARNONBADCERTVIEWING_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONSEND: Pcwstr = w("WarnOnPost")

public val REGSTR_VAL_SECURITYWARNONSENDALWAYS: Pcwstr = w("WarnAlwaysOnPost")

public val REGSTR_VAL_SECURITYWARNONSENDALWAYS_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONSEND_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONVIEW: Pcwstr = w("WarnOnView")

public val REGSTR_VAL_SECURITYWARNONVIEW_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONZONECROSSING: Pcwstr = w("WarnOnZoneCrossing")

public val REGSTR_VAL_SECURITYWARNONZONECROSSING_DEF: UInt = 1u

public val REGSTR_VAL_SHOWADDRESSBAR: Pcwstr = w("Show_URLToolBar")

public val REGSTR_VAL_SHOWFOCUS: Pcwstr = w("Tabstop - MouseDown")

public val REGSTR_VAL_SHOWFOCUS_DEF: Pcwstr = w("no")

public val REGSTR_VAL_SHOWFULLURLS: Pcwstr = w("Show_FullURL")

public val REGSTR_VAL_SHOWTOOLBAR: Pcwstr = w("Show_ToolBar")

public val REGSTR_VAL_SMOOTHSCROLL: Pcwstr = w("SmoothScroll")

public val REGSTR_VAL_SMOOTHSCROLL_DEF: UInt = 1u

public val REGSTR_VAL_STARTPAGE: Pcwstr = w("Start Page")

public val REGSTR_VAL_TEXTCOLOR: Pcwstr = w("Text Color")

public val REGSTR_VAL_TRUSTWARNINGLEVEL_HIGH: Pcwstr = w("High")

public val REGSTR_VAL_TRUSTWARNINGLEVEL_LOW: Pcwstr = w("No Security")

public val REGSTR_VAL_TRUSTWARNINGLEVEL_MED: Pcwstr = w("Medium")

public val REGSTR_VAL_USEAUTOAPPEND: Pcwstr = w("Append Completion")

public val REGSTR_VAL_USEAUTOCOMPLETE: Pcwstr = w("Use AutoComplete")

public val REGSTR_VAL_USEAUTOSUGGEST: Pcwstr = w("AutoSuggest")

public val REGSTR_VAL_USEDLGCOLORS: Pcwstr = w("Use_DlgBox_Colors")

public val REGSTR_VAL_USEHOVERCOLOR: Pcwstr = w("Use Anchor Hover Color")

public val REGSTR_VAL_USEIBAR: Pcwstr = w("UseBar")

public val REGSTR_VAL_USEICM: Pcwstr = w("UseICM")

public val REGSTR_VAL_USEICM_DEF: UInt = 0u

public val REGSTR_VAL_USERAGENT: Pcwstr = w("User Agent")

public val REGSTR_VAL_USESTYLESHEETS: Pcwstr = w("Use Stylesheets")

public val REGSTR_VAL_USESTYLESHEETS_DEF: Pcwstr = w("yes")

public val REGSTR_VAL_VISIBLEBANDS: Pcwstr = w("VisibleBands")

public val REGSTR_VAL_VISIBLEBANDS_DEF: UInt = 7u

public val REGSTR_VAL_WEBCHARSET: Pcwstr = w("WebCharset")

public val SCMP_BOTTOM: ScrollablecontextmenuPlacement = 1

public val SCMP_FULL: ScrollablecontextmenuPlacement = 4

public val SCMP_LEFT: ScrollablecontextmenuPlacement = 2

public val SCMP_RIGHT: ScrollablecontextmenuPlacement = 3

public val SCMP_TOP: ScrollablecontextmenuPlacement = 0

public val STATURLFLAG_ISCACHED: UInt = 1u

public val STATURLFLAG_ISTOPLEVEL: UInt = 2u

public val STATURL_QUERYFLAG_ISCACHED: UInt = 65536u

public val STATURL_QUERYFLAG_NOTITLE: UInt = 262144u

public val STATURL_QUERYFLAG_NOURL: UInt = 131072u

public val STATURL_QUERYFLAG_TOPLEVEL: UInt = 524288u

public val SURFACE_LOCK_ALLOW_DISCARD: UInt = 2u

public val SURFACE_LOCK_EXCLUSIVE: UInt = 1u

public val SURFACE_LOCK_WAIT: UInt = 4u

public val SZBACKBITMAP: Pcstr = s("BackBitmap")

public val SZJAVAVMPATH: Pcstr = s("\\Java VM")

public val SZNOTEXT: Pcstr = s("NoText")

public val SZTOOLBAR: Pcstr = s("\\Toolbar")

public val SZTRUSTWARNLEVEL: Pcstr = s("Trust Warning Level")

public val SZVISIBLE: Pcstr = s("VisibleBands")

public val SZ_IE_DEFAULT_HTML_EDITOR: Pcstr = s("Default HTML Editor")

public val SZ_IE_IBAR: Pcstr = s("Bar")

public val SZ_IE_IBAR_BANDS: Pcstr = s("Bands")

public val SZ_IE_MAIN: Pcstr = s("Main")

public val SZ_IE_SEARCHSTRINGS: Pcstr = s("UrlTemplate")

public val SZ_IE_SECURITY: Pcstr = s("Security")

public val SZ_IE_SETTINGS: Pcstr = s("Settings")

public val SZ_IE_THRESHOLDS: Pcstr = s("ErrorThresholds")

public val S_SURFACE_DISCARDED: Int = 49155

public val TARGET_NOTIFY_OBJECT_NAME: Pcwstr = w("863a99a0-21bc-11d0-82b4-00a0c90c29c5")

public val TF_NAVIGATE: UInt = 2142153644u

public val TIMERMODE_NORMAL: UInt = 0u

public val TIMERMODE_VISIBILITYAWARE: UInt = 1u

public val TOOLSBAND: UInt = 1u

public val TSZCALENDARPROTOCOL: Pcwstr = w("unk")

public val TSZCALLTOPROTOCOL: Pcwstr = w("callto")

public val TSZINTERNETCLIENTSPATH: Pcwstr = w("Software\\Microsoft\\Internet Explorer\\Unix")

public val TSZLDAPPROTOCOL: Pcwstr = w("ldap")

public val TSZMAILTOPROTOCOL: Pcwstr = w("mailto")

public val TSZMICROSOFTPATH: Pcwstr = w("Software\\Microsoft")

public val TSZNEWSPROTOCOL: Pcwstr = w("news")

public val TSZPROTOCOLSPATH: Pcwstr = w("Protocols\\")

public val TSZSCHANNELPATH: Pcwstr = w("SYSTEM\\CurrentControlSet\\Control\\SecurityProviders\\SCHANNEL")

public val TSZVSOURCEPROTOCOL: Pcwstr = w("view source")

public val MSODSV_FAILED: UInt = 3u

public val MSODSV_LOW_SECURITY_LEVEL: UInt = 4u

public val MSODSV_NO_MACROS: UInt = 0u

public val MSODSV_PASSED_TRUSTED: UInt = 2u

public val MSODSV_PASSED_TRUSTED_CERT: UInt = 5u

public val MSODSV_UNSIGNED: UInt = 1u

public val MSOEDM_DISABLE: UInt = 2u

public val MSOEDM_DONT_OPEN: UInt = 3u

public val MSOEDM_ENABLE: UInt = 1u

public val MSOSL_HIGH: UInt = 3u

public val MSOSL_MEDIUM: UInt = 2u

public val MSOSL_NONE: UInt = 1u

public val MSOSL_UNDEFINED: UInt = 0u

public val WFOLDERS: Guid = Guid.fromU128(U128(0xbae31f9a1b8111d2uL, 0xa97a00c04f8ecb02uL))
