package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ADDRESSBAND: UInt = 2u

public val ADDURL_ADDTOCACHE: ADDURL_FLAG = 1

public val ADDURL_ADDTOHISTORYANDCACHE: ADDURL_FLAG = 0

public val ADDURL_FIRST: ADDURL_FLAG = 0

public val ADDURL_Max: ADDURL_FLAG = 2147483647

public val ActivityContentCount: OpenServiceActivityContentType = 3

public val ActivityContentDocument: OpenServiceActivityContentType = 0

public val ActivityContentLink: OpenServiceActivityContentType = 2

public val ActivityContentNone: OpenServiceActivityContentType = -1

public val ActivityContentSelection: OpenServiceActivityContentType = 1

public val AnchorClick: GUID = GUID.from_u128(U128(0x13d5413c33b911d2uL, 0x95a700c04f8ecb02uL))

public val CATID_MSOfficeAntiVirus: GUID = GUID.from_u128(U128(0x56ffcc30d39811d0uL, 0xb2ae00a0c908fa49uL))

public val CDeviceRect: GUID = GUID.from_u128(U128(0x3050f6d498b511cfuL, 0xbb8200aa00bdce0buL))

public val CDownloadBehavior: GUID = GUID.from_u128(U128(0x3050f5be98b511cfuL, 0xbb8200aa00bdce0buL))

public val CHeaderFooter: GUID = GUID.from_u128(U128(0x3050f6cd98b511cfuL, 0xbb8200aa00bdce0buL))

public val CLayoutRect: GUID = GUID.from_u128(U128(0x3050f66498b511cfuL, 0xbb8200aa00bdce0buL))

public val COLOR_NO_TRANSPARENT: UInt = 4294967295u

public val CPersistDataPeer: GUID = GUID.from_u128(U128(0x3050f48798b511cfuL, 0xbb8200aa00bdce0buL))

public val CPersistHistory: GUID = GUID.from_u128(U128(0x3050f4c898b511cfuL, 0xbb8200aa00bdce0buL))

public val CPersistShortcut: GUID = GUID.from_u128(U128(0x3050f4c698b511cfuL, 0xbb8200aa00bdce0buL))

public val CPersistSnapshot: GUID = GUID.from_u128(U128(0x3050f4c998b511cfuL, 0xbb8200aa00bdce0buL))

public val CPersistUserData: GUID = GUID.from_u128(U128(0x3050f48e98b511cfuL, 0xbb8200aa00bdce0buL))

public val CoDitherToRGB8: GUID = GUID.from_u128(U128(0xa860ce50391011d0uL, 0x86fc00a0c913f750uL))

public val CoMapMIMEToCLSID: GUID = GUID.from_u128(U128(0x30c3b08030fb11d0uL, 0xb72400aa006c1a01uL))

public val CoSniffStream: GUID = GUID.from_u128(U128(0x6a01fda030df11d0uL, 0xb72400aa006c1a01uL))

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

public val ExtensionValidationContextDynamic: ExtensionValidationContexts = 1

public val ExtensionValidationContextNone: ExtensionValidationContexts = 0

public val ExtensionValidationContextParsed: ExtensionValidationContexts = 2

public val ExtensionValidationResultArrestPageLoad: ExtensionValidationResults = 2

public val ExtensionValidationResultDoNotInstantiate: ExtensionValidationResults = 1

public val ExtensionValidationResultNone: ExtensionValidationResults = 0

public val FINDFRAME_INTERNAL: FINDFRAME_FLAGS = -2147483648

public val FINDFRAME_JUSTTESTEXISTENCE: FINDFRAME_FLAGS = 1

public val FINDFRAME_NONE: FINDFRAME_FLAGS = 0

public val FRAMEOPTIONS_BROWSERBAND: FRAMEOPTIONS_FLAGS = 64

public val FRAMEOPTIONS_DESKTOP: FRAMEOPTIONS_FLAGS = 32

public val FRAMEOPTIONS_NO3DBORDER: FRAMEOPTIONS_FLAGS = 16

public val FRAMEOPTIONS_NORESIZE: FRAMEOPTIONS_FLAGS = 8

public val FRAMEOPTIONS_SCROLL_AUTO: FRAMEOPTIONS_FLAGS = 4

public val FRAMEOPTIONS_SCROLL_NO: FRAMEOPTIONS_FLAGS = 2

public val FRAMEOPTIONS_SCROLL_YES: FRAMEOPTIONS_FLAGS = 1

public val HomePage: GUID = GUID.from_u128(U128(0x766bf2aed65011d1uL, 0x981100c04fc31d2euL))

public val HomePageSetting: GUID = GUID.from_u128(U128(0x374cede0873a4c4fuL, 0xbc86bcc8cf5116a3uL))

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

public val IEGetProcessModule_PROC_NAME: PCSTR = s("IEGetProcessModule")

public val IEGetTabWindowExports_PROC_NAME: PCSTR = s("IEGetTabWindowExports")

public val IELAUNCHOPTION_FORCE_COMPAT: IELAUNCHOPTION_FLAGS = 2

public val IELAUNCHOPTION_FORCE_EDGE: IELAUNCHOPTION_FLAGS = 4

public val IELAUNCHOPTION_LOCK_ENGINE: IELAUNCHOPTION_FLAGS = 8

public val IELAUNCHOPTION_SCRIPTDEBUG: IELAUNCHOPTION_FLAGS = 1

public val IEPROCESS_MODULE_NAME: PCWSTR = w("IERtUtil.dll")

public val IEWebDriverManager: GUID = GUID.from_u128(U128(0x90314af2525047b3uL, 0x89d86295fc23bc22uL))

public val IE_USE_OE_MAIL_HKEY: Int = -2147483647

public val IE_USE_OE_MAIL_KEY: PCWSTR = w("Software\\Microsoft\\Internet Explorer\\Mail")

public val IE_USE_OE_MAIL_VALUE: PCWSTR = w("Use Outlook Express")

public val IE_USE_OE_NEWS_HKEY: Int = -2147483647

public val IE_USE_OE_NEWS_KEY: PCWSTR = w("Software\\Microsoft\\Internet Explorer\\News")

public val IE_USE_OE_NEWS_VALUE: PCWSTR = w("Use Outlook Express")

public val IE_USE_OE_PRESENT_HKEY: Int = -2147483646

public val IE_USE_OE_PRESENT_KEY: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\app.paths\\msimn.exe")

public val IMGDECODE_EVENT_BEGINBITS: UInt = 4u

public val IMGDECODE_EVENT_BITSCOMPLETE: UInt = 8u

public val IMGDECODE_EVENT_PALETTE: UInt = 2u

public val IMGDECODE_EVENT_PROGRESS: UInt = 1u

public val IMGDECODE_EVENT_USEDDRAW: UInt = 16u

public val IMGDECODE_HINT_BOTTOMUP: UInt = 2u

public val IMGDECODE_HINT_FULLWIDTH: UInt = 4u

public val IMGDECODE_HINT_TOPDOWN: UInt = 1u

public val INTERNETEXPLORERCONFIGURATION_HOST: INTERNETEXPLORERCONFIGURATION = 1

public val INTERNETEXPLORERCONFIGURATION_WEB_DRIVER: INTERNETEXPLORERCONFIGURATION = 2

public val INTERNETEXPLORERCONFIGURATION_WEB_DRIVER_EDGE: INTERNETEXPLORERCONFIGURATION = 4

public val IntelliForms: GUID = GUID.from_u128(U128(0x613ab92e16bf11d2uL, 0xbca500c04fd929dbuL))

public val InternetExplorerManager: GUID = GUID.from_u128(U128(0xdf4fcc34067a4e0auL, 0x83524a1a5095346euL))

public val LINKSBAND: UInt = 4u

public val MAPMIME_CLSID: UInt = 1u

public val MAPMIME_DEFAULT: UInt = 0u

public val MAPMIME_DEFAULT_ALWAYS: UInt = 3u

public val MAPMIME_DISABLE: UInt = 2u

public val MAX_SEARCH_FORMAT_STRING: UInt = 255u

public val MediaCasting: MEDIA_ACTIVITY_NOTIFY_TYPE = 2

public val MediaPlayback: MEDIA_ACTIVITY_NOTIFY_TYPE = 0

public val MediaRecording: MEDIA_ACTIVITY_NOTIFY_TYPE = 1

public val NAVIGATEFRAME_FL_AUTH_FAIL_CACHE_OK: NAVIGATEFRAME_FLAGS = 16

public val NAVIGATEFRAME_FL_NO_DOC_CACHE: NAVIGATEFRAME_FLAGS = 4

public val NAVIGATEFRAME_FL_NO_IMAGE_CACHE: NAVIGATEFRAME_FLAGS = 8

public val NAVIGATEFRAME_FL_POST: NAVIGATEFRAME_FLAGS = 2

public val NAVIGATEFRAME_FL_REALLY_SENDING_FROM_FORM: NAVIGATEFRAME_FLAGS = 64

public val NAVIGATEFRAME_FL_RECORD: NAVIGATEFRAME_FLAGS = 1

public val NAVIGATEFRAME_FL_SENDING_FROM_FORM: NAVIGATEFRAME_FLAGS = 32

public val OS_E_CANCELLED: OpenServiceErrors = -2147471631

public val OS_E_GPDISABLED: OpenServiceErrors = -1072886820

public val OS_E_NOTFOUND: OpenServiceErrors = -2147287038

public val OS_E_NOTSUPPORTED: OpenServiceErrors = -2147467231

public val OpenServiceActivityManager: GUID = GUID.from_u128(U128(0xc5efd80350f843cduL, 0x9ab8aafc1394c9e0uL))

public val OpenServiceManager: GUID = GUID.from_u128(U128(0x98870b639ea480buL, 0xb8b5dd0167c4db59uL))

public val PeerFactory: GUID = GUID.from_u128(U128(0x3050f4cf98b511cfuL, 0xbb8200aa00bdce0buL))

public val REGSTRA_VAL_STARTPAGE: PCSTR = s("Start Page")

public val REGSTR_PATH_CURRENT: PCWSTR = w("current")

public val REGSTR_PATH_DEFAULT: PCWSTR = w("default")

public val REGSTR_PATH_INETCPL_RESTRICTIONS: PCWSTR = w("Software\\Policies\\Microsoft\\Internet Explorer\\Control Panel")

public val REGSTR_PATH_MIME_DATABASE: PCWSTR = w("MIME\\Database")

public val REGSTR_PATH_REMOTEACCESS: PCWSTR = w("RemoteAccess")

public val REGSTR_PATH_REMOTEACESS: PCWSTR = w("RemoteAccess")

public val REGSTR_SHIFTQUICKSUFFIX: PCWSTR = w("ShiftQuickCompleteSuffix")

public val REGSTR_VAL_ACCEPT_LANGUAGE: PCWSTR = w("AcceptLanguage")

public val REGSTR_VAL_ACCESSMEDIUM: PCWSTR = w("AccessMedium")

public val REGSTR_VAL_ACCESSTYPE: PCWSTR = w("AccessType")

public val REGSTR_VAL_ALIASTO: PCWSTR = w("AliasForCharset")

public val REGSTR_VAL_ANCHORCOLOR: PCWSTR = w("Anchor Color")

public val REGSTR_VAL_ANCHORCOLORHOVER: PCWSTR = w("Anchor Color Hover")

public val REGSTR_VAL_ANCHORCOLORVISITED: PCWSTR = w("Anchor Color Visited")

public val REGSTR_VAL_ANCHORUNDERLINE: PCWSTR = w("Anchor Underline")

public val REGSTR_VAL_AUTODETECT: PCWSTR = w("AutoDetect")

public val REGSTR_VAL_AUTODIALDLLNAME: PCWSTR = w("AutodialDllName")

public val REGSTR_VAL_AUTODIALFCNNAME: PCWSTR = w("AutodialFcnName")

public val REGSTR_VAL_AUTODIAL_MONITORCLASSNAME: PCWSTR = w("MS_AutodialMonitor")

public val REGSTR_VAL_AUTODIAL_TRYONLYONCE: PCWSTR = w("TryAutodialOnce")

public val REGSTR_VAL_AUTONAVIGATE: PCWSTR = w("SearchForExtensions")

public val REGSTR_VAL_AUTOSEARCH: PCWSTR = w("Do404Search")

public val REGSTR_VAL_BACKBITMAP: PCWSTR = w("BackBitmap")

public val REGSTR_VAL_BACKGROUNDCOLOR: PCWSTR = w("Background Color")

public val REGSTR_VAL_BODYCHARSET: PCWSTR = w("BodyCharset")

public val REGSTR_VAL_BYPASSAUTOCONFIG: PCWSTR = w("BypassAutoconfig")

public val REGSTR_VAL_CACHEPREFIX: PCWSTR = w("CachePrefix")

public val REGSTR_VAL_CHECKASSOC: PCWSTR = w("Check_Associations")

public val REGSTR_VAL_CODEDOWNLOAD: PCWSTR = w("Code Download")

public val REGSTR_VAL_CODEDOWNLOAD_DEF: PCWSTR = w("yes")

public val REGSTR_VAL_CODEPAGE: PCWSTR = w("CodePage")

public val REGSTR_VAL_COVEREXCLUDE: PCWSTR = w("CoverExclude")

public val REGSTR_VAL_DAYSTOKEEP: PCWSTR = w("DaysToKeep")

public val REGSTR_VAL_DEFAULT_CODEPAGE: PCWSTR = w("Default_CodePage")

public val REGSTR_VAL_DEFAULT_SCRIPT: PCWSTR = w("Default_Script")

public val REGSTR_VAL_DEF_ENCODING: PCWSTR = w("Default_Encoding")

public val REGSTR_VAL_DEF_INETENCODING: PCWSTR = w("Default_InternetEncoding")

public val REGSTR_VAL_DESCRIPTION: PCWSTR = w("Description")

public val REGSTR_VAL_DIRECTORY: PCWSTR = w("Directory")

public val REGSTR_VAL_DISCONNECTIDLETIME: PCWSTR = w("DisconnectIdleTime")

public val REGSTR_VAL_ENABLEAUTODIAL: PCWSTR = w("EnableAutodial")

public val REGSTR_VAL_ENABLEAUTODIALDISCONNECT: PCWSTR = w("EnableAutodisconnect")

public val REGSTR_VAL_ENABLEAUTODISCONNECT: PCWSTR = w("EnableAutodisconnect")

public val REGSTR_VAL_ENABLEEXITDISCONNECT: PCWSTR = w("EnableExitDisconnect")

public val REGSTR_VAL_ENABLESECURITYCHECK: PCWSTR = w("EnableSecurityCheck")

public val REGSTR_VAL_ENABLEUNATTENDED: PCWSTR = w("EnableUnattended")

public val REGSTR_VAL_ENCODENAME: PCWSTR = w("EncodingName")

public val REGSTR_VAL_FAMILY: PCWSTR = w("Family")

public val REGSTR_VAL_FIXEDWIDTHFONT: PCWSTR = w("FixedWidthFont")

public val REGSTR_VAL_FIXED_FONT: PCWSTR = w("IEFixedFontName")

public val REGSTR_VAL_FONT_SCRIPT: PCWSTR = w("Script")

public val REGSTR_VAL_FONT_SCRIPTS: PCWSTR = w("Scripts")

public val REGSTR_VAL_FONT_SCRIPT_NAME: PCWSTR = w("Script")

public val REGSTR_VAL_FONT_SIZE: PCWSTR = w("IEFontSize")

public val REGSTR_VAL_FONT_SIZE_DEF: UInt = 2u

public val REGSTR_VAL_HEADERCHARSET: PCWSTR = w("HeaderCharset")

public val REGSTR_VAL_HTTP_ERRORS: PCWSTR = w("Friendly http errors")

public val REGSTR_VAL_IE_CUSTOMCOLORS: PCWSTR = w("Custom Colors")

public val REGSTR_VAL_INETCPL_ADVANCEDTAB: PCWSTR = w("AdvancedTab")

public val REGSTR_VAL_INETCPL_CONNECTIONSTAB: PCWSTR = w("ConnectionsTab")

public val REGSTR_VAL_INETCPL_CONTENTTAB: PCWSTR = w("ContentTab")

public val REGSTR_VAL_INETCPL_GENERALTAB: PCWSTR = w("GeneralTab")

public val REGSTR_VAL_INETCPL_IEAK: PCWSTR = w("IEAKContext")

public val REGSTR_VAL_INETCPL_PRIVACYTAB: PCWSTR = w("PrivacyTab")

public val REGSTR_VAL_INETCPL_PROGRAMSTAB: PCWSTR = w("ProgramsTab")

public val REGSTR_VAL_INETCPL_SECURITYTAB: PCWSTR = w("SecurityTab")

public val REGSTR_VAL_INETENCODING: PCWSTR = w("InternetEncoding")

public val REGSTR_VAL_INTERNETENTRY: PCWSTR = w("InternetProfile")

public val REGSTR_VAL_INTERNETENTRYBKUP: PCWSTR = w("BackupInternetProfile")

public val REGSTR_VAL_INTERNETPROFILE: PCWSTR = w("InternetProfile")

public val REGSTR_VAL_JAVAJIT: PCWSTR = w("EnableJIT")

public val REGSTR_VAL_JAVAJIT_DEF: UInt = 0u

public val REGSTR_VAL_JAVALOGGING: PCWSTR = w("EnableLogging")

public val REGSTR_VAL_JAVALOGGING_DEF: UInt = 0u

public val REGSTR_VAL_LEVEL: PCWSTR = w("Level")

public val REGSTR_VAL_LOADIMAGES: PCWSTR = w("Display Inline Images")

public val REGSTR_VAL_LOCALPAGE: PCWSTR = w("Local Page")

public val REGSTR_VAL_MOSDISCONNECT: PCWSTR = w("DisconnectTimeout")

public val REGSTR_VAL_NEWDIRECTORY: PCWSTR = w("NewDirectory")

public val REGSTR_VAL_NONETAUTODIAL: PCWSTR = w("NoNetAutodial")

public val REGSTR_VAL_PLAYSOUNDS: PCWSTR = w("Play_Background_Sounds")

public val REGSTR_VAL_PLAYVIDEOS: PCWSTR = w("Display Inline Videos")

public val REGSTR_VAL_PRIVCONVERTER: PCWSTR = w("PrivConverter")

public val REGSTR_VAL_PROPORTIONALFONT: PCWSTR = w("ProportionalFont")

public val REGSTR_VAL_PROP_FONT: PCWSTR = w("IEPropFontName")

public val REGSTR_VAL_PROXYENABLE: PCWSTR = w("ProxyEnable")

public val REGSTR_VAL_PROXYOVERRIDE: PCWSTR = w("ProxyOverride")

public val REGSTR_VAL_PROXYSERVER: PCWSTR = w("ProxyServer")

public val REGSTR_VAL_REDIALATTEMPTS: PCWSTR = w("RedialAttempts")

public val REGSTR_VAL_REDIALINTERVAL: PCWSTR = w("RedialWait")

public val REGSTR_VAL_RNAINSTALLED: PCWSTR = w("Installed")

public val REGSTR_VAL_SAFETYWARNINGLEVEL: PCWSTR = w("Safety Warning Level")

public val REGSTR_VAL_SCHANNELENABLEPROTOCOL: PCWSTR = w("Enabled")

public val REGSTR_VAL_SCHANNELENABLEPROTOCOL_DEF: UInt = 1u

public val REGSTR_VAL_SCRIPT_FIXED_FONT: PCWSTR = w("IEFixedFontName")

public val REGSTR_VAL_SCRIPT_PROP_FONT: PCWSTR = w("IEPropFontName")

public val REGSTR_VAL_SEARCHPAGE: PCWSTR = w("Search Page")

public val REGSTR_VAL_SECURITYACTICEXSCRIPTS: PCWSTR = w("Security_RunScripts")

public val REGSTR_VAL_SECURITYACTICEXSCRIPTS_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYACTIVEX: PCWSTR = w("Security_RunActiveXControls")

public val REGSTR_VAL_SECURITYACTIVEX_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYALLOWCOOKIES: PCWSTR = w("AllowCookies")

public val REGSTR_VAL_SECURITYALLOWCOOKIES_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYDISABLECACHINGOFSSLPAGES: PCWSTR = w("DisableCachingOfSSLPages")

public val REGSTR_VAL_SECURITYDISABLECACHINGOFSSLPAGES_DEF: UInt = 0u

public val REGSTR_VAL_SECURITYJAVA: PCWSTR = w("Security_RunJavaApplets")

public val REGSTR_VAL_SECURITYJAVA_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONBADCERTSENDING: PCWSTR = w("WarnOnBadCertSending")

public val REGSTR_VAL_SECURITYWARNONBADCERTSENDING_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONBADCERTVIEWING: PCWSTR = w("WarnOnBadCertRecving")

public val REGSTR_VAL_SECURITYWARNONBADCERTVIEWING_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONSEND: PCWSTR = w("WarnOnPost")

public val REGSTR_VAL_SECURITYWARNONSENDALWAYS: PCWSTR = w("WarnAlwaysOnPost")

public val REGSTR_VAL_SECURITYWARNONSENDALWAYS_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONSEND_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONVIEW: PCWSTR = w("WarnOnView")

public val REGSTR_VAL_SECURITYWARNONVIEW_DEF: UInt = 1u

public val REGSTR_VAL_SECURITYWARNONZONECROSSING: PCWSTR = w("WarnOnZoneCrossing")

public val REGSTR_VAL_SECURITYWARNONZONECROSSING_DEF: UInt = 1u

public val REGSTR_VAL_SHOWADDRESSBAR: PCWSTR = w("Show_URLToolBar")

public val REGSTR_VAL_SHOWFOCUS: PCWSTR = w("Tabstop - MouseDown")

public val REGSTR_VAL_SHOWFOCUS_DEF: PCWSTR = w("no")

public val REGSTR_VAL_SHOWFULLURLS: PCWSTR = w("Show_FullURL")

public val REGSTR_VAL_SHOWTOOLBAR: PCWSTR = w("Show_ToolBar")

public val REGSTR_VAL_SMOOTHSCROLL: PCWSTR = w("SmoothScroll")

public val REGSTR_VAL_SMOOTHSCROLL_DEF: UInt = 1u

public val REGSTR_VAL_STARTPAGE: PCWSTR = w("Start Page")

public val REGSTR_VAL_TEXTCOLOR: PCWSTR = w("Text Color")

public val REGSTR_VAL_TRUSTWARNINGLEVEL_HIGH: PCWSTR = w("High")

public val REGSTR_VAL_TRUSTWARNINGLEVEL_LOW: PCWSTR = w("No Security")

public val REGSTR_VAL_TRUSTWARNINGLEVEL_MED: PCWSTR = w("Medium")

public val REGSTR_VAL_USEAUTOAPPEND: PCWSTR = w("Append Completion")

public val REGSTR_VAL_USEAUTOCOMPLETE: PCWSTR = w("Use AutoComplete")

public val REGSTR_VAL_USEAUTOSUGGEST: PCWSTR = w("AutoSuggest")

public val REGSTR_VAL_USEDLGCOLORS: PCWSTR = w("Use_DlgBox_Colors")

public val REGSTR_VAL_USEHOVERCOLOR: PCWSTR = w("Use Anchor Hover Color")

public val REGSTR_VAL_USEIBAR: PCWSTR = w("UseBar")

public val REGSTR_VAL_USEICM: PCWSTR = w("UseICM")

public val REGSTR_VAL_USEICM_DEF: UInt = 0u

public val REGSTR_VAL_USERAGENT: PCWSTR = w("User Agent")

public val REGSTR_VAL_USESTYLESHEETS: PCWSTR = w("Use Stylesheets")

public val REGSTR_VAL_USESTYLESHEETS_DEF: PCWSTR = w("yes")

public val REGSTR_VAL_VISIBLEBANDS: PCWSTR = w("VisibleBands")

public val REGSTR_VAL_VISIBLEBANDS_DEF: UInt = 7u

public val REGSTR_VAL_WEBCHARSET: PCWSTR = w("WebCharset")

public val SCMP_BOTTOM: SCROLLABLECONTEXTMENU_PLACEMENT = 1

public val SCMP_FULL: SCROLLABLECONTEXTMENU_PLACEMENT = 4

public val SCMP_LEFT: SCROLLABLECONTEXTMENU_PLACEMENT = 2

public val SCMP_RIGHT: SCROLLABLECONTEXTMENU_PLACEMENT = 3

public val SCMP_TOP: SCROLLABLECONTEXTMENU_PLACEMENT = 0

public val STATURLFLAG_ISCACHED: UInt = 1u

public val STATURLFLAG_ISTOPLEVEL: UInt = 2u

public val STATURL_QUERYFLAG_ISCACHED: UInt = 65536u

public val STATURL_QUERYFLAG_NOTITLE: UInt = 262144u

public val STATURL_QUERYFLAG_NOURL: UInt = 131072u

public val STATURL_QUERYFLAG_TOPLEVEL: UInt = 524288u

public val SURFACE_LOCK_ALLOW_DISCARD: UInt = 2u

public val SURFACE_LOCK_EXCLUSIVE: UInt = 1u

public val SURFACE_LOCK_WAIT: UInt = 4u

public val SZBACKBITMAP: PCSTR = s("BackBitmap")

public val SZJAVAVMPATH: PCSTR = s("\\Java VM")

public val SZNOTEXT: PCSTR = s("NoText")

public val SZTOOLBAR: PCSTR = s("\\Toolbar")

public val SZTRUSTWARNLEVEL: PCSTR = s("Trust Warning Level")

public val SZVISIBLE: PCSTR = s("VisibleBands")

public val SZ_IE_DEFAULT_HTML_EDITOR: PCSTR = s("Default HTML Editor")

public val SZ_IE_IBAR: PCSTR = s("Bar")

public val SZ_IE_IBAR_BANDS: PCSTR = s("Bands")

public val SZ_IE_MAIN: PCSTR = s("Main")

public val SZ_IE_SEARCHSTRINGS: PCSTR = s("UrlTemplate")

public val SZ_IE_SECURITY: PCSTR = s("Security")

public val SZ_IE_SETTINGS: PCSTR = s("Settings")

public val SZ_IE_THRESHOLDS: PCSTR = s("ErrorThresholds")

public val S_SURFACE_DISCARDED: Int = 49155

public val TARGET_NOTIFY_OBJECT_NAME: PCWSTR = w("863a99a0-21bc-11d0-82b4-00a0c90c29c5")

public val TF_NAVIGATE: UInt = 2142153644u

public val TIMERMODE_NORMAL: UInt = 0u

public val TIMERMODE_VISIBILITYAWARE: UInt = 1u

public val TOOLSBAND: UInt = 1u

public val TSZCALENDARPROTOCOL: PCWSTR = w("unk")

public val TSZCALLTOPROTOCOL: PCWSTR = w("callto")

public val TSZINTERNETCLIENTSPATH: PCWSTR = w("Software\\Microsoft\\Internet Explorer\\Unix")

public val TSZLDAPPROTOCOL: PCWSTR = w("ldap")

public val TSZMAILTOPROTOCOL: PCWSTR = w("mailto")

public val TSZMICROSOFTPATH: PCWSTR = w("Software\\Microsoft")

public val TSZNEWSPROTOCOL: PCWSTR = w("news")

public val TSZPROTOCOLSPATH: PCWSTR = w("Protocols\\")

public val TSZSCHANNELPATH: PCWSTR = w("SYSTEM\\CurrentControlSet\\Control\\SecurityProviders\\SCHANNEL")

public val TSZVSOURCEPROTOCOL: PCWSTR = w("view source")

public val msodsvFailed: UInt = 3u

public val msodsvLowSecurityLevel: UInt = 4u

public val msodsvNoMacros: UInt = 0u

public val msodsvPassedTrusted: UInt = 2u

public val msodsvPassedTrustedCert: UInt = 5u

public val msodsvUnsigned: UInt = 1u

public val msoedmDisable: UInt = 2u

public val msoedmDontOpen: UInt = 3u

public val msoedmEnable: UInt = 1u

public val msoslHigh: UInt = 3u

public val msoslMedium: UInt = 2u

public val msoslNone: UInt = 1u

public val msoslUndefined: UInt = 0u

public val wfolders: GUID = GUID.from_u128(U128(0xbae31f9a1b8111d2uL, 0xa97a00c04f8ecb02uL))
