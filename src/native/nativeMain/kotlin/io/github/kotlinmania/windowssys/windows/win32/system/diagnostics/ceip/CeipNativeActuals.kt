@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip.cinterop.windowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn

public actual fun ceipIsOptedIn(): Bool =
    windowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn()
