package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public typealias Bmformat = Int

public typealias Colordatatype = Int

public typealias Colorprofilesubtype = Int

public typealias Colorprofiletype = Int

public typealias Colortype = Int

public typealias ColorMatchToTargetAction = UInt

public typealias Hcolorspace = MutPtr<CVoid>

public fun interface IcmenumprocaFn {
    public operator fun invoke(param0: Pcstr, param1: Lparam): Int
}

public typealias Icmenumproca = IcmenumprocaFn?

public fun interface IcmenumprocwFn {
    public operator fun invoke(param0: Pcwstr, param1: Lparam): Int
}

public typealias Icmenumprocw = IcmenumprocwFn?

public typealias IcmCommand = UInt

public typealias IcmMode = Int

public typealias Lcscstype = Int

public fun interface LpbmcallbackfnFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Lparam): Bool
}

public typealias Lpbmcallbackfn = LpbmcallbackfnFn?

public fun interface PcmscallbackaFn {
    public operator fun invoke(param0: MutPtr<Colormatchsetupa>, param1: Lparam): Bool
}

public typealias Pcmscallbacka = PcmscallbackaFn?

public fun interface PcmscallbackwFn {
    public operator fun invoke(param0: MutPtr<Colormatchsetupw>, param1: Lparam): Bool
}

public typealias Pcmscallbackw = PcmscallbackwFn?

public typealias WcsDeviceCapabilitiesType = Int

public typealias WcsProfileManagementScope = Int
