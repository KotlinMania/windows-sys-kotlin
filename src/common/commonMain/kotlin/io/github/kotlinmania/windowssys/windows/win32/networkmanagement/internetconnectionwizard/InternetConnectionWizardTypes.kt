package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.internetconnectionwizard

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public fun interface PfncheckconnectionwizardFn {
    public operator fun invoke(param0: UInt, param1: MutPtr<UInt>): UInt
}

public typealias Pfncheckconnectionwizard = PfncheckconnectionwizardFn?

public fun interface PfnsetshellnextFn {
    public operator fun invoke(param0: Pcstr): UInt
}

public typealias Pfnsetshellnext = PfnsetshellnextFn?
