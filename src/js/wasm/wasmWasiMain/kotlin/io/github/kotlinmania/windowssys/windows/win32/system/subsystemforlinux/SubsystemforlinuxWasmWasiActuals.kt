@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.subsystemforlinux

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun wslConfigureDistribution(distributionname: Pcwstr, defaultuid: UInt, wsldistributionflags: WslDistributionFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wslGetDistributionConfiguration(distributionname: Pcwstr, distributionversion: COpaquePointer?, defaultuid: COpaquePointer?, wsldistributionflags: COpaquePointer?, defaultenvironmentvariables: COpaquePointer?, defaultenvironmentvariablecount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wslIsDistributionRegistered(distributionname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wslLaunch(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, stdin: Handle, stdout: Handle, stderr: Handle, process: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wslLaunchInteractive(distributionname: Pcwstr, command: Pcwstr, usecurrentworkingdirectory: Bool, exitcode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wslRegisterDistribution(distributionname: Pcwstr, targzfilename: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wslUnregisterDistribution(distributionname: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
