package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

public fun interface CF_CALLBACKFn {
    public operator fun invoke(callbackinfo: Long, callbackparameters: Long)
}

public typealias CF_CALLBACK = CF_CALLBACKFn?

public typealias CF_CALLBACK_CANCEL_FLAGS = Int

public typealias CF_CALLBACK_CLOSE_COMPLETION_FLAGS = Int

public typealias CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS = Int

public typealias CF_CALLBACK_DEHYDRATE_FLAGS = Int

public typealias CF_CALLBACK_DEHYDRATION_REASON = Int

public typealias CF_CALLBACK_DELETE_COMPLETION_FLAGS = Int

public typealias CF_CALLBACK_DELETE_FLAGS = Int

public typealias CF_CALLBACK_FETCH_DATA_FLAGS = Int

public typealias CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS = Int

public typealias CF_CALLBACK_OPEN_COMPLETION_FLAGS = Int

public typealias CF_CALLBACK_RENAME_COMPLETION_FLAGS = Int

public typealias CF_CALLBACK_RENAME_FLAGS = Int

public typealias CF_CALLBACK_TYPE = Int

public typealias CF_CALLBACK_VALIDATE_DATA_FLAGS = Int

public typealias CF_CONNECTION_KEY = Long

public typealias CF_CONNECT_FLAGS = Int

public typealias CF_CONVERT_FLAGS = Int

public typealias CF_CREATE_FLAGS = Int

public typealias CF_DEHYDRATE_FLAGS = Int

public typealias CF_HARDLINK_POLICY = Int

public typealias CF_HYDRATE_FLAGS = Int

public typealias CF_HYDRATION_POLICY_MODIFIER = UShort

public typealias CF_HYDRATION_POLICY_PRIMARY = UShort

public typealias CF_INSYNC_POLICY = UInt

public typealias CF_IN_SYNC_STATE = Int

public typealias CF_OPEN_FILE_FLAGS = Int

public typealias CF_OPERATION_ACK_DATA_FLAGS = Int

public typealias CF_OPERATION_ACK_DEHYDRATE_FLAGS = Int

public typealias CF_OPERATION_ACK_DELETE_FLAGS = Int

public typealias CF_OPERATION_ACK_RENAME_FLAGS = Int

public typealias CF_OPERATION_RESTART_HYDRATION_FLAGS = Int

public typealias CF_OPERATION_RETRIEVE_DATA_FLAGS = Int

public typealias CF_OPERATION_TRANSFER_DATA_FLAGS = Int

public typealias CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS = Int

public typealias CF_OPERATION_TYPE = Int

public typealias CF_PIN_STATE = Int

public typealias CF_PLACEHOLDER_CREATE_FLAGS = Int

public typealias CF_PLACEHOLDER_INFO_CLASS = Int

public typealias CF_PLACEHOLDER_MANAGEMENT_POLICY = Int

public typealias CF_PLACEHOLDER_RANGE_INFO_CLASS = Int

public typealias CF_PLACEHOLDER_STATE = UInt

public typealias CF_POPULATION_POLICY_MODIFIER = UShort

public typealias CF_POPULATION_POLICY_PRIMARY = UShort

public typealias CF_REGISTER_FLAGS = Int

public typealias CF_REVERT_FLAGS = Int

public typealias CF_SET_IN_SYNC_FLAGS = Int

public typealias CF_SET_PIN_FLAGS = Int

public typealias CF_SYNC_PROVIDER_STATUS = UInt

public typealias CF_SYNC_ROOT_INFO_CLASS = Int

public typealias CF_UPDATE_FLAGS = Int
