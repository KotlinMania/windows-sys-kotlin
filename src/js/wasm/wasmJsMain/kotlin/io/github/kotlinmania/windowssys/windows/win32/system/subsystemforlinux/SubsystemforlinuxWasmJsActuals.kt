@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemSubsystemforlinuxNapiAddon(): Boolean

private val windowsWin32SystemSubsystemforlinuxNapiAvailable: Boolean = initWindowsWin32SystemSubsystemforlinuxNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(p0)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(p0)")
private external fun wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(p0: String): Int

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(distributionname.rawAddress.toString(), defaultuid.toInt(), wsldistributionflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: MutPtr, defaultuid: MutPtr, wsldistributionflags: MutPtr, defaultenvironmentvariables: MutPtr, defaultenvironmentvariablecount: MutPtr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(distributionname.rawAddress.toString(), distributionversion.rawAddress.toString(), defaultuid.rawAddress.toString(), wsldistributionflags.rawAddress.toString(), defaultenvironmentvariables.rawAddress.toString(), defaultenvironmentvariablecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(distributionname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: MutPtr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(distributionname.rawAddress.toString(), command.rawAddress.toString(), usecurrentworkingdirectory, stdin.rawAddress.toString(), stdout.rawAddress.toString(), stderr.rawAddress.toString(), process.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: MutPtr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(distributionname.rawAddress.toString(), command.rawAddress.toString(), usecurrentworkingdirectory, exitcode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(distributionname.rawAddress.toString(), targzfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    if (windowsWin32SystemSubsystemforlinuxNapiAvailable) wasmWindowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(distributionname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
