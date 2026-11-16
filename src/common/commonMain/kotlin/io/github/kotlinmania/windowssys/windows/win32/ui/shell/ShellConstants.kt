package io.github.kotlinmania.windowssys.windows.win32.ui.shell

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

public val ALLOW_SMALLER_SIZE: ThumbnailStreamCacheOptions = 4

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

public val CLOSEPROPS_DISCARD: UInt = 1u

public val CLOSEPROPS_NONE: UInt = 0u

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

public val GADOF_DIRTY: UInt = 1u

public val GCS_HELPTEXT: UInt = 5u

public val GCS_HELPTEXTA: UInt = 1u

public val GCS_HELPTEXTW: UInt = 5u

public val GCS_UNICODE: UInt = 4u

public val GCS_VALIDATE: UInt = 6u

public val GCS_VALIDATEA: UInt = 2u

public val GCS_VALIDATEW: UInt = 6u

public val GCS_VERB: UInt = 4u

public val GCS_VERBA: UInt = 0u

public val GCS_VERBICONW: UInt = 20u

public val GCS_VERBW: UInt = 4u

public val GCT_INVALID: UInt = 0u

public val GCT_LFNCHAR: UInt = 1u

public val GCT_SEPARATOR: UInt = 8u

public val GCT_SHORTCHAR: UInt = 2u

public val GCT_WILD: UInt = 4u

public val GETPROPS_NONE: UInt = 0u

public val GIL_ASYNC: UInt = 32u

public val GIL_CHECKSHIELD: UInt = 512u

public val GIL_DEFAULTICON: UInt = 64u

public val GIL_DONTCACHE: UInt = 16u

public val GIL_FORCENOSHIELD: UInt = 1024u

public val GIL_FORSHELL: UInt = 2u

public val GIL_FORSHORTCUT: UInt = 128u

public val GIL_NOTFILENAME: UInt = 8u

public val GIL_OPENICON: UInt = 1u

public val GIL_PERCLASS: UInt = 4u

public val GIL_PERINSTANCE: UInt = 2u

public val GIL_SHIELD: UInt = 512u

public val GIL_SIMULATEDOC: UInt = 1u

public val GLOBALCOUNTER_APPLICATION_DESTINATIONS: Shglobalcounter = 12

public val GLOBALCOUNTER_APPROVEDSITES: Shglobalcounter = 4

public val GLOBALCOUNTER_APPSFOLDER_FILETYPEASSOCIATION_COUNTER: Shglobalcounter = 55

public val GLOBALCOUNTER_APP_ITEMS_STATE_STORE_CACHE: Shglobalcounter = 53

public val GLOBALCOUNTER_ASSOCCHANGED: Shglobalcounter = 52

public val GLOBALCOUNTER_BANNERS_DATAMODEL_CACHE_MACHINEWIDE: Shglobalcounter = 58

public val GLOBALCOUNTER_BITBUCKETNUMDELETERS: Shglobalcounter = 14

public val GLOBALCOUNTER_COMMONPLACES_LIST_CACHE: Shglobalcounter = 50

public val GLOBALCOUNTER_FOLDERDEFINITION_CACHE: Shglobalcounter = 49

public val GLOBALCOUNTER_FOLDERSETTINGSCHANGE: Shglobalcounter = 2

public val GLOBALCOUNTER_IEONLY_SESSIONS: Shglobalcounter = 11

public val GLOBALCOUNTER_IESESSIONS: Shglobalcounter = 10

public val GLOBALCOUNTER_INTERNETTOOLBAR_LAYOUT: Shglobalcounter = 48

public val GLOBALCOUNTER_MAXIMUMVALUE: Shglobalcounter = 59

public val GLOBALCOUNTER_OVERLAYMANAGER: Shglobalcounter = 8

public val GLOBALCOUNTER_PRIVATE_PROFILE_CACHE: Shglobalcounter = 47

public val GLOBALCOUNTER_PRIVATE_PROFILE_CACHE_MACHINEWIDE: Shglobalcounter = 51

public val GLOBALCOUNTER_QUERYASSOCIATIONS: Shglobalcounter = 9

public val GLOBALCOUNTER_RATINGS: Shglobalcounter = 3

public val GLOBALCOUNTER_RATINGS_STATECOUNTER: Shglobalcounter = 46

public val GLOBALCOUNTER_RECYCLEBINCORRUPTED: Shglobalcounter = 45

public val GLOBALCOUNTER_RECYCLEBINENUM: Shglobalcounter = 44

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_A: Shglobalcounter = 16

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_B: Shglobalcounter = 17

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_C: Shglobalcounter = 18

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_D: Shglobalcounter = 19

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_E: Shglobalcounter = 20

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_F: Shglobalcounter = 21

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_G: Shglobalcounter = 22

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_H: Shglobalcounter = 23

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_I: Shglobalcounter = 24

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_J: Shglobalcounter = 25

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_K: Shglobalcounter = 26

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_L: Shglobalcounter = 27

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_M: Shglobalcounter = 28

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_N: Shglobalcounter = 29

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_O: Shglobalcounter = 30

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_P: Shglobalcounter = 31

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_Q: Shglobalcounter = 32

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_R: Shglobalcounter = 33

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_S: Shglobalcounter = 34

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_T: Shglobalcounter = 35

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_U: Shglobalcounter = 36

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_V: Shglobalcounter = 37

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_W: Shglobalcounter = 38

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_X: Shglobalcounter = 39

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_Y: Shglobalcounter = 40

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_DRIVE_Z: Shglobalcounter = 41

public val GLOBALCOUNTER_RECYCLEDIRTYCOUNT_SHARES: Shglobalcounter = 15

public val GLOBALCOUNTER_RESTRICTIONS: Shglobalcounter = 5

public val GLOBALCOUNTER_SEARCHMANAGER: Shglobalcounter = 0

public val GLOBALCOUNTER_SEARCHOPTIONS: Shglobalcounter = 1

public val GLOBALCOUNTER_SETTINGSYNC_ENABLED: Shglobalcounter = 54

public val GLOBALCOUNTER_SHELLSETTINGSCHANGED: Shglobalcounter = 6

public val GLOBALCOUNTER_SYNC_ENGINE_INFORMATION_CACHE_MACHINEWIDE: Shglobalcounter = 57

public val GLOBALCOUNTER_SYSTEMPIDLCHANGE: Shglobalcounter = 7

public val GLOBALCOUNTER_USERINFOCHANGED: Shglobalcounter = 56

public val GPFIDL_ALTNAME: GpfidlFlags = 1u

public val GPFIDL_DEFAULT: GpfidlFlags = 0u

public val GPFIDL_UNCPRINTER: GpfidlFlags = 2u

public val HELPINFO_MENUITEM: HelpInfoType = 2

public val HELPINFO_WINDOW: HelpInfoType = 1

public val HGSC_DOCUMENTSLIBRARY: Homegroupsharingchoices = 8

public val HGSC_MUSICLIBRARY: Homegroupsharingchoices = 1

public val HGSC_NONE: Homegroupsharingchoices = 0

public val HGSC_PICTURESLIBRARY: Homegroupsharingchoices = 2

public val HGSC_PRINTERS: Homegroupsharingchoices = 16

public val HGSC_VIDEOSLIBRARY: Homegroupsharingchoices = 4

public val HLBWIF_DOCWNDMAXIMIZED: HlbwifFlags = 8

public val HLBWIF_FRAMEWNDMAXIMIZED: HlbwifFlags = 4

public val HLBWIF_HASDOCWNDINFO: HlbwifFlags = 2

public val HLBWIF_HASFRAMEWNDINFO: HlbwifFlags = 1

public val HLBWIF_HASWEBTOOLBARINFO: HlbwifFlags = 16

public val HLBWIF_WEBTOOLBARHIDDEN: HlbwifFlags = 32

public val HLFNAMEF_DEFAULT: Hlfnamef = 0

public val HLFNAMEF_TRYCACHE: Hlfnamef = 1

public val HLFNAMEF_TRYFULLTARGET: Hlfnamef = 4

public val HLFNAMEF_TRYPRETTYTARGET: Hlfnamef = 2

public val HLFNAMEF_TRYWIN95SHORTCUT: Hlfnamef = 8

public val HLID_CURRENT: HlidInfo = 4294967293u

public val HLID_INVALID: HlidInfo = 0u

public val HLID_NEXT: HlidInfo = 4294967294u

public val HLID_PREVIOUS: HlidInfo = 4294967295u

public val HLID_STACKBOTTOM: HlidInfo = 4294967292u

public val HLID_STACKTOP: HlidInfo = 4294967291u

public val HLINKGETREF_ABSOLUTE: Hlinkgetref = 1

public val HLINKGETREF_DEFAULT: Hlinkgetref = 0

public val HLINKGETREF_RELATIVE: Hlinkgetref = 2

public val HLINKMISC_RELATIVE: Hlinkmisc = 1

public val HLINKSETF_LOCATION: Hlinksetf = 2

public val HLINKSETF_TARGET: Hlinksetf = 1

public val HLINKWHICHMK_BASE: Hlinkwhichmk = 2

public val HLINKWHICHMK_CONTAINER: Hlinkwhichmk = 1

public val HLINK_E_FIRST: Hresult = 0x80040100u.toInt()

public val HLINK_S_DONTHIDE: Int = 262400

public val HLINK_S_FIRST: Hresult = 0x40100u.toInt()

public val HLNF_ALLOW_AUTONAVIGATE: UInt = 536870912u

public val HLNF_CALLERUNTRUSTED: UInt = 2097152u

public val HLNF_CREATENOHISTORY: Hlnf = 32u

public val HLNF_DISABLEWINDOWRESTRICTIONS: UInt = 8388608u

public val HLNF_EXTERNALNAVIGATE: UInt = 268435456u

public val HLNF_INTERNALJUMP: Hlnf = 1u

public val HLNF_NAVIGATINGBACK: Hlnf = 4u

public val HLNF_NAVIGATINGFORWARD: Hlnf = 8u

public val HLNF_NAVIGATINGTOSTACKITEM: Hlnf = 16u

public val HLNF_NEWWINDOWSMANAGED: UInt = 2147483648u

public val HLNF_OPENINNEWWINDOW: Hlnf = 2u

public val HLNF_TRUSTEDFORACTIVEX: UInt = 4194304u

public val HLNF_TRUSTFIRSTDOWNLOAD: UInt = 16777216u

public val HLNF_UNTRUSTEDFORDOWNLOAD: UInt = 33554432u

public val HLQF_ISCURRENT: HlqfInfo = 2

public val HLQF_ISVALID: HlqfInfo = 1

public val HLSHORTCUTF_DEFAULT: Hlshortcutf = 0

public val HLSHORTCUTF_DONTACTUALLYCREATE: Hlshortcutf = 1

public val HLSHORTCUTF_MAYUSEEXISTINGSHORTCUT: Hlshortcutf = 8

public val HLSHORTCUTF_USEFILENAMEFROMFRIENDLYNAME: Hlshortcutf = 2

public val HLSHORTCUTF_USEUNIQUEFILENAME: Hlshortcutf = 4

public val HLSR_HISTORYFOLDER: Hlsr = 2

public val HLSR_HOME: Hlsr = 0

public val HLSR_SEARCHPAGE: Hlsr = 1

public val HLTB_DOCKEDBOTTOM: HltbInfo = 3

public val HLTB_DOCKEDLEFT: HltbInfo = 0

public val HLTB_DOCKEDRIGHT: HltbInfo = 2

public val HLTB_DOCKEDTOP: HltbInfo = 1

public val HLTB_FLOATING: HltbInfo = 4

public val HLTRANSLATEF_DEFAULT: Hltranslatef = 0

public val HLTRANSLATEF_DONTAPPLYDEFAULTPREFIX: Hltranslatef = 1

public val HOMEGROUP_SECURITY_GROUP: Pcwstr = w("HomeUsers")

public val HOMEGROUP_SECURITY_GROUP_MULTI: Pcwstr = w("HUG")

public val IDC_OFFLINE_HAND: UInt = 103u

public val IDC_PANTOOL_HAND_CLOSED: UInt = 105u

public val IDC_PANTOOL_HAND_OPEN: UInt = 104u

public val IDD_WIZEXTN_FIRST: UInt = 20480u

public val IDD_WIZEXTN_LAST: UInt = 20736u

public val IDO_SHGIOI_DEFAULT: ULong = 4294967292uL

public val IDO_SHGIOI_LINK: UInt = 268435454u

public val IDO_SHGIOI_SHARE: UInt = 268435455u

public val IDO_SHGIOI_SLOWFILE: ULong = 4294967293uL

public val IDS_DESCRIPTION: UInt = 1u

public val ID_APP: UInt = 100u

public val IEIFLAG_ASPECT: UInt = 4u

public val IEIFLAG_ASYNC: UInt = 1u

public val IEIFLAG_CACHE: UInt = 2u

public val IEIFLAG_GLEAM: UInt = 16u

public val IEIFLAG_NOBORDER: UInt = 256u

public val IEIFLAG_NOSTAMP: UInt = 128u

public val IEIFLAG_OFFLINE: UInt = 8u

public val IEIFLAG_ORIGSIZE: UInt = 64u

public val IEIFLAG_QUALITY: UInt = 512u

public val IEIFLAG_REFRESH: UInt = 1024u

public val IEIFLAG_SCREEN: UInt = 32u

public val IEIT_PRIORITY_NORMAL: UInt = 268435456u

public val IEI_PRIORITY_MAX: UInt = 2147483647u

public val IEI_PRIORITY_MIN: UInt = 0u

public val IEPDN_BINDINGUI: Iepdnflags = 1

public val IESHORTCUT_BACKGROUNDTAB: Ieshortcutflags = 8

public val IESHORTCUT_FORCENAVIGATE: Ieshortcutflags = 4

public val IESHORTCUT_NEWBROWSER: Ieshortcutflags = 1

public val IESHORTCUT_OPENNEWTAB: Ieshortcutflags = 2

public val ILMM_IE4: UInt = 0u

public val IMM_ACC_DOCKING_E_DOCKOCCUPIED: Hresult = 0x80270231u.toInt()

public val IMM_ACC_DOCKING_E_INSUFFICIENTHEIGHT: Hresult = 0x80270230u.toInt()

public val IMSC_E_SHELL_COMPONENT_STARTUP_FAILURE: Hresult = 0x80270233u.toInt()

public val INTERNET_MAX_PATH_LENGTH: UInt = 2048u

public val INTERNET_MAX_SCHEME_LENGTH: UInt = 32u

public val IRTIR_TASK_FINISHED: UInt = 4u

public val IRTIR_TASK_NOT_RUNNING: UInt = 0u

public val IRTIR_TASK_PENDING: UInt = 3u

public val IRTIR_TASK_RUNNING: UInt = 1u

public val IRTIR_TASK_SUSPENDED: UInt = 2u

public val ISFBVIEWMODE_LARGEICONS: UInt = 2u

public val ISFBVIEWMODE_LOGOS: UInt = 3u

public val ISFBVIEWMODE_SMALLICONS: UInt = 1u

public val ISFB_MASK_BKCOLOR: UInt = 2u

public val ISFB_MASK_COLORS: UInt = 32u

public val ISFB_MASK_IDLIST: UInt = 16u

public val ISFB_MASK_SHELLFOLDER: UInt = 8u

public val ISFB_MASK_STATE: UInt = 1u

public val ISFB_MASK_VIEWMODE: UInt = 4u

public val ISFB_STATE_ALLOWRENAME: UInt = 2u

public val ISFB_STATE_BTNMINSIZE: UInt = 256u

public val ISFB_STATE_CHANNELBAR: UInt = 16u

public val ISFB_STATE_DEBOSSED: UInt = 1u

public val ISFB_STATE_DEFAULT: UInt = 0u

public val ISFB_STATE_FULLOPEN: UInt = 64u

public val ISFB_STATE_NONAMESORT: UInt = 128u

public val ISFB_STATE_NOSHOWTEXT: UInt = 4u

public val ISFB_STATE_QLINKSMODE: UInt = 32u

public val ISHCUTCMDID_COMMITHISTORY: Int = 2

public val ISHCUTCMDID_DOWNLOADICON: Int = 0

public val ISHCUTCMDID_INTSHORTCUTCREATE: Int = 1

public val ISHCUTCMDID_SETUSERAWURL: Int = 3

public val ISIOI_ICONFILE: UInt = 1u

public val ISIOI_ICONINDEX: UInt = 2u

public val IS_E_EXEC_FAILED: Hresult = 0x80042002u.toInt()

public val IS_FULLSCREEN: UInt = 2u

public val IS_NORMAL: UInt = 1u

public val IS_SPLIT: UInt = 4u

public val ITSAT_DEFAULT_PRIORITY: UInt = 268435456u

public val ITSAT_MAX_PRIORITY: UInt = 2147483647u

public val ITSAT_MIN_PRIORITY: UInt = 0u

public val ITSSFLAG_COMPLETE_ON_DESTROY: UInt = 0u

public val ITSSFLAG_FLAGS_MASK: UInt = 3u

public val ITSSFLAG_KILL_ON_DESTROY: UInt = 1u

public val ITSS_THREAD_TIMEOUT_NO_CHANGE: UInt = 4294967294u

public val IURL_INVOKECOMMAND_FL_ALLOW_UI: IurlInvokecommandFlags = 1

public val IURL_INVOKECOMMAND_FL_ASYNCOK: IurlInvokecommandFlags = 8

public val IURL_INVOKECOMMAND_FL_DDEWAIT: IurlInvokecommandFlags = 4

public val IURL_INVOKECOMMAND_FL_LOG_USAGE: IurlInvokecommandFlags = 16

public val IURL_INVOKECOMMAND_FL_USE_DEFAULT_VERB: IurlInvokecommandFlags = 2

public val IURL_SETURL_FL_GUESS_PROTOCOL: IurlSeturlFlags = 1

public val IURL_SETURL_FL_USE_DEFAULT_PROTOCOL: IurlSeturlFlags = 2

public val KDC_FREQUENT: Knowndestcategory = 1

public val KDC_RECENT: Knowndestcategory = 2

public val KFDF_LOCAL_REDIRECT_ONLY: KfDefinitionFlags = 2

public val KFDF_NO_REDIRECT_UI: KfDefinitionFlags = 64

public val KFDF_PRECREATE: KfDefinitionFlags = 8

public val KFDF_PUBLISHEXPANDEDPATH: KfDefinitionFlags = 32

public val KFDF_ROAMABLE: KfDefinitionFlags = 4

public val KFDF_STREAM: KfDefinitionFlags = 16

public val KF_CATEGORY_COMMON: KfCategory = 3

public val KF_CATEGORY_FIXED: KfCategory = 2

public val KF_CATEGORY_PERUSER: KfCategory = 4

public val KF_CATEGORY_VIRTUAL: KfCategory = 1

public val KF_FLAG_ALIAS_ONLY: KnownFolderFlag = -2147483648.toInt()

public val KF_FLAG_CREATE: KnownFolderFlag = 32768

public val KF_FLAG_DEFAULT: KnownFolderFlag = 0

public val KF_FLAG_DEFAULT_PATH: KnownFolderFlag = 1024

public val KF_FLAG_DONT_UNEXPAND: KnownFolderFlag = 8192

public val KF_FLAG_DONT_VERIFY: KnownFolderFlag = 16384

public val KF_FLAG_FORCE_APPCONTAINER_REDIRECTION: KnownFolderFlag = 131072

public val KF_FLAG_FORCE_APP_DATA_REDIRECTION: KnownFolderFlag = 524288

public val KF_FLAG_FORCE_PACKAGE_REDIRECTION: KnownFolderFlag = 131072

public val KF_FLAG_INIT: KnownFolderFlag = 2048

public val KF_FLAG_NOT_PARENT_RELATIVE: KnownFolderFlag = 512

public val KF_FLAG_NO_ALIAS: KnownFolderFlag = 4096

public val KF_FLAG_NO_APPCONTAINER_REDIRECTION: KnownFolderFlag = 65536

public val KF_FLAG_NO_PACKAGE_REDIRECTION: KnownFolderFlag = 65536

public val KF_FLAG_RETURN_FILTER_REDIRECTION_TARGET: KnownFolderFlag = 262144

public val KF_FLAG_SIMPLE_IDLIST: KnownFolderFlag = 256

public val KF_REDIRECTION_CAPABILITIES_ALLOW_ALL: KfRedirectionCapabilities = 255

public val KF_REDIRECTION_CAPABILITIES_DENY_ALL: KfRedirectionCapabilities = 1048320

public val KF_REDIRECTION_CAPABILITIES_DENY_PERMISSIONS: KfRedirectionCapabilities = 1024

public val KF_REDIRECTION_CAPABILITIES_DENY_POLICY: KfRedirectionCapabilities = 512

public val KF_REDIRECTION_CAPABILITIES_DENY_POLICY_REDIRECTED: KfRedirectionCapabilities = 256

public val KF_REDIRECTION_CAPABILITIES_REDIRECTABLE: KfRedirectionCapabilities = 1

public val KF_REDIRECT_CHECK_ONLY: KfRedirectFlags = 16

public val KF_REDIRECT_COPY_CONTENTS: KfRedirectFlags = 512

public val KF_REDIRECT_COPY_SOURCE_DACL: KfRedirectFlags = 2

public val KF_REDIRECT_DEL_SOURCE_CONTENTS: KfRedirectFlags = 1024

public val KF_REDIRECT_EXCLUDE_ALL_KNOWN_SUBFOLDERS: KfRedirectFlags = 2048

public val KF_REDIRECT_OWNER_USER: KfRedirectFlags = 4

public val KF_REDIRECT_PIN: KfRedirectFlags = 128

public val KF_REDIRECT_SET_OWNER_EXPLICIT: KfRedirectFlags = 8

public val KF_REDIRECT_UNPIN: KfRedirectFlags = 64

public val KF_REDIRECT_USER_EXCLUSIVE: KfRedirectFlags = 1

public val KF_REDIRECT_WITH_UI: KfRedirectFlags = 32

public val LFF_ALLITEMS: Libraryfolderfilter = 3

public val LFF_FORCEFILESYSTEM: Libraryfolderfilter = 1

public val LFF_STORAGEITEMS: Libraryfolderfilter = 2

public val LIBRARY_E_NO_ACCESSIBLE_LOCATION: Hresult = 0x80270201u.toInt()

public val LIBRARY_E_NO_SAVE_LOCATION: Hresult = 0x80270200u.toInt()

public val LINK_E_DELETE: Hresult = 0x80270103u.toInt()

public val LMD_ALLOWUNINDEXABLENETWORKLOCATIONS: Librarymanagedialogoptions = 1

public val LMD_DEFAULT: Librarymanagedialogoptions = 0

public val LOF_DEFAULT: Libraryoptionflags = 0

public val LOF_MASK_ALL: Libraryoptionflags = 1

public val LOF_PINNEDTONAVPANE: Libraryoptionflags = 1

public val LSF_FAILIFTHERE: Librarysaveflags = 0

public val LSF_MAKEUNIQUENAME: Librarysaveflags = 2

public val LSF_OVERRIDEEXISTING: Librarysaveflags = 1

public val MAV_APP_VISIBLE: MonitorAppVisibility = 2

public val MAV_NO_APP_VISIBLE: MonitorAppVisibility = 1

public val MAV_UNKNOWN: MonitorAppVisibility = 0

public val MAXFILELEN: UInt = 13u

public val MAX_COLUMN_DESC_LEN: UInt = 128u

public val MAX_COLUMN_NAME_LEN: UInt = 80u

public val MAX_SYNCMGRHANDLERNAME: UInt = 32u

public val MAX_SYNCMGRITEMNAME: UInt = 128u

public val MAX_SYNCMGR_ID: UInt = 64u

public val MAX_SYNCMGR_NAME: UInt = 128u

public val MAX_SYNCMGR_PROGRESSTEXT: UInt = 260u

public val MBHANDCID_PIDLSELECT: Menubandhandlercid = 0

public val MIMEASSOCDLG_FL_REGISTER_ASSOC: MimeassociationdialogInFlags = 1

public val MM_ADDSEPARATOR: MmFlags = 1u

public val MM_DONTREMOVESEPS: MmFlags = 4u

public val MM_SUBMENUSHAVEIDS: MmFlags = 2u

public val MPOS_CANCELLEVEL: Menupopupselect = 2

public val MPOS_CHILDTRACKING: Menupopupselect = 5

public val MPOS_EXECUTE: Menupopupselect = 0

public val MPOS_FULLCANCEL: Menupopupselect = 1

public val MPOS_SELECTLEFT: Menupopupselect = 3

public val MPOS_SELECTRIGHT: Menupopupselect = 4

public val MPPF_ALIGN_LEFT: Menupopuppopupflags = 33554432

public val MPPF_ALIGN_RIGHT: Menupopuppopupflags = 67108864

public val MPPF_BOTTOM: Menupopuppopupflags = -2147483648.toInt()

public val MPPF_FINALSELECT: Menupopuppopupflags = 128

public val MPPF_FORCEZORDER: Menupopuppopupflags = 64
