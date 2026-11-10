package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias Acenumoption = Int

public typealias Activateoptions = Int

public typealias AdjacentDisplayEdges = Int

public typealias AheType = Int

public typealias Ahtype = Int

public typealias Appactionflags = Int

public typealias Appdoclisttype = Int

public typealias Appinfodataflags = Int

public fun interface AppletProcFn {
    public operator fun invoke(hwndcpl: Hwnd, msg: UInt, lparam1: Lparam, lparam2: Lparam): Int
}

public typealias AppletProc = AppletProcFn?

public typealias ApplicationViewMinWidth = Int

public typealias ApplicationViewOrientation = Int

public typealias ApplicationViewSizePreference = Int

public typealias ApplicationViewState = Int

public typealias Assocclass = Int

public typealias Assocdata = Int

public typealias Assocenum = Int

public typealias Assocf = UInt

public typealias Associationlevel = Int

public typealias Associationtype = Int

public typealias Assockey = Int

public typealias Assocstr = Int

public typealias AssocFilter = Int

public typealias AttachmentAction = Int

public typealias AttachmentPrompt = Int

public typealias Autocompletelistoptions = Int

public typealias Autocompleteoptions = Int

public typealias Bandsitecid = Int

public typealias BannerNotificationEvent = Int

public fun interface BffcallbackFn {
    public operator fun invoke(hwnd: Hwnd, umsg: UInt, lparam: Lparam, lpdata: Lparam): Int
}

public typealias Bffcallback = BffcallbackFn?

public typealias Bnstate = Int

public typealias BrowserNavConstants = Int

public typealias CategoryinfoFlags = Int

public typealias CatsortFlags = Int

public typealias Cdburningextensionret = Int

public typealias Cdcontrolstatef = Int

public typealias CmEnumFlags = Int

public typealias CmMask = Int

public typealias CmSetWidthValue = Int

public typealias CmState = Int

public typealias Cpview = Int

public typealias CredentialProviderAccountOptions = Int

public typealias CredentialProviderCredentialFieldOptions = Int

public typealias CredentialProviderFieldInteractiveState = Int

public typealias CredentialProviderFieldState = Int

public typealias CredentialProviderFieldType = Int

public typealias CredentialProviderGetSerializationResponse = Int

public typealias CredentialProviderStatusIcon = Int

public typealias CredentialProviderUsageScenario = Int

public typealias CommandStateChangeConstants = Int

public typealias DataobjGetItemFlags = Int

public typealias Defaultsavefoldertype = Int

public typealias DefaultFolderMenuRestrictions = Int

public typealias DefShareId = Int

public typealias Deskbandcid = Int

public typealias DesktopSlideshowDirection = Int

public typealias DesktopSlideshowOptions = Int

public typealias DesktopSlideshowState = Int

public typealias DesktopWallpaperPosition = Int

public typealias DfmCmd = Int

public typealias DfmMessageId = Int

public typealias DisplayDeviceType = Int

public fun interface DllgetversionprocFn {
    public operator fun invoke(param0: COpaquePointer?): Hresult
}

public typealias Dllgetversionproc = DllgetversionprocFn?

public typealias Dropimagetype = Int

public typealias DshFlags = Int

public typealias EcHostUiMode = Int

public typealias EdgeGestureKind = Int

public typealias ExplorerBrowserFillFlags = Int

public typealias ExplorerBrowserOptions = Int

public typealias Fdap = Int

public typealias FdeOverwriteResponse = Int

public typealias FdeShareviolationResponse = Int

public typealias FdFlags = Int

public typealias FffpMode = Int

public typealias Fileopendialogoptions = UInt

public typealias FileoperationFlags = UInt

public typealias Filetypeattributeflags = Int

public typealias FileOperationFlags2 = Int

public typealias FileUsageType = Int

public typealias FlyoutPlacement = Int

public typealias Folderflags = Int

public typealias Folderlogicalviewmode = Int

public typealias Folderviewmode = Int

public typealias Folderviewoptions = Int

public typealias FolderEnumMode = Int

public typealias Fvtexttype = Int

public typealias GpfidlFlags = UInt

public typealias Hdrop = COpaquePointer?

public typealias HelpInfoType = Int

public typealias HlbwifFlags = Int

public typealias Hlfnamef = Int

public typealias HlidInfo = UInt

public typealias Hlinkgetref = Int

public typealias Hlinkmisc = Int

public typealias Hlinksetf = Int

public typealias Hlinkwhichmk = Int

public typealias Hlnf = UInt

public typealias HlqfInfo = Int

public typealias Hlshortcutf = Int

public typealias Hlsr = Int

public typealias HltbInfo = Int

public typealias Hltranslatef = Int

public typealias Homegroupsharingchoices = Int

public typealias Hpsxa = COpaquePointer?

public typealias Iepdnflags = Int

public typealias Ieshortcutflags = Int

public typealias IurlInvokecommandFlags = Int

public typealias IurlSeturlFlags = Int

public typealias KfCategory = Int

public typealias Knowndestcategory = Int

public typealias KnownFolderFlag = Int

public typealias Libraryfolderfilter = Int

public typealias Librarymanagedialogoptions = Int

public typealias Libraryoptionflags = Int

public typealias Librarysaveflags = Int

public fun interface LpfndfmcallbackFn {
    public operator fun invoke(psf: COpaquePointer?, hwnd: Hwnd, pdtobj: COpaquePointer?, umsg: UInt, wparam: Wparam, lparam: Lparam): Hresult
}

public typealias Lpfndfmcallback = LpfndfmcallbackFn?

public fun interface LpfnviewcallbackFn {
    public operator fun invoke(psvouter: COpaquePointer?, psf: COpaquePointer?, hwndmain: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Hresult
}

public typealias Lpfnviewcallback = LpfnviewcallbackFn?

public typealias Menubandhandlercid = Int

public typealias Menupopuppopupflags = Int

public typealias Menupopupselect = Int

public typealias MergeUpdateStatus = Int

public typealias MimeassociationdialogInFlags = Int

public typealias MmFlags = UInt

public typealias MonitorAppVisibility = Int

public typealias Namespacewalkflag = Int

public typealias NativeDisplayOrientation = Int

public typealias NotifyIconDataFlags = UInt

public typealias NotifyIconInfotipFlags = UInt

public typealias NotifyIconMessage = UInt

public typealias NotifyIconState = UInt

public typealias Nstcfoldercapabilities = Int

public typealias Nstcgni = Int

public typealias Nstcstyle2 = Int

public typealias Nwmf = Int

public typealias NewProcessCauseConstants = Int

public typealias OpenAsInfoFlags = Int

public typealias OS = UInt

public typealias OfflineFolderStatus = Int

public typealias PackageExecutionState = Int

public fun interface PappconstrainChangeRoutineFn {
    public operator fun invoke(constrained: Boolean, context: COpaquePointer?)
}

public typealias PappconstrainChangeRoutine = PappconstrainChangeRoutineFn?

public typealias PappconstrainRegistration = Long

public fun interface PappstateChangeRoutineFn {
    public operator fun invoke(quiesced: Boolean, context: COpaquePointer?)
}

public typealias PappstateChangeRoutine = PappstateChangeRoutineFn?

public typealias PappstateRegistration = Long

public typealias PathcchOptions = UInt

public typealias PcsRet = UInt

public fun interface PfncansharefolderwFn {
    public operator fun invoke(pszpath: Pcwstr): Hresult
}

public typealias Pfncansharefolderw = PfncansharefolderwFn?

public fun interface PfnshowsharefolderuiwFn {
    public operator fun invoke(hwndparent: Hwnd, pszpath: Pcwstr): Hresult
}

public typealias Pfnshowsharefolderuiw = PfnshowsharefolderuiwFn?

public typealias PidisfFlags = Int

public typealias PidismOptions = Int

public typealias PidisrInfo = Int

public typealias PidIntsite = Int

public typealias PidIs = Int

public typealias PrfFlags = Int

public typealias Pubappinfoflags = Int

public typealias QitipfFlags = Int

public typealias QueryUserNotificationState = Int

public typealias Restrictions = Int

public typealias RefreshConstants = Int

public typealias ScaleChangeFlags = Int

public typealias ScnrtStatus = Int

public typealias Securelockcode = Int

public typealias SfbsFlags = Int

public typealias SfvmMessageId = Int

public typealias SfvsSelect = Int

public typealias Shard = Int

public typealias ShareRole = Int

public typealias ShcneId = UInt

public typealias ShcnfFlags = UInt

public typealias ShcnrfSource = Int

public typealias ShdidId = Int

public typealias Shellbrowsershowcontrol = Int

public typealias ShellAutocompleteFlags = UInt

public typealias ShellLinkDataFlags = Int

public typealias ShellUiComponent = Int

public typealias ShfmtId = UInt

public typealias ShfmtOpt = Int

public typealias ShfmtRet = UInt

public typealias ShgdfilFormat = Int

public typealias Shgdnf = UInt

public typealias ShgfiFlags = UInt

public typealias ShgfpType = Int

public typealias Shglobalcounter = Int

public typealias ShgsiFlags = UInt

public typealias ShopType = Int

public typealias ShregdelFlags = Int

public typealias ShregenumFlags = Int

public typealias Shstockiconid = Int

public typealias Siattribflags = Int

public typealias Sigdn = Int

public typealias Siigbf = Int

public typealias SlgpFlags = Int

public typealias SlrFlags = Int

public typealias Sminfoflags = Int

public typealias Sminfomask = Int

public typealias Sminfotype = Int

public typealias Sortdirection = Int

public typealias SortOrderType = Int

public typealias Spaction = Int

public typealias Sptext = Int

public typealias SsfMask = UInt

public typealias Stgop = Int

public typealias StorageProviderFileFlags = Int

public typealias Stpflag = Int

public fun interface SubclassprocFn {
    public operator fun invoke(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam, uidsubclass: ULong, dwrefdata: ULong): Lresult
}

public typealias Subclassproc = SubclassprocFn?

public typealias SvuiaStatus = Int

public typealias Syncmgrerrorflags = Int

public typealias Syncmgrflag = Int

public typealias Syncmgrhandlerflags = Int

public typealias Syncmgrinvokeflags = Int

public typealias Syncmgritemflags = Int

public typealias Syncmgritemstate = Int

public typealias Syncmgrloglevel = Int

public typealias Syncmgrregisterflags = Int

public typealias Syncmgrstatus = Int

public typealias SyncmgrCancelRequest = Int

public typealias SyncmgrConflictItemType = Int

public typealias SyncmgrControlFlags = Int

public typealias SyncmgrEventFlags = Int

public typealias SyncmgrEventLevel = Int

public typealias SyncmgrHandlerCapabilities = Int

public typealias SyncmgrHandlerPolicies = Int

public typealias SyncmgrHandlerType = Int

public typealias SyncmgrItemCapabilities = Int

public typealias SyncmgrItemPolicies = Int

public typealias SyncmgrPresenterChoice = Int

public typealias SyncmgrPresenterNextStep = Int

public typealias SyncmgrProgressStatus = Int

public typealias SyncmgrResolutionAbilities = Int

public typealias SyncmgrResolutionFeedback = Int

public typealias SyncmgrSyncControlFlags = Int

public typealias SyncmgrUpdateReason = Int

public typealias SecureLockIconConstants = Int

public typealias ShellFolderViewOptions = Int

public typealias ShellSpecialFolderConstants = Int

public typealias ShellWindowFindWindowOptions = Int

public typealias ShellWindowTypeConstants = Int

public typealias Tbpflag = Int

public typealias Thumbbuttonflags = Int

public typealias Thumbbuttonmask = Int

public typealias TiFlags = Int

public typealias Tlenumf = Int

public typealias TranslateurlInFlags = Int

public typealias ThumbnailStreamCacheOptions = Int

public typealias UndockReason = Int

public typealias UrlassociationdialogInFlags = Int

public typealias Urlis = Int

public typealias UrlPart = Int

public typealias UrlScheme = Int

public typealias ValidateuncOption = Int

public typealias Vpcolorflags = Int

public typealias Vpwatermarkflags = Int

public typealias WtsAlphatype = Int

public typealias WtsCacheflags = Int

public typealias WtsContextflags = Int

public typealias WtsFlags = Int

public typealias Browserframeoptions = Int

public typealias CdbeActions = Int

public typealias Expcmdflags = Int

public typealias Expcmdstate = Int

public typealias Explorerpanestate = Int

public typealias Expps = Int

public typealias KfDefinitionFlags = Int

public typealias KfRedirectionCapabilities = Int

public typealias KfRedirectFlags = Int

public typealias NmciiFlags = Int

public typealias NmcsaeiFlags = Int

public typealias Nstceclicktype = Int

public typealias Nstcehittest = Int

public typealias Nstcitemstate = Int

public typealias Nstcrootstyle = Int

public typealias Nstcstyle = Int

public typealias Opprogdlgf = Int

public typealias Pdmode = Int

public typealias Shcontf = Int

public typealias Sichintf = Int

public typealias Spbeginf = Int

public typealias Spinitf = Int

public typealias Sv3cvw3Flags = Int

public typealias Svgio = Int

public typealias Svsif = Int

public typealias TransferAdviseState = Int

public typealias TransferSourceFlags = Int
