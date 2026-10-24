// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dmprocessxmlfiltered.dll, ABI=system, export=DMProcessConfigXMLFiltered; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DMProcessConfigXMLFiltered`(`pszxmlin` : `windows_sys`.`core`.`PCWSTR`, `rgszallowedcspnodes` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `dwnumallowedcspnodes` : UInt, `pbstrxmlout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BSTR`>?) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 2:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_WPD_NAMESPACE_EXTENSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35786d3c_b075_49b9_88dd_029876e11c01);

public typealias `DELETE_OBJECT_OPTIONS` = Int;
public typealias `DEVICE_RADIO_STATE` = Int;
// UNSUPPORTED Rust 5:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_MTPBTH_IsConnected: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xea1237fa_589d_4472_84e4_0abe36fd62ef), pid: 2 };

public const val `DEVSVCTYPE_ABSTRACT`: UInt = 1u;
public const val `DEVSVCTYPE_DEFAULT`: UInt = 0u;
public const val `DEVSVC_SERVICEINFO_VERSION`: UInt = 100u;
public const val `DRS_HW_RADIO_OFF`: `DEVICE_RADIO_STATE` = 2;
public const val `DRS_HW_RADIO_OFF_UNCONTROLLABLE`: `DEVICE_RADIO_STATE` = 6;
public const val `DRS_HW_RADIO_ON_UNCONTROLLABLE`: `DEVICE_RADIO_STATE` = 4;
public const val `DRS_RADIO_INVALID`: `DEVICE_RADIO_STATE` = 5;
public const val `DRS_RADIO_MAX`: `DEVICE_RADIO_STATE` = 6;
public const val `DRS_RADIO_ON`: `DEVICE_RADIO_STATE` = 0;
public const val `DRS_SW_HW_RADIO_OFF`: `DEVICE_RADIO_STATE` = 3;
public const val `DRS_SW_RADIO_OFF`: `DEVICE_RADIO_STATE` = 1;
public const val `ENUM_AnchorResults_AnchorStateInvalid`: UInt = 1u;
public const val `ENUM_AnchorResults_AnchorStateNormal`: UInt = 0u;
public const val `ENUM_AnchorResults_AnchorStateOld`: UInt = 2u;
public const val `ENUM_AnchorResults_ItemStateChanged`: UInt = 4u;
public const val `ENUM_AnchorResults_ItemStateCreated`: UInt = 2u;
public const val `ENUM_AnchorResults_ItemStateDeleted`: UInt = 1u;
public const val `ENUM_AnchorResults_ItemStateInvalid`: UInt = 0u;
public const val `ENUM_AnchorResults_ItemStateUpdated`: UInt = 3u;
public const val `ENUM_CalendarObj_BusyStatusBusy`: UInt = 1u;
public const val `ENUM_CalendarObj_BusyStatusFree`: UInt = 0u;
public const val `ENUM_CalendarObj_BusyStatusOutOfOffice`: UInt = 2u;
public const val `ENUM_CalendarObj_BusyStatusTentative`: UInt = 3u;
public const val `ENUM_DeviceMetadataObj_DefaultCABFalse`: UInt = 0u;
public const val `ENUM_DeviceMetadataObj_DefaultCABTrue`: UInt = 1u;
public const val `ENUM_MessageObj_PatternInstanceFirst`: UInt = 1u;
public const val `ENUM_MessageObj_PatternInstanceFourth`: UInt = 4u;
public const val `ENUM_MessageObj_PatternInstanceLast`: UInt = 5u;
public const val `ENUM_MessageObj_PatternInstanceNone`: UInt = 0u;
public const val `ENUM_MessageObj_PatternInstanceSecond`: UInt = 2u;
public const val `ENUM_MessageObj_PatternInstanceThird`: UInt = 3u;
public const val `ENUM_MessageObj_PatternTypeDaily`: UInt = 1u;
public const val `ENUM_MessageObj_PatternTypeMonthly`: UInt = 3u;
public const val `ENUM_MessageObj_PatternTypeWeekly`: UInt = 2u;
public const val `ENUM_MessageObj_PatternTypeYearly`: UInt = 4u;
public const val `ENUM_MessageObj_PriorityHighest`: UInt = 2u;
public const val `ENUM_MessageObj_PriorityLowest`: UInt = 0u;
public const val `ENUM_MessageObj_PriorityNormal`: UInt = 1u;
public const val `ENUM_MessageObj_ReadFalse`: UInt = 0u;
public const val `ENUM_MessageObj_ReadTrue`: UInt = 255u;
public const val `ENUM_StatusSvc_ChargingActive`: UInt = 1u;
public const val `ENUM_StatusSvc_ChargingInactive`: UInt = 0u;
public const val `ENUM_StatusSvc_ChargingUnknown`: UInt = 2u;
public const val `ENUM_StatusSvc_RoamingActive`: UInt = 1u;
public const val `ENUM_StatusSvc_RoamingInactive`: UInt = 0u;
public const val `ENUM_StatusSvc_RoamingUnknown`: UInt = 2u;
public const val `ENUM_SyncSvc_SyncObjectReferencesDisabled`: UInt = 0u;
public const val `ENUM_SyncSvc_SyncObjectReferencesEnabled`: UInt = 255u;
public const val `ENUM_TaskObj_CompleteFalse`: UInt = 0u;
public const val `ENUM_TaskObj_CompleteTrue`: UInt = 255u;
public const val `E_WPD_DEVICE_ALREADY_OPENED`: Int = -2144731135;
public const val `E_WPD_DEVICE_IS_HUNG`: Int = -2144731130;
public const val `E_WPD_DEVICE_NOT_OPEN`: Int = -2144731134;
public const val `E_WPD_OBJECT_ALREADY_ATTACHED_TO_DEVICE`: Int = -2144731133;
public const val `E_WPD_OBJECT_ALREADY_ATTACHED_TO_SERVICE`: Int = -2144730934;
public const val `E_WPD_OBJECT_NOT_ATTACHED_TO_DEVICE`: Int = -2144731132;
public const val `E_WPD_OBJECT_NOT_ATTACHED_TO_SERVICE`: Int = -2144730933;
public const val `E_WPD_OBJECT_NOT_COMMITED`: Int = -2144731131;
public const val `E_WPD_SERVICE_ALREADY_OPENED`: Int = -2144730936;
public const val `E_WPD_SERVICE_BAD_PARAMETER_ORDER`: Int = -2144730932;
public const val `E_WPD_SERVICE_NOT_OPEN`: Int = -2144730935;
public const val `E_WPD_SMS_INVALID_MESSAGE_BODY`: Int = -2144731035;
public const val `E_WPD_SMS_INVALID_RECIPIENT`: Int = -2144731036;
public const val `E_WPD_SMS_SERVICE_UNAVAILABLE`: Int = -2144731034;
// UNSUPPORTED Rust 70:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const EnumBthMtpConnectors: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1570149_e645_4f43_8b0d_409b061db2fc);

public const val `FACILITY_WPD`: UInt = 42u;
public const val `FLAG_MessageObj_DayOfWeekFriday`: UInt = 32u;
public const val `FLAG_MessageObj_DayOfWeekMonday`: UInt = 2u;
public const val `FLAG_MessageObj_DayOfWeekNone`: UInt = 0u;
public const val `FLAG_MessageObj_DayOfWeekSaturday`: UInt = 64u;
public const val `FLAG_MessageObj_DayOfWeekSunday`: UInt = 1u;
public const val `FLAG_MessageObj_DayOfWeekThursday`: UInt = 16u;
public const val `FLAG_MessageObj_DayOfWeekTuesday`: UInt = 4u;
public const val `FLAG_MessageObj_DayOfWeekWednesday`: UInt = 8u;
// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_WPD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ac27878_a6fa_4155_ba85_f98f491d4f33);

// UNSUPPORTED Rust 81:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_WPD_PRIVATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba0c718f_4ded_49b7_bdd3_fabe28661211);

// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_WPD_SERVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ef44f80_3d64_4246_a6aa_206f328d1edc);

public const val `IOCTL_WPD_MESSAGE_READWRITE_ACCESS`: UInt = 4243720u;
public const val `IOCTL_WPD_MESSAGE_READ_ACCESS`: UInt = 4210952u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_3GPP2File`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("3GPP2File");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_3GPPFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("3GPPFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AACFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AACFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AIFFFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AIFFFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AMRFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AMRFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ASFFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ASFFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ASXPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ASXPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ATSCTSFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ATSCTSFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AVCHDFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AVCHDFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AVIFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AVIFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractActivity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractActivity");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractActivityOccurrence`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractActivityOccurrence");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractAudioAlbum`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractAudioAlbum");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractAudioPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractAudioPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractAudioVideoAlbum`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractAudioVideoAlbum");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractChapteredProduction`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractChapteredProduction");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractContact`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractContact");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractContactGroup`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractContactGroup");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractImageAlbum`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractImageAlbum");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractMediacast`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractMediacast");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractMessage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractMessage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractMessageFolder`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractMessageFolder");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractMultimediaAlbum`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractMultimediaAlbum");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractNote`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractNote");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractTask`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractTask");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractVideoAlbum`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractVideoAlbum");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AbstractVideoPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AbstractVideoPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorResults`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorResults");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorResults_Anchor`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Anchor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorResults_AnchorState`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorState");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorResults_ResultObjectID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ResultObjectID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncKnowledge`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorSyncKnowledge");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_BeginSync`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BeginSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_CurrentAnchor`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorCurrentAnchor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_EndSync`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_FilterType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FilterType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_GetChangesSinceAnchor`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GetChangesSinceAnchor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_KnowledgeObjectID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorKnowledgeObjectID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_LastSyncProxyID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorLastSyncProxyID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_LocalOnlyDelete`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LocalOnlyDelete");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_ProviderVersion`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorProviderVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_ReplicaID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorReplicaID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_SyncFormat`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncFormat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AnchorSyncSvc_VersionProps`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnchorVersionProps");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_Association`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Association");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudibleFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AudibleFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudioObj_AudioBitDepth`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AudioBitDepth");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudioObj_AudioBitRate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AudioBitRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudioObj_AudioBlockAlignment`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AudioBlockAlignment");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudioObj_AudioFormatCode`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AudioFormatCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudioObj_Channels`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Channels");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_AudioObj_Lyrics`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Lyrics");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_BMPImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BMPImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CIFFImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CIFFImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_Accepted`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Accepted");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_BeginDateTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BeginDateTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_BusyStatus`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusyStatus");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_Declined`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Declined");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_EndDateTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndDateTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_Location`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Location");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_PatternDuration`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternDuration");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_PatternStartTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternStartTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_ReminderOffset`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReminderOffset");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_Tentative`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Tentative");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarObj_TimeZone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TimeZone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Calendar");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarSvc_SyncWindowEnd`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncWindowEnd");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_CalendarSvc_SyncWindowStart`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncWindowStart");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_AnniversaryDate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AnniversaryDate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Assistant`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Assistant");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Birthdate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Birthdate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressCity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressCity");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressCountry`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressCountry");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressFull`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressFull");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressLine2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressLine2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressPostalCode`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressPostalCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressRegion`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressRegion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessAddressStreet`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessAddressStreet");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessEmail`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessEmail");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessEmail2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessEmail2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessFax`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessFax");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessPhone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessPhone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessPhone2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessPhone2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_BusinessWebAddress`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BusinessWebAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Children`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Children");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Email`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Email");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_FamilyName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FamilyName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Fax`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Fax");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_GivenName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GivenName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_IMAddress`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IMAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_IMAddress2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IMAddress2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_IMAddress3`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IMAddress3");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_MiddleNames`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MiddleNames");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_MobilePhone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MobilePhone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_MobilePhone2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MobilePhone2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Organization`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Organization");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressCity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressCity");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressCountry`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressCountry");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressFull`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressFull");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressLine2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressLine2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressPostalCode`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressPostalCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressRegion`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressRegion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherAddressStreet`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherAddressStreet");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherEmail`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherEmail");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_OtherPhone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OtherPhone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Pager`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Pager");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressCity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressCity");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressCountry`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressCountry");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressFull`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressFull");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressLine2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressLine2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressPostalCode`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressPostalCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressRegion`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressRegion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalAddressStreet`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalAddressStreet");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalEmail`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalEmail");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalEmail2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalEmail2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalFax`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalFax");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalPhone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalPhone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalPhone2`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalPhone2");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PersonalWebAddress`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersonalWebAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Phone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Phone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PhoneticFamilyName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PhoneticFamilyName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PhoneticGivenName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PhoneticGivenName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_PhoneticOrganization`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PhoneticOrganization");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Ringtone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Ringtone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Role`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Role");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Spouse`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Spouse");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Suffix`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Suffix");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_Title`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Title");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactObj_WebAddress`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebAddress");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactSvc_SyncWithPhoneOnly`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FilterType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ContactsSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Contacts");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DPOFDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DPOFDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DVBTSFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DVBTSFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DeviceExecutable`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceExecutable");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DeviceMetadataCAB`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceMetadataCAB");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DeviceMetadataObj_ContentID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ContentID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DeviceMetadataObj_DefaultCAB`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DefaultCAB");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DeviceMetadataSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Metadata");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_DeviceScript`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DeviceScript");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_EXIFImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EXIFImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ExcelDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ExcelDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FLACFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FLACFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FirmwareFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FirmwareFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FlashPixImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FlashPixImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncKnowledge`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumSyncKnowledge");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_BeginSync`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BeginSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_EndSync`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_FilterType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FilterType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_KnowledgeObjectID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumKnowledgeObjectID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_LastSyncProxyID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumLastSyncProxyID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_LocalOnlyDelete`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LocalOnlyDelete");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_ProviderVersion`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumProviderVersion");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_ReplicaID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumReplicaID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_SyncFormat`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncFormat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_FullEnumSyncSvc_VersionProps`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FullEnumVersionProps");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GIFImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GIFImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_AllowedFolderContents`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AllowedFolderContents");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_AssociationDesc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AssociationDesc");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_AssociationType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AssociationType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_Copyright`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Copyright");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_Corrupt`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Corrupt");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DRMStatus`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DRMStatus");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DateAccessed`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateAccessed");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DateAdded`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateAdded");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DateAuthored`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateAuthored");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DateCreated`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateCreated");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DateModified`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateModified");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_DateRevised`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateRevised");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_Description`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Description");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_Hidden`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Hidden");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_Keywords`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Keywords");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_LanguageLocale`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LanguageLocale");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_Name`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Name");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_NonConsumable`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NonConsumable");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ObjectFileName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ObjectFileName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ObjectFormat`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ObjectFormat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ObjectID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ObjectID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ObjectSize`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ObjectSize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ParentID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ParentID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_PersistentUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PersistentUID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_PropertyBag`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PropertyBag");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ProtectionStatus`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProtectionStatus");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_ReferenceParentID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReferenceParentID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_StorageID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("StorageID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_SubDescription`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubDescription");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_SyncID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_SystemObject`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SystemObject");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_GenericObj_TimeToLive`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TimeToLive");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_HDPhotoImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HDPhotoImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_HTMLDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("HTMLDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_HintsSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Hints");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ICalendarActivity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ICalendar");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ImageObj_Aperature`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Aperature");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ImageObj_Exposure`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Exposure");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ImageObj_ISOSpeed`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ISOSpeed");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ImageObj_ImageBitDepth`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ImageBitDepth");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ImageObj_IsColorCorrected`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IsColorCorrected");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_ImageObj_IsCropped`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("IsCropped");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_JFIFImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JFIFImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_JP2Image`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JP2Image");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_JPEGXRImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JPEGXRImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_JPXImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("JPXImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_M3UPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("M3UPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MHTDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MHTDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MP3File`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MP3File");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MPEG2File`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MPEG2File");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MPEG4File`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MPEG4File");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MPEGFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MPEGFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MPLPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MPLPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_AlbumArtist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AlbumArtist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_AlbumName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AlbumName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Artist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Artist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_AudioEncodingProfile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("AudioEncodingProfile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_BitRateType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BitRateType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_BookmarkByte`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BookmarkByte");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_BookmarkObject`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BookmarkObject");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_BookmarkTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BookmarkTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_BufferSize`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BufferSize");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Composer`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Composer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Credits`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Credits");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_DateOriginalRelease`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DateOriginalRelease");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Duration`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Duration");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Editor`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Editor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_EffectiveRating`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EffectiveRating");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_EncodingProfile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EncodingProfile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_EncodingQuality`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EncodingQuality");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Genre`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Genre");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_GeographicOrigin`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GeographicOrigin");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Height`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Height");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_MediaType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MediaType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_MediaUID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MediaUID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Mood`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Mood");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Owner`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Owner");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_ParentalRating`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ParentalRating");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Producer`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Producer");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_SampleRate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SampleRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_SkipCount`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SkipCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_SubscriptionContentID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SubscriptionContentID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Subtitle`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Subtitle");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_TotalBitRate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TotalBitRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Track`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Track");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_URLLink`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("URLLink");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_URLSource`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("URLSource");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_UseCount`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UseCount");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_UserRating`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UserRating");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_WebMaster`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WebMaster");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MediaObj_Width`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Width");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_BCC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BCC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_Body`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Body");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_CC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("CC");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_Category`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Category");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternDayOfMonth`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternDayOfMonth");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternDayOfWeek`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternDayOfWeek");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternDeleteDates`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternDeleteDates");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternInstance`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternInstance");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternMonthOfYear`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternMonthOfYear");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternOriginalDateTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternOriginalDateTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternPeriod`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternPeriod");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternValidEndDate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternValidEndDate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_PatternValidStartDate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PatternValidStartDate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_Priority`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Priority");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_Read`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Read");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_ReceivedTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReceivedTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_Sender`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Sender");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_Subject`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Subject");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageObj_To`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("To");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_MessageSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Message");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_NotesSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Notes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_OGGFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OGGFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_PCDImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PCDImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_PICTImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PICTImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_PNGImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PNGImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_PSLPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PSLPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_PowerPointDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PowerPointDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_QCELPFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("QCELPFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_RingtonesSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Ringtones");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_RingtonesSvc_DefaultRingtone`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DefaultRingtone");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_Services_ServiceDisplayName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServiceDisplayName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_Services_ServiceIcon`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServiceIcon");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_Services_ServiceLocale`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ServiceLocale");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Status");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_BatteryLife`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BatteryLife");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_ChargingState`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ChargingState");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_MissedCalls`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MissedCalls");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_NetworkName`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NetworkName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_NetworkType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NetworkType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_NewPictures`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NewPictures");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_Roaming`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Roaming");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_SignalStrength`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SignalStrength");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_StorageCapacity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("StorageCapacity");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_StorageFreeSpace`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("StorageFreeSpace");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_TextMessages`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TextMessages");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_StatusSvc_VoiceMail`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VoiceMail");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncObj_LastAuthorProxyID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LastAuthorProxyID");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncSvc_BeginSync`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BeginSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncSvc_EndSync`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndSync");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncSvc_FilterType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FilterType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncSvc_LocalOnlyDelete`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("LocalOnlyDelete");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncSvc_SyncFormat`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncFormat");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_SyncSvc_SyncObjectReferences`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("SyncObjectReferences");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TIFFEPImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TIFFEPImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TIFFITImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TIFFITImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TIFFImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TIFFImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TaskObj_BeginDate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("BeginDate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TaskObj_Complete`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Complete");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TaskObj_EndDate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EndDate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TaskObj_ReminderDateTime`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ReminderDateTime");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TasksSvc`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Tasks");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TasksSvc_SyncActiveOnly`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("FilterType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_TextDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("TextDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_Undefined`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Undefined");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_UndefinedAudio`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UndefinedAudio");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_UndefinedCollection`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UndefinedCollection");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_UndefinedDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UndefinedDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_UndefinedVideo`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UndefinedVideo");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_UnknownImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("UnknownImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VCalendar1Activity`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VCalendar1");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VCard2Contact`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VCard2Contact");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VCard3Contact`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VCard3Contact");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VideoObj_KeyFrameDistance`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KeyFrameDistance");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VideoObj_ScanType`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ScanType");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VideoObj_Source`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Source");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VideoObj_VideoBitRate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VideoBitRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VideoObj_VideoFormatCode`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VideoFormatCode");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_VideoObj_VideoFrameRate`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("VideoFrameRate");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_WAVFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WAVFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_WBMPImage`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WBMPImage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_WMAFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WMAFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_WMVFile`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WMVFile");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_WPLPlaylist`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WPLPlaylist");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_WordDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WordDocument");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `NAME_XMLDocument`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("XMLDocument");
public const val `PORTABLE_DEVICE_DELETE_NO_RECURSION`: `DELETE_OBJECT_OPTIONS` = 0;
public const val `PORTABLE_DEVICE_DELETE_WITH_RECURSION`: `DELETE_OBJECT_OPTIONS` = 1;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_DRM_SCHEME_PDDRM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PDDRM");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_DRM_SCHEME_WMDRM10_PD`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WMDRM10-PD");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_ICON`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("Icons");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_IS_MASS_STORAGE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortableDeviceIsMassStorage");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_NAMESPACE_EXCLUDE_FROM_SHELL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortableDeviceNameSpaceExcludeFromShell");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_NAMESPACE_THUMBNAIL_CONTENT_TYPES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortableDeviceNameSpaceThumbnailContentTypes");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_NAMESPACE_TIMEOUT`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortableDeviceNameSpaceTimeout");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `PORTABLE_DEVICE_TYPE`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PortableDeviceType");
// UNSUPPORTED Rust 431:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDevice: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x728a21c5_3d9e_48d7_9810_864848f0f404);

// UNSUPPORTED Rust 432:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceDispatchFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43232233_8338_4658_ae01_0b4ae830b6b0);

// UNSUPPORTED Rust 433:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceFTM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf7c0039a_4762_488a_b4b3_760ef9a1ba9b);

// UNSUPPORTED Rust 434:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceKeyCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde2d022d_2480_43be_97f0_d1fa2cf98f4f);

// UNSUPPORTED Rust 435:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0af10cec_2ecd_4b92_9581_34f6ae0637f3);

// UNSUPPORTED Rust 436:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDevicePropVariantCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08a99e2f_6d6d_4b80_af5a_baf2bcbe4cb9);

// UNSUPPORTED Rust 437:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceService: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef5db4c2_9312_422c_9152_411cd9c4dd84);

// UNSUPPORTED Rust 438:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceServiceFTM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1649b154_c794_497a_9b03_f3f0121302f3);

// UNSUPPORTED Rust 439:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceValues: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c15d503_d017_47ce_9016_7b3f978721cc);

// UNSUPPORTED Rust 440:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceValuesCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3882134d_14cf_4220_9cb4_435f86d83f60);

// UNSUPPORTED Rust 441:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PortableDeviceWebControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x186dd02c_2dec_41b5_a7d4_b59056fade51);

public const val `RANGEMAX_MessageObj_PatternDayOfMonth`: UInt = 31u;
public const val `RANGEMAX_MessageObj_PatternMonthOfYear`: UInt = 12u;
public const val `RANGEMAX_StatusSvc_BatteryLife`: UInt = 100u;
public const val `RANGEMAX_StatusSvc_MissedCalls`: UInt = 255u;
public const val `RANGEMAX_StatusSvc_NewPictures`: UInt = 65535u;
public const val `RANGEMAX_StatusSvc_SignalStrength`: UInt = 4u;
public const val `RANGEMAX_StatusSvc_TextMessages`: UInt = 255u;
public const val `RANGEMAX_StatusSvc_VoiceMail`: UInt = 255u;
public const val `RANGEMIN_MessageObj_PatternDayOfMonth`: UInt = 1u;
public const val `RANGEMIN_MessageObj_PatternMonthOfYear`: UInt = 1u;
public const val `RANGEMIN_StatusSvc_BatteryLife`: UInt = 0u;
public const val `RANGEMIN_StatusSvc_SignalStrength`: UInt = 0u;
public const val `RANGESTEP_MessageObj_PatternDayOfMonth`: UInt = 1u;
public const val `RANGESTEP_MessageObj_PatternMonthOfYear`: UInt = 1u;
public const val `RANGESTEP_StatusSvc_BatteryLife`: UInt = 1u;
public const val `RANGESTEP_StatusSvc_SignalStrength`: UInt = 1u;
public const val `SMS_BINARY_MESSAGE`: `SMS_MESSAGE_TYPES` = 1;
public const val `SMS_ENCODING_7_BIT`: `WPD_SMS_ENCODING_TYPES` = 0;
public const val `SMS_ENCODING_8_BIT`: `WPD_SMS_ENCODING_TYPES` = 1;
public const val `SMS_ENCODING_UTF_16`: `WPD_SMS_ENCODING_TYPES` = 2;
public typealias `SMS_MESSAGE_TYPES` = Int;
public const val `SMS_TEXT_MESSAGE`: `SMS_MESSAGE_TYPES` = 0;
public const val `SRS_RADIO_DISABLED`: `SYSTEM_RADIO_STATE` = 1;
public const val `SRS_RADIO_ENABLED`: `SYSTEM_RADIO_STATE` = 0;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_WPDNSE_FAST_ENUM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WPDNSE Fast Enum");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `STR_WPDNSE_SIMPLE_ITEM`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("WPDNSE SimpleItem");
public const val `SYNCSVC_FILTER_CALENDAR_WINDOW_WITH_RECURRENCE`: UInt = 3u;
public const val `SYNCSVC_FILTER_CONTACTS_WITH_PHONE`: UInt = 1u;
public const val `SYNCSVC_FILTER_NONE`: UInt = 0u;
public const val `SYNCSVC_FILTER_TASK_ACTIVE`: UInt = 2u;
public typealias `SYSTEM_RADIO_STATE` = Int;
public const val `TYPE_AnchorSyncSvc`: UInt = 1u;
public const val `TYPE_CalendarSvc`: UInt = 0u;
public const val `TYPE_ContactsSvc`: UInt = 0u;
public const val `TYPE_DeviceMetadataSvc`: UInt = 0u;
public const val `TYPE_FullEnumSyncSvc`: UInt = 1u;
public const val `TYPE_HintsSvc`: UInt = 0u;
public const val `TYPE_MessageSvc`: UInt = 0u;
public const val `TYPE_NotesSvc`: UInt = 0u;
public const val `TYPE_RingtonesSvc`: UInt = 0u;
public const val `TYPE_StatusSvc`: UInt = 0u;
public const val `TYPE_TasksSvc`: UInt = 0u;
// UNSUPPORTED Rust 484:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_HAS_ALBUM_ART: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6), pid: 6 };

// UNSUPPORTED Rust 485:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_HAS_AUDIO_CLIP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6), pid: 5 };

// UNSUPPORTED Rust 486:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_HAS_CONTACT_PHOTO: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6), pid: 2 };

// UNSUPPORTED Rust 487:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_HAS_ICON: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6), pid: 4 };

// UNSUPPORTED Rust 488:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_HAS_THUMBNAIL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6), pid: 3 };

// UNSUPPORTED Rust 489:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_OPTIMAL_READ_BLOCK_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6), pid: 7 };

// UNSUPPORTED Rust 490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPDNSE_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34d71409_4b47_4d80_aaac_3a28a4a3b3e6);

public const val `WPDNSE_PROPSHEET_CONTENT_DETAILS`: UInt = 32u;
public const val `WPDNSE_PROPSHEET_CONTENT_GENERAL`: UInt = 4u;
public const val `WPDNSE_PROPSHEET_CONTENT_REFERENCES`: UInt = 8u;
public const val `WPDNSE_PROPSHEET_CONTENT_RESOURCES`: UInt = 16u;
public const val `WPDNSE_PROPSHEET_DEVICE_GENERAL`: UInt = 1u;
public const val `WPDNSE_PROPSHEET_STORAGE_GENERAL`: UInt = 2u;
// UNSUPPORTED Rust 497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_API_OPTIONS_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10e54a3e_052d_4777_a13c_de7614be2bc4);

// UNSUPPORTED Rust 498:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_API_OPTION_IOCTL_ACCESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x10e54a3e_052d_4777_a13c_de7614be2bc4), pid: 3 };

// UNSUPPORTED Rust 499:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_API_OPTION_USE_CLEAR_DATA_STREAM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x10e54a3e_052d_4777_a13c_de7614be2bc4), pid: 2 };

// UNSUPPORTED Rust 500:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_ACCEPTED_ATTENDEES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 10 };

// UNSUPPORTED Rust 501:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_DECLINED_ATTENDEES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 13 };

// UNSUPPORTED Rust 502:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_LOCATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 3 };

// UNSUPPORTED Rust 503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3);

// UNSUPPORTED Rust 504:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_OPTIONAL_ATTENDEES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 9 };

// UNSUPPORTED Rust 505:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_REQUIRED_ATTENDEES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 8 };

// UNSUPPORTED Rust 506:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_RESOURCES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 11 };

// UNSUPPORTED Rust 507:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_TENTATIVE_ATTENDEES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 12 };

// UNSUPPORTED Rust 508:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_APPOINTMENT_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf99efd03_431d_40d8_a1c9_4e220d9c88d3), pid: 7 };

// UNSUPPORTED Rust 509:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_AUDIO_BITRATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 9 };

// UNSUPPORTED Rust 510:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_AUDIO_BIT_DEPTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 12 };

// UNSUPPORTED Rust 511:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_AUDIO_BLOCK_ALIGNMENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 13 };

// UNSUPPORTED Rust 512:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_AUDIO_CHANNEL_COUNT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 10 };

// UNSUPPORTED Rust 513:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_AUDIO_FORMAT_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 11 };

public typealias `WPD_BITRATE_TYPES` = Int;
public const val `WPD_BITRATE_TYPE_DISCRETE`: `WPD_BITRATE_TYPES` = 1;
public const val `WPD_BITRATE_TYPE_FREE`: `WPD_BITRATE_TYPES` = 3;
public const val `WPD_BITRATE_TYPE_UNUSED`: `WPD_BITRATE_TYPES` = 0;
public const val `WPD_BITRATE_TYPE_VARIABLE`: `WPD_BITRATE_TYPES` = 2;
public typealias `WPD_CAPTURE_MODES` = Int;
public const val `WPD_CAPTURE_MODE_BURST`: `WPD_CAPTURE_MODES` = 2;
public const val `WPD_CAPTURE_MODE_NORMAL`: `WPD_CAPTURE_MODES` = 1;
public const val `WPD_CAPTURE_MODE_TIMELAPSE`: `WPD_CAPTURE_MODES` = 3;
public const val `WPD_CAPTURE_MODE_UNDEFINED`: `WPD_CAPTURE_MODES` = 0;
// UNSUPPORTED Rust 524:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356);

// UNSUPPORTED Rust 525:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_COMMON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a);

// UNSUPPORTED Rust 526:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_DEVICE_HINTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d5fb92b_cb46_4c4f_8343_0bc3d3f17c84);

// UNSUPPORTED Rust 527:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_MEDIA_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59b433ba_fe44_4d8d_808c_6bcb9b0f15e8);

// UNSUPPORTED Rust 528:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_MTP_EXT_VENDOR_OPERATIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56);

// UNSUPPORTED Rust 529:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_NETWORK_CONFIGURATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x78f9c6fc_79b8_473c_9060_6bd23dd072c4);

// UNSUPPORTED Rust 530:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_NULL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

// UNSUPPORTED Rust 531:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_OBJECT_ENUMERATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec);

// UNSUPPORTED Rust 532:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_OBJECT_MANAGEMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089);

// UNSUPPORTED Rust 533:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_OBJECT_PROPERTIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804);

// UNSUPPORTED Rust 534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_OBJECT_PROPERTIES_BULK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e);

// UNSUPPORTED Rust 535:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_OBJECT_RESOURCES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a);

// UNSUPPORTED Rust 536:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_SERVICE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89);

// UNSUPPORTED Rust 537:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_SERVICE_COMMON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x322f071d_36ef_477f_b4b5_6f52d734baee);

// UNSUPPORTED Rust 538:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_SERVICE_METHODS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc);

// UNSUPPORTED Rust 539:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_SMS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1);

// UNSUPPORTED Rust 540:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_STILL_IMAGE_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4fcd6982_22a2_4b05_a48b_62d38bf27b32);

// UNSUPPORTED Rust 541:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CATEGORY_STORAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8f907a6_34cc_45fa_97fb_d007fa47ec94);

// UNSUPPORTED Rust 542:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_DEVICE_IDENTIFICATION_VALUES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3e3595da_4d71_49fe_a0b4_d4406c3ae93f), pid: 3 };

// UNSUPPORTED Rust 543:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_DONT_REGISTER_WPD_DEVICE_INTERFACE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x6309ffef_a87c_4ca7_8434_797576e40a96), pid: 3 };

// UNSUPPORTED Rust 544:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_MULTITRANSPORT_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3e3595da_4d71_49fe_a0b4_d4406c3ae93f), pid: 2 };

// UNSUPPORTED Rust 545:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_REGISTER_WPD_PRIVATE_DEVICE_INTERFACE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x6309ffef_a87c_4ca7_8434_797576e40a96), pid: 4 };

// UNSUPPORTED Rust 546:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_SILENCE_AUTOPLAY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x65c160f8_1367_4ce2_939d_8310839f0d30), pid: 2 };

// UNSUPPORTED Rust 547:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_SUPPORTED_CONTENT_TYPES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x6309ffef_a87c_4ca7_8434_797576e40a96), pid: 2 };

// UNSUPPORTED Rust 548:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_TRANSPORT_BANDWIDTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3e3595da_4d71_49fe_a0b4_d4406c3ae93f), pid: 4 };

// UNSUPPORTED Rust 549:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6309ffef_a87c_4ca7_8434_797576e40a96);

// UNSUPPORTED Rust 550:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3e3595da_4d71_49fe_a0b4_d4406c3ae93f);

// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_OPTIONS_V3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65c160f8_1367_4ce2_939d_8310839f0d30);

// UNSUPPORTED Rust 552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33fb0d11_64a3_4fac_b4c7_3dfeaa99b051);

// UNSUPPORTED Rust 553:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLASS_EXTENSION_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f0779b5_fa2b_4766_9cb2_f73ba30b6758);

// UNSUPPORTED Rust 554:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_DESIRED_ACCESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 9 };

// UNSUPPORTED Rust 555:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_EVENT_COOKIE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 11 };

// UNSUPPORTED Rust 556:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_INFORMATION_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859);

// UNSUPPORTED Rust 557:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_MAJOR_VERSION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 3 };

// UNSUPPORTED Rust 558:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_MANUAL_CLOSE_ON_DISCONNECT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 13 };

// UNSUPPORTED Rust 559:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_MINIMUM_RESULTS_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 12 };

// UNSUPPORTED Rust 560:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_MINOR_VERSION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 4 };

// UNSUPPORTED Rust 561:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 2 };

// UNSUPPORTED Rust 562:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_REVISION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 5 };

// UNSUPPORTED Rust 563:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_SECURITY_QUALITY_OF_SERVICE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 8 };

// UNSUPPORTED Rust 564:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_SHARE_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 10 };

// UNSUPPORTED Rust 565:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_WMDRM_APPLICATION_CERTIFICATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 7 };

// UNSUPPORTED Rust 566:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CLIENT_WMDRM_APPLICATION_PRIVATE_KEY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x204d9f0c_2292_4080_9f42_40664e70f859), pid: 6 };

public const val `WPD_COLOR_CORRECTED_STATUS_CORRECTED`: `WPD_COLOR_CORRECTED_STATUS_VALUES` = 1;
public const val `WPD_COLOR_CORRECTED_STATUS_NOT_CORRECTED`: `WPD_COLOR_CORRECTED_STATUS_VALUES` = 0;
public const val `WPD_COLOR_CORRECTED_STATUS_SHOULD_NOT_BE_CORRECTED`: `WPD_COLOR_CORRECTED_STATUS_VALUES` = 2;
public typealias `WPD_COLOR_CORRECTED_STATUS_VALUES` = Int;
public const val `WPD_COMMAND_ACCESS_FROM_ATTRIBUTE_WITH_METHOD_ACCESS`: `WPD_COMMAND_ACCESS_TYPES` = 16;
public const val `WPD_COMMAND_ACCESS_FROM_PROPERTY_WITH_FILE_ACCESS`: `WPD_COMMAND_ACCESS_TYPES` = 8;
public const val `WPD_COMMAND_ACCESS_FROM_PROPERTY_WITH_STGM_ACCESS`: `WPD_COMMAND_ACCESS_TYPES` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WPD_COMMAND_ACCESS_LOOKUP_ENTRY` (
    public var `Command`: `super`.`super`.`Foundation`.`PROPERTYKEY`,
    public var `AccessType`: UInt,
    public var `AccessProperty`: `super`.`super`.`Foundation`.`PROPERTYKEY`,
)
public const val `WPD_COMMAND_ACCESS_READ`: `WPD_COMMAND_ACCESS_TYPES` = 1;
public const val `WPD_COMMAND_ACCESS_READWRITE`: `WPD_COMMAND_ACCESS_TYPES` = 3;
public typealias `WPD_COMMAND_ACCESS_TYPES` = Int;
// UNSUPPORTED Rust 584:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_COMMAND_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 3 };

// UNSUPPORTED Rust 585:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_EVENT_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 11 };

// UNSUPPORTED Rust 586:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_FIXED_PROPERTY_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 9 };

// UNSUPPORTED Rust 587:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_FUNCTIONAL_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 5 };

// UNSUPPORTED Rust 588:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_COMMANDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 2 };

// UNSUPPORTED Rust 589:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_CONTENT_TYPES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 6 };

// UNSUPPORTED Rust 590:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_EVENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 10 };

// UNSUPPORTED Rust 591:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FORMATS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 7 };

// UNSUPPORTED Rust 592:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FORMAT_PROPERTIES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 8 };

// UNSUPPORTED Rust 593:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FUNCTIONAL_CATEGORIES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 4 };

// UNSUPPORTED Rust 594:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CLASS_EXTENSION_REGISTER_SERVICE_INTERFACES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f0779b5_fa2b_4766_9cb2_f73ba30b6758), pid: 2 };

// UNSUPPORTED Rust 595:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CLASS_EXTENSION_UNREGISTER_SERVICE_INTERFACES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f0779b5_fa2b_4766_9cb2_f73ba30b6758), pid: 3 };

// UNSUPPORTED Rust 596:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_CLASS_EXTENSION_WRITE_DEVICE_INFORMATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x33fb0d11_64a3_4fac_b4c7_3dfeaa99b051), pid: 2 };

// UNSUPPORTED Rust 597:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_COMMIT_KEYPAIR: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x78f9c6fc_79b8_473c_9060_6bd23dd072c4), pid: 3 };

// UNSUPPORTED Rust 598:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_COMMON_GET_OBJECT_IDS_FROM_PERSISTENT_UNIQUE_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 3 };

// UNSUPPORTED Rust 599:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_COMMON_RESET_DEVICE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 2 };

// UNSUPPORTED Rust 600:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_COMMON_SAVE_CLIENT_INFORMATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 4 };

// UNSUPPORTED Rust 601:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_DEVICE_HINTS_GET_CONTENT_LOCATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0d5fb92b_cb46_4c4f_8343_0bc3d3f17c84), pid: 2 };

// UNSUPPORTED Rust 602:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_GENERATE_KEYPAIR: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x78f9c6fc_79b8_473c_9060_6bd23dd072c4), pid: 2 };

// UNSUPPORTED Rust 603:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MEDIA_CAPTURE_PAUSE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x59b433ba_fe44_4d8d_808c_6bcb9b0f15e8), pid: 4 };

// UNSUPPORTED Rust 604:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MEDIA_CAPTURE_START: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x59b433ba_fe44_4d8d_808c_6bcb9b0f15e8), pid: 2 };

// UNSUPPORTED Rust 605:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MEDIA_CAPTURE_STOP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x59b433ba_fe44_4d8d_808c_6bcb9b0f15e8), pid: 3 };

// UNSUPPORTED Rust 606:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_END_DATA_TRANSFER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 17 };

// UNSUPPORTED Rust 607:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITHOUT_DATA_PHASE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 12 };

// UNSUPPORTED Rust 608:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITH_DATA_TO_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 13 };

// UNSUPPORTED Rust 609:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITH_DATA_TO_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 14 };

// UNSUPPORTED Rust 610:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_GET_SUPPORTED_VENDOR_OPCODES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 11 };

// UNSUPPORTED Rust 611:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_GET_VENDOR_EXTENSION_DESCRIPTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 18 };

// UNSUPPORTED Rust 612:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_READ_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 15 };

// UNSUPPORTED Rust 613:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_MTP_EXT_WRITE_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 16 };

// UNSUPPORTED Rust 614:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_ENUMERATION_END_FIND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 4 };

// UNSUPPORTED Rust 615:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_ENUMERATION_FIND_NEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 3 };

// UNSUPPORTED Rust 616:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_ENUMERATION_START_FIND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 2 };

// UNSUPPORTED Rust 617:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_COMMIT_OBJECT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 5 };

// UNSUPPORTED Rust 618:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_COPY_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 9 };

// UNSUPPORTED Rust 619:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_CREATE_OBJECT_WITH_PROPERTIES_AND_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 3 };

// UNSUPPORTED Rust 620:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_CREATE_OBJECT_WITH_PROPERTIES_ONLY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 2 };

// UNSUPPORTED Rust 621:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_DELETE_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 7 };

// UNSUPPORTED Rust 622:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_MOVE_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 8 };

// UNSUPPORTED Rust 623:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_REVERT_OBJECT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 6 };

// UNSUPPORTED Rust 624:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_UPDATE_OBJECT_WITH_PROPERTIES_AND_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 10 };

// UNSUPPORTED Rust 625:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_MANAGEMENT_WRITE_OBJECT_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 4 };

// UNSUPPORTED Rust 626:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_END: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 7 };

// UNSUPPORTED Rust 627:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_NEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 6 };

// UNSUPPORTED Rust 628:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_START: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 5 };

// UNSUPPORTED Rust 629:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_END: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 4 };

// UNSUPPORTED Rust 630:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_NEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 3 };

// UNSUPPORTED Rust 631:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_START: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 2 };

// UNSUPPORTED Rust 632:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_END: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 10 };

// UNSUPPORTED Rust 633:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_NEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 9 };

// UNSUPPORTED Rust 634:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_START: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 8 };

// UNSUPPORTED Rust 635:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_DELETE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 7 };

// UNSUPPORTED Rust 636:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_GET: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 4 };

// UNSUPPORTED Rust 637:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_GET_ALL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 6 };

// UNSUPPORTED Rust 638:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_GET_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 3 };

// UNSUPPORTED Rust 639:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_GET_SUPPORTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 2 };

// UNSUPPORTED Rust 640:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_PROPERTIES_SET: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 5 };

// UNSUPPORTED Rust 641:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_CLOSE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 7 };

// UNSUPPORTED Rust 642:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_COMMIT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 12 };

// UNSUPPORTED Rust 643:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_CREATE_RESOURCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 9 };

// UNSUPPORTED Rust 644:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_DELETE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 8 };

// UNSUPPORTED Rust 645:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_GET_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 3 };

// UNSUPPORTED Rust 646:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_GET_SUPPORTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 2 };

// UNSUPPORTED Rust 647:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_OPEN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 4 };

// UNSUPPORTED Rust 648:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 5 };

// UNSUPPORTED Rust 649:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_REVERT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 10 };

// UNSUPPORTED Rust 650:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_SEEK: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 11 };

// UNSUPPORTED Rust 651:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_SEEK_IN_UNITS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 13 };

// UNSUPPORTED Rust 652:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_OBJECT_RESOURCES_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 6 };

// UNSUPPORTED Rust 653:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_PROCESS_WIRELESS_PROFILE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x78f9c6fc_79b8_473c_9060_6bd23dd072c4), pid: 4 };

// UNSUPPORTED Rust 654:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_COMMAND_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 16 };

// UNSUPPORTED Rust 655:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_EVENT_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 11 };

// UNSUPPORTED Rust 656:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_EVENT_PARAMETER_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 12 };

// UNSUPPORTED Rust 657:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 7 };

// UNSUPPORTED Rust 658:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_PROPERTY_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 9 };

// UNSUPPORTED Rust 659:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_RENDERING_PROFILES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 14 };

// UNSUPPORTED Rust 660:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_INHERITED_SERVICES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 13 };

// UNSUPPORTED Rust 661:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_METHOD_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 4 };

// UNSUPPORTED Rust 662:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_METHOD_PARAMETER_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 5 };

// UNSUPPORTED Rust 663:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_COMMANDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 15 };

// UNSUPPORTED Rust 664:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_EVENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 10 };

// UNSUPPORTED Rust 665:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_FORMATS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 6 };

// UNSUPPORTED Rust 666:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_FORMAT_PROPERTIES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 8 };

// UNSUPPORTED Rust 667:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_METHODS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 2 };

// UNSUPPORTED Rust 668:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_METHODS_BY_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 3 };

// UNSUPPORTED Rust 669:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_COMMON_GET_SERVICE_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x322f071d_36ef_477f_b4b5_6f52d734baee), pid: 2 };

// UNSUPPORTED Rust 670:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_METHODS_CANCEL_INVOKE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 3 };

// UNSUPPORTED Rust 671:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_METHODS_END_INVOKE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 4 };

// UNSUPPORTED Rust 672:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SERVICE_METHODS_START_INVOKE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 2 };

// UNSUPPORTED Rust 673:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_SMS_SEND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1), pid: 2 };

// UNSUPPORTED Rust 674:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_STILL_IMAGE_CAPTURE_INITIATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4fcd6982_22a2_4b05_a48b_62d38bf27b32), pid: 2 };

// UNSUPPORTED Rust 675:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_STORAGE_EJECT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xd8f907a6_34cc_45fa_97fb_d007fa47ec94), pid: 4 };

// UNSUPPORTED Rust 676:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMAND_STORAGE_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xd8f907a6_34cc_45fa_97fb_d007fa47ec94), pid: 2 };

// UNSUPPORTED Rust 677:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_BODY_TEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f), pid: 3 };

// UNSUPPORTED Rust 678:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_END_DATETIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f), pid: 6 };

// UNSUPPORTED Rust 679:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_NOTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f), pid: 7 };

// UNSUPPORTED Rust 680:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f);

// UNSUPPORTED Rust 681:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_PRIORITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f), pid: 4 };

// UNSUPPORTED Rust 682:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_START_DATETIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f), pid: 5 };

// UNSUPPORTED Rust 683:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_COMMON_INFORMATION_SUBJECT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb28ae94b_05a4_4e8e_be01_72cc7e099d8f), pid: 2 };

// UNSUPPORTED Rust 684:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_ANNIVERSARY_DATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 62 };

// UNSUPPORTED Rust 685:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_ASSISTANT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 61 };

// UNSUPPORTED Rust 686:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BIRTHDATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 57 };

// UNSUPPORTED Rust 687:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_EMAIL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 34 };

// UNSUPPORTED Rust 688:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_EMAIL2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 35 };

// UNSUPPORTED Rust 689:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_FAX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 45 };

// UNSUPPORTED Rust 690:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_FULL_POSTAL_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 17 };

// UNSUPPORTED Rust 691:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_PHONE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 40 };

// UNSUPPORTED Rust 692:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_PHONE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 41 };

// UNSUPPORTED Rust 693:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_CITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 20 };

// UNSUPPORTED Rust 694:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_COUNTRY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 23 };

// UNSUPPORTED Rust 695:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_LINE1: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 18 };

// UNSUPPORTED Rust 696:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_LINE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 19 };

// UNSUPPORTED Rust 697:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_POSTAL_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 22 };

// UNSUPPORTED Rust 698:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_REGION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 21 };

// UNSUPPORTED Rust 699:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_BUSINESS_WEB_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 50 };

// UNSUPPORTED Rust 700:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_CHILDREN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 60 };

// UNSUPPORTED Rust 701:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_COMPANY_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 54 };

// UNSUPPORTED Rust 702:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_DISPLAY_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 2 };

// UNSUPPORTED Rust 703:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_FIRST_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 3 };

// UNSUPPORTED Rust 704:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_INSTANT_MESSENGER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 51 };

// UNSUPPORTED Rust 705:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_INSTANT_MESSENGER2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 52 };

// UNSUPPORTED Rust 706:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_INSTANT_MESSENGER3: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 53 };

// UNSUPPORTED Rust 707:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_LAST_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 5 };

// UNSUPPORTED Rust 708:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_MIDDLE_NAMES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 4 };

// UNSUPPORTED Rust 709:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_MOBILE_PHONE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 42 };

// UNSUPPORTED Rust 710:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_MOBILE_PHONE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 43 };

// UNSUPPORTED Rust 711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b);

// UNSUPPORTED Rust 712:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_EMAILS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 36 };

// UNSUPPORTED Rust 713:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_FULL_POSTAL_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 24 };

// UNSUPPORTED Rust 714:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_PHONES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 47 };

// UNSUPPORTED Rust 715:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_POSTAL_ADDRESS_CITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 27 };

// UNSUPPORTED Rust 716:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_POSTAL_ADDRESS_LINE1: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 25 };

// UNSUPPORTED Rust 717:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_POSTAL_ADDRESS_LINE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 26 };

// UNSUPPORTED Rust 718:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_POSTAL_ADDRESS_POSTAL_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 29 };

// UNSUPPORTED Rust 719:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_POSTAL_ADDRESS_POSTAL_COUNTRY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 30 };

// UNSUPPORTED Rust 720:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_OTHER_POSTAL_ADDRESS_REGION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 28 };

// UNSUPPORTED Rust 721:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PAGER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 46 };

// UNSUPPORTED Rust 722:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_EMAIL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 32 };

// UNSUPPORTED Rust 723:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_EMAIL2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 33 };

// UNSUPPORTED Rust 724:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_FAX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 44 };

// UNSUPPORTED Rust 725:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_FULL_POSTAL_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 10 };

// UNSUPPORTED Rust 726:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_PHONE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 38 };

// UNSUPPORTED Rust 727:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_PHONE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 39 };

// UNSUPPORTED Rust 728:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_CITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 13 };

// UNSUPPORTED Rust 729:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_COUNTRY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 16 };

// UNSUPPORTED Rust 730:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_LINE1: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 11 };

// UNSUPPORTED Rust 731:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_LINE2: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 12 };

// UNSUPPORTED Rust 732:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_POSTAL_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 15 };

// UNSUPPORTED Rust 733:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_REGION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 14 };

// UNSUPPORTED Rust 734:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PERSONAL_WEB_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 49 };

// UNSUPPORTED Rust 735:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PHONETIC_COMPANY_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 55 };

// UNSUPPORTED Rust 736:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PHONETIC_FIRST_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 8 };

// UNSUPPORTED Rust 737:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PHONETIC_LAST_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 9 };

// UNSUPPORTED Rust 738:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PREFIX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 6 };

// UNSUPPORTED Rust 739:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PRIMARY_EMAIL_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 31 };

// UNSUPPORTED Rust 740:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PRIMARY_FAX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 58 };

// UNSUPPORTED Rust 741:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PRIMARY_PHONE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 37 };

// UNSUPPORTED Rust 742:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_PRIMARY_WEB_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 48 };

// UNSUPPORTED Rust 743:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_RINGTONE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 63 };

// UNSUPPORTED Rust 744:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_ROLE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 56 };

// UNSUPPORTED Rust 745:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_SPOUSE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 59 };

// UNSUPPORTED Rust 746:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTACT_SUFFIX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xfbd4fdab_987d_4777_b3f9_726185a9312b), pid: 7 };

// UNSUPPORTED Rust 747:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_ALL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x80e170d2_1055_4a3e_b952_82cc4f8a8689);

// UNSUPPORTED Rust 748:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_APPOINTMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0fed060e_8793_4b1e_90c9_48ac389ac631);

// UNSUPPORTED Rust 749:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_AUDIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ad2c85e_5e2d_45e5_8864_4f229e3c6cf0);

// UNSUPPORTED Rust 750:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_AUDIO_ALBUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa18737e_5009_48fa_ae21_85f24383b4e6);

// UNSUPPORTED Rust 751:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_CALENDAR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1fd5967_6023_49a0_9df1_f8060be751b0);

// UNSUPPORTED Rust 752:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_CERTIFICATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc3876e8_a948_4060_9050_cbd77e8a3d87);

// UNSUPPORTED Rust 753:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_CONTACT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeaba8313_4525_4707_9f0e_87c6808e9435);

// UNSUPPORTED Rust 754:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_CONTACT_GROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x346b8932_4c36_40d8_9415_1828291f9de9);

// UNSUPPORTED Rust 755:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_DOCUMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x680adf52_950a_4041_9b41_65e393648155);

// UNSUPPORTED Rust 756:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_EMAIL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8038044a_7e51_4f8f_883d_1d0623d14533);

// UNSUPPORTED Rust 757:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_FOLDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27e2e392_a111_48e0_ab0c_e17705a05f85);

// UNSUPPORTED Rust 758:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_FUNCTIONAL_OBJECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x99ed0160_17ff_4c44_9d98_1d7a6f941921);

// UNSUPPORTED Rust 759:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_GENERIC_FILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0085e0a6_8d34_45d7_bc5c_447e59c73d48);

// UNSUPPORTED Rust 760:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_GENERIC_MESSAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe80eaaf8_b2db_4133_b67e_1bef4b4a6e5f);

// UNSUPPORTED Rust 761:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef2107d5_a52a_4243_a26b_62d4176d7603);

// UNSUPPORTED Rust 762:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_IMAGE_ALBUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75793148_15f5_4a30_a813_54ed8a37e226);

// UNSUPPORTED Rust 763:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_MEDIA_CAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5e88b3cc_3e65_4e62_bfff_229495253ab0);

// UNSUPPORTED Rust 764:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_MEMO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9cd20ecf_3b50_414f_a641_e473ffe45751);

// UNSUPPORTED Rust 765:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_MIXED_CONTENT_ALBUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00f0c3ac_a593_49ac_9219_24abca5a2563);

// UNSUPPORTED Rust 766:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_NETWORK_ASSOCIATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x031da7ee_18c8_4205_847e_89a11261d0f3);

// UNSUPPORTED Rust 767:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_PLAYLIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a33f7e4_af13_48f5_994e_77369dfe04a3);

// UNSUPPORTED Rust 768:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_PROGRAM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd269f96a_247c_4bff_98fb_97f3c49220e6);

// UNSUPPORTED Rust 769:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_SECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x821089f5_1d91_4dc9_be3c_bbb1b35b18ce);

// UNSUPPORTED Rust 770:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_TASK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63252f2c_887f_4cb6_b1ac_d29855dcef6c);

// UNSUPPORTED Rust 771:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_TELEVISION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60a169cf_f2ae_4e21_9375_9677f11c1c6e);

// UNSUPPORTED Rust 772:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_UNSPECIFIED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28d8d31e_249c_454e_aabc_34883168e634);

// UNSUPPORTED Rust 773:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_VIDEO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9261b03c_3d78_4519_85e3_02c5e1f50bb9);

// UNSUPPORTED Rust 774:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_VIDEO_ALBUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x012b0db7_d4c1_45d6_b081_94b87779614f);

// UNSUPPORTED Rust 775:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_CONTENT_TYPE_WIRELESS_PROFILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0bac070a_9f5f_4da4_a8f6_3de44d68fd6c);

public const val `WPD_CONTROL_FUNCTION_GENERIC_MESSAGE`: UInt = 66u;
public const val `WPD_CROPPED_STATUS_CROPPED`: `WPD_CROPPED_STATUS_VALUES` = 1;
public const val `WPD_CROPPED_STATUS_NOT_CROPPED`: `WPD_CROPPED_STATUS_VALUES` = 0;
public const val `WPD_CROPPED_STATUS_SHOULD_NOT_BE_CROPPED`: `WPD_CROPPED_STATUS_VALUES` = 2;
public typealias `WPD_CROPPED_STATUS_VALUES` = Int;
// UNSUPPORTED Rust 781:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_DATETIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 11 };

// UNSUPPORTED Rust 782:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_EDP_IDENTITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x6c2b878c_c2ec_490d_b425_d7a75e23e5ed), pid: 1 };

// UNSUPPORTED Rust 783:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_FIRMWARE_VERSION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 3 };

// UNSUPPORTED Rust 784:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_FRIENDLY_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 12 };

// UNSUPPORTED Rust 785:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_FUNCTIONAL_UNIQUE_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x463dd662_7fc4_4291_911c_7f4c9cca9799), pid: 2 };

// UNSUPPORTED Rust 786:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_MANUFACTURER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 7 };

// UNSUPPORTED Rust 787:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_MODEL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 8 };

// UNSUPPORTED Rust 788:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_MODEL_UNIQUE_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x463dd662_7fc4_4291_911c_7f4c9cca9799), pid: 3 };

// UNSUPPORTED Rust 789:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_NETWORK_IDENTIFIER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 16 };

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `WPD_DEVICE_OBJECT_ID`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DEVICE");
// UNSUPPORTED Rust 791:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_POWER_LEVEL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 4 };

// UNSUPPORTED Rust 792:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_POWER_SOURCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 5 };

// UNSUPPORTED Rust 793:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc);

// UNSUPPORTED Rust 794:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_PROPERTIES_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x463dd662_7fc4_4291_911c_7f4c9cca9799);

// UNSUPPORTED Rust 795:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_PROPERTIES_V3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c2b878c_c2ec_490d_b425_d7a75e23e5ed);

// UNSUPPORTED Rust 796:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_PROTOCOL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 6 };

// UNSUPPORTED Rust 797:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_SERIAL_NUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 9 };

// UNSUPPORTED Rust 798:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_SUPPORTED_DRM_SCHEMES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 13 };

// UNSUPPORTED Rust 799:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_SUPPORTED_FORMATS_ARE_ORDERED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 14 };

// UNSUPPORTED Rust 800:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_SUPPORTS_NON_CONSUMABLE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 10 };

// UNSUPPORTED Rust 801:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_SYNC_PARTNER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 2 };

// UNSUPPORTED Rust 802:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_TRANSPORT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x463dd662_7fc4_4291_911c_7f4c9cca9799), pid: 4 };

public typealias `WPD_DEVICE_TRANSPORTS` = Int;
public const val `WPD_DEVICE_TRANSPORT_BLUETOOTH`: `WPD_DEVICE_TRANSPORTS` = 3;
public const val `WPD_DEVICE_TRANSPORT_IP`: `WPD_DEVICE_TRANSPORTS` = 2;
public const val `WPD_DEVICE_TRANSPORT_UNSPECIFIED`: `WPD_DEVICE_TRANSPORTS` = 0;
public const val `WPD_DEVICE_TRANSPORT_USB`: `WPD_DEVICE_TRANSPORTS` = 1;
// UNSUPPORTED Rust 808:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x26d4979a_e643_4626_9e2b_736dc0c92fdc), pid: 15 };

public typealias `WPD_DEVICE_TYPES` = Int;
public const val `WPD_DEVICE_TYPE_AUDIO_RECORDER`: `WPD_DEVICE_TYPES` = 6;
public const val `WPD_DEVICE_TYPE_CAMERA`: `WPD_DEVICE_TYPES` = 1;
public const val `WPD_DEVICE_TYPE_GENERIC`: `WPD_DEVICE_TYPES` = 0;
public const val `WPD_DEVICE_TYPE_MEDIA_PLAYER`: `WPD_DEVICE_TYPES` = 2;
public const val `WPD_DEVICE_TYPE_PERSONAL_INFORMATION_MANAGER`: `WPD_DEVICE_TYPES` = 5;
public const val `WPD_DEVICE_TYPE_PHONE`: `WPD_DEVICE_TYPES` = 3;
public const val `WPD_DEVICE_TYPE_VIDEO`: `WPD_DEVICE_TYPES` = 4;
// UNSUPPORTED Rust 817:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_DEVICE_USE_DEVICE_STAGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x463dd662_7fc4_4291_911c_7f4c9cca9799), pid: 5 };

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_DOCUMENT_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b110203_eb95_4f02_93e0_97c631493ad5);

public typealias `WPD_EFFECT_MODES` = Int;
public const val `WPD_EFFECT_MODE_BLACK_AND_WHITE`: `WPD_EFFECT_MODES` = 2;
public const val `WPD_EFFECT_MODE_COLOR`: `WPD_EFFECT_MODES` = 1;
public const val `WPD_EFFECT_MODE_SEPIA`: `WPD_EFFECT_MODES` = 3;
public const val `WPD_EFFECT_MODE_UNDEFINED`: `WPD_EFFECT_MODES` = 0;
// UNSUPPORTED Rust 824:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_BCC_LINE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 4 };

// UNSUPPORTED Rust 825:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_CC_LINE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 3 };

// UNSUPPORTED Rust 826:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_HAS_ATTACHMENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 9 };

// UNSUPPORTED Rust 827:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_HAS_BEEN_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 7 };

// UNSUPPORTED Rust 828:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5);

// UNSUPPORTED Rust 829:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_RECEIVED_TIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 8 };

// UNSUPPORTED Rust 830:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_SENDER_ADDRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 10 };

// UNSUPPORTED Rust 831:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EMAIL_TO_LINE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x41f8f65a_5484_4782_b13d_4740dd7c37c5), pid: 2 };

// UNSUPPORTED Rust 832:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_ATTRIBUTES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10c96578_2e81_4111_adde_e08ca6138f6d);

// UNSUPPORTED Rust 833:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_ATTRIBUTE_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x10c96578_2e81_4111_adde_e08ca6138f6d), pid: 2 };

// UNSUPPORTED Rust 834:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_ATTRIBUTE_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x10c96578_2e81_4111_adde_e08ca6138f6d), pid: 4 };

// UNSUPPORTED Rust 835:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_ATTRIBUTE_PARAMETERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x10c96578_2e81_4111_adde_e08ca6138f6d), pid: 3 };

// UNSUPPORTED Rust 836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_DEVICE_CAPABILITIES_UPDATED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36885aa1_cd54_4daa_b3d0_afb3e03f5999);

// UNSUPPORTED Rust 837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_DEVICE_REMOVED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe4cbca1b_6918_48b9_85ee_02be7c850af9);

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_DEVICE_RESET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7755cf53_c1ed_44f3_b5a2_451e2c376b27);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_MTP_VENDOR_EXTENDED_EVENTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_5738_4ff2_8445_be3126691059);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ba2e40a_6b4c_4295_bb43_26322b99aeb2);

// UNSUPPORTED Rust 841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OBJECT_ADDED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa726da95_e207_4b02_8d44_bef2e86cbffc);

// UNSUPPORTED Rust 842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OBJECT_REMOVED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe82ab88_a52c_4823_96e5_d0272671fc38);

// UNSUPPORTED Rust 843:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OBJECT_TRANSFER_REQUESTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d16a0a1_f2c6_41da_8f19_5e53721adbf2);

// UNSUPPORTED Rust 844:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OBJECT_UPDATED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1445a759_2e01_485d_9f27_ff07dae697ab);

// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OPTIONS_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3d8dad7_a361_4b83_8a48_5b02ce10713b);

// UNSUPPORTED Rust 846:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OPTION_IS_AUTOPLAY_EVENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3d8dad7_a361_4b83_8a48_5b02ce10713b), pid: 3 };

// UNSUPPORTED Rust 847:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_OPTION_IS_BROADCAST_EVENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3d8dad7_a361_4b83_8a48_5b02ce10713b), pid: 2 };

// UNSUPPORTED Rust 848:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_CHILD_HIERARCHY_CHANGED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 8 };

// UNSUPPORTED Rust 849:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_EVENT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 3 };

// UNSUPPORTED Rust 850:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_OBJECT_CREATION_COOKIE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 7 };

// UNSUPPORTED Rust 851:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_OBJECT_PARENT_PERSISTENT_UNIQUE_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 6 };

// UNSUPPORTED Rust 852:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_OPERATION_PROGRESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 5 };

// UNSUPPORTED Rust 853:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_OPERATION_STATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 4 };

// UNSUPPORTED Rust 854:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_PNP_DEVICE_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0), pid: 2 };

// UNSUPPORTED Rust 855:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PARAMETER_SERVICE_METHOD_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x52807b8a_4914_4323_9b9a_74f654b2b846), pid: 2 };

// UNSUPPORTED Rust 856:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15ab1953_f817_4fef_a921_5676e838f6e0);

// UNSUPPORTED Rust 857:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_PROPERTIES_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x52807b8a_4914_4323_9b9a_74f654b2b846);

// UNSUPPORTED Rust 858:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_SERVICE_METHOD_COMPLETE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a33f5f8_0acc_4d9b_9cc4_112d353b86ca);

// UNSUPPORTED Rust 859:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_EVENT_STORAGE_FORMAT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3782616b_22bc_4474_a251_3070f8d38857);

public typealias `WPD_EXPOSURE_METERING_MODES` = Int;
public const val `WPD_EXPOSURE_METERING_MODE_AVERAGE`: `WPD_EXPOSURE_METERING_MODES` = 1;
public const val `WPD_EXPOSURE_METERING_MODE_CENTER_SPOT`: `WPD_EXPOSURE_METERING_MODES` = 4;
public const val `WPD_EXPOSURE_METERING_MODE_CENTER_WEIGHTED_AVERAGE`: `WPD_EXPOSURE_METERING_MODES` = 2;
public const val `WPD_EXPOSURE_METERING_MODE_MULTI_SPOT`: `WPD_EXPOSURE_METERING_MODES` = 3;
public const val `WPD_EXPOSURE_METERING_MODE_UNDEFINED`: `WPD_EXPOSURE_METERING_MODES` = 0;
public typealias `WPD_EXPOSURE_PROGRAM_MODES` = Int;
public const val `WPD_EXPOSURE_PROGRAM_MODE_ACTION`: `WPD_EXPOSURE_PROGRAM_MODES` = 6;
public const val `WPD_EXPOSURE_PROGRAM_MODE_APERTURE_PRIORITY`: `WPD_EXPOSURE_PROGRAM_MODES` = 3;
public const val `WPD_EXPOSURE_PROGRAM_MODE_AUTO`: `WPD_EXPOSURE_PROGRAM_MODES` = 2;
public const val `WPD_EXPOSURE_PROGRAM_MODE_CREATIVE`: `WPD_EXPOSURE_PROGRAM_MODES` = 5;
public const val `WPD_EXPOSURE_PROGRAM_MODE_MANUAL`: `WPD_EXPOSURE_PROGRAM_MODES` = 1;
public const val `WPD_EXPOSURE_PROGRAM_MODE_PORTRAIT`: `WPD_EXPOSURE_PROGRAM_MODES` = 7;
public const val `WPD_EXPOSURE_PROGRAM_MODE_SHUTTER_PRIORITY`: `WPD_EXPOSURE_PROGRAM_MODES` = 4;
public const val `WPD_EXPOSURE_PROGRAM_MODE_UNDEFINED`: `WPD_EXPOSURE_PROGRAM_MODES` = 0;
public typealias `WPD_FLASH_MODES` = Int;
public const val `WPD_FLASH_MODE_AUTO`: `WPD_FLASH_MODES` = 1;
public const val `WPD_FLASH_MODE_EXTERNAL_SYNC`: `WPD_FLASH_MODES` = 6;
public const val `WPD_FLASH_MODE_FILL`: `WPD_FLASH_MODES` = 3;
public const val `WPD_FLASH_MODE_OFF`: `WPD_FLASH_MODES` = 2;
public const val `WPD_FLASH_MODE_RED_EYE_AUTO`: `WPD_FLASH_MODES` = 4;
public const val `WPD_FLASH_MODE_RED_EYE_FILL`: `WPD_FLASH_MODES` = 5;
public const val `WPD_FLASH_MODE_UNDEFINED`: `WPD_FLASH_MODES` = 0;
public const val `WPD_FOCUS_AUTOMATIC`: `WPD_FOCUS_MODES` = 2;
public const val `WPD_FOCUS_AUTOMATIC_MACRO`: `WPD_FOCUS_MODES` = 3;
public const val `WPD_FOCUS_MANUAL`: `WPD_FOCUS_MODES` = 1;
public typealias `WPD_FOCUS_METERING_MODES` = Int;
public const val `WPD_FOCUS_METERING_MODE_CENTER_SPOT`: `WPD_FOCUS_METERING_MODES` = 1;
public const val `WPD_FOCUS_METERING_MODE_MULTI_SPOT`: `WPD_FOCUS_METERING_MODES` = 2;
public const val `WPD_FOCUS_METERING_MODE_UNDEFINED`: `WPD_FOCUS_METERING_MODES` = 0;
public typealias `WPD_FOCUS_MODES` = Int;
public const val `WPD_FOCUS_UNDEFINED`: `WPD_FOCUS_MODES` = 0;
// UNSUPPORTED Rust 892:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_FOLDER_CONTENT_TYPES_ALLOWED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7e9a7abf_e568_4b34_aa2f_13bb12ab177d), pid: 2 };

// UNSUPPORTED Rust 893:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FOLDER_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7e9a7abf_e568_4b34_aa2f_13bb12ab177d);

// UNSUPPORTED Rust 894:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FORMAT_ATTRIBUTES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0a02000_bcaf_4be8_b3f5_233f231cf58f);

// UNSUPPORTED Rust 895:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_FORMAT_ATTRIBUTE_MIMETYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xa0a02000_bcaf_4be8_b3f5_233f231cf58f), pid: 3 };

// UNSUPPORTED Rust 896:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_FORMAT_ATTRIBUTE_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xa0a02000_bcaf_4be8_b3f5_233f231cf58f), pid: 2 };

// UNSUPPORTED Rust 897:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_ALL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d8a6512_a74c_448e_ba8a_f4ac07c49399);

// UNSUPPORTED Rust 898:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_AUDIO_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2a1919_c7c2_4a00_855d_f57cf06debbb);

// UNSUPPORTED Rust 899:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08ea466b_e3a4_4336_a1f3_a44d2b5c438c);

// UNSUPPORTED Rust 900:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_NETWORK_CONFIGURATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48f4db72_7c6a_4ab0_9e1a_470e3cdbf26a);

// UNSUPPORTED Rust 901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_RENDERING_INFORMATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08600ba4_a7ba_4a01_ab0e_0065d0a356d3);

// UNSUPPORTED Rust 902:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_SMS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0044a0b1_c1e9_4afd_b358_a62c6117c9cf);

// UNSUPPORTED Rust 903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_STILL_IMAGE_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x613ca327_ab93_4900_b4fa_895bb5874b79);

// UNSUPPORTED Rust 904:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_STORAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x23f05bbc_15de_4c2a_a55b_a9af5ce412ef);

// UNSUPPORTED Rust 905:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_CATEGORY_VIDEO_CAPTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe23e5f6b_7243_43aa_8df1_0eb3d968a918);

// UNSUPPORTED Rust 906:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_OBJECT_CATEGORY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x8f052d93_abca_4fc5_a5ac_b01df4dbe598), pid: 2 };

// UNSUPPORTED Rust 907:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_FUNCTIONAL_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f052d93_abca_4fc5_a5ac_b01df4dbe598);

// UNSUPPORTED Rust 908:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_BITDEPTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 3 };

// UNSUPPORTED Rust 909:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_COLOR_CORRECTED_STATUS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 5 };

// UNSUPPORTED Rust 910:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_CROPPED_STATUS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 4 };

// UNSUPPORTED Rust 911:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_EXPOSURE_INDEX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 8 };

// UNSUPPORTED Rust 912:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_EXPOSURE_TIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 7 };

// UNSUPPORTED Rust 913:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_FNUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 6 };

// UNSUPPORTED Rust 914:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_HORIZONTAL_RESOLUTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 9 };

// UNSUPPORTED Rust 915:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db);

// UNSUPPORTED Rust 916:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_IMAGE_VERTICAL_RESOLUTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x63d64908_9fa1_479f_85ba_9952216447db), pid: 10 };

// UNSUPPORTED Rust 917:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_ALBUM_ARTIST: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 25 };

// UNSUPPORTED Rust 918:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_ARTIST: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 24 };

// UNSUPPORTED Rust 919:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_AUDIO_ENCODING_PROFILE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 49 };

// UNSUPPORTED Rust 920:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_BITRATE_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 3 };

// UNSUPPORTED Rust 921:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_BUY_NOW: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 20 };

// UNSUPPORTED Rust 922:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_BYTE_BOOKMARK: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 36 };

// UNSUPPORTED Rust 923:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_COMPOSER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 11 };

// UNSUPPORTED Rust 924:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_COPYRIGHT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 4 };

// UNSUPPORTED Rust 925:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_DESCRIPTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 31 };

// UNSUPPORTED Rust 926:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_DESTINATION_URL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 30 };

// UNSUPPORTED Rust 927:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_DURATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 19 };

// UNSUPPORTED Rust 928:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_EFFECTIVE_RATING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 12 };

// UNSUPPORTED Rust 929:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_ENCODING_PROFILE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 21 };

// UNSUPPORTED Rust 930:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_GENRE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 32 };

// UNSUPPORTED Rust 931:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_GUID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 38 };

// UNSUPPORTED Rust 932:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_HEIGHT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 23 };

// UNSUPPORTED Rust 933:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_LAST_ACCESSED_TIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 8 };

// UNSUPPORTED Rust 934:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_LAST_BUILD_DATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 35 };

// UNSUPPORTED Rust 935:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_MANAGING_EDITOR: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 27 };

// UNSUPPORTED Rust 936:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_META_GENRE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 10 };

// UNSUPPORTED Rust 937:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_OBJECT_BOOKMARK: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 34 };

// UNSUPPORTED Rust 938:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_OWNER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 26 };

// UNSUPPORTED Rust 939:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_PARENTAL_RATING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 9 };

// UNSUPPORTED Rust 940:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8);

// UNSUPPORTED Rust 941:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_RELEASE_DATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 14 };

// UNSUPPORTED Rust 942:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_SAMPLE_RATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 15 };

// UNSUPPORTED Rust 943:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_SKIP_COUNT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 7 };

// UNSUPPORTED Rust 944:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_SOURCE_URL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 29 };

// UNSUPPORTED Rust 945:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_STAR_RATING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 16 };

// UNSUPPORTED Rust 946:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_SUBSCRIPTION_CONTENT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 5 };

// UNSUPPORTED Rust 947:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_SUB_DESCRIPTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 39 };

// UNSUPPORTED Rust 948:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_SUB_TITLE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 13 };

// UNSUPPORTED Rust 949:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_TIME_BOOKMARK: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 33 };

// UNSUPPORTED Rust 950:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_TIME_TO_LIVE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 37 };

// UNSUPPORTED Rust 951:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_TITLE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 18 };

// UNSUPPORTED Rust 952:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_TOTAL_BITRATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 2 };

// UNSUPPORTED Rust 953:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_USER_EFFECTIVE_RATING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 17 };

// UNSUPPORTED Rust 954:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_USE_COUNT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 6 };

// UNSUPPORTED Rust 955:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_WEBMASTER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 28 };

// UNSUPPORTED Rust 956:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEDIA_WIDTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2ed8ba05_0ad3_42dc_b0d0_bc95ac396ac8), pid: 22 };

// UNSUPPORTED Rust 957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_MEMO_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ffbfc7b_7483_41ad_afb9_da3f4e592b8d);

public typealias `WPD_META_GENRES` = Int;
public const val `WPD_META_GENRE_AUDIO_PODCAST`: `WPD_META_GENRES` = 64;
public const val `WPD_META_GENRE_FEATURE_FILM_VIDEO_FILE`: `WPD_META_GENRES` = 37;
public const val `WPD_META_GENRE_GENERIC_MUSIC_AUDIO_FILE`: `WPD_META_GENRES` = 1;
public const val `WPD_META_GENRE_GENERIC_NON_AUDIO_NON_VIDEO`: `WPD_META_GENRES` = 48;
public const val `WPD_META_GENRE_GENERIC_NON_MUSIC_AUDIO_FILE`: `WPD_META_GENRES` = 17;
public const val `WPD_META_GENRE_GENERIC_VIDEO_FILE`: `WPD_META_GENRES` = 33;
public const val `WPD_META_GENRE_HOME_VIDEO_FILE`: `WPD_META_GENRES` = 36;
public const val `WPD_META_GENRE_MIXED_PODCAST`: `WPD_META_GENRES` = 66;
public const val `WPD_META_GENRE_MUSIC_VIDEO_FILE`: `WPD_META_GENRES` = 35;
public const val `WPD_META_GENRE_NEWS_VIDEO_FILE`: `WPD_META_GENRES` = 34;
public const val `WPD_META_GENRE_PHOTO_MONTAGE_VIDEO_FILE`: `WPD_META_GENRES` = 40;
public const val `WPD_META_GENRE_SPOKEN_WORD_AUDIO_BOOK_FILES`: `WPD_META_GENRES` = 18;
public const val `WPD_META_GENRE_SPOKEN_WORD_FILES_NON_AUDIO_BOOK`: `WPD_META_GENRES` = 19;
public const val `WPD_META_GENRE_SPOKEN_WORD_NEWS`: `WPD_META_GENRES` = 20;
public const val `WPD_META_GENRE_SPOKEN_WORD_TALK_SHOWS`: `WPD_META_GENRES` = 21;
public const val `WPD_META_GENRE_TELEVISION_VIDEO_FILE`: `WPD_META_GENRES` = 38;
public const val `WPD_META_GENRE_TRAINING_EDUCATIONAL_VIDEO_FILE`: `WPD_META_GENRES` = 39;
public const val `WPD_META_GENRE_UNUSED`: `WPD_META_GENRES` = 0;
public const val `WPD_META_GENRE_VIDEO_PODCAST`: `WPD_META_GENRES` = 65;
// UNSUPPORTED Rust 978:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_METHOD_ATTRIBUTES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf17a5071_f039_44af_8efe_432cf32e432a);

// UNSUPPORTED Rust 979:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_METHOD_ATTRIBUTE_ACCESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf17a5071_f039_44af_8efe_432cf32e432a), pid: 4 };

// UNSUPPORTED Rust 980:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_METHOD_ATTRIBUTE_ASSOCIATED_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf17a5071_f039_44af_8efe_432cf32e432a), pid: 3 };

// UNSUPPORTED Rust 981:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_METHOD_ATTRIBUTE_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf17a5071_f039_44af_8efe_432cf32e432a), pid: 2 };

// UNSUPPORTED Rust 982:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_METHOD_ATTRIBUTE_PARAMETERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf17a5071_f039_44af_8efe_432cf32e432a), pid: 5 };

// UNSUPPORTED Rust 983:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MUSIC_ALBUM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 3 };

// UNSUPPORTED Rust 984:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MUSIC_LYRICS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 6 };

// UNSUPPORTED Rust 985:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MUSIC_MOOD: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 8 };

// UNSUPPORTED Rust 986:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_MUSIC_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6);

// UNSUPPORTED Rust 987:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_MUSIC_TRACK: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb324f56a_dc5d_46e5_b6df_d2ea414888c6), pid: 4 };

// UNSUPPORTED Rust 988:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_NETWORK_ASSOCIATION_HOST_NETWORK_IDENTIFIERS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe4c93c1f_b203_43f1_a100_5a07d11b0274), pid: 2 };

// UNSUPPORTED Rust 989:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_NETWORK_ASSOCIATION_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe4c93c1f_b203_43f1_a100_5a07d11b0274);

// UNSUPPORTED Rust 990:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_NETWORK_ASSOCIATION_X509V3SEQUENCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe4c93c1f_b203_43f1_a100_5a07d11b0274), pid: 3 };

// UNSUPPORTED Rust 991:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_BACK_REFERENCES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 21 };

// UNSUPPORTED Rust 992:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_CAN_DELETE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 26 };

// UNSUPPORTED Rust 993:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_CONTAINER_FUNCTIONAL_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 23 };

// UNSUPPORTED Rust 994:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_CONTENT_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 7 };

// UNSUPPORTED Rust 995:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_DATE_AUTHORED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 20 };

// UNSUPPORTED Rust 996:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_DATE_CREATED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 18 };

// UNSUPPORTED Rust 997:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_DATE_MODIFIED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 19 };

// UNSUPPORTED Rust 998:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 6 };

// UNSUPPORTED Rust 999:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_3G2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9850000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1000:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_3G2A: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a11202d_8759_4e34_ba5e_b1211087eee4);

// UNSUPPORTED Rust 1001:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_3GP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9840000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1002:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_3GPA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5172730_f971_41ef_a10b_2271a0019d7a);

// UNSUPPORTED Rust 1003:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_AAC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9030000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1004:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ABSTRACT_CONTACT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb810000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1005:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ABSTRACT_CONTACT_GROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba060000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1006:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ABSTRACT_MEDIA_CAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba0b0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1007:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_AIFF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30070000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1008:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ALL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1f62eb2_4bb3_479c_9cfa_05b5f3a57b22);

// UNSUPPORTED Rust 1009:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_AMR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9080000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1010:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ASF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x300c0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1011:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ASXPLAYLIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba130000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1012:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ATSCTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9870000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1013:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_AUDIBLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9040000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1014:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_AVCHD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9860000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1015:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_AVI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x300a0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1016:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_BMP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38040000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1017:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_CIFF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38050000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1018:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_DPOF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30060000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1019:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_DVBTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9880000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1020:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_EXECUTABLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30030000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1021:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_EXIF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38010000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_FLAC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9060000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1023:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_FLASHPIX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38030000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1024:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_GIF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38070000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1025:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_HTML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30050000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1026:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ICALENDAR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe030000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_ICON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x077232ed_102c_4638_9c22_83f142bfc822);

// UNSUPPORTED Rust 1028:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_JFIF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38080000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1029:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_JP2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x380f0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1030:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_JPEGXR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb8040000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1031:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_JPX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38100000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1032:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_M3UPLAYLIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba110000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1033:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_M4A: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30aba7ac_6ffd_4c23_a359_3e9b52f3f1c8);

// UNSUPPORTED Rust 1034:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MHT_COMPILED_HTML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba840000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1035:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MICROSOFT_EXCEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba850000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1036:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MICROSOFT_POWERPOINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba860000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1037:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MICROSOFT_WFC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1040000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1038:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MICROSOFT_WORD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba830000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1039:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MKV: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9900000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1040:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MP2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9830000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1041:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MP3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30090000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1042:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MP4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9820000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1043:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MPEG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x300b0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1044:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_MPLPLAYLIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba120000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1045:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_NETWORK_ASSOCIATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1020000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1046:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_OGG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9020000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1047:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_PCD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38090000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1048:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_PICT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x380a0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1049:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_PLSPLAYLIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba140000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1050:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_PNG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x380b0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1051:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_PROPERTIES_ONLY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30010000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1052:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_QCELP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9070000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1053:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_SCRIPT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30020000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1054:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_TEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30040000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1055:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_TIFF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x380d0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1056:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_TIFFEP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38020000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1057:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_TIFFIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x380e0000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1058:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_UNSPECIFIED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30000000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1059:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_VCALENDAR1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbe020000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1060:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_VCARD2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb820000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1061:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_VCARD3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb830000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1062:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_WAVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30080000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1063:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_WBMP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb8030000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1064:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_WINDOWSIMAGEFORMAT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb8810000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1065:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_WMA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9010000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1066:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_WMV: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9810000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1067:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_WPLPLAYLIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba100000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1068:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_X509V3CERTIFICATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1030000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1069:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_FORMAT_XML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba820000_ae6c_4804_98ba_c57b46965fe7);

// UNSUPPORTED Rust 1070:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_GENERATE_THUMBNAIL_FROM_RESOURCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 24 };

// UNSUPPORTED Rust 1071:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_HINT_LOCATION_DISPLAY_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 25 };

// UNSUPPORTED Rust 1072:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 2 };

// UNSUPPORTED Rust 1073:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_ISHIDDEN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 9 };

// UNSUPPORTED Rust 1074:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_ISSYSTEM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 10 };

// UNSUPPORTED Rust 1075:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_IS_DRM_PROTECTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 17 };

// UNSUPPORTED Rust 1076:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_KEYWORDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 15 };

// UNSUPPORTED Rust 1077:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_LANGUAGE_LOCALE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 27 };

// UNSUPPORTED Rust 1078:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 4 };

// UNSUPPORTED Rust 1079:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_NON_CONSUMABLE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 13 };

// UNSUPPORTED Rust 1080:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_ORIGINAL_FILE_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 12 };

// UNSUPPORTED Rust 1081:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_PARENT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 3 };

// UNSUPPORTED Rust 1082:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_PERSISTENT_UNIQUE_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 5 };

// UNSUPPORTED Rust 1083:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c);

// UNSUPPORTED Rust 1084:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_PROPERTIES_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0373cd3d_4a46_40d7_b4d8_73e8da74e775);

// UNSUPPORTED Rust 1085:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_REFERENCES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 14 };

// UNSUPPORTED Rust 1086:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 11 };

// UNSUPPORTED Rust 1087:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_SUPPORTED_UNITS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0373cd3d_4a46_40d7_b4d8_73e8da74e775), pid: 2 };

// UNSUPPORTED Rust 1088:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OBJECT_SYNC_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef6b490d_5cd8_437a_affc_da8b60ee4a3c), pid: 16 };

public typealias `WPD_OPERATION_STATES` = Int;
public const val `WPD_OPERATION_STATE_ABORTED`: `WPD_OPERATION_STATES` = 6;
public const val `WPD_OPERATION_STATE_CANCELLED`: `WPD_OPERATION_STATES` = 4;
public const val `WPD_OPERATION_STATE_FINISHED`: `WPD_OPERATION_STATES` = 5;
public const val `WPD_OPERATION_STATE_PAUSED`: `WPD_OPERATION_STATES` = 3;
public const val `WPD_OPERATION_STATE_RUNNING`: `WPD_OPERATION_STATES` = 2;
public const val `WPD_OPERATION_STATE_STARTED`: `WPD_OPERATION_STATES` = 1;
public const val `WPD_OPERATION_STATE_UNSPECIFIED`: `WPD_OPERATION_STATES` = 0;
// UNSUPPORTED Rust 1097:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OPTION_OBJECT_MANAGEMENT_RECURSIVE_DELETE_SUPPORTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 5001 };

// UNSUPPORTED Rust 1098:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OPTION_OBJECT_RESOURCES_NO_INPUT_BUFFER_ON_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 5003 };

// UNSUPPORTED Rust 1099:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OPTION_OBJECT_RESOURCES_SEEK_ON_READ_SUPPORTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 5001 };

// UNSUPPORTED Rust 1100:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OPTION_OBJECT_RESOURCES_SEEK_ON_WRITE_SUPPORTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 5002 };

// UNSUPPORTED Rust 1101:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OPTION_SMS_BINARY_MESSAGE_SUPPORTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1), pid: 5001 };

// UNSUPPORTED Rust 1102:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_OPTION_VALID_OBJECT_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 5001 };

// UNSUPPORTED Rust 1103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58);

// UNSUPPORTED Rust 1104:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_DEFAULT_VALUE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 5 };

// UNSUPPORTED Rust 1105:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_ENUMERATION_ELEMENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 9 };

// UNSUPPORTED Rust 1106:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_FORM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 4 };

public const val `WPD_PARAMETER_ATTRIBUTE_FORM_ENUMERATION`: `WpdParameterAttributeForm` = 2;
public const val `WPD_PARAMETER_ATTRIBUTE_FORM_OBJECT_IDENTIFIER`: `WpdParameterAttributeForm` = 4;
public const val `WPD_PARAMETER_ATTRIBUTE_FORM_RANGE`: `WpdParameterAttributeForm` = 1;
public const val `WPD_PARAMETER_ATTRIBUTE_FORM_REGULAR_EXPRESSION`: `WpdParameterAttributeForm` = 3;
public const val `WPD_PARAMETER_ATTRIBUTE_FORM_UNSPECIFIED`: `WpdParameterAttributeForm` = 0;
// UNSUPPORTED Rust 1112:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_MAX_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 11 };

// UNSUPPORTED Rust 1113:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 13 };

// UNSUPPORTED Rust 1114:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_ORDER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 2 };

// UNSUPPORTED Rust 1115:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_RANGE_MAX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 7 };

// UNSUPPORTED Rust 1116:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_RANGE_MIN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 6 };

// UNSUPPORTED Rust 1117:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_RANGE_STEP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 8 };

// UNSUPPORTED Rust 1118:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_REGULAR_EXPRESSION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 10 };

// UNSUPPORTED Rust 1119:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_USAGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 3 };

// UNSUPPORTED Rust 1120:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PARAMETER_ATTRIBUTE_VARTYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe6864dd7_f325_45ea_a1d5_97cf73b6ca58), pid: 12 };

public const val `WPD_PARAMETER_USAGE_IN`: `WPD_PARAMETER_USAGE_TYPES` = 1;
public const val `WPD_PARAMETER_USAGE_INOUT`: `WPD_PARAMETER_USAGE_TYPES` = 3;
public const val `WPD_PARAMETER_USAGE_OUT`: `WPD_PARAMETER_USAGE_TYPES` = 2;
public const val `WPD_PARAMETER_USAGE_RETURN`: `WPD_PARAMETER_USAGE_TYPES` = 0;
public typealias `WPD_PARAMETER_USAGE_TYPES` = Int;
public typealias `WPD_POWER_SOURCES` = Int;
public const val `WPD_POWER_SOURCE_BATTERY`: `WPD_POWER_SOURCES` = 0;
public const val `WPD_POWER_SOURCE_EXTERNAL`: `WPD_POWER_SOURCES` = 1;
// UNSUPPORTED Rust 1129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTIES_MTP_VENDOR_EXTENDED_DEVICE_PROPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d545058_8900_40b3_8f1d_dc246e1e8370);

// UNSUPPORTED Rust 1130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTIES_MTP_VENDOR_EXTENDED_OBJECT_PROPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d545058_4fce_4578_95c8_8698a9bc0f49);

// UNSUPPORTED Rust 1131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37);

// UNSUPPORTED Rust 1132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTES_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d9da160_74ae_43cc_85a9_fe555a80798e);

// UNSUPPORTED Rust 1133:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_CAN_DELETE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 5 };

// UNSUPPORTED Rust 1134:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_CAN_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 3 };

// UNSUPPORTED Rust 1135:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_CAN_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 4 };

// UNSUPPORTED Rust 1136:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_DEFAULT_VALUE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 6 };

// UNSUPPORTED Rust 1137:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_ENUMERATION_ELEMENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 11 };

// UNSUPPORTED Rust 1138:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_FAST_PROPERTY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 7 };

// UNSUPPORTED Rust 1139:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_FORM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 2 };

public const val `WPD_PROPERTY_ATTRIBUTE_FORM_ENUMERATION`: `WpdAttributeForm` = 2;
public const val `WPD_PROPERTY_ATTRIBUTE_FORM_OBJECT_IDENTIFIER`: `WpdAttributeForm` = 4;
public const val `WPD_PROPERTY_ATTRIBUTE_FORM_RANGE`: `WpdAttributeForm` = 1;
public const val `WPD_PROPERTY_ATTRIBUTE_FORM_REGULAR_EXPRESSION`: `WpdAttributeForm` = 3;
public const val `WPD_PROPERTY_ATTRIBUTE_FORM_UNSPECIFIED`: `WpdAttributeForm` = 0;
// UNSUPPORTED Rust 1145:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_MAX_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 13 };

// UNSUPPORTED Rust 1146:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x5d9da160_74ae_43cc_85a9_fe555a80798e), pid: 2 };

// UNSUPPORTED Rust 1147:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_RANGE_MAX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 9 };

// UNSUPPORTED Rust 1148:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_RANGE_MIN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 8 };

// UNSUPPORTED Rust 1149:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_RANGE_STEP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 10 };

// UNSUPPORTED Rust 1150:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_REGULAR_EXPRESSION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xab7943d8_6332_445f_a00d_8d5ef1e96f37), pid: 12 };

// UNSUPPORTED Rust 1151:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_ATTRIBUTE_VARTYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x5d9da160_74ae_43cc_85a9_fe555a80798e), pid: 3 };

// UNSUPPORTED Rust 1152:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_COMMAND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1002 };

// UNSUPPORTED Rust 1153:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_COMMAND_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1003 };

// UNSUPPORTED Rust 1154:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_CONTENT_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1008 };

// UNSUPPORTED Rust 1155:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_CONTENT_TYPES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1007 };

// UNSUPPORTED Rust 1156:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_EVENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1014 };

// UNSUPPORTED Rust 1157:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_EVENT_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1015 };

// UNSUPPORTED Rust 1158:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1010 };

// UNSUPPORTED Rust 1159:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_FORMATS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1009 };

// UNSUPPORTED Rust 1160:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_CATEGORIES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1004 };

// UNSUPPORTED Rust 1161:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_CATEGORY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1005 };

// UNSUPPORTED Rust 1162:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1006 };

// UNSUPPORTED Rust 1163:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_PROPERTY_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1012 };

// UNSUPPORTED Rust 1164:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_PROPERTY_KEYS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1011 };

// UNSUPPORTED Rust 1165:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_SUPPORTED_COMMANDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1001 };

// UNSUPPORTED Rust 1166:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CAPABILITIES_SUPPORTED_EVENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0cabec78_6b74_41c6_9216_2639d1fce356), pid: 1013 };

// UNSUPPORTED Rust 1167:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CLASS_EXTENSION_DEVICE_INFORMATION_VALUES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x33fb0d11_64a3_4fac_b4c7_3dfeaa99b051), pid: 1001 };

// UNSUPPORTED Rust 1168:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CLASS_EXTENSION_DEVICE_INFORMATION_WRITE_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x33fb0d11_64a3_4fac_b4c7_3dfeaa99b051), pid: 1002 };

// UNSUPPORTED Rust 1169:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CLASS_EXTENSION_SERVICE_INTERFACES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f0779b5_fa2b_4766_9cb2_f73ba30b6758), pid: 1002 };

// UNSUPPORTED Rust 1170:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CLASS_EXTENSION_SERVICE_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f0779b5_fa2b_4766_9cb2_f73ba30b6758), pid: 1001 };

// UNSUPPORTED Rust 1171:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_CLASS_EXTENSION_SERVICE_REGISTRATION_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7f0779b5_fa2b_4766_9cb2_f73ba30b6758), pid: 1003 };

// UNSUPPORTED Rust 1172:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_ACTIVITY_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1011 };

// UNSUPPORTED Rust 1173:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_CLIENT_INFORMATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1009 };

// UNSUPPORTED Rust 1174:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_CLIENT_INFORMATION_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1010 };

// UNSUPPORTED Rust 1175:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_COMMAND_CATEGORY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1001 };

// UNSUPPORTED Rust 1176:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_COMMAND_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1002 };

// UNSUPPORTED Rust 1177:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_COMMAND_TARGET: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1006 };

// UNSUPPORTED Rust 1178:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_DRIVER_ERROR_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1004 };

// UNSUPPORTED Rust 1179:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_HRESULT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1003 };

// UNSUPPORTED Rust 1180:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_OBJECT_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1008 };

// UNSUPPORTED Rust 1181:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_COMMON_PERSISTENT_UNIQUE_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf0422a9c_5dc8_4440_b5bd_5df28835658a), pid: 1007 };

// UNSUPPORTED Rust 1182:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_DEVICE_HINTS_CONTENT_LOCATIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0d5fb92b_cb46_4c4f_8343_0bc3d3f17c84), pid: 1002 };

// UNSUPPORTED Rust 1183:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_DEVICE_HINTS_CONTENT_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x0d5fb92b_cb46_4c4f_8343_0bc3d3f17c84), pid: 1001 };

// UNSUPPORTED Rust 1184:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_EVENT_PARAMS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_ef88_4e4d_95c3_4f327f728a96), pid: 1011 };

// UNSUPPORTED Rust 1185:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_OPERATION_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1001 };

// UNSUPPORTED Rust 1186:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_OPERATION_PARAMS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1002 };

// UNSUPPORTED Rust 1187:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_OPTIMAL_TRANSFER_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1013 };

// UNSUPPORTED Rust 1188:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_RESPONSE_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1003 };

// UNSUPPORTED Rust 1189:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_RESPONSE_PARAMS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1004 };

// UNSUPPORTED Rust 1190:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1006 };

// UNSUPPORTED Rust 1191:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1012 };

// UNSUPPORTED Rust 1192:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1009 };

// UNSUPPORTED Rust 1193:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_TO_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1008 };

// UNSUPPORTED Rust 1194:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_TO_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1010 };

// UNSUPPORTED Rust 1195:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_WRITTEN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1011 };

// UNSUPPORTED Rust 1196:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_TRANSFER_TOTAL_DATA_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1007 };

// UNSUPPORTED Rust 1197:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_VENDOR_EXTENSION_DESCRIPTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1014 };

// UNSUPPORTED Rust 1198:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_MTP_EXT_VENDOR_OPERATION_CODES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d545058_1a2e_4106_a357_771e0819fc56), pid: 1005 };

// UNSUPPORTED Rust 1199:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_NULL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000), pid: 0 };

// UNSUPPORTED Rust 1200:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_ENUMERATION_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 1004 };

// UNSUPPORTED Rust 1201:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_ENUMERATION_FILTER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 1002 };

// UNSUPPORTED Rust 1202:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_ENUMERATION_NUM_OBJECTS_REQUESTED: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 1005 };

// UNSUPPORTED Rust 1203:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_ENUMERATION_OBJECT_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 1003 };

// UNSUPPORTED Rust 1204:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_ENUMERATION_PARENT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb7474e91_e7f8_4ad9_b400_ad1a4b58eeec), pid: 1001 };

// UNSUPPORTED Rust 1205:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1002 };

// UNSUPPORTED Rust 1206:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_COPY_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1013 };

// UNSUPPORTED Rust 1207:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_CREATION_PROPERTIES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1001 };

// UNSUPPORTED Rust 1208:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1005 };

// UNSUPPORTED Rust 1209:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_DELETE_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1007 };

// UNSUPPORTED Rust 1210:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_DELETE_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1010 };

// UNSUPPORTED Rust 1211:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_DESTINATION_FOLDER_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1011 };

// UNSUPPORTED Rust 1212:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_MOVE_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1012 };

// UNSUPPORTED Rust 1213:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_NUM_BYTES_TO_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1003 };

// UNSUPPORTED Rust 1214:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_NUM_BYTES_WRITTEN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1004 };

// UNSUPPORTED Rust 1215:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1016 };

// UNSUPPORTED Rust 1216:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1006 };

// UNSUPPORTED Rust 1217:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1009 };

// UNSUPPORTED Rust 1218:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_OPTIMAL_TRANSFER_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1008 };

// UNSUPPORTED Rust 1219:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_PROPERTY_KEYS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1015 };

// UNSUPPORTED Rust 1220:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_MANAGEMENT_UPDATE_PROPERTIES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1e43dd_a9ed_4341_8bcc_186192aea089), pid: 1014 };

// UNSUPPORTED Rust 1221:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1002 };

// UNSUPPORTED Rust 1222:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_DEPTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1005 };

// UNSUPPORTED Rust 1223:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_OBJECT_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1007 };

// UNSUPPORTED Rust 1224:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_OBJECT_IDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1001 };

// UNSUPPORTED Rust 1225:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_PARENT_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1006 };

// UNSUPPORTED Rust 1226:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_PROPERTY_KEYS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1004 };

// UNSUPPORTED Rust 1227:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_VALUES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1003 };

// UNSUPPORTED Rust 1228:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_BULK_WRITE_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x11c824dd_04cd_4e4e_8c7b_f6efb794d84e), pid: 1008 };

// UNSUPPORTED Rust 1229:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 1001 };

// UNSUPPORTED Rust 1230:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 1003 };

// UNSUPPORTED Rust 1231:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_DELETE_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 1006 };

// UNSUPPORTED Rust 1232:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_KEYS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 1002 };

// UNSUPPORTED Rust 1233:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_VALUES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 1004 };

// UNSUPPORTED Rust 1234:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_WRITE_RESULTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x9e5582e4_0814_44e6_981a_b2998d583804), pid: 1005 };

// UNSUPPORTED Rust 1235:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_ACCESS_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1002 };

// UNSUPPORTED Rust 1236:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1005 };

// UNSUPPORTED Rust 1237:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_DATA: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1010 };

// UNSUPPORTED Rust 1238:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1007 };

// UNSUPPORTED Rust 1239:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_TO_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1006 };

// UNSUPPORTED Rust 1240:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_TO_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1008 };

// UNSUPPORTED Rust 1241:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_WRITTEN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1009 };

// UNSUPPORTED Rust 1242:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1001 };

// UNSUPPORTED Rust 1243:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_OPTIMAL_TRANSFER_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1011 };

// UNSUPPORTED Rust 1244:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_POSITION_FROM_START: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1014 };

// UNSUPPORTED Rust 1245:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_RESOURCE_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1004 };

// UNSUPPORTED Rust 1246:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_RESOURCE_KEYS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1003 };

// UNSUPPORTED Rust 1247:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_SEEK_OFFSET: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1012 };

// UNSUPPORTED Rust 1248:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_SEEK_ORIGIN_FLAG: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1013 };

// UNSUPPORTED Rust 1249:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_STREAM_UNITS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1016 };

// UNSUPPORTED Rust 1250:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_OBJECT_RESOURCES_SUPPORTS_UNITS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb3a2b22d_a595_4108_be0a_fc3c965f3d4a), pid: 1015 };

// UNSUPPORTED Rust 1251:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_PUBLIC_KEY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x78f9c6fc_79b8_473c_9060_6bd23dd072c4), pid: 1001 };

// UNSUPPORTED Rust 1252:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_COMMAND: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1018 };

// UNSUPPORTED Rust 1253:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_COMMAND_OPTIONS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1019 };

// UNSUPPORTED Rust 1254:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_EVENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1012 };

// UNSUPPORTED Rust 1255:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_EVENT_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1013 };

// UNSUPPORTED Rust 1256:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1002 };

// UNSUPPORTED Rust 1257:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_FORMATS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1007 };

// UNSUPPORTED Rust 1258:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_FORMAT_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1008 };

// UNSUPPORTED Rust 1259:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_INHERITANCE_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1014 };

// UNSUPPORTED Rust 1260:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_INHERITED_SERVICES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1015 };

// UNSUPPORTED Rust 1261:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_METHOD: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1003 };

// UNSUPPORTED Rust 1262:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_METHOD_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1004 };

// UNSUPPORTED Rust 1263:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_PARAMETER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1005 };

// UNSUPPORTED Rust 1264:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_PARAMETER_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1006 };

// UNSUPPORTED Rust 1265:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_PROPERTY_ATTRIBUTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1010 };

// UNSUPPORTED Rust 1266:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_PROPERTY_KEYS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1009 };

// UNSUPPORTED Rust 1267:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_RENDERING_PROFILES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1016 };

// UNSUPPORTED Rust 1268:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_COMMANDS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1017 };

// UNSUPPORTED Rust 1269:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_EVENTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1011 };

// UNSUPPORTED Rust 1270:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_METHODS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x24457e74_2e9f_44f9_8c57_1d1bcb170b89), pid: 1001 };

// UNSUPPORTED Rust 1271:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_METHOD: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 1001 };

// UNSUPPORTED Rust 1272:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_METHOD_CONTEXT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 1004 };

// UNSUPPORTED Rust 1273:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_METHOD_HRESULT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 1005 };

// UNSUPPORTED Rust 1274:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_METHOD_PARAMETER_VALUES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 1002 };

// UNSUPPORTED Rust 1275:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_METHOD_RESULT_VALUES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2d521ca8_c1b0_4268_a342_cf19321569bc), pid: 1003 };

// UNSUPPORTED Rust 1276:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SERVICE_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x322f071d_36ef_477f_b4b5_6f52d734baee), pid: 1001 };

// UNSUPPORTED Rust 1277:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SMS_BINARY_MESSAGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1), pid: 1004 };

// UNSUPPORTED Rust 1278:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SMS_MESSAGE_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1), pid: 1002 };

// UNSUPPORTED Rust 1279:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SMS_RECIPIENT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1), pid: 1001 };

// UNSUPPORTED Rust 1280:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_SMS_TEXT_MESSAGE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xafc25d66_fe0d_4114_9097_970c93e920d1), pid: 1003 };

// UNSUPPORTED Rust 1281:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_STORAGE_DESTINATION_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xd8f907a6_34cc_45fa_97fb_d007fa47ec94), pid: 1002 };

// UNSUPPORTED Rust 1282:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_PROPERTY_STORAGE_OBJECT_ID: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xd8f907a6_34cc_45fa_97fb_d007fa47ec94), pid: 1001 };

// UNSUPPORTED Rust 1283:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_RENDERING_INFORMATION_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc53d039f_ee23_4a31_8590_7639879870b4);

// UNSUPPORTED Rust 1284:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RENDERING_INFORMATION_PROFILES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xc53d039f_ee23_4a31_8590_7639879870b4), pid: 2 };

// UNSUPPORTED Rust 1285:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RENDERING_INFORMATION_PROFILE_ENTRY_CREATABLE_RESOURCES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xc53d039f_ee23_4a31_8590_7639879870b4), pid: 4 };

// UNSUPPORTED Rust 1286:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xc53d039f_ee23_4a31_8590_7639879870b4), pid: 3 };

public typealias `WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPES` = Int;
public const val `WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE_OBJECT`: `WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPES` = 0;
public const val `WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE_RESOURCE`: `WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPES` = 1;
// UNSUPPORTED Rust 1290:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ALBUM_ART: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf02aa354_2300_4e2d_a1b9_3b6730f7fa21), pid: 0 };

// UNSUPPORTED Rust 1291:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6);

// UNSUPPORTED Rust 1292:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_CAN_DELETE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 5 };

// UNSUPPORTED Rust 1293:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_CAN_READ: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 3 };

// UNSUPPORTED Rust 1294:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_CAN_WRITE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 4 };

// UNSUPPORTED Rust 1295:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 8 };

// UNSUPPORTED Rust 1296:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_OPTIMAL_READ_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 6 };

// UNSUPPORTED Rust 1297:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_OPTIMAL_WRITE_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 7 };

// UNSUPPORTED Rust 1298:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_RESOURCE_KEY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 9 };

// UNSUPPORTED Rust 1299:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ATTRIBUTE_TOTAL_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x1eb6f604_9278_429f_93cc_5bb8c06656b6), pid: 2 };

// UNSUPPORTED Rust 1300:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_AUDIO_CLIP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x3bc13982_85b1_48e0_95a6_8d3ad06be117), pid: 0 };

// UNSUPPORTED Rust 1301:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_BRANDING_ART: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb633b1ae_6caf_4a87_9589_22ded6dd5899), pid: 0 };

// UNSUPPORTED Rust 1302:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_CONTACT_PHOTO: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x2c4d6803_80ea_4580_af9a_5be1a23eddcb), pid: 0 };

// UNSUPPORTED Rust 1303:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_DEFAULT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe81e79be_34f0_41bf_b53f_f1a06ae87842), pid: 0 };

// UNSUPPORTED Rust 1304:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_GENERIC: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb9b9f515_ba70_4647_94dc_fa4925e95a07), pid: 0 };

// UNSUPPORTED Rust 1305:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_ICON: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xf195fed8_aa28_4ee3_b153_e182dd5edc39), pid: 0 };

// UNSUPPORTED Rust 1306:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_THUMBNAIL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xc7c407ba_98fa_46b5_9960_23fec124cfde), pid: 0 };

// UNSUPPORTED Rust 1307:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_RESOURCE_VIDEO_CLIP: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xb566ee42_6368_4290_8662_70182fb79f20), pid: 0 };

// UNSUPPORTED Rust 1308:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SECTION_DATA_LENGTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x516afd2b_c64e_44f0_98dc_bee1c88f7d66), pid: 3 };

// UNSUPPORTED Rust 1309:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SECTION_DATA_OFFSET: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x516afd2b_c64e_44f0_98dc_bee1c88f7d66), pid: 2 };

// UNSUPPORTED Rust 1310:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SECTION_DATA_REFERENCED_OBJECT_RESOURCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x516afd2b_c64e_44f0_98dc_bee1c88f7d66), pid: 5 };

// UNSUPPORTED Rust 1311:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SECTION_DATA_UNITS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x516afd2b_c64e_44f0_98dc_bee1c88f7d66), pid: 4 };

public const val `WPD_SECTION_DATA_UNITS_BYTES`: `WPD_SECTION_DATA_UNITS_VALUES` = 0;
public const val `WPD_SECTION_DATA_UNITS_MILLISECONDS`: `WPD_SECTION_DATA_UNITS_VALUES` = 1;
public typealias `WPD_SECTION_DATA_UNITS_VALUES` = Int;
// UNSUPPORTED Rust 1315:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_SECTION_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x516afd2b_c64e_44f0_98dc_bee1c88f7d66);

public const val `WPD_SERVICE_INHERITANCE_IMPLEMENTATION`: `WPD_SERVICE_INHERITANCE_TYPES` = 0;
public typealias `WPD_SERVICE_INHERITANCE_TYPES` = Int;
// UNSUPPORTED Rust 1318:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_SERVICE_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7510698a_cb54_481c_b8db_0d75c93f1c06);

// UNSUPPORTED Rust 1319:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SERVICE_VERSION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7510698a_cb54_481c_b8db_0d75c93f1c06), pid: 2 };

// UNSUPPORTED Rust 1320:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SMS_ENCODING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7e1074cc_50ff_4dd1_a742_53be6f093a0d), pid: 5 };

public typealias `WPD_SMS_ENCODING_TYPES` = Int;
// UNSUPPORTED Rust 1322:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SMS_MAX_PAYLOAD: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7e1074cc_50ff_4dd1_a742_53be6f093a0d), pid: 4 };

// UNSUPPORTED Rust 1323:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_SMS_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7e1074cc_50ff_4dd1_a742_53be6f093a0d);

// UNSUPPORTED Rust 1324:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SMS_PROVIDER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7e1074cc_50ff_4dd1_a742_53be6f093a0d), pid: 2 };

// UNSUPPORTED Rust 1325:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_SMS_TIMEOUT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x7e1074cc_50ff_4dd1_a742_53be6f093a0d), pid: 3 };

// UNSUPPORTED Rust 1326:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_ARTIST: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 29 };

// UNSUPPORTED Rust 1327:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_BURST_INTERVAL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 24 };

// UNSUPPORTED Rust 1328:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_BURST_NUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 23 };

// UNSUPPORTED Rust 1329:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAMERA_MANUFACTURER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 31 };

// UNSUPPORTED Rust 1330:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAMERA_MODEL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 30 };

// UNSUPPORTED Rust 1331:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAPTURE_DELAY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 17 };

// UNSUPPORTED Rust 1332:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAPTURE_FORMAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 3 };

// UNSUPPORTED Rust 1333:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAPTURE_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 18 };

// UNSUPPORTED Rust 1334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAPTURE_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260);

// UNSUPPORTED Rust 1335:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CAPTURE_RESOLUTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 2 };

// UNSUPPORTED Rust 1336:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_COMPRESSION_SETTING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 4 };

// UNSUPPORTED Rust 1337:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_CONTRAST: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 19 };

// UNSUPPORTED Rust 1338:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_DIGITAL_ZOOM: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 21 };

// UNSUPPORTED Rust 1339:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_EFFECT_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 22 };

// UNSUPPORTED Rust 1340:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_EXPOSURE_BIAS_COMPENSATION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 16 };

// UNSUPPORTED Rust 1341:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_EXPOSURE_INDEX: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 15 };

// UNSUPPORTED Rust 1342:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_EXPOSURE_METERING_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 11 };

// UNSUPPORTED Rust 1343:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_EXPOSURE_PROGRAM_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 14 };

// UNSUPPORTED Rust 1344:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_EXPOSURE_TIME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 13 };

// UNSUPPORTED Rust 1345:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_FLASH_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 12 };

// UNSUPPORTED Rust 1346:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_FNUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 7 };

// UNSUPPORTED Rust 1347:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_FOCAL_LENGTH: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 8 };

// UNSUPPORTED Rust 1348:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_FOCUS_DISTANCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 9 };

// UNSUPPORTED Rust 1349:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_FOCUS_METERING_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 27 };

// UNSUPPORTED Rust 1350:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_FOCUS_MODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 10 };

// UNSUPPORTED Rust 1351:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_RGB_GAIN: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 6 };

// UNSUPPORTED Rust 1352:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_SHARPNESS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 20 };

// UNSUPPORTED Rust 1353:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_TIMELAPSE_INTERVAL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 26 };

// UNSUPPORTED Rust 1354:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_TIMELAPSE_NUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 25 };

// UNSUPPORTED Rust 1355:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_UPLOAD_URL: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 28 };

// UNSUPPORTED Rust 1356:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STILL_IMAGE_WHITE_BALANCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x58c571ec_1bcb_42a7_8ac5_bb291573a260), pid: 5 };

// UNSUPPORTED Rust 1357:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_ACCESS_CAPABILITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 11 };

public const val `WPD_STORAGE_ACCESS_CAPABILITY_READWRITE`: `WPD_STORAGE_ACCESS_CAPABILITY_VALUES` = 0;
public const val `WPD_STORAGE_ACCESS_CAPABILITY_READ_ONLY_WITHOUT_OBJECT_DELETION`: `WPD_STORAGE_ACCESS_CAPABILITY_VALUES` = 1;
public const val `WPD_STORAGE_ACCESS_CAPABILITY_READ_ONLY_WITH_OBJECT_DELETION`: `WPD_STORAGE_ACCESS_CAPABILITY_VALUES` = 2;
public typealias `WPD_STORAGE_ACCESS_CAPABILITY_VALUES` = Int;
// UNSUPPORTED Rust 1362:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_CAPACITY: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 4 };

// UNSUPPORTED Rust 1363:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_CAPACITY_IN_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 10 };

// UNSUPPORTED Rust 1364:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_DESCRIPTION: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 7 };

// UNSUPPORTED Rust 1365:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_FILE_SYSTEM_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 3 };

// UNSUPPORTED Rust 1366:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_FREE_SPACE_IN_BYTES: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 5 };

// UNSUPPORTED Rust 1367:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_FREE_SPACE_IN_OBJECTS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 6 };

// UNSUPPORTED Rust 1368:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_MAX_OBJECT_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 9 };

// UNSUPPORTED Rust 1369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a);

// UNSUPPORTED Rust 1370:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_SERIAL_NUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 8 };

// UNSUPPORTED Rust 1371:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_STORAGE_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x01a3057a_74d6_4e80_bea7_dc4c212ce50a), pid: 2 };

public const val `WPD_STORAGE_TYPE_FIXED_RAM`: `WPD_STORAGE_TYPE_VALUES` = 3;
public const val `WPD_STORAGE_TYPE_FIXED_ROM`: `WPD_STORAGE_TYPE_VALUES` = 1;
public const val `WPD_STORAGE_TYPE_REMOVABLE_RAM`: `WPD_STORAGE_TYPE_VALUES` = 4;
public const val `WPD_STORAGE_TYPE_REMOVABLE_ROM`: `WPD_STORAGE_TYPE_VALUES` = 2;
public const val `WPD_STORAGE_TYPE_UNDEFINED`: `WPD_STORAGE_TYPE_VALUES` = 0;
public typealias `WPD_STORAGE_TYPE_VALUES` = Int;
public typealias `WPD_STREAM_UNITS` = Int;
public const val `WPD_STREAM_UNITS_BYTES`: `WPD_STREAM_UNITS` = 0;
public const val `WPD_STREAM_UNITS_FRAMES`: `WPD_STREAM_UNITS` = 1;
public const val `WPD_STREAM_UNITS_MICROSECONDS`: `WPD_STREAM_UNITS` = 8;
public const val `WPD_STREAM_UNITS_MILLISECONDS`: `WPD_STREAM_UNITS` = 4;
public const val `WPD_STREAM_UNITS_ROWS`: `WPD_STREAM_UNITS` = 2;
// UNSUPPORTED Rust 1384:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_TASK_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe354e95e_d8a0_4637_a03a_0cb26838dbc7);

// UNSUPPORTED Rust 1385:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_TASK_OWNER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe354e95e_d8a0_4637_a03a_0cb26838dbc7), pid: 11 };

// UNSUPPORTED Rust 1386:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_TASK_PERCENT_COMPLETE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe354e95e_d8a0_4637_a03a_0cb26838dbc7), pid: 8 };

// UNSUPPORTED Rust 1387:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_TASK_REMINDER_DATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe354e95e_d8a0_4637_a03a_0cb26838dbc7), pid: 10 };

// UNSUPPORTED Rust 1388:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_TASK_STATUS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0xe354e95e_d8a0_4637_a03a_0cb26838dbc7), pid: 6 };

// UNSUPPORTED Rust 1389:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_AUTHOR: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 2 };

// UNSUPPORTED Rust 1390:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_BITRATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 13 };

// UNSUPPORTED Rust 1391:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_BUFFER_SIZE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 8 };

// UNSUPPORTED Rust 1392:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_CREDITS: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 9 };

// UNSUPPORTED Rust 1393:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_FOURCC_CODE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 14 };

// UNSUPPORTED Rust 1394:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_FRAMERATE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 15 };

// UNSUPPORTED Rust 1395:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_KEY_FRAME_DISTANCE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 10 };

// UNSUPPORTED Rust 1396:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_OBJECT_PROPERTIES_V1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a);

// UNSUPPORTED Rust 1397:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_QUALITY_SETTING: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 11 };

// UNSUPPORTED Rust 1398:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_RECORDEDTV_CHANNEL_NUMBER: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 5 };

// UNSUPPORTED Rust 1399:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_RECORDEDTV_REPEAT: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 7 };

// UNSUPPORTED Rust 1400:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_RECORDEDTV_STATION_NAME: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 4 };

// UNSUPPORTED Rust 1401:1: qualified type requires source-backed binding: super::super::Foundation::PROPERTYKEY; syntax: constant expression has no syntax candidate rule
// pub const WPD_VIDEO_SCAN_TYPE: super::super::Foundation::PROPERTYKEY = super::super::Foundation::PROPERTYKEY { fmtid: windows_sys::core::GUID::from_u128(0x346f2163_f998_4146_8b01_d19b4c00de9a), pid: 12 };

public typealias `WPD_VIDEO_SCAN_TYPES` = Int;
public const val `WPD_VIDEO_SCAN_TYPE_FIELD_INTERLEAVED_LOWER_FIRST`: `WPD_VIDEO_SCAN_TYPES` = 3;
public const val `WPD_VIDEO_SCAN_TYPE_FIELD_INTERLEAVED_UPPER_FIRST`: `WPD_VIDEO_SCAN_TYPES` = 2;
public const val `WPD_VIDEO_SCAN_TYPE_FIELD_SINGLE_LOWER_FIRST`: `WPD_VIDEO_SCAN_TYPES` = 5;
public const val `WPD_VIDEO_SCAN_TYPE_FIELD_SINGLE_UPPER_FIRST`: `WPD_VIDEO_SCAN_TYPES` = 4;
public const val `WPD_VIDEO_SCAN_TYPE_MIXED_INTERLACE`: `WPD_VIDEO_SCAN_TYPES` = 6;
public const val `WPD_VIDEO_SCAN_TYPE_MIXED_INTERLACE_AND_PROGRESSIVE`: `WPD_VIDEO_SCAN_TYPES` = 7;
public const val `WPD_VIDEO_SCAN_TYPE_PROGRESSIVE`: `WPD_VIDEO_SCAN_TYPES` = 1;
public const val `WPD_VIDEO_SCAN_TYPE_UNUSED`: `WPD_VIDEO_SCAN_TYPES` = 0;
public const val `WPD_WHITE_BALANCE_AUTOMATIC`: `WPD_WHITE_BALANCE_SETTINGS` = 2;
public const val `WPD_WHITE_BALANCE_DAYLIGHT`: `WPD_WHITE_BALANCE_SETTINGS` = 4;
public const val `WPD_WHITE_BALANCE_FLASH`: `WPD_WHITE_BALANCE_SETTINGS` = 7;
public const val `WPD_WHITE_BALANCE_FLORESCENT`: `WPD_WHITE_BALANCE_SETTINGS` = 5;
public const val `WPD_WHITE_BALANCE_MANUAL`: `WPD_WHITE_BALANCE_SETTINGS` = 1;
public const val `WPD_WHITE_BALANCE_ONE_PUSH_AUTOMATIC`: `WPD_WHITE_BALANCE_SETTINGS` = 3;
public typealias `WPD_WHITE_BALANCE_SETTINGS` = Int;
public const val `WPD_WHITE_BALANCE_TUNGSTEN`: `WPD_WHITE_BALANCE_SETTINGS` = 6;
public const val `WPD_WHITE_BALANCE_UNDEFINED`: `WPD_WHITE_BALANCE_SETTINGS` = 0;
public typealias `WpdAttributeForm` = Int;
public typealias `WpdParameterAttributeForm` = Int;
// UNSUPPORTED Rust 1422:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const WpdSerializer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b91a74b_ad7c_4a9d_b563_29eef9167172);

