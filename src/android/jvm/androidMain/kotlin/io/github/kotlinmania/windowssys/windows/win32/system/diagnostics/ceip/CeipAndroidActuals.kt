@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemDiagnosticsCeipJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn(): Int
}

public actual fun ceipIsOptedIn(): Bool =
    WindowsWin32SystemDiagnosticsCeipJniBridge.windowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn()
