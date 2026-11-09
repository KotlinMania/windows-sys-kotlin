package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun WslConfigureDistribution(distributionname: PCWSTR, defaultuid: UInt, wsldistributionflags: WSL_DISTRIBUTION_FLAGS): HRESULT

public expect fun WslGetDistributionConfiguration(distributionname: PCWSTR, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): HRESULT

public expect fun WslIsDistributionRegistered(distributionname: PCWSTR): BOOL

public expect fun WslLaunch(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, stdin: HANDLE, stdout: HANDLE, stderr: HANDLE, process: Long): HRESULT

public expect fun WslLaunchInteractive(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, exitcode: Long): HRESULT

public expect fun WslRegisterDistribution(distributionname: PCWSTR, targzfilename: PCWSTR): HRESULT

public expect fun WslUnregisterDistribution(distributionname: PCWSTR): HRESULT
