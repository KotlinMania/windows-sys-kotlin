package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmServiceState

public fun interface FwpmServiceStateChangeCallback0Fn {
    public operator fun invoke(context: MutPtr<CVoid>, newstate: FwpmServiceState)
}

public typealias FwpmServiceStateChangeCallback0 = FwpmServiceStateChangeCallback0Fn?
