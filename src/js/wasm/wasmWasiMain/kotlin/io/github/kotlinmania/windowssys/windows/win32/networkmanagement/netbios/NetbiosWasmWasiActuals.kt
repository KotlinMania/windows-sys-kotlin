@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.COpaquePointer

public actual fun netbios(pncb: COpaquePointer?): UByte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
