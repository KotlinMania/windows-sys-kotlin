package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

public fun interface FWPM_SERVICE_STATE_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, newstate: Win32.NetworkManagement.WindowsFilteringPlatform.FWPM_SERVICE_STATE)
}

public typealias FWPM_SERVICE_STATE_CHANGE_CALLBACK0 = FWPM_SERVICE_STATE_CHANGE_CALLBACK0Fn?
