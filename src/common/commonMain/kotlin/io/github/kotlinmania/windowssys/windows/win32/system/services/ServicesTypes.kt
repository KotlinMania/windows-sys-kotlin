package io.github.kotlinmania.windowssys.windows.win32.system.services

public typealias ENUM_SERVICE_STATE = UInt

public typealias ENUM_SERVICE_TYPE = UInt

public fun interface HANDLER_FUNCTIONFn {
    public operator fun invoke(dwcontrol: UInt)
}

public typealias HANDLER_FUNCTION = HANDLER_FUNCTIONFn?

public fun interface HANDLER_FUNCTION_EXFn {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: Long, lpcontext: Long): UInt
}

public typealias HANDLER_FUNCTION_EX = HANDLER_FUNCTION_EXFn?

public fun interface LPHANDLER_FUNCTIONFn {
    public operator fun invoke(dwcontrol: UInt)
}

public typealias LPHANDLER_FUNCTION = LPHANDLER_FUNCTIONFn?

public fun interface LPHANDLER_FUNCTION_EXFn {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: Long, lpcontext: Long): UInt
}

public typealias LPHANDLER_FUNCTION_EX = LPHANDLER_FUNCTION_EXFn?

public fun interface LPSERVICE_MAIN_FUNCTIONAFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: Long)
}

public typealias LPSERVICE_MAIN_FUNCTIONA = LPSERVICE_MAIN_FUNCTIONAFn?

public fun interface LPSERVICE_MAIN_FUNCTIONWFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: Long)
}

public typealias LPSERVICE_MAIN_FUNCTIONW = LPSERVICE_MAIN_FUNCTIONWFn?

public fun interface PFN_SC_NOTIFY_CALLBACKFn {
    public operator fun invoke(pparameter: Long)
}

public typealias PFN_SC_NOTIFY_CALLBACK = PFN_SC_NOTIFY_CALLBACKFn?

public fun interface PSC_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(dwnotify: UInt, pcallbackcontext: Long)
}

public typealias PSC_NOTIFICATION_CALLBACK = PSC_NOTIFICATION_CALLBACKFn?

public typealias PSC_NOTIFICATION_REGISTRATION = Long

public typealias SC_ACTION_TYPE = Int

public typealias SC_ENUM_TYPE = Int

public typealias SC_EVENT_TYPE = Int

public typealias SC_HANDLE = Long

public typealias SC_STATUS_TYPE = Int

public typealias SERVICE_CONFIG = UInt

public typealias SERVICE_DIRECTORY_TYPE = Int

public typealias SERVICE_ERROR = UInt

public fun interface SERVICE_MAIN_FUNCTIONAFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: Long)
}

public typealias SERVICE_MAIN_FUNCTIONA = SERVICE_MAIN_FUNCTIONAFn?

public fun interface SERVICE_MAIN_FUNCTIONWFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: Long)
}

public typealias SERVICE_MAIN_FUNCTIONW = SERVICE_MAIN_FUNCTIONWFn?

public typealias SERVICE_NOTIFY = UInt

public typealias SERVICE_REGISTRY_STATE_TYPE = Int

public typealias SERVICE_RUNS_IN_PROCESS = UInt

public typealias SERVICE_SHARED_DIRECTORY_TYPE = Int

public typealias SERVICE_SHARED_REGISTRY_STATE_TYPE = Int

public typealias SERVICE_START_TYPE = UInt

public typealias SERVICE_STATUS_CURRENT_STATE = UInt

public typealias SERVICE_STATUS_HANDLE = Long

public typealias SERVICE_TRIGGER_ACTION = UInt

public typealias SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE = UInt

public typealias SERVICE_TRIGGER_TYPE = UInt
