package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias BMFORMAT = Int

public typealias COLORDATATYPE = Int

public typealias COLORPROFILESUBTYPE = Int

public typealias COLORPROFILETYPE = Int

public typealias COLORTYPE = Int

public typealias COLOR_MATCH_TO_TARGET_ACTION = UInt

public typealias HCOLORSPACE = Long

public fun interface ICMENUMPROCAFn {
    public operator fun invoke(param0: PCSTR, param1: Foundation.LPARAM): Int
}

public typealias ICMENUMPROCA = ICMENUMPROCAFn?

public fun interface ICMENUMPROCWFn {
    public operator fun invoke(param0: PCWSTR, param1: Foundation.LPARAM): Int
}

public typealias ICMENUMPROCW = ICMENUMPROCWFn?

public typealias ICM_COMMAND = UInt

public typealias ICM_MODE = Int

public typealias LCSCSTYPE = Int

public fun interface LPBMCALLBACKFNFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: Foundation.LPARAM): BOOL
}

public typealias LPBMCALLBACKFN = LPBMCALLBACKFNFn?

public fun interface PCMSCALLBACKAFn {
    public operator fun invoke(param0: Long, param1: Foundation.LPARAM): BOOL
}

public typealias PCMSCALLBACKA = PCMSCALLBACKAFn?

public fun interface PCMSCALLBACKWFn {
    public operator fun invoke(param0: Long, param1: Foundation.LPARAM): BOOL
}

public typealias PCMSCALLBACKW = PCMSCALLBACKWFn?

public typealias WCS_DEVICE_CAPABILITIES_TYPE = Int

public typealias WCS_PROFILE_MANAGEMENT_SCOPE = Int
