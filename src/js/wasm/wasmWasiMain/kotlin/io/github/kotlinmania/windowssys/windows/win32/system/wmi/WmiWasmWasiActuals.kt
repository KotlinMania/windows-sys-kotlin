@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.COpaquePointer

public actual fun miApplicationInitializeV1(flags: UInt, applicationid: COpaquePointer?, extendederror: COpaquePointer?, application: COpaquePointer?): MiResult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
