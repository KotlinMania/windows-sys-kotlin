package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

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

public val GENERIC_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x25cbb99692ed457euL, 0xb28c4774084bd562uL))

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

public val HIDE_INPUT_PANE_ANIMATION_COORDINATOR: Guid = Guid.fromU128(U128(0x384742b12a774cb3uL, 0x8cf81136f5e17e59uL))

public val HOME_GROUP: Guid = Guid.fromU128(U128(0xde77ba043c924d11uL, 0xa1a542352a53e0e3uL))

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

public val IE_NAMESPACE_TREE_CONTROL: Guid = Guid.fromU128(U128(0xace52d03e5cd4b20uL, 0x82ffe71b11beae1duL))

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

public val IDENTITY_LOCAL_USER_PROVIDER: Guid = Guid.fromU128(U128(0xa198529b730f4089uL, 0xb646a12557f5665euL))

public val IMAGE_PROPERTIES: Guid = Guid.fromU128(U128(0x7ab770c70e234d7auL, 0x8aa219bfad479829uL))

public val IMAGE_RECOMPRESS: Guid = Guid.fromU128(U128(0x6e33091cd2f84740uL, 0xb55e2e11d1477a2cuL))

public val IMAGE_TRANSCODE: Guid = Guid.fromU128(U128(0x17b75166928f417duL, 0x968564aa135565c1uL))

public val INPUT_PANEL_CONFIGURATION: Guid = Guid.fromU128(U128(0x2853add3f0964c63uL, 0xa78f7fa3ea837fb7uL))

public val INTERNET_EXPLORER: Guid = Guid.fromU128(U128(0x2df0100000000uL, 0xc000000000000046uL))

public val INTERNET_EXPLORER_MEDIUM: Guid = Guid.fromU128(U128(0xd5e8041d920f45e9uL, 0xb8fbb1deb82c6e5euL))

public val INTERNET_PRINT_ORDERING: Guid = Guid.fromU128(U128(0xadd36aa8751a4579uL, 0xa266d66f5202ccbbuL))

public val ITEM_COUNT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xabbf5c455ccc47b7uL, 0xbb4e87cb87bbd162uL))

public val ITEM_INDEX_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x92a053da29694021uL, 0xbf27514cfc2e4a69uL))

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

public val KNOWN_FOLDER_MANAGER: Guid = Guid.fromU128(U128(0x4df0c730df9d4ae3uL, 0x9153aa6b82e9795auL))

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

public val LOCAL_THUMBNAIL_CACHE: Guid = Guid.fromU128(U128(0x50ef4544ac9f4a8euL, 0xb21b8a26180db13fuL))

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

public val MPPF_INITIALSELECT: Menupopuppopupflags = 2

public val MPPF_KEYBOARD: Menupopuppopupflags = 16

public val MPPF_LEFT: Menupopuppopupflags = 1073741824

public val MPPF_NOANIMATE: Menupopuppopupflags = 4

public val MPPF_POS_MASK: Menupopuppopupflags = -536870912

public val MPPF_REPOSITION: Menupopuppopupflags = 32

public val MPPF_RIGHT: Menupopuppopupflags = 1610612736

public val MPPF_SETFOCUS: Menupopuppopupflags = 1

public val MPPF_TOP: Menupopuppopupflags = 536870912

public val MUS_COMPLETE: MergeUpdateStatus = 0

public val MUS_FAILED: MergeUpdateStatus = 2

public val MUS_USERINPUTNEEDED: MergeUpdateStatus = 1

public val MAIL_RECIPIENT: Guid = Guid.fromU128(U128(0x9e56be60c50f11cfuL, 0x9a2c00a0c90a90ceuL))

public val MERGED_CATEGORIZER: Guid = Guid.fromU128(U128(0x8e827c1133e74bc1uL, 0xb2428cd9a1c2b304uL))

public val NCM_DISPLAYERRORTIP: UInt = 1028u

public val NCM_GETADDRESS: UInt = 1025u

public val NCM_GETALLOWTYPE: UInt = 1027u

public val NCM_SETALLOWTYPE: UInt = 1026u

public val NDO_LANDSCAPE: NativeDisplayOrientation = 0

public val NDO_PORTRAIT: NativeDisplayOrientation = 1

public val NETCACHE_E_NEGATIVE_CACHE: Hresult = 0x80270100u.toInt()

public val NIF_GUID: NotifyIconDataFlags = 32u

public val NIF_ICON: NotifyIconDataFlags = 2u

public val NIF_INFO: NotifyIconDataFlags = 16u

public val NIF_MESSAGE: NotifyIconDataFlags = 1u

public val NIF_REALTIME: NotifyIconDataFlags = 64u

public val NIF_SHOWTIP: NotifyIconDataFlags = 128u

public val NIF_STATE: NotifyIconDataFlags = 8u

public val NIF_TIP: NotifyIconDataFlags = 4u

public val NIIF_ERROR: NotifyIconInfotipFlags = 3u

public val NIIF_ICON_MASK: NotifyIconInfotipFlags = 15u

public val NIIF_INFO: NotifyIconInfotipFlags = 1u

public val NIIF_LARGE_ICON: NotifyIconInfotipFlags = 32u

public val NIIF_NONE: NotifyIconInfotipFlags = 0u

public val NIIF_NOSOUND: NotifyIconInfotipFlags = 16u

public val NIIF_RESPECT_QUIET_TIME: NotifyIconInfotipFlags = 128u

public val NIIF_USER: NotifyIconInfotipFlags = 4u

public val NIIF_WARNING: NotifyIconInfotipFlags = 2u

public val NIM_ADD: NotifyIconMessage = 0u

public val NIM_DELETE: NotifyIconMessage = 2u

public val NIM_MODIFY: NotifyIconMessage = 1u

public val NIM_SETFOCUS: NotifyIconMessage = 3u

public val NIM_SETVERSION: NotifyIconMessage = 4u

public val NINF_KEY: UInt = 1u

public val NIN_BALLOONHIDE: UInt = 1027u

public val NIN_BALLOONSHOW: UInt = 1026u

public val NIN_BALLOONTIMEOUT: UInt = 1028u

public val NIN_BALLOONUSERCLICK: UInt = 1029u

public val NIN_POPUPCLOSE: UInt = 1031u

public val NIN_POPUPOPEN: UInt = 1030u

public val NIN_SELECT: UInt = 1024u

public val NIS_HIDDEN: NotifyIconState = 1u

public val NIS_SHAREDICON: NotifyIconState = 2u

public val NMCII_FOLDERS: NmciiFlags = 2

public val NMCII_ITEMS: NmciiFlags = 1

public val NMCII_NONE: NmciiFlags = 0

public val NMCSAEI_EDIT: NmcsaeiFlags = 1

public val NMCSAEI_SELECT: NmcsaeiFlags = 0

public val NOTIFYICON_VERSION: UInt = 3u

public val NOTIFYICON_VERSION_4: UInt = 4u

public val NP_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x3dd6bec081934ffeuL, 0xae25e08e39ea4063uL))

public val NSTCDHPOS_ONTOP: Int = -1

public val NSTCECT_BUTTON: Nstceclicktype = 3

public val NSTCECT_DBLCLICK: Nstceclicktype = 4

public val NSTCECT_LBUTTON: Nstceclicktype = 1

public val NSTCECT_MBUTTON: Nstceclicktype = 2

public val NSTCECT_RBUTTON: Nstceclicktype = 3

public val NSTCEHT_NOWHERE: Nstcehittest = 1

public val NSTCEHT_ONITEM: Nstcehittest = 70

public val NSTCEHT_ONITEMBUTTON: Nstcehittest = 16

public val NSTCEHT_ONITEMICON: Nstcehittest = 2

public val NSTCEHT_ONITEMINDENT: Nstcehittest = 8

public val NSTCEHT_ONITEMLABEL: Nstcehittest = 4

public val NSTCEHT_ONITEMRIGHT: Nstcehittest = 32

public val NSTCEHT_ONITEMSTATEICON: Nstcehittest = 64

public val NSTCEHT_ONITEMTABBUTTON: Nstcehittest = 4096

public val NSTCFC_DELAY_REGISTER_NOTIFY: Nstcfoldercapabilities = 2

public val NSTCFC_NONE: Nstcfoldercapabilities = 0

public val NSTCFC_PINNEDITEMFILTERING: Nstcfoldercapabilities = 1

public val NSTCGNI_CHILD: Nstcgni = 5

public val NSTCGNI_FIRSTVISIBLE: Nstcgni = 6

public val NSTCGNI_LASTVISIBLE: Nstcgni = 7

public val NSTCGNI_NEXT: Nstcgni = 0

public val NSTCGNI_NEXTVISIBLE: Nstcgni = 1

public val NSTCGNI_PARENT: Nstcgni = 4

public val NSTCGNI_PREV: Nstcgni = 2

public val NSTCGNI_PREVVISIBLE: Nstcgni = 3

public val NSTCIS_BOLD: Nstcitemstate = 4

public val NSTCIS_DISABLED: Nstcitemstate = 8

public val NSTCIS_EXPANDED: Nstcitemstate = 2

public val NSTCIS_NONE: Nstcitemstate = 0

public val NSTCIS_SELECTED: Nstcitemstate = 1

public val NSTCIS_SELECTEDNOEXPAND: Nstcitemstate = 16

public val NSTCRS_EXPANDED: Nstcrootstyle = 2

public val NSTCRS_HIDDEN: Nstcrootstyle = 1

public val NSTCRS_VISIBLE: Nstcrootstyle = 0

public val NSTCS2_DEFAULT: Nstcstyle2 = 0

public val NSTCS2_DISPLAYPADDING: Nstcstyle2 = 4

public val NSTCS2_DISPLAYPINNEDONLY: Nstcstyle2 = 8

public val NSTCS2_INTERRUPTNOTIFICATIONS: Nstcstyle2 = 1

public val NSTCS2_SHOWNULLSPACEMENU: Nstcstyle2 = 2

public val NSTCS_ALLOWJUNCTIONS: Nstcstyle = 268435456

public val NSTCS_AUTOHSCROLL: Nstcstyle = 1048576

public val NSTCS_BORDER: Nstcstyle = 32768

public val NSTCS_CHECKBOXES: Nstcstyle = 8388608

public val NSTCS_DIMMEDCHECKBOXES: Nstcstyle = 67108864

public val NSTCS_DISABLEDRAGDROP: Nstcstyle = 4096

public val NSTCS_EMPTYTEXT: Nstcstyle = 4194304

public val NSTCS_EVENHEIGHT: Nstcstyle = 1024

public val NSTCS_EXCLUSIONCHECKBOXES: Nstcstyle = 33554432

public val NSTCS_FADEINOUTEXPANDOS: Nstcstyle = 2097152

public val NSTCS_FAVORITESMODE: Nstcstyle = 524288

public val NSTCS_FULLROWSELECT: Nstcstyle = 8

public val NSTCS_HASEXPANDOS: Nstcstyle = 1

public val NSTCS_HASLINES: Nstcstyle = 2

public val NSTCS_HORIZONTALSCROLL: Nstcstyle = 32

public val NSTCS_NOEDITLABELS: Nstcstyle = 65536

public val NSTCS_NOINDENTCHECKS: Nstcstyle = 134217728

public val NSTCS_NOINFOTIP: Nstcstyle = 512

public val NSTCS_NOORDERSTREAM: Nstcstyle = 8192

public val NSTCS_NOREPLACEOPEN: Nstcstyle = 2048

public val NSTCS_PARTIALCHECKBOXES: Nstcstyle = 16777216

public val NSTCS_RICHTOOLTIP: Nstcstyle = 16384

public val NSTCS_ROOTHASEXPANDO: Nstcstyle = 64

public val NSTCS_SHOWDELETEBUTTON: Nstcstyle = 1073741824

public val NSTCS_SHOWREFRESHBUTTON: Nstcstyle = -2147483648.toInt()

public val NSTCS_SHOWSELECTIONALWAYS: Nstcstyle = 128

public val NSTCS_SHOWTABSBUTTON: Nstcstyle = 536870912

public val NSTCS_SINGLECLICKEXPAND: Nstcstyle = 4

public val NSTCS_SPRINGEXPAND: Nstcstyle = 16

public val NSTCS_TABSTOP: Nstcstyle = 131072

public val NSWF_ACCUMULATE_FOLDERS: Namespacewalkflag = 2048

public val NSWF_ANY_IMPLIES_ALL: Namespacewalkflag = 32768

public val NSWF_ASYNC: Namespacewalkflag = 512

public val NSWF_DEFAULT: Namespacewalkflag = 0

public val NSWF_DONT_ACCUMULATE_RESULT: Namespacewalkflag = 8

public val NSWF_DONT_RESOLVE_LINKS: Namespacewalkflag = 1024

public val NSWF_DONT_SORT: Namespacewalkflag = 4096

public val NSWF_DONT_TRAVERSE_LINKS: Namespacewalkflag = 4

public val NSWF_DONT_TRAVERSE_STREAM_JUNCTIONS: Namespacewalkflag = 16384

public val NSWF_FILESYSTEM_ONLY: Namespacewalkflag = 32

public val NSWF_FLAG_VIEWORDER: Namespacewalkflag = 128

public val NSWF_IGNORE_AUTOPLAY_HIDA: Namespacewalkflag = 256

public val NSWF_NONE_IMPLIES_ALL: Namespacewalkflag = 1

public val NSWF_ONE_IMPLIES_ALL: Namespacewalkflag = 2

public val NSWF_SHOW_PROGRESS: Namespacewalkflag = 64

public val NSWF_TRAVERSE_STREAM_JUNCTIONS: Namespacewalkflag = 16

public val NSWF_USE_TRANSFER_MEDIUM: Namespacewalkflag = 8192

public val NTSCS2_NEVERINSERTNONENUMERATED: Nstcstyle2 = 32

public val NTSCS2_NOSINGLETONAUTOEXPAND: Nstcstyle2 = 16

public val NT_CONSOLE_PROPS_SIG: UInt = 2684354562u

public val NT_FE_CONSOLE_PROPS_SIG: UInt = 2684354564u

public val NUM_POINTS: UInt = 3u

public val NWMF_FIRST: Nwmf = 4

public val NWMF_FORCETAB: Nwmf = 131072

public val NWMF_FORCEWINDOW: Nwmf = 65536

public val NWMF_FROMDIALOGCHILD: Nwmf = 64

public val NWMF_HTMLDIALOG: Nwmf = 32

public val NWMF_INACTIVETAB: Nwmf = 1048576

public val NWMF_OVERRIDEKEY: Nwmf = 8

public val NWMF_SHOWHELP: Nwmf = 16

public val NWMF_SUGGESTTAB: Nwmf = 524288

public val NWMF_SUGGESTWINDOW: Nwmf = 262144

public val NWMF_UNLOADING: Nwmf = 1

public val NWMF_USERALLOWED: Nwmf = 256

public val NWMF_USERINITED: Nwmf = 2

public val NWMF_USERREQUESTED: Nwmf = 128

public val NAMESPACE_TREE_CONTROL: Guid = Guid.fromU128(U128(0xae05421235354430uL, 0x83edd501aa6680e6uL))

public val NAMESPACE_WALKER: Guid = Guid.fromU128(U128(0x72eb61e086724303uL, 0x9175f2e4c68b2e7cuL))

public val NETWORK_CONNECTIONS: Guid = Guid.fromU128(U128(0x7007acc7320211d1uL, 0xaad200805fc1270euL))

public val NETWORK_EXPLORER_FOLDER: Guid = Guid.fromU128(U128(0xf02c1a0dbe214350uL, 0x88b07367fc96ef3cuL))

public val NETWORK_PLACES: Guid = Guid.fromU128(U128(0x208d2c603aea1069uL, 0xa2d708002b30309duL))

public val OAIF_ALLOW_REGISTRATION: OpenAsInfoFlags = 1

public val OAIF_EXEC: OpenAsInfoFlags = 4

public val OAIF_FILE_IS_URI: OpenAsInfoFlags = 128

public val OAIF_FORCE_REGISTRATION: OpenAsInfoFlags = 8

public val OAIF_HIDE_REGISTRATION: OpenAsInfoFlags = 32

public val OAIF_REGISTER_EXT: OpenAsInfoFlags = 2

public val OAIF_URL_PROTOCOL: OpenAsInfoFlags = 64

public val OFASI_EDIT: UInt = 1u

public val OFASI_OPENDESKTOP: UInt = 2u

public val OFFLINE_STATUS_INCOMPLETE: UInt = 4u

public val OFFLINE_STATUS_LOCAL: UInt = 1u

public val OFFLINE_STATUS_REMOTE: UInt = 2u

public val OFS_DIRTYCACHE: OfflineFolderStatus = 3

public val OFS_INACTIVE: OfflineFolderStatus = -1

public val OFS_OFFLINE: OfflineFolderStatus = 1

public val OFS_ONLINE: OfflineFolderStatus = 0

public val OFS_SERVERBACK: OfflineFolderStatus = 2

public val OF_CAP_CANCLOSE: UInt = 2u

public val OF_CAP_CANSWITCHTO: UInt = 1u

public val OI_ASYNC: UInt = 4294962926u

public val OI_DEFAULT: UInt = 0u

public val OPENPROPS_INHIBITPIF: UInt = 32768u

public val OPENPROPS_NONE: UInt = 0u

public val OPPROGDLG_ALLOWUNDO: Opprogdlgf = 256

public val OPPROGDLG_DEFAULT: Opprogdlgf = 0

public val OPPROGDLG_DONTDISPLAYDESTPATH: Opprogdlgf = 1024

public val OPPROGDLG_DONTDISPLAYLOCATIONS: Opprogdlgf = 4096

public val OPPROGDLG_DONTDISPLAYSOURCEPATH: Opprogdlgf = 512

public val OPPROGDLG_ENABLEPAUSE: Opprogdlgf = 128

public val OPPROGDLG_NOMULTIDAYESTIMATES: Opprogdlgf = 2048

public val OS_ADVSERVER: OS = 22u

public val OS_ANYSERVER: OS = 29u

public val OS_APPLIANCE: OS = 36u

public val OS_DATACENTER: OS = 21u

public val OS_DOMAINMEMBER: OS = 28u

public val OS_EMBEDDED: OS = 13u

public val OS_FASTUSERSWITCHING: OS = 26u

public val OS_HOME: OS = 19u

public val OS_MEDIACENTER: OS = 35u

public val OS_MEORGREATER: OS = 17u

public val OS_NT: OS = 1u

public val OS_NT4ORGREATER: OS = 3u

public val OS_PERSONALTERMINALSERVER: OS = 25u

public val OS_PROFESSIONAL: OS = 20u

public val OS_SERVER: OS = 23u

public val OS_SERVERADMINUI: OS = 34u

public val OS_SMALLBUSINESSSERVER: OS = 32u

public val OS_TABLETPC: OS = 33u

public val OS_TERMINALCLIENT: OS = 14u

public val OS_TERMINALREMOTEADMIN: OS = 15u

public val OS_TERMINALSERVER: OS = 24u

public val OS_WEBSERVER: OS = 31u

public val OS_WELCOMELOGONUI: OS = 27u

public val OS_WIN2000ADVSERVER: OS = 10u

public val OS_WIN2000DATACENTER: OS = 11u

public val OS_WIN2000ORGREATER: OS = 7u

public val OS_WIN2000PRO: OS = 8u

public val OS_WIN2000SERVER: OS = 9u

public val OS_WIN2000TERMINAL: OS = 12u

public val OS_WIN95ORGREATER: OS = 2u

public val OS_WIN95_GOLD: OS = 16u

public val OS_WIN98ORGREATER: OS = 5u

public val OS_WIN98_GOLD: OS = 6u

public val OS_WINDOWS: OS = 0u

public val OS_WOW6432: OS = 30u

public val OS_XPORGREATER: OS = 18u

public val ONEX_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x7aa0886cc8d4e19uL, 0xa4101c75af686e62uL))

public val ONEX_PLAP_SMARTCARD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x33c86cd6705f4ba1uL, 0x9adb67070b837775uL))

public val OPEN_CONTROL_PANEL: Guid = Guid.fromU128(U128(0x6622d8568564460uL, 0x8de1a81921b41c4buL))

public val PAI_ASSIGNEDTIME: Pubappinfoflags = 2

public val PAI_EXPIRETIME: Pubappinfoflags = 16

public val PAI_PUBLISHEDTIME: Pubappinfoflags = 4

public val PAI_SCHEDULEDTIME: Pubappinfoflags = 8

public val PAI_SOURCE: Pubappinfoflags = 1

public val PANE_NAVIGATION: UInt = 5u

public val PANE_NONE: UInt = 4294967295u

public val PANE_OFFLINE: UInt = 2u

public val PANE_PRINTER: UInt = 3u

public val PANE_PRIVACY: UInt = 7u

public val PANE_PROGRESS: UInt = 6u

public val PANE_SSL: UInt = 4u

public val PANE_ZONE: UInt = 1u

public val PATHCCH_ALLOW_LONG_PATHS: PathcchOptions = 1u

public val PATHCCH_CANONICALIZE_SLASHES: PathcchOptions = 64u

public val PATHCCH_DO_NOT_NORMALIZE_SEGMENTS: PathcchOptions = 8u

public val PATHCCH_ENSURE_IS_EXTENDED_LENGTH_PATH: PathcchOptions = 16u

public val PATHCCH_ENSURE_TRAILING_SLASH: PathcchOptions = 32u

public val PATHCCH_FORCE_DISABLE_LONG_NAME_PROCESS: PathcchOptions = 4u

public val PATHCCH_FORCE_ENABLE_LONG_NAME_PROCESS: PathcchOptions = 2u

public val PATHCCH_MAX_CCH: UInt = 32768u

public val PATHCCH_NONE: PathcchOptions = 0u

public val PCS_FATAL: PcsRet = 2147483648u

public val PCS_PATHTOOLONG: PcsRet = 8u

public val PCS_REMOVEDCHAR: PcsRet = 2u

public val PCS_REPLACEDCHAR: PcsRet = 1u

public val PCS_TRUNCATED: PcsRet = 4u

public val PDM_DEFAULT: Pdmode = 0

public val PDM_ERRORSBLOCKING: Pdmode = 8

public val PDM_INDETERMINATE: Pdmode = 16

public val PDM_PREFLIGHT: Pdmode = 2

public val PDM_RUN: Pdmode = 1

public val PDM_UNDOING: Pdmode = 4

public val PDTIMER_PAUSE: UInt = 2u

public val PDTIMER_RESET: UInt = 1u

public val PDTIMER_RESUME: UInt = 3u

public val PES_RUNNING: PackageExecutionState = 1

public val PES_SUSPENDED: PackageExecutionState = 3

public val PES_SUSPENDING: PackageExecutionState = 2

public val PES_TERMINATED: PackageExecutionState = 4

public val PES_UNKNOWN: PackageExecutionState = 0

public val PIDASI_AVG_DATA_RATE: UInt = 4u

public val PIDASI_CHANNEL_COUNT: UInt = 7u

public val PIDASI_COMPRESSION: UInt = 10u

public val PIDASI_FORMAT: UInt = 2u

public val PIDASI_SAMPLE_RATE: UInt = 5u

public val PIDASI_SAMPLE_SIZE: UInt = 6u

public val PIDASI_STREAM_NAME: UInt = 9u

public val PIDASI_STREAM_NUMBER: UInt = 8u

public val PIDASI_TIMELENGTH: UInt = 3u

public val PIDDRSI_DESCRIPTION: UInt = 3u

public val PIDDRSI_PLAYCOUNT: UInt = 4u

public val PIDDRSI_PLAYEXPIRES: UInt = 6u

public val PIDDRSI_PLAYSTARTS: UInt = 5u

public val PIDDRSI_PROTECTED: UInt = 2u

public val PIDISF_CACHEDSTICKY: PidisfFlags = 2

public val PIDISF_CACHEIMAGES: PidisfFlags = 16

public val PIDISF_FOLLOWALLLINKS: PidisfFlags = 32

public val PIDISF_RECENTLYCHANGED: PidisfFlags = 1

public val PIDISM_DONTWATCH: PidismOptions = 2

public val PIDISM_GLOBAL: PidismOptions = 0

public val PIDISM_WATCH: PidismOptions = 1

public val PIDISR_NEEDS_ADD: PidisrInfo = 1

public val PIDISR_NEEDS_DELETE: PidisrInfo = 3

public val PIDISR_NEEDS_UPDATE: PidisrInfo = 2

public val PIDISR_UP_TO_DATE: PidisrInfo = 0

public val PIDSI_ALBUM: UInt = 4u

public val PIDSI_ARTIST: UInt = 2u

public val PIDSI_COMMENT: UInt = 6u

public val PIDSI_GENRE: UInt = 11u

public val PIDSI_LYRICS: UInt = 12u

public val PIDSI_SONGTITLE: UInt = 3u

public val PIDSI_TRACK: UInt = 7u

public val PIDSI_YEAR: UInt = 5u

public val PIDVSI_COMPRESSION: UInt = 10u

public val PIDVSI_DATA_RATE: UInt = 8u

public val PIDVSI_FRAME_COUNT: UInt = 5u

public val PIDVSI_FRAME_HEIGHT: UInt = 4u

public val PIDVSI_FRAME_RATE: UInt = 6u

public val PIDVSI_FRAME_WIDTH: UInt = 3u

public val PIDVSI_SAMPLE_SIZE: UInt = 9u

public val PIDVSI_STREAM_NAME: UInt = 2u

public val PIDVSI_STREAM_NUMBER: UInt = 11u

public val PIDVSI_TIMELENGTH: UInt = 7u

public val PID_COMPUTERNAME: UInt = 5u

public val PID_CONTROLPANEL_CATEGORY: UInt = 2u

public val PID_DESCRIPTIONID: UInt = 2u

public val PID_DISPLACED_DATE: UInt = 3u

public val PID_DISPLACED_FROM: UInt = 2u

public val PID_DISPLAY_PROPERTIES: UInt = 0u

public val PID_FINDDATA: UInt = 0u

public val PID_HTMLINFOTIPFILE: UInt = 5u

public val PID_INTROTEXT: UInt = 1u

public val PID_INTSITE_AUTHOR: PidIntsite = 3

public val PID_INTSITE_CODEPAGE: PidIntsite = 18

public val PID_INTSITE_COMMENT: PidIntsite = 8

public val PID_INTSITE_CONTENTCODE: PidIntsite = 11

public val PID_INTSITE_CONTENTLEN: PidIntsite = 10

public val PID_INTSITE_DESCRIPTION: PidIntsite = 7

public val PID_INTSITE_FLAGS: PidIntsite = 9

public val PID_INTSITE_ICONFILE: PidIntsite = 21

public val PID_INTSITE_ICONINDEX: PidIntsite = 20

public val PID_INTSITE_LASTMOD: PidIntsite = 5

public val PID_INTSITE_LASTVISIT: PidIntsite = 4

public val PID_INTSITE_RECURSE: PidIntsite = 12

public val PID_INTSITE_ROAMED: PidIntsite = 34

public val PID_INTSITE_SUBSCRIPTION: PidIntsite = 14

public val PID_INTSITE_TITLE: PidIntsite = 16

public val PID_INTSITE_TRACKING: PidIntsite = 19

public val PID_INTSITE_URL: PidIntsite = 15

public val PID_INTSITE_VISITCOUNT: PidIntsite = 6

public val PID_INTSITE_WATCH: PidIntsite = 13

public val PID_INTSITE_WHATSNEW: PidIntsite = 2

public val PID_IS_AUTHOR: PidIs = 11

public val PID_IS_COMMENT: PidIs = 13

public val PID_IS_DESCRIPTION: PidIs = 12

public val PID_IS_HOTKEY: PidIs = 6

public val PID_IS_ICONFILE: PidIs = 9

public val PID_IS_ICONINDEX: PidIs = 8

public val PID_IS_NAME: PidIs = 4

public val PID_IS_ROAMED: PidIs = 15

public val PID_IS_SHOWCMD: PidIs = 7

public val PID_IS_URL: PidIs = 2

public val PID_IS_WHATSNEW: PidIs = 10

public val PID_IS_WORKINGDIR: PidIs = 5

public val PID_LINK_TARGET: UInt = 2u

public val PID_LINK_TARGET_TYPE: UInt = 3u

public val PID_MISC_ACCESSCOUNT: UInt = 3u

public val PID_MISC_OWNER: UInt = 4u

public val PID_MISC_PICS: UInt = 6u

public val PID_MISC_STATUS: UInt = 2u

public val PID_NETRESOURCE: UInt = 1u

public val PID_NETWORKLOCATION: UInt = 4u

public val PID_QUERY_RANK: UInt = 2u

public val PID_SHARE_CSC_STATUS: UInt = 2u

public val PID_SYNC_COPY_IN: UInt = 2u

public val PID_VOLUME_CAPACITY: UInt = 3u

public val PID_VOLUME_FILESYSTEM: UInt = 4u

public val PID_VOLUME_FREE: UInt = 2u

public val PID_WHICHFOLDER: UInt = 3u

public val PIFDEFFILESIZE: UInt = 80u

public val PIFDEFPATHSIZE: UInt = 64u

public val PIFMAXFILEPATH: UInt = 260u

public val PIFNAMESIZE: UInt = 30u

public val PIFPARAMSSIZE: UInt = 64u

public val PIFSHDATASIZE: UInt = 64u

public val PIFSHPROGSIZE: UInt = 64u

public val PIFSTARTLOCSIZE: UInt = 63u

public val PIN_LOGON_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0xcb82ea129f71446duL, 0x89e18d0924e1256euL))

public val PLATFORM_BROWSERONLY: UInt = 1u

public val PLATFORM_IE3: UInt = 1u

public val PLATFORM_INTEGRATED: UInt = 2u

public val PLATFORM_UNKNOWN: UInt = 0u

public val PMSF_DONT_STRIP_SPACES: UInt = 65536u

public val PMSF_MULTIPLE: UInt = 1u

public val PMSF_NORMAL: UInt = 0u

public val PO_DELETE: UInt = 19u

public val PO_PORTCHANGE: UInt = 32u

public val PO_RENAME: UInt = 20u

public val PO_REN_PORT: UInt = 52u

public val PPCF_ADDARGUMENTS: UInt = 3u

public val PPCF_ADDQUOTES: UInt = 1u

public val PPCF_FORCEQUALIFY: UInt = 64u

public val PPCF_LONGESTPOSSIBLE: UInt = 128u

public val PPCF_NODIRECTORIES: UInt = 16u

public val PRF_DONTFINDLNK: PrfFlags = 8

public val PRF_FIRSTDIRDEF: PrfFlags = 4

public val PRF_REQUIREABSOLUTE: PrfFlags = 16

public val PRF_TRYPROGRAMEXTENSIONS: PrfFlags = 3

public val PRF_VERIFYEXISTS: PrfFlags = 1

public val PRINTACTION_DOCUMENTDEFAULTS: UInt = 6u

public val PRINTACTION_NETINSTALL: UInt = 2u

public val PRINTACTION_NETINSTALLLINK: UInt = 3u

public val PRINTACTION_OPEN: UInt = 0u

public val PRINTACTION_OPENNETPRN: UInt = 5u

public val PRINTACTION_PROPERTIES: UInt = 1u

public val PRINTACTION_SERVERPROPERTIES: UInt = 7u

public val PRINTACTION_TESTPAGE: UInt = 4u

public val PRINT_PROP_FORCE_NAME: UInt = 1u

public val PROGDLG_AUTOTIME: UInt = 2u

public val PROGDLG_MARQUEEPROGRESS: UInt = 32u

public val PROGDLG_MODAL: UInt = 1u

public val PROGDLG_NOCANCEL: UInt = 64u

public val PROGDLG_NOMINIMIZE: UInt = 8u

public val PROGDLG_NOPROGRESSBAR: UInt = 16u

public val PROGDLG_NORMAL: UInt = 0u

public val PROGDLG_NOTIME: UInt = 4u

public val PROPSTR_EXTENSIONCOMPLETIONSTATE: Pcwstr = w("ExtensionCompletionState")

public val PROP_CONTRACT_DELEGATE: Pcwstr = w("ContractDelegate")

public val PSGUID_AUDIO: Guid = Guid.fromU128(U128(0x644404904c8b11d1uL, 0x8b70080036b11a03uL))

public val PSGUID_BRIEFCASE: Guid = Guid.fromU128(U128(0x328d8b2177294bfcuL, 0x954c902b329d56b0uL))

public val PSGUID_CONTROLPANEL: Guid = Guid.fromU128(U128(0x305ca226d286468euL, 0xb8482b2e8e697b74uL))

public val PSGUID_CUSTOMIMAGEPROPERTIES: Guid = Guid.fromU128(U128(0x7ecd8b0ec1364a9buL, 0x94114ebd6673ccc3uL))

public val PSGUID_DISPLACED: Guid = Guid.fromU128(U128(0x9b174b3340ff11d2uL, 0xa27e00c04fc30871uL))

public val PSGUID_DOCUMENTSUMMARYINFORMATION: Guid = Guid.fromU128(U128(0xd5cdd5022e9c101buL, 0x939708002b2cf9aeuL))

public val PSGUID_DRM: Guid = Guid.fromU128(U128(0xaeac19e489ae4508uL, 0xb9b7bb867abee2eduL))

public val PSGUID_IMAGEPROPERTIES: Guid = Guid.fromU128(U128(0x14b81da101354d31uL, 0x96d96cbfc9671a99uL))

public val PSGUID_IMAGESUMMARYINFORMATION: Guid = Guid.fromU128(U128(0x6444048f4c8b11d1uL, 0x8b70080036b11a03uL))

public val PSGUID_LIBRARYPROPERTIES: Guid = Guid.fromU128(U128(0x5d76b67f9b3d44bbuL, 0xb6ae25da4f638a67uL))

public val PSGUID_LINK: Guid = Guid.fromU128(U128(0xb9b4b3fc2b514a42uL, 0xb5d8324146afcf25uL))

public val PSGUID_MEDIAFILESUMMARYINFORMATION: Guid = Guid.fromU128(U128(0x644404924c8b11d1uL, 0x8b70080036b11a03uL))

public val PSGUID_MISC: Guid = Guid.fromU128(U128(0x9b174b3440ff11d2uL, 0xa27e00c04fc30871uL))

public val PSGUID_MUSIC: Guid = Guid.fromU128(U128(0x56a3372ece9c11d2uL, 0x9f0e006097c686f6uL))

public val PSGUID_QUERY_D: Guid = Guid.fromU128(U128(0x49691c907e17101auL, 0xa91c08002b2ecda9uL))

public val PSGUID_SHARE: Guid = Guid.fromU128(U128(0xd8c3986f813b449cuL, 0x845d87b95d674adeuL))

public val PSGUID_SHELLDETAILS: Guid = Guid.fromU128(U128(0x28636aa6953d11d2uL, 0xb5d600c04fd918d0uL))

public val PSGUID_SUMMARYINFORMATION: Guid = Guid.fromU128(U128(0xf29f85e04ff91068uL, 0xab9108002b27b3d9uL))

public val PSGUID_VIDEO: Guid = Guid.fromU128(U128(0x644404914c8b11d1uL, 0x8b70080036b11a03uL))

public val PSGUID_VOLUME: Guid = Guid.fromU128(U128(0x9b174b3540ff11d2uL, 0xa27e00c04fc30871uL))

public val PSGUID_WEBVIEW: Guid = Guid.fromU128(U128(0xf2275480f7824291uL, 0xbd94f13693513aecuL))

public val PACKAGE_DEBUG_SETTINGS: Guid = Guid.fromU128(U128(0xb1aec16f23834852uL, 0xb0e98f0b1dc66b4duL))

public val PASSWORD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x60b78e88ead8445cuL, 0x9cfd0b87f74ea6cduL))

public val PREVIOUS_VERSIONS: Guid = Guid.fromU128(U128(0x596ab062b4d24215uL, 0x9f74e9109b0a8153uL))

public val PROPERTIES_UI: Guid = Guid.fromU128(U128(0xd912f8cf03964915uL, 0x884efb425d32943buL))

public val PROTECTED_MODE_REDIRECT: NewProcessCauseConstants = 1

public val PUBLISH_DROP_TARGET: Guid = Guid.fromU128(U128(0xcc6eeffb43f646c5uL, 0x961951d571967f7duL))

public val PUBLISHING_WIZARD: Guid = Guid.fromU128(U128(0x6b33163c76a54b6cuL, 0xbf2145de9cd503a1uL))

public val QCMINFO_PLACE_AFTER: UInt = 1u

public val QCMINFO_PLACE_BEFORE: UInt = 0u

public val QIF_CACHED: QitipfFlags = 1

public val QIF_DONTEXPANDFOLDER: QitipfFlags = 2

public val QITIPF_DEFAULT: QitipfFlags = 0

public val QITIPF_LINKNOTARGET: QitipfFlags = 2

public val QITIPF_LINKUSETARGET: QitipfFlags = 4

public val QITIPF_SINGLELINE: QitipfFlags = 16

public val QITIPF_USENAME: QitipfFlags = 1

public val QITIPF_USESLOWTIP: QitipfFlags = 8

public val QUNS_ACCEPTS_NOTIFICATIONS: QueryUserNotificationState = 5

public val QUNS_APP: QueryUserNotificationState = 7

public val QUNS_BUSY: QueryUserNotificationState = 2

public val QUNS_NOT_PRESENT: QueryUserNotificationState = 1

public val QUNS_PRESENTATION_MODE: QueryUserNotificationState = 4

public val QUNS_QUIET_TIME: QueryUserNotificationState = 6

public val QUNS_RUNNING_D3D_FULL_SCREEN: QueryUserNotificationState = 3

public val QUERY_CANCEL_AUTO_PLAY: Guid = Guid.fromU128(U128(0x331f176805a94ddduL, 0xb86edae34ddc998auL))

public val RAS_PROVIDER: Guid = Guid.fromU128(U128(0x5537e283b1e74ef8uL, 0x9c6e7ab0afe5056duL))

public val REFRESH_COMPLETELY: RefreshConstants = 3

public val REFRESH_IFEXPIRED: RefreshConstants = 1

public val REFRESH_NORMAL: RefreshConstants = 0

public val REST_ALLOWBITBUCKDRIVES: Restrictions = 1073741905

public val REST_ALLOWCOMMENTTOGGLE: Restrictions = 1090519044

public val REST_ALLOWFILECLSIDJUNCTIONS: Restrictions = 1073741980

public val REST_ALLOWLEGACYWEBVIEW: Restrictions = 1073741955

public val REST_ALLOWUNHASHEDWEBVIEW: Restrictions = 1073741954

public val REST_ARP_DONTGROUPPATCHES: Restrictions = 1073741996

public val REST_ARP_NOADDPAGE: Restrictions = 1073741867

public val REST_ARP_NOARP: Restrictions = 1073741865

public val REST_ARP_NOCHOOSEPROGRAMSPAGE: Restrictions = 1073741997

public val REST_ARP_NOREMOVEPAGE: Restrictions = 1073741866

public val REST_ARP_NOWINSETUPPAGE: Restrictions = 1073741868

public val REST_ARP_SHOW_POST_SETUP: Restrictions = 1073741861

public val REST_BITBUCKCONFIRMDELETE: Restrictions = 1073741941

public val REST_BITBUCKNOPROP: Restrictions = 1073741942

public val REST_BITBUCKNUKEONDELETE: Restrictions = 1073741940

public val REST_CLASSICSHELL: Restrictions = 1073741832

public val REST_CLEARRECENTDOCSONEXIT: Restrictions = 1073741831

public val REST_DISALLOWCPL: Restrictions = 1073741889

public val REST_DISALLOWRUN: Restrictions = 1073741886

public val REST_DONTRETRYBADNETNAME: Restrictions = 1073741979

public val REST_DONTSHOWSUPERHIDDEN: Restrictions = 1073741879

public val REST_ENFORCESHELLEXTSECURITY: Restrictions = 1048576

public val REST_ENUMWORKGROUP: Restrictions = 1073741864

public val REST_FORCEACTIVEDESKTOPON: Restrictions = 1073741898

public val REST_FORCECOPYACLWITHFILE: Restrictions = 1073741851

public val REST_FORCESTARTMENULOGOFF: Restrictions = 1073741874

public val REST_GREYMSIADS: Restrictions = 1073741869

public val REST_HASFINDCOMPUTERS: Restrictions = 1073741858

public val REST_HIDECLOCK: Restrictions = 1073741936

public val REST_HIDERUNASVERB: Restrictions = 1073741948

public val REST_INHERITCONSOLEHANDLES: Restrictions = 1073741958

public val REST_INTELLIMENUS: Restrictions = 1073741859

public val REST_LINKRESOLVEIGNORELINKINFO: Restrictions = 2097152

public val REST_MYCOMPNOPROP: Restrictions = 1073741912

public val REST_MYDOCSNOPROP: Restrictions = 1073741913

public val REST_MYDOCSONNET: Restrictions = 262144

public val REST_MAX_RECENT_DOCS: Restrictions = 1073741872

public val REST_NOACTIVEDESKTOP: Restrictions = 1073741828

public val REST_NOACTIVEDESKTOPCHANGES: Restrictions = 1073741829

public val REST_NOADDDESKCOMP: Restrictions = 1073741843

public val REST_NOAUTOTRAYNOTIFY: Restrictions = 1073741909

public val REST_NOCDBURNING: Restrictions = 1073741911

public val REST_NOCHANGEMAPPEDDRIVECOMMENT: Restrictions = 1073741871

public val REST_NOCHANGEMAPPEDDRIVELABEL: Restrictions = 1073741870

public val REST_NOCHANGESTARMENU: Restrictions = 1073741856

public val REST_NOCHANGINGWALLPAPER: Restrictions = 1073741841

public val REST_NOCLOSE: Restrictions = 2

public val REST_NOCLOSEDESKCOMP: Restrictions = 1073741845

public val REST_NOCLOSE_DRAGDROPBAND: Restrictions = 1073741846

public val REST_NOCOLORCHOICE: Restrictions = 1073741919

public val REST_NOCOMMONGROUPS: Restrictions = 4194304

public val REST_NOCONTROLPANEL: Restrictions = 1073741863

public val REST_NOCONTROLPANELBARRICADE: Restrictions = 1073741907

public val REST_NOCSC: Restrictions = 1073741862

public val REST_NOCURRENTUSERRUN: Restrictions = 1073741895

public val REST_NOCURRENTUSERRUNONCE: Restrictions = 1073741897

public val REST_NOCUSTOMIZETHISFOLDER: Restrictions = 1073741876

public val REST_NOCUSTOMIZEWEBVIEW: Restrictions = 1073741833

public val REST_NODELDESKCOMP: Restrictions = 1073741844

public val REST_NODESKCOMP: Restrictions = 1073741842

public val REST_NODESKTOP: Restrictions = 64

public val REST_NODESKTOPCLEANUP: Restrictions = 1073741939

public val REST_NODISCONNECT: Restrictions = 1090519041

public val REST_NODISPBACKGROUND: Restrictions = 1073741943

public val REST_NODISPLAYAPPEARANCEPAGE: Restrictions = 1073741915

public val REST_NODISPLAYCPL: Restrictions = 1073741947

public val REST_NODISPSCREENSAVEPG: Restrictions = 1073741944

public val REST_NODISPSCREENSAVEPREVIEW: Restrictions = 1073741946

public val REST_NODISPSETTINGSPG: Restrictions = 1073741945

public val REST_NODRIVEAUTORUN: Restrictions = 512

public val REST_NODRIVES: Restrictions = 256

public val REST_NODRIVETYPEAUTORUN: Restrictions = 1024

public val REST_NOEDITDESKCOMP: Restrictions = 1073741848

public val REST_NOENCRYPTION: Restrictions = 1073741877

public val REST_NOENCRYPTONMOVE: Restrictions = 1073741893

public val REST_NOENTIRENETWORK: Restrictions = 1073741938

public val REST_NOENUMENTIRENETWORK: Restrictions = 1073741971

public val REST_NOEXITTODOS: Restrictions = 524288

public val REST_NOFAVORITESMENU: Restrictions = 1073741830

public val REST_NOFILEASSOCIATE: Restrictions = 1090519043

public val REST_NOFILEMENU: Restrictions = 8

public val REST_NOFIND: Restrictions = 128

public val REST_NOFOLDEROPTIONS: Restrictions = 1073741857

public val REST_NOFORGETSOFTWAREUPDATE: Restrictions = 1073741853

public val REST_NOHARDWARETAB: Restrictions = 1073741881

public val REST_NOHTMLWALLPAPER: Restrictions = 1073741840

public val REST_NOINTERNETICON: Restrictions = 1073741825

public val REST_NOINTERNETOPENWITH: Restrictions = 1073741973

public val REST_NOLOCALMACHINERUN: Restrictions = 1073741894

public val REST_NOLOCALMACHINERUNONCE: Restrictions = 1073741896

public val REST_NOLOWDISKSPACECHECKS: Restrictions = 1073741937

public val REST_NOMANAGEMYCOMPUTERVERB: Restrictions = 1073741884

public val REST_NOMOVINGBAND: Restrictions = 1073741847

public val REST_NOMYCOMPUTERICON: Restrictions = 1073741923

public val REST_NONE: Restrictions = 0

public val REST_NONETCONNECTDISCONNECT: Restrictions = 134217728

public val REST_NONETCRAWL: Restrictions = 1073741901

public val REST_NONETHOOD: Restrictions = 2048

public val REST_NONETWORKCONNECTIONS: Restrictions = 1073741873

public val REST_NONLEGACYSHELLMODE: Restrictions = 1073741906

public val REST_NOONLINEPRINTSWIZARD: Restrictions = 1073741952

public val REST_NOPRINTERADD: Restrictions = 65536

public val REST_NOPRINTERDELETE: Restrictions = 32768

public val REST_NOPRINTERTABS: Restrictions = 16384

public val REST_NOPUBLISHWIZARD: Restrictions = 1073741951

public val REST_NORECENTDOCSHISTORY: Restrictions = 1073741826

public val REST_NORECENTDOCSMENU: Restrictions = 1073741827

public val REST_NOREMOTECHANGENOTIFY: Restrictions = 1073741969

public val REST_NOREMOTERECURSIVEEVENTS: Restrictions = 1073741961

public val REST_NORESOLVESEARCH: Restrictions = 1073741849

public val REST_NORESOLVETRACK: Restrictions = 1073741850

public val REST_NORUN: Restrictions = 1

public val REST_NORUNASINSTALLPROMPT: Restrictions = 1073741882

public val REST_NOSAVESET: Restrictions = 4

public val REST_NOSECURITY: Restrictions = 1090519042

public val REST_NOSETACTIVEDESKTOP: Restrictions = 1073741854

public val REST_NOSETFOLDERS: Restrictions = 16

public val REST_NOSETTASKBAR: Restrictions = 32

public val REST_NOSETTINGSASSIST: Restrictions = 536870912

public val REST_NOSHAREDDOCUMENTS: Restrictions = 1073741902

public val REST_NOSHELLSEARCHBUTTON: Restrictions = 1073741880

public val REST_NOSIZECHOICE: Restrictions = 1073741918

public val REST_NOSMBALLOONTIP: Restrictions = 1073741890

public val REST_NOSMCONFIGUREPROGRAMS: Restrictions = 1073741935

public val REST_NOSMEJECTPC: Restrictions = 1073741927

public val REST_NOSMHELP: Restrictions = 1073741891

public val REST_NOSMMFUPROGRAMS: Restrictions = 1073741929

public val REST_NOSMMOREPROGRAMS: Restrictions = 1073741928

public val REST_NOSMMYDOCS: Restrictions = 1073741903

public val REST_NOSMMYMUSIC: Restrictions = 1073741926

public val REST_NOSMMYPICS: Restrictions = 1073741904

public val REST_NOSMNETWORKPLACES: Restrictions = 1073741924

public val REST_NOSMPINNEDLIST: Restrictions = 1073741925

public val REST_NOSTARTMENUSUBFOLDERS: Restrictions = 131072

public val REST_NOSTARTPAGE: Restrictions = 1073741908

public val REST_NOSTARTPANEL: Restrictions = 1073741914

public val REST_NOSTRCMPLOGICAL: Restrictions = 1073741950

public val REST_NOTASKGROUPING: Restrictions = 1073741910

public val REST_NOTHEMESTAB: Restrictions = 1073741916

public val REST_NOTHUMBNAILCACHE: Restrictions = 1073741949

public val REST_NOTOOLBARSONTASKBAR: Restrictions = 1073741931

public val REST_NOTRAYCONTEXTMENU: Restrictions = 33554432

public val REST_NOTRAYITEMSDISPLAY: Restrictions = 1073741930

public val REST_NOUPDATEWINDOWS: Restrictions = 1073741855

public val REST_NOUPNPINSTALL: Restrictions = 1073741981

public val REST_NOUSERNAMEINSTARTPANEL: Restrictions = 1073741922

public val REST_NOVIEWCONTEXTMENU: Restrictions = 67108864

public val REST_NOVIEWONDRIVE: Restrictions = 1073741900

public val REST_NOVISUALSTYLECHOICE: Restrictions = 1073741917

public val REST_NOWEB: Restrictions = 16777216

public val REST_NOWEBSERVICES: Restrictions = 1073741953

public val REST_NOWEBVIEW: Restrictions = 1073741875

public val REST_NOWELCOMESCREEN: Restrictions = 1073741887

public val REST_NOWINKEYS: Restrictions = 1073741892

public val REST_PROMPTRUNASINSTALLNETPATH: Restrictions = 1073741883

public val REST_RESTRICTCPL: Restrictions = 1073741888

public val REST_RESTRICTRUN: Restrictions = 8192

public val REST_REVERTWEBVIEWSECURITY: Restrictions = 1073741956

public val REST_RUNDLGMEMCHECKBOX: Restrictions = 1073741860

public val REST_SEPARATEDESKTOPPROCESS: Restrictions = 8388608

public val REST_SETVISUALSTYLE: Restrictions = 1073741920

public val REST_STARTBANNER: Restrictions = 4096

public val REST_STARTMENULOGOFF: Restrictions = 268435456

public val REST_STARTRUNNOHOMEPATH: Restrictions = 1073741921

public val RESIZE_THUMBNAIL: ThumbnailStreamCacheOptions = 2

public val RETURN_ONLY_IF_CACHED: ThumbnailStreamCacheOptions = 1

public val SBSC_HIDE: Shellbrowsershowcontrol = 0

public val SBSC_QUERY: Shellbrowsershowcontrol = 3

public val SBSC_SHOW: Shellbrowsershowcontrol = 1

public val SBSC_TOGGLE: Shellbrowsershowcontrol = 2

public val SBSP_ABSOLUTE: UInt = 0u

public val SBSP_ACTIVATE_NOFOCUS: UInt = 524288u

public val SBSP_ALLOW_AUTONAVIGATE: UInt = 65536u

public val SBSP_CALLERUNTRUSTED: UInt = 8388608u

public val SBSP_CREATENOHISTORY: UInt = 1048576u

public val SBSP_DEFBROWSER: UInt = 0u

public val SBSP_DEFMODE: UInt = 0u

public val SBSP_EXPLOREMODE: UInt = 32u

public val SBSP_FEEDNAVIGATION: UInt = 536870912u

public val SBSP_HELPMODE: UInt = 64u

public val SBSP_INITIATEDBYHLINKFRAME: UInt = 2147483648u

public val SBSP_KEEPSAMETEMPLATE: UInt = 131072u

public val SBSP_KEEPWORDWHEELTEXT: UInt = 262144u

public val SBSP_NAVIGATEBACK: UInt = 16384u

public val SBSP_NAVIGATEFORWARD: UInt = 32768u

public val SBSP_NEWBROWSER: UInt = 2u

public val SBSP_NOAUTOSELECT: UInt = 67108864u

public val SBSP_NOTRANSFERHIST: UInt = 128u

public val SBSP_OPENMODE: UInt = 16u

public val SBSP_PARENT: UInt = 8192u

public val SBSP_PLAYNOSOUND: UInt = 2097152u

public val SBSP_REDIRECT: UInt = 1073741824u

public val SBSP_RELATIVE: UInt = 4096u

public val SBSP_SAMEBROWSER: UInt = 1u

public val SBSP_TRUSTEDFORACTIVEX: UInt = 268435456u

public val SBSP_TRUSTFIRSTDOWNLOAD: UInt = 16777216u

public val SBSP_UNTRUSTEDFORDOWNLOAD: UInt = 33554432u

public val SBSP_WRITENOHISTORY: UInt = 134217728u

public val SCF_PHYSICAL: ScaleChangeFlags = 2

public val SCF_SCALE: ScaleChangeFlags = 1

public val SCF_VALUE_NONE: ScaleChangeFlags = 0

public val SCHEME_CREATE: UInt = 128u

public val SCHEME_DISPLAY: UInt = 1u

public val SCHEME_DONOTUSE: UInt = 64u

public val SCHEME_EDIT: UInt = 2u

public val SCHEME_GLOBAL: UInt = 8u

public val SCHEME_LOCAL: UInt = 4u

public val SCHEME_REFRESH: UInt = 16u

public val SCHEME_UPDATE: UInt = 32u

public val SCNRT_DISABLE: ScnrtStatus = 1

public val SCNRT_ENABLE: ScnrtStatus = 0

public val SCRM_VERIFYPW: UInt = 32768u

public val SECURELOCK_FIRSTSUGGEST: Securelockcode = 7

public val SECURELOCK_NOCHANGE: Securelockcode = -1

public val SECURELOCK_SET_FORTEZZA: Securelockcode = 5

public val SECURELOCK_SET_MIXED: Securelockcode = 1

public val SECURELOCK_SET_SECURE128BIT: Securelockcode = 6

public val SECURELOCK_SET_SECURE40BIT: Securelockcode = 3

public val SECURELOCK_SET_SECURE56BIT: Securelockcode = 4

public val SECURELOCK_SET_SECUREUNKNOWNBIT: Securelockcode = 2

public val SECURELOCK_SET_UNSECURE: Securelockcode = 0

public val SECURELOCK_SUGGEST_FORTEZZA: Securelockcode = 12

public val SECURELOCK_SUGGEST_MIXED: Securelockcode = 8

public val SECURELOCK_SUGGEST_SECURE128BIT: Securelockcode = 13

public val SECURELOCK_SUGGEST_SECURE40BIT: Securelockcode = 10

public val SECURELOCK_SUGGEST_SECURE56BIT: Securelockcode = 11

public val SECURELOCK_SUGGEST_SECUREUNKNOWNBIT: Securelockcode = 9

public val SECURELOCK_SUGGEST_UNSECURE: Securelockcode = 7

public val SEE_MASK_ASYNCOK: UInt = 1048576u

public val SEE_MASK_CLASSKEY: UInt = 3u

public val SEE_MASK_CLASSNAME: UInt = 1u

public val SEE_MASK_CONNECTNETDRV: UInt = 128u

public val SEE_MASK_DEFAULT: UInt = 0u

public val SEE_MASK_DOENVSUBST: UInt = 512u

public val SEE_MASK_FLAG_DDEWAIT: UInt = 256u

public val SEE_MASK_FLAG_HINST_IS_SITE: UInt = 134217728u

public val SEE_MASK_FLAG_LOG_USAGE: UInt = 67108864u

public val SEE_MASK_FLAG_NO_UI: UInt = 1024u

public val SEE_MASK_HMONITOR: UInt = 2097152u

public val SEE_MASK_HOTKEY: UInt = 32u

public val SEE_MASK_ICON: UInt = 16u

public val SEE_MASK_IDLIST: UInt = 4u

public val SEE_MASK_INVOKEIDLIST: UInt = 12u

public val SEE_MASK_NOASYNC: UInt = 256u

public val SEE_MASK_NOCLOSEPROCESS: UInt = 64u

public val SEE_MASK_NOQUERYCLASSSTORE: UInt = 16777216u

public val SEE_MASK_NOZONECHECKS: UInt = 8388608u

public val SEE_MASK_NO_CONSOLE: UInt = 32768u

public val SEE_MASK_UNICODE: UInt = 16384u

public val SEE_MASK_WAITFORINPUTIDLE: UInt = 33554432u

public val SETPROPS_NONE: UInt = 0u

public val SE_ERR_ACCESSDENIED: UInt = 5u

public val SE_ERR_ASSOCINCOMPLETE: UInt = 27u

public val SE_ERR_DDEBUSY: UInt = 30u

public val SE_ERR_DDEFAIL: UInt = 29u

public val SE_ERR_DDETIMEOUT: UInt = 28u

public val SE_ERR_DLLNOTFOUND: UInt = 32u

public val SE_ERR_FNF: UInt = 2u

public val SE_ERR_NOASSOC: UInt = 31u

public val SE_ERR_OOM: UInt = 8u

public val SE_ERR_PNF: UInt = 3u

public val SE_ERR_SHARE: UInt = 26u

public val SFBID_PIDLCHANGED: Int = 0

public val SFBS_FLAGS_ROUND_TO_NEAREST_DISPLAYED_DIGIT: SfbsFlags = 1

public val SFBS_FLAGS_TRUNCATE_UNDISPLAYED_DECIMAL_DIGITS: SfbsFlags = 2

public val SFVM_ADDOBJECT: UInt = 3u

public val SFVM_ADDPROPERTYPAGES: SfvmMessageId = 47

public val SFVM_BACKGROUNDENUM: SfvmMessageId = 32

public val SFVM_BACKGROUNDENUMDONE: SfvmMessageId = 48

public val SFVM_COLUMNCLICK: SfvmMessageId = 24

public val SFVM_DEFITEMCOUNT: SfvmMessageId = 26

public val SFVM_DEFVIEWMODE: SfvmMessageId = 27

public val SFVM_DIDDRAGDROP: SfvmMessageId = 36

public val SFVM_FSNOTIFY: SfvmMessageId = 14

public val SFVM_GETANIMATION: SfvmMessageId = 68

public val SFVM_GETBUTTONINFO: SfvmMessageId = 5

public val SFVM_GETBUTTONS: SfvmMessageId = 6

public val SFVM_GETDETAILSOF: SfvmMessageId = 23

public val SFVM_GETHELPTEXT: SfvmMessageId = 3

public val SFVM_GETHELPTOPIC: SfvmMessageId = 63

public val SFVM_GETNOTIFY: SfvmMessageId = 49

public val SFVM_GETPANE: SfvmMessageId = 59

public val SFVM_GETSELECTEDOBJECTS: UInt = 9u

public val SFVM_GETSORTDEFAULTS: SfvmMessageId = 53

public val SFVM_GETTOOLTIPTEXT: SfvmMessageId = 4

public val SFVM_GETZONE: SfvmMessageId = 58

public val SFVM_INITMENUPOPUP: SfvmMessageId = 7

public val SFVM_INVOKECOMMAND: SfvmMessageId = 2

public val SFVM_MERGEMENU: SfvmMessageId = 1

public val SFVM_QUERYFSNOTIFY: SfvmMessageId = 25

public val SFVM_REARRANGE: UInt = 1u

public val SFVM_REMOVEOBJECT: UInt = 6u

public val SFVM_SETCLIPBOARD: UInt = 16u

public val SFVM_SETISFV: SfvmMessageId = 39

public val SFVM_SETITEMPOS: UInt = 14u

public val SFVM_SETPOINTS: UInt = 23u

public val SFVM_SIZE: SfvmMessageId = 57

public val SFVM_THISIDLIST: SfvmMessageId = 41

public val SFVM_UNMERGEMENU: SfvmMessageId = 28

public val SFVM_UPDATEOBJECT: UInt = 7u

public val SFVM_UPDATESTATUSBAR: SfvmMessageId = 31

public val SFVM_WINDOWCREATED: SfvmMessageId = 15

public val SFVSOC_INVALIDATE_ALL: UInt = 1u

public val SFVSOC_NOSCROLL: UInt = 2u

public val SFVS_SELECT_ALLITEMS: SfvsSelect = 1

public val SFVS_SELECT_INVERT: SfvsSelect = 2

public val SFVS_SELECT_NONE: SfvsSelect = 0

public val SFVVO_DESKTOPHTML: ShellFolderViewOptions = 512

public val SFVVO_DOUBLECLICKINWEBVIEW: ShellFolderViewOptions = 128

public val SFVVO_SHOWALLOBJECTS: ShellFolderViewOptions = 1

public val SFVVO_SHOWCOMPCOLOR: ShellFolderViewOptions = 8

public val SFVVO_SHOWEXTENSIONS: ShellFolderViewOptions = 2

public val SFVVO_SHOWSYSFILES: ShellFolderViewOptions = 32

public val SFVVO_WIN95CLASSIC: ShellFolderViewOptions = 64

public val SHACF_AUTOAPPEND_FORCE_OFF: ShellAutocompleteFlags = 2147483648u

public val SHACF_AUTOAPPEND_FORCE_ON: ShellAutocompleteFlags = 1073741824u

public val SHACF_AUTOSUGGEST_FORCE_OFF: ShellAutocompleteFlags = 536870912u

public val SHACF_AUTOSUGGEST_FORCE_ON: ShellAutocompleteFlags = 268435456u

public val SHACF_DEFAULT: ShellAutocompleteFlags = 0u

public val SHACF_FILESYSTEM: ShellAutocompleteFlags = 1u

public val SHACF_FILESYS_DIRS: ShellAutocompleteFlags = 32u

public val SHACF_FILESYS_ONLY: ShellAutocompleteFlags = 16u

public val SHACF_URLALL: ShellAutocompleteFlags = 6u

public val SHACF_URLHISTORY: ShellAutocompleteFlags = 2u

public val SHACF_URLMRU: ShellAutocompleteFlags = 4u

public val SHACF_USETAB: ShellAutocompleteFlags = 8u

public val SHACF_VIRTUAL_NAMESPACE: ShellAutocompleteFlags = 64u

public val SHARD_APPIDINFO: Shard = 4

public val SHARD_APPIDINFOIDLIST: Shard = 5

public val SHARD_APPIDINFOLINK: Shard = 7

public val SHARD_LINK: Shard = 6

public val SHARD_PATHA: Shard = 2

public val SHARD_PATHW: Shard = 3

public val SHARD_PIDL: Shard = 1

public val SHARD_SHELLITEM: Shard = 8

public val SHARE_ROLE_CONTRIBUTOR: ShareRole = 1

public val SHARE_ROLE_CO_OWNER: ShareRole = 2

public val SHARE_ROLE_CUSTOM: ShareRole = 4

public val SHARE_ROLE_INVALID: ShareRole = -1

public val SHARE_ROLE_MIXED: ShareRole = 5

public val SHARE_ROLE_OWNER: ShareRole = 3

public val SHARE_ROLE_READER: ShareRole = 0

public val SHCDF_UPDATEITEM: UInt = 1u

public val SHCIDS_ALLFIELDS: Int = -2147483648.toInt()

public val SHCIDS_BITMASK: Int = -65536

public val SHCIDS_CANONICALONLY: Int = 268435456

public val SHCIDS_COLUMNMASK: Int = 65535

public val SHCNEE_MSI_CHANGE: Int = 4

public val SHCNEE_MSI_UNINSTALL: Int = 5

public val SHCNEE_ORDERCHANGED: Int = 2

public val SHCNE_ALLEVENTS: ShcneId = 2147483647u

public val SHCNE_ASSOCCHANGED: ShcneId = 134217728u

public val SHCNE_ATTRIBUTES: ShcneId = 2048u

public val SHCNE_CREATE: ShcneId = 2u

public val SHCNE_DELETE: ShcneId = 4u

public val SHCNE_DISKEVENTS: ShcneId = 145439u

public val SHCNE_DRIVEADD: ShcneId = 256u

public val SHCNE_DRIVEADDGUI: ShcneId = 65536u

public val SHCNE_DRIVEREMOVED: ShcneId = 128u

public val SHCNE_EXTENDED_EVENT: ShcneId = 67108864u

public val SHCNE_FREESPACE: ShcneId = 262144u

public val SHCNE_GLOBALEVENTS: ShcneId = 201687520u

public val SHCNE_INTERRUPT: ShcneId = 2147483648u

public val SHCNE_MEDIAINSERTED: ShcneId = 32u

public val SHCNE_MEDIAREMOVED: ShcneId = 64u

public val SHCNE_MKDIR: ShcneId = 8u

public val SHCNE_NETSHARE: ShcneId = 512u

public val SHCNE_NETUNSHARE: ShcneId = 1024u

public val SHCNE_RENAMEFOLDER: ShcneId = 131072u

public val SHCNE_RENAMEITEM: ShcneId = 1u

public val SHCNE_RMDIR: ShcneId = 16u

public val SHCNE_SERVERDISCONNECT: ShcneId = 16384u

public val SHCNE_UPDATEDIR: ShcneId = 4096u

public val SHCNE_UPDATEIMAGE: ShcneId = 32768u

public val SHCNE_UPDATEITEM: ShcneId = 8192u

public val SHCNF_DWORD: ShcnfFlags = 3u

public val SHCNF_FLUSH: ShcnfFlags = 4096u

public val SHCNF_FLUSHNOWAIT: ShcnfFlags = 12288u

public val SHCNF_IDLIST: ShcnfFlags = 0u

public val SHCNF_NOTIFYRECURSIVE: ShcnfFlags = 65536u

public val SHCNF_PATH: ShcnfFlags = 5u

public val SHCNF_PATHA: ShcnfFlags = 1u

public val SHCNF_PATHW: ShcnfFlags = 5u

public val SHCNF_PRINTER: ShcnfFlags = 6u

public val SHCNF_PRINTERA: ShcnfFlags = 2u

public val SHCNF_PRINTERW: ShcnfFlags = 6u

public val SHCNF_TYPE: ShcnfFlags = 255u

public val SHCNRF_INTERRUPT_LEVEL: ShcnrfSource = 1

public val SHCNRF_NEW_DELIVERY: ShcnrfSource = 32768

public val SHCNRF_RECURSIVE_INTERRUPT: ShcnrfSource = 4096

public val SHCNRF_SHELL_LEVEL: ShcnrfSource = 2

public val SHCONTF_CHECKING_FOR_CHILDREN: Shcontf = 16

public val SHCONTF_ENABLE_ASYNC: Shcontf = 32768

public val SHCONTF_FASTITEMS: Shcontf = 8192

public val SHCONTF_FLATLIST: Shcontf = 16384

public val SHCONTF_FOLDERS: Shcontf = 32

public val SHCONTF_INCLUDEHIDDEN: Shcontf = 128

public val SHCONTF_INCLUDESUPERHIDDEN: Shcontf = 65536

public val SHCONTF_INIT_ON_FIRST_NEXT: Shcontf = 256

public val SHCONTF_NAVIGATION_ENUM: Shcontf = 4096

public val SHCONTF_NETPRINTERSRCH: Shcontf = 512

public val SHCONTF_NONFOLDERS: Shcontf = 64

public val SHCONTF_SHAREABLE: Shcontf = 1024

public val SHCONTF_STORAGE: Shcontf = 2048

public val SHC_E_SHELL_COMPONENT_STARTUP_FAILURE: Hresult = 0x80270234u.toInt()

public val SHDID_COMPUTER_AUDIO: ShdidId = 19

public val SHDID_COMPUTER_CDROM: ShdidId = 10

public val SHDID_COMPUTER_DRIVE35: ShdidId = 5

public val SHDID_COMPUTER_DRIVE525: ShdidId = 6

public val SHDID_COMPUTER_FIXED: ShdidId = 8

public val SHDID_COMPUTER_IMAGING: ShdidId = 18

public val SHDID_COMPUTER_NETDRIVE: ShdidId = 9

public val SHDID_COMPUTER_OTHER: ShdidId = 12

public val SHDID_COMPUTER_RAMDISK: ShdidId = 11

public val SHDID_COMPUTER_REMOVABLE: ShdidId = 7

public val SHDID_COMPUTER_SHAREDDOCS: ShdidId = 20

public val SHDID_FS_DIRECTORY: ShdidId = 3

public val SHDID_FS_FILE: ShdidId = 2

public val SHDID_FS_OTHER: ShdidId = 4

public val SHDID_MOBILE_DEVICE: ShdidId = 21

public val SHDID_NET_DOMAIN: ShdidId = 13

public val SHDID_NET_OTHER: ShdidId = 17

public val SHDID_NET_RESTOFNET: ShdidId = 16

public val SHDID_NET_SERVER: ShdidId = 14

public val SHDID_NET_SHARE: ShdidId = 15

public val SHDID_REMOTE_DESKTOP_DRIVE: ShdidId = 22

public val SHDID_ROOT_REGITEM: ShdidId = 1

public val SHELLSTATEVERSION_IE4: UInt = 9u

public val SHELLSTATEVERSION_WIN2K: UInt = 10u

public val SHELL_E_WRONG_BITDEPTH: Hresult = 0x80270102u.toInt()

public val SHELL_UI_COMPONENT_DESKBAND: ShellUiComponent = 2

public val SHELL_UI_COMPONENT_NOTIFICATIONAREA: ShellUiComponent = 1

public val SHELL_UI_COMPONENT_TASKBARS: ShellUiComponent = 0

public val SHERB_NOCONFIRMATION: UInt = 1u

public val SHERB_NOPROGRESSUI: UInt = 2u

public val SHERB_NOSOUND: UInt = 4u

public val SHFMT_CANCEL: ShfmtRet = 4294967294u

public val SHFMT_ERROR: ShfmtRet = 4294967295u

public val SHFMT_ID_DEFAULT: ShfmtId = 65535u

public val SHFMT_NOFORMAT: ShfmtRet = 4294967293u

public val SHFMT_OPT_FULL: ShfmtOpt = 1

public val SHFMT_OPT_NONE: ShfmtOpt = 0

public val SHFMT_OPT_SYSONLY: ShfmtOpt = 2

public val SHGDFIL_DESCRIPTIONID: ShgdfilFormat = 3

public val SHGDFIL_FINDDATA: ShgdfilFormat = 1

public val SHGDFIL_NETRESOURCE: ShgdfilFormat = 2

public val SHGDN_FORADDRESSBAR: Shgdnf = 16384u

public val SHGDN_FOREDITING: Shgdnf = 4096u

public val SHGDN_FORPARSING: Shgdnf = 32768u

public val SHGDN_INFOLDER: Shgdnf = 1u

public val SHGDN_NORMAL: Shgdnf = 0u

public val SHGFI_ADDOVERLAYS: ShgfiFlags = 32u

public val SHGFI_ATTRIBUTES: ShgfiFlags = 2048u

public val SHGFI_ATTR_SPECIFIED: ShgfiFlags = 131072u

public val SHGFI_DISPLAYNAME: ShgfiFlags = 512u

public val SHGFI_EXETYPE: ShgfiFlags = 8192u

public val SHGFI_ICON: ShgfiFlags = 256u

public val SHGFI_ICONLOCATION: ShgfiFlags = 4096u

public val SHGFI_LARGEICON: ShgfiFlags = 0u

public val SHGFI_LINKOVERLAY: ShgfiFlags = 32768u

public val SHGFI_OPENICON: ShgfiFlags = 2u

public val SHGFI_OVERLAYINDEX: ShgfiFlags = 64u

public val SHGFI_PIDL: ShgfiFlags = 8u

public val SHGFI_SELECTED: ShgfiFlags = 65536u

public val SHGFI_SHELLICONSIZE: ShgfiFlags = 4u

public val SHGFI_SMALLICON: ShgfiFlags = 1u

public val SHGFI_SYSICONINDEX: ShgfiFlags = 16384u

public val SHGFI_TYPENAME: ShgfiFlags = 1024u

public val SHGFI_USEFILEATTRIBUTES: ShgfiFlags = 16u

public val SHGFP_TYPE_CURRENT: ShgfpType = 0

public val SHGFP_TYPE_DEFAULT: ShgfpType = 1

public val SHGNLI_NOLNK: ULong = 8uL

public val SHGNLI_NOLOCNAME: ULong = 16uL

public val SHGNLI_NOUNIQUE: ULong = 4uL

public val SHGNLI_PIDL: ULong = 1uL

public val SHGNLI_PREFIXNAME: ULong = 2uL

public val SHGNLI_USEURLEXT: ULong = 32uL

public val SHGSI_ICON: ShgsiFlags = 256u

public val SHGSI_ICONLOCATION: ShgsiFlags = 0u

public val SHGSI_LARGEICON: ShgsiFlags = 0u

public val SHGSI_LINKOVERLAY: ShgsiFlags = 32768u

public val SHGSI_SELECTED: ShgsiFlags = 65536u

public val SHGSI_SHELLICONSIZE: ShgsiFlags = 4u

public val SHGSI_SMALLICON: ShgsiFlags = 1u

public val SHGSI_SYSICONINDEX: ShgsiFlags = 16384u

public val SHGVSPB_ALLFOLDERS: UInt = 8u

public val SHGVSPB_ALLUSERS: UInt = 2u

public val SHGVSPB_INHERIT: UInt = 16u

public val SHGVSPB_NOAUTODEFAULTS: UInt = 2147483648u

public val SHGVSPB_PERFOLDER: UInt = 4u

public val SHGVSPB_PERUSER: UInt = 1u

public val SHGVSPB_ROAM: UInt = 32u

public val SHHLNF_NOAUTOSELECT: UInt = 67108864u

public val SHHLNF_WRITENOHISTORY: UInt = 134217728u

public val SHIL_EXTRALARGE: UInt = 2u

public val SHIL_JUMBO: UInt = 4u

public val SHIL_LARGE: UInt = 0u

public val SHIL_LAST: UInt = 4u

public val SHIL_SMALL: UInt = 1u

public val SHIL_SYSSMALL: UInt = 3u

public val SHIMGDEC_DEFAULT: UInt = 0u

public val SHIMGDEC_LOADFULL: UInt = 2u

public val SHIMGDEC_THUMBNAIL: UInt = 1u

public val SHIMGKEY_QUALITY: Pcwstr = w("Compression")

public val SHIMGKEY_RAWFORMAT: Pcwstr = w("RawDataFormat")

public val SHIMSTCAPFLAG_LOCKABLE: UInt = 1u

public val SHIMSTCAPFLAG_PURGEABLE: UInt = 2u

public val SHOP_FILEPATH: ShopType = 2

public val SHOP_PRINTERNAME: ShopType = 1

public val SHOP_VOLUMEGUID: ShopType = 4

public val SHPPFW_ASKDIRCREATE: UInt = 2u

public val SHPPFW_DIRCREATE: UInt = 1u

public val SHPPFW_IGNOREFILENAME: UInt = 4u

public val SHPPFW_MEDIACHECKONLY: UInt = 16u

public val SHPPFW_NONE: UInt = 0u

public val SHPPFW_NOWRITECHECK: UInt = 8u

public val SHPWHF_ANYLOCATION: UInt = 256u

public val SHPWHF_NOFILESELECTOR: UInt = 4u

public val SHPWHF_NONETPLACECREATE: UInt = 2u

public val SHPWHF_NORECOMPRESS: UInt = 1u

public val SHPWHF_USEMRU: UInt = 8u

public val SHPWHF_VALIDATEVIAWEBFOLDERS: UInt = 65536u

public val SHREGDEL_BOTH: ShregdelFlags = 17

public val SHREGDEL_DEFAULT: ShregdelFlags = 0

public val SHREGDEL_HKCU: ShregdelFlags = 1

public val SHREGDEL_HKLM: ShregdelFlags = 16

public val SHREGENUM_BOTH: ShregenumFlags = 17

public val SHREGENUM_DEFAULT: ShregenumFlags = 0

public val SHREGENUM_HKCU: ShregenumFlags = 1

public val SHREGENUM_HKLM: ShregenumFlags = 16

public val SHREGSET_FORCE_HKCU: UInt = 2u

public val SHREGSET_FORCE_HKLM: UInt = 8u

public val SHREGSET_HKCU: UInt = 1u

public val SHREGSET_HKLM: UInt = 4u

public val SIATTRIBFLAGS_ALLITEMS: Siattribflags = 16384

public val SIATTRIBFLAGS_AND: Siattribflags = 1

public val SIATTRIBFLAGS_APPCOMPAT: Siattribflags = 3

public val SIATTRIBFLAGS_MASK: Siattribflags = 3

public val SIATTRIBFLAGS_OR: Siattribflags = 2

public val SICHINT_ALLFIELDS: Sichintf = -2147483648.toInt()

public val SICHINT_CANONICAL: Sichintf = 268435456

public val SICHINT_DISPLAY: Sichintf = 0

public val SICHINT_TEST_FILESYSPATH_IF_NOT_EQUAL: Sichintf = 536870912

public val SID_COMMANDS_PROPERTY_BAG: Guid = Guid.fromU128(U128(0x6e0432504416485cuL, 0xb143e62a760d9fe5uL))

public val SID_CTX_QUERY_ASSOCIATIONS: Guid = Guid.fromU128(U128(0xfaadfc40b7774b69uL, 0xaa8177035ef0e6e8uL))

public val SID_DEF_VIEW: Guid = Guid.fromU128(U128(0x6d12fe80791111cfuL, 0x95340000c05bae0buL))

public val SID_LAUNCH_SOURCE_APP_USER_MODEL_ID: Guid = Guid.fromU128(U128(0x2ce7801074db48bcuL, 0x9c6a10f372495723uL))

public val SID_LAUNCH_SOURCE_VIEW_SIZE_PREFERENCE: Guid = Guid.fromU128(U128(0x8060549267d9414fuL, 0xaf89a1cdf1242bc1uL))

public val SID_LAUNCH_TARGET_VIEW_SIZE_PREFERENCE: Guid = Guid.fromU128(U128(0x26db2472b7b7406buL, 0x9702730a4e20d3bfuL))

public val SID_MENU_SHELL_FOLDER: Guid = Guid.fromU128(U128(0xa6c17eb42d6511d2uL, 0x838f00c04fd918d0uL))

public val SID_S_COMM_DLG_BROWSER: Guid = Guid.fromU128(U128(0x80f30233b7df11d2uL, 0xa33b006097df5bd4uL))

public val SID_S_COMMAND_BAR_STATE: Guid = Guid.fromU128(U128(0xb99eaa5c38504400uL, 0xbc332ce534048bf8uL))

public val SID_S_GET_VIEW_FROM_VIEW_DUAL: Guid = Guid.fromU128(U128(0x889a935d971e4b12uL, 0xb90c24dfc9e1e5e8uL))

public val SID_S_IN_PLACE_BROWSER: Guid = Guid.fromU128(U128(0x1d2ae02b365546ccuL, 0xb63a285988153bcauL))

public val SID_S_MENU_BAND_BK_CONTEXT_MENU: Guid = Guid.fromU128(U128(0x164bbd861d0d4de0uL, 0x9a3bd9729647c2b8uL))

public val SID_S_MENU_BAND_BOTTOM: Guid = Guid.fromU128(U128(0x743ca6640deb11d1uL, 0x982500c04fd91972uL))

public val SID_S_MENU_BAND_BOTTOM_SELECTED: Guid = Guid.fromU128(U128(0x165ebaf46d5111d2uL, 0x83ad00c04fd918d0uL))

public val SID_S_MENU_BAND_CHILD: Guid = Guid.fromU128(U128(0xed9cc02008b911d1uL, 0x982300c04fd91972uL))

public val SID_S_MENU_BAND_CONTEXT_MENU_MODIFIER: Guid = Guid.fromU128(U128(0x395458747162465euL, 0xb7832aa1874fef81uL))

public val SID_S_MENU_BAND_PARENT: Guid = Guid.fromU128(U128(0x8c278eec3eab11d1uL, 0x8cb000c04fd918d0uL))

public val SID_S_MENU_BAND_TOP: Guid = Guid.fromU128(U128(0x9493a810ec3811d0uL, 0xbc4600aa006ce2f5uL))

public val SID_S_MENU_POPUP: Guid = Guid.fromU128(U128(0xd1e7afeb6a2e11d0uL, 0x8c7800c04fd918b4uL))

public val SID_S_SEARCH_BOX_INFO: Guid = Guid.fromU128(U128(0x142daa61516b4713uL, 0xb49cfb985ef82998uL))

public val SID_S_TOP_LEVEL_BROWSER: Guid = Guid.fromU128(U128(0x4c96be40915c11cfuL, 0x99d300aa004ae837uL))

public val SID_S_TOP_WINDOW: Guid = Guid.fromU128(U128(0x49e1b500463611d3uL, 0x97f700c04f45d0b3uL))

public val SID_SHELL_EXECUTE_NAMED_PROPERTY_STORE: Guid = Guid.fromU128(U128(0xeb84ada200ff4992uL, 0x8324ed5ce061cb29uL))

public val SID_URL_EXECUTION_CONTEXT: Guid = Guid.fromU128(U128(0xfb5f8ebcbbb64d10uL, 0xa461777291a09030uL))

public val SIGDN_DESKTOPABSOLUTEEDITING: Sigdn = -2147172352

public val SIGDN_DESKTOPABSOLUTEPARSING: Sigdn = -2147319808

public val SIGDN_FILESYSPATH: Sigdn = -2147123200

public val SIGDN_NORMALDISPLAY: Sigdn = 0

public val SIGDN_PARENTRELATIVE: Sigdn = -2146959359

public val SIGDN_PARENTRELATIVEEDITING: Sigdn = -2147282943

public val SIGDN_PARENTRELATIVEFORADDRESSBAR: Sigdn = -2146975743

public val SIGDN_PARENTRELATIVEFORUI: Sigdn = -2146877439

public val SIGDN_PARENTRELATIVEPARSING: Sigdn = -2147385343

public val SIGDN_URL: Sigdn = -2147057664

public val SIID_APPLICATION: Shstockiconid = 2

public val SIID_AUDIOFILES: Shstockiconid = 71

public val SIID_AUTOLIST: Shstockiconid = 49

public val SIID_CLUSTEREDDRIVE: Shstockiconid = 140

public val SIID_DELETE: Shstockiconid = 84

public val SIID_DESKTOPPC: Shstockiconid = 94

public val SIID_DEVICEAUDIOPLAYER: Shstockiconid = 102

public val SIID_DEVICECAMERA: Shstockiconid = 100

public val SIID_DEVICECELLPHONE: Shstockiconid = 99

public val SIID_DEVICEVIDEOCAMERA: Shstockiconid = 101

public val SIID_DOCASSOC: Shstockiconid = 1

public val SIID_DOCNOASSOC: Shstockiconid = 0

public val SIID_DRIVE35: Shstockiconid = 6

public val SIID_DRIVE525: Shstockiconid = 5

public val SIID_DRIVEBD: Shstockiconid = 133

public val SIID_DRIVECD: Shstockiconid = 11

public val SIID_DRIVEDVD: Shstockiconid = 59

public val SIID_DRIVEFIXED: Shstockiconid = 8

public val SIID_DRIVEHDDVD: Shstockiconid = 132

public val SIID_DRIVENET: Shstockiconid = 9

public val SIID_DRIVENETDISABLED: Shstockiconid = 10

public val SIID_DRIVERAM: Shstockiconid = 12

public val SIID_DRIVEREMOVE: Shstockiconid = 7

public val SIID_DRIVEUNKNOWN: Shstockiconid = 58

public val SIID_ERROR: Shstockiconid = 80

public val SIID_FIND: Shstockiconid = 22

public val SIID_FOLDER: Shstockiconid = 3

public val SIID_FOLDERBACK: Shstockiconid = 75

public val SIID_FOLDERFRONT: Shstockiconid = 76

public val SIID_FOLDEROPEN: Shstockiconid = 4

public val SIID_HELP: Shstockiconid = 23

public val SIID_IMAGEFILES: Shstockiconid = 72

public val SIID_INFO: Shstockiconid = 79

public val SIID_INTERNET: Shstockiconid = 104

public val SIID_KEY: Shstockiconid = 81

public val SIID_LINK: Shstockiconid = 29

public val SIID_LOCK: Shstockiconid = 47

public val SIID_MAX_ICONS: Shstockiconid = 181

public val SIID_MEDIAAUDIODVD: Shstockiconid = 85

public val SIID_MEDIABDR: Shstockiconid = 138

public val SIID_MEDIABDRE: Shstockiconid = 139

public val SIID_MEDIABDROM: Shstockiconid = 137

public val SIID_MEDIABLANKCD: Shstockiconid = 69

public val SIID_MEDIABLURAY: Shstockiconid = 90

public val SIID_MEDIACDAUDIO: Shstockiconid = 40

public val SIID_MEDIACDAUDIOPLUS: Shstockiconid = 65

public val SIID_MEDIACDBURN: Shstockiconid = 68

public val SIID_MEDIACDR: Shstockiconid = 67

public val SIID_MEDIACDROM: Shstockiconid = 70

public val SIID_MEDIACDRW: Shstockiconid = 66

public val SIID_MEDIACOMPACTFLASH: Shstockiconid = 98

public val SIID_MEDIADVD: Shstockiconid = 60

public val SIID_MEDIADVDPLUSR: Shstockiconid = 92

public val SIID_MEDIADVDPLUSRW: Shstockiconid = 93

public val SIID_MEDIADVDR: Shstockiconid = 63

public val SIID_MEDIADVDRAM: Shstockiconid = 61

public val SIID_MEDIADVDROM: Shstockiconid = 64

public val SIID_MEDIADVDRW: Shstockiconid = 62

public val SIID_MEDIAENHANCEDCD: Shstockiconid = 87

public val SIID_MEDIAENHANCEDDVD: Shstockiconid = 88

public val SIID_MEDIAHDDVD: Shstockiconid = 89

public val SIID_MEDIAHDDVDR: Shstockiconid = 135

public val SIID_MEDIAHDDVDRAM: Shstockiconid = 136

public val SIID_MEDIAHDDVDROM: Shstockiconid = 134

public val SIID_MEDIAMOVIEDVD: Shstockiconid = 86

public val SIID_MEDIASMARTMEDIA: Shstockiconid = 97

public val SIID_MEDIASVCD: Shstockiconid = 56

public val SIID_MEDIAVCD: Shstockiconid = 91

public val SIID_MIXEDFILES: Shstockiconid = 74

public val SIID_MOBILEPC: Shstockiconid = 95

public val SIID_MYNETWORK: Shstockiconid = 17

public val SIID_NETWORKCONNECT: Shstockiconid = 103

public val SIID_PRINTER: Shstockiconid = 16

public val SIID_PRINTERFAX: Shstockiconid = 52

public val SIID_PRINTERFAXNET: Shstockiconid = 53

public val SIID_PRINTERFILE: Shstockiconid = 54

public val SIID_PRINTERNET: Shstockiconid = 50

public val SIID_RECYCLER: Shstockiconid = 31

public val SIID_RECYCLERFULL: Shstockiconid = 32

public val SIID_RENAME: Shstockiconid = 83

public val SIID_SERVER: Shstockiconid = 15

public val SIID_SERVERSHARE: Shstockiconid = 51

public val SIID_SETTINGS: Shstockiconid = 106

public val SIID_SHARE: Shstockiconid = 28

public val SIID_SHIELD: Shstockiconid = 77

public val SIID_SLOWFILE: Shstockiconid = 30

public val SIID_SOFTWARE: Shstockiconid = 82

public val SIID_STACK: Shstockiconid = 55

public val SIID_STUFFEDFOLDER: Shstockiconid = 57

public val SIID_USERS: Shstockiconid = 96

public val SIID_VIDEOFILES: Shstockiconid = 73

public val SIID_WARNING: Shstockiconid = 78

public val SIID_WORLD: Shstockiconid = 13

public val SIID_ZIPFILE: Shstockiconid = 105

public val SIIGBF_BIGGERSIZEOK: Siigbf = 1

public val SIIGBF_CROPTOSQUARE: Siigbf = 32

public val SIIGBF_ICONBACKGROUND: Siigbf = 128

public val SIIGBF_ICONONLY: Siigbf = 4

public val SIIGBF_INCACHEONLY: Siigbf = 16

public val SIIGBF_MEMORYONLY: Siigbf = 2

public val SIIGBF_RESIZETOFIT: Siigbf = 0

public val SIIGBF_SCALEUP: Siigbf = 256

public val SIIGBF_THUMBNAILONLY: Siigbf = 8
