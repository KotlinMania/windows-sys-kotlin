package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult

public expect fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: MutPtr, defaultuid: MutPtr, wsldistributionflags: MutPtr, defaultenvironmentvariables: MutPtr, defaultenvironmentvariablecount: MutPtr): Hresult

public expect fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool

public expect fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: MutPtr): Hresult

public expect fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: MutPtr): Hresult

public expect fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult

public expect fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult
