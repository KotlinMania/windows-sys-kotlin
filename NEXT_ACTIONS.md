# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 33/249 (13.3%)
- **Function parity:** 2/8927 matched (target 61) — 0.0%
- **Class/type parity:** 263/22094 matched (target 287) — 1.2%
- **Combined symbol parity:** 265/31021 matched (target 348) — 0.9%
- **Average inline-code cosine:** 0.47 (function body across 1 matched files)
- **Average documentation cosine:** 1.00 (doc text across 1 matched files)
- **Cheat-zeroed Files:** 28
- **Critical Issues:** 33 files with <0.60 function similarity
- **Needs Review:** 0 files with 0.60-0.84 function similarity
- **Excellent:** 0 files with >=0.85 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. Shell.mod

- **Target:** `shell.Shell [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 5585310.0
- **Functions:** 0/137 matched (target 4)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 0/416 matched (target 1)
- **Missing types:** `AASHELLMENUFILENAME`, `AASHELLMENUITEM`, `ACENUMOPTION`, `ACTIVATEOPTIONS`, `ADJACENT_DISPLAY_EDGES`, `AHE_TYPE`, `AHTYPE`, `APPACTIONFLAGS`, `APPBARDATA`, `APPCATEGORYINFO`, `APPCATEGORYINFOLIST`, `APPDOCLISTTYPE`, `APPINFODATA`, `APPINFODATAFLAGS`, `APPLET_PROC`, `APPLICATION_VIEW_MIN_WIDTH`, `APPLICATION_VIEW_ORIENTATION`, `APPLICATION_VIEW_SIZE_PREFERENCE`, `APPLICATION_VIEW_STATE`, `ASSOCCLASS`, `ASSOCDATA`, `ASSOCENUM`, `ASSOCF`, `ASSOCIATIONELEMENT`, `ASSOCIATIONLEVEL`, `ASSOCIATIONTYPE`, `ASSOCKEY`, `ASSOCSTR`, `ASSOC_FILTER`, `ATTACHMENT_ACTION`, `ATTACHMENT_PROMPT`, `AUTOCOMPLETELISTOPTIONS`, `AUTOCOMPLETEOPTIONS`, `AUTO_SCROLL_DATA`, `BANDINFOSFB`, `BANDSITECID`, `BANDSITEINFO`, `BANNER_NOTIFICATION`, `BANNER_NOTIFICATION_EVENT`, `BASEBROWSERDATALH`, `BASEBROWSERDATAXP`, `BFFCALLBACK`, `BNSTATE`, `BROWSEINFOA`, `BROWSEINFOW`, `BrowserNavConstants`, `CABINETSTATE`, `CATEGORYINFO_FLAGS`, `CATEGORY_INFO`, `CATSORT_FLAGS`, `CDBURNINGEXTENSIONRET`, `CDCONTROLSTATEF`, `CIDA`, `CMINVOKECOMMANDINFO`, `CMINVOKECOMMANDINFOEX`, `CMINVOKECOMMANDINFOEX_REMOTE`, `CM_COLUMNINFO`, `CM_ENUM_FLAGS`, `CM_MASK`, `CM_SET_WIDTH_VALUE`, `CM_STATE`, `CONFIRM_CONFLICT_ITEM`, `CONFIRM_CONFLICT_RESULT_INFO`, `CPLINFO`, `CPVIEW`, `CREDENTIAL_PROVIDER_ACCOUNT_OPTIONS`, `CREDENTIAL_PROVIDER_CREDENTIAL_FIELD_OPTIONS`, `CREDENTIAL_PROVIDER_CREDENTIAL_SERIALIZATION`, `CREDENTIAL_PROVIDER_FIELD_DESCRIPTOR`, `CREDENTIAL_PROVIDER_FIELD_INTERACTIVE_STATE`, `CREDENTIAL_PROVIDER_FIELD_STATE`, `CREDENTIAL_PROVIDER_FIELD_TYPE`, `CREDENTIAL_PROVIDER_GET_SERIALIZATION_RESPONSE`, `CREDENTIAL_PROVIDER_STATUS_ICON`, `CREDENTIAL_PROVIDER_USAGE_SCENARIO`, `CSFV`, `CommandStateChangeConstants`, `DATABLOCK_HEADER`, `DATAOBJ_GET_ITEM_FLAGS`, `DEFAULTSAVEFOLDERTYPE`, `DEFAULT_FOLDER_MENU_RESTRICTIONS`, `DEFCONTEXTMENU`, `DEF_SHARE_ID`, `DELEGATEITEMID`, `DESKBANDCID`, `DESKBANDINFO`, `DESKTOP_SLIDESHOW_DIRECTION`, `DESKTOP_SLIDESHOW_OPTIONS`, `DESKTOP_SLIDESHOW_STATE`, `DESKTOP_WALLPAPER_POSITION`, `DETAILSINFO`, `DFMICS`, `DFM_CMD`, `DFM_MESSAGE_ID`, `DISPLAY_DEVICE_TYPE`, `DLLGETVERSIONPROC`, `DLLVERSIONINFO`, `DLLVERSIONINFO2`, `DRAGINFOA`, `DRAGINFOW`, `DROPDESCRIPTION`, `DROPFILES`, `DROPIMAGETYPE`, `DSH_FLAGS`, `EC_HOST_UI_MODE`, `EDGE_GESTURE_KIND`, `EXPLORER_BROWSER_FILL_FLAGS`, `EXPLORER_BROWSER_OPTIONS`, `EXP_DARWIN_LINK`, `EXP_PROPERTYSTORAGE`, `EXP_SPECIAL_FOLDER`, `EXP_SZ_LINK`, `EXTRASEARCH`, `FDAP`, `FDE_OVERWRITE_RESPONSE`, `FDE_SHAREVIOLATION_RESPONSE`, `FD_FLAGS`, `FFFP_MODE`, `FILEDESCRIPTORA`, `FILEDESCRIPTORW`, `FILEGROUPDESCRIPTORA`, `FILEGROUPDESCRIPTORW`, `FILEOPENDIALOGOPTIONS`, `FILEOPERATION_FLAGS`, `FILETYPEATTRIBUTEFLAGS`, `FILE_ATTRIBUTES_ARRAY`, `FILE_OPERATION_FLAGS2`, `FILE_USAGE_TYPE`, `FLYOUT_PLACEMENT`, `FOLDERFLAGS`, `FOLDERLOGICALVIEWMODE`, `FOLDERSETDATA`, `FOLDERSETTINGS`, `FOLDERVIEWMODE`, `FOLDERVIEWOPTIONS`, `FOLDER_ENUM_MODE`, `FVTEXTTYPE`, `GPFIDL_FLAGS`, `HDROP`, `HELPINFO`, `HELPWININFOA`, `HELPWININFOW`, `HELP_INFO_TYPE`, `HLBWIF_FLAGS`, `HLBWINFO`, `HLFNAMEF`, `HLID_INFO`, `HLINKGETREF`, `HLINKMISC`, `HLINKSETF`, `HLINKWHICHMK`, `HLITEM`, `HLNF`, `HLQF_INFO`, `HLSHORTCUTF`, `HLSR`, `HLTBINFO`, `HLTRANSLATEF`, `HOMEGROUPSHARINGCHOICES`, `HPSXA`, `IEPDNFLAGS`, `IESHORTCUTFLAGS`, `ITEMSPACING`, `IURL_INVOKECOMMAND_FLAGS`, `IURL_SETURL_FLAGS`, `KF_CATEGORY`, `KNOWNDESTCATEGORY`, `KNOWNFOLDER_DEFINITION`, `KNOWN_FOLDER_FLAG`, `LIBRARYFOLDERFILTER`, `LIBRARYMANAGEDIALOGOPTIONS`, `LIBRARYOPTIONFLAGS`, `LIBRARYSAVEFLAGS`, `LPFNDFMCALLBACK`, `LPFNVIEWCALLBACK`, `MENUBANDHANDLERCID`, `MENUPOPUPPOPUPFLAGS`, `MENUPOPUPSELECT`, `MERGE_UPDATE_STATUS`, `MIMEASSOCIATIONDIALOG_IN_FLAGS`, `MM_FLAGS`, `MONITOR_APP_VISIBILITY`, `MULTIKEYHELPA`, `MULTIKEYHELPW`, `NAMESPACEWALKFLAG`, `NATIVE_DISPLAY_ORIENTATION`, `NC_ADDRESS`, `NEWCPLINFOA`, `NEWCPLINFOW`, `NOTIFYICONDATAA`, `NOTIFYICONDATAW`, `NOTIFYICONIDENTIFIER`, `NOTIFY_ICON_DATA_FLAGS`, `NOTIFY_ICON_INFOTIP_FLAGS`, `NOTIFY_ICON_MESSAGE`, `NOTIFY_ICON_STATE`, `NRESARRAY`, `NSTCCUSTOMDRAW`, `NSTCFOLDERCAPABILITIES`, `NSTCGNI`, `NSTCSTYLE2`, `NT_CONSOLE_PROPS`, `NT_FE_CONSOLE_PROPS`, `NWMF`, `NewProcessCauseConstants`, `OPENASINFO`, `OPEN_AS_INFO_FLAGS`, `OPEN_PRINTER_PROPS_INFOA`, `OPEN_PRINTER_PROPS_INFOW`, `OS`, `OfflineFolderStatus`, `PACKAGE_EXECUTION_STATE`, `PAPPCONSTRAIN_CHANGE_ROUTINE`, `PAPPCONSTRAIN_REGISTRATION`, `PAPPSTATE_CHANGE_ROUTINE`, `PAPPSTATE_REGISTRATION`, `PARSEDURLA`, `PARSEDURLW`, `PATHCCH_OPTIONS`, `PCS_RET`, `PERSIST_FOLDER_TARGET_INFO`, `PFNCANSHAREFOLDERW`, `PFNSHOWSHAREFOLDERUIW`, `PIDISF_FLAGS`, `PIDISM_OPTIONS`, `PIDISR_INFO`, `PID_INTSITE`, `PID_IS`, `PREVIEWHANDLERFRAMEINFO`, `PRF_FLAGS`, `PROFILEINFOA`, `PROFILEINFOW`, `PUBAPPINFO`, `PUBAPPINFOFLAGS`, `QCMINFO`, `QCMINFO_IDMAP`, `QCMINFO_IDMAP_PLACEMENT`, `QITAB`, `QITIPF_FLAGS`, `QUERY_USER_NOTIFICATION_STATE`, `RESTRICTIONS`, `RefreshConstants`, `SCALE_CHANGE_FLAGS`, `SCNRT_STATUS`, `SECURELOCKCODE`, `SFBS_FLAGS`, `SFVM_HELPTOPIC_DATA`, `SFVM_MESSAGE_ID`, `SFVM_PROPPAGE_DATA`, `SFVS_SELECT`, `SFV_CREATE`, `SFV_SETITEMPOS`, `SHARD`, `SHARDAPPIDINFO`, `SHARDAPPIDINFOIDLIST`, `SHARDAPPIDINFOLINK`, `SHARE_ROLE`, `SHCNE_ID`, `SHCNF_FLAGS`, `SHCNRF_SOURCE`, `SHCOLUMNDATA`, `SHCOLUMNINFO`, `SHCOLUMNINIT`, `SHCREATEPROCESSINFOW`, `SHChangeDWORDAsIDList`, `SHChangeNotifyEntry`, `SHChangeProductKeyAsIDList`, `SHChangeUpdateImageIDList`, `SHDESCRIPTIONID`, `SHDID_ID`, `SHDRAGIMAGE`, `SHELLBROWSERSHOWCONTROL`, `SHELLEXECUTEINFOA`, `SHELLEXECUTEINFOW`, `SHELLFLAGSTATE`, `SHELLSTATEA`, `SHELLSTATEW`, `SHELL_AUTOCOMPLETE_FLAGS`, `SHELL_ITEM_RESOURCE`, `SHELL_LINK_DATA_FLAGS`, `SHELL_UI_COMPONENT`, `SHFILEINFOA`, `SHFILEINFOW`, `SHFILEOPSTRUCTA`, `SHFILEOPSTRUCTW`, `SHFMT_ID`, `SHFMT_OPT`, `SHFMT_RET`, `SHFOLDERCUSTOMSETTINGS`, `SHGDFIL_FORMAT`, `SHGDNF`, `SHGFI_FLAGS`, `SHGFP_TYPE`, `SHGLOBALCOUNTER`, `SHGSI_FLAGS`, `SHNAMEMAPPINGA`, `SHNAMEMAPPINGW`, `SHOP_TYPE`, `SHQUERYRBINFO`, `SHREGDEL_FLAGS`, `SHREGENUM_FLAGS`, `SHSTOCKICONID`, `SHSTOCKICONINFO`, `SIATTRIBFLAGS`, `SIGDN`, `SIIGBF`, `SLGP_FLAGS`, `SLOWAPPINFO`, `SLR_FLAGS`, `SMCSHCHANGENOTIFYSTRUCT`, `SMDATA`, `SMINFO`, `SMINFOFLAGS`, `SMINFOMASK`, `SMINFOTYPE`, `SORTCOLUMN`, `SORTDIRECTION`, `SORT_ORDER_TYPE`, `SPACTION`, `SPTEXT`, `SSF_MASK`, `STGOP`, `STORAGE_PROVIDER_FILE_FLAGS`, `STPFLAG`, `SUBCLASSPROC`, `SV2CVW2_PARAMS`, `SVUIA_STATUS`, `SYNCMGRERRORFLAGS`, `SYNCMGRFLAG`, `SYNCMGRHANDLERFLAGS`, `SYNCMGRHANDLERINFO`, `SYNCMGRINVOKEFLAGS`, `SYNCMGRITEM`, `SYNCMGRITEMFLAGS`, `SYNCMGRITEMSTATE`, `SYNCMGRLOGERRORINFO`, `SYNCMGRLOGLEVEL`, `SYNCMGRPROGRESSITEM`, `SYNCMGRREGISTERFLAGS`, `SYNCMGRSTATUS`, `SYNCMGR_CANCEL_REQUEST`, `SYNCMGR_CONFLICT_ID_INFO`, `SYNCMGR_CONFLICT_ITEM_TYPE`, `SYNCMGR_CONTROL_FLAGS`, `SYNCMGR_EVENT_FLAGS`, `SYNCMGR_EVENT_LEVEL`, `SYNCMGR_HANDLER_CAPABILITIES`, `SYNCMGR_HANDLER_POLICIES`, `SYNCMGR_HANDLER_TYPE`, `SYNCMGR_ITEM_CAPABILITIES`, `SYNCMGR_ITEM_POLICIES`, `SYNCMGR_PRESENTER_CHOICE`, `SYNCMGR_PRESENTER_NEXT_STEP`, `SYNCMGR_PROGRESS_STATUS`, `SYNCMGR_RESOLUTION_ABILITIES`, `SYNCMGR_RESOLUTION_FEEDBACK`, `SYNCMGR_SYNC_CONTROL_FLAGS`, `SYNCMGR_UPDATE_REASON`, `SecureLockIconConstants`, `ShellFolderViewOptions`, `ShellSpecialFolderConstants`, `ShellWindowFindWindowOptions`, `ShellWindowTypeConstants`, `TBINFO`, `TBPFLAG`, `THUMBBUTTON`, `THUMBBUTTONFLAGS`, `THUMBBUTTONMASK`, `TI_FLAGS`, `TLENUMF`, `TOOLBARITEM`, `TRANSLATEURL_IN_FLAGS`, `ThumbnailStreamCacheOptions`, `UNDOCK_REASON`, `URLASSOCIATIONDIALOG_IN_FLAGS`, `URLINVOKECOMMANDINFOA`, `URLINVOKECOMMANDINFOW`, `URLIS`, `URL_PART`, `URL_SCHEME`, `VALIDATEUNC_OPTION`, `VPCOLORFLAGS`, `VPWATERMARKFLAGS`, `WINDOWDATA`, `WTS_ALPHATYPE`, `WTS_CACHEFLAGS`, `WTS_CONTEXTFLAGS`, `WTS_FLAGS`, `WTS_THUMBNAILID`, `_BROWSERFRAMEOPTIONS`, `_CDBE_ACTIONS`, `_EXPCMDFLAGS`, `_EXPCMDSTATE`, `_EXPLORERPANESTATE`, `_EXPPS`, `_KF_DEFINITION_FLAGS`, `_KF_REDIRECTION_CAPABILITIES`, `_KF_REDIRECT_FLAGS`, `_NMCII_FLAGS`, `_NMCSAEI_FLAGS`, `_NSTCECLICKTYPE`, `_NSTCEHITTEST`, `_NSTCITEMSTATE`, `_NSTCROOTSTYLE`, `_NSTCSTYLE`, `_OPPROGDLGF`, `_PDMODE`, `_SHCONTF`, `_SICHINTF`, `_SPBEGINF`, `_SPINITF`, `_SV3CVW3_FLAGS`, `_SVGIO`, `_SVSIF`, `_TRANSFER_ADVISE_STATE`, `_TRANSFER_SOURCE_FLAGS`

### 2. Windows.Win32.Storage.FileSystem.mod

- **Target:** `filesystem.FileType [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 4517910.0
- **Functions:** 0/124 matched (target 6)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 32/355 matched (target 33)
- **Missing types:** `CACHE_ACCESS_CHECK`, `CACHE_DESTROY_CALLBACK`, `CACHE_KEY_COMPARE`, `CACHE_KEY_HASH`, `CACHE_READ_CALLBACK`, `CLAIMMEDIALABEL`, `CLAIMMEDIALABELEX`, `CLFS_BLOCK_ALLOCATION`, `CLFS_BLOCK_DEALLOCATION`, `CLFS_CONTEXT_MODE`, `CLFS_FLAG`, `CLFS_IOSTATS_CLASS`, `CLFS_LOG_ARCHIVE_MODE`, `CLFS_LOG_NAME_INFORMATION`, `CLFS_MGMT_NOTIFICATION`, `CLFS_MGMT_NOTIFICATION_TYPE`, `CLFS_MGMT_POLICY`, `CLFS_MGMT_POLICY_0_6`, `CLFS_MGMT_POLICY_0_5`, `CLFS_MGMT_POLICY_0_3`, `CLFS_MGMT_POLICY_0_4`, `CLFS_MGMT_POLICY_0_0`, `CLFS_MGMT_POLICY_0_1`, `CLFS_MGMT_POLICY_0_9`, `CLFS_MGMT_POLICY_0_7`, `CLFS_MGMT_POLICY_0_2`, `CLFS_MGMT_POLICY_0_8`, `CLFS_MGMT_POLICY_TYPE`, `CLFS_NODE_ID`, `CLFS_PHYSICAL_LSN_INFORMATION`, `CLFS_STREAM_ID_INFORMATION`, `CLS_ARCHIVE_DESCRIPTOR`, `CLS_CONTAINER_INFORMATION`, `CLS_CONTEXT_MODE`, `CLS_INFORMATION`, `CLS_IOSTATS_CLASS`, `CLS_IO_STATISTICS`, `CLS_IO_STATISTICS_HEADER`, `CLS_LOG_INFORMATION_CLASS`, `CLS_LSN`, `CLS_SCAN_CONTEXT`, `CLS_WRITE_ENTRY`, `CONNECTION_INFO_0`, `CONNECTION_INFO_1`, `COPYFILE2_COPY_PHASE`, `COPYFILE2_EXTENDED_PARAMETERS`, `COPYFILE2_EXTENDED_PARAMETERS_V2`, `COPYFILE2_MESSAGE`, `COPYFILE2_MESSAGE_0_1`, `COPYFILE2_MESSAGE_0_0`, `COPYFILE2_MESSAGE_0_5`, `COPYFILE2_MESSAGE_0_4`, `COPYFILE2_MESSAGE_0_3`, `COPYFILE2_MESSAGE_0_2`, `COPYFILE2_MESSAGE_ACTION`, `COPYFILE2_MESSAGE_TYPE`, `COPYFILE2_V2_FLAGS`, `COPYFILE_FLAGS`, `COPYPROGRESSROUTINE_PROGRESS`, `CREATE_TAPE_PARTITION_METHOD`, `DEFINE_DOS_DEVICE_FLAGS`, `DISKQUOTA_USERNAME_RESOLVE`, `DISKQUOTA_USER_INFORMATION`, `DISK_SPACE_INFORMATION`, `EFS_CERTIFICATE_BLOB`, `EFS_COMPATIBILITY_INFO`, `EFS_DECRYPTION_STATUS_INFO`, `EFS_ENCRYPTION_STATUS_INFO`, `EFS_HASH_BLOB`, `EFS_KEY_INFO`, `EFS_PIN_BLOB`, `EFS_RPC_BLOB`, `EFS_VERSION_INFO`, `ENCRYPTED_FILE_METADATA_SIGNATURE`, `ENCRYPTION_CERTIFICATE`, `ENCRYPTION_CERTIFICATE_HASH`, `ENCRYPTION_CERTIFICATE_HASH_LIST`, `ENCRYPTION_CERTIFICATE_LIST`, `ENCRYPTION_PROTECTOR`, `ENCRYPTION_PROTECTOR_LIST`, `ERASE_TAPE_TYPE`, `FCACHE_CREATE_CALLBACK`, `FCACHE_RICHCREATE_CALLBACK`, `FH_OVERLAPPED`, `FILE_ACTION`, `FILE_DEVICE_TYPE`, `FILE_FLUSH_MODE`, `FILE_FULL_DIR_INFO`, `FILE_ID_BOTH_DIR_INFO`, `FILE_ID_DESCRIPTOR`, `FILE_ID_EXTD_DIR_INFO`, `FILE_ID_TYPE`, `FILE_INFO_2`, `FILE_INFO_3`, `FILE_INFO_BY_HANDLE_CLASS`, `FILE_INFO_FLAGS_PERMISSIONS`, `FILE_IO_PRIORITY_HINT_INFO`, `FILE_NOTIFY_CHANGE`, `FILE_NOTIFY_EXTENDED_INFORMATION`, `FILE_NOTIFY_INFORMATION`, `FILE_REMOTE_PROTOCOL_INFO`, `FILE_REMOTE_PROTOCOL_INFO_0`, `FILE_REMOTE_PROTOCOL_INFO_1_0`, `FILE_REMOTE_PROTOCOL_INFO_1_0_0`, `FILE_REMOTE_PROTOCOL_INFO_1_0_1`, `FILE_WRITE_FLAGS`, `FINDEX_INFO_LEVELS`, `FINDEX_SEARCH_OPS`, `FIND_FIRST_EX_FLAGS`, `FIO_CONTEXT`, `GETFINALPATHNAMEBYHANDLE_FLAGS`, `GET_FILEEX_INFO_LEVELS`, `GET_FILE_VERSION_INFO_FLAGS`, `GET_TAPE_DRIVE_PARAMETERS_OPERATION`, `HIORING`, `IORING_BUFFER_INFO`, `IORING_BUFFER_REF`, `IORING_CAPABILITIES`, `IORING_CQE`, `IORING_CREATE_ADVISORY_FLAGS`, `IORING_CREATE_FLAGS`, `IORING_CREATE_REQUIRED_FLAGS`, `IORING_FEATURE_FLAGS`, `IORING_HANDLE_REF`, `IORING_INFO`, `IORING_OP_CODE`, `IORING_REF_KIND`, `IORING_REGISTERED_BUFFER`, `IORING_SQE_FLAGS`, `IORING_VERSION`, `KCRM_MARSHAL_HEADER`, `KCRM_PROTOCOL_BLOB`, `KCRM_TRANSACTION_BLOB`, `LOCK_FILE_FLAGS`, `LOG_MANAGEMENT_CALLBACKS`, `LPPROGRESS_ROUTINE`, `LPPROGRESS_ROUTINE_CALLBACK_REASON`, `LZOPENFILE_STYLE`, `MAXMEDIALABEL`, `MOVE_FILE_FLAGS`, `MediaLabelInfo`, `NAME_CACHE_CONTEXT`, `NTMS_ALLOCATION_INFORMATION`, `NTMS_ASYNC_IO`, `NTMS_CHANGERINFORMATIONA`, `NTMS_CHANGERINFORMATIONW`, `NTMS_CHANGERTYPEINFORMATIONA`, `NTMS_CHANGERTYPEINFORMATIONW`, `NTMS_COMPUTERINFORMATION`, `NTMS_DRIVEINFORMATIONA`, `NTMS_DRIVEINFORMATIONW`, `NTMS_DRIVETYPEINFORMATIONA`, `NTMS_DRIVETYPEINFORMATIONW`, `NTMS_FILESYSTEM_INFO`, `NTMS_I1_LIBRARYINFORMATION`, `NTMS_I1_LIBREQUESTINFORMATIONA`, `NTMS_I1_LIBREQUESTINFORMATIONW`, `NTMS_I1_OBJECTINFORMATIONA`, `NTMS_I1_OBJECTINFORMATIONW`, `NTMS_I1_OPREQUESTINFORMATIONA`, `NTMS_I1_OPREQUESTINFORMATIONW`, `NTMS_I1_PARTITIONINFORMATIONA`, `NTMS_I1_PARTITIONINFORMATIONW`, `NTMS_I1_PMIDINFORMATIONA`, `NTMS_I1_PMIDINFORMATIONW`, `NTMS_IEDOORINFORMATION`, `NTMS_IEPORTINFORMATION`, `NTMS_LIBRARYINFORMATION`, `NTMS_LIBREQUESTINFORMATIONA`, `NTMS_LIBREQUESTINFORMATIONW`, `NTMS_LMIDINFORMATION`, `NTMS_MEDIAPOOLINFORMATION`, `NTMS_MEDIATYPEINFORMATION`, `NTMS_MOUNT_INFORMATION`, `NTMS_NOTIFICATIONINFORMATION`, `NTMS_OBJECTINFORMATIONA`, `NTMS_OBJECTINFORMATIONW`, `NTMS_OMID_TYPE`, `NTMS_OPREQUESTINFORMATIONA`, `NTMS_OPREQUESTINFORMATIONW`, `NTMS_PARTITIONINFORMATIONA`, `NTMS_PARTITIONINFORMATIONW`, `NTMS_PMIDINFORMATIONA`, `NTMS_PMIDINFORMATIONW`, `NTMS_STORAGESLOTINFORMATION`, `NtmsAccessMask`, `NtmsAllocateOptions`, `NtmsAllocationPolicy`, `NtmsAsyncOperations`, `NtmsAsyncStatus`, `NtmsBarCodeState`, `NtmsCreateNtmsMediaOptions`, `NtmsCreateOptions`, `NtmsDeallocationPolicy`, `NtmsDismountOptions`, `NtmsDoorState`, `NtmsDriveState`, `NtmsDriveType`, `NtmsEjectOperation`, `NtmsEnumerateOption`, `NtmsInjectOperation`, `NtmsInventoryMethod`, `NtmsLibRequestFlags`, `NtmsLibraryFlags`, `NtmsLibraryType`, `NtmsLmOperation`, `NtmsLmState`, `NtmsMediaPoolPolicy`, `NtmsMediaState`, `NtmsMountOptions`, `NtmsMountPriority`, `NtmsNotificationOperations`, `NtmsObjectsTypes`, `NtmsOpRequestFlags`, `NtmsOperationalState`, `NtmsOpreqCommand`, `NtmsOpreqState`, `NtmsPartitionState`, `NtmsPoolType`, `NtmsPortContent`, `NtmsPortPosition`, `NtmsReadWriteCharacteristics`, `NtmsSessionOptions`, `NtmsSlotState`, `NtmsUIOperations`, `NtmsUITypes`, `PCLFS_COMPLETION_ROUTINE`, `PCOPYFILE2_PROGRESS_ROUTINE`, `PFE_EXPORT_FUNC`, `PFE_IMPORT_FUNC`, `PFN_IO_COMPLETION`, `PLOG_FULL_HANDLER_CALLBACK`, `PLOG_TAIL_ADVANCE_CALLBACK`, `PLOG_UNPINNED_CALLBACK`, `PREPARE_TAPE_OPERATION`, `PRIORITY_HINT`, `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS`, `REPARSE_GUID_DATA_BUFFER`, `REPARSE_GUID_DATA_BUFFER_0`, `REPLACE_FILE_FLAGS`, `SERVER_ALIAS_INFO_0`, `SERVER_CERTIFICATE_INFO_0`, `SERVER_CERTIFICATE_TYPE`, `SESSION_INFO_0`, `SESSION_INFO_1`, `SESSION_INFO_10`, `SESSION_INFO_2`, `SESSION_INFO_502`, `SESSION_INFO_USER_FLAGS`, `SHARE_INFO_0`, `SHARE_INFO_1`, `SHARE_INFO_1004`, `SHARE_INFO_1005`, `SHARE_INFO_1006`, `SHARE_INFO_1501`, `SHARE_INFO_1503`, `SHARE_INFO_2`, `SHARE_INFO_501`, `SHARE_INFO_502`, `SHARE_INFO_503`, `SHARE_INFO_PERMISSIONS`, `SHARE_TYPE`, `STAT_SERVER_0`, `STAT_WORKSTATION_0`, `STORAGE_BUS_TYPE`, `STREAM_INFO_LEVELS`, `SYMBOLIC_LINK_FLAGS`, `TAPEMARK_TYPE`, `TAPE_ERASE`, `TAPE_GET_POSITION`, `TAPE_INFORMATION_TYPE`, `TAPE_POSITION_METHOD`, `TAPE_POSITION_TYPE`, `TAPE_PREPARE`, `TAPE_SET_POSITION`, `TAPE_WRITE_MARKS`, `TRANSACTION_NOTIFICATION`, `TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT`, `TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT`, `TRANSACTION_NOTIFICATION_RECOVERY_ARGUMENT`, `TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT`, `TRANSACTION_NOTIFICATION_TM_ONLINE_ARGUMENT`, `TRANSACTION_OUTCOME`, `TXFS_MINIVERSION`, `TXF_ID`, `TXF_ID_0`, `TXF_LOG_RECORD_AFFECTED_FILE`, `TXF_LOG_RECORD_BASE`, `TXF_LOG_RECORD_TRUNCATE`, `TXF_LOG_RECORD_TYPE`, `TXF_LOG_RECORD_WRITE`, `VER_FIND_FILE_FLAGS`, `VER_FIND_FILE_STATUS`, `VER_INSTALL_FILE_FLAGS`, `VER_INSTALL_FILE_STATUS`, `VOLUME_ALLOCATE_BC_STREAM_INPUT`, `VOLUME_ALLOCATE_BC_STREAM_OUTPUT`, `VOLUME_ALLOCATION_HINT_INPUT`, `VOLUME_ALLOCATION_HINT_OUTPUT`, `VOLUME_CRITICAL_IO`, `VOLUME_FAILOVER_SET`, `VOLUME_GET_BC_PROPERTIES_INPUT`, `VOLUME_GET_BC_PROPERTIES_OUTPUT`, `VOLUME_LOGICAL_OFFSET`, `VOLUME_NUMBER`, `VOLUME_PHYSICAL_OFFSET`, `VOLUME_PHYSICAL_OFFSETS`, `VOLUME_READ_PLEX_INPUT`, `VOLUME_SET_GPT_ATTRIBUTES_INFORMATION`, `VOLUME_SHRINK_INFO`, `VS_FIXEDFILEINFO`, `VS_FIXEDFILEINFO_FILE_FLAGS`, `VS_FIXEDFILEINFO_FILE_OS`, `VS_FIXEDFILEINFO_FILE_SUBTYPE`, `VS_FIXEDFILEINFO_FILE_TYPE`, `WIM_ENTRY_INFO`, `WIM_EXTERNAL_FILE_INFO`, `WIN32_STREAM_ID`, `WIN_STREAM_ID`, `WOF_FILE_COMPRESSION_INFO_V0`, `WOF_FILE_COMPRESSION_INFO_V1`, `WofEnumEntryProc`, `WofEnumFilesProc`

### 3. Globalization.mod

- **Target:** `globalization.Globalization [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 3615810.0
- **Functions:** 0/30 matched (target 0)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 0/328 matched (target 0)
- **Missing types:** `CALDATETIME`, `CALDATETIME_DATEUNIT`, `CALINFO_ENUMPROCA`, `CALINFO_ENUMPROCEXA`, `CALINFO_ENUMPROCEXEX`, `CALINFO_ENUMPROCEXW`, `CALINFO_ENUMPROCW`, `CHARSETINFO`, `CODEPAGE_ENUMPROCA`, `CODEPAGE_ENUMPROCW`, `COMPARESTRING_RESULT`, `COMPARE_STRING_FLAGS`, `CORRECTIVE_ACTION`, `CPINFO`, `CPINFOEXA`, `CPINFOEXW`, `CURRENCYFMTA`, `CURRENCYFMTW`, `DATEFMT_ENUMPROCA`, `DATEFMT_ENUMPROCEXA`, `DATEFMT_ENUMPROCEXEX`, `DATEFMT_ENUMPROCEXW`, `DATEFMT_ENUMPROCW`, `DetectEncodingInfo`, `ENUMTEXTMETRICA`, `ENUMTEXTMETRICW`, `ENUM_DATE_FORMATS_FLAGS`, `ENUM_SYSTEM_CODE_PAGES_FLAGS`, `ENUM_SYSTEM_LANGUAGE_GROUPS_FLAGS`, `FILEMUIINFO`, `FOLD_STRING_MAP_FLAGS`, `FONTSIGNATURE`, `GEO_ENUMNAMEPROC`, `GEO_ENUMPROC`, `GOFFSET`, `HSAVEDUILANGUAGES`, `IS_TEXT_UNICODE_RESULT`, `IS_VALID_LOCALE_FLAGS`, `LANGGROUPLOCALE_ENUMPROCA`, `LANGGROUPLOCALE_ENUMPROCW`, `LANGUAGEGROUP_ENUMPROCA`, `LANGUAGEGROUP_ENUMPROCW`, `LOCALESIGNATURE`, `LOCALE_ENUMPROCA`, `LOCALE_ENUMPROCEX`, `LOCALE_ENUMPROCW`, `MAPPING_DATA_RANGE`, `MAPPING_ENUM_OPTIONS`, `MAPPING_OPTIONS`, `MAPPING_PROPERTY_BAG`, `MAPPING_SERVICE_INFO`, `MIMECONTF`, `MIMECPINFO`, `MIMECSETINFO`, `MLCONVCHAR`, `MLCP`, `MLDETECTCP`, `MLSTR_FLAGS`, `MULTI_BYTE_TO_WIDE_CHAR_FLAGS`, `NEWTEXTMETRICEXA`, `NEWTEXTMETRICEXW`, `NLSVERSIONINFO`, `NLSVERSIONINFOEX`, `NORM_FORM`, `NUMBERFMTA`, `NUMBERFMTW`, `OPENTYPE_FEATURE_RECORD`, `PFN_MAPPINGCALLBACKPROC`, `RFC1766INFO`, `SCRIPTCONTF`, `SCRIPTFONTCONTF`, `SCRIPTFONTINFO`, `SCRIPTINFO`, `SCRIPT_ANALYSIS`, `SCRIPT_CHARPROP`, `SCRIPT_CONTROL`, `SCRIPT_DIGITSUBSTITUTE`, `SCRIPT_FONTPROPERTIES`, `SCRIPT_GLYPHPROP`, `SCRIPT_IS_COMPLEX_FLAGS`, `SCRIPT_ITEM`, `SCRIPT_JUSTIFY`, `SCRIPT_LOGATTR`, `SCRIPT_PROPERTIES`, `SCRIPT_STATE`, `SCRIPT_TABDEF`, `SCRIPT_VISATTR`, `SYSGEOCLASS`, `SYSGEOTYPE`, `SYSNLS_FUNCTION`, `TEXTRANGE_PROPERTIES`, `TIMEFMT_ENUMPROCA`, `TIMEFMT_ENUMPROCEX`, `TIMEFMT_ENUMPROCW`, `TIME_FORMAT_FLAGS`, `TRANSLATE_CHARSET_INFO_FLAGS`, `UAcceptResult`, `UAlphabeticIndexLabelType`, `UBiDi`, `UBiDiClassCallback`, `UBiDiDirection`, `UBiDiMirroring`, `UBiDiOrder`, `UBiDiReorderingMode`, `UBiDiReorderingOption`, `UBiDiTransform`, `UBidiPairedBracketType`, `UBlockCode`, `UBreakIterator`, `UBreakIteratorType`, `UCPMap`, `UCPMapRangeOption`, `UCPMapValueFilter`, `UCPTrie`, `UCPTrieType`, `UCPTrieValueWidth`, `UCalendarAMPMs`, `UCalendarAttribute`, `UCalendarDateFields`, `UCalendarDaysOfWeek`, `UCalendarDisplayNameType`, `UCalendarLimitType`, `UCalendarMonths`, `UCalendarType`, `UCalendarWallTimeOption`, `UCalendarWeekdayType`, `UCaseMap`, `UCharCategory`, `UCharDirection`, `UCharEnumTypeRange`, `UCharIterator`, `UCharIteratorCurrent`, `UCharIteratorGetIndex`, `UCharIteratorGetState`, `UCharIteratorHasNext`, `UCharIteratorHasPrevious`, `UCharIteratorMove`, `UCharIteratorNext`, `UCharIteratorOrigin`, `UCharIteratorPrevious`, `UCharIteratorReserved`, `UCharIteratorSetState`, `UCharNameChoice`, `UCharsetDetector`, `UCharsetMatch`, `UColAttribute`, `UColAttributeValue`, `UColBoundMode`, `UColReorderCode`, `UColRuleOption`, `UCollationElements`, `UCollationResult`, `UCollator`, `UConstrainedFieldPosition`, `UConverter`, `UConverterCallbackReason`, `UConverterFromUCallback`, `UConverterFromUnicodeArgs`, `UConverterPlatform`, `UConverterSelector`, `UConverterToUCallback`, `UConverterToUnicodeArgs`, `UConverterType`, `UConverterUnicodeSet`, `UCurrCurrencyType`, `UCurrNameStyle`, `UCurrencySpacing`, `UCurrencyUsage`, `UDateAbsoluteUnit`, `UDateDirection`, `UDateFormatBooleanAttribute`, `UDateFormatField`, `UDateFormatStyle`, `UDateFormatSymbolType`, `UDateFormatSymbols`, `UDateIntervalFormat`, `UDateRelativeDateTimeFormatterStyle`, `UDateRelativeUnit`, `UDateTimePGDisplayWidth`, `UDateTimePatternConflict`, `UDateTimePatternField`, `UDateTimePatternMatchOptions`, `UDateTimeScale`, `UDecompositionType`, `UDialectHandling`, `UDisplayContext`, `UDisplayContextType`, `UEastAsianWidth`, `UEnumCharNamesFn`, `UEnumeration`, `UErrorCode`, `UFieldCategory`, `UFieldPosition`, `UFieldPositionIterator`, `UFormattableType`, `UFormattedDateInterval`, `UFormattedList`, `UFormattedNumber`, `UFormattedNumberRange`, `UFormattedRelativeDateTime`, `UFormattedValue`, `UGender`, `UGenderInfo`, `UGraphemeClusterBreak`, `UHangulSyllableType`, `UHashtable`, `UIDNA`, `UIDNAInfo`, `UILANGUAGE_ENUMPROCA`, `UILANGUAGE_ENUMPROCW`, `UIndicPositionalCategory`, `UIndicSyllabicCategory`, `UJoiningGroup`, `UJoiningType`, `ULayoutType`, `ULineBreak`, `ULineBreakTag`, `UListFormatter`, `UListFormatterField`, `UListFormatterType`, `UListFormatterWidth`, `ULocAvailableType`, `ULocDataLocaleType`, `ULocaleData`, `ULocaleDataDelimiterType`, `ULocaleDataExemplarSetType`, `ULocaleDisplayNames`, `UMeasureFormatWidth`, `UMeasurementSystem`, `UMemAllocFn`, `UMemFreeFn`, `UMemReallocFn`, `UMessagePatternApostropheMode`, `UMessagePatternArgType`, `UMessagePatternPartType`, `UMutableCPTrie`, `UNESCAPE_CHAR_AT`, `UNICODERANGE`, `UNormalization2Mode`, `UNormalizationCheckResult`, `UNormalizationMode`, `UNormalizer2`, `UNumberCompactStyle`, `UNumberDecimalSeparatorDisplay`, `UNumberFormatAttribute`, `UNumberFormatAttributeValue`, `UNumberFormatFields`, `UNumberFormatPadPosition`, `UNumberFormatRoundingMode`, `UNumberFormatStyle`, `UNumberFormatSymbol`, `UNumberFormatTextAttribute`, `UNumberFormatter`, `UNumberGroupingStrategy`, `UNumberRangeCollapse`, `UNumberRangeIdentityFallback`, `UNumberRangeIdentityResult`, `UNumberSignDisplay`, `UNumberUnitWidth`, `UNumberingSystem`, `UNumericType`, `UParseError`, `UPluralRules`, `UPluralType`, `UProperty`, `UPropertyNameChoice`, `URegexFindProgressCallback`, `URegexMatchCallback`, `URegexpFlag`, `URegion`, `URegionType`, `URegularExpression`, `URelativeDateTimeFormatter`, `URelativeDateTimeFormatterField`, `URelativeDateTimeUnit`, `UReplaceableCallbacks`, `UResType`, `UResourceBundle`, `URestrictionLevel`, `UScriptCode`, `UScriptUsage`, `USearch`, `USearchAttribute`, `USearchAttributeValue`, `USentenceBreak`, `USentenceBreakTag`, `USerializedSet`, `USet`, `USetSpanCondition`, `USpoofCheckResult`, `USpoofChecker`, `USpoofChecks`, `UStringCaseMapper`, `UStringPrepProfile`, `UStringPrepProfileType`, `UStringSearch`, `UStringTrieBuildOption`, `UStringTrieResult`, `USystemTimeZoneType`, `UText`, `UTextAccess`, `UTextClone`, `UTextClose`, `UTextCopy`, `UTextExtract`, `UTextFuncs`, `UTextMapNativeIndexToUTF16`, `UTextMapOffsetToNative`, `UTextNativeLength`, `UTextReplace`, `UTimeScaleValue`, `UTimeZoneFormatGMTOffsetPatternType`, `UTimeZoneFormatParseOption`, `UTimeZoneFormatStyle`, `UTimeZoneFormatTimeType`, `UTimeZoneNameType`, `UTimeZoneTransitionType`, `UTraceData`, `UTraceEntry`, `UTraceExit`, `UTraceFunctionNumber`, `UTraceLevel`, `UTransDirection`, `UTransPosition`, `UVerticalOrientation`, `UWordBreak`, `UWordBreakValues`, `WORDLIST_TYPE`

### 4. Com.mod

- **Target:** `com.Com [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 1919010.0
- **Functions:** 0/60 matched (target 0)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 0/130 matched (target 0)
- **Missing types:** `ADVANCED_FEATURE_FLAGS`, `ADVF`, `APTTYPE`, `APTTYPEQUALIFIER`, `AUTHENTICATEINFO`, `ApplicationType`, `BINDINFO`, `BINDINFOF`, `BIND_FLAGS`, `BIND_OPTS`, `BIND_OPTS2`, `BIND_OPTS3`, `BLOB`, `BYTE_BLOB`, `BYTE_SIZEDARR`, `CALLCONV`, `CALLTYPE`, `CATEGORYINFO`, `CLSCTX`, `COAUTHIDENTITY`, `COAUTHINFO`, `COINIT`, `COINITBASE`, `COMSD`, `CONNECTDATA`, `COSERVERINFO`, `COWAIT_FLAGS`, `CO_DEVICE_CATALOG_COOKIE`, `CO_MARSHALING_CONTEXT_ATTRIBUTES`, `CO_MTA_USAGE_COOKIE`, `CSPLATFORM`, `CUSTDATA`, `CUSTDATAITEM`, `CWMO_FLAGS`, `CY_0`, `ComCallData`, `ContextProperty`, `DATADIR`, `DCOM_CALL_STATE`, `DESCKIND`, `DISPATCH_FLAGS`, `DISPPARAMS`, `DVASPECT`, `DVTARGETDEVICE`, `DWORD_BLOB`, `DWORD_SIZEDARR`, `ELEMDESC`, `EOLE_AUTHENTICATION_CAPABILITIES`, `EXCEPINFO`, `EXTCONN`, `FLAGGED_BYTE_BLOB`, `FLAGGED_WORD_BLOB`, `FLAG_STGMEDIUM`, `FORMATETC`, `FUNCDESC`, `FUNCFLAGS`, `FUNCKIND`, `GDI_OBJECT`, `GLOBALOPT_EH_VALUES`, `GLOBALOPT_PROPERTIES`, `GLOBALOPT_RO_FLAGS`, `GLOBALOPT_RPCTP_VALUES`, `GLOBALOPT_UNMARSHALING_POLICY_VALUES`, `HYPER_SIZEDARR`, `IDLDESC`, `IDLFLAGS`, `IMPLTYPEFLAGS`, `INTERFACEINFO`, `INVOKEKIND`, `LOCKTYPE`, `LPEXCEPFINO_DEFERRED_FILLIN`, `LPFNCANUNLOADNOW`, `LPFNGETCLASSOBJECT`, `MEMCTX`, `MKRREDUCE`, `MKSYS`, `MSHCTX`, `MSHLFLAGS`, `MULTI_QI`, `MachineGlobalObjectTableRegistrationToken`, `PENDINGMSG`, `PENDINGTYPE`, `PFNCONTEXTCALL`, `QUERYCONTEXT`, `REGCLS`, `ROT_FLAGS`, `RPCOLEMESSAGE`, `RPCOPT_PROPERTIES`, `RPCOPT_SERVER_LOCALITY_VALUES`, `RPC_C_AUTHN_LEVEL`, `RPC_C_IMP_LEVEL`, `RemSTGMEDIUM`, `SAFEARRAY`, `SAFEARRAYBOUND`, `SChannelHookCallInfo`, `SERVERCALL`, `SOLE_AUTHENTICATION_INFO`, `SOLE_AUTHENTICATION_LIST`, `SOLE_AUTHENTICATION_SERVICE`, `STATDATA`, `STATFLAG`, `STATSTG`, `STGC`, `STGM`, `STGMEDIUM`, `STGTY`, `STREAM_SEEK`, `SYSKIND`, `ShutdownType`, `StorageLayout`, `THDTYPE`, `TLIBATTR`, `TYMED`, `TYPEATTR`, `TYPEDESC`, `TYPEKIND`, `TYSPEC`, `URI_CREATE_FLAGS`, `Uri_PROPERTY`, `VARDESC`, `VARFLAGS`, `VARKIND`, `WORD_BLOB`, `WORD_SIZEDARR`, `uCLSSPEC`, `uCLSSPEC_0_0`, `uCLSSPEC_0_1`, `userFLAG_STGMEDIUM`, `userSTGMEDIUM`, `userSTGMEDIUM_0`

### 5. Security.mod

- **Target:** `security.SecurityStructs [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 1393910.0
- **Functions:** 0/38 matched (target 0)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 1/101 matched (target 1)
- **Missing types:** `ACCESS_ALLOWED_ACE`, `ACCESS_ALLOWED_CALLBACK_ACE`, `ACCESS_ALLOWED_CALLBACK_OBJECT_ACE`, `ACCESS_ALLOWED_OBJECT_ACE`, `ACCESS_DENIED_ACE`, `ACCESS_DENIED_CALLBACK_ACE`, `ACCESS_DENIED_CALLBACK_OBJECT_ACE`, `ACCESS_DENIED_OBJECT_ACE`, `ACCESS_REASONS`, `ACE_FLAGS`, `ACE_HEADER`, `ACE_REVISION`, `ACL`, `ACL_INFORMATION_CLASS`, `ACL_REVISION_INFORMATION`, `ACL_SIZE_INFORMATION`, `AUDIT_EVENT_TYPE`, `CLAIM_SECURITY_ATTRIBUTES_INFORMATION`, `CLAIM_SECURITY_ATTRIBUTE_FLAGS`, `CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE`, `CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE`, `CLAIM_SECURITY_ATTRIBUTE_RELATIVE_V1`, `CLAIM_SECURITY_ATTRIBUTE_V1`, `CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE`, `CREATE_RESTRICTED_TOKEN_FLAGS`, `ENUM_PERIOD`, `GENERIC_MAPPING`, `LLFILETIME`, `LOGON32_LOGON`, `LOGON32_PROVIDER`, `LUID_AND_ATTRIBUTES`, `MANDATORY_LEVEL`, `NCRYPT_DESCRIPTOR_HANDLE`, `NCRYPT_STREAM_HANDLE`, `OBJECT_SECURITY_INFORMATION`, `OBJECT_TYPE_LIST`, `PLSA_AP_CALL_PACKAGE_UNTRUSTED`, `PRIVILEGE_SET`, `PSECURITY_DESCRIPTOR`, `PSID`, `QUOTA_LIMITS`, `SAFER_LEVEL_HANDLE`, `SECURITY_AUTO_INHERIT_FLAGS`, `SECURITY_CAPABILITIES`, `SECURITY_DESCRIPTOR`, `SECURITY_DESCRIPTOR_CONTROL`, `SECURITY_DESCRIPTOR_RELATIVE`, `SECURITY_IMPERSONATION_LEVEL`, `SECURITY_QUALITY_OF_SERVICE`, `SEC_THREAD_START`, `SE_ACCESS_REPLY`, `SE_ACCESS_REQUEST`, `SE_IMPERSONATION_STATE`, `SE_SECURITY_DESCRIPTOR`, `SID`, `SID_AND_ATTRIBUTES`, `SID_AND_ATTRIBUTES_HASH`, `SID_IDENTIFIER_AUTHORITY`, `SID_NAME_USE`, `SYSTEM_ACCESS_FILTER_ACE`, `SYSTEM_ALARM_ACE`, `SYSTEM_ALARM_CALLBACK_ACE`, `SYSTEM_ALARM_CALLBACK_OBJECT_ACE`, `SYSTEM_ALARM_OBJECT_ACE`, `SYSTEM_AUDIT_ACE`, `SYSTEM_AUDIT_CALLBACK_ACE`, `SYSTEM_AUDIT_CALLBACK_OBJECT_ACE`, `SYSTEM_AUDIT_OBJECT_ACE`, `SYSTEM_AUDIT_OBJECT_ACE_FLAGS`, `SYSTEM_MANDATORY_LABEL_ACE`, `SYSTEM_PROCESS_TRUST_LABEL_ACE`, `SYSTEM_RESOURCE_ATTRIBUTE_ACE`, `SYSTEM_SCOPED_POLICY_ID_ACE`, `TOKEN_ACCESS_INFORMATION`, `TOKEN_ACCESS_MASK`, `TOKEN_APPCONTAINER_INFORMATION`, `TOKEN_AUDIT_POLICY`, `TOKEN_CONTROL`, `TOKEN_DEFAULT_DACL`, `TOKEN_DEVICE_CLAIMS`, `TOKEN_ELEVATION`, `TOKEN_ELEVATION_TYPE`, `TOKEN_GROUPS`, `TOKEN_GROUPS_AND_PRIVILEGES`, `TOKEN_INFORMATION_CLASS`, `TOKEN_LINKED_TOKEN`, `TOKEN_MANDATORY_LABEL`, `TOKEN_MANDATORY_POLICY`, `TOKEN_MANDATORY_POLICY_ID`, `TOKEN_ORIGIN`, `TOKEN_OWNER`, `TOKEN_PRIMARY_GROUP`, `TOKEN_PRIVILEGES`, `TOKEN_PRIVILEGES_ATTRIBUTES`, `TOKEN_SOURCE`, `TOKEN_STATISTICS`, `TOKEN_TYPE`, `TOKEN_USER`, `TOKEN_USER_CLAIMS`, `WELL_KNOWN_SID_TYPE`

### 6. Windows.Win32.System.SystemInformation.mod

- **Target:** `systeminformation.SystemInformation [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 666710.0
- **Functions:** 0/23 matched (target 0)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 1/44 matched (target 1)
- **Missing types:** `CACHE_DESCRIPTOR`, `CACHE_RELATIONSHIP`, `CPU_SET_INFORMATION_TYPE`, `DEP_SYSTEM_POLICY_TYPE`, `DEVELOPER_DRIVE_ENABLEMENT_STATE`, `DEVICEFAMILYDEVICEFORM`, `DEVICEFAMILYINFOENUM`, `FIRMWARE_TABLE_PROVIDER`, `FIRMWARE_TYPE`, `GROUP_AFFINITY`, `GROUP_RELATIONSHIP`, `IMAGE_FILE_MACHINE`, `LOGICAL_PROCESSOR_RELATIONSHIP`, `MEMORYSTATUS`, `MEMORYSTATUSEX`, `NUMA_NODE_RELATIONSHIP`, `OSVERSIONINFOA`, `OSVERSIONINFOEXA`, `OSVERSIONINFOEXW`, `OSVERSIONINFOW`, `OS_DEPLOYEMENT_STATE_VALUES`, `OS_PRODUCT_TYPE`, `PGET_SYSTEM_WOW64_DIRECTORY_A`, `PGET_SYSTEM_WOW64_DIRECTORY_W`, `PROCESSOR_ARCHITECTURE`, `PROCESSOR_CACHE_TYPE`, `PROCESSOR_GROUP_INFO`, `PROCESSOR_RELATIONSHIP`, `RTL_SYSTEM_GLOBAL_DATA_ID`, `SYSTEM_CPU_SET_INFORMATION`, `SYSTEM_CPU_SET_INFORMATION_0_0`, `SYSTEM_CPU_SET_INFORMATION_0_0_0_0`, `SYSTEM_INFO`, `SYSTEM_INFO_0_0`, `SYSTEM_LOGICAL_PROCESSOR_INFORMATION`, `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1`, `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0`, `SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX`, `SYSTEM_POOL_ZEROING_INFORMATION`, `SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION`, `SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION`, `USER_CET_ENVIRONMENT`, `VER_FLAGS`

### 7. Kernel.mod

- **Target:** `kernel.Kernel [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 464910.0
- **Functions:** 0/20 matched (target 0)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 3/29 matched (target 3)
- **Missing types:** `COMPARTMENT_ID`, `CSTRING`, `EVENT_TYPE`, `EXCEPTION_DISPOSITION`, `EXCEPTION_REGISTRATION_RECORD`, `EXCEPTION_ROUTINE`, `FLOATING_SAVE_AREA`, `NT_PRODUCT_TYPE`, `NT_TIB`, `OBJECTID`, `PROCESSOR_NUMBER`, `QUAD`, `RTL_BALANCED_NODE`, `RTL_BALANCED_NODE_0_0`, `SINGLE_LIST_ENTRY`, `SINGLE_LIST_ENTRY32`, `SLIST_ENTRY`, `SLIST_HEADER_0`, `SLIST_HEADER_1`, `STRING`, `STRING32`, `STRING64`, `SUITE_TYPE`, `TIMER_TYPE`, `WAIT_TYPE`, `WNF_STATE_NAME`

### 8. Windows.Win32.System.Threading.mod

- **Target:** `threading.Threading [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 271710.0
- **Functions:** 0/26 matched (target 2)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 91/91 matched (target 96)
- **Missing types:** _none_

### 9. LibraryLoader.mod

- **Target:** `libraryloader.LibraryLoader [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 141510.0
- **Functions:** 0/3 matched (target 0)
- **Missing functions:** `default`, `default`, `default`
- **Types:** 1/12 matched (target 1)
- **Missing types:** `ENUMRESLANGPROCA`, `ENUMRESLANGPROCW`, `ENUMRESNAMEPROCA`, `ENUMRESNAMEPROCW`, `ENUMRESTYPEPROCA`, `ENUMRESTYPEPROCW`, `ENUMUILANG`, `PGET_MODULE_HANDLE_EXA`, `PGET_MODULE_HANDLE_EXW`, `REDIRECTION_DESCRIPTOR`, `REDIRECTION_FUNCTION_DESCRIPTOR`

### 10. Console.mod

- **Target:** `console.Console [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 124010.0
- **Functions:** 0/12 matched (target 4)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 28/28 matched (target 31)
- **Missing types:** _none_

### 11. Windows.Win32.System.IO.mod

- **Target:** `io.Overlapped [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 101110.0
- **Functions:** 0/5 matched (target 0)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`
- **Types:** 1/6 matched (target 1)
- **Missing types:** `IO_STATUS_BLOCK`, `LPOVERLAPPED_COMPLETION_ROUTINE`, `OVERLAPPED_0_0`, `OVERLAPPED_ENTRY`, `PIO_APC_ROUTINE`

### 12. Environment.mod

- **Target:** `environment.Environment [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 73210.0
- **Functions:** 0/7 matched (target 14)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 25/25 matched (target 26)
- **Missing types:** _none_

### 13. ProcessStatus.mod

- **Target:** `processstatus.ProcessStatus [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 72310.0
- **Functions:** 0/7 matched (target 10)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`, `default`, `default`
- **Types:** 16/16 matched (target 20)
- **Missing types:** _none_

### 14. Windows.Win32.Foundation.mod

- **Target:** `foundation.Luid [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 55310.0
- **Functions:** 0/5 matched (target 3)
- **Missing functions:** `default`, `default`, `default`, `default`, `default`
- **Types:** 48/48 matched (target 53)
- **Missing types:** _none_

### 15. Time.mod

- **Target:** `time.Time [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 20410.0
- **Functions:** 0/2 matched (target 7)
- **Missing functions:** `default`, `default`
- **Types:** 2/2 matched (target 3)
- **Missing types:** _none_

### 16. Pnp.mod

- **Target:** `pnp.Pnp [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10610.0
- **Functions:** 0/1 matched (target 0)
- **Missing functions:** `default`
- **Types:** 5/5 matched
- **Missing types:** _none_

### 17. Shutdown.mod

- **Target:** `shutdown.Shutdown [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 310.0
- **Functions:** 0/0 matched (target 4)
- **Missing functions:** _none_
- **Types:** 3/3 matched (target 4)
- **Missing types:** _none_

### 18. StructuredStorage.mod

- **Target:** `structuredstorage.StructuredStorage [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 310.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 3/3 matched
- **Missing types:** _none_

### 19. core.literals

- **Target:** `core.Literals`
- **Similarity:** 0.47
- **Dependents:** 0
- **Priority Score:** 205.3
- **Functions:** 2/2 matched (target 6)
- **Missing functions:** _none_
- **Types:** 0/0 matched (target 1)
- **Missing types:** _none_

### 20. Pipes.mod

- **Target:** `pipes.Pipes [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 110.0
- **Functions:** 0/0 matched (target 1)
- **Missing functions:** _none_
- **Types:** 1/1 matched (target 2)
- **Missing types:** _none_

### 21. Beep.mod

- **Target:** `beep.Beep [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 110.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 1/1 matched
- **Missing types:** _none_

### 22. HostCompute.mod

- **Target:** `hostcompute.HostCompute [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 110.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 1/1 matched
- **Missing types:** _none_

### 23. Hlsl.mod

- **Target:** `hlsl.Hlsl [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 24. Graphics.mod

- **Target:** `graphics.Graphics [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 25. Windows.Win32.System.mod

- **Target:** `system.System [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 26. Packaging.mod

- **Target:** `packaging.Packaging [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 27. Storage.mod

- **Target:** `storage.Storage [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 28. UI.mod

- **Target:** `ui.Ui [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

### 29. Enumeration.mod

- **Target:** `enumeration.Enumeration [STUB]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present

## Reexport / Wiring Modules

These files match `reexport_modules` patterns in `.ast_distance_config.json`. They are filtered out of
normal priority and missing-file ladders because they are wiring
modules, not direct logic ports. Consult them for call-site routing;
do not treat them as the next implementation target by default.

### Matched

| Source | Target | Path |
|--------|--------|------|
| `core.mod` | `core.Core` | `core/mod` |
| `Win32.mod` | `win32.Win32` | `Windows/Win32/mod` |
| `Wdk.mod` | `wdk.Wdk` | `Windows/Wdk/mod` |
| `Windows.mod` | `windows.Windows` | `Windows/mod` |

### Missing

| Source | Expected target | Deps | Source path | Expected path |
|--------|-----------------|------|-------------|---------------|
| `lib` | `Lib` | 0 | `lib.rs` | `Lib.kt` |

