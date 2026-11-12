package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult

public typealias GamestatsOpenResult = Int

public typealias GamestatsOpenType = Int

public typealias GameInstallScope = Int

public typealias GamingDeviceDeviceId = Int

public typealias GamingDeviceVendorId = Int

public fun interface GameUICompletionRoutineFn {
    public operator fun invoke(returncode: Hresult, context: ConstPtr)
}

public typealias GameUICompletionRoutine = GameUICompletionRoutineFn?

public typealias KnownGamingPrivileges = Int

public fun interface PlayerPickerUICompletionRoutineFn {
    public operator fun invoke(returncode: Hresult, context: ConstPtr, selectedxuids: ConstPtr, selectedxuidscount: ULong)
}

public typealias PlayerPickerUICompletionRoutine = PlayerPickerUICompletionRoutineFn?

public typealias XblIdpAuthTokenStatus = Int
