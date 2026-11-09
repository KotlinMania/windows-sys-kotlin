@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemSubsystemforlinuxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslConfigureDistribution(distributionname: Long, defaultuid: Int, wsldistributionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslGetDistributionConfiguration(distributionname: Long, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslIsDistributionRegistered(distributionname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslLaunch(distributionname: Long, command: Long, usecurrentworkingdirectory: Int, stdin: Long, stdout: Long, stderr: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslLaunchInteractive(distributionname: Long, command: Long, usecurrentworkingdirectory: Int, exitcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslRegisterDistribution(distributionname: Long, targzfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_WslUnregisterDistribution(distributionname: Long): Int
}

public actual fun WslConfigureDistribution(distributionname: PCWSTR, defaultuid: UInt, wsldistributionflags: WSL_DISTRIBUTION_FLAGS): HRESULT =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslConfigureDistribution(distributionname, defaultuid.toInt(), wsldistributionflags)

public actual fun WslGetDistributionConfiguration(distributionname: PCWSTR, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): HRESULT =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslGetDistributionConfiguration(distributionname, distributionversion, defaultuid, wsldistributionflags, defaultenvironmentvariables, defaultenvironmentvariablecount)

public actual fun WslIsDistributionRegistered(distributionname: PCWSTR): BOOL =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslIsDistributionRegistered(distributionname)

public actual fun WslLaunch(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, stdin: HANDLE, stdout: HANDLE, stderr: HANDLE, process: Long): HRESULT =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslLaunch(distributionname, command, usecurrentworkingdirectory, stdin, stdout, stderr, process)

public actual fun WslLaunchInteractive(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, exitcode: Long): HRESULT =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslLaunchInteractive(distributionname, command, usecurrentworkingdirectory, exitcode)

public actual fun WslRegisterDistribution(distributionname: PCWSTR, targzfilename: PCWSTR): HRESULT =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslRegisterDistribution(distributionname, targzfilename)

public actual fun WslUnregisterDistribution(distributionname: PCWSTR): HRESULT =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_WslUnregisterDistribution(distributionname)
