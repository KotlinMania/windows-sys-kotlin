package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY
import io.github.kotlinmania.windowssys.windows.win32.foundation.PROPERTYKEY

public val CLSID_WPD_NAMESPACE_EXTENSION: GUID = GUID.from_u128(0x35786d3cb07549b9uL, 0x88dd029876e11c01uL)

public val DEVPKEY_MTPBTH_IsConnected: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0xea1237fa589d4472uL, 0x84e40abe36fd62efuL), pid = 2u)

public val DEVSVCTYPE_ABSTRACT: UInt = 1u

public val DEVSVCTYPE_DEFAULT: UInt = 0u

public val DEVSVC_SERVICEINFO_VERSION: UInt = 100u

public val DRS_HW_RADIO_OFF: DEVICE_RADIO_STATE = 2

public val DRS_HW_RADIO_OFF_UNCONTROLLABLE: DEVICE_RADIO_STATE = 6

public val DRS_HW_RADIO_ON_UNCONTROLLABLE: DEVICE_RADIO_STATE = 4

public val DRS_RADIO_INVALID: DEVICE_RADIO_STATE = 5

public val DRS_RADIO_MAX: DEVICE_RADIO_STATE = 6

public val DRS_RADIO_ON: DEVICE_RADIO_STATE = 0

public val DRS_SW_HW_RADIO_OFF: DEVICE_RADIO_STATE = 3

public val DRS_SW_RADIO_OFF: DEVICE_RADIO_STATE = 1

public val ENUM_AnchorResults_AnchorStateInvalid: UInt = 1u

public val ENUM_AnchorResults_AnchorStateNormal: UInt = 0u

public val ENUM_AnchorResults_AnchorStateOld: UInt = 2u

public val ENUM_AnchorResults_ItemStateChanged: UInt = 4u

public val ENUM_AnchorResults_ItemStateCreated: UInt = 2u

public val ENUM_AnchorResults_ItemStateDeleted: UInt = 1u

public val ENUM_AnchorResults_ItemStateInvalid: UInt = 0u

public val ENUM_AnchorResults_ItemStateUpdated: UInt = 3u

public val ENUM_CalendarObj_BusyStatusBusy: UInt = 1u

public val ENUM_CalendarObj_BusyStatusFree: UInt = 0u

public val ENUM_CalendarObj_BusyStatusOutOfOffice: UInt = 2u

public val ENUM_CalendarObj_BusyStatusTentative: UInt = 3u

public val ENUM_DeviceMetadataObj_DefaultCABFalse: UInt = 0u

public val ENUM_DeviceMetadataObj_DefaultCABTrue: UInt = 1u

public val ENUM_MessageObj_PatternInstanceFirst: UInt = 1u

public val ENUM_MessageObj_PatternInstanceFourth: UInt = 4u

public val ENUM_MessageObj_PatternInstanceLast: UInt = 5u

public val ENUM_MessageObj_PatternInstanceNone: UInt = 0u

public val ENUM_MessageObj_PatternInstanceSecond: UInt = 2u

public val ENUM_MessageObj_PatternInstanceThird: UInt = 3u

public val ENUM_MessageObj_PatternTypeDaily: UInt = 1u

public val ENUM_MessageObj_PatternTypeMonthly: UInt = 3u

public val ENUM_MessageObj_PatternTypeWeekly: UInt = 2u

public val ENUM_MessageObj_PatternTypeYearly: UInt = 4u

public val ENUM_MessageObj_PriorityHighest: UInt = 2u

public val ENUM_MessageObj_PriorityLowest: UInt = 0u

public val ENUM_MessageObj_PriorityNormal: UInt = 1u

public val ENUM_MessageObj_ReadFalse: UInt = 0u

public val ENUM_MessageObj_ReadTrue: UInt = 255u

public val ENUM_StatusSvc_ChargingActive: UInt = 1u

public val ENUM_StatusSvc_ChargingInactive: UInt = 0u

public val ENUM_StatusSvc_ChargingUnknown: UInt = 2u

public val ENUM_StatusSvc_RoamingActive: UInt = 1u

public val ENUM_StatusSvc_RoamingInactive: UInt = 0u

public val ENUM_StatusSvc_RoamingUnknown: UInt = 2u

public val ENUM_SyncSvc_SyncObjectReferencesDisabled: UInt = 0u

public val ENUM_SyncSvc_SyncObjectReferencesEnabled: UInt = 255u

public val ENUM_TaskObj_CompleteFalse: UInt = 0u

public val ENUM_TaskObj_CompleteTrue: UInt = 255u

public val E_WPD_DEVICE_ALREADY_OPENED: HRESULT = 0x802A0001u.toInt()

public val E_WPD_DEVICE_IS_HUNG: HRESULT = 0x802A0006u.toInt()

public val E_WPD_DEVICE_NOT_OPEN: HRESULT = 0x802A0002u.toInt()

public val E_WPD_OBJECT_ALREADY_ATTACHED_TO_DEVICE: HRESULT = 0x802A0003u.toInt()

public val E_WPD_OBJECT_ALREADY_ATTACHED_TO_SERVICE: HRESULT = 0x802A00CAu.toInt()

public val E_WPD_OBJECT_NOT_ATTACHED_TO_DEVICE: HRESULT = 0x802A0004u.toInt()

public val E_WPD_OBJECT_NOT_ATTACHED_TO_SERVICE: HRESULT = 0x802A00CBu.toInt()

public val E_WPD_OBJECT_NOT_COMMITED: HRESULT = 0x802A0005u.toInt()

public val E_WPD_SERVICE_ALREADY_OPENED: HRESULT = 0x802A00C8u.toInt()

public val E_WPD_SERVICE_BAD_PARAMETER_ORDER: HRESULT = 0x802A00CCu.toInt()

public val E_WPD_SERVICE_NOT_OPEN: HRESULT = 0x802A00C9u.toInt()

public val E_WPD_SMS_INVALID_MESSAGE_BODY: HRESULT = 0x802A0065u.toInt()

public val E_WPD_SMS_INVALID_RECIPIENT: HRESULT = 0x802A0064u.toInt()

public val E_WPD_SMS_SERVICE_UNAVAILABLE: HRESULT = 0x802A0066u.toInt()

public val EnumBthMtpConnectors: GUID = GUID.from_u128(0xa1570149e6454f43uL, 0x8b0d409b061db2fcuL)

public val FACILITY_WPD: UInt = 42u

public val FLAG_MessageObj_DayOfWeekFriday: UInt = 32u

public val FLAG_MessageObj_DayOfWeekMonday: UInt = 2u

public val FLAG_MessageObj_DayOfWeekNone: UInt = 0u

public val FLAG_MessageObj_DayOfWeekSaturday: UInt = 64u

public val FLAG_MessageObj_DayOfWeekSunday: UInt = 1u

public val FLAG_MessageObj_DayOfWeekThursday: UInt = 16u

public val FLAG_MessageObj_DayOfWeekTuesday: UInt = 4u

public val FLAG_MessageObj_DayOfWeekWednesday: UInt = 8u

public val GUID_DEVINTERFACE_WPD: GUID = GUID.from_u128(0x6ac27878a6fa4155uL, 0xba85f98f491d4f33uL)

public val GUID_DEVINTERFACE_WPD_PRIVATE: GUID = GUID.from_u128(0xba0c718f4ded49b7uL, 0xbdd3fabe28661211uL)

public val GUID_DEVINTERFACE_WPD_SERVICE: GUID = GUID.from_u128(0x9ef44f803d644246uL, 0xa6aa206f328d1edcuL)

public val IOCTL_WPD_MESSAGE_READWRITE_ACCESS: UInt = 4243720u

public val IOCTL_WPD_MESSAGE_READ_ACCESS: UInt = 4210952u

public val NAME_3GPP2File: PCWSTR = w("3GPP2File")

public val NAME_3GPPFile: PCWSTR = w("3GPPFile")

public val NAME_AACFile: PCWSTR = w("AACFile")

public val NAME_AIFFFile: PCWSTR = w("AIFFFile")

public val NAME_AMRFile: PCWSTR = w("AMRFile")

public val NAME_ASFFile: PCWSTR = w("ASFFile")

public val NAME_ASXPlaylist: PCWSTR = w("ASXPlaylist")

public val NAME_ATSCTSFile: PCWSTR = w("ATSCTSFile")

public val NAME_AVCHDFile: PCWSTR = w("AVCHDFile")

public val NAME_AVIFile: PCWSTR = w("AVIFile")

public val NAME_AbstractActivity: PCWSTR = w("AbstractActivity")

public val NAME_AbstractActivityOccurrence: PCWSTR = w("AbstractActivityOccurrence")

public val NAME_AbstractAudioAlbum: PCWSTR = w("AbstractAudioAlbum")

public val NAME_AbstractAudioPlaylist: PCWSTR = w("AbstractAudioPlaylist")

public val NAME_AbstractAudioVideoAlbum: PCWSTR = w("AbstractAudioVideoAlbum")

public val NAME_AbstractChapteredProduction: PCWSTR = w("AbstractChapteredProduction")

public val NAME_AbstractContact: PCWSTR = w("AbstractContact")

public val NAME_AbstractContactGroup: PCWSTR = w("AbstractContactGroup")

public val NAME_AbstractDocument: PCWSTR = w("AbstractDocument")

public val NAME_AbstractImageAlbum: PCWSTR = w("AbstractImageAlbum")

public val NAME_AbstractMediacast: PCWSTR = w("AbstractMediacast")

public val NAME_AbstractMessage: PCWSTR = w("AbstractMessage")

public val NAME_AbstractMessageFolder: PCWSTR = w("AbstractMessageFolder")

public val NAME_AbstractMultimediaAlbum: PCWSTR = w("AbstractMultimediaAlbum")

public val NAME_AbstractNote: PCWSTR = w("AbstractNote")

public val NAME_AbstractTask: PCWSTR = w("AbstractTask")

public val NAME_AbstractVideoAlbum: PCWSTR = w("AbstractVideoAlbum")

public val NAME_AbstractVideoPlaylist: PCWSTR = w("AbstractVideoPlaylist")

public val NAME_AnchorResults: PCWSTR = w("AnchorResults")

public val NAME_AnchorResults_Anchor: PCWSTR = w("Anchor")

public val NAME_AnchorResults_AnchorState: PCWSTR = w("AnchorState")

public val NAME_AnchorResults_ResultObjectID: PCWSTR = w("ResultObjectID")

public val NAME_AnchorSyncKnowledge: PCWSTR = w("AnchorSyncKnowledge")

public val NAME_AnchorSyncSvc: PCWSTR = w("AnchorSync")

public val NAME_AnchorSyncSvc_BeginSync: PCWSTR = w("BeginSync")

public val NAME_AnchorSyncSvc_CurrentAnchor: PCWSTR = w("AnchorCurrentAnchor")

public val NAME_AnchorSyncSvc_EndSync: PCWSTR = w("EndSync")

public val NAME_AnchorSyncSvc_FilterType: PCWSTR = w("FilterType")

public val NAME_AnchorSyncSvc_GetChangesSinceAnchor: PCWSTR = w("GetChangesSinceAnchor")

public val NAME_AnchorSyncSvc_KnowledgeObjectID: PCWSTR = w("AnchorKnowledgeObjectID")

public val NAME_AnchorSyncSvc_LastSyncProxyID: PCWSTR = w("AnchorLastSyncProxyID")

public val NAME_AnchorSyncSvc_LocalOnlyDelete: PCWSTR = w("LocalOnlyDelete")

public val NAME_AnchorSyncSvc_ProviderVersion: PCWSTR = w("AnchorProviderVersion")

public val NAME_AnchorSyncSvc_ReplicaID: PCWSTR = w("AnchorReplicaID")

public val NAME_AnchorSyncSvc_SyncFormat: PCWSTR = w("SyncFormat")

public val NAME_AnchorSyncSvc_VersionProps: PCWSTR = w("AnchorVersionProps")

public val NAME_Association: PCWSTR = w("Association")

public val NAME_AudibleFile: PCWSTR = w("AudibleFile")

public val NAME_AudioObj_AudioBitDepth: PCWSTR = w("AudioBitDepth")

public val NAME_AudioObj_AudioBitRate: PCWSTR = w("AudioBitRate")

public val NAME_AudioObj_AudioBlockAlignment: PCWSTR = w("AudioBlockAlignment")

public val NAME_AudioObj_AudioFormatCode: PCWSTR = w("AudioFormatCode")

public val NAME_AudioObj_Channels: PCWSTR = w("Channels")

public val NAME_AudioObj_Lyrics: PCWSTR = w("Lyrics")

public val NAME_BMPImage: PCWSTR = w("BMPImage")

public val NAME_CIFFImage: PCWSTR = w("CIFFImage")

public val NAME_CalendarObj_Accepted: PCWSTR = w("Accepted")

public val NAME_CalendarObj_BeginDateTime: PCWSTR = w("BeginDateTime")

public val NAME_CalendarObj_BusyStatus: PCWSTR = w("BusyStatus")

public val NAME_CalendarObj_Declined: PCWSTR = w("Declined")

public val NAME_CalendarObj_EndDateTime: PCWSTR = w("EndDateTime")

public val NAME_CalendarObj_Location: PCWSTR = w("Location")

public val NAME_CalendarObj_PatternDuration: PCWSTR = w("PatternDuration")

public val NAME_CalendarObj_PatternStartTime: PCWSTR = w("PatternStartTime")

public val NAME_CalendarObj_ReminderOffset: PCWSTR = w("ReminderOffset")

public val NAME_CalendarObj_Tentative: PCWSTR = w("Tentative")

public val NAME_CalendarObj_TimeZone: PCWSTR = w("TimeZone")

public val NAME_CalendarSvc: PCWSTR = w("Calendar")

public val NAME_CalendarSvc_SyncWindowEnd: PCWSTR = w("SyncWindowEnd")

public val NAME_CalendarSvc_SyncWindowStart: PCWSTR = w("SyncWindowStart")

public val NAME_ContactObj_AnniversaryDate: PCWSTR = w("AnniversaryDate")

public val NAME_ContactObj_Assistant: PCWSTR = w("Assistant")

public val NAME_ContactObj_Birthdate: PCWSTR = w("Birthdate")

public val NAME_ContactObj_BusinessAddressCity: PCWSTR = w("BusinessAddressCity")

public val NAME_ContactObj_BusinessAddressCountry: PCWSTR = w("BusinessAddressCountry")

public val NAME_ContactObj_BusinessAddressFull: PCWSTR = w("BusinessAddressFull")

public val NAME_ContactObj_BusinessAddressLine2: PCWSTR = w("BusinessAddressLine2")

public val NAME_ContactObj_BusinessAddressPostalCode: PCWSTR = w("BusinessAddressPostalCode")

public val NAME_ContactObj_BusinessAddressRegion: PCWSTR = w("BusinessAddressRegion")

public val NAME_ContactObj_BusinessAddressStreet: PCWSTR = w("BusinessAddressStreet")

public val NAME_ContactObj_BusinessEmail: PCWSTR = w("BusinessEmail")

public val NAME_ContactObj_BusinessEmail2: PCWSTR = w("BusinessEmail2")

public val NAME_ContactObj_BusinessFax: PCWSTR = w("BusinessFax")

public val NAME_ContactObj_BusinessPhone: PCWSTR = w("BusinessPhone")

public val NAME_ContactObj_BusinessPhone2: PCWSTR = w("BusinessPhone2")

public val NAME_ContactObj_BusinessWebAddress: PCWSTR = w("BusinessWebAddress")

public val NAME_ContactObj_Children: PCWSTR = w("Children")

public val NAME_ContactObj_Email: PCWSTR = w("Email")

public val NAME_ContactObj_FamilyName: PCWSTR = w("FamilyName")

public val NAME_ContactObj_Fax: PCWSTR = w("Fax")

public val NAME_ContactObj_GivenName: PCWSTR = w("GivenName")

public val NAME_ContactObj_IMAddress: PCWSTR = w("IMAddress")

public val NAME_ContactObj_IMAddress2: PCWSTR = w("IMAddress2")

public val NAME_ContactObj_IMAddress3: PCWSTR = w("IMAddress3")

public val NAME_ContactObj_MiddleNames: PCWSTR = w("MiddleNames")

public val NAME_ContactObj_MobilePhone: PCWSTR = w("MobilePhone")

public val NAME_ContactObj_MobilePhone2: PCWSTR = w("MobilePhone2")

public val NAME_ContactObj_Organization: PCWSTR = w("Organization")

public val NAME_ContactObj_OtherAddressCity: PCWSTR = w("OtherAddressCity")

public val NAME_ContactObj_OtherAddressCountry: PCWSTR = w("OtherAddressCountry")

public val NAME_ContactObj_OtherAddressFull: PCWSTR = w("OtherAddressFull")

public val NAME_ContactObj_OtherAddressLine2: PCWSTR = w("OtherAddressLine2")

public val NAME_ContactObj_OtherAddressPostalCode: PCWSTR = w("OtherAddressPostalCode")

public val NAME_ContactObj_OtherAddressRegion: PCWSTR = w("OtherAddressRegion")

public val NAME_ContactObj_OtherAddressStreet: PCWSTR = w("OtherAddressStreet")

public val NAME_ContactObj_OtherEmail: PCWSTR = w("OtherEmail")

public val NAME_ContactObj_OtherPhone: PCWSTR = w("OtherPhone")

public val NAME_ContactObj_Pager: PCWSTR = w("Pager")

public val NAME_ContactObj_PersonalAddressCity: PCWSTR = w("PersonalAddressCity")

public val NAME_ContactObj_PersonalAddressCountry: PCWSTR = w("PersonalAddressCountry")

public val NAME_ContactObj_PersonalAddressFull: PCWSTR = w("PersonalAddressFull")

public val NAME_ContactObj_PersonalAddressLine2: PCWSTR = w("PersonalAddressLine2")

public val NAME_ContactObj_PersonalAddressPostalCode: PCWSTR = w("PersonalAddressPostalCode")

public val NAME_ContactObj_PersonalAddressRegion: PCWSTR = w("PersonalAddressRegion")

public val NAME_ContactObj_PersonalAddressStreet: PCWSTR = w("PersonalAddressStreet")

public val NAME_ContactObj_PersonalEmail: PCWSTR = w("PersonalEmail")

public val NAME_ContactObj_PersonalEmail2: PCWSTR = w("PersonalEmail2")

public val NAME_ContactObj_PersonalFax: PCWSTR = w("PersonalFax")

public val NAME_ContactObj_PersonalPhone: PCWSTR = w("PersonalPhone")

public val NAME_ContactObj_PersonalPhone2: PCWSTR = w("PersonalPhone2")

public val NAME_ContactObj_PersonalWebAddress: PCWSTR = w("PersonalWebAddress")

public val NAME_ContactObj_Phone: PCWSTR = w("Phone")

public val NAME_ContactObj_PhoneticFamilyName: PCWSTR = w("PhoneticFamilyName")

public val NAME_ContactObj_PhoneticGivenName: PCWSTR = w("PhoneticGivenName")

public val NAME_ContactObj_PhoneticOrganization: PCWSTR = w("PhoneticOrganization")

public val NAME_ContactObj_Ringtone: PCWSTR = w("Ringtone")

public val NAME_ContactObj_Role: PCWSTR = w("Role")

public val NAME_ContactObj_Spouse: PCWSTR = w("Spouse")

public val NAME_ContactObj_Suffix: PCWSTR = w("Suffix")

public val NAME_ContactObj_Title: PCWSTR = w("Title")

public val NAME_ContactObj_WebAddress: PCWSTR = w("WebAddress")

public val NAME_ContactSvc_SyncWithPhoneOnly: PCWSTR = w("FilterType")

public val NAME_ContactsSvc: PCWSTR = w("Contacts")

public val NAME_DPOFDocument: PCWSTR = w("DPOFDocument")

public val NAME_DVBTSFile: PCWSTR = w("DVBTSFile")

public val NAME_DeviceExecutable: PCWSTR = w("DeviceExecutable")

public val NAME_DeviceMetadataCAB: PCWSTR = w("DeviceMetadataCAB")

public val NAME_DeviceMetadataObj_ContentID: PCWSTR = w("ContentID")

public val NAME_DeviceMetadataObj_DefaultCAB: PCWSTR = w("DefaultCAB")

public val NAME_DeviceMetadataSvc: PCWSTR = w("Metadata")

public val NAME_DeviceScript: PCWSTR = w("DeviceScript")

public val NAME_EXIFImage: PCWSTR = w("EXIFImage")

public val NAME_ExcelDocument: PCWSTR = w("ExcelDocument")

public val NAME_FLACFile: PCWSTR = w("FLACFile")

public val NAME_FirmwareFile: PCWSTR = w("FirmwareFile")

public val NAME_FlashPixImage: PCWSTR = w("FlashPixImage")

public val NAME_FullEnumSyncKnowledge: PCWSTR = w("FullEnumSyncKnowledge")

public val NAME_FullEnumSyncSvc: PCWSTR = w("FullEnumSync")

public val NAME_FullEnumSyncSvc_BeginSync: PCWSTR = w("BeginSync")

public val NAME_FullEnumSyncSvc_EndSync: PCWSTR = w("EndSync")

public val NAME_FullEnumSyncSvc_FilterType: PCWSTR = w("FilterType")

public val NAME_FullEnumSyncSvc_KnowledgeObjectID: PCWSTR = w("FullEnumKnowledgeObjectID")

public val NAME_FullEnumSyncSvc_LastSyncProxyID: PCWSTR = w("FullEnumLastSyncProxyID")

public val NAME_FullEnumSyncSvc_LocalOnlyDelete: PCWSTR = w("LocalOnlyDelete")

public val NAME_FullEnumSyncSvc_ProviderVersion: PCWSTR = w("FullEnumProviderVersion")

public val NAME_FullEnumSyncSvc_ReplicaID: PCWSTR = w("FullEnumReplicaID")

public val NAME_FullEnumSyncSvc_SyncFormat: PCWSTR = w("SyncFormat")

public val NAME_FullEnumSyncSvc_VersionProps: PCWSTR = w("FullEnumVersionProps")

public val NAME_GIFImage: PCWSTR = w("GIFImage")

public val NAME_GenericObj_AllowedFolderContents: PCWSTR = w("AllowedFolderContents")

public val NAME_GenericObj_AssociationDesc: PCWSTR = w("AssociationDesc")

public val NAME_GenericObj_AssociationType: PCWSTR = w("AssociationType")

public val NAME_GenericObj_Copyright: PCWSTR = w("Copyright")

public val NAME_GenericObj_Corrupt: PCWSTR = w("Corrupt")

public val NAME_GenericObj_DRMStatus: PCWSTR = w("DRMStatus")

public val NAME_GenericObj_DateAccessed: PCWSTR = w("DateAccessed")

public val NAME_GenericObj_DateAdded: PCWSTR = w("DateAdded")

public val NAME_GenericObj_DateAuthored: PCWSTR = w("DateAuthored")

public val NAME_GenericObj_DateCreated: PCWSTR = w("DateCreated")

public val NAME_GenericObj_DateModified: PCWSTR = w("DateModified")

public val NAME_GenericObj_DateRevised: PCWSTR = w("DateRevised")

public val NAME_GenericObj_Description: PCWSTR = w("Description")

public val NAME_GenericObj_Hidden: PCWSTR = w("Hidden")

public val NAME_GenericObj_Keywords: PCWSTR = w("Keywords")

public val NAME_GenericObj_LanguageLocale: PCWSTR = w("LanguageLocale")

public val NAME_GenericObj_Name: PCWSTR = w("Name")

public val NAME_GenericObj_NonConsumable: PCWSTR = w("NonConsumable")

public val NAME_GenericObj_ObjectFileName: PCWSTR = w("ObjectFileName")

public val NAME_GenericObj_ObjectFormat: PCWSTR = w("ObjectFormat")

public val NAME_GenericObj_ObjectID: PCWSTR = w("ObjectID")

public val NAME_GenericObj_ObjectSize: PCWSTR = w("ObjectSize")

public val NAME_GenericObj_ParentID: PCWSTR = w("ParentID")

public val NAME_GenericObj_PersistentUID: PCWSTR = w("PersistentUID")

public val NAME_GenericObj_PropertyBag: PCWSTR = w("PropertyBag")

public val NAME_GenericObj_ProtectionStatus: PCWSTR = w("ProtectionStatus")

public val NAME_GenericObj_ReferenceParentID: PCWSTR = w("ReferenceParentID")

public val NAME_GenericObj_StorageID: PCWSTR = w("StorageID")

public val NAME_GenericObj_SubDescription: PCWSTR = w("SubDescription")

public val NAME_GenericObj_SyncID: PCWSTR = w("SyncID")

public val NAME_GenericObj_SystemObject: PCWSTR = w("SystemObject")

public val NAME_GenericObj_TimeToLive: PCWSTR = w("TimeToLive")

public val NAME_HDPhotoImage: PCWSTR = w("HDPhotoImage")

public val NAME_HTMLDocument: PCWSTR = w("HTMLDocument")

public val NAME_HintsSvc: PCWSTR = w("Hints")

public val NAME_ICalendarActivity: PCWSTR = w("ICalendar")

public val NAME_ImageObj_Aperature: PCWSTR = w("Aperature")

public val NAME_ImageObj_Exposure: PCWSTR = w("Exposure")

public val NAME_ImageObj_ISOSpeed: PCWSTR = w("ISOSpeed")

public val NAME_ImageObj_ImageBitDepth: PCWSTR = w("ImageBitDepth")

public val NAME_ImageObj_IsColorCorrected: PCWSTR = w("IsColorCorrected")

public val NAME_ImageObj_IsCropped: PCWSTR = w("IsCropped")

public val NAME_JFIFImage: PCWSTR = w("JFIFImage")

public val NAME_JP2Image: PCWSTR = w("JP2Image")

public val NAME_JPEGXRImage: PCWSTR = w("JPEGXRImage")

public val NAME_JPXImage: PCWSTR = w("JPXImage")

public val NAME_M3UPlaylist: PCWSTR = w("M3UPlaylist")

public val NAME_MHTDocument: PCWSTR = w("MHTDocument")

public val NAME_MP3File: PCWSTR = w("MP3File")

public val NAME_MPEG2File: PCWSTR = w("MPEG2File")

public val NAME_MPEG4File: PCWSTR = w("MPEG4File")

public val NAME_MPEGFile: PCWSTR = w("MPEGFile")

public val NAME_MPLPlaylist: PCWSTR = w("MPLPlaylist")

public val NAME_MediaObj_AlbumArtist: PCWSTR = w("AlbumArtist")

public val NAME_MediaObj_AlbumName: PCWSTR = w("AlbumName")

public val NAME_MediaObj_Artist: PCWSTR = w("Artist")

public val NAME_MediaObj_AudioEncodingProfile: PCWSTR = w("AudioEncodingProfile")

public val NAME_MediaObj_BitRateType: PCWSTR = w("BitRateType")

public val NAME_MediaObj_BookmarkByte: PCWSTR = w("BookmarkByte")

public val NAME_MediaObj_BookmarkObject: PCWSTR = w("BookmarkObject")

public val NAME_MediaObj_BookmarkTime: PCWSTR = w("BookmarkTime")

public val NAME_MediaObj_BufferSize: PCWSTR = w("BufferSize")

public val NAME_MediaObj_Composer: PCWSTR = w("Composer")

public val NAME_MediaObj_Credits: PCWSTR = w("Credits")

public val NAME_MediaObj_DateOriginalRelease: PCWSTR = w("DateOriginalRelease")

public val NAME_MediaObj_Duration: PCWSTR = w("Duration")

public val NAME_MediaObj_Editor: PCWSTR = w("Editor")

public val NAME_MediaObj_EffectiveRating: PCWSTR = w("EffectiveRating")

public val NAME_MediaObj_EncodingProfile: PCWSTR = w("EncodingProfile")

public val NAME_MediaObj_EncodingQuality: PCWSTR = w("EncodingQuality")

public val NAME_MediaObj_Genre: PCWSTR = w("Genre")

public val NAME_MediaObj_GeographicOrigin: PCWSTR = w("GeographicOrigin")

public val NAME_MediaObj_Height: PCWSTR = w("Height")

public val NAME_MediaObj_MediaType: PCWSTR = w("MediaType")

public val NAME_MediaObj_MediaUID: PCWSTR = w("MediaUID")

public val NAME_MediaObj_Mood: PCWSTR = w("Mood")

public val NAME_MediaObj_Owner: PCWSTR = w("Owner")

public val NAME_MediaObj_ParentalRating: PCWSTR = w("ParentalRating")

public val NAME_MediaObj_Producer: PCWSTR = w("Producer")

public val NAME_MediaObj_SampleRate: PCWSTR = w("SampleRate")

public val NAME_MediaObj_SkipCount: PCWSTR = w("SkipCount")

public val NAME_MediaObj_SubscriptionContentID: PCWSTR = w("SubscriptionContentID")

public val NAME_MediaObj_Subtitle: PCWSTR = w("Subtitle")

public val NAME_MediaObj_TotalBitRate: PCWSTR = w("TotalBitRate")

public val NAME_MediaObj_Track: PCWSTR = w("Track")

public val NAME_MediaObj_URLLink: PCWSTR = w("URLLink")

public val NAME_MediaObj_URLSource: PCWSTR = w("URLSource")

public val NAME_MediaObj_UseCount: PCWSTR = w("UseCount")

public val NAME_MediaObj_UserRating: PCWSTR = w("UserRating")

public val NAME_MediaObj_WebMaster: PCWSTR = w("WebMaster")

public val NAME_MediaObj_Width: PCWSTR = w("Width")

public val NAME_MessageObj_BCC: PCWSTR = w("BCC")

public val NAME_MessageObj_Body: PCWSTR = w("Body")

public val NAME_MessageObj_CC: PCWSTR = w("CC")

public val NAME_MessageObj_Category: PCWSTR = w("Category")

public val NAME_MessageObj_PatternDayOfMonth: PCWSTR = w("PatternDayOfMonth")

public val NAME_MessageObj_PatternDayOfWeek: PCWSTR = w("PatternDayOfWeek")

public val NAME_MessageObj_PatternDeleteDates: PCWSTR = w("PatternDeleteDates")

public val NAME_MessageObj_PatternInstance: PCWSTR = w("PatternInstance")

public val NAME_MessageObj_PatternMonthOfYear: PCWSTR = w("PatternMonthOfYear")

public val NAME_MessageObj_PatternOriginalDateTime: PCWSTR = w("PatternOriginalDateTime")

public val NAME_MessageObj_PatternPeriod: PCWSTR = w("PatternPeriod")

public val NAME_MessageObj_PatternType: PCWSTR = w("PatternType")

public val NAME_MessageObj_PatternValidEndDate: PCWSTR = w("PatternValidEndDate")

public val NAME_MessageObj_PatternValidStartDate: PCWSTR = w("PatternValidStartDate")

public val NAME_MessageObj_Priority: PCWSTR = w("Priority")

public val NAME_MessageObj_Read: PCWSTR = w("Read")

public val NAME_MessageObj_ReceivedTime: PCWSTR = w("ReceivedTime")

public val NAME_MessageObj_Sender: PCWSTR = w("Sender")

public val NAME_MessageObj_Subject: PCWSTR = w("Subject")

public val NAME_MessageObj_To: PCWSTR = w("To")

public val NAME_MessageSvc: PCWSTR = w("Message")

public val NAME_NotesSvc: PCWSTR = w("Notes")

public val NAME_OGGFile: PCWSTR = w("OGGFile")

public val NAME_PCDImage: PCWSTR = w("PCDImage")

public val NAME_PICTImage: PCWSTR = w("PICTImage")

public val NAME_PNGImage: PCWSTR = w("PNGImage")

public val NAME_PSLPlaylist: PCWSTR = w("PSLPlaylist")

public val NAME_PowerPointDocument: PCWSTR = w("PowerPointDocument")

public val NAME_QCELPFile: PCWSTR = w("QCELPFile")

public val NAME_RingtonesSvc: PCWSTR = w("Ringtones")

public val NAME_RingtonesSvc_DefaultRingtone: PCWSTR = w("DefaultRingtone")

public val NAME_Services_ServiceDisplayName: PCWSTR = w("ServiceDisplayName")

public val NAME_Services_ServiceIcon: PCWSTR = w("ServiceIcon")

public val NAME_Services_ServiceLocale: PCWSTR = w("ServiceLocale")

public val NAME_StatusSvc: PCWSTR = w("Status")

public val NAME_StatusSvc_BatteryLife: PCWSTR = w("BatteryLife")

public val NAME_StatusSvc_ChargingState: PCWSTR = w("ChargingState")

public val NAME_StatusSvc_MissedCalls: PCWSTR = w("MissedCalls")

public val NAME_StatusSvc_NetworkName: PCWSTR = w("NetworkName")

public val NAME_StatusSvc_NetworkType: PCWSTR = w("NetworkType")

public val NAME_StatusSvc_NewPictures: PCWSTR = w("NewPictures")

public val NAME_StatusSvc_Roaming: PCWSTR = w("Roaming")

public val NAME_StatusSvc_SignalStrength: PCWSTR = w("SignalStrength")

public val NAME_StatusSvc_StorageCapacity: PCWSTR = w("StorageCapacity")

public val NAME_StatusSvc_StorageFreeSpace: PCWSTR = w("StorageFreeSpace")

public val NAME_StatusSvc_TextMessages: PCWSTR = w("TextMessages")

public val NAME_StatusSvc_VoiceMail: PCWSTR = w("VoiceMail")

public val NAME_SyncObj_LastAuthorProxyID: PCWSTR = w("LastAuthorProxyID")

public val NAME_SyncSvc_BeginSync: PCWSTR = w("BeginSync")

public val NAME_SyncSvc_EndSync: PCWSTR = w("EndSync")

public val NAME_SyncSvc_FilterType: PCWSTR = w("FilterType")

public val NAME_SyncSvc_LocalOnlyDelete: PCWSTR = w("LocalOnlyDelete")

public val NAME_SyncSvc_SyncFormat: PCWSTR = w("SyncFormat")

public val NAME_SyncSvc_SyncObjectReferences: PCWSTR = w("SyncObjectReferences")

public val NAME_TIFFEPImage: PCWSTR = w("TIFFEPImage")

public val NAME_TIFFITImage: PCWSTR = w("TIFFITImage")

public val NAME_TIFFImage: PCWSTR = w("TIFFImage")

public val NAME_TaskObj_BeginDate: PCWSTR = w("BeginDate")

public val NAME_TaskObj_Complete: PCWSTR = w("Complete")

public val NAME_TaskObj_EndDate: PCWSTR = w("EndDate")

public val NAME_TaskObj_ReminderDateTime: PCWSTR = w("ReminderDateTime")

public val NAME_TasksSvc: PCWSTR = w("Tasks")

public val NAME_TasksSvc_SyncActiveOnly: PCWSTR = w("FilterType")

public val NAME_TextDocument: PCWSTR = w("TextDocument")

public val NAME_Undefined: PCWSTR = w("Undefined")

public val NAME_UndefinedAudio: PCWSTR = w("UndefinedAudio")

public val NAME_UndefinedCollection: PCWSTR = w("UndefinedCollection")

public val NAME_UndefinedDocument: PCWSTR = w("UndefinedDocument")

public val NAME_UndefinedVideo: PCWSTR = w("UndefinedVideo")

public val NAME_UnknownImage: PCWSTR = w("UnknownImage")

public val NAME_VCalendar1Activity: PCWSTR = w("VCalendar1")

public val NAME_VCard2Contact: PCWSTR = w("VCard2Contact")

public val NAME_VCard3Contact: PCWSTR = w("VCard3Contact")

public val NAME_VideoObj_KeyFrameDistance: PCWSTR = w("KeyFrameDistance")

public val NAME_VideoObj_ScanType: PCWSTR = w("ScanType")

public val NAME_VideoObj_Source: PCWSTR = w("Source")

public val NAME_VideoObj_VideoBitRate: PCWSTR = w("VideoBitRate")

public val NAME_VideoObj_VideoFormatCode: PCWSTR = w("VideoFormatCode")

public val NAME_VideoObj_VideoFrameRate: PCWSTR = w("VideoFrameRate")

public val NAME_WAVFile: PCWSTR = w("WAVFile")

public val NAME_WBMPImage: PCWSTR = w("WBMPImage")

public val NAME_WMAFile: PCWSTR = w("WMAFile")

public val NAME_WMVFile: PCWSTR = w("WMVFile")

public val NAME_WPLPlaylist: PCWSTR = w("WPLPlaylist")

public val NAME_WordDocument: PCWSTR = w("WordDocument")

public val NAME_XMLDocument: PCWSTR = w("XMLDocument")

public val PORTABLE_DEVICE_DELETE_NO_RECURSION: DELETE_OBJECT_OPTIONS = 0

public val PORTABLE_DEVICE_DELETE_WITH_RECURSION: DELETE_OBJECT_OPTIONS = 1

public val PORTABLE_DEVICE_DRM_SCHEME_PDDRM: PCWSTR = w("PDDRM")

public val PORTABLE_DEVICE_DRM_SCHEME_WMDRM10_PD: PCWSTR = w("WMDRM10-PD")

public val PORTABLE_DEVICE_ICON: PCWSTR = w("Icons")

public val PORTABLE_DEVICE_IS_MASS_STORAGE: PCWSTR = w("PortableDeviceIsMassStorage")

public val PORTABLE_DEVICE_NAMESPACE_EXCLUDE_FROM_SHELL: PCWSTR = w("PortableDeviceNameSpaceExcludeFromShell")

public val PORTABLE_DEVICE_NAMESPACE_THUMBNAIL_CONTENT_TYPES: PCWSTR = w("PortableDeviceNameSpaceThumbnailContentTypes")

public val PORTABLE_DEVICE_NAMESPACE_TIMEOUT: PCWSTR = w("PortableDeviceNameSpaceTimeout")

public val PORTABLE_DEVICE_TYPE: PCWSTR = w("PortableDeviceType")

public val PortableDevice: GUID = GUID.from_u128(0x728a21c53d9e48d7uL, 0x9810864848f0f404uL)

public val PortableDeviceDispatchFactory: GUID = GUID.from_u128(0x4323223383384658uL, 0xae010b4ae830b6b0uL)

public val PortableDeviceFTM: GUID = GUID.from_u128(0xf7c0039a4762488auL, 0xb4b3760ef9a1ba9buL)

public val PortableDeviceKeyCollection: GUID = GUID.from_u128(0xde2d022d248043beuL, 0x97f0d1fa2cf98f4fuL)

public val PortableDeviceManager: GUID = GUID.from_u128(0xaf10cec2ecd4b92uL, 0x958134f6ae0637f3uL)

public val PortableDevicePropVariantCollection: GUID = GUID.from_u128(0x8a99e2f6d6d4b80uL, 0xaf5abaf2bcbe4cb9uL)

public val PortableDeviceService: GUID = GUID.from_u128(0xef5db4c29312422cuL, 0x9152411cd9c4dd84uL)

public val PortableDeviceServiceFTM: GUID = GUID.from_u128(0x1649b154c794497auL, 0x9b03f3f0121302f3uL)

public val PortableDeviceValues: GUID = GUID.from_u128(0xc15d503d01747ceuL, 0x90167b3f978721ccuL)

public val PortableDeviceValuesCollection: GUID = GUID.from_u128(0x3882134d14cf4220uL, 0x9cb4435f86d83f60uL)

public val PortableDeviceWebControl: GUID = GUID.from_u128(0x186dd02c2dec41b5uL, 0xa7d4b59056fade51uL)

public val RANGEMAX_MessageObj_PatternDayOfMonth: UInt = 31u

public val RANGEMAX_MessageObj_PatternMonthOfYear: UInt = 12u

public val RANGEMAX_StatusSvc_BatteryLife: UInt = 100u

public val RANGEMAX_StatusSvc_MissedCalls: UInt = 255u

public val RANGEMAX_StatusSvc_NewPictures: UInt = 65535u

public val RANGEMAX_StatusSvc_SignalStrength: UInt = 4u

public val RANGEMAX_StatusSvc_TextMessages: UInt = 255u

public val RANGEMAX_StatusSvc_VoiceMail: UInt = 255u

public val RANGEMIN_MessageObj_PatternDayOfMonth: UInt = 1u

public val RANGEMIN_MessageObj_PatternMonthOfYear: UInt = 1u

public val RANGEMIN_StatusSvc_BatteryLife: UInt = 0u

public val RANGEMIN_StatusSvc_SignalStrength: UInt = 0u

public val RANGESTEP_MessageObj_PatternDayOfMonth: UInt = 1u

public val RANGESTEP_MessageObj_PatternMonthOfYear: UInt = 1u

public val RANGESTEP_StatusSvc_BatteryLife: UInt = 1u

public val RANGESTEP_StatusSvc_SignalStrength: UInt = 1u

public val SMS_BINARY_MESSAGE: SMS_MESSAGE_TYPES = 1

public val SMS_ENCODING_7_BIT: WPD_SMS_ENCODING_TYPES = 0

public val SMS_ENCODING_8_BIT: WPD_SMS_ENCODING_TYPES = 1

public val SMS_ENCODING_UTF_16: WPD_SMS_ENCODING_TYPES = 2

public val SMS_TEXT_MESSAGE: SMS_MESSAGE_TYPES = 0

public val SRS_RADIO_DISABLED: SYSTEM_RADIO_STATE = 1

public val SRS_RADIO_ENABLED: SYSTEM_RADIO_STATE = 0

public val STR_WPDNSE_FAST_ENUM: PCWSTR = w("WPDNSE Fast Enum")

public val STR_WPDNSE_SIMPLE_ITEM: PCWSTR = w("WPDNSE SimpleItem")

public val SYNCSVC_FILTER_CALENDAR_WINDOW_WITH_RECURRENCE: UInt = 3u

public val SYNCSVC_FILTER_CONTACTS_WITH_PHONE: UInt = 1u

public val SYNCSVC_FILTER_NONE: UInt = 0u

public val SYNCSVC_FILTER_TASK_ACTIVE: UInt = 2u

public val TYPE_AnchorSyncSvc: UInt = 1u

public val TYPE_CalendarSvc: UInt = 0u

public val TYPE_ContactsSvc: UInt = 0u

public val TYPE_DeviceMetadataSvc: UInt = 0u

public val TYPE_FullEnumSyncSvc: UInt = 1u

public val TYPE_HintsSvc: UInt = 0u

public val TYPE_MessageSvc: UInt = 0u

public val TYPE_NotesSvc: UInt = 0u

public val TYPE_RingtonesSvc: UInt = 0u

public val TYPE_StatusSvc: UInt = 0u

public val TYPE_TasksSvc: UInt = 0u

public val WPDNSE_OBJECT_HAS_ALBUM_ART: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL), pid = 6u)

public val WPDNSE_OBJECT_HAS_AUDIO_CLIP: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL), pid = 5u)

public val WPDNSE_OBJECT_HAS_CONTACT_PHOTO: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL), pid = 2u)

public val WPDNSE_OBJECT_HAS_ICON: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL), pid = 4u)

public val WPDNSE_OBJECT_HAS_THUMBNAIL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL), pid = 3u)

public val WPDNSE_OBJECT_OPTIMAL_READ_BLOCK_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL), pid = 7u)

public val WPDNSE_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)

public val WPDNSE_PROPSHEET_CONTENT_DETAILS: UInt = 32u

public val WPDNSE_PROPSHEET_CONTENT_GENERAL: UInt = 4u

public val WPDNSE_PROPSHEET_CONTENT_REFERENCES: UInt = 8u

public val WPDNSE_PROPSHEET_CONTENT_RESOURCES: UInt = 16u

public val WPDNSE_PROPSHEET_DEVICE_GENERAL: UInt = 1u

public val WPDNSE_PROPSHEET_STORAGE_GENERAL: UInt = 2u

public val WPD_API_OPTIONS_V1: GUID = GUID.from_u128(0x10e54a3e052d4777uL, 0xa13cde7614be2bc4uL)

public val WPD_API_OPTION_IOCTL_ACCESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x10e54a3e052d4777uL, 0xa13cde7614be2bc4uL), pid = 3u)

public val WPD_API_OPTION_USE_CLEAR_DATA_STREAM: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x10e54a3e052d4777uL, 0xa13cde7614be2bc4uL), pid = 2u)

public val WPD_APPOINTMENT_ACCEPTED_ATTENDEES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 10u)

public val WPD_APPOINTMENT_DECLINED_ATTENDEES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 13u)

public val WPD_APPOINTMENT_LOCATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 3u)

public val WPD_APPOINTMENT_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)

public val WPD_APPOINTMENT_OPTIONAL_ATTENDEES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 9u)

public val WPD_APPOINTMENT_REQUIRED_ATTENDEES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 8u)

public val WPD_APPOINTMENT_RESOURCES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 11u)

public val WPD_APPOINTMENT_TENTATIVE_ATTENDEES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 12u)

public val WPD_APPOINTMENT_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL), pid = 7u)

public val WPD_AUDIO_BITRATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 9u)

public val WPD_AUDIO_BIT_DEPTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 12u)

public val WPD_AUDIO_BLOCK_ALIGNMENT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 13u)

public val WPD_AUDIO_CHANNEL_COUNT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 10u)

public val WPD_AUDIO_FORMAT_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 11u)

public val WPD_BITRATE_TYPE_DISCRETE: WPD_BITRATE_TYPES = 1

public val WPD_BITRATE_TYPE_FREE: WPD_BITRATE_TYPES = 3

public val WPD_BITRATE_TYPE_UNUSED: WPD_BITRATE_TYPES = 0

public val WPD_BITRATE_TYPE_VARIABLE: WPD_BITRATE_TYPES = 2

public val WPD_CAPTURE_MODE_BURST: WPD_CAPTURE_MODES = 2

public val WPD_CAPTURE_MODE_NORMAL: WPD_CAPTURE_MODES = 1

public val WPD_CAPTURE_MODE_TIMELAPSE: WPD_CAPTURE_MODES = 3

public val WPD_CAPTURE_MODE_UNDEFINED: WPD_CAPTURE_MODES = 0

public val WPD_CATEGORY_CAPABILITIES: GUID = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)

public val WPD_CATEGORY_COMMON: GUID = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)

public val WPD_CATEGORY_DEVICE_HINTS: GUID = GUID.from_u128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL)

public val WPD_CATEGORY_MEDIA_CAPTURE: GUID = GUID.from_u128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL)

public val WPD_CATEGORY_MTP_EXT_VENDOR_OPERATIONS: GUID = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)

public val WPD_CATEGORY_NETWORK_CONFIGURATION: GUID = GUID.from_u128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL)

public val WPD_CATEGORY_NULL: GUID = GUID.from_u128(0x0uL, 0x0uL)

public val WPD_CATEGORY_OBJECT_ENUMERATION: GUID = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)

public val WPD_CATEGORY_OBJECT_MANAGEMENT: GUID = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)

public val WPD_CATEGORY_OBJECT_PROPERTIES: GUID = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)

public val WPD_CATEGORY_OBJECT_PROPERTIES_BULK: GUID = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)

public val WPD_CATEGORY_OBJECT_RESOURCES: GUID = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)

public val WPD_CATEGORY_SERVICE_CAPABILITIES: GUID = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)

public val WPD_CATEGORY_SERVICE_COMMON: GUID = GUID.from_u128(0x322f071d36ef477fuL, 0xb4b56f52d734baeeuL)

public val WPD_CATEGORY_SERVICE_METHODS: GUID = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)

public val WPD_CATEGORY_SMS: GUID = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)

public val WPD_CATEGORY_STILL_IMAGE_CAPTURE: GUID = GUID.from_u128(0x4fcd698222a24b05uL, 0xa48b62d38bf27b32uL)

public val WPD_CATEGORY_STORAGE: GUID = GUID.from_u128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL)

public val WPD_CLASS_EXTENSION_OPTIONS_DEVICE_IDENTIFICATION_VALUES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL), pid = 3u)

public val WPD_CLASS_EXTENSION_OPTIONS_DONT_REGISTER_WPD_DEVICE_INTERFACE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL), pid = 3u)

public val WPD_CLASS_EXTENSION_OPTIONS_MULTITRANSPORT_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL), pid = 2u)

public val WPD_CLASS_EXTENSION_OPTIONS_REGISTER_WPD_PRIVATE_DEVICE_INTERFACE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL), pid = 4u)

public val WPD_CLASS_EXTENSION_OPTIONS_SILENCE_AUTOPLAY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x65c160f813674ce2uL, 0x939d8310839f0d30uL), pid = 2u)

public val WPD_CLASS_EXTENSION_OPTIONS_SUPPORTED_CONTENT_TYPES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL), pid = 2u)

public val WPD_CLASS_EXTENSION_OPTIONS_TRANSPORT_BANDWIDTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL), pid = 4u)

public val WPD_CLASS_EXTENSION_OPTIONS_V1: GUID = GUID.from_u128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL)

public val WPD_CLASS_EXTENSION_OPTIONS_V2: GUID = GUID.from_u128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL)

public val WPD_CLASS_EXTENSION_OPTIONS_V3: GUID = GUID.from_u128(0x65c160f813674ce2uL, 0x939d8310839f0d30uL)

public val WPD_CLASS_EXTENSION_V1: GUID = GUID.from_u128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL)

public val WPD_CLASS_EXTENSION_V2: GUID = GUID.from_u128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL)

public val WPD_CLIENT_DESIRED_ACCESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 9u)

public val WPD_CLIENT_EVENT_COOKIE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 11u)

public val WPD_CLIENT_INFORMATION_PROPERTIES_V1: GUID = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)

public val WPD_CLIENT_MAJOR_VERSION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 3u)

public val WPD_CLIENT_MANUAL_CLOSE_ON_DISCONNECT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 13u)

public val WPD_CLIENT_MINIMUM_RESULTS_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 12u)

public val WPD_CLIENT_MINOR_VERSION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 4u)

public val WPD_CLIENT_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 2u)

public val WPD_CLIENT_REVISION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 5u)

public val WPD_CLIENT_SECURITY_QUALITY_OF_SERVICE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 8u)

public val WPD_CLIENT_SHARE_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 10u)

public val WPD_CLIENT_WMDRM_APPLICATION_CERTIFICATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 7u)

public val WPD_CLIENT_WMDRM_APPLICATION_PRIVATE_KEY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL), pid = 6u)

public val WPD_COLOR_CORRECTED_STATUS_CORRECTED: WPD_COLOR_CORRECTED_STATUS_VALUES = 1

public val WPD_COLOR_CORRECTED_STATUS_NOT_CORRECTED: WPD_COLOR_CORRECTED_STATUS_VALUES = 0

public val WPD_COLOR_CORRECTED_STATUS_SHOULD_NOT_BE_CORRECTED: WPD_COLOR_CORRECTED_STATUS_VALUES = 2

public val WPD_COMMAND_ACCESS_FROM_ATTRIBUTE_WITH_METHOD_ACCESS: WPD_COMMAND_ACCESS_TYPES = 16

public val WPD_COMMAND_ACCESS_FROM_PROPERTY_WITH_FILE_ACCESS: WPD_COMMAND_ACCESS_TYPES = 8

public val WPD_COMMAND_ACCESS_FROM_PROPERTY_WITH_STGM_ACCESS: WPD_COMMAND_ACCESS_TYPES = 4

public val WPD_COMMAND_ACCESS_READ: WPD_COMMAND_ACCESS_TYPES = 1

public val WPD_COMMAND_ACCESS_READWRITE: WPD_COMMAND_ACCESS_TYPES = 3

public val WPD_COMMAND_CAPABILITIES_GET_COMMAND_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 3u)

public val WPD_COMMAND_CAPABILITIES_GET_EVENT_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 11u)

public val WPD_COMMAND_CAPABILITIES_GET_FIXED_PROPERTY_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 9u)

public val WPD_COMMAND_CAPABILITIES_GET_FUNCTIONAL_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 5u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_COMMANDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 2u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_CONTENT_TYPES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 6u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_EVENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 10u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FORMATS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 7u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FORMAT_PROPERTIES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 8u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FUNCTIONAL_CATEGORIES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 4u)

public val WPD_COMMAND_CLASS_EXTENSION_REGISTER_SERVICE_INTERFACES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL), pid = 2u)

public val WPD_COMMAND_CLASS_EXTENSION_UNREGISTER_SERVICE_INTERFACES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL), pid = 3u)

public val WPD_COMMAND_CLASS_EXTENSION_WRITE_DEVICE_INFORMATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL), pid = 2u)

public val WPD_COMMAND_COMMIT_KEYPAIR: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL), pid = 3u)

public val WPD_COMMAND_COMMON_GET_OBJECT_IDS_FROM_PERSISTENT_UNIQUE_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 3u)

public val WPD_COMMAND_COMMON_RESET_DEVICE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 2u)

public val WPD_COMMAND_COMMON_SAVE_CLIENT_INFORMATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 4u)

public val WPD_COMMAND_DEVICE_HINTS_GET_CONTENT_LOCATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL), pid = 2u)

public val WPD_COMMAND_GENERATE_KEYPAIR: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL), pid = 2u)

public val WPD_COMMAND_MEDIA_CAPTURE_PAUSE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL), pid = 4u)

public val WPD_COMMAND_MEDIA_CAPTURE_START: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL), pid = 2u)

public val WPD_COMMAND_MEDIA_CAPTURE_STOP: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL), pid = 3u)

public val WPD_COMMAND_MTP_EXT_END_DATA_TRANSFER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 17u)

public val WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITHOUT_DATA_PHASE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 12u)

public val WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITH_DATA_TO_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 13u)

public val WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITH_DATA_TO_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 14u)

public val WPD_COMMAND_MTP_EXT_GET_SUPPORTED_VENDOR_OPCODES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 11u)

public val WPD_COMMAND_MTP_EXT_GET_VENDOR_EXTENSION_DESCRIPTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 18u)

public val WPD_COMMAND_MTP_EXT_READ_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 15u)

public val WPD_COMMAND_MTP_EXT_WRITE_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 16u)

public val WPD_COMMAND_OBJECT_ENUMERATION_END_FIND: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 4u)

public val WPD_COMMAND_OBJECT_ENUMERATION_FIND_NEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 3u)

public val WPD_COMMAND_OBJECT_ENUMERATION_START_FIND: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 2u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_COMMIT_OBJECT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 5u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_COPY_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 9u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_CREATE_OBJECT_WITH_PROPERTIES_AND_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 3u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_CREATE_OBJECT_WITH_PROPERTIES_ONLY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 2u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_DELETE_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 7u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_MOVE_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 8u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_REVERT_OBJECT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 6u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_UPDATE_OBJECT_WITH_PROPERTIES_AND_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 10u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_WRITE_OBJECT_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 4u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_END: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 7u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_NEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 6u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_START: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 5u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_END: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 4u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_NEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 3u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_START: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 2u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_END: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 10u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_NEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 9u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_START: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 8u)

public val WPD_COMMAND_OBJECT_PROPERTIES_DELETE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 7u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 4u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET_ALL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 6u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 3u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET_SUPPORTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 2u)

public val WPD_COMMAND_OBJECT_PROPERTIES_SET: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 5u)

public val WPD_COMMAND_OBJECT_RESOURCES_CLOSE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 7u)

public val WPD_COMMAND_OBJECT_RESOURCES_COMMIT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 12u)

public val WPD_COMMAND_OBJECT_RESOURCES_CREATE_RESOURCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 9u)

public val WPD_COMMAND_OBJECT_RESOURCES_DELETE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 8u)

public val WPD_COMMAND_OBJECT_RESOURCES_GET_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 3u)

public val WPD_COMMAND_OBJECT_RESOURCES_GET_SUPPORTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 2u)

public val WPD_COMMAND_OBJECT_RESOURCES_OPEN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 4u)

public val WPD_COMMAND_OBJECT_RESOURCES_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 5u)

public val WPD_COMMAND_OBJECT_RESOURCES_REVERT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 10u)

public val WPD_COMMAND_OBJECT_RESOURCES_SEEK: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 11u)

public val WPD_COMMAND_OBJECT_RESOURCES_SEEK_IN_UNITS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 13u)

public val WPD_COMMAND_OBJECT_RESOURCES_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 6u)

public val WPD_COMMAND_PROCESS_WIRELESS_PROFILE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL), pid = 4u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_COMMAND_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 16u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_EVENT_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 11u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_EVENT_PARAMETER_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 12u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 7u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_PROPERTY_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 9u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_RENDERING_PROFILES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 14u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_INHERITED_SERVICES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 13u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_METHOD_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 4u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_METHOD_PARAMETER_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 5u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_COMMANDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 15u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_EVENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 10u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_FORMATS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 6u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_FORMAT_PROPERTIES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 8u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_METHODS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 2u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_METHODS_BY_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 3u)

public val WPD_COMMAND_SERVICE_COMMON_GET_SERVICE_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x322f071d36ef477fuL, 0xb4b56f52d734baeeuL), pid = 2u)

public val WPD_COMMAND_SERVICE_METHODS_CANCEL_INVOKE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 3u)

public val WPD_COMMAND_SERVICE_METHODS_END_INVOKE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 4u)

public val WPD_COMMAND_SERVICE_METHODS_START_INVOKE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 2u)

public val WPD_COMMAND_SMS_SEND: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL), pid = 2u)

public val WPD_COMMAND_STILL_IMAGE_CAPTURE_INITIATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4fcd698222a24b05uL, 0xa48b62d38bf27b32uL), pid = 2u)

public val WPD_COMMAND_STORAGE_EJECT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL), pid = 4u)

public val WPD_COMMAND_STORAGE_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL), pid = 2u)

public val WPD_COMMON_INFORMATION_BODY_TEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL), pid = 3u)

public val WPD_COMMON_INFORMATION_END_DATETIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL), pid = 6u)

public val WPD_COMMON_INFORMATION_NOTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL), pid = 7u)

public val WPD_COMMON_INFORMATION_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)

public val WPD_COMMON_INFORMATION_PRIORITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL), pid = 4u)

public val WPD_COMMON_INFORMATION_START_DATETIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL), pid = 5u)

public val WPD_COMMON_INFORMATION_SUBJECT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL), pid = 2u)

public val WPD_CONTACT_ANNIVERSARY_DATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 62u)

public val WPD_CONTACT_ASSISTANT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 61u)

public val WPD_CONTACT_BIRTHDATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 57u)

public val WPD_CONTACT_BUSINESS_EMAIL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 34u)

public val WPD_CONTACT_BUSINESS_EMAIL2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 35u)

public val WPD_CONTACT_BUSINESS_FAX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 45u)

public val WPD_CONTACT_BUSINESS_FULL_POSTAL_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 17u)

public val WPD_CONTACT_BUSINESS_PHONE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 40u)

public val WPD_CONTACT_BUSINESS_PHONE2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 41u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_CITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 20u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_COUNTRY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 23u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_LINE1: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 18u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_LINE2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 19u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_POSTAL_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 22u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_REGION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 21u)

public val WPD_CONTACT_BUSINESS_WEB_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 50u)

public val WPD_CONTACT_CHILDREN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 60u)

public val WPD_CONTACT_COMPANY_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 54u)

public val WPD_CONTACT_DISPLAY_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 2u)

public val WPD_CONTACT_FIRST_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 3u)

public val WPD_CONTACT_INSTANT_MESSENGER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 51u)

public val WPD_CONTACT_INSTANT_MESSENGER2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 52u)

public val WPD_CONTACT_INSTANT_MESSENGER3: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 53u)

public val WPD_CONTACT_LAST_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 5u)

public val WPD_CONTACT_MIDDLE_NAMES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 4u)

public val WPD_CONTACT_MOBILE_PHONE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 42u)

public val WPD_CONTACT_MOBILE_PHONE2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 43u)

public val WPD_CONTACT_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)

public val WPD_CONTACT_OTHER_EMAILS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 36u)

public val WPD_CONTACT_OTHER_FULL_POSTAL_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 24u)

public val WPD_CONTACT_OTHER_PHONES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 47u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_CITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 27u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_LINE1: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 25u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_LINE2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 26u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_POSTAL_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 29u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_POSTAL_COUNTRY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 30u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_REGION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 28u)

public val WPD_CONTACT_PAGER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 46u)

public val WPD_CONTACT_PERSONAL_EMAIL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 32u)

public val WPD_CONTACT_PERSONAL_EMAIL2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 33u)

public val WPD_CONTACT_PERSONAL_FAX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 44u)

public val WPD_CONTACT_PERSONAL_FULL_POSTAL_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 10u)

public val WPD_CONTACT_PERSONAL_PHONE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 38u)

public val WPD_CONTACT_PERSONAL_PHONE2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 39u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_CITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 13u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_COUNTRY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 16u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_LINE1: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 11u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_LINE2: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 12u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_POSTAL_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 15u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_REGION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 14u)

public val WPD_CONTACT_PERSONAL_WEB_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 49u)

public val WPD_CONTACT_PHONETIC_COMPANY_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 55u)

public val WPD_CONTACT_PHONETIC_FIRST_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 8u)

public val WPD_CONTACT_PHONETIC_LAST_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 9u)

public val WPD_CONTACT_PREFIX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 6u)

public val WPD_CONTACT_PRIMARY_EMAIL_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 31u)

public val WPD_CONTACT_PRIMARY_FAX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 58u)

public val WPD_CONTACT_PRIMARY_PHONE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 37u)

public val WPD_CONTACT_PRIMARY_WEB_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 48u)

public val WPD_CONTACT_RINGTONE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 63u)

public val WPD_CONTACT_ROLE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 56u)

public val WPD_CONTACT_SPOUSE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 59u)

public val WPD_CONTACT_SUFFIX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL), pid = 7u)

public val WPD_CONTENT_TYPE_ALL: GUID = GUID.from_u128(0x80e170d210554a3euL, 0xb95282cc4f8a8689uL)

public val WPD_CONTENT_TYPE_APPOINTMENT: GUID = GUID.from_u128(0xfed060e87934b1euL, 0x90c948ac389ac631uL)

public val WPD_CONTENT_TYPE_AUDIO: GUID = GUID.from_u128(0x4ad2c85e5e2d45e5uL, 0x88644f229e3c6cf0uL)

public val WPD_CONTENT_TYPE_AUDIO_ALBUM: GUID = GUID.from_u128(0xaa18737e500948fauL, 0xae2185f24383b4e6uL)

public val WPD_CONTENT_TYPE_CALENDAR: GUID = GUID.from_u128(0xa1fd5967602349a0uL, 0x9df1f8060be751b0uL)

public val WPD_CONTENT_TYPE_CERTIFICATE: GUID = GUID.from_u128(0xdc3876e8a9484060uL, 0x9050cbd77e8a3d87uL)

public val WPD_CONTENT_TYPE_CONTACT: GUID = GUID.from_u128(0xeaba831345254707uL, 0x9f0e87c6808e9435uL)

public val WPD_CONTENT_TYPE_CONTACT_GROUP: GUID = GUID.from_u128(0x346b89324c3640d8uL, 0x94151828291f9de9uL)

public val WPD_CONTENT_TYPE_DOCUMENT: GUID = GUID.from_u128(0x680adf52950a4041uL, 0x9b4165e393648155uL)

public val WPD_CONTENT_TYPE_EMAIL: GUID = GUID.from_u128(0x8038044a7e514f8fuL, 0x883d1d0623d14533uL)

public val WPD_CONTENT_TYPE_FOLDER: GUID = GUID.from_u128(0x27e2e392a11148e0uL, 0xab0ce17705a05f85uL)

public val WPD_CONTENT_TYPE_FUNCTIONAL_OBJECT: GUID = GUID.from_u128(0x99ed016017ff4c44uL, 0x9d981d7a6f941921uL)

public val WPD_CONTENT_TYPE_GENERIC_FILE: GUID = GUID.from_u128(0x85e0a68d3445d7uL, 0xbc5c447e59c73d48uL)

public val WPD_CONTENT_TYPE_GENERIC_MESSAGE: GUID = GUID.from_u128(0xe80eaaf8b2db4133uL, 0xb67e1bef4b4a6e5fuL)

public val WPD_CONTENT_TYPE_IMAGE: GUID = GUID.from_u128(0xef2107d5a52a4243uL, 0xa26b62d4176d7603uL)

public val WPD_CONTENT_TYPE_IMAGE_ALBUM: GUID = GUID.from_u128(0x7579314815f54a30uL, 0xa81354ed8a37e226uL)

public val WPD_CONTENT_TYPE_MEDIA_CAST: GUID = GUID.from_u128(0x5e88b3cc3e654e62uL, 0xbfff229495253ab0uL)

public val WPD_CONTENT_TYPE_MEMO: GUID = GUID.from_u128(0x9cd20ecf3b50414fuL, 0xa641e473ffe45751uL)

public val WPD_CONTENT_TYPE_MIXED_CONTENT_ALBUM: GUID = GUID.from_u128(0xf0c3aca59349acuL, 0x921924abca5a2563uL)

public val WPD_CONTENT_TYPE_NETWORK_ASSOCIATION: GUID = GUID.from_u128(0x31da7ee18c84205uL, 0x847e89a11261d0f3uL)

public val WPD_CONTENT_TYPE_PLAYLIST: GUID = GUID.from_u128(0x1a33f7e4af1348f5uL, 0x994e77369dfe04a3uL)

public val WPD_CONTENT_TYPE_PROGRAM: GUID = GUID.from_u128(0xd269f96a247c4bffuL, 0x98fb97f3c49220e6uL)

public val WPD_CONTENT_TYPE_SECTION: GUID = GUID.from_u128(0x821089f51d914dc9uL, 0xbe3cbbb1b35b18ceuL)

public val WPD_CONTENT_TYPE_TASK: GUID = GUID.from_u128(0x63252f2c887f4cb6uL, 0xb1acd29855dcef6cuL)

public val WPD_CONTENT_TYPE_TELEVISION: GUID = GUID.from_u128(0x60a169cff2ae4e21uL, 0x93759677f11c1c6euL)

public val WPD_CONTENT_TYPE_UNSPECIFIED: GUID = GUID.from_u128(0x28d8d31e249c454euL, 0xaabc34883168e634uL)

public val WPD_CONTENT_TYPE_VIDEO: GUID = GUID.from_u128(0x9261b03c3d784519uL, 0x85e302c5e1f50bb9uL)

public val WPD_CONTENT_TYPE_VIDEO_ALBUM: GUID = GUID.from_u128(0x12b0db7d4c145d6uL, 0xb08194b87779614fuL)

public val WPD_CONTENT_TYPE_WIRELESS_PROFILE: GUID = GUID.from_u128(0xbac070a9f5f4da4uL, 0xa8f63de44d68fd6cuL)

public val WPD_CONTROL_FUNCTION_GENERIC_MESSAGE: UInt = 66u

public val WPD_CROPPED_STATUS_CROPPED: WPD_CROPPED_STATUS_VALUES = 1

public val WPD_CROPPED_STATUS_NOT_CROPPED: WPD_CROPPED_STATUS_VALUES = 0

public val WPD_CROPPED_STATUS_SHOULD_NOT_BE_CROPPED: WPD_CROPPED_STATUS_VALUES = 2

public val WPD_DEVICE_DATETIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 11u)

public val WPD_DEVICE_EDP_IDENTITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x6c2b878cc2ec490duL, 0xb425d7a75e23e5eduL), pid = 1u)

public val WPD_DEVICE_FIRMWARE_VERSION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 3u)

public val WPD_DEVICE_FRIENDLY_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 12u)

public val WPD_DEVICE_FUNCTIONAL_UNIQUE_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL), pid = 2u)

public val WPD_DEVICE_MANUFACTURER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 7u)

public val WPD_DEVICE_MODEL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 8u)

public val WPD_DEVICE_MODEL_UNIQUE_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL), pid = 3u)

public val WPD_DEVICE_NETWORK_IDENTIFIER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 16u)

public val WPD_DEVICE_OBJECT_ID: PCWSTR = w("DEVICE")

public val WPD_DEVICE_POWER_LEVEL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 4u)

public val WPD_DEVICE_POWER_SOURCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 5u)

public val WPD_DEVICE_PROPERTIES_V1: GUID = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)

public val WPD_DEVICE_PROPERTIES_V2: GUID = GUID.from_u128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL)

public val WPD_DEVICE_PROPERTIES_V3: GUID = GUID.from_u128(0x6c2b878cc2ec490duL, 0xb425d7a75e23e5eduL)

public val WPD_DEVICE_PROTOCOL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 6u)

public val WPD_DEVICE_SERIAL_NUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 9u)

public val WPD_DEVICE_SUPPORTED_DRM_SCHEMES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 13u)

public val WPD_DEVICE_SUPPORTED_FORMATS_ARE_ORDERED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 14u)

public val WPD_DEVICE_SUPPORTS_NON_CONSUMABLE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 10u)

public val WPD_DEVICE_SYNC_PARTNER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 2u)

public val WPD_DEVICE_TRANSPORT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL), pid = 4u)

public val WPD_DEVICE_TRANSPORT_BLUETOOTH: WPD_DEVICE_TRANSPORTS = 3

public val WPD_DEVICE_TRANSPORT_IP: WPD_DEVICE_TRANSPORTS = 2

public val WPD_DEVICE_TRANSPORT_UNSPECIFIED: WPD_DEVICE_TRANSPORTS = 0

public val WPD_DEVICE_TRANSPORT_USB: WPD_DEVICE_TRANSPORTS = 1

public val WPD_DEVICE_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL), pid = 15u)

public val WPD_DEVICE_TYPE_AUDIO_RECORDER: WPD_DEVICE_TYPES = 6

public val WPD_DEVICE_TYPE_CAMERA: WPD_DEVICE_TYPES = 1

public val WPD_DEVICE_TYPE_GENERIC: WPD_DEVICE_TYPES = 0

public val WPD_DEVICE_TYPE_MEDIA_PLAYER: WPD_DEVICE_TYPES = 2

public val WPD_DEVICE_TYPE_PERSONAL_INFORMATION_MANAGER: WPD_DEVICE_TYPES = 5

public val WPD_DEVICE_TYPE_PHONE: WPD_DEVICE_TYPES = 3

public val WPD_DEVICE_TYPE_VIDEO: WPD_DEVICE_TYPES = 4

public val WPD_DEVICE_USE_DEVICE_STAGE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL), pid = 5u)

public val WPD_DOCUMENT_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xb110203eb954f02uL, 0x93e097c631493ad5uL)

public val WPD_EFFECT_MODE_BLACK_AND_WHITE: WPD_EFFECT_MODES = 2

public val WPD_EFFECT_MODE_COLOR: WPD_EFFECT_MODES = 1

public val WPD_EFFECT_MODE_SEPIA: WPD_EFFECT_MODES = 3

public val WPD_EFFECT_MODE_UNDEFINED: WPD_EFFECT_MODES = 0

public val WPD_EMAIL_BCC_LINE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 4u)

public val WPD_EMAIL_CC_LINE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 3u)

public val WPD_EMAIL_HAS_ATTACHMENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 9u)

public val WPD_EMAIL_HAS_BEEN_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 7u)

public val WPD_EMAIL_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)

public val WPD_EMAIL_RECEIVED_TIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 8u)

public val WPD_EMAIL_SENDER_ADDRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 10u)

public val WPD_EMAIL_TO_LINE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL), pid = 2u)

public val WPD_EVENT_ATTRIBUTES_V1: GUID = GUID.from_u128(0x10c965782e814111uL, 0xaddee08ca6138f6duL)

public val WPD_EVENT_ATTRIBUTE_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x10c965782e814111uL, 0xaddee08ca6138f6duL), pid = 2u)

public val WPD_EVENT_ATTRIBUTE_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x10c965782e814111uL, 0xaddee08ca6138f6duL), pid = 4u)

public val WPD_EVENT_ATTRIBUTE_PARAMETERS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x10c965782e814111uL, 0xaddee08ca6138f6duL), pid = 3u)

public val WPD_EVENT_DEVICE_CAPABILITIES_UPDATED: GUID = GUID.from_u128(0x36885aa1cd544daauL, 0xb3d0afb3e03f5999uL)

public val WPD_EVENT_DEVICE_REMOVED: GUID = GUID.from_u128(0xe4cbca1b691848b9uL, 0x85ee02be7c850af9uL)

public val WPD_EVENT_DEVICE_RESET: GUID = GUID.from_u128(0x7755cf53c1ed44f3uL, 0xb5a2451e2c376b27uL)

public val WPD_EVENT_MTP_VENDOR_EXTENDED_EVENTS: GUID = GUID.from_u128(0x57384ff2uL, 0x8445be3126691059uL)

public val WPD_EVENT_NOTIFICATION: GUID = GUID.from_u128(0x2ba2e40a6b4c4295uL, 0xbb4326322b99aeb2uL)

public val WPD_EVENT_OBJECT_ADDED: GUID = GUID.from_u128(0xa726da95e2074b02uL, 0x8d44bef2e86cbffcuL)

public val WPD_EVENT_OBJECT_REMOVED: GUID = GUID.from_u128(0xbe82ab88a52c4823uL, 0x96e5d0272671fc38uL)

public val WPD_EVENT_OBJECT_TRANSFER_REQUESTED: GUID = GUID.from_u128(0x8d16a0a1f2c641dauL, 0x8f195e53721adbf2uL)

public val WPD_EVENT_OBJECT_UPDATED: GUID = GUID.from_u128(0x1445a7592e01485duL, 0x9f27ff07dae697abuL)

public val WPD_EVENT_OPTIONS_V1: GUID = GUID.from_u128(0xb3d8dad7a3614b83uL, 0x8a485b02ce10713buL)

public val WPD_EVENT_OPTION_IS_AUTOPLAY_EVENT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3d8dad7a3614b83uL, 0x8a485b02ce10713buL), pid = 3u)

public val WPD_EVENT_OPTION_IS_BROADCAST_EVENT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3d8dad7a3614b83uL, 0x8a485b02ce10713buL), pid = 2u)

public val WPD_EVENT_PARAMETER_CHILD_HIERARCHY_CHANGED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 8u)

public val WPD_EVENT_PARAMETER_EVENT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 3u)

public val WPD_EVENT_PARAMETER_OBJECT_CREATION_COOKIE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 7u)

public val WPD_EVENT_PARAMETER_OBJECT_PARENT_PERSISTENT_UNIQUE_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 6u)

public val WPD_EVENT_PARAMETER_OPERATION_PROGRESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 5u)

public val WPD_EVENT_PARAMETER_OPERATION_STATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 4u)

public val WPD_EVENT_PARAMETER_PNP_DEVICE_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL), pid = 2u)

public val WPD_EVENT_PARAMETER_SERVICE_METHOD_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x52807b8a49144323uL, 0x9b9a74f654b2b846uL), pid = 2u)

public val WPD_EVENT_PROPERTIES_V1: GUID = GUID.from_u128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)

public val WPD_EVENT_PROPERTIES_V2: GUID = GUID.from_u128(0x52807b8a49144323uL, 0x9b9a74f654b2b846uL)

public val WPD_EVENT_SERVICE_METHOD_COMPLETE: GUID = GUID.from_u128(0x8a33f5f80acc4d9buL, 0x9cc4112d353b86cauL)

public val WPD_EVENT_STORAGE_FORMAT: GUID = GUID.from_u128(0x3782616b22bc4474uL, 0xa2513070f8d38857uL)

public val WPD_EXPOSURE_METERING_MODE_AVERAGE: WPD_EXPOSURE_METERING_MODES = 1

public val WPD_EXPOSURE_METERING_MODE_CENTER_SPOT: WPD_EXPOSURE_METERING_MODES = 4

public val WPD_EXPOSURE_METERING_MODE_CENTER_WEIGHTED_AVERAGE: WPD_EXPOSURE_METERING_MODES = 2

public val WPD_EXPOSURE_METERING_MODE_MULTI_SPOT: WPD_EXPOSURE_METERING_MODES = 3

public val WPD_EXPOSURE_METERING_MODE_UNDEFINED: WPD_EXPOSURE_METERING_MODES = 0

public val WPD_EXPOSURE_PROGRAM_MODE_ACTION: WPD_EXPOSURE_PROGRAM_MODES = 6

public val WPD_EXPOSURE_PROGRAM_MODE_APERTURE_PRIORITY: WPD_EXPOSURE_PROGRAM_MODES = 3

public val WPD_EXPOSURE_PROGRAM_MODE_AUTO: WPD_EXPOSURE_PROGRAM_MODES = 2

public val WPD_EXPOSURE_PROGRAM_MODE_CREATIVE: WPD_EXPOSURE_PROGRAM_MODES = 5

public val WPD_EXPOSURE_PROGRAM_MODE_MANUAL: WPD_EXPOSURE_PROGRAM_MODES = 1

public val WPD_EXPOSURE_PROGRAM_MODE_PORTRAIT: WPD_EXPOSURE_PROGRAM_MODES = 7

public val WPD_EXPOSURE_PROGRAM_MODE_SHUTTER_PRIORITY: WPD_EXPOSURE_PROGRAM_MODES = 4

public val WPD_EXPOSURE_PROGRAM_MODE_UNDEFINED: WPD_EXPOSURE_PROGRAM_MODES = 0

public val WPD_FLASH_MODE_AUTO: WPD_FLASH_MODES = 1

public val WPD_FLASH_MODE_EXTERNAL_SYNC: WPD_FLASH_MODES = 6

public val WPD_FLASH_MODE_FILL: WPD_FLASH_MODES = 3

public val WPD_FLASH_MODE_OFF: WPD_FLASH_MODES = 2

public val WPD_FLASH_MODE_RED_EYE_AUTO: WPD_FLASH_MODES = 4

public val WPD_FLASH_MODE_RED_EYE_FILL: WPD_FLASH_MODES = 5

public val WPD_FLASH_MODE_UNDEFINED: WPD_FLASH_MODES = 0

public val WPD_FOCUS_AUTOMATIC: WPD_FOCUS_MODES = 2

public val WPD_FOCUS_AUTOMATIC_MACRO: WPD_FOCUS_MODES = 3

public val WPD_FOCUS_MANUAL: WPD_FOCUS_MODES = 1

public val WPD_FOCUS_METERING_MODE_CENTER_SPOT: WPD_FOCUS_METERING_MODES = 1

public val WPD_FOCUS_METERING_MODE_MULTI_SPOT: WPD_FOCUS_METERING_MODES = 2

public val WPD_FOCUS_METERING_MODE_UNDEFINED: WPD_FOCUS_METERING_MODES = 0

public val WPD_FOCUS_UNDEFINED: WPD_FOCUS_MODES = 0

public val WPD_FOLDER_CONTENT_TYPES_ALLOWED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7e9a7abfe5684b34uL, 0xaa2f13bb12ab177duL), pid = 2u)

public val WPD_FOLDER_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x7e9a7abfe5684b34uL, 0xaa2f13bb12ab177duL)

public val WPD_FORMAT_ATTRIBUTES_V1: GUID = GUID.from_u128(0xa0a02000bcaf4be8uL, 0xb3f5233f231cf58fuL)

public val WPD_FORMAT_ATTRIBUTE_MIMETYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xa0a02000bcaf4be8uL, 0xb3f5233f231cf58fuL), pid = 3u)

public val WPD_FORMAT_ATTRIBUTE_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xa0a02000bcaf4be8uL, 0xb3f5233f231cf58fuL), pid = 2u)

public val WPD_FUNCTIONAL_CATEGORY_ALL: GUID = GUID.from_u128(0x2d8a6512a74c448euL, 0xba8af4ac07c49399uL)

public val WPD_FUNCTIONAL_CATEGORY_AUDIO_CAPTURE: GUID = GUID.from_u128(0x3f2a1919c7c24a00uL, 0x855df57cf06debbbuL)

public val WPD_FUNCTIONAL_CATEGORY_DEVICE: GUID = GUID.from_u128(0x8ea466be3a44336uL, 0xa1f3a44d2b5c438cuL)

public val WPD_FUNCTIONAL_CATEGORY_NETWORK_CONFIGURATION: GUID = GUID.from_u128(0x48f4db727c6a4ab0uL, 0x9e1a470e3cdbf26auL)

public val WPD_FUNCTIONAL_CATEGORY_RENDERING_INFORMATION: GUID = GUID.from_u128(0x8600ba4a7ba4a01uL, 0xab0e0065d0a356d3uL)

public val WPD_FUNCTIONAL_CATEGORY_SMS: GUID = GUID.from_u128(0x44a0b1c1e94afduL, 0xb358a62c6117c9cfuL)

public val WPD_FUNCTIONAL_CATEGORY_STILL_IMAGE_CAPTURE: GUID = GUID.from_u128(0x613ca327ab934900uL, 0xb4fa895bb5874b79uL)

public val WPD_FUNCTIONAL_CATEGORY_STORAGE: GUID = GUID.from_u128(0x23f05bbc15de4c2auL, 0xa55ba9af5ce412efuL)

public val WPD_FUNCTIONAL_CATEGORY_VIDEO_CAPTURE: GUID = GUID.from_u128(0xe23e5f6b724343aauL, 0x8df10eb3d968a918uL)

public val WPD_FUNCTIONAL_OBJECT_CATEGORY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x8f052d93abca4fc5uL, 0xa5acb01df4dbe598uL), pid = 2u)

public val WPD_FUNCTIONAL_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x8f052d93abca4fc5uL, 0xa5acb01df4dbe598uL)

public val WPD_IMAGE_BITDEPTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 3u)

public val WPD_IMAGE_COLOR_CORRECTED_STATUS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 5u)

public val WPD_IMAGE_CROPPED_STATUS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 4u)

public val WPD_IMAGE_EXPOSURE_INDEX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 8u)

public val WPD_IMAGE_EXPOSURE_TIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 7u)

public val WPD_IMAGE_FNUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 6u)

public val WPD_IMAGE_HORIZONTAL_RESOLUTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 9u)

public val WPD_IMAGE_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)

public val WPD_IMAGE_VERTICAL_RESOLUTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL), pid = 10u)

public val WPD_MEDIA_ALBUM_ARTIST: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 25u)

public val WPD_MEDIA_ARTIST: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 24u)

public val WPD_MEDIA_AUDIO_ENCODING_PROFILE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 49u)

public val WPD_MEDIA_BITRATE_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 3u)

public val WPD_MEDIA_BUY_NOW: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 20u)

public val WPD_MEDIA_BYTE_BOOKMARK: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 36u)

public val WPD_MEDIA_COMPOSER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 11u)

public val WPD_MEDIA_COPYRIGHT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 4u)

public val WPD_MEDIA_DESCRIPTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 31u)

public val WPD_MEDIA_DESTINATION_URL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 30u)

public val WPD_MEDIA_DURATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 19u)

public val WPD_MEDIA_EFFECTIVE_RATING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 12u)

public val WPD_MEDIA_ENCODING_PROFILE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 21u)

public val WPD_MEDIA_GENRE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 32u)

public val WPD_MEDIA_GUID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 38u)

public val WPD_MEDIA_HEIGHT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 23u)

public val WPD_MEDIA_LAST_ACCESSED_TIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 8u)

public val WPD_MEDIA_LAST_BUILD_DATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 35u)

public val WPD_MEDIA_MANAGING_EDITOR: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 27u)

public val WPD_MEDIA_META_GENRE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 10u)

public val WPD_MEDIA_OBJECT_BOOKMARK: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 34u)

public val WPD_MEDIA_OWNER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 26u)

public val WPD_MEDIA_PARENTAL_RATING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 9u)

public val WPD_MEDIA_PROPERTIES_V1: GUID = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)

public val WPD_MEDIA_RELEASE_DATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 14u)

public val WPD_MEDIA_SAMPLE_RATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 15u)

public val WPD_MEDIA_SKIP_COUNT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 7u)

public val WPD_MEDIA_SOURCE_URL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 29u)

public val WPD_MEDIA_STAR_RATING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 16u)

public val WPD_MEDIA_SUBSCRIPTION_CONTENT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 5u)

public val WPD_MEDIA_SUB_DESCRIPTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 39u)

public val WPD_MEDIA_SUB_TITLE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 13u)

public val WPD_MEDIA_TIME_BOOKMARK: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 33u)

public val WPD_MEDIA_TIME_TO_LIVE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 37u)

public val WPD_MEDIA_TITLE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 18u)

public val WPD_MEDIA_TOTAL_BITRATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 2u)

public val WPD_MEDIA_USER_EFFECTIVE_RATING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 17u)

public val WPD_MEDIA_USE_COUNT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 6u)

public val WPD_MEDIA_WEBMASTER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 28u)

public val WPD_MEDIA_WIDTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL), pid = 22u)

public val WPD_MEMO_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x5ffbfc7b748341aduL, 0xafb9da3f4e592b8duL)

public val WPD_META_GENRE_AUDIO_PODCAST: WPD_META_GENRES = 64

public val WPD_META_GENRE_FEATURE_FILM_VIDEO_FILE: WPD_META_GENRES = 37

public val WPD_META_GENRE_GENERIC_MUSIC_AUDIO_FILE: WPD_META_GENRES = 1

public val WPD_META_GENRE_GENERIC_NON_AUDIO_NON_VIDEO: WPD_META_GENRES = 48

public val WPD_META_GENRE_GENERIC_NON_MUSIC_AUDIO_FILE: WPD_META_GENRES = 17

public val WPD_META_GENRE_GENERIC_VIDEO_FILE: WPD_META_GENRES = 33

public val WPD_META_GENRE_HOME_VIDEO_FILE: WPD_META_GENRES = 36

public val WPD_META_GENRE_MIXED_PODCAST: WPD_META_GENRES = 66

public val WPD_META_GENRE_MUSIC_VIDEO_FILE: WPD_META_GENRES = 35

public val WPD_META_GENRE_NEWS_VIDEO_FILE: WPD_META_GENRES = 34

public val WPD_META_GENRE_PHOTO_MONTAGE_VIDEO_FILE: WPD_META_GENRES = 40

public val WPD_META_GENRE_SPOKEN_WORD_AUDIO_BOOK_FILES: WPD_META_GENRES = 18

public val WPD_META_GENRE_SPOKEN_WORD_FILES_NON_AUDIO_BOOK: WPD_META_GENRES = 19

public val WPD_META_GENRE_SPOKEN_WORD_NEWS: WPD_META_GENRES = 20

public val WPD_META_GENRE_SPOKEN_WORD_TALK_SHOWS: WPD_META_GENRES = 21

public val WPD_META_GENRE_TELEVISION_VIDEO_FILE: WPD_META_GENRES = 38

public val WPD_META_GENRE_TRAINING_EDUCATIONAL_VIDEO_FILE: WPD_META_GENRES = 39

public val WPD_META_GENRE_UNUSED: WPD_META_GENRES = 0

public val WPD_META_GENRE_VIDEO_PODCAST: WPD_META_GENRES = 65

public val WPD_METHOD_ATTRIBUTES_V1: GUID = GUID.from_u128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL)

public val WPD_METHOD_ATTRIBUTE_ACCESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL), pid = 4u)

public val WPD_METHOD_ATTRIBUTE_ASSOCIATED_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL), pid = 3u)

public val WPD_METHOD_ATTRIBUTE_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL), pid = 2u)

public val WPD_METHOD_ATTRIBUTE_PARAMETERS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL), pid = 5u)

public val WPD_MUSIC_ALBUM: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 3u)

public val WPD_MUSIC_LYRICS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 6u)

public val WPD_MUSIC_MOOD: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 8u)

public val WPD_MUSIC_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)

public val WPD_MUSIC_TRACK: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL), pid = 4u)

public val WPD_NETWORK_ASSOCIATION_HOST_NETWORK_IDENTIFIERS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe4c93c1fb20343f1uL, 0xa1005a07d11b0274uL), pid = 2u)

public val WPD_NETWORK_ASSOCIATION_PROPERTIES_V1: GUID = GUID.from_u128(0xe4c93c1fb20343f1uL, 0xa1005a07d11b0274uL)

public val WPD_NETWORK_ASSOCIATION_X509V3SEQUENCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe4c93c1fb20343f1uL, 0xa1005a07d11b0274uL), pid = 3u)

public val WPD_OBJECT_BACK_REFERENCES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 21u)

public val WPD_OBJECT_CAN_DELETE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 26u)

public val WPD_OBJECT_CONTAINER_FUNCTIONAL_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 23u)

public val WPD_OBJECT_CONTENT_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 7u)

public val WPD_OBJECT_DATE_AUTHORED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 20u)

public val WPD_OBJECT_DATE_CREATED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 18u)

public val WPD_OBJECT_DATE_MODIFIED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 19u)

public val WPD_OBJECT_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 6u)

public val WPD_OBJECT_FORMAT_3G2: GUID = GUID.from_u128(0xb9850000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_3G2A: GUID = GUID.from_u128(0x1a11202d87594e34uL, 0xba5eb1211087eee4uL)

public val WPD_OBJECT_FORMAT_3GP: GUID = GUID.from_u128(0xb9840000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_3GPA: GUID = GUID.from_u128(0xe5172730f97141efuL, 0xa10b2271a0019d7auL)

public val WPD_OBJECT_FORMAT_AAC: GUID = GUID.from_u128(0xb9030000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ABSTRACT_CONTACT: GUID = GUID.from_u128(0xbb810000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ABSTRACT_CONTACT_GROUP: GUID = GUID.from_u128(0xba060000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ABSTRACT_MEDIA_CAST: GUID = GUID.from_u128(0xba0b0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_AIFF: GUID = GUID.from_u128(0x30070000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ALL: GUID = GUID.from_u128(0xc1f62eb24bb3479cuL, 0x9cfa05b5f3a57b22uL)

public val WPD_OBJECT_FORMAT_AMR: GUID = GUID.from_u128(0xb9080000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ASF: GUID = GUID.from_u128(0x300c0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ASXPLAYLIST: GUID = GUID.from_u128(0xba130000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ATSCTS: GUID = GUID.from_u128(0xb9870000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_AUDIBLE: GUID = GUID.from_u128(0xb9040000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_AVCHD: GUID = GUID.from_u128(0xb9860000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_AVI: GUID = GUID.from_u128(0x300a0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_BMP: GUID = GUID.from_u128(0x38040000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_CIFF: GUID = GUID.from_u128(0x38050000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_DPOF: GUID = GUID.from_u128(0x30060000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_DVBTS: GUID = GUID.from_u128(0xb9880000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_EXECUTABLE: GUID = GUID.from_u128(0x30030000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_EXIF: GUID = GUID.from_u128(0x38010000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_FLAC: GUID = GUID.from_u128(0xb9060000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_FLASHPIX: GUID = GUID.from_u128(0x38030000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_GIF: GUID = GUID.from_u128(0x38070000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_HTML: GUID = GUID.from_u128(0x30050000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ICALENDAR: GUID = GUID.from_u128(0xbe030000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_ICON: GUID = GUID.from_u128(0x77232ed102c4638uL, 0x9c2283f142bfc822uL)

public val WPD_OBJECT_FORMAT_JFIF: GUID = GUID.from_u128(0x38080000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_JP2: GUID = GUID.from_u128(0x380f0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_JPEGXR: GUID = GUID.from_u128(0xb8040000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_JPX: GUID = GUID.from_u128(0x38100000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_M3UPLAYLIST: GUID = GUID.from_u128(0xba110000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_M4A: GUID = GUID.from_u128(0x30aba7ac6ffd4c23uL, 0xa3593e9b52f3f1c8uL)

public val WPD_OBJECT_FORMAT_MHT_COMPILED_HTML: GUID = GUID.from_u128(0xba840000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MICROSOFT_EXCEL: GUID = GUID.from_u128(0xba850000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MICROSOFT_POWERPOINT: GUID = GUID.from_u128(0xba860000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MICROSOFT_WFC: GUID = GUID.from_u128(0xb1040000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MICROSOFT_WORD: GUID = GUID.from_u128(0xba830000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MKV: GUID = GUID.from_u128(0xb9900000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MP2: GUID = GUID.from_u128(0xb9830000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MP3: GUID = GUID.from_u128(0x30090000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MP4: GUID = GUID.from_u128(0xb9820000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MPEG: GUID = GUID.from_u128(0x300b0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_MPLPLAYLIST: GUID = GUID.from_u128(0xba120000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_NETWORK_ASSOCIATION: GUID = GUID.from_u128(0xb1020000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_OGG: GUID = GUID.from_u128(0xb9020000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_PCD: GUID = GUID.from_u128(0x38090000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_PICT: GUID = GUID.from_u128(0x380a0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_PLSPLAYLIST: GUID = GUID.from_u128(0xba140000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_PNG: GUID = GUID.from_u128(0x380b0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_PROPERTIES_ONLY: GUID = GUID.from_u128(0x30010000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_QCELP: GUID = GUID.from_u128(0xb9070000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_SCRIPT: GUID = GUID.from_u128(0x30020000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_TEXT: GUID = GUID.from_u128(0x30040000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_TIFF: GUID = GUID.from_u128(0x380d0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_TIFFEP: GUID = GUID.from_u128(0x38020000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_TIFFIT: GUID = GUID.from_u128(0x380e0000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_UNSPECIFIED: GUID = GUID.from_u128(0x30000000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_VCALENDAR1: GUID = GUID.from_u128(0xbe020000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_VCARD2: GUID = GUID.from_u128(0xbb820000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_VCARD3: GUID = GUID.from_u128(0xbb830000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_WAVE: GUID = GUID.from_u128(0x30080000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_WBMP: GUID = GUID.from_u128(0xb8030000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_WINDOWSIMAGEFORMAT: GUID = GUID.from_u128(0xb8810000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_WMA: GUID = GUID.from_u128(0xb9010000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_WMV: GUID = GUID.from_u128(0xb9810000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_WPLPLAYLIST: GUID = GUID.from_u128(0xba100000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_X509V3CERTIFICATE: GUID = GUID.from_u128(0xb1030000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_FORMAT_XML: GUID = GUID.from_u128(0xba820000ae6c4804uL, 0x98bac57b46965fe7uL)

public val WPD_OBJECT_GENERATE_THUMBNAIL_FROM_RESOURCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 24u)

public val WPD_OBJECT_HINT_LOCATION_DISPLAY_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 25u)

public val WPD_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 2u)

public val WPD_OBJECT_ISHIDDEN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 9u)

public val WPD_OBJECT_ISSYSTEM: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 10u)

public val WPD_OBJECT_IS_DRM_PROTECTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 17u)

public val WPD_OBJECT_KEYWORDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 15u)

public val WPD_OBJECT_LANGUAGE_LOCALE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 27u)

public val WPD_OBJECT_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 4u)

public val WPD_OBJECT_NON_CONSUMABLE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 13u)

public val WPD_OBJECT_ORIGINAL_FILE_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 12u)

public val WPD_OBJECT_PARENT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 3u)

public val WPD_OBJECT_PERSISTENT_UNIQUE_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 5u)

public val WPD_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)

public val WPD_OBJECT_PROPERTIES_V2: GUID = GUID.from_u128(0x373cd3d4a4640d7uL, 0xb4d873e8da74e775uL)

public val WPD_OBJECT_REFERENCES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 14u)

public val WPD_OBJECT_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 11u)

public val WPD_OBJECT_SUPPORTED_UNITS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x373cd3d4a4640d7uL, 0xb4d873e8da74e775uL), pid = 2u)

public val WPD_OBJECT_SYNC_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL), pid = 16u)

public val WPD_OPERATION_STATE_ABORTED: WPD_OPERATION_STATES = 6

public val WPD_OPERATION_STATE_CANCELLED: WPD_OPERATION_STATES = 4

public val WPD_OPERATION_STATE_FINISHED: WPD_OPERATION_STATES = 5

public val WPD_OPERATION_STATE_PAUSED: WPD_OPERATION_STATES = 3

public val WPD_OPERATION_STATE_RUNNING: WPD_OPERATION_STATES = 2

public val WPD_OPERATION_STATE_STARTED: WPD_OPERATION_STATES = 1

public val WPD_OPERATION_STATE_UNSPECIFIED: WPD_OPERATION_STATES = 0

public val WPD_OPTION_OBJECT_MANAGEMENT_RECURSIVE_DELETE_SUPPORTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 5001u)

public val WPD_OPTION_OBJECT_RESOURCES_NO_INPUT_BUFFER_ON_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 5003u)

public val WPD_OPTION_OBJECT_RESOURCES_SEEK_ON_READ_SUPPORTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 5001u)

public val WPD_OPTION_OBJECT_RESOURCES_SEEK_ON_WRITE_SUPPORTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 5002u)

public val WPD_OPTION_SMS_BINARY_MESSAGE_SUPPORTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL), pid = 5001u)

public val WPD_OPTION_VALID_OBJECT_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 5001u)

public val WPD_PARAMETER_ATTRIBUTES_V1: GUID = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)

public val WPD_PARAMETER_ATTRIBUTE_DEFAULT_VALUE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 5u)

public val WPD_PARAMETER_ATTRIBUTE_ENUMERATION_ELEMENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 9u)

public val WPD_PARAMETER_ATTRIBUTE_FORM: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 4u)

public val WPD_PARAMETER_ATTRIBUTE_FORM_ENUMERATION: WpdParameterAttributeForm = 2

public val WPD_PARAMETER_ATTRIBUTE_FORM_OBJECT_IDENTIFIER: WpdParameterAttributeForm = 4

public val WPD_PARAMETER_ATTRIBUTE_FORM_RANGE: WpdParameterAttributeForm = 1

public val WPD_PARAMETER_ATTRIBUTE_FORM_REGULAR_EXPRESSION: WpdParameterAttributeForm = 3

public val WPD_PARAMETER_ATTRIBUTE_FORM_UNSPECIFIED: WpdParameterAttributeForm = 0

public val WPD_PARAMETER_ATTRIBUTE_MAX_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 11u)

public val WPD_PARAMETER_ATTRIBUTE_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 13u)

public val WPD_PARAMETER_ATTRIBUTE_ORDER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 2u)

public val WPD_PARAMETER_ATTRIBUTE_RANGE_MAX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 7u)

public val WPD_PARAMETER_ATTRIBUTE_RANGE_MIN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 6u)

public val WPD_PARAMETER_ATTRIBUTE_RANGE_STEP: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 8u)

public val WPD_PARAMETER_ATTRIBUTE_REGULAR_EXPRESSION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 10u)

public val WPD_PARAMETER_ATTRIBUTE_USAGE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 3u)

public val WPD_PARAMETER_ATTRIBUTE_VARTYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL), pid = 12u)

public val WPD_PARAMETER_USAGE_IN: WPD_PARAMETER_USAGE_TYPES = 1

public val WPD_PARAMETER_USAGE_INOUT: WPD_PARAMETER_USAGE_TYPES = 3

public val WPD_PARAMETER_USAGE_OUT: WPD_PARAMETER_USAGE_TYPES = 2

public val WPD_PARAMETER_USAGE_RETURN: WPD_PARAMETER_USAGE_TYPES = 0

public val WPD_POWER_SOURCE_BATTERY: WPD_POWER_SOURCES = 0

public val WPD_POWER_SOURCE_EXTERNAL: WPD_POWER_SOURCES = 1

public val WPD_PROPERTIES_MTP_VENDOR_EXTENDED_DEVICE_PROPS: GUID = GUID.from_u128(0x4d545058890040b3uL, 0x8f1ddc246e1e8370uL)

public val WPD_PROPERTIES_MTP_VENDOR_EXTENDED_OBJECT_PROPS: GUID = GUID.from_u128(0x4d5450584fce4578uL, 0x95c88698a9bc0f49uL)

public val WPD_PROPERTY_ATTRIBUTES_V1: GUID = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)

public val WPD_PROPERTY_ATTRIBUTES_V2: GUID = GUID.from_u128(0x5d9da16074ae43ccuL, 0x85a9fe555a80798euL)

public val WPD_PROPERTY_ATTRIBUTE_CAN_DELETE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 5u)

public val WPD_PROPERTY_ATTRIBUTE_CAN_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 3u)

public val WPD_PROPERTY_ATTRIBUTE_CAN_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 4u)

public val WPD_PROPERTY_ATTRIBUTE_DEFAULT_VALUE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 6u)

public val WPD_PROPERTY_ATTRIBUTE_ENUMERATION_ELEMENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 11u)

public val WPD_PROPERTY_ATTRIBUTE_FAST_PROPERTY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 7u)

public val WPD_PROPERTY_ATTRIBUTE_FORM: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 2u)

public val WPD_PROPERTY_ATTRIBUTE_FORM_ENUMERATION: WpdAttributeForm = 2

public val WPD_PROPERTY_ATTRIBUTE_FORM_OBJECT_IDENTIFIER: WpdAttributeForm = 4

public val WPD_PROPERTY_ATTRIBUTE_FORM_RANGE: WpdAttributeForm = 1

public val WPD_PROPERTY_ATTRIBUTE_FORM_REGULAR_EXPRESSION: WpdAttributeForm = 3

public val WPD_PROPERTY_ATTRIBUTE_FORM_UNSPECIFIED: WpdAttributeForm = 0

public val WPD_PROPERTY_ATTRIBUTE_MAX_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 13u)

public val WPD_PROPERTY_ATTRIBUTE_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x5d9da16074ae43ccuL, 0x85a9fe555a80798euL), pid = 2u)

public val WPD_PROPERTY_ATTRIBUTE_RANGE_MAX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 9u)

public val WPD_PROPERTY_ATTRIBUTE_RANGE_MIN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 8u)

public val WPD_PROPERTY_ATTRIBUTE_RANGE_STEP: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 10u)

public val WPD_PROPERTY_ATTRIBUTE_REGULAR_EXPRESSION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL), pid = 12u)

public val WPD_PROPERTY_ATTRIBUTE_VARTYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x5d9da16074ae43ccuL, 0x85a9fe555a80798euL), pid = 3u)

public val WPD_PROPERTY_CAPABILITIES_COMMAND: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1002u)

public val WPD_PROPERTY_CAPABILITIES_COMMAND_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1003u)

public val WPD_PROPERTY_CAPABILITIES_CONTENT_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1008u)

public val WPD_PROPERTY_CAPABILITIES_CONTENT_TYPES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1007u)

public val WPD_PROPERTY_CAPABILITIES_EVENT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1014u)

public val WPD_PROPERTY_CAPABILITIES_EVENT_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1015u)

public val WPD_PROPERTY_CAPABILITIES_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1010u)

public val WPD_PROPERTY_CAPABILITIES_FORMATS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1009u)

public val WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_CATEGORIES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1004u)

public val WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_CATEGORY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1005u)

public val WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1006u)

public val WPD_PROPERTY_CAPABILITIES_PROPERTY_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1012u)

public val WPD_PROPERTY_CAPABILITIES_PROPERTY_KEYS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1011u)

public val WPD_PROPERTY_CAPABILITIES_SUPPORTED_COMMANDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1001u)

public val WPD_PROPERTY_CAPABILITIES_SUPPORTED_EVENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xcabec786b7441c6uL, 0x92162639d1fce356uL), pid = 1013u)

public val WPD_PROPERTY_CLASS_EXTENSION_DEVICE_INFORMATION_VALUES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL), pid = 1001u)

public val WPD_PROPERTY_CLASS_EXTENSION_DEVICE_INFORMATION_WRITE_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL), pid = 1002u)

public val WPD_PROPERTY_CLASS_EXTENSION_SERVICE_INTERFACES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL), pid = 1002u)

public val WPD_PROPERTY_CLASS_EXTENSION_SERVICE_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL), pid = 1001u)

public val WPD_PROPERTY_CLASS_EXTENSION_SERVICE_REGISTRATION_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL), pid = 1003u)

public val WPD_PROPERTY_COMMON_ACTIVITY_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1011u)

public val WPD_PROPERTY_COMMON_CLIENT_INFORMATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1009u)

public val WPD_PROPERTY_COMMON_CLIENT_INFORMATION_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1010u)

public val WPD_PROPERTY_COMMON_COMMAND_CATEGORY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1001u)

public val WPD_PROPERTY_COMMON_COMMAND_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1002u)

public val WPD_PROPERTY_COMMON_COMMAND_TARGET: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1006u)

public val WPD_PROPERTY_COMMON_DRIVER_ERROR_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1004u)

public val WPD_PROPERTY_COMMON_HRESULT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1003u)

public val WPD_PROPERTY_COMMON_OBJECT_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1008u)

public val WPD_PROPERTY_COMMON_PERSISTENT_UNIQUE_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL), pid = 1007u)

public val WPD_PROPERTY_DEVICE_HINTS_CONTENT_LOCATIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL), pid = 1002u)

public val WPD_PROPERTY_DEVICE_HINTS_CONTENT_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL), pid = 1001u)

public val WPD_PROPERTY_MTP_EXT_EVENT_PARAMS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d545058ef884e4duL, 0x95c34f327f728a96uL), pid = 1011u)

public val WPD_PROPERTY_MTP_EXT_OPERATION_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1001u)

public val WPD_PROPERTY_MTP_EXT_OPERATION_PARAMS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1002u)

public val WPD_PROPERTY_MTP_EXT_OPTIMAL_TRANSFER_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1013u)

public val WPD_PROPERTY_MTP_EXT_RESPONSE_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1003u)

public val WPD_PROPERTY_MTP_EXT_RESPONSE_PARAMS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1004u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1006u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1012u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1009u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_TO_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1008u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_TO_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1010u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_WRITTEN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1011u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_TOTAL_DATA_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1007u)

public val WPD_PROPERTY_MTP_EXT_VENDOR_EXTENSION_DESCRIPTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1014u)

public val WPD_PROPERTY_MTP_EXT_VENDOR_OPERATION_CODES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL), pid = 1005u)

public val WPD_PROPERTY_NULL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x0uL, 0x0uL), pid = 0u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 1004u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_FILTER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 1002u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_NUM_OBJECTS_REQUESTED: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 1005u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_OBJECT_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 1003u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_PARENT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL), pid = 1001u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1002u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_COPY_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1013u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_CREATION_PROPERTIES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1001u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1005u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DELETE_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1007u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DELETE_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1010u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DESTINATION_FOLDER_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1011u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_MOVE_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1012u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_NUM_BYTES_TO_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1003u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_NUM_BYTES_WRITTEN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1004u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1016u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1006u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1009u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OPTIMAL_TRANSFER_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1008u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_PROPERTY_KEYS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1015u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_UPDATE_PROPERTIES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL), pid = 1014u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1002u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_DEPTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1005u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_OBJECT_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1007u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_OBJECT_IDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1001u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_PARENT_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1006u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_PROPERTY_KEYS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1004u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_VALUES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1003u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_WRITE_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL), pid = 1008u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 1001u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 1003u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_DELETE_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 1006u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_KEYS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 1002u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_VALUES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 1004u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_WRITE_RESULTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL), pid = 1005u)

public val WPD_PROPERTY_OBJECT_RESOURCES_ACCESS_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1002u)

public val WPD_PROPERTY_OBJECT_RESOURCES_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1005u)

public val WPD_PROPERTY_OBJECT_RESOURCES_DATA: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1010u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1007u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_TO_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1006u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_TO_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1008u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_WRITTEN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1009u)

public val WPD_PROPERTY_OBJECT_RESOURCES_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1001u)

public val WPD_PROPERTY_OBJECT_RESOURCES_OPTIMAL_TRANSFER_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1011u)

public val WPD_PROPERTY_OBJECT_RESOURCES_POSITION_FROM_START: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1014u)

public val WPD_PROPERTY_OBJECT_RESOURCES_RESOURCE_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1004u)

public val WPD_PROPERTY_OBJECT_RESOURCES_RESOURCE_KEYS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1003u)

public val WPD_PROPERTY_OBJECT_RESOURCES_SEEK_OFFSET: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1012u)

public val WPD_PROPERTY_OBJECT_RESOURCES_SEEK_ORIGIN_FLAG: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1013u)

public val WPD_PROPERTY_OBJECT_RESOURCES_STREAM_UNITS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1016u)

public val WPD_PROPERTY_OBJECT_RESOURCES_SUPPORTS_UNITS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL), pid = 1015u)

public val WPD_PROPERTY_PUBLIC_KEY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL), pid = 1001u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_COMMAND: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1018u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_COMMAND_OPTIONS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1019u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_EVENT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1012u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_EVENT_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1013u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1002u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_FORMATS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1007u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_FORMAT_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1008u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_INHERITANCE_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1014u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_INHERITED_SERVICES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1015u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_METHOD: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1003u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_METHOD_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1004u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PARAMETER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1005u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PARAMETER_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1006u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PROPERTY_ATTRIBUTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1010u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PROPERTY_KEYS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1009u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_RENDERING_PROFILES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1016u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_COMMANDS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1017u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_EVENTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1011u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_METHODS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL), pid = 1001u)

public val WPD_PROPERTY_SERVICE_METHOD: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 1001u)

public val WPD_PROPERTY_SERVICE_METHOD_CONTEXT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 1004u)

public val WPD_PROPERTY_SERVICE_METHOD_HRESULT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 1005u)

public val WPD_PROPERTY_SERVICE_METHOD_PARAMETER_VALUES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 1002u)

public val WPD_PROPERTY_SERVICE_METHOD_RESULT_VALUES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL), pid = 1003u)

public val WPD_PROPERTY_SERVICE_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x322f071d36ef477fuL, 0xb4b56f52d734baeeuL), pid = 1001u)

public val WPD_PROPERTY_SMS_BINARY_MESSAGE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL), pid = 1004u)

public val WPD_PROPERTY_SMS_MESSAGE_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL), pid = 1002u)

public val WPD_PROPERTY_SMS_RECIPIENT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL), pid = 1001u)

public val WPD_PROPERTY_SMS_TEXT_MESSAGE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL), pid = 1003u)

public val WPD_PROPERTY_STORAGE_DESTINATION_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL), pid = 1002u)

public val WPD_PROPERTY_STORAGE_OBJECT_ID: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL), pid = 1001u)

public val WPD_RENDERING_INFORMATION_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xc53d039fee234a31uL, 0x85907639879870b4uL)

public val WPD_RENDERING_INFORMATION_PROFILES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xc53d039fee234a31uL, 0x85907639879870b4uL), pid = 2u)

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_CREATABLE_RESOURCES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xc53d039fee234a31uL, 0x85907639879870b4uL), pid = 4u)

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xc53d039fee234a31uL, 0x85907639879870b4uL), pid = 3u)

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE_OBJECT: WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPES = 0

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE_RESOURCE: WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPES = 1

public val WPD_RESOURCE_ALBUM_ART: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf02aa35423004e2duL, 0xa1b93b6730f7fa21uL), pid = 0u)

public val WPD_RESOURCE_ATTRIBUTES_V1: GUID = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)

public val WPD_RESOURCE_ATTRIBUTE_CAN_DELETE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 5u)

public val WPD_RESOURCE_ATTRIBUTE_CAN_READ: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 3u)

public val WPD_RESOURCE_ATTRIBUTE_CAN_WRITE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 4u)

public val WPD_RESOURCE_ATTRIBUTE_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 8u)

public val WPD_RESOURCE_ATTRIBUTE_OPTIMAL_READ_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 6u)

public val WPD_RESOURCE_ATTRIBUTE_OPTIMAL_WRITE_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 7u)

public val WPD_RESOURCE_ATTRIBUTE_RESOURCE_KEY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 9u)

public val WPD_RESOURCE_ATTRIBUTE_TOTAL_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL), pid = 2u)

public val WPD_RESOURCE_AUDIO_CLIP: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x3bc1398285b148e0uL, 0x95a68d3ad06be117uL), pid = 0u)

public val WPD_RESOURCE_BRANDING_ART: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb633b1ae6caf4a87uL, 0x958922ded6dd5899uL), pid = 0u)

public val WPD_RESOURCE_CONTACT_PHOTO: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x2c4d680380ea4580uL, 0xaf9a5be1a23eddcbuL), pid = 0u)

public val WPD_RESOURCE_DEFAULT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe81e79be34f041bfuL, 0xb53ff1a06ae87842uL), pid = 0u)

public val WPD_RESOURCE_GENERIC: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb9b9f515ba704647uL, 0x94dcfa4925e95a07uL), pid = 0u)

public val WPD_RESOURCE_ICON: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xf195fed8aa284ee3uL, 0xb153e182dd5edc39uL), pid = 0u)

public val WPD_RESOURCE_THUMBNAIL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xc7c407ba98fa46b5uL, 0x996023fec124cfdeuL), pid = 0u)

public val WPD_RESOURCE_VIDEO_CLIP: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xb566ee4263684290uL, 0x866270182fb79f20uL), pid = 0u)

public val WPD_SECTION_DATA_LENGTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL), pid = 3u)

public val WPD_SECTION_DATA_OFFSET: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL), pid = 2u)

public val WPD_SECTION_DATA_REFERENCED_OBJECT_RESOURCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL), pid = 5u)

public val WPD_SECTION_DATA_UNITS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL), pid = 4u)

public val WPD_SECTION_DATA_UNITS_BYTES: WPD_SECTION_DATA_UNITS_VALUES = 0

public val WPD_SECTION_DATA_UNITS_MILLISECONDS: WPD_SECTION_DATA_UNITS_VALUES = 1

public val WPD_SECTION_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL)

public val WPD_SERVICE_INHERITANCE_IMPLEMENTATION: WPD_SERVICE_INHERITANCE_TYPES = 0

public val WPD_SERVICE_PROPERTIES_V1: GUID = GUID.from_u128(0x7510698acb54481cuL, 0xb8db0d75c93f1c06uL)

public val WPD_SERVICE_VERSION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7510698acb54481cuL, 0xb8db0d75c93f1c06uL), pid = 2u)

public val WPD_SMS_ENCODING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL), pid = 5u)

public val WPD_SMS_MAX_PAYLOAD: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL), pid = 4u)

public val WPD_SMS_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL)

public val WPD_SMS_PROVIDER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL), pid = 2u)

public val WPD_SMS_TIMEOUT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL), pid = 3u)

public val WPD_STILL_IMAGE_ARTIST: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 29u)

public val WPD_STILL_IMAGE_BURST_INTERVAL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 24u)

public val WPD_STILL_IMAGE_BURST_NUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 23u)

public val WPD_STILL_IMAGE_CAMERA_MANUFACTURER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 31u)

public val WPD_STILL_IMAGE_CAMERA_MODEL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 30u)

public val WPD_STILL_IMAGE_CAPTURE_DELAY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 17u)

public val WPD_STILL_IMAGE_CAPTURE_FORMAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 3u)

public val WPD_STILL_IMAGE_CAPTURE_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 18u)

public val WPD_STILL_IMAGE_CAPTURE_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)

public val WPD_STILL_IMAGE_CAPTURE_RESOLUTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 2u)

public val WPD_STILL_IMAGE_COMPRESSION_SETTING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 4u)

public val WPD_STILL_IMAGE_CONTRAST: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 19u)

public val WPD_STILL_IMAGE_DIGITAL_ZOOM: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 21u)

public val WPD_STILL_IMAGE_EFFECT_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 22u)

public val WPD_STILL_IMAGE_EXPOSURE_BIAS_COMPENSATION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 16u)

public val WPD_STILL_IMAGE_EXPOSURE_INDEX: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 15u)

public val WPD_STILL_IMAGE_EXPOSURE_METERING_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 11u)

public val WPD_STILL_IMAGE_EXPOSURE_PROGRAM_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 14u)

public val WPD_STILL_IMAGE_EXPOSURE_TIME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 13u)

public val WPD_STILL_IMAGE_FLASH_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 12u)

public val WPD_STILL_IMAGE_FNUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 7u)

public val WPD_STILL_IMAGE_FOCAL_LENGTH: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 8u)

public val WPD_STILL_IMAGE_FOCUS_DISTANCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 9u)

public val WPD_STILL_IMAGE_FOCUS_METERING_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 27u)

public val WPD_STILL_IMAGE_FOCUS_MODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 10u)

public val WPD_STILL_IMAGE_RGB_GAIN: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 6u)

public val WPD_STILL_IMAGE_SHARPNESS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 20u)

public val WPD_STILL_IMAGE_TIMELAPSE_INTERVAL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 26u)

public val WPD_STILL_IMAGE_TIMELAPSE_NUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 25u)

public val WPD_STILL_IMAGE_UPLOAD_URL: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 28u)

public val WPD_STILL_IMAGE_WHITE_BALANCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL), pid = 5u)

public val WPD_STORAGE_ACCESS_CAPABILITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 11u)

public val WPD_STORAGE_ACCESS_CAPABILITY_READWRITE: WPD_STORAGE_ACCESS_CAPABILITY_VALUES = 0

public val WPD_STORAGE_ACCESS_CAPABILITY_READ_ONLY_WITHOUT_OBJECT_DELETION: WPD_STORAGE_ACCESS_CAPABILITY_VALUES = 1

public val WPD_STORAGE_ACCESS_CAPABILITY_READ_ONLY_WITH_OBJECT_DELETION: WPD_STORAGE_ACCESS_CAPABILITY_VALUES = 2

public val WPD_STORAGE_CAPACITY: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 4u)

public val WPD_STORAGE_CAPACITY_IN_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 10u)

public val WPD_STORAGE_DESCRIPTION: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 7u)

public val WPD_STORAGE_FILE_SYSTEM_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 3u)

public val WPD_STORAGE_FREE_SPACE_IN_BYTES: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 5u)

public val WPD_STORAGE_FREE_SPACE_IN_OBJECTS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 6u)

public val WPD_STORAGE_MAX_OBJECT_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 9u)

public val WPD_STORAGE_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)

public val WPD_STORAGE_SERIAL_NUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 8u)

public val WPD_STORAGE_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL), pid = 2u)

public val WPD_STORAGE_TYPE_FIXED_RAM: WPD_STORAGE_TYPE_VALUES = 3

public val WPD_STORAGE_TYPE_FIXED_ROM: WPD_STORAGE_TYPE_VALUES = 1

public val WPD_STORAGE_TYPE_REMOVABLE_RAM: WPD_STORAGE_TYPE_VALUES = 4

public val WPD_STORAGE_TYPE_REMOVABLE_ROM: WPD_STORAGE_TYPE_VALUES = 2

public val WPD_STORAGE_TYPE_UNDEFINED: WPD_STORAGE_TYPE_VALUES = 0

public val WPD_STREAM_UNITS_BYTES: WPD_STREAM_UNITS = 0

public val WPD_STREAM_UNITS_FRAMES: WPD_STREAM_UNITS = 1

public val WPD_STREAM_UNITS_MICROSECONDS: WPD_STREAM_UNITS = 8

public val WPD_STREAM_UNITS_MILLISECONDS: WPD_STREAM_UNITS = 4

public val WPD_STREAM_UNITS_ROWS: WPD_STREAM_UNITS = 2

public val WPD_TASK_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL)

public val WPD_TASK_OWNER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL), pid = 11u)

public val WPD_TASK_PERCENT_COMPLETE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL), pid = 8u)

public val WPD_TASK_REMINDER_DATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL), pid = 10u)

public val WPD_TASK_STATUS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL), pid = 6u)

public val WPD_VIDEO_AUTHOR: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 2u)

public val WPD_VIDEO_BITRATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 13u)

public val WPD_VIDEO_BUFFER_SIZE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 8u)

public val WPD_VIDEO_CREDITS: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 9u)

public val WPD_VIDEO_FOURCC_CODE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 14u)

public val WPD_VIDEO_FRAMERATE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 15u)

public val WPD_VIDEO_KEY_FRAME_DISTANCE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 10u)

public val WPD_VIDEO_OBJECT_PROPERTIES_V1: GUID = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)

public val WPD_VIDEO_QUALITY_SETTING: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 11u)

public val WPD_VIDEO_RECORDEDTV_CHANNEL_NUMBER: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 5u)

public val WPD_VIDEO_RECORDEDTV_REPEAT: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 7u)

public val WPD_VIDEO_RECORDEDTV_STATION_NAME: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 4u)

public val WPD_VIDEO_SCAN_TYPE: Foundation.PROPERTYKEY = PROPERTYKEY(fmtid = GUID.from_u128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL), pid = 12u)

public val WPD_VIDEO_SCAN_TYPE_FIELD_INTERLEAVED_LOWER_FIRST: WPD_VIDEO_SCAN_TYPES = 3

public val WPD_VIDEO_SCAN_TYPE_FIELD_INTERLEAVED_UPPER_FIRST: WPD_VIDEO_SCAN_TYPES = 2

public val WPD_VIDEO_SCAN_TYPE_FIELD_SINGLE_LOWER_FIRST: WPD_VIDEO_SCAN_TYPES = 5

public val WPD_VIDEO_SCAN_TYPE_FIELD_SINGLE_UPPER_FIRST: WPD_VIDEO_SCAN_TYPES = 4

public val WPD_VIDEO_SCAN_TYPE_MIXED_INTERLACE: WPD_VIDEO_SCAN_TYPES = 6

public val WPD_VIDEO_SCAN_TYPE_MIXED_INTERLACE_AND_PROGRESSIVE: WPD_VIDEO_SCAN_TYPES = 7

public val WPD_VIDEO_SCAN_TYPE_PROGRESSIVE: WPD_VIDEO_SCAN_TYPES = 1

public val WPD_VIDEO_SCAN_TYPE_UNUSED: WPD_VIDEO_SCAN_TYPES = 0

public val WPD_WHITE_BALANCE_AUTOMATIC: WPD_WHITE_BALANCE_SETTINGS = 2

public val WPD_WHITE_BALANCE_DAYLIGHT: WPD_WHITE_BALANCE_SETTINGS = 4

public val WPD_WHITE_BALANCE_FLASH: WPD_WHITE_BALANCE_SETTINGS = 7

public val WPD_WHITE_BALANCE_FLORESCENT: WPD_WHITE_BALANCE_SETTINGS = 5

public val WPD_WHITE_BALANCE_MANUAL: WPD_WHITE_BALANCE_SETTINGS = 1

public val WPD_WHITE_BALANCE_ONE_PUSH_AUTOMATIC: WPD_WHITE_BALANCE_SETTINGS = 3

public val WPD_WHITE_BALANCE_TUNGSTEN: WPD_WHITE_BALANCE_SETTINGS = 6

public val WPD_WHITE_BALANCE_UNDEFINED: WPD_WHITE_BALANCE_SETTINGS = 0

public val WpdSerializer: GUID = GUID.from_u128(0xb91a74bad7c4a9duL, 0xb56329eef9167172uL)
