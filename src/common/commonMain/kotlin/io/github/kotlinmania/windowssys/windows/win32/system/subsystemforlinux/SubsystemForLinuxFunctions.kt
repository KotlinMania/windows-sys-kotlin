package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun WslConfigureDistribution(distributionname: PCWSTR, defaultuid: UInt, wsldistributionflags: WSL_DISTRIBUTION_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslConfigureDistribution", longArrayOf(distributionname, defaultuid.toLong(), wsldistributionflags.toLong())).toInt()
}

public fun WslGetDistributionConfiguration(distributionname: PCWSTR, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslGetDistributionConfiguration", longArrayOf(distributionname, distributionversion, defaultuid, wsldistributionflags, defaultenvironmentvariables, defaultenvironmentvariablecount)).toInt()
}

public fun WslIsDistributionRegistered(distributionname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslIsDistributionRegistered", longArrayOf(distributionname)).toInt()
}

public fun WslLaunch(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, stdin: Foundation.HANDLE, stdout: Foundation.HANDLE, stderr: Foundation.HANDLE, process: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslLaunch", longArrayOf(distributionname, command, usecurrentworkingdirectory.toLong(), Win32DynamicFfi.objectSlot(stdin), Win32DynamicFfi.objectSlot(stdout), Win32DynamicFfi.objectSlot(stderr), process)).toInt()
}

public fun WslLaunchInteractive(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, exitcode: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslLaunchInteractive", longArrayOf(distributionname, command, usecurrentworkingdirectory.toLong(), exitcode)).toInt()
}

public fun WslRegisterDistribution(distributionname: PCWSTR, targzfilename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslRegisterDistribution", longArrayOf(distributionname, targzfilename)).toInt()
}

public fun WslUnregisterDistribution(distributionname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-wsl-api-l1-1-0.dll", "WslUnregisterDistribution", longArrayOf(distributionname)).toInt()
}
