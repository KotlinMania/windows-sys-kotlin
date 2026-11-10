@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun wnvOpen(): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wnvRequestNotification(wnvhandle: Handle, notificationparam: COpaquePointer?, overlapped: COpaquePointer?, bytestransferred: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
