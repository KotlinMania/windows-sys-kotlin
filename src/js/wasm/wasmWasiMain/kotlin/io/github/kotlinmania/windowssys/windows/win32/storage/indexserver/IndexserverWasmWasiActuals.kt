@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bindIFilterFromStorage(pstg: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage")

public actual fun bindIFilterFromStream(pstm: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIndexserverBindIFilterFromStream")

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIndexserverLoadIFilter")

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr, ppiunk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageIndexserverLoadIFilterEx")
