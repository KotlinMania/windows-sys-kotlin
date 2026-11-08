package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_SERVICE_STATE

public fun interface FWPM_SERVICE_STATE_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, newstate: FWPM_SERVICE_STATE)
}

public typealias FWPM_SERVICE_STATE_CHANGE_CALLBACK0 = FWPM_SERVICE_STATE_CHANGE_CALLBACK0Fn?
