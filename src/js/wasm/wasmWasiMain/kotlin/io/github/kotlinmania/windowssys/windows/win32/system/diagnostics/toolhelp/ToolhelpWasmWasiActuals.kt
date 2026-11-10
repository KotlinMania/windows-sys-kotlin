@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heap32First(lphe: COpaquePointer?, th32processid: UInt, th32heapid: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heap32ListNext(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun heap32Next(lphe: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun module32First(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun module32FirstW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun module32Next(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun module32NextW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun process32First(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun process32FirstW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun process32Next(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun process32NextW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun thread32First(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun thread32Next(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, cbread: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
