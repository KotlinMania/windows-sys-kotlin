package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias PRJ_CALLBACK_DATA_FLAGS = Int

public fun interface PRJ_CANCEL_COMMAND_CBFn {
    public operator fun invoke(callbackdata: Long)
}

public typealias PRJ_CANCEL_COMMAND_CB = PRJ_CANCEL_COMMAND_CBFn?

public typealias PRJ_COMPLETE_COMMAND_TYPE = Int

public typealias PRJ_DIR_ENTRY_BUFFER_HANDLE = Long

public fun interface PRJ_END_DIRECTORY_ENUMERATION_CBFn {
    public operator fun invoke(callbackdata: Long, enumerationid: Long): HRESULT
}

public typealias PRJ_END_DIRECTORY_ENUMERATION_CB = PRJ_END_DIRECTORY_ENUMERATION_CBFn?

public typealias PRJ_EXT_INFO_TYPE = Int

public typealias PRJ_FILE_STATE = Int

public fun interface PRJ_GET_DIRECTORY_ENUMERATION_CBFn {
    public operator fun invoke(callbackdata: Long, enumerationid: Long, searchexpression: PCWSTR, direntrybufferhandle: PRJ_DIR_ENTRY_BUFFER_HANDLE): HRESULT
}

public typealias PRJ_GET_DIRECTORY_ENUMERATION_CB = PRJ_GET_DIRECTORY_ENUMERATION_CBFn?

public fun interface PRJ_GET_FILE_DATA_CBFn {
    public operator fun invoke(callbackdata: Long, byteoffset: ULong, length: UInt): HRESULT
}

public typealias PRJ_GET_FILE_DATA_CB = PRJ_GET_FILE_DATA_CBFn?

public fun interface PRJ_GET_PLACEHOLDER_INFO_CBFn {
    public operator fun invoke(callbackdata: Long): HRESULT
}

public typealias PRJ_GET_PLACEHOLDER_INFO_CB = PRJ_GET_PLACEHOLDER_INFO_CBFn?

public typealias PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT = Long

public typealias PRJ_NOTIFICATION = Int

public fun interface PRJ_NOTIFICATION_CBFn {
    public operator fun invoke(callbackdata: Long, isdirectory: Boolean, notification: PRJ_NOTIFICATION, destinationfilename: PCWSTR, operationparameters: Long): HRESULT
}

public typealias PRJ_NOTIFICATION_CB = PRJ_NOTIFICATION_CBFn?

public typealias PRJ_NOTIFY_TYPES = UInt

public typealias PRJ_PLACEHOLDER_ID = Int

public fun interface PRJ_QUERY_FILE_NAME_CBFn {
    public operator fun invoke(callbackdata: Long): HRESULT
}

public typealias PRJ_QUERY_FILE_NAME_CB = PRJ_QUERY_FILE_NAME_CBFn?

public typealias PRJ_STARTVIRTUALIZING_FLAGS = Int

public fun interface PRJ_START_DIRECTORY_ENUMERATION_CBFn {
    public operator fun invoke(callbackdata: Long, enumerationid: Long): HRESULT
}

public typealias PRJ_START_DIRECTORY_ENUMERATION_CB = PRJ_START_DIRECTORY_ENUMERATION_CBFn?

public typealias PRJ_UPDATE_FAILURE_CAUSES = Int

public typealias PRJ_UPDATE_TYPES = Int
