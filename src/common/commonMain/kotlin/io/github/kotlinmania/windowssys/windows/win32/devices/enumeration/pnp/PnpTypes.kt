package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias HSWDEVICE = Long

public typealias SW_DEVICE_CAPABILITIES = Int

public fun interface SW_DEVICE_CREATE_CALLBACKFn {
    public operator fun invoke(hswdevice: HSWDEVICE, createresult: HRESULT, pcontext: Long, pszdeviceinstanceid: PCWSTR)
}

public typealias SW_DEVICE_CREATE_CALLBACK = SW_DEVICE_CREATE_CALLBACKFn?

public typealias SW_DEVICE_LIFETIME = Int
