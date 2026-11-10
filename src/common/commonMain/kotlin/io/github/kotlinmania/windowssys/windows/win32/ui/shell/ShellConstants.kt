package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ABE_BOTTOM: UInt = 3u

public val ABE_LEFT: UInt = 0u

public val ABE_RIGHT: UInt = 2u

public val ABE_TOP: UInt = 1u

public val ABM_ACTIVATE: UInt = 6u

public val ABM_GETAUTOHIDEBAR: UInt = 7u

public val ABM_GETAUTOHIDEBAREX: UInt = 11u

public val ABM_GETSTATE: UInt = 4u

public val ABM_GETTASKBARPOS: UInt = 5u

public val ABM_NEW: UInt = 0u

public val ABM_QUERYPOS: UInt = 2u

public val ABM_REMOVE: UInt = 1u

public val ABM_SETAUTOHIDEBAR: UInt = 8u

public val ABM_SETAUTOHIDEBAREX: UInt = 12u

public val ABM_SETPOS: UInt = 3u

public val ABM_SETSTATE: UInt = 10u

public val ABM_WINDOWPOSCHANGED: UInt = 9u

public val ABN_FULLSCREENAPP: UInt = 2u

public val ABN_POSCHANGED: UInt = 1u

public val ABN_STATECHANGE: UInt = 0u

public val ABN_WINDOWARRANGE: UInt = 3u

public val ABS_ALWAYSONTOP: UInt = 2u

public val ABS_AUTOHIDE: UInt = 1u

public val ACDD_VISIBLE: UInt = 1u

public val ACEO_FIRSTUNUSED: Acenumoption = 65536

public val ACEO_MOSTRECENTFIRST: Acenumoption = 1

public val ACEO_NONE: Acenumoption = 0

public val ACLO_CURRENTDIR: Autocompletelistoptions = 1

public val ACLO_DESKTOP: Autocompletelistoptions = 4

public val ACLO_FAVORITES: Autocompletelistoptions = 8

public val ACLO_FILESYSDIRS: Autocompletelistoptions = 32

public val ACLO_FILESYSONLY: Autocompletelistoptions = 16

public val ACLO_MYCOMPUTER: Autocompletelistoptions = 2

public val ACLO_NONE: Autocompletelistoptions = 0

public val ACLO_VIRTUALNAMESPACE: Autocompletelistoptions = 64

public val ACO_AUTOAPPEND: Autocompleteoptions = 2

public val ACO_AUTOSUGGEST: Autocompleteoptions = 1

public val ACO_FILTERPREFIXES: Autocompleteoptions = 8

public val ACO_NONE: Autocompleteoptions = 0

public val ACO_NOPREFIXFILTERING: Autocompleteoptions = 256

public val ACO_RTLREADING: Autocompleteoptions = 64

public val ACO_SEARCH: Autocompleteoptions = 4

public val ACO_UPDOWNKEYDROPSLIST: Autocompleteoptions = 32

public val ACO_USETAB: Autocompleteoptions = 16

public val ACO_WORD_FILTER: Autocompleteoptions = 128

public val ADDURL_SILENT: UInt = 1u

public val ADE_LEFT: AdjacentDisplayEdges = 1

public val ADE_NONE: AdjacentDisplayEdges = 0

public val ADE_RIGHT: AdjacentDisplayEdges = 2

public val ADLT_FREQUENT: Appdoclisttype = 1

public val ADLT_RECENT: Appdoclisttype = 0

public val AD_APPLY_BUFFERED_REFRESH: UInt = 16u

public val AD_APPLY_DYNAMICREFRESH: UInt = 32u

public val AD_APPLY_FORCE: UInt = 8u

public val AD_APPLY_HTMLGEN: UInt = 2u

public val AD_APPLY_REFRESH: UInt = 4u

public val AD_APPLY_SAVE: UInt = 1u

public val AD_GETWP_BMP: UInt = 0u

public val AD_GETWP_IMAGE: UInt = 1u

public val AD_GETWP_LAST_APPLIED: UInt = 2u

public val AHE_DESKTOP: AheType = 0

public val AHE_IMMERSIVE: AheType = 1

public val AHTYPE_ANY_APPLICATION: Ahtype = 16

public val AHTYPE_ANY_PROGID: Ahtype = 512

public val AHTYPE_APPLICATION: Ahtype = 128

public val AHTYPE_CLASS_APPLICATION: Ahtype = 256

public val AHTYPE_MACHINEDEFAULT: Ahtype = 32

public val AHTYPE_PROGID: Ahtype = 64

public val AHTYPE_UNDEFINED: Ahtype = 0

public val AHTYPE_USER_APPLICATION: Ahtype = 8

public val AIM_COMMENTS: Appinfodataflags = 32768

public val AIM_CONTACT: Appinfodataflags = 16384

public val AIM_DISPLAYNAME: Appinfodataflags = 1

public val AIM_HELPLINK: Appinfodataflags = 512

public val AIM_IMAGE: Appinfodataflags = 131072

public val AIM_INSTALLDATE: Appinfodataflags = 4096

public val AIM_INSTALLLOCATION: Appinfodataflags = 1024

public val AIM_INSTALLSOURCE: Appinfodataflags = 2048

public val AIM_LANGUAGE: Appinfodataflags = 64

public val AIM_PRODUCTID: Appinfodataflags = 8

public val AIM_PUBLISHER: Appinfodataflags = 4

public val AIM_READMEURL: Appinfodataflags = 262144

public val AIM_REGISTEREDCOMPANY: Appinfodataflags = 32

public val AIM_REGISTEREDOWNER: Appinfodataflags = 16

public val AIM_SUPPORTTELEPHONE: Appinfodataflags = 256

public val AIM_SUPPORTURL: Appinfodataflags = 128

public val AIM_UPDATEINFOURL: Appinfodataflags = 524288

public val AIM_VERSION: Appinfodataflags = 2

public val AL_EFFECTIVE: Associationlevel = 1

public val AL_MACHINE: Associationlevel = 0

public val AL_USER: Associationlevel = 2

public val AO_DESIGNMODE: Activateoptions = 1

public val AO_NOERRORUI: Activateoptions = 2

public val AO_NONE: Activateoptions = 0

public val AO_NOSPLASHSCREEN: Activateoptions = 4

public val AO_PRELAUNCH: Activateoptions = 33554432

public val APPACTION_ADDLATER: Appactionflags = 256

public val APPACTION_CANGETSIZE: Appactionflags = 32

public val APPACTION_INSTALL: Appactionflags = 1

public val APPACTION_MODIFY: Appactionflags = 4

public val APPACTION_MODIFYREMOVE: Appactionflags = 128

public val APPACTION_REPAIR: Appactionflags = 8

public val APPACTION_UNINSTALL: Appactionflags = 2

public val APPACTION_UNSCHEDULE: Appactionflags = 512

public val APPACTION_UPGRADE: Appactionflags = 16

public val APPNAMEBUFFERLEN: UInt = 40u

public val ARCONTENT_AUDIOCD: UInt = 4u

public val ARCONTENT_AUTOPLAYMUSIC: UInt = 256u

public val ARCONTENT_AUTOPLAYPIX: UInt = 128u

public val ARCONTENT_AUTOPLAYVIDEO: UInt = 512u

public val ARCONTENT_AUTORUNINF: UInt = 2u

public val ARCONTENT_BLANKBD: UInt = 8192u

public val ARCONTENT_BLANKCD: UInt = 16u

public val ARCONTENT_BLANKDVD: UInt = 32u

public val ARCONTENT_BLURAY: UInt = 16384u

public val ARCONTENT_CAMERASTORAGE: UInt = 32768u

public val ARCONTENT_CUSTOMEVENT: UInt = 65536u

public val ARCONTENT_DVDAUDIO: UInt = 4096u

public val ARCONTENT_DVDMOVIE: UInt = 8u

public val ARCONTENT_MASK: UInt = 131070u

public val ARCONTENT_NONE: UInt = 0u

public val ARCONTENT_PHASE_FINAL: UInt = 1073741824u

public val ARCONTENT_PHASE_MASK: UInt = 1879048192u

public val ARCONTENT_PHASE_PRESNIFF: UInt = 268435456u

public val ARCONTENT_PHASE_SNIFFING: UInt = 536870912u

public val ARCONTENT_PHASE_UNKNOWN: UInt = 0u

public val ARCONTENT_SVCD: UInt = 2048u

public val ARCONTENT_UNKNOWNCONTENT: UInt = 64u

public val ARCONTENT_VCD: UInt = 1024u

public val ASSOCCLASS_APP_KEY: Assocclass = 5

public val ASSOCCLASS_APP_STR: Assocclass = 6

public val ASSOCCLASS_CLSID_KEY: Assocclass = 3

public val ASSOCCLASS_CLSID_STR: Assocclass = 4

public val ASSOCCLASS_FIXED_PROGID_STR: Assocclass = 10

public val ASSOCCLASS_FOLDER: Assocclass = 8

public val ASSOCCLASS_PROGID_KEY: Assocclass = 1

public val ASSOCCLASS_PROGID_STR: Assocclass = 2

public val ASSOCCLASS_PROTOCOL_STR: Assocclass = 11

public val ASSOCCLASS_SHELL_KEY: Assocclass = 0

public val ASSOCCLASS_STAR: Assocclass = 9

public val ASSOCCLASS_SYSTEM_STR: Assocclass = 7

public val ASSOCDATA_EDITFLAGS: Assocdata = 5

public val ASSOCDATA_HASPERUSERASSOC: Assocdata = 4

public val ASSOCDATA_MAX: Assocdata = 7

public val ASSOCDATA_MSIDESCRIPTOR: Assocdata = 1

public val ASSOCDATA_NOACTIVATEHANDLER: Assocdata = 2

public val ASSOCDATA_UNUSED1: Assocdata = 3

public val ASSOCDATA_VALUE: Assocdata = 6

public val ASSOCENUM_NONE: Assocenum = 0

public val ASSOCF_APP_TO_APP: Assocf = 65536u

public val ASSOCF_IGNOREBASECLASS: Assocf = 512u

public val ASSOCF_INIT_BYEXENAME: Assocf = 2u

public val ASSOCF_INIT_DEFAULTTOFOLDER: Assocf = 8u

public val ASSOCF_INIT_DEFAULTTOSTAR: Assocf = 4u

public val ASSOCF_INIT_FIXED_PROGID: Assocf = 2048u

public val ASSOCF_INIT_FOR_FILE: Assocf = 8192u

public val ASSOCF_INIT_IGNOREUNKNOWN: Assocf = 1024u

public val ASSOCF_INIT_NOREMAPCLSID: Assocf = 1u

public val ASSOCF_IS_FULL_URI: Assocf = 16384u

public val ASSOCF_IS_PROTOCOL: Assocf = 4096u

public val ASSOCF_NOFIXUPS: Assocf = 256u

public val ASSOCF_NONE: Assocf = 0u

public val ASSOCF_NOTRUNCATE: Assocf = 32u

public val ASSOCF_NOUSERSETTINGS: Assocf = 16u

public val ASSOCF_OPEN_BYEXENAME: Assocf = 2u

public val ASSOCF_PER_MACHINE_ONLY: Assocf = 32768u

public val ASSOCF_REMAPRUNDLL: Assocf = 128u

public val ASSOCF_VERIFY: Assocf = 64u

public val ASSOCKEY_APP: Assockey = 2

public val ASSOCKEY_BASECLASS: Assockey = 4

public val ASSOCKEY_CLASS: Assockey = 3

public val ASSOCKEY_MAX: Assockey = 5

public val ASSOCKEY_SHELLEXECCLASS: Assockey = 1

public val ASSOCSTR_APPICONREFERENCE: Assocstr = 23

public val ASSOCSTR_APPID: Assocstr = 21

public val ASSOCSTR_APPPUBLISHER: Assocstr = 22

public val ASSOCSTR_COMMAND: Assocstr = 1

public val ASSOCSTR_CONTENTTYPE: Assocstr = 14

public val ASSOCSTR_DDEAPPLICATION: Assocstr = 9

public val ASSOCSTR_DDECOMMAND: Assocstr = 7

public val ASSOCSTR_DDEIFEXEC: Assocstr = 8

public val ASSOCSTR_DDETOPIC: Assocstr = 10

public val ASSOCSTR_DEFAULTICON: Assocstr = 15

public val ASSOCSTR_DELEGATEEXECUTE: Assocstr = 18

public val ASSOCSTR_DROPTARGET: Assocstr = 17

public val ASSOCSTR_EXECUTABLE: Assocstr = 2

public val ASSOCSTR_FRIENDLYAPPNAME: Assocstr = 4

public val ASSOCSTR_FRIENDLYDOCNAME: Assocstr = 3

public val ASSOCSTR_INFOTIP: Assocstr = 11

public val ASSOCSTR_MAX: Assocstr = 24

public val ASSOCSTR_NOOPEN: Assocstr = 5

public val ASSOCSTR_PROGID: Assocstr = 20

public val ASSOCSTR_QUICKTIP: Assocstr = 12

public val ASSOCSTR_SHELLEXTENSION: Assocstr = 16

public val ASSOCSTR_SHELLNEWVALUE: Assocstr = 6

public val ASSOCSTR_SUPPORTED_URI_PROTOCOLS: Assocstr = 19

public val ASSOCSTR_TILEINFO: Assocstr = 13

public val ASSOC_FILTER_NONE: AssocFilter = 0

public val ASSOC_FILTER_RECOMMENDED: AssocFilter = 1

public val ATTACHMENT_ACTION_CANCEL: AttachmentAction = 0

public val ATTACHMENT_ACTION_EXEC: AttachmentAction = 2

public val ATTACHMENT_ACTION_SAVE: AttachmentAction = 1

public val ATTACHMENT_PROMPT_EXEC: AttachmentPrompt = 2

public val ATTACHMENT_PROMPT_EXEC_OR_SAVE: AttachmentPrompt = 3

public val ATTACHMENT_PROMPT_NONE: AttachmentPrompt = 0

public val ATTACHMENT_PROMPT_SAVE: AttachmentPrompt = 1

public val AT_FILEEXTENSION: Associationtype = 0

public val AT_MIMETYPE: Associationtype = 3

public val AT_STARTMENUCLIENT: Associationtype = 2

public val AT_URLPROTOCOL: Associationtype = 1

public val AVMW_320: ApplicationViewMinWidth = 1

public val AVMW_500: ApplicationViewMinWidth = 2

public val AVMW_DEFAULT: ApplicationViewMinWidth = 0

public val AVO_LANDSCAPE: ApplicationViewOrientation = 0

public val AVO_PORTRAIT: ApplicationViewOrientation = 1

public val AVSP_CUSTOM: ApplicationViewSizePreference = 6

public val AVSP_DEFAULT: ApplicationViewSizePreference = 0

public val AVSP_USE_HALF: ApplicationViewSizePreference = 2

public val AVSP_USE_LESS: ApplicationViewSizePreference = 1

public val AVSP_USE_MINIMUM: ApplicationViewSizePreference = 4

public val AVSP_USE_MORE: ApplicationViewSizePreference = 3

public val AVSP_USE_NONE: ApplicationViewSizePreference = 5

public val AVS_FILLED: ApplicationViewState = 1

public val AVS_FULLSCREEN_LANDSCAPE: ApplicationViewState = 0

public val AVS_FULLSCREEN_PORTRAIT: ApplicationViewState = 3

public val AVS_SNAPPED: ApplicationViewState = 2

public val ACCESSIBILITY_DOCKING_SERVICE: Guid = Guid.fromU128(U128(0x29ce1d46b4814aa0uL, 0xa08ad3ebc8aca402uL))

public val ALLOW_SMALLER_SIZE: ThumbnailStreamCacheOptions = 4

public val ALPHABETICAL_CATEGORIZER: Guid = Guid.fromU128(U128(0x3c2654c673724f6buL, 0xb31055d6128f49d2uL))

public val APP_SHELL_VERB_HANDLER: Guid = Guid.fromU128(U128(0x4ed3a719cea84bd9uL, 0x910de252f997afc2uL))

public val APP_STARTUP_LINK: Guid = Guid.fromU128(U128(0x273eb5e788b04843uL, 0xbfefe2c81d43aae5uL))

public val APP_VISIBILITY: Guid = Guid.fromU128(U128(0x7e5fe3d9985f4908uL, 0x91f9ee19f9fd1514uL))

public val APPLICATION_ACTIVATION_MANAGER: Guid = Guid.fromU128(U128(0x45ba127d10a846eauL, 0x8ab756ea9078943cuL))

public val APPLICATION_ASSOCIATION_REGISTRATION: Guid = Guid.fromU128(U128(0x591209c7767b42b2uL, 0x9fba44ee4615f2c7uL))

public val APPLICATION_ASSOCIATION_REGISTRATION_UI: Guid = Guid.fromU128(U128(0x1968106df3b544cfuL, 0x890e116fcb9ecef1uL))

public val APPLICATION_DESIGN_MODE_SETTINGS: Guid = Guid.fromU128(U128(0x958a6fb5dcb24fafuL, 0xaafd7fb054ad1a3buL))

public val APPLICATION_DESTINATIONS: Guid = Guid.fromU128(U128(0x86c140034d6b4ef3uL, 0xa7b40506663b2e68uL))

public val APPLICATION_DOCUMENT_LISTS: Guid = Guid.fromU128(U128(0x86bec22230f247e0uL, 0x9f2560d11cd75c28uL))

public val ATTACHMENT_SERVICES: Guid = Guid.fromU128(U128(0x4125dd96e03a4103uL, 0x8f70e0597d803b9cuL))

public val BFFM_ENABLEOK: UInt = 1125u

public val BFFM_INITIALIZED: UInt = 1u

public val BFFM_IUNKNOWN: UInt = 5u

public val BFFM_SELCHANGED: UInt = 2u

public val BFFM_SETEXPANDED: UInt = 1130u

public val BFFM_SETOKTEXT: UInt = 1129u

public val BFFM_SETSELECTION: UInt = 1127u

public val BFFM_SETSELECTIONA: UInt = 1126u

public val BFFM_SETSELECTIONW: UInt = 1127u

public val BFFM_SETSTATUSTEXT: UInt = 1128u

public val BFFM_SETSTATUSTEXTA: UInt = 1124u

public val BFFM_SETSTATUSTEXTW: UInt = 1128u

public val BFFM_VALIDATEFAILED: UInt = 4u

public val BFFM_VALIDATEFAILEDA: UInt = 3u

public val BFFM_VALIDATEFAILEDW: UInt = 4u

public val BFO_ADD_IE_TOCAPTIONBAR: Browserframeoptions = 512

public val BFO_BOTH_OPTIONS: Browserframeoptions = 4

public val BFO_BROWSER_PERSIST_SETTINGS: Browserframeoptions = 1

public val BFO_BROWSE_NO_IN_NEW_PROCESS: Browserframeoptions = 16

public val BFO_ENABLE_HYPERLINK_TRACKING: Browserframeoptions = 32

public val BFO_GO_HOME_PAGE: Browserframeoptions = 16384

public val BFO_NONE: Browserframeoptions = 0

public val BFO_NO_PARENT_FOLDER_SUPPORT: Browserframeoptions = 4096

public val BFO_NO_REOPEN_NEXT_RESTART: Browserframeoptions = 8192

public val BFO_PREFER_IEPROCESS: Browserframeoptions = 32768

public val BFO_QUERY_ALL: Browserframeoptions = -1

public val BFO_RENAME_FOLDER_OPTIONS_TOINTERNET: Browserframeoptions = 2

public val BFO_SHOW_NAVIGATION_CANCELLED: Browserframeoptions = 65536

public val BFO_SUBSTITUE_INTERNET_START_PAGE: Browserframeoptions = 128

public val BFO_USE_DIALUP_REF: Browserframeoptions = 1024

public val BFO_USE_IE_LOGOBANDING: Browserframeoptions = 256

public val BFO_USE_IE_OFFLINE_SUPPORT: Browserframeoptions = 64

public val BFO_USE_IE_STATUSBAR: Browserframeoptions = 131072

public val BFO_USE_IE_TOOLBAR: Browserframeoptions = 2048

public val BHID_ASSOCIATION_ARRAY: Guid = Guid.fromU128(U128(0xbea9ef1782f14f60uL, 0x92844f8db75c3be9uL))

public val BHID_DATA_OBJECT: Guid = Guid.fromU128(U128(0xb8c0bd9fed24455cuL, 0x83e6d5390c4fe8c4uL))

public val BHID_ENUM_ASSOC_HANDLERS: Guid = Guid.fromU128(U128(0xb8ab0b9cc2ec4f7auL, 0x918d314900e6280auL))

public val BHID_ENUM_ITEMS: Guid = Guid.fromU128(U128(0x94f6051928504924uL, 0xaa5ad15e84868039uL))

public val BHID_FILE_PLACEHOLDER: Guid = Guid.fromU128(U128(0x8677dcebaae04005uL, 0x8d3d547fa852f825uL))

public val BHID_FILTER: Guid = Guid.fromU128(U128(0x38d08778f5574690uL, 0x9ebfba54706ad8f7uL))

public val BHID_LINK_TARGET_ITEM: Guid = Guid.fromU128(U128(0x3981e228f55911d3uL, 0x8e3a00c04f6837d5uL))

public val BHID_PROPERTY_STORE: Guid = Guid.fromU128(U128(0x384e1a41523439cuL, 0xa4c8ab911052f586uL))

public val BHID_RANDOM_ACCESS_STREAM: Guid = Guid.fromU128(U128(0xf16fc93b77ae4cfeuL, 0xbda7a866eea6878duL))

public val BHID_SF_OBJECT: Guid = Guid.fromU128(U128(0x3981e224f55911d3uL, 0x8e3a00c04f6837d5uL))

public val BHID_SFUI_OBJECT: Guid = Guid.fromU128(U128(0x3981e225f55911d3uL, 0x8e3a00c04f6837d5uL))

public val BHID_SF_VIEW_OBJECT: Guid = Guid.fromU128(U128(0x3981e226f55911d3uL, 0x8e3a00c04f6837d5uL))

public val BHID_STORAGE: Guid = Guid.fromU128(U128(0x3981e227f55911d3uL, 0x8e3a00c04f6837d5uL))

public val BHID_STORAGE_ENUM: Guid = Guid.fromU128(U128(0x4621a4e3f0d64773uL, 0x8a9c46e77b174840uL))

public val BHID_STORAGE_ITEM: Guid = Guid.fromU128(U128(0x404e210977d24699uL, 0xa5a04fdf10db9837uL))

public val BHID_STREAM: Guid = Guid.fromU128(U128(0x1cebb3ab7c10499auL, 0xa41792ca16c4cb83uL))

public val BHID_THUMBNAIL_HANDLER: Guid = Guid.fromU128(U128(0x7b2e650a8e204f4auL, 0xb09e6597afc72fb0uL))

public val BHID_TRANSFER: Guid = Guid.fromU128(U128(0xd5e346a1f7534932uL, 0xb4034574800e2498uL))

public val BIF_BROWSEFILEJUNCTIONS: UInt = 65536u

public val BIF_BROWSEFORCOMPUTER: UInt = 4096u

public val BIF_BROWSEFORPRINTER: UInt = 8192u

public val BIF_BROWSEINCLUDEFILES: UInt = 16384u

public val BIF_BROWSEINCLUDEURLS: UInt = 128u

public val BIF_DONTGOBELOWDOMAIN: UInt = 2u

public val BIF_EDITBOX: UInt = 16u

public val BIF_NEWDIALOGSTYLE: UInt = 64u

public val BIF_NONEWFOLDERBUTTON: UInt = 512u

public val BIF_NOTRANSLATETARGETS: UInt = 1024u

public val BIF_PREFER_INTERNET_SHORTCUT: Browserframeoptions = 8

public val BIF_RETURNFSANCESTORS: UInt = 8u

public val BIF_RETURNONLYFSDIRS: UInt = 1u

public val BIF_SHAREABLE: UInt = 32768u

public val BIF_STATUSTEXT: UInt = 4u

public val BIF_UAHINT: UInt = 256u

public val BIF_VALIDATE: UInt = 32u

public val BIND_INTERRUPTABLE: UInt = 4294967295u

public val BMICON_LARGE: Int = 0

public val BMICON_SMALL: Int = 1

public val BNE_BUTTON1CLICKED: BannerNotificationEvent = 4

public val BNE_BUTTON2CLICKED: BannerNotificationEvent = 5

public val BNE_CLOSED: BannerNotificationEvent = 2

public val BNE_DISMISSED: BannerNotificationEvent = 3

public val BNE_HOVERED: BannerNotificationEvent = 1

public val BNE_RENDERED: BannerNotificationEvent = 0

public val BNS_BEGIN_NAVIGATE: Bnstate = 1

public val BNS_NAVIGATE: Bnstate = 2

public val BNS_NORMAL: Bnstate = 0

public val BSF_CANMAXIMIZE: UInt = 1024u

public val BSF_DELEGATEDNAVIGATION: UInt = 65536u

public val BSF_DONTSHOWNAVCANCELPAGE: UInt = 16384u

public val BSF_FEEDNAVIGATION: UInt = 524288u

public val BSF_FEEDSUBSCRIBED: UInt = 1048576u

public val BSF_HTMLNAVCANCELED: UInt = 8192u

public val BSF_MERGEDMENUS: UInt = 262144u

public val BSF_NAVNOHISTORY: UInt = 4096u

public val BSF_NOLOCALFILEWARNING: UInt = 16u

public val BSF_REGISTERASDROPTARGET: UInt = 1u

public val BSF_RESIZABLE: UInt = 512u

public val BSF_SETNAVIGATABLECODEPAGE: UInt = 32768u

public val BSF_THEATERMODE: UInt = 2u

public val BSF_TOPBROWSER: UInt = 2048u

public val BSF_TRUSTEDFORACTIVEX: UInt = 131072u

public val BSF_UISETBYAUTOMATION: UInt = 256u

public val BSID_BANDADDED: Bandsitecid = 0

public val BSID_BANDREMOVED: Bandsitecid = 1

public val BSIM_STATE: UInt = 1u

public val BSIM_STYLE: UInt = 2u

public val BSIS_ALWAYSGRIPPER: UInt = 2u

public val BSIS_AUTOGRIPPER: UInt = 0u

public val BSIS_FIXEDORDER: UInt = 1024u

public val BSIS_LEFTALIGN: UInt = 4u

public val BSIS_LOCKED: UInt = 256u

public val BSIS_NOCAPTION: UInt = 64u

public val BSIS_NOCONTEXTMENU: UInt = 16u

public val BSIS_NODROPTARGET: UInt = 32u

public val BSIS_NOGRIPPER: UInt = 1u

public val BSIS_PREFERNOLINEBREAK: UInt = 128u

public val BSIS_PRESERVEORDERDURINGLAYOUT: UInt = 512u

public val BSIS_SINGLECLICK: UInt = 8u

public val BSSF_NOTITLE: UInt = 2u

public val BSSF_UNDELETEABLE: UInt = 4096u

public val BSSF_VISIBLE: UInt = 1u

public val BUFFLEN: UInt = 255u

public val CABINETSTATE_VERSION: UInt = 2u

public val CAMERAROLL_E_NO_DOWNSAMPLING_REQUIRED: Hresult = 0x80270120u.toInt()

public val CATID_BROWSABLE_SHELL_EXT: Guid = Guid.fromU128(U128(0x2149000000000uL, 0xc000000000000046uL))

public val CATID_BROWSE_IN_PLACE: Guid = Guid.fromU128(U128(0x2149100000000uL, 0xc000000000000046uL))

public val CATID_COMM_BAND: Guid = Guid.fromU128(U128(0x2149400000000uL, 0xc000000000000046uL))

public val CATID_DESK_BAND: Guid = Guid.fromU128(U128(0x2149200000000uL, 0xc000000000000046uL))

public val CATID_FILE_PLACEHOLDER_MERGE_HANDLER: Guid = Guid.fromU128(U128(0x3e9c9a51d4aa4870uL, 0xb47c7424b491f1ccuL))

public val CATID_INFO_BAND: Guid = Guid.fromU128(U128(0x2149300000000uL, 0xc000000000000046uL))

public val CATID_LOCATION_FACTORY: Guid = Guid.fromU128(U128(0x965c4d518b764e57uL, 0x80b7564d2ea4b55euL))

public val CATID_LOCATION_PROVIDER: Guid = Guid.fromU128(U128(0x1b3ca4742614414buL, 0xb8131aceca3e3dd8uL))

public val CATID_SEARCHABLE_APPLICATION: Guid = Guid.fromU128(U128(0x366c292ad9b34dbfuL, 0xbb70e62ec3d0bbbfuL))

public val CATINFO_COLLAPSED: CategoryinfoFlags = 1

public val CATINFO_EXPANDED: CategoryinfoFlags = 4

public val CATINFO_HIDDEN: CategoryinfoFlags = 2

public val CATINFO_NOHEADER: CategoryinfoFlags = 8

public val CATINFO_NOHEADERCOUNT: CategoryinfoFlags = 32

public val CATINFO_NORMAL: CategoryinfoFlags = 0

public val CATINFO_NOTCOLLAPSIBLE: CategoryinfoFlags = 16

public val CATINFO_SEPARATE_IMAGES: CategoryinfoFlags = 128

public val CATINFO_SHOWEMPTY: CategoryinfoFlags = 256

public val CATINFO_SUBSETTED: CategoryinfoFlags = 64

public val CATSORT_DEFAULT: CatsortFlags = 0

public val CATSORT_NAME: CatsortFlags = 1

public val CDB2GVF_ADDSHIELD: UInt = 64u

public val CDB2GVF_ALLOWPREVIEWPANE: UInt = 4u

public val CDB2GVF_ISFILESAVE: UInt = 2u

public val CDB2GVF_ISFOLDERPICKER: UInt = 32u

public val CDB2GVF_NOINCLUDEITEM: UInt = 16u

public val CDB2GVF_NOSELECTVERB: UInt = 8u

public val CDB2GVF_SHOWALLFILES: UInt = 1u

public val CDB2N_CONTEXTMENU_DONE: UInt = 1u

public val CDB2N_CONTEXTMENU_START: UInt = 2u

public val CDBE_RET_DEFAULT: Cdburningextensionret = 0

public val CDBE_RET_DONTRUNOTHEREXTS: Cdburningextensionret = 1

public val CDBE_RET_STOPWIZARD: Cdburningextensionret = 2

public val CDBE_TYPE_ALL: CdbeActions = -1

public val CDBE_TYPE_DATA: CdbeActions = 2

public val CDBE_TYPE_MUSIC: CdbeActions = 1

public val CDBOSC_KILLFOCUS: UInt = 1u

public val CDBOSC_RENAME: UInt = 3u

public val CDBOSC_SELCHANGE: UInt = 2u

public val CDBOSC_SETFOCUS: UInt = 0u

public val CDBOSC_STATECHANGE: UInt = 4u

public val CD_BURN: Guid = Guid.fromU128(U128(0xfbeb8a05beee4442uL, 0x804e409d6c4515e9uL))

public val CDCS_ENABLED: Cdcontrolstatef = 1

public val CDCS_ENABLEDVISIBLE: Cdcontrolstatef = 3

public val CDCS_INACTIVE: Cdcontrolstatef = 0

public val CDCS_VISIBLE: Cdcontrolstatef = 2

public val CFSTR_AUTOPLAY_SHELLIDLISTS: Pcwstr = w("Autoplay Enumerated IDList Array")

public val CFSTR_DROPDESCRIPTION: Pcwstr = w("DropDescription")

public val CFSTR_FILECONTENTS: Pcwstr = w("FileContents")

public val CFSTR_FILEDESCRIPTOR: Pcwstr = w("FileGroupDescriptorW")

public val CFSTR_FILEDESCRIPTORA: Pcwstr = w("FileGroupDescriptor")

public val CFSTR_FILEDESCRIPTORW: Pcwstr = w("FileGroupDescriptorW")

public val CFSTR_FILENAME: Pcwstr = w("FileNameW")

public val CFSTR_FILENAMEA: Pcwstr = w("FileName")

public val CFSTR_FILENAMEMAP: Pcwstr = w("FileNameMapW")

public val CFSTR_FILENAMEMAPA: Pcwstr = w("FileNameMap")

public val CFSTR_FILENAMEMAPW: Pcwstr = w("FileNameMapW")

public val CFSTR_FILENAMEW: Pcwstr = w("FileNameW")

public val CFSTR_FILE_ATTRIBUTES_ARRAY: Pcwstr = w("File Attributes Array")

public val CFSTR_INDRAGLOOP: Pcwstr = w("InShellDragLoop")

public val CFSTR_INETURL: Pcwstr = w("UniformResourceLocatorW")

public val CFSTR_INETURLA: Pcwstr = w("UniformResourceLocator")

public val CFSTR_INETURLW: Pcwstr = w("UniformResourceLocatorW")

public val CFSTR_INVOKECOMMAND_DROPPARAM: Pcwstr = w("InvokeCommand DropParam")

public val CFSTR_LOGICALPERFORMEDDROPEFFECT: Pcwstr = w("Logical Performed DropEffect")

public val CFSTR_MOUNTEDVOLUME: Pcwstr = w("MountedVolume")

public val CFSTR_NETRESOURCES: Pcwstr = w("Net Resource")

public val CFSTR_PASTESUCCEEDED: Pcwstr = w("Paste Succeeded")

public val CFSTR_PERFORMEDDROPEFFECT: Pcwstr = w("Performed DropEffect")

public val CFSTR_PERSISTEDDATAOBJECT: Pcwstr = w("PersistedDataObject")

public val CFSTR_PREFERREDDROPEFFECT: Pcwstr = w("Preferred DropEffect")

public val CFSTR_PRINTERGROUP: Pcwstr = w("PrinterFriendlyName")

public val CFSTR_SHELLDROPHANDLER: Pcwstr = w("DropHandlerCLSID")

public val CFSTR_SHELLIDLIST: Pcwstr = w("Shell IDList Array")

public val CFSTR_SHELLIDLISTOFFSET: Pcwstr = w("Shell Object Offsets")

public val CFSTR_SHELLURL: Pcwstr = w("UniformResourceLocator")

public val CFSTR_TARGETCLSID: Pcwstr = w("TargetCLSID")

public val CFSTR_UNTRUSTEDDRAGDROP: Pcwstr = w("UntrustedDragDrop")

public val CFSTR_ZONEIDENTIFIER: Pcwstr = w("ZoneIdentifier")

public val CGID_DEF_VIEW: Guid = Guid.fromU128(U128(0x4af07f10d23111d0uL, 0xb94200a0c90312e1uL))

public val CGID_EXPLORER: Guid = Guid.fromU128(U128(0x214d000000000uL, 0xc000000000000046uL))

public val CGID_EXPLORER_BAR_DOC: Guid = Guid.fromU128(U128(0x214d300000000uL, 0xc000000000000046uL))

public val CGID_MENUDESKBAR: Guid = Guid.fromU128(U128(0x5c9f0a12959e11d0uL, 0xa3a400a0c9082636uL))

public val CGID_SHELL_DOC_VIEW: Guid = Guid.fromU128(U128(0x214d100000000uL, 0xc000000000000046uL))

public val CGID_SHELL_SERVICE_OBJECT: Guid = Guid.fromU128(U128(0x214d200000000uL, 0xc000000000000046uL))

public val CGID_SHORT_CUT: Guid = Guid.fromU128(U128(0x93a68750951a11d1uL, 0x946f000000000000uL))

public val CLOSEPROPS_DISCARD: UInt = 1u

public val CLOSEPROPS_NONE: UInt = 0u

public val CLSID_ACL_CUSTOM_MRU: Guid = Guid.fromU128(U128(0x6935db9321e84cccuL, 0xbeb99fe3c77a297auL))

public val CLSID_ACL_HISTORY: Guid = Guid.fromU128(U128(0xbb27646a7711d0uL, 0xa53500c04fd7d062uL))

public val CLSID_ACLMRU: Guid = Guid.fromU128(U128(0x6756a641de7111d0uL, 0x831b00aa005b4383uL))

public val CLSID_ACL_MULTI: Guid = Guid.fromU128(U128(0xbb27656a7711d0uL, 0xa53500c04fd7d062uL))

public val CLSID_AC_LIST_ISF: Guid = Guid.fromU128(U128(0x3c036f1a18611d0uL, 0x824a00aa005b4383uL))

public val CLSID_ACTIVE_DESKTOP: Guid = Guid.fromU128(U128(0x75048700ef1f11d0uL, 0x9888006097deacf9uL))

public val CLSID_AUTO_COMPLETE: Guid = Guid.fromU128(U128(0xbb27636a7711d0uL, 0xa53500c04fd7d062uL))

public val CLSID_C_ANCHOR_BROWSE_PROPERTY_PAGE: Guid = Guid.fromU128(U128(0x3050f3bb98b511cfuL, 0xbb8200aa00bdce0buL))

public val CLSID_C_DOC_BROWSE_PROPERTY_PAGE: Guid = Guid.fromU128(U128(0x3050f3b498b511cfuL, 0xbb8200aa00bdce0buL))

public val CLSID_CFS_ICON_OVERLAY_MANAGER: Guid = Guid.fromU128(U128(0x63b51f81c86811d0uL, 0x999c00c04fd655e1uL))

public val CLSID_C_IMAGE_BROWSE_PROPERTY_PAGE: Guid = Guid.fromU128(U128(0x3050f3b398b511cfuL, 0xbb8200aa00bdce0buL))

public val CLSID_CURL_SEARCH_HOOK: Guid = Guid.fromU128(U128(0xcfbfae0017a611d0uL, 0x99cb00c04fd64497uL))

public val CLSID_C_URL_HISTORY: Guid = Guid.fromU128(U128(0x3c374a40bae411cfuL, 0xbf7d00aa006946eeuL))

public val CLSID_C_URL_HISTORY_BOTH: Guid = Guid.fromU128(U128(0x6659983c84764eb4uL, 0xb78ce5968f326ba0uL))

public val CLSID_CONTROL_PANEL: Guid = Guid.fromU128(U128(0x21ec20203aea1069uL, 0xa2dd08002b30309duL))

public val CLSID_DARWIN_APP_PUBLISHER: Guid = Guid.fromU128(U128(0xcfccc7a0a28211d1uL, 0x9082006008059382uL))

public val CLSID_DOC_HOST_UI_HANDLER: Guid = Guid.fromU128(U128(0x7057e952bd1b11d1uL, 0x891900c04fc2c836uL))

public val CLSID_DRAG_DROP_HELPER: Guid = Guid.fromU128(U128(0x4657278a411b11d2uL, 0x839a00c04fd918d0uL))

public val CLSID_FILE_TYPES: Guid = Guid.fromU128(U128(0xb091e54083e311cfuL, 0xa7130020afd79762uL))

public val CLSID_FOLDER_ITEMS_MULTI_LEVEL: Guid = Guid.fromU128(U128(0x53c74826ab994d33uL, 0xaca43117f51d3788uL))

public val CLSID_FOLDER_SHORTCUT: Guid = Guid.fromU128(U128(0xafaced1e82811d1uL, 0x9187b532f1e9575duL))

public val CLSID_HW_SHELL_EXECUTE: Guid = Guid.fromU128(U128(0xffb8655f81b94fceuL, 0xb89c9a6ba76d13e7uL))

public val CLSID_ISF_BAND: Guid = Guid.fromU128(U128(0xd82be2b0576411d0uL, 0xa96e00c04fd705a2uL))

public val CLSID_INTERNET: Guid = Guid.fromU128(U128(0x871c538042a01069uL, 0xa2ea08002b30309duL))

public val CLSID_INTERNET_BUTTONS: Guid = Guid.fromU128(U128(0x1e7969809cc511d1uL, 0xa83f00c04fc99d61uL))

public val CLSID_INTERNET_SHORTCUT: Guid = Guid.fromU128(U128(0xfbf23b40e3f0101buL, 0x848800aa003e56f8uL))

public val CLSID_LINK_COLUMN_PROVIDER: Guid = Guid.fromU128(U128(0x24f14f027b1c11d1uL, 0x838f0000f80461cfuL))

public val CLSID_MSO_BUTTONS: Guid = Guid.fromU128(U128(0x178f34b8a28211d2uL, 0x86c500c04f8eea99uL))

public val CLSID_MENU_BAND: Guid = Guid.fromU128(U128(0x5b4dae26b80711d0uL, 0x981500c04fd91972uL))

public val CLSID_MENU_BAND_SITE: Guid = Guid.fromU128(U128(0xe13ef4e4d2f211d0uL, 0x981600c04fd91972uL))

public val CLSID_MENU_TOOLBAR_BASE: Guid = Guid.fromU128(U128(0x40b96610b52211d1uL, 0xb3b400aa006efde7uL))

public val CLSID_MY_COMPUTER: Guid = Guid.fromU128(U128(0x20d04fe03aea1069uL, 0xa2d808002b30309duL))

public val CLSID_MY_DOCUMENTS: Guid = Guid.fromU128(U128(0x450d8fbaad2511d0uL, 0x98a80800361b1103uL))

public val CLSID_NETWORK_DOMAIN: Guid = Guid.fromU128(U128(0x46e066804bf011d1uL, 0x83ee00a0c90dc849uL))

public val CLSID_NETWORK_SERVER: Guid = Guid.fromU128(U128(0xc0542a904bf011d1uL, 0x83ee00a0c90dc849uL))

public val CLSID_NETWORK_SHARE: Guid = Guid.fromU128(U128(0x54a754c04bf011d1uL, 0x83ee00a0c90dc849uL))

public val CLSID_NEW_MENU: Guid = Guid.fromU128(U128(0xd969a300e7ff11d0uL, 0xa93b00a0c90f2719uL))

public val CLSID_PRINTERS: Guid = Guid.fromU128(U128(0x2227a2803aea1069uL, 0xa2de08002b30309duL))

public val CLSID_PROGRESS_DIALOG: Guid = Guid.fromU128(U128(0xf8383852fcd311d1uL, 0xa6b9006097df5bd4uL))

public val CLSID_QUERY_ASSOCIATIONS: Guid = Guid.fromU128(U128(0xa07034fd6caa4954uL, 0xac3f97a27216f98auL))

public val CLSID_QUICK_LINKS: Guid = Guid.fromU128(U128(0xe5cbf21d15f11d0uL, 0x830100aa005b4383uL))

public val CLSID_RECYCLE_BIN: Guid = Guid.fromU128(U128(0x645ff0405081101buL, 0x9f0800aa002f954euL))

public val CLSID_SHELL_FLD_SET_EXT: Guid = Guid.fromU128(U128(0x6d5313c08c6211d1uL, 0xb2cd006097df8c11uL))

public val CLSID_SHELL_THUMBNAIL_DISK_CACHE: Guid = Guid.fromU128(U128(0x1ebdcf80a20011d0uL, 0xa3a400c04fd706ecuL))

public val CLSID_TOOLBAR_EXT_BUTTONS: Guid = Guid.fromU128(U128(0x2ce4b5d8a28f11d2uL, 0x86c500c04f8eea99uL))

public val CMDID_INTSHORTCUTCREATE: Int = 1

public val CMDSTR_NEWFOLDER: Pcwstr = w("NewFolder")

public val CMDSTR_NEWFOLDERA: Pcstr = s("NewFolder")

public val CMDSTR_NEWFOLDERW: Pcwstr = w("NewFolder")

public val CMDSTR_VIEWDETAILS: Pcwstr = w("ViewDetails")

public val CMDSTR_VIEWDETAILSA: Pcstr = s("ViewDetails")

public val CMDSTR_VIEWDETAILSW: Pcwstr = w("ViewDetails")

public val CMDSTR_VIEWLIST: Pcwstr = w("ViewList")

public val CMDSTR_VIEWLISTA: Pcstr = s("ViewList")

public val CMDSTR_VIEWLISTW: Pcwstr = w("ViewList")

public val CMF_ASYNCVERBSTATE: UInt = 1024u

public val CMF_CANRENAME: UInt = 16u

public val CMF_DEFAULTONLY: UInt = 1u

public val CMF_DISABLEDVERBS: UInt = 512u

public val CMF_DONOTPICKDEFAULT: UInt = 8192u

public val CMF_EXPLORE: UInt = 4u

public val CMF_EXTENDEDVERBS: UInt = 256u

public val CMF_INCLUDESTATIC: UInt = 64u

public val CMF_ITEMMENU: UInt = 128u

public val CMF_NODEFAULT: UInt = 32u

public val CMF_NORMAL: UInt = 0u

public val CMF_NOVERBS: UInt = 8u

public val CMF_OPTIMIZEFORINVOKE: UInt = 2048u

public val CMF_RESERVED: UInt = 4294901760u

public val CMF_SYNCCASCADEMENU: UInt = 4096u

public val CMF_VERBSONLY: UInt = 2u

public val CMIC_MASK_CONTROL_DOWN: UInt = 1073741824u

public val CMIC_MASK_PTINVOKE: UInt = 536870912u

public val CMIC_MASK_SHIFT_DOWN: UInt = 268435456u

public val CM_ENUM_ALL: CmEnumFlags = 1

public val CM_ENUM_VISIBLE: CmEnumFlags = 2

public val CM_MASK_DEFAULTWIDTH: CmMask = 2

public val CM_MASK_IDEALWIDTH: CmMask = 4

public val CM_MASK_NAME: CmMask = 8

public val CM_MASK_STATE: CmMask = 16

public val CM_MASK_WIDTH: CmMask = 1

public val CM_STATE_ALWAYSVISIBLE: CmState = 8

public val CM_STATE_FIXEDWIDTH: CmState = 2

public val CM_STATE_NONE: CmState = 0

public val CM_STATE_NOSORTBYFOLDERNESS: CmState = 4

public val CM_STATE_VISIBLE: CmState = 1

public val CM_WIDTH_AUTOSIZE: CmSetWidthValue = -2

public val CM_WIDTH_USEDEFAULT: CmSetWidthValue = -1

public val COMPONENT_DEFAULT_LEFT: UInt = 65535u

public val COMPONENT_DEFAULT_TOP: UInt = 65535u

public val COMPONENT_TOP: UInt = 1073741823u

public val COMP_ELEM_CHECKED: UInt = 2u

public val COMP_ELEM_CURITEMSTATE: UInt = 16384u

public val COMP_ELEM_DIRTY: UInt = 4u

public val COMP_ELEM_FRIENDLYNAME: UInt = 1024u

public val COMP_ELEM_NOSCROLL: UInt = 8u

public val COMP_ELEM_ORIGINAL_CSI: UInt = 4096u

public val COMP_ELEM_POS_LEFT: UInt = 16u

public val COMP_ELEM_POS_TOP: UInt = 32u

public val COMP_ELEM_POS_ZINDEX: UInt = 256u

public val COMP_ELEM_RESTORED_CSI: UInt = 8192u

public val COMP_ELEM_SIZE_HEIGHT: UInt = 128u

public val COMP_ELEM_SIZE_WIDTH: UInt = 64u

public val COMP_ELEM_SOURCE: UInt = 512u

public val COMP_ELEM_SUBSCRIBEDURL: UInt = 2048u

public val COMP_ELEM_TYPE: UInt = 1u

public val COMP_TYPE_CFHTML: UInt = 4u

public val COMP_TYPE_CONTROL: UInt = 3u

public val COMP_TYPE_HTMLDOC: UInt = 0u

public val COMP_TYPE_MAX: UInt = 4u

public val COMP_TYPE_PICTURE: UInt = 1u

public val COMP_TYPE_WEBSITE: UInt = 2u

public val CONFLICT_RESOLUTION_CLSID_KEY: Pcwstr = w("ConflictResolutionCLSID")

public val COPYENGINE_E_ACCESSDENIED_READONLY: Hresult = 0x8027003Fu.toInt()

public val COPYENGINE_E_ACCESS_DENIED_DEST: Hresult = 0x80270022u.toInt()

public val COPYENGINE_E_ACCESS_DENIED_SRC: Hresult = 0x80270021u.toInt()

public val COPYENGINE_E_ALREADY_EXISTS_FOLDER: Hresult = 0x8027002Cu.toInt()

public val COPYENGINE_E_ALREADY_EXISTS_NORMAL: Hresult = 0x80270029u.toInt()

public val COPYENGINE_E_ALREADY_EXISTS_READONLY: Hresult = 0x8027002Au.toInt()

public val COPYENGINE_E_ALREADY_EXISTS_SYSTEM: Hresult = 0x8027002Bu.toInt()

public val COPYENGINE_E_BLOCKED_BY_DLP_POLICY: Hresult = 0x8027004Eu.toInt()

public val COPYENGINE_E_BLOCKED_BY_EDP_FOR_REMOVABLE_DRIVE: Hresult = 0x8027004Au.toInt()

public val COPYENGINE_E_BLOCKED_BY_EDP_POLICY: Hresult = 0x80270048u.toInt()

public val COPYENGINE_E_CANCELLED: Hresult = 0x80270001u.toInt()

public val COPYENGINE_E_CANNOT_MOVE_FROM_RECYCLE_BIN: Hresult = 0x80270043u.toInt()

public val COPYENGINE_E_CANNOT_MOVE_SHARED_FOLDER: Hresult = 0x80270044u.toInt()

public val COPYENGINE_E_CANT_REACH_SOURCE: Hresult = 0x80270035u.toInt()

public val COPYENGINE_E_DEST_IS_RO_CD: Hresult = 0x8027000Fu.toInt()

public val COPYENGINE_E_DEST_IS_RO_DVD: Hresult = 0x80270012u.toInt()

public val COPYENGINE_E_DEST_IS_RW_CD: Hresult = 0x80270010u.toInt()

public val COPYENGINE_E_DEST_IS_RW_DVD: Hresult = 0x80270013u.toInt()

public val COPYENGINE_E_DEST_IS_R_CD: Hresult = 0x80270011u.toInt()

public val COPYENGINE_E_DEST_IS_R_DVD: Hresult = 0x80270014u.toInt()

public val COPYENGINE_E_DEST_SAME_TREE: Hresult = 0x8027000Au.toInt()

public val COPYENGINE_E_DEST_SUBTREE: Hresult = 0x80270009u.toInt()

public val COPYENGINE_E_DIFF_DIR: Hresult = 0x80270004u.toInt()

public val COPYENGINE_E_DIR_NOT_EMPTY: Hresult = 0x8027003Du.toInt()

public val COPYENGINE_E_DISK_FULL: Hresult = 0x80270032u.toInt()

public val COPYENGINE_E_DISK_FULL_CLEAN: Hresult = 0x80270033u.toInt()

public val COPYENGINE_E_EA_LOSS: Hresult = 0x8027002Eu.toInt()

public val COPYENGINE_E_EA_NOT_SUPPORTED: Hresult = 0x80270034u.toInt()

public val COPYENGINE_E_ENCRYPTION_LOSS: Hresult = 0x80270031u.toInt()

public val COPYENGINE_E_FAT_MAX_IN_ROOT: Hresult = 0x8027003Eu.toInt()

public val COPYENGINE_E_FILE_IS_FLD_DEST: Hresult = 0x8027000Cu.toInt()

public val COPYENGINE_E_FILE_TOO_LARGE: Hresult = 0x8027000Du.toInt()

public val COPYENGINE_E_FLD_IS_FILE_DEST: Hresult = 0x8027000Bu.toInt()

public val COPYENGINE_E_INTERNET_ITEM_STORAGE_PROVIDER_ERROR: Hresult = 0x80270045u.toInt()

public val COPYENGINE_E_INTERNET_ITEM_STORAGE_PROVIDER_PAUSED: Hresult = 0x80270046u.toInt()

public val COPYENGINE_E_INTERNET_ITEM_UNAVAILABLE: Hresult = 0x80270042u.toInt()

public val COPYENGINE_E_INVALID_FILES_DEST: Hresult = 0x8027001Cu.toInt()

public val COPYENGINE_E_INVALID_FILES_SRC: Hresult = 0x8027001Bu.toInt()

public val COPYENGINE_E_MANY_SRC_1_DEST: Hresult = 0x80270005u.toInt()

public val COPYENGINE_E_NET_DISCONNECT_DEST: Hresult = 0x80270026u.toInt()

public val COPYENGINE_E_NET_DISCONNECT_SRC: Hresult = 0x80270025u.toInt()

public val COPYENGINE_E_NEWFILE_NAME_TOO_LONG: Hresult = 0x8027003Bu.toInt()

public val COPYENGINE_E_NEWFOLDER_NAME_TOO_LONG: Hresult = 0x8027003Cu.toInt()

public val COPYENGINE_E_PATH_NOT_FOUND_DEST: Hresult = 0x80270024u.toInt()

public val COPYENGINE_E_PATH_NOT_FOUND_SRC: Hresult = 0x80270023u.toInt()

public val COPYENGINE_E_PATH_TOO_DEEP_DEST: Hresult = 0x8027001Eu.toInt()

public val COPYENGINE_E_PATH_TOO_DEEP_SRC: Hresult = 0x8027001Du.toInt()

public val COPYENGINE_E_PROPERTIES_LOSS: Hresult = 0x80270030u.toInt()

public val COPYENGINE_E_PROPERTY_LOSS: Hresult = 0x8027002Fu.toInt()

public val COPYENGINE_E_RECYCLE_BIN_NOT_FOUND: Hresult = 0x8027003Au.toInt()

public val COPYENGINE_E_RECYCLE_FORCE_NUKE: Hresult = 0x80270036u.toInt()

public val COPYENGINE_E_RECYCLE_PATH_TOO_LONG: Hresult = 0x80270038u.toInt()

public val COPYENGINE_E_RECYCLE_SIZE_TOO_BIG: Hresult = 0x80270037u.toInt()

public val COPYENGINE_E_RECYCLE_UNKNOWN_ERROR: Hresult = 0x80270035u.toInt()

public val COPYENGINE_E_REDIRECTED_TO_WEBPAGE: Hresult = 0x80270040u.toInt()

public val COPYENGINE_E_REMOVABLE_FULL: Hresult = 0x8027000Eu.toInt()

public val COPYENGINE_E_REQUIRES_EDP_CONSENT: Hresult = 0x80270047u.toInt()

public val COPYENGINE_E_REQUIRES_EDP_CONSENT_FOR_REMOVABLE_DRIVE: Hresult = 0x80270049u.toInt()

public val COPYENGINE_E_REQUIRES_ELEVATION: Hresult = 0x80270002u.toInt()

public val COPYENGINE_E_RMS_BLOCKED_BY_EDP_FOR_REMOVABLE_DRIVE: Hresult = 0x8027004Cu.toInt()

public val COPYENGINE_E_RMS_REQUIRES_EDP_CONSENT_FOR_REMOVABLE_DRIVE: Hresult = 0x8027004Bu.toInt()

public val COPYENGINE_E_ROOT_DIR_DEST: Hresult = 0x80270020u.toInt()

public val COPYENGINE_E_ROOT_DIR_SRC: Hresult = 0x8027001Fu.toInt()

public val COPYENGINE_E_SAME_FILE: Hresult = 0x80270003u.toInt()

public val COPYENGINE_E_SERVER_BAD_FILE_TYPE: Hresult = 0x80270041u.toInt()

public val COPYENGINE_E_SHARING_VIOLATION_DEST: Hresult = 0x80270028u.toInt()

public val COPYENGINE_E_SHARING_VIOLATION_SRC: Hresult = 0x80270027u.toInt()

public val COPYENGINE_E_SILENT_FAIL_BY_DLP_POLICY: Hresult = 0x8027004Fu.toInt()

public val COPYENGINE_E_SRC_IS_RO_CD: Hresult = 0x80270015u.toInt()

public val COPYENGINE_E_SRC_IS_RO_DVD: Hresult = 0x80270018u.toInt()

public val COPYENGINE_E_SRC_IS_RW_CD: Hresult = 0x80270016u.toInt()

public val COPYENGINE_E_SRC_IS_RW_DVD: Hresult = 0x80270019u.toInt()

public val COPYENGINE_E_SRC_IS_R_CD: Hresult = 0x80270017u.toInt()

public val COPYENGINE_E_SRC_IS_R_DVD: Hresult = 0x8027001Au.toInt()

public val COPYENGINE_E_STREAM_LOSS: Hresult = 0x8027002Du.toInt()

public val COPYENGINE_E_USER_CANCELLED: Hresult = 0x80270000u.toInt()

public val COPYENGINE_E_WARNED_BY_DLP_POLICY: Hresult = 0x8027004Du.toInt()

public val COPYENGINE_S_ALREADY_DONE: Hresult = 0x27000Au.toInt()

public val COPYENGINE_S_CLOSE_PROGRAM: Hresult = 0x27000Du.toInt()

public val COPYENGINE_S_COLLISIONRESOLVED: Hresult = 0x27000Eu.toInt()

public val COPYENGINE_S_DONT_PROCESS_CHILDREN: Hresult = 0x270008u.toInt()

public val COPYENGINE_S_KEEP_BOTH: Hresult = 0x27000Cu.toInt()

public val COPYENGINE_S_MERGE: Hresult = 0x270006u.toInt()

public val COPYENGINE_S_NOT_HANDLED: Hresult = 0x270003u.toInt()

public val COPYENGINE_S_PENDING: Hresult = 0x27000Bu.toInt()

public val COPYENGINE_S_PENDING_DELETE: Hresult = 0x270010u.toInt()

public val COPYENGINE_S_PROGRESS_PAUSE: Hresult = 0x27000Fu.toInt()

public val COPYENGINE_S_USER_IGNORED: Hresult = 0x270005u.toInt()

public val COPYENGINE_S_USER_RETRY: Hresult = 0x270004u.toInt()

public val COPYENGINE_S_YES: Hresult = 0x270001u.toInt()

public val CPAO_EMPTY_CONNECTED: CredentialProviderAccountOptions = 2

public val CPAO_EMPTY_LOCAL: CredentialProviderAccountOptions = 1

public val CPAO_NONE: CredentialProviderAccountOptions = 0

public val CPCFO_ENABLE_PASSWORD_REVEAL: CredentialProviderCredentialFieldOptions = 1

public val CPCFO_ENABLE_TOUCH_KEYBOARD_AUTO_INVOKE: CredentialProviderCredentialFieldOptions = 4

public val CPCFO_IS_EMAIL_ADDRESS: CredentialProviderCredentialFieldOptions = 2

public val CPCFO_NONE: CredentialProviderCredentialFieldOptions = 0

public val CPCFO_NUMBERS_ONLY: CredentialProviderCredentialFieldOptions = 8

public val CPCFO_SHOW_ENGLISH_KEYBOARD: CredentialProviderCredentialFieldOptions = 16

public val CPFG_CREDENTIAL_PROVIDER_LABEL: Guid = Guid.fromU128(U128(0x286bbff3bad4438fuL, 0xb00779b7267c3d48uL))

public val CPFG_CREDENTIAL_PROVIDER_LOGO: Guid = Guid.fromU128(U128(0x2d837775f6cd464euL, 0xa745482fd0b47493uL))

public val CPFG_LOGON_PASSWORD: Guid = Guid.fromU128(U128(0x60624cfaa47747b1uL, 0x8a8e3a4a19981827uL))

public val CPFG_LOGON_USERNAME: Guid = Guid.fromU128(U128(0xda15bbe8954d4fd3uL, 0xb0f41fb5b90b174buL))

public val CPFG_SMARTCARD_PIN: Guid = Guid.fromU128(U128(0x4fe5263b918146c1uL, 0xb0a49dedd4db7deauL))

public val CPFG_SMARTCARD_USERNAME: Guid = Guid.fromU128(U128(0x3e1ecf69568c4d96uL, 0x9d5946444174e2d6uL))

public val CPFG_STANDALONE_SUBMIT_BUTTON: Guid = Guid.fromU128(U128(0xb7b0ad8cc364d59uL, 0x802b82f714fa7022uL))

public val CPFG_STYLE_LINK_AS_BUTTON: Guid = Guid.fromU128(U128(0x88fa50894a64430uL, 0xa4cb6fc6e3c0b9e2uL))

public val CPFIS_DISABLED: CredentialProviderFieldInteractiveState = 2

public val CPFIS_FOCUSED: CredentialProviderFieldInteractiveState = 3

public val CPFIS_NONE: CredentialProviderFieldInteractiveState = 0

public val CPFIS_READONLY: CredentialProviderFieldInteractiveState = 1

public val CPFS_DISPLAY_IN_BOTH: CredentialProviderFieldState = 3

public val CPFS_DISPLAY_IN_DESELECTED_TILE: CredentialProviderFieldState = 2

public val CPFS_DISPLAY_IN_SELECTED_TILE: CredentialProviderFieldState = 1

public val CPFS_HIDDEN: CredentialProviderFieldState = 0

public val CPFT_CHECKBOX: CredentialProviderFieldType = 7

public val CPFT_COMBOBOX: CredentialProviderFieldType = 8

public val CPFT_COMMAND_LINK: CredentialProviderFieldType = 3

public val CPFT_EDIT_TEXT: CredentialProviderFieldType = 4

public val CPFT_INVALID: CredentialProviderFieldType = 0

public val CPFT_LARGE_TEXT: CredentialProviderFieldType = 1

public val CPFT_PASSWORD_TEXT: CredentialProviderFieldType = 5

public val CPFT_SMALL_TEXT: CredentialProviderFieldType = 2

public val CPFT_SUBMIT_BUTTON: CredentialProviderFieldType = 9

public val CPFT_TILE_IMAGE: CredentialProviderFieldType = 6

public val CPGSR_NO_CREDENTIAL_FINISHED: CredentialProviderGetSerializationResponse = 1

public val CPGSR_NO_CREDENTIAL_NOT_FINISHED: CredentialProviderGetSerializationResponse = 0

public val CPGSR_RETURN_CREDENTIAL_FINISHED: CredentialProviderGetSerializationResponse = 2

public val CPGSR_RETURN_NO_CREDENTIAL_FINISHED: CredentialProviderGetSerializationResponse = 3

public val CPLPAGE_DISPLAY_BACKGROUND: UInt = 1u

public val CPLPAGE_KEYBOARD_SPEED: UInt = 1u

public val CPLPAGE_MOUSE_BUTTONS: UInt = 1u

public val CPLPAGE_MOUSE_PTRMOTION: UInt = 2u

public val CPLPAGE_MOUSE_WHEEL: UInt = 3u

public val CPL_DBLCLK: UInt = 5u

public val CPL_DYNAMIC_RES: UInt = 0u

public val CPL_EXIT: UInt = 7u

public val CPL_GETCOUNT: UInt = 2u

public val CPL_INIT: UInt = 1u

public val CPL_INQUIRE: UInt = 3u

public val CPL_NEWINQUIRE: UInt = 8u

public val CPL_SELECT: UInt = 4u

public val CPL_SETUP: UInt = 200u

public val CPL_STARTWPARMS: UInt = 10u

public val CPL_STARTWPARMSA: UInt = 9u

public val CPL_STARTWPARMSW: UInt = 10u

public val CPL_STOP: UInt = 6u

public val CPSI_ERROR: CredentialProviderStatusIcon = 1

public val CPSI_NONE: CredentialProviderStatusIcon = 0

public val CPSI_SUCCESS: CredentialProviderStatusIcon = 3

public val CPSI_WARNING: CredentialProviderStatusIcon = 2

public val CPUS_CHANGE_PASSWORD: CredentialProviderUsageScenario = 3

public val CPUS_CREDUI: CredentialProviderUsageScenario = 4

public val CPUS_INVALID: CredentialProviderUsageScenario = 0

public val CPUS_LOGON: CredentialProviderUsageScenario = 1

public val CPUS_PLAP: CredentialProviderUsageScenario = 5

public val CPUS_UNLOCK_WORKSTATION: CredentialProviderUsageScenario = 2

public val CPVIEW_ALLITEMS: Cpview = 0

public val CPVIEW_CATEGORY: Cpview = 1

public val CPVIEW_CLASSIC: Cpview = 0

public val CPVIEW_HOME: Cpview = 1

public val CREDENTIAL_PROVIDER_NO_DEFAULT: UInt = 4294967295u

public val CSC_NAVIGATEBACK: CommandStateChangeConstants = 2

public val CSC_NAVIGATEFORWARD: CommandStateChangeConstants = 1

public val CSC_UPDATECOMMANDS: CommandStateChangeConstants = -1

public val CSIDL_ADMINTOOLS: UInt = 48u

public val CSIDL_ALTSTARTUP: UInt = 29u

public val CSIDL_APPDATA: UInt = 26u

public val CSIDL_BITBUCKET: UInt = 10u

public val CSIDL_CDBURN_AREA: UInt = 59u

public val CSIDL_COMMON_ADMINTOOLS: UInt = 47u

public val CSIDL_COMMON_ALTSTARTUP: UInt = 30u

public val CSIDL_COMMON_APPDATA: UInt = 35u

public val CSIDL_COMMON_DESKTOPDIRECTORY: UInt = 25u

public val CSIDL_COMMON_DOCUMENTS: UInt = 46u

public val CSIDL_COMMON_FAVORITES: UInt = 31u

public val CSIDL_COMMON_MUSIC: UInt = 53u

public val CSIDL_COMMON_OEM_LINKS: UInt = 58u

public val CSIDL_COMMON_PICTURES: UInt = 54u

public val CSIDL_COMMON_PROGRAMS: UInt = 23u

public val CSIDL_COMMON_STARTMENU: UInt = 22u

public val CSIDL_COMMON_STARTUP: UInt = 24u

public val CSIDL_COMMON_TEMPLATES: UInt = 45u

public val CSIDL_COMMON_VIDEO: UInt = 55u

public val CSIDL_COMPUTERSNEARME: UInt = 61u

public val CSIDL_CONNECTIONS: UInt = 49u

public val CSIDL_CONTROLS: UInt = 3u

public val CSIDL_COOKIES: UInt = 33u

public val CSIDL_DESKTOP: UInt = 0u

public val CSIDL_DESKTOPDIRECTORY: UInt = 16u

public val CSIDL_DRIVES: UInt = 17u

public val CSIDL_FAVORITES: UInt = 6u

public val CSIDL_FLAG_CREATE: UInt = 32768u

public val CSIDL_FLAG_DONT_UNEXPAND: UInt = 8192u

public val CSIDL_FLAG_DONT_VERIFY: UInt = 16384u

public val CSIDL_FLAG_MASK: UInt = 65280u

public val CSIDL_FLAG_NO_ALIAS: UInt = 4096u

public val CSIDL_FLAG_PER_USER_INIT: UInt = 2048u

public val CSIDL_FLAG_PFTI_TRACKTARGET: UInt = 16384u

public val CSIDL_FONTS: UInt = 20u

public val CSIDL_HISTORY: UInt = 34u

public val CSIDL_INTERNET: UInt = 1u

public val CSIDL_INTERNET_CACHE: UInt = 32u

public val CSIDL_LOCAL_APPDATA: UInt = 28u

public val CSIDL_MYDOCUMENTS: UInt = 5u

public val CSIDL_MYMUSIC: UInt = 13u

public val CSIDL_MYPICTURES: UInt = 39u

public val CSIDL_MYVIDEO: UInt = 14u

public val CSIDL_NETHOOD: UInt = 19u

public val CSIDL_NETWORK: UInt = 18u

public val CSIDL_PERSONAL: UInt = 5u

public val CSIDL_PRINTERS: UInt = 4u

public val CSIDL_PRINTHOOD: UInt = 27u

public val CSIDL_PROFILE: UInt = 40u

public val CSIDL_PROGRAMS: UInt = 2u

public val CSIDL_PROGRAM_FILES: UInt = 38u

public val CSIDL_PROGRAM_FILESX86: UInt = 42u

public val CSIDL_PROGRAM_FILES_COMMON: UInt = 43u

public val CSIDL_PROGRAM_FILES_COMMONX86: UInt = 44u

public val CSIDL_RECENT: UInt = 8u

public val CSIDL_RESOURCES: UInt = 56u

public val CSIDL_RESOURCES_LOCALIZED: UInt = 57u

public val CSIDL_SENDTO: UInt = 9u

public val CSIDL_STARTMENU: UInt = 11u

public val CSIDL_STARTUP: UInt = 7u

public val CSIDL_SYSTEM: UInt = 37u

public val CSIDL_SYSTEMX86: UInt = 41u

public val CSIDL_TEMPLATES: UInt = 21u

public val CSIDL_WINDOWS: UInt = 36u

public val C_SCRIPT_ERROR_LIST: Guid = Guid.fromU128(U128(0xefd01300160f11d2uL, 0xbb2e00805ff7efcauL))

public val CTF_COINIT: Int = 8

public val CTF_COINIT_MTA: Int = 4096

public val CTF_COINIT_STA: Int = 8

public val CTF_FREELIBANDEXIT: Int = 16

public val CTF_INHERITWOW64: Int = 256

public val CTF_INSIST: Int = 1

public val CTF_KEYBOARD_LOCALE: Int = 1024

public val CTF_NOADDREFLIB: Int = 8192

public val CTF_OLEINITIALIZE: Int = 2048

public val CTF_PROCESS_REF: Int = 4

public val CTF_REF_COUNTED: Int = 32

public val CTF_THREAD_REF: Int = 2

public val CTF_UNUSED: Int = 128

public val CTF_WAIT_ALLOWCOM: Int = 64

public val CTF_WAIT_NO_REENTRANCY: Int = 512

public val CONFLICT_FOLDER: Guid = Guid.fromU128(U128(0x289978aca1014341uL, 0xa81721eba7fd046duL))

public val DBCID_CLSIDOFBAR: Int = 2

public val DBCID_EMPTY: Int = 0

public val DBCID_GETBAR: Int = 4

public val DBCID_ONDRAG: Int = 1

public val DBCID_RESIZE: Int = 3

public val DBCID_UPDATESIZE: Int = 5

public val DBC_GS_IDEAL: UInt = 0u

public val DBC_GS_SIZEDOWN: UInt = 1u

public val DBC_HIDE: UInt = 0u

public val DBC_SHOW: UInt = 1u

public val DBC_SHOWOBSCURE: UInt = 2u

public val DBID_BANDINFOCHANGED: Deskbandcid = 0

public val DBID_DELAYINIT: Deskbandcid = 4

public val DBID_FINISHINIT: Deskbandcid = 5

public val DBID_MAXIMIZEBAND: Deskbandcid = 2

public val DBID_PERMITAUTOHIDE: Deskbandcid = 7

public val DBID_PUSHCHEVRON: Deskbandcid = 3

public val DBID_SETWINDOWTHEME: Deskbandcid = 6

public val DBID_SHOWONLY: Deskbandcid = 1

public val DBIF_VIEWMODE_FLOATING: UInt = 2u

public val DBIF_VIEWMODE_NORMAL: UInt = 0u

public val DBIF_VIEWMODE_TRANSPARENT: UInt = 4u

public val DBIF_VIEWMODE_VERTICAL: UInt = 1u

public val DBIMF_ADDTOFRONT: UInt = 512u

public val DBIMF_ALWAYSGRIPPER: UInt = 4096u

public val DBIMF_BKCOLOR: UInt = 64u

public val DBIMF_BREAK: UInt = 256u

public val DBIMF_DEBOSSED: UInt = 32u

public val DBIMF_FIXED: UInt = 1u

public val DBIMF_FIXEDBMP: UInt = 4u

public val DBIMF_NOGRIPPER: UInt = 2048u

public val DBIMF_NOMARGINS: UInt = 8192u

public val DBIMF_NORMAL: UInt = 0u

public val DBIMF_TOPALIGN: UInt = 1024u

public val DBIMF_UNDELETEABLE: UInt = 16u

public val DBIMF_USECHEVRON: UInt = 128u

public val DBIMF_VARIABLEHEIGHT: UInt = 8u

public val DBIM_ACTUAL: UInt = 8u

public val DBIM_BKCOLOR: UInt = 64u

public val DBIM_INTEGRAL: UInt = 4u

public val DBIM_MAXSIZE: UInt = 2u

public val DBIM_MINSIZE: UInt = 1u

public val DBIM_MODEFLAGS: UInt = 32u

public val DBIM_TITLE: UInt = 16u

public val DBPC_SELECTFIRST: UInt = 4294967295u

public val DEFSHAREID_PUBLIC: DefShareId = 2

public val DEFSHAREID_USERS: DefShareId = 1

public val DEVICE_IMMERSIVE: DisplayDeviceType = 1

public val DEVICE_PRIMARY: DisplayDeviceType = 0

public val DFMR_DEFAULT: DefaultFolderMenuRestrictions = 0

public val DFMR_NO_ASYNC_VERBS: DefaultFolderMenuRestrictions = 1024

public val DFMR_NO_NATIVECPU_VERBS: DefaultFolderMenuRestrictions = 2048

public val DFMR_NO_NONWOW_VERBS: DefaultFolderMenuRestrictions = 4096

public val DFMR_NO_RESOURCE_VERBS: DefaultFolderMenuRestrictions = 32

public val DFMR_NO_STATIC_VERBS: DefaultFolderMenuRestrictions = 8

public val DFMR_OPTIN_HANDLERS_ONLY: DefaultFolderMenuRestrictions = 64

public val DFMR_RESOURCE_AND_FOLDER_VERBS_ONLY: DefaultFolderMenuRestrictions = 128

public val DFMR_STATIC_VERBS_ONLY: DefaultFolderMenuRestrictions = 16

public val DFMR_USE_SPECIFIED_HANDLERS: DefaultFolderMenuRestrictions = 256

public val DFMR_USE_SPECIFIED_VERBS: DefaultFolderMenuRestrictions = 512

public val DFM_CMD_COPY: DfmCmd = -3

public val DFM_CMD_DELETE: DfmCmd = -1

public val DFM_CMD_LINK: DfmCmd = -4

public val DFM_CMD_MODALPROP: DfmCmd = -12

public val DFM_CMD_MOVE: DfmCmd = -2

public val DFM_CMD_NEWFOLDER: DfmCmd = -6

public val DFM_CMD_PASTE: DfmCmd = -7

public val DFM_CMD_PASTELINK: DfmCmd = -10

public val DFM_CMD_PASTESPECIAL: DfmCmd = -11

public val DFM_CMD_PROPERTIES: DfmCmd = -5

public val DFM_CMD_RENAME: DfmCmd = -13

public val DFM_CMD_VIEWDETAILS: DfmCmd = -9

public val DFM_CMD_VIEWLIST: DfmCmd = -8

public val DFM_GETDEFSTATICID: DfmMessageId = 14

public val DFM_GETHELPTEXT: DfmMessageId = 5

public val DFM_GETHELPTEXTW: DfmMessageId = 11

public val DFM_GETVERBA: DfmMessageId = 16

public val DFM_GETVERBW: DfmMessageId = 15

public val DFM_INVOKECOMMAND: DfmMessageId = 2

public val DFM_INVOKECOMMANDEX: DfmMessageId = 12

public val DFM_MAPCOMMANDNAME: DfmMessageId = 13

public val DFM_MERGECONTEXTMENU: DfmMessageId = 1

public val DFM_MERGECONTEXTMENU_BOTTOM: DfmMessageId = 17

public val DFM_MERGECONTEXTMENU_TOP: DfmMessageId = 10

public val DFM_MODIFYQCMFLAGS: DfmMessageId = 18

public val DFM_VALIDATECMD: DfmMessageId = 9

public val DFM_WM_DRAWITEM: DfmMessageId = 7

public val DFM_WM_INITMENUPOPUP: DfmMessageId = 8

public val DFM_WM_MEASUREITEM: DfmMessageId = 6

public val DISPID_BEGINDRAG: UInt = 204u

public val DISPID_CHECKSTATECHANGED: UInt = 209u

public val DISPID_COLUMNSCHANGED: UInt = 212u

public val DISPID_CONTENTSCHANGED: UInt = 207u

public val DISPID_CTRLMOUSEWHEEL: UInt = 213u

public val DISPID_DEFAULTVERBINVOKED: UInt = 203u

public val DISPID_ENTERPRESSED: UInt = 200u

public val DISPID_ENTERPRISEIDCHANGED: UInt = 224u

public val DISPID_EXPLORERWINDOWREADY: UInt = 221u

public val DISPID_FILELISTENUMDONE: UInt = 201u

public val DISPID_FILTERINVOKED: UInt = 218u

public val DISPID_FOCUSCHANGED: UInt = 208u

public val DISPID_FOLDERCHANGED: UInt = 217u

public val DISPID_IADCCTL_DEFAULTCAT: UInt = 262u

public val DISPID_IADCCTL_DIRTY: UInt = 256u

public val DISPID_IADCCTL_FORCEX86: UInt = 259u

public val DISPID_IADCCTL_ONDOMAIN: UInt = 261u

public val DISPID_IADCCTL_PUBCAT: UInt = 257u

public val DISPID_IADCCTL_SHOWPOSTSETUP: UInt = 260u

public val DISPID_IADCCTL_SORT: UInt = 258u

public val DISPID_ICONSIZECHANGED: UInt = 215u

public val DISPID_INITIALENUMERATIONDONE: UInt = 223u

public val DISPID_NOITEMSTATE_CHANGED: UInt = 206u

public val DISPID_ORDERCHANGED: UInt = 210u

public val DISPID_SEARCHCOMMAND_ABORT: UInt = 3u

public val DISPID_SEARCHCOMMAND_COMPLETE: UInt = 2u

public val DISPID_SEARCHCOMMAND_ERROR: UInt = 6u

public val DISPID_SEARCHCOMMAND_PROGRESSTEXT: UInt = 5u

public val DISPID_SEARCHCOMMAND_RESTORE: UInt = 7u

public val DISPID_SEARCHCOMMAND_START: UInt = 1u

public val DISPID_SEARCHCOMMAND_UPDATE: UInt = 4u

public val DISPID_SELECTEDITEMCHANGED: UInt = 220u

public val DISPID_SELECTIONCHANGED: UInt = 200u

public val DISPID_SORTDONE: UInt = 214u

public val DISPID_UPDATEIMAGE: UInt = 222u

public val DISPID_VERBINVOKED: UInt = 202u

public val DISPID_VIEWMODECHANGED: UInt = 205u

public val DISPID_VIEWPAINTDONE: UInt = 211u

public val DISPID_WORDWHEELEDITED: UInt = 219u

public val DI_GETDRAGIMAGE: Pcwstr = w("ShellGetDragImage")

public val DLG_SCRNSAVECONFIGURE: UInt = 2003u

public val DLLVER_BUILD_MASK: ULong = 4294901760uL

public val DLLVER_MAJOR_MASK: ULong = 18446462598732840960uL

public val DLLVER_MINOR_MASK: ULong = 281470681743360uL

public val DLLVER_PLATFORM_NT: UInt = 2u

public val DLLVER_PLATFORM_WINDOWS: UInt = 1u

public val DLLVER_QFE_MASK: ULong = 65535uL

public val DOGIF_DEFAULT: DataobjGetItemFlags = 0

public val DOGIF_NO_HDROP: DataobjGetItemFlags = 2

public val DOGIF_NO_URL: DataobjGetItemFlags = 4

public val DOGIF_ONLY_IF_ONE: DataobjGetItemFlags = 8

public val DOGIF_TRAVERSE_LINK: DataobjGetItemFlags = 1

public val DROPIMAGE_COPY: Dropimagetype = 1

public val DROPIMAGE_INVALID: Dropimagetype = -1

public val DROPIMAGE_LABEL: Dropimagetype = 6

public val DROPIMAGE_LINK: Dropimagetype = 4

public val DROPIMAGE_MOVE: Dropimagetype = 2

public val DROPIMAGE_NOIMAGE: Dropimagetype = 8

public val DROPIMAGE_NONE: Dropimagetype = 0

public val DROPIMAGE_WARNING: Dropimagetype = 7

public val DSD_BACKWARD: DesktopSlideshowDirection = 1

public val DSD_FORWARD: DesktopSlideshowDirection = 0

public val DSFT_DETECT: Defaultsavefoldertype = 1

public val DSFT_PRIVATE: Defaultsavefoldertype = 2

public val DSFT_PUBLIC: Defaultsavefoldertype = 3

public val DSH_ALLOWDROPDESCRIPTIONTEXT: DshFlags = 1

public val DSO_SHUFFLEIMAGES: DesktopSlideshowOptions = 1

public val DSS_DISABLED_BY_REMOTE_SESSION: DesktopSlideshowState = 4

public val DSS_ENABLED: DesktopSlideshowState = 1

public val DSS_SLIDESHOW: DesktopSlideshowState = 2

public val DVASPECT_COPY: UInt = 3u

public val DVASPECT_LINK: UInt = 4u

public val DVASPECT_SHORTNAME: UInt = 2u

public val DWFAF_AUTOHIDE: UInt = 16u

public val DWFAF_GROUP1: UInt = 2u

public val DWFAF_GROUP2: UInt = 4u

public val DWFAF_HIDDEN: UInt = 1u

public val DWFRF_DELETECONFIGDATA: UInt = 1u

public val DWFRF_NORMAL: UInt = 0u

public val DWPOS_CENTER: DesktopWallpaperPosition = 0

public val DWPOS_FILL: DesktopWallpaperPosition = 4

public val DWPOS_FIT: DesktopWallpaperPosition = 3

public val DWPOS_SPAN: DesktopWallpaperPosition = 5

public val DWPOS_STRETCH: DesktopWallpaperPosition = 2

public val DWPOS_TILE: DesktopWallpaperPosition = 1

public val DEF_FOLDER_MENU: Guid = Guid.fromU128(U128(0xc63382be793348d0uL, 0x9ac885fb46be2fdduL))

public val DESKTOP_GADGET: Guid = Guid.fromU128(U128(0x924ccc1b65624c85uL, 0x8657d177925222b6uL))

public val DESKTOP_WALLPAPER: Guid = Guid.fromU128(U128(0xc2cf3110460e4fc1uL, 0xb9d08a1c0c9cc4bduL))

public val DESTINATION_LIST: Guid = Guid.fromU128(U128(0x77f10cf03db54966uL, 0xb520b7c54fd35ed6uL))

public val DOC_PROP_SHELL_EXTENSION: Guid = Guid.fromU128(U128(0x883373c3bf8911d1uL, 0xbe35080036b11a03uL))

public val DRIVE_SIZE_CATEGORIZER: Guid = Guid.fromU128(U128(0x94357b53ca294b78uL, 0x83aee8fe7409134fuL))

public val DRIVE_TYPE_CATEGORIZER: Guid = Guid.fromU128(U128(0xb0a8f3cf43334babuL, 0x88731ccb1cada48buL))

public val EBF_NODROPTARGET: ExplorerBrowserFillFlags = 512

public val EBF_NONE: ExplorerBrowserFillFlags = 0

public val EBF_SELECTFROMDATAOBJECT: ExplorerBrowserFillFlags = 256

public val EBO_ALWAYSNAVIGATE: ExplorerBrowserOptions = 4

public val EBO_HTMLSHAREPOINTVIEW: ExplorerBrowserOptions = 32

public val EBO_NAVIGATEONCE: ExplorerBrowserOptions = 1

public val EBO_NOBORDER: ExplorerBrowserOptions = 64

public val EBO_NONE: ExplorerBrowserOptions = 0

public val EBO_NOPERSISTVIEWSTATE: ExplorerBrowserOptions = 128

public val EBO_NOTRAVELLOG: ExplorerBrowserOptions = 8

public val EBO_NOWRAPPERWINDOW: ExplorerBrowserOptions = 16

public val EBO_SHOWFRAMES: ExplorerBrowserOptions = 2

public val ECF_AUTOMENUICONS: Expcmdflags = 512

public val ECF_DEFAULT: Expcmdflags = 0

public val ECF_HASLUASHIELD: Expcmdflags = 16

public val ECF_HASSPLITBUTTON: Expcmdflags = 2

public val ECF_HASSUBCOMMANDS: Expcmdflags = 1

public val ECF_HIDELABEL: Expcmdflags = 4

public val ECF_ISDROPDOWN: Expcmdflags = 128

public val ECF_ISSEPARATOR: Expcmdflags = 8

public val ECF_SEPARATORAFTER: Expcmdflags = 64

public val ECF_SEPARATORBEFORE: Expcmdflags = 32

public val ECF_TOGGLEABLE: Expcmdflags = 256

public val ECHUIM_DESKTOP: EcHostUiMode = 0

public val ECHUIM_IMMERSIVE: EcHostUiMode = 1

public val ECHUIM_SYSTEM_LAUNCHER: EcHostUiMode = 2

public val ECS_CHECKBOX: Expcmdstate = 4

public val ECS_CHECKED: Expcmdstate = 8

public val ECS_DISABLED: Expcmdstate = 1

public val ECS_ENABLED: Expcmdstate = 0

public val ECS_HIDDEN: Expcmdstate = 2

public val ECS_RADIOCHECK: Expcmdstate = 16

public val EGK_KEYBOARD: EdgeGestureKind = 1

public val EGK_MOUSE: EdgeGestureKind = 2

public val EGK_TOUCH: EdgeGestureKind = 0

public val EPS_DEFAULT_OFF: Explorerpanestate = 2

public val EPS_DEFAULT_ON: Explorerpanestate = 1

public val EPS_DONTCARE: Explorerpanestate = 0

public val EPS_FORCE: Explorerpanestate = 131072

public val EPS_INITIALSTATE: Explorerpanestate = 65536

public val EPS_STATEMASK: Explorerpanestate = 65535

public val EP_ADV_QUERY_PANE: Guid = Guid.fromU128(U128(0xb4e9db8b34ba4c39uL, 0xb5cc16a1bd2c411cuL))

public val EP_COMMANDS: Guid = Guid.fromU128(U128(0xd9745868ca5f4a76uL, 0x91cdf5a129fbb076uL))

public val EP_COMMANDS_ORGANIZE: Guid = Guid.fromU128(U128(0x72e81700e3ec4660uL, 0xbf243c3b7b648806uL))

public val EP_COMMANDS_VIEW: Guid = Guid.fromU128(U128(0x21f7c32deeaa439buL, 0xbb5137b96fd6a943uL))

public val EP_DETAILS_PANE: Guid = Guid.fromU128(U128(0x43abf98b89b8472duL, 0xb9cee69b8229f019uL))

public val EP_NAV_PANE: Guid = Guid.fromU128(U128(0xcb316b2225f742b8uL, 0x8a09540d23a43c2fuL))

public val EP_PREVIEW_PANE: Guid = Guid.fromU128(U128(0x893c63d145c84d17uL, 0xbe19223be71be365uL))

public val EP_QUERY_PANE: Guid = Guid.fromU128(U128(0x65bcde4f4f074f27uL, 0x83a71afca4df7ddduL))

public val EP_RIBBON: Guid = Guid.fromU128(U128(0xd27524a8c9f24834uL, 0xa106df8889fd4f37uL))

public val EP_STATUS_BAR: Guid = Guid.fromU128(U128(0x65fe56ce5cfe4bc4uL, 0xad8a7ae3fe7e8f7cuL))

public val EXECUTE_E_LAUNCH_APPLICATION: Hresult = 0x80270101u.toInt()

public val EXPPS_FILETYPES: Expps = 1

public val EXP_DARWIN_ID_SIG: UInt = 2684354566u

public val EXP_PROPERTYSTORAGE_SIG: UInt = 2684354569u

public val EXP_SPECIAL_FOLDER_SIG: UInt = 2684354565u

public val EXP_SZ_ICON_SIG: UInt = 2684354567u

public val EXP_SZ_LINK_SIG: UInt = 2684354561u

public val E_ACTIVATIONDENIED_SHELLERROR: Hresult = 0x80270131u.toInt()

public val E_ACTIVATIONDENIED_SHELLNOTREADY: Hresult = 0x80270134u.toInt()

public val E_ACTIVATIONDENIED_SHELLRESTART: Hresult = 0x80270132u.toInt()

public val E_ACTIVATIONDENIED_UNEXPECTED: Hresult = 0x80270133u.toInt()

public val E_ACTIVATIONDENIED_USERCLOSE: Hresult = 0x80270130u.toInt()

public val E_FILE_PLACEHOLDER_NOT_INITIALIZED: Hresult = 0x80270110u.toInt()

public val E_FILE_PLACEHOLDER_SERVER_TIMED_OUT: Hresult = 0x80270112u.toInt()

public val E_FILE_PLACEHOLDER_STORAGEPROVIDER_NOT_FOUND: Hresult = 0x80270113u.toInt()

public val E_FILE_PLACEHOLDER_VERSION_MISMATCH: Hresult = 0x80270111u.toInt()

public val E_FLAGS: Hresult = 0x80041000u.toInt()

public val E_IMAGEFEED_CHANGEDISABLED: Hresult = 0x80270310u.toInt()

public val E_NOTVALIDFORANIMATEDIMAGE: Hresult = 0x80040001u.toInt()

public val E_PREVIEWHANDLER_CORRUPT: Hresult = 0x86420004u.toInt()

public val E_PREVIEWHANDLER_DRM_FAIL: Hresult = 0x86420001u.toInt()

public val E_PREVIEWHANDLER_NOAUTH: Hresult = 0x86420002u.toInt()

public val E_PREVIEWHANDLER_NOTFOUND: Hresult = 0x86420003u.toInt()

public val E_SHELL_EXTENSION_BLOCKED: Hresult = 0x80270301u.toInt()

public val E_TILE_NOTIFICATIONS_PLATFORM_FAILURE: Hresult = 0x80270249u.toInt()

public val E_USERTILE_CHANGEDISABLED: Hresult = 0x80270211u.toInt()

public val E_USERTILE_FILESIZE: Hresult = 0x80270214u.toInt()

public val E_USERTILE_LARGEORDYNAMIC: Hresult = 0x80270212u.toInt()

public val E_USERTILE_UNSUPPORTEDFILETYPE: Hresult = 0x80270210u.toInt()

public val E_USERTILE_VIDEOFRAMESIZE: Hresult = 0x80270213u.toInt()

public val ENUMERABLE_OBJECT_COLLECTION: Guid = Guid.fromU128(U128(0x2d3468c136a743b6uL, 0xac24d3f02fd9607auL))

public val EXECUTE_FOLDER: Guid = Guid.fromU128(U128(0x11dbb47ca525400buL, 0x9e80a54615a090c0uL))

public val EXECUTE_UNKNOWN: Guid = Guid.fromU128(U128(0xe44e9428bdbc4987uL, 0xa09940dc8fd255e7uL))

public val EXPLORER_BROWSER: Guid = Guid.fromU128(U128(0x71f96385ddd648d3uL, 0xa0c1ae06e8b055fbuL))

public val EXTRACT_IF_NOT_CACHED: ThumbnailStreamCacheOptions = 0

public val FCIDM_BROWSERFIRST: UInt = 40960u

public val FCIDM_BROWSERLAST: UInt = 48896u

public val FCIDM_GLOBALFIRST: UInt = 32768u

public val FCIDM_GLOBALLAST: UInt = 40959u

public val FCIDM_MENU_EDIT: UInt = 32832u

public val FCIDM_MENU_EXPLORE: UInt = 33104u

public val FCIDM_MENU_FAVORITES: UInt = 33136u

public val FCIDM_MENU_FILE: UInt = 32768u

public val FCIDM_MENU_FIND: UInt = 33088u

public val FCIDM_MENU_HELP: UInt = 33024u

public val FCIDM_MENU_TOOLS: UInt = 32960u

public val FCIDM_MENU_TOOLS_SEP_GOTO: UInt = 32961u

public val FCIDM_MENU_VIEW: UInt = 32896u

public val FCIDM_MENU_VIEW_SEP_OPTIONS: UInt = 32897u

public val FCIDM_SHVIEWFIRST: UInt = 0u

public val FCIDM_SHVIEWLAST: UInt = 32767u

public val FCIDM_STATUS: UInt = 40961u

public val FCIDM_TOOLBAR: UInt = 40960u

public val FCSM_CLSID: UInt = 8u

public val FCSM_FLAGS: UInt = 64u

public val FCSM_ICONFILE: UInt = 16u

public val FCSM_INFOTIP: UInt = 4u

public val FCSM_LOGO: UInt = 32u

public val FCSM_VIEWID: UInt = 1u

public val FCSM_WEBVIEWTEMPLATE: UInt = 2u

public val FCS_FLAG_DRAGDROP: UInt = 2u

public val FCS_FORCEWRITE: UInt = 2u

public val FCS_READ: UInt = 1u

public val FCT_ADDTOEND: UInt = 4u

public val FCT_CONFIGABLE: UInt = 2u

public val FCT_MERGE: UInt = 1u

public val FCW_INTERNETBAR: UInt = 6u

public val FCW_PROGRESS: UInt = 8u

public val FCW_STATUS: UInt = 1u

public val FCW_TOOLBAR: UInt = 2u

public val FCW_TREE: UInt = 3u

public val FDAP_BOTTOM: Fdap = 0

public val FDAP_TOP: Fdap = 1

public val FDEOR_ACCEPT: FdeOverwriteResponse = 1

public val FDEOR_DEFAULT: FdeOverwriteResponse = 0

public val FDEOR_REFUSE: FdeOverwriteResponse = 2

public val FDESVR_ACCEPT: FdeShareviolationResponse = 1

public val FDESVR_DEFAULT: FdeShareviolationResponse = 0

public val FDESVR_REFUSE: FdeShareviolationResponse = 2

public val FDTF_LONGDATE: UInt = 4u

public val FDTF_LONGTIME: UInt = 8u

public val FDTF_LTRDATE: UInt = 256u

public val FDTF_NOAUTOREADINGORDER: UInt = 1024u

public val FDTF_RELATIVE: UInt = 16u

public val FDTF_RTLDATE: UInt = 512u

public val FDTF_SHORTDATE: UInt = 2u

public val FDTF_SHORTTIME: UInt = 1u

public val FD_ACCESSTIME: FdFlags = 16

public val FD_ATTRIBUTES: FdFlags = 4

public val FD_CLSID: FdFlags = 1

public val FD_CREATETIME: FdFlags = 8

public val FD_FILESIZE: FdFlags = 64

public val FD_LINKUI: FdFlags = 32768

public val FD_PROGRESSUI: FdFlags = 16384

public val FD_SIZEPOINT: FdFlags = 2

public val FD_UNICODE: FdFlags = -2147483648.toInt()

public val FD_WRITESTIME: FdFlags = 32

public val FEM_NAVIGATION: FolderEnumMode = 1

public val FEM_VIEWRESULT: FolderEnumMode = 0

public val FFFP_EXACTMATCH: FffpMode = 0

public val FFFP_NEARESTPARENTMATCH: FffpMode = 1

public val FLVM_CONTENT: Folderlogicalviewmode = 5

public val FLVM_DETAILS: Folderlogicalviewmode = 1

public val FLVM_FIRST: Folderlogicalviewmode = 1

public val FLVM_ICONS: Folderlogicalviewmode = 3

public val FLVM_LAST: Folderlogicalviewmode = 5

public val FLVM_LIST: Folderlogicalviewmode = 4

public val FLVM_TILES: Folderlogicalviewmode = 2

public val FLVM_UNSPECIFIED: Folderlogicalviewmode = -1

public val FMTID_BRIEFCASE: Guid = Guid.fromU128(U128(0x328d8b2177294bfcuL, 0x954c902b329d56b0uL))

public val FMTID_CUSTOM_IMAGE_PROPERTIES: Guid = Guid.fromU128(U128(0x7ecd8b0ec1364a9buL, 0x94114ebd6673ccc3uL))

public val FMTID_DRM: Guid = Guid.fromU128(U128(0xaeac19e489ae4508uL, 0xb9b7bb867abee2eduL))

public val FMTID_DISPLACED: Guid = Guid.fromU128(U128(0x9b174b3340ff11d2uL, 0xa27e00c04fc30871uL))

public val FMTID_IMAGE_PROPERTIES: Guid = Guid.fromU128(U128(0x14b81da101354d31uL, 0x96d96cbfc9671a99uL))

public val FMTID_INTERNET_SITE: Guid = Guid.fromU128(U128(0x214a100000000uL, 0xc000000000000046uL))

public val FMTID_INTSHCUT: Guid = Guid.fromU128(U128(0x214a000000000uL, 0xc000000000000046uL))

public val FMTID_LIBRARY_PROPERTIES: Guid = Guid.fromU128(U128(0x5d76b67f9b3d44bbuL, 0xb6ae25da4f638a67uL))

public val FMTID_MUSIC: Guid = Guid.fromU128(U128(0x56a3372ece9c11d2uL, 0x9f0e006097c686f6uL))

public val FMTID_MISC: Guid = Guid.fromU128(U128(0x9b174b3440ff11d2uL, 0xa27e00c04fc30871uL))

public val FMTID_QUERY: Guid = Guid.fromU128(U128(0x49691c907e17101auL, 0xa91c08002b2ecda9uL))

public val FMTID_SHELL_DETAILS: Guid = Guid.fromU128(U128(0x28636aa6953d11d2uL, 0xb5d600c04fd918d0uL))

public val FMTID_STORAGE: Guid = Guid.fromU128(U128(0xb725f13047ef101auL, 0xa5f102608c9eebacuL))

public val FMTID_VOLUME: Guid = Guid.fromU128(U128(0x9b174b3540ff11d2uL, 0xa27e00c04fc30871uL))

public val FMTID_WEB_VIEW: Guid = Guid.fromU128(U128(0xf2275480f7824291uL, 0xbd94f13693513aecuL))

public val FOF2_MERGEFOLDERSONCOLLISION: FileOperationFlags2 = 1

public val FOF2_NONE: FileOperationFlags2 = 0

public val FOFX_ADDUNDORECORD: FileoperationFlags = 536870912u

public val FOFX_COPYASDOWNLOAD: FileoperationFlags = 1073741824u

public val FOFX_DONTDISPLAYDESTPATH: FileoperationFlags = 134217728u

public val FOFX_DONTDISPLAYLOCATIONS: FileoperationFlags = 2147483648u

public val FOFX_DONTDISPLAYSOURCEPATH: FileoperationFlags = 67108864u

public val FOFX_EARLYFAILURE: FileoperationFlags = 1048576u

public val FOFX_KEEPNEWERFILE: FileoperationFlags = 4194304u

public val FOFX_MOVEACLSACROSSVOLUMES: FileoperationFlags = 33554432u

public val FOFX_NOCOPYHOOKS: FileoperationFlags = 8388608u

public val FOFX_NOMINIMIZEBOX: FileoperationFlags = 16777216u

public val FOFX_NOSKIPJUNCTIONS: FileoperationFlags = 65536u

public val FOFX_PREFERHARDLINK: FileoperationFlags = 131072u

public val FOFX_PRESERVEFILEEXTENSIONS: FileoperationFlags = 2097152u

public val FOFX_RECYCLEONDELETE: FileoperationFlags = 524288u

public val FOFX_REQUIREELEVATION: FileoperationFlags = 268435456u

public val FOFX_SHOWELEVATIONPROMPT: FileoperationFlags = 262144u

public val FOF_ALLOWUNDO: FileoperationFlags = 64u

public val FOF_CONFIRMMOUSE: FileoperationFlags = 2u

public val FOF_FILESONLY: FileoperationFlags = 128u

public val FOF_MULTIDESTFILES: FileoperationFlags = 1u

public val FOF_NOCONFIRMATION: FileoperationFlags = 16u

public val FOF_NOCONFIRMMKDIR: FileoperationFlags = 512u

public val FOF_NOCOPYSECURITYATTRIBS: FileoperationFlags = 2048u

public val FOF_NOERRORUI: FileoperationFlags = 1024u

public val FOF_NORECURSEREPARSE: FileoperationFlags = 32768u

public val FOF_NORECURSION: FileoperationFlags = 4096u

public val FOF_NO_CONNECTED_ELEMENTS: FileoperationFlags = 8192u

public val FOF_NO_UI: FileoperationFlags = 1556u

public val FOF_RENAMEONCOLLISION: FileoperationFlags = 8u

public val FOF_SILENT: FileoperationFlags = 4u

public val FOF_SIMPLEPROGRESS: FileoperationFlags = 256u

public val FOF_WANTMAPPINGHANDLE: FileoperationFlags = 32u

public val FOF_WANTNUKEWARNING: FileoperationFlags = 16384u

public val FOLDERID_ACCOUNT_PICTURES: Guid = Guid.fromU128(U128(0x8ca0b155b44c56uL, 0xb8a84de4b299d3beuL))

public val FOLDERID_ADD_NEW_PROGRAMS: Guid = Guid.fromU128(U128(0xde61d9715ebc4f02uL, 0xa3a96c82895e5c04uL))

public val FOLDERID_ADMIN_TOOLS: Guid = Guid.fromU128(U128(0x724ef170a42d4fefuL, 0x9f26b60e846fba4fuL))

public val FOLDERID_ALL_APP_MODS: Guid = Guid.fromU128(U128(0x7ad6789966af43bauL, 0x91566aad42e6c596uL))

public val FOLDERID_APP_CAPTURES: Guid = Guid.fromU128(U128(0xedc0fe7198d84f4auL, 0xb920c8dc133cb165uL))

public val FOLDERID_APP_DATA_DESKTOP: Guid = Guid.fromU128(U128(0xb2c5e2797add439fuL, 0xb28cc41fe1bbf672uL))

public val FOLDERID_APP_DATA_DOCUMENTS: Guid = Guid.fromU128(U128(0x7be166101f7f44acuL, 0xbff083e15f2ffca1uL))

public val FOLDERID_APP_DATA_FAVORITES: Guid = Guid.fromU128(U128(0x7cfbefbcde1f45aauL, 0xb843a542ac536cc9uL))

public val FOLDERID_APP_DATA_PROGRAM_DATA: Guid = Guid.fromU128(U128(0x559d40a3a03640fauL, 0xaf6184cb430a4d34uL))

public val FOLDERID_APP_UPDATES: Guid = Guid.fromU128(U128(0xa305ce99f527492buL, 0x8b1a7e76fa98d6e4uL))

public val FOLDERID_APPLICATION_SHORTCUTS: Guid = Guid.fromU128(U128(0xa3918781e5f24890uL, 0xb3d9a7e54332328cuL))

public val FOLDERID_APPS_FOLDER: Guid = Guid.fromU128(U128(0x1e87508d89c242f0uL, 0x8a7e645a0f50ca58uL))

public val FOLDERID_CD_BURNING: Guid = Guid.fromU128(U128(0x9e52ab10f80d49dfuL, 0xacb84330f5687855uL))

public val FOLDERID_CAMERA_ROLL: Guid = Guid.fromU128(U128(0xab5fb87b7ce24f83uL, 0x915d550846c9537buL))

public val FOLDERID_CAMERA_ROLL_LIBRARY: Guid = Guid.fromU128(U128(0x2b20df751eda4039uL, 0x809738798227d5b7uL))

public val FOLDERID_CHANGE_REMOVE_PROGRAMS: Guid = Guid.fromU128(U128(0xdf7266ac92744867uL, 0x8d553bd661de872duL))

public val FOLDERID_COMMON_ADMIN_TOOLS: Guid = Guid.fromU128(U128(0xd0384e7dbac34797uL, 0x8f14cba229b392b5uL))

public val FOLDERID_COMMON_OEM_LINKS: Guid = Guid.fromU128(U128(0xc1bae2d010df4334uL, 0xbedd7aa20b227a9duL))

public val FOLDERID_COMMON_PROGRAMS: Guid = Guid.fromU128(U128(0x139d44e6afe49f2uL, 0x86903dafcae6ffb8uL))

public val FOLDERID_COMMON_START_MENU: Guid = Guid.fromU128(U128(0xa4115719d62e491duL, 0xaa7ce74b8be3b067uL))

public val FOLDERID_COMMON_START_MENU_PLACES: Guid = Guid.fromU128(U128(0xa440879f87a04f7duL, 0xb7000207b966194auL))

public val FOLDERID_COMMON_STARTUP: Guid = Guid.fromU128(U128(0x82a5ea35d9cd47c5uL, 0x9629e15d2f714e6euL))

public val FOLDERID_COMMON_TEMPLATES: Guid = Guid.fromU128(U128(0xb94237e757ac4347uL, 0x9151b08c6c32d1f7uL))

public val FOLDERID_COMPUTER_FOLDER: Guid = Guid.fromU128(U128(0xac0837cbbf8452auL, 0x850d79d08e667ca7uL))

public val FOLDERID_CONFLICT_FOLDER: Guid = Guid.fromU128(U128(0x4bfefb45347d4006uL, 0xa5beac0cb0567192uL))

public val FOLDERID_CONNECTIONS_FOLDER: Guid = Guid.fromU128(U128(0x6f0cd92b2e9745d1uL, 0x88ffb0d186b8dedduL))

public val FOLDERID_CONTACTS: Guid = Guid.fromU128(U128(0x56784854c6cb462buL, 0x816988e350acb882uL))

public val FOLDERID_CONTROL_PANEL_FOLDER: Guid = Guid.fromU128(U128(0x82a74aebaeb4465cuL, 0xa014d097ee346d63uL))

public val FOLDERID_COOKIES: Guid = Guid.fromU128(U128(0x2b0f765dc0e94171uL, 0x908e08a611b84ff6uL))

public val FOLDERID_CURRENT_APP_MODS: Guid = Guid.fromU128(U128(0x3db40b202a304dbeuL, 0x917e771dd21dd099uL))

public val FOLDERID_DESKTOP: Guid = Guid.fromU128(U128(0xb4bfcc3adb2c424cuL, 0xb0297fe99a87c641uL))

public val FOLDERID_DEVELOPMENT_FILES: Guid = Guid.fromU128(U128(0xdbe8e08e30534bbcuL, 0xb1832a7b2b191e59uL))

public val FOLDERID_DEVICE: Guid = Guid.fromU128(U128(0x1c2ac1dc43584b6cuL, 0x9733af21156576f0uL))

public val FOLDERID_DEVICE_METADATA_STORE: Guid = Guid.fromU128(U128(0x5ce4a5e9e4eb479duL, 0xb89f130c02886155uL))

public val FOLDERID_DOCUMENTS: Guid = Guid.fromU128(U128(0xfdd39ad0238f46afuL, 0xadb46c85480369c7uL))

public val FOLDERID_DOCUMENTS_LIBRARY: Guid = Guid.fromU128(U128(0x7b0db17d9cd24a93uL, 0x973346cc89022e7cuL))

public val FOLDERID_DOWNLOADS: Guid = Guid.fromU128(U128(0x374de290123f4565uL, 0x916439c4925e467buL))

public val FOLDERID_FAVORITES: Guid = Guid.fromU128(U128(0x1777f76168ad4d8auL, 0x87bd30b759fa33dduL))

public val FOLDERID_FONTS: Guid = Guid.fromU128(U128(0xfd228cb7ae114ae3uL, 0x864c16f3910ab8feuL))

public val FOLDERID_GAME_TASKS: Guid = Guid.fromU128(U128(0x54fae614dd84787uL, 0x80b6090220c4b700uL))

public val FOLDERID_GAMES: Guid = Guid.fromU128(U128(0xcac52c1ab53d4edcuL, 0x92d76b2e8ac19434uL))

public val FOLDERID_HISTORY: Guid = Guid.fromU128(U128(0xd9dc8a3bb784432euL, 0xa7815a1130a75963uL))

public val FOLDERID_HOME_GROUP: Guid = Guid.fromU128(U128(0x52528a6bb9e34adduL, 0xb60d588c2dba842duL))

public val FOLDERID_HOME_GROUP_CURRENT_USER: Guid = Guid.fromU128(U128(0x9b74b6a30dfd4f11uL, 0x9e785f7800f2e772uL))

public val FOLDERID_IMPLICIT_APP_SHORTCUTS: Guid = Guid.fromU128(U128(0xbcb5256f79f64ceeuL, 0xb725dc34e402fd46uL))

public val FOLDERID_INTERNET_CACHE: Guid = Guid.fromU128(U128(0x352481e833be4251uL, 0xba856007caedcf9duL))

public val FOLDERID_INTERNET_FOLDER: Guid = Guid.fromU128(U128(0x4d9f78744e0c4904uL, 0x967b40b0d20c3e4buL))

public val FOLDERID_LIBRARIES: Guid = Guid.fromU128(U128(0x1b3ea5dcb5874786uL, 0xb4efbd1dc332aeaeuL))

public val FOLDERID_LINKS: Guid = Guid.fromU128(U128(0xbfb9d5e0c6a9404cuL, 0xb2b2ae6db6af4968uL))

public val FOLDERID_LOCAL_APP_DATA: Guid = Guid.fromU128(U128(0xf1b327856fba4fcfuL, 0x9d557b8e7f157091uL))

public val FOLDERID_LOCAL_APP_DATA_LOW: Guid = Guid.fromU128(U128(0xa520a1a417804ff6uL, 0xbd18167343c5af16uL))

public val FOLDERID_LOCAL_DOCUMENTS: Guid = Guid.fromU128(U128(0xf42ee2d3909f4907uL, 0x88714c22fc0bf756uL))

public val FOLDERID_LOCAL_DOWNLOADS: Guid = Guid.fromU128(U128(0x7d83ee9b22444e70uL, 0xb1f55393042af1e4uL))

public val FOLDERID_LOCAL_MUSIC: Guid = Guid.fromU128(U128(0xa0c69a9921c84671uL, 0x87037934162fcf1duL))

public val FOLDERID_LOCAL_PICTURES: Guid = Guid.fromU128(U128(0xddd015db06c45d5uL, 0x8c4cf59713854639uL))

public val FOLDERID_LOCAL_STORAGE: Guid = Guid.fromU128(U128(0xb3eb08d3a1f3496buL, 0x865a42b536cda0ecuL))

public val FOLDERID_LOCAL_VIDEOS: Guid = Guid.fromU128(U128(0x35286a683c5741a1uL, 0xbbb10eae73d76c95uL))

public val FOLDERID_LOCALIZED_RESOURCES_DIR: Guid = Guid.fromU128(U128(0x2a00375e224c49deuL, 0xb8d1440df7ef3ddcuL))

public val FOLDERID_MUSIC: Guid = Guid.fromU128(U128(0x4bd8d5716d1948d3uL, 0xbe97422220080e43uL))

public val FOLDERID_MUSIC_LIBRARY: Guid = Guid.fromU128(U128(0x2112ab0ac86a4ffeuL, 0xa3680de96e47012euL))

public val FOLDERID_NET_HOOD: Guid = Guid.fromU128(U128(0xc5abbf53e17f4121uL, 0x890086626fc2c973uL))

public val FOLDERID_NETWORK_FOLDER: Guid = Guid.fromU128(U128(0xd20beec45ca84905uL, 0xae3bbf251ea09b53uL))

public val FOLDERID_OBJECTS3D: Guid = Guid.fromU128(U128(0x31c0dd2594394f12uL, 0xbf417ff4eda38722uL))

public val FOLDERID_ONE_DRIVE: Guid = Guid.fromU128(U128(0xa52bba46e9e1435fuL, 0xb3d928daa648c0f6uL))

public val FOLDERID_ORIGINAL_IMAGES: Guid = Guid.fromU128(U128(0x2c36c0aa58124b87uL, 0xbfd04cd0dfb19b39uL))

public val FOLDERID_PHOTO_ALBUMS: Guid = Guid.fromU128(U128(0x69d2cf90fc334fb7uL, 0x9a0cebb0f0fcb43cuL))

public val FOLDERID_PICTURES: Guid = Guid.fromU128(U128(0x33e281304e1e4676uL, 0x835a98395c3bc3bbuL))

public val FOLDERID_PICTURES_LIBRARY: Guid = Guid.fromU128(U128(0xa990ae9fa03b4e80uL, 0x94bc9912d7504104uL))

public val FOLDERID_PLAYLISTS: Guid = Guid.fromU128(U128(0xde92c1c7837f4f69uL, 0xa3bb86e631204a23uL))

public val FOLDERID_PRINT_HOOD: Guid = Guid.fromU128(U128(0x9274bd8dcfd141c3uL, 0xb35eb13f55a758f4uL))

public val FOLDERID_PRINTERS_FOLDER: Guid = Guid.fromU128(U128(0x76fc4e2dd6ad4519uL, 0xa66337bd56068185uL))

public val FOLDERID_PROFILE: Guid = Guid.fromU128(U128(0x5e6c858f0e224760uL, 0x9afeea3317b67173uL))

public val FOLDERID_PROGRAM_DATA: Guid = Guid.fromU128(U128(0x62ab5d82fdc14dc3uL, 0xa9dd070d1d495d97uL))

public val FOLDERID_PROGRAM_FILES: Guid = Guid.fromU128(U128(0x905e63b6c1bf494euL, 0xb29c65b732d3d21auL))

public val FOLDERID_PROGRAM_FILES_COMMON: Guid = Guid.fromU128(U128(0xf7f1ed059f6d47a2uL, 0xaaae29d317c6f066uL))

public val FOLDERID_PROGRAM_FILES_COMMON_X64: Guid = Guid.fromU128(U128(0x6365d5a70f0d45e5uL, 0x87f60da56b6a4f7duL))

public val FOLDERID_PROGRAM_FILES_COMMON_X86: Guid = Guid.fromU128(U128(0xde974d24d9c64d3euL, 0xbf91f4455120b917uL))

public val FOLDERID_PROGRAM_FILES_X64: Guid = Guid.fromU128(U128(0x6d8093776af0444buL, 0x8957a3773f02200euL))

public val FOLDERID_PROGRAM_FILES_X86: Guid = Guid.fromU128(U128(0x7c5a40efa0fb4bfcuL, 0x874ac0f2e0b9fa8euL))

public val FOLDERID_PROGRAMS: Guid = Guid.fromU128(U128(0xa77f5d772e2b44c3uL, 0xa6a2aba601054a51uL))

public val FOLDERID_PUBLIC: Guid = Guid.fromU128(U128(0xdfdf76a2c82a4d63uL, 0x906a5644ac457385uL))

public val FOLDERID_PUBLIC_DESKTOP: Guid = Guid.fromU128(U128(0xc4aa340df20f4863uL, 0xafeff87ef2e6ba25uL))

public val FOLDERID_PUBLIC_DOCUMENTS: Guid = Guid.fromU128(U128(0xed4824afdce445a8uL, 0x81e2fc7965083634uL))

public val FOLDERID_PUBLIC_DOWNLOADS: Guid = Guid.fromU128(U128(0x3d644c9b1fb84f30uL, 0x9b45f670235f79c0uL))

public val FOLDERID_PUBLIC_GAME_TASKS: Guid = Guid.fromU128(U128(0xdebf2536e1a84c59uL, 0xb6a2414586476aeauL))

public val FOLDERID_PUBLIC_LIBRARIES: Guid = Guid.fromU128(U128(0x48daf80be6cf4f4euL, 0xb8000e69d84ee384uL))

public val FOLDERID_PUBLIC_MUSIC: Guid = Guid.fromU128(U128(0x3214fab597574298uL, 0xbb6192a9deaa44ffuL))

public val FOLDERID_PUBLIC_PICTURES: Guid = Guid.fromU128(U128(0xb6ebfb866907413cuL, 0x9af74fc2abf07cc5uL))

public val FOLDERID_PUBLIC_RINGTONES: Guid = Guid.fromU128(U128(0xe555ab60153b4d17uL, 0x9f04a5fe99fc15ecuL))

public val FOLDERID_PUBLIC_USER_TILES: Guid = Guid.fromU128(U128(0x482af6c08f14c34uL, 0x8c90e17ec98b1e17uL))

public val FOLDERID_PUBLIC_VIDEOS: Guid = Guid.fromU128(U128(0x2400183a618549fbuL, 0xa2d84a392a602ba3uL))

public val FOLDERID_QUICK_LAUNCH: Guid = Guid.fromU128(U128(0x52a4f0217b7548a9uL, 0x9f6b4b87a210bc8fuL))

public val FOLDERID_RECENT: Guid = Guid.fromU128(U128(0xae50c081ebd2438auL, 0x86558a092e34987auL))

public val FOLDERID_RECORDED_CALLS: Guid = Guid.fromU128(U128(0x2f8b40c283ed48eeuL, 0xb383a1f157ec6f9auL))

public val FOLDERID_RECORDED_TV_LIBRARY: Guid = Guid.fromU128(U128(0x1a6fdba2f42d4358uL, 0xa798b74d745926c5uL))

public val FOLDERID_RECYCLE_BIN_FOLDER: Guid = Guid.fromU128(U128(0xb75340463ecb4c18uL, 0xbe4e64cd4cb7d6acuL))

public val FOLDERID_RESOURCE_DIR: Guid = Guid.fromU128(U128(0x8ad10c312adb4296uL, 0xa8f7e4701232c972uL))

public val FOLDERID_RETAIL_DEMO: Guid = Guid.fromU128(U128(0x12d4c69e24ad4923uL, 0xbe1931321c43a767uL))

public val FOLDERID_RINGTONES: Guid = Guid.fromU128(U128(0xc870044bf49e4126uL, 0xa9c3b52a1ff411e8uL))

public val FOLDERID_ROAMED_TILE_IMAGES: Guid = Guid.fromU128(U128(0xaaa8d5a5f1d64259uL, 0xbaa878e7ef60835euL))

public val FOLDERID_ROAMING_APP_DATA: Guid = Guid.fromU128(U128(0x3eb685db65f94cf6uL, 0xa03ae3ef65729f3duL))

public val FOLDERID_ROAMING_TILES: Guid = Guid.fromU128(U128(0xbcfc5aed944e48uL, 0x96a13f6217f21990uL))

public val FOLDERID_SEARCH_CSC: Guid = Guid.fromU128(U128(0xee32e44631ca4abauL, 0x814fa5ebd2fd6d5euL))

public val FOLDERID_SEARCH_MAPI: Guid = Guid.fromU128(U128(0x98ec0e1820984d44uL, 0x864466979315a281uL))

public val FOLDERID_SAMPLE_MUSIC: Guid = Guid.fromU128(U128(0xb250c668f57d4ee1uL, 0xa63c290ee7d1aa1fuL))

public val FOLDERID_SAMPLE_PICTURES: Guid = Guid.fromU128(U128(0xc490054023794c75uL, 0x844b64e6faf8716buL))

public val FOLDERID_SAMPLE_PLAYLISTS: Guid = Guid.fromU128(U128(0x15ca69b330ee49c1uL, 0xace16b5ec372afb5uL))

public val FOLDERID_SAMPLE_VIDEOS: Guid = Guid.fromU128(U128(0x859ead942e8548aduL, 0xa71a0969cb56a6cduL))

public val FOLDERID_SAVED_GAMES: Guid = Guid.fromU128(U128(0x4c5c32ffbb9d43b0uL, 0xb5b42d72e54eaaa4uL))

public val FOLDERID_SAVED_PICTURES: Guid = Guid.fromU128(U128(0x3b193882d3ad4eabuL, 0x965a69829d1fb59fuL))

public val FOLDERID_SAVED_PICTURES_LIBRARY: Guid = Guid.fromU128(U128(0xe25b5812be884bd9uL, 0x94b029233477b6c3uL))

public val FOLDERID_SAVED_SEARCHES: Guid = Guid.fromU128(U128(0x7d1d3a04debb4115uL, 0x95cf2f29da2920dauL))

public val FOLDERID_SCREENSHOTS: Guid = Guid.fromU128(U128(0xb7bede81df944682uL, 0xa7d857a52620b86fuL))

public val FOLDERID_SEARCH_HISTORY: Guid = Guid.fromU128(U128(0xd4c3db603a3462fuL, 0xa0e608924c41b5d4uL))

public val FOLDERID_SEARCH_HOME: Guid = Guid.fromU128(U128(0x190337d1b8ca4121uL, 0xa6396d472d16972auL))

public val FOLDERID_SEARCH_TEMPLATES: Guid = Guid.fromU128(U128(0x7e636bfedfa94d5euL, 0xb456d7b39851d8a9uL))

public val FOLDERID_SEND_TO: Guid = Guid.fromU128(U128(0x8983036c27c0404buL, 0x8f08102d10dcfd74uL))

public val FOLDERID_SIDEBAR_DEFAULT_PARTS: Guid = Guid.fromU128(U128(0x7b396e549ec54300uL, 0xbe0a2482ebae1a26uL))

public val FOLDERID_SIDEBAR_PARTS: Guid = Guid.fromU128(U128(0xa75d362e50fc4fb7uL, 0xac2ca8beaa314493uL))

public val FOLDERID_SKY_DRIVE: Guid = Guid.fromU128(U128(0xa52bba46e9e1435fuL, 0xb3d928daa648c0f6uL))

public val FOLDERID_SKY_DRIVE_CAMERA_ROLL: Guid = Guid.fromU128(U128(0x767e681149cb4273uL, 0x87c220f355e1085buL))

public val FOLDERID_SKY_DRIVE_DOCUMENTS: Guid = Guid.fromU128(U128(0x24d89e242f194534uL, 0x9dde6a6671fbb8feuL))

public val FOLDERID_SKY_DRIVE_MUSIC: Guid = Guid.fromU128(U128(0xc3f2459e80d645dcuL, 0xbfef1f769f2be730uL))

public val FOLDERID_SKY_DRIVE_PICTURES: Guid = Guid.fromU128(U128(0x339719b58c474894uL, 0x94c2d8f77add44a6uL))

public val FOLDERID_START_MENU: Guid = Guid.fromU128(U128(0x625b53c3ab484ec1uL, 0xba1fa1ef4146fc19uL))

public val FOLDERID_START_MENU_ALL_PROGRAMS: Guid = Guid.fromU128(U128(0xf26305ef694840b9uL, 0xb25581453d09c785uL))

public val FOLDERID_STARTUP: Guid = Guid.fromU128(U128(0xb97d20bbf46a4c97uL, 0xba105e3608430854uL))

public val FOLDERID_SYNC_MANAGER_FOLDER: Guid = Guid.fromU128(U128(0x43668bf8c14e49b2uL, 0x97c9747784d784b7uL))

public val FOLDERID_SYNC_RESULTS_FOLDER: Guid = Guid.fromU128(U128(0x289a9a43be444057uL, 0xa41b587a76d7e7f9uL))

public val FOLDERID_SYNC_SETUP_FOLDER: Guid = Guid.fromU128(U128(0xf214138b1d34a90uL, 0xbba927cbc0c5389auL))

public val FOLDERID_SYSTEM: Guid = Guid.fromU128(U128(0x1ac14e7702e74e5duL, 0xb7442eb1ae5198b7uL))

public val FOLDERID_SYSTEM_X86: Guid = Guid.fromU128(U128(0xd65231b0b2f14857uL, 0xa4cea8e7c6ea7d27uL))

public val FOLDERID_TEMPLATES: Guid = Guid.fromU128(U128(0xa63293e8664e48dbuL, 0xa079df759e0509f7uL))

public val FOLDERID_USER_PINNED: Guid = Guid.fromU128(U128(0x9e3995ab1f9c4f13uL, 0xb82748b24b6c7174uL))

public val FOLDERID_USER_PROFILES: Guid = Guid.fromU128(U128(0x762d272c50a4bb0uL, 0xa382697dcd729b80uL))

public val FOLDERID_USER_PROGRAM_FILES: Guid = Guid.fromU128(U128(0x5cd7aee222194a67uL, 0xb85d6c9ce15660cbuL))

public val FOLDERID_USER_PROGRAM_FILES_COMMON: Guid = Guid.fromU128(U128(0xbcbd3057ca5c4622uL, 0xb42dbc56db0ae516uL))

public val FOLDERID_USERS_FILES: Guid = Guid.fromU128(U128(0xf3ce0f7c49014accuL, 0x8648d5d44b04ef8fuL))

public val FOLDERID_USERS_LIBRARIES: Guid = Guid.fromU128(U128(0xa302545ddeff464buL, 0xabe861c8648d939buL))

public val FOLDERID_VIDEOS: Guid = Guid.fromU128(U128(0x18989b1d99b5455buL, 0x841cab7c74e4ddfcuL))

public val FOLDERID_VIDEOS_LIBRARY: Guid = Guid.fromU128(U128(0x491e922f56434af4uL, 0xa7eb4e7a138d8174uL))

public val FOLDERID_WINDOWS: Guid = Guid.fromU128(U128(0xf38bf4041d4342f2uL, 0x930567de0b28fc23uL))

public val FOLDERTYPEID_ACCOUNT_PICTURES: Guid = Guid.fromU128(U128(0xdb2a5d8f06e64007uL, 0xaba6af877d526ea6uL))

public val FOLDERTYPEID_COMMUNICATIONS: Guid = Guid.fromU128(U128(0x91475fe5586b4ebauL, 0x8d75d17434b8cdf6uL))

public val FOLDERTYPEID_COMPRESSED_FOLDER: Guid = Guid.fromU128(U128(0x80213e82bcfd4c4fuL, 0x8817bb27601267a9uL))

public val FOLDERTYPEID_CONTACTS: Guid = Guid.fromU128(U128(0xde2b70ec9bf74a93uL, 0xbd3d243f7881d492uL))

public val FOLDERTYPEID_CONTROL_PANEL_CATEGORY: Guid = Guid.fromU128(U128(0xde4f0660fa104b8fuL, 0xa494068b20b22307uL))

public val FOLDERTYPEID_CONTROL_PANEL_CLASSIC: Guid = Guid.fromU128(U128(0xc3794f3b54543aauL, 0xa329c37430c58d2auL))

public val FOLDERTYPEID_DOCUMENTS: Guid = Guid.fromU128(U128(0x7d49d7263c214f05uL, 0x99aafdc2c9474656uL))

public val FOLDERTYPEID_DOWNLOADS: Guid = Guid.fromU128(U128(0x885a186ea4404adauL, 0x812bdb871b942259uL))

public val FOLDERTYPEID_GAMES: Guid = Guid.fromU128(U128(0xb689b0d076d34cbbuL, 0x87f7585d0e0ce070uL))

public val FOLDERTYPEID_GENERIC: Guid = Guid.fromU128(U128(0x5c4f28b5f8694e84uL, 0x8e60f11db97c5cc7uL))

public val FOLDERTYPEID_GENERIC_LIBRARY: Guid = Guid.fromU128(U128(0x5f4eab9a68334f61uL, 0x899d31cf46979d49uL))

public val FOLDERTYPEID_GENERIC_SEARCH_RESULTS: Guid = Guid.fromU128(U128(0x7fde1a1e8b3149a5uL, 0x93b86be14cfa4943uL))

public val FOLDERTYPEID_INVALID: Guid = Guid.fromU128(U128(0x578078988c4f4462uL, 0xbb6371042380b109uL))

public val FOLDERTYPEID_MUSIC: Guid = Guid.fromU128(U128(0x94d6ddcc4a684175uL, 0xa374bd584a510b78uL))

public val FOLDERTYPEID_NETWORK_EXPLORER: Guid = Guid.fromU128(U128(0x25cc242b9a7c4f51uL, 0x80e07a2928febe42uL))

public val FOLDERTYPEID_OPEN_SEARCH: Guid = Guid.fromU128(U128(0x8faf9629198046ffuL, 0x80239dceab9c3ee3uL))

public val FOLDERTYPEID_OTHER_USERS: Guid = Guid.fromU128(U128(0xb337fd009dd54635uL, 0xa6d4da33fd102b7auL))

public val FOLDERTYPEID_PICTURES: Guid = Guid.fromU128(U128(0xb3690e58e961423buL, 0xb687386ebfd83239uL))

public val FOLDERTYPEID_PRINTERS: Guid = Guid.fromU128(U128(0x2c7bbec6c8444a0auL, 0x91facef6f59cfda1uL))

public val FOLDERTYPEID_PUBLISHED_ITEMS: Guid = Guid.fromU128(U128(0x7f2f5b96ff7441dauL, 0xafd81c78a5f3aea2uL))

public val FOLDERTYPEID_RECORDED_TV: Guid = Guid.fromU128(U128(0x5557a28f5da64f83uL, 0x8809c2c98a11a6fauL))

public val FOLDERTYPEID_RECYCLE_BIN: Guid = Guid.fromU128(U128(0xd6d9e004cd87442buL, 0x9d575e0aeb4f6f72uL))

public val FOLDERTYPEID_SAVED_GAMES: Guid = Guid.fromU128(U128(0xd036330728cb4106uL, 0x9f232956e3e5e0e7uL))

public val FOLDERTYPEID_SEARCH_CONNECTOR: Guid = Guid.fromU128(U128(0x982725ee6f47479euL, 0xb447812bfa7d2e8fuL))

public val FOLDERTYPEID_SEARCH_HOME: Guid = Guid.fromU128(U128(0x834d8a4409744ed6uL, 0x866ef203d80b3810uL))

public val FOLDERTYPEID_SEARCHES: Guid = Guid.fromU128(U128(0xb0ba2e3405f415euL, 0xa6eecad625207853uL))

public val FOLDERTYPEID_SOFTWARE_EXPLORER: Guid = Guid.fromU128(U128(0xd674391b52d94e07uL, 0x834e67c98610f39duL))

public val FOLDERTYPEID_START_MENU: Guid = Guid.fromU128(U128(0xef87b4cbf2ce4785uL, 0x86584ca6c63e38c6uL))

public val FOLDERTYPEID_STORAGE_PROVIDER_DOCUMENTS: Guid = Guid.fromU128(U128(0xdd61bd6670e848dduL, 0x965565c5e1aac2d1uL))

public val FOLDERTYPEID_STORAGE_PROVIDER_GENERIC: Guid = Guid.fromU128(U128(0x4f01ebc5238541f2uL, 0xa28e2c5c91fb56e0uL))

public val FOLDERTYPEID_STORAGE_PROVIDER_MUSIC: Guid = Guid.fromU128(U128(0x672ecd7eaf044399uL, 0x875c0290845b6247uL))

public val FOLDERTYPEID_STORAGE_PROVIDER_PICTURES: Guid = Guid.fromU128(U128(0x71d642a9f2b142cduL, 0xad92eb9300c7cc0auL))

public val FOLDERTYPEID_STORAGE_PROVIDER_VIDEOS: Guid = Guid.fromU128(U128(0x51294da1d7b1485buL, 0x9e9a17cffe33e187uL))

public val FOLDERTYPEID_USER_FILES: Guid = Guid.fromU128(U128(0xcd0fc69b71e246e5uL, 0x96905bcd9f57aab3uL))

public val FOLDERTYPEID_USERS_LIBRARIES: Guid = Guid.fromU128(U128(0xc4d98f0961244fe0uL, 0x9942826416082da9uL))

public val FOLDERTYPEID_VIDEOS: Guid = Guid.fromU128(U128(0x5fa964077e77483cuL, 0xac93691d05850de8uL))

public val FOS_ALLNONSTORAGEITEMS: Fileopendialogoptions = 128u

public val FOS_ALLOWMULTISELECT: Fileopendialogoptions = 512u

public val FOS_CREATEPROMPT: Fileopendialogoptions = 8192u

public val FOS_DEFAULTNOMINIMODE: Fileopendialogoptions = 536870912u

public val FOS_DONTADDTORECENT: Fileopendialogoptions = 33554432u

public val FOS_FILEMUSTEXIST: Fileopendialogoptions = 4096u

public val FOS_FORCEFILESYSTEM: Fileopendialogoptions = 64u

public val FOS_FORCEPREVIEWPANEON: Fileopendialogoptions = 1073741824u

public val FOS_FORCESHOWHIDDEN: Fileopendialogoptions = 268435456u

public val FOS_HIDEMRUPLACES: Fileopendialogoptions = 131072u

public val FOS_HIDEPINNEDPLACES: Fileopendialogoptions = 262144u

public val FOS_NOCHANGEDIR: Fileopendialogoptions = 8u

public val FOS_NODEREFERENCELINKS: Fileopendialogoptions = 1048576u

public val FOS_NOREADONLYRETURN: Fileopendialogoptions = 32768u

public val FOS_NOTESTFILECREATE: Fileopendialogoptions = 65536u

public val FOS_NOVALIDATE: Fileopendialogoptions = 256u

public val FOS_OKBUTTONNEEDSINTERACTION: Fileopendialogoptions = 2097152u

public val FOS_OVERWRITEPROMPT: Fileopendialogoptions = 2u

public val FOS_PATHMUSTEXIST: Fileopendialogoptions = 2048u

public val FOS_PICKFOLDERS: Fileopendialogoptions = 32u

public val FOS_SHAREAWARE: Fileopendialogoptions = 16384u

public val FOS_STRICTFILETYPES: Fileopendialogoptions = 4u

public val FOS_SUPPORTSTREAMABLEITEMS: Fileopendialogoptions = 2147483648u

public val FO_COPY: UInt = 2u

public val FO_DELETE: UInt = 3u

public val FO_MOVE: UInt = 1u

public val FO_RENAME: UInt = 4u

public val FP_ABOVE: FlyoutPlacement = 1

public val FP_BELOW: FlyoutPlacement = 2

public val FP_DEFAULT: FlyoutPlacement = 0

public val FP_LEFT: FlyoutPlacement = 3

public val FP_RIGHT: FlyoutPlacement = 4

public val FS_COPY_HANDLER: Guid = Guid.fromU128(U128(0xd197380a0a794dc8uL, 0xa033ed882c2fa14buL))

public val FTA_ALWAYS_UNSAFE: Filetypeattributeflags = 131072

public val FTA_ALWAYS_USE_DIRECT_INVOKE: Filetypeattributeflags = 4194304

public val FTA_EXCLUDE: Filetypeattributeflags = 1

public val FTA_HAS_EXTENSION: Filetypeattributeflags = 4

public val FTA_NO_DDE: Filetypeattributeflags = 8192

public val FTA_NO_EDIT: Filetypeattributeflags = 8

public val FTA_NO_EDIT_DESC: Filetypeattributeflags = 256

public val FTA_NO_EDIT_DFLT: Filetypeattributeflags = 1024

public val FTA_NO_EDIT_ICON: Filetypeattributeflags = 512

public val FTA_NO_EDIT_MIME: Filetypeattributeflags = 32768

public val FTA_NO_EDIT_VERB: Filetypeattributeflags = 64

public val FTA_NO_EDIT_VERB_CMD: Filetypeattributeflags = 2048

public val FTA_NO_EDIT_VERB_EXE: Filetypeattributeflags = 4096

public val FTA_NO_NEW_VERB: Filetypeattributeflags = 32

public val FTA_NO_RECENT_DOCS: Filetypeattributeflags = 1048576

public val FTA_NO_REMOVE: Filetypeattributeflags = 16

public val FTA_NO_REMOVE_VERB: Filetypeattributeflags = 128

public val FTA_NONE: Filetypeattributeflags = 0

public val FTA_OPEN_IS_SAFE: Filetypeattributeflags = 65536

public val FTA_SAFE_FOR_ELEVATION: Filetypeattributeflags = 2097152

public val FTA_SHOW: Filetypeattributeflags = 2

public val FUT_EDITING: FileUsageType = 1

public val FUT_GENERIC: FileUsageType = 2

public val FUT_PLAYING: FileUsageType = 0

public val FVM_AUTO: Folderviewmode = -1

public val FVM_CONTENT: Folderviewmode = 8

public val FVM_DETAILS: Folderviewmode = 4

public val FVM_FIRST: Folderviewmode = 1

public val FVM_ICON: Folderviewmode = 1

public val FVM_LAST: Folderviewmode = 8

public val FVM_LIST: Folderviewmode = 3

public val FVM_SMALLICON: Folderviewmode = 2

public val FVM_THUMBNAIL: Folderviewmode = 5

public val FVM_THUMBSTRIP: Folderviewmode = 7

public val FVM_TILE: Folderviewmode = 6

public val FVO_CUSTOMORDERING: Folderviewoptions = 4

public val FVO_CUSTOMPOSITION: Folderviewoptions = 2

public val FVO_DEFAULT: Folderviewoptions = 0

public val FVO_NOANIMATIONS: Folderviewoptions = 16

public val FVO_NOSCROLLTIPS: Folderviewoptions = 32

public val FVO_SUPPORTHYPERLINKS: Folderviewoptions = 8

public val FVO_VISTALAYOUT: Folderviewoptions = 1

public val FVSIF_CANVIEWIT: UInt = 1073741824u

public val FVSIF_NEWFAILED: UInt = 134217728u

public val FVSIF_NEWFILE: UInt = 2147483648u

public val FVSIF_PINNED: UInt = 2u

public val FVSIF_RECT: UInt = 1u

public val FVST_EMPTYTEXT: Fvtexttype = 0

public val FWF_ABBREVIATEDNAMES: Folderflags = 2

public val FWF_ALIGNLEFT: Folderflags = 2048

public val FWF_ALLOWRTLREADING: Folderflags = -2147483648.toInt()

public val FWF_AUTOARRANGE: Folderflags = 1

public val FWF_AUTOCHECKSELECT: Folderflags = 134217728

public val FWF_BESTFITWINDOW: Folderflags = 16

public val FWF_CHECKSELECT: Folderflags = 262144

public val FWF_DESKTOP: Folderflags = 32

public val FWF_EXTENDEDTILES: Folderflags = 33554432

public val FWF_FULLROWSELECT: Folderflags = 2097152

public val FWF_HIDEFILENAMES: Folderflags = 131072

public val FWF_NOBROWSERVIEWSTATE: Folderflags = 268435456

public val FWF_NOCLIENTEDGE: Folderflags = 512

public val FWF_NOCOLUMNHEADER: Folderflags = 8388608

public val FWF_NOENUMREFRESH: Folderflags = 524288

public val FWF_NOFILTERS: Folderflags = 4194304

public val FWF_NOGROUPING: Folderflags = 1048576

public val FWF_NOHEADERINALLVIEWS: Folderflags = 16777216

public val FWF_NOICONS: Folderflags = 4096

public val FWF_NONE: Folderflags = 0

public val FWF_NOSCROLL: Folderflags = 1024

public val FWF_NOSUBFOLDERS: Folderflags = 128

public val FWF_NOVISIBLE: Folderflags = 16384

public val FWF_NOWEBVIEW: Folderflags = 65536

public val FWF_OWNERDATA: Folderflags = 8

public val FWF_SHOWSELALWAYS: Folderflags = 8192

public val FWF_SINGLECLICKACTIVATE: Folderflags = 32768

public val FWF_SINGLESEL: Folderflags = 64

public val FWF_SNAPTOGRID: Folderflags = 4

public val FWF_SUBSETGROUPS: Folderflags = 536870912

public val FWF_TRANSPARENT: Folderflags = 256

public val FWF_TRICHECKSELECT: Folderflags = 67108864

public val FWF_USESEARCHFOLDER: Folderflags = 1073741824

public val FILE_OPEN_DIALOG: Guid = Guid.fromU128(U128(0xdc1c5a9ce88a4ddeuL, 0xa5a160f82a20aef7uL))

public val FILE_OPERATION: Guid = Guid.fromU128(U128(0x3ad0557588574850uL, 0x927711b85bdb8e09uL))

public val FILE_SAVE_DIALOG: Guid = Guid.fromU128(U128(0xc0b4e2f3ba214773uL, 0x8dba335ec946eb8buL))

public val FILE_SEARCH_BAND: Guid = Guid.fromU128(U128(0xc4ee31f3476811d2uL, 0xbe5c00a0c9a83da1uL))

public val FOLDER_VIEW_HOST: Guid = Guid.fromU128(U128(0x20b1cb2369684eb9uL, 0xb7d4a66d00d07ceeuL))

public val FRAMEWORK_INPUT_PANE: Guid = Guid.fromU128(U128(0xd5120aa346ba44c5uL, 0x822dca8092c1fc72uL))

public val FREE_SPACE_CATEGORIZER: Guid = Guid.fromU128(U128(0xb560779324ac44c7uL, 0x82e2831726aa6cb7uL))

public val GADOF_DIRTY: UInt = 1u

public val GCS_HELPTEXT: UInt = 5u

public val GCS_HELPTEXTA: UInt = 1u

public val GCS_HELPTEXTW: UInt = 5u

public val GCS_UNICODE: UInt = 4u
