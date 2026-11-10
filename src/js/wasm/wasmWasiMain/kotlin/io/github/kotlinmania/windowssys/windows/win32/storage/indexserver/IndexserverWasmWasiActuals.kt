@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun bindIFilterFromStorage(pstg: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bindIFilterFromStream(pstm: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
