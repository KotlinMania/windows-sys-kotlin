@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution
import io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(distributionname.rawAddress.toCPointer<ByteVar>(), defaultuid, wsldistributionflags)

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: MutPtr<UInt>, defaultuid: MutPtr<UInt>, wsldistributionflags: MutPtr<WslDistributionFlags>, defaultenvironmentvariables: MutPtr<MutPtr<Pstr>>, defaultenvironmentvariablecount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(distributionname.rawAddress.toCPointer<ByteVar>(), distributionversion.rawAddress.toCPointer<ByteVar>(), defaultuid.rawAddress.toCPointer<ByteVar>(), wsldistributionflags.rawAddress.toCPointer<ByteVar>(), defaultenvironmentvariables.rawAddress.toCPointer<ByteVar>(), defaultenvironmentvariablecount.rawAddress.toCPointer<ByteVar>())

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(distributionname.rawAddress.toCPointer<ByteVar>())

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(distributionname.rawAddress.toCPointer<ByteVar>(), command.rawAddress.toCPointer<ByteVar>(), usecurrentworkingdirectory, stdin.rawAddress.toCPointer<ByteVar>(), stdout.rawAddress.toCPointer<ByteVar>(), stderr.rawAddress.toCPointer<ByteVar>(), process.rawAddress.toCPointer<ByteVar>())

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(distributionname.rawAddress.toCPointer<ByteVar>(), command.rawAddress.toCPointer<ByteVar>(), usecurrentworkingdirectory, exitcode.rawAddress.toCPointer<ByteVar>())

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(distributionname.rawAddress.toCPointer<ByteVar>(), targzfilename.rawAddress.toCPointer<ByteVar>())

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(distributionname.rawAddress.toCPointer<ByteVar>())
