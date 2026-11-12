@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemSubsystemforlinuxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(distributionname: Long, defaultuid: Int, wsldistributionflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(distributionname: Long, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(distributionname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(distributionname: Long, command: Long, usecurrentworkingdirectory: Int, stdin: Long, stdout: Long, stderr: Long, process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(distributionname: Long, command: Long, usecurrentworkingdirectory: Int, exitcode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(distributionname: Long, targzfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(distributionname: Long): Int
}

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(distributionname.rawAddress, defaultuid.toInt(), wsldistributionflags)

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: MutPtr<UInt>, defaultuid: MutPtr<UInt>, wsldistributionflags: MutPtr<WslDistributionFlags>, defaultenvironmentvariables: MutPtr<MutPtr<Pstr>>, defaultenvironmentvariablecount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(distributionname.rawAddress, distributionversion.rawAddress, defaultuid.rawAddress, wsldistributionflags.rawAddress, defaultenvironmentvariables.rawAddress, defaultenvironmentvariablecount.rawAddress)

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(distributionname.rawAddress)

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: MutPtr<Handle>): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(distributionname.rawAddress, command.rawAddress, usecurrentworkingdirectory, stdin.rawAddress, stdout.rawAddress, stderr.rawAddress, process.rawAddress)

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: MutPtr<UInt>): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(distributionname.rawAddress, command.rawAddress, usecurrentworkingdirectory, exitcode.rawAddress)

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(distributionname.rawAddress, targzfilename.rawAddress)

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    WindowsWin32SystemSubsystemforlinuxJniBridge.windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(distributionname.rawAddress)
