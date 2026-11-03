package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.internetconnectionwizard

import io.github.kotlinmania.windowssys.core.PCSTR

public fun interface PFNCHECKCONNECTIONWIZARDFn {
    public operator fun invoke(param0: UInt, param1: Long): UInt
}

public typealias PFNCHECKCONNECTIONWIZARD = PFNCHECKCONNECTIONWIZARDFn?

public fun interface PFNSETSHELLNEXTFn {
    public operator fun invoke(param0: PCSTR): UInt
}

public typealias PFNSETSHELLNEXT = PFNSETSHELLNEXTFn?
