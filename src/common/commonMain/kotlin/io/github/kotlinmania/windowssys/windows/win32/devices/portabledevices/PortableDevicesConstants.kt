package io.github.kotlinmania.windowssys.windows.win32.devices.portabledevices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey

public val CLSID_WPD_NAMESPACE_EXTENSION: Guid = Guid.fromU128(U128(0x35786d3cb07549b9uL, 0x88dd029876e11c01uL))

public val DEVPKEY_MTPBTH_IS_CONNECTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xea1237fa589d4472uL, 0x84e40abe36fd62efuL)), pid = 2u)

public val DEVSVCTYPE_ABSTRACT: UInt = 1u

public val DEVSVCTYPE_DEFAULT: UInt = 0u

public val DEVSVC_SERVICEINFO_VERSION: UInt = 100u

public val DRS_HW_RADIO_OFF: DeviceRadioState = 2

public val DRS_HW_RADIO_OFF_UNCONTROLLABLE: DeviceRadioState = 6

public val DRS_HW_RADIO_ON_UNCONTROLLABLE: DeviceRadioState = 4

public val DRS_RADIO_INVALID: DeviceRadioState = 5

public val DRS_RADIO_MAX: DeviceRadioState = 6

public val DRS_RADIO_ON: DeviceRadioState = 0

public val DRS_SW_HW_RADIO_OFF: DeviceRadioState = 3

public val DRS_SW_RADIO_OFF: DeviceRadioState = 1

public val ENUM_ANCHOR_RESULTS_ANCHOR_STATE_INVALID: UInt = 1u

public val ENUM_ANCHOR_RESULTS_ANCHOR_STATE_NORMAL: UInt = 0u

public val ENUM_ANCHOR_RESULTS_ANCHOR_STATE_OLD: UInt = 2u

public val ENUM_ANCHOR_RESULTS_ITEM_STATE_CHANGED: UInt = 4u

public val ENUM_ANCHOR_RESULTS_ITEM_STATE_CREATED: UInt = 2u

public val ENUM_ANCHOR_RESULTS_ITEM_STATE_DELETED: UInt = 1u

public val ENUM_ANCHOR_RESULTS_ITEM_STATE_INVALID: UInt = 0u

public val ENUM_ANCHOR_RESULTS_ITEM_STATE_UPDATED: UInt = 3u

public val ENUM_CALENDAR_OBJ_BUSY_STATUS_BUSY: UInt = 1u

public val ENUM_CALENDAR_OBJ_BUSY_STATUS_FREE: UInt = 0u

public val ENUM_CALENDAR_OBJ_BUSY_STATUS_OUT_OF_OFFICE: UInt = 2u

public val ENUM_CALENDAR_OBJ_BUSY_STATUS_TENTATIVE: UInt = 3u

public val ENUM_DEVICE_METADATA_OBJ_DEFAULT_CAB_FALSE: UInt = 0u

public val ENUM_DEVICE_METADATA_OBJ_DEFAULT_CAB_TRUE: UInt = 1u

public val ENUM_MESSAGE_OBJ_PATTERN_INSTANCE_FIRST: UInt = 1u

public val ENUM_MESSAGE_OBJ_PATTERN_INSTANCE_FOURTH: UInt = 4u

public val ENUM_MESSAGE_OBJ_PATTERN_INSTANCE_LAST: UInt = 5u

public val ENUM_MESSAGE_OBJ_PATTERN_INSTANCE_NONE: UInt = 0u

public val ENUM_MESSAGE_OBJ_PATTERN_INSTANCE_SECOND: UInt = 2u

public val ENUM_MESSAGE_OBJ_PATTERN_INSTANCE_THIRD: UInt = 3u

public val ENUM_MESSAGE_OBJ_PATTERN_TYPE_DAILY: UInt = 1u

public val ENUM_MESSAGE_OBJ_PATTERN_TYPE_MONTHLY: UInt = 3u

public val ENUM_MESSAGE_OBJ_PATTERN_TYPE_WEEKLY: UInt = 2u

public val ENUM_MESSAGE_OBJ_PATTERN_TYPE_YEARLY: UInt = 4u

public val ENUM_MESSAGE_OBJ_PRIORITY_HIGHEST: UInt = 2u

public val ENUM_MESSAGE_OBJ_PRIORITY_LOWEST: UInt = 0u

public val ENUM_MESSAGE_OBJ_PRIORITY_NORMAL: UInt = 1u

public val ENUM_MESSAGE_OBJ_READ_FALSE: UInt = 0u

public val ENUM_MESSAGE_OBJ_READ_TRUE: UInt = 255u

public val ENUM_STATUS_SVC_CHARGING_ACTIVE: UInt = 1u

public val ENUM_STATUS_SVC_CHARGING_INACTIVE: UInt = 0u

public val ENUM_STATUS_SVC_CHARGING_UNKNOWN: UInt = 2u

public val ENUM_STATUS_SVC_ROAMING_ACTIVE: UInt = 1u

public val ENUM_STATUS_SVC_ROAMING_INACTIVE: UInt = 0u

public val ENUM_STATUS_SVC_ROAMING_UNKNOWN: UInt = 2u

public val ENUM_SYNC_SVC_SYNC_OBJECT_REFERENCES_DISABLED: UInt = 0u

public val ENUM_SYNC_SVC_SYNC_OBJECT_REFERENCES_ENABLED: UInt = 255u

public val ENUM_TASK_OBJ_COMPLETE_FALSE: UInt = 0u

public val ENUM_TASK_OBJ_COMPLETE_TRUE: UInt = 255u

public val E_WPD_DEVICE_ALREADY_OPENED: Hresult = 0x802A0001u.toInt()

public val E_WPD_DEVICE_IS_HUNG: Hresult = 0x802A0006u.toInt()

public val E_WPD_DEVICE_NOT_OPEN: Hresult = 0x802A0002u.toInt()

public val E_WPD_OBJECT_ALREADY_ATTACHED_TO_DEVICE: Hresult = 0x802A0003u.toInt()

public val E_WPD_OBJECT_ALREADY_ATTACHED_TO_SERVICE: Hresult = 0x802A00CAu.toInt()

public val E_WPD_OBJECT_NOT_ATTACHED_TO_DEVICE: Hresult = 0x802A0004u.toInt()

public val E_WPD_OBJECT_NOT_ATTACHED_TO_SERVICE: Hresult = 0x802A00CBu.toInt()

public val E_WPD_OBJECT_NOT_COMMITED: Hresult = 0x802A0005u.toInt()

public val E_WPD_SERVICE_ALREADY_OPENED: Hresult = 0x802A00C8u.toInt()

public val E_WPD_SERVICE_BAD_PARAMETER_ORDER: Hresult = 0x802A00CCu.toInt()

public val E_WPD_SERVICE_NOT_OPEN: Hresult = 0x802A00C9u.toInt()

public val E_WPD_SMS_INVALID_MESSAGE_BODY: Hresult = 0x802A0065u.toInt()

public val E_WPD_SMS_INVALID_RECIPIENT: Hresult = 0x802A0064u.toInt()

public val E_WPD_SMS_SERVICE_UNAVAILABLE: Hresult = 0x802A0066u.toInt()

public val ENUM_BTH_MTP_CONNECTORS: Guid = Guid.fromU128(U128(0xa1570149e6454f43uL, 0x8b0d409b061db2fcuL))

public val FACILITY_WPD: UInt = 42u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_FRIDAY: UInt = 32u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_MONDAY: UInt = 2u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_NONE: UInt = 0u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_SATURDAY: UInt = 64u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_SUNDAY: UInt = 1u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_THURSDAY: UInt = 16u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_TUESDAY: UInt = 4u

public val FLAG_MESSAGE_OBJ_DAY_OF_WEEK_WEDNESDAY: UInt = 8u

public val GUID_DEVINTERFACE_WPD: Guid = Guid.fromU128(U128(0x6ac27878a6fa4155uL, 0xba85f98f491d4f33uL))

public val GUID_DEVINTERFACE_WPD_PRIVATE: Guid = Guid.fromU128(U128(0xba0c718f4ded49b7uL, 0xbdd3fabe28661211uL))

public val GUID_DEVINTERFACE_WPD_SERVICE: Guid = Guid.fromU128(U128(0x9ef44f803d644246uL, 0xa6aa206f328d1edcuL))

public val IOCTL_WPD_MESSAGE_READWRITE_ACCESS: UInt = 4243720u

public val IOCTL_WPD_MESSAGE_READ_ACCESS: UInt = 4210952u

public val NAME_3GPP2FILE: Pcwstr = w("3GPP2File")

public val NAME_3GPP_FILE: Pcwstr = w("3GPPFile")

public val NAME_AAC_FILE: Pcwstr = w("AACFile")

public val NAME_AIFF_FILE: Pcwstr = w("AIFFFile")

public val NAME_AMR_FILE: Pcwstr = w("AMRFile")

public val NAME_ASF_FILE: Pcwstr = w("ASFFile")

public val NAME_ASX_PLAYLIST: Pcwstr = w("ASXPlaylist")

public val NAME_ATSCTS_FILE: Pcwstr = w("ATSCTSFile")

public val NAME_AVCHD_FILE: Pcwstr = w("AVCHDFile")

public val NAME_AVI_FILE: Pcwstr = w("AVIFile")

public val NAME_ABSTRACT_ACTIVITY: Pcwstr = w("AbstractActivity")

public val NAME_ABSTRACT_ACTIVITY_OCCURRENCE: Pcwstr = w("AbstractActivityOccurrence")

public val NAME_ABSTRACT_AUDIO_ALBUM: Pcwstr = w("AbstractAudioAlbum")

public val NAME_ABSTRACT_AUDIO_PLAYLIST: Pcwstr = w("AbstractAudioPlaylist")

public val NAME_ABSTRACT_AUDIO_VIDEO_ALBUM: Pcwstr = w("AbstractAudioVideoAlbum")

public val NAME_ABSTRACT_CHAPTERED_PRODUCTION: Pcwstr = w("AbstractChapteredProduction")

public val NAME_ABSTRACT_CONTACT: Pcwstr = w("AbstractContact")

public val NAME_ABSTRACT_CONTACT_GROUP: Pcwstr = w("AbstractContactGroup")

public val NAME_ABSTRACT_DOCUMENT: Pcwstr = w("AbstractDocument")

public val NAME_ABSTRACT_IMAGE_ALBUM: Pcwstr = w("AbstractImageAlbum")

public val NAME_ABSTRACT_MEDIACAST: Pcwstr = w("AbstractMediacast")

public val NAME_ABSTRACT_MESSAGE: Pcwstr = w("AbstractMessage")

public val NAME_ABSTRACT_MESSAGE_FOLDER: Pcwstr = w("AbstractMessageFolder")

public val NAME_ABSTRACT_MULTIMEDIA_ALBUM: Pcwstr = w("AbstractMultimediaAlbum")

public val NAME_ABSTRACT_NOTE: Pcwstr = w("AbstractNote")

public val NAME_ABSTRACT_TASK: Pcwstr = w("AbstractTask")

public val NAME_ABSTRACT_VIDEO_ALBUM: Pcwstr = w("AbstractVideoAlbum")

public val NAME_ABSTRACT_VIDEO_PLAYLIST: Pcwstr = w("AbstractVideoPlaylist")

public val NAME_ANCHOR_RESULTS: Pcwstr = w("AnchorResults")

public val NAME_ANCHOR_RESULTS_ANCHOR: Pcwstr = w("Anchor")

public val NAME_ANCHOR_RESULTS_ANCHOR_STATE: Pcwstr = w("AnchorState")

public val NAME_ANCHOR_RESULTS_RESULT_OBJECT_ID: Pcwstr = w("ResultObjectID")

public val NAME_ANCHOR_SYNC_KNOWLEDGE: Pcwstr = w("AnchorSyncKnowledge")

public val NAME_ANCHOR_SYNC_SVC: Pcwstr = w("AnchorSync")

public val NAME_ANCHOR_SYNC_SVC_BEGIN_SYNC: Pcwstr = w("BeginSync")

public val NAME_ANCHOR_SYNC_SVC_CURRENT_ANCHOR: Pcwstr = w("AnchorCurrentAnchor")

public val NAME_ANCHOR_SYNC_SVC_END_SYNC: Pcwstr = w("EndSync")

public val NAME_ANCHOR_SYNC_SVC_FILTER_TYPE: Pcwstr = w("FilterType")

public val NAME_ANCHOR_SYNC_SVC_GET_CHANGES_SINCE_ANCHOR: Pcwstr = w("GetChangesSinceAnchor")

public val NAME_ANCHOR_SYNC_SVC_KNOWLEDGE_OBJECT_ID: Pcwstr = w("AnchorKnowledgeObjectID")

public val NAME_ANCHOR_SYNC_SVC_LAST_SYNC_PROXY_ID: Pcwstr = w("AnchorLastSyncProxyID")

public val NAME_ANCHOR_SYNC_SVC_LOCAL_ONLY_DELETE: Pcwstr = w("LocalOnlyDelete")

public val NAME_ANCHOR_SYNC_SVC_PROVIDER_VERSION: Pcwstr = w("AnchorProviderVersion")

public val NAME_ANCHOR_SYNC_SVC_REPLICA_ID: Pcwstr = w("AnchorReplicaID")

public val NAME_ANCHOR_SYNC_SVC_SYNC_FORMAT: Pcwstr = w("SyncFormat")

public val NAME_ANCHOR_SYNC_SVC_VERSION_PROPS: Pcwstr = w("AnchorVersionProps")

public val NAME_ASSOCIATION: Pcwstr = w("Association")

public val NAME_AUDIBLE_FILE: Pcwstr = w("AudibleFile")

public val NAME_AUDIO_OBJ_AUDIO_BIT_DEPTH: Pcwstr = w("AudioBitDepth")

public val NAME_AUDIO_OBJ_AUDIO_BIT_RATE: Pcwstr = w("AudioBitRate")

public val NAME_AUDIO_OBJ_AUDIO_BLOCK_ALIGNMENT: Pcwstr = w("AudioBlockAlignment")

public val NAME_AUDIO_OBJ_AUDIO_FORMAT_CODE: Pcwstr = w("AudioFormatCode")

public val NAME_AUDIO_OBJ_CHANNELS: Pcwstr = w("Channels")

public val NAME_AUDIO_OBJ_LYRICS: Pcwstr = w("Lyrics")

public val NAME_BMP_IMAGE: Pcwstr = w("BMPImage")

public val NAME_CIFF_IMAGE: Pcwstr = w("CIFFImage")

public val NAME_CALENDAR_OBJ_ACCEPTED: Pcwstr = w("Accepted")

public val NAME_CALENDAR_OBJ_BEGIN_DATE_TIME: Pcwstr = w("BeginDateTime")

public val NAME_CALENDAR_OBJ_BUSY_STATUS: Pcwstr = w("BusyStatus")

public val NAME_CALENDAR_OBJ_DECLINED: Pcwstr = w("Declined")

public val NAME_CALENDAR_OBJ_END_DATE_TIME: Pcwstr = w("EndDateTime")

public val NAME_CALENDAR_OBJ_LOCATION: Pcwstr = w("Location")

public val NAME_CALENDAR_OBJ_PATTERN_DURATION: Pcwstr = w("PatternDuration")

public val NAME_CALENDAR_OBJ_PATTERN_START_TIME: Pcwstr = w("PatternStartTime")

public val NAME_CALENDAR_OBJ_REMINDER_OFFSET: Pcwstr = w("ReminderOffset")

public val NAME_CALENDAR_OBJ_TENTATIVE: Pcwstr = w("Tentative")

public val NAME_CALENDAR_OBJ_TIME_ZONE: Pcwstr = w("TimeZone")

public val NAME_CALENDAR_SVC: Pcwstr = w("Calendar")

public val NAME_CALENDAR_SVC_SYNC_WINDOW_END: Pcwstr = w("SyncWindowEnd")

public val NAME_CALENDAR_SVC_SYNC_WINDOW_START: Pcwstr = w("SyncWindowStart")

public val NAME_CONTACT_OBJ_ANNIVERSARY_DATE: Pcwstr = w("AnniversaryDate")

public val NAME_CONTACT_OBJ_ASSISTANT: Pcwstr = w("Assistant")

public val NAME_CONTACT_OBJ_BIRTHDATE: Pcwstr = w("Birthdate")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_CITY: Pcwstr = w("BusinessAddressCity")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_COUNTRY: Pcwstr = w("BusinessAddressCountry")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_FULL: Pcwstr = w("BusinessAddressFull")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_LINE2: Pcwstr = w("BusinessAddressLine2")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_POSTAL_CODE: Pcwstr = w("BusinessAddressPostalCode")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_REGION: Pcwstr = w("BusinessAddressRegion")

public val NAME_CONTACT_OBJ_BUSINESS_ADDRESS_STREET: Pcwstr = w("BusinessAddressStreet")

public val NAME_CONTACT_OBJ_BUSINESS_EMAIL: Pcwstr = w("BusinessEmail")

public val NAME_CONTACT_OBJ_BUSINESS_EMAIL2: Pcwstr = w("BusinessEmail2")

public val NAME_CONTACT_OBJ_BUSINESS_FAX: Pcwstr = w("BusinessFax")

public val NAME_CONTACT_OBJ_BUSINESS_PHONE: Pcwstr = w("BusinessPhone")

public val NAME_CONTACT_OBJ_BUSINESS_PHONE2: Pcwstr = w("BusinessPhone2")

public val NAME_CONTACT_OBJ_BUSINESS_WEB_ADDRESS: Pcwstr = w("BusinessWebAddress")

public val NAME_CONTACT_OBJ_CHILDREN: Pcwstr = w("Children")

public val NAME_CONTACT_OBJ_EMAIL: Pcwstr = w("Email")

public val NAME_CONTACT_OBJ_FAMILY_NAME: Pcwstr = w("FamilyName")

public val NAME_CONTACT_OBJ_FAX: Pcwstr = w("Fax")

public val NAME_CONTACT_OBJ_GIVEN_NAME: Pcwstr = w("GivenName")

public val NAME_CONTACT_OBJ_IM_ADDRESS: Pcwstr = w("IMAddress")

public val NAME_CONTACT_OBJ_IM_ADDRESS2: Pcwstr = w("IMAddress2")

public val NAME_CONTACT_OBJ_IM_ADDRESS3: Pcwstr = w("IMAddress3")

public val NAME_CONTACT_OBJ_MIDDLE_NAMES: Pcwstr = w("MiddleNames")

public val NAME_CONTACT_OBJ_MOBILE_PHONE: Pcwstr = w("MobilePhone")

public val NAME_CONTACT_OBJ_MOBILE_PHONE2: Pcwstr = w("MobilePhone2")

public val NAME_CONTACT_OBJ_ORGANIZATION: Pcwstr = w("Organization")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_CITY: Pcwstr = w("OtherAddressCity")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_COUNTRY: Pcwstr = w("OtherAddressCountry")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_FULL: Pcwstr = w("OtherAddressFull")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_LINE2: Pcwstr = w("OtherAddressLine2")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_POSTAL_CODE: Pcwstr = w("OtherAddressPostalCode")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_REGION: Pcwstr = w("OtherAddressRegion")

public val NAME_CONTACT_OBJ_OTHER_ADDRESS_STREET: Pcwstr = w("OtherAddressStreet")

public val NAME_CONTACT_OBJ_OTHER_EMAIL: Pcwstr = w("OtherEmail")

public val NAME_CONTACT_OBJ_OTHER_PHONE: Pcwstr = w("OtherPhone")

public val NAME_CONTACT_OBJ_PAGER: Pcwstr = w("Pager")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_CITY: Pcwstr = w("PersonalAddressCity")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_COUNTRY: Pcwstr = w("PersonalAddressCountry")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_FULL: Pcwstr = w("PersonalAddressFull")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_LINE2: Pcwstr = w("PersonalAddressLine2")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_POSTAL_CODE: Pcwstr = w("PersonalAddressPostalCode")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_REGION: Pcwstr = w("PersonalAddressRegion")

public val NAME_CONTACT_OBJ_PERSONAL_ADDRESS_STREET: Pcwstr = w("PersonalAddressStreet")

public val NAME_CONTACT_OBJ_PERSONAL_EMAIL: Pcwstr = w("PersonalEmail")

public val NAME_CONTACT_OBJ_PERSONAL_EMAIL2: Pcwstr = w("PersonalEmail2")

public val NAME_CONTACT_OBJ_PERSONAL_FAX: Pcwstr = w("PersonalFax")

public val NAME_CONTACT_OBJ_PERSONAL_PHONE: Pcwstr = w("PersonalPhone")

public val NAME_CONTACT_OBJ_PERSONAL_PHONE2: Pcwstr = w("PersonalPhone2")

public val NAME_CONTACT_OBJ_PERSONAL_WEB_ADDRESS: Pcwstr = w("PersonalWebAddress")

public val NAME_CONTACT_OBJ_PHONE: Pcwstr = w("Phone")

public val NAME_CONTACT_OBJ_PHONETIC_FAMILY_NAME: Pcwstr = w("PhoneticFamilyName")

public val NAME_CONTACT_OBJ_PHONETIC_GIVEN_NAME: Pcwstr = w("PhoneticGivenName")

public val NAME_CONTACT_OBJ_PHONETIC_ORGANIZATION: Pcwstr = w("PhoneticOrganization")

public val NAME_CONTACT_OBJ_RINGTONE: Pcwstr = w("Ringtone")

public val NAME_CONTACT_OBJ_ROLE: Pcwstr = w("Role")

public val NAME_CONTACT_OBJ_SPOUSE: Pcwstr = w("Spouse")

public val NAME_CONTACT_OBJ_SUFFIX: Pcwstr = w("Suffix")

public val NAME_CONTACT_OBJ_TITLE: Pcwstr = w("Title")

public val NAME_CONTACT_OBJ_WEB_ADDRESS: Pcwstr = w("WebAddress")

public val NAME_CONTACT_SVC_SYNC_WITH_PHONE_ONLY: Pcwstr = w("FilterType")

public val NAME_CONTACTS_SVC: Pcwstr = w("Contacts")

public val NAME_DPOF_DOCUMENT: Pcwstr = w("DPOFDocument")

public val NAME_DVBTS_FILE: Pcwstr = w("DVBTSFile")

public val NAME_DEVICE_EXECUTABLE: Pcwstr = w("DeviceExecutable")

public val NAME_DEVICE_METADATA_CAB: Pcwstr = w("DeviceMetadataCAB")

public val NAME_DEVICE_METADATA_OBJ_CONTENT_ID: Pcwstr = w("ContentID")

public val NAME_DEVICE_METADATA_OBJ_DEFAULT_CAB: Pcwstr = w("DefaultCAB")

public val NAME_DEVICE_METADATA_SVC: Pcwstr = w("Metadata")

public val NAME_DEVICE_SCRIPT: Pcwstr = w("DeviceScript")

public val NAME_EXIF_IMAGE: Pcwstr = w("EXIFImage")

public val NAME_EXCEL_DOCUMENT: Pcwstr = w("ExcelDocument")

public val NAME_FLAC_FILE: Pcwstr = w("FLACFile")

public val NAME_FIRMWARE_FILE: Pcwstr = w("FirmwareFile")

public val NAME_FLASH_PIX_IMAGE: Pcwstr = w("FlashPixImage")

public val NAME_FULL_ENUM_SYNC_KNOWLEDGE: Pcwstr = w("FullEnumSyncKnowledge")

public val NAME_FULL_ENUM_SYNC_SVC: Pcwstr = w("FullEnumSync")

public val NAME_FULL_ENUM_SYNC_SVC_BEGIN_SYNC: Pcwstr = w("BeginSync")

public val NAME_FULL_ENUM_SYNC_SVC_END_SYNC: Pcwstr = w("EndSync")

public val NAME_FULL_ENUM_SYNC_SVC_FILTER_TYPE: Pcwstr = w("FilterType")

public val NAME_FULL_ENUM_SYNC_SVC_KNOWLEDGE_OBJECT_ID: Pcwstr = w("FullEnumKnowledgeObjectID")

public val NAME_FULL_ENUM_SYNC_SVC_LAST_SYNC_PROXY_ID: Pcwstr = w("FullEnumLastSyncProxyID")

public val NAME_FULL_ENUM_SYNC_SVC_LOCAL_ONLY_DELETE: Pcwstr = w("LocalOnlyDelete")

public val NAME_FULL_ENUM_SYNC_SVC_PROVIDER_VERSION: Pcwstr = w("FullEnumProviderVersion")

public val NAME_FULL_ENUM_SYNC_SVC_REPLICA_ID: Pcwstr = w("FullEnumReplicaID")

public val NAME_FULL_ENUM_SYNC_SVC_SYNC_FORMAT: Pcwstr = w("SyncFormat")

public val NAME_FULL_ENUM_SYNC_SVC_VERSION_PROPS: Pcwstr = w("FullEnumVersionProps")

public val NAME_GIF_IMAGE: Pcwstr = w("GIFImage")

public val NAME_GENERIC_OBJ_ALLOWED_FOLDER_CONTENTS: Pcwstr = w("AllowedFolderContents")

public val NAME_GENERIC_OBJ_ASSOCIATION_DESC: Pcwstr = w("AssociationDesc")

public val NAME_GENERIC_OBJ_ASSOCIATION_TYPE: Pcwstr = w("AssociationType")

public val NAME_GENERIC_OBJ_COPYRIGHT: Pcwstr = w("Copyright")

public val NAME_GENERIC_OBJ_CORRUPT: Pcwstr = w("Corrupt")

public val NAME_GENERIC_OBJ_DRM_STATUS: Pcwstr = w("DRMStatus")

public val NAME_GENERIC_OBJ_DATE_ACCESSED: Pcwstr = w("DateAccessed")

public val NAME_GENERIC_OBJ_DATE_ADDED: Pcwstr = w("DateAdded")

public val NAME_GENERIC_OBJ_DATE_AUTHORED: Pcwstr = w("DateAuthored")

public val NAME_GENERIC_OBJ_DATE_CREATED: Pcwstr = w("DateCreated")

public val NAME_GENERIC_OBJ_DATE_MODIFIED: Pcwstr = w("DateModified")

public val NAME_GENERIC_OBJ_DATE_REVISED: Pcwstr = w("DateRevised")

public val NAME_GENERIC_OBJ_DESCRIPTION: Pcwstr = w("Description")

public val NAME_GENERIC_OBJ_HIDDEN: Pcwstr = w("Hidden")

public val NAME_GENERIC_OBJ_KEYWORDS: Pcwstr = w("Keywords")

public val NAME_GENERIC_OBJ_LANGUAGE_LOCALE: Pcwstr = w("LanguageLocale")

public val NAME_GENERIC_OBJ_NAME: Pcwstr = w("Name")

public val NAME_GENERIC_OBJ_NON_CONSUMABLE: Pcwstr = w("NonConsumable")

public val NAME_GENERIC_OBJ_OBJECT_FILE_NAME: Pcwstr = w("ObjectFileName")

public val NAME_GENERIC_OBJ_OBJECT_FORMAT: Pcwstr = w("ObjectFormat")

public val NAME_GENERIC_OBJ_OBJECT_ID: Pcwstr = w("ObjectID")

public val NAME_GENERIC_OBJ_OBJECT_SIZE: Pcwstr = w("ObjectSize")

public val NAME_GENERIC_OBJ_PARENT_ID: Pcwstr = w("ParentID")

public val NAME_GENERIC_OBJ_PERSISTENT_UID: Pcwstr = w("PersistentUID")

public val NAME_GENERIC_OBJ_PROPERTY_BAG: Pcwstr = w("PropertyBag")

public val NAME_GENERIC_OBJ_PROTECTION_STATUS: Pcwstr = w("ProtectionStatus")

public val NAME_GENERIC_OBJ_REFERENCE_PARENT_ID: Pcwstr = w("ReferenceParentID")

public val NAME_GENERIC_OBJ_STORAGE_ID: Pcwstr = w("StorageID")

public val NAME_GENERIC_OBJ_SUB_DESCRIPTION: Pcwstr = w("SubDescription")

public val NAME_GENERIC_OBJ_SYNC_ID: Pcwstr = w("SyncID")

public val NAME_GENERIC_OBJ_SYSTEM_OBJECT: Pcwstr = w("SystemObject")

public val NAME_GENERIC_OBJ_TIME_TO_LIVE: Pcwstr = w("TimeToLive")

public val NAME_HD_PHOTO_IMAGE: Pcwstr = w("HDPhotoImage")

public val NAME_HTML_DOCUMENT: Pcwstr = w("HTMLDocument")

public val NAME_HINTS_SVC: Pcwstr = w("Hints")

public val NAME_I_CALENDAR_ACTIVITY: Pcwstr = w("ICalendar")

public val NAME_IMAGE_OBJ_APERATURE: Pcwstr = w("Aperature")

public val NAME_IMAGE_OBJ_EXPOSURE: Pcwstr = w("Exposure")

public val NAME_IMAGE_OBJ_ISO_SPEED: Pcwstr = w("ISOSpeed")

public val NAME_IMAGE_OBJ_IMAGE_BIT_DEPTH: Pcwstr = w("ImageBitDepth")

public val NAME_IMAGE_OBJ_IS_COLOR_CORRECTED: Pcwstr = w("IsColorCorrected")

public val NAME_IMAGE_OBJ_IS_CROPPED: Pcwstr = w("IsCropped")

public val NAME_JFIF_IMAGE: Pcwstr = w("JFIFImage")

public val NAME_JP2IMAGE: Pcwstr = w("JP2Image")

public val NAME_JPEGXR_IMAGE: Pcwstr = w("JPEGXRImage")

public val NAME_JPX_IMAGE: Pcwstr = w("JPXImage")

public val NAME_M3U_PLAYLIST: Pcwstr = w("M3UPlaylist")

public val NAME_MHT_DOCUMENT: Pcwstr = w("MHTDocument")

public val NAME_MP3FILE: Pcwstr = w("MP3File")

public val NAME_MPEG2FILE: Pcwstr = w("MPEG2File")

public val NAME_MPEG4FILE: Pcwstr = w("MPEG4File")

public val NAME_MPEG_FILE: Pcwstr = w("MPEGFile")

public val NAME_MPL_PLAYLIST: Pcwstr = w("MPLPlaylist")

public val NAME_MEDIA_OBJ_ALBUM_ARTIST: Pcwstr = w("AlbumArtist")

public val NAME_MEDIA_OBJ_ALBUM_NAME: Pcwstr = w("AlbumName")

public val NAME_MEDIA_OBJ_ARTIST: Pcwstr = w("Artist")

public val NAME_MEDIA_OBJ_AUDIO_ENCODING_PROFILE: Pcwstr = w("AudioEncodingProfile")

public val NAME_MEDIA_OBJ_BIT_RATE_TYPE: Pcwstr = w("BitRateType")

public val NAME_MEDIA_OBJ_BOOKMARK_BYTE: Pcwstr = w("BookmarkByte")

public val NAME_MEDIA_OBJ_BOOKMARK_OBJECT: Pcwstr = w("BookmarkObject")

public val NAME_MEDIA_OBJ_BOOKMARK_TIME: Pcwstr = w("BookmarkTime")

public val NAME_MEDIA_OBJ_BUFFER_SIZE: Pcwstr = w("BufferSize")

public val NAME_MEDIA_OBJ_COMPOSER: Pcwstr = w("Composer")

public val NAME_MEDIA_OBJ_CREDITS: Pcwstr = w("Credits")

public val NAME_MEDIA_OBJ_DATE_ORIGINAL_RELEASE: Pcwstr = w("DateOriginalRelease")

public val NAME_MEDIA_OBJ_DURATION: Pcwstr = w("Duration")

public val NAME_MEDIA_OBJ_EDITOR: Pcwstr = w("Editor")

public val NAME_MEDIA_OBJ_EFFECTIVE_RATING: Pcwstr = w("EffectiveRating")

public val NAME_MEDIA_OBJ_ENCODING_PROFILE: Pcwstr = w("EncodingProfile")

public val NAME_MEDIA_OBJ_ENCODING_QUALITY: Pcwstr = w("EncodingQuality")

public val NAME_MEDIA_OBJ_GENRE: Pcwstr = w("Genre")

public val NAME_MEDIA_OBJ_GEOGRAPHIC_ORIGIN: Pcwstr = w("GeographicOrigin")

public val NAME_MEDIA_OBJ_HEIGHT: Pcwstr = w("Height")

public val NAME_MEDIA_OBJ_MEDIA_TYPE: Pcwstr = w("MediaType")

public val NAME_MEDIA_OBJ_MEDIA_UID: Pcwstr = w("MediaUID")

public val NAME_MEDIA_OBJ_MOOD: Pcwstr = w("Mood")

public val NAME_MEDIA_OBJ_OWNER: Pcwstr = w("Owner")

public val NAME_MEDIA_OBJ_PARENTAL_RATING: Pcwstr = w("ParentalRating")

public val NAME_MEDIA_OBJ_PRODUCER: Pcwstr = w("Producer")

public val NAME_MEDIA_OBJ_SAMPLE_RATE: Pcwstr = w("SampleRate")

public val NAME_MEDIA_OBJ_SKIP_COUNT: Pcwstr = w("SkipCount")

public val NAME_MEDIA_OBJ_SUBSCRIPTION_CONTENT_ID: Pcwstr = w("SubscriptionContentID")

public val NAME_MEDIA_OBJ_SUBTITLE: Pcwstr = w("Subtitle")

public val NAME_MEDIA_OBJ_TOTAL_BIT_RATE: Pcwstr = w("TotalBitRate")

public val NAME_MEDIA_OBJ_TRACK: Pcwstr = w("Track")

public val NAME_MEDIA_OBJ_URL_LINK: Pcwstr = w("URLLink")

public val NAME_MEDIA_OBJ_URL_SOURCE: Pcwstr = w("URLSource")

public val NAME_MEDIA_OBJ_USE_COUNT: Pcwstr = w("UseCount")

public val NAME_MEDIA_OBJ_USER_RATING: Pcwstr = w("UserRating")

public val NAME_MEDIA_OBJ_WEB_MASTER: Pcwstr = w("WebMaster")

public val NAME_MEDIA_OBJ_WIDTH: Pcwstr = w("Width")

public val NAME_MESSAGE_OBJ_BCC: Pcwstr = w("BCC")

public val NAME_MESSAGE_OBJ_BODY: Pcwstr = w("Body")

public val NAME_MESSAGE_OBJ_CC: Pcwstr = w("CC")

public val NAME_MESSAGE_OBJ_CATEGORY: Pcwstr = w("Category")

public val NAME_MESSAGE_OBJ_PATTERN_DAY_OF_MONTH: Pcwstr = w("PatternDayOfMonth")

public val NAME_MESSAGE_OBJ_PATTERN_DAY_OF_WEEK: Pcwstr = w("PatternDayOfWeek")

public val NAME_MESSAGE_OBJ_PATTERN_DELETE_DATES: Pcwstr = w("PatternDeleteDates")

public val NAME_MESSAGE_OBJ_PATTERN_INSTANCE: Pcwstr = w("PatternInstance")

public val NAME_MESSAGE_OBJ_PATTERN_MONTH_OF_YEAR: Pcwstr = w("PatternMonthOfYear")

public val NAME_MESSAGE_OBJ_PATTERN_ORIGINAL_DATE_TIME: Pcwstr = w("PatternOriginalDateTime")

public val NAME_MESSAGE_OBJ_PATTERN_PERIOD: Pcwstr = w("PatternPeriod")

public val NAME_MESSAGE_OBJ_PATTERN_TYPE: Pcwstr = w("PatternType")

public val NAME_MESSAGE_OBJ_PATTERN_VALID_END_DATE: Pcwstr = w("PatternValidEndDate")

public val NAME_MESSAGE_OBJ_PATTERN_VALID_START_DATE: Pcwstr = w("PatternValidStartDate")

public val NAME_MESSAGE_OBJ_PRIORITY: Pcwstr = w("Priority")

public val NAME_MESSAGE_OBJ_READ: Pcwstr = w("Read")

public val NAME_MESSAGE_OBJ_RECEIVED_TIME: Pcwstr = w("ReceivedTime")

public val NAME_MESSAGE_OBJ_SENDER: Pcwstr = w("Sender")

public val NAME_MESSAGE_OBJ_SUBJECT: Pcwstr = w("Subject")

public val NAME_MESSAGE_OBJ_TO: Pcwstr = w("To")

public val NAME_MESSAGE_SVC: Pcwstr = w("Message")

public val NAME_NOTES_SVC: Pcwstr = w("Notes")

public val NAME_OGG_FILE: Pcwstr = w("OGGFile")

public val NAME_PCD_IMAGE: Pcwstr = w("PCDImage")

public val NAME_PICT_IMAGE: Pcwstr = w("PICTImage")

public val NAME_PNG_IMAGE: Pcwstr = w("PNGImage")

public val NAME_PSL_PLAYLIST: Pcwstr = w("PSLPlaylist")

public val NAME_POWER_POINT_DOCUMENT: Pcwstr = w("PowerPointDocument")

public val NAME_QCELP_FILE: Pcwstr = w("QCELPFile")

public val NAME_RINGTONES_SVC: Pcwstr = w("Ringtones")

public val NAME_RINGTONES_SVC_DEFAULT_RINGTONE: Pcwstr = w("DefaultRingtone")

public val NAME_SERVICES_SERVICE_DISPLAY_NAME: Pcwstr = w("ServiceDisplayName")

public val NAME_SERVICES_SERVICE_ICON: Pcwstr = w("ServiceIcon")

public val NAME_SERVICES_SERVICE_LOCALE: Pcwstr = w("ServiceLocale")

public val NAME_STATUS_SVC: Pcwstr = w("Status")

public val NAME_STATUS_SVC_BATTERY_LIFE: Pcwstr = w("BatteryLife")

public val NAME_STATUS_SVC_CHARGING_STATE: Pcwstr = w("ChargingState")

public val NAME_STATUS_SVC_MISSED_CALLS: Pcwstr = w("MissedCalls")

public val NAME_STATUS_SVC_NETWORK_NAME: Pcwstr = w("NetworkName")

public val NAME_STATUS_SVC_NETWORK_TYPE: Pcwstr = w("NetworkType")

public val NAME_STATUS_SVC_NEW_PICTURES: Pcwstr = w("NewPictures")

public val NAME_STATUS_SVC_ROAMING: Pcwstr = w("Roaming")

public val NAME_STATUS_SVC_SIGNAL_STRENGTH: Pcwstr = w("SignalStrength")

public val NAME_STATUS_SVC_STORAGE_CAPACITY: Pcwstr = w("StorageCapacity")

public val NAME_STATUS_SVC_STORAGE_FREE_SPACE: Pcwstr = w("StorageFreeSpace")

public val NAME_STATUS_SVC_TEXT_MESSAGES: Pcwstr = w("TextMessages")

public val NAME_STATUS_SVC_VOICE_MAIL: Pcwstr = w("VoiceMail")

public val NAME_SYNC_OBJ_LAST_AUTHOR_PROXY_ID: Pcwstr = w("LastAuthorProxyID")

public val NAME_SYNC_SVC_BEGIN_SYNC: Pcwstr = w("BeginSync")

public val NAME_SYNC_SVC_END_SYNC: Pcwstr = w("EndSync")

public val NAME_SYNC_SVC_FILTER_TYPE: Pcwstr = w("FilterType")

public val NAME_SYNC_SVC_LOCAL_ONLY_DELETE: Pcwstr = w("LocalOnlyDelete")

public val NAME_SYNC_SVC_SYNC_FORMAT: Pcwstr = w("SyncFormat")

public val NAME_SYNC_SVC_SYNC_OBJECT_REFERENCES: Pcwstr = w("SyncObjectReferences")

public val NAME_TIFFEP_IMAGE: Pcwstr = w("TIFFEPImage")

public val NAME_TIFFIT_IMAGE: Pcwstr = w("TIFFITImage")

public val NAME_TIFF_IMAGE: Pcwstr = w("TIFFImage")

public val NAME_TASK_OBJ_BEGIN_DATE: Pcwstr = w("BeginDate")

public val NAME_TASK_OBJ_COMPLETE: Pcwstr = w("Complete")

public val NAME_TASK_OBJ_END_DATE: Pcwstr = w("EndDate")

public val NAME_TASK_OBJ_REMINDER_DATE_TIME: Pcwstr = w("ReminderDateTime")

public val NAME_TASKS_SVC: Pcwstr = w("Tasks")

public val NAME_TASKS_SVC_SYNC_ACTIVE_ONLY: Pcwstr = w("FilterType")

public val NAME_TEXT_DOCUMENT: Pcwstr = w("TextDocument")

public val NAME_UNDEFINED: Pcwstr = w("Undefined")

public val NAME_UNDEFINED_AUDIO: Pcwstr = w("UndefinedAudio")

public val NAME_UNDEFINED_COLLECTION: Pcwstr = w("UndefinedCollection")

public val NAME_UNDEFINED_DOCUMENT: Pcwstr = w("UndefinedDocument")

public val NAME_UNDEFINED_VIDEO: Pcwstr = w("UndefinedVideo")

public val NAME_UNKNOWN_IMAGE: Pcwstr = w("UnknownImage")

public val NAME_V_CALENDAR1ACTIVITY: Pcwstr = w("VCalendar1")

public val NAME_V_CARD2CONTACT: Pcwstr = w("VCard2Contact")

public val NAME_V_CARD3CONTACT: Pcwstr = w("VCard3Contact")

public val NAME_VIDEO_OBJ_KEY_FRAME_DISTANCE: Pcwstr = w("KeyFrameDistance")

public val NAME_VIDEO_OBJ_SCAN_TYPE: Pcwstr = w("ScanType")

public val NAME_VIDEO_OBJ_SOURCE: Pcwstr = w("Source")

public val NAME_VIDEO_OBJ_VIDEO_BIT_RATE: Pcwstr = w("VideoBitRate")

public val NAME_VIDEO_OBJ_VIDEO_FORMAT_CODE: Pcwstr = w("VideoFormatCode")

public val NAME_VIDEO_OBJ_VIDEO_FRAME_RATE: Pcwstr = w("VideoFrameRate")

public val NAME_WAV_FILE: Pcwstr = w("WAVFile")

public val NAME_WBMP_IMAGE: Pcwstr = w("WBMPImage")

public val NAME_WMA_FILE: Pcwstr = w("WMAFile")

public val NAME_WMV_FILE: Pcwstr = w("WMVFile")

public val NAME_WPL_PLAYLIST: Pcwstr = w("WPLPlaylist")

public val NAME_WORD_DOCUMENT: Pcwstr = w("WordDocument")

public val NAME_XML_DOCUMENT: Pcwstr = w("XMLDocument")

public val PORTABLE_DEVICE_DELETE_NO_RECURSION: DeleteObjectOptions = 0

public val PORTABLE_DEVICE_DELETE_WITH_RECURSION: DeleteObjectOptions = 1

public val PORTABLE_DEVICE_DRM_SCHEME_PDDRM: Pcwstr = w("PDDRM")

public val PORTABLE_DEVICE_DRM_SCHEME_WMDRM10_PD: Pcwstr = w("WMDRM10-PD")

public val PORTABLE_DEVICE_ICON: Pcwstr = w("Icons")

public val PORTABLE_DEVICE_IS_MASS_STORAGE: Pcwstr = w("PortableDeviceIsMassStorage")

public val PORTABLE_DEVICE_NAMESPACE_EXCLUDE_FROM_SHELL: Pcwstr = w("PortableDeviceNameSpaceExcludeFromShell")

public val PORTABLE_DEVICE_NAMESPACE_THUMBNAIL_CONTENT_TYPES: Pcwstr = w("PortableDeviceNameSpaceThumbnailContentTypes")

public val PORTABLE_DEVICE_NAMESPACE_TIMEOUT: Pcwstr = w("PortableDeviceNameSpaceTimeout")

public val PORTABLE_DEVICE_TYPE: Pcwstr = w("PortableDeviceType")

public val PORTABLE_DEVICE: Guid = Guid.fromU128(U128(0x728a21c53d9e48d7uL, 0x9810864848f0f404uL))

public val PORTABLE_DEVICE_DISPATCH_FACTORY: Guid = Guid.fromU128(U128(0x4323223383384658uL, 0xae010b4ae830b6b0uL))

public val PORTABLE_DEVICE_FTM: Guid = Guid.fromU128(U128(0xf7c0039a4762488auL, 0xb4b3760ef9a1ba9buL))

public val PORTABLE_DEVICE_KEY_COLLECTION: Guid = Guid.fromU128(U128(0xde2d022d248043beuL, 0x97f0d1fa2cf98f4fuL))

public val PORTABLE_DEVICE_MANAGER: Guid = Guid.fromU128(U128(0xaf10cec2ecd4b92uL, 0x958134f6ae0637f3uL))

public val PORTABLE_DEVICE_PROP_VARIANT_COLLECTION: Guid = Guid.fromU128(U128(0x8a99e2f6d6d4b80uL, 0xaf5abaf2bcbe4cb9uL))

public val PORTABLE_DEVICE_SERVICE: Guid = Guid.fromU128(U128(0xef5db4c29312422cuL, 0x9152411cd9c4dd84uL))

public val PORTABLE_DEVICE_SERVICE_FTM: Guid = Guid.fromU128(U128(0x1649b154c794497auL, 0x9b03f3f0121302f3uL))

public val PORTABLE_DEVICE_VALUES: Guid = Guid.fromU128(U128(0xc15d503d01747ceuL, 0x90167b3f978721ccuL))

public val PORTABLE_DEVICE_VALUES_COLLECTION: Guid = Guid.fromU128(U128(0x3882134d14cf4220uL, 0x9cb4435f86d83f60uL))

public val PORTABLE_DEVICE_WEB_CONTROL: Guid = Guid.fromU128(U128(0x186dd02c2dec41b5uL, 0xa7d4b59056fade51uL))

public val RANGEMAX_MESSAGE_OBJ_PATTERN_DAY_OF_MONTH: UInt = 31u

public val RANGEMAX_MESSAGE_OBJ_PATTERN_MONTH_OF_YEAR: UInt = 12u

public val RANGEMAX_STATUS_SVC_BATTERY_LIFE: UInt = 100u

public val RANGEMAX_STATUS_SVC_MISSED_CALLS: UInt = 255u

public val RANGEMAX_STATUS_SVC_NEW_PICTURES: UInt = 65535u

public val RANGEMAX_STATUS_SVC_SIGNAL_STRENGTH: UInt = 4u

public val RANGEMAX_STATUS_SVC_TEXT_MESSAGES: UInt = 255u

public val RANGEMAX_STATUS_SVC_VOICE_MAIL: UInt = 255u

public val RANGEMIN_MESSAGE_OBJ_PATTERN_DAY_OF_MONTH: UInt = 1u

public val RANGEMIN_MESSAGE_OBJ_PATTERN_MONTH_OF_YEAR: UInt = 1u

public val RANGEMIN_STATUS_SVC_BATTERY_LIFE: UInt = 0u

public val RANGEMIN_STATUS_SVC_SIGNAL_STRENGTH: UInt = 0u

public val RANGESTEP_MESSAGE_OBJ_PATTERN_DAY_OF_MONTH: UInt = 1u

public val RANGESTEP_MESSAGE_OBJ_PATTERN_MONTH_OF_YEAR: UInt = 1u

public val RANGESTEP_STATUS_SVC_BATTERY_LIFE: UInt = 1u

public val RANGESTEP_STATUS_SVC_SIGNAL_STRENGTH: UInt = 1u

public val SMS_BINARY_MESSAGE: SmsMessageTypes = 1

public val SMS_ENCODING_7_BIT: WpdSmsEncodingTypes = 0

public val SMS_ENCODING_8_BIT: WpdSmsEncodingTypes = 1

public val SMS_ENCODING_UTF_16: WpdSmsEncodingTypes = 2

public val SMS_TEXT_MESSAGE: SmsMessageTypes = 0

public val SRS_RADIO_DISABLED: SystemRadioState = 1

public val SRS_RADIO_ENABLED: SystemRadioState = 0

public val STR_WPDNSE_FAST_ENUM: Pcwstr = w("WPDNSE Fast Enum")

public val STR_WPDNSE_SIMPLE_ITEM: Pcwstr = w("WPDNSE SimpleItem")

public val SYNCSVC_FILTER_CALENDAR_WINDOW_WITH_RECURRENCE: UInt = 3u

public val SYNCSVC_FILTER_CONTACTS_WITH_PHONE: UInt = 1u

public val SYNCSVC_FILTER_NONE: UInt = 0u

public val SYNCSVC_FILTER_TASK_ACTIVE: UInt = 2u

public val TYPE_ANCHOR_SYNC_SVC: UInt = 1u

public val TYPE_CALENDAR_SVC: UInt = 0u

public val TYPE_CONTACTS_SVC: UInt = 0u

public val TYPE_DEVICE_METADATA_SVC: UInt = 0u

public val TYPE_FULL_ENUM_SYNC_SVC: UInt = 1u

public val TYPE_HINTS_SVC: UInt = 0u

public val TYPE_MESSAGE_SVC: UInt = 0u

public val TYPE_NOTES_SVC: UInt = 0u

public val TYPE_RINGTONES_SVC: UInt = 0u

public val TYPE_STATUS_SVC: UInt = 0u

public val TYPE_TASKS_SVC: UInt = 0u

public val WPDNSE_OBJECT_HAS_ALBUM_ART: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)), pid = 6u)

public val WPDNSE_OBJECT_HAS_AUDIO_CLIP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)), pid = 5u)

public val WPDNSE_OBJECT_HAS_CONTACT_PHOTO: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)), pid = 2u)

public val WPDNSE_OBJECT_HAS_ICON: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)), pid = 4u)

public val WPDNSE_OBJECT_HAS_THUMBNAIL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)), pid = 3u)

public val WPDNSE_OBJECT_OPTIMAL_READ_BLOCK_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL)), pid = 7u)

public val WPDNSE_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x34d714094b474d80uL, 0xaaac3a28a4a3b3e6uL))

public val WPDNSE_PROPSHEET_CONTENT_DETAILS: UInt = 32u

public val WPDNSE_PROPSHEET_CONTENT_GENERAL: UInt = 4u

public val WPDNSE_PROPSHEET_CONTENT_REFERENCES: UInt = 8u

public val WPDNSE_PROPSHEET_CONTENT_RESOURCES: UInt = 16u

public val WPDNSE_PROPSHEET_DEVICE_GENERAL: UInt = 1u

public val WPDNSE_PROPSHEET_STORAGE_GENERAL: UInt = 2u

public val WPD_API_OPTIONS_V1: Guid = Guid.fromU128(U128(0x10e54a3e052d4777uL, 0xa13cde7614be2bc4uL))

public val WPD_API_OPTION_IOCTL_ACCESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x10e54a3e052d4777uL, 0xa13cde7614be2bc4uL)), pid = 3u)

public val WPD_API_OPTION_USE_CLEAR_DATA_STREAM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x10e54a3e052d4777uL, 0xa13cde7614be2bc4uL)), pid = 2u)

public val WPD_APPOINTMENT_ACCEPTED_ATTENDEES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 10u)

public val WPD_APPOINTMENT_DECLINED_ATTENDEES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 13u)

public val WPD_APPOINTMENT_LOCATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 3u)

public val WPD_APPOINTMENT_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL))

public val WPD_APPOINTMENT_OPTIONAL_ATTENDEES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 9u)

public val WPD_APPOINTMENT_REQUIRED_ATTENDEES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 8u)

public val WPD_APPOINTMENT_RESOURCES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 11u)

public val WPD_APPOINTMENT_TENTATIVE_ATTENDEES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 12u)

public val WPD_APPOINTMENT_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf99efd03431d40d8uL, 0xa1c94e220d9c88d3uL)), pid = 7u)

public val WPD_AUDIO_BITRATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 9u)

public val WPD_AUDIO_BIT_DEPTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 12u)

public val WPD_AUDIO_BLOCK_ALIGNMENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 13u)

public val WPD_AUDIO_CHANNEL_COUNT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 10u)

public val WPD_AUDIO_FORMAT_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 11u)

public val WPD_BITRATE_TYPE_DISCRETE: WpdBitrateTypes = 1

public val WPD_BITRATE_TYPE_FREE: WpdBitrateTypes = 3

public val WPD_BITRATE_TYPE_UNUSED: WpdBitrateTypes = 0

public val WPD_BITRATE_TYPE_VARIABLE: WpdBitrateTypes = 2

public val WPD_CAPTURE_MODE_BURST: WpdCaptureModes = 2

public val WPD_CAPTURE_MODE_NORMAL: WpdCaptureModes = 1

public val WPD_CAPTURE_MODE_TIMELAPSE: WpdCaptureModes = 3

public val WPD_CAPTURE_MODE_UNDEFINED: WpdCaptureModes = 0

public val WPD_CATEGORY_CAPABILITIES: Guid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL))

public val WPD_CATEGORY_COMMON: Guid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL))

public val WPD_CATEGORY_DEVICE_HINTS: Guid = Guid.fromU128(U128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL))

public val WPD_CATEGORY_MEDIA_CAPTURE: Guid = Guid.fromU128(U128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL))

public val WPD_CATEGORY_MTP_EXT_VENDOR_OPERATIONS: Guid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL))

public val WPD_CATEGORY_NETWORK_CONFIGURATION: Guid = Guid.fromU128(U128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL))

public val WPD_CATEGORY_NULL: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))

public val WPD_CATEGORY_OBJECT_ENUMERATION: Guid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL))

public val WPD_CATEGORY_OBJECT_MANAGEMENT: Guid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL))

public val WPD_CATEGORY_OBJECT_PROPERTIES: Guid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL))

public val WPD_CATEGORY_OBJECT_PROPERTIES_BULK: Guid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL))

public val WPD_CATEGORY_OBJECT_RESOURCES: Guid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL))

public val WPD_CATEGORY_SERVICE_CAPABILITIES: Guid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL))

public val WPD_CATEGORY_SERVICE_COMMON: Guid = Guid.fromU128(U128(0x322f071d36ef477fuL, 0xb4b56f52d734baeeuL))

public val WPD_CATEGORY_SERVICE_METHODS: Guid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL))

public val WPD_CATEGORY_SMS: Guid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL))

public val WPD_CATEGORY_STILL_IMAGE_CAPTURE: Guid = Guid.fromU128(U128(0x4fcd698222a24b05uL, 0xa48b62d38bf27b32uL))

public val WPD_CATEGORY_STORAGE: Guid = Guid.fromU128(U128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL))

public val WPD_CLASS_EXTENSION_OPTIONS_DEVICE_IDENTIFICATION_VALUES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL)), pid = 3u)

public val WPD_CLASS_EXTENSION_OPTIONS_DONT_REGISTER_WPD_DEVICE_INTERFACE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL)), pid = 3u)

public val WPD_CLASS_EXTENSION_OPTIONS_MULTITRANSPORT_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL)), pid = 2u)

public val WPD_CLASS_EXTENSION_OPTIONS_REGISTER_WPD_PRIVATE_DEVICE_INTERFACE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL)), pid = 4u)

public val WPD_CLASS_EXTENSION_OPTIONS_SILENCE_AUTOPLAY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x65c160f813674ce2uL, 0x939d8310839f0d30uL)), pid = 2u)

public val WPD_CLASS_EXTENSION_OPTIONS_SUPPORTED_CONTENT_TYPES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL)), pid = 2u)

public val WPD_CLASS_EXTENSION_OPTIONS_TRANSPORT_BANDWIDTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL)), pid = 4u)

public val WPD_CLASS_EXTENSION_OPTIONS_V1: Guid = Guid.fromU128(U128(0x6309ffefa87c4ca7uL, 0x8434797576e40a96uL))

public val WPD_CLASS_EXTENSION_OPTIONS_V2: Guid = Guid.fromU128(U128(0x3e3595da4d7149feuL, 0xa0b4d4406c3ae93fuL))

public val WPD_CLASS_EXTENSION_OPTIONS_V3: Guid = Guid.fromU128(U128(0x65c160f813674ce2uL, 0x939d8310839f0d30uL))

public val WPD_CLASS_EXTENSION_V1: Guid = Guid.fromU128(U128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL))

public val WPD_CLASS_EXTENSION_V2: Guid = Guid.fromU128(U128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL))

public val WPD_CLIENT_DESIRED_ACCESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 9u)

public val WPD_CLIENT_EVENT_COOKIE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 11u)

public val WPD_CLIENT_INFORMATION_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL))

public val WPD_CLIENT_MAJOR_VERSION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 3u)

public val WPD_CLIENT_MANUAL_CLOSE_ON_DISCONNECT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 13u)

public val WPD_CLIENT_MINIMUM_RESULTS_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 12u)

public val WPD_CLIENT_MINOR_VERSION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 4u)

public val WPD_CLIENT_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 2u)

public val WPD_CLIENT_REVISION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 5u)

public val WPD_CLIENT_SECURITY_QUALITY_OF_SERVICE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 8u)

public val WPD_CLIENT_SHARE_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 10u)

public val WPD_CLIENT_WMDRM_APPLICATION_CERTIFICATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 7u)

public val WPD_CLIENT_WMDRM_APPLICATION_PRIVATE_KEY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x204d9f0c22924080uL, 0x9f4240664e70f859uL)), pid = 6u)

public val WPD_COLOR_CORRECTED_STATUS_CORRECTED: WpdColorCorrectedStatusValues = 1

public val WPD_COLOR_CORRECTED_STATUS_NOT_CORRECTED: WpdColorCorrectedStatusValues = 0

public val WPD_COLOR_CORRECTED_STATUS_SHOULD_NOT_BE_CORRECTED: WpdColorCorrectedStatusValues = 2

public val WPD_COMMAND_ACCESS_FROM_ATTRIBUTE_WITH_METHOD_ACCESS: WpdCommandAccessTypes = 16

public val WPD_COMMAND_ACCESS_FROM_PROPERTY_WITH_FILE_ACCESS: WpdCommandAccessTypes = 8

public val WPD_COMMAND_ACCESS_FROM_PROPERTY_WITH_STGM_ACCESS: WpdCommandAccessTypes = 4

public val WPD_COMMAND_ACCESS_READ: WpdCommandAccessTypes = 1

public val WPD_COMMAND_ACCESS_READWRITE: WpdCommandAccessTypes = 3

public val WPD_COMMAND_CAPABILITIES_GET_COMMAND_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 3u)

public val WPD_COMMAND_CAPABILITIES_GET_EVENT_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 11u)

public val WPD_COMMAND_CAPABILITIES_GET_FIXED_PROPERTY_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 9u)

public val WPD_COMMAND_CAPABILITIES_GET_FUNCTIONAL_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 5u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_COMMANDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 2u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_CONTENT_TYPES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 6u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_EVENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 10u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FORMATS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 7u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FORMAT_PROPERTIES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 8u)

public val WPD_COMMAND_CAPABILITIES_GET_SUPPORTED_FUNCTIONAL_CATEGORIES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 4u)

public val WPD_COMMAND_CLASS_EXTENSION_REGISTER_SERVICE_INTERFACES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL)), pid = 2u)

public val WPD_COMMAND_CLASS_EXTENSION_UNREGISTER_SERVICE_INTERFACES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL)), pid = 3u)

public val WPD_COMMAND_CLASS_EXTENSION_WRITE_DEVICE_INFORMATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL)), pid = 2u)

public val WPD_COMMAND_COMMIT_KEYPAIR: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL)), pid = 3u)

public val WPD_COMMAND_COMMON_GET_OBJECT_IDS_FROM_PERSISTENT_UNIQUE_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 3u)

public val WPD_COMMAND_COMMON_RESET_DEVICE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 2u)

public val WPD_COMMAND_COMMON_SAVE_CLIENT_INFORMATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 4u)

public val WPD_COMMAND_DEVICE_HINTS_GET_CONTENT_LOCATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL)), pid = 2u)

public val WPD_COMMAND_GENERATE_KEYPAIR: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL)), pid = 2u)

public val WPD_COMMAND_MEDIA_CAPTURE_PAUSE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL)), pid = 4u)

public val WPD_COMMAND_MEDIA_CAPTURE_START: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL)), pid = 2u)

public val WPD_COMMAND_MEDIA_CAPTURE_STOP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x59b433bafe444d8duL, 0x808c6bcb9b0f15e8uL)), pid = 3u)

public val WPD_COMMAND_MTP_EXT_END_DATA_TRANSFER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 17u)

public val WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITHOUT_DATA_PHASE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 12u)

public val WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITH_DATA_TO_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 13u)

public val WPD_COMMAND_MTP_EXT_EXECUTE_COMMAND_WITH_DATA_TO_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 14u)

public val WPD_COMMAND_MTP_EXT_GET_SUPPORTED_VENDOR_OPCODES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 11u)

public val WPD_COMMAND_MTP_EXT_GET_VENDOR_EXTENSION_DESCRIPTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 18u)

public val WPD_COMMAND_MTP_EXT_READ_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 15u)

public val WPD_COMMAND_MTP_EXT_WRITE_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 16u)

public val WPD_COMMAND_OBJECT_ENUMERATION_END_FIND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 4u)

public val WPD_COMMAND_OBJECT_ENUMERATION_FIND_NEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 3u)

public val WPD_COMMAND_OBJECT_ENUMERATION_START_FIND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 2u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_COMMIT_OBJECT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 5u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_COPY_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 9u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_CREATE_OBJECT_WITH_PROPERTIES_AND_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 3u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_CREATE_OBJECT_WITH_PROPERTIES_ONLY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 2u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_DELETE_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 7u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_MOVE_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 8u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_REVERT_OBJECT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 6u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_UPDATE_OBJECT_WITH_PROPERTIES_AND_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 10u)

public val WPD_COMMAND_OBJECT_MANAGEMENT_WRITE_OBJECT_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 4u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_END: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 7u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_NEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 6u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_FORMAT_START: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 5u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_END: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 4u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_NEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 3u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_GET_VALUES_BY_OBJECT_LIST_START: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 2u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_END: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 10u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_NEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 9u)

public val WPD_COMMAND_OBJECT_PROPERTIES_BULK_SET_VALUES_BY_OBJECT_LIST_START: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 8u)

public val WPD_COMMAND_OBJECT_PROPERTIES_DELETE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 7u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 4u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET_ALL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 6u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 3u)

public val WPD_COMMAND_OBJECT_PROPERTIES_GET_SUPPORTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 2u)

public val WPD_COMMAND_OBJECT_PROPERTIES_SET: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 5u)

public val WPD_COMMAND_OBJECT_RESOURCES_CLOSE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 7u)

public val WPD_COMMAND_OBJECT_RESOURCES_COMMIT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 12u)

public val WPD_COMMAND_OBJECT_RESOURCES_CREATE_RESOURCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 9u)

public val WPD_COMMAND_OBJECT_RESOURCES_DELETE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 8u)

public val WPD_COMMAND_OBJECT_RESOURCES_GET_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 3u)

public val WPD_COMMAND_OBJECT_RESOURCES_GET_SUPPORTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 2u)

public val WPD_COMMAND_OBJECT_RESOURCES_OPEN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 4u)

public val WPD_COMMAND_OBJECT_RESOURCES_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 5u)

public val WPD_COMMAND_OBJECT_RESOURCES_REVERT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 10u)

public val WPD_COMMAND_OBJECT_RESOURCES_SEEK: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 11u)

public val WPD_COMMAND_OBJECT_RESOURCES_SEEK_IN_UNITS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 13u)

public val WPD_COMMAND_OBJECT_RESOURCES_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 6u)

public val WPD_COMMAND_PROCESS_WIRELESS_PROFILE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL)), pid = 4u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_COMMAND_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 16u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_EVENT_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 11u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_EVENT_PARAMETER_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 12u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 7u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_PROPERTY_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 9u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_FORMAT_RENDERING_PROFILES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 14u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_INHERITED_SERVICES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 13u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_METHOD_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 4u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_METHOD_PARAMETER_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 5u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_COMMANDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 15u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_EVENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 10u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_FORMATS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 6u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_FORMAT_PROPERTIES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 8u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_METHODS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 2u)

public val WPD_COMMAND_SERVICE_CAPABILITIES_GET_SUPPORTED_METHODS_BY_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 3u)

public val WPD_COMMAND_SERVICE_COMMON_GET_SERVICE_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x322f071d36ef477fuL, 0xb4b56f52d734baeeuL)), pid = 2u)

public val WPD_COMMAND_SERVICE_METHODS_CANCEL_INVOKE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 3u)

public val WPD_COMMAND_SERVICE_METHODS_END_INVOKE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 4u)

public val WPD_COMMAND_SERVICE_METHODS_START_INVOKE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 2u)

public val WPD_COMMAND_SMS_SEND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)), pid = 2u)

public val WPD_COMMAND_STILL_IMAGE_CAPTURE_INITIATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4fcd698222a24b05uL, 0xa48b62d38bf27b32uL)), pid = 2u)

public val WPD_COMMAND_STORAGE_EJECT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL)), pid = 4u)

public val WPD_COMMAND_STORAGE_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL)), pid = 2u)

public val WPD_COMMON_INFORMATION_BODY_TEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)), pid = 3u)

public val WPD_COMMON_INFORMATION_END_DATETIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)), pid = 6u)

public val WPD_COMMON_INFORMATION_NOTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)), pid = 7u)

public val WPD_COMMON_INFORMATION_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL))

public val WPD_COMMON_INFORMATION_PRIORITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)), pid = 4u)

public val WPD_COMMON_INFORMATION_START_DATETIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)), pid = 5u)

public val WPD_COMMON_INFORMATION_SUBJECT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb28ae94b05a44e8euL, 0xbe0172cc7e099d8fuL)), pid = 2u)

public val WPD_CONTACT_ANNIVERSARY_DATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 62u)

public val WPD_CONTACT_ASSISTANT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 61u)

public val WPD_CONTACT_BIRTHDATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 57u)

public val WPD_CONTACT_BUSINESS_EMAIL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 34u)

public val WPD_CONTACT_BUSINESS_EMAIL2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 35u)

public val WPD_CONTACT_BUSINESS_FAX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 45u)

public val WPD_CONTACT_BUSINESS_FULL_POSTAL_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 17u)

public val WPD_CONTACT_BUSINESS_PHONE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 40u)

public val WPD_CONTACT_BUSINESS_PHONE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 41u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_CITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 20u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_COUNTRY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 23u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_LINE1: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 18u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_LINE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 19u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_POSTAL_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 22u)

public val WPD_CONTACT_BUSINESS_POSTAL_ADDRESS_REGION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 21u)

public val WPD_CONTACT_BUSINESS_WEB_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 50u)

public val WPD_CONTACT_CHILDREN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 60u)

public val WPD_CONTACT_COMPANY_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 54u)

public val WPD_CONTACT_DISPLAY_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 2u)

public val WPD_CONTACT_FIRST_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 3u)

public val WPD_CONTACT_INSTANT_MESSENGER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 51u)

public val WPD_CONTACT_INSTANT_MESSENGER2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 52u)

public val WPD_CONTACT_INSTANT_MESSENGER3: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 53u)

public val WPD_CONTACT_LAST_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 5u)

public val WPD_CONTACT_MIDDLE_NAMES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 4u)

public val WPD_CONTACT_MOBILE_PHONE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 42u)

public val WPD_CONTACT_MOBILE_PHONE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 43u)

public val WPD_CONTACT_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL))

public val WPD_CONTACT_OTHER_EMAILS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 36u)

public val WPD_CONTACT_OTHER_FULL_POSTAL_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 24u)

public val WPD_CONTACT_OTHER_PHONES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 47u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_CITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 27u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_LINE1: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 25u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_LINE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 26u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_POSTAL_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 29u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_POSTAL_COUNTRY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 30u)

public val WPD_CONTACT_OTHER_POSTAL_ADDRESS_REGION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 28u)

public val WPD_CONTACT_PAGER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 46u)

public val WPD_CONTACT_PERSONAL_EMAIL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 32u)

public val WPD_CONTACT_PERSONAL_EMAIL2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 33u)

public val WPD_CONTACT_PERSONAL_FAX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 44u)

public val WPD_CONTACT_PERSONAL_FULL_POSTAL_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 10u)

public val WPD_CONTACT_PERSONAL_PHONE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 38u)

public val WPD_CONTACT_PERSONAL_PHONE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 39u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_CITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 13u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_COUNTRY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 16u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_LINE1: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 11u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_LINE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 12u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_POSTAL_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 15u)

public val WPD_CONTACT_PERSONAL_POSTAL_ADDRESS_REGION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 14u)

public val WPD_CONTACT_PERSONAL_WEB_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 49u)

public val WPD_CONTACT_PHONETIC_COMPANY_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 55u)

public val WPD_CONTACT_PHONETIC_FIRST_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 8u)

public val WPD_CONTACT_PHONETIC_LAST_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 9u)

public val WPD_CONTACT_PREFIX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 6u)

public val WPD_CONTACT_PRIMARY_EMAIL_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 31u)

public val WPD_CONTACT_PRIMARY_FAX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 58u)

public val WPD_CONTACT_PRIMARY_PHONE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 37u)

public val WPD_CONTACT_PRIMARY_WEB_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 48u)

public val WPD_CONTACT_RINGTONE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 63u)

public val WPD_CONTACT_ROLE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 56u)

public val WPD_CONTACT_SPOUSE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 59u)

public val WPD_CONTACT_SUFFIX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xfbd4fdab987d4777uL, 0xb3f9726185a9312buL)), pid = 7u)

public val WPD_CONTENT_TYPE_ALL: Guid = Guid.fromU128(U128(0x80e170d210554a3euL, 0xb95282cc4f8a8689uL))

public val WPD_CONTENT_TYPE_APPOINTMENT: Guid = Guid.fromU128(U128(0xfed060e87934b1euL, 0x90c948ac389ac631uL))

public val WPD_CONTENT_TYPE_AUDIO: Guid = Guid.fromU128(U128(0x4ad2c85e5e2d45e5uL, 0x88644f229e3c6cf0uL))

public val WPD_CONTENT_TYPE_AUDIO_ALBUM: Guid = Guid.fromU128(U128(0xaa18737e500948fauL, 0xae2185f24383b4e6uL))

public val WPD_CONTENT_TYPE_CALENDAR: Guid = Guid.fromU128(U128(0xa1fd5967602349a0uL, 0x9df1f8060be751b0uL))

public val WPD_CONTENT_TYPE_CERTIFICATE: Guid = Guid.fromU128(U128(0xdc3876e8a9484060uL, 0x9050cbd77e8a3d87uL))

public val WPD_CONTENT_TYPE_CONTACT: Guid = Guid.fromU128(U128(0xeaba831345254707uL, 0x9f0e87c6808e9435uL))

public val WPD_CONTENT_TYPE_CONTACT_GROUP: Guid = Guid.fromU128(U128(0x346b89324c3640d8uL, 0x94151828291f9de9uL))

public val WPD_CONTENT_TYPE_DOCUMENT: Guid = Guid.fromU128(U128(0x680adf52950a4041uL, 0x9b4165e393648155uL))

public val WPD_CONTENT_TYPE_EMAIL: Guid = Guid.fromU128(U128(0x8038044a7e514f8fuL, 0x883d1d0623d14533uL))

public val WPD_CONTENT_TYPE_FOLDER: Guid = Guid.fromU128(U128(0x27e2e392a11148e0uL, 0xab0ce17705a05f85uL))

public val WPD_CONTENT_TYPE_FUNCTIONAL_OBJECT: Guid = Guid.fromU128(U128(0x99ed016017ff4c44uL, 0x9d981d7a6f941921uL))

public val WPD_CONTENT_TYPE_GENERIC_FILE: Guid = Guid.fromU128(U128(0x85e0a68d3445d7uL, 0xbc5c447e59c73d48uL))

public val WPD_CONTENT_TYPE_GENERIC_MESSAGE: Guid = Guid.fromU128(U128(0xe80eaaf8b2db4133uL, 0xb67e1bef4b4a6e5fuL))

public val WPD_CONTENT_TYPE_IMAGE: Guid = Guid.fromU128(U128(0xef2107d5a52a4243uL, 0xa26b62d4176d7603uL))

public val WPD_CONTENT_TYPE_IMAGE_ALBUM: Guid = Guid.fromU128(U128(0x7579314815f54a30uL, 0xa81354ed8a37e226uL))

public val WPD_CONTENT_TYPE_MEDIA_CAST: Guid = Guid.fromU128(U128(0x5e88b3cc3e654e62uL, 0xbfff229495253ab0uL))

public val WPD_CONTENT_TYPE_MEMO: Guid = Guid.fromU128(U128(0x9cd20ecf3b50414fuL, 0xa641e473ffe45751uL))

public val WPD_CONTENT_TYPE_MIXED_CONTENT_ALBUM: Guid = Guid.fromU128(U128(0xf0c3aca59349acuL, 0x921924abca5a2563uL))

public val WPD_CONTENT_TYPE_NETWORK_ASSOCIATION: Guid = Guid.fromU128(U128(0x31da7ee18c84205uL, 0x847e89a11261d0f3uL))

public val WPD_CONTENT_TYPE_PLAYLIST: Guid = Guid.fromU128(U128(0x1a33f7e4af1348f5uL, 0x994e77369dfe04a3uL))

public val WPD_CONTENT_TYPE_PROGRAM: Guid = Guid.fromU128(U128(0xd269f96a247c4bffuL, 0x98fb97f3c49220e6uL))

public val WPD_CONTENT_TYPE_SECTION: Guid = Guid.fromU128(U128(0x821089f51d914dc9uL, 0xbe3cbbb1b35b18ceuL))

public val WPD_CONTENT_TYPE_TASK: Guid = Guid.fromU128(U128(0x63252f2c887f4cb6uL, 0xb1acd29855dcef6cuL))

public val WPD_CONTENT_TYPE_TELEVISION: Guid = Guid.fromU128(U128(0x60a169cff2ae4e21uL, 0x93759677f11c1c6euL))

public val WPD_CONTENT_TYPE_UNSPECIFIED: Guid = Guid.fromU128(U128(0x28d8d31e249c454euL, 0xaabc34883168e634uL))

public val WPD_CONTENT_TYPE_VIDEO: Guid = Guid.fromU128(U128(0x9261b03c3d784519uL, 0x85e302c5e1f50bb9uL))

public val WPD_CONTENT_TYPE_VIDEO_ALBUM: Guid = Guid.fromU128(U128(0x12b0db7d4c145d6uL, 0xb08194b87779614fuL))

public val WPD_CONTENT_TYPE_WIRELESS_PROFILE: Guid = Guid.fromU128(U128(0xbac070a9f5f4da4uL, 0xa8f63de44d68fd6cuL))

public val WPD_CONTROL_FUNCTION_GENERIC_MESSAGE: UInt = 66u

public val WPD_CROPPED_STATUS_CROPPED: WpdCroppedStatusValues = 1

public val WPD_CROPPED_STATUS_NOT_CROPPED: WpdCroppedStatusValues = 0

public val WPD_CROPPED_STATUS_SHOULD_NOT_BE_CROPPED: WpdCroppedStatusValues = 2

public val WPD_DEVICE_DATETIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 11u)

public val WPD_DEVICE_EDP_IDENTITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x6c2b878cc2ec490duL, 0xb425d7a75e23e5eduL)), pid = 1u)

public val WPD_DEVICE_FIRMWARE_VERSION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 3u)

public val WPD_DEVICE_FRIENDLY_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 12u)

public val WPD_DEVICE_FUNCTIONAL_UNIQUE_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL)), pid = 2u)

public val WPD_DEVICE_MANUFACTURER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 7u)

public val WPD_DEVICE_MODEL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 8u)

public val WPD_DEVICE_MODEL_UNIQUE_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL)), pid = 3u)

public val WPD_DEVICE_NETWORK_IDENTIFIER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 16u)

public val WPD_DEVICE_OBJECT_ID: Pcwstr = w("DEVICE")

public val WPD_DEVICE_POWER_LEVEL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 4u)

public val WPD_DEVICE_POWER_SOURCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 5u)

public val WPD_DEVICE_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL))

public val WPD_DEVICE_PROPERTIES_V2: Guid = Guid.fromU128(U128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL))

public val WPD_DEVICE_PROPERTIES_V3: Guid = Guid.fromU128(U128(0x6c2b878cc2ec490duL, 0xb425d7a75e23e5eduL))

public val WPD_DEVICE_PROTOCOL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 6u)

public val WPD_DEVICE_SERIAL_NUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 9u)

public val WPD_DEVICE_SUPPORTED_DRM_SCHEMES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 13u)

public val WPD_DEVICE_SUPPORTED_FORMATS_ARE_ORDERED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 14u)

public val WPD_DEVICE_SUPPORTS_NON_CONSUMABLE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 10u)

public val WPD_DEVICE_SYNC_PARTNER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 2u)

public val WPD_DEVICE_TRANSPORT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL)), pid = 4u)

public val WPD_DEVICE_TRANSPORT_BLUETOOTH: WpdDeviceTransports = 3

public val WPD_DEVICE_TRANSPORT_IP: WpdDeviceTransports = 2

public val WPD_DEVICE_TRANSPORT_UNSPECIFIED: WpdDeviceTransports = 0

public val WPD_DEVICE_TRANSPORT_USB: WpdDeviceTransports = 1

public val WPD_DEVICE_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x26d4979ae6434626uL, 0x9e2b736dc0c92fdcuL)), pid = 15u)

public val WPD_DEVICE_TYPE_AUDIO_RECORDER: WpdDeviceTypes = 6

public val WPD_DEVICE_TYPE_CAMERA: WpdDeviceTypes = 1

public val WPD_DEVICE_TYPE_GENERIC: WpdDeviceTypes = 0

public val WPD_DEVICE_TYPE_MEDIA_PLAYER: WpdDeviceTypes = 2

public val WPD_DEVICE_TYPE_PERSONAL_INFORMATION_MANAGER: WpdDeviceTypes = 5

public val WPD_DEVICE_TYPE_PHONE: WpdDeviceTypes = 3

public val WPD_DEVICE_TYPE_VIDEO: WpdDeviceTypes = 4

public val WPD_DEVICE_USE_DEVICE_STAGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x463dd6627fc44291uL, 0x911c7f4c9cca9799uL)), pid = 5u)

public val WPD_DOCUMENT_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xb110203eb954f02uL, 0x93e097c631493ad5uL))

public val WPD_EFFECT_MODE_BLACK_AND_WHITE: WpdEffectModes = 2

public val WPD_EFFECT_MODE_COLOR: WpdEffectModes = 1

public val WPD_EFFECT_MODE_SEPIA: WpdEffectModes = 3

public val WPD_EFFECT_MODE_UNDEFINED: WpdEffectModes = 0

public val WPD_EMAIL_BCC_LINE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 4u)

public val WPD_EMAIL_CC_LINE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 3u)

public val WPD_EMAIL_HAS_ATTACHMENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 9u)

public val WPD_EMAIL_HAS_BEEN_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 7u)

public val WPD_EMAIL_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL))

public val WPD_EMAIL_RECEIVED_TIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 8u)

public val WPD_EMAIL_SENDER_ADDRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 10u)

public val WPD_EMAIL_TO_LINE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x41f8f65a54844782uL, 0xb13d4740dd7c37c5uL)), pid = 2u)

public val WPD_EVENT_ATTRIBUTES_V1: Guid = Guid.fromU128(U128(0x10c965782e814111uL, 0xaddee08ca6138f6duL))

public val WPD_EVENT_ATTRIBUTE_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x10c965782e814111uL, 0xaddee08ca6138f6duL)), pid = 2u)

public val WPD_EVENT_ATTRIBUTE_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x10c965782e814111uL, 0xaddee08ca6138f6duL)), pid = 4u)

public val WPD_EVENT_ATTRIBUTE_PARAMETERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x10c965782e814111uL, 0xaddee08ca6138f6duL)), pid = 3u)

public val WPD_EVENT_DEVICE_CAPABILITIES_UPDATED: Guid = Guid.fromU128(U128(0x36885aa1cd544daauL, 0xb3d0afb3e03f5999uL))

public val WPD_EVENT_DEVICE_REMOVED: Guid = Guid.fromU128(U128(0xe4cbca1b691848b9uL, 0x85ee02be7c850af9uL))

public val WPD_EVENT_DEVICE_RESET: Guid = Guid.fromU128(U128(0x7755cf53c1ed44f3uL, 0xb5a2451e2c376b27uL))

public val WPD_EVENT_MTP_VENDOR_EXTENDED_EVENTS: Guid = Guid.fromU128(U128(0x57384ff2uL, 0x8445be3126691059uL))

public val WPD_EVENT_NOTIFICATION: Guid = Guid.fromU128(U128(0x2ba2e40a6b4c4295uL, 0xbb4326322b99aeb2uL))

public val WPD_EVENT_OBJECT_ADDED: Guid = Guid.fromU128(U128(0xa726da95e2074b02uL, 0x8d44bef2e86cbffcuL))

public val WPD_EVENT_OBJECT_REMOVED: Guid = Guid.fromU128(U128(0xbe82ab88a52c4823uL, 0x96e5d0272671fc38uL))

public val WPD_EVENT_OBJECT_TRANSFER_REQUESTED: Guid = Guid.fromU128(U128(0x8d16a0a1f2c641dauL, 0x8f195e53721adbf2uL))

public val WPD_EVENT_OBJECT_UPDATED: Guid = Guid.fromU128(U128(0x1445a7592e01485duL, 0x9f27ff07dae697abuL))

public val WPD_EVENT_OPTIONS_V1: Guid = Guid.fromU128(U128(0xb3d8dad7a3614b83uL, 0x8a485b02ce10713buL))

public val WPD_EVENT_OPTION_IS_AUTOPLAY_EVENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3d8dad7a3614b83uL, 0x8a485b02ce10713buL)), pid = 3u)

public val WPD_EVENT_OPTION_IS_BROADCAST_EVENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3d8dad7a3614b83uL, 0x8a485b02ce10713buL)), pid = 2u)

public val WPD_EVENT_PARAMETER_CHILD_HIERARCHY_CHANGED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 8u)

public val WPD_EVENT_PARAMETER_EVENT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 3u)

public val WPD_EVENT_PARAMETER_OBJECT_CREATION_COOKIE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 7u)

public val WPD_EVENT_PARAMETER_OBJECT_PARENT_PERSISTENT_UNIQUE_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 6u)

public val WPD_EVENT_PARAMETER_OPERATION_PROGRESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 5u)

public val WPD_EVENT_PARAMETER_OPERATION_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 4u)

public val WPD_EVENT_PARAMETER_PNP_DEVICE_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL)), pid = 2u)

public val WPD_EVENT_PARAMETER_SERVICE_METHOD_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x52807b8a49144323uL, 0x9b9a74f654b2b846uL)), pid = 2u)

public val WPD_EVENT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x15ab1953f8174fefuL, 0xa9215676e838f6e0uL))

public val WPD_EVENT_PROPERTIES_V2: Guid = Guid.fromU128(U128(0x52807b8a49144323uL, 0x9b9a74f654b2b846uL))

public val WPD_EVENT_SERVICE_METHOD_COMPLETE: Guid = Guid.fromU128(U128(0x8a33f5f80acc4d9buL, 0x9cc4112d353b86cauL))

public val WPD_EVENT_STORAGE_FORMAT: Guid = Guid.fromU128(U128(0x3782616b22bc4474uL, 0xa2513070f8d38857uL))

public val WPD_EXPOSURE_METERING_MODE_AVERAGE: WpdExposureMeteringModes = 1

public val WPD_EXPOSURE_METERING_MODE_CENTER_SPOT: WpdExposureMeteringModes = 4

public val WPD_EXPOSURE_METERING_MODE_CENTER_WEIGHTED_AVERAGE: WpdExposureMeteringModes = 2

public val WPD_EXPOSURE_METERING_MODE_MULTI_SPOT: WpdExposureMeteringModes = 3

public val WPD_EXPOSURE_METERING_MODE_UNDEFINED: WpdExposureMeteringModes = 0

public val WPD_EXPOSURE_PROGRAM_MODE_ACTION: WpdExposureProgramModes = 6

public val WPD_EXPOSURE_PROGRAM_MODE_APERTURE_PRIORITY: WpdExposureProgramModes = 3

public val WPD_EXPOSURE_PROGRAM_MODE_AUTO: WpdExposureProgramModes = 2

public val WPD_EXPOSURE_PROGRAM_MODE_CREATIVE: WpdExposureProgramModes = 5

public val WPD_EXPOSURE_PROGRAM_MODE_MANUAL: WpdExposureProgramModes = 1

public val WPD_EXPOSURE_PROGRAM_MODE_PORTRAIT: WpdExposureProgramModes = 7

public val WPD_EXPOSURE_PROGRAM_MODE_SHUTTER_PRIORITY: WpdExposureProgramModes = 4

public val WPD_EXPOSURE_PROGRAM_MODE_UNDEFINED: WpdExposureProgramModes = 0

public val WPD_FLASH_MODE_AUTO: WpdFlashModes = 1

public val WPD_FLASH_MODE_EXTERNAL_SYNC: WpdFlashModes = 6

public val WPD_FLASH_MODE_FILL: WpdFlashModes = 3

public val WPD_FLASH_MODE_OFF: WpdFlashModes = 2

public val WPD_FLASH_MODE_RED_EYE_AUTO: WpdFlashModes = 4

public val WPD_FLASH_MODE_RED_EYE_FILL: WpdFlashModes = 5

public val WPD_FLASH_MODE_UNDEFINED: WpdFlashModes = 0

public val WPD_FOCUS_AUTOMATIC: WpdFocusModes = 2

public val WPD_FOCUS_AUTOMATIC_MACRO: WpdFocusModes = 3

public val WPD_FOCUS_MANUAL: WpdFocusModes = 1

public val WPD_FOCUS_METERING_MODE_CENTER_SPOT: WpdFocusMeteringModes = 1

public val WPD_FOCUS_METERING_MODE_MULTI_SPOT: WpdFocusMeteringModes = 2

public val WPD_FOCUS_METERING_MODE_UNDEFINED: WpdFocusMeteringModes = 0

public val WPD_FOCUS_UNDEFINED: WpdFocusModes = 0

public val WPD_FOLDER_CONTENT_TYPES_ALLOWED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7e9a7abfe5684b34uL, 0xaa2f13bb12ab177duL)), pid = 2u)

public val WPD_FOLDER_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x7e9a7abfe5684b34uL, 0xaa2f13bb12ab177duL))

public val WPD_FORMAT_ATTRIBUTES_V1: Guid = Guid.fromU128(U128(0xa0a02000bcaf4be8uL, 0xb3f5233f231cf58fuL))

public val WPD_FORMAT_ATTRIBUTE_MIMETYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xa0a02000bcaf4be8uL, 0xb3f5233f231cf58fuL)), pid = 3u)

public val WPD_FORMAT_ATTRIBUTE_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xa0a02000bcaf4be8uL, 0xb3f5233f231cf58fuL)), pid = 2u)

public val WPD_FUNCTIONAL_CATEGORY_ALL: Guid = Guid.fromU128(U128(0x2d8a6512a74c448euL, 0xba8af4ac07c49399uL))

public val WPD_FUNCTIONAL_CATEGORY_AUDIO_CAPTURE: Guid = Guid.fromU128(U128(0x3f2a1919c7c24a00uL, 0x855df57cf06debbbuL))

public val WPD_FUNCTIONAL_CATEGORY_DEVICE: Guid = Guid.fromU128(U128(0x8ea466be3a44336uL, 0xa1f3a44d2b5c438cuL))

public val WPD_FUNCTIONAL_CATEGORY_NETWORK_CONFIGURATION: Guid = Guid.fromU128(U128(0x48f4db727c6a4ab0uL, 0x9e1a470e3cdbf26auL))

public val WPD_FUNCTIONAL_CATEGORY_RENDERING_INFORMATION: Guid = Guid.fromU128(U128(0x8600ba4a7ba4a01uL, 0xab0e0065d0a356d3uL))

public val WPD_FUNCTIONAL_CATEGORY_SMS: Guid = Guid.fromU128(U128(0x44a0b1c1e94afduL, 0xb358a62c6117c9cfuL))

public val WPD_FUNCTIONAL_CATEGORY_STILL_IMAGE_CAPTURE: Guid = Guid.fromU128(U128(0x613ca327ab934900uL, 0xb4fa895bb5874b79uL))

public val WPD_FUNCTIONAL_CATEGORY_STORAGE: Guid = Guid.fromU128(U128(0x23f05bbc15de4c2auL, 0xa55ba9af5ce412efuL))

public val WPD_FUNCTIONAL_CATEGORY_VIDEO_CAPTURE: Guid = Guid.fromU128(U128(0xe23e5f6b724343aauL, 0x8df10eb3d968a918uL))

public val WPD_FUNCTIONAL_OBJECT_CATEGORY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x8f052d93abca4fc5uL, 0xa5acb01df4dbe598uL)), pid = 2u)

public val WPD_FUNCTIONAL_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x8f052d93abca4fc5uL, 0xa5acb01df4dbe598uL))

public val WPD_IMAGE_BITDEPTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 3u)

public val WPD_IMAGE_COLOR_CORRECTED_STATUS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 5u)

public val WPD_IMAGE_CROPPED_STATUS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 4u)

public val WPD_IMAGE_EXPOSURE_INDEX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 8u)

public val WPD_IMAGE_EXPOSURE_TIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 7u)

public val WPD_IMAGE_FNUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 6u)

public val WPD_IMAGE_HORIZONTAL_RESOLUTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 9u)

public val WPD_IMAGE_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL))

public val WPD_IMAGE_VERTICAL_RESOLUTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x63d649089fa1479fuL, 0x85ba9952216447dbuL)), pid = 10u)

public val WPD_MEDIA_ALBUM_ARTIST: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 25u)

public val WPD_MEDIA_ARTIST: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 24u)

public val WPD_MEDIA_AUDIO_ENCODING_PROFILE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 49u)

public val WPD_MEDIA_BITRATE_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 3u)

public val WPD_MEDIA_BUY_NOW: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 20u)

public val WPD_MEDIA_BYTE_BOOKMARK: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 36u)

public val WPD_MEDIA_COMPOSER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 11u)

public val WPD_MEDIA_COPYRIGHT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 4u)

public val WPD_MEDIA_DESCRIPTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 31u)

public val WPD_MEDIA_DESTINATION_URL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 30u)

public val WPD_MEDIA_DURATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 19u)

public val WPD_MEDIA_EFFECTIVE_RATING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 12u)

public val WPD_MEDIA_ENCODING_PROFILE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 21u)

public val WPD_MEDIA_GENRE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 32u)

public val WPD_MEDIA_GUID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 38u)

public val WPD_MEDIA_HEIGHT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 23u)

public val WPD_MEDIA_LAST_ACCESSED_TIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 8u)

public val WPD_MEDIA_LAST_BUILD_DATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 35u)

public val WPD_MEDIA_MANAGING_EDITOR: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 27u)

public val WPD_MEDIA_META_GENRE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 10u)

public val WPD_MEDIA_OBJECT_BOOKMARK: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 34u)

public val WPD_MEDIA_OWNER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 26u)

public val WPD_MEDIA_PARENTAL_RATING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 9u)

public val WPD_MEDIA_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL))

public val WPD_MEDIA_RELEASE_DATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 14u)

public val WPD_MEDIA_SAMPLE_RATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 15u)

public val WPD_MEDIA_SKIP_COUNT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 7u)

public val WPD_MEDIA_SOURCE_URL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 29u)

public val WPD_MEDIA_STAR_RATING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 16u)

public val WPD_MEDIA_SUBSCRIPTION_CONTENT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 5u)

public val WPD_MEDIA_SUB_DESCRIPTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 39u)

public val WPD_MEDIA_SUB_TITLE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 13u)

public val WPD_MEDIA_TIME_BOOKMARK: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 33u)

public val WPD_MEDIA_TIME_TO_LIVE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 37u)

public val WPD_MEDIA_TITLE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 18u)

public val WPD_MEDIA_TOTAL_BITRATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 2u)

public val WPD_MEDIA_USER_EFFECTIVE_RATING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 17u)

public val WPD_MEDIA_USE_COUNT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 6u)

public val WPD_MEDIA_WEBMASTER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 28u)

public val WPD_MEDIA_WIDTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2ed8ba050ad342dcuL, 0xb0d0bc95ac396ac8uL)), pid = 22u)

public val WPD_MEMO_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x5ffbfc7b748341aduL, 0xafb9da3f4e592b8duL))

public val WPD_META_GENRE_AUDIO_PODCAST: WpdMetaGenres = 64

public val WPD_META_GENRE_FEATURE_FILM_VIDEO_FILE: WpdMetaGenres = 37

public val WPD_META_GENRE_GENERIC_MUSIC_AUDIO_FILE: WpdMetaGenres = 1

public val WPD_META_GENRE_GENERIC_NON_AUDIO_NON_VIDEO: WpdMetaGenres = 48

public val WPD_META_GENRE_GENERIC_NON_MUSIC_AUDIO_FILE: WpdMetaGenres = 17

public val WPD_META_GENRE_GENERIC_VIDEO_FILE: WpdMetaGenres = 33

public val WPD_META_GENRE_HOME_VIDEO_FILE: WpdMetaGenres = 36

public val WPD_META_GENRE_MIXED_PODCAST: WpdMetaGenres = 66

public val WPD_META_GENRE_MUSIC_VIDEO_FILE: WpdMetaGenres = 35

public val WPD_META_GENRE_NEWS_VIDEO_FILE: WpdMetaGenres = 34

public val WPD_META_GENRE_PHOTO_MONTAGE_VIDEO_FILE: WpdMetaGenres = 40

public val WPD_META_GENRE_SPOKEN_WORD_AUDIO_BOOK_FILES: WpdMetaGenres = 18

public val WPD_META_GENRE_SPOKEN_WORD_FILES_NON_AUDIO_BOOK: WpdMetaGenres = 19

public val WPD_META_GENRE_SPOKEN_WORD_NEWS: WpdMetaGenres = 20

public val WPD_META_GENRE_SPOKEN_WORD_TALK_SHOWS: WpdMetaGenres = 21

public val WPD_META_GENRE_TELEVISION_VIDEO_FILE: WpdMetaGenres = 38

public val WPD_META_GENRE_TRAINING_EDUCATIONAL_VIDEO_FILE: WpdMetaGenres = 39

public val WPD_META_GENRE_UNUSED: WpdMetaGenres = 0

public val WPD_META_GENRE_VIDEO_PODCAST: WpdMetaGenres = 65

public val WPD_METHOD_ATTRIBUTES_V1: Guid = Guid.fromU128(U128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL))

public val WPD_METHOD_ATTRIBUTE_ACCESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL)), pid = 4u)

public val WPD_METHOD_ATTRIBUTE_ASSOCIATED_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL)), pid = 3u)

public val WPD_METHOD_ATTRIBUTE_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL)), pid = 2u)

public val WPD_METHOD_ATTRIBUTE_PARAMETERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf17a5071f03944afuL, 0x8efe432cf32e432auL)), pid = 5u)

public val WPD_MUSIC_ALBUM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 3u)

public val WPD_MUSIC_LYRICS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 6u)

public val WPD_MUSIC_MOOD: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 8u)

public val WPD_MUSIC_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL))

public val WPD_MUSIC_TRACK: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb324f56adc5d46e5uL, 0xb6dfd2ea414888c6uL)), pid = 4u)

public val WPD_NETWORK_ASSOCIATION_HOST_NETWORK_IDENTIFIERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe4c93c1fb20343f1uL, 0xa1005a07d11b0274uL)), pid = 2u)

public val WPD_NETWORK_ASSOCIATION_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xe4c93c1fb20343f1uL, 0xa1005a07d11b0274uL))

public val WPD_NETWORK_ASSOCIATION_X509V3SEQUENCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe4c93c1fb20343f1uL, 0xa1005a07d11b0274uL)), pid = 3u)

public val WPD_OBJECT_BACK_REFERENCES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 21u)

public val WPD_OBJECT_CAN_DELETE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 26u)

public val WPD_OBJECT_CONTAINER_FUNCTIONAL_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 23u)

public val WPD_OBJECT_CONTENT_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 7u)

public val WPD_OBJECT_DATE_AUTHORED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 20u)

public val WPD_OBJECT_DATE_CREATED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 18u)

public val WPD_OBJECT_DATE_MODIFIED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 19u)

public val WPD_OBJECT_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 6u)

public val WPD_OBJECT_FORMAT_3G2: Guid = Guid.fromU128(U128(0xb9850000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_3G2A: Guid = Guid.fromU128(U128(0x1a11202d87594e34uL, 0xba5eb1211087eee4uL))

public val WPD_OBJECT_FORMAT_3GP: Guid = Guid.fromU128(U128(0xb9840000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_3GPA: Guid = Guid.fromU128(U128(0xe5172730f97141efuL, 0xa10b2271a0019d7auL))

public val WPD_OBJECT_FORMAT_AAC: Guid = Guid.fromU128(U128(0xb9030000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ABSTRACT_CONTACT: Guid = Guid.fromU128(U128(0xbb810000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ABSTRACT_CONTACT_GROUP: Guid = Guid.fromU128(U128(0xba060000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ABSTRACT_MEDIA_CAST: Guid = Guid.fromU128(U128(0xba0b0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_AIFF: Guid = Guid.fromU128(U128(0x30070000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ALL: Guid = Guid.fromU128(U128(0xc1f62eb24bb3479cuL, 0x9cfa05b5f3a57b22uL))

public val WPD_OBJECT_FORMAT_AMR: Guid = Guid.fromU128(U128(0xb9080000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ASF: Guid = Guid.fromU128(U128(0x300c0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ASXPLAYLIST: Guid = Guid.fromU128(U128(0xba130000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ATSCTS: Guid = Guid.fromU128(U128(0xb9870000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_AUDIBLE: Guid = Guid.fromU128(U128(0xb9040000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_AVCHD: Guid = Guid.fromU128(U128(0xb9860000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_AVI: Guid = Guid.fromU128(U128(0x300a0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_BMP: Guid = Guid.fromU128(U128(0x38040000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_CIFF: Guid = Guid.fromU128(U128(0x38050000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_DPOF: Guid = Guid.fromU128(U128(0x30060000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_DVBTS: Guid = Guid.fromU128(U128(0xb9880000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_EXECUTABLE: Guid = Guid.fromU128(U128(0x30030000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_EXIF: Guid = Guid.fromU128(U128(0x38010000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_FLAC: Guid = Guid.fromU128(U128(0xb9060000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_FLASHPIX: Guid = Guid.fromU128(U128(0x38030000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_GIF: Guid = Guid.fromU128(U128(0x38070000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_HTML: Guid = Guid.fromU128(U128(0x30050000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ICALENDAR: Guid = Guid.fromU128(U128(0xbe030000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_ICON: Guid = Guid.fromU128(U128(0x77232ed102c4638uL, 0x9c2283f142bfc822uL))

public val WPD_OBJECT_FORMAT_JFIF: Guid = Guid.fromU128(U128(0x38080000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_JP2: Guid = Guid.fromU128(U128(0x380f0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_JPEGXR: Guid = Guid.fromU128(U128(0xb8040000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_JPX: Guid = Guid.fromU128(U128(0x38100000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_M3UPLAYLIST: Guid = Guid.fromU128(U128(0xba110000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_M4A: Guid = Guid.fromU128(U128(0x30aba7ac6ffd4c23uL, 0xa3593e9b52f3f1c8uL))

public val WPD_OBJECT_FORMAT_MHT_COMPILED_HTML: Guid = Guid.fromU128(U128(0xba840000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MICROSOFT_EXCEL: Guid = Guid.fromU128(U128(0xba850000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MICROSOFT_POWERPOINT: Guid = Guid.fromU128(U128(0xba860000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MICROSOFT_WFC: Guid = Guid.fromU128(U128(0xb1040000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MICROSOFT_WORD: Guid = Guid.fromU128(U128(0xba830000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MKV: Guid = Guid.fromU128(U128(0xb9900000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MP2: Guid = Guid.fromU128(U128(0xb9830000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MP3: Guid = Guid.fromU128(U128(0x30090000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MP4: Guid = Guid.fromU128(U128(0xb9820000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MPEG: Guid = Guid.fromU128(U128(0x300b0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_MPLPLAYLIST: Guid = Guid.fromU128(U128(0xba120000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_NETWORK_ASSOCIATION: Guid = Guid.fromU128(U128(0xb1020000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_OGG: Guid = Guid.fromU128(U128(0xb9020000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_PCD: Guid = Guid.fromU128(U128(0x38090000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_PICT: Guid = Guid.fromU128(U128(0x380a0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_PLSPLAYLIST: Guid = Guid.fromU128(U128(0xba140000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_PNG: Guid = Guid.fromU128(U128(0x380b0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_PROPERTIES_ONLY: Guid = Guid.fromU128(U128(0x30010000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_QCELP: Guid = Guid.fromU128(U128(0xb9070000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_SCRIPT: Guid = Guid.fromU128(U128(0x30020000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_TEXT: Guid = Guid.fromU128(U128(0x30040000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_TIFF: Guid = Guid.fromU128(U128(0x380d0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_TIFFEP: Guid = Guid.fromU128(U128(0x38020000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_TIFFIT: Guid = Guid.fromU128(U128(0x380e0000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_UNSPECIFIED: Guid = Guid.fromU128(U128(0x30000000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_VCALENDAR1: Guid = Guid.fromU128(U128(0xbe020000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_VCARD2: Guid = Guid.fromU128(U128(0xbb820000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_VCARD3: Guid = Guid.fromU128(U128(0xbb830000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_WAVE: Guid = Guid.fromU128(U128(0x30080000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_WBMP: Guid = Guid.fromU128(U128(0xb8030000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_WINDOWSIMAGEFORMAT: Guid = Guid.fromU128(U128(0xb8810000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_WMA: Guid = Guid.fromU128(U128(0xb9010000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_WMV: Guid = Guid.fromU128(U128(0xb9810000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_WPLPLAYLIST: Guid = Guid.fromU128(U128(0xba100000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_X509V3CERTIFICATE: Guid = Guid.fromU128(U128(0xb1030000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_FORMAT_XML: Guid = Guid.fromU128(U128(0xba820000ae6c4804uL, 0x98bac57b46965fe7uL))

public val WPD_OBJECT_GENERATE_THUMBNAIL_FROM_RESOURCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 24u)

public val WPD_OBJECT_HINT_LOCATION_DISPLAY_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 25u)

public val WPD_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 2u)

public val WPD_OBJECT_ISHIDDEN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 9u)

public val WPD_OBJECT_ISSYSTEM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 10u)

public val WPD_OBJECT_IS_DRM_PROTECTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 17u)

public val WPD_OBJECT_KEYWORDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 15u)

public val WPD_OBJECT_LANGUAGE_LOCALE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 27u)

public val WPD_OBJECT_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 4u)

public val WPD_OBJECT_NON_CONSUMABLE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 13u)

public val WPD_OBJECT_ORIGINAL_FILE_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 12u)

public val WPD_OBJECT_PARENT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 3u)

public val WPD_OBJECT_PERSISTENT_UNIQUE_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 5u)

public val WPD_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL))

public val WPD_OBJECT_PROPERTIES_V2: Guid = Guid.fromU128(U128(0x373cd3d4a4640d7uL, 0xb4d873e8da74e775uL))

public val WPD_OBJECT_REFERENCES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 14u)

public val WPD_OBJECT_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 11u)

public val WPD_OBJECT_SUPPORTED_UNITS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x373cd3d4a4640d7uL, 0xb4d873e8da74e775uL)), pid = 2u)

public val WPD_OBJECT_SYNC_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef6b490d5cd8437auL, 0xaffcda8b60ee4a3cuL)), pid = 16u)

public val WPD_OPERATION_STATE_ABORTED: WpdOperationStates = 6

public val WPD_OPERATION_STATE_CANCELLED: WpdOperationStates = 4

public val WPD_OPERATION_STATE_FINISHED: WpdOperationStates = 5

public val WPD_OPERATION_STATE_PAUSED: WpdOperationStates = 3

public val WPD_OPERATION_STATE_RUNNING: WpdOperationStates = 2

public val WPD_OPERATION_STATE_STARTED: WpdOperationStates = 1

public val WPD_OPERATION_STATE_UNSPECIFIED: WpdOperationStates = 0

public val WPD_OPTION_OBJECT_MANAGEMENT_RECURSIVE_DELETE_SUPPORTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 5001u)

public val WPD_OPTION_OBJECT_RESOURCES_NO_INPUT_BUFFER_ON_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 5003u)

public val WPD_OPTION_OBJECT_RESOURCES_SEEK_ON_READ_SUPPORTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 5001u)

public val WPD_OPTION_OBJECT_RESOURCES_SEEK_ON_WRITE_SUPPORTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 5002u)

public val WPD_OPTION_SMS_BINARY_MESSAGE_SUPPORTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)), pid = 5001u)

public val WPD_OPTION_VALID_OBJECT_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 5001u)

public val WPD_PARAMETER_ATTRIBUTES_V1: Guid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL))

public val WPD_PARAMETER_ATTRIBUTE_DEFAULT_VALUE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 5u)

public val WPD_PARAMETER_ATTRIBUTE_ENUMERATION_ELEMENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 9u)

public val WPD_PARAMETER_ATTRIBUTE_FORM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 4u)

public val WPD_PARAMETER_ATTRIBUTE_FORM_ENUMERATION: WpdParameterAttributeForm = 2

public val WPD_PARAMETER_ATTRIBUTE_FORM_OBJECT_IDENTIFIER: WpdParameterAttributeForm = 4

public val WPD_PARAMETER_ATTRIBUTE_FORM_RANGE: WpdParameterAttributeForm = 1

public val WPD_PARAMETER_ATTRIBUTE_FORM_REGULAR_EXPRESSION: WpdParameterAttributeForm = 3

public val WPD_PARAMETER_ATTRIBUTE_FORM_UNSPECIFIED: WpdParameterAttributeForm = 0

public val WPD_PARAMETER_ATTRIBUTE_MAX_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 11u)

public val WPD_PARAMETER_ATTRIBUTE_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 13u)

public val WPD_PARAMETER_ATTRIBUTE_ORDER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 2u)

public val WPD_PARAMETER_ATTRIBUTE_RANGE_MAX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 7u)

public val WPD_PARAMETER_ATTRIBUTE_RANGE_MIN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 6u)

public val WPD_PARAMETER_ATTRIBUTE_RANGE_STEP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 8u)

public val WPD_PARAMETER_ATTRIBUTE_REGULAR_EXPRESSION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 10u)

public val WPD_PARAMETER_ATTRIBUTE_USAGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 3u)

public val WPD_PARAMETER_ATTRIBUTE_VARTYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe6864dd7f32545eauL, 0xa1d597cf73b6ca58uL)), pid = 12u)

public val WPD_PARAMETER_USAGE_IN: WpdParameterUsageTypes = 1

public val WPD_PARAMETER_USAGE_INOUT: WpdParameterUsageTypes = 3

public val WPD_PARAMETER_USAGE_OUT: WpdParameterUsageTypes = 2

public val WPD_PARAMETER_USAGE_RETURN: WpdParameterUsageTypes = 0

public val WPD_POWER_SOURCE_BATTERY: WpdPowerSources = 0

public val WPD_POWER_SOURCE_EXTERNAL: WpdPowerSources = 1

public val WPD_PROPERTIES_MTP_VENDOR_EXTENDED_DEVICE_PROPS: Guid = Guid.fromU128(U128(0x4d545058890040b3uL, 0x8f1ddc246e1e8370uL))

public val WPD_PROPERTIES_MTP_VENDOR_EXTENDED_OBJECT_PROPS: Guid = Guid.fromU128(U128(0x4d5450584fce4578uL, 0x95c88698a9bc0f49uL))

public val WPD_PROPERTY_ATTRIBUTES_V1: Guid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL))

public val WPD_PROPERTY_ATTRIBUTES_V2: Guid = Guid.fromU128(U128(0x5d9da16074ae43ccuL, 0x85a9fe555a80798euL))

public val WPD_PROPERTY_ATTRIBUTE_CAN_DELETE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 5u)

public val WPD_PROPERTY_ATTRIBUTE_CAN_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 3u)

public val WPD_PROPERTY_ATTRIBUTE_CAN_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 4u)

public val WPD_PROPERTY_ATTRIBUTE_DEFAULT_VALUE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 6u)

public val WPD_PROPERTY_ATTRIBUTE_ENUMERATION_ELEMENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 11u)

public val WPD_PROPERTY_ATTRIBUTE_FAST_PROPERTY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 7u)

public val WPD_PROPERTY_ATTRIBUTE_FORM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 2u)

public val WPD_PROPERTY_ATTRIBUTE_FORM_ENUMERATION: WpdAttributeForm = 2

public val WPD_PROPERTY_ATTRIBUTE_FORM_OBJECT_IDENTIFIER: WpdAttributeForm = 4

public val WPD_PROPERTY_ATTRIBUTE_FORM_RANGE: WpdAttributeForm = 1

public val WPD_PROPERTY_ATTRIBUTE_FORM_REGULAR_EXPRESSION: WpdAttributeForm = 3

public val WPD_PROPERTY_ATTRIBUTE_FORM_UNSPECIFIED: WpdAttributeForm = 0

public val WPD_PROPERTY_ATTRIBUTE_MAX_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 13u)

public val WPD_PROPERTY_ATTRIBUTE_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x5d9da16074ae43ccuL, 0x85a9fe555a80798euL)), pid = 2u)

public val WPD_PROPERTY_ATTRIBUTE_RANGE_MAX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 9u)

public val WPD_PROPERTY_ATTRIBUTE_RANGE_MIN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 8u)

public val WPD_PROPERTY_ATTRIBUTE_RANGE_STEP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 10u)

public val WPD_PROPERTY_ATTRIBUTE_REGULAR_EXPRESSION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xab7943d86332445fuL, 0xa00d8d5ef1e96f37uL)), pid = 12u)

public val WPD_PROPERTY_ATTRIBUTE_VARTYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x5d9da16074ae43ccuL, 0x85a9fe555a80798euL)), pid = 3u)

public val WPD_PROPERTY_CAPABILITIES_COMMAND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1002u)

public val WPD_PROPERTY_CAPABILITIES_COMMAND_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1003u)

public val WPD_PROPERTY_CAPABILITIES_CONTENT_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1008u)

public val WPD_PROPERTY_CAPABILITIES_CONTENT_TYPES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1007u)

public val WPD_PROPERTY_CAPABILITIES_EVENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1014u)

public val WPD_PROPERTY_CAPABILITIES_EVENT_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1015u)

public val WPD_PROPERTY_CAPABILITIES_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1010u)

public val WPD_PROPERTY_CAPABILITIES_FORMATS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1009u)

public val WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_CATEGORIES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1004u)

public val WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_CATEGORY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1005u)

public val WPD_PROPERTY_CAPABILITIES_FUNCTIONAL_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1006u)

public val WPD_PROPERTY_CAPABILITIES_PROPERTY_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1012u)

public val WPD_PROPERTY_CAPABILITIES_PROPERTY_KEYS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1011u)

public val WPD_PROPERTY_CAPABILITIES_SUPPORTED_COMMANDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1001u)

public val WPD_PROPERTY_CAPABILITIES_SUPPORTED_EVENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xcabec786b7441c6uL, 0x92162639d1fce356uL)), pid = 1013u)

public val WPD_PROPERTY_CLASS_EXTENSION_DEVICE_INFORMATION_VALUES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL)), pid = 1001u)

public val WPD_PROPERTY_CLASS_EXTENSION_DEVICE_INFORMATION_WRITE_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x33fb0d1164a34facuL, 0xb4c73dfeaa99b051uL)), pid = 1002u)

public val WPD_PROPERTY_CLASS_EXTENSION_SERVICE_INTERFACES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL)), pid = 1002u)

public val WPD_PROPERTY_CLASS_EXTENSION_SERVICE_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL)), pid = 1001u)

public val WPD_PROPERTY_CLASS_EXTENSION_SERVICE_REGISTRATION_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f0779b5fa2b4766uL, 0x9cb2f73ba30b6758uL)), pid = 1003u)

public val WPD_PROPERTY_COMMON_ACTIVITY_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1011u)

public val WPD_PROPERTY_COMMON_CLIENT_INFORMATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1009u)

public val WPD_PROPERTY_COMMON_CLIENT_INFORMATION_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1010u)

public val WPD_PROPERTY_COMMON_COMMAND_CATEGORY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1001u)

public val WPD_PROPERTY_COMMON_COMMAND_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1002u)

public val WPD_PROPERTY_COMMON_COMMAND_TARGET: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1006u)

public val WPD_PROPERTY_COMMON_DRIVER_ERROR_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1004u)

public val WPD_PROPERTY_COMMON_HRESULT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1003u)

public val WPD_PROPERTY_COMMON_OBJECT_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1008u)

public val WPD_PROPERTY_COMMON_PERSISTENT_UNIQUE_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf0422a9c5dc84440uL, 0xb5bd5df28835658auL)), pid = 1007u)

public val WPD_PROPERTY_DEVICE_HINTS_CONTENT_LOCATIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL)), pid = 1002u)

public val WPD_PROPERTY_DEVICE_HINTS_CONTENT_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd5fb92bcb464c4fuL, 0x83430bc3d3f17c84uL)), pid = 1001u)

public val WPD_PROPERTY_MTP_EXT_EVENT_PARAMS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d545058ef884e4duL, 0x95c34f327f728a96uL)), pid = 1011u)

public val WPD_PROPERTY_MTP_EXT_OPERATION_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1001u)

public val WPD_PROPERTY_MTP_EXT_OPERATION_PARAMS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1002u)

public val WPD_PROPERTY_MTP_EXT_OPTIMAL_TRANSFER_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1013u)

public val WPD_PROPERTY_MTP_EXT_RESPONSE_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1003u)

public val WPD_PROPERTY_MTP_EXT_RESPONSE_PARAMS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1004u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1006u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1012u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1009u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_TO_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1008u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_TO_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1010u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_NUM_BYTES_WRITTEN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1011u)

public val WPD_PROPERTY_MTP_EXT_TRANSFER_TOTAL_DATA_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1007u)

public val WPD_PROPERTY_MTP_EXT_VENDOR_EXTENSION_DESCRIPTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1014u)

public val WPD_PROPERTY_MTP_EXT_VENDOR_OPERATION_CODES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x4d5450581a2e4106uL, 0xa357771e0819fc56uL)), pid = 1005u)

public val WPD_PROPERTY_NULL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x0uL, 0x0uL)), pid = 0u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 1004u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_FILTER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 1002u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_NUM_OBJECTS_REQUESTED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 1005u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_OBJECT_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 1003u)

public val WPD_PROPERTY_OBJECT_ENUMERATION_PARENT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb7474e91e7f84ad9uL, 0xb400ad1a4b58eeecuL)), pid = 1001u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1002u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_COPY_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1013u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_CREATION_PROPERTIES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1001u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1005u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DELETE_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1007u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DELETE_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1010u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_DESTINATION_FOLDER_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1011u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_MOVE_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1012u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_NUM_BYTES_TO_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1003u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_NUM_BYTES_WRITTEN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1004u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1016u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1006u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OBJECT_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1009u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_OPTIMAL_TRANSFER_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1008u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_PROPERTY_KEYS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1015u)

public val WPD_PROPERTY_OBJECT_MANAGEMENT_UPDATE_PROPERTIES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xef1e43dda9ed4341uL, 0x8bcc186192aea089uL)), pid = 1014u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1002u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_DEPTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1005u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_OBJECT_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1007u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_OBJECT_IDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1001u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_PARENT_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1006u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_PROPERTY_KEYS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1004u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_VALUES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1003u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_BULK_WRITE_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x11c824dd04cd4e4euL, 0x8c7bf6efb794d84euL)), pid = 1008u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 1001u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 1003u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_DELETE_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 1006u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_KEYS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 1002u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_VALUES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 1004u)

public val WPD_PROPERTY_OBJECT_PROPERTIES_PROPERTY_WRITE_RESULTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x9e5582e4081444e6uL, 0x981ab2998d583804uL)), pid = 1005u)

public val WPD_PROPERTY_OBJECT_RESOURCES_ACCESS_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1002u)

public val WPD_PROPERTY_OBJECT_RESOURCES_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1005u)

public val WPD_PROPERTY_OBJECT_RESOURCES_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1010u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1007u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_TO_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1006u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_TO_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1008u)

public val WPD_PROPERTY_OBJECT_RESOURCES_NUM_BYTES_WRITTEN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1009u)

public val WPD_PROPERTY_OBJECT_RESOURCES_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1001u)

public val WPD_PROPERTY_OBJECT_RESOURCES_OPTIMAL_TRANSFER_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1011u)

public val WPD_PROPERTY_OBJECT_RESOURCES_POSITION_FROM_START: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1014u)

public val WPD_PROPERTY_OBJECT_RESOURCES_RESOURCE_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1004u)

public val WPD_PROPERTY_OBJECT_RESOURCES_RESOURCE_KEYS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1003u)

public val WPD_PROPERTY_OBJECT_RESOURCES_SEEK_OFFSET: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1012u)

public val WPD_PROPERTY_OBJECT_RESOURCES_SEEK_ORIGIN_FLAG: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1013u)

public val WPD_PROPERTY_OBJECT_RESOURCES_STREAM_UNITS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1016u)

public val WPD_PROPERTY_OBJECT_RESOURCES_SUPPORTS_UNITS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb3a2b22da5954108uL, 0xbe0afc3c965f3d4auL)), pid = 1015u)

public val WPD_PROPERTY_PUBLIC_KEY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x78f9c6fc79b8473cuL, 0x90606bd23dd072c4uL)), pid = 1001u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_COMMAND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1018u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_COMMAND_OPTIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1019u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_EVENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1012u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_EVENT_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1013u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1002u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_FORMATS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1007u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_FORMAT_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1008u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_INHERITANCE_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1014u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_INHERITED_SERVICES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1015u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_METHOD: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1003u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_METHOD_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1004u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PARAMETER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1005u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PARAMETER_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1006u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PROPERTY_ATTRIBUTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1010u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_PROPERTY_KEYS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1009u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_RENDERING_PROFILES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1016u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_COMMANDS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1017u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_EVENTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1011u)

public val WPD_PROPERTY_SERVICE_CAPABILITIES_SUPPORTED_METHODS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x24457e742e9f44f9uL, 0x8c571d1bcb170b89uL)), pid = 1001u)

public val WPD_PROPERTY_SERVICE_METHOD: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 1001u)

public val WPD_PROPERTY_SERVICE_METHOD_CONTEXT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 1004u)

public val WPD_PROPERTY_SERVICE_METHOD_HRESULT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 1005u)

public val WPD_PROPERTY_SERVICE_METHOD_PARAMETER_VALUES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 1002u)

public val WPD_PROPERTY_SERVICE_METHOD_RESULT_VALUES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2d521ca8c1b04268uL, 0xa342cf19321569bcuL)), pid = 1003u)

public val WPD_PROPERTY_SERVICE_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x322f071d36ef477fuL, 0xb4b56f52d734baeeuL)), pid = 1001u)

public val WPD_PROPERTY_SMS_BINARY_MESSAGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)), pid = 1004u)

public val WPD_PROPERTY_SMS_MESSAGE_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)), pid = 1002u)

public val WPD_PROPERTY_SMS_RECIPIENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)), pid = 1001u)

public val WPD_PROPERTY_SMS_TEXT_MESSAGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xafc25d66fe0d4114uL, 0x9097970c93e920d1uL)), pid = 1003u)

public val WPD_PROPERTY_STORAGE_DESTINATION_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL)), pid = 1002u)

public val WPD_PROPERTY_STORAGE_OBJECT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd8f907a634cc45fauL, 0x97fbd007fa47ec94uL)), pid = 1001u)

public val WPD_RENDERING_INFORMATION_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xc53d039fee234a31uL, 0x85907639879870b4uL))

public val WPD_RENDERING_INFORMATION_PROFILES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xc53d039fee234a31uL, 0x85907639879870b4uL)), pid = 2u)

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_CREATABLE_RESOURCES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xc53d039fee234a31uL, 0x85907639879870b4uL)), pid = 4u)

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xc53d039fee234a31uL, 0x85907639879870b4uL)), pid = 3u)

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE_OBJECT: WpdRenderingInformationProfileEntryTypes = 0

public val WPD_RENDERING_INFORMATION_PROFILE_ENTRY_TYPE_RESOURCE: WpdRenderingInformationProfileEntryTypes = 1

public val WPD_RESOURCE_ALBUM_ART: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf02aa35423004e2duL, 0xa1b93b6730f7fa21uL)), pid = 0u)

public val WPD_RESOURCE_ATTRIBUTES_V1: Guid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL))

public val WPD_RESOURCE_ATTRIBUTE_CAN_DELETE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 5u)

public val WPD_RESOURCE_ATTRIBUTE_CAN_READ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 3u)

public val WPD_RESOURCE_ATTRIBUTE_CAN_WRITE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 4u)

public val WPD_RESOURCE_ATTRIBUTE_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 8u)

public val WPD_RESOURCE_ATTRIBUTE_OPTIMAL_READ_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 6u)

public val WPD_RESOURCE_ATTRIBUTE_OPTIMAL_WRITE_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 7u)

public val WPD_RESOURCE_ATTRIBUTE_RESOURCE_KEY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 9u)

public val WPD_RESOURCE_ATTRIBUTE_TOTAL_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1eb6f6049278429fuL, 0x93cc5bb8c06656b6uL)), pid = 2u)

public val WPD_RESOURCE_AUDIO_CLIP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3bc1398285b148e0uL, 0x95a68d3ad06be117uL)), pid = 0u)

public val WPD_RESOURCE_BRANDING_ART: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb633b1ae6caf4a87uL, 0x958922ded6dd5899uL)), pid = 0u)

public val WPD_RESOURCE_CONTACT_PHOTO: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2c4d680380ea4580uL, 0xaf9a5be1a23eddcbuL)), pid = 0u)

public val WPD_RESOURCE_DEFAULT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe81e79be34f041bfuL, 0xb53ff1a06ae87842uL)), pid = 0u)

public val WPD_RESOURCE_GENERIC: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb9b9f515ba704647uL, 0x94dcfa4925e95a07uL)), pid = 0u)

public val WPD_RESOURCE_ICON: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xf195fed8aa284ee3uL, 0xb153e182dd5edc39uL)), pid = 0u)

public val WPD_RESOURCE_THUMBNAIL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xc7c407ba98fa46b5uL, 0x996023fec124cfdeuL)), pid = 0u)

public val WPD_RESOURCE_VIDEO_CLIP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb566ee4263684290uL, 0x866270182fb79f20uL)), pid = 0u)

public val WPD_SECTION_DATA_LENGTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL)), pid = 3u)

public val WPD_SECTION_DATA_OFFSET: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL)), pid = 2u)

public val WPD_SECTION_DATA_REFERENCED_OBJECT_RESOURCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL)), pid = 5u)

public val WPD_SECTION_DATA_UNITS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL)), pid = 4u)

public val WPD_SECTION_DATA_UNITS_BYTES: WpdSectionDataUnitsValues = 0

public val WPD_SECTION_DATA_UNITS_MILLISECONDS: WpdSectionDataUnitsValues = 1

public val WPD_SECTION_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x516afd2bc64e44f0uL, 0x98dcbee1c88f7d66uL))

public val WPD_SERVICE_INHERITANCE_IMPLEMENTATION: WpdServiceInheritanceTypes = 0

public val WPD_SERVICE_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x7510698acb54481cuL, 0xb8db0d75c93f1c06uL))

public val WPD_SERVICE_VERSION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7510698acb54481cuL, 0xb8db0d75c93f1c06uL)), pid = 2u)

public val WPD_SMS_ENCODING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL)), pid = 5u)

public val WPD_SMS_MAX_PAYLOAD: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL)), pid = 4u)

public val WPD_SMS_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL))

public val WPD_SMS_PROVIDER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL)), pid = 2u)

public val WPD_SMS_TIMEOUT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7e1074cc50ff4dd1uL, 0xa74253be6f093a0duL)), pid = 3u)

public val WPD_STILL_IMAGE_ARTIST: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 29u)

public val WPD_STILL_IMAGE_BURST_INTERVAL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 24u)

public val WPD_STILL_IMAGE_BURST_NUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 23u)

public val WPD_STILL_IMAGE_CAMERA_MANUFACTURER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 31u)

public val WPD_STILL_IMAGE_CAMERA_MODEL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 30u)

public val WPD_STILL_IMAGE_CAPTURE_DELAY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 17u)

public val WPD_STILL_IMAGE_CAPTURE_FORMAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 3u)

public val WPD_STILL_IMAGE_CAPTURE_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 18u)

public val WPD_STILL_IMAGE_CAPTURE_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL))

public val WPD_STILL_IMAGE_CAPTURE_RESOLUTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 2u)

public val WPD_STILL_IMAGE_COMPRESSION_SETTING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 4u)

public val WPD_STILL_IMAGE_CONTRAST: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 19u)

public val WPD_STILL_IMAGE_DIGITAL_ZOOM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 21u)

public val WPD_STILL_IMAGE_EFFECT_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 22u)

public val WPD_STILL_IMAGE_EXPOSURE_BIAS_COMPENSATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 16u)

public val WPD_STILL_IMAGE_EXPOSURE_INDEX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 15u)

public val WPD_STILL_IMAGE_EXPOSURE_METERING_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 11u)

public val WPD_STILL_IMAGE_EXPOSURE_PROGRAM_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 14u)

public val WPD_STILL_IMAGE_EXPOSURE_TIME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 13u)

public val WPD_STILL_IMAGE_FLASH_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 12u)

public val WPD_STILL_IMAGE_FNUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 7u)

public val WPD_STILL_IMAGE_FOCAL_LENGTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 8u)

public val WPD_STILL_IMAGE_FOCUS_DISTANCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 9u)

public val WPD_STILL_IMAGE_FOCUS_METERING_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 27u)

public val WPD_STILL_IMAGE_FOCUS_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 10u)

public val WPD_STILL_IMAGE_RGB_GAIN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 6u)

public val WPD_STILL_IMAGE_SHARPNESS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 20u)

public val WPD_STILL_IMAGE_TIMELAPSE_INTERVAL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 26u)

public val WPD_STILL_IMAGE_TIMELAPSE_NUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 25u)

public val WPD_STILL_IMAGE_UPLOAD_URL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 28u)

public val WPD_STILL_IMAGE_WHITE_BALANCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x58c571ec1bcb42a7uL, 0x8ac5bb291573a260uL)), pid = 5u)

public val WPD_STORAGE_ACCESS_CAPABILITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 11u)

public val WPD_STORAGE_ACCESS_CAPABILITY_READWRITE: WpdStorageAccessCapabilityValues = 0

public val WPD_STORAGE_ACCESS_CAPABILITY_READ_ONLY_WITHOUT_OBJECT_DELETION: WpdStorageAccessCapabilityValues = 1

public val WPD_STORAGE_ACCESS_CAPABILITY_READ_ONLY_WITH_OBJECT_DELETION: WpdStorageAccessCapabilityValues = 2

public val WPD_STORAGE_CAPACITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 4u)

public val WPD_STORAGE_CAPACITY_IN_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 10u)

public val WPD_STORAGE_DESCRIPTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 7u)

public val WPD_STORAGE_FILE_SYSTEM_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 3u)

public val WPD_STORAGE_FREE_SPACE_IN_BYTES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 5u)

public val WPD_STORAGE_FREE_SPACE_IN_OBJECTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 6u)

public val WPD_STORAGE_MAX_OBJECT_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 9u)

public val WPD_STORAGE_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL))

public val WPD_STORAGE_SERIAL_NUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 8u)

public val WPD_STORAGE_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1a3057a74d64e80uL, 0xbea7dc4c212ce50auL)), pid = 2u)

public val WPD_STORAGE_TYPE_FIXED_RAM: WpdStorageTypeValues = 3

public val WPD_STORAGE_TYPE_FIXED_ROM: WpdStorageTypeValues = 1

public val WPD_STORAGE_TYPE_REMOVABLE_RAM: WpdStorageTypeValues = 4

public val WPD_STORAGE_TYPE_REMOVABLE_ROM: WpdStorageTypeValues = 2

public val WPD_STORAGE_TYPE_UNDEFINED: WpdStorageTypeValues = 0

public val WPD_STREAM_UNITS_BYTES: WpdStreamUnits = 0

public val WPD_STREAM_UNITS_FRAMES: WpdStreamUnits = 1

public val WPD_STREAM_UNITS_MICROSECONDS: WpdStreamUnits = 8

public val WPD_STREAM_UNITS_MILLISECONDS: WpdStreamUnits = 4

public val WPD_STREAM_UNITS_ROWS: WpdStreamUnits = 2

public val WPD_TASK_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL))

public val WPD_TASK_OWNER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL)), pid = 11u)

public val WPD_TASK_PERCENT_COMPLETE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL)), pid = 8u)

public val WPD_TASK_REMINDER_DATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL)), pid = 10u)

public val WPD_TASK_STATUS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe354e95ed8a04637uL, 0xa03a0cb26838dbc7uL)), pid = 6u)

public val WPD_VIDEO_AUTHOR: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 2u)

public val WPD_VIDEO_BITRATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 13u)

public val WPD_VIDEO_BUFFER_SIZE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 8u)

public val WPD_VIDEO_CREDITS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 9u)

public val WPD_VIDEO_FOURCC_CODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 14u)

public val WPD_VIDEO_FRAMERATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 15u)

public val WPD_VIDEO_KEY_FRAME_DISTANCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 10u)

public val WPD_VIDEO_OBJECT_PROPERTIES_V1: Guid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL))

public val WPD_VIDEO_QUALITY_SETTING: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 11u)

public val WPD_VIDEO_RECORDEDTV_CHANNEL_NUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 5u)

public val WPD_VIDEO_RECORDEDTV_REPEAT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 7u)

public val WPD_VIDEO_RECORDEDTV_STATION_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 4u)

public val WPD_VIDEO_SCAN_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x346f2163f9984146uL, 0x8b01d19b4c00de9auL)), pid = 12u)

public val WPD_VIDEO_SCAN_TYPE_FIELD_INTERLEAVED_LOWER_FIRST: WpdVideoScanTypes = 3

public val WPD_VIDEO_SCAN_TYPE_FIELD_INTERLEAVED_UPPER_FIRST: WpdVideoScanTypes = 2

public val WPD_VIDEO_SCAN_TYPE_FIELD_SINGLE_LOWER_FIRST: WpdVideoScanTypes = 5

public val WPD_VIDEO_SCAN_TYPE_FIELD_SINGLE_UPPER_FIRST: WpdVideoScanTypes = 4

public val WPD_VIDEO_SCAN_TYPE_MIXED_INTERLACE: WpdVideoScanTypes = 6

public val WPD_VIDEO_SCAN_TYPE_MIXED_INTERLACE_AND_PROGRESSIVE: WpdVideoScanTypes = 7

public val WPD_VIDEO_SCAN_TYPE_PROGRESSIVE: WpdVideoScanTypes = 1

public val WPD_VIDEO_SCAN_TYPE_UNUSED: WpdVideoScanTypes = 0

public val WPD_WHITE_BALANCE_AUTOMATIC: WpdWhiteBalanceSettings = 2

public val WPD_WHITE_BALANCE_DAYLIGHT: WpdWhiteBalanceSettings = 4

public val WPD_WHITE_BALANCE_FLASH: WpdWhiteBalanceSettings = 7

public val WPD_WHITE_BALANCE_FLORESCENT: WpdWhiteBalanceSettings = 5

public val WPD_WHITE_BALANCE_MANUAL: WpdWhiteBalanceSettings = 1

public val WPD_WHITE_BALANCE_ONE_PUSH_AUTOMATIC: WpdWhiteBalanceSettings = 3

public val WPD_WHITE_BALANCE_TUNGSTEN: WpdWhiteBalanceSettings = 6

public val WPD_WHITE_BALANCE_UNDEFINED: WpdWhiteBalanceSettings = 0

public val WPD_SERIALIZER: Guid = Guid.fromU128(U128(0xb91a74bad7c4a9duL, 0xb56329eef9167172uL))
