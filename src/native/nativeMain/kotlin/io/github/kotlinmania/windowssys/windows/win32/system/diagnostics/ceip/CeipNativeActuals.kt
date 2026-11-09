@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun CeipIsOptedIn(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip.cinterop.windowssys_windows_win32_system_diagnostics_ceip_CeipIsOptedIn()
