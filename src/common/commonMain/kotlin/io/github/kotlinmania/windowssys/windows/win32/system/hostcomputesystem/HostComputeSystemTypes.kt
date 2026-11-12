package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias HcsCreateOptions = Int

public fun interface HcsEventCallbackFn {
    public operator fun invoke(event: ConstPtr<HcsEvent>, context: ConstPtr<CVoid>)
}

public typealias HcsEventCallback = HcsEventCallbackFn?

public typealias HcsEventOptions = Int

public typealias HcsEventType = Int

public typealias HcsNotifications = Int

public fun interface HcsNotificationCallbackFn {
    public operator fun invoke(notificationtype: UInt, context: ConstPtr<CVoid>, notificationstatus: Hresult, notificationdata: Pcwstr)
}

public typealias HcsNotificationCallback = HcsNotificationCallbackFn?

public typealias HcsNotificationFlags = Int

public typealias HcsOperation = MutPtr<CVoid>

public fun interface HcsOperationCompletionFn {
    public operator fun invoke(operation: HcsOperation, context: ConstPtr<CVoid>)
}

public typealias HcsOperationCompletion = HcsOperationCompletionFn?

public typealias HcsOperationOptions = Int

public typealias HcsOperationType = Int

public typealias HcsProcess = MutPtr<CVoid>

public typealias HcsResourceType = Int

public typealias HcsSystem = MutPtr<CVoid>
