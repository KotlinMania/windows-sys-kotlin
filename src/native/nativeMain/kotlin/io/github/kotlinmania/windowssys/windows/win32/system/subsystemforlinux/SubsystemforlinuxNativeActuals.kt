@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslConfigureDistribution(distributionname?.value?.toCPointer<ByteVar>(), defaultuid, wsldistributionflags)

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: COpaquePointer?, defaultuid: COpaquePointer?, wsldistributionflags: COpaquePointer?, defaultenvironmentvariables: COpaquePointer?, defaultenvironmentvariablecount: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslGetDistributionConfiguration(distributionname?.value?.toCPointer<ByteVar>(), distributionversion?.value?.toCPointer<ByteVar>(), defaultuid?.value?.toCPointer<ByteVar>(), wsldistributionflags?.value?.toCPointer<ByteVar>(), defaultenvironmentvariables?.value?.toCPointer<ByteVar>(), defaultenvironmentvariablecount?.value?.toCPointer<ByteVar>())

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslIsDistributionRegistered(distributionname?.value?.toCPointer<ByteVar>())

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslLaunch(distributionname?.value?.toCPointer<ByteVar>(), command?.value?.toCPointer<ByteVar>(), usecurrentworkingdirectory, stdin?.value?.toCPointer<ByteVar>(), stdout?.value?.toCPointer<ByteVar>(), stderr?.value?.toCPointer<ByteVar>(), process?.value?.toCPointer<ByteVar>())

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslLaunchInteractive(distributionname?.value?.toCPointer<ByteVar>(), command?.value?.toCPointer<ByteVar>(), usecurrentworkingdirectory, exitcode?.value?.toCPointer<ByteVar>())

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslRegisterDistribution(distributionname?.value?.toCPointer<ByteVar>(), targzfilename?.value?.toCPointer<ByteVar>())

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_wslUnregisterDistribution(distributionname?.value?.toCPointer<ByteVar>())
