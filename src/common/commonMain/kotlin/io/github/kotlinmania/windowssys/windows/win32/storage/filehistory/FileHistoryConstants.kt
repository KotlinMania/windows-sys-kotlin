package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val BACKUP_CANCELLED: FhBackupStopReason = 4

public val BACKUP_INVALID_STOP_REASON: FhBackupStopReason = 0

public val BACKUP_LIMIT_USER_BUSY_MACHINE_ON_AC: FhBackupStopReason = 1

public val BACKUP_LIMIT_USER_BUSY_MACHINE_ON_DC: FhBackupStopReason = 3

public val BACKUP_LIMIT_USER_IDLE_MACHINE_ON_DC: FhBackupStopReason = 2

public val FHCFG_E_CONFIGURATION_PREVIOUSLY_LOADED: Hresult = 0x80040305u.toInt()

public val FHCFG_E_CONFIG_ALREADY_EXISTS: Hresult = 0x80040302u.toInt()

public val FHCFG_E_CONFIG_FILE_NOT_FOUND: Hresult = 0x80040301u.toInt()

public val FHCFG_E_CORRUPT_CONFIG_FILE: Hresult = 0x80040300u.toInt()

public val FHCFG_E_INVALID_REHYDRATION_STATE: Hresult = 0x8004030Au.toInt()

public val FHCFG_E_LEGACY_BACKUP_NOT_FOUND: Hresult = 0x80040315u.toInt()

public val FHCFG_E_LEGACY_BACKUP_USER_EXCLUDED: Hresult = 0x80040314u.toInt()

public val FHCFG_E_LEGACY_TARGET_UNSUPPORTED: Hresult = 0x80040312u.toInt()

public val FHCFG_E_LEGACY_TARGET_VALIDATION_UNSUPPORTED: Hresult = 0x80040313u.toInt()

public val FHCFG_E_NO_VALID_CONFIGURATION_LOADED: Hresult = 0x80040303u.toInt()

public val FHCFG_E_RECOMMENDATION_CHANGE_NOT_ALLOWED: Hresult = 0x80040310u.toInt()

public val FHCFG_E_TARGET_CANNOT_BE_USED: Hresult = 0x80040309u.toInt()

public val FHCFG_E_TARGET_NOT_CONFIGURED: Hresult = 0x80040307u.toInt()

public val FHCFG_E_TARGET_NOT_CONNECTED: Hresult = 0x80040304u.toInt()

public val FHCFG_E_TARGET_NOT_ENOUGH_FREE_SPACE: Hresult = 0x80040308u.toInt()

public val FHCFG_E_TARGET_REHYDRATED_ELSEWHERE: Hresult = 0x80040311u.toInt()

public val FHCFG_E_TARGET_VERIFICATION_FAILED: Hresult = 0x80040306u.toInt()

public val FHSVC_E_BACKUP_BLOCKED: Hresult = 0x80040600u.toInt()

public val FHSVC_E_CONFIG_DISABLED: Hresult = 0x80040602u.toInt()

public val FHSVC_E_CONFIG_DISABLED_GP: Hresult = 0x80040603u.toInt()

public val FHSVC_E_CONFIG_REHYDRATING: Hresult = 0x80040605u.toInt()

public val FHSVC_E_FATAL_CONFIG_ERROR: Hresult = 0x80040604u.toInt()

public val FHSVC_E_NOT_CONFIGURED: Hresult = 0x80040601u.toInt()

public val FH_ACCESS_DENIED: FhDeviceValidationResult = 0

public val FH_CURRENT_DEFAULT: FhDeviceValidationResult = 3

public val FH_DRIVE_FIXED: FhTargetDriveTypes = 3

public val FH_DRIVE_REMOTE: FhTargetDriveTypes = 4

public val FH_DRIVE_REMOVABLE: FhTargetDriveTypes = 2

public val FH_DRIVE_UNKNOWN: FhTargetDriveTypes = 0

public val FH_FOLDER: FhProtectedItemCategory = 0

public val FH_FREQUENCY: FhLocalPolicyType = 0

public val FH_INVALID_DRIVE_TYPE: FhDeviceValidationResult = 1

public val FH_LIBRARY: FhProtectedItemCategory = 1

public val FH_NAMESPACE_EXISTS: FhDeviceValidationResult = 4

public val FH_READ_ONLY_PERMISSION: FhDeviceValidationResult = 2

public val FH_RETENTION_AGE: FhLocalPolicyType = 2

public val FH_RETENTION_AGE_BASED: FhRetentionTypes = 2

public val FH_RETENTION_DISABLED: FhRetentionTypes = 0

public val FH_RETENTION_TYPE: FhLocalPolicyType = 1

public val FH_RETENTION_UNLIMITED: FhRetentionTypes = 1

public val FH_STATE_BACKUP_NOT_SUPPORTED: UInt = 2064u

public val FH_STATE_DISABLED_BY_GP: UInt = 2u

public val FH_STATE_FATAL_CONFIG_ERROR: UInt = 3u

public val FH_STATE_MIGRATING: UInt = 4u

public val FH_STATE_NOT_TRACKED: UInt = 0u

public val FH_STATE_NO_ERROR: UInt = 255u

public val FH_STATE_OFF: UInt = 1u

public val FH_STATE_REHYDRATING: UInt = 5u

public val FH_STATE_RUNNING: UInt = 256u

public val FH_STATE_STAGING_FULL: UInt = 18u

public val FH_STATE_TARGET_ABSENT: UInt = 21u

public val FH_STATE_TARGET_ACCESS_DENIED: UInt = 14u

public val FH_STATE_TARGET_FS_LIMITATION: UInt = 13u

public val FH_STATE_TARGET_FULL: UInt = 17u

public val FH_STATE_TARGET_FULL_RETENTION_MAX: UInt = 16u

public val FH_STATE_TARGET_LOW_SPACE: UInt = 20u

public val FH_STATE_TARGET_LOW_SPACE_RETENTION_MAX: UInt = 19u

public val FH_STATE_TARGET_VOLUME_DIRTY: UInt = 15u

public val FH_STATE_TOO_MUCH_BEHIND: UInt = 240u

public val FH_STATUS_DISABLED: FhBackupStatus = 0

public val FH_STATUS_DISABLED_BY_GP: FhBackupStatus = 1

public val FH_STATUS_ENABLED: FhBackupStatus = 2

public val FH_STATUS_REHYDRATING: FhBackupStatus = 3

public val FH_TARGET_DRIVE_TYPE: FhTargetPropertyType = 2

public val FH_TARGET_NAME: FhTargetPropertyType = 0

public val FH_TARGET_PART_OF_LIBRARY: FhDeviceValidationResult = 5

public val FH_TARGET_URL: FhTargetPropertyType = 1

public val FH_VALID_TARGET: FhDeviceValidationResult = 6

public val FH_CONFIG_MGR: Guid = Guid.fromU128(U128(0xed43bb3c09e9498auL, 0x9df62177244c6db4uL))

public val FH_REASSOCIATION: Guid = Guid.fromU128(U128(0x4d728e3516fa4320uL, 0x9e8bbfd7100a8846uL))

public val MAX_BACKUP_STATUS: FhBackupStatus = 4

public val MAX_LOCAL_POLICY: FhLocalPolicyType = 3

public val MAX_PROTECTED_ITEM_CATEGORY: FhProtectedItemCategory = 2

public val MAX_RETENTION_TYPE: FhRetentionTypes = 3

public val MAX_TARGET_PROPERTY: FhTargetPropertyType = 3

public val MAX_VALIDATION_RESULT: FhDeviceValidationResult = 7
