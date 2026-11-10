@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemSubsystemforlinuxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslConfigureDistribution(distributionname: Long, defaultuid: Int, wsldistributionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslGetDistributionConfiguration(distributionname: Long, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslIsDistributionRegistered(distributionname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslLaunch(distributionname: Long, command: Long, usecurrentworkingdirectory: Int, stdin: Long, stdout: Long, stderr: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslLaunchInteractive(distributionname: Long, command: Long, usecurrentworkingdirectory: Int, exitcode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslRegisterDistribution(distributionname: Long, targzfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_subsystemforlinux_wslUnregisterDistribution(distributionname: Long): Int
}

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslConfigureDistribution((distributionname?.value ?: 0L), defaultuid.toInt(), wsldistributionflags)

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: COpaquePointer?, defaultuid: COpaquePointer?, wsldistributionflags: COpaquePointer?, defaultenvironmentvariables: COpaquePointer?, defaultenvironmentvariablecount: COpaquePointer?): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslGetDistributionConfiguration((distributionname?.value ?: 0L), (distributionversion?.value ?: 0L), (defaultuid?.value ?: 0L), (wsldistributionflags?.value ?: 0L), (defaultenvironmentvariables?.value ?: 0L), (defaultenvironmentvariablecount?.value ?: 0L))

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslIsDistributionRegistered((distributionname?.value ?: 0L))

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: COpaquePointer?): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslLaunch((distributionname?.value ?: 0L), (command?.value ?: 0L), usecurrentworkingdirectory, (stdin?.value ?: 0L), (stdout?.value ?: 0L), (stderr?.value ?: 0L), (process?.value ?: 0L))

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: COpaquePointer?): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslLaunchInteractive((distributionname?.value ?: 0L), (command?.value ?: 0L), usecurrentworkingdirectory, (exitcode?.value ?: 0L))

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslRegisterDistribution((distributionname?.value ?: 0L), (targzfilename?.value ?: 0L))

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssys_windows_win32_system_subsystemforlinux_wslUnregisterDistribution((distributionname?.value ?: 0L))
