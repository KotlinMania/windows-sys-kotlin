@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot")

public actual fun heap32First(lphe: MutPtr, th32processid: UInt, th32heapid: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First")

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst")

public actual fun heap32ListNext(hsnapshot: Handle, lphl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext")

public actual fun heap32Next(lphe: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next")

public actual fun module32First(hsnapshot: Handle, lpme: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First")

public actual fun module32FirstW(hsnapshot: Handle, lpme: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW")

public actual fun module32Next(hsnapshot: Handle, lpme: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next")

public actual fun module32NextW(hsnapshot: Handle, lpme: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW")

public actual fun process32First(hsnapshot: Handle, lppe: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First")

public actual fun process32FirstW(hsnapshot: Handle, lppe: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW")

public actual fun process32Next(hsnapshot: Handle, lppe: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next")

public actual fun process32NextW(hsnapshot: Handle, lppe: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW")

public actual fun thread32First(hsnapshot: Handle, lpte: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First")

public actual fun thread32Next(hsnapshot: Handle, lpte: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next")

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: ConstPtr, lpbuffer: MutPtr, cbread: ULong, lpnumberofbytesread: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory")
