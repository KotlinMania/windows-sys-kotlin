package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

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

public val VALIDATEUNC_CONNECT: ValidateuncOption = 1

public val VALIDATEUNC_NOUI: ValidateuncOption = 2

public val VALIDATEUNC_PERSIST: ValidateuncOption = 8

public val VALIDATEUNC_PRINT: ValidateuncOption = 4

public val VALIDATEUNC_VALID: ValidateuncOption = 15

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

public val ACCESSIBILITY_DOCKING_SERVICE: Guid = Guid.fromU128(U128(0x29ce1d46b4814aa0uL, 0xa08ad3ebc8aca402uL))

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

public val CATID_BROWSABLE_SHELL_EXT: Guid = Guid.fromU128(U128(0x2149000000000uL, 0xc000000000000046uL))

public val CATID_BROWSE_IN_PLACE: Guid = Guid.fromU128(U128(0x2149100000000uL, 0xc000000000000046uL))

public val CATID_COMM_BAND: Guid = Guid.fromU128(U128(0x2149400000000uL, 0xc000000000000046uL))

public val CATID_DESK_BAND: Guid = Guid.fromU128(U128(0x2149200000000uL, 0xc000000000000046uL))

public val CATID_FILE_PLACEHOLDER_MERGE_HANDLER: Guid = Guid.fromU128(U128(0x3e9c9a51d4aa4870uL, 0xb47c7424b491f1ccuL))

public val CATID_INFO_BAND: Guid = Guid.fromU128(U128(0x2149300000000uL, 0xc000000000000046uL))

public val CATID_LOCATION_FACTORY: Guid = Guid.fromU128(U128(0x965c4d518b764e57uL, 0x80b7564d2ea4b55euL))

public val CATID_LOCATION_PROVIDER: Guid = Guid.fromU128(U128(0x1b3ca4742614414buL, 0xb8131aceca3e3dd8uL))

public val CATID_SEARCHABLE_APPLICATION: Guid = Guid.fromU128(U128(0x366c292ad9b34dbfuL, 0xbb70e62ec3d0bbbfuL))

public val CD_BURN: Guid = Guid.fromU128(U128(0xfbeb8a05beee4442uL, 0x804e409d6c4515e9uL))

public val CGID_DEF_VIEW: Guid = Guid.fromU128(U128(0x4af07f10d23111d0uL, 0xb94200a0c90312e1uL))

public val CGID_EXPLORER: Guid = Guid.fromU128(U128(0x214d000000000uL, 0xc000000000000046uL))

public val CGID_EXPLORER_BAR_DOC: Guid = Guid.fromU128(U128(0x214d300000000uL, 0xc000000000000046uL))

public val CGID_MENUDESKBAR: Guid = Guid.fromU128(U128(0x5c9f0a12959e11d0uL, 0xa3a400a0c9082636uL))

public val CGID_SHELL_DOC_VIEW: Guid = Guid.fromU128(U128(0x214d100000000uL, 0xc000000000000046uL))

public val CGID_SHELL_SERVICE_OBJECT: Guid = Guid.fromU128(U128(0x214d200000000uL, 0xc000000000000046uL))

public val CGID_SHORT_CUT: Guid = Guid.fromU128(U128(0x93a68750951a11d1uL, 0x946f000000000000uL))

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

public val CPFG_CREDENTIAL_PROVIDER_LABEL: Guid = Guid.fromU128(U128(0x286bbff3bad4438fuL, 0xb00779b7267c3d48uL))

public val CPFG_CREDENTIAL_PROVIDER_LOGO: Guid = Guid.fromU128(U128(0x2d837775f6cd464euL, 0xa745482fd0b47493uL))

public val CPFG_LOGON_PASSWORD: Guid = Guid.fromU128(U128(0x60624cfaa47747b1uL, 0x8a8e3a4a19981827uL))

public val CPFG_LOGON_USERNAME: Guid = Guid.fromU128(U128(0xda15bbe8954d4fd3uL, 0xb0f41fb5b90b174buL))

public val CPFG_SMARTCARD_PIN: Guid = Guid.fromU128(U128(0x4fe5263b918146c1uL, 0xb0a49dedd4db7deauL))

public val CPFG_SMARTCARD_USERNAME: Guid = Guid.fromU128(U128(0x3e1ecf69568c4d96uL, 0x9d5946444174e2d6uL))

public val CPFG_STANDALONE_SUBMIT_BUTTON: Guid = Guid.fromU128(U128(0xb7b0ad8cc364d59uL, 0x802b82f714fa7022uL))

public val CPFG_STYLE_LINK_AS_BUTTON: Guid = Guid.fromU128(U128(0x88fa50894a64430uL, 0xa4cb6fc6e3c0b9e2uL))

public val C_SCRIPT_ERROR_LIST: Guid = Guid.fromU128(U128(0xefd01300160f11d2uL, 0xbb2e00805ff7efcauL))

public val CONFLICT_FOLDER: Guid = Guid.fromU128(U128(0x289978aca1014341uL, 0xa81721eba7fd046duL))

public val DEF_FOLDER_MENU: Guid = Guid.fromU128(U128(0xc63382be793348d0uL, 0x9ac885fb46be2fdduL))

public val DESKTOP_GADGET: Guid = Guid.fromU128(U128(0x924ccc1b65624c85uL, 0x8657d177925222b6uL))

public val DESKTOP_WALLPAPER: Guid = Guid.fromU128(U128(0xc2cf3110460e4fc1uL, 0xb9d08a1c0c9cc4bduL))

public val DESTINATION_LIST: Guid = Guid.fromU128(U128(0x77f10cf03db54966uL, 0xb520b7c54fd35ed6uL))

public val DOC_PROP_SHELL_EXTENSION: Guid = Guid.fromU128(U128(0x883373c3bf8911d1uL, 0xbe35080036b11a03uL))

public val DRIVE_SIZE_CATEGORIZER: Guid = Guid.fromU128(U128(0x94357b53ca294b78uL, 0x83aee8fe7409134fuL))

public val DRIVE_TYPE_CATEGORIZER: Guid = Guid.fromU128(U128(0xb0a8f3cf43334babuL, 0x88731ccb1cada48buL))

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

public val ENUMERABLE_OBJECT_COLLECTION: Guid = Guid.fromU128(U128(0x2d3468c136a743b6uL, 0xac24d3f02fd9607auL))

public val EXECUTE_FOLDER: Guid = Guid.fromU128(U128(0x11dbb47ca525400buL, 0x9e80a54615a090c0uL))

public val EXECUTE_UNKNOWN: Guid = Guid.fromU128(U128(0xe44e9428bdbc4987uL, 0xa09940dc8fd255e7uL))

public val EXPLORER_BROWSER: Guid = Guid.fromU128(U128(0x71f96385ddd648d3uL, 0xa0c1ae06e8b055fbuL))

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

public val FS_COPY_HANDLER: Guid = Guid.fromU128(U128(0xd197380a0a794dc8uL, 0xa033ed882c2fa14buL))

public val FILE_OPEN_DIALOG: Guid = Guid.fromU128(U128(0xdc1c5a9ce88a4ddeuL, 0xa5a160f82a20aef7uL))

public val FILE_OPERATION: Guid = Guid.fromU128(U128(0x3ad0557588574850uL, 0x927711b85bdb8e09uL))

public val FILE_SAVE_DIALOG: Guid = Guid.fromU128(U128(0xc0b4e2f3ba214773uL, 0x8dba335ec946eb8buL))

public val FILE_SEARCH_BAND: Guid = Guid.fromU128(U128(0xc4ee31f3476811d2uL, 0xbe5c00a0c9a83da1uL))

public val FOLDER_VIEW_HOST: Guid = Guid.fromU128(U128(0x20b1cb2369684eb9uL, 0xb7d4a66d00d07ceeuL))

public val FRAMEWORK_INPUT_PANE: Guid = Guid.fromU128(U128(0xd5120aa346ba44c5uL, 0x822dca8092c1fc72uL))

public val FREE_SPACE_CATEGORIZER: Guid = Guid.fromU128(U128(0xb560779324ac44c7uL, 0x82e2831726aa6cb7uL))

public val GENERIC_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x25cbb99692ed457euL, 0xb28c4774084bd562uL))

public val HIDE_INPUT_PANE_ANIMATION_COORDINATOR: Guid = Guid.fromU128(U128(0x384742b12a774cb3uL, 0x8cf81136f5e17e59uL))

public val HOME_GROUP: Guid = Guid.fromU128(U128(0xde77ba043c924d11uL, 0xa1a542352a53e0e3uL))

public val IE_NAMESPACE_TREE_CONTROL: Guid = Guid.fromU128(U128(0xace52d03e5cd4b20uL, 0x82ffe71b11beae1duL))

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

public val KNOWN_FOLDER_MANAGER: Guid = Guid.fromU128(U128(0x4df0c730df9d4ae3uL, 0x9153aa6b82e9795auL))

public val LOCAL_THUMBNAIL_CACHE: Guid = Guid.fromU128(U128(0x50ef4544ac9f4a8euL, 0xb21b8a26180db13fuL))

public val MAIL_RECIPIENT: Guid = Guid.fromU128(U128(0x9e56be60c50f11cfuL, 0x9a2c00a0c90a90ceuL))

public val MERGED_CATEGORIZER: Guid = Guid.fromU128(U128(0x8e827c1133e74bc1uL, 0xb2428cd9a1c2b304uL))

public val NP_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x3dd6bec081934ffeuL, 0xae25e08e39ea4063uL))

public val NAMESPACE_TREE_CONTROL: Guid = Guid.fromU128(U128(0xae05421235354430uL, 0x83edd501aa6680e6uL))

public val NAMESPACE_WALKER: Guid = Guid.fromU128(U128(0x72eb61e086724303uL, 0x9175f2e4c68b2e7cuL))

public val NETWORK_CONNECTIONS: Guid = Guid.fromU128(U128(0x7007acc7320211d1uL, 0xaad200805fc1270euL))

public val NETWORK_EXPLORER_FOLDER: Guid = Guid.fromU128(U128(0xf02c1a0dbe214350uL, 0x88b07367fc96ef3cuL))

public val NETWORK_PLACES: Guid = Guid.fromU128(U128(0x208d2c603aea1069uL, 0xa2d708002b30309duL))

public val ONEX_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x7aa0886cc8d4e19uL, 0xa4101c75af686e62uL))

public val ONEX_PLAP_SMARTCARD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x33c86cd6705f4ba1uL, 0x9adb67070b837775uL))

public val OPEN_CONTROL_PANEL: Guid = Guid.fromU128(U128(0x6622d8568564460uL, 0x8de1a81921b41c4buL))

public val PIN_LOGON_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0xcb82ea129f71446duL, 0x89e18d0924e1256euL))

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

public val PUBLISH_DROP_TARGET: Guid = Guid.fromU128(U128(0xcc6eeffb43f646c5uL, 0x961951d571967f7duL))

public val PUBLISHING_WIZARD: Guid = Guid.fromU128(U128(0x6b33163c76a54b6cuL, 0xbf2145de9cd503a1uL))

public val QUERY_CANCEL_AUTO_PLAY: Guid = Guid.fromU128(U128(0x331f176805a94ddduL, 0xb86edae34ddc998auL))

public val RAS_PROVIDER: Guid = Guid.fromU128(U128(0x5537e283b1e74ef8uL, 0x9c6e7ab0afe5056duL))

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

public val TASKBAR_LIST: Guid = Guid.fromU128(U128(0x56fdf344fd6d11d0uL, 0x958a006097c9a090uL))

public val THUMBNAIL_STREAM_CACHE: Guid = Guid.fromU128(U128(0xcbe0fed34b914e90uL, 0x83548a8c84ec6872uL))

public val TIME_CATEGORIZER: Guid = Guid.fromU128(U128(0x3bb4118fddfd4d30uL, 0xa3489fb5d6bf1afeuL))

public val TRACK_SHELL_MENU: Guid = Guid.fromU128(U128(0x8278f9312a3e11d2uL, 0x838f00c04fd918d0uL))

public val TRAY_BAND_SITE_SERVICE: Guid = Guid.fromU128(U128(0xf60ad0a0e5e145cbuL, 0xb51ae15b9f8b2934uL))

public val TRAY_DESK_BAND: Guid = Guid.fromU128(U128(0xe64424376c684f52uL, 0x94dd2cfed267efb9uL))

public val USER_NOTIFICATION: Guid = Guid.fromU128(U128(0x10890e8789413cuL, 0xadbc48f5b511b3afuL))

public val V1PASSWORD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x6f45dc1e5384457auL, 0xbc132cd81b0d28eduL))

public val V1SMARTCARD_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0x8bf9a910a8ff457fuL, 0x999fa5ca10b4a885uL))

public val V1WIN_BIO_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0xac3ac249e8204343uL, 0xa65b377ac634dc09uL))

public val VID_CONTENT: Guid = Guid.fromU128(U128(0x30c2c43408894c8duL, 0x985da9f71830b0a9uL))

public val VID_DETAILS: Guid = Guid.fromU128(U128(0x137e7700357311cfuL, 0xae6908002b2e1262uL))

public val VID_LARGE_ICONS: Guid = Guid.fromU128(U128(0x57d0e0357311cfuL, 0xae6908002b2e1262uL))

public val VID_LIST: Guid = Guid.fromU128(U128(0xe1fa5e0357311cfuL, 0xae6908002b2e1262uL))

public val VID_SMALL_ICONS: Guid = Guid.fromU128(U128(0x89000c0357311cfuL, 0xae6908002b2e1262uL))

public val VID_THUMB_STRIP: Guid = Guid.fromU128(U128(0x8eefa624d1e9445buL, 0x94b774fbce2ea11auL))

public val VID_THUMBNAILS: Guid = Guid.fromU128(U128(0x8bebb29052d011d0uL, 0xb7f400c04fd706ecuL))

public val VID_TILE: Guid = Guid.fromU128(U128(0x65f125e57be14810uL, 0xba9dd271c8432ce3uL))

public val VAULT_PROVIDER: Guid = Guid.fromU128(U128(0x503739d04c5e4cfduL, 0xb3bad881334f0df2uL))

public val VIRTUAL_DESKTOP_MANAGER: Guid = Guid.fromU128(U128(0xaa5090865ca94c25uL, 0x8f95589d3c07b48auL))

public val WEB_BROWSER: Guid = Guid.fromU128(U128(0x8856f961340a11d0uL, 0xa96b00c04fd705a2uL))

public val WEB_BROWSER_V1: Guid = Guid.fromU128(U128(0xeab22ac330c111cfuL, 0xa7eb0000c05bae0buL))

public val WEB_WIZARD_HOST: Guid = Guid.fromU128(U128(0xc827f14955c14d28uL, 0x935e57e47caed973uL))

public val WIN_BIO_CREDENTIAL_PROVIDER: Guid = Guid.fromU128(U128(0xbec09223b018416duL, 0xa0ac523971b639f5uL))
