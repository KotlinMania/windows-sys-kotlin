@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun WslConfigureDistribution(distributionname: PCWSTR, defaultuid: UInt, wsldistributionflags: WSL_DISTRIBUTION_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslConfigureDistribution(distributionname.toCPointer<ByteVar>(), defaultuid, wsldistributionflags)

public actual fun WslGetDistributionConfiguration(distributionname: PCWSTR, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslGetDistributionConfiguration(distributionname.toCPointer<ByteVar>(), distributionversion.toCPointer<ByteVar>(), defaultuid.toCPointer<ByteVar>(), wsldistributionflags.toCPointer<ByteVar>(), defaultenvironmentvariables.toCPointer<ByteVar>(), defaultenvironmentvariablecount.toCPointer<ByteVar>())

public actual fun WslIsDistributionRegistered(distributionname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslIsDistributionRegistered(distributionname.toCPointer<ByteVar>())

public actual fun WslLaunch(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, stdin: HANDLE, stdout: HANDLE, stderr: HANDLE, process: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslLaunch(distributionname.toCPointer<ByteVar>(), command.toCPointer<ByteVar>(), usecurrentworkingdirectory, stdin.toCPointer<ByteVar>(), stdout.toCPointer<ByteVar>(), stderr.toCPointer<ByteVar>(), process.toCPointer<ByteVar>())

public actual fun WslLaunchInteractive(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, exitcode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslLaunchInteractive(distributionname.toCPointer<ByteVar>(), command.toCPointer<ByteVar>(), usecurrentworkingdirectory, exitcode.toCPointer<ByteVar>())

public actual fun WslRegisterDistribution(distributionname: PCWSTR, targzfilename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslRegisterDistribution(distributionname.toCPointer<ByteVar>(), targzfilename.toCPointer<ByteVar>())

public actual fun WslUnregisterDistribution(distributionname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux.cinterop.windowssys_windows_win32_system_subsystemforlinux_WslUnregisterDistribution(distributionname.toCPointer<ByteVar>())
