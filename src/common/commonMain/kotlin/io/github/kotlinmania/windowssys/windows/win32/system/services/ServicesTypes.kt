package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias EnumServiceState = UInt

public typealias EnumServiceType = UInt

public fun interface HandlerFunctionFn {
    public operator fun invoke(dwcontrol: UInt)
}

public typealias HandlerFunction = HandlerFunctionFn?

public fun interface HandlerFunctionExFn {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: MutPtr, lpcontext: MutPtr): UInt
}

public typealias HandlerFunctionEx = HandlerFunctionExFn?

public fun interface LphandlerFunctionFn {
    public operator fun invoke(dwcontrol: UInt)
}

public typealias LphandlerFunction = LphandlerFunctionFn?

public fun interface LphandlerFunctionExFn {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: MutPtr, lpcontext: MutPtr): UInt
}

public typealias LphandlerFunctionEx = LphandlerFunctionExFn?

public fun interface LpserviceMainFunctionaFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr)
}

public typealias LpserviceMainFunctiona = LpserviceMainFunctionaFn?

public fun interface LpserviceMainFunctionwFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr)
}

public typealias LpserviceMainFunctionw = LpserviceMainFunctionwFn?

public fun interface PfnScNotifyCallbackFn {
    public operator fun invoke(pparameter: ConstPtr)
}

public typealias PfnScNotifyCallback = PfnScNotifyCallbackFn?

public fun interface PscNotificationCallbackFn {
    public operator fun invoke(dwnotify: UInt, pcallbackcontext: ConstPtr)
}

public typealias PscNotificationCallback = PscNotificationCallbackFn?

public typealias PscNotificationRegistration = Long

public typealias ScActionType = Int

public typealias ScEnumType = Int

public typealias ScEventType = Int

public typealias ScHandle = MutPtr

public typealias ScStatusType = Int

public typealias ServiceConfig = UInt

public typealias ServiceDirectoryType = Int

public typealias ServiceError = UInt

public fun interface ServiceMainFunctionaFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr)
}

public typealias ServiceMainFunctiona = ServiceMainFunctionaFn?

public fun interface ServiceMainFunctionwFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr)
}

public typealias ServiceMainFunctionw = ServiceMainFunctionwFn?

public typealias ServiceNotify = UInt

public typealias ServiceRegistryStateType = Int

public typealias ServiceRunsInProcess = UInt

public typealias ServiceSharedDirectoryType = Int

public typealias ServiceSharedRegistryStateType = Int

public typealias ServiceStartType = UInt

public typealias ServiceStatusCurrentState = UInt

public typealias ServiceStatusHandle = MutPtr

public typealias ServiceTriggerAction = UInt

public typealias ServiceTriggerSpecificDataItemDataType = UInt

public typealias ServiceTriggerType = UInt
