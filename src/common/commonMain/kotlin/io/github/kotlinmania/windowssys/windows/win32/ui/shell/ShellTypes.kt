package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias ACENUMOPTION = Int

public typealias ACTIVATEOPTIONS = Int

public typealias ADJACENT_DISPLAY_EDGES = Int

public typealias AHE_TYPE = Int

public typealias AHTYPE = Int

public typealias APPACTIONFLAGS = Int

public typealias APPDOCLISTTYPE = Int

public typealias APPINFODATAFLAGS = Int

public fun interface APPLET_PROCFn {
    public operator fun invoke(hwndcpl: Foundation.HWND, msg: UInt, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Int
}

public typealias APPLET_PROC = APPLET_PROCFn?

public typealias APPLICATION_VIEW_MIN_WIDTH = Int

public typealias APPLICATION_VIEW_ORIENTATION = Int

public typealias APPLICATION_VIEW_SIZE_PREFERENCE = Int

public typealias APPLICATION_VIEW_STATE = Int

public typealias ASSOCCLASS = Int

public typealias ASSOCDATA = Int

public typealias ASSOCENUM = Int

public typealias ASSOCF = UInt

public typealias ASSOCIATIONLEVEL = Int

public typealias ASSOCIATIONTYPE = Int

public typealias ASSOCKEY = Int

public typealias ASSOCSTR = Int

public typealias ASSOC_FILTER = Int

public typealias ATTACHMENT_ACTION = Int

public typealias ATTACHMENT_PROMPT = Int

public typealias AUTOCOMPLETELISTOPTIONS = Int

public typealias AUTOCOMPLETEOPTIONS = Int

public typealias BANDSITECID = Int

public typealias BANNER_NOTIFICATION_EVENT = Int

public fun interface BFFCALLBACKFn {
    public operator fun invoke(hwnd: Foundation.HWND, umsg: UInt, lparam: Foundation.LPARAM, lpdata: Foundation.LPARAM): Int
}

public typealias BFFCALLBACK = BFFCALLBACKFn?

public typealias BNSTATE = Int

public typealias BrowserNavConstants = Int

public typealias CATEGORYINFO_FLAGS = Int

public typealias CATSORT_FLAGS = Int

public typealias CDBURNINGEXTENSIONRET = Int

public typealias CDCONTROLSTATEF = Int

public typealias CM_ENUM_FLAGS = Int

public typealias CM_MASK = Int

public typealias CM_SET_WIDTH_VALUE = Int

public typealias CM_STATE = Int

public typealias CPVIEW = Int

public typealias CREDENTIAL_PROVIDER_ACCOUNT_OPTIONS = Int

public typealias CREDENTIAL_PROVIDER_CREDENTIAL_FIELD_OPTIONS = Int

public typealias CREDENTIAL_PROVIDER_FIELD_INTERACTIVE_STATE = Int

public typealias CREDENTIAL_PROVIDER_FIELD_STATE = Int

public typealias CREDENTIAL_PROVIDER_FIELD_TYPE = Int

public typealias CREDENTIAL_PROVIDER_GET_SERIALIZATION_RESPONSE = Int

public typealias CREDENTIAL_PROVIDER_STATUS_ICON = Int

public typealias CREDENTIAL_PROVIDER_USAGE_SCENARIO = Int

public typealias CommandStateChangeConstants = Int

public typealias DATAOBJ_GET_ITEM_FLAGS = Int

public typealias DEFAULTSAVEFOLDERTYPE = Int

public typealias DEFAULT_FOLDER_MENU_RESTRICTIONS = Int

public typealias DEF_SHARE_ID = Int

public typealias DESKBANDCID = Int

public typealias DESKTOP_SLIDESHOW_DIRECTION = Int

public typealias DESKTOP_SLIDESHOW_OPTIONS = Int

public typealias DESKTOP_SLIDESHOW_STATE = Int

public typealias DESKTOP_WALLPAPER_POSITION = Int

public typealias DFM_CMD = Int

public typealias DFM_MESSAGE_ID = Int

public typealias DISPLAY_DEVICE_TYPE = Int

public fun interface DLLGETVERSIONPROCFn {
    public operator fun invoke(param0: Long): HRESULT
}

public typealias DLLGETVERSIONPROC = DLLGETVERSIONPROCFn?

public typealias DROPIMAGETYPE = Int

public typealias DSH_FLAGS = Int

public typealias EC_HOST_UI_MODE = Int

public typealias EDGE_GESTURE_KIND = Int

public typealias EXPLORER_BROWSER_FILL_FLAGS = Int

public typealias EXPLORER_BROWSER_OPTIONS = Int

public typealias FDAP = Int

public typealias FDE_OVERWRITE_RESPONSE = Int

public typealias FDE_SHAREVIOLATION_RESPONSE = Int

public typealias FD_FLAGS = Int

public typealias FFFP_MODE = Int

public typealias FILEOPENDIALOGOPTIONS = UInt

public typealias FILEOPERATION_FLAGS = UInt

public typealias FILETYPEATTRIBUTEFLAGS = Int

public typealias FILE_OPERATION_FLAGS2 = Int

public typealias FILE_USAGE_TYPE = Int

public typealias FLYOUT_PLACEMENT = Int

public typealias FOLDERFLAGS = Int

public typealias FOLDERLOGICALVIEWMODE = Int

public typealias FOLDERVIEWMODE = Int

public typealias FOLDERVIEWOPTIONS = Int

public typealias FOLDER_ENUM_MODE = Int

public typealias FVTEXTTYPE = Int

public typealias GPFIDL_FLAGS = UInt

public typealias HDROP = Long

public typealias HELP_INFO_TYPE = Int

public typealias HLBWIF_FLAGS = Int

public typealias HLFNAMEF = Int

public typealias HLID_INFO = UInt

public typealias HLINKGETREF = Int

public typealias HLINKMISC = Int

public typealias HLINKSETF = Int

public typealias HLINKWHICHMK = Int

public typealias HLNF = UInt

public typealias HLQF_INFO = Int

public typealias HLSHORTCUTF = Int

public typealias HLSR = Int

public typealias HLTB_INFO = Int

public typealias HLTRANSLATEF = Int

public typealias HOMEGROUPSHARINGCHOICES = Int

public typealias HPSXA = Long

public typealias IEPDNFLAGS = Int

public typealias IESHORTCUTFLAGS = Int

public typealias IURL_INVOKECOMMAND_FLAGS = Int

public typealias IURL_SETURL_FLAGS = Int

public typealias KF_CATEGORY = Int

public typealias KNOWNDESTCATEGORY = Int

public typealias KNOWN_FOLDER_FLAG = Int

public typealias LIBRARYFOLDERFILTER = Int

public typealias LIBRARYMANAGEDIALOGOPTIONS = Int

public typealias LIBRARYOPTIONFLAGS = Int

public typealias LIBRARYSAVEFLAGS = Int

public fun interface LPFNDFMCALLBACKFn {
    public operator fun invoke(psf: Long, hwnd: Foundation.HWND, pdtobj: Long, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): HRESULT
}

public typealias LPFNDFMCALLBACK = LPFNDFMCALLBACKFn?

public fun interface LPFNVIEWCALLBACKFn {
    public operator fun invoke(psvouter: Long, psf: Long, hwndmain: Foundation.HWND, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM): HRESULT
}

public typealias LPFNVIEWCALLBACK = LPFNVIEWCALLBACKFn?

public typealias MENUBANDHANDLERCID = Int

public typealias MENUPOPUPPOPUPFLAGS = Int

public typealias MENUPOPUPSELECT = Int

public typealias MERGE_UPDATE_STATUS = Int

public typealias MIMEASSOCIATIONDIALOG_IN_FLAGS = Int

public typealias MM_FLAGS = UInt

public typealias MONITOR_APP_VISIBILITY = Int

public typealias NAMESPACEWALKFLAG = Int

public typealias NATIVE_DISPLAY_ORIENTATION = Int

public typealias NOTIFY_ICON_DATA_FLAGS = UInt

public typealias NOTIFY_ICON_INFOTIP_FLAGS = UInt

public typealias NOTIFY_ICON_MESSAGE = UInt

public typealias NOTIFY_ICON_STATE = UInt

public typealias NSTCFOLDERCAPABILITIES = Int

public typealias NSTCGNI = Int

public typealias NSTCSTYLE2 = Int

public typealias NWMF = Int

public typealias NewProcessCauseConstants = Int

public typealias OPEN_AS_INFO_FLAGS = Int

public typealias OS = UInt

public typealias OfflineFolderStatus = Int

public typealias PACKAGE_EXECUTION_STATE = Int

public fun interface PAPPCONSTRAIN_CHANGE_ROUTINEFn {
    public operator fun invoke(constrained: Boolean, context: Long)
}

public typealias PAPPCONSTRAIN_CHANGE_ROUTINE = PAPPCONSTRAIN_CHANGE_ROUTINEFn?

public typealias PAPPCONSTRAIN_REGISTRATION = Long

public fun interface PAPPSTATE_CHANGE_ROUTINEFn {
    public operator fun invoke(quiesced: Boolean, context: Long)
}

public typealias PAPPSTATE_CHANGE_ROUTINE = PAPPSTATE_CHANGE_ROUTINEFn?

public typealias PAPPSTATE_REGISTRATION = Long

public typealias PATHCCH_OPTIONS = UInt

public typealias PCS_RET = UInt

public fun interface PFNCANSHAREFOLDERWFn {
    public operator fun invoke(pszpath: PCWSTR): HRESULT
}

public typealias PFNCANSHAREFOLDERW = PFNCANSHAREFOLDERWFn?

public fun interface PFNSHOWSHAREFOLDERUIWFn {
    public operator fun invoke(hwndparent: Foundation.HWND, pszpath: PCWSTR): HRESULT
}

public typealias PFNSHOWSHAREFOLDERUIW = PFNSHOWSHAREFOLDERUIWFn?

public typealias PIDISF_FLAGS = Int

public typealias PIDISM_OPTIONS = Int

public typealias PIDISR_INFO = Int

public typealias PID_INTSITE = Int

public typealias PID_IS = Int

public typealias PRF_FLAGS = Int

public typealias PUBAPPINFOFLAGS = Int

public typealias QITIPF_FLAGS = Int

public typealias QUERY_USER_NOTIFICATION_STATE = Int

public typealias RESTRICTIONS = Int

public typealias RefreshConstants = Int

public typealias SCALE_CHANGE_FLAGS = Int

public typealias SCNRT_STATUS = Int

public typealias SECURELOCKCODE = Int

public typealias SFBS_FLAGS = Int

public typealias SFVM_MESSAGE_ID = Int

public typealias SFVS_SELECT = Int

public typealias SHARD = Int

public typealias SHARE_ROLE = Int

public typealias SHCNE_ID = UInt

public typealias SHCNF_FLAGS = UInt

public typealias SHCNRF_SOURCE = Int

public typealias SHDID_ID = Int

public typealias SHELLBROWSERSHOWCONTROL = Int

public typealias SHELL_AUTOCOMPLETE_FLAGS = UInt

public typealias SHELL_LINK_DATA_FLAGS = Int

public typealias SHELL_UI_COMPONENT = Int

public typealias SHFMT_ID = UInt

public typealias SHFMT_OPT = Int

public typealias SHFMT_RET = UInt

public typealias SHGDFIL_FORMAT = Int

public typealias SHGDNF = UInt

public typealias SHGFI_FLAGS = UInt

public typealias SHGFP_TYPE = Int

public typealias SHGLOBALCOUNTER = Int

public typealias SHGSI_FLAGS = UInt

public typealias SHOP_TYPE = Int

public typealias SHREGDEL_FLAGS = Int

public typealias SHREGENUM_FLAGS = Int

public typealias SHSTOCKICONID = Int

public typealias SIATTRIBFLAGS = Int

public typealias SIGDN = Int

public typealias SIIGBF = Int

public typealias SLGP_FLAGS = Int

public typealias SLR_FLAGS = Int

public typealias SMINFOFLAGS = Int

public typealias SMINFOMASK = Int

public typealias SMINFOTYPE = Int

public typealias SORTDIRECTION = Int

public typealias SORT_ORDER_TYPE = Int

public typealias SPACTION = Int

public typealias SPTEXT = Int

public typealias SSF_MASK = UInt

public typealias STGOP = Int

public typealias STORAGE_PROVIDER_FILE_FLAGS = Int

public typealias STPFLAG = Int

public fun interface SUBCLASSPROCFn {
    public operator fun invoke(hwnd: Foundation.HWND, umsg: UInt, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, uidsubclass: ULong, dwrefdata: ULong): Foundation.LRESULT
}

public typealias SUBCLASSPROC = SUBCLASSPROCFn?

public typealias SVUIA_STATUS = Int

public typealias SYNCMGRERRORFLAGS = Int

public typealias SYNCMGRFLAG = Int

public typealias SYNCMGRHANDLERFLAGS = Int

public typealias SYNCMGRINVOKEFLAGS = Int

public typealias SYNCMGRITEMFLAGS = Int

public typealias SYNCMGRITEMSTATE = Int

public typealias SYNCMGRLOGLEVEL = Int

public typealias SYNCMGRREGISTERFLAGS = Int

public typealias SYNCMGRSTATUS = Int

public typealias SYNCMGR_CANCEL_REQUEST = Int

public typealias SYNCMGR_CONFLICT_ITEM_TYPE = Int

public typealias SYNCMGR_CONTROL_FLAGS = Int

public typealias SYNCMGR_EVENT_FLAGS = Int

public typealias SYNCMGR_EVENT_LEVEL = Int

public typealias SYNCMGR_HANDLER_CAPABILITIES = Int

public typealias SYNCMGR_HANDLER_POLICIES = Int

public typealias SYNCMGR_HANDLER_TYPE = Int

public typealias SYNCMGR_ITEM_CAPABILITIES = Int

public typealias SYNCMGR_ITEM_POLICIES = Int

public typealias SYNCMGR_PRESENTER_CHOICE = Int

public typealias SYNCMGR_PRESENTER_NEXT_STEP = Int

public typealias SYNCMGR_PROGRESS_STATUS = Int

public typealias SYNCMGR_RESOLUTION_ABILITIES = Int

public typealias SYNCMGR_RESOLUTION_FEEDBACK = Int

public typealias SYNCMGR_SYNC_CONTROL_FLAGS = Int

public typealias SYNCMGR_UPDATE_REASON = Int

public typealias SecureLockIconConstants = Int

public typealias ShellFolderViewOptions = Int

public typealias ShellSpecialFolderConstants = Int

public typealias ShellWindowFindWindowOptions = Int

public typealias ShellWindowTypeConstants = Int

public typealias TBPFLAG = Int

public typealias THUMBBUTTONFLAGS = Int

public typealias THUMBBUTTONMASK = Int

public typealias TI_FLAGS = Int

public typealias TLENUMF = Int

public typealias TRANSLATEURL_IN_FLAGS = Int

public typealias ThumbnailStreamCacheOptions = Int

public typealias UNDOCK_REASON = Int

public typealias URLASSOCIATIONDIALOG_IN_FLAGS = Int

public typealias URLIS = Int

public typealias URL_PART = Int

public typealias URL_SCHEME = Int

public typealias VALIDATEUNC_OPTION = Int

public typealias VPCOLORFLAGS = Int

public typealias VPWATERMARKFLAGS = Int

public typealias WTS_ALPHATYPE = Int

public typealias WTS_CACHEFLAGS = Int

public typealias WTS_CONTEXTFLAGS = Int

public typealias WTS_FLAGS = Int

public typealias _BROWSERFRAMEOPTIONS = Int

public typealias _CDBE_ACTIONS = Int

public typealias _EXPCMDFLAGS = Int

public typealias _EXPCMDSTATE = Int

public typealias _EXPLORERPANESTATE = Int

public typealias _EXPPS = Int

public typealias _KF_DEFINITION_FLAGS = Int

public typealias _KF_REDIRECTION_CAPABILITIES = Int

public typealias _KF_REDIRECT_FLAGS = Int

public typealias _NMCII_FLAGS = Int

public typealias _NMCSAEI_FLAGS = Int

public typealias _NSTCECLICKTYPE = Int

public typealias _NSTCEHITTEST = Int

public typealias _NSTCITEMSTATE = Int

public typealias _NSTCROOTSTYLE = Int

public typealias _NSTCSTYLE = Int

public typealias _OPPROGDLGF = Int

public typealias _PDMODE = Int

public typealias _SHCONTF = Int

public typealias _SICHINTF = Int

public typealias _SPBEGINF = Int

public typealias _SPINITF = Int

public typealias _SV3CVW3_FLAGS = Int

public typealias _SVGIO = Int

public typealias _SVSIF = Int

public typealias _TRANSFER_ADVISE_STATE = Int

public typealias _TRANSFER_SOURCE_FLAGS = Int
