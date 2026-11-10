package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val E_IMAPI_BURN_VERIFICATION_FAILED: Hresult = 0xC0AA0007u.toInt()

public val E_IMAPI_DF2DATA_CLIENT_NAME_IS_NOT_VALID: Hresult = 0xC0AA0408u.toInt()

public val E_IMAPI_DF2DATA_INVALID_MEDIA_STATE: Hresult = 0xC0AA0402u.toInt()

public val E_IMAPI_DF2DATA_MEDIA_IS_NOT_SUPPORTED: Hresult = 0xC0AA0406u.toInt()

public val E_IMAPI_DF2DATA_MEDIA_NOT_BLANK: Hresult = 0xC0AA0405u.toInt()

public val E_IMAPI_DF2DATA_RECORDER_NOT_SUPPORTED: Hresult = 0xC0AA0407u.toInt()

public val E_IMAPI_DF2DATA_STREAM_NOT_SUPPORTED: Hresult = 0xC0AA0403u.toInt()

public val E_IMAPI_DF2DATA_STREAM_TOO_LARGE_FOR_CURRENT_MEDIA: Hresult = 0xC0AA0404u.toInt()

public val E_IMAPI_DF2DATA_WRITE_IN_PROGRESS: Hresult = 0xC0AA0400u.toInt()

public val E_IMAPI_DF2DATA_WRITE_NOT_IN_PROGRESS: Hresult = 0xC0AA0401u.toInt()

public val E_IMAPI_DF2RAW_CLIENT_NAME_IS_NOT_VALID: Hresult = 0xC0AA0604u.toInt()

public val E_IMAPI_DF2RAW_DATA_BLOCK_TYPE_NOT_SUPPORTED: Hresult = 0xC0AA060Eu.toInt()

public val E_IMAPI_DF2RAW_MEDIA_IS_NOT_BLANK: Hresult = 0xC0AA0606u.toInt()

public val E_IMAPI_DF2RAW_MEDIA_IS_NOT_PREPARED: Hresult = 0xC0AA0602u.toInt()

public val E_IMAPI_DF2RAW_MEDIA_IS_NOT_SUPPORTED: Hresult = 0xC0AA0607u.toInt()

public val E_IMAPI_DF2RAW_MEDIA_IS_PREPARED: Hresult = 0xC0AA0603u.toInt()

public val E_IMAPI_DF2RAW_NOT_ENOUGH_SPACE: Hresult = 0xC0AA0609u.toInt()

public val E_IMAPI_DF2RAW_NO_RECORDER_SPECIFIED: Hresult = 0xC0AA060Au.toInt()

public val E_IMAPI_DF2RAW_RECORDER_NOT_SUPPORTED: Hresult = 0xC0AA0610u.toInt()

public val E_IMAPI_DF2RAW_STREAM_LEADIN_TOO_SHORT: Hresult = 0xC0AA060Fu.toInt()

public val E_IMAPI_DF2RAW_STREAM_NOT_SUPPORTED: Hresult = 0xC0AA060Du.toInt()

public val E_IMAPI_DF2RAW_WRITE_IN_PROGRESS: Hresult = 0xC0AA0600u.toInt()

public val E_IMAPI_DF2RAW_WRITE_NOT_IN_PROGRESS: Hresult = 0xC0AA0601u.toInt()

public val E_IMAPI_DF2TAO_CLIENT_NAME_IS_NOT_VALID: Hresult = 0xC0AA050Fu.toInt()

public val E_IMAPI_DF2TAO_INVALID_ISRC: Hresult = 0xC0AA050Bu.toInt()

public val E_IMAPI_DF2TAO_INVALID_MCN: Hresult = 0xC0AA050Cu.toInt()

public val E_IMAPI_DF2TAO_MEDIA_IS_NOT_BLANK: Hresult = 0xC0AA0506u.toInt()

public val E_IMAPI_DF2TAO_MEDIA_IS_NOT_PREPARED: Hresult = 0xC0AA0502u.toInt()

public val E_IMAPI_DF2TAO_MEDIA_IS_NOT_SUPPORTED: Hresult = 0xC0AA0507u.toInt()

public val E_IMAPI_DF2TAO_MEDIA_IS_PREPARED: Hresult = 0xC0AA0503u.toInt()

public val E_IMAPI_DF2TAO_NOT_ENOUGH_SPACE: Hresult = 0xC0AA0509u.toInt()

public val E_IMAPI_DF2TAO_NO_RECORDER_SPECIFIED: Hresult = 0xC0AA050Au.toInt()

public val E_IMAPI_DF2TAO_PROPERTY_FOR_BLANK_MEDIA_ONLY: Hresult = 0xC0AA0504u.toInt()

public val E_IMAPI_DF2TAO_RECORDER_NOT_SUPPORTED: Hresult = 0xC0AA050Eu.toInt()

public val E_IMAPI_DF2TAO_STREAM_NOT_SUPPORTED: Hresult = 0xC0AA050Du.toInt()

public val E_IMAPI_DF2TAO_TABLE_OF_CONTENTS_EMPTY_DISC: Hresult = 0xC0AA0505u.toInt()

public val E_IMAPI_DF2TAO_TRACK_LIMIT_REACHED: Hresult = 0xC0AA0508u.toInt()

public val E_IMAPI_DF2TAO_WRITE_IN_PROGRESS: Hresult = 0xC0AA0500u.toInt()

public val E_IMAPI_DF2TAO_WRITE_NOT_IN_PROGRESS: Hresult = 0xC0AA0501u.toInt()

public val E_IMAPI_ERASE_CLIENT_NAME_IS_NOT_VALID: Hresult = 0xC0AA090Bu.toInt()

public val E_IMAPI_ERASE_DISC_INFORMATION_TOO_SMALL: Hresult = 0x80AA0902u.toInt()

public val E_IMAPI_ERASE_DRIVE_FAILED_ERASE_COMMAND: Hresult = 0x80AA0905u.toInt()

public val E_IMAPI_ERASE_DRIVE_FAILED_SPINUP_COMMAND: Hresult = 0x80AA0908u.toInt()

public val E_IMAPI_ERASE_MEDIA_IS_NOT_ERASABLE: Hresult = 0x80AA0904u.toInt()

public val E_IMAPI_ERASE_MEDIA_IS_NOT_SUPPORTED: Hresult = 0xC0AA0909u.toInt()

public val E_IMAPI_ERASE_MODE_PAGE_2A_TOO_SMALL: Hresult = 0x80AA0903u.toInt()

public val E_IMAPI_ERASE_ONLY_ONE_RECORDER_SUPPORTED: Hresult = 0x80AA0901u.toInt()

public val E_IMAPI_ERASE_RECORDER_IN_USE: Hresult = 0x80AA0900u.toInt()

public val E_IMAPI_ERASE_RECORDER_NOT_SUPPORTED: Hresult = 0xC0AA090Au.toInt()

public val E_IMAPI_ERASE_TOOK_LONGER_THAN_ONE_HOUR: Hresult = 0x80AA0906u.toInt()

public val E_IMAPI_ERASE_UNEXPECTED_DRIVE_RESPONSE_DURING_ERASE: Hresult = 0x80AA0907u.toInt()

public val E_IMAPI_LOSS_OF_STREAMING: Hresult = 0xC0AA0300u.toInt()

public val E_IMAPI_RAW_IMAGE_INSUFFICIENT_SPACE: Hresult = 0x80AA0A05u.toInt()

public val E_IMAPI_RAW_IMAGE_IS_READ_ONLY: Hresult = 0x80AA0A00u.toInt()

public val E_IMAPI_RAW_IMAGE_NO_TRACKS: Hresult = 0x80AA0A03u.toInt()

public val E_IMAPI_RAW_IMAGE_SECTOR_TYPE_NOT_SUPPORTED: Hresult = 0x80AA0A02u.toInt()

public val E_IMAPI_RAW_IMAGE_TOO_MANY_TRACKS: Hresult = 0x80AA0A01u.toInt()

public val E_IMAPI_RAW_IMAGE_TOO_MANY_TRACK_INDEXES: Hresult = 0x80AA0A06u.toInt()

public val E_IMAPI_RAW_IMAGE_TRACKS_ALREADY_ADDED: Hresult = 0x80AA0A04u.toInt()

public val E_IMAPI_RAW_IMAGE_TRACK_INDEX_NOT_FOUND: Hresult = 0x80AA0A07u.toInt()

public val E_IMAPI_RAW_IMAGE_TRACK_INDEX_OFFSET_ZERO_CANNOT_BE_CLEARED: Hresult = 0x80AA0A09u.toInt()

public val E_IMAPI_RAW_IMAGE_TRACK_INDEX_TOO_CLOSE_TO_OTHER_INDEX: Hresult = 0x80AA0A0Au.toInt()

public val E_IMAPI_RECORDER_CLIENT_NAME_IS_NOT_VALID: Hresult = 0xC0AA0211u.toInt()

public val E_IMAPI_RECORDER_COMMAND_TIMEOUT: Hresult = 0xC0AA020Du.toInt()

public val E_IMAPI_RECORDER_DVD_STRUCTURE_NOT_PRESENT: Hresult = 0xC0AA020Eu.toInt()

public val E_IMAPI_RECORDER_FEATURE_IS_NOT_CURRENT: Hresult = 0xC0AA020Bu.toInt()

public val E_IMAPI_RECORDER_GET_CONFIGURATION_NOT_SUPPORTED: Hresult = 0xC0AA020Cu.toInt()

public val E_IMAPI_RECORDER_INVALID_MODE_PARAMETERS: Hresult = 0xC0AA0208u.toInt()

public val E_IMAPI_RECORDER_INVALID_RESPONSE_FROM_DEVICE: Hresult = 0xC0AA02FFu.toInt()

public val E_IMAPI_RECORDER_LOCKED: Hresult = 0xC0AA0210u.toInt()

public val E_IMAPI_RECORDER_MEDIA_BECOMING_READY: Hresult = 0xC0AA0205u.toInt()

public val E_IMAPI_RECORDER_MEDIA_BUSY: Hresult = 0xC0AA0207u.toInt()

public val E_IMAPI_RECORDER_MEDIA_FORMAT_IN_PROGRESS: Hresult = 0xC0AA0206u.toInt()

public val E_IMAPI_RECORDER_MEDIA_INCOMPATIBLE: Hresult = 0xC0AA0203u.toInt()

public val E_IMAPI_RECORDER_MEDIA_NOT_FORMATTED: Hresult = 0xC0AA0212u.toInt()

public val E_IMAPI_RECORDER_MEDIA_NO_MEDIA: Hresult = 0xC0AA0202u.toInt()

public val E_IMAPI_RECORDER_MEDIA_SPEED_MISMATCH: Hresult = 0xC0AA020Fu.toInt()

public val E_IMAPI_RECORDER_MEDIA_UPSIDE_DOWN: Hresult = 0xC0AA0204u.toInt()

public val E_IMAPI_RECORDER_MEDIA_WRITE_PROTECTED: Hresult = 0xC0AA0209u.toInt()

public val E_IMAPI_RECORDER_NO_SUCH_FEATURE: Hresult = 0xC0AA020Au.toInt()

public val E_IMAPI_RECORDER_NO_SUCH_MODE_PAGE: Hresult = 0xC0AA0201u.toInt()

public val E_IMAPI_RECORDER_REQUIRED: Hresult = 0xC0AA0003u.toInt()

public val E_IMAPI_REQUEST_CANCELLED: Hresult = 0xC0AA0002u.toInt()

public val E_IMAPI_UNEXPECTED_RESPONSE_FROM_DEVICE: Hresult = 0xC0AA0301u.toInt()

public val FACILITY_IMAPI2: UInt = 170u

public val IMAPI_E_BAD_MULTISESSION_PARAMETER: Hresult = 0xC0AAB162u.toInt()

public val IMAPI_E_BOOT_EMULATION_IMAGE_SIZE_MISMATCH: Hresult = 0xC0AAB14Au.toInt()

public val IMAPI_E_BOOT_IMAGE_DATA: Hresult = 0xC0AAB148u.toInt()

public val IMAPI_E_BOOT_OBJECT_CONFLICT: Hresult = 0xC0AAB149u.toInt()

public val IMAPI_E_DATA_STREAM_CREATE_FAILURE: Hresult = 0xC0AAB12Au.toInt()

public val IMAPI_E_DATA_STREAM_INCONSISTENCY: Hresult = 0xC0AAB128u.toInt()

public val IMAPI_E_DATA_STREAM_READ_FAILURE: Hresult = 0xC0AAB129u.toInt()

public val IMAPI_E_DATA_TOO_BIG: Hresult = 0xC0AAB132u.toInt()

public val IMAPI_E_DIRECTORY_READ_FAILURE: Hresult = 0xC0AAB12Bu.toInt()

public val IMAPI_E_DIR_NOT_EMPTY: Hresult = 0xC0AAB10Au.toInt()

public val IMAPI_E_DIR_NOT_FOUND: Hresult = 0xC0AAB11Au.toInt()

public val IMAPI_E_DISC_MISMATCH: Hresult = 0xC0AAB158u.toInt()

public val IMAPI_E_DUP_NAME: Hresult = 0xC0AAB112u.toInt()

public val IMAPI_E_EMPTY_DISC: Hresult = 0xC0AAB150u.toInt()

public val IMAPI_E_FILE_NOT_FOUND: Hresult = 0xC0AAB119u.toInt()

public val IMAPI_E_FILE_SYSTEM_CHANGE_NOT_ALLOWED: Hresult = 0xC0AAB163u.toInt()

public val IMAPI_E_FILE_SYSTEM_FEATURE_NOT_SUPPORTED: Hresult = 0xC0AAB154u.toInt()

public val IMAPI_E_FILE_SYSTEM_NOT_EMPTY: Hresult = 0xC0AAB106u.toInt()

public val IMAPI_E_FILE_SYSTEM_NOT_FOUND: Hresult = 0xC0AAB152u.toInt()

public val IMAPI_E_FILE_SYSTEM_READ_CONSISTENCY_ERROR: Hresult = 0xC0AAB153u.toInt()

public val IMAPI_E_FSI_INTERNAL_ERROR: Hresult = 0xC0AAB100u.toInt()

public val IMAPI_E_IMAGEMANAGER_IMAGE_NOT_ALIGNED: Hresult = 0xC0AAB200u.toInt()

public val IMAPI_E_IMAGEMANAGER_IMAGE_TOO_BIG: Hresult = 0xC0AAB203u.toInt()

public val IMAPI_E_IMAGEMANAGER_NO_IMAGE: Hresult = 0xC0AAB202u.toInt()

public val IMAPI_E_IMAGEMANAGER_NO_VALID_VD_FOUND: Hresult = 0xC0AAB201u.toInt()

public val IMAPI_E_IMAGE_SIZE_LIMIT: Hresult = 0xC0AAB120u.toInt()

public val IMAPI_E_IMAGE_TOO_BIG: Hresult = 0xC0AAB121u.toInt()

public val IMAPI_E_IMPORT_MEDIA_NOT_ALLOWED: Hresult = 0xC0AAB159u.toInt()

public val IMAPI_E_IMPORT_READ_FAILURE: Hresult = 0xC0AAB157u.toInt()

public val IMAPI_E_IMPORT_SEEK_FAILURE: Hresult = 0xC0AAB156u.toInt()

public val IMAPI_E_IMPORT_TYPE_COLLISION_DIRECTORY_EXISTS_AS_FILE: Hresult = 0xC0AAB15Eu.toInt()

public val IMAPI_E_IMPORT_TYPE_COLLISION_FILE_EXISTS_AS_DIRECTORY: Hresult = 0xC0AAB155u.toInt()

public val IMAPI_E_INCOMPATIBLE_MULTISESSION_TYPE: Hresult = 0xC0AAB15Bu.toInt()

public val IMAPI_E_INCOMPATIBLE_PREVIOUS_SESSION: Hresult = 0xC0AAB133u.toInt()

public val IMAPI_E_INVALID_DATE: Hresult = 0xC0AAB105u.toInt()

public val IMAPI_E_INVALID_PARAM: Hresult = 0xC0AAB101u.toInt()

public val IMAPI_E_INVALID_PATH: Hresult = 0xC0AAB110u.toInt()

public val IMAPI_E_INVALID_VOLUME_NAME: Hresult = 0xC0AAB104u.toInt()

public val IMAPI_E_INVALID_WORKING_DIRECTORY: Hresult = 0xC0AAB140u.toInt()

public val IMAPI_E_ISO9660_LEVELS: Hresult = 0xC0AAB131u.toInt()

public val IMAPI_E_ITEM_NOT_FOUND: Hresult = 0xC0AAB118u.toInt()

public val IMAPI_E_MULTISESSION_NOT_SET: Hresult = 0xC0AAB15Du.toInt()

public val IMAPI_E_NOT_DIR: Hresult = 0xC0AAB109u.toInt()

public val IMAPI_E_NOT_FILE: Hresult = 0xC0AAB108u.toInt()

public val IMAPI_E_NOT_IN_FILE_SYSTEM: Hresult = 0xC0AAB10Bu.toInt()

public val IMAPI_E_NO_COMPATIBLE_MULTISESSION_TYPE: Hresult = 0xC0AAB15Cu.toInt()

public val IMAPI_E_NO_OUTPUT: Hresult = 0xC0AAB103u.toInt()

public val IMAPI_E_NO_SUPPORTED_FILE_SYSTEM: Hresult = 0xC0AAB151u.toInt()

public val IMAPI_E_NO_UNIQUE_NAME: Hresult = 0xC0AAB113u.toInt()

public val IMAPI_E_PROPERTY_NOT_ACCESSIBLE: Hresult = 0xC0AAB160u.toInt()

public val IMAPI_E_READONLY: Hresult = 0xC0AAB102u.toInt()

public val IMAPI_E_RESTRICTED_NAME_VIOLATION: Hresult = 0xC0AAB111u.toInt()

public val IMAPI_E_STASHFILE_MOVE: Hresult = 0xC0AAB142u.toInt()

public val IMAPI_E_STASHFILE_OPEN_FAILURE: Hresult = 0xC0AAB138u.toInt()

public val IMAPI_E_STASHFILE_READ_FAILURE: Hresult = 0xC0AAB13Bu.toInt()

public val IMAPI_E_STASHFILE_SEEK_FAILURE: Hresult = 0xC0AAB139u.toInt()

public val IMAPI_E_STASHFILE_WRITE_FAILURE: Hresult = 0xC0AAB13Au.toInt()

public val IMAPI_E_TOO_MANY_DIRS: Hresult = 0xC0AAB130u.toInt()

public val IMAPI_E_UDF_NOT_WRITE_COMPATIBLE: Hresult = 0xC0AAB15Au.toInt()

public val IMAPI_E_UDF_REVISION_CHANGE_NOT_ALLOWED: Hresult = 0xC0AAB161u.toInt()

public val IMAPI_E_WORKING_DIRECTORY_SPACE: Hresult = 0xC0AAB141u.toInt()

public val IMAPI_S_IMAGE_FEATURE_NOT_SUPPORTED: Hresult = 0xAAB15Fu.toInt()

public val MAPI_COMPOUND: UInt = 128u

public val MAPI_DIM: UInt = 1u

public val MAPI_ERROR_VERSION: Int = 0

public val MAPI_E_CALL_FAILED: Int = -2147467259

public val MAPI_E_INTERFACE_NOT_SUPPORTED: Int = -2147467262

public val MAPI_E_INVALID_PARAMETER: Int = -2147024809

public val MAPI_E_NOT_ENOUGH_MEMORY: Int = -2147024882

public val MAPI_E_NO_ACCESS: Int = -2147024891

public val MAPI_NOTRECIP: UInt = 64u

public val MAPI_NOTRESERVED: UInt = 8u

public val MAPI_NOW: UInt = 16u

public val MAPI_ONE_OFF_NO_RICH_INFO: UInt = 1u

public val MAPI_P1: UInt = 268435456u

public val MAPI_SHORTTERM: UInt = 128u

public val MAPI_SUBMITTED: UInt = 2147483648u

public val MAPI_THISSESSION: UInt = 32u

public val MAPI_USE_DEFAULT: UInt = 64u

public val MNID_ID: UInt = 0u

public val MNID_STRING: UInt = 1u

public val MV_FLAG: UInt = 4096u

public val MV_INSTANCE: UInt = 8192u

public val OPENSTREAMONFILE: Pcstr = s("OpenStreamOnFile")

public val PRIHIGHEST: UInt = 32767u

public val PRILOWEST: Int = -32768

public val PRIUSER: UInt = 0u

public val PROP_ID_INVALID: UInt = 65535u

public val PROP_ID_NULL: UInt = 0u

public val PROP_ID_SECURE_MAX: UInt = 26623u

public val PROP_ID_SECURE_MIN: UInt = 26608u

public val SERVICE_UI_ALLOWED: UInt = 16u

public val SERVICE_UI_ALWAYS: UInt = 2u

public val S_IMAPI_BOTHADJUSTED: Hresult = 0xAA0006u.toInt()

public val S_IMAPI_COMMAND_HAS_SENSE_DATA: Hresult = 0xAA0200u.toInt()

public val S_IMAPI_RAW_IMAGE_TRACK_INDEX_ALREADY_EXISTS: Hresult = 0xAA0A08u.toInt()

public val S_IMAPI_ROTATIONADJUSTED: Hresult = 0xAA0005u.toInt()

public val S_IMAPI_SPEEDADJUSTED: Hresult = 0xAA0004u.toInt()

public val S_IMAPI_WRITE_NOT_IN_PROGRESS: Hresult = 0xAA0302u.toInt()

public val TABLE_CHANGED: UInt = 1u

public val TABLE_ERROR: UInt = 2u

public val TABLE_RELOAD: UInt = 9u

public val TABLE_RESTRICT_DONE: UInt = 7u

public val TABLE_ROW_ADDED: UInt = 3u

public val TABLE_ROW_DELETED: UInt = 4u

public val TABLE_ROW_MODIFIED: UInt = 5u

public val TABLE_SETCOL_DONE: UInt = 8u

public val TABLE_SORT_DONE: UInt = 6u

public val TAD_ALL_ROWS: UInt = 1u

public val UI_CURRENT_PROVIDER_FIRST: UInt = 4u

public val UI_SERVICE: UInt = 2u

public val WABOBJECT_LDAPURL_RETURN_MAILUSER: UInt = 1u

public val WABOBJECT_ME_NEW: UInt = 1u

public val WABOBJECT_ME_NOCREATE: UInt = 2u

public val WAB_CONTEXT_ADRLIST: UInt = 2u

public val WAB_DISPLAY_ISNTDS: UInt = 4u

public val WAB_DISPLAY_LDAPURL: UInt = 1u

public val WAB_DLL_NAME: Pcwstr = w("WAB32.DLL")

public val WAB_DLL_PATH_KEY: Pcwstr = w("Software\\Microsoft\\WAB\\DLLPath")

public val WAB_ENABLE_PROFILES: UInt = 4194304u

public val WAB_IGNORE_PROFILES: UInt = 8388608u

public val WAB_LOCAL_CONTAINERS: UInt = 1048576u

public val WAB_PROFILE_CONTENTS: UInt = 2097152u

public val WAB_USE_OE_SENDMAIL: UInt = 1u

public val WAB_VCARD_FILE: UInt = 0u

public val WAB_VCARD_STREAM: UInt = 1u

public val CCH_PROFILE_NAME_MAX: UInt = 64u

public val CCH_PROFILE_PASS_MAX: UInt = 64u

public val F_MAPI_UNICODE: UInt = 0u

public val GENDER_FEMALE: Gender = 1

public val GENDER_MALE: Gender = 2

public val GENDER_UNSPECIFIED: Gender = 0

public val HR_SUCCESS: UInt = 0u

public val SZ_HR_DISPATCH_NOTIFICATIONS: Pcstr = s("HrDispatchNotifications")

public val SZ_MAPI_NOTIFICATION_MSG: Pcstr = s("MAPI Notify window message")

public val SZ_SC_CREATE_CONVERSATION_INDEX: Pcstr = s("ScCreateConversationIndex")
