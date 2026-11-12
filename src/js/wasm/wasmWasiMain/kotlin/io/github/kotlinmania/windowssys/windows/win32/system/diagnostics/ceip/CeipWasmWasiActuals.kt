@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn")
private external fun wasiWindowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn(): Int

public actual fun ceipIsOptedIn(): Bool =
    wasiWindowssysWindowsWin32SystemDiagnosticsCeipCeipIsOptedIn().toInt()
