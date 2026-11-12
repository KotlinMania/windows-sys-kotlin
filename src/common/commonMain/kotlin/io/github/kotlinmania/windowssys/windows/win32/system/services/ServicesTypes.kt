package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public typealias EnumServiceState = UInt

public typealias EnumServiceType = UInt

public fun interface HandlerFunctionFn {
    public operator fun invoke(dwcontrol: UInt)
}

public typealias HandlerFunction = HandlerFunctionFn?

public fun interface HandlerFunctionExFn {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: MutPtr<CVoid>, lpcontext: MutPtr<CVoid>): UInt
}

public typealias HandlerFunctionEx = HandlerFunctionExFn?

public fun interface LphandlerFunctionFn {
    public operator fun invoke(dwcontrol: UInt)
}

public typealias LphandlerFunction = LphandlerFunctionFn?

public fun interface LphandlerFunctionExFn {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: MutPtr<CVoid>, lpcontext: MutPtr<CVoid>): UInt
}

public typealias LphandlerFunctionEx = LphandlerFunctionExFn?

public fun interface LpserviceMainFunctionaFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr<Pstr>)
}

public typealias LpserviceMainFunctiona = LpserviceMainFunctionaFn?

public fun interface LpserviceMainFunctionwFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr<Pwstr>)
}

public typealias LpserviceMainFunctionw = LpserviceMainFunctionwFn?

public fun interface PfnScNotifyCallbackFn {
    public operator fun invoke(pparameter: ConstPtr<CVoid>)
}

public typealias PfnScNotifyCallback = PfnScNotifyCallbackFn?

public fun interface PscNotificationCallbackFn {
    public operator fun invoke(dwnotify: UInt, pcallbackcontext: ConstPtr<CVoid>)
}

public typealias PscNotificationCallback = PscNotificationCallbackFn?

public typealias PscNotificationRegistration = Long

public typealias ScActionType = Int

public typealias ScEnumType = Int

public typealias ScEventType = Int

public typealias ScHandle = MutPtr<CVoid>

public typealias ScStatusType = Int

public typealias ServiceConfig = UInt

public typealias ServiceDirectoryType = Int

public typealias ServiceError = UInt

public fun interface ServiceMainFunctionaFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr<MutPtr<Byte>>)
}

public typealias ServiceMainFunctiona = ServiceMainFunctionaFn?

public fun interface ServiceMainFunctionwFn {
    public operator fun invoke(dwnumservicesargs: UInt, lpserviceargvectors: MutPtr<Pwstr>)
}

public typealias ServiceMainFunctionw = ServiceMainFunctionwFn?

public typealias ServiceNotify = UInt

public typealias ServiceRegistryStateType = Int

public typealias ServiceRunsInProcess = UInt

public typealias ServiceSharedDirectoryType = Int

public typealias ServiceSharedRegistryStateType = Int

public typealias ServiceStartType = UInt

public typealias ServiceStatusCurrentState = UInt

public typealias ServiceStatusHandle = MutPtr<CVoid>

public typealias ServiceTriggerAction = UInt

public typealias ServiceTriggerSpecificDataItemDataType = UInt

public typealias ServiceTriggerType = UInt
