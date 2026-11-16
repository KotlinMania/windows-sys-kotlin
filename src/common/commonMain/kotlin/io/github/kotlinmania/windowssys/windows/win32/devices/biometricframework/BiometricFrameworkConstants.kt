package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val FACILITY_NONE: UInt = 0u

public val FACILITY_WINBIO: UInt = 9u

public val IOCTL_BIOMETRIC_VENDOR: UInt = 4464640u

public val WINBIO_ANSI_381_IMG_BIT_PACKED: UShort = 1u.toUShort()

public val WINBIO_ANSI_381_IMG_COMPRESSED_JPEG: UShort = 3u.toUShort()

public val WINBIO_ANSI_381_IMG_COMPRESSED_JPEG2000: UShort = 4u.toUShort()

public val WINBIO_ANSI_381_IMG_COMPRESSED_PNG: UShort = 5u.toUShort()

public val WINBIO_ANSI_381_IMG_COMPRESSED_WSQ: UShort = 2u.toUShort()

public val WINBIO_ANSI_381_IMG_UNCOMPRESSED: UShort = 0u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_LATENT: UShort = 7u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_LIVE_SCAN_CONTACTLESS: UShort = 9u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_LIVE_SCAN_PLAIN: UShort = 0u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_LIVE_SCAN_ROLLED: UShort = 1u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_NONLIVE_SCAN_PLAIN: UShort = 2u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_NONLIVE_SCAN_ROLLED: UShort = 3u.toUShort()

public val WINBIO_ANSI_381_IMP_TYPE_SWIPE: UShort = 8u.toUShort()

public val WINBIO_ANSI_381_PIXELS_PER_CM: UShort = 2u.toUShort()

public val WINBIO_ANSI_381_PIXELS_PER_INCH: UShort = 1u.toUShort()

public val WINBIO_ANTI_SPOOF_DISABLE: WinbioAntiSpoofPolicyAction = 0

public val WINBIO_ANTI_SPOOF_ENABLE: WinbioAntiSpoofPolicyAction = 1

public val WINBIO_ANTI_SPOOF_REMOVE: WinbioAntiSpoofPolicyAction = 2

public val WINBIO_ASYNC_NOTIFY_CALLBACK: WinbioAsyncNotificationMethod = 1

public val WINBIO_ASYNC_NOTIFY_MAXIMUM_VALUE: WinbioAsyncNotificationMethod = 3

public val WINBIO_ASYNC_NOTIFY_MESSAGE: WinbioAsyncNotificationMethod = 2

public val WINBIO_ASYNC_NOTIFY_NONE: WinbioAsyncNotificationMethod = 0

public val WINBIO_BIR_ALGIN_SIZE: UInt = 8u

public val WINBIO_BIR_ALIGN_SIZE: UInt = 8u

public val WINBIO_COMPONENT_ENGINE: WinbioComponent = 2u

public val WINBIO_COMPONENT_SENSOR: WinbioComponent = 1u

public val WINBIO_COMPONENT_STORAGE: WinbioComponent = 3u

public val WINBIO_CREDENTIAL_ALL: WinbioCredentialType = -1

public val WINBIO_CREDENTIAL_NOT_SET: WinbioCredentialState = 1

public val WINBIO_CREDENTIAL_PASSWORD: WinbioCredentialType = 1

public val WINBIO_CREDENTIAL_SET: WinbioCredentialState = 2

public val WINBIO_DATA_FLAG_INTEGRITY: UShort = 1u.toUShort()

public val WINBIO_DATA_FLAG_INTERMEDIATE: UShort = 64u.toUShort()

public val WINBIO_DATA_FLAG_OPTION_MASK_PRESENT: UShort = 8u.toUShort()

public val WINBIO_DATA_FLAG_PRIVACY: UShort = 2u.toUShort()

public val WINBIO_DATA_FLAG_PROCESSED: UShort = 128u.toUShort()

public val WINBIO_DATA_FLAG_RAW: UShort = 32u.toUShort()

public val WINBIO_DATA_FLAG_SIGNED: UShort = 4u.toUShort()

public val WINBIO_E_ADAPTER_INTEGRITY_FAILURE: Hresult = 0x8009803Du.toInt()

public val WINBIO_E_AUTO_LOGON_DISABLED: Hresult = 0x80098043u.toInt()

public val WINBIO_E_BAD_CAPTURE: Hresult = 0x80098008u.toInt()

public val WINBIO_E_CALIBRATION_BUFFER_INVALID: Hresult = 0x80098051u.toInt()

public val WINBIO_E_CALIBRATION_BUFFER_TOO_LARGE: Hresult = 0x80098050u.toInt()

public val WINBIO_E_CALIBRATION_BUFFER_TOO_SMALL: Hresult = 0x8009804Fu.toInt()

public val WINBIO_E_CANCELED: Hresult = 0x80098004u.toInt()

public val WINBIO_E_CAPTURE_ABORTED: Hresult = 0x80098006u.toInt()

public val WINBIO_E_CONFIGURATION_FAILURE: Hresult = 0x80098033u.toInt()

public val WINBIO_E_CRED_PROV_DISABLED: Hresult = 0x80098030u.toInt()

public val WINBIO_E_CRED_PROV_NO_CREDENTIAL: Hresult = 0x80098031u.toInt()

public val WINBIO_E_CRED_PROV_SECURITY_LOCKOUT: Hresult = 0x80098047u.toInt()

public val WINBIO_E_DATABASE_ALREADY_EXISTS: Hresult = 0x80098016u.toInt()

public val WINBIO_E_DATABASE_BAD_INDEX_VECTOR: Hresult = 0x80098022u.toInt()

public val WINBIO_E_DATABASE_CANT_CLOSE: Hresult = 0x80098013u.toInt()

public val WINBIO_E_DATABASE_CANT_CREATE: Hresult = 0x80098011u.toInt()

public val WINBIO_E_DATABASE_CANT_ERASE: Hresult = 0x80098014u.toInt()

public val WINBIO_E_DATABASE_CANT_FIND: Hresult = 0x80098015u.toInt()

public val WINBIO_E_DATABASE_CANT_OPEN: Hresult = 0x80098012u.toInt()

public val WINBIO_E_DATABASE_CORRUPTED: Hresult = 0x8009801Au.toInt()

public val WINBIO_E_DATABASE_EOF: Hresult = 0x80098021u.toInt()

public val WINBIO_E_DATABASE_FULL: Hresult = 0x80098018u.toInt()

public val WINBIO_E_DATABASE_LOCKED: Hresult = 0x80098019u.toInt()

public val WINBIO_E_DATABASE_NO_MORE_RECORDS: Hresult = 0x80098020u.toInt()

public val WINBIO_E_DATABASE_NO_RESULTS: Hresult = 0x8009801Fu.toInt()

public val WINBIO_E_DATABASE_NO_SUCH_RECORD: Hresult = 0x8009801Bu.toInt()

public val WINBIO_E_DATABASE_READ_ERROR: Hresult = 0x8009801Du.toInt()

public val WINBIO_E_DATABASE_WRITE_ERROR: Hresult = 0x8009801Eu.toInt()

public val WINBIO_E_DATA_COLLECTION_IN_PROGRESS: Hresult = 0x8009800Bu.toInt()

public val WINBIO_E_DATA_PROTECTION_FAILURE: Hresult = 0x80098046u.toInt()

public val WINBIO_E_DEADLOCK_DETECTED: Hresult = 0x80098040u.toInt()

public val WINBIO_E_DEVICE_BUSY: Hresult = 0x80098010u.toInt()

public val WINBIO_E_DEVICE_FAILURE: Hresult = 0x80098036u.toInt()

public val WINBIO_E_DISABLED: Hresult = 0x80098032u.toInt()

public val WINBIO_E_DUPLICATE_ENROLLMENT: Hresult = 0x8009801Cu.toInt()

public val WINBIO_E_DUPLICATE_TEMPLATE: Hresult = 0x8009802Bu.toInt()

public val WINBIO_E_ENROLLMENT_CANCELED_BY_SUSPEND: Hresult = 0x8009805Bu.toInt()

public val WINBIO_E_ENROLLMENT_IN_PROGRESS: Hresult = 0x80098007u.toInt()

public val WINBIO_E_EVENT_MONITOR_ACTIVE: Hresult = 0x80098039u.toInt()

public val WINBIO_E_FAST_USER_SWITCH_DISABLED: Hresult = 0x80098037u.toInt()

public val WINBIO_E_INCORRECT_BSP: Hresult = 0x80098024u.toInt()

public val WINBIO_E_INCORRECT_SENSOR_POOL: Hresult = 0x80098025u.toInt()

public val WINBIO_E_INCORRECT_SESSION_TYPE: Hresult = 0x8009803Eu.toInt()

public val WINBIO_E_INSECURE_SENSOR: Hresult = 0x80098057u.toInt()

public val WINBIO_E_INVALID_BUFFER: Hresult = 0x80098059u.toInt()

public val WINBIO_E_INVALID_BUFFER_ID: Hresult = 0x80098058u.toInt()

public val WINBIO_E_INVALID_CALIBRATION_FORMAT_ARRAY: Hresult = 0x8009804Cu.toInt()

public val WINBIO_E_INVALID_CONTROL_CODE: Hresult = 0x80098009u.toInt()

public val WINBIO_E_INVALID_DEVICE_STATE: Hresult = 0x8009800Fu.toInt()

public val WINBIO_E_INVALID_KEY_IDENTIFIER: Hresult = 0x80098052u.toInt()

public val WINBIO_E_INVALID_OPERATION: Hresult = 0x8009802Cu.toInt()

public val WINBIO_E_INVALID_PROPERTY_ID: Hresult = 0x8009803Bu.toInt()

public val WINBIO_E_INVALID_PROPERTY_TYPE: Hresult = 0x8009803Au.toInt()

public val WINBIO_E_INVALID_SENSOR_MODE: Hresult = 0x80098027u.toInt()

public val WINBIO_E_INVALID_SUBFACTOR: Hresult = 0x8009804Bu.toInt()

public val WINBIO_E_INVALID_TICKET: Hresult = 0x80098044u.toInt()

public val WINBIO_E_INVALID_UNIT: Hresult = 0x80098002u.toInt()

public val WINBIO_E_KEY_CREATION_FAILED: Hresult = 0x80098053u.toInt()

public val WINBIO_E_KEY_IDENTIFIER_BUFFER_TOO_SMALL: Hresult = 0x80098054u.toInt()

public val WINBIO_E_LOCK_VIOLATION: Hresult = 0x8009802Au.toInt()

public val WINBIO_E_MAX_ERROR_COUNT_EXCEEDED: Hresult = 0x80098042u.toInt()

public val WINBIO_E_NOT_ACTIVE_CONSOLE: Hresult = 0x80098038u.toInt()

public val WINBIO_E_NO_CAPTURE_DATA: Hresult = 0x80098026u.toInt()

public val WINBIO_E_NO_MATCH: Hresult = 0x80098005u.toInt()

public val WINBIO_E_NO_PREBOOT_IDENTITY: Hresult = 0x80098041u.toInt()

public val WINBIO_E_NO_SUPPORTED_CALIBRATION_FORMAT: Hresult = 0x8009804Du.toInt()

public val WINBIO_E_POLICY_PROTECTION_UNAVAILABLE: Hresult = 0x80098056u.toInt()

public val WINBIO_E_PRESENCE_MONITOR_ACTIVE: Hresult = 0x8009804Au.toInt()

public val WINBIO_E_PROPERTY_UNAVAILABLE: Hresult = 0x80098055u.toInt()

public val WINBIO_E_SAS_ENABLED: Hresult = 0x80098035u.toInt()

public val WINBIO_E_SELECTION_REQUIRED: Hresult = 0x80098049u.toInt()

public val WINBIO_E_SENSOR_UNAVAILABLE: Hresult = 0x80098034u.toInt()

public val WINBIO_E_SESSION_BUSY: Hresult = 0x8009802Du.toInt()

public val WINBIO_E_SESSION_HANDLE_CLOSED: Hresult = 0x8009803Fu.toInt()

public val WINBIO_E_TICKET_QUOTA_EXCEEDED: Hresult = 0x80098045u.toInt()

public val WINBIO_E_TRUSTLET_INTEGRITY_FAIL: Hresult = 0x8009805Au.toInt()

public val WINBIO_E_UNKNOWN_ID: Hresult = 0x80098003u.toInt()

public val WINBIO_E_UNSUPPORTED_DATA_FORMAT: Hresult = 0x8009800Cu.toInt()

public val WINBIO_E_UNSUPPORTED_DATA_TYPE: Hresult = 0x8009800Du.toInt()

public val WINBIO_E_UNSUPPORTED_FACTOR: Hresult = 0x80098001u.toInt()

public val WINBIO_E_UNSUPPORTED_POOL_TYPE: Hresult = 0x80098048u.toInt()

public val WINBIO_E_UNSUPPORTED_PROPERTY: Hresult = 0x8009803Cu.toInt()

public val WINBIO_E_UNSUPPORTED_PURPOSE: Hresult = 0x8009800Eu.toInt()

public val WINBIO_E_UNSUPPORTED_SENSOR_CALIBRATION_FORMAT: Hresult = 0x8009804Eu.toInt()

public val WINBIO_I_EXTENDED_STATUS_INFORMATION: Hresult = 0x90002u.toInt()

public val WINBIO_I_MORE_DATA: Hresult = 0x90001u.toInt()

public val WINBIO_MAX_STRING_LEN: UInt = 256u

public val WINBIO_PASSWORD_GENERIC: WinbioCredentialFormat = 1

public val WINBIO_PASSWORD_PACKED: WinbioCredentialFormat = 2

public val WINBIO_PASSWORD_PROTECTED: WinbioCredentialFormat = 3

public val WINBIO_POLICY_ADMIN: WinbioPolicySource = 3

public val WINBIO_POLICY_DEFAULT: WinbioPolicySource = 1

public val WINBIO_POLICY_LOCAL: WinbioPolicySource = 2

public val WINBIO_POLICY_UNKNOWN: WinbioPolicySource = 0

public val WINBIO_POOL_PRIVATE: WinbioPool = 2u

public val WINBIO_POOL_SYSTEM: WinbioPool = 1u

public val WINBIO_SCP_CURVE_FIELD_SIZE_V1: UInt = 32u

public val WINBIO_SCP_DIGEST_SIZE_V1: UInt = 32u

public val WINBIO_SCP_ENCRYPTION_BLOCK_SIZE_V1: UInt = 16u

public val WINBIO_SCP_ENCRYPTION_KEY_SIZE_V1: UInt = 32u

public val WINBIO_SCP_PRIVATE_KEY_SIZE_V1: UInt = 32u

public val WINBIO_SCP_PUBLIC_KEY_SIZE_V1: UInt = 65u

public val WINBIO_SCP_RANDOM_SIZE_V1: UInt = 32u

public val WINBIO_SCP_SIGNATURE_SIZE_V1: UInt = 64u

public val WINBIO_SCP_VERSION_1: UInt = 1u

public val WINBIO_SETTING_SOURCE_DEFAULT: WinbioSettingSource = 1u

public val WINBIO_SETTING_SOURCE_INVALID: WinbioSettingSource = 0u

public val WINBIO_SETTING_SOURCE_LOCAL: WinbioSettingSource = 3u

public val WINBIO_SETTING_SOURCE_POLICY: WinbioSettingSource = 2u

public val WINBIO_WBDI_MAJOR_VERSION: UInt = 1u

public val WINBIO_WBDI_MINOR_VERSION: UInt = 0u

public val GUID_DEVINTERFACE_BIOMETRIC_READER: Guid = Guid.fromU128(U128(0xe2b5183a99ea4cc3uL, 0xad6b80ca8d715b80uL))
