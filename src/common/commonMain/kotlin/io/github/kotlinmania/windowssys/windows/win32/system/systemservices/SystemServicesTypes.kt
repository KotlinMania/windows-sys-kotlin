package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

public typealias ACCESS_REASON_TYPE = Int

public typealias ACTIVATION_CONTEXT_INFO_CLASS = Int

public typealias ALERT_SYSTEM_SEV = UInt

public typealias APPCOMMAND_ID = UInt

public typealias ARM64_FNPDATA_CR = Int

public typealias ARM64_FNPDATA_FLAGS = Int

public typealias ATF_FLAGS = UInt

public typealias CFE_UNDERLINE = UInt

public typealias ENLISTMENT_INFORMATION_CLASS = Int

public typealias GESTURECONFIG_FLAGS = UInt

public typealias HIBERFILE_BUCKET_SIZE = Int

public typealias IGP_ID = UInt

public typealias IMAGE_AUX_SYMBOL_TYPE = Int

public typealias IMAGE_POLICY_ENTRY_TYPE = Int

public typealias IMAGE_POLICY_ID = Int

public typealias IMPORT_OBJECT_NAME_TYPE = Int

public typealias IMPORT_OBJECT_TYPE = Int

public typealias KTMOBJECT_TYPE = Int

public typealias MODIFIERKEYS_FLAGS = UInt

public typealias MONITOR_DISPLAY_STATE = Int

public fun interface PEXCEPTION_FILTERFn {
    public operator fun invoke(exceptionpointers: Long, establisherframe: Long): Int
}

public typealias PEXCEPTION_FILTER = PEXCEPTION_FILTERFn?

public fun interface PIMAGE_TLS_CALLBACKFn {
    public operator fun invoke(dllhandle: Long, reason: UInt, reserved: Long)
}

public typealias PIMAGE_TLS_CALLBACK = PIMAGE_TLS_CALLBACKFn?

public fun interface POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACKFn {
    public operator fun invoke(process: Foundation.HANDLE, tableaddress: Long, entries: Long, functions: Long): UInt
}

public typealias POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK = POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACKFn?

public fun interface PTERMINATION_HANDLERFn {
    public operator fun invoke(_abnormal_termination: Boolean, establisherframe: Long)
}

public typealias PTERMINATION_HANDLER = PTERMINATION_HANDLERFn?

public fun interface PUMS_SCHEDULER_ENTRY_POINTFn {
    public operator fun invoke(reason: RTL_UMS_SCHEDULER_REASON, activationpayload: ULong, schedulerparam: Long)
}

public typealias PUMS_SCHEDULER_ENTRY_POINT = PUMS_SCHEDULER_ENTRY_POINTFn?

public typealias RECO_FLAGS = UInt

public typealias RESOURCEMANAGER_INFORMATION_CLASS = Int

public typealias RTL_UMS_SCHEDULER_REASON = Int

public typealias ReplacesCorHdrNumericDefines = Int

public typealias SERVERSILO_STATE = Int

public typealias SERVICE_ERROR_TYPE = Int

public typealias SERVICE_LOAD_TYPE = Int

public typealias SERVICE_NODE_TYPE = Int

public typealias SE_IMAGE_SIGNATURE_TYPE = Int

public typealias SFGAO_FLAGS = UInt

public typealias STATIC_STYLES = UInt

public typealias SharedVirtualDiskHandleState = Int

public typealias SharedVirtualDiskSupportType = Int

public typealias TAPE_DRIVE_PROBLEM_TYPE = Int

public typealias TAPE_GET_DRIVE_PARAMETERS_FEATURES_HIGH = UInt

public typealias TRANSACTIONMANAGER_INFORMATION_CLASS = Int

public typealias TRANSACTION_INFORMATION_CLASS = Int

public typealias TRANSACTION_STATE = Int

public typealias WORD_WHEEL_OPEN_FLAGS = UInt
