package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias Hswdevice = COpaquePointer?

public typealias SwDeviceCapabilities = Int

public fun interface SwDeviceCreateCallbackFn {
    public operator fun invoke(hswdevice: Hswdevice, createresult: Hresult, pcontext: COpaquePointer?, pszdeviceinstanceid: Pcwstr)
}

public typealias SwDeviceCreateCallback = SwDeviceCreateCallbackFn?

public typealias SwDeviceLifetime = Int
