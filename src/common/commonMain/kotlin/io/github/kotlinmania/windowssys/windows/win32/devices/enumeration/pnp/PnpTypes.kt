package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias Hswdevice = MutPtr<CVoid>

public typealias SwDeviceCapabilities = Int

public fun interface SwDeviceCreateCallbackFn {
    public operator fun invoke(hswdevice: Hswdevice, createresult: Hresult, pcontext: ConstPtr<CVoid>, pszdeviceinstanceid: Pcwstr)
}

public typealias SwDeviceCreateCallback = SwDeviceCreateCallbackFn?

public typealias SwDeviceLifetime = Int
