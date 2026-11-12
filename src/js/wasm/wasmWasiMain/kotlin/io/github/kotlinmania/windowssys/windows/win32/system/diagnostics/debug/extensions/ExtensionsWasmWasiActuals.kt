@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun createDataModelManager(debughost: MutPtr, manager: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager")

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr, iface: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect")

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr, iface: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide")

public actual fun debugCreate(interfaceid: ConstPtr, iface: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate")

public actual fun debugCreateEx(interfaceid: ConstPtr, dbgengoptions: UInt, iface: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx")
