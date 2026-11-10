package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

public val CF_CALLBACK_CANCEL_FLAG_IO_ABORTED: CfCallbackCancelFlags = 2

public val CF_CALLBACK_CANCEL_FLAG_IO_TIMEOUT: CfCallbackCancelFlags = 1

public val CF_CALLBACK_CANCEL_FLAG_NONE: CfCallbackCancelFlags = 0

public val CF_CALLBACK_CLOSE_COMPLETION_FLAG_DELETED: CfCallbackCloseCompletionFlags = 1

public val CF_CALLBACK_CLOSE_COMPLETION_FLAG_NONE: CfCallbackCloseCompletionFlags = 0

public val CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_BACKGROUND: CfCallbackDehydrateCompletionFlags = 1

public val CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_DEHYDRATED: CfCallbackDehydrateCompletionFlags = 2

public val CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_NONE: CfCallbackDehydrateCompletionFlags = 0

public val CF_CALLBACK_DEHYDRATE_FLAG_BACKGROUND: CfCallbackDehydrateFlags = 1

public val CF_CALLBACK_DEHYDRATE_FLAG_NONE: CfCallbackDehydrateFlags = 0

public val CF_CALLBACK_DEHYDRATION_REASON_NONE: CfCallbackDehydrationReason = 0

public val CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_INACTIVITY: CfCallbackDehydrationReason = 3

public val CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_LOW_SPACE: CfCallbackDehydrationReason = 2

public val CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_OS_UPGRADE: CfCallbackDehydrationReason = 4

public val CF_CALLBACK_DEHYDRATION_REASON_USER_MANUAL: CfCallbackDehydrationReason = 1

public val CF_CALLBACK_DELETE_COMPLETION_FLAG_NONE: CfCallbackDeleteCompletionFlags = 0

public val CF_CALLBACK_DELETE_FLAG_IS_DIRECTORY: CfCallbackDeleteFlags = 1

public val CF_CALLBACK_DELETE_FLAG_IS_UNDELETE: CfCallbackDeleteFlags = 2

public val CF_CALLBACK_DELETE_FLAG_NONE: CfCallbackDeleteFlags = 0

public val CF_CALLBACK_FETCH_DATA_FLAG_EXPLICIT_HYDRATION: CfCallbackFetchDataFlags = 2

public val CF_CALLBACK_FETCH_DATA_FLAG_NONE: CfCallbackFetchDataFlags = 0

public val CF_CALLBACK_FETCH_DATA_FLAG_RECOVERY: CfCallbackFetchDataFlags = 1

public val CF_CALLBACK_FETCH_PLACEHOLDERS_FLAG_NONE: CfCallbackFetchPlaceholdersFlags = 0

public val CF_CALLBACK_OPEN_COMPLETION_FLAG_NONE: CfCallbackOpenCompletionFlags = 0

public val CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNKNOWN: CfCallbackOpenCompletionFlags = 1

public val CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNSUPPORTED: CfCallbackOpenCompletionFlags = 2

public val CF_CALLBACK_RENAME_COMPLETION_FLAG_NONE: CfCallbackRenameCompletionFlags = 0

public val CF_CALLBACK_RENAME_FLAG_IS_DIRECTORY: CfCallbackRenameFlags = 1

public val CF_CALLBACK_RENAME_FLAG_NONE: CfCallbackRenameFlags = 0

public val CF_CALLBACK_RENAME_FLAG_SOURCE_IN_SCOPE: CfCallbackRenameFlags = 2

public val CF_CALLBACK_RENAME_FLAG_TARGET_IN_SCOPE: CfCallbackRenameFlags = 4

public val CF_CALLBACK_TYPE_CANCEL_FETCH_DATA: CfCallbackType = 2

public val CF_CALLBACK_TYPE_CANCEL_FETCH_PLACEHOLDERS: CfCallbackType = 4

public val CF_CALLBACK_TYPE_FETCH_DATA: CfCallbackType = 0

public val CF_CALLBACK_TYPE_FETCH_PLACEHOLDERS: CfCallbackType = 3

public val CF_CALLBACK_TYPE_NONE: CfCallbackType = -1

public val CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE: CfCallbackType = 7

public val CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE_COMPLETION: CfCallbackType = 8

public val CF_CALLBACK_TYPE_NOTIFY_DELETE: CfCallbackType = 9

public val CF_CALLBACK_TYPE_NOTIFY_DELETE_COMPLETION: CfCallbackType = 10

public val CF_CALLBACK_TYPE_NOTIFY_FILE_CLOSE_COMPLETION: CfCallbackType = 6

public val CF_CALLBACK_TYPE_NOTIFY_FILE_OPEN_COMPLETION: CfCallbackType = 5

public val CF_CALLBACK_TYPE_NOTIFY_RENAME: CfCallbackType = 11

public val CF_CALLBACK_TYPE_NOTIFY_RENAME_COMPLETION: CfCallbackType = 12

public val CF_CALLBACK_TYPE_VALIDATE_DATA: CfCallbackType = 1

public val CF_CALLBACK_VALIDATE_DATA_FLAG_EXPLICIT_HYDRATION: CfCallbackValidateDataFlags = 2

public val CF_CALLBACK_VALIDATE_DATA_FLAG_NONE: CfCallbackValidateDataFlags = 0

public val CF_CONNECT_FLAG_BLOCK_SELF_IMPLICIT_HYDRATION: CfConnectFlags = 8

public val CF_CONNECT_FLAG_NONE: CfConnectFlags = 0

public val CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH: CfConnectFlags = 4

public val CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO: CfConnectFlags = 2

public val CF_CONVERT_FLAG_ALWAYS_FULL: CfConvertFlags = 8

public val CF_CONVERT_FLAG_DEHYDRATE: CfConvertFlags = 2

public val CF_CONVERT_FLAG_ENABLE_ON_DEMAND_POPULATION: CfConvertFlags = 4

public val CF_CONVERT_FLAG_FORCE_CONVERT_TO_CLOUD_FILE: CfConvertFlags = 16

public val CF_CONVERT_FLAG_MARK_IN_SYNC: CfConvertFlags = 1

public val CF_CONVERT_FLAG_NONE: CfConvertFlags = 0

public val CF_CREATE_FLAG_NONE: CfCreateFlags = 0

public val CF_CREATE_FLAG_STOP_ON_ERROR: CfCreateFlags = 1

public val CF_DEHYDRATE_FLAG_BACKGROUND: CfDehydrateFlags = 1

public val CF_DEHYDRATE_FLAG_NONE: CfDehydrateFlags = 0

public val CF_HARDLINK_POLICY_ALLOWED: CfHardlinkPolicy = 1

public val CF_HARDLINK_POLICY_NONE: CfHardlinkPolicy = 0

public val CF_HYDRATE_FLAG_NONE: CfHydrateFlags = 0

public val CF_HYDRATION_POLICY_ALWAYS_FULL: CfHydrationPolicyPrimary = 3u.toUShort()

public val CF_HYDRATION_POLICY_FULL: CfHydrationPolicyPrimary = 2u.toUShort()

public val CF_HYDRATION_POLICY_MODIFIER_ALLOW_FULL_RESTART_HYDRATION: CfHydrationPolicyModifier = 8u.toUShort()

public val CF_HYDRATION_POLICY_MODIFIER_AUTO_DEHYDRATION_ALLOWED: CfHydrationPolicyModifier = 4u.toUShort()

public val CF_HYDRATION_POLICY_MODIFIER_NONE: CfHydrationPolicyModifier = 0u.toUShort()

public val CF_HYDRATION_POLICY_MODIFIER_STREAMING_ALLOWED: CfHydrationPolicyModifier = 2u.toUShort()

public val CF_HYDRATION_POLICY_MODIFIER_VALIDATION_REQUIRED: CfHydrationPolicyModifier = 1u.toUShort()

public val CF_HYDRATION_POLICY_PARTIAL: CfHydrationPolicyPrimary = 0u.toUShort()

public val CF_HYDRATION_POLICY_PROGRESSIVE: CfHydrationPolicyPrimary = 1u.toUShort()

public val CF_INSYNC_POLICY_NONE: CfInsyncPolicy = 0u

public val CF_INSYNC_POLICY_PRESERVE_INSYNC_FOR_SYNC_ENGINE: CfInsyncPolicy = 2147483648u

public val CF_INSYNC_POLICY_TRACK_ALL: CfInsyncPolicy = 16777215u

public val CF_INSYNC_POLICY_TRACK_DIRECTORY_ALL: CfInsyncPolicy = 11184880u

public val CF_INSYNC_POLICY_TRACK_DIRECTORY_CREATION_TIME: CfInsyncPolicy = 16u

public val CF_INSYNC_POLICY_TRACK_DIRECTORY_HIDDEN_ATTRIBUTE: CfInsyncPolicy = 64u

public val CF_INSYNC_POLICY_TRACK_DIRECTORY_LAST_WRITE_TIME: CfInsyncPolicy = 512u

public val CF_INSYNC_POLICY_TRACK_DIRECTORY_READONLY_ATTRIBUTE: CfInsyncPolicy = 32u

public val CF_INSYNC_POLICY_TRACK_DIRECTORY_SYSTEM_ATTRIBUTE: CfInsyncPolicy = 128u

public val CF_INSYNC_POLICY_TRACK_FILE_ALL: CfInsyncPolicy = 5592335u

public val CF_INSYNC_POLICY_TRACK_FILE_CREATION_TIME: CfInsyncPolicy = 1u

public val CF_INSYNC_POLICY_TRACK_FILE_HIDDEN_ATTRIBUTE: CfInsyncPolicy = 4u

public val CF_INSYNC_POLICY_TRACK_FILE_LAST_WRITE_TIME: CfInsyncPolicy = 256u

public val CF_INSYNC_POLICY_TRACK_FILE_READONLY_ATTRIBUTE: CfInsyncPolicy = 2u

public val CF_INSYNC_POLICY_TRACK_FILE_SYSTEM_ATTRIBUTE: CfInsyncPolicy = 8u

public val CF_IN_SYNC_STATE_IN_SYNC: CfInSyncState = 1

public val CF_IN_SYNC_STATE_NOT_IN_SYNC: CfInSyncState = 0

public val CF_MAX_PRIORITY_HINT: UInt = 15u

public val CF_MAX_PROVIDER_NAME_LENGTH: UInt = 255u

public val CF_MAX_PROVIDER_VERSION_LENGTH: UInt = 255u

public val CF_OPEN_FILE_FLAG_DELETE_ACCESS: CfOpenFileFlags = 4

public val CF_OPEN_FILE_FLAG_EXCLUSIVE: CfOpenFileFlags = 1

public val CF_OPEN_FILE_FLAG_FOREGROUND: CfOpenFileFlags = 8

public val CF_OPEN_FILE_FLAG_NONE: CfOpenFileFlags = 0

public val CF_OPEN_FILE_FLAG_WRITE_ACCESS: CfOpenFileFlags = 2

public val CF_OPERATION_ACK_DATA_FLAG_NONE: CfOperationAckDataFlags = 0

public val CF_OPERATION_ACK_DEHYDRATE_FLAG_NONE: CfOperationAckDehydrateFlags = 0

public val CF_OPERATION_ACK_DELETE_FLAG_NONE: CfOperationAckDeleteFlags = 0

public val CF_OPERATION_ACK_RENAME_FLAG_NONE: CfOperationAckRenameFlags = 0

public val CF_OPERATION_RESTART_HYDRATION_FLAG_MARK_IN_SYNC: CfOperationRestartHydrationFlags = 1

public val CF_OPERATION_RESTART_HYDRATION_FLAG_NONE: CfOperationRestartHydrationFlags = 0

public val CF_OPERATION_RETRIEVE_DATA_FLAG_NONE: CfOperationRetrieveDataFlags = 0

public val CF_OPERATION_TRANSFER_DATA_FLAG_NONE: CfOperationTransferDataFlags = 0

public val CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_DISABLE_ON_DEMAND_POPULATION: CfOperationTransferPlaceholdersFlags = 2

public val CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_NONE: CfOperationTransferPlaceholdersFlags = 0

public val CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_STOP_ON_ERROR: CfOperationTransferPlaceholdersFlags = 1

public val CF_OPERATION_TYPE_ACK_DATA: CfOperationType = 2

public val CF_OPERATION_TYPE_ACK_DEHYDRATE: CfOperationType = 5

public val CF_OPERATION_TYPE_ACK_DELETE: CfOperationType = 6

public val CF_OPERATION_TYPE_ACK_RENAME: CfOperationType = 7

public val CF_OPERATION_TYPE_RESTART_HYDRATION: CfOperationType = 3

public val CF_OPERATION_TYPE_RETRIEVE_DATA: CfOperationType = 1

public val CF_OPERATION_TYPE_TRANSFER_DATA: CfOperationType = 0

public val CF_OPERATION_TYPE_TRANSFER_PLACEHOLDERS: CfOperationType = 4

public val CF_PIN_STATE_EXCLUDED: CfPinState = 3

public val CF_PIN_STATE_INHERIT: CfPinState = 4

public val CF_PIN_STATE_PINNED: CfPinState = 1

public val CF_PIN_STATE_UNPINNED: CfPinState = 2

public val CF_PIN_STATE_UNSPECIFIED: CfPinState = 0

public val CF_PLACEHOLDER_CREATE_FLAG_ALWAYS_FULL: CfPlaceholderCreateFlags = 8

public val CF_PLACEHOLDER_CREATE_FLAG_DISABLE_ON_DEMAND_POPULATION: CfPlaceholderCreateFlags = 1

public val CF_PLACEHOLDER_CREATE_FLAG_MARK_IN_SYNC: CfPlaceholderCreateFlags = 2

public val CF_PLACEHOLDER_CREATE_FLAG_NONE: CfPlaceholderCreateFlags = 0

public val CF_PLACEHOLDER_CREATE_FLAG_SUPERSEDE: CfPlaceholderCreateFlags = 4

public val CF_PLACEHOLDER_INFO_BASIC: CfPlaceholderInfoClass = 0

public val CF_PLACEHOLDER_INFO_STANDARD: CfPlaceholderInfoClass = 1

public val CF_PLACEHOLDER_MANAGEMENT_POLICY_CONVERT_TO_UNRESTRICTED: CfPlaceholderManagementPolicy = 2

public val CF_PLACEHOLDER_MANAGEMENT_POLICY_CREATE_UNRESTRICTED: CfPlaceholderManagementPolicy = 1

public val CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT: CfPlaceholderManagementPolicy = 0

public val CF_PLACEHOLDER_MANAGEMENT_POLICY_UPDATE_UNRESTRICTED: CfPlaceholderManagementPolicy = 4

public val CF_PLACEHOLDER_MAX_FILE_IDENTITY_LENGTH: UInt = 4096u

public val CF_PLACEHOLDER_RANGE_INFO_MODIFIED: CfPlaceholderRangeInfoClass = 3

public val CF_PLACEHOLDER_RANGE_INFO_ONDISK: CfPlaceholderRangeInfoClass = 1

public val CF_PLACEHOLDER_RANGE_INFO_VALIDATED: CfPlaceholderRangeInfoClass = 2

public val CF_PLACEHOLDER_STATE_ESSENTIAL_PROP_PRESENT: CfPlaceholderState = 4u

public val CF_PLACEHOLDER_STATE_INVALID: CfPlaceholderState = 4294967295u

public val CF_PLACEHOLDER_STATE_IN_SYNC: CfPlaceholderState = 8u

public val CF_PLACEHOLDER_STATE_NO_STATES: CfPlaceholderState = 0u

public val CF_PLACEHOLDER_STATE_PARTIAL: CfPlaceholderState = 16u

public val CF_PLACEHOLDER_STATE_PARTIALLY_ON_DISK: CfPlaceholderState = 32u

public val CF_PLACEHOLDER_STATE_PLACEHOLDER: CfPlaceholderState = 1u

public val CF_PLACEHOLDER_STATE_SYNC_ROOT: CfPlaceholderState = 2u

public val CF_POPULATION_POLICY_ALWAYS_FULL: CfPopulationPolicyPrimary = 3u.toUShort()

public val CF_POPULATION_POLICY_FULL: CfPopulationPolicyPrimary = 2u.toUShort()

public val CF_POPULATION_POLICY_MODIFIER_NONE: CfPopulationPolicyModifier = 0u.toUShort()

public val CF_POPULATION_POLICY_PARTIAL: CfPopulationPolicyPrimary = 0u.toUShort()

public val CF_PROVIDER_STATUS_CLEAR_FLAGS: CfSyncProviderStatus = 2147483648u

public val CF_PROVIDER_STATUS_CONNECTIVITY_LOST: CfSyncProviderStatus = 64u

public val CF_PROVIDER_STATUS_DISCONNECTED: CfSyncProviderStatus = 0u

public val CF_PROVIDER_STATUS_ERROR: CfSyncProviderStatus = 3221225474u

public val CF_PROVIDER_STATUS_IDLE: CfSyncProviderStatus = 1u

public val CF_PROVIDER_STATUS_POPULATE_CONTENT: CfSyncProviderStatus = 8u

public val CF_PROVIDER_STATUS_POPULATE_METADATA: CfSyncProviderStatus = 4u

public val CF_PROVIDER_STATUS_POPULATE_NAMESPACE: CfSyncProviderStatus = 2u

public val CF_PROVIDER_STATUS_SYNC_FULL: CfSyncProviderStatus = 32u

public val CF_PROVIDER_STATUS_SYNC_INCREMENTAL: CfSyncProviderStatus = 16u

public val CF_PROVIDER_STATUS_TERMINATED: CfSyncProviderStatus = 3221225473u

public val CF_REGISTER_FLAG_DISABLE_ON_DEMAND_POPULATION_ON_ROOT: CfRegisterFlags = 2

public val CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT: CfRegisterFlags = 4

public val CF_REGISTER_FLAG_NONE: CfRegisterFlags = 0

public val CF_REGISTER_FLAG_UPDATE: CfRegisterFlags = 1

public val CF_REQUEST_KEY_DEFAULT: UInt = 0u

public val CF_REVERT_FLAG_NONE: CfRevertFlags = 0

public val CF_SET_IN_SYNC_FLAG_NONE: CfSetInSyncFlags = 0

public val CF_SET_PIN_FLAG_NONE: CfSetPinFlags = 0

public val CF_SET_PIN_FLAG_RECURSE: CfSetPinFlags = 1

public val CF_SET_PIN_FLAG_RECURSE_ONLY: CfSetPinFlags = 2

public val CF_SET_PIN_FLAG_RECURSE_STOP_ON_ERROR: CfSetPinFlags = 4

public val CF_SYNC_ROOT_INFO_BASIC: CfSyncRootInfoClass = 0

public val CF_SYNC_ROOT_INFO_PROVIDER: CfSyncRootInfoClass = 2

public val CF_SYNC_ROOT_INFO_STANDARD: CfSyncRootInfoClass = 1

public val CF_UPDATE_FLAG_ALLOW_PARTIAL: CfUpdateFlags = 1024

public val CF_UPDATE_FLAG_ALWAYS_FULL: CfUpdateFlags = 512

public val CF_UPDATE_FLAG_CLEAR_IN_SYNC: CfUpdateFlags = 64

public val CF_UPDATE_FLAG_DEHYDRATE: CfUpdateFlags = 4

public val CF_UPDATE_FLAG_DISABLE_ON_DEMAND_POPULATION: CfUpdateFlags = 16

public val CF_UPDATE_FLAG_ENABLE_ON_DEMAND_POPULATION: CfUpdateFlags = 8

public val CF_UPDATE_FLAG_MARK_IN_SYNC: CfUpdateFlags = 2

public val CF_UPDATE_FLAG_NONE: CfUpdateFlags = 0

public val CF_UPDATE_FLAG_PASSTHROUGH_FS_METADATA: CfUpdateFlags = 256

public val CF_UPDATE_FLAG_REMOVE_FILE_IDENTITY: CfUpdateFlags = 32

public val CF_UPDATE_FLAG_REMOVE_PROPERTY: CfUpdateFlags = 128

public val CF_UPDATE_FLAG_VERIFY_IN_SYNC: CfUpdateFlags = 1
