@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemSubsystemforlinuxNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun WslConfigureDistribution(distributionname: PCWSTR, defaultuid: UInt, wsldistributionflags: WSL_DISTRIBUTION_FLAGS): HRESULT =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslConfigureDistribution(distributionname.toString(), defaultuid.toInt(), wsldistributionflags) as Int) else 0

public actual fun WslGetDistributionConfiguration(distributionname: PCWSTR, distributionversion: Long, defaultuid: Long, wsldistributionflags: Long, defaultenvironmentvariables: Long, defaultenvironmentvariablecount: Long): HRESULT =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslGetDistributionConfiguration(distributionname.toString(), distributionversion.toString(), defaultuid.toString(), wsldistributionflags.toString(), defaultenvironmentvariables.toString(), defaultenvironmentvariablecount.toString()) as Int) else 0

public actual fun WslIsDistributionRegistered(distributionname: PCWSTR): BOOL =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslIsDistributionRegistered(distributionname.toString()) as Int) else 0

public actual fun WslLaunch(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, stdin: HANDLE, stdout: HANDLE, stderr: HANDLE, process: Long): HRESULT =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslLaunch(distributionname.toString(), command.toString(), usecurrentworkingdirectory, stdin.toString(), stdout.toString(), stderr.toString(), process.toString()) as Int) else 0

public actual fun WslLaunchInteractive(distributionname: PCWSTR, command: PCWSTR, usecurrentworkingdirectory: BOOL, exitcode: Long): HRESULT =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslLaunchInteractive(distributionname.toString(), command.toString(), usecurrentworkingdirectory, exitcode.toString()) as Int) else 0

public actual fun WslRegisterDistribution(distributionname: PCWSTR, targzfilename: PCWSTR): HRESULT =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslRegisterDistribution(distributionname.toString(), targzfilename.toString()) as Int) else 0

public actual fun WslUnregisterDistribution(distributionname: PCWSTR): HRESULT =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_WslUnregisterDistribution(distributionname.toString()) as Int) else 0
