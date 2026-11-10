@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.Bool

public actual fun ceipIsOptedIn(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
