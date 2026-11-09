@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32SystemDiagnosticsCeipJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_ceip_CeipIsOptedIn(): Int
}

public actual fun CeipIsOptedIn(): BOOL =
    WindowsWin32SystemDiagnosticsCeipJniBridge.windowssys_windows_win32_system_diagnostics_ceip_CeipIsOptedIn()
