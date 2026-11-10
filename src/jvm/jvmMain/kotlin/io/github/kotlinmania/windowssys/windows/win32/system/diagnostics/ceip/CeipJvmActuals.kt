@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemDiagnosticsCeipJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_ceip_ceipIsOptedIn(): Int
}

public actual fun ceipIsOptedIn(): Bool =
    WindowsWin32SystemDiagnosticsCeipJniBridge.windowssys_windows_win32_system_diagnostics_ceip_ceipIsOptedIn()
