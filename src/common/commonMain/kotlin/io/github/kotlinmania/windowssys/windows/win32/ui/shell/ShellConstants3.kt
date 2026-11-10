package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val SIIGBF_WIDETHUMBNAILS: Siigbf = 64

public val SIOM_ICONINDEX: UInt = 2u

public val SIOM_OVERLAYINDEX: UInt = 1u

public val SIOM_RESERVED_DEFAULT: UInt = 3u

public val SIOM_RESERVED_LINK: UInt = 1u

public val SIOM_RESERVED_SHARED: UInt = 0u

public val SIOM_RESERVED_SLOWFILE: UInt = 2u

public val SLDF_ALLOW_LINK_TO_LINK: ShellLinkDataFlags = 8388608

public val SLDF_DEFAULT: ShellLinkDataFlags = 0

public val SLDF_DISABLE_KNOWNFOLDER_RELATIVE_TRACKING: ShellLinkDataFlags = 2097152

public val SLDF_DISABLE_LINK_PATH_TRACKING: ShellLinkDataFlags = 1048576

public val SLDF_ENABLE_TARGET_METADATA: ShellLinkDataFlags = 524288

public val SLDF_FORCE_NO_LINKINFO: ShellLinkDataFlags = 256

public val SLDF_FORCE_NO_LINKTRACK: ShellLinkDataFlags = 262144

public val SLDF_FORCE_UNCNAME: ShellLinkDataFlags = 65536

public val SLDF_HAS_ARGS: ShellLinkDataFlags = 32

public val SLDF_HAS_DARWINID: ShellLinkDataFlags = 4096

public val SLDF_HAS_EXP_ICON_SZ: ShellLinkDataFlags = 16384

public val SLDF_HAS_EXP_SZ: ShellLinkDataFlags = 512

public val SLDF_HAS_ICONLOCATION: ShellLinkDataFlags = 64

public val SLDF_HAS_ID_LIST: ShellLinkDataFlags = 1

public val SLDF_HAS_LINK_INFO: ShellLinkDataFlags = 2

public val SLDF_HAS_NAME: ShellLinkDataFlags = 4

public val SLDF_HAS_RELPATH: ShellLinkDataFlags = 8

public val SLDF_HAS_WORKINGDIR: ShellLinkDataFlags = 16

public val SLDF_KEEP_LOCAL_IDLIST_FOR_UNC_TARGET: ShellLinkDataFlags = 67108864

public val SLDF_NO_KF_ALIAS: ShellLinkDataFlags = 4194304

public val SLDF_NO_PIDL_ALIAS: ShellLinkDataFlags = 32768

public val SLDF_PERSIST_VOLUME_ID_RELATIVE: ShellLinkDataFlags = 134217728

public val SLDF_PREFER_ENVIRONMENT_PATH: ShellLinkDataFlags = 33554432

public val SLDF_RESERVED: ShellLinkDataFlags = -2147483648.toInt()

public val SLDF_RUNAS_USER: ShellLinkDataFlags = 8192

public val SLDF_RUN_IN_SEPARATE: ShellLinkDataFlags = 1024

public val SLDF_RUN_WITH_SHIMLAYER: ShellLinkDataFlags = 131072

public val SLDF_UNALIAS_ON_SAVE: ShellLinkDataFlags = 16777216

public val SLDF_UNICODE: ShellLinkDataFlags = 128

public val SLDF_VALID: ShellLinkDataFlags = 268433407

public val SLGP_RAWPATH: SlgpFlags = 4

public val SLGP_RELATIVEPRIORITY: SlgpFlags = 8

public val SLGP_SHORTPATH: SlgpFlags = 1

public val SLGP_UNCPRIORITY: SlgpFlags = 2

public val SLR_ANY_MATCH: SlrFlags = 2

public val SLR_INVOKE_MSI: SlrFlags = 128

public val SLR_KNOWNFOLDER: SlrFlags = 1024

public val SLR_MACHINE_IN_LOCAL_TARGET: SlrFlags = 2048

public val SLR_NOLINKINFO: SlrFlags = 64

public val SLR_NONE: SlrFlags = 0

public val SLR_NOSEARCH: SlrFlags = 16

public val SLR_NOTRACK: SlrFlags = 32

public val SLR_NOUPDATE: SlrFlags = 8

public val SLR_NO_OBJECT_ID: SlrFlags = 8192

public val SLR_NO_UI: SlrFlags = 1

public val SLR_NO_UI_WITH_MSG_PUMP: SlrFlags = 257

public val SLR_OFFER_DELETE_WITHOUT_FILE: SlrFlags = 512

public val SLR_UPDATE: SlrFlags = 4

public val SLR_UPDATE_MACHINE_AND_SID: SlrFlags = 4096

public val SMAE_CONTRACTED: UInt = 2u

public val SMAE_EXPANDED: UInt = 1u

public val SMAE_USER: UInt = 4u

public val SMAE_VALID: UInt = 7u

public val SMC_AUTOEXPANDCHANGE: UInt = 66u

public val SMC_CHEVRONEXPAND: UInt = 25u

public val SMC_CHEVRONGETTIP: UInt = 47u

public val SMC_CREATE: UInt = 2u

public val SMC_DEFAULTICON: UInt = 22u

public val SMC_DEMOTE: UInt = 17u

public val SMC_DISPLAYCHEVRONTIP: UInt = 42u

public val SMC_EXITMENU: UInt = 3u

public val SMC_GETAUTOEXPANDSTATE: UInt = 65u

public val SMC_GETBKCONTEXTMENU: UInt = 68u

public val SMC_GETCONTEXTMENUMODIFIER: UInt = 67u

public val SMC_GETINFO: UInt = 5u

public val SMC_GETOBJECT: UInt = 7u

public val SMC_GETSFINFO: UInt = 6u

public val SMC_GETSFOBJECT: UInt = 8u

public val SMC_INITMENU: UInt = 1u

public val SMC_NEWITEM: UInt = 23u

public val SMC_OPEN: UInt = 69u

public val SMC_PROMOTE: UInt = 18u

public val SMC_REFRESH: UInt = 16u

public val SMC_SETSFOBJECT: UInt = 45u

public val SMC_SFDDRESTRICTED: UInt = 48u

public val SMC_SFEXEC: UInt = 9u

public val SMC_SFEXEC_MIDDLE: UInt = 49u

public val SMC_SFSELECTITEM: UInt = 10u

public val SMC_SHCHANGENOTIFY: UInt = 46u

public val SMDM_HMENU: UInt = 2u

public val SMDM_SHELLFOLDER: UInt = 1u

public val SMDM_TOOLBAR: UInt = 4u

public val SMIF_ACCELERATOR: Sminfoflags = 2

public val SMIF_ALTSTATE: Sminfoflags = 2048

public val SMIF_CHECKED: Sminfoflags = 32

public val SMIF_DEMOTED: Sminfoflags = 1024

public val SMIF_DISABLED: Sminfoflags = 256

public val SMIF_DRAGNDROP: Sminfoflags = 4096

public val SMIF_DROPCASCADE: Sminfoflags = 64

public val SMIF_DROPTARGET: Sminfoflags = 4

public val SMIF_HIDDEN: Sminfoflags = 128

public val SMIF_ICON: Sminfoflags = 1

public val SMIF_NEW: Sminfoflags = 8192

public val SMIF_SUBMENU: Sminfoflags = 8

public val SMIF_TRACKPOPUP: Sminfoflags = 512

public val SMIM_FLAGS: Sminfomask = 2

public val SMIM_ICON: Sminfomask = 4

public val SMIM_TYPE: Sminfomask = 1

public val SMINIT_AUTOEXPAND: UInt = 256u

public val SMINIT_AUTOTOOLTIP: UInt = 512u

public val SMINIT_CACHED: UInt = 16u

public val SMINIT_DEFAULT: UInt = 0u

public val SMINIT_DROPONCONTAINER: UInt = 1024u

public val SMINIT_HORIZONTAL: UInt = 536870912u

public val SMINIT_RESTRICT_DRAGDROP: UInt = 2u

public val SMINIT_TOPLEVEL: UInt = 4u

public val SMINIT_VERTICAL: UInt = 268435456u

public val SMINV_ID: UInt = 8u

public val SMINV_REFRESH: UInt = 1u

public val SMIT_SEPARATOR: Sminfotype = 1

public val SMIT_STRING: Sminfotype = 2

public val SMSET_BOTTOM: UInt = 536870912u

public val SMSET_DONTOWN: UInt = 1u

public val SMSET_TOP: UInt = 268435456u

public val SORT_ASCENDING: Sortdirection = 1

public val SORT_DESCENDING: Sortdirection = -1

public val SOT_DEFAULT: SortOrderType = 0

public val SOT_IGNORE_FOLDERNESS: SortOrderType = 1

public val SPACTION_APPLYINGATTRIBS: Spaction = 4

public val SPACTION_CALCULATING: Spaction = 7

public val SPACTION_COPYING: Spaction = 2

public val SPACTION_COPY_MOVING: Spaction = 13

public val SPACTION_DELETING: Spaction = 10

public val SPACTION_DOWNLOADING: Spaction = 5

public val SPACTION_FORMATTING: Spaction = 12

public val SPACTION_MOVING: Spaction = 1

public val SPACTION_NONE: Spaction = 0

public val SPACTION_RECYCLING: Spaction = 3

public val SPACTION_RENAMING: Spaction = 11

public val SPACTION_SEARCHING_FILES: Spaction = 9

public val SPACTION_SEARCHING_INTERNET: Spaction = 6

public val SPACTION_UPLOADING: Spaction = 8

public val SPBEGINF_AUTOTIME: Spbeginf = 2

public val SPBEGINF_MARQUEEPROGRESS: Spbeginf = 32

public val SPBEGINF_NOCANCELBUTTON: Spbeginf = 64

public val SPBEGINF_NOPROGRESSBAR: Spbeginf = 16

public val SPBEGINF_NORMAL: Spbeginf = 0

public val SPFF_CREATED_ON_THIS_DEVICE: StorageProviderFileFlags = 2

public val SPFF_DOWNLOAD_BY_DEFAULT: StorageProviderFileFlags = 1

public val SPFF_NONE: StorageProviderFileFlags = 0

public val SPINITF_MODAL: Spinitf = 1

public val SPINITF_NOMINIMIZE: Spinitf = 8

public val SPINITF_NORMAL: Spinitf = 0

public val SPMODE_BROWSER: UInt = 8u

public val SPMODE_DBMON: UInt = 8192u

public val SPMODE_DEBUGBREAK: UInt = 512u

public val SPMODE_DEBUGOUT: UInt = 2u

public val SPMODE_EVENT: UInt = 32u

public val SPMODE_EVENTTRACE: UInt = 32768u

public val SPMODE_FLUSH: UInt = 16u

public val SPMODE_FORMATTEXT: UInt = 128u

public val SPMODE_MEMWATCH: UInt = 4096u

public val SPMODE_MSGTRACE: UInt = 1024u

public val SPMODE_MSVM: UInt = 64u

public val SPMODE_MULTISTOP: UInt = 16384u

public val SPMODE_PERFTAGS: UInt = 2048u

public val SPMODE_PROFILE: UInt = 256u

public val SPMODE_SHELL: UInt = 1u

public val SPMODE_TEST: UInt = 4u

public val SPTEXT_ACTIONDESCRIPTION: Sptext = 1

public val SPTEXT_ACTIONDETAIL: Sptext = 2

public val SRRF_NOEXPAND: UInt = 268435456u

public val SRRF_NOVIRT: UInt = 1073741824u

public val SRRF_RM_ANY: UInt = 0u

public val SRRF_RM_NORMAL: UInt = 65536u

public val SRRF_RM_SAFE: UInt = 131072u

public val SRRF_RM_SAFENETWORK: UInt = 262144u

public val SRRF_RT_ANY: UInt = 65535u

public val SRRF_RT_REG_BINARY: UInt = 8u

public val SRRF_RT_REG_DWORD: UInt = 16u

public val SRRF_RT_REG_EXPAND_SZ: UInt = 4u

public val SRRF_RT_REG_MULTI_SZ: UInt = 32u

public val SRRF_RT_REG_NONE: UInt = 1u

public val SRRF_RT_REG_QWORD: UInt = 64u

public val SRRF_RT_REG_SZ: UInt = 2u

public val SRRF_ZEROONFAILURE: UInt = 536870912u

public val SSF_AUTOCHECKSELECT: SsfMask = 8388608u

public val SSF_DESKTOPHTML: SsfMask = 512u

public val SSF_DONTPRETTYPATH: SsfMask = 2048u

public val SSF_DOUBLECLICKINWEBVIEW: SsfMask = 128u

public val SSF_FILTER: SsfMask = 65536u

public val SSF_HIDDENFILEEXTS: SsfMask = 4u

public val SSF_HIDEICONS: SsfMask = 16384u

public val SSF_ICONSONLY: SsfMask = 16777216u

public val SSF_MAPNETDRVBUTTON: SsfMask = 4096u

public val SSF_NOCONFIRMRECYCLE: SsfMask = 32768u

public val SSF_NONETCRAWLING: SsfMask = 1048576u

public val SSF_SEPPROCESS: SsfMask = 524288u

public val SSF_SERVERADMINUI: SsfMask = 4u

public val SSF_SHOWALLOBJECTS: SsfMask = 1u

public val SSF_SHOWATTRIBCOL: SsfMask = 256u

public val SSF_SHOWCOMPCOLOR: SsfMask = 8u

public val SSF_SHOWEXTENSIONS: SsfMask = 2u

public val SSF_SHOWINFOTIP: SsfMask = 8192u

public val SSF_SHOWSTARTPAGE: SsfMask = 4194304u

public val SSF_SHOWSTATUSBAR: SsfMask = 67108864u

public val SSF_SHOWSUPERHIDDEN: SsfMask = 262144u

public val SSF_SHOWSYSFILES: SsfMask = 32u

public val SSF_SHOWTYPEOVERLAY: SsfMask = 33554432u

public val SSF_SORTCOLUMNS: SsfMask = 16u

public val SSF_STARTPANELON: SsfMask = 2097152u

public val SSF_WEBVIEW: SsfMask = 131072u

public val SSF_WIN95CLASSIC: SsfMask = 1024u

public val SSM_CLEAR: UInt = 0u

public val SSM_REFRESH: UInt = 2u

public val SSM_SET: UInt = 1u

public val SSM_UPDATE: UInt = 4u

public val STGOP_APPLYPROPERTIES: Stgop = 8

public val STGOP_COPY: Stgop = 2

public val STGOP_MOVE: Stgop = 1

public val STGOP_NEW: Stgop = 10

public val STGOP_REMOVE: Stgop = 5

public val STGOP_RENAME: Stgop = 6

public val STGOP_SYNC: Stgop = 3

public val STIF_DEFAULT: Int = 0

public val STIF_SUPPORT_HEX: Int = 1

public val STORE_E_NEWER_VERSION_AVAILABLE: Hresult = 0x80270104u.toInt()

public val STPF_NONE: Stpflag = 0

public val STPF_USEAPPPEEKALWAYS: Stpflag = 4

public val STPF_USEAPPPEEKWHENACTIVE: Stpflag = 8

public val STPF_USEAPPTHUMBNAILALWAYS: Stpflag = 1

public val STPF_USEAPPTHUMBNAILWHENACTIVE: Stpflag = 2

public val STR_AVOID_DRIVE_RESTRICTION_POLICY: Pcwstr = w("Avoid Drive Restriction Policy")

public val STR_BIND_DELEGATE_CREATE_OBJECT: Pcwstr = w("Delegate Object Creation")

public val STR_BIND_FOLDERS_READ_ONLY: Pcwstr = w("Folders As Read Only")

public val STR_BIND_FOLDER_ENUM_MODE: Pcwstr = w("Folder Enum Mode")

public val STR_BIND_FORCE_FOLDER_SHORTCUT_RESOLVE: Pcwstr = w("Force Folder Shortcut Resolve")

public val STR_DONT_PARSE_RELATIVE: Pcwstr = w("Don't Parse Relative")

public val STR_DONT_RESOLVE_LINK: Pcwstr = w("Don't Resolve Link")

public val STR_ENUM_ITEMS_FLAGS: Pcwstr = w("SHCONTF")

public val STR_FILE_SYS_BIND_DATA: Pcwstr = w("File System Bind Data")

public val STR_FILE_SYS_BIND_DATA_WIN7_FORMAT: Pcwstr = w("Win7FileSystemIdList")

public val STR_GET_ASYNC_HANDLER: Pcwstr = w("GetAsyncHandler")

public val STR_GPS_BESTEFFORT: Pcwstr = w("GPS_BESTEFFORT")

public val STR_GPS_DELAYCREATION: Pcwstr = w("GPS_DELAYCREATION")

public val STR_GPS_FASTPROPERTIESONLY: Pcwstr = w("GPS_FASTPROPERTIESONLY")

public val STR_GPS_HANDLERPROPERTIESONLY: Pcwstr = w("GPS_HANDLERPROPERTIESONLY")

public val STR_GPS_NO_OPLOCK: Pcwstr = w("GPS_NO_OPLOCK")

public val STR_GPS_OPENSLOWITEM: Pcwstr = w("GPS_OPENSLOWITEM")

public val STR_INTERNAL_NAVIGATE: Pcwstr = w("Internal Navigation")

public val STR_INTERNETFOLDER_PARSE_ONLY_URLMON_BINDABLE: Pcwstr = w("Validate URL")

public val STR_ITEM_CACHE_CONTEXT: Pcwstr = w("ItemCacheContext")

public val STR_MYDOCS_CLSID: Pcstr = s("{450D8FBA-AD25-11D0-98A8-0800361B1103}")

public val STR_NO_VALIDATE_FILENAME_CHARS: Pcwstr = w("NoValidateFilenameChars")

public val STR_PARSE_ALLOW_INTERNET_SHELL_FOLDERS: Pcwstr = w("Allow binding to Internet shell folder handlers and negate STR_PARSE_PREFER_WEB_BROWSING")

public val STR_PARSE_AND_CREATE_ITEM: Pcwstr = w("ParseAndCreateItem")

public val STR_PARSE_DONT_REQUIRE_VALIDATED_URLS: Pcwstr = w("Do not require validated URLs")

public val STR_PARSE_EXPLICIT_ASSOCIATION_SUCCESSFUL: Pcwstr = w("ExplicitAssociationSuccessful")

public val STR_PARSE_PARTIAL_IDLIST: Pcwstr = w("ParseOriginalItem")

public val STR_PARSE_PREFER_FOLDER_BROWSING: Pcwstr = w("Parse Prefer Folder Browsing")

public val STR_PARSE_PREFER_WEB_BROWSING: Pcwstr = w("Do not bind to Internet shell folder handlers")

public val STR_PARSE_PROPERTYSTORE: Pcwstr = w("DelegateNamedProperties")

public val STR_PARSE_SHELL_PROTOCOL_TO_FILE_OBJECTS: Pcwstr = w("Parse Shell Protocol To File Objects")

public val STR_PARSE_SHOW_NET_DIAGNOSTICS_UI: Pcwstr = w("Show network diagnostics UI")

public val STR_PARSE_SKIP_NET_CACHE: Pcwstr = w("Skip Net Resource Cache")

public val STR_PARSE_TRANSLATE_ALIASES: Pcwstr = w("Parse Translate Aliases")

public val STR_PARSE_WITH_EXPLICIT_ASSOCAPP: Pcwstr = w("ExplicitAssociationApp")

public val STR_PARSE_WITH_EXPLICIT_PROGID: Pcwstr = w("ExplicitProgid")

public val STR_PARSE_WITH_PROPERTIES: Pcwstr = w("ParseWithProperties")

public val STR_PROPERTYBAG_PARAM: Pcwstr = w("SHBindCtxPropertyBag")

public val STR_REFERRER_IDENTIFIER: Pcwstr = w("Referrer Identifier")

public val STR_SKIP_BINDING_CLSID: Pcwstr = w("Skip Binding CLSID")

public val STR_STORAGEITEM_CREATION_FLAGS: Pcwstr = w("SHGETSTORAGEITEM")

public val STR_TAB_REUSE_IDENTIFIER: Pcwstr = w("Tab Reuse Identifier")

public val STR_TRACK_CLSID: Pcwstr = w("Track the CLSID")

public val SV3CVW3_DEFAULT: Sv3cvw3Flags = 0

public val SV3CVW3_FORCEFOLDERFLAGS: Sv3cvw3Flags = 4

public val SV3CVW3_FORCEVIEWMODE: Sv3cvw3Flags = 2

public val SV3CVW3_NONINTERACTIVE: Sv3cvw3Flags = 1

public val SVGIO_ALLVIEW: Svgio = 2

public val SVGIO_BACKGROUND: Svgio = 0

public val SVGIO_CHECKED: Svgio = 3

public val SVGIO_FLAG_VIEWORDER: Svgio = -2147483648.toInt()

public val SVGIO_SELECTION: Svgio = 1

public val SVGIO_TYPE_MASK: Svgio = 15

public val SVSI_CHECK: Svsif = 256

public val SVSI_CHECK2: Svsif = 512

public val SVSI_DESELECT: Svsif = 0

public val SVSI_DESELECTOTHERS: Svsif = 4

public val SVSI_EDIT: Svsif = 3

public val SVSI_ENSUREVISIBLE: Svsif = 8

public val SVSI_FOCUSED: Svsif = 16

public val SVSI_KEYBOARDSELECT: Svsif = 1025

public val SVSI_NOTAKEFOCUS: Svsif = 1073741824

public val SVSI_POSITIONITEM: Svsif = 128

public val SVSI_SELECT: Svsif = 1

public val SVSI_SELECTIONMARK: Svsif = 64

public val SVSI_TRANSLATEPT: Svsif = 32

public val SVUIA_ACTIVATE_FOCUS: SvuiaStatus = 2

public val SVUIA_ACTIVATE_NOFOCUS: SvuiaStatus = 1

public val SVUIA_DEACTIVATE: SvuiaStatus = 0

public val SVUIA_INPLACEACTIVATE: SvuiaStatus = 3

public val SWC_3RDPARTY: ShellWindowTypeConstants = 2

public val SWC_BROWSER: ShellWindowTypeConstants = 1

public val SWC_CALLBACK: ShellWindowTypeConstants = 4

public val SWC_DESKTOP: ShellWindowTypeConstants = 8

public val SWC_EXPLORER: ShellWindowTypeConstants = 0

public val SWFO_COOKIEPASSED: ShellWindowFindWindowOptions = 4

public val SWFO_INCLUDEPENDING: ShellWindowFindWindowOptions = 2

public val SWFO_NEEDDISPATCH: ShellWindowFindWindowOptions = 1

public val SYNCMGRERRORFLAG_ENABLEJUMPTEXT: Syncmgrerrorflags = 1

public val SYNCMGRFLAG_CONNECT: Syncmgrflag = 1

public val SYNCMGRFLAG_EVENTMASK: Syncmgrflag = 255

public val SYNCMGRFLAG_IDLE: Syncmgrflag = 4

public val SYNCMGRFLAG_INVOKE: Syncmgrflag = 5

public val SYNCMGRFLAG_MANUAL: Syncmgrflag = 3

public val SYNCMGRFLAG_MAYBOTHERUSER: Syncmgrflag = 512

public val SYNCMGRFLAG_PENDINGDISCONNECT: Syncmgrflag = 2

public val SYNCMGRFLAG_SCHEDULED: Syncmgrflag = 6

public val SYNCMGRFLAG_SETTINGS: Syncmgrflag = 256

public val SYNCMGRHANDLERFLAG_MASK: UInt = 15u

public val SYNCMGRHANDLER_ALWAYSLISTHANDLER: Syncmgrhandlerflags = 4

public val SYNCMGRHANDLER_HASPROPERTIES: Syncmgrhandlerflags = 1

public val SYNCMGRHANDLER_HIDDEN: Syncmgrhandlerflags = 8

public val SYNCMGRHANDLER_MAYESTABLISHCONNECTION: Syncmgrhandlerflags = 2

public val SYNCMGRINVOKE_MINIMIZED: Syncmgrinvokeflags = 4

public val SYNCMGRINVOKE_STARTSYNC: Syncmgrinvokeflags = 2

public val SYNCMGRITEMSTATE_CHECKED: Syncmgritemstate = 1

public val SYNCMGRITEMSTATE_UNCHECKED: Syncmgritemstate = 0

public val SYNCMGRITEM_HASPROPERTIES: Syncmgritemflags = 1

public val SYNCMGRITEM_HIDDEN: Syncmgritemflags = 32

public val SYNCMGRITEM_ITEMFLAGMASK: UInt = 127u

public val SYNCMGRITEM_LASTUPDATETIME: Syncmgritemflags = 8

public val SYNCMGRITEM_MAYDELETEITEM: Syncmgritemflags = 16

public val SYNCMGRITEM_ROAMINGUSER: Syncmgritemflags = 4

public val SYNCMGRITEM_TEMPORARY: Syncmgritemflags = 2

public val SYNCMGRLOGERROR_ERRORFLAGS: UInt = 1u

public val SYNCMGRLOGERROR_ERRORID: UInt = 2u

public val SYNCMGRLOGERROR_ITEMID: UInt = 4u

public val SYNCMGRLOGLEVEL_ERROR: Syncmgrloglevel = 3

public val SYNCMGRLOGLEVEL_INFORMATION: Syncmgrloglevel = 1

public val SYNCMGRLOGLEVEL_LOGLEVELMAX: Syncmgrloglevel = 3

public val SYNCMGRLOGLEVEL_WARNING: Syncmgrloglevel = 2

public val SYNCMGRPROGRESSITEM_MAXVALUE: UInt = 8u

public val SYNCMGRPROGRESSITEM_PROGVALUE: UInt = 4u

public val SYNCMGRPROGRESSITEM_STATUSTEXT: UInt = 1u

public val SYNCMGRPROGRESSITEM_STATUSTYPE: UInt = 2u

public val SYNCMGRREGISTERFLAGS_MASK: UInt = 7u

public val SYNCMGRREGISTERFLAG_CONNECT: Syncmgrregisterflags = 1

public val SYNCMGRREGISTERFLAG_IDLE: Syncmgrregisterflags = 4

public val SYNCMGRREGISTERFLAG_PENDINGDISCONNECT: Syncmgrregisterflags = 2

public val SYNCMGRSTATUS_DELETED: Syncmgrstatus = 256

public val SYNCMGRSTATUS_FAILED: Syncmgrstatus = 5

public val SYNCMGRSTATUS_PAUSED: Syncmgrstatus = 6

public val SYNCMGRSTATUS_PENDING: Syncmgrstatus = 2

public val SYNCMGRSTATUS_RESUMING: Syncmgrstatus = 7

public val SYNCMGRSTATUS_SKIPPED: Syncmgrstatus = 1

public val SYNCMGRSTATUS_STOPPED: Syncmgrstatus = 0

public val SYNCMGRSTATUS_SUCCEEDED: Syncmgrstatus = 4

public val SYNCMGRSTATUS_UPDATING: Syncmgrstatus = 3

public val SYNCMGRSTATUS_UPDATING_INDETERMINATE: Syncmgrstatus = 8

public val SYNCMGR_CF_NONE: SyncmgrControlFlags = 0

public val SYNCMGR_CF_NOUI: SyncmgrControlFlags = 2

public val SYNCMGR_CF_NOWAIT: SyncmgrControlFlags = 0

public val SYNCMGR_CF_VALID: SyncmgrControlFlags = 3

public val SYNCMGR_CF_WAIT: SyncmgrControlFlags = 1

public val SYNCMGR_CIT_DELETED: SyncmgrConflictItemType = 2

public val SYNCMGR_CIT_UPDATED: SyncmgrConflictItemType = 1

public val SYNCMGR_CR_CANCEL_ALL: SyncmgrCancelRequest = 2

public val SYNCMGR_CR_CANCEL_ITEM: SyncmgrCancelRequest = 1

public val SYNCMGR_CR_MAX: SyncmgrCancelRequest = 2

public val SYNCMGR_CR_NONE: SyncmgrCancelRequest = 0

public val SYNCMGR_EF_NONE: SyncmgrEventFlags = 0

public val SYNCMGR_EF_VALID: SyncmgrEventFlags = 0

public val SYNCMGR_EL_ERROR: SyncmgrEventLevel = 3

public val SYNCMGR_EL_INFORMATION: SyncmgrEventLevel = 1

public val SYNCMGR_EL_MAX: SyncmgrEventLevel = 3

public val SYNCMGR_EL_WARNING: SyncmgrEventLevel = 2

public val SYNCMGR_HCM_CAN_BROWSE_CONTENT: SyncmgrHandlerCapabilities = 65536

public val SYNCMGR_HCM_CAN_SHOW_SCHEDULE: SyncmgrHandlerCapabilities = 131072

public val SYNCMGR_HCM_CONFLICT_STORE: SyncmgrHandlerCapabilities = 4

public val SYNCMGR_HCM_EVENT_STORE: SyncmgrHandlerCapabilities = 2

public val SYNCMGR_HCM_NONE: SyncmgrHandlerCapabilities = 0

public val SYNCMGR_HCM_PROVIDES_ICON: SyncmgrHandlerCapabilities = 1

public val SYNCMGR_HCM_QUERY_BEFORE_ACTIVATE: SyncmgrHandlerCapabilities = 1048576

public val SYNCMGR_HCM_QUERY_BEFORE_DEACTIVATE: SyncmgrHandlerCapabilities = 2097152

public val SYNCMGR_HCM_QUERY_BEFORE_DISABLE: SyncmgrHandlerCapabilities = 8388608

public val SYNCMGR_HCM_QUERY_BEFORE_ENABLE: SyncmgrHandlerCapabilities = 4194304

public val SYNCMGR_HCM_SUPPORTS_CONCURRENT_SESSIONS: SyncmgrHandlerCapabilities = 16

public val SYNCMGR_HCM_VALID_MASK: SyncmgrHandlerCapabilities = 15925271

public val SYNCMGR_HPM_BACKGROUND_SYNC_ONLY: SyncmgrHandlerPolicies = 48

public val SYNCMGR_HPM_DISABLE_BROWSE: SyncmgrHandlerPolicies = 4096

public val SYNCMGR_HPM_DISABLE_DISABLE: SyncmgrHandlerPolicies = 512

public val SYNCMGR_HPM_DISABLE_ENABLE: SyncmgrHandlerPolicies = 256

public val SYNCMGR_HPM_DISABLE_SCHEDULE: SyncmgrHandlerPolicies = 8192

public val SYNCMGR_HPM_DISABLE_START_SYNC: SyncmgrHandlerPolicies = 1024

public val SYNCMGR_HPM_DISABLE_STOP_SYNC: SyncmgrHandlerPolicies = 2048

public val SYNCMGR_HPM_HIDDEN_BY_DEFAULT: SyncmgrHandlerPolicies = 65536

public val SYNCMGR_HPM_NONE: SyncmgrHandlerPolicies = 0

public val SYNCMGR_HPM_PREVENT_ACTIVATE: SyncmgrHandlerPolicies = 1

public val SYNCMGR_HPM_PREVENT_DEACTIVATE: SyncmgrHandlerPolicies = 2

public val SYNCMGR_HPM_PREVENT_DISABLE: SyncmgrHandlerPolicies = 8

public val SYNCMGR_HPM_PREVENT_ENABLE: SyncmgrHandlerPolicies = 4

public val SYNCMGR_HPM_PREVENT_START_SYNC: SyncmgrHandlerPolicies = 16

public val SYNCMGR_HPM_PREVENT_STOP_SYNC: SyncmgrHandlerPolicies = 32

public val SYNCMGR_HPM_VALID_MASK: SyncmgrHandlerPolicies = 77631

public val SYNCMGR_HT_APPLICATION: SyncmgrHandlerType = 1

public val SYNCMGR_HT_COMPUTER: SyncmgrHandlerType = 5

public val SYNCMGR_HT_DEVICE: SyncmgrHandlerType = 2

public val SYNCMGR_HT_FOLDER: SyncmgrHandlerType = 3

public val SYNCMGR_HT_MAX: SyncmgrHandlerType = 5

public val SYNCMGR_HT_MIN: SyncmgrHandlerType = 0

public val SYNCMGR_HT_SERVICE: SyncmgrHandlerType = 4

public val SYNCMGR_HT_UNSPECIFIED: SyncmgrHandlerType = 0

public val SYNCMGR_ICM_CAN_BROWSE_CONTENT: SyncmgrItemCapabilities = 65536

public val SYNCMGR_ICM_CAN_DELETE: SyncmgrItemCapabilities = 16

public val SYNCMGR_ICM_CONFLICT_STORE: SyncmgrItemCapabilities = 4

public val SYNCMGR_ICM_EVENT_STORE: SyncmgrItemCapabilities = 2

public val SYNCMGR_ICM_NONE: SyncmgrItemCapabilities = 0

public val SYNCMGR_ICM_PROVIDES_ICON: SyncmgrItemCapabilities = 1

public val SYNCMGR_ICM_QUERY_BEFORE_DELETE: SyncmgrItemCapabilities = 4194304

public val SYNCMGR_ICM_QUERY_BEFORE_DISABLE: SyncmgrItemCapabilities = 2097152

public val SYNCMGR_ICM_QUERY_BEFORE_ENABLE: SyncmgrItemCapabilities = 1048576

public val SYNCMGR_ICM_VALID_MASK: SyncmgrItemCapabilities = 7405591

public val SYNCMGR_IPM_DISABLE_BROWSE: SyncmgrItemPolicies = 256

public val SYNCMGR_IPM_DISABLE_DELETE: SyncmgrItemPolicies = 512

public val SYNCMGR_IPM_DISABLE_DISABLE: SyncmgrItemPolicies = 32

public val SYNCMGR_IPM_DISABLE_ENABLE: SyncmgrItemPolicies = 16

public val SYNCMGR_IPM_DISABLE_START_SYNC: SyncmgrItemPolicies = 64

public val SYNCMGR_IPM_DISABLE_STOP_SYNC: SyncmgrItemPolicies = 128

public val SYNCMGR_IPM_HIDDEN_BY_DEFAULT: SyncmgrItemPolicies = 65536

public val SYNCMGR_IPM_NONE: SyncmgrItemPolicies = 0

public val SYNCMGR_IPM_PREVENT_DISABLE: SyncmgrItemPolicies = 2

public val SYNCMGR_IPM_PREVENT_ENABLE: SyncmgrItemPolicies = 1

public val SYNCMGR_IPM_PREVENT_START_SYNC: SyncmgrItemPolicies = 4

public val SYNCMGR_IPM_PREVENT_STOP_SYNC: SyncmgrItemPolicies = 8

public val SYNCMGR_IPM_VALID_MASK: SyncmgrItemPolicies = 66303

public val SYNCMGR_OBJECTID_BROWSE_CONTENT: Guid = Guid.fromU128(U128(0x57cbb584e9b447aeuL, 0xa120c4df3335dee2uL))

public val SYNCMGR_OBJECTID_CONFLICT_STORE: Guid = Guid.fromU128(U128(0xd78181f4238947e4uL, 0xa96060bcc2ed930buL))

public val SYNCMGR_OBJECTID_EVENT_LINK_CLICK: Guid = Guid.fromU128(U128(0x2203bdc11af14082uL, 0x8c3028399f41384cuL))

public val SYNCMGR_OBJECTID_EVENT_STORE: Guid = Guid.fromU128(U128(0x4bef34b9a7864075uL, 0xba880c2b9d89a98fuL))

public val SYNCMGR_OBJECTID_ICON: Guid = Guid.fromU128(U128(0x6dbc85c35d074c72uL, 0xa7777fec78072c06uL))

public val SYNCMGR_OBJECTID_QUERY_BEFORE_ACTIVATE: Guid = Guid.fromU128(U128(0xd882d80be7aa49eduL, 0x86b7e6e1f714cdfeuL))

public val SYNCMGR_OBJECTID_QUERY_BEFORE_DEACTIVATE: Guid = Guid.fromU128(U128(0xa0efc28260e0460euL, 0x9374ea88513cfc80uL))

public val SYNCMGR_OBJECTID_QUERY_BEFORE_DELETE: Guid = Guid.fromU128(U128(0xf76c3397afb345d7uL, 0xa59f5a49e905437euL))

public val SYNCMGR_OBJECTID_QUERY_BEFORE_DISABLE: Guid = Guid.fromU128(U128(0xbb5f64aaf0044eb5uL, 0x8e4d26751966344cuL))

public val SYNCMGR_OBJECTID_QUERY_BEFORE_ENABLE: Guid = Guid.fromU128(U128(0x4cbf7f05beb4de1uL, 0xbc90908345c480f6uL))

public val SYNCMGR_OBJECTID_SHOW_SCHEDULE: Guid = Guid.fromU128(U128(0xedc6f3e384414109uL, 0xadf36c1ca0b7de47uL))

public val SYNCMGR_PC_KEEP_MULTIPLE: SyncmgrPresenterChoice = 2

public val SYNCMGR_PC_KEEP_ONE: SyncmgrPresenterChoice = 1

public val SYNCMGR_PC_KEEP_RECENT: SyncmgrPresenterChoice = 3

public val SYNCMGR_PC_NO_CHOICE: SyncmgrPresenterChoice = 0

public val SYNCMGR_PC_REMOVE_FROM_SYNC_SET: SyncmgrPresenterChoice = 4

public val SYNCMGR_PC_SKIP: SyncmgrPresenterChoice = 5

public val SYNCMGR_PNS_CANCEL: SyncmgrPresenterNextStep = 2

public val SYNCMGR_PNS_CONTINUE: SyncmgrPresenterNextStep = 0

public val SYNCMGR_PNS_DEFAULT: SyncmgrPresenterNextStep = 1

public val SYNCMGR_PS_CANCELED: SyncmgrProgressStatus = 5

public val SYNCMGR_PS_DISCONNECTED: SyncmgrProgressStatus = 6

public val SYNCMGR_PS_FAILED: SyncmgrProgressStatus = 4

public val SYNCMGR_PS_MAX: SyncmgrProgressStatus = 6

public val SYNCMGR_PS_SUCCEEDED: SyncmgrProgressStatus = 3

public val SYNCMGR_PS_UPDATING: SyncmgrProgressStatus = 1

public val SYNCMGR_PS_UPDATING_INDETERMINATE: SyncmgrProgressStatus = 2

public val SYNCMGR_RA_KEEPOTHER: SyncmgrResolutionAbilities = 1

public val SYNCMGR_RA_KEEPRECENT: SyncmgrResolutionAbilities = 2

public val SYNCMGR_RA_KEEP_MULTIPLE: SyncmgrResolutionAbilities = 16

public val SYNCMGR_RA_KEEP_SINGLE: SyncmgrResolutionAbilities = 8

public val SYNCMGR_RA_REMOVEFROMSYNCSET: SyncmgrResolutionAbilities = 4

public val SYNCMGR_RA_VALID: SyncmgrResolutionAbilities = 31

public val SYNCMGR_RF_CANCEL: SyncmgrResolutionFeedback = 2

public val SYNCMGR_RF_CONTINUE: SyncmgrResolutionFeedback = 0

public val SYNCMGR_RF_REFRESH: SyncmgrResolutionFeedback = 1

public val SYNCMGR_SCF_IGNORE_IF_ALREADY_SYNCING: SyncmgrSyncControlFlags = 1

public val SYNCMGR_SCF_NONE: SyncmgrSyncControlFlags = 0

public val SYNCMGR_SCF_VALID: SyncmgrSyncControlFlags = 1

public val SYNCMGR_UR_ADDED: SyncmgrUpdateReason = 0

public val SYNCMGR_UR_CHANGED: SyncmgrUpdateReason = 1

public val SYNCMGR_UR_MAX: SyncmgrUpdateReason = 2

public val SYNCMGR_UR_REMOVED: SyncmgrUpdateReason = 2

public val SZ_CONTENTTYPE_CDF: Pcwstr = w("application/x-cdf")

public val SZ_CONTENTTYPE_CDFA: Pcstr = s("application/x-cdf")

public val SZ_CONTENTTYPE_CDFW: Pcwstr = w("application/x-cdf")

public val SZ_CONTENTTYPE_HTML: Pcwstr = w("text/html")

public val SZ_CONTENTTYPE_HTMLA: Pcstr = s("text/html")

public val SZ_CONTENTTYPE_HTMLW: Pcwstr = w("text/html")

public val S_SYNCMGR_CANCELALL: Hresult = 0x40204u.toInt()

public val S_SYNCMGR_CANCELITEM: Hresult = 0x40203u.toInt()

public val S_SYNCMGR_ENUMITEMS: Hresult = 0x40211u.toInt()

public val S_SYNCMGR_ITEMDELETED: Hresult = 0x40210u.toInt()

public val S_SYNCMGR_MISSINGITEMS: Hresult = 0x40201u.toInt()

public val S_SYNCMGR_RETRYSYNC: Hresult = 0x40202u.toInt()

public val SCHEDULED_TASKS: Guid = Guid.fromU128(U128(0xd62779904c6a11cfuL, 0x8d8700aa0060f5bfuL))

public val SEARCH_FOLDER_ITEM_FACTORY: Guid = Guid.fromU128(U128(0x14010e02bbbd41f0uL, 0x88e3eda371216584uL))

public val SELECTED_ITEM_COUNT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8fe316d20e52460auL, 0x9c1e48f273d470a3uL))

public val SHARED_BITMAP: Guid = Guid.fromU128(U128(0x4db2647667874046uL, 0xb836e8412a9e8a27uL))

public val SHARING_CONFIGURATION_MANAGER: Guid = Guid.fromU128(U128(0x49f371e18c5c4d9cuL, 0x9a3b54a6827f513cuL))

public val SHELL: Guid = Guid.fromU128(U128(0x13709620c27911ceuL, 0xa49e444553540000uL))

public val SHELL_BROWSER_WINDOW: Guid = Guid.fromU128(U128(0xc08afd90f2a111d1uL, 0x845500a0c91f3880uL))

public val SHELL_DESKTOP: Guid = Guid.fromU128(U128(0x2140000000000uL, 0xc000000000000046uL))

public val SHELL_DISPATCH_INPROC: Guid = Guid.fromU128(U128(0xa89a860d7b111ceuL, 0x8350444553540000uL))

public val SHELL_FS_FOLDER: Guid = Guid.fromU128(U128(0xf3364ba065b911ceuL, 0xa9ba00aa004ae837uL))

public val SHELL_FOLDER_ITEM: Guid = Guid.fromU128(U128(0x2fe352eafd1f11d2uL, 0xb1f400c04f8eeb3euL))

public val SHELL_FOLDER_VIEW: Guid = Guid.fromU128(U128(0x62112aa1ebe411cfuL, 0xa5fb0020afe7292duL))

public val SHELL_FOLDER_VIEW_OC: Guid = Guid.fromU128(U128(0x9ba05971f6a811cfuL, 0xa44200a0c90a8f39uL))

public val SHELL_IMAGE_DATA_FACTORY: Guid = Guid.fromU128(U128(0x66e4e4fbf3854dd0uL, 0x8d74a2efd1bc6178uL))

public val SHELL_ITEM: Guid = Guid.fromU128(U128(0x9ac9fbe1e0a24ad6uL, 0xb4eee212013ea917uL))

public val SHELL_LIBRARY: Guid = Guid.fromU128(U128(0xd9b3211de57f4426uL, 0xaaef30a806add397uL))

public val SHELL_LINK: Guid = Guid.fromU128(U128(0x2140100000000uL, 0xc000000000000046uL))

public val SHELL_LINK_OBJECT: Guid = Guid.fromU128(U128(0x11219420176811d1uL, 0x95be00609797ea4fuL))

public val SHELL_NAME_SPACE: Guid = Guid.fromU128(U128(0x55136805b2de11d1uL, 0xb9f200a0c98bc547uL))

public val SHELL_UI_HELPER: Guid = Guid.fromU128(U128(0x64ab4bb7111e11d1uL, 0x8f7900c04fc2fbe1uL))

public val SHELL_WINDOWS: Guid = Guid.fromU128(U128(0x9ba05972f6a811cfuL, 0xa44200a0c90a8f39uL))

public val SHOW_INPUT_PANE_ANIMATION_COORDINATOR: Guid = Guid.fromU128(U128(0x1f046abf32024dc1uL, 0x8cb53c67617ce1fauL))

public val SIMPLE_CONFLICT_PRESENTER: Guid = Guid.fromU128(U128(0x7a0f6ab7ed8446b6uL, 0xb47e02aa159a152buL))

public val SIZE_CATEGORIZER: Guid = Guid.fromU128(U128(0x55d7b852f6d142f2uL, 0xaa758728a1b2d264uL))

public val SMARTCARD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x8fd7e19c3bf7489buL, 0xa72c846ab3678c96uL))

public val SMARTCARD_PIN_PROVIDER: Guid = Guid.fromU128(U128(0x94596c7e374441ceuL, 0x893ebbf09122f76auL))

public val SMARTCARD_READER_SELECTION_PROVIDER: Guid = Guid.fromU128(U128(0x1b283861754f4022uL, 0xad47a5eaaa618894uL))

public val SMARTCARD_WIN_RT_PROVIDER: Guid = Guid.fromU128(U128(0x1ee7337f85ac45e2uL, 0xa23c37c753209769uL))

public val START_MENU_PIN: Guid = Guid.fromU128(U128(0xa2a9545da0c242b4uL, 0x9708a0b2badd77c8uL))

public val STORAGE_PROVIDER_BANNERS: Guid = Guid.fromU128(U128(0x7ccdf9f4e576455auL, 0x8bc7f6ec68d6f063uL))

public val SUSPENSION_DEPENDENCY_MANAGER: Guid = Guid.fromU128(U128(0x6b273fc561fd4918uL, 0x95a2c3b5e9d7f581uL))

public val SYNC_MGR: Guid = Guid.fromU128(U128(0x6295df2735ee11d1uL, 0x870700c04fd93327uL))

public val SYNC_MGR_CLIENT: Guid = Guid.fromU128(U128(0x1202db601dac42c5uL, 0xaed51abdd432248euL))

public val SYNC_MGR_CONTROL: Guid = Guid.fromU128(U128(0x1a1f420606884e7fuL, 0xbe03d82ec69df9a5uL))

public val SYNC_MGR_FOLDER: Guid = Guid.fromU128(U128(0x9c73f5e57ae74e32uL, 0xa8e88d23b85255bfuL))

public val SYNC_MGR_SCHEDULE_WIZARD: Guid = Guid.fromU128(U128(0x8d8b8e30c451421buL, 0x8553d2976afa648cuL))

public val SYNC_RESULTS_FOLDER: Guid = Guid.fromU128(U128(0x71d994643b6b475cuL, 0xb241e15883207529uL))

public val SYNC_SETUP_FOLDER: Guid = Guid.fromU128(U128(0x2e9e59c0b4374981uL, 0xa6479c34b9b90891uL))

public val TBIF_APPEND: UInt = 0u

public val TBIF_DEFAULT: UInt = 0u

public val TBIF_INTERNETBAR: UInt = 65536u

public val TBIF_NOTOOLBAR: UInt = 196608u

public val TBIF_PREPEND: UInt = 1u

public val TBIF_REPLACE: UInt = 2u

public val TBIF_STANDARDTOOLBAR: UInt = 131072u

public val TBPF_ERROR: Tbpflag = 4

public val TBPF_INDETERMINATE: Tbpflag = 1

public val TBPF_NOPROGRESS: Tbpflag = 0

public val TBPF_NORMAL: Tbpflag = 2

public val TBPF_PAUSED: Tbpflag = 8

public val THBF_DISABLED: Thumbbuttonflags = 1

public val THBF_DISMISSONCLICK: Thumbbuttonflags = 2

public val THBF_ENABLED: Thumbbuttonflags = 0

public val THBF_HIDDEN: Thumbbuttonflags = 8

public val THBF_NOBACKGROUND: Thumbbuttonflags = 4

public val THBF_NONINTERACTIVE: Thumbbuttonflags = 16

public val THBN_CLICKED: UInt = 6144u

public val THB_BITMAP: Thumbbuttonmask = 1

public val THB_FLAGS: Thumbbuttonmask = 8

public val THB_ICON: Thumbbuttonmask = 2

public val THB_TOOLTIP: Thumbbuttonmask = 4

public val TITLEBARNAMELEN: UInt = 40u

public val TI_BITMAP: TiFlags = 1

public val TI_JPEG: TiFlags = 2

public val TLEF_ABSOLUTE: Tlenumf = 49

public val TLEF_EXCLUDE_ABOUT_PAGES: Tlenumf = 256

public val TLEF_EXCLUDE_SUBFRAME_ENTRIES: Tlenumf = 128

public val TLEF_INCLUDE_UNINVOKEABLE: Tlenumf = 64

public val TLEF_RELATIVE_BACK: Tlenumf = 16

public val TLEF_RELATIVE_FORE: Tlenumf = 32

public val TLEF_RELATIVE_INCLUDE_CURRENT: Tlenumf = 1

public val TLMENUF_BACK: UInt = 16u

public val TLMENUF_FORE: UInt = 32u

public val TLMENUF_INCLUDECURRENT: UInt = 1u

public val TLOG_BACK: Int = -1

public val TLOG_CURRENT: UInt = 0u

public val TLOG_FORE: UInt = 1u

public val TRANSLATEURL_FL_GUESS_PROTOCOL: TranslateurlInFlags = 1

public val TRANSLATEURL_FL_USE_DEFAULT_PROTOCOL: TranslateurlInFlags = 2

public val TSF_ALLOW_DECRYPTION: TransferSourceFlags = 4

public val TSF_COPY_CREATION_TIME: TransferSourceFlags = 16

public val TSF_COPY_HARD_LINK: TransferSourceFlags = 256

public val TSF_COPY_LOCALIZED_NAME: TransferSourceFlags = 512

public val TSF_COPY_WRITE_TIME: TransferSourceFlags = 32

public val TSF_DELETE_RECYCLE_IF_POSSIBLE: TransferSourceFlags = 128

public val TSF_FAIL_EXIST: TransferSourceFlags = 0

public val TSF_MOVE_AS_COPY_DELETE: TransferSourceFlags = 1024

public val TSF_NORMAL: TransferSourceFlags = 0

public val TSF_NO_SECURITY: TransferSourceFlags = 8

public val TSF_OVERWRITE_EXIST: TransferSourceFlags = 2

public val TSF_RENAME_EXIST: TransferSourceFlags = 1

public val TSF_SUSPEND_SHELLEVENTS: TransferSourceFlags = 2048

public val TSF_USE_FULL_ACCESS: TransferSourceFlags = 64

public val TS_INDETERMINATE: TransferAdviseState = 4

public val TS_NONE: TransferAdviseState = 0

public val TS_PERFORMING: TransferAdviseState = 1

public val TS_PREPARING: TransferAdviseState = 2

public val TASKBAR_LIST: Guid = Guid.fromU128(U128(0x56fdf344fd6d11d0uL, 0x958a006097c9a090uL))

public val THUMBNAIL_STREAM_CACHE: Guid = Guid.fromU128(U128(0xcbe0fed34b914e90uL, 0x83548a8c84ec6872uL))

public val TIME_CATEGORIZER: Guid = Guid.fromU128(U128(0x3bb4118fddfd4d30uL, 0xa3489fb5d6bf1afeuL))

public val TRACK_SHELL_MENU: Guid = Guid.fromU128(U128(0x8278f9312a3e11d2uL, 0x838f00c04fd918d0uL))

public val TRAY_BAND_SITE_SERVICE: Guid = Guid.fromU128(U128(0xf60ad0a0e5e145cbuL, 0xb51ae15b9f8b2934uL))

public val TRAY_DESK_BAND: Guid = Guid.fromU128(U128(0xe64424376c684f52uL, 0x94dd2cfed267efb9uL))

public val URLASSOCDLG_FL_REGISTER_ASSOC: UrlassociationdialogInFlags = 2

public val URLASSOCDLG_FL_USE_DEFAULT_NAME: UrlassociationdialogInFlags = 1

public val URLIS_APPLIABLE: Urlis = 4

public val URLIS_DIRECTORY: Urlis = 5

public val URLIS_FILEURL: Urlis = 3

public val URLIS_HASQUERY: Urlis = 6

public val URLIS_NOHISTORY: Urlis = 2

public val URLIS_OPAQUE: Urlis = 1

public val URLIS_URL: Urlis = 0

public val URL_APPLY_DEFAULT: UInt = 1u

public val URL_APPLY_FORCEAPPLY: UInt = 8u

public val URL_APPLY_GUESSFILE: UInt = 4u

public val URL_APPLY_GUESSSCHEME: UInt = 2u

public val URL_BROWSER_MODE: UInt = 33554432u

public val URL_CONVERT_IF_DOSPATH: UInt = 2097152u

public val URL_DONT_ESCAPE_EXTRA_INFO: UInt = 33554432u

public val URL_DONT_SIMPLIFY: UInt = 134217728u

public val URL_DONT_UNESCAPE: UInt = 131072u

public val URL_DONT_UNESCAPE_EXTRA_INFO: UInt = 33554432u

public val URL_ESCAPE_ASCII_URI_COMPONENT: UInt = 524288u

public val URL_ESCAPE_AS_UTF8: UInt = 262144u

public val URL_ESCAPE_PERCENT: UInt = 4096u

public val URL_ESCAPE_SEGMENT_ONLY: UInt = 8192u

public val URL_ESCAPE_SPACES_ONLY: UInt = 67108864u

public val URL_ESCAPE_UNSAFE: UInt = 536870912u

public val URL_E_INVALID_SYNTAX: Hresult = 0x80041001u.toInt()

public val URL_E_UNREGISTERED_PROTOCOL: Hresult = 0x80041002u.toInt()

public val URL_FILE_USE_PATHURL: UInt = 65536u

public val URL_INTERNAL_PATH: UInt = 8388608u

public val URL_NO_META: UInt = 134217728u

public val URL_PARTFLAG_KEEPSCHEME: UInt = 1u

public val URL_PART_HOSTNAME: UrlPart = 2

public val URL_PART_NONE: UrlPart = 0

public val URL_PART_PASSWORD: UrlPart = 4

public val URL_PART_PORT: UrlPart = 5

public val URL_PART_QUERY: UrlPart = 6

public val URL_PART_SCHEME: UrlPart = 1

public val URL_PART_USERNAME: UrlPart = 3

public val URL_PLUGGABLE_PROTOCOL: UInt = 1073741824u

public val URL_SCHEME_ABOUT: UrlScheme = 17

public val URL_SCHEME_FILE: UrlScheme = 9

public val URL_SCHEME_FTP: UrlScheme = 1

public val URL_SCHEME_GOPHER: UrlScheme = 3

public val URL_SCHEME_HTTP: UrlScheme = 2

public val URL_SCHEME_HTTPS: UrlScheme = 11

public val URL_SCHEME_INVALID: UrlScheme = -1

public val URL_SCHEME_JAVASCRIPT: UrlScheme = 15

public val URL_SCHEME_KNOWNFOLDER: UrlScheme = 26

public val URL_SCHEME_LOCAL: UrlScheme = 14

public val URL_SCHEME_MAILTO: UrlScheme = 4

public val URL_SCHEME_MAXVALUE: UrlScheme = 27

public val URL_SCHEME_MK: UrlScheme = 10

public val URL_SCHEME_MSHELP: UrlScheme = 21

public val URL_SCHEME_MSSHELLDEVICE: UrlScheme = 22

public val URL_SCHEME_MSSHELLIDLIST: UrlScheme = 20

public val URL_SCHEME_MSSHELLROOTED: UrlScheme = 19

public val URL_SCHEME_NEWS: UrlScheme = 5

public val URL_SCHEME_NNTP: UrlScheme = 6

public val URL_SCHEME_RES: UrlScheme = 18

public val URL_SCHEME_SEARCH: UrlScheme = 25

public val URL_SCHEME_SEARCH_MS: UrlScheme = 24

public val URL_SCHEME_SHELL: UrlScheme = 12

public val URL_SCHEME_SNEWS: UrlScheme = 13

public val URL_SCHEME_TELNET: UrlScheme = 7

public val URL_SCHEME_UNKNOWN: UrlScheme = 0

public val URL_SCHEME_VBSCRIPT: UrlScheme = 16

public val URL_SCHEME_WAIS: UrlScheme = 8

public val URL_SCHEME_WILDCARD: UrlScheme = 23

public val URL_UNESCAPE: UInt = 268435456u

public val URL_UNESCAPE_AS_UTF8: UInt = 262144u

public val URL_UNESCAPE_HIGH_ANSI_ONLY: UInt = 4194304u

public val URL_UNESCAPE_INPLACE: UInt = 1048576u

public val URL_UNESCAPE_URI_COMPONENT: UInt = 262144u

public val URL_WININET_COMPATIBILITY: UInt = 2147483648u

public val UR_MONITOR_DISCONNECT: UndockReason = 1

public val UR_RESOLUTION_CHANGE: UndockReason = 0

public val USER_NOTIFICATION: Guid = Guid.fromU128(U128(0x10890e8789413cuL, 0xadbc48f5b511b3afuL))

public val V1PASSWORD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x6f45dc1e5384457auL, 0xbc132cd81b0d28eduL))

public val V1SMARTCARD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x8bf9a910a8ff457fuL, 0x999fa5ca10b4a885uL))

public val V1WIN_BIO_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0xac3ac249e8204343uL, 0xa65b377ac634dc09uL))

public val VALIDATEUNC_CONNECT: ValidateuncOption = 1

public val VALIDATEUNC_NOUI: ValidateuncOption = 2

public val VALIDATEUNC_PERSIST: ValidateuncOption = 8

public val VALIDATEUNC_PRINT: ValidateuncOption = 4

public val VALIDATEUNC_VALID: ValidateuncOption = 15

public val VID_CONTENT: Guid = Guid.fromU128(U128(0x30c2c43408894c8duL, 0x985da9f71830b0a9uL))

public val VID_DETAILS: Guid = Guid.fromU128(U128(0x137e7700357311cfuL, 0xae6908002b2e1262uL))

public val VID_LARGE_ICONS: Guid = Guid.fromU128(U128(0x57d0e0357311cfuL, 0xae6908002b2e1262uL))

public val VID_LIST: Guid = Guid.fromU128(U128(0xe1fa5e0357311cfuL, 0xae6908002b2e1262uL))

public val VID_SMALL_ICONS: Guid = Guid.fromU128(U128(0x89000c0357311cfuL, 0xae6908002b2e1262uL))

public val VID_THUMB_STRIP: Guid = Guid.fromU128(U128(0x8eefa624d1e9445buL, 0x94b774fbce2ea11auL))

public val VID_THUMBNAILS: Guid = Guid.fromU128(U128(0x8bebb29052d011d0uL, 0xb7f400c04fd706ecuL))

public val VID_TILE: Guid = Guid.fromU128(U128(0x65f125e57be14810uL, 0xba9dd271c8432ce3uL))

public val VIEW_PRIORITY_CACHEHIT: UInt = 80u

public val VIEW_PRIORITY_CACHEMISS: UInt = 48u

public val VIEW_PRIORITY_DESPERATE: UInt = 16u

public val VIEW_PRIORITY_INHERIT: UInt = 32u

public val VIEW_PRIORITY_NONE: UInt = 0u

public val VIEW_PRIORITY_RESTRICTED: UInt = 112u

public val VIEW_PRIORITY_SHELLEXT: UInt = 64u

public val VIEW_PRIORITY_SHELLEXT_ASBACKUP: UInt = 21u

public val VIEW_PRIORITY_STALECACHEHIT: UInt = 69u

public val VIEW_PRIORITY_USEASDEFAULT: UInt = 67u

public val VOLUME_PREFIX: Pcwstr = w("\\\\?\\Volume")

public val VPCF_BACKGROUND: Vpcolorflags = 2

public val VPCF_SORTCOLUMN: Vpcolorflags = 3

public val VPCF_SUBTEXT: Vpcolorflags = 4

public val VPCF_TEXT: Vpcolorflags = 1

public val VPCF_TEXTBACKGROUND: Vpcolorflags = 5

public val VPWF_ALPHABLEND: Vpwatermarkflags = 1

public val VPWF_DEFAULT: Vpwatermarkflags = 0

public val VAULT_PROVIDER: Guid = Guid.fromU128(U128(0x503739d04c5e4cfduL, 0xb3bad881334f0df2uL))

public val VIRTUAL_DESKTOP_MANAGER: Guid = Guid.fromU128(U128(0xaa5090865ca94c25uL, 0x8f95589d3c07b48auL))

public val WC_NETADDRESS: Pcwstr = w("msctls_netaddress")

public val WM_CPL_LAUNCH: UInt = 2024u

public val WM_CPL_LAUNCHED: UInt = 2025u

public val WPSTYLE_CENTER: UInt = 0u

public val WPSTYLE_CROPTOFIT: UInt = 4u

public val WPSTYLE_KEEPASPECT: UInt = 3u

public val WPSTYLE_MAX: UInt = 6u

public val WPSTYLE_SPAN: UInt = 5u

public val WPSTYLE_STRETCH: UInt = 2u

public val WPSTYLE_TILE: UInt = 1u

public val WTSAT_ARGB: WtsAlphatype = 2

public val WTSAT_RGB: WtsAlphatype = 1

public val WTSAT_UNKNOWN: WtsAlphatype = 0

public val WTSCF_APPSTYLE: WtsContextflags = 1

public val WTSCF_DEFAULT: WtsContextflags = 0

public val WTSCF_FAST: WtsContextflags = 8

public val WTSCF_SQUARE: WtsContextflags = 2

public val WTSCF_WIDE: WtsContextflags = 4

public val WTS_APPSTYLE: WtsFlags = 8192

public val WTS_CACHED: WtsCacheflags = 2

public val WTS_CROPTOSQUARE: WtsFlags = 512

public val WTS_DEFAULT: WtsCacheflags = 0

public val WTS_EXTRACT: WtsFlags = 0

public val WTS_EXTRACTDONOTCACHE: WtsFlags = 32

public val WTS_EXTRACTINPROC: WtsFlags = 256

public val WTS_E_DATAFILEUNAVAILABLE: Hresult = 0x8004B204u.toInt()

public val WTS_E_EXTRACTIONBLOCKED: Hresult = 0x8004B206u.toInt()

public val WTS_E_EXTRACTIONPENDING: Hresult = 0x8004B205u.toInt()

public val WTS_E_EXTRACTIONTIMEDOUT: Hresult = 0x8004B201u.toInt()

public val WTS_E_FAILEDEXTRACTION: Hresult = 0x8004B200u.toInt()

public val WTS_E_FASTEXTRACTIONNOTSUPPORTED: Hresult = 0x8004B203u.toInt()

public val WTS_E_NOSTORAGEPROVIDERTHUMBNAILHANDLER: Hresult = 0x8004B207u.toInt()

public val WTS_E_SURROGATEUNAVAILABLE: Hresult = 0x8004B202u.toInt()

public val WTS_FASTEXTRACT: WtsFlags = 2

public val WTS_FORCEEXTRACTION: WtsFlags = 4

public val WTS_IDEALCACHESIZEONLY: WtsFlags = 32768

public val WTS_INCACHEONLY: WtsFlags = 1

public val WTS_INSTANCESURROGATE: WtsFlags = 1024

public val WTS_LOWQUALITY: WtsCacheflags = 1

public val WTS_NONE: WtsFlags = 0

public val WTS_REQUIRESURROGATE: WtsFlags = 2048

public val WTS_SCALETOREQUESTEDSIZE: WtsFlags = 64

public val WTS_SCALEUP: WtsFlags = 65536

public val WTS_SKIPFASTEXTRACT: WtsFlags = 128

public val WTS_SLOWRECLAIM: WtsFlags = 8

public val WTS_WIDETHUMBNAILS: WtsFlags = 16384

public val WEB_BROWSER: Guid = Guid.fromU128(U128(0x8856f961340a11d0uL, 0xa96b00c04fd705a2uL))

public val WEB_BROWSER_V1: Guid = Guid.fromU128(U128(0xeab22ac330c111cfuL, 0xa7eb0000c05bae0buL))

public val WEB_WIZARD_HOST: Guid = Guid.fromU128(U128(0xc827f14955c14d28uL, 0x935e57e47caed973uL))

public val WIN_BIO_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0xbec09223b018416duL, 0xa0ac523971b639f5uL))

public val UNUSED_RECYCLE_WAS_GLOBALCOUNTER_CSCSYNCINPROGRESS: Shglobalcounter = 13

public val UNUSED_RECYCLE_WAS_GLOBALCOUNTER_RECYCLEDIRTYCOUNT_SERVERDRIVE: Shglobalcounter = 42

public val UNUSED_RECYCLE_WAS_GLOBALCOUNTER_RECYCLEGLOBALDIRTYCOUNT: Shglobalcounter = 43

public val IDS_APP_NAME: UInt = 1007u

public val IDS_BAD_OLD_PW: UInt = 1006u

public val IDS_CHANGE_PW: UInt = 1005u

public val IDS_DEF_KEYWORD: UInt = 1010u

public val IDS_DIFFERENT_PW: UInt = 1004u

public val IDS_HELP_FILE: UInt = 1009u

public val IDS_INI_FILE: UInt = 1001u

public val IDS_IS_PASSWORD: UInt = 1000u

public val IDS_NO_HELP_MEMORY: UInt = 1008u

public val IDS_PASSWORD: UInt = 1003u

public val IDS_SCREEN_SAVER: UInt = 1002u

public val NAV_ALLOW_AUTOSEARCH: BrowserNavConstants = 16

public val NAV_BLOCK_REDIRECTS_X_DOMAIN: BrowserNavConstants = 32768

public val NAV_BROWSER_BAR: BrowserNavConstants = 32

public val NAV_DEFER_UNLOAD: BrowserNavConstants = 262144

public val NAV_ENFORCE_RESTRICTED: BrowserNavConstants = 128

public val NAV_HOMEPAGE_NAVIGATE: BrowserNavConstants = 8388608

public val NAV_HOST_NAVIGATION: BrowserNavConstants = 33554432

public val NAV_HYPERLINK: BrowserNavConstants = 64

public val NAV_KEEP_WORD_WHEEL_TEXT: BrowserNavConstants = 8192

public val NAV_NEW_WINDOWS_MANAGED: BrowserNavConstants = 256

public val NAV_NO_HISTORY: BrowserNavConstants = 2

public val NAV_NO_READ_FROM_CACHE: BrowserNavConstants = 4

public val NAV_NO_WRITE_TO_CACHE: BrowserNavConstants = 8

public val NAV_OPEN_IN_BACKGROUND_TAB: BrowserNavConstants = 4096

public val NAV_OPEN_IN_NEW_TAB: BrowserNavConstants = 2048

public val NAV_OPEN_IN_NEW_WINDOW: BrowserNavConstants = 1

public val NAV_OPEN_NEW_FOREGROUND_TAB: BrowserNavConstants = 65536

public val NAV_REFRESH: BrowserNavConstants = 16777216

public val NAV_RESERVED1: BrowserNavConstants = 4194304

public val NAV_RESERVED2: BrowserNavConstants = 67108864

public val NAV_RESERVED3: BrowserNavConstants = 134217728

public val NAV_RESERVED4: BrowserNavConstants = 268435456

public val NAV_RESERVED5: BrowserNavConstants = 536870912

public val NAV_RESERVED6: BrowserNavConstants = 1073741824

public val NAV_RESERVED7: BrowserNavConstants = -2147483648.toInt()

public val NAV_SPECULATIVE: BrowserNavConstants = 524288

public val NAV_SUGGEST_NEW_TAB: BrowserNavConstants = 2097152

public val NAV_SUGGEST_NEW_WINDOW: BrowserNavConstants = 1048576

public val NAV_TRAVEL_LOG_SCREENSHOT: BrowserNavConstants = 131072

public val NAV_TRUSTED_FOR_ACTIVE_X: BrowserNavConstants = 1024

public val NAV_UNTRUSTED_FOR_DOWNLOAD: BrowserNavConstants = 512

public val NAV_VIRTUAL_TAB: BrowserNavConstants = 16384

public val SECURE_LOCK_ICON_MIXED: SecureLockIconConstants = 1

public val SECURE_LOCK_ICON_SECURE128BIT: SecureLockIconConstants = 6

public val SECURE_LOCK_ICON_SECURE40BIT: SecureLockIconConstants = 3

public val SECURE_LOCK_ICON_SECURE56BIT: SecureLockIconConstants = 4

public val SECURE_LOCK_ICON_SECURE_FORTEZZA: SecureLockIconConstants = 5

public val SECURE_LOCK_ICON_SECURE_UNKNOWN_BITS: SecureLockIconConstants = 2

public val SECURE_LOCK_ICON_UNSECURE: SecureLockIconConstants = 0

public val SSF_ALTSTARTUP: ShellSpecialFolderConstants = 29

public val SSF_APPDATA: ShellSpecialFolderConstants = 26

public val SSF_BITBUCKET: ShellSpecialFolderConstants = 10

public val SSF_COMMONALTSTARTUP: ShellSpecialFolderConstants = 30

public val SSF_COMMONAPPDATA: ShellSpecialFolderConstants = 35

public val SSF_COMMONDESKTOPDIR: ShellSpecialFolderConstants = 25

public val SSF_COMMONFAVORITES: ShellSpecialFolderConstants = 31

public val SSF_COMMONPROGRAMS: ShellSpecialFolderConstants = 23

public val SSF_COMMONSTARTMENU: ShellSpecialFolderConstants = 22

public val SSF_COMMONSTARTUP: ShellSpecialFolderConstants = 24

public val SSF_CONTROLS: ShellSpecialFolderConstants = 3

public val SSF_COOKIES: ShellSpecialFolderConstants = 33

public val SSF_DESKTOP: ShellSpecialFolderConstants = 0

public val SSF_DESKTOPDIRECTORY: ShellSpecialFolderConstants = 16

public val SSF_DRIVES: ShellSpecialFolderConstants = 17

public val SSF_FAVORITES: ShellSpecialFolderConstants = 6

public val SSF_FONTS: ShellSpecialFolderConstants = 20

public val SSF_HISTORY: ShellSpecialFolderConstants = 34

public val SSF_INTERNETCACHE: ShellSpecialFolderConstants = 32

public val SSF_LOCALAPPDATA: ShellSpecialFolderConstants = 28

public val SSF_MYPICTURES: ShellSpecialFolderConstants = 39

public val SSF_NETHOOD: ShellSpecialFolderConstants = 19

public val SSF_NETWORK: ShellSpecialFolderConstants = 18

public val SSF_PERSONAL: ShellSpecialFolderConstants = 5

public val SSF_PRINTERS: ShellSpecialFolderConstants = 4

public val SSF_PRINTHOOD: ShellSpecialFolderConstants = 27

public val SSF_PROFILE: ShellSpecialFolderConstants = 40

public val SSF_PROGRAMFILES: ShellSpecialFolderConstants = 38

public val SSF_PROGRAMFILE_SX86: ShellSpecialFolderConstants = 48

public val SSF_PROGRAMS: ShellSpecialFolderConstants = 2

public val SSF_RECENT: ShellSpecialFolderConstants = 8

public val SSF_SENDTO: ShellSpecialFolderConstants = 9

public val SSF_STARTMENU: ShellSpecialFolderConstants = 11

public val SSF_STARTUP: ShellSpecialFolderConstants = 7

public val SSF_SYSTEM: ShellSpecialFolderConstants = 37

public val SSF_SYSTE_MX86: ShellSpecialFolderConstants = 41

public val SSF_TEMPLATES: ShellSpecialFolderConstants = 21

public val SSF_WINDOWS: ShellSpecialFolderConstants = 36
