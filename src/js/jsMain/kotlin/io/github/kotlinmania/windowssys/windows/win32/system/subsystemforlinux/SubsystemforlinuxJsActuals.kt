@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemSubsystemforlinuxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslConfigureDistribution((distributionname?.value ?: 0L).toString(), defaultuid.toInt(), wsldistributionflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: COpaquePointer?, defaultuid: COpaquePointer?, wsldistributionflags: COpaquePointer?, defaultenvironmentvariables: COpaquePointer?, defaultenvironmentvariablecount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslGetDistributionConfiguration((distributionname?.value ?: 0L).toString(), (distributionversion?.value ?: 0L).toString(), (defaultuid?.value ?: 0L).toString(), (wsldistributionflags?.value ?: 0L).toString(), (defaultenvironmentvariables?.value ?: 0L).toString(), (defaultenvironmentvariablecount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslIsDistributionRegistered((distributionname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslLaunch((distributionname?.value ?: 0L).toString(), (command?.value ?: 0L).toString(), usecurrentworkingdirectory, (stdin?.value ?: 0L).toString(), (stdout?.value ?: 0L).toString(), (stderr?.value ?: 0L).toString(), (process?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: COpaquePointer?): Hresult =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslLaunchInteractive((distributionname?.value ?: 0L).toString(), (command?.value ?: 0L).toString(), usecurrentworkingdirectory, (exitcode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslRegisterDistribution((distributionname?.value ?: 0L).toString(), (targzfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    if (_windowsWin32SystemSubsystemforlinuxNapiAddon != null) (_windowsWin32SystemSubsystemforlinuxNapiAddon.windowssys_windows_win32_system_subsystemforlinux_wslUnregisterDistribution((distributionname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
