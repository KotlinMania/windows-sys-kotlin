@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemSubsystemforlinuxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(distributionname.rawAddress.toString(), defaultuid.toInt(), wsldistributionflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: MutPtr<UInt>, defaultuid: MutPtr<UInt>, wsldistributionflags: MutPtr<WslDistributionFlags>, defaultenvironmentvariables: MutPtr<MutPtr<Pstr>>, defaultenvironmentvariablecount: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(distributionname.rawAddress.toString(), distributionversion.rawAddress.toString(), defaultuid.rawAddress.toString(), wsldistributionflags.rawAddress.toString(), defaultenvironmentvariables.rawAddress.toString(), defaultenvironmentvariablecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(distributionname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(distributionname.rawAddress.toString(), command.rawAddress.toString(), usecurrentworkingdirectory, stdin.rawAddress.toString(), stdout.rawAddress.toString(), stderr.rawAddress.toString(), process.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(distributionname.rawAddress.toString(), command.rawAddress.toString(), usecurrentworkingdirectory, exitcode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(distributionname.rawAddress.toString(), targzfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAddon != null) (windowsWin32SystemSubsystemforlinuxNapiAddon.windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(distributionname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
